
public class hso_fl extends hso_cg {

    public byte K;
    private static byte a = 13;
    public int L;
    public int M;
    private int b;
    public int N;
    private int c;
    private int d;
    private int e;
    private int f;
    public int O;
    public int P;
    private int g;
    private int h;
    private int i;
    private static int j;
    private static int k;
    public boolean Q = false;
    public boolean R = false;
    public static int S;
    public static int T;
    public static int U;
    int V;
    int W;
    public String X = "";
    public static byte aM = 20;
    public static byte aN;
    public static byte aO = 0;
    public static hso_aq[] aP = new hso_aq[15];
    public static hso_aq aQ;
    public static hso_aq aR;
    public static hso_aq aS;
    private static hso_fl l;
    hso_bt aT;
    public static int aU = 0;
    public static int aV;
    public static int aW;
    public static int aX = 15;
    public hso_bp aY = null;
    public static boolean aZ = false;
    hso_aq ba;
    public boolean bb;
    public hso_bt bc;
    public boolean bd = false;
    public boolean be;
    public static int[] bf = new int[]{-5727870, -4543854, -477112, -1315861, -5859456, -3689060, -4807282, -9411756, -1845826, -5267575, -460632};
    public int bg = 0;
    public int bh = 0;
    private static String m = "";
    private static String[] n = new String[2];
    public static int bi;
    public String[] bj;
    public String[] bk;
    public String[] bl = null;
    public int[] bm;
    public int[] bn;
    public int[] bo;
    public String bp;
    public int bq;
    public int br;
    public int bs;
    public int bt;
    public hso_es bu = new hso_es("MainTabNew moreInfoconten");
    private static int[] o = new int[]{-2701394, -6517641, -9411756, -7832985, -11844807};

    public static hso_fl g() {
        if (l == null) {
            l = new hso_fl();
        }

        return l;
    }

    public hso_fl() {
        if (hso_ft.A) {
            aM = 26;
        } else if (hso_ft.W >= 240) {
            aM = 24;
        }

        if (hso_ft.X < 240 && aM > 24) {
            aM = 24;
        }

        U = hso_ft.X - (hso_ft.aa << 1);
        aN = (byte) (aM / 5);
        j = hso_ft.W / 32 + 1;
        k = hso_ft.X / 32 + 1;
        int var1;
        if ((var1 = hso_ft.W / aM) > 9) {
            var1 = 9;
        }

        int var2 = (hso_ft.X / 5 << 2) - hso_ft.aa / 2;
        if (hso_ft.A) {
            var2 += hso_ft.aa / 2;
        }

        if ((var2 /= aM) > 8) {
            var2 = 8;
        }

        this.b = (var1 - 1) * aM - aN * 3 + (hso_ft.C ? aN : 0);
        this.N = var2 * aM + aN;
        if (this.N % 2 != 0) {
            --this.N;
        }

        if (hso_ft.A) {
            if (hso_ft.W >= 380) {
                aU = 170;
                aX = 5;
                U = this.N - aM - aN;
                this.L = (hso_ft.W - var1 * aM - aU) / 2;
                aV = hso_ft.W - this.L - aU;
                aW = 0 + hso_ft.X / 5;
            } else if (hso_ft.W > 315) {
                aZ = true;
                if (hso_bs.k == 1) {
                    hso_bs.k = 2;
                }

                var1 = 8;
                this.b = 7 * aM - aN * 3;
                aU = 130;
                aX = 5;
                U = this.N - aM - aN;
                aV = hso_ft.W - this.L - aU + 5;
                aW = 0 + hso_ft.X / 5;
            }
        }

        if (aZ) {
            this.L = -5;
            aV = this.L + this.b + aM + (aN << 1);
            aU = hso_ft.W - aV;
        } else {
            this.L = (hso_ft.W - var1 * aM - aU) / 2;
        }

        this.M = 0;
        this.c = this.b / 32;
        this.d = this.N / 32;
        S = this.b / aM * aM;
        T = (this.N / aM - 1) * aM;
        this.h = S / 32;
        this.i = T / 32;
        this.e = hso_ft.W - (this.L - 9) - 72;
        if (hso_ft.A && this.e > hso_ft.W - 112) {
            this.e = hso_ft.W - 112;
        }

        this.f = 5;
        if (hso_ft.C) {
            this.f = 2;
        }

        this.O = 0;
        this.P = hso_ft.X / 10 - 21;
        if (hso_ft.C) {
            this.P += 4;
        }

        this.g = aN + aM;
        if (this.g > 32) {
            this.g = 32;
        }

    }

    public void b() {
    }

    public void a(String var1) {
    }

    public void c() {
        hso_p.e.a(0, 0, 0, 0);
        if (hso_ft.A) {
            if (hso_ft.a == hso_ft.u) {
                if (hso_ft.u.c != null && hso_ft.u.c != hso_ft.u && hso_ft.u.c != hso_ft.v) {
                    hso_ft.u.c.c();
                    return;
                }

                hso_ft.c.c();
                return;
            }

            if (hso_ft.a == hso_ft.v) {
                if (hso_ft.u.c != null && hso_ft.u.c != hso_ft.u && hso_ft.u.c != hso_ft.v) {
                    hso_ft.v.c.c();
                    return;
                }

                hso_ft.c.c();
                return;
            }

            if (hso_ft.a == hso_ft.w) {
                if (hso_ft.w.c != null) {
                    hso_ft.w.c.c();
                    return;
                }

                hso_ft.c.c();
            }
        }

    }

    public final void e(int var1) {
    }

    public static void a(mGraphics var0, int var1) {
        hso_ft.a(var0);
        GameScreen.f.c(var0, hso_ft.Y, hso_ft.X / 10 + 15, var1);
    }

    public final void a(mGraphics var1, String var2, int var3, hso_es var4, boolean var5) {
        int var6 = var4.c();
        int var7;
        int var8;
        if (hso_ft.B) {
            c(var1, 0, 0, hso_ft.W, hso_ft.X, 0);
            c(var1, this.e, this.f, 66, 32, 1);
            c(var1, this.L + aM + (aN << 1), 0 + hso_ft.X / 5, this.b, this.N, 1);
        } else {
            for (var7 = 0; var7 < j; ++var7) {
                for (var8 = 0; var8 < k; ++var8) {
                    var1.a(aP[0], var7 << 5, var8 << 5, 0);
                }
            }

            for (var7 = 0; var7 < 3; ++var7) {
                var1.a(aP[1], this.e + var7 * 22, this.f, 0);
            }

            for (var7 = 0; var7 <= this.c; ++var7) {
                for (var8 = 0; var8 <= this.d; ++var8) {
                    if (var7 == 0 || var7 == this.c || var8 == this.d || var8 == 0) {
                        if (var7 == this.c) {
                            if (var8 == this.d) {
                                var1.a(aP[1], this.L + aM + (aN << 1) + this.b - 32, 0 + hso_ft.X / 5 + this.N - 32, 0);
                            } else {
                                var1.a(aP[1], this.L + aM + (aN << 1) + this.b - 32, 0 + (var8 << 5) + hso_ft.X / 5, 0);
                            }
                        } else if (var8 == this.d) {
                            var1.a(aP[1], this.L + aM + (aN << 1) + (var7 << 5), 0 + hso_ft.X / 5 + this.N - 32, 0);
                        } else {
                            var1.a(aP[1], this.L + aM + (aN << 1) + (var7 << 5), 0 + (var8 << 5) + hso_ft.X / 5, 0);
                        }
                    }
                }
            }
        }

        hso_cg.a(var1, var2, this.L + aM + (aN << 1) + this.b / 2, 0 + hso_ft.X / 5 + aM / 2 - 6, 2);
        GameScreen.q.a(var1, 0, 0, !hso_ft.C, hso_ft.C ? hso_o.i : hso_o.j);
        var1.a(aP[4], 0, 0, 14, 14, 0, this.e + 4, this.f + 2, 0);
        var1.a(aP[4], 0, 14, 14, 14, 0, this.e + 4, this.f + 17, 0);
        if (var5) {
            hso_cf.x.b(10, this.e - 12, this.f + 10, 0, 3, var1);
            if (GameScreen.f.cO != null) {
                hso_o.j.a(var1, hso_j.a(GameScreen.f.cO.n), this.e + 19, this.f + 3, 0, false);
                hso_o.j.a(var1, hso_j.a((long) GameScreen.f.cO.l), this.e + 19, this.f + 18, 0, false);
            }
        } else {
            hso_o.j.a(var1, hso_j.a(GameScreen.f.bC), this.e + 19, this.f + 3, 0, false);
            hso_o.j.a(var1, hso_j.a(GameScreen.f.bB), this.e + 19, this.f + 18, 0, false);
        }

        if (hso_ft.B) {
            c(var1, this.L + aN, 0 + hso_ft.X / 5 + aM * var3, aN + aM, aM, 1);
        } else if (aN + aM > 32) {
            var1.a(aP[1], 0, 0, aM, aM, 0, this.L + aN, 0 + hso_ft.X / 5 + aM * var3, 0);
            var1.a(aP[1], 0, 0, aN, aM, 0, this.L + aN + aM, 0 + hso_ft.X / 5 + aM * var3, 0);
        } else {
            var1.a(aP[1], 0, 0, aN + aM, aM, 0, this.L + aN, 0 + hso_ft.X / 5 + aM * var3, 0);
        }

        if (!hso_ft.A && aO == 0) {
            var1.a(bf[3]);
            var1.b(this.L + aN + 1, 0 + hso_ft.X / 5 + aM * var3 + 1, aN + aM - 3, aM - 5);
        }

        var1.a(bf[0]);

        int var9;
        for (var7 = 0; var7 < var6; ++var7) {
            hso_fl var12 = (hso_fl) var4.a(var7);
            var9 = 0;
            if (var7 != var3) {
                var1.b(this.L + aN, 0 + hso_ft.X / 5 + aM * var7, aN + aM, aM);
            } else if (aO == 0 || hso_ft.A) {
                var9 = -1 + hso_ft.ai / 2 % 3;
            }

            byte var10;
            if ((var10 = var12.K) > a) {
                var10 = this.K;
            }

            var1.a(aP[3], 0, var10 << 4, 16, 16, 0, this.L + aN + aN / 2 + aM / 2 + var9, 0 + hso_ft.X / 5 + aM / 2 + aM * var7, 3);
            if (var12.K == 2 && Player.t > 0) {
                hso_cf.u.b(hso_ft.ai / 4 % 2, this.L + aN + aN / 2 + aM + var9 - 4, 0 + hso_ft.X / 5 + aM + aM * var7 - 6, 0, 3, var1);
            } else if (var12.K == 3 && Player.u > 0) {
                hso_cf.u.b(2 + hso_ft.ai / 4 % 2, this.L + aN + aN / 2 + aM + var9 - 4, 0 + hso_ft.X / 5 + aM + aM * var7 - 6, 0, 3, var1);
            }
        }

        if (hso_ft.B) {
            c(var1, this.L + aM + aN * 3, 0 + hso_ft.X / 5 + aM, S, T, 2);
        } else {
            for (var7 = 0; var7 <= this.h; ++var7) {
                for (var8 = 0; var8 <= this.i; ++var8) {
                    if (var7 == this.h) {
                        if (var8 == this.i) {
                            var1.a(aP[2], this.L + aM + aN * 3 + S - 32, 0 + hso_ft.X / 5 + aM + T - 32, 0);
                        } else {
                            var1.a(aP[2], this.L + aM + aN * 3 + S - 32, 0 + hso_ft.X / 5 + aM + (var8 << 5), 0);
                        }
                    } else if (var8 == this.i) {
                        var1.a(aP[2], this.L + aM + aN * 3 + (var7 << 5), 0 + hso_ft.X / 5 + aM + T - 32, 0);
                    } else {
                        var1.a(aP[2], this.L + aM + aN * 3 + (var7 << 5), 0 + hso_ft.X / 5 + aM + (var8 << 5), 0);
                    }
                }
            }
        }

        if (aU > 0) {
            hso_ft.a(var1);
            if (hso_ft.B) {
                c(var1, aV, aW, aU, this.N, 12);
            } else {
                var8 = aU / 32;
                var9 = this.N / 32;

                for (int var11 = 0; var11 <= var8; ++var11) {
                    for (var3 = 0; var3 <= var9; ++var3) {
                        if (var11 == var8) {
                            if (var3 == var9) {
                                var1.a(aP[12], aV + aU - 32, aW + this.N - 32, 0);
                            } else {
                                var1.a(aP[12], aV + aU - 32, aW + (var3 << 5), 0);
                            }
                        } else if (var3 == var9) {
                            var1.a(aP[12], aV + (var11 << 5), aW + this.N - 32, 0);
                        } else {
                            var1.a(aP[12], aV + (var11 << 5), aW + (var3 << 5), 0);
                        }
                    }
                }
            }

            for (var8 = aV; var8 < aV + aU; var8 += 6) {
                var1.c(var8, aW + aM, 4, 1);
            }
        }

    }

    public final void a(mGraphics var1, boolean var2) {
        if (aU > 0) {
            this.c(var1, var2);
        } else {
            this.b(var1, var2);
        }
    }

    public final void b(mGraphics var1, boolean var2) {
        hso_eu.f = 10;
        var1.d(-var1.a(), -var1.b(), hso_ft.W, hso_ft.X);
        var1.a();
        var1.b();
        int var3 = 1;
        if (this.bj != null) {
            var3 = this.bj.length;
        }

        if (this.bl != null) {
            var3 += this.bl.length;
        }

        if (this.bu != null && this.bu.c() > 0 && this.bl == null) {
            ++var3;
        }

        if ((var3 = (var3 + 1) * hso_ft.ab + 8) > U) {
            var3 = U;
        }

        if (this.bs + this.bq > hso_ft.W) {
            this.bs = hso_ft.W / 2 - this.bq / 2;
        }

        int var4 = this.bt;
        var1.a(bf[10]);
        var1.c(this.bs - 1, var4 - 1, this.bq + 2, var3 + 2);
        var1.a(bf[2]);
        var1.c(this.bs, var4, this.bq + 1, var3 + 1);
        int var5;
        int var7;
        if (hso_ft.B) {
            c(var1, this.bs, var4, this.bq, var3, 4);
        } else {
            var5 = this.bq / 32;
            int var6 = var3 / 32;

            for (var7 = 0; var7 <= var5; ++var7) {
                for (int var8 = 0; var8 <= var6; ++var8) {
                    if (var7 == var5) {
                        if (var8 == var6) {
                            var1.a(aP[12], this.bs + this.bq - 32, var4 + var3 - 32, 0);
                        } else {
                            var1.a(aP[12], this.bs + this.bq - 32, var4 + (var8 << 5), 0);
                        }
                    } else if (var8 == var6) {
                        var1.a(aP[12], this.bs + (var7 << 5), var4 + var3 - 32, 0);
                    } else {
                        var1.a(aP[12], this.bs + (var7 << 5), var4 + (var8 << 5), 0);
                    }
                }
            }
        }

        var1.d(this.bs + 1, var4 + 1, this.bq - 2, var3 - 2);
        if (!var2 && this.bp != null) {
            var5 = var4 + 2;
            if (this.bj == null && hso_dw.g) {
                var5 = var4 + 6;
            }

            a(var1, this.bs + this.bq / 2, var5, this.bq, this.bp, this.br);
        }

        if (!var2 && this.aY != null) {
            var1.d(this.bs, var4 + hso_ft.ab, this.bq, U - hso_ft.ab - 20);
            var1.a(0, -this.aY.f);
        }

        if (this.bl != null) {
            for (var5 = 0; var5 < this.bl.length; ++var5) {
                var4 += hso_ft.ab;
                a(this.bo[var5]).a(var1, this.bl[var5], this.bs + 4, var4 + 2, 0, true);
            }
        }

        if (this.bl == null && this.bu.c() > 0) {
            var4 += hso_ft.ab;
        }

        hso_dl var9;
        for (var5 = 0; var5 < this.bu.c(); ++var5) {
            if ((var9 = (hso_dl) this.bu.a(var5)) != null) {
                if (this.bl != null) {
                    hso_bw.r.a(this.bs + 4 + this.bl[0].length() * 5 + 3 + var5 * 15, var4 - hso_ft.ab / 2 + (this.bl.length == 1 ? hso_ft.ab : 0), 13, 13, var1, 0);
                } else {
                    hso_bw.r.a(this.bs + 4 + 16 + var5 * 15, var4 + hso_ft.ab - 8, 13, 13, var1, 0);
                }

                if (var9.a != -1) {
                    hso_j var11;
                    if ((var11 = hso_bw.b(var9.a)) != null) {
                        if (this.bl != null && this.bl[0] != null) {
                            var11.b(var1, this.bs + 4 + this.bl[0].length() * 5 + 3 + var5 * 15 + 1, var4 - hso_ft.ab / 2 + 1 + (this.bl.length == 1 ? hso_ft.ab : 0), 21, 1, 0);
                        } else {
                            var11.b(var1, this.bs + 4 + 16 + var5 * 15, var4 + hso_ft.ab + 1 - 8, 21, 1, 0);
                        }
                    } else {
                        hso_bw.c(var9.a);
                    }
                }
            }
        }

        if (this.bj != null) {
            for (var5 = 0; var5 < this.bj.length; ++var5) {
                if (this.bj[var5] != null) {
                    var9 = null;
                    hso_o var10;
                    if (this.bm != null) {
                        var10 = a(this.bm[var5]);
                    } else {
                        var10 = hso_o.j;
                    }

                    var10.a(var1, this.bj[var5], this.bs + 4, var4 + 2 + (var5 + 1) * hso_ft.ab, 0, true);
                    if (this.bk != null) {
                        var7 = var10.a(this.bj[var5]) + 5;
                        a(this.bn[var5]).a(var1, this.bk[var5], this.bs + var7 + 4, var4 + 2 + (var5 + 1) * hso_ft.ab, 0, true);
                    }
                }
            }
        } else if (!var2) {
            if (this.bp != null) {
                var5 = var4 + 2;
                if (this.bj == null && hso_dw.g) {
                    var5 = var4 + 6;
                }

                a(var1, this.bs + this.bq / 2, var5, this.bq, this.bp, this.br);
            }
        } else if (this.bp != null) {
            a(var1, this.bs + this.bq / 2, var4 + hso_ft.ab / 4, this.bq, this.bp, this.br);
        }

        if (this.bc != null) {
            this.bc.a(var1, this.bs + this.bq - hso_bt.j / 2, var4 + var3 - hso_bt.k);
            if (this.bg == 0 || this.bh == 0) {
                this.bg = this.bs + this.bq - hso_bt.j / 2;
                this.bh = var4 + var3 - hso_bt.k;
            }
        }

        hso_ft.a(var1);
    }

    public void a() {
        if (this.bc != null) {
            if (this.bg != 0 && this.bh != 0) {
                this.bc.a(this.bg, this.bh, hso_cf.r, this.bc.a);
            }

            if (hso_ft.A) {
                this.bc.b();
                return;
            }

            if (hso_ft.ak[5]) {
                hso_ft.ak[5] = false;
                this.bc.a();
            }
        }

    }

    public final void c(mGraphics var1, boolean var2) {
        hso_eu.f = 10;
        hso_ft.a(var1);
        int var3 = aV;
        int var4 = aW;
        int var5 = var3 + 1;
        int var6 = var4 + 1;
        int var7 = aU - 2;
        int var8 = this.N - 2;
        boolean var9 = false;
        if (!var2) {
            a(var1, var3 + aU / 2, var4 + aM / 2 - 5, aU, this.bp, this.br);
            if (this.aY != null) {
                var1.d(var3, var4 + aM + 2, aU, U - aM - 2);
                var5 = var3;
                var6 = var4 + aM + 2;
                var7 = aU;
                var8 = U - aM - 2;
                var9 = true;
            }

            var4 += aM - hso_ft.ab + hso_ft.ab / 4;
        }

        var1.d(var5, var6, var7, var8);
        if (var9) {
            var1.a(0, -this.aY.f);
        }

        if (this.bl != null) {
            for (var5 = 0; var5 < this.bl.length; ++var5) {
                var4 += hso_ft.ab;
                a(this.bo[var5]).a(var1, this.bl[var5], var3 + 4, var4 + 2, 0, true);
            }
        }

        if (this.bl == null && this.bu.c() > 0) {
            var4 += hso_ft.ab;
        }

        hso_j var15;
        for (var5 = 0; var5 < this.bu.c(); ++var5) {
            hso_dl var13;
            if ((var13 = (hso_dl) this.bu.a(var5)) != null) {
                if (this.bo != null) {
                    hso_bw.r.a(var3 + 4 + this.bl[0].length() * 5 + 3 + var5 * 15, var4 - hso_ft.ab / 2 + (this.bl.length == 1 ? hso_ft.ab : 0), 13, 13, var1, 0);
                } else {
                    hso_bw.r.a(var3 + 4 + 16 + var5 * 15, var4 - hso_ft.ab / 2 + hso_ft.ab, 13, 13, var1, 0);
                }

                if (var13.a != -1) {
                    if ((var15 = hso_bw.b(var13.a)) != null) {
                        if (this.bl != null && this.bl[0] != null) {
                            var15.b(var1, var3 + 4 + this.bl[0].length() * 5 + 3 + var5 * 15 + 1, var4 - hso_ft.ab / 2 + 1 + (this.bl.length == 1 ? hso_ft.ab : 0), 21, 1, 0);
                        } else {
                            var15.b(var1, var3 + 4 + 16 + var5 * 15, var4 - hso_ft.ab / 2 + hso_ft.ab + 1, 21, 1, 0);
                        }
                    } else {
                        hso_bw.c(var13.a);
                    }
                }
            }
        }

        if (this.bj != null) {
            hso_ea var14 = hso_ah.i;
            int var11;
            if (this.R && var14 != null) {
                var4 += hso_ft.ab;
                hso_o.j.a(var1, hso_df.ac + var14.S + " + " + var14.ap / 10 + "," + var14.ap % 10 + "%", var3 + 4, var4 + 2, 0, true);
                var4 += hso_ft.ab;
                var6 = var14.aq / 24;
                var7 = var14.aq % 24;
                if ((var11 = (int) ((long) var14.F - var14.a() / 60000L)) > 0) {
                    hso_o.m.a(var1, hso_df.fy + " " + hso_cf.a(var11), var3 + 4, var4 + 2, 0, true);
                    var4 += hso_ft.ab;
                }

                hso_o.j.a(var1, hso_df.fH + var6 + "d " + var7 + "h", var3 + 4, var4 + 2, 0, true);
                var4 += hso_ft.ab;
                if (var14.au != null) {
                    a(hso_bw.e[var14.au.a]).a(var1, hso_bw.d[var14.au.a] + ": " + var14.au.b + "-" + var14.au.c, var3 + 4, var4 + 2, 0, true);
                }

                var4 += hso_ft.ab;
                hso_o.j.a(var1, hso_df.fI + ": " + var14.ar + "/" + var14.as, var3 + 4, var4 + 2, 0, true);
                var4 += hso_ft.ab;

                int var10;
                for (var10 = 0; var10 < hso_df.gz.length; ++var10) {
                    hso_o.j.a(var1, hso_df.gz[var10] + ": " + var14.av[var10] + "/" + var14.at, var3 + 4, var4 + 2, 0, true);
                    var4 += hso_ft.ab;
                }

                for (var10 = 0; var10 < var14.j.length; ++var10) {
                    if (var14.j[var10].a > 6) {
                        String var12 = hso_bw.d[var14.j[var10].a] + ": " + hso_bw.a(hso_bw.f[var14.j[var10].a], (int) var14.j[var10].b);
                        a(hso_bw.e[var14.j[var10].a]).a(var1, var12, var3 + 4, var4 + 2, 0, true);
                        var4 += hso_ft.ab;
                    }
                }
            } else {
                for (var6 = 0; var6 < this.bj.length; ++var6) {
                    if (this.bj[var6] != null) {
                        var15 = null;
                        hso_o var16;
                        if (this.bm != null) {
                            var16 = a(this.bm[var6]);
                        } else {
                            var16 = hso_o.j;
                        }

                        var16.a(var1, this.bj[var6], var3 + 4, var4 + 2 + (var6 + 1) * hso_ft.ab, 0, true);
                        if (this.bk != null) {
                            var11 = var16.a(this.bj[var6]) + 5;
                            a(this.bn[var6]).a(var1, this.bk[var6], var3 + var11 + 4, var4 + 2 + (var6 + 1) * hso_ft.ab, 0, true);
                        }
                    }
                }
            }
        } else if (var2) {
            hso_o.f.a(var1, this.bp, var3 + aU / 2, var4 + aM / 2 - 5, 2, true);
        }

        hso_ft.a(var1);
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, String var4, int var5) {
        if (hso_o.c.a(var4) <= var3) {
            b(var5).a(var0, var4, var1, var2, 2, true);
        } else {
            if (m.compareTo(var4.trim()) != 0) {
                m = var4.trim();
                n = new String[2];

                for (var3 = 0; var3 < n.length; ++var3) {
                    n[var3] = "";
                }

                String[] var6 = hso_o.a(m, " ");

                for (int var8 = 0; var8 < var6.length; ++var8) {
                    String[] var10000;
                    if (var8 <= var6.length / 2) {
                        var10000 = n;
                        var10000[0] = var10000[0] + var6[var8];
                        if (var8 < var6.length / 2) {
                            var10000 = n;
                            var10000[0] = var10000[0] + " ";
                        }
                    } else {
                        var10000 = n;
                        var10000[1] = var10000[1] + var6[var8];
                        if (var8 < var6.length - 1) {
                            var10000 = n;
                            var10000[1] = var10000[1] + " ";
                        }
                    }
                }
            }

            hso_o var7;
            (var7 = a(var5)).a(var0, n[0], var1, var2 - 6, 2, true);
            var7.a(var0, n[1], var1, var2 + 6, 2, true);
        }
    }

    public static hso_o a(int var0) {
        int var1 = var0;
        if (var0 >= 20 && var0 < 30) {
            var1 = var0 - 20;
        } else if (var0 >= 30 && var0 < 40) {
            var1 = var0 - 30;
        } else if (var0 >= 40 && var0 < 50) {
            var1 = var0 - 40;
        }

        switch (var1) {
            case 0:
                return hso_o.j;
            case 1:
                return hso_o.n;
            case 2:
                return hso_o.k;
            case 3:
                return hso_o.p;
            case 4:
                return hso_o.l;
            case 5:
                return hso_o.o;
            case 6:
                return hso_o.m;
            case 7:
                return hso_o.i;
            case 8:
                return hso_o.r;
            default:
                return hso_o.j;
        }
    }

    public static hso_o b(int var0) {
        int var1 = var0;
        if (var0 >= 20 && var0 < 30) {
            var1 = var0 - 20;
        } else if (var0 >= 30 && var0 < 40) {
            var1 = var0 - 30;
        } else if (var0 >= 40 && var0 < 50) {
            var1 = var0 - 40;
        }

        switch (var1) {
            case 0:
                return hso_o.f;
            case 1:
                return hso_o.b;
            case 2:
                return hso_o.d;
            case 3:
                return hso_o.e;
            case 4:
                return hso_o.a;
            case 5:
                return hso_o.g;
            case 6:
            default:
                return hso_o.f;
            case 7:
                return hso_o.c;
            case 8:
                return hso_o.r;
        }
    }

    public final void b(hso_es var1) {
        if (var1 != null) {
            int var2;
            if ((var2 = var1.c()) != 0) {
                int var6 = aW + this.N;
                int var3 = aV;
                hso_bt var7;
                if (var2 == 1) {
                    var7 = (hso_bt) var1.a(0);
                    if (aZ) {
                        var7.a(var3 + aU / 2, var6 - 10, hso_cf.v, var7.a);
                    } else {
                        var7.a(var3 + aU / 2, var6 - 15, (hso_ce) null, var7.a);
                    }
                } else {
                    hso_bt var5;
                    if (var2 == 2) {
                        var7 = (hso_bt) var1.a(0);
                        if (aZ) {
                            var7.a(var3 + aU / 4, var6 - 10, hso_cf.v, var7.a);
                        } else {
                            var7.a(var3 + aU / 4, var6 - 15, (hso_ce) null, var7.a);
                        }

                        var5 = (hso_bt) var1.a(1);
                        if (aZ) {
                            var5.a(var3 + aU / 4 * 3 + 2, var6 - 10, hso_cf.v, var5.a);
                        } else {
                            var5.a(var3 + aU / 4 * 3 + 2, var6 - 15, (hso_ce) null, var5.a);
                        }
                    } else {
                        for (int var4 = 0; var4 < var2; ++var4) {
                            var5 = (hso_bt) var1.a(var4);
                            if (var4 == var2 - 1 && var2 % 2 == 1) {
                                if (aZ) {
                                    var5.a(var3 + aU / 2, var6 - 10, hso_cf.v, var5.a);
                                } else {
                                    var5.a(var3 + aU / 2, var6 - 15 - (var2 - 1) / 2 * 30 + var4 / 2 * 30, (hso_ce) null, var5.a);
                                }
                            } else if (aZ) {
                                var5.a(var3 + aU / 4 + var4 % 2 * (aU / 2 + 2), var6 - 10 - (var2 - 1) / 2 * 22 + var4 / 2 * 22, hso_cf.v, var5.a);
                            } else {
                                var5.a(var3 + aU / 4 + var4 % 2 * (aU / 2 + 2), var6 - 15 - (var2 - 1) / 2 * 30 + var4 / 2 * 30, (hso_ce) null, var5.a);
                            }
                        }

                    }
                }
            }
        }
    }

    public static void c(mGraphics var0, int var1, int var2, int var3, int var4, int var5) {
        var0.a(o[var5]);
        var0.c(var1, var2, var3, var4);
    }
}
