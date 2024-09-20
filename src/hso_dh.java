
public final class hso_dh extends hso_ct {

    private MainObject i;
    private MainObject j;
    private int k;
    private int l;
    private int m;
    private int n;
    private hso_es o;
    public byte g = -1;
    private static short p = 0;
    private static long q = 0L;
    private static long r;
    public static int h = 600;

    public final void a(MainObject var1, hso_es var2, int var3, byte var4) {
        if (var2 != null && var2.c() > 0) {
            if (var3 <= hso_ct.a[var1.bx].length - 1) {
                this.g = var4;
                this.i = var1;
                hso_bf var5 = (hso_bf) var2.a(0);
                this.j = MainObject.a(var5.a, var5.b);
                this.o = var2;
                if (this.i != null && this.i.cF != 4 && this.j != null && this.j.cF != 4) {
                    if (var1.cu == 9) {
                        this.k = hso_ct.a[6][var3];
                    } else {
                        this.k = hso_ct.a[var1.bx][var3];
                    }

                    this.n = var3;
                    var1.cz = var3;
                    this.l = hso_ct.d[this.k];
                    this.m = hso_ct.e[this.k];
                    if (var1.bx == 3) {
                        this.l /= 2;
                        this.m /= 2;
                    }

                    if (var1 == GameScreen.f) {
                        this.d(hso_ct.b(var3));
                    } else {
                        this.d(hso_ct.c[this.k]);
                    }
                } else {
                    var1.cz = -1;
                    var1.cQ = -1;
                    var1.cR = null;
                }
            }
        }
    }

    private void d(int var1) {
        if (MainObject.c(this.i.aY, this.i.aZ, this.j.aY, this.j.aZ - this.j.be / 4) > var1 && this.i.cu != 9) {
            int var2 = hso_ak.a(this.i.aY - this.j.aY, this.i.aZ - this.j.aZ);
            int var6 = 0;

            int var3;
            int var4;
            int var5;
            do {
                do {
                    var4 = this.j.aY + hso_ak.b(hso_ak.d(var2 % 360)) * (var1 - 5) / 1000;
                    var5 = this.j.aZ + hso_ak.a(hso_ak.d(var2 % 360)) * (var1 - 5) / 1000;
                    var3 = hso_ft.p.a(var4, var5);
                    var2 += hso_ak.g(90);
                    ++var6;
                    if (var6 > 12) {
                        this.i.cN = null;
                        hso_ft.c(hso_df.aR);
                        this.i.cz = -1;
                        this.i.cQ = -1;
                        this.i.cR = null;
                        this.f();
                        return;
                    }
                } while (var3 == -1);
            } while (var3 == 1);

            if (this.i == GameScreen.f) {
                this.i.bf = this.i.aY;
                this.i.bg = this.i.aZ;
                GameScreen.f.cl = 0;
                GameScreen.f.cm = 0;
                this.i.cN = hso_ft.c.a(var4 / hso_cs.l, var5 / hso_cs.l, this.i.aY / hso_cs.l, this.i.aZ / hso_cs.l, (int) 12);
                Player.O = -1;
                Player.P = -1;
                if (this.i.cN == null) {
                    this.i.bf = var4;
                    this.i.bg = var5;
                    this.i.bl = var4;
                    this.i.bm = var5;
                    this.i.cN = null;
                } else if (this.i.cN.length > 12) {
                    this.i.cN = null;
                    hso_ft.c(hso_df.aR);
                    this.f();
                    this.i.cz = -1;
                    this.i.cQ = -1;
                    this.i.cR = null;
                } else {
                    this.i.bl = var4;
                    this.i.bm = var5;
                    GameScreen.f.cl = this.i.bl;
                    GameScreen.f.cm = this.i.bm;
                }

                this.i.cI = 0;
            } else {
                this.i.bf = var4;
                this.i.bl = var4;
                this.i.bg = var5;
                this.i.bm = var5;
            }

            if (this.i.cu == 1) {
                this.i.cQ = this.j.ct;
                return;
            }

            this.i.cR = this.o;
        } else {
            this.i.bf = this.i.aY;
            this.i.bg = this.i.aZ;
            this.i.bb = 0;
            this.i.bc = 0;
            if (this.i.cu != 9) {
                this.i.t();
                this.i.dg.a(this.l);
                this.i.cz = -1;
                if (this.k == 53) {
                    this.i.Direction = 1;
                } else {
//               this.i.Direction = hso_ct.a(this.i, this.j);
                    this.i.setDirection(hso_ct.a(this.i, this.j), "private void d(int var1)", hso_dh.class);
                }

                this.g();
                return;
            }
        }

    }

    private void f() {
        if (this.i == GameScreen.f && Player.o == 1 && Player.X) {
            this.j.dy = true;
            this.i.bf = this.i.aY;
            this.i.bg = this.i.aZ;
            this.i.cl = Player.R;
            this.i.cm = Player.S;
            this.i.cN = hso_ft.c.a(this.i.cl / hso_cs.l, this.i.cm / hso_cs.l, this.i.aY / hso_cs.l, this.i.aZ / hso_cs.l, (int) 20);
            Player.O = -1;
            Player.P = -1;
            if (this.i.cN != null && this.i.cN.length > 20) {
                this.i.cN = null;
            }
        }

    }

    public final void b() {
        if (this.i != null && this.j != null) {
            this.i.bf = this.i.aY;
            this.i.bg = this.i.aZ;
            this.i.bb = 0;
            this.i.bc = 0;
            this.i.t();
            this.i.dg.a(this.l);
            this.i.cz = -1;
            if (this.k == 53) {
                this.i.Direction = 1;
            } else {
//            this.i.Direction = hso_ct.a(this.i, this.j);
                this.i.setDirection(hso_ct.a(this.i, this.j), " public final void b() ", hso_dh.class);
            }

            this.g();
        } else {
            this.i.cz = -1;
            this.i.cQ = -1;
            this.i.cR = null;
        }
    }

    public final void c() {
        if (this.i != null && this.j != null) {
            if (this.i.cu == 9) {
                if (this.g > -1) {
                    GameScreen.a(hso_ct.f[this.k], this.i.ct, this.i.cu, this.o, (byte) ((byte) hso_ct.b[this.g][this.n]), 500);
                    ((hso_s) this.i).a((byte) 4);
                    return;
                }
            } else if (this.i.cP == this.m) {
                if (this.i == GameScreen.f) {
                    hso_ev var1 = hso_ct.c(this.n);
                    if (hso_ft.aj - q > (long) p) {
                        p = var1.j;
                        q = hso_ft.aj;
                        hso_es var2 = GameScreen.f.a(this.n, this.j);
                        this.o = var2;
                        if (this.g > -1) {
                            Service.a().a((byte) this.n, this.j.cu, var2);
                        } else if (this.j.cu == 1) {
                            Service.a().a(var2, (byte) this.n);
                        } else if (this.j.cu == 0) {
                            Service.a().b(var2, (byte) this.n);
                        }
                    }
                }

                if (this.g > -1) {
                    GameScreen.a(hso_ct.f[this.k], this.i.ct, this.i.cu, this.o, (byte) ((byte) hso_ct.b[this.g][this.n]), 1250);
                    return;
                }

                GameScreen.a(hso_ct.f[this.k], this.i.ct, this.i.cu, this.o);
            }

        } else {
            this.i.cz = -1;
            this.i.cQ = -1;
            this.i.cR = null;
        }
    }

    private void g() {
        if (this.i == GameScreen.f) {
            GameScreen.f.d(this.k, this.n);
        }

        switch (this.k) {
            case 5:
            case 21:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 400, 0);
                return;
            case 6:
            case 47:
            case 48:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 600, 4);
                return;
            case 14:
            case 34:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 600, 3);
                return;
            case 18:
            case 19:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 300, 1);
                return;
            case 20:
            case 46:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 300, 4);
                return;
            case 22:
            case 36:
            case 44:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 300, 3);
                return;
            case 23:
            case 41:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 300, 0);
                return;
            case 24:
            case 40:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 400, 1);
                return;
            case 27:
            case 37:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 400, 3);
                return;
            case 39:
            case 51:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 400, 4);
                return;
            case 42:
            case 43:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 600, 0);
                return;
            case 49:
            case 50:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 400, 1);
                return;
            case 52:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 600, 1);
                return;
            case 53:
                GameScreen.a(30, this.i.ct, this.i.cu, this.o, (int) 600, 1);
                return;
            case 54:
            case 58:
            case 64:
            case 68:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 600, 0);
                return;
            case 55:
            case 59:
            case 65:
            case 69:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 600, 3);
                return;
            case 56:
            case 61:
            case 62:
            case 66:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 300, 4);
                return;
            case 57:
            case 60:
            case 63:
            case 67:
                GameScreen.a(29, this.i.ct, this.i.cu, this.o, (int) 400, 1);
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 35:
            case 38:
            case 45:
            default:
        }
    }

    public static void d() {
        r = System.currentTimeMillis();
    }

    public static boolean e() {
        return System.currentTimeMillis() - r > (long) h;
    }
}
