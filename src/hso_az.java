
public final class hso_az extends hso_p {

    private int a;
    private int b;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private hso_aw k = new hso_aw();
    private hso_bt l;
    private hso_aq m;
    private byte n = -1;
    private boolean o = true;

    public static hso_az b() {
        if (hso_ft.n == null) {
            hso_ft.n = new hso_az();
        }

        return hso_ft.n;
    }

    public final void c() {
        this.o = true;
        super.c = hso_ft.c;
        this.l = new hso_bt(hso_df.af, -1, this);
        this.a = hso_ft.q.a;
        this.b = hso_ft.q.b;
        this.f = hso_ft.p.e;
        this.g = hso_ft.p.f;
        if (this.f > hso_ft.W - hso_ft.aa) {
            this.f = hso_ft.W - hso_ft.aa;
        }

        if (this.g > hso_ft.X - hso_ft.aa) {
            this.g = hso_ft.X - hso_ft.aa;
        }

        this.h = (this.f - this.a) / 5;
        this.i = (this.g - this.b) / 5;
        if (hso_ft.A) {
            this.j = 3;
            this.m = hso_ex.a(this.j);
        } else {
            this.j = hso_ex.c;
            this.m = hso_ex.e;
        }

        this.n = -1;
        super.c();
        if (this.a == this.f && this.b == this.g) {
            this.o = false;
        }

    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case -1:
                if (!this.o) {
                    this.n = 2;
                    return;
                } else if (this.n == 0) {
                    this.n = 1;
                }
            default:
        }
    }

    public final void a(mGraphics var1) {
        super.c.a(var1);
        if (GameScreen.q.c(hso_ft.p.d)) {
            hso_ft.a(var1);
            var1.e(0, 0, hso_ft.W, hso_ft.X);
        }

        if (hso_ft.A) {
            var1.a(hso_ft.W - this.a * this.j, 0);
        } else {
            var1.a(hso_ft.W - this.a * this.j - 3, hso_ft.X - 23 - this.b * this.j);
        }

        var1.a(-9164782);
        var1.c(-3, -3, this.a * this.j + 6, this.b * this.j + 6);
        var1.a(-470164);
        var1.c(-2, -2, this.a * this.j + 4, this.b * this.j + 4);
        var1.a(-12052464);
        var1.c(-1, -1, this.a * this.j + 2, this.b * this.j + 2);
        var1.d(0, 0, this.a * this.j, this.b * this.j);
        if (this.m != null) {
            var1.a(this.m, 0, 0, 0);
        }

        int var2;
        if (hso_cs.w == 2) {
            for (var2 = 0; var2 < GameScreen.i.c(); ++var2) {
                MainObject var3;
                if ((var3 = (MainObject) GameScreen.i.a(var2)).cu == 1) {
                    hso_cg.aD.b(11, var3.aY / hso_cs.l * this.j, var3.aZ / hso_cs.l * this.j, 0, 3, var1);
                }
            }
        }

        for (var2 = 0; var2 < hso_ex.f.c(); ++var2) {
            hso_fk var4 = (hso_fk) hso_ex.f.a(var2);
            hso_cg.aD.b(var4.d + 4, var4.b / hso_cs.l * this.j, var4.c / hso_cs.l * this.j, 0, 3, var1);
        }

        hso_cg.aD.b(GameScreen.f.cF == 4 ? 9 : GameScreen.f.Direction, GameScreen.f.aY / hso_cs.l * this.j, GameScreen.f.aZ / hso_cs.l * this.j, 0, 3, var1);
        var1.a(-16776961);
        if (Player.N != null) {
            for (var2 = 0; var2 < Player.N.b.c(); ++var2) {
                hso_aj var5;
                if ((var5 = (hso_aj) Player.N.b.a(var2)).b.compareTo(GameScreen.f.cB) != 0 && var5.f == hso_ft.p.d) {
                    hso_cg.aD.b(10, var5.d / hso_cs.l * this.j, var5.e / hso_cs.l * this.j, 0, 3, var1);
                }
            }
        }

        if (hso_ex.g != null && hso_ex.g.p == hso_ft.p.d) {
            var2 = hso_ex.g.a;
            int var6 = hso_ex.g.b;
            if (var2 < this.k.a + 3) {
                var2 = this.k.a + 3;
            }

            if (var2 > this.k.a + this.a * this.j - 3) {
                var2 = this.k.a + this.a * this.j - 3;
            }

            if (var6 < this.k.b + 3) {
                var6 = this.k.b + 3;
            }

            if (var6 > this.k.b + this.b * this.j - 3) {
                var6 = this.k.b + this.b * this.j - 3;
            }

            hso_ck.b.b(hso_ft.ai / 2 % hso_ck.b.c, var2, var6, 0, 3, var1);
        }

        hso_ft.a(var1);
        if (GameScreen.q.c(hso_ft.p.d)) {
            GameScreen.q.a(var1, 10, 40, 20, 20);
        }

        GameScreen.q.c(var1, hso_ft.W, 0);
//        GameScreen.q.show(var1, hso_ft.W, 0);
    }

    public final void a() {
        if (this.n == 2) {
            this.m = null;
            super.c.c();
        } else if (this.n == 1) {
            if (this.a > hso_ft.q.a) {
                this.a -= this.h << 1;
                if (this.a <= hso_ft.q.a) {
                    this.a = hso_ft.q.a;
                    this.n = 2;
                }
            }

            if (this.b > hso_ft.q.b) {
                this.b -= this.i << 1;
                if (this.b <= hso_ft.q.b) {
                    this.b = hso_ft.q.b;
                    this.n = 2;
                }
            }
        } else {
            if (this.a < this.f) {
                this.a += this.h;
                if (this.a >= this.f) {
                    this.a = this.f;
                    this.n = 0;
                }
            }

            if (this.b < this.g) {
                this.b += this.i;
                if (this.b >= this.g) {
                    this.b = this.g;
                    this.n = 0;
                }
            }
        }

        super.c.a();

        for (int var1 = 0; var1 < hso_ft.al.length; ++var1) {
            if (hso_ft.al[var1]) {
                this.l.a();
                hso_ft.d(var1);
                return;
            }
        }

    }

    public final void e() {
        if (hso_ft.Q) {
            this.l.a();
        }

    }
}
