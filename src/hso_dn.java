
public final class hso_dn extends hso_p {

    private String[] a;
    private int b;
    private int f;
    private int g = 0;
    private int h;
    private hso_eh i = new hso_eh();
    private static int[] j = null;
    private hso_bt k;

    public static void b() {
        if (!hso_ft.D && !hso_f.a) {
            j = new int[3];
        } else {
            j = new int[2];
        }
    }

    public final void g() {
        if (this.k == null) {
            this.k = new hso_bt(hso_df.aa, -1, this);
            this.k.a = hso_df.aa;
            this.k.a(hso_ft.Y, hso_ft.X - hso_bt.k, (hso_ce) null, this.k.a);
            super.aa = this.k;
        }

        int var1;
        if (this.g < j.length) {
            var1 = 220;
            if (220 > hso_ft.W) {
                var1 = hso_ft.W - 10;
            }

            if (j[this.g] == 0) {
                this.a = hso_o.f.a(hso_df.gp[this.g], var1);
                this.b = 180 + this.a.length * hso_ft.ab;
                this.h = 1;
                if (this.a.length < 4) {
                    this.h = 2;
                }
            } else {
                this.i.a(hso_df.gp[this.g], 0, hso_ft.Y - var1 / 2, hso_ft.Z, 220, hso_o.f);
            }

            ++this.g;
        } else {
            hso_ft.c.c();
            hso_ft.ad = hso_ft.Z;
            this.g = 0;
            if (hso_ew.a != null) {
                for (var1 = 0; var1 < hso_ew.a.c(); ++var1) {
                    ((hso_ew) hso_ew.a.a(var1)).b();
                    GameScreen.f.Direction = 1;
                }
            }

        }
    }

    public final void a(mGraphics var1) {
        var1.a(0);
        var1.c(0, 0, hso_ft.W, hso_ft.X);
        var1.d(0, hso_ft.Z - 90, hso_ft.W, 180);
        if (this.a != null) {
            for (int var2 = 0; var2 < this.a.length; ++var2) {
                hso_o.f.a(var1, this.a[var2], hso_ft.Y, hso_ft.Z + 80 + var2 * hso_ft.ab - this.f, 2, true);
            }
        } else if (this.i.a != null) {
            this.i.a(var1);
            hso_ft.a(var1);
            hso_cg.a(var1, hso_df.aa, hso_ft.Y, hso_ft.X - hso_ft.aa / 2 - 4, 2);
        }

        super.a(var1);
    }

    public final void a() {
        if (this.a != null) {
            this.f += this.h;
            if (this.f > this.b) {
                this.a = null;
                this.g();
                this.f = 0;
                return;
            }
        } else if (this.i.a != null) {
            this.i.b();
        }

    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case -1:
                this.g = j.length;
                this.g();
            default:
        }
    }

    public final void d() {
        if (hso_ft.ak[5]) {
            this.g = j.length;
            this.g();
            hso_ft.c(5);
        }

        if (this.i.a != null) {
            if (hso_ft.al[5] && this.i.a()) {
                this.i.a = null;
                this.g();
                hso_ft.d(5);
            }

            super.d();
        }

    }
}
