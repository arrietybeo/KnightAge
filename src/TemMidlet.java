
import java.io.InputStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public class TemMidlet extends MIDlet {

    public static GameCanvas a;
    public static TemMidlet b;
    public static byte c;
    public static boolean d;
    public static byte e;
    public static String[] f;
    public static String[] g;
    public static final String[] h;
    public static String[] i;

    static {
        c = 0;
        d = true;
        e = 0;
        f = new String[]{"hs_gold_10", "hs_gold_30", "hs_gold_70", "hs_gold_180", "hs_gold_380", "hs_gold_800"};
        g = new String[]{"24 Gems ($0.99)", "84 Gems ($2.99)", "150 Gems ($4.99)", "350 Gems ($9.99)", "1.000 Gems ($24.99)", "2.500 Gems ($49.99)"};
        String[] stringArray = new String[]{"hs_gold_10", "hs_gold_30", "hs_gold_70", "hs_gold_180", "hs_gold_380", "hs_gold_800"};
        String[] stringArray2 = new String[]{"24 Gems ($0.99)", "84 Gems ($2.99)", "150 Gems ($4.99)", "350 Gems ($9.99)", "1.000 Gems ($24.99)", "2.500 Gems ($49.99)"};
        String[] stringArray3 = new String[]{"hs_gold_10", "hs_gold_30", "hs_gold_70", "hs_gold_180", "hs_gold_380", "hs_gold_800"};
        String[] stringArray4 = new String[]{"24 Gems ($0.99)", "84 Gems ($2.99)", "150 Gems ($4.99)", "350 Gems ($9.99)", "1.000 Gems ($24.99)", "2.500 Gems ($49.99)"};
        h = new String[1];
        i = new String[]{"24 Gems"};
    }

    public TemMidlet() {
        a = new GameCanvas();
        b = this;
        ISession l2 = ISession.a();
        if (hso_bo.a == null) {
            hso_bo.a = new hso_bo();
        }
        l2.a(hso_bo.a);
        Display.getDisplay(this).setCurrent(a);
        a.a();
    }

    protected void destroyApp(boolean bl) {
        b.notifyDestroyed();
    }

    protected void pauseApp() {
    }

    protected void startApp() {
    }

    public static void a() {
        try {
            b.destroyApp(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] a(byte[] var0) {
        if (var0 != null) {
            for (int var1 = 0; var1 < var0.length; ++var1) {
                var0[var1] = (byte) (~var0[var1]);
            }
        }

        return var0;
    }

    public static void a(String var0, byte[] var1) {
        try {
            var1 = a(var1);
            RecordStore var2;
            if ((var2 = RecordStore.openRecordStore(var0, true)).getNumRecords() > 0) {
                var2.setRecord(1, var1, 0, var1.length);
            } else {
                var2.addRecord(var1, 0, var1.length);
            }

            var2.closeRecordStore();
        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

    public static byte[] a(String var0) {
        byte[] var1;
        try {
            RecordStore var3;
            var1 = (var3 = RecordStore.openRecordStore(var0, false)).getRecord(1);
            var3.closeRecordStore();
        } catch (Exception var2) {
//            var2.printStackTrace();
            return null;
        }

        return a(var1);
    }

    public static void b(String var0) {
        try {
            b.platformRequest(var0);
            b.notifyDestroyed();
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public static void b() {
        try {
            String[] var0;
            if ((var0 = RecordStore.listRecordStores()) != null) {
                for (int var1 = 0; var1 < var0.length; ++var1) {
                    if (hso_ak.b(var0[var1])) {
                        RecordStore.deleteRecordStore(var0[var1]);
                    }
                }
                return;
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }

    public static String c(String var0) {
        try {
            HttpConnection var4;
            (var4 = (HttpConnection) Connector.open(var0)).setRequestMethod("GET");
            var4.setRequestProperty("Content-Type", "//text plain");
            var4.setRequestProperty("Connection", "close");
            if (var4.getResponseCode() == 200) {
                String var1 = "";
                InputStream var2 = var4.openInputStream();
                int var5;
                if ((var5 = (int) var4.getLength()) != -1) {
                    byte[] var6 = new byte[var5];
                    var2.read(var6);
                    var1 = new String(var6, "UTF-8");
                }

                return var1.substring(1);
            } else {
                return null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public final void d(String var1) {
        try {
            this.platformRequest("tel:" + var1);
        } catch (ConnectionNotFoundException var2) {
            var2.printStackTrace();
            hso_dw.a("loi roi " + var2.toString());
        }
    }
}
