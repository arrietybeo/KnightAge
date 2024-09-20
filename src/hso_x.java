
public final class hso_x extends hso_p {

    private int i = 50;
    private int j;
    public static hso_es a = new hso_es("PaintInfoGameScr VecSelectChar");
    private int[][] k = hso_dw.a(3, 2);
    private boolean l = false;
    private boolean m = false;
    public static int b = -1;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    private hso_bt n;
    private byte[] o = new byte[]{0, 1, 2, 1};
    private byte p = 0;
    private hso_bm q = null;
    private int r = 0;

    public hso_x() {
        if (!hso_ft.A) {
            super.aa = new hso_bt(hso_df.Y, 0);
        }

        this.n = new hso_bt(hso_df.bR, 1);
        if (hso_ft.A) {
            this.n.a(hso_cf.q.a / 2, hso_ft.X - hso_cf.q.b / 2, hso_cf.q, this.n.a);
        }

        super.Y = this.n;
    }

    public final void c() {
        this.r = 0;
        this.q = null;
        this.l = false;
        this.m = false;
        Player.k = false;
        GameScreen.i.d();
        super.c();
        f = false;
        hso_ft.z.a();
        hso_cf.a(hso_dw.a[hso_ft.H][0]);
        hso_ft.N = 0L;
    }

    public final void b(int var1, int var2) {
        switch (var1) {
            case 0:
                this.g();
                break;
            case 1:
                hso_ft.b.c();
                ISession.a().c();
                GameScreen.f = new Player(0, (byte) 0, "unname", 0, 0);
        }

        super.b(var1, var2);
    }

    public final void b() {
        this.n.a = hso_df.bR;
    }

    public final void a(mGraphics var1) {
        try {
            hso_gb.a(var1);
            if (hso_bs.l != null) {
                var1.a(hso_bs.l, hso_ft.Y, hso_ft.Z - 60, 3);
            }

            hso_gb.c(var1);
            hso_cf.a(var1, hso_dw.a[hso_ft.H][0]);
            hso_gb.d(var1);
            hso_gb.b(var1);

            for (int var2 = 0; var2 < 3; ++var2) {
                if (var2 < a.c()) {
                    hso_bm var3;
                    (var3 = (hso_bm) a.a(var2)).c(var1, -1);
                    hso_o.c.a(var1, hso_df.ac + var3.by, var3.aY, var3.aZ - var3.be - 10, 2, false);
                    this.a(var1, var3.cB, var3.aY, var3.aZ - var3.be, var2, var3.cO);
                } else {
                    this.a(var1, hso_df.aj, this.k[var2][0], this.k[var2][1], var2, (hso_em) null);
                }
            }

            super.a(var1);
            if (g) {
                var1.a(0);
                var1.c(0, 0, hso_ft.W, hso_ft.X);
                if (hso_bs.l != null) {
                    var1.a(hso_bs.l, hso_ft.Y, hso_ft.Z - 16, 3);
                    var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, hso_ft.Y, hso_ft.Z + aq.b(hso_bs.l.a) / 2 - 9, 3);
                }
            }

            if (hso_cf.W == 0) {
                var1.a(hso_cg.aB, 0, 0, 0);
            } else if (hso_cf.W == 1) {
                hso_cf.j(var1);
            }

            if (hso_bs.b) {
                hso_o.k.a(var1, hso_df.F, hso_ft.W, 0, 1, false);
                var1.a(16514362);
                var1.c(hso_ft.W - hso_bs.p, 10, hso_bs.p, 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public final void a() {
        GameScreen.q.d();
        if (hso_bs.j < 20 && (hso_bs.j += 4) > 20) {
            hso_bs.j = 20;
        }

        if (this.r > 0) {
            ++this.r;
            if (this.r == 18) {
                this.q.ba = 0;
                this.q.cF = 1;
            }
        }

        if (!hso_ft.A) {
            if (this.j > a.c() - 1) {
                super.aa.a = hso_df.ab;
            } else {
                super.aa.a = hso_df.Y;
            }
        }

        hso_bm var2;
        if (hso_ah.k) {
            var2 = (hso_bm) a.a(this.j);
            hso_co.b = true;
            b = var2.ct;
            Service.a().a((byte) 0, (int) b);
            hso_eg.g = false;
            hso_ft.d.c();
            this.m = true;
            GameScreen.p.a = -1;
            Service.a().a((byte) 1, (byte) 2, (byte[]) null);
            Service.a().a((byte) 1, (byte) 1, (byte[]) null);
            g = false;
            hso_ah.k = false;
        }

        for (int var1 = 0; var1 < a.c(); ++var1) {
            if ((var2 = (hso_bm) a.a(var1)).cF == 2) {
                var2.dg.a(var2);
            } else if (var2.cF == 1) {
                ++var2.ba;
                if (var2.ba > var2.cf.length - 1) {
                    var2.ba = 0;
                }

                var2.ce = var2.cf[var2.ba];
                if (this.l && !this.m) {
                    hso_bm var3 = (hso_bm) a.a(this.j);
                    hso_co.b = true;
                    b = var3.ct;
                    Service.a().a((byte) 0, (int) b);
                    hso_eg.g = false;
                    hso_ft.d.c();
                    this.m = true;
                    GameScreen.p.a = -1;
                    Service.a().a((byte) 1, (byte) 2, (byte[]) null);
                    Service.a().a((byte) 1, (byte) 1, (byte[]) null);
                    g = false;
                    hso_bv.b = 0L;
                    hso_bv.c = false;
                    hso_bv.a = false;
                    hso_ah.k = false;
                }

                var2.aZ += var2.bc;
            } else {
                var2.J();
            }

            var2.K();
        }

        hso_gb.b();
        if (g && h) {
            this.g();
            h = false;
        }

    }

    public final void d() {
        if (!g) {
            if (!this.l) {
                if (hso_ft.al[4]) {
                    --this.j;
                    hso_ft.m();
                } else if (hso_ft.al[6]) {
                    ++this.j;
                    hso_ft.m();
                }

                this.j = hso_cg.a(this.j, 2, true);
                super.d();
            }

        }
    }

    public final void a(hso_es var1) {
        a.d();
        a = var1;

        for (int var7 = 0; var7 < 3; ++var7) {
            int var2 = hso_ft.Y - 80 + var7 * 80;
            int var3 = hso_ft.X - 60 - var7 % 2 * 25;
            if (var7 < a.c()) {
                hso_bm var4 = (hso_bm) a.a(var7);
                int var5 = hso_ft.Y - 80 + var7 * 80;
                int var6 = hso_ft.X - 60 - var7 % 2 * 25;
                var4.aY = var5;
                var4.aZ = var6;
            }

            this.k[var7][0] = var2;
            this.k[var7][1] = var3;
        }

    }

    private void a(mGraphics var1, String var2, int var3, int var4, int var5, hso_em var6) {
        hso_o.c.a(var1, var2, var3 - 1, var4 - 25, 2, false);
        hso_o.c.a(var1, var2, var3 + 1, var4 - 25, 2, false);
        hso_o.c.a(var1, var2, var3 - 1, var4 - 24, 2, false);
        hso_o.c.a(var1, var2, var3 + 1, var4 - 24, 2, false);
        hso_o.c.a(var1, var2, var3 - 1, var4 - 23, 2, false);
        hso_o.c.a(var1, var2, var3 + 1, var4 - 23, 2, false);
        hso_o.c.a(var1, var2, var3, var4 - 25, 2, false);
        hso_o.c.a(var1, var2, var3, var4 - 23, 2, false);
        hso_o.f.a(var1, var2, var3, var4 - 24, 2, false);
        hso_fd var9;
        if (var6 != null && (var9 = hso_bk.i(var6.a)).a != null) {
            int var7 = (hso_o.f.a(var6.c) + 11) / 2;
            if (var9.a != null) {
                if (aq.b(var9.a.a) / 18 == 3) {
                    if (hso_ft.ai % 6 == 0) {
                        int var8;
                        if ((var8 = this.o.length) == 0) {
                            var8 = 1;
                        }

                        this.p = (byte) ((this.p + 1) % var8);
                    }

                    var1.a(var9.a, 0, this.o[this.p] * 18, 18, 18, 0, var3 - var7 + 6, var4 - 32, 3);
                } else {
                    var1.a(var9.a, var3 - var7 + 6, var4 - 32, 3);
                }

                hso_bw.r.a(var3 - var7 + 6, var4 - 32 - 1, var6.a(), 14, var1, 0);
            }

            hso_o.f.a(var1, var6.c, var3 - var7 + 15, var4 - 32 - 6, 0, false);
            var4 -= 18;
        }

        if (var5 == this.j && !this.l && !hso_ft.A) {
            var1.a(hso_cg.ak, var3, var4 - 35 + hso_ft.ai % 5, 3);
        }

    }

    public final void e() {
        if (!g) {
            if (hso_ft.S && !this.l) {
                for (int var1 = 0; var1 < this.k.length; ++var1) {
                    if (hso_ft.c(this.k[var1][0] - 5, this.k[var1][1] - 65, 50, 90)) {
                        this.j = var1;
                        this.g();
                        this.j = hso_cg.a(this.j, 2, true);
                        hso_ft.S = false;
                        break;
                    }
                }
            }

            super.e();
        }
    }

    private void g() {
        if (this.j > a.c() - 1) {
            (hso_ft.j = new hso_ep()).a((byte) this.j);
        } else {
            this.l = true;
            this.r = 1;
            this.q = (hso_bm) a.a(this.j);
            this.q.cF = 2;
            this.q.ba = 0;
            this.q.t();
            this.q.dg.a(this.q.bx == 3 ? 16 : 1);
            this.q.Direction = 0;
        }
    }
}
