
public final class hso_dd extends hso_bz {

    private int d;
    private int e;
    private int f;
    public int b;
    public int c;
    private MainObject g;
    private hso_ab h = new hso_ab();
    private hso_ce i;

    public final void a(int var1, int var2, int var3, int var4, short var5, MainObject var6, MainObject var7) {
        hso_ab var10000 = this.h;
        int var10 = var6.V();
        hso_ab var9 = var10000;
        var10000.e = var2;
        var9.f = var3;
        var9.h = var7;
        var9.k = false;
        switch (var10) {
            case 0:
                var9.a = 90;
                break;
            case 1:
                var9.a = 270;
                break;
            case 2:
                var9.a = 180;
                break;
            case 3:
                var9.a = 0;
        }

        var9.d = 15360;
        var9.i = 0;
        var9.b = var9.d * hso_ak.b(var9.a) >> 10;
        var9.c = var9.d * hso_ak.a(var9.a) >> 10;
        this.b = -1;
        this.c = -1;
        this.d = var4;
        super.a = false;
        this.i = new hso_ce(var5);
        this.g = var7;
    }

    public final void a() {
        hso_ab var1;
        try {
            if ((var1 = this.h).h == null) {
                var1.k = true;
            } else {
                int var2 = var1.h.aY - var1.e;
                int var3 = var1.h.aZ - (var1.h.U() >> 1) - var1.f;
                ++var1.i;
                if (hso_ak.e(var2) < 16 && hso_ak.e(var3) < 16) {
                    var1.k = true;
                } else {
                    int var4;
                    if (Math.abs((var4 = hso_ak.a(var2, var3)) - var1.a) < 90 || var2 * var2 + var3 * var3 > 4096) {
                        if (Math.abs(var4 - var1.a) < 15) {
                            var1.a = var4;
                        } else if ((var4 - var1.a < 0 || var4 - var1.a >= 180) && var4 - var1.a >= -180) {
                            var1.a = hso_ak.d(var1.a - 15);
                        } else {
                            var1.a = hso_ak.d(var1.a + 15);
                        }
                    }

                    if (var1.d < 8192) {
                        var1.d = (short) (var1.d + 1024);
                    }

                    var1.b = var1.d * hso_ak.b(var1.a) >> 10;
                    var1.c = var1.d * hso_ak.a(var1.a) >> 10;
                    var2 = var2 + var1.b >> 10;
                    var1.e += var2;
                    var3 = var3 + var1.c >> 10;
                    var1.f += var3;
                    var1.g = hso_ch.a(hso_ak.a(var2, -var3));
                    var1.j = hso_ch.b[var1.g];
                }
            }

            this.e = this.h.e;
            this.f = this.h.f;
            if (this.b != -1) {
                hso_br.a((hso_dx) (new hso_cx(57, this.b, this.e, this.f)), "hso_dd (public final void a() {)");
            }

            if (this.h.k) {
                if (this.c != -1) {
                    if (this.d < 0) {
                        GameScreen.a("" + this.d, this.g.aY, this.g.aZ - this.g.be, 2, this.g.ct);
                    }

                    if (this.d > 0) {
                        GameScreen.a("+" + this.d, this.g.aY, this.g.aZ - this.g.be, 0, this.g.ct);
                    }

                    GameScreen.a(57, this.c, this.e, this.f);
                }

                super.a = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public final void a(mGraphics var1) {
        if (this.i != null) {
            this.i.c(0, this.e, this.f, this.h.j, 3, var1);
        }

    }
}
