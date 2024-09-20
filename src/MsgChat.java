
public final class MsgChat extends hso_da {

    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private byte j = 5;
    private static int k = 0;
    private int r;
    public static hso_es a = new hso_es("MsgChat vecChatTab");
    private static String[] s;
    public static ChatDetail b;
    public static hso_bt c;
    private static hso_bt t;
    private static hso_bt u;
    private static hso_bt v;
    private static hso_bt w;
    private static hso_bt x;
    private boolean y;
    private boolean z;
    private hso_fz A = new hso_fz();
    private hso_bp B;
    private hso_aw C = new hso_aw();
    private int D;
    int d;
    private int E;
    private int F;
    private int G;

    public MsgChat() {
        this.D = hso_fl.aM;
        this.d = hso_fl.aN;
        super.l = hso_ft.W / 4 * 3;
        if (super.l < 160) {
            super.l = 160;
        } else if (super.l > 240) {
            super.l = 240;
        }

        super.m = hso_ft.X - (hso_bt.k << 1) - 16;
        if (super.m > 240) {
            super.m = 240;
        }

        this.G = (super.m - 3 * this.D) / hso_ft.ab + 5;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - super.m / 2;
        this.C.a(0, 0, 0, 0);
        this.e = this.D * 3;
        if (this.e > 70) {
            this.e = 70;
        }

        if (this.D < 20) {
            this.j = 4;
        }

        this.f = (super.l - this.e - 20) / (this.D - 1) + 1;
        this.g = k - this.f / 2;
        if (this.g < 0) {
            this.g = 0;
        }

        this.h = this.g + this.f;
        if (this.h > a.c()) {
            this.h = a.c();
        }

        this.i = (super.l - (this.f - 1) * (this.D - 1) - this.e) / 2;
        c = new hso_bt(hso_df.getChat("public MsgChat()"), 0, this);
        t = new hso_bt(hso_df.aw, 1, this);
        u = new hso_bt(hso_df.cD, -1, this);
        v = new hso_bt(hso_df.X, 2, this);
        w = new hso_bt(hso_df.bI, 3, this);
        x = new hso_bt(hso_df.bJ, 4, this);
        this.B = new hso_bp(super.n, super.o + this.D, super.l, super.m - 3 * this.D, 0, 0, 0);
        hso_fz var10000 = this.A;
        int var10001 = super.n + super.l - 6;
        int var10002 = super.o + this.D + 10;
        int var10003 = super.m - this.D - hso_fi.c() - 25;
        int var5 = hso_fl.bf[9];
        int var4 = var10003;
        int var3 = var10002;
        int var2 = var10001;
        hso_fz var1 = var10000;
        var10000.a = var2;
        var1.b = var3;
        var1.c = var4;
        var1.d = var5;
        var1.f = var4 - hso_fl.aM;
        this.c();
    }

    public static void b() {
        c.a = hso_df.getChat("public static void b()");
        t.a = hso_df.aw;
        u.a = hso_df.cD;
        v.a = hso_df.X;
        w.a = hso_df.bI;
        x.a = hso_df.bJ;
    }

    public final void c() {
        if (a.c() != 0) {
            if (b == null && a.c() > 0) {
                if (k < 0 || k >= a.c()) {
                    k = 0;
                }

                b = (ChatDetail) a.a(k);
                this.h();
            }

            if (b != null) {
                this.h();
            }

            if (hso_ft.A) {
                v.a(super.n + super.l - 12, super.o - 14, hso_cf.t, "");
            }

            super.Y = v;
        }

    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case -1:
                hso_ft.j();
                break;
            case 0:
                b.a(GameScreen.f.cB);
                break;
            case 1:
                if (k < 0 || k >= a.c()) {
                    return;
                }

                ChatDetail var4;
                if ((var4 = (ChatDetail) a.a(k)) != null) {
                    hso_fm var5;
                    if ((var5 = hso_ff.a(var4.b, (byte) 0)) != null) {
                        var5.g = true;
                    }

                    a.b(k);
                    if (k > 0) {
                        --k;
                    }

                    if (a.c() == 0) {
                        b = null;
                        super.Y = null;
                        super.aa = null;
                        super.Z = u;
                    } else {
                        this.h();
                    }
                }
                break;
            case 2:
                if (hso_ft.A && a.c() == 1) {
                    hso_ft.j();
                    return;
                }

                hso_es var3 = new hso_es("MsgChat menu");
                if (k > 0) {
                    var3.a(t);
                }

                var3.a(u);
                hso_ft.o.a(var3, 2, hso_df.bL, false, (hso_es) null);
                break;
            case 3:
                Service.a().a((byte) 1, (String) b.c);
                t.a();
                break;
            case 4:
                Service.a().a((byte) 2, (String) b.c);
                t.a();
        }

        super.a(var1, var2);
    }

    public final void a(mGraphics var1) {
        hso_ft.a(var1);
        hso_cg.b(var1, super.n - 10, super.o - hso_ft.aa - 6, super.l + 20, super.m + hso_ft.aa + 12, 0);
        mGraphics var4 = var1;
        MsgChat var2 = this;
        int var3;
        int var5;
        int var6;
        int var7;
        if (hso_ft.B) {
            hso_fl.c(var1, super.n, super.o + this.D, super.l, super.m - this.D, 2);
        } else {
            var5 = super.m - this.D;
            var6 = super.l / 32;
            var7 = var5 / 32;

            for (var3 = 0; var3 <= var6; ++var3) {
                for (var5 = 0; var5 <= var7; ++var5) {
                    if (var3 == var6) {
                        if (var5 == var7) {
                            var4.a(hso_fl.aP[2], var2.n + var2.l - 32, var2.o + var2.m - 32, 0);
                        } else {
                            var4.a(hso_fl.aP[2], var2.n + var2.l - 32, var2.o + var2.D + (var5 << 5), 0);
                        }
                    } else if (var5 == var7) {
                        var4.a(hso_fl.aP[2], var2.n + (var3 << 5), var2.o + var2.m - 32, 0);
                    } else {
                        var4.a(hso_fl.aP[2], var2.n + (var3 << 5), var2.o + var2.D + (var5 << 5), 0);
                    }
                }
            }
        }

        hso_cg.a(var1, hso_df.bL, super.n + super.l / 2, super.o - hso_ft.aa + hso_ft.aa / 4, 2, (int) 0);
        int var8 = super.n + this.i;
        var3 = super.o + this.d;
        if (a.c() > 0 && b != null) {
            if (this.g > 0) {
                var1.a(hso_fl.aP[13], 0, this.y && hso_ft.ai % 6 < 3 ? 16 : 0, 13, 8, 6, var8 - 6, var3 + (this.d << 1), 3);
            }

            var1.a(hso_fl.bf[7]);

            int var10;
            ChatDetail var12;
            for (var10 = this.g; var10 < k; ++var10) {
                var12 = (ChatDetail) a.a(var10);
                this.a(var1, var8, var3, this.D, this.D, var12.e, var12.timeNew);
                hso_o.i.a(var1, s[var10], var8 + this.D / 2, var3 + this.D / 2 - 7, 2, true);
                var8 += this.D - 1;
            }

            this.r = var8;
            var8 += this.e - 1;

            for (var10 = k + 1; var10 < this.h; ++var10) {
                var12 = (ChatDetail) a.a(var10);
                this.a(var1, var8, var3, this.D, this.D, var12.e, var12.timeNew);
                hso_o.i.a(var1, s[var10], var8 + this.D / 2, var3 + this.D / 2 - 7, 2, true);
                var8 += this.D - 1;
            }

            if (this.h < a.c()) {
                var1.a(hso_fl.aP[13], 0, this.z && hso_ft.ai % 6 < 3 ? 24 : 8, 13, 8, 6, var8 + 7, var3 + (this.d << 1), 3);
            }

            int var10002 = var3 - 1;
            var6 = this.e;
            var5 = var10002;
            var10 = this.r;
            mGraphics var9 = var1;
            if (hso_ft.B) {
                hso_fl.c(var1, var10, var5, var6, 32, 2);
            } else {
                for (var7 = 0; var7 <= var6 / 32; ++var7) {
                    if (var7 == 0) {
                        var9.a(hso_fl.aP[9], var10, var5, 0);
                    } else if (var7 == var6 / 32) {
                        var9.a(hso_fl.aP[9], 0, 0, 32, 32, 2, var10 + var6 - 32, var5, 0);
                    } else {
                        var9.a(hso_fl.aP[2], var10 + (var7 << 5), var5, 0);
                    }
                }
            }

            var4 = null;
            String var13;
            if (hso_o.f.a(b.b) < this.e - 4) {
                var13 = b.b;
            } else {
                var13 = b.b.substring(0, this.j - 1 << 1) + "..";
            }

            hso_o.f.a(var1, var13, this.r + this.e / 2, var3 + this.D / 2 - 7, 2, true);
            var3 += this.D;
            var1.d(super.n, var3, super.l, super.m - this.D - 7 - (b.g == 0 ? 17 : 0));
            var1.a(0, -this.C.b);
            this.E = this.C.b / hso_ft.ab - 2;
            if (this.E < 0) {
                this.E = 0;
            }

            this.F = this.E + this.G;

            for (var8 = this.E; var8 <= this.F; ++var8) {
                if (var8 < b.a.c() && var8 >= 0) {
                    hso_bu var14;
                    hso_fl.a((var14 = (hso_bu) b.a.a(var8)).b).a(var1, var14.a, super.n + this.d, var3 + 2 + var8 * hso_ft.ab, 0, true);
                }
            }

            hso_ft.a(var1);
            if (this.C.f > 0) {
                hso_fz var11 = this.A;
                var1.a(var11.d);
                var1.c(var11.a - 2, var11.b - 1, 3, 1);
                var1.c(var11.a - 3, var11.b, 1, var11.c - 1);
                var1.c(var11.a + 1, var11.b, 1, var11.c - 1);
                var1.c(var11.a - 2, var11.b + var11.c - 1, 3, 1);
                var1.c(var11.a - 2, var11.b + var11.e, 3, hso_fl.aM);
            }

            if (b.g == 0) {
                b.f.a(var1);
            }
        } else {
            var3 += this.D;
            hso_o.j.a(var1, hso_df.av, super.n + super.l / 2, var3 + 2, 2, true);
        }

        super.a(var1);
    }

    public final void d() {
        if (a.c() > 0 && b != null) {
            int var1 = k;
            if (hso_ft.al[4]) {
                if (k != 0) {
                    --k;
                }

                hso_ft.d(4);
            } else if (hso_ft.al[6]) {
                ++k;
                hso_ft.d(6);
            }

            k = hso_cg.a(k, a.c() - 1, true);
            hso_aw var10000;
            if (hso_ft.al[2]) {
                var10000 = this.C;
                var10000.d -= hso_ft.ab;
                if (this.C.d < 0) {
                    this.C.d = 0;
                }

                hso_ft.d(2);
            } else if (hso_ft.al[8]) {
                var10000 = this.C;
                var10000.d += hso_ft.ab;
                if (this.C.d > this.C.f) {
                    this.C.d = this.C.f;
                }

                hso_ft.d(8);
            }

            if (var1 != k) {
                this.h();
            }
        }

        super.d();
    }

    public final void a() {
        if (hso_ft.A) {
            this.B.a();
            this.C.b = this.B.f;
        }

        this.y = false;
        this.z = false;
        if (a.c() > 0 && b != null) {
            for (int var1 = 0; var1 < a.c(); ++var1) {
                if ((var1 < this.g || var1 >= this.h) && ((ChatDetail) a.a(var1)).e) {
                    if (var1 < this.g) {
                        this.y = true;
                    } else {
                        this.z = true;
                    }
                }
            }

            if (a.c() == 0) {
                k = 0;
            }

            if (this.C.f > 0) {
                hso_fz var10000 = this.A;
                int var3 = this.C.f;
                int var2 = this.C.b;
                hso_fz var4 = var10000;
                var10000.e = var2 * var4.f / var3;
            }

            if (hso_ft.A) {
                this.B.c();
            } else {
                this.C.a();
                this.C.a();
            }

            if (b.g == 0) {
                b.f.a();
            }
        } else if (b == null && a.c() > 0) {
            k = 0;
            b = (ChatDetail) a.a(k);
            this.h();
        }

        this.d();
        this.e();
        super.a();
    }

    public final void e(int var1) {
        if (a.c() > 0 && b != null && b.g == 0) {
            b.f.b(var1);
        }

        super.e(var1);
    }

    private static void g() {
        s = new String[a.c()];

        for (int var0 = 0; var0 < s.length; ++var0) {
            ChatDetail var1;
            if ((var1 = (ChatDetail) a.a(var0)).b.length() <= 4) {
                s[var0] = var1.b;
            } else {
                s[var0] = var1.b.substring(0, 4);
            }
        }

    }

    public final void a(int var1) {
        if (hso_ft.A) {
            this.B.g = b.h;
            if (this.B.f + super.m / 4 > this.B.g && this.B.g > 0) {
                hso_bp var10000 = this.B;
                var10000.e += hso_ft.ab * var1;
                return;
            }
        } else {
            this.C.f = b.h;
            if (this.C.b + super.m / 4 > this.C.f) {
                hso_aw var2 = this.C;
                var2.d += hso_ft.ab * var1;
            }
        }

    }

    private void h() {
        b = (ChatDetail) a.a(k);
        if (super.Y == null) {
            super.Y = v;
        }

        if (b.g == 0) {
            b.f.b("");
            if (!hso_ft.A) {
                b.f.a(true);
                super.aa = c;
                super.Z = b.f.b();
            }
        } else if (b.g == 2) {
            super.aa = w;
            super.Z = x;
        } else {
            super.aa = null;
            super.Z = null;
        }

        if (b.timeNew > 0) {
            b.timeNew = -1;
            b.e = false;
        }

        if (b.h > 0) {
            int var1;
            if ((var1 = b.h - super.m / 4) < 0) {
                var1 = 0;
            }

            if (hso_ft.A) {
                this.B.g = b.h;
                this.B.e = b.h;
            } else {
                this.C.a(0, b.h, 0, var1);
                this.C.d = b.h;
            }
        } else if (!hso_ft.A) {
            this.C.a(0, 0, 0, 0);
        } else {
            this.B.g = 0;
            this.B.e = 0;
        }

        this.g = k - this.f / 2;
        if (this.g < 0) {
            this.g = 0;
        }

        this.h = this.g + this.f;
        if (this.h > a.c()) {
            this.h = a.c();
            this.g = this.h - this.f;
            if (this.g < 0) {
                this.g = 0;
            }
        }

        g();
        hso_eu.f = 10;
    }

    public final void e() {
        if (a.c() > 0 && b != null) {
            if (b.g == 0) {
                b.f.g();
            }

            if (hso_ft.S) {
                int var1 = super.n;
                int var2 = super.o;
                int var3 = (var1 += this.i) + (this.f - 1) * (this.D - 1) + this.e;
                int var4 = k;
                if (hso_ft.c(super.n, var2, super.l, this.D)) {
                    if (hso_ft.ae < this.r && hso_ft.ae > var1) {
                        var4 = k + (hso_ft.ae - this.r) / (this.D - 1) - 1;
                        hso_eu.f = 10;
                    } else if (hso_ft.ae > this.r + this.e && hso_ft.ae < var3) {
                        var4 = k + (hso_ft.ae - this.r - this.e) / (this.D - 1) + 1;
                    } else if (hso_ft.ae < var1) {
                        var4 = k - this.f;
                    } else if (hso_ft.ae > var3) {
                        var4 = k + this.f;
                    }
                }

                if ((var4 = hso_cg.a(var4, a.c() - 1, false)) != k) {
                    k = var4;
                    this.h();
                    hso_ft.S = false;
                    hso_eu.f = 10;
                }
            }
        }

        super.e();
    }

    public final void a(String var1, String var2, String var3, byte var4, boolean var5) {
        for (int var6 = 0; var6 < a.c(); ++var6) {
            ChatDetail var7;
            if ((var7 = (ChatDetail) a.a(var6)).b.compareTo(var1) == 0) {
                if (var5) {
                    k = var6;
                }

                if (var3.length() > 0) {
                    var7.addString(var2 + var3, var1);
                    String[] var8 = hso_o.j.a(var3, hso_ft.h.a / 5 << 1);
                    hso_ft.h.a(var1, (byte) 0, var8[0], 0);
                }

                return;
            }
        }

        ChatDetail var9 = new ChatDetail(var1, var4);
        if (var4 == 0) {
            var9.addString(hso_df.bc + var1, var1);
        }

        if (var3.length() > 0) {
            var9.addString(var2 + var3, var1);
            String[] var10 = hso_o.j.a(var3, hso_ft.h.a / 2);
            hso_ft.h.a(var1, (byte) 0, var10[0], 0);
        }

        a.a(var9);
        g();
        this.g = k - this.f / 2;
        if (this.g < 0) {
            this.g = 0;
        }

        this.h = this.g + this.f;
        if (this.h > a.c()) {
            this.h = a.c();
            this.g = this.h - this.f;
            if (this.g < 0) {
                this.g = 0;
            }
        }

        if (var5) {
            k = a.c() - 1;
        }

    }

    private void a(mGraphics var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
        if (var6 && (var7 + hso_ft.ai) % 8 < 4) {
            hso_eu.f = 10;
            if (hso_ft.B) {
                hso_fl.c(var1, var2 + 1, var3 + 1, var4 - 2, var5 - this.d - 1, 3);
            } else {
                var1.a(hso_fl.aP[10], 0, 0, var4 - 2, var5 - this.d - 1, 0, var2 + 1, var3 + 1, 0);
            }
        }

        var1.c(var2, var3 + 1, 1, var5 - 1);
        var1.c(var2 + 1, var3, var4 - 2, 1);
        var1.c(var2 + var4 - 1, var3 + 1, 1, var5 - 1);
    }

    public static void a(String var0) {
        for (int var1 = 0; var1 < a.c(); ++var1) {
            if (((ChatDetail) a.a(var1)).b.compareTo(var0) == 0) {
                k = var1;
                return;
            }
        }

    }

    public static void f() {
        for (int var0 = 0; var0 < a.c(); ++var0) {
            ChatDetail var1;
            int var2;
            if ((var2 = (var1 = (ChatDetail) a.a(var0)).a.c()) > 80) {
                for (int var3 = 0; var3 < var2 - 80; ++var3) {
                    var1.a.b(var0);
                }

                var1.a();
            }
        }

    }
}
