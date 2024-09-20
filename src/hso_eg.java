
public final class hso_eg extends hso_p {

    public boolean a = false;
    public boolean b = false;
    public boolean f = false;
    public static boolean g = false;
    private long i;
    private long j;
    public byte[] h;
    private static byte[] k = new byte[]{2, 0, 3, 2, 3, 2, 6, 2, 2, 2, 6, 5, 5, 5, 6, 4, 4, 3, 6, 8, 8, 8, 8, 8, 8, 4, 4, 4, 6, 3, 3, 3, 6, 1, 1, 1, 5, 5, 5, 5, 5, 5, 8, 8, 8, 8, 5, 6, 5, 5, 5, 2, 5, 0};

    public final void c() {
        hso_dw.b();
        super.c();
        this.i = hso_ft.aj;
        hso_ft.z.a();
        hso_cf.C = 0;
    }

    public final void a(mGraphics var1) {
        var1.a(0);
        var1.c(0, 0, hso_ft.W, hso_ft.X);
        if (hso_bs.l != null) {
            var1.a(hso_bs.l, hso_ft.Y, hso_ft.Z - 16, 3);
            var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, hso_ft.Y, hso_ft.Z + aq.b(hso_bs.l.a) / 2 - 9, 3);
            if (this.j > 0L) {
                hso_o.j.a(var1, String.valueOf(this.j), hso_ft.Y, hso_ft.Z + aq.b(hso_bs.l.a) / 2 - 15, 2, false);
            }
        }

    }

    public final void a() {
        if ((hso_ft.aj - this.i) / 1000L > 180L && hso_ft.r != null) {
            hso_ft.b(hso_df.ck, new hso_bt(hso_df.bR, 0));
            if (GameScreen.f != null) {
                GameScreen.f.N();
            }
        }

        if (g && this.a && hso_co.a && (hso_di.a.c() <= 5 || (hso_ft.aj - this.i) / 1000L > 45L)) {
            if (GameScreen.p.d(0, -5)) {
                (hso_ft.f = new hso_dn()).g();
                hso_ft.f.c();
            } else {
                GameScreen.f.u();
                GameScreen.f.cN = null;
                GameScreen.f.N();
                hso_ft.c.c();
                hso_ft.c.g();
                if (hso_co.c.length() > 0 && hso_co.b) {
                    hso_co.b = false;
                    hso_ft.b(hso_df.cJ + "\n" + hso_co.c, hso_df.cI);
                }

                hso_ft.ad = hso_ft.X / 4 * 3;
                hso_cf.g();
                if (this.b) {
                    GameScreen.a(58, GameScreen.f.ct, GameScreen.f.cu, GameScreen.f.ct, GameScreen.f.cu, 0, GameScreen.f.br);
                    GameScreen.f.bF = true;
                }

                if (hso_ft.p.d == 0 && GameScreen.p.d(5, 8) && (hso_ft.D || hso_f.a)) {
                    GameScreen.p.f();
                    GameScreen.p.g();
                }
            }

            if (this.f) {
                GameScreen.p.g();
                this.f = false;
            }

            hso_x.f = true;
            Service var1;
            (var1 = Service.a()).init((byte) 12);
            var1.send();
            Service.a().g((byte) 59);
            hso_bj.a.d();
        }

        boolean var2 = false;
        if (hso_ft.J - hso_dw.a() > 0L) {
            this.j = (hso_ft.J - hso_dw.a()) / 1000L;
        }

        if (hso_ft.J - hso_dw.a() <= 0L && hso_ft.J > 0L) {
            var2 = true;
        }

        if (var2) {
            this.j = 0L;
            hso_ft.J = 0L;
            hso_ft.b.a(hso_ft.H);
            hso_x.g = true;
            hso_x.h = true;
        }

        if (hso_ft.N > 0L && (hso_dw.a() - hso_ft.N) / 1000L > 15L) {
            hso_ft.N = 0L;
            hso_ft.a(hso_df.S, new hso_bt(hso_df.Z, 16));
        }

    }
}
