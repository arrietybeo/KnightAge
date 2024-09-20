
public final class hso_ga extends hso_s {

    private byte U;
    private int V;
    private int W;
    private int X;
    private int ej;

    public hso_ga(MainObject var1, short var2, byte var3, byte var4, byte var5) {
        super(var2, var3, var4, var5);
        byte[] var10000 = new byte[]{0, 5, 5};
        this.U = 0;
        this.V = 0;
        this.W = 0;
        super.w = var1;
        super.cu = 9;
        super.ct = var1.ct;
        super.F = var1.aY;
        super.G = var1.aZ;
        super.aY = var1.aY;
        super.aZ = var1.aZ;
        super.o = var1.aY;
        super.p = var1.aZ;
        super.bd = -1;
        super.be = -1;
        super.C = 48;
        super.Direction = 0;
        super.bi = 4;
        super.cF = 0;
        super.k = 0;
        super.A = hso_ak.c(200, 250);
        super.M = 0;
        super.D = 10;
        super.O = 0;
        super.t = 50;
        if (var4 != 3 && var4 != 9) {
            this.U = 6;
        } else {
            this.U = 0;
        }
    }

    public hso_ga(short var1, int var2, byte var3, byte var4, byte var5) {
        super(var1, var3, var4, var5);
        byte[] var10000 = new byte[]{0, 5, 5};
        this.U = 0;
        this.V = 0;
        this.W = 0;
        super.w = null;
        super.cu = 9;
        super.ct = var2;
        int var6 = super.h[hso_ak.f(super.h.length)].a;
        var2 = super.h[hso_ak.f(super.h.length)].b;
        super.F = var6;
        super.G = var2;
        super.aY = var6;
        super.aZ = var2;
        super.o = var6;
        super.p = var2;
        super.bd = -1;
        super.be = -1;
        super.C = 48;
        super.Direction = 0;
        super.bi = 4;
        super.cF = 0;
        super.k = 0;
        super.A = hso_ak.c(200, 250);
        super.M = 3;
        super.D = 10;
        super.O = 0;
        super.t = 50;
        if (var4 != 3 && var4 != 9) {
            this.U = 6;
        } else {
            this.U = 0;
        }
    }

    protected final void f_() {
        int var1;
        switch (super.u) {
            case 1:
                super.bi = 1;
                if (super.cF == 1) {
                    if (super.dV > super.A || hso_ak.f(16) == 0 || MainObject.c(super.aY + super.bb, super.aZ + super.bc, super.F, super.G) >= super.C) {
                        super.dV = 0;
                        super.cF = 0;
                        super.bb = 0;
                        super.bc = 0;
                    }
                } else if (super.cF == 0) {
                    super.bb = 0;
                    super.bc = 0;
                    if (super.dV > super.A / 2 || hso_ak.f(12) == 0) {
                        super.dV = 0;
                        super.cF = 1;
//               super.Direction = hso_ak.f(4);
                        super.setDirection(hso_ak.f(4), "protected final void f_()", hso_ga.class);
                        this.c(super.bi);
                    }
                }

                if (super.w != null) {
                    if (super.w.cF == 1 && MainObject.c(super.aY, super.aZ, super.q, super.r) > 40) {
                        this.a((byte) 1);
                    }

                    if (super.w.cF == 0 && MainObject.c(super.aY, super.aZ, super.q, super.r) > super.C << 1) {
                        this.a((byte) 3);
                        return;
                    }
                } else if ((var1 = MainObject.c(super.aY, super.aZ, GameScreen.f.aY, GameScreen.f.aZ)) < 80 && var1 > 40 && hso_ak.f(6) == 0) {
                    this.a((byte) 6);
                }
                break;
            case 2:
                super.bi = 1;
                if (super.cF == 1) {
                    if ((super.dV > super.A || MainObject.c(super.aY + super.bb, super.aZ + super.bc, super.F, super.G) >= super.C) && super.t >= 50) {
                        if (super.T > 20 && !super.cV) {
                            super.dV = 0;
                            super.bb = 0;
                            super.bc = 0;
                            super.cF = 0;
                            super.T = 0;
                        }

                        if (super.T <= 20) {
                            ++super.T;
                        }
                    }
                } else if (super.cF == 0) {
                    super.bb = 0;
                    super.bc = 0;
                    if (super.t >= 0) {
                        super.t = (short) (super.t - 5);
                    }

                    if (hso_ft.ai % 30 == 0) {
//                        super.Direction = hso_ak.f(4);
                        super.setDirection(hso_ak.f(4), "protected final void f_()", hso_ga.class);
                    }

                    if (super.dV > super.A && super.t <= 0) {
                        super.dV = 0;
                        this.c(super.bi);
                        super.cF = 1;
                    }
                }

                if (super.w != null) {
                    if (super.w.cF == 1) {
                        if (MainObject.c(super.aY, super.aZ, super.q, super.r) > 40) {
                            this.a((byte) 1);
                            return;
                        }
                    } else if (super.w.cF == 0 && MainObject.c(super.aY, super.aZ, super.q, super.r) > super.C << 1) {
                        this.a((byte) 3);
                        return;
                    }
                } else if ((var1 = MainObject.c(super.aY, super.aZ, GameScreen.f.aY, GameScreen.f.aZ)) < 80 && var1 > 40 && hso_ak.f(6) == 0) {
                    this.a((byte) 6);
                    return;
                }
        }

    }

    public final void a(mGraphics var1) {
        try {
            this.e(var1, super.aY, super.aZ);
            this.f(var1);
            if (super.k == 1 && (super.Direction == 1 || super.Direction == 0)) {
                super.Direction = super.cH;
            }

            hso_fd var2;
            if ((var2 = hso_bk.l(super.j)).a != null) {
                if (super.bd < 0) {
                    super.be = aq.b(var2.a.a) / super.N;
                    super.bd = aq.a(var2.a.a) / 2;
                }

                var1.a(MainObject.db, super.aY + super.s, super.aZ - this.U, 3);
                if (super.cV && super.t <= 0) {
                    var1.a(var2.a, this.V, this.W, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY + super.s, super.aZ + super.bk + 8, 33);
                    var1.a(MainObject.dd, 0, (super.cF != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, super.aY + super.s, super.aZ + super.bk - 8, 3);
                } else {
                    var1.a(var2.a, this.V, this.W, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY + super.s, super.aZ - super.t, 33);
                }
            }

            this.e(var1);
            this.f(var1, super.aY, super.aZ);
        } catch (Exception var3) {
        }
    }

    protected final void i() {
        super.bi = 12;
        if (super.Q != null && super.Q.c() > 0) {
            hso_bf var1;
            MainObject var2;
            if ((var2 = MainObject.a((var1 = (hso_bf) super.Q.a(super.n)).a, var1.b)) == null || var2.br <= 0) {
                super.cU = false;
                this.a((byte) 4);
                return;
            }

            super.bf = var2.aY;
            super.bg = var2.aZ;
            this.h();
            if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var2.aY, var2.aZ) < 30) {
                if (super.t >= 15) {
                    super.t = (short) (super.t - 15);
                }

                super.ba = 4;
                if (super.t <= 15) {
                    this.l();
                    this.a((byte) 4);
                    return;
                }
            } else if (super.t <= 50) {
                super.t = (short) (super.t + 5);
            }
        }

    }

    public final void a() {
        this.X = super.cF;
        if (this.X > super.z.length - 1) {
            this.X = 0;
        }

        if (super.ba > super.z[this.X][super.Direction > 2 ? 2 : super.Direction].length - 1) {
            super.ba = 0;
        }

        this.ej = super.z[this.X][super.Direction > 2 ? 2 : super.Direction][super.ba] / 3;
        this.V = (this.ej > 1 ? 1 : this.ej) * super.bd;
        this.ej = super.z[this.X][super.Direction > 2 ? 2 : super.Direction][super.ba];
        this.W = this.ej % 3 * super.be;
        if (this.V == -1) {
            this.V = 0;
        }

        if (this.W == -1) {
            this.W = 0;
        }

        if (super.t <= 0) {
            this.V = this.W = 0;
        }

        if ((super.bb < 0 && super.bc > 0 || super.bb > 0 && super.bc > 0) && super.k == 0 && super.t >= 30) {
            super.ba = 3;
            if (super.bb < 0) {
                super.bb = -3;
            } else {
                super.bb = 3;
            }

            if (super.bc < 0) {
                super.bc = -3;
            } else {
                super.bc = 3;
            }
        }

        super.a();
    }
}
