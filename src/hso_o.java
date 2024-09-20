
import java.io.DataInputStream;

public final class hso_o {

    private int s;
    private int t;
    private hso_aq u;
    private String v;
    private int[][] w;
    private static String x = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
    public static hso_o a;
    public static hso_o b;
    public static hso_o c;
    public static hso_o d;
    public static hso_o e;
    public static hso_o f;
    public static hso_o g;
    public static hso_o h;
    public static hso_o i;
    public static hso_o j;
    public static hso_o k;
    public static hso_o l;
    public static hso_o m;
    public static hso_o n;
    public static hso_o o;
    public static hso_o p;
    public static hso_o q;
    public static hso_o r;
    private String y;

    public static void a() {
        a = new hso_o(x, "/mfont/tahoma_7b_orange.png", "/mfont/tahoma_7b", 0);
        b = new hso_o(x, "/mfont/tahoma_7b_blue.png", "/mfont/tahoma_7b", 0);
        c = new hso_o(x, "/mfont/tahoma_7b_black.png", "/mfont/tahoma_7b", 0);
        d = new hso_o(x, "/mfont/tahoma_7b_yellow.png", "/mfont/tahoma_7b", 0);
        e = new hso_o(x, "/mfont/tahoma_7b_violet.png", "/mfont/tahoma_7b", 0);
        f = new hso_o(x, "/mfont/tahoma_7b_white.png", "/mfont/tahoma_7b", 0);
        g = new hso_o(x, "/mfont/tahoma_7b_green.png", "/mfont/tahoma_7b", 0);
        new hso_o(x, "/mfont/tahoma_7b_brown.png", "/mfont/tahoma_7b", 0);
        h = new hso_o(x, "/mfont/tahoma_7b_red.png", "/mfont/tahoma_7b", 0);
        i = new hso_o(x, "/mfont/tahoma_7_black.png", "/mfont/tahoma_7", 0);
        j = new hso_o(x, "/mfont/tahoma_7_white.png", "/mfont/tahoma_7", 0);
        k = new hso_o(x, "/mfont/tahoma_7_yellow.png", "/mfont/tahoma_7", 0);
        l = new hso_o(x, "/mfont/tahoma_7_orange.png", "/mfont/tahoma_7", 0);
        m = new hso_o(x, "/mfont/tahoma_7_red.png", "/mfont/tahoma_7", 0);
        n = new hso_o(x, "/mfont/tahoma_7_blue.png", "/mfont/tahoma_7", 0);
        o = new hso_o(x, "/mfont/tahoma_7_green.png", "/mfont/tahoma_7", 0);
        p = new hso_o(x, "/mfont/tahoma_7_violet.png", "/mfont/tahoma_7", 0);
        r = new hso_o(x, "/mfont/tahoma_7_gray.png", "/mfont/tahoma_7", 0);
        new hso_o(" 0123456789+-", "/mfont/number_yellow.png", "/mfont/number", 0);
        new hso_o(" 0123456789+-", "/mfont/number_red.png", "/mfont/number", 0);
        new hso_o(" 0123456789+-", "/mfont/number_green.png", "/mfont/number", 0);
        new hso_o(" 0123456789+-", "/mfont/number_white.png", "/mfont/number", 0);
        new hso_o(" 0123456789+-", "/mfont/number_orange.png", "/mfont/number", 0);
        q = new hso_o(" 0123456789+-", "/mfont/number_yellow.png", "/mfont/number", 0);
    }

    private hso_o(String var1, String var2, String var3, int var4) {
        try {
            this.v = var1;
            this.s = 0;
            this.y = var2;
            var1 = null;
            this.u = hso_aq.a(this.y);
            DataInputStream var9 = hso_aq.b(var3);
            try {
                this.w = new int[var9.readShort()][];

                for (int var10 = 0; var10 < this.w.length; ++var10) {
                    this.w[var10] = new int[4];
                    this.w[var10][0] = var9.readShort();
                    this.w[var10][1] = var9.readShort();
                    this.w[var10][2] = var9.readShort();
                    this.w[var10][3] = var9.readShort();
                }

                int var8 = this.w[this.w.length - 1][3];
                this.t = var8;
            } catch (Exception var6) {
                try {
                    var9.close();
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            hso_dw.a("paht data:" + var2);
        }
    }

    public final int a(String var1) {
        int var3 = 0;

        for (int var4 = 0; var4 < var1.length(); ++var4) {
            int var2;
            if ((var2 = this.v.indexOf(var1.charAt(var4))) == -1) {
                var2 = 0;
            }

            var3 += this.w[var2][2] + this.s;
        }

        return var3;
    }

    public final void a(mGraphics var1, String var2, int var3, int dy, int dx, boolean var6) {
        int var8 = var2.length();
        switch (dx) {
            case 0:
                dx = var3;
                break;
            case 1:
                dx = var3 - this.a(var2);
                break;
            default:
                dx = var3 - (this.a(var2) >> 1);
                break;
        }

        for (int var7 = 0; var7 < var8; ++var7) {
            if ((var3 = this.v.indexOf(var2.charAt(var7))) == -1) {
                var3 = 0;
            }

            if (var3 > -1) {
                var1.a(this.u, this.w[var3][0], this.w[var3][1], this.w[var3][2], this.w[var3][3], 0, dx, dy, 20);
            }

            dx += this.w[var3][2] + this.s;
        }
    }

    public static String[] a(String var0, String var1) {
        hso_es var2 = new hso_es("mFont nodes");

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

    public final String[] a(String var1, int var2) {
        var2 = var2;
        var1 = var1;
        hso_o var7 = this;
        hso_es var3 = new hso_es("mFont lines");
        String var4 = "";

        for (int var5 = 0; var5 < var1.length(); ++var5) {
            if (var1.charAt(var5) == '\n') {
                var3.a(var4);
                var4 = "";
            } else {
                var4 = var4 + var1.charAt(var5);
                if (var7.a(var4) > var2) {
                    boolean var6 = false;

                    int var10;
                    for (var10 = var4.length() - 1; var10 >= 0 && var4.charAt(var10) != ' '; --var10) {
                    }

                    if (var10 < 0) {
                        var10 = var4.length() - 1;
                    }

                    var3.a(var4.substring(0, var10));
                    var5 = var5 - (var4.length() - var10) + 1;
                    var4 = "";
                }

                if (var5 == var1.length() - 1 && !var4.trim().equals("")) {
                    var3.a(var4);
                }
            }
        }

        hso_es var8 = var3;
        String[] var9 = new String[var3.c()];

        for (var2 = 0; var2 < var8.c(); ++var2) {
            var9[var2] = var8.a(var2).toString();
        }

        return var9;
    }
}
