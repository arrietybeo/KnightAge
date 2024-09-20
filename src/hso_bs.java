
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class hso_bs extends hso_p {

    private int q = 0;
    public int a = 0;
    private int r = 10;
    private int s;
    private int t;
    private int u;
    private static boolean v = true;
    public static boolean b = true;
    public static hso_fi f;
    public static hso_fi g;
    public static String h = "";
    public static String i = "";
    public static int j = 0;
    public static byte k = 1;
    public static hso_aq l;
    public static String m;
    private String[] w;
    public static String n;
    public static int o;
    public static int p;
    private hso_bt x;
    private hso_bt y;
    private hso_bt z;
    private hso_bt A;
    private hso_bt B;
    private hso_bt C;
    private hso_bt D;
    private hso_bt E;
    private hso_bt F;
    private hso_bt G;
    private hso_bt H;
    private hso_bt I;
    private hso_bt J;
    private hso_bt K;
    private int L;
    private int M;
    private int N;
    private boolean O = true;

    static {
        String[] var10000 = new String[]{"anh Trí", "ku Ngân", "Server"};
        n = null;
        o = 0;
    }

    public hso_bs() {
        try {
            if (hso_ft.X < 240) {
                this.q = 10;
            }

            this.u = hso_ft.Z - 30 + this.q;
            if (hso_ft.X - this.u < 160) {
                this.u = hso_ft.X - 160 + this.q + 20;
            }

            if (hso_ft.A) {
                this.t = hso_ft.Y + 40;
                this.r = 10;
                this.L = hso_ft.Z - 50;
            } else {
                this.t = hso_ft.W / 2;
            }
            String fc = hso_df.F;
            p = hso_o.k.a(fc);
            p = 14;// debug
            if (hso_f.a || hso_cd.a) {
                b = false;
            }

            if (hso_ft.M[hso_ft.H] != 0) {
                b = false;
            }

            if (this.t < 130) {
                this.t = 130 + hso_ft.Y / 2;
            }

            if (hso_ft.A) {
                f = new hso_fi(hso_ft.Y - this.t / 2 + 15, this.L + this.r + this.r / 2, this.t - 30);
                g = new hso_fi(hso_ft.Y - this.t / 2 + 15, this.L + (this.r << 1) + this.r / 2 + f.d, this.t - 30, 40);
            } else {
                f = new hso_fi(hso_ft.Y - this.t / 2 + 15, this.u + this.r + this.r / 2, this.t - 30);
                g = new hso_fi(hso_ft.Y - this.t / 2 + 15, this.u + (this.r << 1) + this.r / 2 + f.d, this.t - 30);
            }

            f.a(hso_df.V);
            g.a(hso_df.W);
            g.d(2);
            if (!hso_ft.A) {
                f.a(true);
            }

            this.x = new hso_bt(hso_df.fX, 0);
            this.A = new hso_bt(hso_df.fS, 1);
            this.B = new hso_bt(hso_df.fS, 1);
            this.E = new hso_bt("OK", 2);
            this.F = new hso_bt(hso_df.X, 3);
            this.C = new hso_bt(hso_df.fX, 4);
            this.D = new hso_bt(hso_df.fY, 5, this);
            this.z = new hso_bt(hso_df.fG + ": " + hso_dw.a[hso_ft.H][0], 6, this);
            this.G = new hso_bt(hso_df.bW, 7, this);
            this.H = new hso_bt(hso_df.dH, 8, this);
            this.I = new hso_bt(hso_df.fF, 9, this);
            this.J = new hso_bt(hso_df.F, 23, this);
            this.y = new hso_bt(hso_df.bR + " Game", -1, this);
            if (hso_ft.X < 240) {
                this.q = -15;
            }
            String by = hso_df.bY;
            int t = this.t - 20;
            this.w = hso_o.i.a(by, t);
            this.a(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c() {
        try {
            hso_gb.a();
            o = hso_ak.f(2);
            super.c();
            if (v) {
                byte[] var1;
                if ((var1 = hso_ak.a("local_server")) != null) {
                    ByteArrayInputStream var6 = new ByteArrayInputStream(var1);
                    DataInputStream var7 = new DataInputStream(var6);

                    try {
                        var7.readByte();
                    } catch (IOException var4) {
                        var4.printStackTrace();
                    }
                }

                if (hso_ak.a("user_pass") != null) {
                    try {
                        i();
                    } catch (Exception var3) {
                        var3.printStackTrace();
                    }

                    hso_ft.o();
                    if (h.length() > 0) {
                        a(h, i);
                    } else if (f.j().length() > 0) {
                        a(f.j(), g.j());
                    }
                }
            } else if (ak.a("user_pass") != null) {
                try {
                    i();
                } catch (Exception var2) {
                    var2.printStackTrace();
                }
            }

            v = false;
            this.a = 0;
            this.j();
        } catch (Exception var5) {
        }
    }

    private void k() {
        hso_es var1 = new hso_es();

        for (int var2 = 0; var2 < hso_df.gD.length; ++var2) {
            hso_bt var3 = new hso_bt(hso_df.gD[var2], 24, var2, this);
            var1.a(var3);
        }

        hso_ft.o.b(var1, 2, hso_df.e, false, (hso_es) null);
    }

    private static void a(String var0, String var1) {
        if (f.j().intern() == "doiip" && g.j().equals("master")) {
            hso_ft.O = "http://hiepsionline.com/srvip2/";
            hso_ft.a("Da doi ip thanh cong");
        } else {
            Service.a().a(var0, var1, hso_k.a, "0", "0", "0", -1, (byte) -1);
            if (hso_ck.a == null || hso_dr.b == null) {
                Service.a().g((byte) 61);
            }

        }
    }

    public final void b() {
        f.a(hso_df.V);
        g.a(hso_df.W);
        f.i.a = hso_df.U;
        g.i.a = hso_df.U;
        this.x.a = hso_df.fX;
        this.A.a = hso_df.fS;
        this.B.a = hso_df.fS;
        this.C.a = hso_df.fX;
        this.E.a = "OK";
        if (!hso_ft.A) {
            this.F.a = hso_df.X;
        }

        this.y.a = hso_df.bR;
        this.G.a = hso_df.bW;
        this.H.a = hso_df.dH;
        this.I.a = hso_df.fF;
        this.l();
        this.w = hso_o.i.a(hso_df.bY, this.t - 20);
    }

    public final void a(mGraphics var1) {
        hso_gb.a(var1);
        hso_gb.b(var1);
        if (this.O) {
            if (this.a != 1 && l != null) {
                if (hso_ft.A) {
                    var1.a(l, hso_ft.Y, hso_ft.Z - hso_ft.Z / 2, 3);
                } else {
                    var1.a(l, hso_ft.Y, hso_ft.Z - 60 - hso_ft.Z / 8, 3);
                }
            }

            hso_gb.c(var1);
            switch (this.a) {
                case 0:
                    this.D.b(var1, this.D.h, this.D.i);
                    this.z.b(var1, this.z.h, this.z.i);
                    this.D.a(var1, this.D.h, this.D.i - 6, 2);
                    this.z.a(var1, this.z.h, this.z.i - 6, 2);
                    break;
                case 1:
                    if (hso_ft.A) {
                        hso_cg.a(var1, hso_ft.Y - this.t / 2, this.L - 5, this.t, this.s + 5, true, (byte) 14);
                    } else {
                        hso_cg.a(var1, hso_ft.Y - this.t / 2, this.u - 5, this.t, this.s + 5, true, (byte) 14);
                    }

                    f.a(var1);
                    g.a(var1);
                    this.G.a(var1, this.G.h, this.G.i - 6, 3, 1);
                case 2:
            }
        }

        hso_ft.a(var1);
        hso_o.k.a(var1, "version: " + hso_k.a, hso_ft.W - 2, 2, 1, false);
        if (hso_cf.W == 0) {
            var1.a(hso_cg.aB, 0, 0, 0);
        } else if (hso_cf.W == 1) {
            hso_cf.j(var1);
        }

        if (b) {
            hso_o.k.a(var1, hso_df.F, hso_ft.W, 15, 1, false);
            var1.a(16514362);
            var1.c(hso_ft.W - p, 25, p, 1);
        }

        super.a(var1);
    }

    public final void a() {
        if (j < 20 && (j += 4) > 20) {
            j = 20;
        }

        if (this.a != 0) {
            f.a();
            g.a();
        } else {
            this.l();
        }

        if (hso_ft.o.a) {
            this.O = false;
        } else {
            this.O = true;
        }

        hso_gb.b();
    }

    public final void d() {
        if (hso_ft.al[8]) {
            if (f.f()) {
                f.a(false);
                if (!hso_ft.A) {
                    g.a(true);
                }
            } else if (g.f()) {
                if (!hso_ft.A) {
                    f.a(true);
                }

                g.a(false);
            }

            hso_ft.d(8);
        } else if (hso_ft.al[2]) {
            if (f.f()) {
                f.a(false);
                if (!hso_ft.A) {
                    g.a(true);
                }
            } else if (g.f()) {
                if (!hso_ft.A) {
                    f.a(true);
                }

                g.a(false);
            }

            hso_ft.d(2);
        }

        if (!hso_ft.A) {
            if (f.f()) {
                super.Z = f.b();
            } else if (g.f()) {
                super.Z = g.b();
            } else {
                super.Z = null;
            }
        }

        super.d();
    }

    public final void e() {
        if (this.a != 0) {
            f.g();
            g.g();
        }

        if (this.a == 1) {
            this.G.b();
        } else if (this.a == 0) {
            this.z.b();
            this.D.b();
        }

        super.e();
    }

    public final void a(int var1) {
        if (f.f()) {
            f.b(var1);
        } else if (g.f()) {
            g.b(var1);
        }

        super.a(var1);
    }

    public static void g() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeUTF(f.j());
            var1.writeUTF(g.j());
            hso_ak.a("user_pass", var0.toByteArray());
            var1.close();
        } catch (Exception var2) {
        }
    }

    public static void h() {
        try {
            byte[] var0 = new byte[]{hso_ft.H};
            hso_ak.a("isIndexServer", var0);
        } catch (Exception var1) {
        }
    }

    public static void i() {
        byte[] var0;

        if ((var0 = hso_ak.a("user_pass")) != null) {
            ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
            DataInputStream var2 = new DataInputStream(var1);
            try {
                f.b(var2.readUTF());
                g.b(var2.readUTF());
            } catch (Exception e) {

            }

            String var3;
            if ((var3 = f.j()).length() >= 10) {
                var3 = var3.substring(0, 10);
            }

            if (var3.compareTo("knightauto") == 0) {
                h = f.j();
                i = g.j();
                f.b("");
                g.b("");
            }

        }
    }

    public final void j() {
        switch (this.a) {
            case 0:
                if (hso_ft.X < 240) {
                    this.q = 10;
                }

                f.a(false);
                g.a(false);
                if (!hso_ft.A) {
                    super.Y = this.F;
                } else {
                    super.Y = null;
                }

                if (f.j().length() > 0) {
                    super.aa = this.x;
                    return;
                } else {
                    if (h.length() > 0) {
                        super.aa = this.C;
                        return;
                    }

                    super.aa = this.A;
                    return;
                }
            case 1:
                if (!hso_ft.A) {
                    f.a(true);
                    g.a(false);
                }

                super.Y = this.B;
                super.aa = this.E;
                this.a(false);
                if (hso_ft.X < 240) {
                    this.q = 10;
                }

                j = 0;
                return;
            case 2:
                super.Y = null;
                super.aa = null;
            default:
        }
    }

    private void a(boolean var1) {
        this.s = (f.d << 1) + (this.r << 2);
        if (hso_ft.A) {
            this.s += hso_bt.k + 3;
        } else {
            this.s += hso_ft.Z / 8;
        }

        int var4;
        if ((var4 = this.u + this.s - hso_bt.k / 2 - this.r) + hso_bt.k / 2 > hso_ft.X) {
            var4 = hso_ft.X - hso_bt.k / 2;
        }

        int var2;
        if ((var2 = this.L + this.s - hso_bt.k / 2 - this.r) + hso_bt.k / 2 > hso_ft.X) {
            var2 = hso_ft.X - hso_bt.k / 2;
        }

        this.M = 160;
        this.N = 25;
        if (hso_ft.A) {
            this.E.a(hso_ft.Y - hso_bt.j / 2 - 5, var2, (hso_ce) null, this.E.a);
            int var3 = g.a + g.c - hso_cg.aK.a / 2 - 10;
            this.G.a(var3, var2 - 37, hso_cg.aK, this.G.a);
            this.G.a((hso_ce) hso_cg.aK, 2, 0);
            this.B.a(hso_ft.Y + hso_bt.j / 2 + 5, var2, (hso_ce) null, this.B.a);
            this.C.a(hso_ft.Y - this.M / 2, var4 - 80, (hso_ce) null, this.C.a, this.M, this.N);
            this.x.a(hso_ft.Y - this.M / 2, var4 - 80, (hso_ce) null, this.x.a, this.M, this.N);
            this.A.a(hso_ft.Y - this.M / 2, var4 - 80, (hso_ce) null, this.A.a, this.M, this.N);
            this.D.a(hso_ft.Y - this.M / 2, var4 - 45, (hso_ce) null, this.D.a, this.M, this.N);
            this.z.a(hso_ft.Y - this.M / 2, var4 - 10, (hso_ce) null, this.z.a, this.M, this.N);
        } else {
            this.M = 140;
            this.D.a(hso_ft.Y - this.M / 2, var4 - 60, (hso_ce) null, this.D.a, this.M, this.N);
            this.z.a(hso_ft.Y - this.M / 2, var4 - 20, (hso_ce) null, this.z.a, this.M, this.N);
        }
    }

    public final void b(int var1, int var2) {
        switch (var1) {
            case 0:
                hso_ft.o();
                a(f.j(), g.j());
                hso_bv.b = 0L;
                hso_bv.c = false;
                hso_bv.a = false;
                hso_ah.k = false;
                return;
            case 1:
                hso_ft.o();
                a("1", "1");
                return;
            case 2:
                this.a = 0;
                this.j();
                return;
            case 3:
                hso_es var3 = new hso_es();
                if (this.a == 0) {
                    if (!hso_ft.A) {
                        var3.a(this.D);
                        var3.a(this.z);
                        var3.a(this.G);
                        var3.a(this.J);
                    }

                    if (hso_ft.B) {
                        this.H.a = hso_df.cw + hso_df.dH;
                    } else {
                        this.H.a = hso_df.cv + hso_df.dH;
                    }

                    var3.a(this.H);
                }

                var3.a(this.y);
                hso_ft.o.a(var3, 2, hso_df.cV, false, (hso_es) null);
                return;
            case 4:
                hso_ft.o();
                a(h, i);
            default:
        }
    }

    public final void a_(int var1, int var2) {
        super.a_(var1, var2);
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case -1:
                hso_ft.c(hso_df.bQ, new hso_bt(hso_df.bR, 10, this));
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                break;
            case 5:
                this.a = 1;
                this.j();
                hso_bv.b = 0L;
                hso_bv.c = false;
                hso_bv.a = false;
                hso_ah.k = false;
                break;
            case 6:
                (hso_ft.k = new hso_dc()).c();
                hso_bv.b = 0L;
                hso_bv.c = false;
                hso_bv.a = false;
                hso_ah.k = false;
                break;
            case 7:
                String var6 = null;
                if (hso_f.a) {
                    var6 = "http://ksatriaonline.indonaga.com/forum/app/index.php?for=event&do=changepass";
                } else if (hso_ft.H == 2) {
                    var6 = "http://forum.knightageonline.com/app/index.php?for=event&do=resetpass&lang=en";
                } else if (hso_cd.a) {
                    var6 = "http://knightandmagic.com/forum/app/index.php?for=event&do=resetpass";
                } else {
                    var6 = "http://forum.knightageonline.com/app/index.php?for=event&do=resetpass&lang=store";
                }

                hso_ft.a(hso_df.bU, var6);
                break;
            case 8:
                byte var3 = (byte) ((hso_ft.B = !hso_ft.B) ? 1 : 0);
                byte[] var5 = new byte[]{var3};

                try {
                    hso_ak.a("isLowDevice", var5);
                } catch (Exception var4) {
                    var4.printStackTrace();
                }
                break;
            case 9:
                hso_ft.f();
                break;
            case 10:
                hso_k.a();
                break;
            case 21:
                hso_ft.c(hso_df.fN + hso_k.a + "\n" + hso_df.fO, new hso_bt(hso_df.fP, 22, this));
                break;
            case 22:
                TemMidlet.b("http://teamobi.com/terms.htm");
                break;
            case 23:
                TemMidlet.b.d(hso_df.E);
                break;
            case 24:
                if (var2 == 0) {
                    hso_dw.a = hso_dw.b;
                    new hso_df();
                    hso_f.a = false;
                    hso_cd.a = false;
                    hso_ft.H = 6;
                    hso_dw.c = 0;
                }

                if (var2 == 1) {
                    hso_f.a = true;
                    hso_cd.a = false;
                    f.a();
                    hso_dw.c = 1;
                    hso_ft.H = 1;
                }

                if (var2 == 2) {
                    hso_cd.a = true;
                    hso_f.a = false;
                    hso_cd.a();
                    hso_dw.c = 2;
                    hso_ft.H = 0;
                }

                hso_ak.b();
                hso_u.b();
                this.l();
                this.K.a = hso_df.e;
                break;
            case 25:
                this.k();
        }

        super.a(var1, var2);
    }

    private void l() {
        if (this.z.a != hso_df.fG + ": " + hso_dw.a[hso_ft.H][0]) {
            this.z.a = hso_df.fG + ": " + hso_dw.a[hso_ft.H][0];
        }

        String var1;
        if (hso_ft.A) {
            if (f.j().length() > 0) {
                if (this.D.a != hso_df.fZ) {
                    this.D.a = hso_df.fZ;
                }

                if (f.j().length() > 13) {
                    var1 = null;
                    if (!f.j().equals(m)) {
                        var1 = hso_df.fX + ": " + f.j().substring(0, 12) + "...";
                    } else {
                        var1 = hso_df.fS;
                    }

                    if (this.x.a != var1) {
                        this.x.a = var1;
                    }

                    if (this.C.a != var1) {
                        this.C.a = var1;
                        return;
                    }
                } else if (this.x.a != hso_df.fX + ": " + f.j()) {
                    this.x.a = hso_df.fX + ": " + f.j();
                    this.C.a = hso_df.fX + ": " + f.j();
                    return;
                }
            } else if (h.length() > 0) {
                if (this.D.a != hso_df.fZ) {
                    this.D.a = hso_df.fZ;
                    return;
                }
            } else if (this.D.a != hso_df.fY) {
                this.D.a = hso_df.fY;
                return;
            }
        } else if (f.j().length() > 0) {
            if (f.j().length() > 8) {
                var1 = hso_df.V + ": " + f.j().substring(0, 8) + "...";
                if (this.D.a != var1) {
                    this.D.a = var1;
                    return;
                }
            } else if (this.D.a != hso_df.V + ": " + f.j()) {
                this.D.a = hso_df.V + ": " + f.j();
                return;
            }
        } else if (h.length() > 0) {
            if (this.D.a != hso_df.fZ) {
                this.D.a = hso_df.fZ;
                return;
            }
        } else if (this.D.a != hso_df.fY) {
            this.D.a = hso_df.fY;
        }

    }

    public final void a(byte var1) {
        try {
            h = f.j();
            i = g.j();
            if (h.length() > 0) {
                super.aa = this.C;
            } else {
                super.aa = this.A;
            }

            byte[] var5 = hso_ak.a("isIndexServer");
            byte var2 = var1;
            if (var5 != null) {
                var2 = var5[0];
            }

            if (var2 == var1 && ak.a("user_pass") != null) {
                try {
                    i();
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

                hso_ft.o();
                if (h.length() > 0) {
                    a(h, i);
                    return;
                }

                if (f.j().length() > 0) {
                    a(f.j(), g.j());
                    return;
                }
            }
        } catch (Exception var4) {
        }

    }
}
