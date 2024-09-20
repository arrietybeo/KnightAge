
public final class hso_ec extends hso_p {

    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    public String a = "";
    private static int[] q;
    public int b = -1;
    public int[] f = new int[2];
    private static hso_j[][] r;
    public byte g = -1;
    private boolean s = false;
    private hso_fl t;
    private hso_aw u = new hso_aw();
    public hso_bt h;
    private hso_bt v;
    private hso_bt w;
    private hso_bt x;
    private hso_dy y;
    private hso_dy z;
    private hso_bp A;
    private hso_cj[] B = new hso_cj[2];
    public String[] i = new String[2];
    private boolean C = false;

    public final void c() {
        this.a(hso_ft.a);
    }

    public final void a(hso_p var1) {
        super.c = var1;
        super.a(var1.c);
        this.t.aY = null;
    }

    public final void b(int var1, int var2) {
        switch (var1) {
            case 6:
                hso_ft.c(hso_df.cs, new hso_bt(hso_df.aY, 1, this));
                break;
            case 7:
                this.g();
                break;
            case 8:
                Service.a().a((byte) 6, "", (byte) 0, (short) 0, (int) 0);
                break;
            case 9:
                hso_es var4;
                (var4 = new hso_es("Buy_sell_scr menu")).a(this.w);
                var4.a(this.v);
                if (!hso_ft.A) {
                    var4.a(this.x);
                }

                hso_ft.o.a(var4, 2, hso_df.Y, false, (hso_es) null);
        }

        hso_ft.m();
        super.b(var1, var2);
    }

    public final void a_(int var1, int var2) {
        switch (var1) {
            case 0:
                if (this.g == -1) {
                    this.g = 1;
                    super.Y = null;
                    super.aa = null;
                } else if (this.g == 0) {
                    this.g = 2;
                    super.Y = null;
                    super.aa = null;
                }

                Service.a().a((byte) 4, "", (byte) 0, (short) 0, (int) 0);
                hso_fl.bi = 0;
                return;
            case 1:
                this.y.a(hso_df.co, new hso_bt(hso_df.cp, 0, this), true, hso_df.aY);
                hso_ft.r = this.y;
            default:
        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                boolean var5 = false;

                try {
                    var1 = Integer.parseInt(this.y.a.j());
                } catch (Exception var3) {
                    var1 = 0;
                }

                if (var1 >= 0) {
                    if ((long) var1 <= GameScreen.f.bC) {
                        this.f[0] = var1;
                        Service.a().a((byte) 7, "", (byte) 0, (short) 0, (int) var1);
                        hso_ft.j();
                        return;
                    }

                    hso_ft.a(hso_df.cr);
                    return;
                }
                break;
            case 1:
                Service.a().a((byte) 5, "", (byte) 0, (short) 0, (int) 0);
                hso_ft.j();
                return;
            case 2:
                String var4;
                if ((var4 = this.z.a.j()) != null && var4.length() != 0) {
                    Service.a().a((byte) 9, var4, (byte) 0, (short) 0, (int) 0);
                    this.i[0] = var4;
                    this.z.a.b("");
                    return;
                }

                return;
            case 3:
                this.z.a(hso_df.em + this.a, new hso_bt(hso_df.getChat("public final void a(int var1, int var2)"), 2, this), false, hso_df.aY);
                hso_ft.r = this.z;
        }

    }

    public final void a(String var1) {
        GameScreen.f.O();
        this.h = new hso_bt(hso_df.aY, 6);
        this.v = new hso_bt(hso_df.aZ, 0);
        this.w = new hso_bt(hso_df.cn, 1);
        this.x = new hso_bt(hso_df.getChat("public final void a(String var1)"), 3, this);
        if (!hso_ft.A) {
            super.aa = new hso_bt(hso_df.Y, 7);
        }

        super.Y = new hso_bt(hso_df.X, 9);
        super.Z = new hso_bt(hso_df.as, 8);
        this.j = hso_fl.aM << 3;
        q = new int[9];

        int var2;
        for (var2 = 0; var2 < q.length; ++var2) {
            q[var2] = -1;
        }

        r = new hso_j[2][];

        for (var2 = 0; var2 < r.length; ++var2) {
            r[var2] = new hso_j[9];
        }

        this.f[0] = 0;
        this.f[1] = 0;
        this.y = new hso_dy();
        this.z = new hso_dy();
        this.B[0] = null;
        this.B[1] = null;
        this.a((hso_j) null);
        a((hso_j) null, (byte) 0, (byte) 0);
        this.a = var1;
        this.k = 0;
        this.l = 0;
        this.m = hso_bw.V.c();
        this.n = hso_fl.aM * 9 + hso_ft.aa / 2 + 2;
        this.o = hso_ft.Y - this.j / 2;
        this.p = hso_ft.Z - hso_ft.aa / 2 - this.n / 2 + 2;
        if (this.p < 0) {
            this.n = (hso_fl.aM << 3) + 6;
            var2 = hso_bt.k;
            if (hso_ft.A) {
                var2 = 20;
            }

            this.p = hso_ft.Z - this.n / 2 - var2 / 2;
            this.C = true;
        }

        this.u.a(0, ((this.m - 1) / 3 - 6 + 1) * hso_fl.aM, 0, 0);
        this.A = new hso_bp(this.o + (hso_fl.aM << 2) - hso_fl.aM / 2, this.p + hso_ft.aa + hso_fl.aM - hso_fl.aM / 2, hso_fl.aM << 2, hso_fl.aM * 6, 0, 0, this.u.f);
        if (this.m < 18) {
            this.m = 18;
        }

        this.g = -1;
        this.t = new hso_fl();
        hso_fl.bi = 0;
        this.b();
        if (hso_ft.A) {
            hso_ce var3 = new hso_ce(hso_cf.k[1], 25, 25);
            if (this.C) {
                this.x.a(this.o + 15, this.p + hso_ft.aa / 2 + 1, var3, "");
                return;
            }

            this.x.a(this.o + this.j - 25, this.p + 20, var3, "");
        }

    }

    public final void b() {
        if (hso_ft.A) {
            if (this.C) {
                if (super.Y != null && super.aa != null && super.Z != null) {
                    super.aa.a(hso_ft.Y, this.p + this.n + 10, hso_cf.v, super.aa.a);
                    super.Y.a(hso_ft.Y - 66, this.p + this.n + 10, hso_cf.v, super.Y.a);
                    super.Z.a(hso_ft.Y + 66, this.p + this.n + 10, hso_cf.v, super.Z.a);
                    return;
                }

                if (super.Y != null) {
                    super.Y.a(hso_ft.Y - this.j / 4, this.p + this.n + 10, hso_cf.v, super.Y.a);
                }

                if (super.aa != null) {
                    super.aa.a(hso_ft.Y, this.p + this.n + 10, hso_cf.v, super.aa.a);
                }

                if (super.Z != null) {
                    super.Z.a(hso_ft.Y + this.j / 4, this.p + this.n + 10, hso_cf.v, super.Z.a);
                    return;
                }
            } else {
                if (super.Y != null && super.aa != null && super.Z != null) {
                    super.aa.a(hso_ft.Y, this.p + this.n, (hso_ce) null, super.aa.a);
                    super.Y.a(hso_ft.Y - 80, this.p + this.n, (hso_ce) null, super.Y.a);
                    super.Z.a(hso_ft.Y + 80, this.p + this.n, (hso_ce) null, super.Z.a);
                    return;
                }

                if (super.Y != null) {
                    super.Y.a(hso_ft.Y - 50, this.p + this.n, (hso_ce) null, super.Y.a);
                }

                if (super.aa != null) {
                    super.aa.a(hso_ft.Y, this.p + this.n, (hso_ce) null, super.aa.a);
                }

                if (super.Z != null) {
                    super.Z.a(hso_ft.Y + 50, this.p + this.n, (hso_ce) null, super.Z.a);
                }
            }
        }

    }

    public final void a(mGraphics var1) {
        if (super.c != null) {
            super.c.a(var1);
        }

        if (hso_ft.a == this) {
            hso_ft.a(var1);
            int var2 = this.p;
            int var3 = this.o + hso_fl.aM;
            hso_cg.b(var1, this.o, this.p, this.j, this.n, 0);
            int var4;
            if (!this.C) {
                if (hso_ft.B) {
                    hso_fl.c(var1, hso_ft.Y - 32, var2 + 8, 64, 14, 2);
                } else {
                    for (var4 = 0; var4 < 2; ++var4) {
                        var1.a(hso_fl.aP[2], 0, 0, 32, 14, 0, hso_ft.Y - 32 + (var4 << 5), var2 + 8, 0);
                    }
                }

                hso_o.f.a(var1, hso_df.aY, hso_ft.Y, var2 + 9, 2, true);
                var2 = this.p + hso_ft.aa;
            }

            if (hso_ft.A && this.g != 2) {
                this.x.a(var1, this.x.h, this.x.i);
            }

            int var5 = var2;
            var4 = var3;
            mGraphics var11 = var1;
            hso_ec var10 = this;
            var1.a(-4478311);
            hso_cg.a(var1, var3 + hso_fl.aM * 3, var2 + hso_fl.aM, hso_fl.aM * 3, hso_fl.aM * 6, (byte) 2);
            hso_cg.a(var1, var3, var2 + hso_fl.aM, hso_fl.aM * 3, hso_fl.aM * 6, (byte) 1);
            var1.b(var3, var2 + hso_fl.aM, hso_fl.aM * 6, hso_fl.aM * 6);
            var1.a(-4478311);
            byte var6 = 0;
            if (hso_ft.C) {
                var6 = 2;
            }

            hso_o.c.a(var1, GameScreen.f.cB, var3 + (this.C ? 5 : 0), var2 + hso_fl.aM / 4, 0, true);
            if (this.b == 0) {
                hso_o.h.a(var1, "- Ok -", var3 + hso_fl.aM * 3, var2 + hso_fl.aM / 4, 2, true);
            }

            hso_o.c.a(var1, this.a, var3, var2 + hso_fl.aM / 4 + hso_fl.aM * 7 - var6, 0, true);
            if (this.b == 1) {
                hso_o.h.a(var1, "- Ok -", var3 + hso_fl.aM * 3, var2 + hso_fl.aM / 4 + hso_fl.aM * 7 - var6, 2, true);
            }

            if (this.f[0] > 0) {
                hso_o.i.a(var1, this.f[0] + " $", var3 + hso_fl.aM * 6, var2 + hso_fl.aM / 4, 1, true);
            }

            if (this.f[1] > 0) {
                hso_o.i.a(var1, this.f[1] + " $", var3 + hso_fl.aM * 6, var2 + hso_fl.aM / 4 + hso_fl.aM * 7 - var6, 1, true);
            }

            var1.d(var3, var2 + hso_fl.aM, hso_fl.aM * 6, hso_fl.aM * 6);
            var1.a(0, -this.u.b);
            int var12;
            if (this.g == -1 || this.g == 0) {
                for (var12 = 0; var12 < hso_bw.V.c(); ++var12) {
                    hso_j var7;
                    if ((var7 = (hso_j) hso_bw.V.a(var12)).u == 7) {
                        hso_j var8;
                        if ((var8 = hso_bw.b(var7.O)) != null) {
                            var8.a(var11, var4 + hso_fl.aM * 3 + hso_fl.aM / 2 + var12 % 3 * hso_fl.aM, var5 + hso_fl.aM + hso_fl.aM / 2 + var12 / 3 * hso_fl.aM, hso_fl.aM, 0, 0);
                        } else {
                            hso_bw.c(var7.O);
                        }
                    } else {
                        var7.a(var11, var4 + hso_fl.aM * 3 + hso_fl.aM / 2 + var12 % 3 * hso_fl.aM, var5 + hso_fl.aM + hso_fl.aM / 2 + var12 / 3 * hso_fl.aM, hso_fl.aM, 0, 0);
                    }

                    if (var7.y == 0) {
                        var11.a(hso_cg.am, 0, 0, hso_fl.aM - 1, hso_fl.aM - 1, 0, var4 + hso_fl.aM * 3 + hso_fl.aM / 2 + var12 % 3 * hso_fl.aM, var5 + hso_fl.aM + hso_fl.aM / 2 + var12 / 3 * hso_fl.aM, 3);
                    }
                }

                var11.a(-2737107);

                for (var12 = 0; var12 < q.length; ++var12) {
                    if (q[var12] >= 0) {
                        var11.b(var4 + hso_fl.aM * 3 + q[var12] % 3 * hso_fl.aM + 3, var5 + hso_fl.aM + q[var12] / 3 * hso_fl.aM + 3, hso_fl.aM - 6, hso_fl.aM - 6);
                    }
                }
            }

            var11.a(-4478311);
            var11.b(var4 + (hso_fl.aM << 2), var5 + hso_fl.aM, hso_fl.aM, hso_fl.aM * (this.m / 3));

            for (var12 = 0; var12 < var10.m / 3 + 1; ++var12) {
                var11.a(var4 + hso_fl.aM * 3, var5 + hso_fl.aM + hso_fl.aM * var12, var4 + hso_fl.aM * 3 + hso_fl.aM * 3, var5 + hso_fl.aM + hso_fl.aM * var12);
            }

            var11.a(-1);
            if (!var10.s && var10.g < 1 && var10.k >= 0) {
                var11.b(var4 + hso_fl.aM * (3 + var10.k % 3) + 1, var5 + hso_fl.aM * (var10.k / 3 + 1) + 1, hso_fl.aM - 2, hso_fl.aM - 2);
            }

            hso_ft.a(var11);

            for (var12 = 0; var12 < r[0].length; ++var12) {
                int var13 = var4 + hso_fl.aM / 2 + var12 % 3 * hso_fl.aM;
                int var14 = var5 + hso_fl.aM + hso_fl.aM / 2 + var12 / 3 * hso_fl.aM;
                hso_j var9;
                if (r[0][var12] != null) {
                    if (r[0][var12].u == 7) {
                        if ((var9 = hso_bw.b(r[0][var12].O)) != null) {
                            if (r[0][var12].h == null) {
                                r[0][var12].g = var9.g;
                                r[0][var12].a(var9.h);
                                r[0][var12].h = var9.h;
                            }
                        } else {
                            hso_bw.c(r[0][var12].O);
                        }

                        r[0][var12].a(var11, var13, var14, hso_fl.aM, 0, 0);
                    } else {
                        r[0][var12].a(var11, var13, var14, hso_fl.aM, 0, 0);
                    }
                }

                if (var10.g > 0) {
                    var11.a(-2737107);
                    var11.b(var13 - hso_fl.aM / 2 + 1, var14 - hso_fl.aM / 2 + 1, hso_fl.aM - 2, hso_fl.aM - 2);
                }

                var13 = var4 + hso_fl.aM / 2 + var12 % 3 * hso_fl.aM;
                var14 = var5 + (hso_fl.aM << 2) + hso_fl.aM / 2 + var12 / 3 * hso_fl.aM;
                if (r[1][var12] != null) {
                    if (r[1][var12].u == 7) {
                        if ((var9 = hso_bw.b(r[1][var12].O)) != null) {
                            if (r[1][var12].h == null) {
                                r[1][var12].g = var9.g;
                                r[1][var12].h = var9.h;
                                r[1][var12].a(var9.h);
                            }
                        } else {
                            hso_bw.c(r[1][var12].O);
                        }

                        r[1][var12].a(var11, var13, var14, hso_fl.aM, 0, 0);
                    } else {
                        r[1][var12].a(var11, var13, var14, hso_fl.aM, 0, 0);
                    }
                }

                if (var10.g == 0 || var10.g == 2) {
                    var11.a(-2737107);
                    var11.b(var13 - hso_fl.aM / 2 + 1, var14 - hso_fl.aM / 2 + 1, hso_fl.aM - 2, hso_fl.aM - 2);
                }
            }

            var11.a(-4478311);

            for (var12 = 0; var12 < 3; ++var12) {
                var11.b(var4, var5 + hso_fl.aM + (hso_fl.aM << 1) * var12, hso_fl.aM * (3 + (var12 == 3 ? 3 : 0)), hso_fl.aM);
            }

            var11.b(var4 + hso_fl.aM, var5 + hso_fl.aM, hso_fl.aM, hso_fl.aM * 6);
            var11.a(0);
            var11.c(var4 + hso_fl.aM * 3, var5 + hso_fl.aM + 1, 1, hso_fl.aM * 6 - 1);
            var11.c(var4 + 1, var5 + (hso_fl.aM << 2), hso_fl.aM * 3, 1);
            var11.a(-1);
            if (var10.s && var10.l >= 0) {
                var11.b(var4 + hso_fl.aM * (var10.l % 3) + 1, var5 + hso_fl.aM * (var10.l / 3 + 4) + 1, hso_fl.aM - 2, hso_fl.aM - 2);
            }

            if (!hso_ft.o.a && hso_ft.r == null && hso_fl.bi > hso_fl.aX) {
                var11.a(0, -var10.u.b);
                var10.t.b(var11, false);
            }

            hso_ft.a(var11);
            hso_ft.a(var1);

            for (var4 = 0; var4 < this.B.length; ++var4) {
                if (this.B[var4] != null) {
                    this.B[var4].a(var1);
                }
            }

            super.a(var1);
        }
    }

    private void a(hso_j var1) {
        int var2;
        if (var1 == null) {
            for (var2 = 0; var2 < r[0].length; ++var2) {
                r[0][var2] = null;
            }

        } else {
            for (var2 = 0; var2 < r[0].length; ++var2) {
                if (r[0][var2] != null && r[0][var2].u == var1.u && r[0][var2].O == var1.O) {
                    Service.a().a((byte) 3, "", (byte) var1.u, (short) ((short) var1.O), (int) 0);
                    r[0][var2] = null;
                    q[var2] = -1;
                    return;
                }
            }

            for (var2 = 0; var2 < r[0].length; ++var2) {
                if (r[0][var2] == null) {
                    r[0][var2] = var1;
                    Service.a().a((byte) 2, "", (byte) var1.u, (short) ((short) var1.O), (int) 0);
                    q[var2] = this.k;
                    return;
                }
            }

        }
    }

    public final void a() {
        super.c.a();
        if (this.t.aY != null) {
            this.t.aY.c();
        }

        if (hso_ft.A) {
            this.A.c();
        } else {
            this.u.a();
        }

        int var1;
        for (var1 = 0; var1 < this.B.length; ++var1) {
            if (this.B[var1] != null && this.B[var1].b()) {
                this.B[var1] = null;
            }
        }

        for (var1 = 0; var1 < this.i.length; ++var1) {
            if (this.i[var1] != null) {
                byte var10001 = (byte) var1;
                String var4 = this.i[var1];
                byte var3 = var10001;
                if (var4 != null && var4.length() != 0) {
                    if (this.B[var3] == null) {
                        this.B[var3] = new hso_cj();
                    }

                    this.B[var3].a(var4, true);
                    int var6 = this.p;
                    if (!this.C) {
                        var6 = this.p + hso_ft.aa;
                    }

                    int var5 = this.o + hso_fl.aM;
                    if (var3 == 0) {
                        this.B[var3].b = 1;
                        this.B[var3].d(var5 + hso_fl.aM, var6 + hso_fl.aM + this.B[var3].a);
                    } else {
                        this.B[var3].d(var5 + hso_fl.aM, var6 + hso_fl.aM * 7);
                    }
                }

                this.i[var1] = null;
            }
        }

    }

    public final void d() {
        if (this.g >= 1) {
            this.s = true;
        }

        hso_bp var10000;
        int var1;
        if (this.s) {
            var1 = this.l;
            if (this.t.aY != null) {
                if (hso_ft.al[2]) {
                    if (this.t.aY.e > 0) {
                        var10000 = this.t.aY;
                        var10000.e -= hso_ft.ab;
                    } else {
                        this.t.aY.e = 0;
                    }

                    hso_ft.d(2);
                } else if (hso_ft.al[8]) {
                    if (this.t.aY.e < this.t.aY.g) {
                        var10000 = this.t.aY;
                        var10000.e += hso_ft.ab;
                    } else {
                        this.t.aY.e = this.t.aY.g;
                    }

                    hso_ft.d(8);
                }
            } else if (hso_ft.al[2]) {
                this.l -= 3;
                hso_ft.d(2);
            } else if (hso_ft.al[8]) {
                this.l += 3;
                hso_ft.d(8);
            }

            if (hso_ft.al[4]) {
                --this.l;
                hso_ft.d(4);
            } else if (hso_ft.al[6]) {
                if (this.l % 3 == 2 && this.g < 1) {
                    this.s = false;
                    hso_fl.bi = 0;
                } else {
                    ++this.l;
                }

                hso_ft.d(6);
            }

            this.l = hso_cg.a(this.l, 8, false);
            if (this.l != var1) {
                hso_fl.bi = 0;
                this.t.aY = null;
            }
        } else {
            var1 = this.k;
            if (this.t.aY != null) {
                if (hso_ft.al[2]) {
                    if (this.t.aY.e > 0) {
                        var10000 = this.t.aY;
                        var10000.e -= hso_ft.ab;
                    } else {
                        this.t.aY.e = 0;
                    }

                    hso_ft.d(2);
                } else if (hso_ft.al[8]) {
                    if (this.t.aY.e < this.t.aY.g) {
                        var10000 = this.t.aY;
                        var10000.e += hso_ft.ab;
                    } else {
                        this.t.aY.e = this.t.aY.g;
                    }

                    hso_ft.d(8);
                }
            } else if (hso_ft.al[2]) {
                this.k -= 3;
                hso_ft.d(2);
            } else if (hso_ft.al[8]) {
                this.k += 3;
                hso_ft.d(8);
            }

            if (hso_ft.al[4]) {
                if (this.k % 3 == 0) {
                    this.s = true;
                    hso_fl.bi = 0;
                } else {
                    --this.k;
                }

                hso_ft.d(4);
            } else if (hso_ft.al[6]) {
                ++this.k;
                hso_ft.d(6);
            }

            if (!hso_ft.A) {
                this.k = hso_cg.a(this.k, hso_bw.V.c() - 1, false);
            }

            if (this.k < -1) {
                this.k = -1;
            } else if (this.k > hso_bw.V.c() - 1) {
                this.k = hso_bw.V.c();
            }

            if (this.k != var1 && this.k >= 0) {
                this.u.a(0, (this.k / 3 - 3) * hso_fl.aM);
                hso_fl.bi = 0;
            }
        }

        var1 = this.k;
        if (this.s) {
            var1 = this.l;
        }

        hso_j var5;
        if (!this.s) {
            var5 = (hso_j) hso_bw.V.a(var1);
        } else {
            var5 = r[1][var1];
        }

        if (hso_fl.bi < hso_fl.aX + 2 && ++hso_fl.bi == hso_fl.aX) {
            this.t.bj = null;
            this.t.bk = null;
            this.t.bl = null;
            if (var5 == null) {
                hso_fl.bi = 0;
            } else if (var5.b()) {
                hso_fl.bi = 0;
            } else {
                this.t.bq = var5.s;
                if (this.s) {
                    this.t.bs = this.o + (hso_fl.aM << 2) + 3;
                    if (this.t.bs + this.t.bq > hso_ft.W - 3) {
                        this.t.bs = hso_ft.W - 3 - this.t.bq;
                    }
                } else {
                    this.t.bs = this.o + (hso_fl.aM << 2) - this.t.bq - 3;
                    if (this.t.bs < 3) {
                        this.t.bs = 3;
                    }
                }

                this.b(var5);
                this.t.bp = var5.g;
                this.t.bl = var5.l;
                this.t.bo = var5.n;
                this.t.br = var5.N;
            }
        }

        if (this.t.bj == null && var5 != null && var5.u != 5) {
            if (var5.k == null) {
                if (var5.o % 100 == 3) {
                    if (this.t.K == 0) {
                        Service.a().a((byte) 0, (byte) ((byte) var5.O));
                    }

                    ++var5.o;
                } else {
                    ++var5.o;
                }
            } else {
                this.t.bj = var5.k;
                this.t.bm = var5.m;
                this.b(var5);
            }
        }

        super.d();
    }

    public final void e() {
        int var1 = this.o + hso_fl.aM;
        int var2 = this.p + hso_fl.aM;
        if (!this.C) {
            var2 += hso_ft.aa;
        }

        boolean var3 = false;
        if (this.t.aY != null && hso_ft.c(this.t.aY.c, this.t.aY.d, this.t.aY.a, this.t.aY.b)) {
            this.t.aY.a();
            var3 = true;
        }

        if (!var3) {
            if (hso_ft.T) {
                hso_fl.bi = 0;
            }

            if (hso_ft.A) {
                this.A.a();
                this.u.b = this.A.f;
            }

            if (this.g < 1 && hso_ft.b(var1 + 3 * hso_fl.aM, var2, 3 * hso_fl.aM, 6 * hso_fl.aM)) {
                var1 = (hso_ft.ae - (var1 + 3 * hso_fl.aM)) / hso_fl.aM + (this.u.b + hso_ft.af - var2) / hso_fl.aM * 3;
                boolean var4 = false;
                var2 = hso_bw.V.c();
                if (this.s) {
                    this.k = -1;
                }

                this.s = false;
                if (var1 >= 0 && var1 < var2) {
                    hso_ft.S = false;
                    if (var1 == this.k) {
                        this.g();
                    } else {
                        this.k = var1;
                        hso_fl.bi = 0;
                        this.t.aY = null;
                    }
                } else {
                    this.k = -1;
                    hso_fl.bi = 0;
                    this.t.aY = null;
                }

                hso_ft.S = false;
            } else if (hso_ft.b(var1, var2 + 3 * hso_fl.aM, 3 * hso_fl.aM, 3 * hso_fl.aM)) {
                var1 = (hso_ft.ae - var1) / hso_fl.aM + (hso_ft.af - (var2 + 3 * hso_fl.aM)) / hso_fl.aM * 3;
                if (!this.s) {
                    hso_fl.bi = 0;
                }

                this.s = true;
                if (var1 >= 0 && var1 < 9) {
                    hso_ft.S = false;
                    if (var1 != this.l) {
                        this.l = var1;
                        hso_fl.bi = 0;
                    }
                } else {
                    this.l = -1;
                    hso_fl.bi = 0;
                }

                hso_ft.S = false;
            }
        }

        if (hso_ft.A && this.g != 2) {
            this.x.b();
        }

        super.e();
    }

    public static void a(hso_j var0, byte var1, byte var2) {
        int var3;
        if (var0 == null) {
            for (var3 = 0; var3 < r.length; ++var3) {
                r[1][var3] = null;
            }

        } else if (var1 == 3) {
            for (var3 = 0; var3 < r[var2].length; ++var3) {
                if (r[var2][var3] != null && r[var2][var3].u == var0.u && r[var2][var3].O == var0.O) {
                    r[var2][var3] = null;
                    if (var2 == 0) {
                        q[var3] = -1;
                    }

                    return;
                }
            }

        } else {
            if (var1 == 2) {
                for (var3 = 0; var3 < r[var2].length; ++var3) {
                    if (r[var2][var3] == null) {
                        r[var2][var3] = var0;
                        return;
                    }
                }
            }

        }
    }

    private void b(hso_j var1) {
        int var2 = 1;
        this.t.bj = var1.k;
        this.t.bm = var1.m;
        if (var1.k != null) {
            var2 = 1 + this.t.bj.length;
        }

        if (var1.l != null) {
            var2 += var1.l.length;
        }

        int var4 = this.k;
        int var3 = 0;
        if (this.s) {
            var4 = this.l + 9;
            var3 = this.u.b;
        }

        this.t.bt = (var4 / 3 + 1) * hso_fl.aM - var2 * hso_ft.ab + this.p + hso_ft.aa + var3;
        if (this.t.bt - this.u.b < 3) {
            this.t.bt = 3 + this.u.b;
        }

        this.t.aY = null;
        if ((var2 + 1) * hso_ft.ab > hso_fl.U) {
            this.t.aY = new hso_bp(this.t.bs, this.t.bt, this.t.bq, hso_fl.U, 0, 0, (var2 + 1) * hso_ft.ab - hso_fl.U);
        }

    }

    private void g() {
        hso_j var1;
        if ((var1 = (hso_j) hso_bw.V.a(this.k)).y == 0) {
            hso_ft.a(hso_df.cO);
        } else {
            this.a(var1);
        }
    }
}
