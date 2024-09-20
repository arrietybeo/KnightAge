
public final class ChatDetail {

    public hso_es a = new hso_es("ChatDetail vecDetail");
    String b;
    String c;
    byte timeNew = -1;
    boolean e = false;
    public hso_fi f;
    public byte g = 0;
    int h = 0;
    private int i = 0;
    private byte j = 0;

    public ChatDetail(String var1, byte var2) {
        this.b = var1;
        this.g = var2;
        if (this.g == 0) {
            this.f = new hso_fi(hso_ft.g.n + 5, hso_ft.g.o + hso_ft.g.m - (hso_fi.c() + 5), hso_ft.g.l - 10);
        } else if (this.g == 2) {
            this.c = var1;
            this.b = hso_df.aW;
        }

        if (var1.compareTo(hso_df.eV) != 0 && var1.compareTo(hso_df.cz) != 0 && var1.compareTo(hso_df.eU) != 0) {
            this.j = 0;
        } else {
            this.j = 1;
        }
    }

    public final void addString(String var1, String var2) {
        if (var1.length() > 0) {
            String[] var4;
            hso_bu[] var5;
            if ((var5 = a(var4 = hso_o.j.a(var1, hso_ft.g.l - (hso_ft.g.d << 1) - 8), this.b(var2))) != null) {
                for (int var3 = 0; var3 < var5.length; ++var3) {
                    this.a.a(var5[var3]);
                }
            }

            this.a();
            if (this.h > 0 && hso_ft.s != null && hso_ft.s == hso_ft.g && MsgChat.b != null && MsgChat.b == this) {
                hso_ft.g.a(var4.length);
            }

            if (MsgChat.b != null && MsgChat.b != this && this.b.compareTo(hso_df.cz) != 0) {// debug
                this.e = true;
                this.timeNew = (byte) hso_ak.c(1, 11);
            }
        }

    }

    public final void a(String var1) {
        String var2 = "";
        if (this.f != null) {
            var2 = this.f.j();
        }

        if (var2.length() > 0) {
            String[] var3;
            hso_bu[] var5;
            if ((var5 = a(var3 = hso_o.j.a(GameScreen.f.cB + ": " + var2, hso_ft.g.l - (hso_ft.g.d << 1) - 8), this.b(var1))) != null) {
                for (int var4 = 0; var4 < var5.length; ++var4) {
                    this.a.a(var5[var4]);
                }
            }

            this.a();
            if (MsgChat.b != null && MsgChat.b == this) {
                hso_ft.g.a(var3.length);
            }

            Service.a().a(this.b, var2);
        }

        if (this.f != null) {
            this.f.b("");
        }

    }

    public final void a() {
        this.h = this.a.c() * hso_ft.ab - (hso_ft.g.m - hso_fl.aM - 10 - (this.g == 0 ? hso_fi.c() + 2 : 0));
        if (this.h < 0) {
            this.h = 0;
        }

    }

    private static hso_bu[] a(String[] var0, byte var1) {
        if (var0 != null && var0.length != 0) {
            hso_bu[] var2 = new hso_bu[var0.length];

            for (int var3 = 0; var3 < var0.length; ++var3) {
                var2[var3] = new hso_bu(var0[var3], var1);
            }

            return var2;
        } else {
            return null;
        }
    }

    private byte b(String var1) {
        boolean var2 = false;
        int var3;
        if (this.j == 1) {
            var3 = this.i % 2 == 0 ? 0 : 5;
            ++this.i;
        } else if (var1.compareTo(GameScreen.f.cB) == 0) {
            var3 = 5;
        } else {
            var3 = 0;
        }

        return (byte) var3;
    }
}
