
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class hso_u extends hso_p {

    private int b;
    public static String a = "";

    public hso_u() {
        try {
            byte[] var3 = hso_ak.a("listServer");
            boolean var1 = false;
            if (var3 != null) {
                ByteArrayInputStream var4 = new ByteArrayInputStream(var3);
                a = (new DataInputStream(var4)).readUTF();
                if (ak.a("isIndexServer") == null) {
                    var1 = true;
                }
            } else {
//            a = TemMidlet.c(hso_ft.O);
                a = "http://knightageonline.com/srvip/";
                var1 = true;
            }

            a(a, var1);
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public final void a(mGraphics var1) {
        var1.a(0);
        var1.c(0, 0, hso_ft.W, hso_ft.X);
    }

    public final void a() {
        ++this.b;
        if (this.b > 60) {
            this.b = 0;
            hso_ft.b.c();
        }

    }

    public static void a(String var0, boolean var1) {
        if (hso_ft.H != 0 && hso_ft.H != 1 && hso_ft.H != 3 && hso_ft.H != 4 && hso_ft.H != 5 && hso_ft.H != 6) {
            if (hso_ft.H == 2) {
                b();
                new hso_ef();
            } else if (var0 != null && var0.length() != 0) {
                if (!hso_cd.a) {
                    String var2 = var0;
                    ByteArrayOutputStream var3 = new ByteArrayOutputStream();
                    DataOutputStream var4 = new DataOutputStream(var3);

                    try {
                        var4.writeUTF(var2);
                        hso_ak.a("listServer", var3.toByteArray());
                        var4.close();
                    } catch (Exception var5) {
                    }

                    String[] var6;
                    hso_dw.a = new String[(var6 = hso_o.a(var0.trim(), ",")).length - 1][2];
                    hso_ft.L = new int[var6.length - 1];
                    hso_ft.M = new int[var6.length - 1];
                    if (var1) {
                        hso_ft.H = (byte) (var6.length - 1);
                    }

                    for (int var7 = 0; var7 < var6.length - 1; ++var7) {
                        String[] var8 = hso_o.a(var6[var7].trim(), ":");
                        hso_dw.a[var7][0] = var8[0];
                        hso_dw.a[var7][1] = var8[1];
                        hso_ft.L[var7] = Short.parseShort(var8[2]);
                        hso_ft.M[var7] = Byte.parseByte(var8[3].trim());
                        if (var1 && hso_ft.M[var7] == 0 && hso_ft.D) {
                            hso_ft.H = (byte) var7;
                        }
                    }

                    hso_ft.D = hso_ft.M[hso_ft.H] == 0;
                    b();
                }
            }
        }
    }

    public static void b() {
        hso_co.c = "";
        hso_bs.k = 1;
        if (hso_ft.W >= 200 && hso_ft.X >= 200) {
            if (hso_ft.A && hso_ft.W < 380 && hso_ft.W > 315 && hso_ft.W < 380) {
                hso_bs.k = 2;
            }
        } else {
            hso_bs.k = 2;
        }

        hso_ft.a(hso_df.aG, (hso_bt) null);
        if (!hso_ft.D) {
            new hso_ef();
            hso_bs.l = aq.a("/interface/logoe.png");
        } else {
            new hso_df();
            hso_bs.l = aq.a("/interface/logo.png");
        }

        hso_f.a();
        hso_cd.a();
        hso_ag.b().g();
        hso_ft.a();
        hso_ck.a = null;
        hso_ft.j();
    }
}
