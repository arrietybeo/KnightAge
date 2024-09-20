
public final class hso_a extends hso_au {

    private int a = 0;
    private boolean b = false;
    private static byte[] c = new byte[]{0, 1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1, 0};
    private static byte[][] d = new byte[][]{new byte[8], {0, 0, -1, -1, 0, 0, 1, 1}};
    private int e = 0;
    private int f;

    public hso_a(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
        super.cu = 1;
        super.di = var3;
        super.ct = var1;
        super.B = var2;
        super.F = var5;
        super.G = var6;
        super.aY = var5;
        super.aZ = var6;
        super.cB = var4;
        super.bs = var7;
        super.br = var7;
        super.by = (short) var8;
        super.M = 1;
        super.Direction = 0;
        super.N = 6;
        super.bd = super.be = -1;
        super.bo = -2;
    }

    public final void a(mGraphics var1) {
        if (!super.dj) {
            hso_fd var2;
            if ((var2 = hso_bk.c((short) super.B)).a != null) {
                if (super.bd < 0) {
                    if (super.B <= 92) {
                        super.be = aq.b(var2.a.a) / super.N;
                        super.bd = aq.a(var2.a.a);
                    } else {
                        super.be = aq.b(var2.a.a) / 3;
                        super.bd = aq.a(var2.a.a) / 2;
                    }
                }

                int var3 = 0;
                int var4 = c[super.ba / 3] * super.be;
                if (super.B > 92) {
                    var3 = c[super.ba / 3] / 3 * super.bd;
                    var4 = c[super.ba / 3] % 3 * super.be;
                }

                if (this.b) {
                    if (super.bR > 0) {
                        var1.a(var2.a, var3, var4, super.bd, this.f, 0, super.aY, super.aZ - super.be / 2, 33);
                        var1.a(var2.a, var3, var4 + super.be - this.f, super.bd, this.f, 0, super.aY, super.aZ - super.be / 2 + this.f, 33);
                    }
                } else {
                    var1.a(var2.a, var3, var4, super.bd, super.be, 0, super.aY + d[0][this.a / 3], super.aZ + d[1][this.a / 3], 33);
                }
            }

            if (super.cF != 4 && !this.b) {
                this.a(var1, 0);
            }
        }

    }

    public final void a() {
        this.a_();
        if (super.cF != 4) {
            if (this.b) {
                ++super.bR;
                this.f += 2;
                if (this.f >= (super.be - 1) / 2) {
                    this.b = false;
                    super.bR = 0;
                    this.f = 10;
                }
            }

            ++super.ba;
            if (super.ba / 3 > c.length - 1) {
                super.ba = 0;
            }

            ++this.a;
            if (this.a / 3 > d[0].length - 1) {
                this.a = 0;
            }
        }

        super.a();
    }

    public final void a_() {
        if (super.cF == 4) {
            if (hso_ak.f(3) == 1) {
                if (hso_ak.f(2) == 1) {
                    hso_cs.t = 103;
                }

                int var1 = hso_ak.c(1, 3);

                for (int var2 = 0; var2 < var1; ++var2) {
                    int var3 = hso_ak.g(20);
                    int var4 = hso_ak.g(30);
                    GameScreen.a(36, super.aY + var3, super.aZ + var4 - super.be / 2);
                    if (hso_ak.f(3) == 1) {
                        GameScreen.a(9, super.aY + var3, super.aZ + var4 - super.be / 2);
                    }
                }
            }

            if (super.dA >= 0 && (hso_ft.aj - super.aW) / 1000L > (long) (super.dA - 1)) {
                this.r();
                this.b = true;
                super.bR = 0;
                this.f = 10;
                GameScreen.a(81, super.aY, super.aZ - 20, 200, (short) 0, (byte) 0);
                GameScreen.a(39, super.aY, super.aZ - super.be / 2);
                return;
            }
        } else if (super.br <= 0) {
            super.br = 0;
            super.cF = 4;
            this.M();
            super.aW = hso_ft.aj;
        }

    }
}
