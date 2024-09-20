
public final class hso_ep extends hso_p {

    private int a = 180;
    private int b = 160;
    private hso_fi f;
    private static hso_es g = new hso_es("CreateChar VecDefaultchar");
    private int h;
    private int i;
    private int j = 0;
    private int k = 0;
    private int l;
    private int m;
    private byte n;
    private hso_es o;
    private hso_bt p;
    private hso_bt q;
    private hso_bt r;
    private hso_bt s;
    private hso_bt t;
    private int u;

    public final void a(byte var1) {
        this.n = var1;
        super.c();
    }

    public hso_ep() {
        byte[][] var10000 = new byte[][]{{8, 9}, {10, 11}};
        var10000 = new byte[][]{{0, 1}, {2, 3}};
        this.l = 2;
        this.m = 2;
        this.n = 0;
        this.o = new hso_es("CreateChar veccmd");
        if (hso_ft.A) {
            this.b = 182;
            this.a = 200;
        }

        hso_ep var5 = this;
        g.d();
        super.aa = new hso_bt(hso_df.ab, 0);
        this.t = new hso_bt(hso_df.af, 1);
        int var1;
        if (hso_ft.A) {
            if ((var1 = hso_bt.j / 2) < this.a / 4) {
                var1 = this.a / 4;
            }

            super.aa.a(hso_ft.Y - var1, hso_ft.Z + this.b / 2 + 4, (hso_ce) null, super.aa.a);
            this.t.a(hso_ft.Y + var1, hso_ft.Z + this.b / 2 + 4, (hso_ce) null, this.t.a);
        }

        super.Y = this.t;

        for (var1 = 0; var1 < 4; ++var1) {
            hso_bm var2;
            (var2 = new hso_bm(var1, (byte) 0, "", 0, 0)).bx = (byte) var1;
            var2.bZ = var1;
            var2.bY = var1;
            var2.bW = -1;
            var2.bX = 0;
            var2.cb = var1;
            var2.ca = var1 + 8;
            var2.bU = var2.ca;
            var2.Direction = 0;
            var2.cc = -1;
            var2.aY = var5.a / 5 + var1 * var5.a / 4;
            var2.aZ = var5.b / 5 << 1;
            var2.dX = 0;
            g.a(var2);
        }

        var5.k = hso_ak.f(4);
        var5.j = 0;
        hso_p.e.a(g.c() * var5.a / 4, 0, var5.k * var5.a / 4, 0);
        var5.f = new hso_fi(hso_ft.Y - var5.a / 2 + var5.a / 5 - 25, hso_ft.Z - var5.b / 2 + var5.b / 2 + 10, 60);
        if (!hso_ft.A) {
            var5.f.a(true);
        } else {
            var5.p = new hso_bt(hso_df.gn[var5.k], 0, var5);
            var5.o.a(var5.p);
            hso_bm var7 = (hso_bm) g.a(var5.k);
            var5.q = new hso_bt(hso_df.gE[var5.k / 2][var7.cb % var5.l], 1, var5);
            var5.o.a(var5.q);
            int var6;
            if ((var6 = var7.ca) < 8) {
                var6 = var7.bU;
            }

            var5.r = new hso_bt(hso_df.gF[0][var6 - 8], 2, var5);
            var5.o.a(var5.r);
            var5.s = new hso_bt(hso_df.gF[1][var7.bX], 3, var5);
            var5.o.a(var5.s);
            var1 = hso_ft.Y - var5.a / 2;
            var6 = hso_ft.Z - var5.b / 2 - hso_ft.aa / 2;

            for (int var3 = 0; var3 < var5.o.c(); ++var3) {
                hso_bt var4;
                (var4 = (hso_bt) var5.o.a(var3)).a(var1 + (var5.a / 3 << 1), var6 + var5.b / 5 * (var3 + 1) + 5, hso_cf.v, var4.a);
            }

        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.j = 0;
                ++this.k;
                this.h = 0;
                if (this.k == 4) {
                    hso_p.e.a = -this.a / 4;
                }

                this.k = hso_cg.a(this.k, hso_df.gn.length - 1, true);
                hso_p.e.c = this.k * this.a / 4;
                this.p.a = hso_df.gn[this.k];
                hso_bm var3 = (hso_bm) g.a(this.k);
                this.q.a = hso_df.gE[this.k / 2][var3.cb % this.l];
                return;
            case 1:
            case 2:
            case 3:
                this.j = var1;
                this.b(1);
            default:
        }
    }

    public final void b(int var1, int var2) {
        switch (var1) {
            case 0:
                String var3;
                if ((var3 = this.f.j()).length() < 6) {
                    hso_ft.a(hso_df.ae);
                } else {
                    hso_bm var4 = (hso_bm) g.a(this.k);
                    Service.a().a(var4.bx, var3, (byte) var4.cb, (byte) var4.bU, (byte) var4.bX);
                    hso_ft.a(hso_df.aG, (hso_bt) null);
                }
                break;
            case 1:
                if (hso_x.a.c() == 0) {
                    hso_ft.b.c();
                    ISession.a().c();
                    GameScreen.f = new Player(0, (byte) 0, "unname", 0, 0);
                } else {
                    hso_ft.i.c();
                }
        }

        super.b(var1, var2);
    }

    public final void a(mGraphics var1) {
        try {
            hso_gb.a(var1);
            hso_cg.a(var1, hso_ft.Y - this.a / 2, hso_ft.Z - this.b / 2 - hso_ft.aa / 2, this.a, this.b, true, (byte) 0);
            var1.a(hso_ft.Y - this.a / 2, hso_ft.Z - this.b / 2 - hso_ft.aa / 2);
            hso_bm var2 = (hso_bm) g.a(this.k);

            int var3;
            for (var3 = 0; var3 < hso_df.gm.length; ++var3) {
                hso_o.c.a(var1, hso_df.gm[var3], this.a / 3 << 1, this.b / 5 * var3 + this.b / 10, 2, false);
            }

            if (!hso_ft.A) {
                hso_cg.a(var1, hso_df.gn[this.k], this.a / 3 << 1, this.b / 5, 2, (int) 2);
                hso_cg.a(var1, hso_df.gE[this.k / 2][var2.cb % this.l], this.a / 3 << 1, this.b / 5 << 1, 2, (int) 2);
                if ((var3 = var2.ca) < 8) {
                    var3 = var2.bU;
                }

                hso_cg.a(var1, hso_df.gF[0][var3 - 8], this.a / 3 << 1, this.b / 5 * 3, 2, (int) 2);
                hso_cg.a(var1, hso_df.gF[1][var2.bX], this.a / 3 << 1, this.b / 5 << 2, 2, (int) 2);
            }

            if (!hso_ft.A) {
                var1.a(MainObject.cZ, 0, 0, 11, 9, 5, (this.a / 3 << 1) - 35 - this.i / 2 % 4, this.b / 5 * (this.j + 1) + 4, 3);
                var1.a(MainObject.cZ, 0, 0, 11, 9, 6, (this.a / 3 << 1) + 35 + this.i / 2 % 4, this.b / 5 * (this.j + 1) + 4, 3);
            }

            hso_o.i.a(var1, hso_df.ad, this.a / 5 + 4, this.b / 2 + 5, 2, false);
            var1.d(8, 2, (this.a / 5 << 1) - 12, this.b - 4);
            var1.a(-hso_p.e.a, 0);

            for (var3 = 0; var3 < g.c(); ++var3) {
                var2 = (hso_bm) g.a(var3);
                if (var3 == 0) {
                    var2.b(var1, var2.aY + this.a / 4 * g.c(), var2.aZ, var2.Direction);
                }

                if (var3 == g.c() - 1) {
                    var2.b(var1, var2.aY - this.a / 4 * g.c(), var2.aZ, var2.Direction);
                }

                var2.c(var1, -1);
                switch (var2.cF) {
                    case 2:
                        var2.dg.a(var2);
                        break;
                    case 1:
                        ++var2.ba;
                        if (var2.ba > var2.cf.length - 1) {
                            var2.ba = 0;
                        }
                        var2.ce = var2.cf[var2.ba];
                        break;
                    default:
                        var2.J();
                        break;
                }

                var2.K();
            }

            hso_ft.a(var1);

            for (var3 = 0; var3 < this.o.c(); ++var3) {
                hso_bt var4;
                (var4 = (hso_bt) this.o.a(var3)).a(var1, var4.h, var4.i);
            }

            this.f.a(var1);
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
            super.a(var1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        if (hso_bs.j < 20 && (hso_bs.j += 4) > 20) {
            hso_bs.j = 20;
        }

        if (this.h == 0) {
//            ((hso_bm) g.a(this.k)).Direction = 0;
            ((hso_bm) g.a(this.k)).setDirection(0, "public final void a()", hso_ep.class);
        } else {
            hso_bm var1;
            if (this.h != 30 && this.h != 10) {
                if (this.h == 50) {
                    (var1 = (hso_bm) g.a(this.k)).cF = 1;
                    var1.ba = 0;
                } else if (this.h > 80) {
                    var1 = (hso_bm) g.a(this.k);
                    this.h = 1;
                    var1.cF = 0;
                    var1.ba = 0;
                    var1.setDirection(++var1.Direction % 4, "public final void a()", hso_ep.class);
//                    var1.Direction = ++var1.Direction % 4;
                }
            } else {
                (var1 = (hso_bm) g.a(this.k)).cF = 2;
                var1.ba = 0;
                var1.t();
                var1.dg.a(var1.bx);
            }
        }

        ++this.h;
        this.f.a();
        ++this.i;
        hso_p.e.b();
        hso_p.e.b();
        hso_gb.b();
    }

    public final void d() {
        if (hso_ft.al[4]) {
            if (this.j == 0) {
                --this.k;
                this.h = 0;
            } else {
                this.b(-1);
            }

            hso_ft.d(4);
            this.f.g = this.f.j().length() + 1;
        } else if (hso_ft.al[6]) {
            if (this.j == 0) {
                ++this.k;
                this.h = 0;
            } else {
                this.b(1);
            }

            hso_ft.d(6);
            this.f.g = this.f.j().length() + 1;
        } else if (hso_ft.al[2]) {
            --this.j;
            hso_ft.d(2);
        } else if (hso_ft.al[8]) {
            ++this.j;
            hso_ft.d(8);
        }

        this.j = hso_cg.a(this.j, hso_df.gm.length - 1, true);
        if (this.k == 4) {
            hso_p.e.a = -this.a / 4;
        } else if (this.k == -1) {
            hso_p.e.a = 4 * this.a / 4;
        }

        this.k = hso_cg.a(this.k, hso_df.gn.length - 1, true);
        hso_p.e.c = this.k * this.a / 4;
        if (this.f.f()) {
            super.Z = this.f.b();
        } else {
            super.Z = null;
        }

        if (hso_ft.ak[3]) {
            this.u = (this.u + 1) % 4;
        }

        super.d();
    }

    private void b(int var1) {
        hso_bm var2 = (hso_bm) g.a(this.k);
        switch (this.j) {
            case 1:
                var2.cb += var1;
                var2.cb = this.k / this.l * this.l + hso_cg.a(var2.cb - this.k / this.l * this.l, this.l - 1, true);
                if (hso_ft.A) {
                    this.q.a = hso_df.gE[this.k / 2][var2.cb % this.l];
                    return;
                }
                break;
            case 2:
                var2.ca += var1;
                var2.ca = 8 + this.k / this.m * this.m + hso_cg.a(var2.ca - 8 - this.k / this.m * this.m, this.m - 1, true);
                var2.bU = var2.ca;
                if (hso_ft.A) {
                    if ((var1 = var2.ca) < 8) {
                        var1 = var2.bU;
                    }

                    this.r.a = hso_df.gF[0][var1 - 8];
                    return;
                }
                break;
            case 3:
                var2.bX += var1;
                var2.bX = hso_cg.a(var2.bX, hso_df.gF[1].length - 1, true);
                if (hso_ft.A) {
                    this.s.a = hso_df.gF[1][var2.bX];
                }
        }

    }

    public final void a(int var1) {
        if (this.f.f()) {
            this.f.b(var1);
        }

        super.a(var1);
    }

    public final void e() {
        this.f.g();

        for (int var1 = 0; var1 < this.o.c(); ++var1) {
            ((hso_bt) this.o.a(var1)).b();
        }

        super.e();
    }
}
