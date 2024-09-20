
public class hso_s extends hso_au {

    public boolean a;
    public static hso_ek b = new hso_ek();
    public static byte[][][] c = new byte[][][]{{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}, {{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}, {{2, 2, 2, 2, 2, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3}}, {{2, 2, 2, 2, 2, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3}}, {{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}};
    public static byte[][][] d = new byte[][][]{{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}, {{2, 2, 2, 3, 3, 3, 4, 4}, {2, 2, 2, 3, 3, 3, 4, 4}, {2, 2, 2, 3, 3, 3, 4, 4}}, {{5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5, 1, 1}}, {{5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5, 1, 1}}, {{6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}}};
    public static byte[][][] e = new byte[][][]{{{2, 2, 2, 3, 3, 3, 4, 4, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5}, {5, 5, 5, 5, 5, 5}}, {{5, 5, 5, 5, 5, 5}, {5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5, 1, 1}}, {{6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}}};
    public static byte[][][] f;
    public static byte[][][] g;
    protected hso_en[] h;
    private boolean U;
    protected boolean i;
    protected byte j;
    protected byte k;
    protected byte l;
    protected byte m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    public int s;
    private int V;
    public short t;
    public byte u;
    protected hso_es v;
    protected MainObject w;
    public static hso_ek x;
    public static byte[] y;

    static {
        byte[][][] var10000 = new byte[][][]{{{2, 2, 2, 3, 3, 3, 4, 4, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5}, {5, 5, 5, 5, 5, 5}}, {{5, 5, 5, 5, 5, 5}, {5, 5, 5, 5, 5, 5, 1, 1}, {5, 5, 5, 5, 5, 5, 1, 1}}, {{6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}}};
        f = new byte[][][]{{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}, {{2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{5, 2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {5, 5, 5, 5, 5, 5, 5}, {5, 5, 5, 5, 5, 5, 5}}, {{6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}}};
        g = new byte[][][]{{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}, {{2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {2, 2, 2, 3, 3, 3, 4, 4, 3, 3}}, {{5, 2, 2, 2, 3, 3, 3, 4, 4, 3, 3}, {5, 5, 5, 5, 5, 5, 5}, {5, 5, 5, 5, 5, 5, 5}}, {{6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}, {6, 6, 6, 6, 6, 6, 6, 6}}};
        x = new hso_ek();
        y = new byte[]{2, 1, 0, 2, 0, 1};
    }

    public static hso_s a(short var0, int var1, byte var2, byte var3) {
        Object var4 = null;
        boolean var5 = false;
        byte var6;
        switch (var6 = y[var0]) {
            case 0:
                var4 = new hso_fx(var0, var1, var2, var3, var6);
                break;
            case 1:
            case 2:
                var4 = new hso_ga(var0, var1, var2, var3, var6);
                break;
            case 3:
                var4 = new hso_av(var0, var1, var2, var3, var6);
        }

        return (hso_s) var4;
    }

    public static hso_s a(MainObject var0, short var1, byte var2, byte var3) {
        Object var4 = null;
        boolean var5 = false;
        byte var6;
        switch (var6 = y[var1]) {
            case 0:
                var4 = new hso_fx(var0, var1, var2, var3, var6);
                break;
            case 1:
            case 2:
                var4 = new hso_ga(var0, var1, var2, var3, var6);
                break;
            case 3:
                var4 = new hso_av(var0, var1, var2, var3, var6);
        }

        return (hso_s) var4;
    }

    public hso_s() {
        this.h = new hso_en[]{new hso_en(13 * hso_cs.l, 12 * hso_cs.l),
            new hso_en(11 * hso_cs.l, 21 * hso_cs.l), new hso_en(22 * hso_cs.l, 20 * hso_cs.l), new hso_en(23 * hso_cs.l, 16 * hso_cs.l),
            new hso_en(16 * hso_cs.l, 14 * hso_cs.l), new hso_en(13 * hso_cs.l, 22 * hso_cs.l)};
        this.V = 6;
        this.v = new hso_es("Pet wayPoint");
    }

    public hso_s(short var1, byte var2, byte var3, byte var4) {
        this.h = new hso_en[]{new hso_en(13 * hso_cs.l, 12 * hso_cs.l), new hso_en(11 * hso_cs.l, 21 * hso_cs.l),
            new hso_en(22 * hso_cs.l, 20 * hso_cs.l),
            new hso_en(23 * hso_cs.l, 16 * hso_cs.l), new hso_en(16 * hso_cs.l, 14 * hso_cs.l), new hso_en(13 * hso_cs.l, 22 * hso_cs.l)};
        this.V = 6;
        this.v = new hso_es("Pet wayPoint");
        super.N = var2;
        this.j = var3;
        this.i = false;
        super.dh = new hso_dh();
        this.u = var4;
        switch (this.u) {
            case 0:
                super.z = d;
                return;
            case 1:
                super.z = e;
                return;
            case 2:
                super.z = f;
            default:
        }
    }

    public final void c() {
        this.v.d();
    }

    public final void a(byte var1) {
        this.k = var1;
    }

    protected void f_() {
        super.bi = 1;
        if (super.cF == 1) {
            if (super.dV > super.A || hso_ak.f(16) == 0 || MainObject.c(super.aY + super.bb, super.aZ + super.bc, super.F, super.G) >= super.C) {
                super.dV = 0;
                super.cF = 0;
                super.bb = 0;
                super.bc = 0;
            }
        } else if (super.cF == 0) {
            super.bb = 0;
            super.bc = 0;
            if (super.dV > super.A / 2 || hso_ak.f(12) == 0) {
                super.dV = 0;
                super.cF = 1;
//                super.Direction = hso_ak.f(4);
                super.setDirection(hso_ak.f(4), "protected void f_() {", hso_s.class);
                this.c(super.bi);
            }
        }

        byte var2;
        if (this.w != null) {
            if (this.w.cF == 1 && MainObject.c(super.aY, super.aZ, this.q, this.r) > 40) {
                var2 = 1;
                this.k = var2;
            }

            if (this.w.cF == 0 && MainObject.c(super.aY, super.aZ, this.q, this.r) > super.C << 1) {
                var2 = 3;
                this.k = var2;
                return;
            }
        } else {
            int var1;
            if ((var1 = MainObject.c(super.aY, super.aZ, GameScreen.f.aY, GameScreen.f.aZ)) < 80 && var1 > 40 && hso_ak.f(6) == 0) {
                var2 = 6;
                this.k = var2;
            }
        }

    }

    protected void g() {
        super.bi = this.w.bi;
        super.cF = 1;
        if (MainObject.c(this.o, this.p, this.q, this.r) > 40) {
            hso_en var1 = new hso_en(this.q, this.r);
            this.o = this.q;
            this.p = this.r;
            this.v.a(var1);
        } else if (MainObject.c(super.aY, super.aZ, super.F, super.G) < 40) {
            this.v.d();
            byte var2 = 4;
            this.k = var2;
        }

        if (this.v.a(0) != null) {
            super.bf = ((hso_en) this.v.a(0)).a;
            super.bg = ((hso_en) this.v.a(0)).b;
            this.h();
        }

    }

    public final void h() {
        super.h();
        if (this.k != 3 && (this.w.Direction == 1 || this.w.Direction == 0) && !this.a) {
            this.s += this.V;
            if (this.V > 0) {
                super.Direction = 3;
            }

            if (this.V < 0) {
                super.Direction = 2;
            }

            if (this.s + this.V >= 48 && this.V > 0 || this.s + this.V < -48 && this.V < 0) {
                this.V = -this.V;
            }
        }

    }

    public final void b(byte var1) {
        try {
            this.m = var1;
            super.cU = true;
            super.P = hso_ft.aj;
            this.n = 0;
            this.U = false;
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    protected void i() {
        if (this.i) {
            this.i = false;
            byte var1 = 4;
            this.k = var1;
        }

    }

    protected void g_() {
        super.bi = this.w.bi;
        super.bf = this.w.aY;
        super.bg = this.w.aZ;
        this.h();
        if (MainObject.c(super.aY, super.aZ, super.F, super.G) < 40 && this.w.cF != 2) {
            byte var1 = 0;
            this.k = var1;
        }

    }

    protected final void h_() {
        super.bb = 0;
        super.bc = 0;
        if (this.u != 1 && this.u != 2) {
            super.cF = 0;
        } else {
            super.cF = 1;
        }

        if (this.w != null) {
            byte var1;
            if (this.w.cF == 0) {
                this.v.d();
                var1 = 0;
                this.k = var1;
                return;
            }

            if (this.w.cF == 1 && MainObject.c(super.aY, super.aZ, super.F, super.G) > 40) {
                this.v.d();
                var1 = 1;
                this.k = var1;
            }
        }

    }

    public final void l() {
        if (super.Q != null && super.Q.c() > 0) {
            int var1;
            hso_bf var2;
            MainObject var3;
            hso_es var4;
            switch (this.m) {
                case 0:
                    GameScreen.a(10, super.aY, super.aZ);

                    for (var1 = 0; var1 < super.Q.c(); ++var1) {
                        if ((var3 = MainObject.a((var2 = (hso_bf) super.Q.a(var1)).a, var2.b)) != null && var2.c > 0) {
                            GameScreen.a("-" + var2.c, var3.aY, var3.aZ - var3.be, 0, this.w.ct);
                        }

                        (var4 = new hso_es("Pet target")).a(var2);
                        GameScreen.a(89, this.w.ct, this.w.cu, var4);
                    }

                    ++this.n;
                    return;
                case 1:
                    GameScreen.a(51, super.aY, super.aZ - 8);

                    for (var1 = 0; var1 < super.Q.c(); ++var1) {
                        if ((var3 = MainObject.a((var2 = (hso_bf) super.Q.a(var1)).a, var2.b)) != null && var2.c > 0) {
                            GameScreen.a("-" + var2.c, var3.aY, var3.aZ - var3.be, 0, this.w.ct);
                        }

                        (var4 = new hso_es("Pet target2")).a(var2);
                        GameScreen.a(92, this.w.ct, this.w.cu, var4);
                    }

                    ++this.n;
                    return;
                case 2:
                    GameScreen.a(50, super.ct, (byte) 9, super.Q);
                    ++this.n;
                    return;
                case 3:
                    GameScreen.a(91, super.ct, super.cu, super.Q);
                    ++this.n;
                    return;
                case 4:
                    GameScreen.a(90, super.ct, super.cu, super.Q);
                    ++this.n;
                    return;
                case 5:
                    GameScreen.a(81, super.aY, super.aZ - 20, 200, (short) 0, (byte) 0);
                    ++this.n;
                    return;
                case 6:
                case 7:
                case 8:
                case 9:
                default:
                    break;
                case 10:
                    for (var1 = 0; var1 < super.Q.c(); ++var1) {
                        if ((var3 = MainObject.a((var2 = (hso_bf) super.Q.a(var1)).a, var2.b)) != null && var2.c > 0) {
                            GameScreen.a("-" + var2.c, var3.aY, var3.aZ - var3.be, 0, this.w.ct);
                        }
                    }
            }
        }

    }

    public void a() {
        try {
            super.a();
            ++super.ba;
            if (super.ba > super.z[super.cF][super.Direction > 2 ? 2 : super.Direction].length - 1) {
                super.ba = 0;
                if (super.cF == 3 || super.cF == 2) {
                    super.cF = 0;
                    super.bb = 0;
                    super.bc = 0;
                    this.i = true;
                }
            }

            int var1 = hso_ft.p.a(super.aY + super.bb, super.aZ + super.bc);
            this.g(super.M, var1);
            if (this.w != null) {
                if (MainObject.c(super.aY, super.aZ, super.bf, super.bg) <= 10) {
                    this.v.b(0);
                }

                super.F = this.w.aY;
                super.G = this.w.aZ;
                this.q = this.w.aY;
                this.r = this.w.aZ;
            }

            ++super.dV;
            if ((this.u == 1 || this.u == 2) && super.cF != 0 && this.t < 50) {
                this.t = (short) (this.t + 3);
            }

            switch (this.k) {
                case 0:
                    this.f_();
                    break;
                case 1:
                    this.g();
                    break;
                case 2:
                    this.i();
                    break;
                case 3:
                    this.g_();
                    break;
                case 4:
                    this.h_();
                case 5:
                default:
                    break;
                case 6:
                    super.bi = 3;
                    super.cF = 1;
                    super.bf = GameScreen.f.aY;
                    super.bg = GameScreen.f.aZ;
                    this.h();
                    if (MainObject.c(super.aY, super.aZ, super.bf, super.bg) < 40) {
                        byte var2 = 0;
                        this.k = var2;
                    }
            }

            if (this.k != this.l) {
                this.l = this.k;
                return;
            }
        } catch (Exception var3) {
        }

    }

    public final boolean a(MainObject var1) {
        return this.w.equals(var1);
    }
}
