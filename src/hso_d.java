
public final class hso_d extends hso_cg {

    public hso_fi a = new hso_fi();
    private static hso_d c;
    public static boolean b = false;

    public static hso_d b(String method) {
        System.out.println("public static hso_d b(String method): " + method);
        return c == null ? (c = new hso_d()) : c;
    }

    public final void c() {
        if (b = !b) {
            this.a.i();
        }

    }

    public final void b(int var1, int var2) {
        switch (var1) {
            case 0:
                this.a.b("");
                b = false;
                if (!hso_ft.A) {
                    this.a.a(true);
                    return;
                }
                break;
            case 1:
                if (this.a.j().length() > 0) {
                    GameScreen.f.cE = this.a.j();
                    Service.a().a(this.a.j());
                    this.a.b("");
                }

                if (hso_ft.A) {
                    b = false;
                }
        }

    }

    protected hso_d() {
        this.a.f = false;
        this.a.a(true);
        this.a.b = hso_ft.X - hso_bt.k - this.a.d - 5;
        this.a.c = hso_ft.W - 10;
        this.a.a = (hso_ft.W - this.a.c) / 2;
        this.a.c(70);
        this.a.a(hso_df.getChat("protected hso_d()"));
        if (!hso_ft.A) {
            super.Y = new hso_bt(hso_df.Z, 0);
            super.aa = new hso_bt(hso_df.getChat("protected hso_d()"), 1);
            super.Z = this.a.b();
        }

    }

    public final void a(int var1) {
        this.a.b(var1);
    }

    public final void d() {
        this.a.a();
        super.d();
    }

    public final void a(mGraphics var1) {
        super.a(var1);
        this.a.a(var1);
    }

    public final void e() {
        this.a.g();
        super.e();
    }
}
