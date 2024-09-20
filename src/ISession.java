
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @param l
 */
public final class ISession {

    private static ISession l = new ISession();
    private DataOutputStream dos;
    public DataInputStream dis;
    public hso_bo b;
    private socket n;
    public boolean c;
    public boolean connecting;
    private final hso_ax o = new hso_ax(this);
    private Thread p;
    public Thread e;
    private int sendByteCount;
    public int f;
    boolean getKeyComplete;
    public byte[] key = null;
    private byte curW;
    private byte curR;
    long i;
    public static boolean j;
    public static int k = 0;

    public static ISession a() {
        return l;
    }

    public final boolean b() {
        return this.c;
    }

    public final void a(hso_bo var1) {
        this.b = var1;
    }

    public final void connect(String var1, int var2) {
        System.out.println("------------IP host:" + var1 + "--port:" + var2);
        if (!this.c && !this.connecting) {
            hso_ax var3;
            if ((var3 = this.o).a != null) {
                var3.a.removeAllElements();
            }

            this.getKeyComplete = false;
            this.n = null;
            this.p = new Thread(new NetworkInit(this, var1, var2));
            this.p.start();
        }
    }

    public final void a(Message var1) {
        this.o.a.addElement(var1);
    }

    private synchronized void doSendMessage(Message var1) {
        byte[] var2 = var1.getData();

        try {
            byte var5;
            if (this.getKeyComplete) {
                var5 = this.writeKey(var1.command);
                this.dos.writeByte(var5);
            } else {
                this.dos.writeByte(var1.command);
            }

            if (var2 != null) {
                int var6 = var2.length;
                if (this.getKeyComplete) {
                    byte var3 = this.writeKey((byte) (var6 >> 8));
                    this.dos.writeByte(var3);
                    var5 = this.writeKey((byte) var6);
                    this.dos.writeByte(var5);
                } else {
                    this.dos.writeShort(var6);
                }

                if (this.getKeyComplete) {
                    for (int var7 = 0; var7 < var2.length; ++var7) {
                        var2[var7] = this.writeKey(var2[var7]);
                    }
                }

                this.dos.write(var2);
                this.sendByteCount += 5 + var2.length;
            } else {
                this.dos.writeShort(0);
                this.sendByteCount += 5;
            }

            this.dos.flush();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    private byte writeKey(byte var1) {
        byte[] var10000 = this.key;
        byte var10003 = this.curR;
        this.curR = (byte) (var10003 + 1);
        var1 = (byte) (var10000[var10003] & 255 ^ var1 & 255);
        if (this.curR >= this.key.length) {
            this.curR = (byte) (this.curR % this.key.length);
        }

        return var1;
    }

    public final void c() {
        this.d();
    }

    private void d() {
        this.key = null;
        this.curW = 0;
        this.curR = 0;

        try {
            this.c = false;
            this.connecting = false;
            if (this.n != null) {
                this.n.a();
                this.n = null;
            }

            if (this.dos != null) {
                this.dos.close();
                this.dos = null;
            }

            if (this.dis != null) {
                this.dis.close();
                this.dis = null;
            }

            this.e = null;
            System.gc();
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    static socket a(ISession var0) {
        return var0.n;
    }

    static void a(ISession var0, socket var1) {
        var0.n = var1;
    }

    static void a(ISession var0, DataOutputStream var1) {
        var0.dos = var1;
    }

    static hso_ax b(ISession var0) {
        return var0.o;
    }

    static void a(ISession var0, Message var1) {
        var0.doSendMessage(var1);
    }

    static void c(ISession var0) {
        var0.d();
    }

    static byte readKey(ISession var0, byte var1) {
        byte[] var10000 = (var0 = var0).key;
        byte var10003 = var0.curW;
        var0.curW = (byte) (var10003 + 1);
        var1 = (byte) (var10000[var10003] & 255 ^ var1 & 255);
        if (var0.curW >= var0.key.length) {
            var0.curW = (byte) (var0.curW % var0.key.length);
        }

        return var1;
    }
}
