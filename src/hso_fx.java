
public final class hso_fx extends hso_s {

    public hso_fx(MainObject var1, short var2, byte var3, byte var4, byte var5) {
        super(var2, var3, var4, var5);
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
        super.C = 60;
        super.Direction = 0;
        super.bi = 4;
        super.cF = 0;
        super.k = 0;
        super.A = hso_ak.c(50, 70);
        super.M = 0;
        super.D = 30;
        super.O = 0;
    }

    public hso_fx(short var1, int var2, byte var3, byte var4, byte var5) {
        super(var1, var3, var4, var5);
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
        super.C = 120;
        super.Direction = 0;
        super.bi = 4;
        super.cF = 0;
        super.k = 0;
        super.A = hso_ak.c(50, 70);
        super.M = 3;
        super.D = 200;
        super.O = 0;
    }

    public final void a(mGraphics var1) {
        try {
            this.e(var1, super.aY, super.aZ);
            this.f(var1);
            hso_fd var2 = hso_bk.l(super.j);
            if (super.k == 1 && (super.Direction == 1 || super.Direction == 0)) {
                super.setDirection(super.cH, "public final void a(mGraphics var1)", hso_fx.class);
//            super.Direction = super.cH;
            }

            int var3;
            if ((var3 = super.cF) > super.z.length - 1) {
                var3 = 0;
            }

            if (super.ba > super.z[var3][super.Direction > 2 ? 2 : super.Direction].length - 1) {
                super.ba = 0;
            }

            if (var2.a != null) {
                if (super.bd < 0) {
                    super.be = aq.b(var2.a.a) / super.N;
                    super.bd = aq.a(var2.a.a) / 2;
                }

                boolean var4 = false;
                boolean var5 = false;
                int var7 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] / 3 * super.bd;
                int var8 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] % 3 * super.be;
                if (super.cV) {
                    var1.a(var2.a, var7, var8, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY + super.s, super.aZ + super.bk + 4, 33);
                    var1.a(MainObject.dd, 0, (var3 != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, super.aY + 1 + super.s, super.aZ + super.bk - 4, 3);
                } else {
                    var1.a(var2.a, var7, var8, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY + super.s, super.aZ, 33);
                }
            }

            this.e(var1);
            this.f(var1, super.aY, super.aZ);
        } catch (Exception var6) {
            var6.printStackTrace();
            var6.toString();
        }
    }

    protected final void i() {
        if (super.dn == null) {
            super.dn = new hso_do((byte) 2);
        }

        super.bi = 9;
        if (super.Q != null && super.Q.c() > 0) {
            hso_bf var1;
            MainObject var2;
            if ((var2 = MainObject.a((var1 = (hso_bf) super.Q.a(super.n)).a, var1.b)) == null) {
                super.cU = false;
                return;
            }

            if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var2.aY, var2.aZ) > super.D && var2.br > 0) {
                super.bf = var2.aY;
                super.bg = var2.aZ;
                this.h();
                return;
            }

            if (hso_ft.aj - super.P > (long) super.O) {
                super.cQ = var1.a;
                var1.g = super.dn;
                this.t();
                this.l();
                super.O = 200;
                super.P = hso_ft.aj;
                if (super.m == 2) {
                    if (super.n >= super.Q.c() - 1) {
                        super.i = false;
                        this.a((byte) 4);
                        super.n = 0;
                        return;
                    }
                } else if (super.m == 5 && super.n == 3) {
                    super.i = false;
                    this.a((byte) 4);
                    super.n = 0;
                }
            }
        }

    }
}
