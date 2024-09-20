
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;

public final class hso_fi extends hso_cg {

    public int a;
    public int b;
    public int c;
    private int l = 0;
    public int d;
    public boolean e;
    private boolean m = false;
    public boolean f = true;
    private static int n = 1;
    private static int[] o = new int[]{18, 14, 11, 9, 6, 4, 2};
    private static String[] p = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2âă", "def3đê", "ghi4", "jkl5", "mno6ôơ", "pqrs7", "tuv8ư", "wxyz9", "*", "#"};
    private static String[] q = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
    private static String[] r = new String[]{" 0", "er1", "ty2", "ui3", "df4", "gh5", "jk6", "cv7", "bn8", "m9", "0", "0", "qw!", "as?", "zx", "op.", "l,"};
    private String s = "";
    private String t = "";
    private String u = "";
    public int g = 0;
    private int v = 0;
    private int w = 500;
    private int x = 0;
    private static int y = -1984;
    private int z = 0;
    private int A = 0;
    private int B = 10;
    private int C = 0;
    public static boolean h;
    private static int D = 0;
    private static int E;
    private static int F;
    public hso_bt i;
    private String G = "";
    public String j = "";
    private String H = "";
    private int I = 0;
    public static boolean k;
    private int J = -1;
    private int K = 0;
    private int L = 0;
    private long M = 0L;
    private static String N;
    private int O = 0;
    private static int[][] P;

    static {
        String[] var10000 = new String[]{"abc", "Abc", "ABC", "123"};
        E = 11;
        k = false;
        N = "aáàảãạâấầẩẫậăắằẳẵặeéèẻẽẹêếềểễệiíìỉĩịoóòỏõọôốồổỗộơớờởỡợuúùủũụưứừửữựyýỳỷỹỵ";
        P = new int[][]{{32, 48}, {49, 69}, {50, 84}, {51, 85}, {52, 68}, {53, 71}, {54, 74}, {55, 67}, {56, 66}, {57, 77}, {42, 128}, {35, 137}, {33, 113}, {63, 97}, {64, 121, 122}, {46, 111}, {44, 108}};
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                if (this.e) {
                    this.m();
                }
            default:
        }
    }

    public static void a(int var0) {
        p[0] = " 0";
        p[10] = "*";
        p[11] = "#";
        E = 35;
        F = 42;
    }

    public final void a(boolean var1) {
        if (this.e != var1) {
            D = 0;
        }

        y = -1984;
        hso_ft.p();
        this.e = var1;
    }

    public final hso_bt b() {
        return this.i;
    }

    public static int c() {
        return hso_ft.A ? 28 : 20;
    }

    private void k() {
        this.i = new hso_bt(hso_df.U, 0, this);
    }

    public hso_fi() {
        this.s = "";
        this.k();
        this.a(false);
        this.l();
    }

    public hso_fi(int var1, int var2, int var3) {
        this.s = "";
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.l = 0;
        this.k();
        this.a(false);
        this.l();
    }

    public hso_fi(int var1, int var2, int var3, int var4) {
        this.s = "";
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.l = 40;
        this.k();
        this.a(false);
        this.l();
    }

    private void l() {
        this.d = 20;
        if (hso_ft.A) {
            this.d = 28;
        }

    }

    public final void a(String var1) {
        this.H = var1;
    }

    private void m() {
        if (this.g > 0 && this.s.length() > 0) {
            this.s = this.s.substring(0, this.g - 1) + this.s.substring(this.g, this.s.length());
            --this.g;
            this.f(0);
            this.o();
        }

    }

    private void f(int var1) {
        if (this.C == 2) {
            this.u = this.t;
        } else {
            this.u = this.s;
        }

        int var2 = hso_o.i.a(this.u.substring(0, this.g));
        if (var1 == -1) {
            if (var2 + this.x < 15 && this.g > 0 && this.g < this.u.length()) {
                this.x += hso_o.i.a(this.u.substring(this.g, this.g + 1));
            }
        } else if (var1 == 1) {
            if (var2 + this.x > this.c - 25 && this.g < this.u.length() && this.g > 0) {
                this.x -= hso_o.i.a(this.u.substring(this.g - 1, this.g));
            }
        } else {
            this.x = -(var2 - (this.c - 12));
        }

        if (this.x > 0) {
            this.x = 0;
        } else {
            if (this.x < 0) {
                var1 = hso_o.i.a(this.u) - (this.c - 12);
                if (this.x < -var1) {
                    this.x = -var1;
                }
            }

        }
    }

    private void g(int var1) {
        if (this.C != 2 && this.C != 3 || var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122) {
            if (this.s.length() < this.w) {
                String var2 = this.s.substring(0, this.g) + (char) var1;
                if (this.g < this.s.length()) {
                    var2 = var2 + this.s.substring(this.g, this.s.length());
                }

                this.s = var2;
                ++this.g;
                this.o();
                this.f(0);
            }

        }
    }

    public final boolean b(int var1) {
        if (var1 != 8 && var1 != -8 && var1 != 204) {
            if (!hso_ft.A && var1 >= 65 && var1 <= 122) {
                h = true;
                byte[] var2 = new byte[]{1};

                try {
                    hso_ak.a("isQty", var2);
                } catch (Exception var4) {
                    var4.printStackTrace();
                }
            }

            if (h) {
                if (var1 == 45) {
                    if (var1 == y && this.z < o[n]) {
                        this.s = this.s.substring(0, this.g - 1) + '_';
                        this.u = this.s;
                        this.o();
                        this.f(0);
                        y = -1984;
                        return false;
                    }

                    y = 45;
                }

                if (var1 >= 32) {
                    this.g(var1);
                    return false;
                }
            }

            if (!h && var1 == E) {
                if (++D > 3) {
                    D = 0;
                }

                y = E;
                hso_ft.p();
                this.z = 1;
                y = var1;
                return false;
            } else if (var1 == F && this.C == 0) {
                this.n();
                return false;
            } else {
                if (var1 == 42) {
                    var1 = 58;
                }

                if (var1 == 35) {
                    var1 = 59;
                }

                if (var1 >= 48 && var1 <= 59) {
                    hso_fi var5;
                    if ((var5 = this).C != 0 && var5.C != 2 && var5.C != 3) {
                        if (var5.C == 1) {
                            var5.g(var1);
                            var5.z = 1;
                        }
                    } else {
                        String[] var6 = null;
                        if (var5.C != 2 && var5.C != 3) {
                            var6 = p;
                        } else {
                            var6 = q;
                        }

                        char var3;
                        String var7;
                        if (var1 == y) {
                            var5.A = (var5.A + 1) % var6[var1 - 48].length();
                            var3 = var6[var1 - 48].charAt(var5.A);
                            if (D == 0) {
                                var3 = Character.toLowerCase(var3);
                            } else if (D == 1) {
                                var3 = Character.toUpperCase(var3);
                            } else if (D == 2) {
                                var3 = Character.toUpperCase(var3);
                            } else {
                                var3 = var6[var1 - 48].charAt(var6[var1 - 48].length() - 1);
                            }

                            var7 = var5.s.substring(0, var5.g - 1) + var3;
                            if (var5.g < var5.s.length()) {
                                var7 = var7 + var5.s.substring(var5.g, var5.s.length());
                            }

                            var5.s = var7;
                            var5.z = o[n];
                            var5.o();
                        } else if (var5.s.length() < var5.w) {
                            if (D == 1 && y != -1984) {
                                D = 0;
                            }

                            var5.A = 0;
                            var3 = var6[var1 - 48].charAt(var5.A);
                            switch (D) {
                                case 0:
                                    var3 = Character.toLowerCase(var3);
                                    break;
                                case 1:
                                    var3 = Character.toUpperCase(var3);
                                    break;
                                case 2:
                                    var3 = Character.toUpperCase(var3);
                                    break;
                                default:
                                    var3 = var6[var1 - 48].charAt(var6[var1 - 48].length() - 1);
                                    break;
                            }

                            var7 = var5.s.substring(0, var5.g) + var3;
                            if (var5.g < var5.s.length()) {
                                var7 = var7 + var5.s.substring(var5.g, var5.s.length());
                            }

                            var5.s = var7;
                            var5.z = o[n];
                            ++var5.g;
                            var5.o();
                            var5.f(0);
                        }

                        y = var1;
                    }
                } else {
                    this.A = 0;
                    y = -1984;
                    switch (var1) {
                        case 14:
                            if (this.g > 0) {
                                --this.g;
                                this.f(0);
                                this.B = 10;
                                return false;
                            }
                            break;
                        case 15:
                            if (this.g < this.s.length()) {
                                ++this.g;
                                this.f(0);
                                this.B = 10;
                                return false;
                            }
                            break;
                        default:
                            if (var1 == 19) {
                                this.m();
                                return false;
                            }
                            y = var1;
                            break;
                    }
                }

                return true;
            }
        } else {
            this.m();
            return true;
        }
    }

    private void n() {
        this.M = hso_dw.a() / 100L;
        if (this.J != -1) {
            ++this.L;
            if (this.L >= 6) {
                this.L = 0;
            }

            String var5 = this.s.substring(0, this.J);
            String var6 = this.s.substring(this.J + 1);
            String var7 = N.substring(this.K + this.L, this.K + this.L + 1);
            this.s = var5 + var7 + var6;
        } else {
            for (int var1 = this.g; var1 > 0; --var1) {
                char var2 = this.s.charAt(var1 - 1);

                for (int var3 = 0; var3 < N.length(); ++var3) {
                    char var4 = N.charAt(var3);
                    if (var2 == var4) {
                        this.K = var3;
                        this.L = 0;
                        this.J = var1 - 1;
                        return;
                    }
                }
            }

            this.J = -1;
        }
    }

    public final void b(mGraphics var1) {
        boolean var2 = this.e;
        hso_o var3 = hso_o.i;
        byte var4 = 0;
        if (this.C == 2) {
            this.u = this.t;
            var4 = 3;
        } else {
            this.u = this.s;
        }

        int var5 = 0;
        var1.a(12621920);
        ++this.O;
        if (var2 && this.u.length() > 0 && this.g > 0) {
            var5 = hso_o.i.a(this.u.substring(0, this.g));
        }

        hso_cg.a(var1, this.a, this.b, this.c, this.d + 2, var2);
        if (this.u.length() == 0) {
            var4 = 0;
            this.u = this.H;
            var3 = hso_o.j;
        }

        var3.a(var1, this.u, this.a + 4, this.b + this.d / 2 - 5 + var4, 0, true);
        if (var2 && this.O % 16 > 12) {
            var1.a(0);
            var1.c(this.a + 3 + var5, this.b + this.d / 2 - 7, 1, 14);
        }

    }

    public final void a(mGraphics var1) {
        boolean var2 = this.e;
        hso_o var3 = hso_o.i;
        byte var4 = 0;
        if (this.C == 2) {
            this.u = this.t;
            var4 = 3;
        } else {
            this.u = this.s;
        }

        int var5 = 0;
        var1.a(12621920);
        ++this.O;
        if (var2 && this.u.length() > 0 && this.g > 0) {
            var5 = hso_o.i.a(this.u.substring(0, this.g));
        }

        hso_cg.a(var1, this.a, this.b, this.c, this.d + 2, var2);
        var1.d(this.a + 2, this.b + 2, this.c - 4, this.d - 3);
        int var6 = var1.a();
        int var7 = var1.b();
        var1.a(-this.I, 0);
        if (this.u.length() == 0) {
            var4 = 0;
            this.u = this.H;
            var3 = hso_o.j;
        }

        var3.a(var1, this.u, this.a + 4, this.b + this.d / 2 - 5 + var4, 0, true);
        if (var2 && this.O % 16 > 12) {
            var1.a(0);
            var1.c(this.a + 3 + var5, this.b + this.d / 2 - 7, 1, 14);
        }

        var1.d(0, 0, hso_ft.W, hso_ft.X);
        hso_ft.a(var1);
        var1.a(var6, var7);
    }

    public final boolean f() {
        return this.e;
    }

    private void o() {
        if (this.C == 2) {
            this.t = "";

            for (int var1 = 0; var1 < this.s.length(); ++var1) {
                this.t = this.t + "*";
            }

            if (this.z > 0 && this.g > 0) {
                this.t = this.t.substring(0, this.g - 1) + this.s.charAt(this.g - 1) + this.t.substring(this.g, this.t.length());
            }
        }

    }

    public final void g() {
        if (hso_ft.S && hso_ft.c(0, 0, hso_ft.W, hso_ft.X - hso_ft.aa / 2)) {
            if (hso_ft.c(this.a, this.b - 6, this.c - this.l, this.d + 12)) {
                if (!this.e) {
                    this.e = true;
                    if (!k) {
                        k = true;
                        hso_ft.S = false;
                        this.p();
                        return;
                    }
                } else if (!k) {
                    k = true;
                    hso_ft.S = false;
                    this.p();
                    return;
                }
            } else if (this.f) {
                this.e = false;
            }
        }

    }

    public final void a() {
        label66:
        {
            if (this.e) {
                String var1;
                if (this.C == 2) {
                    var1 = this.t;
                } else {
                    var1 = this.s;
                }

                this.I = -this.c / 2 + this.g * 5 + 4;
                int var2 = hso_o.i.a(var1) - this.c + 8;
                if (this.I > var2) {
                    this.I = var2;
                }

                if (this.I >= 0) {
                    break label66;
                }
            }

            this.I = 0;
        }

        ++this.v;
        if (this.z > 0) {
            --this.z;
            if (this.z == 0 || D > 2) {
                this.A = 0;
                if (this.e && D == 1 && y != E) {
                    D = 0;
                }

                y = -1984;
                this.o();
            }
        }

        if (this.B > 0) {
            --this.B;
        }

        if (this.J != -1 && hso_dw.a() / 100L - this.M > 5L) {
            this.J = -1;
        }

        if (this.e) {
            if (hso_ft.ak[4]) {
                --this.g;
                if (this.g < 0) {
                    this.g = 0;
                }

                this.f(-1);
                hso_ft.ak[4] = false;
                return;
            }

            if (hso_ft.ak[6]) {
                ++this.g;
                if (this.g > this.s.length()) {
                    this.g = this.s.length();
                }

                this.f(1);
                hso_ft.ak[6] = false;
            }
        }

    }

    public final void h() {
        if (!this.e) {
            this.e = true;
            if (!k) {
                k = true;
                hso_ft.S = false;
                this.p();
                return;
            }
        } else if (!k) {
            k = true;
            hso_ft.S = false;
            this.p();
            return;
        }

    }

    public final void i() {
        this.e = true;
        k = true;
        hso_ft.S = false;
        this.p();
    }

    public final String j() {
        return this.s;
    }

    public final void b(String var1) {
        if (var1 != null) {
            y = -1984;
            this.z = 0;
            this.A = 0;
            this.s = var1;
            this.u = var1;
            this.o();
            this.g = var1.length();
            this.f(0);
        }
    }

    public final void c(int var1) {
        this.w = var1;
    }

    public final void d(int var1) {
        this.C = var1;
    }

    private void p() {
        TextBox var1;
        (var1 = new TextBox(this.j, this.G, 200, 0)).addCommand(new Command("OK", 4, 0));
        var1.addCommand(new Command("Cancel", 3, 0));
        var1.setCommandListener(new hso_g(this, var1));

        try {
            if (this.C == 2) {
                var1.setConstraints(65536);
            } else if (this.C == 1) {
                var1.setConstraints(2);
            } else {
                var1.setConstraints(0);
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        var1.setString(this.s);
        var1.setMaxSize(this.w);
        Display.getDisplay(TemMidlet.b).setCurrent(var1);
    }
}
