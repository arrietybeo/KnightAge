
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

public final class hso_fe {

    public static hso_ek a = new hso_ek();
    private byte c;
    private short d;
    public long b = 0L;
    private long e = 0L;
    private int[][] f;
    private int[][] g;
    private int[][] h;
    private int[][] i;
    private int[][] j;
    private int[][] k;
    private hso_aq l = null;
    private static byte[][] m = new byte[][]{{0, 0, 1, 2, 3, 4}, {0, 0, 1, 2, 3, 4}, new byte[6], new byte[6], new byte[6], new byte[6], {0, 1, 0, 1, 0, 1}};

    private void a(byte var1, short var2) {
        DataInputStream var4;
        int var10;
        if (hso_dw.i && this.e == 0L) {
            this.e = hso_ft.aj;
            hso_aq var3 = null;

            try {
                var3 = hso_aq.a("/c/" + hso_dp.a[var1] + "/b" + var2 + "_" + hso_dp.a[var1] + ".png");
            } catch (Exception var7) {
                var3 = null;
            }

            if (var3 != null && var3.a != null) {
                var4 = null;

                try {
                    var4 = hso_aq.b("/c/" + hso_dp.a[var1] + "/b" + var2 + "_" + hso_dp.a[var1] + "_data");
                } catch (Exception var6) {
                }

                if (var4 != null) {
                    this.l = var3;
                    hso_dp.a();

                    try {
                        int var13;
                        for (var13 = 0; var13 < 3; ++var13) {
                            for (var10 = 0; var10 < this.f[var13].length; ++var10) {
                                this.f[var13][var10] = var4.read();
                                this.g[var13][var10] = var4.read();
                                this.h[var13][var10] = var4.read();
                                this.i[var13][var10] = var4.read();
                            }
                        }

                        for (var13 = 0; var13 < 4; ++var13) {
                            for (var10 = 0; var10 < 6; ++var10) {
                                this.j[var13][var10] = hso_ak.a((InputStream) var4);
                                this.k[var13][var10] = hso_ak.a((InputStream) var4);
                            }
                        }

                        return;
                    } catch (Exception var8) {
                        hso_dw.a("loi ham char par" + var8.toString());
                        var8.printStackTrace();
                        return;
                    }
                }
            }
        }

        hso_cw var12;
        if ((var12 = (hso_cw) a.a(var1 + "_" + var2)) == null) {
            this.b = hso_ft.aj;
            var12 = new hso_cw();
            a.a(var1 + "_" + var2, var12);
            this.b(var1, var2);
        } else if (var12.a != null) {
            this.l = var12.a;
            ByteArrayInputStream var5 = new ByteArrayInputStream(var12.c);
            var4 = new DataInputStream(var5);
            hso_dp.a();

            try {
                int var11;
                for (var10 = 0; var10 < 3; ++var10) {
                    for (var11 = 0; var11 < this.f[var10].length; ++var11) {
                        this.f[var10][var11] = var4.read();
                        this.g[var10][var11] = var4.read();
                        this.h[var10][var11] = var4.read();
                        this.i[var10][var11] = var4.read();
                    }
                }

                for (var10 = 0; var10 < 4; ++var10) {
                    for (var11 = 0; var11 < 6; ++var11) {
                        this.j[var10][var11] = hso_ak.a((InputStream) var4);
                        this.k[var10][var11] = hso_ak.a((InputStream) var4);
                    }
                }
            } catch (Exception var9) {
                var9.printStackTrace();
            }

            a.a((Object) var12);
        } else {
            if ((hso_ft.aj - this.b) / 1000L >= 15L) {
                this.b(var1, var2);
            }

        }
    }

    public hso_fe(byte var1, short var2) {
        this.c = var1;
        this.d = var2;
        this.j = hso_dw.a(4, 6);
        this.k = hso_dw.a(4, 6);
        byte var3 = 0;
        switch (var1) {
            case 0:
            case 1:
                var3 = 5;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                var3 = 1;
                break;
            case 6:
                var3 = 2;
        }

        this.f = hso_dw.a(4, var3);
        this.g = hso_dw.a(4, var3);
        this.h = hso_dw.a(4, var3);
        this.i = hso_dw.a(4, var3);
        this.a(var1, var2);
    }

    public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
        try {
            if (this.c >= 0) {
                int var6 = var4;
                if (var4 > 2) {
                    var6 = 2;
                }

                if (this.l != null && this.l.a != null) {
                    int var7 = this.j[var4][var5];
                    int var8 = this.k[var4][var5];
                    if (var4 > 2) {
                        var7 = -this.j[var6][var5] - this.h[var6][m[this.c][var5]];
                        var8 = this.k[var6][var5];
                    }

                    var1.a(this.l, this.f[var6][m[this.c][var5]], this.g[var6][m[this.c][var5]], this.h[var6][m[this.c][var5]], this.i[var6][m[this.c][var5]], var4 > 2 ? 2 : 0, var2 + var7, var3 + var8, 0);
                    this.b = hso_ft.aj;
                } else {
                    this.a(this.c, this.d);
                }
            }
        } catch (Exception var9) {
            hso_dw.a("loi day ne " + this.d);
        }
    }

    public final void b(mGraphics var1, int var2, int var3, int var4, int var5) {
        if (this.c >= 0) {
            if (this.l != null && this.l.a != null) {
                var1.a(this.l, this.f[0][m[this.c][0]], this.g[0][m[this.c][0]], this.h[0][m[this.c][0]], this.i[0][m[this.c][0]], 0, var2 + this.j[0][0], var3 - this.i[0][m[this.c][0]] / 2, 0);
                this.b = hso_ft.aj;
            } else {
                this.a(this.c, this.d);
                var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, var2, var3, 3);
            }
        }
    }

    private void b(byte var1, short var2) {
        this.b = hso_ft.aj;
        Service.a().a(var1, var2);
    }
}
