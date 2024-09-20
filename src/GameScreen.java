
/**
 *
 * @param cn
 */
public final class GameScreen extends hso_p {

    public static int a = -32059;
    public static short[] b;
    public static Player f = new Player(0, (byte) 0, "unname", 0, 0);
    public static hso_s g = null;
    public static MainObject h = null;
    private static hso_es ba = new hso_es("GameScr VecNum");
    public static hso_es i = new hso_es("GameScr Vecplayers");
    public static hso_es j = new hso_es("GameScr VecInfoServer");
    public static hso_es k = new hso_es("GameScr menu");
    private static hso_es bb = new hso_es("GameScr vecEffInMap");
    public static hso_es l = new hso_es("GameScr vecStep");
    public static hso_ek m = new hso_ek();
    public static hso_ek n = new hso_ek();
    public static hso_es o = new hso_es("GameScr vecWeather");
    public static MainHelp p = new MainHelp();
    public static hso_cf q = new hso_cf();
    public hso_bt r;
    public hso_bt s;
    public hso_bt t;
    public hso_bt u;
    public hso_bt v;
    public hso_bt w;
    private hso_bt bc;
    private hso_bt bd;
    public hso_bt x;
    public hso_bt y;
    public hso_bt z;
    private hso_bt be;
    public hso_bt A;
    private hso_bt bf;
    public hso_bt B;
    public hso_bt C;
    public hso_bt D;
    private hso_bt bg;
    private hso_bt bh;
    public hso_bt E;
    private hso_bt bi;
    private hso_bt bj;
    public hso_bt F;
    public hso_bt G;
    public hso_bt H;
    public hso_bt I;
    public hso_bt J;
    private static long bk;
    public static byte K = 0;
    public static boolean L = false;
    public static boolean M = false;
    public static int N;
    public static int O;
    public static int P;
    public static int Q;
    public static int R;
    private static int bl = 0;
    public static String S = "";
    public static long T = 0L;
    public static long U = -1L;
    public static hso_es V = new hso_es("Hight EffectAuto");
    public static boolean W = false;
    private static hso_es bm = new hso_es();
    public static hso_es X = new hso_es("Time");
    public static boolean aM = false;
    public static boolean aN = false;
    public static boolean aO = false;
    public static boolean aP = false;
    public static String[] aQ;
    public int aR;
    public int aS;
    public int aT;
    public int aU;
    public int aV;
    public boolean aW = false;
    public hso_aq aX;
    public static hso_cy aY;
    public static hso_es aZ = new hso_es();
    private int bn;
    private int bo;
    private MainObject bp;
    private MainObject bq = new MainObject();
    private static hso_z br;
    private static hso_z bs = new hso_z();
    private static int bt = 0;
    private static int bu = 0;
    private hso_es bv = new hso_es("GameScr menungua");
    private static short[][] bw = new short[][]{{-72, 0, 120}, {144, 192, 120}};
    private int bx;
    private int by;

    public static GameScreen b() {
        if (hso_ft.c == null) {
            hso_ft.c = new GameScreen();
        }

        return hso_ft.c;
    }

    public final void c() {
        super.Y = null;
        super.Z = null;
        super.aa = null;
        if (!hso_ft.A) {
            super.Y = this.r;
        }

        super.c();
        L = false;
        hso_ft.n();
    }

    public final void g() {
        if (!hso_ft.A) {
            n();
        }

        hso_cr.b();
        hso_ay.b();
        hso_gb.a = null;
        hso_gb.b = null;
        hso_gb.d = null;
        hso_gb.c = null;
        hso_dw.b();
        o.d();
    }

    public GameScreen() {
        this.t = new hso_bt(hso_df.aW, 0);
        this.u = new hso_bt(hso_df.bK, 1);
        this.v = new hso_bt(hso_df.bL, 2);
        this.w = new hso_bt(hso_df.bM, 3);
        this.bd = new hso_bt(hso_df.cd, 5);
        this.y = new hso_bt(hso_df.aY, 7);
        new hso_bt("mua", 25, this);
        this.be = new hso_bt(hso_df.cW, 14);
        this.F = new hso_bt(hso_df.eB, 15);
        this.s = new hso_bt(hso_df.ai, 0, this);
        this.r = new hso_bt(hso_df.X, 1, this);
        this.bc = new hso_bt(hso_df.cE, 4, this);
        this.x = new hso_bt(hso_df.aS, 6, this);
        this.B = new hso_bt(hso_df.ct, 8, this);
        this.C = new hso_bt(hso_df.cu, 10, this);
        this.z = new hso_bt(hso_df.cB, 12, this);
        this.A = new hso_bt(hso_df.bd, 15, this);
        this.bf = new hso_bt(hso_df.cJ, 16, this);
        this.D = new hso_bt(hso_df.dh, 17, this);
        this.bg = new hso_bt(hso_df.di, 18, this);
        this.bh = new hso_bt(hso_df.cH, 19, this);
        this.E = new hso_bt(hso_df.es, 20, this);
        this.bi = new hso_bt(hso_df.ev, 21, this);
        this.bj = new hso_bt(hso_df.bK, 22, this);
        this.H = new hso_bt(hso_df.bK, 27, this);
        this.G = new hso_bt(hso_df.getChat("public GameScreen()"), 28, this);
        this.I = new hso_bt(hso_df.D, 30, this);
        this.J = new hso_bt(hso_df.bK, 31, this);
    }

    public final void h() {
        this.t.a = hso_df.aW;
        this.u.a = hso_df.bK;
        this.v.a = hso_df.bL;
        this.w.a = hso_df.bM;
        this.bd.a = hso_df.cd;
        this.y.a = hso_df.aY;
        this.be.a = hso_df.cW;
        this.F.a = hso_df.eB;
        this.s.a = hso_df.ai;
        this.r.a = hso_df.X;
        this.bc.a = hso_df.cE;
        this.x.a = hso_df.aS;
        this.B.a = hso_df.ct;
        this.C.a = hso_df.cu;
        this.z.a = hso_df.cB;
        this.A.a = hso_df.bd;
        this.bf.a = hso_df.cJ;
        this.D.a = hso_df.dh;
        this.bg.a = hso_df.di;
        this.bh.a = hso_df.cH;
        this.E.a = hso_df.es;
        this.bi.a = hso_df.ev;
        this.bj.a = hso_df.bK;
        this.H.a = hso_df.bK;
        this.G.a = hso_df.au;
    }

    public final void b(int var1, int var2) {
        switch (var1) {
            case 2:
                hso_ft.u.a((hso_p) this);
            case 0:
            case 1:
            default:
                super.b(var1, var2);
        }
    }

    public final void a_(int var1, int var2) {
        switch (var1) {
            case 0:
                if (hso_fq.e != null) {
//                    Service.a().a((byte) 0, (String) hso_fq.e.cB);
                    Service.a().a((byte) 0, hso_fq.e.cB);
                }
                break;
            case 1:
                if (hso_fq.e != null) {
                    Service.a().a((String) hso_fq.e.cB, (byte) 0);
                }
                break;
            case 2:
                if (hso_fq.e != null) {
                    hso_ft.g.a(hso_fq.e.cB, "", "", (byte) 0, true);
                }

                hso_ft.h();
                break;
            case 3:
                if (hso_fq.e != null) {
                    Service.a().b((byte) 1, hso_fq.e.cB);
                }
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                break;
            case 5:
                Service.a().b((byte) 0, "");
                break;
            case 7:
                if (hso_fq.e != null) {
                    Service.a().a((byte) 0, hso_fq.e.cB, (byte) 0, (short) 0, (int) 0);
                }
                break;
            case 14:
                hso_es var4;
                (var4 = new hso_es("GameScr menu3")).a(this.A);
                String var5 = hso_df.cw + " " + hso_df.cu;
                if (f.cv != 0) {
                    var4.a(this.B);
                    var5 = hso_df.cv + " " + hso_df.cu;
                }

                this.C.a = var5;
                var4.a(this.C);
                if (Player.o > -1) {
                    this.bf.a = hso_df.cw + hso_df.cJ;
                } else {
                    this.bf.a = hso_df.cv + hso_df.cJ;
                }

                var4.a(this.bf);
                if (Player.q != null) {
                    this.bg.a = hso_df.cw + hso_df.di;
                } else {
                    this.bg.a = hso_df.cv + hso_df.di;
                }

                var4.a(this.bg);
                if (Player.l) {
                    this.bh.a = hso_df.cw + hso_df.cH;
                } else {
                    this.bh.a = hso_df.cv + hso_df.cH;
                }

                var4.a(this.bh);
                if (p.a >= 0) {
                    var4.a(this.D);
                }

                hso_ft.o.a(var4, 2, hso_df.cW, false, (hso_es) null);
                break;
            case 15:
                if (hso_fq.e != null) {
                    Service.a().d((byte) 10, hso_fq.e.cB);
                }
        }

        super.a_(var1, var2);
    }

    public final void a(int var1, int var2) {
        hso_es var4;
        hso_es var6;
        switch (var1) {
            case 0:
                if (hso_cf.i()) {
                    return;
                }

                if (h != null) {
                    if (h.e_() && !hso_ft.A) {
                        this.I.a();
                    } else if (f.b(h) && h.cu == 0) {
                        if (super.aa == this.s) {
                            super.aa = null;
                        }
                    } else {
                        h.k();
                        if (Player.o == 1) {
                            Player.o_();
                        }

                        f.N();
                        K = 0;
                    }
                }
                break;
            case 1:
                hso_ft.j();
                if (f.e_()) {
                    hso_ft.j();
                    var6 = new hso_es("Sell");
                    hso_fn var9 = new hso_fn(hso_bw.V, (byte) 16, hso_df.dx, -1, (byte) 0);
                    var6.a(var9);
                    var4 = new hso_es("info");
                    var9 = new hso_fn(var4, (byte) 15, hso_df.D, -1, (byte) 0);
                    var6.a(var9);
                    (hso_ft.v = new hso_eu()).a = 0;
                    hso_ft.v.a(var6);
                    hso_ft.v.a((hso_p) b());
                } else {
                    hso_ft.u.a((hso_p) hso_ft.c);
                    Service.a().g((byte) 59);
                    if (p.d(1, 9)) {
                        hso_ft.u.a = 0;
                        p.f();
                        p.g();
                    } else if (p.d(6, 2)) {
                        p.f();
                        p.g();
                    }
                }
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 12:
            case 14:
            case 23:
            default:
                break;
            case 4:
                hso_ft.h();
                break;
            case 6:
                if (Player.N != null) {
                    hso_ft.c();
                }
                break;
            case 8:
                var6 = new hso_es("GameScr menu");

                for (int var8 = 0; var8 < hso_df.gq.length; ++var8) {
                    if (var8 > 0 || f.cv != -1) {
                        hso_bt var10 = new hso_bt(hso_df.gq[var8], 9, var8 == 0 ? -1 : var8, this);
                        if (var8 > 0) {
                            var10.a((hso_ce) hso_cg.aE, 3, var8 * 3);
                        }

                        var6.a(var10);
                    }
                }

                hso_ft.o.a(var6, 4, hso_df.ct, false, (hso_es) null);
                break;
            case 9:
                Service.a().c((byte) var2);
                break;
            case 10:
                if (f.cv != 0) {
                    hso_ft.c(hso_df.fd, new hso_bt(hso_df.cv, 24, this));
                } else {
                    Service.a().c((byte) -1);
                }
                break;
            case 13:
                Service.a().d((byte) var2);
                break;
            case 15:
                if (!hso_ag.f) {
                    Service.a().a((byte) 4, (String) "");
                    hso_ft.a(hso_df.aG, new hso_bt(hso_df.as, -1));
                } else {
                    hso_ag.b().a = hso_ag.b;
                    hso_ag.b().i = 0;
                    hso_ag.b().k();
                    hso_ag.b().h();
                    hso_ag.b().i();
                    hso_ag.b().j();
                    hso_ag.b().g = hso_df.bd;
                    hso_ag.b().h = 99;
                    hso_ag.b().a(this);
                }
                break;
            case 16:
                if (Player.o > -1) {
                    Player.o = -1;
                    Player.X = false;
                } else {
                    Player.o = 0;
                    Player.X = true;
                }
                break;
            case 17:
                p.d = null;
                p.a = -1;
                p.b = 0;
                p.g();
                p.c();
                break;
            case 18:
                if (Player.q != null) {
                    Player.q.g = true;
                } else {
                    hso_ft.e();
                }
                break;
            case 19:
                if (Player.l) {
                    Player.l = false;
                    hso_co.b();
                } else {
                    hso_ft.d();
                }
                break;
            case 20:
                if (hso_fq.e != null) {
                    Service.a().c((byte) 0, hso_fq.e.cB);
                }
                break;
            case 21:
                hso_ft.g();
                break;
            case 22:
                hso_cf.J = !hso_cf.J;
                hso_co.c();
                break;
            case 24:
                Service.a().c((byte) 0);
                hso_ft.j();
                break;
            case 25:
                a((byte) 0, false, -4, 300);
                break;
            case 26:
                hso_j var7;
                if (var2 >= 0 && var2 <= this.bv.c() - 1 && (var7 = (hso_j) this.bv.a(var2)) != null) {
                    Service.a().e((short) var7.O);
                }
                break;
            case 27:
                Service.a().b((short) -56, (byte) 0, (byte) 0);
                break;
            case 28:
                var4 = new hso_es("GameScr menuchat");

                for (int var5 = 0; var5 < hso_df.gA.length; ++var5) {
                    hso_bt var3 = new hso_bt(hso_df.gA[var5], 29, var5, this);
                    var4.a(var3);
                }

                hso_ft.o.a(var4, 4, hso_df.getChat("public final void a(int var1, int var2)"), false, (hso_es) null);
                break;
            case 29:
                f.cE = hso_df.gA[var2];
                Service.a().a(hso_df.gA[var2]);
                break;
            case 30:
                if (h != null && h.e_()) {
                    Service.a().a(1, (hso_es) null, "", (short) h.ct, 0, (byte) 0);
                }
                break;
            case 31:
                if (h != null && h.l_()) {
                    Service.a().d((byte) 0, (short) ((short) (h.ct + 1000)));
                }
        }

        super.a(var1, var2);
    }

    public static void i() {
        hso_ft.j();
        hso_bw.ab.d();
        hso_bw.aa.d();
        hso_es var0 = new hso_es("Sell");
        hso_fn var1 = new hso_fn(hso_bw.V, (byte) 16, hso_df.dx, -1, (byte) 0);
        var0.a(var1);
        hso_es var2 = new hso_es("info");
        var1 = new hso_fn(var2, (byte) 15, hso_df.D, -1, (byte) 0);
        var0.a(var1);
        (hso_ft.v = new hso_eu()).a = 0;
        hso_ft.v.a(var0);
        hso_ft.v.a((hso_p) b());
    }

    public final void a(mGraphics var1) {
        try {
            bt = 0;
            bu = 0;
            if (hso_cs.t > 0) {
                if (hso_cs.t > 100) {
                    bu = hso_ak.g(3);
                    if (hso_cs.t == 101) {
                        hso_cs.t = 0;
                    }
                } else {
                    bu = hso_ak.g(3);
                    bt = hso_ak.b(0, 2);
                }

                --hso_cs.t;
            }

            var1.a(bt, bu);
            var1.a(-hso_p.d.a, -hso_p.d.b);
            if (hso_ft.y != null) {
                hso_ft.y.a(var1);
            }

            if (hso_cs.k == 9) {
                var1.a(367554);
                var1.c(hso_p.d.a, hso_p.d.b, hso_ft.W, hso_ft.X);
            }

            hso_ft.p.a(var1);
            q.i(var1);
            if (this.aW) {
                var1.b(0, 0, hso_ft.p.e * 24, hso_ft.p.f * 24, this.aV);
            } else if (this.aT > 0) {
                var1.a(this.aR, this.aS, this.aT, this.aU, this.aV);
            }

            int var2;
            hso_at var3;
            for (var2 = 0; var2 < aZ.c(); ++var2) {
                if ((var3 = (hso_at) aZ.a(var2)) != null) {
                    var3.a(var1, var3.c, var3.d);
                }
            }

            for (var2 = 0; var2 < hso_cs.x.c(); ++var2) {
                ((hso_fs) hso_cs.x.a(var2)).a(var1);
            }

            for (var2 = 0; var2 < l.c(); ++var2) {
                ((hso_en) l.a(var2)).a(var1);
            }

            for (var2 = 0; var2 < bb.c(); ++var2) {
                ((hso_en) bb.a(var2)).a(var1);
            }

            if (p.a >= 0 && !hso_ft.o.a && hso_ft.r == null && hso_ft.a == this && !hso_d.b && hso_ft.s == null && hso_ft.a == hso_ft.c) {
                p.b(var1);
            }

            if (hso_ft.A && Player.Q > 0 && f.cN != null && Player.O >= 0) {
                hso_cf.p.b((4 - Player.Q / 2) % hso_cf.p.c, Player.O, Player.P, 0, 3, var1);
            }

            hso_br.a.a(var1);
            mGraphics var10 = var1;

            int var7;
            for (var7 = 0; var7 < hso_bj.a.c(); ++var7) {
                ((hso_bj) hso_bj.a.a(var7)).b(var10);
            }

            hso_v.b(var1);

            try {
                this.bn = 0;
                this.bo = 0;
                this.bq.aZ = 10000;
                bs.i = 10000;

                label420:
                while (true) {
                    while (true) {
                        if (this.bn >= i.c() && this.bo >= hso_cs.b.c()) {
                            break label420;
                        }

                        this.bp = this.bq;
                        br = bs;
                        if (this.bn < i.c()) {
                            this.bp = (MainObject) i.a(this.bn);
                        }

                        if (this.bo < hso_cs.b.c()) {
                            br = (hso_z) hso_cs.b.a(this.bo);
                        }

                        if (br != null && this.bp.aZ + this.bp.bo >= br.i + hso_cs.l) {
                            if (br.b() && br != null) {
                                br.a(var1);
                            }

                            ++this.bo;
                        } else {
                            if (MainObject.c(this.bp) && !this.bp.cL && !this.bp.cK) {
                                this.bp.a(var1);
                                if (this.bp.dk != null && this.bp.dk.c != null) {
                                    this.bp.dk.a(var1);
                                }
                            }

                            ++this.bn;
                            if (br == null) {
                                ++this.bo;
                            }
                        }
                    }
                }
            } catch (Exception var5) {
                var5.printStackTrace();
            }

            for (var2 = 0; var2 < bm.c(); ++var2) {
                hso_bz var8;
                if ((var8 = (hso_bz) bm.a(var2)) != null) {
                    var8.a(var1);
                }
            }

            for (var2 = 0; var2 < aZ.c(); ++var2) {
                if ((var3 = (hso_at) aZ.a(var2)) != null) {
                    var3.b(var1, var3.c, var3.d);
                }
            }

            var10 = var1;

            for (var7 = 0; var7 < hso_bj.a.c(); ++var7) {
                ((hso_bj) hso_bj.a.a(var7)).a(var10);
            }

            for (var2 = 0; var2 < hso_cs.a.c(); ++var2) {
                hso_en var12 = (hso_en) hso_cs.a.a(var2);
                var1.a(hso_cg.ak, 0, 0, 12, 16, hso_cs.c[var12.m], var12.a + hso_ft.ai % 6 * var12.i, var12.b + hso_ft.ai % 6 * var12.j, 3);
                hso_cg.a(var1, var12.t, var12.k + hso_ft.ai % 6 * var12.i, var12.l + hso_ft.ai % 6 * var12.j, var12.n);
            }

            if (h != null && h.cu != 1) {
                h.b(var1);
            }

            var2 = ba.c();
            hso_br.b.a(var1);
            if (V.c() > 0) {
                for (var7 = 0; var7 < V.c(); ++var7) {
                    hso_dq var4;
                    if ((var4 = (hso_dq) V.a(var7)) != null) {
                        var4.a(var1);
                    }
                }
            }

            for (var7 = 0; var7 < var2; ++var7) {
                hso_dx var9;
                if (hso_dx.a((var9 = (hso_dx) ba.a(var7)).g, var9.h, 10, 10) && !var9.x && !var9.y) {
                    var9.a(var1);
                }
            }

            for (var7 = 0; var7 < o.c(); ++var7) {
                ((hso_ca) o.a(var7)).a(var1);
            }

            MainObject.i(var1);
            hso_ft.a(var1);
            if (K > 0 && this.s != null) {
                this.s.a(var1, this.s.h, this.s.i);
            }

            if ((!hso_ft.o.a || hso_fq.d == 2) && (hso_ft.r == null || p.a == 5 && p.b < 8 || hso_ft.A && (p.a == 0 || p.a == 1)) && hso_ft.a == this && !hso_d.b && hso_ft.s == null && hso_ft.a == hso_ft.c) {
                if (f.M == null) {
                    if (hso_ft.A) {
                        var1.a(hso_ft.W - hso_ft.q.a * hso_ex.c, 0);
                    } else {
                        var1.a(hso_ft.W - hso_ft.q.a * hso_ex.c - 3, hso_ft.X - 23 - hso_ft.q.b * hso_ex.c);
                    }

                    String var13;
                    if (hso_ft.A) {
                        if (!hso_cf.i() && !hso_cf.j()) {
                            hso_cg.a(var1, hso_ft.q.a * hso_ex.c - 40, hso_ft.q.b * hso_ex.c - 19, 40, 35, (int) 1);
                            hso_o.c.a(var1, hso_df.cC + hso_cs.b(), hso_ft.q.a * hso_ex.c - 37 + 17, hso_ft.q.b * hso_ex.c + 3, 2, false);
                        }

                        var3 = null;
                        if (q.c(hso_ft.p.d)) {
                            hso_cf.h(var1);
                            if (!(var13 = hso_cs.a(U)).equals("")) {
                                var1.e(hso_ft.q.a * hso_ex.c - hso_ft.W / 2 - 18, hso_ft.q.b * hso_ex.c - 38, 36, 17);
                                hso_cg.a(var1, var13, hso_ft.q.a * hso_ex.c - hso_ft.W / 2, hso_ft.q.b * hso_ex.c - 35, 2);
                            }
                        } else if (!(var13 = hso_cs.c()).equals("")) {
                            hso_o.j.a(var1, var13, hso_ft.q.a * hso_ex.c - 42, hso_ft.q.b * hso_ex.c + 3, 1, false);
                        }
                    } else {
                        var3 = null;
                        if (hso_ft.C) {
                            hso_o.i.a(var1, hso_df.cC + hso_cs.b(), 14, -13, 2, false);
                            if (q.c(hso_ft.p.d)) {
                                hso_cf.h(var1);
                                if (!(var13 = hso_cs.a(U)).equals("")) {
                                    hso_cg.a(var1, var13, 14, -30, 1);
                                }
                            } else if (!(var13 = hso_cs.c()).equals("")) {
                                hso_o.j.a(var1, var13, 14, -30, 1, false);
                            }
                        } else {
                            hso_cg.a(var1, hso_ft.q.a * hso_ex.c - 37, -17, 40, 35, (int) 1);
                            hso_o.c.a(var1, hso_df.cC + hso_cs.b(), hso_ft.q.a * hso_ex.c - 34 + 17, -14, 2, false);
                            if (q.c(hso_ft.p.d)) {
                                hso_cf.h(var1);
                                if (!(var13 = hso_cs.a(U)).equals("")) {
                                    hso_cg.a(var1, var13, hso_ft.q.a * hso_ex.c - 39, -14, 1);
                                }
                            } else if (!(var13 = hso_cs.c()).equals("")) {
                                hso_o.j.a(var1, var13, hso_ft.q.a * hso_ex.c - 39, -14, 1, false);
                            }
                        }
                    }

                    hso_ft.q.a(var1);
                    hso_ft.a(var1);
                    q.c(var1, hso_ft.W - hso_ft.q.a * hso_ex.c + 21, 0);

                    if (f != null && !hso_dw.g) {
                        if (f.cF == 4) {
                            var1.e(0, 0, hso_ft.W, hso_ft.X);
                        } else if (f.B) {
                            hso_cf.a(var1, f.C);
                        }
                    }

                    q.a(var1, 0, 0, !hso_ft.C, hso_o.j);
                    q.a(var1, 0, 0);
                    q.b(var1, hso_ft.W / 2 + 20, 0);
                    q.d(var1);
                    if (!hso_ft.A && f.cF != 4) {
                        q.a(var1);
                    }

                    q.c(var1);
                    if (!hso_ft.o.a) {
                        q.f(var1);
                    }

                    if (hso_cf.i > 0) {
                        var1.a(hso_cg.ar, hso_cf.g, hso_cf.h, 0);
                        var13 = String.valueOf(hso_cf.i);
                        if (hso_cf.i > 20) {
                            var13 = "20+";
                        }

                        hso_cg.a(var1, var13, hso_cf.g + 17, hso_cf.h - 1, 0);
                    }
                }

                hso_ft.a(var1);
                if (q.F == null && hso_cf.M && !hso_ft.o.a) {
                    if (hso_ft.A) {
                        this.c(var1);
                    } else {
                        this.d(var1);
                    }
                }

                if (this.aX != null) {
                    var1.a(this.aX, 5, 46, 0);
                }
            }

            hso_ft.a(var1);
            if (!hso_ft.D && !hso_f.a) {
                if (!(M || GameScreen.p.a < 0
                        || hso_ft.o.a
                        || hso_ft.r != null
                        || hso_d.b
                        || hso_ft.s != null || hso_ft.a != hso_ft.c)) {
                    p.e(var1);
                }
            } else if (GameScreen.p.a >= 0
                    && !hso_ft.o.a
                    && hso_ft.r == null
                    && !hso_d.b && hso_ft.s == null && hso_ft.a == hso_ft.c) {
                p.e(var1);
            }
            hso_cf.g(var1);
            q.k(var1);
            if (hso_cf.W == 1 && m()) {
                hso_cf.j(var1);
            }

            for (var7 = 0; var7 < X.c(); ++var7) {
                hso_dm var11;
                if ((var11 = (hso_dm) X.a(var7)) != null) {
                    var11.a(var1);
                }
            }

            if (aY != null) {
                aY.a(var1, hso_ft.W / 2 - 31, hso_ft.X - 30);
            }

            hso_ft.a(var1);
            if (aQ != null && aQ.length > 0) {
                for (var7 = 0; var7 < aQ.length; ++var7) {
                    hso_cg.a(var1, aQ[var7], hso_ft.W - 10, hso_ft.q.b * hso_ex.c + 15 + var7 * hso_ft.ab, 1);
                }
                return;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    private static boolean m() {
        if (b != null) {
            for (int var0 = 0; var0 < b.length; ++var0) {
                if (b[var0] == hso_ft.p.d) {
                    return false;
                }
            }
        }

        return true;
    }

    public final void a() {
        try {
            int var1;
            for (var1 = 0; var1 < aZ.c(); ++var1) {
                hso_at var2;
                if ((var2 = (hso_at) aZ.a(var1)) != null) {
                    var2.d();
                    if (var2.b) {
                        aZ.d(var2);
                        --var1;
                    }
                }
            }

            hso_en var6;
            for (var1 = 0; var1 < bb.c(); ++var1) {
                (var6 = (hso_en) bb.a(var1)).b();
                if (var6.u) {
                    bb.d(var6);
                    --var1;
                }
            }

            for (var1 = 0; var1 < l.c(); ++var1) {
                (var6 = (hso_en) l.a(var1)).b();
                if (var6.u) {
                    l.d(var6);
                    --var1;
                }
            }

            for (var1 = 0; var1 < X.c(); ++var1) {
                hso_dm var7;
                (var7 = (hso_dm) X.a(var1)).a();
                if (var7.a) {
                    X.d(var7);
                }
            }

            if (aY != null) {
                aY.a();
                if (aY.a) {
                    aY = null;
                }
            }

            for (var1 = 0; var1 < hso_cs.x.c(); ++var1) {
                ((hso_fs) hso_cs.x.a(var1)).a();
            }

            if (p.a >= 0) {
                p.h();
            }

            if (Player.Q > 0) {
                --Player.Q;
            }

            if (hso_ft.y != null) {
                hso_ft.y.a();
            }

            for (var1 = 0; var1 < hso_cs.b.c(); ++var1) {
                hso_z var8;
                if ((var8 = (hso_z) hso_cs.b.a(var1)).c == 1) {
                    var8.a();
                }
            }

            MainObject var9;
            for (var1 = 0; var1 < i.c(); ++var1) {
                if ((var9 = (MainObject) i.a(var1)).cL && !var9.cK) {
                    ++var9.bS;
                    if (var9.bS >= 5) {
                        var9.cK = true;
                    }
                } else if (var9 != null && !var9.cK) {
                    var9.a();
                    var9.bp = var9.aZ + var9.bo;
                } else {
                    i.b(var1);
                    --var1;
                }
            }

            for (var1 = bm.c() - 1; var1 >= 0; --var1) {
                hso_bz var10;
                (var10 = (hso_bz) bm.a(var1)).a();
                if (var10.a) {
                    bm.b(var1);
                }
            }

            hso_ak.a(i);
            int var3;
            if (hso_ft.ai % 50 == 0) {
                for (var1 = 0; var1 < i.c() - 1; ++var1) {
                    ((MainObject) i.a(var1)).dP = false;
                }

                for (var1 = 0; var1 < i.c() - 1; ++var1) {
                    if ((var9 = (MainObject) i.a(var1)) != null && var9.cu == 0) {
                        for (var3 = var1 + 1; var3 < i.c(); ++var3) {
                            MainObject var4;
                            if ((var4 = (MainObject) i.a(var3)).cu == 0 && var4 != null && hso_ak.e(var9.aY - var4.aY) <= 20 && hso_ak.e(var9.aZ - var4.aZ) <= 20) {
                                var9.dP = true;
                                var4.dP = true;
                            }
                        }
                    }
                }
            }

            for (var1 = 0; var1 < ba.c(); ++var1) {
                hso_dx var11;
                if ((var11 = (hso_dx) ba.a(var1)) != null && !var11.x) {
                    if (!var11.y) {
                        var11.a();
                    }
                } else {
                    ba.d(var11);
                    --var1;
                }
            }

            int var12;
            if (hso_cs.i == hso_cs.j) {
                hso_p.d.a(p.d.e / 2, p.d.f / 2);
            } else if (f.M == null) {
                if (L) {
                    int var10001 = P - N;
                    var3 = Q - O;
                    var12 = var10001;
                    hso_aw var15 = hso_p.d;
                    if (var12 < 0) {
                        var12 = 0;
                    }

                    if (var12 > var15.e) {
                        var12 = var15.e;
                    }

                    if (var3 < 0) {
                        var3 = 0;
                    }

                    if (var3 > var15.f) {
                        var3 = var15.f;
                    }

                    var15.a = var12;
                    var15.b = var3;
                    var15.c = var12;
                    var15.d = var3;
                } else {
                    hso_p.d.a(f.aY - hso_ft.Y, f.aZ - hso_ft.Z);
                }
            } else {
                MainObject var16;
                if ((var16 = MainObject.a(f.M.i, (byte) 2)) != null) {
                    hso_p.d.a(f.aY - hso_ft.Y, var16.aZ - hso_ft.Z - hso_ft.Z / 4);
                } else {
                    hso_p.d.a(f.aY - hso_ft.Y, f.aZ - hso_ft.Z);
                }
            }

            hso_p.d.a();
            hso_ft.q.d.a((f.aY / hso_cs.l - hso_ft.q.a / 2) * hso_ex.c, (f.aZ / hso_cs.l - hso_ft.q.b / 2) * hso_ex.c);
            hso_ft.q.d.a();
            boolean var17 = false;

            for (var12 = 0; var12 < o.c(); ++var12) {
                var17 = true;
                hso_ca var13;
                (var13 = (hso_ca) o.a(var12)).a();
                if (var13.a == 4) {
                    if (var13.c) {
                        o.d(var13);
                        --var12;
                    }
                } else if (var13.a == 5) {
                    if (var13.c && var13.b.c() == 0) {
                        o.d(var13);
                        --var12;
                    }
                } else if (var13.b.c() == 0) {
                    o.d(var13);
                    --var12;
                }
            }

            if (var17) {
                hso_ca.c();
            }

            if (hso_ft.ai % 200 == 0) {
                hso_ay.a();
                hso_cr.a();
                hso_at.e();
                hso_ak.a();
                hso_fp.a();
                MainObject.G();
                hso_dq.e();
            }

            if (h != null && h.cK) {
                h = null;
            }

            if (Player.q != null && Player.q.g) {
                Player.q = null;
                hso_co.b();
            }

            if (K > 0) {
                if (this.s != null) {
                    if ((var9 = MainObject.a(this.s.l, (byte) 0)) == null) {
                        K = 0;
                    } else {
                        this.s.a(var9.aY - hso_p.d.a, var9.aZ - hso_p.d.b - var9.be - 30);// bug
                    }
                }

                --K;
            }

            if (!hso_ft.A && (hso_ft.aj - bk) / 1000L > 300L) {
                n();
            }

            if (bl > 0 && hso_ft.ai % 30 == 0) {
                --bl;
            }

            hso_br.b.a();
            hso_br.a.a();
            if (V.c() > 0) {
                for (var12 = 0; var12 < V.c(); ++var12) {
                    hso_dq var14;
                    if ((var14 = (hso_dq) V.a(var12)).a) {
                        V.d(var14);
                    }

                    if (var14 != null) {
                        var14.a();
                    }
                }
            }

            hso_cf.k();

            for (var12 = 0; var12 < hso_bj.a.c(); ++var12) {
                ((hso_bj) hso_bj.a.a(var12)).a();
            }

        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    private static void n() {
        bk = hso_ft.aj;
        hso_bk.a(hso_au.K);
        hso_bk.a(m);
        hso_bk.a(hso_bw.ag);
    }

    public final void d() {
        if (!Player.m) {
            super.d();
        }

        if (f != null) {
            f.r();
        }

    }

    public final void e() {
        if (hso_ft.A) {
            if (K > 0 && this.s != null) {
                this.s.b();
            }

            super.e();
            q.f();
        }

    }

    public final void a(hso_es var1) {
        this.bv = new hso_es("GameScr menungua2");
        this.bv = var1;
        hso_es var2 = new hso_es("GameScr newvec");

        for (int var3 = 0; var3 < var1.c(); ++var3) {
            hso_j var4;
            if ((var4 = (hso_j) var1.a(var3)) != null) {
                String var5 = var4.g;
                hso_bt var6 = new hso_bt(var5, 26, var3, this);
                var2.a(var6);
                hso_ft.o.a(var2, 2, hso_df.gl, false, (hso_es) null);
            }
        }

    }

    public final void j() {
        hso_es var1 = new hso_es("GameScr menu3");
        if (Player.o > -1) {
            b().bf.a = hso_df.cw + hso_df.cJ;
        } else {
            b().bf.a = hso_df.cv + hso_df.cJ;
        }

        var1.a(b().bf);
        if (Player.q != null) {
            b().bg.a = hso_df.cw + hso_df.di;
        } else {
            b().bg.a = hso_df.cv + hso_df.di;
        }

        var1.a(b().bg);
        if (Player.l) {
            b().bh.a = hso_df.cw + hso_df.cH;
        } else {
            b().bh.a = hso_df.cv + hso_df.cH;
        }

        var1.a(b().bh);
        var1.a(b().bi);
        this.bj.a = hso_df.cv + hso_df.eA;
        if (hso_cf.J) {
            this.bj.a = hso_df.cw + hso_df.eA;
        }

        var1.a(b().bj);
        hso_ft.o.a(var1, 2, hso_df.cI, false, (hso_es) null);
    }

    public static void a(int var0, int var1, byte var2, hso_es var3) {
        hso_bf var4 = new hso_bf((short) var1, var2);
        if (hso_dw.g && hso_cf.d(hso_ft.p.d)) {
            if (var1 != f.ct && hso_i.b <= 3) {
                ++hso_i.b;
            }

            a(var0, var4, var3);
        } else {
            a(var0, var4, var3);
        }
    }

    private static void a(int var0, hso_bf var1, hso_es var2) {
        if (var0 == 119) {
            a((hso_dx) (new hso_i(114, var1, var2, 0)));
            a((hso_dx) (new hso_i(115, var1, var2, 0)));
        } else {
            hso_bf var5;
            hso_es var8;
            int var9;
            switch (var0) {
                case 118:
                    a((hso_dx) (new hso_i(65, var1, var2, 0)));
                    var8 = new hso_es();
                    for (var9 = 0; var9 < var2.c(); ++var9) {
                        if ((var5 = (hso_bf) var2.a(var9)) != null) {
                            var8.a(var5);
                            a((hso_dx) (new hso_i(62, var1, var8, 0)));
                            var8.d();
                        }
                    }
                    break;
                case 117:
                    a((hso_dx) (new hso_i(20, var1, var2, 0)));
                    a((hso_dx) (new hso_i(91, var1, var2, 0)));
                    break;
                case 116:
                    a((hso_dx) (new hso_i(53, var1, var2, 0)));
                    a((hso_dx) (new hso_i(77, var1, var2, 0)));
                    break;
                case 123:
                    a((hso_dx) (new hso_i(60, var1, var2, 0)));
                    var8 = new hso_es();
                    for (var9 = 0; var9 < var2.c(); ++var9) {
                        if ((var5 = (hso_bf) var2.a(var9)) != null) {
                            var8.a(var5);
                            a((hso_dx) (new hso_i(49, var1, var8, 0)));
                            var8.d();
                        }
                    }
                    break;
                default:
                    int var3;
                    hso_bf var4;
                    hso_es var7;
                    switch (var0) {
                        case 122:
                            var7 = new hso_es();
                            for (var3 = 0; var3 < var2.c(); ++var3) {
                                if ((var4 = (hso_bf) var2.a(var3)) != null) {
                                    var7.a(var4);
                                    a((hso_dx) (new hso_i(51, var1, var7, 0)));
                                    var7.d();
                                }
                            }
                            a((hso_dx) (new hso_i(66, var1, var2, 0)));
                            break;
                        case 121:
                            a((hso_dx) (new hso_i(34, var1, var2, 0)));
                            var8 = new hso_es();
                            for (var9 = 0; var9 < var2.c(); ++var9) {
                                if ((var5 = (hso_bf) var2.a(var9)) != null) {
                                    var8.a(var5);
                                    a((hso_dx) (new hso_i(55, var1, var8, 0)));
                                    var8.d();
                                }
                            }
                            break;
                        case 120:
                            var7 = new hso_es();
                            for (var3 = 0; var3 < var2.c(); ++var3) {
                                if ((var4 = (hso_bf) var2.a(var3)) != null) {
                                    var7.a(var4);
                                    a((hso_dx) (new hso_i(54, var1, var7, 0)));
                                    var7.d();
                                }
                            }
                            a((hso_dx) (new hso_i(11, var1, var2, 0)));
                            break;
                        default:
                            if (!hso_cf.j() && !hso_cf.d(hso_ft.p.d)) {
                                a((hso_dx) (new hso_i(var0, var1, var2, 0)));
                            } else {
                                if (var1.a == f.ct) {
                                    a((hso_dx) (new hso_i(var0, var1, var2, 0)));
                                    return;
                                }

                                hso_i var6;
                                if ((var6 = new hso_i(var0, var1, var2, 0)).r == -1) {
                                    if (hso_br.b.c() <= 20) {
                                        a((hso_dx) var6);
                                        return;
                                    }
                                } else if (hso_br.a.c() <= 20) {
                                    a((hso_dx) var6);
                                    return;
                                }
                            }
                            break;
                    }
                    break;
            }
        }
    }

    public static void a(int var0, int var1, byte var2, int var3, byte var4, int var5, int var6) {
        hso_es var7 = new hso_es("GameScr vec3");
        hso_bf var9;
        (var9 = new hso_bf((short) var3, var4)).a(var5, var6);
        var7.a(var9);
        hso_bf var8 = new hso_bf((short) var1, var2);
        a((hso_dx) (new hso_i(var0, var8, var7, 0)));
    }

    public static void a(int var0, int var1, byte var2, int var3, byte var4, int var5, int var6, byte var7) {
        hso_es var8 = new hso_es("GameScr vec");
        hso_bf var10;
        (var10 = new hso_bf((short) var3, var4)).a(0, var6);
        var8.a(var10);
        hso_bf var9 = new hso_bf((short) var1, (byte) 0);
        a((hso_dx) (new hso_i(68, var9, var8, var7)));
    }

    public static void a(int var0, int var1, byte var2, hso_es var3, byte var4) {
        hso_bf var7 = new hso_bf((short) var1, (byte) 1);
        if (!hso_i.a(var0)) {
            a((hso_dx) (new hso_i(var0, var7, var3, var4)));
        } else {
            for (int var8 = 0; var8 < var3.c(); ++var8) {
                hso_es var5 = new hso_es("GameScr vector");
                hso_bf var6 = (hso_bf) var3.a(var8);
                var5.a(var6);
                a((hso_dx) (new hso_i(var0, var7, var5, var4)));
            }

        }
    }

    public static void a(int var0, byte var1) {
        MainObject var3;
        try {
            int var4;
            if ((var3 = MainObject.a(var0, (byte) 1)).aY <= 216) {
                for (var4 = 0; var4 < 3; ++var4) {
                    hso_br.a((hso_dx) (new hso_i(var3.aY, var3.aZ + 12, var3.aY + bw[0][var4], var3.aZ + bw[1][var4], (byte) 0)), "Game scren (public static void a(int var0, byte var1) {)");
                }

            } else {
                if (var3.aY >= 384) {
                    for (var4 = 0; var4 < 3; ++var4) {
                        hso_br.a((hso_dx) (new hso_i(var3.aY, var3.aZ + 12, var3.aY + bw[0][var4], var3.aZ + bw[1][var4], (byte) 1)), "Game scren 1 (public static void a(int var0, byte var1) {)");
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(int var0, int var1, byte var2, hso_es var3, byte var4, int var5) {
        hso_bf var7 = new hso_bf((short) var1, var2);
        hso_i var6;
        (var6 = new hso_i(var0, var7, var3, var4)).e = var5;
        a((hso_dx) var6);
    }

    public static void b(int var0, int var1, byte var2, int var3, byte var4, int var5, int var6, byte var7) {
        hso_es var8 = new hso_es("GameScr vec2");
        hso_bf var10;
        (var10 = new hso_bf((short) var3, var4)).a(var5, var6);
        var8.a(var10);
        hso_bf var9 = new hso_bf((short) var1, var2);
        a((hso_dx) (new hso_i(var0, var9, var8, var7)));
    }

    public static hso_z a(String var0, String var1) {
        return new hso_dq(var1);
    }

    public static void a(int var0, int var1, byte var2, hso_es var3, int var4, int var5) {
        hso_bf var7 = new hso_bf((short) var1, var2);
        hso_i var6;
        (var6 = new hso_i(var0, var7, var3, var5)).e = var4;
        a((hso_dx) var6);
    }

    private static void a(hso_dx var0) {
        try {
            if (var0.r != -1) {
                hso_br.a(var0, "game scren: private static void a(hso_dx var0)");
            } else {
                hso_br.b(var0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void a(int var0, int var1, int var2) {
        a((hso_dx) (new hso_cx(var0, var1, var2)));
    }

    public static void a(int var0, int var1, int var2, int var3) {
        a((hso_dx) (new hso_cx(57, var1, var2, var3)));
    }

    public static void a(int var0, int var1, int var2, int var3, byte var4) {
        a((hso_dx) (new hso_cx(var0, var1, var2, var3, (byte) -1)));
    }

    public static void a(int var0, int var1, int var2, long var3) {
        a((hso_dx) (new hso_cx(47, var1, var2, var3)));
    }

    public static void a(int var0, int var1, int var2, int var3, short var4, byte var5) {
        a((hso_dx) (new hso_i(var0, var1, var2, var3, var4, var5)));
    }

    public static void a(String var0, int var1, int var2, int var3, int var4) {
        if (!hso_cf.j() || var4 == f.ct) {
            hso_bn var5 = new hso_bn(var0, var1, var2, var3);
            if ((var1 = b(ba)) == ba.c()) {
                ba.a(var5);
            } else {
                ba.a(var5, var1);
            }
        }
    }

    public static void a(String var0, int var1, int var2, int var3) {
        hso_bn var4 = new hso_bn(var0, var1, var2, var3);
        if ((var1 = b(ba)) == ba.c()) {
            ba.a(var4);
        } else {
            ba.a(var4, var1);
        }
    }

    public static void a(String var0, int var1, int var2, int var3, int var4, int var5) {
        if (!hso_cf.j() || var5 == f.ct) {
            hso_bn var6 = new hso_bn(var0, var1, var2, 8, var4);
            if ((var1 = b(ba)) == ba.c()) {
                ba.a(var6);
            } else {
                ba.a(var6, var1);
            }
        }
    }

    public static void a(MainObject var0) {
        i.a(var0);
    }

    public final short[] a(int var1, int var2, int var3, int var4, int var5) {
        if (MainObject.c(var1 * hso_cs.l, var2 * hso_cs.l, var3 * hso_cs.l, var4 * hso_cs.l) <= hso_cs.l) {
            return null;
        } else {
            this.bx = 0;
            this.by = 0;
            var1 -= this.bx;
            var2 -= this.by;
            var3 -= this.bx;
            var4 -= this.by;

            int var7;
            int var8;
            for (int var6 = 0; var6 < hso_ft.p.p.length; ++var6) {
                for (var7 = 0; var7 < hso_ft.p.p[var6].length; ++var7) {
                    if ((var8 = (this.by + var7) * hso_ft.p.e + this.bx + var6) < hso_ft.p.n.length - 1) {// bug
                        if (hso_ft.p.n[var8] != 1 && hso_ft.p.n[var8] != -1) {
                            hso_ft.p.p[var6][var7] = 0;
                        } else {
                            hso_ft.p.p[var6][var7] = -1;
                        }
                    }
                }
            }

            var7 = var1;
            var8 = var2;
            short var19 = (short) var1;
            short var9 = (short) var2;
            hso_ft.p.p[var1][var2] = 1;
            short var20 = 2;
            int var12 = hso_ft.p.p.length;
            int var13 = hso_ft.p.p[0].length;
            int var14 = 0;

            do {
                ++var14;
                if (var14 > 1000) {
                    return new short[var5 + 1];
                }

                int var10 = -1;
                int var11 = -1;
                if (var7 + 1 < var12 && hso_ft.p.p[var7 + 1][var8] == 0) {
                    hso_ft.p.p[var7 + 1][var8] = (byte) var20;
                    var10 = var7 + 1;
                    var11 = var8;
                }

                if (var7 - 1 >= 0 && hso_ft.p.p[var7 - 1][var8] == 0) {
                    hso_ft.p.p[var7 - 1][var8] = (byte) var20;
                    if (var10 == -1 || hso_ak.a(var10, var11, var3, var4) > hso_ak.a(var7 - 1, var8, var3, var4)) {
                        var10 = var7 - 1;
                        var11 = var8;
                    }
                }

                if (var8 + 1 < var13 && hso_ft.p.p[var7][var8 + 1] == 0) {
                    hso_ft.p.p[var7][var8 + 1] = (byte) var20;
                    if (var10 == -1 || hso_ak.a(var10, var11, var3, var4) > hso_ak.a(var7, var8 + 1, var3, var4)) {
                        var10 = var7;
                        var11 = var8 + 1;
                    }
                }

                if (var8 - 1 >= 0 && hso_ft.p.p[var7][var8 - 1] == 0) {
                    hso_ft.p.p[var7][var8 - 1] = (byte) var20;
                    if (var10 == -1 || hso_ak.a(var10, var11, var3, var4) > hso_ak.a(var7, var8 - 1, var3, var4)) {
                        var10 = var7;
                        var11 = var8 - 1;
                    }
                }

                byte var15 = -1;
                if (var10 != -1) {
                    var15 = 0;
                    var7 = var10;
                    var8 = var11;
                } else {
                    var8 = 1000;
                    var7 = 1000;
                }

                for (short var21 = 0; var21 < var12; ++var21) {
                    for (short var23 = 0; var23 < var13; ++var23) {
                        if (hso_ft.p.p[var21][var23] > 1) {
                            byte[][] var18 = hso_ft.p.p;
                            if ((var21 + 1 < var18.length && var18[var21 + 1][var23] == 0 ? true : (var21 - 1 >= 0 && var18[var21 - 1][var23] == 0 ? true : (var23 + 1 < var18[var21].length && var18[var21][var23 + 1] == 0 ? true : var23 - 1 >= 0 && var18[var21][var23 - 1] == 0))) && hso_ft.p.p[var21][var23] + hso_ak.a(var21, var23, var3, var4) < var20 + hso_ak.a(var7, var8, var3, var4)) {
                                var7 = var21;
                                var8 = var23;
                                var20 = (short) hso_ft.p.p[var21][var23];
                                var15 = 0;
                            }
                        }
                    }
                }

                if (var7 == var3 && var8 == var4) {
                    if (var20 >= 127) {
                        return new short[var5 + 1];
                    }

                    int var24 = 0;
                    short[] var22 = new short[var20];

                    while (true) {
                        var22[var24] = (short) ((var7 << 8) + var8);
                        if (var7 + 1 < var12 && hso_ft.p.p[var7 + 1][var8] == hso_ft.p.p[var7][var8] - 1) {
                            var7 = (short) (var7 + 1);
                        } else if (var7 - 1 >= 0 && hso_ft.p.p[var7 - 1][var8] == hso_ft.p.p[var7][var8] - 1) {
                            var7 = (short) (var7 - 1);
                        } else if (var8 + 1 < var13 && hso_ft.p.p[var7][var8 + 1] == hso_ft.p.p[var7][var8] - 1) {
                            var8 = (short) (var8 + 1);
                        } else if (var8 - 1 >= 0 && hso_ft.p.p[var7][var8 - 1] == hso_ft.p.p[var7][var8] - 1) {
                            var8 = (short) (var8 - 1);
                        }

                        if (var7 == var19 && var8 == var9) {
                            var22[var20 - 1] = (short) ((var1 << 8) + var2);
                            return var22;
                        }

                        ++var24;
                    }
                }

                if (var15 != 0) {
                    return new short[var5 + 1];
                }
            } while (++var20 <= var5);

            return new short[var20];
        }
    }

    private static int b(hso_es var0) {
        int var1 = var0.c();

        for (int var2 = 0; var2 < var0.c(); ++var2) {
            hso_dx var3;
            if ((var3 = (hso_dx) var0.a(var2)).y && !var3.x) {
                return var2;
            }
        }

        return var1;
    }

    public static void k() {
        hso_cs.b.d();
        l.d();
        aZ.d();
    }

    public static void l() {
        for (int var0 = 0; var0 < i.c(); ++var0) {
            MainObject var1;
            if ((var1 = (MainObject) i.a(var0)) != f && var1 != g) {
                var1.cK = true;
                var1.bH = false;
                var1.bI = false;
                var1.dK = false;
                var1.dJ = false;
                var1.dZ = false;
                var1.dL = false;
                var1.dM = false;
            }
        }

        ba.d();
        l.d();
        aZ.d();
        hso_br.b.b();
        hso_br.a.b();
        o.d();
        f.aX = null;
        hso_ex.f.d();
        V.d();
        f.bH = false;
        f.dK = false;
        f.dJ = false;
        f.bI = false;
        f.dZ = false;
        f.dL = false;
        f.dM = false;
        hso_v.a = false;
    }

    public static boolean d(int var0, int var1) {
        return hso_ft.p.a(var0, var1) == 2;
    }

    public static void a(byte var0, boolean var1, int var2, int var3) {
        hso_ca var4 = new hso_ca(var0, var1, var2, var3);
        o.a(var4);
    }

    public static boolean e(int var0, int var1) {
        return var0 >= hso_p.d.a && var0 <= hso_p.d.a + hso_ft.W && var1 >= hso_p.d.b && var1 <= hso_p.d.b + hso_ft.X;
    }

    public static void b(int var0) {
        if (bl <= 3) {
            ++bl;
        }

    }

    public static void b(int var0, int var1, int var2, int var3) {
        if (!hso_ft.B) {
            if (hso_cs.k == 3 || hso_cs.k == 8) {
                hso_en var4;
                (var4 = new hso_en()).a = var0;
                var4.b = var1;
                var4.g = var2;
                var4.o = 40;
                if (var4.g == 0) {
                    var4.o = hso_ak.c(28, 43);
                    var4.q = 1;
                    var4.v = true;
                    var4.r = hso_ak.c(var4.o / 2 - 5, var4.o / 2 + 6);
                } else if (var4.g == 1) {
                    return;
                }

                switch (var3) {
                    case 1:
                        var4.m = 0;
                        break;
                    case 0:
                        var4.m = 3;
                        break;
                    case 2:
                        var4.m = 6;
                        break;
                    case 3:
                        var4.m = 5;
                        break;
                    default:
                        break;
                }

                if (var4.g == 0) {
                    l.a(var4);
                } else {
                    bb.a(var4);
                }
            }
        }
    }

    public static void a(int var0, int var1, int var2, int var3, short var4, byte var5, short var6, boolean var7) {
        try {
            for (int var11 = 0; var11 < hso_br.b.c(); ++var11) {
                hso_dx var8;
                if ((var8 = (hso_dx) hso_br.b.a(var11)) != null && !var8.x && var8.d == var0 && var8.s != null && var8.s.ct == var4) {
                    var8.a((short) var3);
                    var8.s.bb = 0;
                    var8.s.bc = 0;
                    var8.s.bf = var1;
                    var8.s.bg = var2;
                    if (var0 == 101) {
                        var8.s.dK = true;
                        return;
                    }

                    if (var0 == 102) {
                        var8.s.dJ = true;
                        return;
                    }

                    if (var0 == 107) {
                        var8.s.dL = true;
                        return;
                    }

                    if (var0 == 103) {
                        var8.s.dM = true;
                        return;
                    }

                    var8.s.bH = true;
                    return;
                }
            }

            var7 = false;
            boolean var9 = true;
            hso_i var10;
            (var10 = new hso_i(var0, var1, var2, var3, var4, var5)).a((short) var6, (byte) 1);
            if (var7) {
                hso_br.b(var10);
            } else {
                hso_br.a((hso_dx) var10, "game scren: public static void a(int var0, int var1, int var2, int var3, short var4, byte var5, short var6, boolean var7))");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static MainObject b(MainObject var0) {
        for (int var1 = 0; var1 < i.c(); ++var1) {
            MainObject var2;
            if ((var2 = (MainObject) i.a(var1)) != null && var2.a(var0)) {
                return var2;
            }
        }

        return null;
    }

    public static MainObject a(short var0) {
        for (int var1 = 0; var1 < i.c(); ++var1) {
            MainObject var2;
            if ((var2 = (MainObject) i.a(var1)) != null && var2.cu == 0 && var2.ct == var0) {
                return var2;
            }
        }

        return null;
    }

    public static MainObject b(short var0) {
        for (int var1 = 0; var1 < i.c(); ++var1) {
            MainObject var2;
            if ((var2 = (MainObject) i.a(var1)) != null && var2.cu == 1 && var2.ct == var0) {
                return var2;
            }
        }

        return null;
    }

    public static MainObject a(short var0, byte var1) {
        for (int var2 = 0; var2 < i.c(); ++var2) {
            MainObject var3;
            if ((var3 = (MainObject) i.a(var2)) != null && var3.cu == var1 && var3.ct == var0) {
                return var3;
            }
        }

        return null;
    }

    public static MainObject c(short var0) {
        for (int var1 = 0; var1 < i.c(); ++var1) {
            MainObject var2;
            if ((var2 = (MainObject) i.a(var1)) != null && var2.ct == var0) {
                return var2;
            }
        }

        return null;
    }

    public static void a(int var0, MainObject var1, MainObject var2, int var3, int var4, int var5, short var6, int var7, int var8) {
        hso_dd var9;
        (var9 = new hso_dd()).a(15, var3, var4, var5, var6, var1, var2);
        var9.b = var7;
        var9.c = var8;
        bm.a(var9);
    }

    public final boolean f() {
        return true;
    }
}
