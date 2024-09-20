
public final class hso_dw {

    public static String[][] a = new String[][]{
        {"Chiến Thần", "127.0.0.1"},
        {"Rồng Lửa", "hs2.teamobi.com"},
        {"Global Server", "hsglobal.teamobi.com"},
        {"Phượng Hoàng", "hs3.teamobi.com"},
        {"Nhân Mã", "hs5.teamobi.com"},
        {"Kì Lân", "hs6.teamobi.com"},
        {"Thiên Hà (New)", "hs7.teamobi.com"},
        {"Thách Đấu", "hs4.teamobi.com"}};
    public static String[][] b = new String[][]{{"Chiến Thần", "hs1.teamobi.com"}, {"Rồng Lửa", "hs2.teamobi.com"}, {"Global Server", "hsglobal.teamobi.com"}, {"Phượng Hoàng", "hs3.teamobi.com"}, {"Nhân Mã", "hs5.teamobi.com"}, {"Kì Lân (New)", "hs6.teamobi.com"}, {"Thách Đấu", "hs4.teamobi.com"}};
    public static int c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static int h;
    public static boolean i;
    public static boolean j;

    static {
        String[][] var10000 = new String[][]{{"Indo Naga", "hsindo.teamobi.com"}, {"Indo Garuda(new)", "hsindo.teamobi.com"}, {"Knight Age (ENG)", "hsglobal.teamobi.com"}};
        var10000 = new String[][]{{"Fire Dragon (ENG)", "46.137.254.172"}, {"Sky Dragon (SPN)", "54.254.156.202"}, {"Knight Age (ENG)", "hsglobal.teamobi.com"}};
        d = false;
        e = false;
        f = false;
        g = true;
        h = 0;
        i = true;
        j = false;
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static void a(String var0) {
        System.out.println(var0);
    }

    public static void b() {
        System.gc();
    }

    public static int[][] a(int var0, int var1) {
        return new int[var0][var1];
    }

    public static byte[][] b(int var0, int var1) {
        return new byte[4][var1];
    }

    public static byte[][][] a(int var0, int var1, int var2) {
        return new byte[4][3][2];
    }

    public static String[] a(String var0, String var1) {
        hso_es var2 = new hso_es("mSys nodes");

        for (int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
            var2.a(var0.substring(0, var3));
        }

        var2.a(var0);
        String[] var4 = new String[var2.c()];
        if (var2.c() > 0) {
            for (int var5 = 0; var5 < var2.c(); ++var5) {
                var4[var5] = (String) var2.a(var5);
            }
        }

        return var4;
    }

    public static String c() {
        return "";
    }

    public static String d() {
        return "";
    }

    public static String e() {
        return "";
    }
}
