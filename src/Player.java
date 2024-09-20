
public final class Player extends MainObject {

    public static hso_bt a;
    public static hso_bt b;
    public static hso_bt c;
    public static int d = 0;
    public static int e = 0;
    public static int f = 21;
    public static int g = 0;
    public static int h = 0;
    public static int i = 0;
    public static long j;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean m = false;
    public static boolean n = true;
    public static byte o = 1;
    public static byte p = 0;
    public static hso_be q;
    private static boolean ej = false;
    public static hso_ad[] r;
    public static hso_ad[] s;
    public static int t;
    public static int u;
    public static int[][] v;
    public static hso_ao[][] w;
    public static short x;
    public static short y;
    public static short z;
    public static byte A;
    private byte ek;
    private long el;
    public boolean B;
    public boolean C;
    public int D;
    public static byte[] E;
    private hso_cj em;
    public int F = 1000000;
    public int G = 1000000;
    public static int[] H;
    public static int[] I;
    public static int[] J;
    public String[] K = new String[5];
    public hso_cz[] L;
    public hso_ew M;
    public static hso_w N;
    public static int O;
    public static int P;
    public static int Q;
    public static int R;
    public static int S;
    public static short[] T;
    public hso_y U;
    private int en;
    private static byte eo;
    private long ep;
    private static short eq;
    private static int er;
    private static int es;
    private static byte et;
    private static byte eu;
    private int ev = 0;
    public static boolean V;
    public static int W;
    public static boolean X;

    static {
        r = new hso_ad[f];
        s = new hso_ad[3];
        t = 0;
        u = 0;
        v = hso_dw.a(2, 4);
        w = new hso_ao[3][];
        x = 42;
        y = 20;
        z = 24;
        A = 0;

        for (int var0 = 0; var0 < w.length; ++var0) {
            w[var0] = new hso_ao[5];
        }

        H = new int[f];
        I = new int[f];
        J = new int[f];
        O = -1;
        P = -1;
        Q = 0;
        R = -1;
        S = -1;
        T = new short[0];
        eo = 0;
        eq = 0;
        er = 0;
        et = -1;
        eu = 0;
        V = false;
        W = 0;
        X = false;
    }

    public final boolean c_() {
        return true;
    }

    public Player(int var1, byte var2, String var3, int var4, int var5) {
        super(var1, (byte) 0, var3, var4, var5);
        N = null;
        super.cu = 0;
        super.be = 40;
        super.bd = 30;
        super.bi = 6;
        super.cB = var3;
        super.bh = 140;
        a = new hso_bt(hso_df.aa, 0, this);
        (b = new hso_bt(hso_df.cc, 1, this)).a(hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, b.a);
        (c = new hso_bt(hso_df.bC, 2, this)).a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, c.a);
        super.dg = new hso_ds();
        super.dh = new hso_dh();
        k = false;
        super.bn = 1;
        super.bo = 2;

        for (var1 = 0; var1 < r.length; ++var1) {
            r[var1] = new hso_ad();
            r[var1].b = 0;
            r[var1].a = hso_dw.a();
        }

        for (var1 = 0; var1 < s.length; ++var1) {
            s[var1] = new hso_ad();
            s[var1].b = 0;
            s[var1].a = hso_dw.a();
        }

        this.el = hso_dw.a();
        this.D = -1;
    }

    public final void p() {
        hso_fn var1 = new hso_fn(hso_bw.V, (byte) 0, hso_df.dx, -1, (byte) 0);
        hso_es var2;
        (var2 = new hso_es("Player (init) v")).a(var1);
        hso_af var6 = new hso_af(hso_df.dp);
        var2.a(var6);
        hso_m var7 = new hso_m(hso_df.dq);
        var2.a(var7);
        this.U = new hso_y(hso_df.dr);
        var2.a(this.U);
        hso_dr var3 = new hso_dr();
        var2.a(var3);
        hso_es var4 = new hso_es("Player mcmdTest");
        hso_bg var8;
        if (hso_ft.A) {
            var8 = new hso_bg(hso_df.du, var4, (byte) 11);
            var2.a(var8);
        } else {
            var8 = new hso_bg(hso_df.dt, var4, (byte) 7);
            var2.a(var8);
            hso_bg var5 = new hso_bg(hso_df.du, var4, (byte) 11);
            var2.a(var5);
        }

        hso_ft.u.a(var2);
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.W();
                return;
            case 1:
                Service.a().b((byte) 1);
                hso_ft.a(hso_df.aG);
                return;
            case 2:
                hso_ft.c(hso_df.bD, new hso_bt(c.a, 3, this));
                return;
            case 3:
                Service.a().b((byte) 0);
            case 5:
                hso_ft.j();
            default:
                return;
            case 4:
                Service.a().a(4, (hso_es) null, "", (short) 0, 0, (byte) 0);
        }
    }

    public final void a(byte var1, boolean var2) {
        this.ek = 4;
        this.C = var2;
    }

    public final void a(mGraphics var1) {
        try {
            this.c(var1, 100);
            this.j(var1);
            Player var2;
            if ((var2 = this).em != null && !var2.em.d.equals("")) {
                var2.em.a(var1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public final void b(mGraphics var1, int var2, int var3) {
    }

    public final void a() {
        try {
            this.J();
            int var2;
            if (this.M == null) {
                Player var1 = this;
                if (o != 1 && (GameScreen.h == null || GameScreen.h.cx != 2 && !GameScreen.h.x())) {
                    if (GameScreen.h != null) {
                        if ((GameScreen.h.cF != 4 || GameScreen.h.cu == 0) && MainObject.c(GameScreen.h.aY, GameScreen.h.aZ, super.aY, super.aZ) <= super.bh + 20 && (!GameScreen.h.dj || GameScreen.h.cu != 1)) {
                            if (!hso_ft.A && (GameScreen.h.cu == 2 || GameScreen.h.cu == 0 && !this.b(GameScreen.h) && GameScreen.b().aa != GameScreen.b().s && (super.cv == -1 || super.cv == 10 || hso_cs.a()))) {
                                GameScreen.b().aa = GameScreen.b().s;
                            }
                        } else if (!hso_cf.i()) {
                            GameScreen.h = null;
                            hso_cf.K = false;
                        }
                    }

                    if (GameScreen.h == null) {
                        if (GameScreen.b().aa != null) {
                            GameScreen.b().aa = null;
                        }

                        var2 = GameScreen.i.c();
                        if (this.ev > var2 - 1) {
                            this.ev = var2 - 1;
                        }

                        int var3 = 1000;
                        byte var4 = -1;
                        MainObject var6 = null;

                        for (int var7 = 0; var7 < var2; ++var7) {
                            int var5 = 0;
                            MainObject var8;
                            if ((var8 = (MainObject) GameScreen.i.a((var7 + var1.ev) % var2)) != null) {
                                var5 = MainObject.c(var8.aY, var8.aZ, var1.aY, var1.aZ);
                            }

                            if (var5 <= var1.bh) {
                                byte var9 = var8.cu;
                                byte var10 = -1;
                                switch (var9) {
                                    case 0:
                                    case 2:
                                        var10 = 0;
                                        break;
                                    case 1:
                                        var10 = 1;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 7:
                                        var10 = 2;
                                    case 6:
                                }

                                if (var8.ct != GameScreen.f.ct && (var8.cF != 4 || var8.cu == 0) && !var8.cK && var10 >= var4 && (!var8.dj || var8.cu != 1) && var8.cu != 9 && !var8.x() && !var8.bI && (var5 < var1.bh || var6 != null && (var6.cu == 0 || var6.cu == 2) && (var8.cu == 3 || var8.cu == 1 || var8.cu == 4 || var8.cu == 5 || var8.cu == 7)) && (var5 < var3 || var10 > var4) && (var8.cu != 0 && var8.cu != 2 || eu >= 20 || et == 0 || et == 2)) {
                                    var6 = var8;
                                    var3 = var5;
                                    var1.ev = var7;
                                    var4 = var10;
                                }
                            }
                        }

                        if (var6 != null) {
                            if (var6.b()) {
                                GameScreen.h = var6;
                                if (!hso_ft.A) {
                                    if ((GameScreen.h == null || GameScreen.h.cu != 2) && (GameScreen.h.cu != 0 || var1.b(GameScreen.h) || var1.cv != -1 && var1.cv != 10 && !hso_cs.a())) {
                                        if (GameScreen.b().aa == GameScreen.b().s) {
                                            GameScreen.b().aa = null;
                                        }
                                    } else {
                                        GameScreen.b().aa = GameScreen.b().s;
                                    }

                                    GameScreen.b().Z = a;
                                }
                            }
                        } else if (GameScreen.b().Z == a) {
                            GameScreen.b().Z = null;
                        }
                    }
                }
            }

            this.a(true);
            if (l && super.cF != 4 && hso_ft.ai % 5 == 0) {
                hso_ao var14;
                hso_bw var16;
                if (super.br * 100 / super.bs < hso_ah.e[0] && (var14 = w[d][4]).b == hso_ao.f && var14.c == 0 && (var16 = hso_bw.a(4, (short) var14.a)) != null && var16.L < 2 && s[var16.L].b <= 0) {
                    Service.a().e((short) var16.O);
                    s[var16.L].b = 2000;
                    s[var16.L].c = 2000;
                    s[var16.L].a = hso_dw.a();
                }

                if (super.bt * 100 / super.bu < hso_ah.e[1] && (var14 = w[d][3]) != null && var14.b == hso_ao.f && var14.c == 1 && (var16 = hso_bw.a(4, (short) var14.a)) != null && s[var16.L].b <= 0) {
                    Service.a().e((short) var16.O);
                    s[var16.L].b = 2000;
                    s[var16.L].c = 2000;
                    s[var16.L].a = hso_dw.a();
                }
            }

            if (super.cz != -1) {
                if (hso_ak.e(super.aY - super.bl) <= 4 && hso_ak.e(super.aZ - super.bm) <= 4) {
                    ++super.bE;
                    super.cN = null;
                    super.dh.a(this, super.cR, super.cz, (byte) -1);
                    if (super.bE > 5) {
                        super.dh.b();
                        super.bE = 0;
                        super.cz = -1;
                    }
                }

                if (super.cN == null && (hso_ak.e(super.aY - super.bl) > 4 || hso_ak.e(super.aZ - super.bm) > 4)) {
                    this.L();
                }
            } else {
                super.bE = 0;
            }

            if (super.br <= 0 && super.cF != 4) {
                this.N();
                super.cF = 4;
                if (hso_cs.w == 1) {
                    GameScreen.b().aa = c;
                    c.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, c.a);
                } else if (hso_cs.w == 2) {
                    GameScreen.b().aa = b;
                    b.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, b.a);
                } else if (!hso_cf.i()) {
                    GameScreen.b().Y = b;
                    GameScreen.b().Z = c;
                    b.a(hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, b.a);
                    c.a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, c.a);
                }

                GameScreen.a(11, super.aY, super.aZ);
            }

            if (this.M == null) {
                if (super.cF == 4 && !hso_cf.i()) {
                    if (hso_cs.w == 1) {
                        if (GameScreen.b().aa != c) {
                            GameScreen.b().aa = c;
                            c.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, c.a);
                        }
                    } else if (hso_cs.w == 2) {
                        if (GameScreen.b().aa != b) {
                            GameScreen.b().aa = b;
                            b.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, b.a);
                        }
                    } else {
                        if (GameScreen.b().Y != b) {
                            GameScreen.b().Y = b;
                            b.a(hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, b.a);
                        }

                        if (GameScreen.b().Z != c) {
                            GameScreen.b().Z = c;
                            c.a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, c.a);
                        }
                    }
                } else if (hso_ft.A) {
                    if (hso_cs.w == 1) {
                        if (GameScreen.b().aa == c) {
                            GameScreen.b().aa = null;
                        }
                    } else if (hso_cs.w == 2) {
                        if (GameScreen.b().aa == b) {
                            GameScreen.b().aa = null;
                        }
                    } else {
                        if (GameScreen.b().Y == b) {
                            GameScreen.b().Y = null;
                        }

                        if (GameScreen.b().Z == c) {
                            GameScreen.b().Z = null;
                        }
                    }
                } else {
                    if (super.aa == b) {
                        super.aa = null;
                    }

                    if (GameScreen.b().Z == null || GameScreen.b().Z != a) {
                        GameScreen.b().Z = a;
                    }

                    if (GameScreen.b().Y != GameScreen.b().r) {
                        GameScreen.b().Y = GameScreen.b().r;
                    }
                }
            }

            label850:
            {
                if (super.cN != null) {
                    if (super.bH) {
                        break label850;
                    }

                    if (hso_ak.e(super.aY - super.bf) <= 6 && hso_ak.e(super.aZ - super.bg) <= 6) {
                        if (super.cI > super.cN.length - 1) {
                            super.cI = 0;
                            super.cN = null;
                            er = 0;
                            super.cl = 0;
                            super.cm = 0;
                        } else {
                            if (super.cI == super.cN.length - 1 && super.cl > 0 && super.cm > 0) {
                                super.bf = super.cl;
                                super.bg = super.cm;
                            } else {
                                byte var15 = (byte) (super.cN[super.cI] >> 8);
                                byte var17 = (byte) super.cN[super.cI];
                                super.bf = var15 * hso_cs.l + hso_cs.l / 2;
                                super.bg = var17 * hso_cs.l + hso_cs.l / 2;
                            }

                            ++super.cI;
                        }
                    }

                    this.h();
                } else {
                    if (!n) {
                        n = true;
                        super.cj = super.aY;
                        super.ck = super.aZ;
                    }

                    if (m && !GameScreen.p.d(0, -4) && !GameScreen.p.d(0, -2)) {
                        m = false;
                    }
                }

                var2 = MainObject.c(super.cj, super.ck, super.aY, super.aZ);
                boolean var18 = false;
                if (hso_dw.a() - this.el > 250L && er <= 0) {
                    var18 = true;
                }

                if (super.cN != null && hso_dw.a() - this.el > 250L) {
                    var18 = true;
                }

                if (var18 || er > 20 && var2 >= 5 && super.cN == null) {
                    if (n && !super.dZ) {
                        Service.a().a((short) super.aY, (short) super.aZ);
                        this.el = hso_dw.a();
                    }

                    super.cj = super.aY;
                    super.ck = super.aZ;
                }

                Player var19;
                if (q != null && hso_ft.ai % 5 == 0) {
                    var19 = this;
                    int var21;
                    if (hso_ft.ai % 200 == 0) {
                        var21 = hso_bw.V.c();
                        if (ej) {
                            if (var21 < x) {
                                ej = false;
                            } else {
                                hso_ft.c(hso_df.dF);
                                if (GameScreen.h != null && (GameScreen.h.cu == 4 || GameScreen.h.cu == 3 || GameScreen.h.cu == 5 || GameScreen.h.cu == 7 || GameScreen.h.cu == 3)) {
                                    this.W();
                                }
                            }
                        } else if (var21 >= x) {
                            ej = true;
                        }
                    }

                    for (var21 = 0; var21 < GameScreen.i.c(); ++var21) {
                        MainObject var22;
                        if ((var22 = (MainObject) GameScreen.i.a(var21)) != null && !var22.dy && (var22.cu == 4 || var22.cu == 3 || var22.cu == 5 || var22.cu == 7)) {
                            boolean var10000;
                            label589:
                            {
                                switch (var22.cu) {
                                    case 3:
                                        if (!ej && q.a != -1 && var22.cs >= q.a) {
                                            var10000 = true;
                                            break label589;
                                        }
                                        break;
                                    case 4:
                                        if (var22.cs == 0) {
                                            if (q.c == hso_be.e || q.c == 0) {
                                                var10000 = true;
                                                break label589;
                                            }
                                        } else {
                                            if (var22.cs != 1) {
                                                var10000 = var22.cs == 2 ? true : (var22.cs == 6 ? true : true);
                                                break label589;
                                            }

                                            if (q.c == hso_be.f || q.c == 0) {
                                                var10000 = true;
                                                break label589;
                                            }
                                        }
                                        break;
                                    case 5:
                                    case 7:
                                        var10000 = true;
                                        break label589;
                                    case 6:
                                }

                                var10000 = false;
                            }

                            if (var10000 && MainObject.c(var19.aY, var19.aZ, var22.aY, var22.aZ) < var19.bh) {
                                Service.a().a((short) var22.ct, var22.cu);
                            }

                            var22.dy = true;
                        }
                    }
                }

                if (o == 1 && super.cN == null) {
                    if (e <= 0) {
                        o = 0;
                    }

                    if (o == 1) {
                        if (super.cF == 0) {
                            ++this.en;
                        } else {
                            this.en = 0;
                        }

                        if (this.en > 500) {
                            hso_ft.c(hso_df.aR);
                            super.cz = -1;
                            super.cQ = -1;
                            super.cR = null;
                            this.en = 0;
                            this.X();
                        }
                    }

                    if (super.cF != 2 && super.cF != 4 && (MainObject.c(super.aY, super.aZ, R, S) > super.bh * 3 / 2 || eq > 100)) {
                        super.bf = super.aY;
                        super.bg = super.aZ;
                        super.cl = R;
                        super.cm = S;
                        super.cN = hso_ft.c.a(super.cl / hso_cs.l, super.cm / hso_cs.l, super.aY / hso_cs.l, super.aZ / hso_cs.l, (int) 20);
                        O = -1;
                        P = -1;
                        if (super.cN != null && super.cN.length > 20) {
                            super.cN = null;
                        }
                    }

                    if (super.cN == null && super.cF != 2 && super.cF != 4) {
                        var19 = this;
                        if (dh.e()) {
                            long var23 = System.currentTimeMillis();
                            MainObject var20;
                            if ((var20 = GameScreen.h) == null || var20.cF == 4 || var20.cu != 1 || var20.dy || var20.dj) {
                                if (var20 != null && var20.dj) {
                                    GameScreen.h = null;
                                }

                                this.q();
                            }

                            if (GameScreen.h != null && GameScreen.h.cu == 1 && GameScreen.h.cx != 2) {
                                label831:
                                {
                                    int var24;
                                    if (p == 1 && (var23 - this.ep) / (long) dh.h > 2L) {
                                        this.ep = var23;

                                        for (var24 = 0; var24 < hso_ah.b; ++var24) {
                                            hso_ev var25;
                                            if (hso_ah.f[var24][1] != 0 && var19.j(hso_ah.f[var24][0], -1) && (var25 = hso_ct.c(hso_ah.f[var24][0])).e == 1) {
                                                var19.a(var25.g, hso_ah.f[var24][0], GameScreen.h);
                                            }
                                        }
                                    }

                                    hso_ao var26;
                                    if (eo < w[0].length - 1) {
                                        for (var24 = eo + 1; var24 < w[0].length; ++var24) {
                                            if ((var26 = w[d][var24]).b == 0 && var19.j(var26.a, -1)) {
                                                var19.a(var24, false);
                                                eo = (byte) var24;
                                                break label831;
                                            }
                                        }
                                    }

                                    if (eo > 0) {
                                        for (var24 = 0; var24 <= eo; ++var24) {
                                            if ((var26 = w[d][var24]).b == 0 && var19.j(var26.a, -1)) {
                                                var19.a(var24, false);
                                                eo = (byte) var24;
                                                break label831;
                                            }
                                        }
                                    }

                                    if (var19.j(0, -1)) {
                                        var19.a((int) -1, false);
                                    }
                                }
                            }
                        }
                    }

                    if (super.cF == 4) {
                        o_();
                    }
                }

                if (GameScreen.h != null) {
                    et = GameScreen.h.cu;
                    eu = 0;
                } else if (eu < 20) {
                    ++eu;
                }

                if ((super.bb != 0 || super.bc != 0) && W < 5) {
                    W = 10;
                }

                if (!V && W > 5 && ++W > 60) {
                    V = true;
                    W = 0;
                }

                if (o == 1 && GameScreen.h != null && MainObject.c(R, S, GameScreen.h.aY, GameScreen.h.aZ) > 240) {
                    this.q();
                }
            }

            this.K();
            if (N != null) {
                hso_w var12 = N;

                for (var2 = 0; var2 < var12.b.c(); ++var2) {
                    var12.b.a(var2);
                }
            }

            int var13;
            hso_ad var27;
            for (var13 = 0; var13 < r.length; ++var13) {
                if (r[var13] != null && r[var13].b > -150) {
                    var27 = r[var13];
                    var27.b -= (int) (hso_dw.a() - r[var13].a);
                    r[var13].a = hso_dw.a();
                }
            }

            for (var13 = 0; var13 < s.length; ++var13) {
                if (s[var13].b > -150) {
                    var27 = s[var13];
                    var27.b -= (int) (hso_dw.a() - s[var13].a);
                    s[var13].a = hso_dw.a();
                }
            }

            this.I();
            if (h > 0) {
                --h;
            }

            if ((super.bb != 0 || super.bc != 0) && !super.bF && hso_ft.ai % 3 == 0) {
                if (!super.cV && !super.bK) {
                    if (super.Direction == 2) {
                        GameScreen.b(super.aY + hso_ak.b(0, 3), super.aZ + hso_ak.b(0, 3), 0, super.Direction);
                    } else if (super.Direction == 3) {
                        GameScreen.b(super.aY + hso_ak.b(0, 3), super.aZ + hso_ak.b(0, 3), 0, super.Direction);
                    } else {
                        GameScreen.b(super.aY + hso_ak.b(0, 3), super.aZ + hso_ak.b(0, 3), 0, super.Direction);
                    }
                } else {
                    GameScreen.b(super.aY, super.aZ, 1, super.Direction);
                }
            }

            this.R();
            this.S();
            if (this.em != null) {
                this.em.d(super.aY, super.aZ - super.be - 30);
            }

            super.a();
            if (this.ek > 0) {
                this.B = true;
                --this.ek;
            } else {
                this.B = false;
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }

    public final void q() {
        if (!X) {
            o = -1;
        } else {
            int var1 = super.bh * 3 / 2;
            MainObject var2 = null;

            for (int var3 = 0; var3 < GameScreen.i.c(); ++var3) {
                MainObject var4;
                int var5;
                if ((var4 = (MainObject) GameScreen.i.a(var3)) != null && var4.cF != 4 && !var4.dy && var4.cu == 1 && !var4.x() && ((var5 = MainObject.c(super.aY, super.aZ, var4.aY, var4.aZ)) < var1 || var4.cx == 2)) {
                    var1 = var5;
                    var2 = var4;
                    if (var4.cx == 2) {
                        break;
                    }
                }
            }

            if (var2 != null) {
                hso_cf.K = true;
                GameScreen.h = var2;
                eq = 0;
            } else {
                hso_cf.K = false;
                ++eq;
            }
        }
    }

    public final void r() {
        if (this.H()) {
            if (hso_cs.i != hso_cs.j) {
                if (!m) {
                    if (this.M != null) {
                        if (!hso_ft.o.a) {
                            if (++es > 100) {
                                this.M = null;
                                GameScreen.b().aa = null;
                                hso_ft.m();
                                hso_ft.S = false;
                            }
                        } else {
                            es = 0;
                        }
                    } else {
                        if (super.cF != 4 && !super.bF) {
                            if (!super.bH && !super.dK && !super.dJ && !super.dZ && !super.bI && super.cF != 2 && super.cF != 3) {
                                super.bb = 0;
                                super.bc = 0;
                                hso_es var1;
                                if (hso_ft.e(2)) {
                                    if (!this.e_()) {
                                        super.cF = 1;
                                        super.Direction = 2;
                                        super.bb = -(super.bi + this.Q());
                                        super.bc = 0;
                                        this.u();
                                        a(0);
                                    } else {
                                        (var1 = new hso_es()).a(new hso_bt(hso_df.ga, 4, this));
                                        var1.a(new hso_bt(hso_df.as, 5, this));
                                        hso_ft.a(hso_df.v, var1);
                                    }
                                } else if (hso_ft.e(3)) {
                                    if (!this.e_()) {
                                        super.cF = 1;
                                        super.Direction = 3;
                                        super.bb = super.bi + this.Q();
                                        super.bc = 0;
                                        this.u();
                                        a(0);
                                    } else {
                                        (var1 = new hso_es()).a(new hso_bt(hso_df.ga, 4, this));
                                        var1.a(new hso_bt(hso_df.as, 5, this));
                                        hso_ft.a(hso_df.v, var1);
                                    }
                                } else if (hso_ft.e(1)) {
                                    if (!this.e_()) {
                                        super.cF = 1;
                                        super.Direction = 1;
                                        super.bc = -(super.bi + this.Q());
                                        super.bb = 0;
                                        this.u();
                                        a(0);
                                    } else {
                                        (var1 = new hso_es()).a(new hso_bt(hso_df.ga, 4, this));
                                        var1.a(new hso_bt(hso_df.as, 5, this));
                                        hso_ft.a(hso_df.v, var1);
                                    }
                                } else if (hso_ft.e(0)) {
                                    if (!this.e_()) {
                                        super.cF = 1;
                                        super.Direction = 0;
                                        super.bc = super.bi + this.Q();
                                        super.bb = 0;
                                        this.u();
                                        a(0);
                                    } else {
                                        (var1 = new hso_es()).a(new hso_bt(hso_df.ga, 4, this));
                                        var1.a(new hso_bt(hso_df.as, 5, this));
                                        hso_ft.a(hso_df.v, var1);
                                    }
                                }

                                if (super.bb == 0 && super.bc == 0) {
                                    ++er;
                                } else {
                                    er = 0;
                                }
                            }

                            if (hso_ft.al[10] && !hso_ft.A) {
                                hso_ft.d(10);
                                hso_d.b = !hso_d.b;
                            }

                            if (hso_ft.al[11] && !hso_ft.A) {
                                hso_ft.d(11);
                                hso_ft.h.g();
                                hso_ft.h.a(hso_ft.a);
                            }
                        }

                        if (hso_ft.ak[21]) {
                            this.a((int) 0, true);
                        } else if (hso_ft.ak[23]) {
                            this.a((int) 1, true);
                        } else if (!hso_ft.al[5] && !hso_ft.ak[25]) {
                            if (hso_ft.ak[27]) {
                                this.a((int) 3, true);
                            } else if (hso_ft.ak[29]) {
                                this.a((int) 4, true);
                            }
                        } else {
                            this.a((int) 2, true);
                        }
                    }

                    if (hso_ft.al[20]) {
                        if ((GameScreen.h == null || GameScreen.h.cx != 2) && hso_cf.C == 0) {
                            hso_cf.C = 1;
                        }

                        hso_ft.d(20);
                    }

                }
            }
        }
    }

    private void W() {
        if (GameScreen.h == null || GameScreen.h.cx != 2) {
            a(0);
            MainObject var1 = null;
            boolean var2 = false;
            boolean var3 = false;
            int var4;
            MainObject var5;
            if (V) {
                for (var4 = 0; var4 < GameScreen.i.c(); ++var4) {
                    var5 = (MainObject) GameScreen.i.a(var4);
                    if ((!GameScreen.q.c(hso_ft.p.d) || var5.cv != super.cv || var5.cu != 0) && var5.i_() && (GameScreen.h == null || var5 != GameScreen.h) && MainObject.c(var5.aY, var5.aZ, super.aY, super.aZ) < super.bh) {
                        this.ev = var4;
                        GameScreen.h = var5;
                        if (!hso_ft.A) {
                            if (var5.cu != 2 && (GameScreen.h == null || GameScreen.h.cu != 0 || this.b(GameScreen.h) || super.cv != -1 && super.cv != 10 && !hso_cs.a())) {
                                if (GameScreen.b().aa == GameScreen.b().s) {
                                    GameScreen.b().aa = null;
                                }
                            } else {
                                GameScreen.b().aa = GameScreen.b().s;
                            }
                        }

                        V = false;
                        return;
                    }
                }
            }

            var1 = null;
            int var8 = -1;
            int var9 = -1;

            for (var4 = 0; var4 < GameScreen.i.c(); ++var4) {
                if ((var5 = (MainObject) GameScreen.i.a(var4)) != GameScreen.f && (var5.cF != 4 || var5.cu == 0)) {
                    boolean var10000;
                    if (hso_cs.a()) {
                        var10000 = true;
                    } else if (var5.cu == 2) {
                        var10000 = true;
                    } else if (super.cv != -1 && super.cv != 10) {
                        if (var5.cu == 1 && var5.di == 7) {
                            var10000 = true;
                        } else if (var5.D()) {
                            var10000 = true;
                        } else {
                            label276:
                            {
                                if (var5.cu == 0) {
                                    if (var5.cv == 0 || var5.cv == 10) {
                                        var10000 = true;
                                        break label276;
                                    }

                                    if (var5.cv != super.cv && var5.cv != -1) {
                                        var10000 = true;
                                        break label276;
                                    }

                                    if (super.cv == 0) {
                                        var10000 = true;
                                        break label276;
                                    }
                                }

                                var10000 = false;
                            }
                        }
                    } else {
                        var10000 = true;
                    }

                    if (var10000 && var5.cu != 9 && var5.cu != 10 && !var5.x() && !var5.bI && var5.b() && (!hso_cf.e(hso_ft.p.d) || var5.cu != 0 || var5.e_()) && (var5.cu != 4 && var5.cu != 3 && var5.cu != 5 && var5.cu != 7 || q == null)) {
                        if (GameScreen.h != null && var5 == GameScreen.h) {
                            var9 = var4;
                        } else if ((var1 == null || var9 >= 0) && MainObject.c(var5.aY, var5.aZ, super.aY, super.aZ) < super.bh) {
                            var1 = var5;
                            var8 = var4;
                        }

                        if (var9 >= 0 && var8 > var9) {
                            this.ev = var4;
                            GameScreen.h = var1;
                            if (!hso_ft.A) {
                                if (var1.cu == 2 || GameScreen.h.cu == 0 && !this.b(GameScreen.h) && (super.cv == -1 || super.cv == 10 || hso_cs.a())) {
                                    GameScreen.b().aa = GameScreen.b().s;
                                    return;
                                }

                                if (GameScreen.b().aa == GameScreen.b().s) {
                                    GameScreen.b().aa = null;
                                }
                            }

                            return;
                        }
                    }
                }
            }

            if (var1 != null) {
                GameScreen.h = var1;
                if (!hso_ft.A) {
                    if (var1.cu == 2 || GameScreen.h.cu == 0 && !this.b(GameScreen.h) && (super.cv == -1 || super.cv == 10 || hso_cs.a())) {
                        GameScreen.b().aa = GameScreen.b().s;
                        return;
                    }

                    if (GameScreen.b().aa == GameScreen.b().s) {
                        GameScreen.b().aa = null;
                    }
                }
            }

        }
    }

    public final void a(int var1, boolean var2) {
        hso_ft.n();
        if (super.cF != 4 && GameScreen.h != null && GameScreen.h.cu == 1 && GameScreen.h.cx == 2) {
            if (var1 >= 0 && var1 <= 5) {
                Service.a().f((byte) var1);
            }

        } else {
            if (GameScreen.h != null && GameScreen.h.cu == 1) {
                if (GameScreen.h.D()) {
                    if (GameScreen.h.f().equals(super.cB)) {
                        GameScreen.b().H.a();
                        return;
                    }

                    if (!GameScreen.h.f().equals(super.cB)) {
                        if (super.cv != 0 && !this.E()) {
                            return;
                        }

                        if (super.cv == 11) {
                            if (!GameScreen.h.C()) {
                                return;
                            }
                        } else if (super.cv == 12) {
                            if (!GameScreen.h.B()) {
                                return;
                            }
                        } else if (super.cv == 13 && !GameScreen.h.C()) {
                            return;
                        }
                    }
                }

                if (GameScreen.h.l_()) {
                    GameScreen.b().J.a();
                    return;
                }
            }

            hso_ao var6;
            if (var1 == -1) {
                (var6 = new hso_ao()).a(0, 0, (byte) 0);
            } else {
                var6 = w[d][var1];
            }

            if (var6.b == hso_ao.f) {
                hso_bw var9;
                if ((var9 = hso_bw.a(4, (short) var6.a)) != null && var9.L < 2) {
                    if (s[var9.L].b <= 0 && (var9.L != 0 || super.br != super.bs) && (var9.L != 1 || super.bt != super.bu)) {
                        Service.a().e((short) var9.O);
                        s[var9.L].b = 2000;
                        s[var9.L].c = 2000;
                        s[var9.L].a = hso_dw.a();
                        return;
                    }
                } else if (GameScreen.h != null && GameScreen.h.cu == 2 && var1 == 2) {
                    GameScreen.b().s.a();
                    return;
                }

            } else {
                hso_ev var3;
                hso_es var4;
                hso_bf var8;
                if (GameScreen.h == null) {
                    if (var6.b == 0 && this.j(var6.a, var1) && (var3 = hso_ct.c(var6.a)).e == 1 && (var3.g == 1 || var3.g == 2)) {
                        super.cN = null;
                        super.cQ = super.ct;
                        var4 = new hso_es("Player vec");
                        var8 = new hso_bf((short) super.ct, super.cu);
                        var4.a(var8);
                        super.dh.a(this, var4, var6.a, (byte) -1);
                    }
                } else if (GameScreen.h.cu != 3 && GameScreen.h.cu != 4 && GameScreen.h.cu != 5 && GameScreen.h.cu != 7) {
                    if (GameScreen.h.cu == 2 && var1 == 2) {
                        GameScreen.b().s.a();
                    } else if (super.cF != 2 && super.cF != 4 && this.M == null && !super.bF) {
                        if (var6.b == 0 && this.j(var6.a, var1)) {
                            if ((var3 = hso_ct.c(var6.a)).e == 1) {
                                if (this.a(var3.g, var6.a, GameScreen.h)) {
                                    return;
                                }
                            } else if (var3.e == 0 && GameScreen.h.cF != 4 && GameScreen.h.cu != 2) {
                                if (this.b(GameScreen.h)) {
                                    short var5 = var6.a;
                                    super.cN = null;
                                    if (GameScreen.h != null) {
                                        super.cQ = GameScreen.h.ct;
                                        hso_es var7 = new hso_es("Player vec8");
                                        var8 = new hso_bf((short) GameScreen.h.ct, GameScreen.h.cu);
                                        var7.a(var8);
                                        super.dh.a(this, var7, var5, (byte) -1);
                                        System.currentTimeMillis();
                                        if (GameScreen.h.cu == 1 && o == 0) {
                                            o = 1;
                                            X = true;
                                            R = super.aY;
                                            S = super.aZ;
                                        }
                                    }

                                    return;
                                }

                                if (GameScreen.h.cu == 1 && GameScreen.h.di == 7 && super.cO != null && GameScreen.h.cO != null && super.cO.b == GameScreen.h.cO.b) {
                                    var4 = new hso_es("Player vec2");
                                    var8 = new hso_bf((short) GameScreen.h.ct, GameScreen.h.cu);
                                    var4.a(var8);
                                    dw.a("Att 1");
                                    Service.a().a((hso_es) var4, (byte) 0);
                                    if (o == 1) {
                                        o_();
                                    }

                                    return;
                                }
                            }
                        }

                        if (GameScreen.h != null && GameScreen.h.cu == 0 && var1 == 2 && !this.b(GameScreen.h)) {
                            if (GameScreen.h.e_()) {
                                GameScreen.b().I.a();
                                return;
                            }

                            if (super.cv == -1 || super.cv == 10 || hso_cs.a()) {
                                GameScreen.b().s.a();
                                return;
                            }
                        }

                    } else {
                        if (super.cF == 4 && GameScreen.h.cu == 0 && var1 == 2 && (super.cv == -1 || super.cv == 10 || hso_cs.a())) {
                            GameScreen.b().s.a();
                        }

                    }
                } else {
                    if (!GameScreen.h.dy) {
                        Service.a().a((short) GameScreen.h.ct, GameScreen.h.cu);
                        GameScreen.h.dy = true;
                    }

                }
            }
        }
    }

    private boolean j(int var1, int var2) {
        if (I[var1] - 1 < 0) {
            if (var2 >= 0) {
                if (var2 == 2) {
                    w[d][var2].a(0, 0, (byte) 0);
                } else {
                    w[d][var2].b = hso_ao.d;
                }
            }

            return false;
        } else if (r[var1].b > 0) {
            return false;
        } else {
            int var10001 = I[var1];
            short var3 = hso_ct.c(var1).k[var10001 + J[var1] - 1].a;
            if (super.bt < var3) {
                return false;
            } else if (super.ee == 0) {
                hso_ft.c(hso_df.T);
                return false;
            } else {
                return super.cz != var1;
            }
        }
    }

    public final hso_es a(int var1, MainObject var2) {
        hso_es var3 = new hso_es("Player vec7");
        hso_bf var4 = new hso_bf((short) var2.ct, var2.cu);
        var3.a(var4);
        byte var5 = var2.cu;
        hso_ev var8 = hso_ct.c(var1);
        if (I[var8.b] == 0) {
            return var3;
        } else {
            int var6;
            int var7;
            MainObject var9;
            if (var8.e == 1) {
                super.dh.g = super.bx;
                if (var8.k[I[var8.b] + J[var8.b] - 1].j > 0 && (var5 == 0 || var8.g == 3)) {
                    var6 = 1;

                    for (var7 = 0; var7 < GameScreen.i.c(); ++var7) {
                        if ((var9 = (MainObject) GameScreen.i.a(var7)).ct != var2.ct && var9 != GameScreen.f && var5 == var9.cu && var9.cF != 4 && (var5 != 0 || (var8.g != 3 || this.b(var9)) && (var8.g != 2 || !this.b(var9)))) {
                            if (MainObject.c(var2.aY, var2.aZ, var9.aY, var9.aZ) <= var8.k[I[var8.b] + J[var8.b] - 1].f) {
                                var4 = new hso_bf((short) var9.ct, var9.cu);
                                var3.a(var4);
                                ++var6;
                            }

                            if (var6 >= var8.k[I[var8.b] + J[var8.b] - 1].j) {
                                return var3;
                            }
                        }
                    }
                }
            } else if (var8.k[I[var8.b] + J[var8.b] - 1].j > 1) {
                var6 = 1;

                for (var7 = 0; var7 < GameScreen.i.c(); ++var7) {
                    if ((var9 = (MainObject) GameScreen.i.a(var7)).ct != var2.ct && var9 != GameScreen.f && var5 == var9.cu && var9.cF != 4 && (var5 != 0 || this.b(var9))) {
                        if (MainObject.c(var2.aY, var2.aZ, var9.aY, var9.aZ) <= var8.k[I[var8.b] + J[var8.b] - 1].f) {
                            var4 = new hso_bf((short) var9.ct, var9.cu);
                            var3.a(var4);
                            ++var6;
                        }

                        if (var6 >= var8.k[I[var8.b] + J[var8.b] - 1].j) {
                            return var3;
                        }
                    }
                }
            }

            return var3;
        }
    }

    public final void d(int var1, int var2) {
        if (var1 != 35) {
            if (H[var2] == var1) {
                int var10001 = I[var2];
                hso_fc var4 = hso_ct.c(var2).k[var10001 + J[var2] - 1];
                r[var2].b = var4.a();
                r[var2].c = var4.a();
                r[var2].a = hso_dw.a();
                if (var4.a > 0) {
                    super.bt -= var4.a;
                }

                hso_ev var3;
                if ((var3 = hso_ct.c(var2)) != null && var3.e == 0) {
                    r[var2].d = true;
                }
            }

        } else {
            for (var1 = 0; var1 < H.length; ++var1) {
                r[var1].b = 2000;
                r[var1].c = 2000;
                r[var1].a = hso_dw.a();
            }

        }
    }

    public static void s() {
        for (int var0 = 0; var0 < r.length; ++var0) {
            if (r[var0].d) {
                r[var0].b = 0;
            }
        }

    }

    public final void u() {
        if (super.cz != -1) {
            super.cz = -1;
            super.cN = null;
            super.bf = super.aY;
            super.bg = super.aZ;
            super.cl = 0;
            super.cm = 0;
        }

    }

    public final boolean b(MainObject var1) {
        if (var1.n()) {
            return true;
        } else if (var1.x()) {
            return false;
        } else if (hso_cs.a()) {
            return false;
        } else if (var1 == null) {
            return false;
        } else if (!super.dJ && !super.bI) {
            if (var1.dK) {
                return true;
            } else if (var1.dZ) {
                return true;
            } else if (var1.cu == 0 && var1.cy == 1) {
                if (var1.cv >= 1 && var1.cv <= 9 && super.cv >= 1 && super.cv <= 9 && var1.cv == super.cv) {
                    return false;
                } else {
                    return var1.cO == null || GameScreen.f.cO == null || var1.cO.b != GameScreen.f.cO.b;
                }
            } else if (super.cF != 4 && var1.cF != 4) {
                if (var1.cu != 0) {
                    if (e <= 0) {
                        hso_ft.c(hso_df.dn);
                        return false;
                    } else {
                        return var1.cu != 1 || var1.di != 7 || super.cO == null || var1.cO == null || super.cO.b != var1.cO.b;
                    }
                } else if (var1.cv >= 1 && var1.cv <= 9 && super.cv >= 1 && super.cv <= 9 && var1.cv == super.cv) {
                    return false;
                } else if (super.cA >= 2000) {
                    return false;
                } else if (super.cv == 12 && (var1.cv == 13 || var1.cv == 11)) {
                    return true;
                } else if (super.cv == 12 && var1.cv == 12) {
                    return false;
                } else if (super.cv == 13 && var1.cv == 12) {
                    return true;
                } else if (super.cv == 13 && (var1.cv == 13 || var1.cv == 11)) {
                    return false;
                } else if (super.cv == 11 && var1.cv == 12) {
                    return true;
                } else if (super.cv == 11 && (var1.cv == 11 || var1.cv == 13)) {
                    return false;
                } else {
                    if (super.cv == 10) {
                        short var2 = (short) var1.ct;

                        boolean var10000;
                        label148:
                        {
                            for (int var3 = 0; var3 < T.length; ++var3) {
                                if (var2 == T[var3]) {
                                    var10000 = true;
                                    break label148;
                                }
                            }

                            var10000 = false;
                        }

                        if (var10000) {
                            return true;
                        }
                    }

                    if (var1.cv != 0 && var1.cv != 10) {
                        if (var1.cv != -1 && super.cv != -1 && super.cv != var1.cv && super.cv != 10) {
                            return true;
                        } else {
                            return var1.by > 10 && super.cv == 0;
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void X() {
        if (o == 0) {
            o = 1;
            R = super.aY;
            S = super.aZ;
            h = 60;
            X = true;
        } else {
            if (o == -1) {
                hso_ft.ak[25] = true;
                hso_ft.ak[5] = true;
                o = 1;
                R = super.aY;
                S = super.aZ;
                h = 60;
                X = false;
            }

        }
    }

    public final void v() {
        o = 1;
        R = super.aY;
        S = super.aZ;
        h = 60;
        X = true;
    }

    public final void m_() {
        if (GameScreen.h != null) {
            if (GameScreen.h.cx != 2) {
                if (GameScreen.h.i_()) {
                    GameScreen.b().s.a();
                    if (o == 1) {
                        o_();
                    }

                    hso_ft.S = false;
                } else if (GameScreen.h.cu == 0) {
                    if (this.b(GameScreen.h)) {
                        if (w[d][eo].b != 0) {
                            for (int var2 = 0; var2 < w[d].length; ++var2) {
                                if (w[d][var2].b == 0) {
                                    eo = (byte) var2;
                                    if (o == 1) {
                                        o_();
                                    }
                                    break;
                                }
                            }
                        }

                        this.a((int) eo, false);
                    } else if (GameScreen.h.e_()) {
                        GameScreen.b().I.a();
                    } else {
                        if (super.cv == -1 || super.cv == 10 || hso_cs.a()) {
                            int var10001 = GameScreen.h.aY - hso_p.d.a;
                            GameScreen.b().s.a(var10001, GameScreen.h.aZ - hso_p.d.b - GameScreen.h.be - 30, hso_cf.w, "");
                            GameScreen.b().s.l = GameScreen.h.ct;
                            GameScreen.K = 60;
                        }

                    }
                } else if (GameScreen.h.cu != 4 && GameScreen.h.cu != 3 && GameScreen.h.cu != 5 && GameScreen.h.cu != 7) {
                    if (GameScreen.h.cu == 1) {
                        if (GameScreen.h.cF == 4) {
                            return;
                        }

                        if (GameScreen.h.l_()) {
                            GameScreen.b().J.a();
                            return;
                        }

                        if (!GameScreen.h.D()) {
                            this.X();
                            return;
                        }

                        if (GameScreen.h.D()) {
                            if (GameScreen.h.f().equals(super.cB)) {
                                GameScreen.b().H.a();
                                return;
                            }

                            if (!GameScreen.h.f().equals(super.cB)) {
                                if (super.cv == 0) {
                                    this.X();
                                    return;
                                }

                                if (super.cv != 11 && super.cv != 13) {
                                    if (super.cv == 12 && GameScreen.h.B()) {
                                        this.X();
                                    }
                                } else if (GameScreen.h.C()) {
                                    this.X();
                                    return;
                                }
                            }
                        }
                    }

                } else {
                    if (!GameScreen.h.dy) {
                        Service.a().a((short) GameScreen.h.ct, GameScreen.h.cu);
                        GameScreen.h.dy = true;
                    }

                }
            }
        }
    }

    public final void n_() {
        N = null;
        this.M = null;
        super.dk = null;
    }

    private static void a(int var0) {
        if (o != -1) {
            if (X) {
                o = 0;
            } else {
                o = -1;
            }

            if (o == 0) {
                R = -1;
                S = -1;
            }
        }

    }

    private boolean a(int var1, int var2, MainObject var3) {
        hso_bf var4;
        hso_es var5;
        if (var3 == null) {
            super.cN = null;
            super.cQ = super.ct;
            var5 = new hso_es("Player vec3");
            var4 = new hso_bf((short) super.ct, super.cu);
            var5.a(var4);
            super.dh.a(this, var5, var2, (byte) -1);
            return true;
        } else if (var1 != 2) {
            if (var1 == 1) {
                super.cN = null;
                super.cQ = super.ct;
                var5 = new hso_es("Player vec5");
                var4 = new hso_bf((short) super.ct, super.cu);
                var5.a(var4);
                super.dh.a(this, var5, var2, (byte) -1);
                return true;
            } else if (var1 == 3 && var3.cF != 4 && var3.cu != 2 && this.b(var3)) {
                super.cN = null;
                super.cQ = var3.ct;
                var5 = new hso_es("Player vec6");
                var4 = new hso_bf((short) var3.ct, var3.cu);
                var5.a(var4);
                super.dh.a(this, var5, var2, (byte) -1);
                return true;
            } else {
                return false;
            }
        } else {
            super.cN = null;
            super.cQ = super.ct;
            var5 = new hso_es("Player vec4");
            var4 = null;
            if (var3.cF != 4 && var3.cu != 2 && super.cv != 0 && var3.cv != 0 && var3.cv != 10 && (var3.cv == -1 || super.cv == -1 || super.cv == var3.cv)) {
                var4 = new hso_bf((short) var3.ct, var3.cu);
            } else {
                var4 = new hso_bf((short) super.ct, super.cu);
            }

            var5.a(var4);
            super.dh.a(this, var5, var2, (byte) -1);
            return true;
        }
    }

    public final boolean y() {
        if (GameScreen.h == null) {
            return false;
        } else if (GameScreen.h.cu == 2) {
            return true;
        } else if (GameScreen.h.cu == 1 && (GameScreen.h.cO == null || GameScreen.f.cO == null || GameScreen.h.cO.b != GameScreen.f.cO.b)) {
            return false;
        } else {
            return !this.b(GameScreen.h);
        }
    }

    public final void h() {
        if (this.e_()) {
            super.bf = super.aY;
            super.bg = super.aZ;
            super.cN = null;
            hso_es var1;
            (var1 = new hso_es()).a(new hso_bt(hso_df.ga, 4, this));
            var1.a(new hso_bt(hso_df.as, 5, this));
            hso_ft.a(hso_df.v, var1);
        } else if (this.H() && !super.bH) {
            if (!super.dZ) {
                if (super.aY != super.bf) {
                    super.bc = 0;
                    super.cF = 1;
                    if (hso_ak.e(super.aY - super.bf) > super.bi + this.Q()) {
                        if (super.aY > super.bf) {
                            super.bb = -(super.bi + this.Q());
                            super.cH = super.Direction;
                            super.Direction = 2;
                        } else {
                            super.bb = super.bi + this.Q();
                            super.cH = super.Direction;
                            super.Direction = 3;
                        }
                    } else if (hso_ak.e(super.aY - super.bf) < super.bi + this.Q()) {
                        if (super.aY > super.bf) {
                            super.bb = -hso_ak.e(super.aY - super.bf);
                            super.cH = super.Direction;
                            super.Direction = 2;
                        } else {
                            super.bb = hso_ak.e(super.aY - super.bf);
                            super.cH = super.Direction;
                            super.Direction = 3;
                        }
                    } else if (super.aY > super.bf) {
                        super.bb = -(super.bi + this.Q());
                        super.cH = super.Direction;
                        super.Direction = 2;
                    } else {
                        super.bb = super.bi + this.Q();
                        super.cH = super.Direction;
                        super.Direction = 3;
                    }
                } else if (super.aZ != super.bg) {
                    super.bb = 0;
                    super.cF = 1;
                    if (hso_ak.e(super.aZ - super.bg) > super.bi + this.Q()) {
                        if (super.aZ > super.bg) {
                            super.bc = -(super.bi + this.Q());
                            super.cH = super.Direction;
                            super.Direction = 1;
                        } else {
                            super.bc = super.bi + this.Q();
                            super.cH = super.Direction;
                            super.Direction = 0;
                        }
                    } else if (hso_ak.e(super.aZ - super.bg) < super.bi + this.Q()) {
                        if (super.aZ > super.bg) {
                            super.bc = -hso_ak.e(super.aZ - super.bg);
                            super.cH = super.Direction;
                            super.Direction = 1;
                        } else {
                            super.bc = hso_ak.e(super.aZ - super.bg);
                            super.cH = super.Direction;
                            super.Direction = 0;
                        }
                    } else if (super.aZ > super.bg) {
                        super.bc = -(super.bi + this.Q());
                        super.cH = super.Direction;
                        super.Direction = 1;
                    } else {
                        super.bc = super.bi + this.Q();
                        super.cH = super.Direction;
                        super.Direction = 0;
                    }
                } else {
                    super.bb = 0;
                    super.bc = 0;
                    super.cF = 0;
                }
            }
        } else {
            super.bf = super.aY;
            super.bg = super.aZ;
        }
    }

    public final void c(int var1, int var2) {
        hso_aa var3 = new hso_aa((byte) var1, var2);
        super.dw.a(var3);
    }

    public static void o_() {
        if (X) {
            o = 0;
        } else {
            o = -1;
        }
    }

    public final void k_() {
        this.em = null;
    }

    public final void b(String var1) {
        if (this.em == null) {
            this.em = new hso_cj();
        }

        this.em.a(var1, super.cL);
        this.em.d(super.aY, super.aZ - super.be - 30);
    }

    public final boolean e_() {
        return this.em != null;
    }
}
