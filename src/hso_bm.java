
public final class hso_bm extends MainObject {

    private hso_cj a;

    public hso_bm(int var1, byte var2, String var3, int var4, int var5) {
        super(var1, var2, var3, var4, var5);
        byte[] var10000 = new byte[]{-1, 1};
        super.bi = 6;
        super.be = 40;
        super.bd = 30;
        super.br = 0;
        super.bs = 0;
        super.bt = 0;
        super.bu = 0;
        super.bn = 1;
        super.bo = 2;
        super.dg = new hso_ds();
        super.dh = new hso_dh();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                if (var2 >= 0 && var2 <= hso_ew.a.c()) {
                    ((hso_ew) hso_ew.a.a(var2)).b();
                }
                break;
            case 1:
                if (var2 >= 0 && var2 <= hso_ew.b.c()) {
                    ((hso_ew) hso_ew.b.a(var2)).b();
                }
                break;
            case 2:
                if (var2 >= 0 && var2 <= hso_ew.c.c()) {
                    ((hso_ew) hso_ew.c.a(var2)).c();
                }
                break;
            case 3:
                if (var2 >= 0 && var2 <= hso_ew.d.c()) {
                    ((hso_ew) hso_ew.d.a(var2)).c();
                }
                break;
            case 4:
                Service.a().a((byte) super.ct);
                break;
            case 5:
                hso_bm var3 = this;
                hso_es var4 = new hso_es("Other_Player menu3");

                int var5;
                hso_ew var6;
                hso_bt var7;
                for (var5 = 0; var5 < hso_ew.a.c(); ++var5) {
                    if ((var6 = (hso_ew) hso_ew.a.a(var5)).h == var3.ct) {
                        (var7 = new hso_bt(var6.k, 0, var5, var3)).a((hso_ce) hso_cg.aF, 1, 1);
                        var4.a(var7);
                    }
                }

                for (var5 = 0; var5 < hso_ew.b.c(); ++var5) {
                    if ((var6 = (hso_ew) hso_ew.b.a(var5)).g == var3.ct) {
                        (var7 = new hso_bt(var6.k, 1, var5, var3)).a((hso_ce) hso_cg.aF, 1, 3);
                        var4.a(var7);
                    }
                }

                for (var5 = 0; var5 < hso_ew.c.c(); ++var5) {
                    if ((var6 = (hso_ew) hso_ew.c.a(var5)).g == var3.ct) {
                        (var7 = new hso_bt(var6.k, 2, var5, var3)).a((hso_ce) hso_cg.aF, 1, 2);
                        var4.a(var7);
                    }
                }

                for (var5 = 0; var5 < hso_ew.d.c(); ++var5) {
                    if ((var6 = (hso_ew) hso_ew.d.a(var5)).g == var3.ct) {
                        (var7 = new hso_bt(var6.k, 3, var5, var3)).a((hso_ce) hso_cg.aF, 1, 2);
                        var4.a(var7);
                    }
                }

                if (var4.c() == 0) {
                    hso_ft.m();
                    hso_ft.l();
                    hso_ft.o.f();
                } else {
                    hso_ft.o.f();
                    hso_ft.m();
                    hso_ft.l();
                    hso_ft.o.a(var4, 2, hso_df.at, false, (hso_es) null);
                }
        }

        super.a(var1, var2);
    }

    public final void a(mGraphics var1, int var2) {
        if (!hso_cf.i()) {
            byte var3 = GameScreen.f.cv;
            boolean var4 = true;
            if (GameScreen.q.c(hso_ft.p.d) && super.cv == var3) {
                var4 = false;
            }

            String var9 = super.cB;
            hso_o var5 = null;
            var5 = hso_fl.a(var2);
            boolean var8 = true;
            byte var6 = 0;
            if (super.cy == 1) {
                if (super.cv > 0) {
                    var8 = false;
                }

                var6 = 5;
            }

            int var7 = 18;
            if (hso_cf.I) {
                var7 = 12;
            }

            if (super.di == 7) {
                var7 += 8;
            }

            if (super.cp && hso_cf.I) {
                var7 += 6;
            }

            if (super.aS != -1) {
                var8 = false;
            }

            if (var8 && !super.dP) {
                var5.a(var1, var9, super.aY, super.aZ - super.bo - super.bj + super.bk - (super.bI ? 5 : 0) - super.be - var7 - super.eb - super.bw, 2, false);
            }

            if (super.cu == 0 && super.cy == 1 && var8 && !super.cM) {
                var7 += 10;
                var5.a(var1, hso_df.fs, super.aY, super.aZ - super.bo - super.bj + super.bk - (super.bI ? 5 : 0) - super.be - var7 - super.eb - super.bw, 2, false);
            }

            if (super.cu == 2 && super.dk == null) {
                hso_cg.aF.b(super.cn, super.aY - 6, super.aZ - super.bo - super.bj + super.bk - super.be - var7 - 18 - 4 + hso_ft.ai / 2 % 4, 0, var1);
            }

            var2 = 0;
            if (Player.N != null && super.cX || super.bG || super.di == 7) {
                int var10 = 44;
                if (super.cu == 2 || super.di == 7) {
                    var10 = super.be + 5;
                }

                var1.a(-8714722);
                var1.c(super.aY - 20, super.aZ - super.bo - super.bj + super.bk - var10 - var7 - super.eb - super.bw, 40, 3);
                var1.a(-579511);
                var1.c(super.aY - 20, super.aZ - super.bo - super.bj + super.bk - var10 - var7 - super.eb - super.bw, 40 * super.br / super.bs, 3);
                var2 += 5;
            }

            if (super.cO != null && super.cy != 1 && !super.dP) {
                this.a(var1, super.aY - 1, super.aZ - super.bo - super.bj + super.bk - super.be - var7 - 8 - var2 - super.eb - super.bw, 2);
                var2 += 16;
            }

            if (super.cv >= 0 && super.cu == 0 && var4 && !this.E()) {
                var2 += 59;
                hso_cg.aE.b(super.cv * 3 + hso_ft.ai / 3 % 3, super.aY, super.aZ - super.bj + super.bk - super.bo - var2 + 18 - var7 + var6 - super.eb - super.bw, 0, 33, var1);
            }

        }
    }

    public final void a(mGraphics var1) {
        try {
            if (hso_dw.g) {
                if (super.cu == 0) {
                    if (GameScreen.aM) {
                        this.b(var1, 0);
                        this.k(var1);
                        return;
                    }

                    if (GameScreen.aN) {
                        this.a(var1, 0);
                        this.k(var1);
                        return;
                    }
                }
            } else if (super.cu == 0 && GameScreen.aM) {
                this.b(var1, 0);
                this.k(var1);
                return;
            }

            if (super.cu == 2 && super.cS != -1) {
                this.g(var1);
            } else {
                this.c(var1, 0);
            }

            this.j(var1);
            this.k(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void k(mGraphics var1) {
        if (this.a != null && !this.a.d.equals("")) {
            this.a.a(var1);
        }

    }

    public final void a(mGraphics var1, int var2, int var3) {
        if (!hso_cf.i()) {
            super.a(var1, var2, var3);
        }
    }

    public final void a() {
        this.I();
        this.S();
        this.J();
        if (this.a != null) {
            this.a.d(super.aY, super.aZ - super.be - 30);
        }

        if (super.cz != -1) {
            if (hso_ak.e(super.aY - super.bl) <= super.bi + this.Q() && hso_ak.e(super.aZ - super.bm) <= super.bi + this.Q()) {
                ++super.bE;
                super.cN = null;
                super.dh.a(this, super.cR, super.cz, (byte) -1);
                if (super.bE > 5) {
                    super.dh.b();
                    super.bE = 0;
                    super.cz = -1;
                }
            }
        } else {
            super.bE = 0;
        }

        if (!MainObject.c((MainObject) this) && !MainObject.d(super.bf, super.bg, super.bd, super.be)) {
            super.aY = super.bf;
            super.aZ = super.bg;
            super.bb = 0;
            super.bc = 0;
            if (super.cF != 4) {
                super.cF = 0;
            }

        } else {
            this.L();
            int var1 = hso_ft.p.a(super.aY + super.bb, super.aZ + super.bc);
            this.g(1, var1);
            this.K();
            this.R();
            super.a();
            if (super.dq && super.cJ < 70) {
                ++super.cJ;
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
                        GameScreen.a(36, super.aY + var3, super.aZ + var4 - super.be / 2);
                        if (hso_ak.f(3) == 1) {
                            GameScreen.a(9, super.aY + var3, super.aZ + var4 - super.be / 2);
                        }
                    }
                }

                if (super.cJ >= 70) {
                    for (var1 = 0; var1 < 6; ++var1) {
                        var2 = hso_ak.g(25);
                        var3 = hso_ak.g(30);
                        GameScreen.a(36, super.aY + var2, super.aZ + var3 - super.be / 2);
                        if (hso_ak.f(3) == 1) {
                            GameScreen.a(9, super.aY + var2, super.aZ + var3 - super.be / 2);
                        }
                    }

                    GameScreen.a(81, super.aY, super.aZ - 20, 200, (short) 0, (byte) 0);
                    super.cK = true;
                    super.dq = false;
                }
            }

        }
    }

    public final int j() {
        return super.dN;
    }

    public final void k() {
        hso_es var1;
        if (this.i_()) {
            if (!super.cp) {
                MainObject.a(GameScreen.f, this);
                if (super.co == 0) {
                    Service.a().a((byte) super.dN);
                } else {
                    var1 = new hso_es("Other_Player menu");
                    hso_bt var6;
                    if (super.cC.length() > 0) {
                        var6 = new hso_bt(super.cC, 4, this);
                        var1.a(var6);
                    }

                    hso_bm var7 = this;
                    int var3 = 0;

                    boolean var10000;
                    label95:
                    while (true) {
                        if (var3 >= hso_ew.a.c()) {
                            for (var3 = 0; var3 < hso_ew.b.c(); ++var3) {
                                if (((hso_ew) hso_ew.b.a(var3)).g == var7.ct) {
                                    var10000 = true;
                                    break label95;
                                }
                            }

                            for (var3 = 0; var3 < hso_ew.c.c(); ++var3) {
                                if (((hso_ew) hso_ew.c.a(var3)).g == var7.ct) {
                                    var10000 = true;
                                    break label95;
                                }
                            }

                            for (var3 = 0; var3 < hso_ew.d.c(); ++var3) {
                                if (((hso_ew) hso_ew.d.a(var3)).g == var7.ct) {
                                    var10000 = true;
                                    break label95;
                                }
                            }

                            var10000 = false;
                            break;
                        }

                        if (((hso_ew) hso_ew.a.a(var3)).h == var7.ct) {
                            var10000 = true;
                            break;
                        }

                        ++var3;
                    }

                    if (var10000) {
                        var6 = new hso_bt(hso_df.at, 5, this);
                        var1.a(var6);
                    }

                    hso_ft.o.a(var1, 2, hso_df.ai, false, (hso_es) null);
                }
            }
        } else {
            if (super.cu == 0 && super.cy == 0) {
                (var1 = new hso_es("Other_Player menu2")).a(GameScreen.b().v);
                var1.a(GameScreen.b().t);
                var1.a(GameScreen.b().u);
                if (Player.N == null || Player.N.b.c() < 5) {
                    var1.a(GameScreen.b().w);
                }

                var1.a(GameScreen.b().y);
                if (hso_cs.w != 1 && hso_cs.w != 2) {
                    var1.a(GameScreen.b().E);
                }

                hso_em var2;
                if (GameScreen.f.cO != null && ((var2 = GameScreen.f.cO).o == 127 || var2.o == 126)) {
                    var1.a(GameScreen.b().F);
                }

                hso_es var5;
                (var5 = this.P()).b(this, 0);
                hso_ft.o.a(var1, 2, hso_df.ai, true, var5);
            }

        }
    }

    public final void c(int var1, int var2) {
        hso_aa var3 = new hso_aa((byte) var1, var2);
        super.dw.a(var3);
    }

    public final void k_() {
        this.a = null;
    }

    public final void b(String var1) {
        if (this.a == null) {
            this.a = new hso_cj();
        }

        this.a.a(var1, super.cL);
        this.a.d(super.aY, super.aZ - super.be - 30);
    }

    public final boolean e_() {
        return this.a != null;
    }

    public final boolean b() {
        return super.dS == 1;
    }

    public final boolean n() {
        return super.dT == 1;
    }
}
