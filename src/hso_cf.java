
public final class hso_cf {

    public short a = -1;
    public short b = -1;
    private int Z = 0;
    private int aa = 0;
    private int ab = 0;
    private int ac = 0;
    private int ad = 2;
    private int ae = 2;
    private int af;
    public int c;
    public int d;
    private int ag = 22;
    public static int e = 55;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    private static int ah;
    private static int ai;
    public static int j;
    private static hso_aq[] aj;
    private static hso_aq[] ak;
    public static hso_aq[] k;
    public static hso_aq l;
    public static hso_aq m;
    public static hso_aq n;
    public static hso_ce o;
    public static hso_ce p;
    public static hso_ce q;
    public static hso_ce r;
    public static hso_ce s;
    public static hso_ce t;
    public static hso_ce u;
    public static hso_ce v;
    public static hso_ce w;
    public static hso_ce x;
    public static hso_ce[] y;
    private int[] al = new int[]{2, 0, 3, 1};
    private int[] am = new int[]{4, 6, 2, 8};
    private static int[] an;
    public static int[] z;
    public static String[] A;
    private static int[][] ao;
    private static int[][] ap;
    public static int[][] B;
    private static int[][] aq;
    private static int ar;
    private static int as;
    public static int C;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static String ax;
    public static int D;
    public static int E;
    private static int ay;
    private static int az;
    private static int aA;
    private static int aB;
    private static int aC;
    private static int aD;
    public String F;
    public String G;
    public String H;
    public static boolean I;
    public static boolean J;
    public static boolean K;
    public static int L;
    public static boolean M;
    public static int N;
    private static int aE;
    private static int aF;
    public static int[] O;
    public static int[] P;
    public static long Q;
    public static int R;
    public static int S;
    private int aG;
    private int aH;
    private static int aI;
    private hso_fm aJ;
    private long aK;
    private int aL;
    private short[] aM;
    private int aN;
    private boolean aO;
    private static hso_es aP;
    private static int aQ;
    private static int aR;
    private static boolean aS;
    private byte[] aT;
    private short[] aU;
    private byte[] aV;
    public static hso_ce T;
    private byte[] aW;
    public boolean U;
    public hso_dq V;
    private int aX;
    private int aY;
    public static byte W;
    public static int X;
    public static String Y;

    static {
        f = hso_ft.X - 55;
        j = 30;
        an = new int[]{1, 3, 7, 9};
        z = new int[]{1, 3, 5, 7, 9};
        A = new String[]{"R", "T", "Y", "U", "I"};
        ao = hso_dw.a(4, 2);
        ap = hso_dw.a(4, 2);
        B = hso_dw.a(5, 2);
        aq = hso_dw.a(5, 2);
        ar = 0;
        ax = "";
        D = hso_ft.W - 35;
        E = hso_ft.X - 50;
        ay = 24;
        az = 50;
        aA = 285;
        aB = 50;
        aC = hso_ft.Y - 60;
        aD = hso_ft.X - hso_ft.aa - 14;
        I = false;
        J = true;
        K = false;
        L = 0;
        M = true;
        O = new int[3];
        P = new int[3];
        aP = new hso_es("PaintInfoGameScr vecfocus");
        W = 0;
        X = -1;
    }

    public hso_cf() {
        int[] var10000 = new int[]{100, 101, 102, 103};
        this.F = null;
        this.aG = 0;
        this.aJ = null;
        this.aK = -1L;
        this.aL = 0;
        this.aO = true;
        this.aT = new byte[4];
        this.aU = new short[4];
        this.aV = new byte[]{1, 4, 5, 2, 0};
        this.aW = new byte[]{3, 2, 0, 1, 4};
        this.U = false;
        this.aX = 0;
        this.aY = 0;
    }

    public static void a() {
        ai = (hso_ft.W << 1) / 3 - 63;
        if ((ah = hso_ft.X / 4 - (hso_ft.A ? 75 : 30)) < 1) {
            ah = 1;
        }

        N = hso_ft.W - 52;
        aE = 0;
        g = 70;
        h = 45;
        if (hso_ft.A) {
            ay = 32;
            int var0 = aA;

            int var1;
            for (var1 = 0; var1 < ao.length; ++var1) {
                ao[var1][0] = D + hso_ak.b(hso_ak.d(var0)) * aB / 1000;
                ao[var1][1] = E + hso_ak.a(hso_ak.d(var0)) * aB / 1000;
                var0 -= 45;
            }

            aC = hso_ft.W - ay * 6;
            aD = hso_ft.X - 24;
            B[0][0] = 8;
            B[0][1] = 43;
            B[1][0] = 8;
            B[1][1] = 73;
            B[2][0] = hso_ft.W - 27;
            B[2][1] = hso_ft.X - 145;
            B[3][0] = hso_ft.W - 27;
            B[3][1] = hso_ft.X - 175;
            B[4][0] = hso_ft.Y - 20;
            B[4][1] = hso_ft.X - 16;
            h();
            g = 45;
            h = 45;
            k = new hso_aq[5];

            for (var1 = 0; var1 < k.length; ++var1) {
                k[var1] = hso_aq.a("/point/other_" + var1 + ".img");
                aq[var1][0] = hso_aq.a(k[var1].a);
                aq[var1][1] = hso_aq.b(k[var1].a) / 2;
            }

            aj = new hso_aq[3];

            for (var1 = 0; var1 < aj.length; ++var1) {
                if (var1 != 1) {
                    aj[var1] = hso_aq.a("/point/move_" + var1 + ".img");
                }
            }

            for (var1 = 0; var1 < ap.length; ++var1) {
                ap[var1][0] = e + (var1 < 2 ? -j + (j << 1) * (var1 % 2) : 0);
                ap[var1][1] = f + (var1 > 1 ? -j + (j << 1) * (var1 % 2) : 0);
            }

            ak = new hso_aq[2];

            for (var1 = 0; var1 < ak.length; ++var1) {
                ak[var1] = hso_aq.a("/point/fire_" + var1 + ".img");
            }

            o = new hso_ce(hso_aq.a("/point/close.img"), 14, 14);
            t = new hso_ce(hso_aq.a("/point/closemenu.img"), 21, 21);
            q = new hso_ce(hso_aq.a("/point/buttonback.png"), 57, 30);
            new hso_ce(hso_aq.a("/point/buttonmenu.img"), 32, 32);
            r = new hso_ce(hso_aq.a("/point/button.img"), 80, 30);
            v = new hso_ce(hso_aq.a("/point/button2.img"), 60, 19);
            w = new hso_ce(hso_aq.a("/point/contact.img"), 26, 26);
            y = new hso_ce[11];

            for (var1 = 0; var1 < y.length; ++var1) {
                y[var1] = new hso_ce(hso_aq.a("/point/quick_" + var1 + ".png"), 30, 30);
            }

            n = hso_aq.a("/point/backquick.img");
            hso_aq.a("/interface/move.img");
            N = hso_ft.Y;
        }

        aI = 130;
    }

    public static void a(mGraphics var0, boolean var1) {
        if (var1) {
            aF = 0;
        } else {
            aF = 10;
        }

        var0.a(hso_cg.ad[0], 0, 0, O[0], P[0], 0, hso_ft.W - O[0] + aF, -aF, 0);
        var0.a(hso_cg.ad[0], 0, 0, O[0], P[0], 1, hso_ft.W - O[0] + aF, hso_ft.X - P[0] + aF, 0);
        var0.a(hso_cg.ad[0], 0, 0, O[0], P[0], 2, -aF, -aF, 0);
        var0.a(hso_cg.ad[0], 0, 0, O[0], P[0], 4, -aF, hso_ft.X - P[0] + aF, 0);
        int var3 = (hso_ft.W + aF - 2 * O[0]) / O[1] + 1;

        int var2;
        for (var2 = 0; var2 < var3; ++var2) {
            var0.a(hso_cg.ad[1], 0, 0, O[1], P[1], 0, O[0] + O[1] * var2 - aF, -aF, 0);
            var0.a(hso_cg.ad[1], 0, 0, O[1], P[1], 1, O[0] + O[1] * var2 - aF, hso_ft.X - P[1] + aF, 0);
        }

        var2 = (hso_ft.W + aF - 2 * P[0]) / P[2] + 1;

        for (var3 = 0; var3 < var2; ++var3) {
            var0.a(hso_cg.ad[2], 0, 0, O[2], P[2], 0, -aF, P[0] + P[2] * var3 - aF, 0);
            var0.a(hso_cg.ad[2], 0, 0, O[2], P[2], 2, hso_ft.W - O[2] + aF, P[0] + P[2] * var3 - aF, 0);
        }

    }

    public final void a(mGraphics var1) {
        if (C != 0) {
            l(var1);
        } else {
            int var5 = aD;
            int var2;
            if (GameScreen.h != null && GameScreen.h.cx == 2) {
                for (var2 = 0; var2 < 5; ++var2) {
                    var1.a(hso_cg.ap, aC + var2 * ay, var5 - 5, 0);
                    if (!hso_ft.A && hso_fi.h) {
                        hso_cg.a(var1, A[var2], aC + var2 * ay + 11, var5, 2);
                    } else {
                        hso_cg.a(var1, String.valueOf(z[var2]), aC + var2 * ay + 11, var5, 2);
                    }
                }

            } else {
                for (var2 = 0; var2 < Player.w[0].length; ++var2) {
                    var1.a(hso_cg.ap, aC + var2 * ay, aD - 5, 0);
                    hso_ao var6 = Player.w[Player.d][var2];
                    hso_ad var3 = null;
                    hso_bw var4;
                    if (var6.b == 0) {
                        hso_ev var7;
                        if ((var7 = hso_ct.c(var6.a)) != null) {
                            var7.a(var1, aC + var2 * ay + 11, aD - 5 + 11, 3);
                        }

                        var3 = Player.r[var6.a];
                    } else if (var6.b == hso_ao.f && hso_fo.d) {
                        if ((var4 = hso_bw.a(4, (short) var6.a)) != null && var4.L < 2) {
                            var4.a(var1, aC + var2 * ay + 11, aD + 11 - 5, hso_fl.aM, 0, 3);
                            var3 = Player.s[var4.L];
                        } else {
                            var6.a(0, hso_ao.d, (byte) 0);
                            hso_j.a((byte) 1, false);
                            hso_j.a((byte) 0, false);
                        }
                    }

                    if (var6.b != hso_ao.d && var3 != null && var3.c > 0) {
                        if (var3.b > 0) {
                            int var8;
                            if ((var8 = var3.b * 20 / var3.c) < 1) {
                                var8 = 1;
                            }

                            var1.a(hso_cg.am, 0, 0, 20, var8, 0, aC + var2 * ay + 1, aD + 1 - 5, 0);
                            var5 = var3.b / 1000;
                            var4 = null;
                            String var9;
                            if (var5 == 0) {
                                var9 = "0." + var3.b % 1000 / 100;
                            } else {
                                var9 = "" + var5;
                            }

                            hso_o.f.a(var1, var9, aC + var2 * ay + 11, aD + 5 - 5, 2, false);
                        } else if (var3.b > -150) {
                            var1.a(-1118516);
                            var1.a(aC + var2 * ay + 1, aD - 5 + 1, 20, 20, 4, 4);
                        }
                    }

                    if (!hso_ft.A) {
                        if (hso_fi.h) {
                            hso_o.f.a(var1, A[var2], aC + var2 * ay + 12, aD - 5 - 11, 2, false);
                        } else {
                            hso_o.f.a(var1, String.valueOf(z[var2]), aC + var2 * ay + 12, aD - 5 - 11, 2, false);
                        }
                    }
                }

            }
        }
    }

    private static void l(mGraphics var0) {
        for (int var1 = 0; var1 < 10; ++var1) {
            boolean var2 = false;
            int var3 = Player.d;
            int var4;
            if (var1 < 5) {
                var4 = C << 3;
            } else {
                var4 = 64 - (C << 3);
                if (Player.d == 0) {
                    var3 = 1;
                } else {
                    var3 = 0;
                }
            }

            var0.a(hso_cg.ap, aC + var1 % 5 * ay - 1, var4 + aD - 1, 0);
            hso_ao var5;
            if ((var5 = Player.w[var3][var1 % 5]).b == 0) {
                hso_ct.c(var5.a).a(var0, aC + var1 % 5 * ay + 11, var4 + aD + 11, 3);
            } else {
                hso_bw var6;
                if (var5.b == hso_ao.f && (var6 = hso_bw.a(4, (short) var5.a)) != null) {
                    var6.a(var0, aC + var1 % 5 * ay + 11, var4 + aD + 11, hso_fl.aM, 0, 3);
                }
            }
        }

    }

    public final void a(mGraphics var1, int var2, int var3) {
        if (GameScreen.aO) {
            hso_ft.a(var1);
            int var4;
            int var5;
            int var6;
            int var7;
            long var21;
            if (this.a != -1) {
                MainObject var16;
                if ((var16 = GameScreen.a((short) this.a, (byte) 0)) != null) {
                    if ((var6 = (var2 = hso_ft.W / 2 - 20) / (R / 2)) < 0) {
                        var6 = 1;
                    }

                    if (var6 == 1) {
                        var1.a(hso_cg.ay, 0, 0, R, 9, 0, 0, var3 + 3, 0);
                    } else {
                        var1.a(hso_cg.ay, 0, 0, R - 2, 9, 0, 0, var3 + 3, 0);
                        var1.a(hso_cg.ay, 2, 0, R - 2, 9, 0, var2 + 0 - (R - 2) + 2, var3 + 3, 0);
                        if ((var7 = (var2 - (R - 2 << 1)) / 5) <= 0) {
                            var7 = 1;
                        }

                        for (int var8 = 0; var8 < var7 + 1; ++var8) {
                            var1.a(hso_cg.ay, 10, 0, 15, 9, 0, 0 + R - 4 + var8 * 5, var3 + 3, 0);
                        }
                    }

                    if (var16.br > 0) {
                        long var19 = (long) var16.bs;
                        long var10 = (long) var16.br;
                        long var12 = (long) var2;
                        var7 = (int) (var10 * var12 / var19);
                        var4 = var2 + 1;
                        var1.d(0, var3 + 4, var4 - (var2 - var7), 7);
                        if ((var4 = var2 / (S / 2)) < 0) {
                            var4 = 1;
                        }

                        if (var4 == 1) {
                            var1.a(hso_cg.ah, 0, 0, S, 7, 0, 1, var3 + 4, 0);
                        } else {
                            var1.a(hso_cg.ah, 0, 0, S - 2, 7, 0, 1, var3 + 4, 0);
                            var1.a(hso_cg.ah, 2, 0, S - 2, 7, 0, var2 + 1 - (S - 2), var3 + 4, 0);
                            if ((var5 = (var2 - (S - 2 << 1)) / 5) <= 0) {
                                var5 = 1;
                            }

                            for (var4 = 0; var4 < var5 + 1; ++var4) {
                                var1.a(hso_cg.ah, 10, 0, 15, 7, 0, 0 + S - 2 + var4 * 5, var3 + 4, 0);
                            }
                        }
                    }

                    var16.getClass();
                    hso_ft.a(var1);
                    hso_cg.a(var1, var16.cB.toUpperCase() + " Lv: " + var16.by, 2, var3 + 24 - 10, 0, (byte) 0);
                    if (!var16.ds) {
                        hso_o.j.a(var1, var16.br + "/" + var16.bs, var2 / 2, var3 + 2, 2, true);
                    } else {
                        hso_o var18 = hso_o.j;
                        if (MainObject.dt > 5) {
                            var18 = hso_o.m;
                        }

                        var18.a(var1, var16.br + "/" + var16.bs, var2 / 2, var3 + 2, 2, true);
                    }

                    if (Q - hso_dw.a() / 1000L > 0L) {
                        var21 = Q - hso_dw.a() / 1000L;
                        var1.a(hso_cg.aj, 0, 0, 140, 20, 0, hso_ft.W / 2, var3 + 35, 3);
                        hso_o.j.a(var1, hso_df.G + var21, hso_ft.W / 2, var3 + 30, 2, false);
                        return;
                    }
                }
            } else {
                int var17;
                if ((var2 = (var17 = hso_ft.W / 2 - 20) / (R / 2)) < 0) {
                    var2 = 1;
                }

                if (var2 == 1) {
                    var1.a(hso_cg.ay, 0, 0, R, 9, 0, 0, var3 + 3, 0);
                    var1.a(hso_cg.ay, 0, 9, R, 9, 0, 0, var3 + 15, 0);
                } else {
                    var1.a(hso_cg.ay, 0, 0, R - 2, 9, 0, 0, var3 + 3, 0);
                    var1.a(hso_cg.ay, 0, 9, R - 2, 9, 0, 0, var3 + 15, 0);
                    var1.a(hso_cg.ay, 2, 0, R - 2, 9, 0, var17 + 0 - (R - 2) + 2, var3 + 3, 0);
                    var1.a(hso_cg.ay, 2, 9, R - 2, 9, 0, var17 + 0 - (R - 2) + 2, var3 + 15, 0);
                    if ((var6 = (var17 - (R - 2 << 1)) / 5) <= 0) {
                        var6 = 1;
                    }

                    for (var7 = 0; var7 < var6 + 1; ++var7) {
                        var1.a(hso_cg.ay, 10, 0, 15, 9, 0, 0 + R - 4 + var7 * 5, var3 + 3, 0);
                        var1.a(hso_cg.ay, 10, 9, 15, 9, 0, 0 + R - 4 + var7 * 5, var3 + 15, 0);
                    }
                }

                long var9;
                long var11;
                int var15;
                if (GameScreen.f.br > 0) {
                    var21 = (long) GameScreen.f.bs;
                    var9 = (long) GameScreen.f.br;
                    var11 = (long) var17;
                    var6 = (int) (var9 * var11 / var21);
                    var15 = var17 + 1;
                    var1.d(0, var3 + 4, var15 - (var17 - var6), 7);
                    if ((var4 = var17 / (S / 2)) < 0) {
                        var4 = 1;
                    }

                    if (var4 == 1) {
                        var1.a(hso_cg.ah, 0, 0, S, 7, 0, 1, var3 + 4, 0);
                    } else {
                        var1.a(hso_cg.ah, 0, 0, S - 2, 7, 0, 1, var3 + 4, 0);
                        var1.a(hso_cg.ah, 2, 0, S - 2, 7, 0, var17 + 1 - (S - 2), var3 + 4, 0);
                        if ((var4 = (var17 - (S - 2 << 1)) / 5) <= 0) {
                            var4 = 1;
                        }

                        for (var5 = 0; var5 < var4 + 1; ++var5) {
                            var1.a(hso_cg.ah, 10, 0, 15, 7, 0, 0 + S - 2 + var5 * 5, var3 + 4, 0);
                        }
                    }
                }

                if (GameScreen.f.bt > 0) {
                    var21 = (long) GameScreen.f.bu;
                    var9 = (long) GameScreen.f.bt;
                    var11 = (long) var17;
                    long var13 = var9 * var11;
                    var15 = var17 + 2;
                    var6 = (int) (var13 / var21);
                    var1.d(0, var3 + 16, var15 - (var17 - var6), 7);
                    if ((var4 = var17 / (S / 2)) < 0) {
                        var4 = 1;
                    }

                    if (var4 == 1) {
                        var1.a(hso_cg.ah, 0, 7, S, 7, 0, 1, var3 + 16, 0);
                    } else {
                        var1.a(hso_cg.ah, 0, 7, S - 2, 7, 0, 1, var3 + 16, 0);
                        var1.a(hso_cg.ah, 2, 7, S - 2, 7, 0, var17 + 1 - (S - 2), var3 + 16, 0);
                        if ((var4 = (var17 - (S - 2 << 1)) / 5) <= 0) {
                            var4 = 1;
                        }

                        for (var5 = 0; var5 < var4 + 1; ++var5) {
                            var1.a(hso_cg.ah, 10, 7, 15, 7, 0, 0 + S - 2 + var5 * 5, var3 + 16, 0);
                        }
                    }
                }

                hso_ft.a(var1);
                hso_cg.a(var1, GameScreen.f.cB.toUpperCase() + " Lv: " + GameScreen.f.by, 2, var3 + 24, 0, (byte) 0);
                hso_o var20;
                if (!GameScreen.f.ds) {
                    hso_o.j.a(var1, GameScreen.f.br + "/" + GameScreen.f.bs, var17 / 2, var3 + 2, 2, true);
                } else {
                    var20 = hso_o.j;
                    if (MainObject.dt > 5) {
                        var20 = hso_o.m;
                    }

                    var20.a(var1, GameScreen.f.br + "/" + GameScreen.f.bs, var17 / 2, var3 + 2, 2, true);
                }

                if (!GameScreen.f.dr) {
                    hso_o.j.a(var1, GameScreen.f.bt + "/" + GameScreen.f.bu, var17 / 2, var3 + 14, 2, false);
                } else {
                    var20 = hso_o.j;
                    if (MainObject.dt > 5) {
                        var20 = hso_o.n;
                    }

                    var20.a(var1, GameScreen.f.bt + "/" + GameScreen.f.bu, var17 / 2, var3 + 14, 2, true);
                }

                if (Q - hso_dw.a() / 1000L > 0L) {
                    long var22 = Q - hso_dw.a() / 1000L;
                    var1.a(hso_cg.aj, 0, 0, 140, 20, 0, hso_ft.W / 2, var3 + 35, 3);
                    hso_o.j.a(var1, hso_df.G + var22, hso_ft.W / 2, var3 + 30, 2, false);
                }
            }

        }
    }

    public final void b(mGraphics var1, int var2, int var3) {
        if (GameScreen.aO) {
            int var4;
            int var5;
            int var6;
            int var7;
            if (this.b != -1) {
                MainObject var16;
                if ((var16 = GameScreen.a((short) this.b, (byte) 0)) != null) {
                    hso_ft.a(var1);
                    if ((var5 = (var4 = hso_ft.W / 2 - 20) / (R / 2)) < 0) {
                        var5 = 1;
                    }

                    if (var5 == 1) {
                        var1.a(hso_cg.ay, 0, 0, R, 9, 0, var2, var3 + 3, 0);
                    } else {
                        var1.a(hso_cg.ay, 0, 0, R - 2, 9, 0, var2, var3 + 3, 0);
                        var1.a(hso_cg.ay, 2, 0, R - 2, 9, 0, hso_ft.W - R, var3 + 3, 0);
                        if ((var7 = (var4 - (R - 2 << 1)) / 5) <= 0) {
                            var7 = 1;
                        }

                        for (int var8 = 0; var8 < var7 + 1; ++var8) {
                            var1.a(hso_cg.ay, 10, 0, 15, 9, 0, var2 + R - 4 + var8 * 5, var3 + 3, 0);
                        }
                    }

                    if (var16.br > 0) {
                        long var19 = (long) var16.bs;
                        long var10 = (long) var16.br;
                        long var12 = (long) var4;
                        var7 = (int) (var10 * var12 / var19);
                        var1.d(var2 + (var4 - var7), var3 + 4, hso_ft.W / 2 - (var4 - var7), 7);
                        if ((var5 = var4 / (S / 2)) < 0) {
                            var5 = 1;
                        }

                        if (var5 == 1) {
                            var1.a(hso_cg.ah, 0, 0, S, 7, 0, var2 + 1, var3 + 4, 0);
                        } else {
                            var1.a(hso_cg.ah, 0, 0, S - 2, 7, 0, var2 + 1, var3 + 4, 0);
                            var1.a(hso_cg.ah, 2, 0, S - 2, 7, 0, hso_ft.W - R, var3 + 4, 0);
                            if ((var6 = (var4 - (S - 2 << 1)) / 5) <= 0) {
                                var6 = 1;
                            }

                            for (var5 = 0; var5 < var6 + 1; ++var5) {
                                var1.a(hso_cg.ah, 10, 0, 15, 7, 0, var2 + S - 2 + var5 * 5, var3 + 4, 0);
                            }
                        }
                    }

                    if (var16.bt > 0) {
                        var16.getClass();
                    }

                    hso_ft.a(var1);
                    hso_cg.a(var1, var16.cB.toUpperCase() + " Lv: " + var16.by, var2 + var4 - 2, var3 + 24 - 10, 1, (byte) 0);
                    if (!var16.ds) {
                        hso_o.j.a(var1, var16.br + "/" + var16.bs, var2 + var4 / 2, var3 + 2, 2, true);
                        return;
                    }

                    hso_o var18 = hso_o.j;
                    if (MainObject.dt > 5) {
                        var18 = hso_o.m;
                    }

                    var18.a(var1, var16.br + "/" + var16.bs, var2 + var4 / 2, var3 + 2, 2, true);
                    return;
                }
            } else {
                if (GameScreen.h == null || GameScreen.h != null && GameScreen.h.cu != 0) {
                    return;
                }

                hso_ft.a(var1);
                int var17;
                if ((var4 = (var17 = hso_ft.W / 2 - 20) / (R / 2)) < 0) {
                    var4 = 1;
                }

                if (var4 == 1) {
                    var1.a(hso_cg.ay, 0, 0, R, 9, 0, var2, var3 + 3, 0);
                    var1.a(hso_cg.ay, 0, 9, R, 9, 0, var2, var3 + 15, 0);
                } else {
                    var1.a(hso_cg.ay, 0, 0, R - 2, 9, 0, var2, var3 + 3, 0);
                    var1.a(hso_cg.ay, 0, 9, R - 2, 9, 0, var2, var3 + 15, 0);
                    var1.a(hso_cg.ay, 2, 0, R - 2, 9, 0, hso_ft.W - R, var3 + 3, 0);
                    var1.a(hso_cg.ay, 2, 9, R - 2, 9, 0, hso_ft.W - R, var3 + 15, 0);
                    if ((var5 = (var17 - (R - 2 << 1)) / 5) <= 0) {
                        var5 = 1;
                    }

                    for (var7 = 0; var7 < var5 + 1; ++var7) {
                        var1.a(hso_cg.ay, 10, 0, 15, 9, 0, var2 + R - 4 + var7 * 5, var3 + 3, 0);
                        var1.a(hso_cg.ay, 10, 9, 15, 9, 0, var2 + R - 4 + var7 * 5, var3 + 15, 0);
                    }
                }

                long var9;
                long var11;
                int var15;
                long var20;
                if (GameScreen.h.br > 0) {
                    var20 = (long) GameScreen.h.bs;
                    var9 = (long) GameScreen.h.br;
                    var11 = (long) var17;
                    var5 = (int) (var9 * var11 / var20);
                    var1.d(var2 + (var17 - var5), var3 + 4, hso_ft.W / 2 - (var17 - var5), 7);
                    if ((var15 = var17 / (S / 2)) < 0) {
                        var15 = 1;
                    }

                    if (var15 == 1) {
                        var1.a(hso_cg.ah, 0, 0, S, 7, 0, var2 + 1, var3 + 4, 0);
                    } else {
                        var1.a(hso_cg.ah, 0, 0, S - 2, 7, 0, var2 + 1, var3 + 4, 0);
                        var1.a(hso_cg.ah, 2, 0, S - 2, 7, 0, hso_ft.W - R, var3 + 4, 0);
                        if ((var5 = (var17 - (S - 2 << 1)) / 5) <= 0) {
                            var5 = 1;
                        }

                        for (var6 = 0; var6 < var5 + 1; ++var6) {
                            var1.a(hso_cg.ah, 10, 0, 15, 7, 0, var2 + S - 2 + var6 * 5, var3 + 4, 0);
                        }
                    }
                }

                if (GameScreen.h.bt > 0 && GameScreen.h.bu > 0) {
                    var20 = (long) GameScreen.h.bu;
                    var9 = (long) GameScreen.h.bt;
                    var11 = (long) var17;
                    var5 = (int) (var9 * var11 / var20);
                    var1.d(var2 + (var17 - var5), var3 + 16, hso_ft.W / 2 - (var17 - var5), 7);
                    if ((var15 = var17 / (S / 2)) < 0) {
                        var15 = 1;
                    }

                    if (var15 == 1) {
                        var1.a(hso_cg.ah, 0, 7, S, 7, 0, var2 + 1, var3 + 16, 0);
                    } else {
                        var1.a(hso_cg.ah, 0, 7, S - 2, 7, 0, var2 + 1, var3 + 16, 0);
                        var1.a(hso_cg.ah, 2, 7, S - 2, 7, 0, hso_ft.W - R, var3 + 16, 0);
                        if ((var5 = (var17 - (S - 2 << 1)) / 5) <= 0) {
                            var5 = 1;
                        }

                        for (var6 = 0; var6 < var5 + 1; ++var6) {
                            var1.a(hso_cg.ah, 10, 7, 15, 7, 0, var2 + S - 2 + var6 * 5, var3 + 16, 0);
                        }
                    }
                }

                hso_ft.a(var1);
                hso_cg.a(var1, GameScreen.h.cB.toUpperCase() + " Lv: " + GameScreen.h.by, var2 + var17 - 2, var3 + 24, 1, (byte) 0);
                hso_o var21;
                if (!GameScreen.h.ds) {
                    hso_o.j.a(var1, GameScreen.h.br + "/" + GameScreen.h.bs, var2 + var17 / 2, var3 + 2, 2, true);
                } else {
                    var21 = hso_o.j;
                    if (MainObject.dt > 5) {
                        var21 = hso_o.m;
                    }

                    var21.a(var1, GameScreen.h.br + "/" + GameScreen.h.bs, var2 + var17 / 2, var3 + 2, 2, true);
                }

                if (!GameScreen.h.dr) {
                    hso_o.j.a(var1, GameScreen.h.bt + "/" + GameScreen.h.bu, var2 + var17 / 2, var3 + 14, 2, false);
                    return;
                }

                var21 = hso_o.j;
                if (MainObject.dt > 5) {
                    var21 = hso_o.n;
                }

                var21.a(var1, GameScreen.h.bt + "/" + GameScreen.h.bu, var2 + var17 / 2, var3 + 14, 2, true);
            }

        }
    }

    public final void a(mGraphics var1, int var2, int var3, boolean var4, hso_o var5) {
        if (!GameScreen.aO) {
            int var6;
            if (var4) {
                var1.a(hso_cg.af, 0, 0, 16, 42, 0, 1, var3 + 2, 0);
                var1.a(hso_cg.af, 0, 84, 16, 42, 0, 96, var3 + 2, 24);

                for (var6 = 0; var6 < 4; ++var6) {
                    var1.a(hso_cg.af, 0, 42, 16, 42, 0, 17 + var6 * 16, var3 + 2, 0);
                }

                var2 += 8;
                var3 += 4;
            }

            var1.a(hso_cg.ag, var2 + 2, var3 + 3, 0);
            var1.a(hso_cg.ay, 0, 0, 62, 9, 0, var2 + 19, var3 + 3, 0);
            var1.a(hso_cg.ay, 0, 9, 62, 9, 0, var2 + 19, var3 + 15, 0);
            boolean var7 = false;
            var7 = false;
            if (GameScreen.f.br > 0) {
                if ((var6 = GameScreen.f.br * 60 / GameScreen.f.bs) <= 0) {
                    var6 = 1;
                } else if (var6 > 60) {
                    var6 = 60;
                }

                var1.a(hso_cg.ah, 0, 0, var6, 7, 0, var2 + 20, var3 + 4, 0);
            }

            if (GameScreen.f.bt > 0) {
                if ((var6 = GameScreen.f.bt * 60 / GameScreen.f.bu) <= 0) {
                    var6 = 1;
                } else if (var6 > 60) {
                    var6 = 60;
                }

                var1.a(hso_cg.ah, 0, 7, var6, 7, 0, var2 + 20, var3 + 16, 0);
            }

            var5.a(var1, "Lv." + GameScreen.f.by + " + " + GameScreen.f.bz / 10 + "," + GameScreen.f.bz % 10 + "%", var2 + 3, var3 + 24, 0, false);
            var7 = false;
            if (GameScreen.f.bz > 0) {
                var6 = GameScreen.f.bz / 10 * 77 / 100;
                var1.a(-13263058);
                var1.c(var2 + 3, var3 + 35, var6, 2);
            }

            hso_o var8;
            if (!GameScreen.f.ds) {
                hso_o.j.a(var1, GameScreen.f.br + "/" + GameScreen.f.bs, var2 + 50, var3 + 2, 2, false);
            } else {
                var8 = hso_o.j;
                if (MainObject.dt > 5) {
                    var8 = hso_o.m;
                }

                var8.a(var1, GameScreen.f.br + "/" + GameScreen.f.bs, var2 + 50, var3 + 2, 2, false);
            }

            if (!GameScreen.f.dr) {
                hso_o.j.a(var1, GameScreen.f.bt + "/" + GameScreen.f.bu, var2 + 50, var3 + 14, 2, false);
            } else {
                var8 = hso_o.j;
                if (MainObject.dt > 5) {
                    var8 = hso_o.n;
                }

                var8.a(var1, GameScreen.f.bt + "/" + GameScreen.f.bu, var2 + 50, var3 + 14, 2, false);
            }
        }
    }

    public final void b(mGraphics var1) {
        hso_ft.a(var1);
        int var2 = ah;
        byte var3 = 0;
        if (hso_ft.A) {
            var3 = 25;
        }

        int var4;
        if (this.F != null) {
            var1.d(hso_ft.Y - ai / 2, var2, ai - var3, 20);

            for (var4 = 0; var4 < ai / 140 + 1; ++var4) {
                if (var4 == ai / 140) {
                    var1.a(hso_cg.aj, 0, 0, ai % 140, 20, 0, hso_ft.Y - ai / 2 + var4 * 140, var2, 0);
                } else {
                    var1.a(hso_cg.aj, hso_ft.Y - ai / 2 + var4 * 140, var2, 0);
                }
            }

            hso_o.k.a(var1, this.F, hso_ft.Y + ai / 2 - this.Z, var2 + 4, 0, true);
            var2 += this.ag;
        }

        if (this.H != null) {
            var1.d(hso_ft.Y - ai / 2, var2, ai - var3, 20);

            for (var4 = 0; var4 < ai / 140 + 1; ++var4) {
                if (var4 == ai / 140) {
                    var1.a(hso_cg.aj, 0, 0, ai % 140, 20, 0, hso_ft.Y - ai / 2 + var4 * 140, var2, 0);
                } else {
                    var1.a(hso_cg.aj, hso_ft.Y - ai / 2 + var4 * 140, var2, 0);
                }
            }

            hso_o.f.a(var1, this.H, hso_ft.Y + ai / 2 - this.aa, var2 + 4, 0, true);
            var2 += this.ag;
        }

        if (this.G != null) {
            var1.d(hso_ft.Y - 70, var2, 140, 20);
            var1.a(hso_cg.aj, hso_ft.Y - 70, var2 + this.d, 0);
            hso_o.j.a(var1, this.G, hso_ft.Y, var2 + 4 + this.d, 2, true);
        }

        hso_ft.a(var1);
    }

    public final void c(mGraphics var1) {
        byte var3 = 102;
        byte var2 = 8;
        if (hso_ft.C) {
            var3 = 90;
            var2 = 7;
        }

        if (Player.t > 0 && !GameScreen.aO) {
            u.b(hso_ft.ai / 4 % 2, var3, var2, 0, 3, var1);
        }

        if (Player.u > 0 && !GameScreen.aO) {
            u.b(2 + hso_ft.ai / 4 % 2, var3, var2 + 14, 0, 3, var1);
        }

        if (Player.o > -1) {
            var1.a(l, var3 + 1, var2 + 28, 3);
        }

        if (Player.A == 1) {
            if (hso_ft.ai % 200 < 100) {
                var1.a(m, var3 + 1, var2 + 42, 3);
                return;
            }

            hso_o var10000 = hso_o.o;
            if (Player.g > 0 && (hso_ft.aj - Player.j) / 1000L > 60L) {
                Player.j += 60000L;
                --Player.g;
            }

            var10000.a(var1, a(Player.g), var3 - 7, var2 + 36, 0, false);
        }

    }

    public static String a(int var0) {
        return var0 >= 60 ? var0 / 60 + "h" + var0 % 60 + "'" : var0 + "'";
    }

    public final void b() {
        if (GameScreen.j.c() > 0) {
            if (this.F == null) {
                this.F = (String) GameScreen.j.a(0);
                if (this.F != null && this.F.trim().length() > 0) {
                    hso_ft.g.a(hso_df.cz, hso_df.fr, this.F, (byte) 1, false);
                }

                int var1;
                if ((var1 = GameScreen.j.c()) < 2) {
                    this.ad = 2;
                } else if (var1 < 5) {
                    this.ad = 3;
                } else {
                    this.ad = 4;
                }

                this.Z = 0;
                this.ab = hso_o.j.a(this.F) + ai;
                if (this.ab < ai) {
                    this.ab = ai;
                    return;
                }
            } else {
                if (this.Z >= this.ab) {
                    ++this.af;
                    this.af = 0;
                    this.F = null;
                    GameScreen.j.b(0);
                }

                this.Z += this.ad;
            }
        }

    }

    public final void c() {
        if (GameScreen.k.c() > 0) {
            if (this.H == null) {
                this.H = (String) GameScreen.k.a(0);
                int var1;
                if ((var1 = GameScreen.k.c()) < 2) {
                    this.ae = 2;
                } else if (var1 < 5) {
                    this.ae = 3;
                } else {
                    this.ae = 4;
                }

                this.aa = 0;
                this.ac = hso_o.f.a(this.H) + ai;
                if (this.ac < ai) {
                    this.ac = ai;
                    return;
                }
            } else {
                if (this.aa >= this.ac) {
                    this.H = null;
                    GameScreen.k.b(0);
                }

                this.aa += this.ae;
            }
        }

    }

    public final void d(mGraphics var1) {
        if (!GameScreen.aO) {
            if (K || !I) {
                if (GameScreen.h != null) {
                    boolean var12 = false;
                    int var2 = 2;
                    int var13 = N;
                    if (j()) {
                        var13 = hso_ft.W - 62;
                        var2 = 2 + hso_ft.ab;
                    }

                    MainObject var3;
                    int var4;
                    if ((var3 = GameScreen.h).cu == 3) {
                        hso_cg.a(var1, var3.cB, var13 + 48, var2 + 2, 1, (byte) var3.cs);
                    } else if (var3.cu != 0 && var3.cu != 1) {
                        hso_cg.a(var1, var3.cB, var13 + 48, var2 + 2, 1);
                    } else {
                        if (var3.cO != null && var3.cy == 0) {
                            var4 = hso_o.f.a(var3.cB) + 1;
                            var3.a(var1, var13 + 48 - var4 / 2, var2 + 7, 2);
                            var2 += 12;
                        }

                        if (var3.cu == 1) {
                            byte var14 = var3.cs;
                            hso_cg.a(var1, var3.cB, var13 + 48, var2 + 2, 1, (byte) 7, var14);
                        } else {
                            hso_cg.a(var1, var3.cB, var13 + 48, var2 + 2, 1);
                        }

                        var2 += 10;
                        hso_cg.a(var1, hso_df.ah + var3.by, var13 + 48, var2 + 2, 1, (byte) 7, var3.cs);
                    }

                    if (var3.cu == 0 || var3.cu == 1 || var3.cu == 2) {
                        var1.a(hso_cg.az, var13 - 4, var2 + 14, 0);
                        boolean var15 = false;
                        if (var3.bs > 0 && var3.br > 0) {
                            long var6 = 50L;
                            long var8 = (long) var3.br;
                            if ((var4 = (int) (var6 * var8 / (long) var3.bs)) <= 0) {
                                var4 = 1;
                            } else if (var4 > 50) {
                                var4 = 50;
                            }

                            var1.a(hso_cg.aA, 0, 0, var4 + 1, 7, 0, var13 - 4, var2 + 14, 0);
                        }

                        hso_o.j.a(var1, var3.br + "/" + var3.bs, var13 + 48, var2 + 20, 1, false);
                    }
                }

            }
        }
    }

    public final void d() {
        if (this.G != null) {
            ++this.c;
            if (this.c >= 120) {
                this.c = 0;
                this.G = null;
            }

            if (this.d > 0) {
                this.d -= 2;
            }
        }

        if (!hso_ft.A && C > 0 && ++C > 8) {
            C = 0;
            if (++Player.d > 2) {
                Player.d = 0;
            }
        }

        if (at > 0) {
            if (at == 20) {
                av = 10;
            } else if (at < 20 && av > -20) {
                av -= 4;
            }

            if (aw > -30) {
                aw += av;
                return;
            }

            at = 0;
        }

    }

    public final void e() {
        if (hso_ff.g.c() > 0) {
            if (this.aJ == null) {
                this.aJ = (hso_fm) hso_ff.g.a(0);
                this.aG = 100;
                this.aH = 0;
            } else {
                --this.aG;
                if (this.aG <= 0) {
                    this.aJ = null;
                    hso_ff.g.b(0);
                }

                if (this.aH < 35) {
                    this.aH += 10;
                }

                if (this.aH > 35) {
                    this.aH = 35;
                }
            }

            if (hso_ft.b(hso_ft.Y - aI / 2, 0, aI, 35)) {
                hso_fm var1;
                if ((var1 = hso_ff.a(this.aJ.e, (byte) this.aJ.b)) != null) {
                    hso_ff.a(false, var1);
                }

                if (this.aG > 40) {
                    this.aG = 40;
                }

                hso_ft.S = false;
            }

            if (hso_ft.al[11]) {
                hso_ft.d(11);
                int var2;
                if ((var2 = hso_ff.b(this.aJ.e, (byte) this.aJ.b)) >= 0) {
                    hso_ft.h.b = var2;
                }

                hso_ft.h.g();
                hso_ft.h.a(hso_ft.a);
                return;
            }
        } else if (this.aH > 0) {
            this.aH -= 20;
        }

    }

    public final void e(mGraphics var1) {
        if (this.aJ != null || this.aH > 0) {
            hso_ft.a(var1);
            int var2 = hso_ft.Y - aI / 2;
            byte var3 = 2;
            if (hso_ft.ai % 16 > 7) {
                var3 = 12;
            }

            hso_cg.b(var1, var2, -5, aI, this.aH + 5, var3);
            if (this.aJ != null) {
                x.b(this.aJ.b << 1, var2 + 20, -35 + this.aH + 17 + 3, 0, 3, var1);
                hso_o.f.a(var1, this.aJ.e, var2 + 35, -35 + this.aH + 5, 0, false);
                hso_o.j.a(var1, this.aJ.f, var2 + 42, -35 + this.aH + 18, 0, false);
            }
        }

    }

    public final void f(mGraphics var1) {
        if (hso_ft.A) {
            int var2;
            int var4;
            int var5;
            boolean var6;
            for (var2 = 0; var2 < B.length; ++var2) {
                if (var2 != 3 || !I) {
                    byte var3 = 0;
                    if (ar > 0 && as == var2 + 100) {
                        var3 = 1;
                    }

                    if (GameScreen.f.cF != 4) {
                        var4 = B[var2][0];
                        var5 = B[var2][1];
                        if (var2 == 0) {
                            var5 = var5;
                        } else if (var2 == 1) {
                            var4 = var4;
                        } else if (var2 == 4) {
                            var5 = var5;
                        } else {
                            var4 = var4;
                        }

                        var6 = true;
                        if (var2 == 0 && GameScreen.f.by > 10) {
                            var6 = false;
                        }

                        if (var6) {
                            if (var2 != 1) {
                                var1.a(k[var2], 0, var3 * aq[var2][1], aq[var2][0], aq[var2][1], 0, var4, var5, 0);
                            } else {
                                var1.a(k[var2], 0, 0, aq[var2][0], aq[var2][1], 0, var4, var5, 0);
                                if (this.aK != -1L && hso_dw.a() - this.aK >= 100L) {
                                    if (hso_ft.ai % 2 == 0) {
                                        ++this.aL;
                                    }

                                    if (this.aL >= aq[var2][1]) {
                                        this.aL = aq[var2][1];
                                    }
                                }

                                var1.d(var4, var5, aq[var2][0], this.aL);
                                var1.a(k[var2], 0, aq[var2][1], aq[var2][0], aq[var2][1], 0, var4, var5, 0);
                                hso_ft.a(var1);
                            }
                        }
                    }
                }
            }

            if (GameScreen.f.cF != 4) {
                if (I) {
                    this.a(var1);
                } else {
                    var1.a(aj[0], e, f, 3);

                    for (var2 = 0; var2 < 4; ++var2) {
                        if (ar > 0 && this.am[var2] == as) {
                            var1.a(aj[2], 0, 0, 32, 56, this.al[var2] + (var2 > 1 ? 4 : 0), ap[var2][0], ap[var2][1], 3);
                        }
                    }

                    byte var10 = 0;
                    if (ar > 0 && as == 5) {
                        var10 = 1;
                    }

                    var1.a(hso_cg.ap, D, E, 3);
                    if (C == 0) {
                        int var21;
                        if (GameScreen.h != null && GameScreen.h.cx == 2) {
                            for (int var14 = 0; var14 < 5; ++var14) {
                                byte var19 = 0;
                                if (ar > 0 && as == z[var14]) {
                                    var19 = 1;
                                }

                                boolean var23 = false;
                                var6 = false;
                                if (var14 == 2) {
                                    var5 = D;
                                    var21 = E;
                                } else {
                                    var5 = ao[var14 - (var14 > 2 ? 1 : 0)][0];
                                    var21 = ao[var14 - (var14 > 2 ? 1 : 0)][1];
                                }

                                var1.a(ak[1], 0, var19, 50, 50, 0, var5, var21, 3);
                                var1.a(hso_cg.ap, var5, var21, 3);
                                hso_cg.a(var1, String.valueOf(z[var14]), var5, var21 - 5, 2);
                            }

                            return;
                        }

                        hso_ao var11 = Player.w[Player.d][2];
                        if (GameScreen.f.y()) {
                            var1.a(hso_cg.at, D, E, 3);
                        } else if (var11 != null && var11.b == 0) {
                            hso_ev var15;
                            if ((var15 = hso_ct.c(var11.a)) != null) {
                                var15.a(var1, D, E, 3);
                            }
                        } else {
                            hso_bw var13;
                            if (var11 != null && var11.b == hso_ao.f && (var13 = hso_bw.a(4, (short) var11.a)) != null) {
                                var13.a(var1, D, E, hso_fl.aM, 0, 3);
                            }
                        }

                        for (var4 = 0; var4 < ao.length; ++var4) {
                            byte var16 = 0;
                            if (ar > 0 && as == an[var4]) {
                                var16 = 1;
                            }

                            var1.a(ak[1], 0, var16 * 50, 50, 50, 0, ao[var4][0], ao[var4][1], 3);
                            var1.a(hso_cg.ap, ao[var4][0], ao[var4][1], 3);
                            if ((var11 = Player.w[Player.d][var4 + (var4 > 1 ? 1 : 0)]) != null && var11.b == 0) {
                                hso_ev var18;
                                if ((var18 = hso_ct.c(var11.a)) != null) {
                                    var18.a(var1, ao[var4][0], ao[var4][1], 3);
                                }
                            } else if (var11 != null && var11.b == hso_ao.f && hso_fo.d) {
                                hso_bw var17;
                                if ((var17 = hso_bw.a(4, (short) var11.a)) != null) {
                                    if (hso_fo.d) {
                                        var17.a(var1, ao[var4][0], ao[var4][1], hso_fl.aM, 0, 3);
                                    }
                                } else {
                                    var11.a(0, hso_ao.d, (byte) 0);
                                    hso_j.a((byte) 1, false);
                                    hso_j.a((byte) 0, false);
                                }
                            }
                        }

                        for (var4 = 0; var4 < 5; ++var4) {
                            hso_ao var20;
                            if ((var20 = Player.w[Player.d][var4]) != null && var20.b != hso_ao.d) {
                                var6 = false;
                                boolean var8 = false;
                                int var9;
                                if (var4 == 2) {
                                    var21 = D;
                                    var9 = E;
                                } else {
                                    var21 = ao[var4 - (var4 > 2 ? 1 : 0)][0];
                                    var9 = ao[var4 - (var4 > 2 ? 1 : 0)][1];
                                }

                                hso_ad var12 = null;
                                if (var20 != null && var20.b == 0) {
                                    var12 = Player.r[var20.a];
                                } else {
                                    hso_bw var22;
                                    if (var20 != null && var20.b == hso_ao.f && hso_fo.d && (var22 = hso_bw.a(4, (short) var20.a)) != null && var22.L < 2) {
                                        var12 = Player.s[var22.L];
                                    }
                                }

                                if (var12 != null && var12.c > 0) {
                                    if (var12.b > 0) {
                                        if ((var5 = var12.b * 20 / var12.c) < 1) {
                                            var5 = 1;
                                        }

                                        var1.a(hso_cg.am, 0, 0, 20, var5, 0, var21 - 10, var9 - 10, 0);
                                        var5 = var12.b / 1000;
                                        String var7 = null;
                                        if (var5 == 0) {
                                            var7 = "0." + var12.b % 1000 / 100;
                                        } else {
                                            var7 = "" + var5;
                                        }

                                        hso_o.f.a(var1, var7, var21, var9 - 5, 2, false);
                                    } else if (var12.b > -150) {
                                        var1.a(-1118516);
                                        var1.a(var21 - 10, var9 - 10, 20, 20, 4, 4);
                                    }
                                }
                            }
                        }
                    } else {
                        m(var1);
                    }

                    var1.a(ak[0], 0, var10 * 50, 50, 50, 0, D, E, 3);
                }
            }
        }
    }

    public final void f() {
        if (ar > 0) {
            --ar;
        }

        if (C > 0 && ++C > 6) {
            C = 0;
            if (++Player.d > 2) {
                Player.d = 0;
            }
        }

        if (hso_cs.i != hso_cs.j) {
            boolean var1 = true;
            int var2;
            int var4;
            if (hso_ft.S) {
                if (I) {
                    if (hso_ft.c(aC + 11 - ay / 2, aD + 11 - ay / 2, 5 * ay, ay)) {
                        var2 = (hso_ft.ae - aC + 11) / ay;
                        hso_ft.S = false;
                        if (var2 >= 0 && var2 < Player.w[Player.d].length) {
                            hso_ao var3 = Player.w[Player.d][var2];
                            if (I) {
                                if (var3.b == 0) {
                                    if (GameScreen.h != null) {
                                        GameScreen.f.a(var2, false);
                                    }
                                } else {
                                    if (var2 == 2) {
                                        as = 5;
                                    } else {
                                        as = an[var2 > 1 ? var2 - 1 : var2];
                                    }

                                    hso_ft.ak[20 + as] = true;
                                }
                            }

                            ar = 3;
                            var1 = false;
                        }
                    }
                } else if (hso_ft.c(D - az / 2, E - az / 2, az, az)) {
                    hso_ft.S = false;
                    as = 5;
                    ar = 3;
                    hso_ft.ak[25] = true;
                    hso_ft.ak[5] = true;
                    var1 = false;
                } else {
                    for (var2 = 0; var2 < ao.length; ++var2) {
                        if (hso_ft.c(ao[var2][0] - ay / 2, ao[var2][1] - ay / 2, ay, ay)) {
                            hso_ft.S = false;
                            as = an[var2];
                            hso_ft.ak[20 + as] = true;
                            ar = 3;
                            var1 = false;
                            break;
                        }
                    }
                }

                if (hso_ft.S) {
                    for (var2 = 0; var2 < B.length; ++var2) {
                        if ((var2 != 3 || !I) && hso_ft.c(B[var2][0] - 2, B[var2][1] - 2, aq[var2][0] + 4, aq[var2][1] + 4)) {
                            hso_ft.S = false;
                            if (var2 == 1 && this.aK == -1L) {
                                this.aK = hso_dw.a();
                            }

                            this.f(var2);
                            var1 = false;
                            break;
                        }
                    }

                    hso_fl.g();
                    if (hso_ft.c(0, hso_fl.g().P, 90, 35)) {
                        hso_ft.S = false;
                        this.f(0);
                        return;
                    }

                    if (hso_ft.c(g - 4, h - 4, 24, 20)) {
                        hso_ft.S = false;
                        this.f(-1);
                    }

                    if (hso_ft.c(hso_ft.W - 50, hso_ft.q.b * hso_ex.c - 8, 50, 30)) {
                        hso_ft.S = false;
                        this.f(-2);
                    } else if (hso_ft.c(hso_ft.W - hso_ft.q.a * hso_ex.c, 0, hso_ft.q.a * hso_ex.c, hso_ft.q.b * hso_ex.c) && !GameScreen.aO) {
                        hso_ft.S = false;
                        this.f(-4);
                    }

                    if (hso_ft.c(95, 0, 24, 40)) {
                        hso_ft.S = false;
                        this.f(-3);
                    }

                    for (var2 = 0; var2 < hso_cs.a.c(); ++var2) {
                        hso_en var16;
                        var4 = (var16 = (hso_en) hso_cs.a.a(var2)).a - hso_p.d.a;
                        int var5 = var16.b - hso_p.d.b;
                        if (hso_ft.c(var4 - 12, var5 - 12, 24, 24)) {
                            GameScreen.f.bf = GameScreen.f.aY;
                            GameScreen.f.bg = GameScreen.f.aZ;
                            this.aM = hso_ft.c.a(var16.a / hso_cs.l, var16.b / hso_cs.l, GameScreen.f.aY / hso_cs.l, GameScreen.f.aZ / hso_cs.l, (int) 16);
                            if (this.aM != null && this.aM.length > 16) {
                                this.aM = null;
                            }

                            GameScreen.f.cN = this.aM;
                            Player.O = var16.a;
                            Player.P = var16.b;
                            Player.Q = 9;
                            hso_ft.S = false;
                            if (Player.o == 1) {
                                Player.o_();
                            }
                            break;
                        }
                    }
                }
            } else if (!I) {
                if (hso_ft.Q || hso_ft.T) {
                    for (var2 = 0; var2 < B.length; ++var2) {
                        if (hso_ft.c(B[var2][0] - 4, B[var2][1] - 4, aq[var2][0] + 8, aq[var2][1] + 8)) {
                            if (var2 == 1 && this.aK == -1L) {
                                this.aK = hso_dw.a();
                            }

                            as = var2 + 100;
                            ar = 3;
                            break;
                        }
                    }

                    if (hso_ft.d(e - 2 * j, f - 2 * j, j << 2, j << 2)) {
                        var2 = hso_ak.a(hso_ft.ae - e, hso_ft.af - f);
                        boolean var17 = false;
                        byte var18;
                        if (var2 > 45 && var2 <= 135) {
                            var18 = 3;
                        } else if (var2 > 135 && var2 <= 225) {
                            var18 = 0;
                        } else if (var2 > 225 && var2 <= 315) {
                            var18 = 2;
                        } else {
                            var18 = 1;
                        }

                        hso_ft.m();
                        hso_ft.Q = true;
                        hso_ft.S = false;
                        as = this.am[var18];
                        hso_ft.al[as] = true;
                        ar = 3;
                        var1 = false;
                        if (Player.o == 1) {
                            Player.o_();
                        }
                    }
                }
            } else if (I && (hso_ft.Q || hso_ft.T)) {
                for (var2 = 0; var2 < B.length; ++var2) {
                    if (hso_ft.c(B[var2][0] - 4, B[var2][1] - 4, aq[var2][0] + 8, aq[var2][1] + 8)) {
                        if (var2 == 1 && this.aK == -1L) {
                            this.aK = hso_dw.a();
                        }

                        as = var2 + 100;
                        ar = 3;
                        break;
                    }
                }
            }

            if (var1) {
                label432:
                {
                    if (hso_ft.S) {
                        label553:
                        {
                            if (!I && (hso_ft.c(D - aB - 25, E - aB - 25, (aB << 1) + 50, (aB << 1) + 50) || hso_ft.c(e - j - 30, f - j - 30, (j << 1) + 60, (j << 1) + 60)) && GameScreen.f.cF != 4) {
                                hso_ft.S = false;
                                hso_ft.Q = false;
                                break label432;
                            }

                            int var15 = hso_ft.ae + hso_p.d.a;
                            var2 = hso_ft.af + hso_p.d.b;
                            MainObject var20 = null;
                            int var21;
                            if ((GameScreen.h == null || GameScreen.h.cx != 2) && (MainObject.c(var15, var2, GameScreen.f.aY, GameScreen.f.aZ) <= GameScreen.f.bh - 15 || GameScreen.f.cF == 4)) {
                                var4 = var2;
                                var21 = var15;
                                MainObject var19 = null;
                                MainObject var6 = null;
                                int var7 = 40;
                                boolean var8 = false;
                                int var9 = 0;

                                while (true) {
                                    if (var9 >= GameScreen.i.c()) {
                                        if (var8 && var19 == null) {
                                            aP.d();
                                            var19 = var6;
                                        }

                                        if (var19 != null) {
                                            aP.a(var19);
                                        } else {
                                            aP.d();
                                        }
                                        break;
                                    }

                                    label525:
                                    {
                                        MainObject var10 = (MainObject) GameScreen.i.a(var9);
                                        if (GameScreen.q.c(hso_ft.p.d)) {
                                            if ((var10.cv == GameScreen.f.cv || var10 == null || var10 == GameScreen.f || var10.cu == 9 || var10.x() || var10.cu == 10 || var10.bI) && var10.cu != 2) {
                                                break label525;
                                            }
                                        } else if (var10 == null || var10 == GameScreen.f || var10.cu == 9 || var10.bI || var10.cu == 10 || var10.x()) {
                                            break label525;
                                        }

                                        int var11;
                                        if ((var10.cF != 4 || var10.cu != 1) && ((var11 = MainObject.c(var21, var4, var10.aY, var10.aZ - var10.be / 4)) < var7 || hso_cs.a() && var10.cu == 2 && var11 < 40 && Player.V)) {
                                            if (!var8) {
                                                var8 = true;
                                                var6 = var10;
                                            }

                                            boolean var12 = true;

                                            for (int var13 = 0; var13 < aP.c(); ++var13) {
                                                MainObject var14;
                                                if ((var14 = (MainObject) aP.a(var13)) != null && var10.ct == var14.ct) {
                                                    var12 = false;
                                                    break;
                                                }
                                            }

                                            if (var12) {
                                                var19 = var10;
                                                var7 = var11;
                                            }

                                            if (var10.cu == 2 && Player.V) {
                                                aP.a(var19);
                                                Player.V = false;
                                                Player.W = 0;
                                                break;
                                            }
                                        }
                                    }

                                    ++var9;
                                }

                                var20 = var19;
                                if (var19 != null && var19.cu != 1 && Player.o == 1) {
                                    Player.o_();
                                }
                            }

                            if (this.aO && hso_ft.A) {
                                if (var20 != null) {
                                    if (!var20.b() || e(hso_ft.p.d) && !var20.e_() && var20.cu == 0) {
                                        break label432;
                                    }

                                    var20.dl = 5;
                                    GameScreen.h = var20;
                                    hso_ft.S = false;
                                    if (MainObject.c(var20.aY, var20.aZ, GameScreen.f.aY, GameScreen.f.aZ) <= GameScreen.f.bh) {
                                        GameScreen.f.m_();
                                        K = true;
                                        GameScreen.a(68, GameScreen.f.ct, (byte) 0, GameScreen.h.ct, GameScreen.h.cu, 0, GameScreen.h.br, (byte) (GameScreen.h.cu == 1 ? 0 : 1));
                                        this.aM = null;
                                    }

                                    if (hso_ft.S) {
                                        if ((var21 = hso_ft.p.a(var15, var2)) != -1 && var21 != 1) {
                                            GameScreen.f.bf = GameScreen.f.aY;
                                            GameScreen.f.bg = GameScreen.f.aZ;
                                            this.aM = hso_ft.c.a(var15 / hso_cs.l, var2 / hso_cs.l, GameScreen.f.aY / hso_cs.l, GameScreen.f.aZ / hso_cs.l, (int) 100);
                                            if (this.aM != null && this.aM.length > 100) {
                                                this.aM = null;
                                            }

                                            this.aN = 3;
                                            hso_ft.S = false;
                                            Player.O = var15;
                                            Player.P = var2;
                                        } else {
                                            this.aM = null;
                                        }
                                    }
                                    break label553;
                                }

                                if (GameScreen.f.cF == 4) {
                                    break label432;
                                }

                                if ((var21 = hso_ft.p.a(var15, var2)) != -1 && var21 != 1) {
                                    GameScreen.f.bf = GameScreen.f.aY;
                                    GameScreen.f.bg = GameScreen.f.aZ;
                                    this.aM = hso_ft.c.a(var15 / hso_cs.l, var2 / hso_cs.l, GameScreen.f.aY / hso_cs.l, GameScreen.f.aZ / hso_cs.l, (int) 100);
                                    if (this.aM != null && this.aM.length > 100) {
                                        this.aM = null;
                                    }

                                    if (GameScreen.f.cN != null) {
                                        this.aN = 1;
                                    } else {
                                        this.aN = 3;
                                    }

                                    hso_ft.S = false;
                                    Player.O = var15;
                                    Player.P = var2;
                                    break label553;
                                }

                                this.aM = null;
                            } else {
                                if (I || var20 == null || var20.cu == 9 || var20.cu == 10 || var20.x() || var20.bI) {
                                    break label553;
                                }

                                aP.d();
                                if (GameScreen.h == var20) {
                                    if (Player.w[Player.d][2].b == 0) {
                                        hso_ft.ak[25] = true;
                                        hso_ft.ak[5] = true;
                                    }

                                    this.aN = 0;
                                    this.aM = null;
                                } else {
                                    if (!var20.b()) {
                                        break label432;
                                    }

                                    var20.dl = 5;
                                    GameScreen.h = var20;
                                }
                            }

                            hso_ft.S = false;
                        }
                    }

                    if (I && this.aN > 0) {
                        if (this.aN == 1 && this.aM != null && GameScreen.f.cF != 4 && GameScreen.f.cF != 2 && GameScreen.f.M == null) {
                            GameScreen.f.cl = 0;
                            GameScreen.f.cm = 0;
                            if (GameScreen.f.cN != null) {
                                GameScreen.f.cI = 1;
                            }

                            GameScreen.f.u();
                            GameScreen.f.cN = this.aM;
                            this.aM = null;
                            Player.Q = 9;
                            if (Player.h <= 0 && Player.o == 1) {
                                Player.o_();
                            }
                        }

                        --this.aN;
                    }
                }
            }

            if (I && hso_ft.a == hso_ft.c) {
                if (hso_ft.T) {
                    if (!GameScreen.L && (hso_ak.e(hso_ft.ae - hso_ft.ag) > 36 || hso_ak.e(hso_ft.af - hso_ft.ah) > 36)) {
                        GameScreen.L = true;
                    }

                    GameScreen.N = hso_ft.ae - hso_ft.ag;
                    GameScreen.O = hso_ft.af - hso_ft.ah;
                    GameScreen.R = 40;
                    return;
                }

                if (hso_ft.Q) {
                    GameScreen.P = hso_p.d.a;
                    GameScreen.Q = hso_p.d.b;
                    GameScreen.N = 0;
                    GameScreen.O = 0;
                }
            }

        }
    }

    private static void m(mGraphics var0) {
        int var1 = aA;
        if (C > 0) {
            var1 -= C * 30;
        }

        for (int var2 = 0; var2 < 8; ++var2) {
            int var3 = D + hso_ak.b(hso_ak.d(var1)) * aB / 1000;
            int var4 = E + hso_ak.a(hso_ak.d(var1)) * aB / 1000;
            var0.a(hso_cg.ap, var3, var4, 3);
            int var5 = Player.d;
            if (var2 > 3) {
                if (Player.d == 0) {
                    var5 = 1;
                } else {
                    var5 = 0;
                }
            }

            hso_ao var6;
            if ((var6 = Player.w[var5][var2 % 4 + (var2 % 4 > 1 ? 1 : 0)]) != null && var6.b == 0) {
                hso_ct.c(var6.a).a(var0, var3, var4, 3);
            } else {
                hso_bw var7;
                if (var6 != null && var6.b == hso_ao.f && (var7 = hso_bw.a(4, (short) var6.a)) != null) {
                    var7.a(var0, var3, var4, hso_fl.aM, 0, 3);
                }
            }

            var1 -= 45;
        }

    }

    private void f(int var1) {
        switch (var1) {
            case -4:
                if (!j()) {
                    hso_az.b().c();
                    return;
                }
                break;
            case -3:
                if (Player.t > 0) {
                    hso_ft.u.a(hso_ft.a);
                    hso_ft.u.a = 2;
                    return;
                }

                if (Player.u > 0) {
                    hso_ft.u.a(hso_ft.a);
                    hso_ft.u.a = 3;
                    return;
                }
                break;
            case -2:
                return;
            case -1:
                if (i > 0) {
                    hso_ft.h.g();
                    hso_ft.h.a(hso_ft.a);
                    return;
                }
                break;
            case 0:
                if (GameScreen.L) {
                    GameScreen.L = false;
                    return;
                }

                GameScreen.b().r.a();
                return;
            case 1:
                if (hso_dw.a() - this.aK <= 500L) {
                    hso_d.b("private void f(int var1)").c();
                    this.aK = -1L;
                    this.aL = 0;
                    return;
                }

                GameScreen.b().G.a();
                this.aK = -1L;
                this.aL = 0;
                return;
            case 2:
                if ((GameScreen.h == null || GameScreen.h.cx != 2) && C == 0) {
                    C = 1;
                    return;
                }
                break;
            case 3:
                if (GameScreen.h != null) {
                    Player.a.a();
                    return;
                }
                break;
            case 4:
                if (!hso_d.b) {
                    hso_ft.o.b();
                    return;
                }
                break;
            case 5:
                GameScreen.b().G.a();
        }

    }

    public static void g(mGraphics var0) {
        if (at > 0) {
            --at;
            hso_cg.a(var0, hso_ft.Y - au / 2 - 10, aw, au + 20, 35, (int) 12);
            hso_o.f.a(var0, ax, hso_ft.Y, aw + 7, 2, false);
            hso_o.j.a(var0, "- " + hso_df.cC + hso_cs.b() + " -", hso_ft.Y, aw + 20, 2, false);
        }

    }

    public static void a(mGraphics var0, String var1) {
        if (at > 0) {
            --at;
            hso_cg.a(var0, hso_ft.Y - au / 2 - 10, aw, au + 20, 20, (int) 12);
            hso_o.f.a(var0, var1, hso_ft.Y, aw + 4, 2, false);
        }

    }

    public static void a(String var0) {
        at = 80;
        au = hso_o.f.a(var0);
        aw = hso_ft.X / 8;
        av = 0;
        if (au < 80) {
            au = 80;
        }

    }

    public static void g() {
        at = 80;
        ax = "map";
        if (hso_ck.a != null && hso_ft.p.d < hso_ck.a.length) {
            ax = hso_ck.a[hso_ft.p.d];
        }

        au = hso_o.f.a(ax);
        aw = hso_ft.X / 8;
        av = 0;
        if (au < 80) {
            au = 80;
        }

    }

    public static void h() {
        if (I) {
            B[2][1] = hso_ft.X - 31;
            B[4][0] = 0;
        } else {
            B[2][1] = hso_ft.X - 145;
            B[4][0] = hso_ft.Y - 20;
        }
    }

    private static boolean g(int var0) {
        return var0 == 59 || var0 == 57 || var0 == 55 || var0 == 53;
    }

    public static boolean b(int var0) {
        return var0 == 61 || var0 == 60 || var0 == 58 || var0 == 56 || var0 == 54;
    }

    public final boolean c(int var1) {
        return b(var1) || g(var1);
    }

    public static boolean i() {
        return GameScreen.aO;
    }

    public static boolean j() {
        return hso_ft.p.d == 83 || hso_ft.p.d == 84 || hso_ft.p.d == 85 || hso_ft.p.d == 86 || hso_ft.p.d == 87;
    }

    public static boolean d(int var0) {
        return var0 == 60 || var0 == 58 || var0 == 56 || var0 == 54;
    }

    public final void a(int var1, long var2, int var4) {
        if (g(var1)) {
            aS = true;
            aR = (int) (var2 / 1000L + (long) 30);
        } else {
            aS = false;
            aQ = 0;
        }
    }

    public static void k() {
        if (aS) {
            if (aQ >= 0) {
                aQ = (int) ((long) aR - hso_dw.a() / 1000L);
                return;
            }

            aS = false;
            aQ = 0;
        }

    }

    public static void h(mGraphics var0) {
        if (aS && aQ >= 0) {
            hso_cg.a(var0, hso_df.ge + aQ + "s", 70 - hso_ft.W, B[0][1] + 15, 0);
        }

    }

    public final void a(byte var1, byte var2, short var3) {
        if (var1 != -1) {
            boolean var4 = false;
            byte var5;
            if (var1 == 4) {
                var5 = 1;
            } else if (var1 == 5) {
                var5 = 2;
            } else if (var1 == 2) {
                var5 = 3;
            } else {
                var5 = 0;
            }

            if (var2 != -1) {
                this.aT[var5] = var2;
            }

            if (var3 != -1) {
                this.aU[var5] = var3;
            }

        }
    }

    public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
        hso_cg.a(var1, hso_df.gf, 5, 0, 0);
        T.b(this.aW[4], 10, 20, 0, 3, var1);
        hso_cg.a(var1, "" + GameScreen.f.dH, 30, 17, 0);

        for (var2 = 0; var2 < this.aT.length; ++var2) {
            if (this.aT[var2] > 0) {
                hso_cg.aE.b(this.aV[var2] * 3 + hso_ft.ai / 3 % 3, 10, 40 + var2 * 20 + 2, 0, 3, var1);
            } else {
                hso_cg.aE.b(this.aV[4] * 3 + hso_ft.ai / 3 % 3, 10, 40 + var2 * 20, 0, 3, var1);
            }

            T.b(this.aW[var2], 30, 40 + var2 * 20 - 2, 0, 3, var1);
            hso_cg.a(var1, "" + this.aT[var2], 40, 40 + var2 * 20 - 3, 0);
            var1.a(hso_fl.aP[3], 0, 32, 16, 16, 0, 70, 40 + var2 * 20, 3);
            hso_cg.a(var1, "" + this.aU[var2], 80, 40 + var2 * 20 - 3, 0);
        }

    }

    public final void l() {
        this.V = null;
        this.U = false;
    }

    public final void i(mGraphics var1) {
        try {
            hso_dq var10000;
            if (hso_ft.p.d == 19) {
                if (this.V == null) {
                    this.V = new hso_dq(50, 1080, 96, 0, 0, 1, 0);
                    return;
                }

                this.V.a();
                if (!this.U) {
                    this.V.a(var1);
                    return;
                }

                var10000 = this.V;
                var10000.h += 2;
                this.V.a(var1);
                GameScreen.f.bk = 0;
                GameScreen.f.cF = 0;
                GameScreen.f.Direction = 3;
                GameScreen.f.aY = this.V.h + 30;
                GameScreen.f.aZ = this.V.i - 40;
                GameScreen.f.J();
                GameScreen.f.c(var1, -1);
                if (this.V.h > 1200) {
                    hso_n.b().a = 1;
                    hso_n.b().c();
                    return;
                }
            } else if (hso_ft.p.d == 67) {
                if (this.V == null) {
                    this.V = new hso_dq(50, 360, 672, 0, 0, 1, 0);
                    return;
                }

                this.V.a();
                if (!this.U) {
                    this.V.a(var1);
                    return;
                }

                var10000 = this.V;
                var10000.h += 2;
                this.V.a(var1);
                GameScreen.f.bk = 0;
                GameScreen.f.cF = 0;
                GameScreen.f.Direction = 3;
                GameScreen.f.aY = this.V.h + 30;
                GameScreen.f.aZ = this.V.i - 40;
                GameScreen.f.J();
                GameScreen.f.c(var1, -1);
                if (this.V.h > 480) {
                    hso_n.b().a = 3;
                    hso_n.b().c();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean e(int var0) {
        return var0 == 82;
    }

    public final void c(mGraphics var1, int var2, int var3) {
        try {
            if (!GameScreen.aO) {
                this.aX = GameScreen.f.aY / hso_cs.l;
                this.aY = GameScreen.f.aZ / hso_cs.l;
                hso_o.k.a(var1, "FPS: " + GameCanvas.fps, var2, 0, 1, false);
//                hso_o.k.a(var1, this.aX + ":" + this.aY, var2, 0, 1, false);

//                GameCanvas fps = new GameCanvas();
//                hso_o.k.a(var1, "beo deptrai: " + fps.getFps(), var2, 0, 1, false);
//            hso_o.k.a(var1, "beo dep trai", var2, 1, 5, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void j(mGraphics var0) {
        if (W != 0) {
            hso_ft.a(var0);
            byte var1 = 110;
            if (hso_ft.a != hso_ft.c) {
                var1 = 0;
            }

            int var2 = hso_o.j.a("18+ Chơi quá 180 phút mỗi ngày sẽ hại sức khỏe.");
            var0.b(0);
            var0.c(var1, 0, var2, 12);
            hso_o.j.a(var0, "18+ Chơi quá 180 phút mỗi ngày sẽ hại sức khỏe.", var1, 0, 0, false);
        }
    }

    public final void k(mGraphics var1) {
        hso_fd var2;
        if (j() && X != -1 && (var2 = hso_bk.i((short) X)).a != null) {
            hso_cg.a(var1, Y.toUpperCase(), hso_ft.W / 2, 5, 2, (byte) 0);
            var1.a(var2.a, hso_ft.W / 2 + hso_o.i.a(Y), 10, 3);
        }

    }
}
