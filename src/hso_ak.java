
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 *
 * @param ak
 */
public final class hso_ak {

    private static short[] c = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
    public static hso_ek a = new hso_ek();
    private static String d = "region_Rms";
    private static short[] e = new short[91];
    private static int[] f = new int[91];
    private static Random g;
    private static hso_fe[][] h;
    public static hso_ap[][][] b;

    static {
        int var0;
        for (var0 = 0; var0 <= 90; ++var0) {
            e[var0] = c[90 - var0];
            if (e[var0] == 0) {
                f[var0] = Integer.MAX_VALUE;
            } else {
                f[var0] = (c[var0] << 10) / e[var0];
            }
        }

        g = new Random();
        h = new hso_fe[7][];

        for (var0 = 0; var0 < h.length; ++var0) {
            h[var0] = new hso_fe[256];
        }

        b = new hso_ap[4][5][3];
    }

    public static final int a(int var0) {
        if (var0 >= 0 && var0 < 90) {
            return c[var0];
        } else if (var0 >= 90 && var0 < 180) {
            return c[180 - var0];
        } else {
            return var0 >= 180 && var0 < 270 ? -c[var0 - 180] : -c[360 - var0];
        }
    }

    public static final int b(int var0) {
        if (var0 >= 0 && var0 < 90) {
            return e[var0];
        } else if (var0 >= 90 && var0 < 180) {
            return -e[180 - var0];
        } else {
            return var0 >= 180 && var0 < 270 ? -e[var0 - 180] : e[360 - var0];
        }
    }

    public static final int c(int var0) {
        if (var0 >= 0 && var0 < 90) {
            return f[var0];
        } else if (var0 >= 90 && var0 < 180) {
            return -f[180 - var0];
        } else {
            return var0 >= 180 && var0 < 270 ? f[var0 - 180] : -f[360 - var0];
        }
    }

    public static final int a(int var0, int var1) {
        int var10000;
        int var2;
        if (var0 != 0) {
            var2 = Math.abs((var1 << 10) / var0);

            label44:
            {
                for (int var3 = 0; var3 <= 90; ++var3) {
                    if (f[var3] >= var2) {
                        var10000 = var3;
                        break label44;
                    }
                }

                var10000 = 0;
            }

            var2 = var10000;
            if (var1 >= 0 && var0 < 0) {
                var2 = 180 - var2;
            }

            if (var1 < 0 && var0 < 0) {
                var2 += 180;
            }

            if (var1 >= 0 || var0 < 0) {
                return var2;
            }

            var10000 = 360 - var2;
        } else {
            var10000 = var1 > 0 ? 90 : 270;
        }

        var2 = var10000;
        return var2;
    }

    public static final int d(int var0) {
        if (var0 >= 360) {
            var0 %= 360;
        }

        if (var0 < 0) {
            var0 = 360 + var0 % 360;
        }

        return var0;
    }

    public static int e(int var0) {
        return var0 < 0 ? -var0 : var0;
    }

    public static int f(int n) {
        return g.nextInt(n);
    }

    public static int g(int var0) {
        int var1;
        for (var1 = 0; var1 == 0; var1 = g.nextInt() % var0) {
        }

        return var1;
    }

    public static int b(int var0, int var1) {
        var0 += g.nextInt(var1 - var0);
        byte var2 = 2;
        if (g.nextInt(var2) == 0) {
            var0 = -var0;
        }

        return var0;
    }

    public static int c(int var0, int var1) {
        return var0 + g.nextInt(var1 - var0);
    }

    public static int h(int var0) {
        if (var0 <= 0) {
            return 0;
        } else {
            int var1 = (var0 + 1) / 2;

            int var2;
            do {
                var2 = var1;
                var1 = var1 / 2 + var0 / (var1 * 2);
            } while (Math.abs(var2 - var1) > 1);

            return var1;
        }
    }

    public static float a(float var0) {
        if (var0 <= 0.0F) {
            return 0.0F;
        } else {
            float var1 = (var0 + 1.0F) / 2.0F;
            float var2;
            do {
                var2 = var1;
                var1 = var1 / 2.0F + var0 / (var1 * 2.0F);
            } while (Math.abs((int) (var2 - var1)) > 1.0F);

            return var1;
        }
    }

    public static int a(int var0, int var1, int var2, int var3) {
        return e(var0 - var2) + e(var1 - var3);
    }

    public static void a(hso_es var0) {
        a(var0, 0, var0.c() - 1);
    }

    private static void a(hso_es var0, int var1, int var2) {
        if (var2 - var1 > 0) {
            try {
                int var3 = ((MainObject) var0.a(var2)).bp;
                var3 = a(var0, var1, var2, var3);
                a(var0, var1, var3 - 1);
                a(var0, var3 + 1, var2);
            } catch (Exception var4) {
                hso_dw.a("loi Cres 1");
                var4.printStackTrace();
            }
        }
    }

    private static int a(hso_es var0, int var1, int var2, int var3) {
        --var1;
        int var4 = var2;

        try {
            while (true) {
                do {
                    ++var1;
                } while (((MainObject) var0.a(var1)).bp < var3);

                while (var4 > 0) {
                    --var4;
                    if (((MainObject) var0.a(var4)).bp <= var3) {
                        break;
                    }
                }

                if (var1 >= var4) {
                    b(var0, var1, var2);
                    break;
                }

                b(var0, var1, var4);
            }
        } catch (Exception var5) {
            hso_dw.a("loi Cres 2");
            var5.printStackTrace();
        }

        return var1;
    }

    private static void b(hso_es var0, int var1, int var2) {
        Object var3 = var0.a(var2);
        if (((MainObject) var0.a(var2)).bp != ((MainObject) var0.a(var1)).bp) {
            var0.a(var0.a(var1), var2);
            var0.a(var3, var1);
        }

    }

    public static void b(hso_es var0) {
        c(var0, 0, var0.c() - 1);
    }

    private static void c(hso_es var0, int var1, int var2) {
        if (var2 - var1 > 0) {
            try {
                int var3 = ((hso_z) var0.a(var2)).i;
                var3 = b(var0, var1, var2, var3);
                c(var0, var1, var3 - 1);
                c(var0, var3 + 1, var2);
            } catch (Exception var4) {
                hso_dw.a("loi Cres 1");
                var4.printStackTrace();
            }
        }
    }

    private static int b(hso_es var0, int var1, int var2, int var3) {
        --var1;
        int var4 = var2;

        try {
            while (true) {
                do {
                    ++var1;
                } while (((hso_z) var0.a(var1)).i < var3);

                while (var4 > 0) {
                    --var4;
                    if (((hso_z) var0.a(var4)).i <= var3) {
                        break;
                    }
                }

                if (var1 >= var4) {
                    d(var0, var1, var2);
                    break;
                }

                d(var0, var1, var4);
            }
        } catch (Exception var5) {
            hso_dw.a("loi Cres 2");
            var5.printStackTrace();
        }

        return var1;
    }

    private static void d(hso_es var0, int var1, int var2) {
        Object var3 = var0.a(var2);
        if (((hso_z) var0.a(var2)).i != ((hso_z) var0.a(var1)).i) {
            var0.a(var0.a(var1), var2);
            var0.a(var3, var1);
        }

    }

    public static hso_cz[] a(hso_cz[] var0) {
        int var4 = var0.length;

        for (int var1 = 0; var1 < var4 - 1; ++var1) {
            int var3 = var1;

            for (int var2 = var1 + 1; var2 < var4; ++var2) {
                if (var0[var2].a < var0[var3].a) {
                    var3 = var2;
                }
            }

            if (var3 != var1) {
                hso_cz var5 = var0[var1];
                var0[var1] = var0[var3];
                var0[var3] = var5;
            }
        }

        return var0;
    }

    public static hso_es c(hso_es var0) {
        int var4 = var0.c();

        for (int var1 = 0; var1 < var4 - 1; ++var1) {
            int var3 = var1;

            for (int var2 = var1 + 1; var2 < var4; ++var2) {
                if (((hso_ev) var0.a(var2)).b < ((hso_ev) var0.a(var3)).b) {
                    var3 = var2;
                }
            }

            if (var3 != var1) {
                e(var0, var1, var3);
            }
        }

        return var0;
    }

    public static hso_es d(hso_es var0) {
        int var4 = var0.c();

        for (int var1 = 0; var1 < var4 - 1; ++var1) {
            int var3 = var1;

            for (int var2 = var1 + 1; var2 < var4; ++var2) {
                if (((hso_ev) var0.a(var2)).i < ((hso_ev) var0.a(var3)).i) {
                    var3 = var2;
                }
            }

            if (var3 != var1) {
                e(var0, var1, var3);
            }
        }

        return var0;
    }

    private static void e(hso_es var0, int var1, int var2) {
        Object var3 = var0.a(var2);
        if (((hso_ev) var0.a(var2)).i != ((hso_ev) var0.a(var1)).i) {
            var0.a(var0.a(var1), var2);
            var0.a(var3, var1);
        }

    }

    public static hso_es e(hso_es var0) {
        int var4 = var0.c();

        for (int var1 = 0; var1 < var4 - 1; ++var1) {
            int var3 = var1;

            for (int var2 = var1 + 1; var2 < var4; ++var2) {
                if (((hso_j) var0.a(var2)).C < ((hso_j) var0.a(var3)).C) {
                    var3 = var2;
                }
            }

            if (var3 != var1) {
                Object var6 = var0.a(var3);
                var0.a(var0.a(var1), var3);
                var0.a(var6, var1);
            }
        }

        return var0;
    }

    public static int a(InputStream var0) {
        byte[] var1 = new byte[1];

        try {
            var0.read(var1, 0, 1);
        } catch (IOException var2) {
            var2.printStackTrace();
        }

        return var1[0];
    }

    public static void a() {
        if (h != null) {
            for (int var0 = 0; var0 < h.length; ++var0) {
                for (int var1 = 0; var1 < h[var0].length; ++var1) {
                    if (h[var0][var1] != null && (hso_ft.aj - h[var0][var1].b) / 1000L > 60L) {
                        h[var0][var1] = null;
                    }
                }
            }

        }
    }

    public static synchronized hso_fe d(int var0, int var1) {
        if (h[var0][var1] == null) {
            h[var0][var1] = new hso_fe((byte) var0, (short) var1);
        }

        return h[var0][var1];
    }

    public static void a(int var0, int var1, int var2) {
        try {
            MainObject.dY[var0][var1][var2] = new hso_am();
            int var6;
            int var7;
            if (hso_dw.i) {
                String[] var3 = new String[]{"kiem/", "songkiem/", "phapsu/", "sung/"};
                hso_aq var4 = null;

                try {
                    var4 = hso_aq.a("/weapon/" + var3[var0] + var1 + ".img");
                } catch (Exception var9) {
                    var9.printStackTrace();
                }

                if (var4 != null && var4.a != null) {
                    DataInputStream var5 = null;

                    try {
                        var5 = hso_aq.b("/weapon/" + var3[var0] + var1 + "_data");
                    } catch (Exception var9) {
                        var9.printStackTrace();
                    }

                    if (var5 != null) {
                        MainObject.dY[var0][var1][var2].a = var4;

                        for (var6 = 0; var6 < 4; ++var6) {
                            for (var7 = 0; var7 < 3; ++var7) {
                                MainObject.dY[var0][var1][var2].b[var6][var7][0] = (byte) var5.read();
                                MainObject.dY[var0][var1][var2].b[var6][var7][1] = (byte) var5.read();
                            }

                            MainObject.dY[var0][var1][var2].c[var6][0] = (byte) var5.read();
                            MainObject.dY[var0][var1][var2].c[var6][1] = (byte) var5.read();
                        }

                        MainObject.dY[var0][var1][var2].d = hso_aq.b(MainObject.dY[var0][var1][var2].a.a);
                        return;
                    }
                }
            }

            hso_cw var12;
            if ((var12 = (hso_cw) a.a(var0 + "_" + var1)) == null) {
                var12 = new hso_cw();
                a.a(var0 + "_" + var1, var12);
                var12.b = hso_ft.aj;
                a((byte) var0, (short) var1);
                MainObject.dY[var0][var1][var2] = null;
            } else if (var12.a != null) {
                MainObject.dY[var0][var1][var2].a = var12.a;
                ByteArrayInputStream var14 = new ByteArrayInputStream(var12.c);
                DataInputStream var13 = new DataInputStream(var14);
                hso_dp.a();

                try {
                    for (var6 = 0; var6 < 4; ++var6) {
                        for (var7 = 0; var7 < 3; ++var7) {
                            MainObject.dY[var0][var1][var2].b[var6][var7][0] = (byte) var13.read();
                            MainObject.dY[var0][var1][var2].b[var6][var7][1] = (byte) var13.read();
                        }

                        MainObject.dY[var0][var1][var2].c[var6][0] = (byte) var13.read();
                        MainObject.dY[var0][var1][var2].c[var6][1] = (byte) var13.read();
                    }

                    MainObject.dY[var0][var1][var2].d = hso_aq.b(MainObject.dY[var0][var1][var2].a.a);
                } catch (Exception var9) {
                    var9.printStackTrace();
                }

                a.a((Object) var12);
            } else if ((hso_ft.aj - var12.b) / 1000L >= 15L) {
                a((byte) var0, (short) var1);
            }
        } catch (Exception var11) {
            var11.printStackTrace();
            hso_dw.a("loi Cres 7");
        }

        hso_dp.a();
    }

    private static void a(byte var0, short var1) {
        hso_cw var2;
        if ((var2 = (hso_cw) a.a(var0 + "_" + var1)) != null) {
            var2.b = hso_ft.aj;
        }

        Service.a().a((byte) (var0 + 50), var1);
    }

    public static hso_ap b(int var0, int var1, int var2) {
        try {
            String[] var3 = new String[]{"kiem/", "songkiem/", "phapsu/", "sung/"};
            b[var0][var1][var2] = new hso_ap();
            b[var0][var1][var2].g = hso_aq.a("/wps/" + var3[var0] + var1 + ".img");
            DataInputStream var7 = hso_aq.b("/wps/" + var3[var0] + var1 + "_data");

            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 8; ++var5) {
                    b[var0][var1][var2].a[var4][var5] = var7.read();
                    b[var0][var1][var2].b[var4][var5] = var7.read();
                    b[var0][var1][var2].c[var4][var5] = a((InputStream) var7);
                    b[var0][var1][var2].d[var4][var5] = a((InputStream) var7);
                    b[var0][var1][var2].e[var4][var5] = var7.read();
                    b[var0][var1][var2].f[var4][var5] = var7.read();
                }
            }

            hso_dp.a();
        } catch (IOException var6) {
            b[var0][var1][var2] = null;
            hso_dw.a("loi Cres 8");
            var6.printStackTrace();
        }

        return b[var0][var1][var2];
    }

    public static hso_am c(int var0, int var1, int var2) {
        if (MainObject.dY[var0][var1][0] == null) {
            hso_dt.a.a(var0, var1, 0);
        }

        return MainObject.dY[var0][var1][0];
    }

    public static void a(String var0, byte[] var1) {
        TemMidlet.a(var0, var1);
    }

    public static byte[] a(String var0) {
        return TemMidlet.a(var0);
    }

    public static void a(byte var0, byte[] var1) {
        Service.a().a((byte) 0, (byte) var0, (byte[]) var1);
    }

    public static boolean b(String var0) {
        return var0.compareTo("isLowDevice") != 0 && var0.compareTo("isQty") != 0 && var0.compareTo("user_pass") != 0 && var0.compareTo("isIndexPart") != 0 && var0.compareTo("isIndexServer") != 0;
    }

    public static void b() {
        try {
            ByteArrayOutputStream var0 = new ByteArrayOutputStream();
            (new DataOutputStream(var0)).writeByte(hso_dw.c);
            String var10000 = d;
            byte[] var1 = var0.toByteArray();
            TemMidlet.a(var10000, var1);
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }
}
