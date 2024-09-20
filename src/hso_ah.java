
public final class hso_ah extends hso_da {

    private String r;
    private String s = "";
    private String t;
    public static int a;
    private int u = 0;
    private int v;
    private int w;
    private int x;
    private int y;
    private byte z;
    private boolean A = false;
    private boolean B = false;
    public static byte b = 0;
    private hso_es C = new hso_es("MsgChat cmdList");
    private hso_bt D;
    private hso_bt E;
    private hso_bt F;
    private hso_bt G;
    private hso_bt H;
    public static hso_ce c;
    private hso_aw I;
    private hso_bp J;
    private int K;
    private int L;
    private int M;
    public static int d = 52;
    private static int N = 0;
    private hso_ew O;
    private static int P = 0;
    public static int[] e = new int[]{50, 50};
    private int Q;
    private byte[] R;
    private static byte[] S = null;
    private int T;
    public static int[][] f;
    private hso_o U;
    private byte V;
    private int W;
    private short X;
    private long aM;
    private int aN;
    private int aO;
    private int[][] aP;
    private hso_j[] aQ;
    private int aR;
    private int aS;
    private int aT;
    private byte aU;
    public static int g;
    public static int h;
    private static int aV;
    private static int aW;
    public static hso_ea i;
    public static byte j;
    private int aX;
    private int aY;
    public static boolean k;

    static {
        new hso_es("MsgDiaLog vecListEvent");
        j = 0;
        k = false;
    }

    public hso_ah() {
        this.D = new hso_bt(hso_df.Z, -1, this);
        this.E = new hso_bt(hso_df.as, 10, this);
        this.I = new hso_aw();
        this.K = 0;
        this.M = 0;
        this.Q = -1;
        this.R = new byte[3];
        this.T = 0;
        this.U = hso_o.j;
        this.W = 1;
        this.X = 0;
        this.aM = 0L;
        this.aN = 0;
        this.aS = 0;
        this.aT = 0;
        this.aU = 0;
    }

    public final void b(int var1, int var2) {
        hso_ft.m();
        hso_ft.l();
        switch (var1) {
            case -1:
            case 7:
                l();
                hso_bv.b = 0L;
                hso_bv.a = false;
                hso_bv.c = false;
                k = false;
                return;
            case 0:
                label133:
                {
                    if (hso_ft.a != hso_ft.b && hso_ft.a != hso_ft.d) {
                        if (!hso_x.f) {
                            break label133;
                        }

                        hso_ft.b.c();
                        if (ak.a("user_pass") != null) {
                            try {
                                hso_bs.i();
                            } catch (Exception var9) {
                                var9.printStackTrace();
                            }

                            hso_ft.o();
                            Service.a().a(hso_bs.f.j(), hso_bs.g.j(), hso_k.a, "0", "0", "0", hso_x.b, hso_cs.u);
                            GameScreen.f.n_();
                            if (hso_ck.a == null || hso_dr.b == null) {
                                Service.a().g((byte) 61);
                            }

                            l();
                            break label133;
                        }

                        hso_ft.b.c();
                    } else if (hso_ft.a != hso_ft.b) {
                        hso_ft.b.c();
                    }

                    l();
                }

                hso_bv.b = 0L;
                hso_bv.a = false;
                hso_bv.c = false;
                k = false;
                return;
            case 1:
                l();
                return;
            case 2:
                Service.a().a((short) this.v, this.z, (byte) this.w);
                break;
            case 3:
                hso_ft.e.a((hso_p) hso_ft.c);
                break;
            case 4:
                this.k();
                return;
            case 5:
                Player.l = true;
                Player.w[Player.d][4].b = hso_ao.d;
                Player.w[Player.d][3].b = hso_ao.d;
                hso_j.a((byte) 1, P != 0);
                hso_j.a((byte) 0, P != 0);
                hso_co.b();
                hso_y.f();
                break;
            case 6:
                GameScreen.f.n_();
                hso_ft.b.c();
                l();
                hso_bv.b = 0L;
                hso_bv.a = false;
                hso_bv.c = false;
                k = false;
                return;
            case 8:
                if (Player.N == null) {
                    return;
                }

                hso_bt var4;
                if (GameScreen.f.cB.compareTo(Player.N.a) == 0) {
                    if (Player.N != null) {
                        hso_aj var8 = (hso_aj) Player.N.b.a(this.x);
                        hso_es var9 = new hso_es("MsgChat menu2");
                        hso_bt var11;
                        if (var8.b.compareTo(GameScreen.f.cB) != 0) {
                            String var10;
                            if ((var10 = var8.b).length() > 8) {
                                var10 = var10.substring(0, 7) + "...";
                            }

                            var11 = new hso_bt(hso_df.bl + " " + var10 + " " + hso_df.aU, 6, this);
                            var9.a(var11);
                        }

                        var11 = new hso_bt(hso_df.aU, 8, this);
                        var9.a(var11);
                        var11 = new hso_bt(hso_df.aV, 7, this);
                        var9.a(var11);
                        var4 = new hso_bt(hso_df.fi, 15, this);
                        var9.a(var4);
                        hso_ft.o.a(var9, 2, hso_df.cW, false, (hso_es) null);
                    }

                    return;
                }

                hso_es var6 = new hso_es("MsgChat menu");
                hso_bt var7 = new hso_bt(hso_df.aU, 8, this);
                var6.a(var7);
                var4 = new hso_bt(hso_df.fi, 15, this);
                var6.a(var4);
                hso_ft.o.a(var6, 2, hso_df.cW, false, (hso_es) null);
                return;
            case 9:
                byte var5 = -1;
                if (this.R[0] < (byte) (hso_df.gI[0].length - 1)) {
                    var5 = this.R[0];
                }

                Player.q = new hso_be((byte) var5, this.R[1], this.R[2]);
                hso_co.b();
                break;
            case 10:
                if (this.x >= 0 && this.x < b) {
                    b(this.x);
                    return;
                }

                return;
            case 11:
                l();
                return;
            case 12:
            case 13:
            case 14:
            default:
                break;
            case 15:
                l();
                Service.a().k((byte) var1);
                return;
            case 16:
                l();
                GameScreen.f.N();
                ISession.a().c();
                hso_ft.b.c();
                GameScreen.f = new Player(0, (byte) 0, "unname", 0, 0);
                hso_x.g = false;
                hso_x.h = false;
                return;
        }

        l();
    }

    public final void a(int var1, int var2) {
        hso_ft.m();
        hso_ft.l();
        hso_aj var5 = null;
        switch (var1) {
            case -1:
                l();
                return;
            case 0:
            case 1:
            case 4:
            case 5:
            case 13:
            default:
                break;
            case 2:
                if (Player.N == null) {
                    return;
                }

                if (this.x >= 0 && this.x < Player.N.b.c()) {
                    var5 = (hso_aj) Player.N.b.a(this.x);
                    hso_ft.c(hso_df.bf + var5.b + "?", new hso_bt(hso_df.aX, 0, this));
                    return;
                }
                break;
            case 3:
                if (Player.N == null) {
                    return;
                }

                if (this.x >= 0 && this.x < Player.N.b.c()) {
                    hso_ft.c(hso_df.bg, new hso_bt(hso_df.aX, 1, this));
                    return;
                }
                break;
            case 6:
                if (Player.N == null) {
                    return;
                }

                var5 = (hso_aj) Player.N.b.a(this.x);
                Service.a().b((byte) 3, var5.b);
                return;
            case 7:
                l();
                Service.a().b((byte) 4, "");
                return;
            case 8:
                l();
                Service.a().b((byte) 5, "");
                return;
            case 9:
                if (Player.N == null) {
                    return;
                }

                var5 = (hso_aj) Player.N.b.a(this.x);
                Service.a().a((byte) 0, (String) var5.b);
                return;
            case 10:
                if (this.O == null) {
                    return;
                }

                hso_ft.c(hso_df.aE + this.O.k, new hso_bt(hso_df.as, 11, this));
                return;
            case 11:
                if (this.O == null) {
                    return;
                }

                Service.a().a((short) ((short) this.O.f), (byte) ((byte) (this.O.j ? 0 : 1)), (byte) 2);
                hso_dr.a.a(true);
                if (!GameScreen.p.d(9, 0)) {
                    l();
                    l();
                    return;
                }
                break;
            case 12:
                if (this.s.length() > 0) {
                    TemMidlet.b(this.s);
                    return;
                }
                break;
            case 14:
                if (Player.N == null) {
                    return;
                }

                var5 = (hso_aj) Player.N.b.a(this.x);
                hso_ft.g.a(var5.b, "", "", (byte) 0, true);
                hso_ft.h();
                return;
            case 15:
                hso_ft.g.a(hso_df.aS, "", "", (byte) 0, true);
                hso_ft.h();
                return;
            case 16:
                hso_es var3 = new hso_es("MsgChat vec");
                hso_fn var4;
                (var4 = new hso_fn(hso_bw.V, (byte) 0, hso_df.fI, -1, hso_fn.j)).D = i;
                var3.a(var4);
                (hso_ft.w = new hso_eu()).a = 0;
                hso_ft.w.a(var3);
                hso_ft.w.a(hso_ft.a);
        }

    }

    private void j() {
        GameScreen.f.O();
        super.Y = null;
        super.Z = null;
        super.aa = null;
        this.C.d();
    }

    public final void a(String var1, hso_bt var2, boolean var3) {
        this.j();
        if (var2 == null) {
            hso_ft.r = null;
        }

        this.A = false;
        this.B = false;
        super.p = 0;
        super.l = hso_ft.W - 30;
        if (super.l > 200) {
            super.l = 200;
        }

        this.C = new hso_es("MsgChat cmdlist2");
        this.C.a(var2);
        if (!var3) {
            this.C.a(this.D);
        }

        int var4 = this.C.c();
        if (super.l < var4 * hso_bt.j + (var4 - 1) * 10 + 10) {
            super.l = var4 * hso_bt.j + (var4 - 1) * 10 + 10;
        }

        if (super.l > hso_ft.W) {
            super.l = hso_ft.W;
        }

        super.q = this.U.a(var1, super.l - 20);
        super.m = 15 * super.q.length + d;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.X - (hso_ft.aa << 1) - super.m - 5;
        this.a(0);
    }

    public final void a(String var1, String var2) {
        this.j();
        this.s = var2;
        this.A = false;
        this.B = false;
        super.p = 0;
        super.l = hso_ft.W - 30;
        if (super.l > 200) {
            super.l = 200;
        }

        this.C = new hso_es("MsgChat cmdlist3");
        hso_bt var3 = new hso_bt(hso_df.ga, 12, this);
        this.C.a(var3);
        this.C.a(this.D);
        int var4 = this.C.c();
        if (super.l < var4 * hso_bt.j + (var4 - 1) * 10 + 10) {
            super.l = var4 * hso_bt.j + (var4 - 1) * 10 + 10;
        }

        if (super.l > hso_ft.W) {
            super.l = hso_ft.W;
        }

        super.q = this.U.a(var1, super.l - 20);
        super.m = 15 * super.q.length + d;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.X - (hso_ft.aa << 1) - super.m - 5;
        this.a(0);
    }

    public final void a(String var1, hso_bt var2) {
        this.j();
        this.A = true;
        this.B = false;
        super.p = 0;
        super.l = hso_ft.W - 30;
        if (super.l > 200) {
            super.l = 200;
        }

        this.C = new hso_es("MsgChat cmdList7");
        this.L = 0;
        if (var2 != null) {
            this.C.a(var2);
            this.L = hso_bt.k;
        }

        super.q = this.U.a(var1, super.l - 20);
        super.m = 15 * super.q.length + d + this.L;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.X - (hso_ft.aa << 1) - super.m - 5;
        this.a(0);
    }

    public final void a(String var1, hso_es var2) {
        this.j();
        if (var2 == null || var2.c() <= 0) {
            hso_ft.r = null;
        }

        this.A = false;
        this.B = false;
        super.p = 0;
        this.C = var2;
        super.l = hso_ft.W - 30;
        if (super.l > 200) {
            super.l = 200;
        }

        int var4 = this.C.c();
        if (super.l < 2 * hso_bt.j + 10) {
            super.l = 2 * hso_bt.j + 10;
        }

        if (super.l > hso_ft.W) {
            super.l = hso_ft.W;
        }

        int var3 = 0;
        if (this.C.c() > 2) {
            var3 = hso_bt.k;
        }

        super.q = this.U.a(var1, super.l - 20);
        super.m = 15 * super.q.length + d + var3;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.X - (hso_ft.aa << 1) - super.m - 5 + (var4 > 2 ? hso_bt.k + 5 : 0);
        this.a(0);
    }

    public final void a(String var1, String var2, int var3, int var4, byte var5) {
        this.j();
        this.M = 2;
        this.v = var3;
        this.w = var4;
        this.z = var5;
        this.B = true;
        hso_bt var6 = new hso_bt(hso_df.aq, 2);
        if (var4 == 1) {
            var6.a = hso_df.ar;
            this.C.a(var6);
        } else {
            this.C.a(var6);
            var6 = new hso_bt(hso_df.Z, 1);
            if (var5 == 1) {
                this.C.a(var6);
            }
        }

        this.r = var2;
        hso_o.f.a(var2);
        this.A = false;
        super.p = 1;
        this.W = 1;
        super.l = hso_ft.W / 5 << 2;
        if (super.l > 200) {
            super.l = 200;
        }

        super.q = hso_o.j.a(var1, super.l - 20);
        super.m = hso_ft.ab * (super.q.length + 1) + d + 20 + (this.C.c() > 2 ? hso_bt.k + 5 : 0);
        if (super.m > hso_ft.X / 2 + 10) {
            super.m = hso_ft.X / 2 + 10;
        }

        this.I.a(0, hso_ft.ab * (super.q.length + 1) + 30 - super.m, 0, 0);
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - hso_ft.aa - super.m / 2;
        this.a(0);
    }

    public final void a(hso_ew var1) {
        this.j();
        this.M = 2;
        this.r = var1.k;
        this.O = var1;
        this.B = true;
        hso_o.f.a(this.r);
        this.A = false;
        super.p = 1;
        this.W = 2;
        super.l = hso_ft.W / 5 << 2;
        if (super.l > 200) {
            super.l = 200;
        }

        hso_bt var2 = new hso_bt(hso_df.ap, 3);
        this.C.a(var2);
        this.C.a(this.E);
        this.C.a(this.D);
        if (!hso_ft.A) {
            var2 = new hso_bt(hso_df.af, -1, this);
            super.Z = var2;
        }

        super.q = hso_o.j.a(var1.n, super.l - 20);
        super.m = hso_ft.ab * (super.q.length + 1) + d + 15 + (this.C.c() > 2 ? hso_bt.k + 5 : 0);
        if (!hso_ft.A && super.m > hso_ft.X * 6 / 7) {
            super.m = hso_ft.X * 6 / 7;
        }

        this.I.a(0, hso_ft.ab * (super.q.length + 1) + 45 - super.m + hso_bt.k * this.W, 0, 0);
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - super.m / 2;
        this.a(4);
    }

    public final void b() {
        this.j();
        N = 0;
        this.A = false;
        this.B = true;
        super.p = 2;
        this.K = hso_ft.aa + 5;
        super.l = hso_ft.W / 4 * 3;
        if (super.l > 180) {
            super.l = 180;
        }

        if (Player.N != null) {
            a = Player.N.b.c();
        } else {
            a = 0;
        }

        super.m = this.K * a + d - 10 + hso_ft.aa;
        hso_bt var1 = new hso_bt(hso_df.ai, 4);
        this.F = new hso_bt(hso_df.cW, 8);
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - hso_ft.aa - super.m / 2 + (hso_ft.A ? hso_ft.aa : 0);
        hso_bt var2 = this.D;
        if (hso_ft.A) {
            this.C.a(this.F);
            this.a(4);
            var2.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
            this.C.a(var2);
        } else {
            this.C.a(this.F);
            this.C.a(var1);
            this.a(0);
            super.Z = var2;
        }
    }

    public final void c() {
        this.j();
        N = 0;
        this.A = false;
        this.B = false;
        super.p = 4;
        this.K = hso_ft.aa;
        super.l = hso_ft.W;
        if (super.l > 220) {
            super.l = 220;
        }

        super.m = this.K * 3 + d + hso_ft.aa - 5;
        if (!hso_ft.A) {
            super.m -= hso_bt.k;
        }

        hso_bt var1 = new hso_bt("Ok", 5);
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - hso_ft.aa - super.m / 2;
        hso_bt var2 = this.D;
        if (hso_ft.A) {
            var2.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
            this.C.a(var2);
            var1.a(super.n + super.l / 2, super.o + super.m - hso_bt.k + 7 - this.M, (hso_ce) null, var1.a);
            this.C.a(var1);
        } else {
            super.Z = var2;
            super.Y = var1;
        }
    }

    public final void f() {
        this.j();
        N = 0;
        this.A = false;
        this.B = false;
        super.p = 7;
        this.K = hso_ft.aa;
        super.l = hso_ft.W;
        if (super.l > 220) {
            super.l = 220;
        }

        super.m = this.K * 3 + d - 5 + hso_ft.aa;
        if (!hso_ft.A) {
            super.m -= hso_bt.k;
        }

        hso_bt var1 = new hso_bt("Ok", 9);
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - hso_ft.aa - super.m / 2;
        hso_bt var2 = this.D;
        if (hso_ft.A) {
            var2.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
            this.C.a(var2);
            var1.a(super.n + super.l / 2, super.o + super.m - hso_bt.k + 7 - this.M, (hso_ce) null, var1.a);
            this.C.a(var1);
        } else {
            super.Z = var2;
            super.Y = var1;
        }
    }

    public final void g() {
        this.j();
        N = 0;
        this.A = false;
        this.B = false;
        super.p = 13;
        this.K = hso_ft.aa;
        super.l = hso_ft.W;
        if (super.l > 180) {
            super.l = 180;
        }

        super.m = (this.K << 1) + d - 5 + hso_ft.aa;
        if (!hso_ft.A) {
            super.m -= hso_bt.k;
        }

        hso_bt var1 = new hso_bt("Ok", 11);
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - super.m / 2;
        hso_bt var2 = this.D;
        if (hso_ft.A) {
            var2.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
            this.C.a(var2);
            var1.a(super.n + super.l / 2, super.o + super.m - hso_bt.k + 7 - this.M, (hso_ce) null, var1.a);
            this.C.a(var1);
        } else {
            super.Z = var2;
            super.Y = var1;
        }
    }

    public final void a(String var1, hso_bt var2, int var3, int var4, int var5, int var6) {
        this.j();
        if (var2 == null) {
            hso_ft.r = null;
        }

        this.A = false;
        this.B = false;
        super.p = 5;
        super.l = var6;
        this.G = var2;
        this.C = new hso_es("MsgChat cmdlist");
        this.G.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2, (hso_ce) null, this.G.a);
        this.C.a(this.G);
        super.q = hso_o.j.a(var1, super.l - 4);
        super.m = hso_ft.ab * super.q.length;
        super.n = var3;
        super.o = var4;
        if (var5 == 5 || var5 == 3 || var5 == 4 || var5 == 6) {
            super.o += super.m;
        }

        if (var5 == 8) {
            super.n -= super.l;
        }

        this.Q = var5;
    }

    public final void a(String var1, hso_bt var2, boolean var3, String var4) {
        this.j();
        this.t = var4;
        this.A = false;
        this.B = false;
        super.p = 6;
        super.l = hso_ft.W - 30;
        if (super.l > 200) {
            super.l = 200;
        }

        this.C = new hso_es("MsgChat cmdlist4");
        this.C.a(var2);
        if (!hso_ft.A) {
            new hso_bt(hso_df.af, -1, this);
            Object var5 = null;
            super.Z = var2;
        }

        int var6 = this.C.c();
        if (super.l < var6 * hso_bt.j + (var6 - 1) * 10 + 10) {
            super.l = var6 * hso_bt.j + (var6 - 1) * 10 + 10;
        }

        if (super.l > hso_ft.W) {
            super.l = hso_ft.W;
        }

        super.q = hso_o.j.a(var1, super.l - 20);
        super.m = hso_ft.ab * (super.q.length + 1) + hso_bt.k + 20;
        if (super.m > hso_ft.X - hso_ft.aa) {
            super.m = hso_ft.X - hso_ft.aa;
            super.n = hso_ft.Y - super.l / 2;
            super.o = hso_ft.Z - super.m / 2;
            this.J = new hso_bp(super.n, super.o, super.l, super.m, 0, 0, hso_ft.ab * (super.q.length + 1) + hso_bt.k + 20 - super.m);
        } else {
            super.n = hso_ft.Y - super.l / 2;
            super.o = hso_ft.Z - super.m / 2;
            this.J = new hso_bp(super.n, super.o, super.l, super.m, 0, 0, 0);
        }

        this.a(hso_ft.A ? 4 : 0);
    }

    public final void h() {
        this.j();
        N = 0;
        this.A = false;
        this.B = false;
        super.p = 8;
        this.K = hso_ft.aa;
        super.l = b * 60;
        if (super.l > 220) {
            super.l = 220;
        }

        this.T = super.l / b;
        super.m = (this.K << 1) + hso_ft.aa;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - hso_ft.aa - super.m / 2;
        if (hso_ft.A) {
            this.D.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
            this.C.a(this.D);
        } else {
            hso_bt var1 = new hso_bt(hso_df.Y, 10);
            super.Y = var1;
            super.Z = this.D;
        }
    }

    public final void a(String var1, hso_j[] var2, String var3, byte var4, byte var5) {
        hso_c.E.d();
        this.j();
        this.A = false;
        this.B = false;
        this.V = var5;
        this.aU = var4;
        this.t = var1;
        this.aQ = var2;
        this.aN = 0;
        this.aO = 0;
        this.aS = 0;
        this.aT = 0;
        super.p = 11;
        super.l = hso_ft.W - 30;
        if (super.l > 240) {
            super.l = 240;
        }

        if (var3 != null) {
            super.q = this.U.a(var3, super.l - 20);
        } else {
            super.q = null;
        }

        this.C = new hso_es("MsgDiaLog cmdList3");
        super.m = d + 60;
        if (super.q != null) {
            super.m += super.q.length * hso_ft.ab;
        }

        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - super.m / 2;
        this.aR = 55;
        if (this.aR * (var2.length - 1) > super.l - 30) {
            this.aR = 30;
        }

        int var6 = 0;
        if (var2.length % 2 == 0) {
            var6 = this.aR / 2;
        }

        var6 += (var2.length - 1) / 2 * this.aR;
        this.aP = new int[this.aQ.length][2];

        for (int var7 = 0; var7 < this.aP.length; ++var7) {
            this.aP[var7][0] = super.n + super.l / 2 - var6 + var7 * this.aR;
            this.aP[var7][1] = super.o + super.m - hso_ft.aa - 45;
        }

    }

    public final void i() {
        this.t = hso_df.fe;
        h = 0;
        g = 20;
        this.j();
        this.A = false;
        this.B = false;
        super.p = 12;
        super.l = hso_ft.W - 30;
        if (super.l > 240) {
            super.l = 240;
        }

        aV = super.l / 4 * 3;
        aW = 16;
        this.C = new hso_es("MsgDiaLog cmdList4");
        super.q = this.U.a(hso_df.fB, super.l - 20);
        super.m = 30 + d;
        super.n = hso_ft.Y - super.l / 2;
        super.o = hso_ft.Z - super.m / 2;
    }

    public final void a(hso_ea var1, byte var2) {
        if (var2 != -1) {
            j = var2;
        }

        i = var1;
        this.t = var1.g;
        this.K = hso_ft.ab;
        this.j();
        this.A = false;
        this.B = false;
        super.p = 14;
        super.l = hso_ft.W - 30;
        aW = 8;
        if (super.l > 200) {
            super.l = 200;
        }

        aV = super.l / 2;
        this.H = new hso_bt(hso_df.fI, 16, this);
        this.C = new hso_es("MsgDiaLog cmdList");
        this.C.a(this.H);
        int var3;
        if ((var3 = (7 + var1.k.length) * hso_ft.ab + d + 10) > hso_ft.X - (hso_ft.aa << 1)) {
            super.m = hso_ft.X - (hso_ft.aa << 1);
            super.n = hso_ft.Y - super.l / 2;
            super.o = hso_ft.Z - super.m / 2;
            this.J = new hso_bp(super.n, super.o, super.l, super.m, 0, 0, var3 - super.m);
        } else {
            super.m = var3;
            super.n = hso_ft.Y - super.l / 2;
            super.o = hso_ft.Z - super.m / 2;
            this.J = new hso_bp(super.n, super.o, super.l, super.m, 0, 0, 0);
        }

        if (hso_ft.A) {
            this.a(4);
        }

        this.C.a(this.D);
        if (hso_ft.A) {
            this.D.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
        } else {
            this.a(0);
        }
    }

    private void a(int var1) {
        this.y = 0;
        if (this.C.c() > 0) {
            int var2;
            if ((var2 = this.C.c()) == 1) {
                this.aX = super.n + super.l / 2;
                this.aY = 0;
            } else {
                boolean var10001 = true;
                this.aY = 10;
                this.aX = super.n + super.l / 2 - this.aY / 2 - hso_bt.j / 2;
            }

            for (int var3 = 0; var3 < var2; ++var3) {
                hso_bt var4;
                (var4 = (hso_bt) this.C.a(var3)).g = false;
                if (var2 == 3 && var3 == 2) {
                    var4.a(super.n + super.l / 2, super.o + super.m - hso_bt.k - (var2 - 1) / 2 * (hso_bt.k + 5) + 7 - this.M + var3 / 2 * (hso_bt.k + 5) - (this.B ? 4 : 0) + var1, (hso_ce) null, var4.a);
                } else {
                    var4.a(this.aX + var3 % 2 * (hso_bt.j + this.aY), super.o + super.m - hso_bt.k - (var2 - 1) / 2 * (hso_bt.k + 5) + 7 - this.M + var3 / 2 * (hso_bt.k + 5) - (this.B ? 4 : 0) + var1, (hso_ce) null, var4.a);
                }

                if (var3 == 0) {
                    var4.g = true;
                }
            }
        }

    }

    public final void a(mGraphics var1) {
        int var3;
        hso_ft.a(var1);
        int var2;
        int var4;
        int var5;
        boolean var8;
        label358:
        switch (super.p) {
            case 0:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, (int) 12);

                for (var3 = 0; var3 < super.q.length; ++var3) {
                    this.U.a(var1, super.q[var3], hso_ft.W / 2, super.o + 12 + var3 * 15, 2, true);
                }

                if (this.A) {
                    c.b(this.u % c.c, hso_ft.Y, super.o + 25 + super.q.length * 15, 0, 3, var1);
                }
                break;
            case 1:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, true, (byte) 0);
                if (hso_ft.B) {
                    hso_fl.c(var1, hso_ft.Y - 32, super.o + 11, 64, 14, 2);
                } else {
                    for (var3 = 0; var3 < 2; ++var3) {
                        var1.a(hso_fl.aP[2], 0, 0, 32, 14, 0, hso_ft.Y - 32 + (var3 << 5), super.o + 11, 0);
                    }
                }

                hso_o.f.a(var1, hso_df.at, hso_ft.Y, super.o + 12, 2, false);
                hso_o.c.a(var1, this.r, super.n + 10, super.o + 27, 0, true);
                var1.d(super.n + 3, super.o + 39, super.l - 6, super.m - 55 - hso_bt.k * this.W);
                var1.a(0, -this.I.b);

                for (var3 = 0; var3 < super.q.length; ++var3) {
                    hso_o.i.a(var1, super.q[var3], super.n + 11, super.o + 27 + (var3 + 1) * hso_ft.ab, 0, true);
                }

                if (!hso_ft.A) {
                    this.d(var1);
                }
                break;
            case 2:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, hso_df.aS);
                var2 = super.o + hso_ft.aa + 3;
                var8 = false;
                if (Player.N == null) {
                    hso_o.i.a(var1, hso_df.aT, super.n + super.l / 2, var2, 2, true);
                } else {
                    if (!hso_ft.A || N > 0) {
                        var1.a(-4873075);
                        var1.c(super.n + 9, var2 - 2 + this.x * this.K, super.l - 17, this.K - 1);
                    }

                    if (Player.N != null) {
                        for (var4 = 0; var4 < Player.N.b.c(); ++var4) {
                            hso_aj var9;
                            if ((var9 = (hso_aj) Player.N.b.a(var4)).b.compareTo(Player.N.a) == 0) {
                                hso_cg.a(var1, var9.b + " " + hso_df.ah + var9.a, super.n + 11, var2, 0, (byte) 7, (byte) 0);
                            } else {
                                hso_o.f.a(var1, var9.b + " " + hso_df.ah + var9.a, super.n + 11, var2, 0, true);
                            }

                            if (var9.b.compareTo(GameScreen.f.cB) == 0) {
                                var9.g = GameScreen.f.br;
                                var9.h = GameScreen.f.bs;
                            }

                            var1.a(0);
                            var1.c(super.n + 11, var2 + 14 - 2, 42, 4);
                            var1.a(-8714722);
                            var1.c(super.n + 12, var2 + 15 - 2, 40, 2);
                            var1.a(-579511);
                            var1.c(super.n + 12, var2 + 15 - 2, 40 * var9.g / var9.h, 2);
                            String var11 = "map";
                            if (hso_ck.a != null && var9.f < hso_ck.a.length) {
                                var11 = hso_ck.a[var9.f];
                            }

                            hso_o.j.a(var1, var11 + " - " + hso_df.cC + (var9.c + 1), super.n + 11, var2 + 20 - 4, 0, true);
                            var2 += this.K;
                            if (var4 < Player.N.b.c() - 1) {
                                var1.a(hso_cg.aL[4]);
                                var1.c(super.n + 12, var2 - 3, super.l - 24, 1);
                            }
                        }
                    }
                }

                super.a(var1);
            case 3:
            default:
                break;
            case 4:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, hso_df.cI);
                var4 = super.o + this.K + 11;
                var3 = super.n + 30 - (hso_ft.A ? 10 : 0);
                var1.a(hso_fl.bf[0]);

                for (var5 = 0; var5 < hso_df.gr.length; ++var5) {
                    hso_o.j.a(var1, hso_df.gr[var5], var3, var4, 0, true);
                    var2 = hso_o.i.a(hso_df.gr[0]);
                    var1.c(var3 + var2, var4 - 3, 35, 18);
                    hso_o.j.a(var1, "  " + e[var5] + "%", var3 + 3 + var2, var4, 0, true);
                    var4 += this.K;
                }

                hso_o.j.a(var1, hso_df.gs[P], var3, var4, 0, true);
                if (!hso_ft.A) {
                    var1.a(hso_cg.ak, 0, 0, 12, 16, 4, var3 - 4 + hso_ft.ai % 3, super.o + this.K + 17 + this.x * this.K, 10);
                }

                hso_ft.a(var1);
                this.c(var1);
                break;
            case 5:
                MainHelp.a(var1, super.n, super.o, super.l, super.m, this.Q, super.q);
                break;
            case 6:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, this.t);
                var1.d(super.n, super.o + hso_ft.aa + 2, super.l, super.m - hso_ft.aa - hso_bt.k - 8);
                var1.a(0, -this.J.f);

                for (var5 = 0; var5 < super.q.length; ++var5) {
                    hso_o.j.a(var1, super.q[var5], super.n + 8, super.o + hso_ft.aa + 2 + var5 * hso_ft.ab, 0, true);
                }

                if (!hso_ft.A) {
                    this.d(var1);
                }
                break;
            case 7:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, hso_df.cI);
                var5 = super.o + this.K + 11;
                var2 = super.n + 30 - (hso_ft.A ? 10 : 0);
                var1.a(hso_fl.bf[3]);

                for (var3 = 0; var3 < hso_df.gu.length; ++var3) {
                    hso_o.f.a(var1, hso_df.gu[var3], var2, var5, 0, true);
                    var4 = hso_o.f.a(hso_df.gu[var3]);
                    hso_o.j.a(var1, "< " + hso_df.gI[var3][this.R[var3]] + " >", var2 + 3 + var4, var5, 0, true);
                    var5 += this.K;
                }

                if (!hso_ft.A) {
                    var1.a(hso_cg.ak, 0, 0, 12, 16, 4, var2 - 4 + hso_ft.ai % 3, super.o + this.K + 17 + this.x * this.K, 10);
                }

                hso_ft.a(var1);
                this.c(var1);
                break;
            case 8:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, hso_df.cI);
                var3 = super.o + hso_ft.aa + this.K;
                var4 = super.n + this.T / 2;
                if (!hso_ft.A) {
                    var1.a(-1054968);
                    var1.c(var4 - 12 + this.x * this.T, var3 - 12, 24, 24);
                }

                for (var5 = 0; var5 < b; ++var5) {
                    ((hso_ev) hso_y.a.a(f[var5][2])).a(var1, var4, var3, 3);
                    if (f[var5][1] == 0) {
                        var1.a(hso_cg.am, 0, 0, 20, 20, 0, var4, var3, 3);
                    }

                    var4 += this.T;
                }

                hso_ft.a(var1);
                this.c(var1);
                break;
            case 9:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, (int) 12);
                var5 = 0;

                while (true) {
                    if (var5 >= super.q.length) {
                        break label358;
                    }

                    if (var5 == super.q.length - 1) {
                        this.U.a(var1, super.q[var5] + " " + (this.X > 0 ? String.valueOf(this.X) : "") + "'.", hso_ft.W / 2, super.o + 12 + var5 * 15, 2, true);
                    } else {
                        this.U.a(var1, super.q[var5], hso_ft.W / 2, super.o + 12 + var5 * 15, 2, true);
                    }

                    ++var5;
                }
            case 10:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, this.t);
                if (this.aN < 2) {
                    for (var5 = 0; var5 < this.aP.length; ++var5) {
                        var1.a(hso_cg.ap, this.aP[var5][0], this.aP[var5][1], 3);
                    }

                    if (this.aN == 0) {
                    }
                } else if (this.aN == 2) {
                    for (var5 = 0; var5 < super.q.length; ++var5) {
                        hso_o.j.a(var1, super.q[var5], super.n + 8, super.o + hso_ft.aa + 2 + var5 * hso_ft.ab, 0, true);
                    }

                    var5 = this.aP.length - 1;
                    var1.a(hso_cg.ap, this.aP[var5][0], this.aP[var5][1], 3);
                }

                var5 = 0;

                while (true) {
                    if (var5 >= hso_c.E.c()) {
                        break label358;
                    }

                    ((hso_dx) hso_c.E.a(var5)).a(var1);
                    ++var5;
                }
            case 11:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, this.t);
                if (super.q != null) {
                    for (var5 = 0; var5 < super.q.length; ++var5) {
                        hso_o.j.a(var1, super.q[var5], super.n + 8, super.o + hso_ft.aa + 2 + var5 * hso_ft.ab, 0, true);
                    }
                }

                for (var5 = 0; var5 < this.aP.length; ++var5) {
                    if (this.aS == -1 || var5 <= this.aS) {
                        var1.a(hso_cg.ap, this.aP[var5][0], this.aP[var5][1], 3);
                    }
                }

                for (var5 = 0; var5 < this.aQ.length; ++var5) {
                    if (this.aQ[var5].x != 0) {
                        this.aQ[var5].a(var1, this.aP[var5][0], this.aP[var5][1], 21, 1, 0);
                        if (this.V == 0) {
                            if (this.aQ[var5].u == 3) {
                                hso_fl.b(this.aQ[var5].N).a(var1, this.aQ[var5].g, this.aP[var5][0], this.aP[var5][1] + 14, 2, true);
                            }
                        } else if (var5 == 1) {
                            hso_fl.b(this.aQ[var5].N).a(var1, this.aQ[var5].g, this.aP[var5][0], this.aP[var5][1] + 14, 2, true);
                        }
                    }
                }

                var5 = 0;

                while (true) {
                    if (var5 >= hso_c.E.c()) {
                        break label358;
                    }

                    ((hso_dx) hso_c.E.a(var5)).a(var1);
                    ++var5;
                }
            case 12:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, this.t);

                for (var5 = 0; var5 < super.q.length; ++var5) {
                    hso_o.j.a(var1, super.q[var5], super.n + 8, super.o + hso_ft.aa + 4 + var5 * hso_ft.ab, 0, true);
                }

                var5 = super.n + super.l / 2 - aV / 2;
                int var6 = aW - 10;
                var2 = super.o + super.m - var6 - 25 - 5;
                var1.a(2698542);
                var1.c(var5 - 4, var2 + 15, aV + 2, var6);
                var1.c(var5 - 4 + 1, var2 + 14, aV, 1);
                var1.c(var5 - 4 + 1, var2 + 15 + var6, aV, 1);
                var1.a(3027507);
                var1.c(var5 - 4 + 1, var2 + 15, aV, var6);
                var8 = false;
                if (g > 0 && h > 0) {
                    if ((var3 = h * aV / g) <= 0) {
                        var3 = 1;
                    } else if (var3 > aV) {
                        var3 = aV;
                    }

                    var1.a(-6437568);
                    var1.c(var5 - 4 + 1, var2 + 15, var3, var6);
                }

                var3 = h * 100 / g;
                hso_o.f.a(var1, var3 + "%", super.n + super.l / 2, var2, 2, true);
                break;
            case 13:
                hso_cg.a(var1, super.n, super.o, super.l, super.m, hso_df.fF);
                var2 = super.o + this.K + 11;
                var3 = super.n + 30 - (hso_ft.A ? 10 : 0);
                var1.a(hso_fl.bf[3]);

                for (var4 = 0; var4 < hso_df.gx.length; ++var4) {
                    hso_o.f.a(var1, hso_df.gx[var4], var3, var2, 0, true);
                    var5 = hso_o.f.a(hso_df.gx[var4]);
//                    hso_o.j.a(var1, "< debug >", var3 + 3 + var5, var2, 0, true);// debug
//                     hso_o.j.a(var1,  "< " + (!((Object[]) null)[var4] ? hso_df.cv : hso_df.cw) + " >", var3 + 3 + var5, var2, 0, true);
                    hso_o.j.a(var1, "< " + ((S[var3] != 0) ? hso_df.cv : hso_df.cw) + " >", var3 + 3 + var5, var2, 0, true);

                    var2 += this.K;
                }

                if (!hso_ft.A) {
                    var1.a(hso_cg.ak, 0, 0, 12, 16, 4, var3 - 4 + hso_ft.ai % 3, super.o + this.K + 17 + this.x * this.K, 10);
                }

                hso_ft.a(var1);
                this.c(var1);
                break;
            case 14:
                if (i == null) {
                    return;
                }

                hso_cg.a(var1, super.n, super.o, super.l, super.m, this.t);
                var4 = super.o + (this.K << 1);
                var5 = super.n + 10;
                var1.d(super.n, super.o + hso_ft.aa + 2, super.l, super.m - hso_ft.aa - hso_bt.k - 8);
                var1.a(0, -this.J.f);
                i.b(var1, var5 + hso_fl.aM / 2, var4 + hso_fl.aM / 2 + hso_fl.aM / 4, hso_fl.aM / 2, 1);
                hso_o.j.a(var1, hso_df.ac + i.S + " + " + i.ap / 10 + "," + i.ap % 10 + "%", var5 + 40, var4, 0, true);
                var4 += hso_ft.ab;
                var2 = i.aq / 24;
                var3 = i.aq % 24;
                hso_o.j.a(var1, hso_df.fH + var2 + "d " + var3 + "h", var5 + 40, var4, 0, true);
                var4 += hso_ft.ab;
                hso_fl.a(hso_bw.e[i.au.a]).a(var1, hso_bw.d[i.au.a] + ": " + i.au.b + "-" + i.au.c, var5 + 40, var4, 0, true);
                var4 += this.K;
                hso_o.j.a(var1, hso_df.fI, var5 + 8, var4, 0, true);
                b(var1, i.ar, var5 + 65, var4 + 1, i.as);
                var4 += this.K;

                for (var2 = 0; var2 < hso_df.gz.length; ++var2) {
                    hso_o.j.a(var1, hso_df.gz[var2], var5 + 8, var4, 0, true);
                    b(var1, i.av[var2], var5 + 65, var4 + 1, i.at);
                    var4 += this.K;
                }

                for (var2 = 0; var2 < i.j.length; ++var2) {
                    if (i.j[var2].a > 6) {
                        String var7 = hso_bw.d[i.j[var2].a] + ": " + hso_bw.a(hso_bw.f[i.j[var2].a], (int) i.j[var2].b);
                        hso_fl.a(hso_bw.e[i.j[var2].a]).a(var1, var7, var5 + 8, var4, 0, true);
                        var4 += this.K;
                    }
                }

                hso_ft.a(var1);
                this.c(var1);
        }

        hso_ft.a(var1);
        if (this.C != null) {
            for (var3 = 0; var3 < this.C.c(); ++var3) {
                hso_bt var10;
                (var10 = (hso_bt) this.C.a(var3)).a(var1, var10.h, var10.i);
            }
        }

    }

    private static void b(mGraphics var0, int var1, int var2, int var3, int var4) {
        var0.a(-14078674);
        var0.c(var2 - 4, var3 + 1, aV + 2, aW);
        var0.c(var2 - 4 + 1, var3, aV, 1);
        var0.c(var2 - 4 + 1, var3 + 1 + aW, aV, 1);
        var0.a(-13749709);
        var0.c(var2 - 4 + 1, var3 + 1, aV, aW);
        boolean var5 = false;
        if (var1 * 100 / var4 > 0) {
            int var6;
            if ((var6 = var1 * 100 / var4 * aV / 100) <= 0) {
                var6 = 1;
            } else if (var6 > aV) {
                var6 = aV;
            }

            var0.a(-6437568);
            var0.c(var2 - 4 + 1, var3 + 1, var6, aW);
        }

        hso_o.f.a(var0, String.valueOf(var1), var2 + aV / 2, var3, 2, true);
    }

    public final void a() {
        if (this.A) {
            ++this.u;
            if (this.u > 1200) {
                if (ISession.a().b() && hso_ft.a != hso_ft.b && hso_ft.a != hso_ft.d) {
                    hso_ft.a(hso_df.bX);
                } else {
                    hso_es var1 = new hso_es("MsgDiaLog vec");
                    if (hso_x.f && hso_ft.a != hso_ft.b) {
                        var1.a(new hso_bt(hso_df.cL, 0));
                    }

                    var1.a(new hso_bt(hso_df.bR, 6));
                    hso_ft.a(hso_df.ck, var1);
                    hso_bv.a = true;
                    hso_bv.b = hso_dw.a() + 30000L;
                }
            }
        }

        if (super.p == 6 || super.p == 14) {
            this.J.c();
        }

        if (hso_bv.a && hso_bv.b - hso_dw.a() <= 0L) {
            hso_bv.a = true;
            hso_bv.b = hso_dw.a() + 30000L;
            if (hso_ft.a.f()) {
                if (hso_x.f) {
                    hso_ft.b.c();
                    if (ak.a("user_pass") != null) {
                        try {
                            hso_bs.i();
                        } catch (Exception var9) {
                            var9.printStackTrace();
                        }

                        hso_ft.o();
                        Service.a().a(hso_bs.f.j(), hso_bs.g.j(), hso_k.a, "0", "0", "0", hso_x.b, hso_cs.u);
                        k = true;
                        GameScreen.f.n_();
                        if (hso_ck.a == null || hso_dr.b == null) {
                            Service.a().g((byte) 61);
                        }

                        l();
                    } else {
                        hso_ft.b.c();
                        l();
                    }
                }
            } else if (ak.a("user_pass") != null) {
                try {
                    hso_bs.i();
                } catch (Exception var9) {
                    var9.printStackTrace();
                }

                hso_ft.o();
                Service.a().a(hso_bs.f.j(), hso_bs.g.j(), hso_k.a, "0", "0", "0", hso_x.b, hso_cs.u);
                k = true;
                GameScreen.f.n_();
                if (hso_ck.a == null || hso_dr.b == null) {
                    Service.a().g((byte) 61);
                }

                l();
            } else {
                hso_ft.b.c();
                l();
            }

            hso_ft.a(hso_df.bS, new hso_bt(hso_df.Z, 7));
            hso_ft.N = hso_dw.a();
        }

        this.d();
        this.e();
        if (super.p == 2) {
            hso_bt var7;
            if (Player.N == null) {
                this.C.d();
                var7 = this.D;
                if (hso_ft.A) {
                    var7.a(super.n + super.l - 6, super.o + 4, hso_cf.t, "");
                    this.C.a(var7);
                    return;
                }

                super.Z = var7;
                return;
            }

            if (Player.N.b.c() != a || a == -1) {
                a = Player.N.b.c();
                super.m = this.K * a + d - 10 + hso_ft.aa;
                super.o = hso_ft.Z - hso_ft.aa - super.m / 2 + (hso_ft.A ? hso_ft.aa : 0);
                this.C.d();
                var7 = new hso_bt(hso_df.ai, 4);
                this.F = new hso_bt(hso_df.aU, 8);
                if (GameScreen.f.cB.compareTo(Player.N.a) == 0) {
                    this.F.a = hso_df.cW;
                }

                hso_bt var6 = this.D;
                if (hso_ft.A) {
                    this.C.a(this.F);
                    this.a(4);
                    var6.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
                    this.C.a(var6);
                } else {
                    this.C.a(this.F);
                    this.C.a(var7);
                    this.a(4);
                    super.Z = var6;
                }
            }

            if (N > 0) {
                --N;
                return;
            }
        } else {
            if (super.p == 3 || super.p == 6 || super.p == 14) {
                this.I.a();
                return;
            }

            if (super.p == 9) {
                if ((hso_ft.aj - this.aM) / 1000L > 1L) {
                    this.aM += 1000L;
                    --this.X;
                    if (this.X <= 0) {
                        this.D.a();
                        return;
                    }
                }
            } else {
                hso_dx var2;
                int var5;
                if (super.p == 10) {
                    ++this.aO;
                    if (this.aN == 0) {
                        if (this.aO == 30) {
                            this.aO = 0;
                            this.aN = 1;
                        }
                    } else if (this.aN == 1) {
                        if (this.aO == 1) {
                            for (var5 = 0; var5 < this.aP.length - 1; ++var5) {
                                hso_c.a(41, this.aP[var5][0], this.aP[var5][1], this.aP[this.aP.length - 1][0], this.aP[this.aP.length - 1][1], 1);
                            }
                        }

                        if (this.aO >= 16) {
                            this.aN = 2;
                            this.aO = 0;
                            this.C.a(this.D);
                            this.a(0);
                            hso_c.a(33, this.aP[this.aP.length - 1][0], this.aP[this.aP.length - 1][1]);
                            hso_c.a(34, this.aP[this.aP.length - 1][0], this.aP[this.aP.length - 1][1]);
                        }
                    }

                    for (var5 = 0; var5 < hso_c.E.c(); ++var5) {
                        (var2 = (hso_dx) hso_c.E.a(var5)).a();
                        if (var2.y) {
                            hso_c.E.d(var2);
                        }
                    }

                    return;
                }

                if (super.p == 11) {
                    ++this.aO;
                    if (this.aN == 0) {
                        if (this.aS >= 0 && this.aO % 5 == 1) {
                            hso_c.a(34, this.aP[this.aS][0], this.aP[this.aS][1]);
                            if (this.aS < this.aQ.length - 1) {
                                ++this.aS;
                            } else {
                                this.aS = -1;
                            }
                        }

                        if (this.aO > 5 && this.aO % 5 == 1) {
                            if (this.aU == 0) {
                                hso_c.a(33, this.aP[this.aT][0], this.aP[this.aT][1]);
                            }

                            this.aQ[this.aT].x = 1;
                            if (this.aT < this.aQ.length - 1) {
                                ++this.aT;
                            } else {
                                this.aT = -1;
                                this.aS = -1;
                                this.aO = 0;
                                this.aN = 1;
                                this.C.a(this.D);
                                this.a(0);
                            }
                        }
                    }

                    for (var5 = 0; var5 < hso_c.E.c(); ++var5) {
                        (var2 = (hso_dx) hso_c.E.a(var5)).a();
                        if (var2.y) {
                            hso_c.E.d(var2);
                        }
                    }

                    return;
                }

                if (super.p == 12) {
                    if (ISession.a().b()) {
                        if (h >= g && hso_ft.ai % 40 == 20) {
                            hso_ft.a(hso_df.fC);
                            return;
                        }
                    } else {
                        hso_ft.b(hso_df.ck, new hso_bt(hso_df.bR, -1));
                    }
                }
            }
        }

    }

    public final void d() {
        if (super.p == 1) {
            this.I.a();
            hso_aw var10000;
            if (hso_ft.al[2]) {
                var10000 = this.I;
                var10000.d -= hso_ft.ab;
                if (this.I.d < 0) {
                    this.I.d = 0;
                }

                hso_ft.d(2);
            } else if (hso_ft.al[8]) {
                var10000 = this.I;
                var10000.d += hso_ft.ab;
                if (this.I.d > this.I.f) {
                    this.I.d = this.I.f;
                }

                hso_ft.d(8);
            }
        } else if (super.p == 2) {
            if (Player.N != null) {
                if (hso_ft.al[2]) {
                    --this.x;
                    hso_ft.d(2);
                } else if (hso_ft.al[8]) {
                    ++this.x;
                    hso_ft.d(8);
                }

                this.x = hso_cg.a(this.x, Player.N.b.c() - 1, true);
            } else {
                super.Y = null;
            }
        } else if (super.p != 6 && super.p != 14) {
            switch (super.p) {
                case 4:
                    if (hso_ft.al[2]) {
                        --this.x;
                        hso_ft.d(2);
                    } else if (hso_ft.al[8]) {
                        ++this.x;
                        hso_ft.d(8);
                    }
                    this.x = hso_cg.a(this.x, 2, true);
                    int[] var6;
                    if (hso_ft.al[4]) {
                        switch (this.x) {
                            case 0:
                                if (e[0] > 10) {
                                    var6 = e;
                                    var6[0] -= 10;
                                }
                                break;
                            case 1:
                                if (e[1] > 10) {
                                    var6 = e;
                                    var6[1] -= 10;
                                }
                                break;
                            case 2:
                                if (P == 1) {
                                    P = 0;
                                }
                        }

                        hso_ft.d(4);
                    } else if (hso_ft.al[6]) {
                        switch (this.x) {
                            case 0:
                                if (e[0] < 90) {
                                    var6 = e;
                                    var6[0] += 10;
                                }
                                break;
                            case 1:
                                if (e[1] < 90) {
                                    var6 = e;
                                    var6[1] += 10;
                                }
                                break;
                            case 2:
                                if (P == 0) {
                                    P = 1;
                                }
                        }

                        hso_ft.d(6);
                    }
                    break;
                case 7:
                    if (hso_ft.al[2]) {
                        --this.x;
                        hso_ft.d(2);
                    } else if (hso_ft.al[8]) {
                        ++this.x;
                        hso_ft.d(8);
                    }
                    this.x = hso_cg.a(this.x, 2, true);
                    if (hso_ft.al[4]) {
                        if (this.R[this.x] == 0) {
                            this.R[this.x] = (byte) (hso_df.gI[this.x].length - 1);
                        } else {
                            --this.R[this.x];
                        }

                        hso_ft.d(4);
                    } else if (hso_ft.al[6]) {
                        if (this.R[this.x] == (byte) (hso_df.gI[this.x].length - 1)) {
                            this.R[this.x] = 0;
                        } else {
                            ++this.R[this.x];
                        }

                        hso_ft.d(6);
                    }
                    break;
                case 13:
                    if (hso_ft.al[2]) {
                        --this.x;
                        hso_ft.d(2);
                    } else if (hso_ft.al[8]) {
                        ++this.x;
                        hso_ft.d(8);
                    }
                    this.x = hso_cg.a(this.x, 1, true);
                    if (hso_ft.al[4]) {
                        if (this.R[this.x] == 0) {
                            this.R[this.x] = 1;
                        } else {
                            --this.R[this.x];
                        }

                        hso_ft.d(4);
                    } else if (hso_ft.al[6]) {
                        if (this.R[this.x] == 1) {
                            this.R[this.x] = 0;
                        } else {
                            ++this.R[this.x];
                        }

                        hso_ft.d(6);
                    }
                    break;
                case 8:
                    if (hso_ft.al[4]) {
                        --this.x;
                        hso_ft.d(4);
                    } else if (hso_ft.al[6]) {
                        ++this.x;
                        hso_ft.d(6);
                    }
                    this.x = hso_cg.a(this.x, b - 1, true);
                    break;
                default:
                    break;
            }
        } else {
            hso_bp var5;
            if (hso_ft.al[2]) {
                var5 = this.J;
                var5.e -= hso_ft.ab;
                hso_ft.d(2);
            } else if (hso_ft.al[8]) {
                var5 = this.J;
                var5.e += hso_ft.ab;
                hso_ft.d(8);
            }

            if (this.J.e > this.J.g) {
                this.J.e = this.J.g;
            }

            if (this.J.e < 0) {
                this.J.e = 0;
            }
        }

        if (this.C != null) {
            int var1 = this.C.c();
            if (!hso_ft.A && var1 > 0) {
                int var2 = this.y;
                if (hso_ft.al[4]) {
                    --this.y;
                    hso_ft.d(4);
                } else if (hso_ft.al[6]) {
                    ++this.y;
                    hso_ft.d(6);
                }

                this.y = hso_cg.a(this.y, var1 - 1, false);
                if (this.w == 2 && (hso_bt) this.C.a(this.y) == this.D) {
                    this.y = 0;
                }

                if (var2 != this.y) {
                    for (int var3 = 0; var3 < var1; ++var3) {
                        hso_bt var4 = (hso_bt) this.C.a(var3);
                        if (var3 == this.y) {
                            var4.g = true;
                        } else {
                            var4.g = false;
                        }
                    }
                }
            }
        }

        if (hso_ft.al[5]) {
            hso_ft.d(5);
            if (this.C != null && this.y < this.C.c()) {
                ((hso_bt) this.C.a(this.y)).a();
            }
        }

        super.d();
    }

    public final void e() {
        int var1;
        if (super.p == 2) {
            if (Player.N != null && hso_ft.b(super.n, super.o + hso_ft.aa, super.l, super.m - hso_ft.aa) && (var1 = (hso_ft.af - (super.o + hso_ft.aa)) / this.K) >= 0 && var1 <= Player.N.b.c() - 1) {
                this.x = var1;
                this.x = hso_cg.a(this.x, Player.N.b.c() - 1, false);
                N = 3;
                this.k();
                hso_ft.S = false;
            }
        } else {
            int var2;
            if (super.p == 4) {
                var1 = super.o + this.K + 11;
                int[] var10000;
                if (hso_ft.b(var2 = super.n + 30 - (hso_ft.A ? 10 : 0) + hso_o.i.a(hso_df.gr[0]), var1 - 5, 40, 20)) {
                    if (e[0] < 90) {
                        var10000 = e;
                        var10000[0] += 10;
                    } else {
                        e[0] = 10;
                    }

                    hso_ft.S = false;
                } else if (hso_ft.b(var2, var1 + this.K - 5, 40, 20)) {
                    if (e[1] < 90) {
                        var10000 = e;
                        var10000[1] += 10;
                    } else {
                        e[1] = 10;
                    }

                    hso_ft.S = false;
                } else if (hso_ft.b(super.n + 30 - (hso_ft.A ? 10 : 0), var1 + (this.K << 1), 120, 20)) {
                    if (P == 0) {
                        P = 1;
                    } else {
                        P = 0;
                    }

                    hso_ft.S = false;
                }
            } else if (super.p == 7) {
                var1 = super.o + this.K + 11;
                if (hso_ft.b(var2 = super.n, var1 - 4, super.l, 20)) {
                    if (this.R[0] == (byte) (hso_df.gI[0].length - 1)) {
                        this.R[0] = 0;
                    } else {
                        ++this.R[0];
                    }

                    hso_ft.S = false;
                } else if (hso_ft.b(var2, var1 + this.K - 4, super.l, 20)) {
                    if (this.R[1] == (byte) (hso_df.gI[1].length - 1)) {
                        this.R[1] = 0;
                    } else {
                        ++this.R[1];
                    }
                    hso_ft.S = false;
                } else if (hso_ft.b(var2, var1 + (this.K << 1), super.l, 20)) {
                    if (this.R[2] == (byte) (hso_df.gI[2].length - 1)) {
                        this.R[2] = 0;
                    } else {
                        ++this.R[2];
                    }

                    hso_ft.S = false;
                }
            } else if (super.p == 13) {
                var1 = super.o + this.K + 11;
                if (hso_ft.b(var2 = super.n, var1 - 4, super.l, 20)) {
                    if (S[0] == 1) {
                        S[0] = 0;
                    } else {
                        S[0]++;
                    }
                    hso_ft.S = false;
                } else if (hso_ft.b(var2, var1 + this.K - 4, super.l, 20)) {
                    if (S[1] == 1) {
                        S[1] = 0;
                    } else {
                        S[1]++;
                    }
                    hso_ft.S = false;
                }
            } else if (super.p != 6 && super.p != 14) {
                if (super.p == 8) {
                    var1 = super.o + hso_ft.aa + this.K;
                    var2 = super.n + this.T / 2;

                    for (int var3 = 0; var3 < b; ++var3) {
                        if (hso_ft.b(var2 + var3 * this.T - 20, var1 - 20, 40, 40)) {
                            hso_ft.S = false;
                            b(var3);
                            break;
                        }
                    }
                } else if (super.p == 5 && hso_ft.b(0, 0, hso_ft.W, hso_ft.X)) {
                    this.G.a();
                    hso_ft.S = false;
                }
            } else {
                this.J.a();
            }
        }

        if (this.C != null) {
            for (var1 = 0; var1 < this.C.c(); ++var1) {
                ((hso_bt) this.C.a(var1)).b();
            }
        }

    }

    private void k() {
        if (Player.N != null) {
            hso_aj var1;
            if ((var1 = (hso_aj) Player.N.b.a(this.x)).b.compareTo(GameScreen.f.cB) != 0) {
                hso_es var2 = new hso_es("MsgDiaLog menu");
                hso_bt var3 = new hso_bt(hso_df.aW, 9, this);
                var2.a(var3);
                var3 = new hso_bt(hso_df.bL, 14, this);
                var2.a(var3);
                if (GameScreen.f.cB.compareTo(Player.N.a) == 0) {
                    String var5;
                    if ((var5 = var1.b).length() > 8) {
                        var5 = var5.substring(0, 7) + "...";
                    }

                    hso_bt var4 = new hso_bt(hso_df.bl + var5 + " " + hso_df.aU, 6, this);
                    var2.a(var4);
                }

                hso_ft.o.a(var2, 2, var1.b, false, (hso_es) null);
            }
        }
    }

    private static void l() {
        if (hso_ft.r != null) {
            hso_ft.r = null;
        } else {
            hso_ft.s = null;
        }
    }

    private static void b(int var0) {
        if (f[var0][1] == 0) {
            if (Player.I[f[var0][0]] > 0) {
                f[var0][1] = 1;
                Player.p = 1;
            } else {
                hso_ft.a(hso_df.bk);
            }
        } else {
            f[var0][1] = 0;
            Player.p = 0;

            for (var0 = 0; var0 < f.length; ++var0) {
                if (f[var0][1] == 1) {
                    Player.p = 1;
                    break;
                }
            }
        }

        hso_co.b();
    }
}
