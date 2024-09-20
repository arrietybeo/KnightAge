
public final class hso_bj {

    public static hso_es a = new hso_es("EffectMonster listEffectMonster");
    private hso_ce c;
    private hso_ce d;
    private boolean e = true;
    private boolean f = false;
    private boolean g = true;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private MainObject u;
    private byte[] v = new byte[]{0, 0, 1, 1, 2, 2, 3, 3};
    private byte[] w = new byte[8];
    public static boolean b = false;

    public static void a(hso_au var0) {
        hso_bj var1;
        (var1 = new hso_bj()).o = var0.B;
        var1.u = var0;
        if (var1.u.q_()) {
            switch (var1.o) {
                case 89:
                    var1.c = new hso_ce(hso_aq.a("/eff/g128.png"), 53, 49);
                    var1.d = hso_v.b[0];
                    var1.l = -3;
                    var1.m = 70;
                    var1.s = 0;
                    var1.t = -var1.d.b - 2;
                    break;
                case 90:
                    var1.c = new hso_ce(hso_aq.a("/eff/g129.png"), 44, 44);
                    var1.d = hso_v.b[1];
                    var1.l = 0;
                    var1.m = 30;
                    var1.s = 0;
                    var1.t = -var1.d.b;
                    break;
                case 91:
                    var1.c = new hso_ce(hso_aq.a("/eff/g130.png"), 50, 51);
                    var1.d = hso_v.b[2];
                    var1.l = 0;
                    var1.m = 20;
                    var1.s = 5;
                    var1.t = -var1.d.b;
                    break;
                case 92:
                    var1.c = new hso_ce(hso_aq.a("/eff/g131.png"), 40, 40);
                    var1.d = hso_v.b[3];
                    var1.l = 22;
                    var1.m = 22;
                    var1.s = 5;
                    var1.t = -var1.d.b;
                    break;
                default:
                    break;
            }

            var1.h = var0.aY;
            var1.i = var0.aZ;
            var1.j = var1.k = -1;
            var1.k = var0.be;
            var1.p = var1.c.a;
            var1.q = var1.c.b;
            var1.e = true;
            var1.f = true;
            var1.g = false;
            var1.n = 0;
            var1.r = 0;
            new hso_ce(68);
            a.a(var1);
        }

    }

    private void b() {
        if (this.g) {
            this.e = false;
        }

        if (!this.g) {
            this.g = true;
        }

    }

    public final void a() {
        if (this.f) {
            if (b) {
                if (this.v != new byte[]{0, 0, 1, 1, 2, 2, 3, 3}) {
                    this.v = new byte[]{0, 0, 1, 1, 2, 2, 3, 3};
                }
            } else if (this.v != new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}) {
                this.v = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
            }

            if (this.u.br > 0) {
                ++this.n;
                if (this.n > this.v.length - 1) {
                    this.n = 0;
                }

                this.h = this.u.aY;
                this.i = this.u.aZ;
            } else {
                this.b();
            }

            if (GameScreen.U != 0L && hso_dw.a() - GameScreen.U > 2700000L) {
                this.b();
            }
        }

    }

    public final void a(mGraphics var1) {
        try {
            if (this.e && this.c != null) {
                if (this.j < 0) {
                    this.j = this.u.bd;
                    this.k = this.u.be;
                }

                this.c.b(this.v[this.n], this.h - this.p / 2 + this.l, this.i - this.k - this.q + this.m, 0, var1);
                return;
            }
        } catch (Exception var2) {
            this.e = false;
            this.f = false;
            this.g = false;
        }

    }

    public final void b(mGraphics var1) {
        try {
            if (this.g && this.d != null) {
                if (this.j < 0) {
                    this.j = this.u.bd;
                    this.k = this.u.be;
                }

                this.d.b(this.w[0], this.h - this.j / 2 + this.s, this.i + this.t, 0, var1);
                return;
            }
        } catch (Exception var2) {
            this.e = false;
            this.f = false;
            this.g = false;
        }

    }
}
