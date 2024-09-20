
public final class hso_br extends hso_es {

    public static hso_br a = new hso_br();
    public static hso_br b = new hso_br();

    public final void a() {
        for (int var1 = this.c() - 1; var1 >= 0; --var1) {
            hso_dx var2;
            if ((var2 = (hso_dx) this.a(var1)) != null) {
                var2.a();
                if (var2.x) {
                    this.b(var1);
                }
            }
        }

    }

    public final void a(mGraphics var1) {
        for (int var2 = 0; var2 < this.c(); ++var2) {
            hso_dx var3;
            if ((var3 = (hso_dx) this.a(var2)) != null && !var3.x) {
                var3.a(var1);
            }
        }

    }

    public final void b() {
        for (int var1 = this.c() - 1; var1 >= 0; --var1) {
            hso_dx var2;
            if ((var2 = (hso_dx) this.a(var1)) != null) {
                var2.x = true;
                this.b(var1);
            }
        }

    }

    public static void a(hso_dx var0, String method) {
        try {
            b.a(var0);
//            System.out.println("hso_br.a():" + method);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void b(hso_dx var0) {
        a.a(var0);
    }
}
