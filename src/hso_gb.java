
public final class hso_gb {

    public static hso_aq a = new hso_aq();
    public static hso_aq b = new hso_aq();
    private static hso_aq[] e = new hso_aq[3];
    public static hso_aq c = new hso_aq();
    public static hso_aq d = new hso_aq();
    private static hso_ce f;
    private static hso_cp[] g = new hso_cp[7];
    private static hso_cp[] h = new hso_cp[3];
    private static int[] i = new int[7];
    private static int[] j = new int[7];
    private static int k = 70;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int[] v = new int[3];

    public static void a() {
        c();
        m = hso_aq.a(a.a);
        n = hso_aq.b(a.a);
        l = hso_ft.W / m;
        q = hso_aq.a(b.a);
        r = hso_aq.b(b.a);
        o = hso_ft.W / q;
        p = (hso_ft.X - (k + n)) / r;
        t = hso_aq.a(e[0].a);
        u = hso_aq.b(e[0].a);
        s = hso_ft.W / t;

        int var0;
        for (var0 = 0; var0 < g.length; ++var0) {
            g[var0] = new hso_cp();
            g[var0].a = (float) hso_ak.c(0, hso_ft.W);
            g[var0].b = (float) (hso_ak.f(6) * 10);
            i[var0] = hso_ak.c(1, 3);
            j[var0] = hso_ak.c(0, 2);
        }

        for (var0 = 0; var0 < h.length; ++var0) {
            h[var0] = new hso_cp();
            h[var0].a = (float) (hso_ft.Y - 80 + var0 * 80);
            h[var0].b = (float) (hso_ft.X - 50 - var0 % 2 * 25);
        }

        v = new int[s + 2];

        for (var0 = 0; var0 < v.length; ++var0) {
            v[var0] = var0 * t - hso_aq.a(e[0].a);
        }

    }

    public static void a(mGraphics var0) {
        if (a != null && b != null && d != null) {
            mGraphics var1 = var0;
            var0.a(-11835756);
            var0.c(0, 0, hso_ft.W, k);

            int var2;
            for (var2 = 0; var2 < l + 1; ++var2) {
                var1.a(a, var2 * m, k, 0);
            }

            var0.a(c, 10, k + n / 2, 0);
            var1 = var0;
            var2 = k + n;

            for (int var3 = 0; var3 < o + 1; ++var3) {
                for (int var4 = 0; var4 < p + 1; ++var4) {
                    var1.a(b, var3 * q, var4 * r + var2, 0);
                }
            }

            var1 = var0;

            for (var2 = 0; var2 < 4; ++var2) {
                var1.a(e[i[var2]], (int) g[var2].a, (int) g[var2].b, 0);
            }
        } else {
            c();
        }

        var0.a(hso_ft.Y - 0 * hso_cs.l / 2, hso_ft.X - 0 * hso_cs.l);
        hso_ft.a(var0);
    }

    public static void b(mGraphics var0) {
        int var1 = hso_ft.X - u;

        for (int var2 = 0; var2 < v.length; ++var2) {
            var0.a(e[0], v[var2], var1, 0);
        }

    }

    public static void c(mGraphics var0) {
        for (int var1 = 4; var1 < g.length; ++var1) {
            var0.a(e[i[var1]], (int) g[var1].a, (int) g[var1].b, 0);
        }

    }

    public static void d(mGraphics var0) {
        for (int var1 = 0; var1 < h.length; ++var1) {
            var0.a(d, (int) h[var1].a, (int) h[var1].b, 3);
        }

    }

    public static void b() {
        int var0;
        for (var0 = 0; var0 < g.length; ++var0) {
            j[var0] = 1;
            hso_cp var10000 = g[var0];
            var10000.a += (float) j[var0];
            if (g[var0].a > (float) hso_ft.W) {
                g[var0].a = (float) (-hso_aq.a(e[1].a));
                g[var0].b = (float) (hso_ak.f(6) * 10);
                i[var0] = hso_ak.c(1, 3);
                j[var0] = hso_ak.c(1, 2);
            }
        }

        var0 = -1;
        int var1 = -1;

        for (int var2 = 0; var2 < v.length; ++var2) {
            int[] var4 = v;
            var4[var2] += 2;
            if (v[var2] > hso_ft.W) {
                int var3;
                if ((var3 = var2 + 1) > v.length - 1) {
                    var3 = 0;
                }

                if (var0 == -1) {
                    var0 = var2;
                    var1 = var3;
                }
            }
        }

        if (var0 != -1 && var1 != -1) {
            v[var0] = v[var1] - t;
        }

    }

    public static void c() {
        a = hso_aq.a("/bg/sky.img");
        b = hso_aq.a("/bg/sea.img");

        for (int var0 = 0; var0 < e.length; ++var0) {
            e[var0] = hso_aq.a("/bg/cloud" + var0 + ".img");
        }

        c = hso_aq.a("/bg/boat.img");
        d = hso_aq.a("/bg/floating.img");
        if (f == null) {
            f = new hso_ce(hso_aq.a("/bg/seabg.png"), 24, 24);
        }

    }

    public static void e(mGraphics var0) {
        for (int var1 = 0; var1 < 4; ++var1) {
            var0.a(e[i[var1]], (int) g[var1].a, (int) g[var1].b + hso_ft.X / 2, 0);
        }

    }

    public static void f(mGraphics var0) {
        for (int var1 = 0; var1 < hso_ft.W / 24 + 1; ++var1) {
            for (int var2 = 0; var2 < hso_ft.X / 24 + 1; ++var2) {
                f.b(hso_ft.ai % 14 < 7 ? 1 : 0, var1 * 24, var2 * 24, 0, var0);
            }
        }

    }
}
