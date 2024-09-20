
public class hso_au extends MainObject {

    byte[][][] z;
    public int A;
    public int B;
    private int a;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    private int b;
    private int c;
    int J;
    private int d;
    public static hso_ek K = new hso_ek();
    public static hso_es L = new hso_es("MainMonster VecCatalogyMonSter");
    public int M;
    private int e;
    private int f;
    private int g;
    private int h;
    int N;
    public int O;
    public long P;
    public hso_es Q = null;
    private byte i;
    public String R = "";
    public static short[] S = new short[]{104, 103, 105, 106, 135};
    int T;

    public void a(int var1) {
    }

    public final boolean m() {
        for (int var1 = 0; var1 < S.length; ++var1) {
            if (this.B == S[var1]) {
                return true;
            }
        }

        return false;
    }

    public void a(long var1) {
    }

    public static void a(int var0, int var1, int var2, int var3) {
        hso_db var4;
        switch ((var4 = b(var3)).d) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 9:
                GameScreen.a((MainObject) (new hso_cc(var0, var4.a, var4.d, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 3:
            case 5:
            case 8:
            case 10:
                GameScreen.a((MainObject) (new hso_ac(var0, var4.a, var4.d, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 7:
                GameScreen.a((MainObject) (new hso_a(var0, var4.a, var4.d, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 11:
            default:
                GameScreen.a((MainObject) (new hso_cc(var0, var4.a, 0, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 12:
                GameScreen.a((MainObject) (new hso_cc(var0, var4.a, 12, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 13:
                if (var4.a == 110) {
                    GameScreen.a((MainObject) (new hso_cu(var0, var4.a, 13, var4.e, var1, var2, var4.c, var4.b)));
                    return;
                }

                GameScreen.a((MainObject) (new hso_fu(var0, var4.a, 13, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 14:
                GameScreen.a((MainObject) (new hso_cv(var0, var4.a, 14, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 15:
                GameScreen.a((MainObject) (new hso_ba(var0, var4.a, 14, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 16:
                GameScreen.a((MainObject) (new hso_cc(var0, var4.a, 16, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 17:
                GameScreen.a((MainObject) (new hso_cc(var0, var4.a, 17, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 18:
                GameScreen.a((MainObject) (new hso_cc(var0, var4.a, 18, var4.e, var1, var2, var4.c, var4.b)));
                return;
            case 19:
                GameScreen.a((MainObject) (new hso_ac(var0, var4.a, 19, var4.e, var1, var2, var4.c, var4.b)));
        }
    }

    public final void a(mGraphics var1, int var2, int var3) {
        hso_fd var4;
        if ((var4 = hso_bk.c((short) this.B)).a != null) {
            if (this.g <= 0) {
                if (super.bd < 0) {
                    super.be = aq.b(var4.a.a) / this.N;
                    super.bd = aq.a(var4.a.a);
                }

                this.g = super.bd;
                this.h = super.be;
                if (this.g > 26) {
                    this.g = 26;
                }

                if (this.h > 26) {
                    this.h = 26;
                }
            }

            var1.a(var4.a, super.bd / 2 - this.g / 2, 0, this.g, this.h, 0, var2, var3, 3);
        }

    }

    public void a() {
        if (super.dj && super.cF != 4) {
            super.cF = 4;
            super.aW = hso_ft.aj;
        }

        if (super.dE && super.dD) {
            this.h();
        }

        this.I();
        super.a();
    }

    public void a(mGraphics var1) {
        this.h(var1);
        this.d(var1, super.aY, super.aZ);
    }

    public void b_() {
        if (!super.dZ) {
            ++super.ba;
            if (super.ba > this.z[super.cF][super.Direction > 2 ? 2 : super.Direction].length - 1) {
                super.ba = 0;
                if (super.cF == 3) {
                    super.cF = 0;
                    super.bb = 0;
                    super.bc = 0;
                }

                if (super.cF == 2) {
                    if (!this.m()) {
                        super.cF = 0;
                        super.bb = 0;
                        super.bc = 0;
                    } else {
                        if (this.i >= 0) {
                            --this.i;
                        }

                        if (this.i <= 0) {
                            super.cF = 0;
                            super.bb = 0;
                            super.bc = 0;
                        }
                    }
                }
            }

            if (super.cF == 1 && super.bb == 0 && super.bc == 0) {
                super.cF = 0;
                super.ba = 0;
            }

            if (this.E > 0) {
                --this.E;
            }

            if ((super.dj || super.cF == 4) && (super.cx == 3 || super.cx == 4)) {
                ++this.a;
                if (this.a > 600) {
                    super.cK = true;
                }
            }

        }
    }

    public static hso_db b(int var0) {
        for (int var2 = 0; var2 < L.c(); ++var2) {
            hso_db var1;
            if ((var1 = (hso_db) L.a(var2)).a == var0) {
                return var1;
            }
        }

        return null;
    }

    public final void o() {
        if (super.cx != 5) {
            if (!this.q_() && !this.w()) {
                if (!super.dJ && !super.bH && !super.bI && !super.dK && !super.dL && !super.dZ) {
                    int var1;
                    int var2;
                    if (super.cx != 3 && super.cx != 4) {
                        if (MainObject.c(super.aY, super.aZ, this.F, this.G) > this.C + this.C / 2) {
                            if (!MainObject.c((MainObject) this) && !MainObject.d(this.F, this.G, super.bd, super.be)) {
                                super.aY = this.F;
                                super.aZ = this.G;
                                super.bf = this.F;
                                super.bg = this.G;
                                return;
                            }

                            super.bf = this.F;
                            super.bg = this.G;
                            this.h();
                            return;
                        }

                        if (!MainObject.c((MainObject) this) && !MainObject.d(this.F, this.G, super.bd, super.be)) {
                            super.aY = this.F;
                            super.aZ = this.G;
                            super.bf = this.F;
                            super.bg = this.G;
                            return;
                        }

                        ++super.dV;
                        if (super.cF != 4) {
                            if (super.dl > 0) {
                                super.dV = 0;
                                super.cF = 0;
                                super.bb = 0;
                                super.bc = 0;
                                --super.dl;
                            } else if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, GameScreen.f.aY, GameScreen.f.aZ) < 50) {
                                if (super.cF == 1) {
                                    if (super.dV > this.A / 2 || hso_ak.f(12) == 0 || MainObject.c(super.aY + super.bb, super.aZ + super.bc, this.F, this.G) >= this.C - super.bi) {
                                        super.dV = 0;
                                        super.cF = 0;
                                        super.bb = 0;
                                        super.bc = 0;
                                        if (super.aY > GameScreen.f.aY) {
                                            super.Direction = 2;
                                        } else {
                                            super.Direction = 3;
                                        }
                                    }
                                } else if (super.cF == 0 || hso_ak.f(30) == 0) {
                                    super.bb = 0;
                                    super.bc = 0;
                                    if (super.dV > this.A) {
                                        super.dV = 0;
                                        super.cF = 1;
//                              super.Direction = hso_ak.f(4);
                                        super.setDirection(hso_ak.f(4), "public final void o() ", hso_au.class);
                                        this.c(super.bi - 2);
                                    }

                                    if (super.aY > GameScreen.f.aY) {
                                        super.Direction = 2;
                                    } else {
                                        super.Direction = 3;
                                    }
                                }
                            } else if (super.cF == 1) {
                                if (super.dV > this.A || hso_ak.f(16) == 0 || MainObject.c(super.aY + super.bb, super.aZ + super.bc, this.F, this.G) >= this.C - super.bi) {
                                    super.dV = 0;
                                    super.cF = 0;
                                    super.bb = 0;
                                    super.bc = 0;
                                }
                            } else if (super.cF == 0) {
                                super.bb = 0;
                                super.bc = 0;
                                if (super.dV > this.A / 2 || hso_ak.f(12) == 0) {
                                    super.dV = 0;
                                    super.cF = 1;
//                           super.Direction = hso_ak.f(4);
                                    super.setDirection(hso_ak.f(4), "public final void o() ", hso_au.class);
                                    this.c(super.bi);
                                }
                            }

                            if (MainObject.c(super.aY, super.aZ, this.F, this.G) > this.C) {
                                var1 = hso_ak.e(super.aY - this.F);
                                var2 = hso_ak.e(super.aZ - this.G);
                                if (var1 > var2) {
                                    if (super.aY > this.F) {
                                        super.Direction = 2;
                                    } else {
                                        super.Direction = 3;
                                    }
                                } else if (super.aZ > this.G) {
                                    super.Direction = 1;
                                } else {
                                    super.Direction = 0;
                                }

                                this.c(super.bi);
                            }
                        }
                    } else {
                        super.bf = this.H;
                        super.bg = this.I;
                        this.h();
                        if (MainObject.c(super.aY, super.aZ, super.bf, super.bg) <= hso_cs.l / 2 && super.dq) {
                            if (super.cx == 3) {
                                GameScreen.a(36, super.aY, super.aZ - super.be / 2);
                                hso_cs.t = 103;
                            } else if (super.cx == 4) {
                                for (var1 = 0; var1 < 3; ++var1) {
                                    var2 = super.be;
                                    int var3 = super.bd;
                                    if (super.be <= 1) {
                                        var2 = 40;
                                    }

                                    if (var3 <= 1) {
                                        var3 = 40;
                                    }

                                    GameScreen.a(36, super.aY + hso_ak.g(var3 / 2), super.aZ - super.be / 2 + hso_ak.g(var2 / 2));
                                }

                                hso_cs.t = 110;
                            }

                            super.cK = true;
                            super.dq = false;
                            return;
                        }
                    }

                }
            }
        }
    }

    public final void p() {
        if (super.cx != 5) {
            ++super.dV;
            if (super.cF != 4) {
                if (super.cF == 1) {
                    if (super.dV > this.A || hso_ak.f(16) == 0) {
                        super.dV = 0;
                        super.cF = 0;
                        super.bb = 0;
                        super.bc = 0;
                        MainObject var1;
                        if ((var1 = MainObject.a(super.cQ, (byte) 0)) != null) {
                            if (super.aY > var1.aY) {
                                super.Direction = 2;
                                return;
                            }

                            super.Direction = 3;
                            return;
                        }
                    }
                } else if (super.cF == 0) {
                    super.bb = 0;
                    super.bc = 0;
                    if (super.dV > this.A / 2 || hso_ak.f(12) == 0) {
                        super.dV = 0;
                        super.cF = 1;
                        super.Direction = hso_ak.f(4);
                        super.setDirection(hso_ak.f(4), " public final void p()", hso_au.class);
                        this.h(super.bi);
                    }
                }
            }

        }
    }

    public void q() {
        if (super.cx != 5) {
            if (!super.bH) {
                if (!super.bI) {
                    if (this.Q != null && this.Q.c() > 0) {
                        hso_bf var4 = (hso_bf) this.Q.a(0);
                        if (hso_ft.aj - this.P > (long) this.O) {
                            super.cQ = var4.a;
                            var4.g = super.dn;
                            this.t();
                            this.s();
                            return;
                        }

                        MainObject var2;
                        if ((var2 = MainObject.a(var4.a, var4.b)) == null) {
                            super.cU = false;
                            return;
                        }

                        super.bf = var2.aY;
                        super.bg = var2.aZ;
                        int var3 = var4.g.c;
                        if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var2.aY, var2.aZ) <= var3) {
                            super.cQ = var4.a;
                            this.t();
                            this.s();
                            return;
                        }

                        if (hso_ak.e(super.aY - super.bf) >= 4 || hso_ak.e(super.aZ - super.bg) >= 4) {
                            this.p_();
                            return;
                        }
                    } else {
                        MainObject var1;
                        if ((var1 = MainObject.a(super.cQ, (byte) 0)) == null) {
                            super.cU = false;
                            return;
                        }

                        super.bf = var1.aY;
                        super.bg = var1.aZ;
                        if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var1.aY, var1.aZ) <= this.D) {
                            super.bb = 0;
                            super.bc = 0;
                            super.cF = 0;
                            super.bf = super.aY;
                            super.bg = super.aZ;
                            if (hso_ak.f(30) == 0) {
                                this.E = 20;
                            }

                            if (super.aY > var1.aY) {
                                super.Direction = 2;
                                return;
                            }

                            super.Direction = 3;
                            return;
                        }

                        if (hso_ak.e(super.aY - super.bf) >= 4 || hso_ak.e(super.aZ - super.bg) >= 4) {
                            this.p_();
                        }
                    }

                }
            }
        }
    }

    public final void r() {
        hso_au var1 = this;
        int var3 = 0;
        boolean var4;
        if (super.di == 7) {
            super.aY = this.F;
            super.aZ = this.G;
        } else {
            do {
                var1.aY = var1.F + hso_ak.g(48);
                var1.aZ = var1.G + hso_ak.g(48);
                int var2;
                var4 = (var2 = hso_ft.p.a(var1.aY, var1.aZ)) != 1 && var2 != -1;
                ++var3;
                if (var3 > 15) {
                    var4 = true;
                    var1.aY = var1.F;
                    var1.aZ = var1.G;
                }
            } while (!var4);
        }

        super.cU = false;
        this.M();
        this.e = 0;
        this.E = 0;
        this.f = 5;
        super.ba = 0;
        super.cF = 0;
        super.dV = 0;
        super.dj = false;
        this.b = 0;
        this.c = 0;
        super.br = super.bs;
        super.df.d();
        this.J = this.d = 0;
    }

    public void a_() {
        if (super.cF == 4) {
            ++this.e;
            if (hso_ft.ai % 10 == 0 && super.dA >= 0 && super.dj && (hso_ft.aj - super.aW) / 1000L > (long) super.dA) {
                this.r();
            }

            if (!super.dj) {
                super.aY += this.b;
                super.aZ += this.c;
                if (this.J > 0) {
                    this.J -= 3;
                    if (this.J <= 0 && this.d > 2) {
                        this.d -= 2;
                        this.J = this.d;
                        if (hso_ak.e(this.b) > 1) {
                            this.b -= this.b / hso_ak.e(this.b);
                        }

                        if (hso_ak.e(this.c) > 1) {
                            this.c -= this.c / hso_ak.e(this.c);
                        }
                    }
                } else {
                    this.b >>= 1;
                    this.c >>= 1;
                }

                if (this.e >= this.f) {
                    GameScreen.a(11, super.aY, super.aZ - super.be / 4);
                    if (this.q_() && this.w()) {
                        if (super.dx < -10) {
                            super.dj = true;
                        }
                    } else {
                        super.dj = true;
                    }
                }
            }

            if (this.q_() || this.w() || super.di == 16) {
                --super.dx;
                if (super.dx > 0 && super.cJ < 70) {
                    ++super.cJ;
                    int var1;
                    int var2;
                    int var3;
                    if (hso_ak.f(3) == 1) {
                        if (hso_ak.f(2) == 1) {
                            hso_cs.t = 103;
                        }

                        var1 = hso_ak.c(1, 3);

                        for (var2 = 0; var2 < var1; ++var2) {
                            var3 = hso_ak.g(25);
                            int var4 = hso_ak.g(30);
                            GameScreen.a(36, super.aY + var3, super.aZ + var4 - super.be / 3 + 10);
                            if (hso_ak.f(3) == 1) {
                                GameScreen.a(9, super.aY + var3, super.aZ + var4 - super.be / 3 + 10);
                            }
                        }
                    }

                    if (super.cJ >= 70) {
                        for (var1 = 0; var1 < 6; ++var1) {
                            var2 = hso_ak.g(25);
                            var3 = hso_ak.g(30);
                            GameScreen.a(36, super.aY + var2, super.aZ + var3 - super.be / 3 + 10);
                            if (hso_ak.f(3) == 1) {
                                GameScreen.a(9, super.aY + var2, super.aZ + var3 - super.be / 2 + 10);
                            }
                        }

                        super.cK = true;
                        return;
                    }
                }
            }
        } else if (super.br <= 0) {
            super.br = 0;
            super.cF = 4;
            super.aW = hso_ft.aj;
            this.M();
        }

    }

    public final void b(int var1, int var2, int var3, int var4) {
        super.aW = hso_ft.aj;
        super.cF = 4;
        super.bb = 0;
        super.bc = 0;
        this.b = var1;
        this.c = var2;
        this.J = var4;
        this.d = var4;
        this.f = var3;
        super.dj = false;
        if (this.q_() || this.w() || super.di == 16) {
            this.b = 0;
            this.c = 0;
            this.J = 0;
            this.d = 0;
        }

    }

    public final void s() {
        if (this.Q != null && this.Q.c() > 0) {
            hso_bf var1;
            if ((var1 = (hso_bf) this.Q.a(0)) != null && var1.g != null) {
                if (var1.g.a == 124) {
                    GameScreen.a((int) super.ct, (byte) 1);
                } else {
                    GameScreen.a(var1.g.a, super.ct, (byte) 1, this.Q, var1.g.b);
                }
            }

            this.Q = null;
        }

    }

    public final void t() {
        super.cF = 2;
        this.i = (byte) hso_ak.c(3, 5);
        this.N();
        super.ba = 0;
    }

    public final boolean u() {
        return super.di == 17 || super.di == 19 || super.di == 18;
    }
}
