
public final class hso_n extends hso_p {

    private static hso_n f;
    private byte g = -1;
    public byte a = 1;
    private hso_dq h;
    private int i = 1;
    private short j;
    private long k;
    private long l;
    private long m;
    private long n;
    public boolean b;
    private hso_bt o;
    private int p;
    private int q;
    private long r = 0L;

    public static hso_n b() {
        if (f == null) {
            f = new hso_n();
        }

        return f;
    }

    public final void a(short var1) {
        this.b = false;
        super.Y = null;
        super.Z = null;
        this.o = new hso_bt(hso_df.gi, -1, this);
        super.aa = this.o;
        this.n = hso_dw.a();
        this.j = var1;
        this.m = this.n + (long) (var1 * 1000);
        this.p = 0;
        this.q = (hso_ft.X << 1) / 3;
        this.i = 0;
        this.g = 50;
        this.h = new hso_dq(this.g, 0, this.q, 0, 0, 1, 0);
        this.r = (long) (var1 * 1000 / (hso_ft.W + 120));
    }

    public final void a() {
        hso_cs.a(this.n, this.j);
        hso_gb.b();
        this.l = hso_dw.a();
        if (!this.b) {
            if (this.l - this.k >= this.r) {
                ++this.i;
                this.k = this.l;
            }

            if (this.m - hso_dw.a() <= 0L) {
                this.m = hso_dw.a() + 20000L;
                Service.a().l(this.a);
            }
        } else {
            this.i += 2;
            if (0 + this.i >= hso_ft.W) {
                this.m = hso_dw.a() + 20000L;
                Service.a().l(this.a);
            }
        }

        if (this.h != null) {
            this.h.a();
            this.h.h = this.i;
        }

        if (this.b || this.m - hso_dw.a() <= 10000L) {
            super.aa = null;
        }

        GameScreen.f.bk = 0;
        GameScreen.f.cF = 0;
        GameScreen.f.aY = 0 + this.i + 30;
        GameScreen.f.aZ = this.q - 40;
        GameScreen.f.Direction = 3;
        GameScreen.f.J();
        super.a();
    }

    public final void a(mGraphics var1) {
        try {
            if (hso_ft.a == this) {
                var1.a(-13286542);
                var1.c(0, 0, hso_ft.W, hso_ft.X);
                hso_gb.f(var1);
                if (this.h != null) {
                    this.h.a(var1);
                }

                GameScreen.f.c(var1, -1);
                hso_gb.e(var1);
                super.a(var1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c() {
        super.c = hso_ft.c;
        super.c();
        hso_ft.n();
        GameScreen.q.l();
    }

    public final void d() {
        super.d();
    }

    public final void e() {
        super.e();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case -1:
                Service.a().l((byte) 2);
            default:
        }
    }
}
