
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class hso_ft {

    public static hso_p a;
    private static hso_u am;
    public static hso_bs b;
    public static GameScreen c;
    public static hso_eg d;
    public static hso_ck e;
    public static hso_dn f;
    public static MsgChat g;
    public static hso_ff h;
    public static hso_x i;
    public static hso_ep j;
    public static hso_dc k;
    public static hso_fw l;
    public static hso_by m;
    public static hso_az n;
    private mGraphics an = new mGraphics();
    public static hso_fq o;
    public static hso_cs p;
    public static hso_ex q;
    public static hso_da r;
    public static hso_da s;
    public static readMessenge t;
    public static hso_eu u;
    public static hso_eu v;
    public static hso_eu w;
    private static hso_eu ao;
    public static hso_ec x;
    public static hso_dz y;
    public static hso_di z;
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static boolean D;
    public static byte E;
    public static String F;
    public static byte G;
    public static byte H;
    public static short I;
    public static long J;
    public static int K;
    public static int[] L;
    public static int[] M;
    public static long N;
    public static String O;
    public static boolean P;
    public static boolean Q;
    public static boolean R;
    public static boolean S;
    public static boolean T;
    public static boolean U;
    public static boolean V;
    public static int W;
    public static int X;
    public static int Y;
    public static int Z;
    public static int aa;
    public static int ab;
    public static int ac;
    public static int ad;
    public static int ae;
    public static int af;
    public static int ag;
    public static int ah;
    public static int ai;
    public static long aj;
    public static boolean[] ak;
    private static boolean[] ap;
    public static boolean[] al;
    private static int aq;
    private static hso_es ar;
    private static boolean as;
    private static long at;
    private static int au;

    static {
        new hso_df();
        o = new hso_fq();
        B = false;
        C = false;
        D = true;
        E = 0;
        F = "";
        G = -1;
        H = 6;
        I = -1;
        L = new int[]{19129, 19129, 19129, 19129, 19129, 19129, 19129};
        M = new int[]{0, 0, 1, 0, 0, 0, 0, 0};
        N = 0L;
        O = "http://knightageonline.com/srvip/";
        P = false;
        Q = false;
        R = false;
        S = false;
        T = false;
        U = false;
        V = false;
        aa = 25;
        ab = 14;
        ad = 0;
        aj = 0L;
        ak = new boolean[30];
        ap = new boolean[30];
        al = new boolean[30];
        as = false;
        at = 0L;
        au = 0;
    }

    public hso_ft() {
        try {
            E = 0;
            F = hso_dw.c();
            hso_fi.a(0);
            W = GameCanvas.a;
            X = GameCanvas.b;
            Y = W / 2;
            Z = X / 2;
            hso_o.a();
            hso_cd.a();
            hso_f.a();
            if (W < 200 || X < 200) {
                C = true;
                if (hso_bs.k == 1) {
                    hso_bs.k = 2;
                }

                hso_bt.j = 56;
            }

            ac = 36;
            if (A) {
                ac = 40;
                ar = new hso_es("GameCanvas listPoint");
                hso_bt.k = 30;
                hso_bt.j = 80;
                hso_ah.d = 58;
            } else if (C) {
                ac = 30;
            }

            z = new hso_di();
            if (hso_ak.a("isQty") != null) {
                hso_fi.h = true;
            }

            byte[] var6;
            ByteArrayInputStream var7;
            try {
                if ((var6 = hso_ak.a("isLowDevice")) != null) {
                    var7 = new ByteArrayInputStream(var6);
                    if ((new DataInputStream(var7)).readByte() == 1) {
                        B = true;
                    } else {
                        B = false;
                    }
                }
            } catch (Exception var5) {
            }

            try {
                if ((var6 = hso_ak.a("isIndexRes")) != null) {
                    var7 = new ByteArrayInputStream(var6);
                    G = (new DataInputStream(var7)).readByte();
                }
            } catch (Exception var4) {
            }

            try {
                I = 0;
            } catch (Exception var3) {
            }

            H = 6;

            try {
                if ((var6 = hso_ak.a("isIndexServer")) != null) {
                    H = var6[0];
                }
            } catch (Exception var2) {
            }

            if (hso_f.a) {
                H = 1;

                try {
                    if ((var6 = hso_ak.a("isIndexServer")) != null) {
                        H = var6[0];
                    }
                } catch (Exception var1) {
                }
            }

            if (hso_cd.a) {
                H = 0;
            }

            hso_ae.a();
            hso_p.d = new hso_aw();
            hso_p.e = new hso_aw();
            p = new hso_cs();
            q = new hso_ex();
            b = new hso_bs();
            c = new GameScreen();
            d = new hso_eg();
            e = new hso_ck();
            t = new readMessenge();
            new hso_fl();
            u = new hso_eu();
            ao = new hso_eu();
            g = new MsgChat();
            i = new hso_x();
            h = new hso_ff();
            hso_ct.a();
            (am = new hso_u()).c();
            hso_dn.b();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void a() {
        b.b();
        c.h();
        hso_eu.b();
        MsgChat.b();
        i.b();
        h.b();
        GameScreen.p.b();
    }

    public final void a(hso_bl var1) {
        try {
            this.an.a = var1.a;
            a.a(this.an);
            if (q()) {
                GameScreen.q.e(this.an);
                GameScreen.q.b(this.an);
            }

            if (s != null) {
                s.a(this.an);
            }

            if (r != null) {
                r.a(this.an);
            } else if (o.a) {
                o.b(this.an);
            } else if (hso_d.b) {
                hso_d.b("public final void a(hso_bl var1)").a(this.an);
            }

            a(this.an);
            if (ad > 0) {
                this.an.a(0);
                this.an.c(0, 0, W, X);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static boolean q() {
        return a == ao || a == c || a == u || a == v || a == w || a == e || a == x || a == l || a == h || a == m || a == hso_az.b() || a == hso_ag.b();
    }

    public final void b() {
        try {
            if (++ai > 10000) {
                ai = 0;
            }

            if (ai % 5 == 0) {
                aj = hso_dw.a();
            }

            if (ad > 0) {
                ad -= X / 10;
            }

            if (q()) {
                GameScreen.q.e();
                GameScreen.q.b();
                GameScreen.q.d();
                GameScreen.q.c();
            }

            if (r != null) {
                r.a();
            } else if (o.a) {
                o.g();
                o.c();
            } else if (s != null) {
                s.a();
            } else if (hso_d.b) {
                hso_d.b("public final void b()").d();
                hso_d.b("public final void b()").e();
            } else {
                a.d();
                a.e();
            }

            a.a();
            U = false;
            if (GameScreen.R > 0 && --GameScreen.R == 0) {
                GameScreen.L = false;
            }

            if (at != 0L && hso_dw.a() - at >= 600000L) {
                au = hso_ak.f(hso_df.gB.length);
                b(hso_df.gj + hso_df.gB[au]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(mGraphics var0) {
        var0.a(-var0.a(), -var0.b());
        var0.a(0, 0);
        var0.d(0, 0, W, X);
    }

    public static void a(String var0) {
        hso_ah var1;
        (var1 = new hso_ah()).a(var0, new hso_bt("Ok", -1), true);
        r = var1;
    }

    public static void a(String var0, byte var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, new hso_bt("Ok", var1), true);
        r = var2;
    }

    public static void a(String var0, String var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, var1);
        r = var2;
    }

    public static void b(String var0, String var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, new hso_bt(hso_df.Z, -1), true, var1);
        r = var2;
    }

    public static void a(String var0, hso_bt var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, var1);
        r = var2;
    }

    public static void a(String var0, hso_es var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, var1);
        r = var2;
    }

    public static void b(String var0, hso_bt var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, var1, true);
        r = var2;
    }

    public static void c(String var0, hso_bt var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, var1, false);
        r = var2;
    }

    public static void a(String var0, String var1, int var2, int var3, byte var4) {
        hso_ah var5;
        (var5 = new hso_ah()).a(var0, var1, var2, var3, var4);
        s = var5;
    }

    public static void a(hso_ew var0) {
        hso_ah var1;
        (var1 = new hso_ah()).a(var0);
        s = var1;
    }

    public static void c() {
        hso_ah var0;
        (var0 = new hso_ah()).b();
        s = var0;
    }

    public static void d() {
        hso_ah var0;
        (var0 = new hso_ah()).c();
        r = var0;
    }

    public static void e() {
        hso_ah var0;
        (var0 = new hso_ah()).f();
        r = var0;
    }

    public static void f() {
        hso_ah var0;
        (var0 = new hso_ah()).g();
        r = var0;
    }

    public static void g() {
        hso_ah var0;
        (var0 = new hso_ah()).h();
        s = var0;
    }

    public static void h() {
        MsgChat.f();
        g.c();
        s = g;
    }

    public static void a(String[] var0, hso_bt var1, short var2, short var3, String var4) {
        hso_dy var5;
        (var5 = new hso_dy()).a(var0, var1, var2, (short) -1, var4);
        s = var5;
    }

    public static void a(String[] var0, hso_bt var1, short var2, short var3, String var4, String[] var5, byte var6) {
        j();
        hso_dy var7;
        (var7 = new hso_dy()).a(var0, var1, var2, var3, var4, var5, var6);
        s = var7;
    }

    public static void a(String var0, String var1, hso_j[] var2, byte var3, byte var4) {
        if (var1 != null && var1.trim().length() == 0) {
            var1 = null;
        }

        hso_ah var5;
        (var5 = new hso_ah()).a(var0, var2, var1, var3, var4);
        r = var5;
    }

    public static void i() {
        hso_ah var0;
        (var0 = new hso_ah()).i();
        r = var0;
    }

    public static void a(hso_ea var0, byte var1) {
        hso_ah var2;
        (var2 = new hso_ah()).a(var0, var1);
        s = var2;
        if (var0 != null) {
            Service.a().c(hso_fn.s, (short) var0.O);
        }

    }

    public static void j() {
        r = null;
        s = null;
        m();
        l();
        if (GameScreen.p.a >= 0) {
            GameScreen.p.c = 20;
        }

    }

    public static void k() {
        r = null;
    }

    public static void b(String var0) {
        at = hso_dw.a();
        au = 0;
        if (var0 != null && var0.length() > 0) {
            GameScreen.j.a(var0);
        }

    }

    public static void c(String var0) {
        if (var0 != null && var0.length() > 0) {
            if (hso_o.i.a(var0) > 140) {
                if (var0 != null && var0.length() > 0) {
                    GameScreen.k.a(var0);
                }

                return;
            }

            GameScreen.q.G = var0;
            GameScreen.q.d = 10;
            GameScreen.q.c = 0;
        }

    }

    public final void a(int var1) {
        try {
            if (hso_fi.h && (var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 122 || var1 == 10 || var1 == 8 || var1 == 13 || var1 == 32)) {
                aq = var1;
            }

            hso_cf.M = true;
            if (r != null) {
                r.e(var1);
            } else if (s != null) {
                s.e(var1);
            } else if (hso_d.b) {
                hso_d.b("public final void a(int var1)").a(var1);
            } else {
                a.a(var1);
            }

            if (hso_fi.h) {
                if (aq != 114 && aq != 82) {
                    if (aq != 116 && aq != 84) {
                        if (aq != 121 && aq != 89) {
                            if (aq != 117 && aq != 85) {
                                if (aq == 105 || aq == 73) {
                                    al[29] = true;
                                    ak[29] = true;
                                }
                            } else {
                                al[27] = true;
                                ak[27] = true;
                            }
                        } else {
                            al[25] = true;
                            ak[25] = true;
                        }
                    } else {
                        al[23] = true;
                        ak[23] = true;
                    }
                } else {
                    al[21] = true;
                    ak[21] = true;
                }
            }

            switch (var1) {
                case -7:
                    al[13] = true;
                    ak[13] = true;
                default:
                    return;
                case -6:
                    al[12] = true;
                    ak[12] = true;
                    return;
                case -5:
                case 10:
                    al[5] = true;
                    ak[5] = true;
                    return;
                case -4:
                    al[6] = true;
                    ak[6] = true;
                    return;
                case -3:
                    al[4] = true;
                    ak[4] = true;
                    return;
                case -2:
                    al[8] = true;
                    ak[8] = true;
                    return;
                case -1:
                    al[2] = true;
                    ak[2] = true;
                    return;
                case 35:
                    al[11] = true;
                    ak[11] = true;
                    return;
                case 42:
                    al[10] = true;
                    ak[10] = true;
                    return;
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    al[var1 - 28] = true;
                    ak[var1 - 28] = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public final void b(int var1) {
        if (hso_fi.h) {
            aq = 0;
        }

        switch (var1) {
            case -7:
                al[13] = false;
            default:
                return;
            case -6:
                al[12] = false;
                return;
            case -5:
            case 10:
                al[5] = false;
                ak[5] = false;
                return;
            case -4:
                al[6] = false;
                ak[6] = false;
                return;
            case -3:
                al[4] = false;
                ak[4] = false;
                return;
            case -2:
                al[8] = false;
                ak[8] = false;
                return;
            case -1:
                al[2] = false;
                ak[2] = false;
                return;
            case 35:
                al[11] = false;
                return;
            case 42:
                al[10] = false;
                return;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                al[var1 - 28] = false;
        }
    }

    public static void a(int var0, int var1) {
        ae = var0 / mGraphics.zoomLevel;
        af = var1 / mGraphics.zoomLevel;
        if (T) {
            ar.a(new hso_de(var0, var1));
        } else {
            if (hso_ak.e(ae - ag) >= 15 || hso_ak.e(af - ah) >= 15) {
                T = true;
            }

        }
    }

    public static void b(int var0, int var1) {
        hso_cf.M = true;
        Q = true;
        T = false;
        S = false;
        R = false;
        V = false;
        if (a == hso_r.b()) {
            U = true;
        }

        ag = var0 / mGraphics.zoomLevel;
        ah = var1 / mGraphics.zoomLevel;
        ae = var0 / mGraphics.zoomLevel;
        af = var1 / mGraphics.zoomLevel;
    }

    public static void c(int var0, int var1) {
        if (!T && !V) {
            S = true;
        }

        m();
        l();
        Q = false;
        R = true;
        T = false;
        U = true;
        V = false;
        ae = var0 / mGraphics.zoomLevel;
        af = var1 / mGraphics.zoomLevel;
    }

    public static void l() {
        R = false;
        Q = false;

        for (int var0 = 0; var0 < 30; ++var0) {
            ak[var0] = false;
        }

    }

    public static void c(int var0) {
        R = false;
        Q = false;
        ak[var0] = false;
    }

    public static void m() {
        R = false;
        Q = false;

        for (int var0 = 0; var0 < 30; ++var0) {
            al[var0] = false;
        }

    }

    public static void d(int var0) {
        R = false;
        Q = false;
        al[var0] = false;
    }

    public static void n() {
        m();
        l();
        Q = false;
        R = false;

        for (int var0 = 0; var0 < 30; ++var0) {
            ap[var0] = false;
        }

        S = false;
        T = false;
        U = false;
        Q = false;
    }

    public static void o() {
        if (!ISession.a().b()) {
            String var0 = hso_dw.a[H][1];
            short var1 = 19129;
            if (hso_f.a && H == 1) {
                var1 = 19130;
            }

            ISession.a().connect((String) var0, (int) var1);
        }

    }

    public static int p() {
        return (int) (hso_dw.a() / 1000L);
    }

    public static boolean a(int var0, int var1, int var2, int var3) {
        return !Q && !R ? false : c(var0, var1, var2, var3);
    }

    public static boolean b(int var0, int var1, int var2, int var3) {
        return !S ? false : c(var0, var1, var2, var3);
    }

    public static boolean c(int var0, int var1, int var2, int var3) {
        return ae >= var0 && ae <= var0 + var2 && af >= var1 && af <= var1 + var3;
    }

    public static boolean d(int var0, int var1, int var2, int var3) {
        return ag >= var0 && ag <= var0 + var2 && ah >= var1 && ah <= var1 + var3;
    }

    public static boolean e(int var0) {
        switch (var0) {
            case 0:
                if (al[8] || al[28]) {
                    return true;
                }
                break;
            case 1:
                if (al[2] || al[22]) {
                    return true;
                }
                break;
            case 2:
                if (al[4] || al[24]) {
                    return true;
                }
                break;
            case 3:
                if (al[6] || al[26]) {
                    return true;
                }
        }

        return false;
    }
}
