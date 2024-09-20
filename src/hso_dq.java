
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;

public final class hso_dq extends hso_z {

    private hso_bc n;
    private int o = 0;
    private boolean p = true;
    private boolean q = false;
    private int r;
    private int s;
    private int t;
    private long u;
    public boolean a;
    private int v = -1;
    private int w = -1;
    private static long x = 0L;
    private static long y = 0L;
    private static long z = 0L;
    private static long A = 0L;
    private long B;
    private short C;
    private byte D = 0;
    public static hso_ek b = new hso_ek();
    private int E;
    private int F;
    private byte G;

    public hso_dq(String var1) {
        super.c = 1;
        String[] var2 = hso_o.a(var1, ";");
        super.d = Short.parseShort(var2[0]);
        super.e = Short.parseShort(var2[1]);
        super.h = Integer.parseInt(var2[2]) * hso_cs.l;
        super.i = Integer.parseInt(var2[3]) * hso_cs.l;
        super.f = Integer.parseInt(var2[4]);
        super.g = Integer.parseInt(var2[5]);
        this.r = Integer.parseInt(var2[6]);
        this.s = Integer.parseInt(var2[7]);
        super.j = 70;
        super.k = 70;
        this.b((byte[]) null);
    }

    public hso_dq(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        super.c = 1;
        super.d = (short) var1;
        super.e = (short) var1;
        super.h = var2;
        super.i = var3;
        super.f = var4;
        super.g = var5;
        this.r = var6;
        this.s = var7;
        super.j = 70;
        super.k = 70;
        this.E = 0;
        this.F = 0;
        this.b((byte[]) null);
    }

    public hso_dq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, long var9, byte var11, int var12, int var13) {
        this.D = 1;
        super.c = 2;
        super.d = (short) var1;
        super.e = (short) var1;
        super.h = var2;
        super.i = var3;
        super.f = var4;
        super.g = var5;
        this.r = var6;
        this.s = var7;
        super.j = 70;
        super.k = 70;
        this.B = var9;
        this.G = var11;
        this.E = var12;
        this.F = var13;
        this.a(var8);
    }

    public hso_dq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8) {
        this.D = 1;
        super.c = 1;
        super.d = (short) var1;
        super.e = (short) var1;
        super.h = var2;
        super.i = var3;
        super.f = 0;
        super.g = 0;
        this.r = var6;
        this.s = 0;
        super.j = 70;
        super.k = 70;
        this.E = 0;
        this.F = 0;
        this.a(var8);
    }

    public hso_dq(int var1, int var2, int var3, byte[] var4) {
        this.D = 1;
        super.c = 3;
        super.d = (short) var1;
        super.e = (short) var1;
        super.h = var2;
        super.i = var3;
        super.j = 70;
        super.k = 70;
        this.E = 0;
        this.F = 0;
        this.a(var4);
    }

    private byte[] f() {
        byte[] var1 = null;

        try {
            byte[] var3;
            if ((var3 = hso_ak.a("data_eff" + super.e)) != null) {
                ByteArrayInputStream var4 = new ByteArrayInputStream(var3);
                DataInputStream var5;
                var1 = new byte[(var5 = new DataInputStream(var4)).readShort()];
                var5.read(var1);
                var5.close();
            }
        } catch (Exception var2) {
        }

        return var1;
    }

    public hso_dq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, short var9) {
        this.D = 1;
        super.c = 1;
        super.d = (short) var1;
        super.e = (short) var1;
        super.h = var2;
        super.i = var3;
        super.f = 0;
        super.g = 0;
        this.r = var6;
        this.s = 5;
        super.j = 70;
        super.k = 70;
        this.E = 0;
        this.F = 0;
        this.C = var9;
        this.a(var8);
    }

    private void a(byte[] var1) {
        if (var1 != null && var1.length > 0) {
            this.n = a(super.e, var1);
            this.u = hso_ft.aj;
            this.p = true;
            this.q = true;
            this.g();
        } else {
            hso_cb var4;
            if ((var4 = (hso_cb) b.a("" + super.e)) == null) {
                byte[] var2;
                if ((var2 = this.f()) != null && var2.length > 0) {
                    (var4 = new hso_cb(super.e)).a = var2;
                    b.a(String.valueOf(super.e), var4);
                    this.n = a(super.e, var4.a);
                    this.u = hso_ft.aj;
                    this.p = true;
                    this.q = true;
                    var4.b = (long) ((int) (hso_dw.a() / 1000L));
                    this.g();
                } else {
                    var4 = new hso_cb(super.e);
                    b.a(String.valueOf(super.e), var4);
                    hso_cr.a(super.e);
                    var4.b = (long) ((int) (hso_dw.a() / 1000L));
                }
            }

            if (var4 != null && var4.a != null && var4.a.length > 0) {
                this.n = a(super.e, var4.a);
                this.u = hso_ft.aj;
                this.p = true;
                this.q = true;
                this.g();
            }

        }
    }

    private void b(byte[] var1) {
        this.n = a(super.e, (byte[]) null);
        this.u = hso_ft.aj;
        this.p = true;
        this.q = true;
        this.g();
    }

    private void b(mGraphics var1) {
        if (this.D == 1 && !this.q) {
            this.a((byte[]) null);
        } else {
            try {
                if (this.n != null && this.p) {
                    short var2 = this.n.d[this.t];
                    int var3 = this.n.c[var2].a.length;

                    for (int var4 = 0; var4 < var3; ++var4) {
                        hso_fg var5 = (hso_fg) this.n.b.a("" + this.n.c[var2].a[var4].c);
                        hso_aq var6 = hso_cr.a(super.e);
                        if (var5 != null && var6 != null && var6.a != null) {
                            var1.a(var6, var5.a, var5.b, var5.c, var5.d, 0, super.h + super.f + this.n.c[var2].a[var4].a, super.i + super.g + this.n.c[var2].a[var4].b, 0);
                        }
                    }

                    return;
                }
            } catch (Exception var7) {
                hso_dw.a("paint effauto null img1: " + var7.toString());
                this.p = false;
                this.q = false;
            }

        }
    }

    public final void a(mGraphics var1) {
        if (this.D == 1 && !this.q) {
            this.a((byte[]) null);
        } else {
            short var2;
            int var3;
            int var4;
            hso_fg var5;
            hso_aq var6;
            if (super.c == 3) {
                try {
                    if (this.n != null && this.p) {
                        var2 = this.n.d[this.t];
                        var3 = this.n.c[var2].a.length;

                        for (var4 = 0; var4 < var3; ++var4) {
                            var5 = (hso_fg) this.n.b.a("" + this.n.c[var2].a[var4].c);
                            var6 = hso_cr.a(super.e);
                            if (var5 != null && var6 != null && var6.a != null) {
                                var1.a(var6, var5.a, var5.b, var5.c, var5.d, 0, super.h + super.f + this.n.c[var2].a[var4].a, super.i + super.g + this.n.c[var2].a[var4].b, 0);
                            }
                        }

                        return;
                    }
                } catch (Exception var7) {
                    hso_dw.a("paint effauto null img1: " + var7.toString());
                    this.p = false;
                    this.q = false;
                }

            } else if (super.c == 4) {
                this.b(var1);
            } else if (!hso_ft.B && this.q && hso_cs.i != hso_cs.j || hso_cf.j()) {
                try {
                    if (this.n != null && this.p) {
                        var2 = this.n.d[this.t];
                        var3 = this.n.c[var2].a.length;

                        for (var4 = 0; var4 < var3; ++var4) {
                            var5 = (hso_fg) this.n.b.a("" + this.n.c[var2].a[var4].c);
                            var6 = hso_cr.a(super.e);
                            if (var5 != null && var6 != null && var6.a != null) {
                                var1.a(var6, var5.a, var5.b, var5.c, var5.d, 0, super.h + super.f + this.n.c[var2].a[var4].a, super.i + super.g + this.n.c[var2].a[var4].b, 0);
                            }
                        }

                        return;
                    }
                } catch (Exception var8) {
                    hso_dw.a("paint effauto null img1: " + super.e + " " + var8.toString() + " " + this.n.d.length);
                    this.p = false;
                    this.q = false;
                }

            }
        }
    }

    public final void a(mGraphics var1, int var2, int var3) {
        if (this.D == 1 && !this.q) {
            this.a((byte[]) null);
        } else if (!hso_ft.B && this.q && hso_cs.i != hso_cs.j) {
            try {
                if (this.n != null && this.p) {
                    short var4 = this.n.d[this.t];
                    int var5 = this.n.c[var4].a.length;

                    for (int var6 = 0; var6 < var5; ++var6) {
                        hso_fg var7 = (hso_fg) this.n.b.a("" + this.n.c[var4].a[var6].c);
                        hso_aq var8 = hso_cr.a(super.e);
                        if (var7 != null && var8 != null && var8.a != null) {
                            var1.a(var8, var7.a, var7.b, var7.c, var7.d, 0, var2 + super.f + this.n.c[var4].a[var6].a + this.E, var3 + super.g + this.n.c[var4].a[var6].b + this.F, 0);
                        }
                    }

                    return;
                }
            } catch (Exception var9) {
                hso_dw.a("paint effauto null img " + super.e + " " + var9.toString());
                this.p = false;
                this.q = false;
            }

        }
    }

    public final boolean c() {
        return this.B - hso_dw.a() > 0L && this.G == 1;
    }

    public final boolean d() {
        return this.B - hso_dw.a() > 0L && this.G == 2;
    }

    public final void a() {
        if (this.D != 1 || this.q) {
            try {
                if (super.c == 3) {
                    ++this.t;
                    if (this.t >= this.n.d.length - 1) {
                        this.t = 0;
                        this.a = true;
                    }

                    return;
                }

                if ((hso_ft.B || !this.q || hso_cs.i == hso_cs.j) && !hso_cf.j()) {
                    return;
                }

                if (super.c == 2 && this.B - hso_dw.a() < 0L) {
                    this.a = true;
                }

                if (super.e == 51) {
                    ++this.t;
                    if (this.t >= this.n.d.length - 1) {
                        this.t = this.n.d.length - 1;
                    }
                } else if (this.t >= this.n.d.length - 1) {
                    switch (this.r) {
                        case 0:
                            ++this.o;
                            this.p = false;
                            if (this.o >= this.s) {
                                this.o = 0;
                                this.p = true;
                                this.t = 0;
                            }
                            break;
                        case 1:
                            this.t = 0;
                            break;
                        case 2:
                            this.p = false;
                            if (hso_ft.ai % 5 == 0 && (hso_ft.aj - this.u) / 1000L > (long) this.s) {
                                this.u = hso_ft.aj;
                                this.t = 0;
                                this.p = true;
                            }
                            break;
                        case 3:
                            if (this.C > 0 && hso_ak.f(this.s) == 0) {
                                --this.C;
                                this.t = 0;
                            } else if (this.C <= 0) {
                                this.a = true;
                                this.p = false;
                                this.q = false;
                            }
                            break;
                        case 4:
                            if (hso_ak.f(this.s) == 0) {
                                this.t = 0;
                                if (this.v >= 0 && hso_ak.f(this.w) == 0 && this.b()) {
                                }
                            }
                    }
                } else {
                    ++this.t;
                }
            } catch (Exception var2) {
                hso_dw.a("eff=" + super.e + var2.toString());
                this.p = false;
                this.q = false;
            }

            if (this.v == 48) {
                if (hso_ak.f(this.w) == 0 && this.b()) {
                    return;
                }
            } else if (this.v == 49) {
                if (this.t != 35 && this.t != 43) {
                    if (this.t == 125 && this.b()) {
                        return;
                    }
                } else if (this.b()) {
                    return;
                }
            } else if (this.v == 52) {
                if (this.t == 50 && this.b()) {
                    return;
                }
            } else if (this.v == 54) {
                if (this.t % 5 == 0 && this.b() && (hso_ft.aj - z) / 100L > 48L) {
                    z = hso_ft.aj;
                    return;
                }
            } else if (this.v == 53) {
                if (this.t % 5 == 0 && this.b() && (hso_ft.aj - x) / 100L > 68L && hso_ft.a == hso_ft.c) {
                    x = hso_ft.aj;
                    return;
                }
            } else if (this.v == 55) {
                if (this.t % 5 == 0 && this.b() && (hso_ft.aj - y) / 100L > 28L) {
                    y = hso_ft.aj;
                    return;
                }
            } else if (this.v == 50) {
                if (this.t == 30 && this.b()) {
                    return;
                }
            } else if (this.v == 56 && this.t % 5 == 0 && this.b() && (hso_ft.aj - A) / 100L > 48L) {
                A = hso_ft.aj;
            }

        }
    }

    private static hso_bc a(int var0, byte[] var1) {
        hso_bc var2;
        if ((var2 = (hso_bc) hso_bc.a.a("" + var0)) == null) {
            var2 = new hso_bc(var0, var1);
            hso_bc.a.a(String.valueOf(var0), var2);
        }

        return var2;
    }

    public static hso_aq a(int var0) {
        hso_aq var1 = new hso_aq();
        Service.a().a((byte) 111, (short) ((short) var0));
        return var1;
    }

    private void g() {
        switch (super.e) {
            case 0:
            case 15:
            case 17:
            case 18:
            case 30:
            case 32:
                this.v = 53;
                this.w = 2;
                return;
            case 6:
                this.v = 50;
                this.w = 2;
                return;
            case 7:
                this.v = 48;
                this.w = 200;
                return;
            case 9:
            case 12:
                this.v = 52;
                this.w = 2;
                return;
            case 11:
                this.v = 49;
                this.w = 2;
                return;
            case 19:
            case 20:
            case 31:
                this.v = 55;
                this.w = 2;
                return;
            case 22:
                this.v = 56;
                this.w = 2;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 10:
            case 13:
            case 14:
            case 16:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                return;
            case 28:
                this.v = 54;
                this.w = 2;
                return;
            case 29:
                this.v = 47;
                this.w = 3;
        }
    }

    public final void b(int var1) {
        super.l = (short) var1;
    }

    public static void e() {
        Enumeration var0 = b.a.keys();

        while (var0.hasMoreElements()) {
            String var1 = (String) var0.nextElement();
            hso_cb var2 = (hso_cb) b.a(var1);
            if ((hso_ft.aj - var2.b) / 1000L > 60L) {
                b.a((Object) var1);
            }
        }

    }
}
