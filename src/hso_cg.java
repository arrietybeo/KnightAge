
public class hso_cg {

    public hso_bt Y;
    public hso_bt Z;
    public hso_bt aa;
    public static hso_aq[] ab = new hso_aq[4];
    public static int ac;
    public static hso_aq[] ad = new hso_aq[3];
    public static hso_aq ae;
    public static hso_aq af;
    public static hso_aq ag;
    public static hso_aq ah;
    public static hso_aq ai;
    public static hso_aq aj;
    public static hso_aq ak;
    public static hso_aq al;
    public static hso_aq am;
    public static hso_aq an;
    public static hso_aq ao;
    public static hso_aq ap;
    public static hso_aq aq;
    public static hso_aq ar;
    public static hso_aq as;
    public static hso_aq at;
    public static hso_aq au;
    public static hso_aq av;
    public static hso_aq aw;
    public static hso_aq ax;
    public static hso_aq ay;
    public static hso_aq az;
    public static hso_aq aA;
    public static hso_aq aB;
    public static hso_ce aC;
    public static hso_ce aD;
    public static hso_ce aE;
    public static hso_ce aF;
    public static hso_ce aG;
    public static hso_ce aH;
    public static hso_ce aI;
    public static hso_ce aJ;
    public static hso_ce aK;
    public static int[] aL = new int[]{-12052464, -477112, -6778760, -2043720, -6649744};
    private static int[] a = new int[]{-8902126, -460632, -11467264, -477112, -477112};

    public void a(mGraphics var1) {
        try {
            hso_ft.a(var1);
            if (hso_ft.r == null && !hso_ft.o.a) {
                this.c(var1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void a() {
    }

    public void e(int var1) {
    }

    public final void c(mGraphics var1) {
        if (hso_ft.C) {
            hso_ft.a(var1);
            if (this.Y != null) {
                this.Y.a(var1, hso_ft.ac, hso_ft.X - hso_bt.k / 2 - 1);
            }

            if (this.Z != null) {
                this.Z.a(var1, hso_ft.W - hso_ft.ac, hso_ft.X - hso_bt.k / 2 - 1);
            }

            if (this.aa != null) {
                this.aa.a(var1, hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 1);
            }

        } else {
            if (this.Y != null) {
                this.Y.a(var1, hso_ft.ac, hso_ft.X - hso_bt.k / 2 - 1);
            }

            if (this.Z != null) {
                this.Z.a(var1, hso_ft.W - hso_ft.ac, hso_ft.X - hso_bt.k / 2 - 1);
            }

            if (this.aa != null) {
                this.aa.a(var1, hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 1);
            }

        }
    }

    public final void d(mGraphics var1) {
        if (!hso_ft.o.a && hso_ft.r == null) {
            hso_ft.a(var1);
            if (hso_ft.C) {
                hso_cg var2;
                if ((var2 = this).Y != null) {
                    hso_o.f.a(var1, var2.Y.a, 27, hso_ft.X - hso_ft.aa / 2 + 1, 2, false);
                }

                if (var2.Z != null) {
                    hso_o.f.a(var1, var2.Z.a, hso_ft.W - 27, hso_ft.X - hso_ft.aa / 2 + 1, 2, false);
                }

                if (var2.aa != null) {
                    hso_o.f.a(var1, var2.aa.a, hso_ft.Y, hso_ft.X - hso_ft.aa / 2 + 1, 2, false);
                }

            } else {
                if (this.Y != null) {
                    a(var1, this.Y.a, 30, hso_ft.X - hso_ft.aa / 2 - 4, 2);
                }

                if (this.Z != null) {
                    a(var1, this.Z.a, hso_ft.W - 30, hso_ft.X - hso_ft.aa / 2 - 4, 2);
                }

                if (this.aa != null) {
                    a(var1, this.aa.a, hso_ft.Y, hso_ft.X - hso_ft.aa / 2 - 4, 2);
                }

            }
        }
    }

    public void b(int var1, int var2) {
    }

    public void a_(int var1, int var2) {
    }

    public void a(int var1, int var2) {
    }

    public void a(int var1, Object var2) {
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            if (var3 < 35) {
                var3 = 35;
            }

            int var6 = (var3 - 6) / 32;
            int var7 = (var4 - 6) / 32;
            if (var4 % 2 != 0) {
                ++var4;
            }

            if (hso_ft.B) {
                if (var5 > 2) {
                    if (var5 != 8 && var5 != 12) {
                        var5 = 3;
                    } else {
                        var5 = 4;
                    }
                }

                var0.a(a[0]);
                var0.c(var1, var2, var3, var4);
                var0.a(a[4]);
                var0.b(var1 + 1, var2 + 1, var3 - 3, var4 - 3);
                hso_fl.c(var0, var1 + 3, var2 + 3, var3 - 6, var4 - 6, var5);
            } else {
                int var8;
                int var9;
                if (var4 < 32) {
                    for (var8 = 0; var8 <= var6; ++var8) {
                        for (var9 = 0; var9 <= var7; ++var9) {
                            if (var8 == var6) {
                                if (var9 == var7) {
                                    var0.a(hso_fl.aP[var5], 0, 0, 32, var4, 0, var1 - 3 + var3 - 32, var2, 0);
                                } else {
                                    var0.a(hso_fl.aP[var5], 0, 0, 32, var4, 0, var1 - 3 + var3 - 32, var2 + 3 + var9 * 32, 0);
                                }
                            } else if (var9 == var7) {
                                var0.a(hso_fl.aP[var5], 0, 0, 32, var4, 0, var1 + 3 + (var8 << 5), var2, 0);
                            } else {
                                var0.a(hso_fl.aP[var5], 0, 0, 32, var4, 0, var1 + 3 + (var8 << 5), var2 + 3 + var9 * 32, 0);
                            }
                        }
                    }
                } else {
                    for (var8 = 0; var8 <= var6; ++var8) {
                        for (var9 = 0; var9 <= var7; ++var9) {
                            if (var8 == var6) {
                                if (var9 == var7) {
                                    var0.a(hso_fl.aP[var5], var1 - 3 + var3 - 32, var2 - 3 + var4 - 32, 0);
                                } else {
                                    var0.a(hso_fl.aP[var5], var1 - 3 + var3 - 32, var2 + 3 + var9 * 32, 0);
                                }
                            } else if (var9 == var7) {
                                var0.a(hso_fl.aP[var5], var1 + 3 + (var8 << 5), var2 - 3 + var4 - 32, 0);
                            } else {
                                var0.a(hso_fl.aP[var5], var1 + 3 + (var8 << 5), var2 + 3 + var9 * 32, 0);
                            }
                        }
                    }
                }

                var0.a(ai, 0, 0, 5, 5, 0, var1, var2, 0);
                var0.a(ai, 0, 5, 5, 5, 0, var1 + var3 - 5, var2, 0);
                var0.a(ai, 0, 15, 5, 5, 0, var1, var2 + var4 - 5, 0);
                var0.a(ai, 0, 10, 5, 5, 0, var1 + var3 - 5, var2 + var4 - 5, 0);
                var0.a(a[0]);
                var0.c(var1 + 3, var2, var3 - 6, 1);
                var0.c(var1, var2 + 3, 1, var4 - 6);
                var0.a(a[1]);
                var0.c(var1 + 3, var2 + 1, var3 - 6, 1);
                var0.c(var1 + 1, var2 + 3, 1, var4 - 6);
                var0.a(a[2]);
                var0.c(var1 + 3, var2 + 2, var3 - 6, 1);
                var0.c(var1 + 2, var2 + 3, 1, var4 - 6);
                var0.a(a[2]);
                var0.c(var1 + 3, var2 + var4 - 1, var3 - 6, 1);
                var0.c(var1 + var3 - 1, var2 + 3, 1, var4 - 6);
                var0.a(a[4]);
                var0.c(var1 + 3, var2 + var4 - 2, var3 - 6, 1);
                var0.c(var1 + var3 - 2, var2 + 3, 1, var4 - 6);
                var0.a(a[0]);
                var0.c(var1 + 3, var2 + var4 - 3, var3 - 6, 1);
                var0.c(var1 + var3 - 3, var2 + 3, 1, var4 - 6);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void b(mGraphics var0, int var1, int var2, int var3, int var4, int var5) {
        if (hso_ft.B) {
            a(var0, var1, var2, var3, var4, var5);
        } else {
            int var6 = (var3 - 6) / 32;
            int var7 = (var4 - 6) / 32;
            if (var4 % 2 != 0) {
                ++var4;
            }

            for (int var8 = 0; var8 <= var6; ++var8) {
                for (int var9 = 0; var9 <= var7; ++var9) {
                    if (var9 <= 1 || var9 >= var7 - 1 || var8 == 0 || var8 == var6) {
                        if (var8 == var6) {
                            if (var9 == var7) {
                                var0.a(hso_fl.aP[var5], var1 - 3 + var3 - 32, var2 - 3 + var4 - 32, 0);
                            } else {
                                var0.a(hso_fl.aP[var5], var1 - 3 + var3 - 32, var2 + 3 + var9 * 32, 0);
                            }
                        } else if (var9 == var7) {
                            var0.a(hso_fl.aP[var5], var1 + 3 + (var8 << 5), var2 - 3 + var4 - 32, 0);
                        } else {
                            var0.a(hso_fl.aP[var5], var1 + 3 + (var8 << 5), var2 + 3 + var9 * 32, 0);
                        }
                    }
                }
            }

            var0.a(ai, 0, 0, 5, 5, 0, var1, var2, 0);
            var0.a(ai, 0, 5, 5, 5, 0, var1 + var3 - 5, var2, 0);
            var0.a(ai, 0, 15, 5, 5, 0, var1, var2 + var4 - 5, 0);
            var0.a(ai, 0, 10, 5, 5, 0, var1 + var3 - 5, var2 + var4 - 5, 0);
            var0.a(a[0]);
            var0.c(var1 + 3, var2, var3 - 6, 1);
            var0.c(var1, var2 + 3, 1, var4 - 6);
            var0.a(a[1]);
            var0.c(var1 + 3, var2 + 1, var3 - 6, 1);
            var0.c(var1 + 1, var2 + 3, 1, var4 - 6);
            var0.a(a[2]);
            var0.c(var1 + 3, var2 + 2, var3 - 6, 1);
            var0.c(var1 + 2, var2 + 3, 1, var4 - 6);
            var0.a(a[2]);
            var0.c(var1 + 3, var2 + var4 - 1, var3 - 6, 1);
            var0.c(var1 + var3 - 1, var2 + 3, 1, var4 - 6);
            var0.a(a[4]);
            var0.c(var1 + 3, var2 + var4 - 2, var3 - 6, 1);
            var0.c(var1 + var3 - 2, var2 + 3, 1, var4 - 6);
            var0.a(a[0]);
            var0.c(var1 + 3, var2 + var4 - 3, var3 - 6, 1);
            var0.c(var1 + var3 - 3, var2 + 3, 1, var4 - 6);
        }
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4, boolean var5, byte var6) {
        try {
            if (hso_ft.B) {
                a(var0, var1, var2, var3, var4, (int) var6);
            } else {
                if (var4 < 32) {
                    var4 = 32;
                }

                var0.a(aL[0]);
                var0.c(var1 + ac - 2, var2 + 3, var3 - 2 * ac + 4, var4 - 5);
                var0.c(var1 + 4, var2 + ac - 2, var3 - 8, var4 - 2 * ac + 4);
                var0.a(aL[1]);
                var0.c(var1 + ac - 2, var2 + 4, var3 - 2 * ac + 4, var4 - 7);
                var0.c(var1 + 5, var2 + ac - 2, var3 - 10, var4 - 2 * ac + 4);
                var0.a(aL[0]);
                var0.c(var1 + ac - 2, var2 + 5, var3 - 2 * ac + 4, var4 - 9);
                var0.c(var1 + 6, var2 + ac - 2, var3 - 12, var4 - 2 * ac + 4);
                var0.a(aL[2]);
                var0.c(var1 + 7, var2 + 6, var3 - 14, var4 - 12);
//                
                for (int var8 = 0; var8 <= (var3 - 15) / 32; ++var8) {
                    for (int var7 = 0; var7 <= (var4 - 11) / 32; ++var7) {
                        if (var8 == (var3 - 15) / 32) {
                            if (var7 == (var4 - 11) / 32) {
//                                var+6 = (byte) hso_ak.c(0, 15);
                                var6 = (byte) hso_ak.c(8, 11);
//                                var0.a(hso_fl.aP[var6], var1 + var3 - 39, var2 + var4 - 37, 0);
                            } else {
                                var0.a(hso_fl.aP[var6], var1 + var3 - 39, var2 + 7 + (var7 << 5), 0);
                            }
                        } else if (var7 == (var4 - 11) / 32) {
                            var0.a(hso_fl.aP[var6], var1 + 8 + (var8 << 5), var2 + var4 - 37, 0);
                        } else {
                            var0.a(hso_fl.aP[var6], var1 + 8 + (var8 << 5), var2 + 7 + (var7 << 5), 0);
                        }
                    }
                }

//                var0.a(ab[0], var1, var2, 0);
//                var0.a(ab[0], 0, 0, ac, ac, 2, var1 + var3 - ac, var2, 0);
//                var0.a(ab[1], var1 + 2, var2 + var4 - ac, 0);
//                var0.a(ab[1], 0, 0, 30, 30, 2, var1 + var3 - 32, var2 + var4 - ac, 0);
//                var0.a(ab[2], var1 + var3 / 2, var2 + 2, 3);
            }
        } catch (Exception e) {
            System.out.println("var 6: " + var6);
            e.printStackTrace();
        }

    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4, byte var5) {
        if (var4 % 2 == 1) {
            ++var4;
        }

        if (hso_ft.B) {
            if (var5 > 2) {
                if (var5 != 8 && var5 != 12) {
                    var5 = 3;
                } else {
                    var5 = 4;
                }
            }

            hso_fl.c(var0, var1, var2, var3, var4, var5);
        } else {
            for (int var6 = 0; var6 <= var3 / 32; ++var6) {
                for (int var7 = 0; var7 <= var4 / 32; ++var7) {
                    if (var6 == var3 / 32) {
                        if (var7 == var4 / 32) {
                            var0.a(hso_fl.aP[var5], var1 + var3 - 32, var2 + var4 - 32, 0);
                        } else {
                            var0.a(hso_fl.aP[var5], var1 + var3 - 32, var2 + (var7 << 5), 0);
                        }
                    } else if (var7 == var4 / 32) {
                        var0.a(hso_fl.aP[var5], var1 + (var6 << 5), var2 + var4 - 32, 0);
                    } else {
                        var0.a(hso_fl.aP[var5], var1 + (var6 << 5), var2 + (var7 << 5), 0);
                    }
                }
            }

        }
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4, boolean var5) {
        var0.a(-4155296);
        if (var5) {
            var0.a(-132648);
        }

        var0.a(ae, 0, var5 ? 30 : 0, 4, 15, 0, var1, var2, 0);
        var0.a(ae, 0, (var5 ? 30 : 0) + 15, 4, 15, 0, var1 + var3 - 4, var2 + var4 - 15, 0);
        var0.a(ae, 0, (var5 ? 30 : 0) + 11, 4, 4, 0, var1, var2 + var4 - 4, 0);
        var0.a(ae, 0, (var5 ? 30 : 0) + 15, 4, 4, 0, var1 + var3 - 4, var2, 0);
        var0.c(var1 + 4, var2, var3 - 8, var4);
        var0.c(var1, var2 + 4, var3, var4 - 8);
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4) {
        var0.a(-6517641);
        var0.c(var1, var2, var3, var4);
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4, String var5) {
        b(var0, var1 - 6, var2 - 6, var3 + 12, var4 + 12, 0);
        a(var0, var1, var2 + hso_ft.aa, var3, var4 - hso_ft.aa, (byte) 2);
        hso_fl.a(var0, var1 + var3 / 2, var2 + hso_ft.aa / 4, var3, var5, 7);
    }

    public static int a(int var0, int var1, boolean var2) {
        if (var0 < 0) {
            if (!var2) {
                var0 = 0;
                return var0;
            }
        } else {
            if (var0 <= var1) {
                return var0;
            }

            if (var2) {
                var0 = 0;
                return var0;
            }
        }

        var0 = var1;
        return var0;
    }

    public void d() {
        if (hso_ft.al[5]) {
            if (this.aa != null) {
                hso_ft.c(5);
                hso_ft.d(5);
                this.aa.a();
                return;
            }
        } else if (hso_ft.al[12]) {
            if (this.Y != null) {
                hso_ft.c(12);
                hso_ft.d(12);
                this.Y.a();
                return;
            }
        } else if (hso_ft.al[13] && this.Z != null) {
            hso_ft.c(13);
            hso_ft.d(13);
            this.Z.a();
        }

    }

    public void e() {
        if (hso_ft.A) {
            if (this.Y != null) {
                if (this.Y.c()) {
                    this.Y.b();
                } else if (hso_ft.b(0, hso_ft.X - hso_ft.aa - 5, hso_ft.ac << 1, hso_ft.aa + 10)) {
                    this.Y.a();
                }
            }

            if (this.Z != null) {
                if (this.Z.c()) {
                    this.Z.b();
                } else if (hso_ft.b(hso_ft.W - (hso_ft.ac << 1), hso_ft.X - hso_ft.aa - 5, hso_ft.ac << 1, hso_ft.aa + 10)) {
                    this.Z.a();
                }
            }

            if (this.aa != null) {
                if (this.aa.c()) {
                    this.aa.b();
                    return;
                }

                if (hso_ft.b(hso_ft.Y - hso_ft.ac, hso_ft.X - hso_ft.aa - 5, hso_ft.ac << 1, hso_ft.aa + 10)) {
                    this.aa.a();
                }
            }
        }

    }

    public static void a(mGraphics var0, String var1, int var2, int var3, int var4) {
        hso_o.c.a(var0, var1, var2 + 1, var3 + 1, var4, true);
        hso_o.f.a(var0, var1, var2, var3, var4, true);
    }

    public static void a(mGraphics var0, String var1, int var2, int var3, int var4, byte var5) {
        hso_o.c.a(var0, var1, var2 + 1, var3 + 1, var4, true);
        hso_fl.b(var5).a(var0, var1, var2, var3, var4, true);
    }

    public static void a(mGraphics var0, String var1, int var2, int var3, int var4, byte var5, byte var6) {
        hso_fl.b(7).a(var0, var1, var2 + 1, var3 + 1, var4, true);
        hso_fl.b(var6).a(var0, var1, var2, var3, var4, true);
    }

    public static void a(mGraphics var0, String var1, int var2, int var3, int var4, int var5) {
        if (var5 == 2) {
            hso_o.c.a(var0, var1, var2 + 1, var3 + 1, var4, true);
        } else {
            hso_o.c.a(var0, var1, var2 - 1, var3 - 1, var4, true);
            hso_o.c.a(var0, var1, var2 - 1, var3 + 1, var4, true);
            hso_o.c.a(var0, var1, var2 + 1, var3 - 1, var4, true);
            hso_o.c.a(var0, var1, var2 + 1, var3 + 1, var4, true);
            hso_o.c.a(var0, var1, var2 - 1, var3, var4, true);
            hso_o.c.a(var0, var1, var2 + 1, var3, var4, true);
            hso_o.c.a(var0, var1, var2, var3 - 1, var4, true);
            hso_o.c.a(var0, var1, var2, var3 + 1, var4, true);
        }

        hso_fl.b(var5).a(var0, var1, var2, var3, var4, false);
    }
}
