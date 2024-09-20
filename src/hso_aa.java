
public final class hso_aa {

    private byte a;
    private byte b;
    private byte c;
    private byte d;
    private int e;
    private byte f;
    private int g;
    private int h;
    private long i;
    private int j;
    private int k;
    private int l;
    private static byte[][] m = new byte[][]{{0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3, 4}, {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, {0, 0, 1, 1, 2, 2, 1, 3, 3, 3, 0, 0, 1, 1, 2, 2, 1, 3, 3, 3}};
    private int n;

    public hso_aa(byte var1, int var2) {
        this.e = var2;
        this.f = var1;
        this.i = hso_dw.a();
        switch (this.f) {
            case 0:
                this.k = 5;
                this.l = -25;
                this.j = 1;
                return;
            case 1:
                this.k = 0;
                this.l = -12;
                this.j = 2;
                return;
            case 2:
                this.k = 5;
                this.l = 0;
                this.j = 3;
            default:
        }
    }

    public final void a(mGraphics var1, int var2, int var3) {
        hso_aq var4;
        if ((var4 = hso_ay.a(this.e)) != null && var4.a != null) {
            if (this.g == 0 || this.h == 0) {
                this.g = hso_i.a[this.e][0];
                this.h = hso_i.a[this.e][1];
            }

            if (this.i - hso_dw.a() < 0L) {
                switch (this.f) {
                    case 0:
                        if (this.n == 0) {
                            var1.a(var4, 0, this.c * this.h, this.g, this.h, 0, var2 + this.k, var3 + this.l, 3);
                            return;
                        }

                        var1.a(var4, 0, this.d * this.h, this.g, this.h, 0, var2 - this.k, var3 + this.l, 3);
                        return;
                    case 1:
                        var1.a(var4, 0, this.c * this.h, this.g, this.h, 0, var2 + this.k, var3 + this.l, 3);
                        return;
                    case 2:
                        var1.a(var4, 0, this.c * this.h, this.g, this.h, 0, var2 + this.k, var3 + this.l, 3);
                        var1.a(var4, 0, this.d * this.h, this.g, this.h, 0, var2 - this.k, var3 + this.l, 3);
                }
            }
        }

    }

    public final void a() {
        if (this.i - hso_dw.a() < 0L) {
            switch (this.f) {
                case 0:
                    if (hso_ft.ai % 2 == 0) {
                        ++this.a;
                    }

                    if (this.a > m[this.f].length - 1) {
                        this.a = 0;
                        this.j = hso_ak.f(10);
                        this.i = (long) (this.j * 1000) + hso_dw.a();
                        if (this.j % 2 == 0) {
                            this.n = 0;
                        } else {
                            this.n = 1;
                        }
                    }

                    this.c = m[this.f][this.a];
                    if (hso_ft.ai % 4 == 0) {
                        ++this.b;
                    }

                    if (this.b > m[this.f].length - 1) {
                        this.b = 0;
                    }

                    this.d = m[this.f][this.b];
                    return;
                case 1:
                    ++this.a;
                    if (this.a > m[this.f].length - 1) {
                        this.a = 0;
                        this.j = hso_ak.f(10);
                        this.i = (long) (this.j * 1000) + hso_dw.a();
                    }

                    this.c = m[this.f][this.a];
                    return;
                case 2:
                    if (hso_ft.ai % 2 == 0) {
                        ++this.a;
                    }

                    if (this.a > m[this.f].length - 1) {
                        this.a = 0;
                        this.j = hso_ak.f(10);
                        this.i = (long) (this.j * 1000) + hso_dw.a();
                    }

                    this.c = m[this.f][this.a];
                    if (hso_ft.ai % 3 == 0) {
                        ++this.b;
                    }

                    if (this.b > m[this.f].length - 1) {
                        this.b = 0;
                    }

                    this.d = m[this.f][this.b];
            }
        }

    }
}
