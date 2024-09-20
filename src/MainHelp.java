
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class MainHelp extends hso_cg {

    public int a = -1;
    public int b = -5;
    private int e = -2;
    private int f = 0;
    public int c = 0;
    private hso_bt g;
    private hso_bt h;
    public hso_en d;
    private hso_ce i;
    private String[] j;
    private static int[] k = new int[]{-13427660, -16788};
    private boolean l;

    public MainHelp() {
        this.g = new hso_bt(hso_df.aa, 0, this);
        this.h = new hso_bt(hso_df.ga, 0, this);
    }

    public final void b() {
        this.g.a = hso_df.aa;
        this.h.a = hso_df.ga;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                ++this.b;
                this.g();
                return;
            case 1:
                hso_ft.k();
                this.d = null;
                this.a = -1;
                this.b = 0;
                this.g();
                this.c();
            default:
        }
    }

    public final void a(byte[] var1) {
        if (var1 == null) {
            this.a = 0;
            this.b = -5;
        }
    }

    public final void b(byte[] var1) {
        this.d = null;
        if (var1 == null) {
            this.a = 0;
            this.b = -5;
        } else {
            ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
            DataInputStream var4 = new DataInputStream(var3);

            try {
                this.a = var4.readByte();
                this.b = var4.readByte();
            } catch (Exception var2) {
                this.a = -1;
                this.b = 0;
            }

            if (hso_ft.a != hso_ft.d) {
                this.g();
            }

        }
    }

    public final void c() {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        DataOutputStream var2 = new DataOutputStream(var1);

        try {
            var2.writeByte(this.a);
            var2.writeByte(this.b);
            hso_ak.a((byte) 1, var1.toByteArray());
            var2.close();
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public static void a(byte var0, byte var1) {
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);

        try {
            var4.writeByte(0);
            var4.writeByte(0);
            hso_ak.a((byte) 1, var3.toByteArray());
            var4.close();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public final void f() {
        ++this.a;
        this.b = 0;
    }

    public final void g() {
        try {
            if (hso_ft.p.d == 0) {
                if (!GameScreen.M) {
                    boolean var10000;
                    label624:
                    {
                        this.g.a = hso_df.aa;
                        this.e = -2;
                        switch (this.a) {
                            case 0:
                                if (this.b == 0) {
                                    var10000 = true;
                                    break label624;
                                }
                                break;
                            case 1:
                                if (this.b != 1 && this.b != 9) {
                                    break;
                                }

                                var10000 = true;
                                break label624;
                            case 2:
                                if (this.b != 4 && this.b != 9) {
                                    break;
                                }

                                var10000 = true;
                                break label624;
                            case 3:
                                if (this.b == 4 || this.b == 8) {
                                    var10000 = true;
                                    break label624;
                                }
                            case 4:
                            default:
                                break;
                            case 5:
                                if (this.b != 0 && this.b != 8) {
                                    break;
                                }

                                var10000 = true;
                                break label624;
                            case 6:
                                if (this.b != 2 && this.b != 0) {
                                    break;
                                }

                                var10000 = true;
                                break label624;
                            case 7:
                                if (this.b != 6 && this.b != 9) {
                                    break;
                                }

                                var10000 = true;
                                break label624;
                            case 8:
                                if (this.b != 7 && this.b != 10) {
                                    break;
                                }

                                var10000 = true;
                                break label624;
                            case 9:
                                if (this.b == 1 || this.b == 7) {
                                    var10000 = true;
                                    break label624;
                                }
                        }

                        var10000 = false;
                    }

                    if (var10000) {
                        this.c();
                    }

                    if (!hso_ft.D && !hso_f.a) {
                        if (this.a == 0 && this.b == 1) {
                            this.a = 0;
                            this.b = 2;
                            this.c();
                        }

                        if (this.a == 1 && this.b == 8) {
                            this.a = 1;
                            this.b = 9;
                            this.c();
                        }

                        if (this.a == 2 && this.b == 6) {
                            this.a = 2;
                            this.b = 7;
                            this.c();
                        }

                        if (this.a == 2 && this.b == 11) {
                            this.a = 4;
                            this.b = 9;
                            this.c();
                        }

                        if (this.a == 7 && this.b == 1) {
                            this.a = 8;
                            this.b = 0;
                            this.c();
                        }

                        if (this.a == 6 && this.b == 1) {
                            this.a = 6;
                            this.b = 2;
                            this.c();
                        }
                    }

                    String[][] var1 = hso_df.gG;
                    int var2;
                    hso_en var13;
                    if (hso_ft.A) {
                        label587:
                        {
                            hso_ah var7;
                            switch (this.a) {
                                case 0:
                                    if (this.b == 2) {
                                        hso_ft.k();
                                        if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                            (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_cf.e - 45, hso_cf.f - hso_cf.j - 5, 2, 90);
                                            hso_ft.r = var7;
                                        }

                                        return;
                                    }

                                    if (this.b != 3) {
                                        break label587;
                                    }
                                    break;
                                case 1:
                                    if (this.b == 0) {
                                        hso_ft.k();
                                        if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                            (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_cf.D - 40, hso_cf.E - 40, 2, 80);
                                            hso_ft.r = var7;
                                        }

                                        return;
                                    }

                                    if (this.b == 8) {
                                        hso_ft.k();
                                        if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                            (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_cf.B[0][0], hso_cf.B[0][1] + 22, 3, 90);
                                            hso_ft.r = var7;
                                        }

                                        return;
                                    }

                                    if (this.b == 9) {
                                        hso_ft.k();
                                        if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                            this.d = new hso_en();
                                            this.d.a = hso_cf.B[0][0];
                                            this.d.e = 80;
                                            this.j = hso_o.i.a(hso_df.gH[this.a][this.b], this.d.e);
                                            this.d.f = this.j.length * hso_ft.ab;
                                            this.d.b = hso_cf.B[0][1] + 22 + this.d.f;
                                            this.d.o = 3;
                                            this.d.m = 1;
                                            this.d.p = 1;
                                        }

                                        return;
                                    }
                                    break label587;
                                case 2:
                                    switch (this.b) {
                                        case 2:
                                        case 3:
                                        case 7:
                                            var1 = hso_df.gH;
                                            break label587;
                                        case 4:
                                        case 9:
                                        case 10:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                this.d = new hso_en();
                                                this.d.a = hso_fl.g().L + hso_fl.aM + (hso_fl.aN << 2);
                                                this.d.e = 80;
                                                this.j = hso_o.i.a(hso_df.gH[this.a][this.b], this.d.e);
                                                this.d.f = this.j.length * hso_ft.ab;
                                                var13 = this.d;
                                                hso_fl.g();
                                                var13.b = 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + this.d.f;
                                                this.d.o = 3;
                                                this.d.m = 1;
                                                this.d.p = 1;
                                            }

                                            this.e = 0;
                                            return;
                                        case 5:
                                        case 6:
                                        case 8:
                                        default:
                                            break label587;
                                    }
                                case 3:
                                    switch (this.b) {
                                        case 4:
                                            if (!hso_ft.D && !hso_f.a) {
                                                hso_ft.k();
                                                int var10 = 3;

                                                for (var2 = 0; var2 < hso_bw.V.c(); ++var2) {
                                                    if (((hso_j) hso_bw.V.a(var2)).u == 3) {
                                                        var10 = var2 + 1;
                                                        break;
                                                    }
                                                }

                                                hso_dw.a("index " + var10);
                                                if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                    this.d = new hso_en();
                                                    int var10002 = hso_fl.aM * var10;
                                                    this.d.a = hso_fl.g().L + var10002 - 40 + (hso_fl.aN << 2);
                                                    this.d.e = 80;
                                                    this.j = hso_o.i.a(hso_df.gH[this.a][this.b], this.d.e);
                                                    this.d.f = this.j.length * hso_ft.ab;
                                                    var13 = this.d;
                                                    hso_fl.g();
                                                    var13.b = 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + this.d.f;
                                                    this.d.o = 5;
                                                    this.d.m = 1;
                                                    this.d.p = 1;
                                                }

                                                this.e = 0;
                                                return;
                                            }

                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                this.d = new hso_en();
                                                this.d.a = hso_fl.g().L + hso_fl.aM * 3 - 40 + (hso_fl.aN << 2);
                                                this.d.e = 80;
                                                this.j = hso_o.i.a(hso_df.gH[this.a][this.b], this.d.e);
                                                this.d.f = this.j.length * hso_ft.ab;
                                                var13 = this.d;
                                                hso_fl.g();
                                                var13.b = 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + this.d.f;
                                                this.d.o = 5;
                                                this.d.m = 1;
                                                this.d.p = 1;
                                            }

                                            this.e = 0;
                                            return;
                                        case 5:
                                        case 6:
                                        case 7:
                                        default:
                                            break label587;
                                        case 8:
                                            var1 = hso_df.gH;
                                            break label587;
                                    }
                                case 4:
                                    if (this.b == 9) {
                                        hso_ft.k();
                                        if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                            this.d = new hso_en();
                                            this.d.a = hso_eu.g;
                                            this.d.b = hso_eu.h - hso_bt.k;
                                            this.d.e = 80;
                                            this.j = hso_o.i.a(hso_df.gH[this.a][this.b], this.d.e);
                                            this.d.f = this.j.length * hso_ft.ab;
                                            this.d.o = 0;
                                            this.d.m = 1;
                                            this.d.p = 1;
                                        }

                                        this.e = -1;
                                        return;
                                    }
                                    break label587;
                                case 5:
                                    switch (this.b) {
                                        case 1:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_ft.W - 96, hso_ft.q.b * hso_ex.c + 16, 5, 90);
                                                hso_ft.r = var7;
                                            }

                                            return;
                                        case 2:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_ft.W - 96, hso_ft.q.b * hso_ex.c + 16, 6, 90);
                                                hso_ft.r = var7;
                                            }

                                            hso_ex.a(51, 2, hso_ft.p.d);
                                            return;
                                        case 3:
                                        default:
                                            break label587;
                                        case 4:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_ft.W - hso_ft.q.a * hso_ex.c - 96, 45, 4, 90);
                                                hso_ft.r = var7;
                                            }

                                            return;
                                        case 5:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_cf.B[3][0] - 96 + 25, hso_cf.B[3][1] - 10, 1, 90);
                                                hso_ft.r = var7;
                                            }

                                            return;
                                        case 6:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_cf.B[2][0] - 96 + 25, hso_cf.B[2][1] - 10, 1, 90);
                                                hso_ft.r = var7;
                                            }

                                            return;
                                        case 7:
                                            hso_ft.k();
                                            if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                                (var7 = new hso_ah()).a(hso_df.gH[this.a][this.b], this.g, hso_cf.B[1][0], hso_cf.B[1][1] + 45, 3, 90);
                                                hso_ft.r = var7;
                                            }

                                            return;
                                    }
                                case 6:
                                    if (this.b == 2) {
                                        hso_ft.k();
                                        if (this.b < hso_df.gH[this.a].length && hso_df.gH[this.a][this.b].length() > 0) {
                                            this.d = new hso_en();
                                            this.d.a = hso_cf.B[0][0];
                                            this.d.e = 80;
                                            this.j = hso_o.i.a(hso_df.gH[this.a][this.b], this.d.e);
                                            this.d.f = this.j.length * hso_ft.ab;
                                            this.d.b = hso_cf.B[0][1] + this.d.f + 22;
                                            this.d.o = 3;
                                            this.d.m = 1;
                                            this.d.p = 1;
                                        }

                                        return;
                                    }
                                    break label587;
                                case 7:
                                    switch (this.b) {
                                        case 6:
                                        case 9:
                                            var1 = hso_df.gH;
                                        case 7:
                                        case 8:
                                        default:
                                            break label587;
                                    }
                                case 8:
                                    if (this.b != 7) {
                                        break label587;
                                    }
                                    break;
                                case 9:
                                    if (this.b != 1 && this.b != 5) {
                                        break label587;
                                    }
                                    break;
                                default:
                                    break label587;
                            }

                            var1 = hso_df.gH;
                        }
                    }

                    int var3;
                    hso_ah var8;
                    hso_bt var12;
                    hso_ah var15;
                    String var10001;
                    int var10003;
                    switch (this.a) {
                        case 0:
                            this.a(var1);
                            return;
                        case 1:
                            switch (this.b) {
                                case 2:
                                    hso_ft.k();
                                    return;
                                case 5:
                                    hso_ft.k();
                                    return;
                                case 9:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    this.d = new hso_en();
                                    this.d.a = 3;
                                    this.d.b = hso_ft.X - hso_ft.aa - 14;
                                    this.d.e = 80;
                                    this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                    this.d.f = this.j.length * hso_ft.ab;
                                    this.d.o = 2;
                                    this.d.m = 1;
                                    this.d.p = 1;
                                    return;
                                default:
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        if ((var2 = hso_ft.W - 30) > 200) {
                                            var2 = 200;
                                        }

                                        var3 = hso_ft.Y - var2 / 2;
                                        int var4 = hso_ft.X - (hso_ft.aa << 1);
                                        hso_ah var5;
                                        (var5 = new hso_ah()).a(var1[this.a][this.b], this.g, var3, var4, -1, var2);
                                        hso_ft.r = var5;
                                    }

                                    return;
                            }
                        case 2:
                            switch (this.b) {
                                case 0:
                                    hso_ft.k();
                                    this.a(0, var1);
                                    return;
                                case 1:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.aM + hso_fl.aN * 3;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 5, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 2:
                                case 3:
                                case 7:
                                case 8:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.aM + (hso_fl.aN << 2);
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 3, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 4:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_ft.Y - 40;
                                        this.d.b = hso_ft.X - hso_ft.aa - 14;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        this.d.o = 2;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = 0;
                                    return;
                                case 5:
                                case 6:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_ft.Y - 45;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 9:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_ft.Y - 40;
                                        this.d.b = hso_ft.X - hso_ft.aa - 14;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        this.d.o = 2;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = 0;
                                    return;
                                case 10:
                                    this.e = 0;
                                    return;
                                case 11:
                                case 12:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + (hso_fl.aM << 1) + (hso_fl.aN << 2);
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 3, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 13:
                                    this.f();
                                    this.g();
                                    return;
                                default:
                                    return;
                            }
                        case 3:
                            switch (this.b) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.aM * 3 - 40 + (hso_fl.aN << 2);
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 5, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 4:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_ft.Y - 40;
                                        this.d.b = hso_ft.X - hso_ft.aa - 14;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        this.d.o = 2;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = 0;
                                    return;
                                case 5:
                                case 6:
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_ft.Y - 45;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 7:
                                    hso_ft.k();
                                    this.a(1, var1);
                                    return;
                                case 8:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_fl.g().L + hso_fl.aN + hso_fl.aN / 2;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        var13 = this.d;
                                        hso_fl.g();
                                        var13.b = 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 16 + this.d.f;
                                        this.d.o = 3;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = -1;
                                    return;
                                default:
                                    return;
                            }
                        case 4:
                            switch (this.b) {
                                case 0:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_ft.Y - 45;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 1:
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.aM + hso_fl.aN * 3 + (hso_fl.S / 5 << 1) + hso_af.b + 16;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + (hso_fl.T / 12 << 3) / 2, 7, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 2:
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.aM + hso_fl.aN * 3 + (hso_fl.S / 5 << 1) + hso_af.b - 16;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + (hso_fl.T / 12 << 3) / 2, 8, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 3:
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.S / 2;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.T - (hso_fl.aM << 1) - hso_fl.aN - 20, 2, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 9:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_ft.W - 83;
                                        this.d.b = hso_ft.X - hso_ft.aa - 14;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        this.d.o = 2;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = -1;
                                    return;
                                default:
                                    return;
                            }
                        case 5:
                            switch (this.b) {
                                case 0:
                                    if (!hso_ft.D && !hso_f.a) {
                                        return;
                                    }

                                    hso_ft.k();
                                    this.d = null;
                                    GameScreen.f.cE = hso_df.cK;
                                    this.f = 0;
                                    return;
                                case 1:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    (var8 = new hso_ah()).a(var1[this.a][this.b], this.g, hso_ft.W - 96, hso_ft.X - 23 - hso_ft.q.b * hso_ex.c - 16, 2, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 2:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        (var8 = new hso_ah()).a(var1[this.a][this.b], this.g, hso_ft.W - 96, hso_ft.X - 23 - hso_ft.q.b * hso_ex.c - 16, -1, 90);
                                        hso_ft.r = var8;
                                    }

                                    hso_ex.a(51, 2, hso_ft.p.d);
                                    return;
                                case 3:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    (var8 = new hso_ah()).a(var1[this.a][this.b], this.g, 3, 60, 5, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 4:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    (var8 = new hso_ah()).a(var1[this.a][this.b], this.g, hso_ft.W - 93, 45, 5, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 5:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    (var8 = new hso_ah()).a(var1[this.a][this.b], this.g, hso_ft.W - 93, hso_ft.X - hso_ft.aa, 2, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 6:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    (var8 = new hso_ah()).a(var1[this.a][this.b], this.g, hso_ft.Y - 45, hso_ft.X - hso_ft.aa - 14 - 25, 2, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 7:
                                    hso_ft.k();
                                    this.c(var1);
                                    return;
                                case 8:
                                    if (!hso_ft.D && !hso_f.a) {
                                        if (!this.l) {
                                            hso_ft.k();
                                            this.d = null;
                                            GameScreen.f.cE = hso_df.cK;
                                            this.f = 0;
                                            hso_ft.k();
                                            this.l = true;
                                            return;
                                        }
                                    } else {
                                        hso_ft.k();
                                    }

                                    return;
                                default:
                                    return;
                            }
                        case 6:
                            switch (this.b) {
                                case 0:
                                case 1:
                                    this.c(var1);
                                    return;
                                case 2:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = 3;
                                        this.d.b = hso_ft.X - hso_ft.aa - 14;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        this.d.o = 2;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }
                                default:
                                    return;
                            }
                        case 7:
                            byte var9;
                            int var10004;
                            switch (this.b) {
                                case 0:
                                    hso_ft.k();
                                    this.a(2, var1);
                                    return;
                                case 1:
                                case 2:
                                case 3:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var8 = new hso_ah();
                                    var9 = 20;
                                    if (hso_ft.A) {
                                        var9 = 24;
                                    }

                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.S / 2;
                                    var10004 = var9 * hso_df.go.length;
                                    hso_fl.g();
                                    var8.a(var10001, var12, var10003, var10004 + hso_ft.X / 5 + hso_fl.aM + 20, 5, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 4:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var8 = new hso_ah();
                                    var9 = 20;
                                    if (hso_ft.A) {
                                        var9 = 24;
                                    }

                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_fl.g().L + hso_fl.S / 2;
                                    var10004 = var9 * hso_df.go.length;
                                    hso_fl.g();
                                    var8.a(var10001, var12, var10003, var10004 + hso_ft.X / 5 + hso_fl.aM, 2, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 5:
                                case 7:
                                case 8:
                                    hso_ft.k();
                                    if (this.b >= var1[this.a].length || var1[this.a][this.b].length() <= 0) {
                                        return;
                                    }

                                    var15 = var8 = new hso_ah();
                                    var10001 = var1[this.a][this.b];
                                    var12 = this.g;
                                    var10003 = hso_ft.Y - 45;
                                    hso_fl.g();
                                    var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                                    hso_ft.r = var8;
                                    return;
                                case 6:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        var2 = hso_fl.g().L + hso_fl.S / 4 + 30;
                                        hso_fl.g();
                                        var3 = 0 + hso_ft.ab + hso_ft.X / 5 + 4 + (hso_ft.A ? 4 : 0);
                                        this.d = new hso_en();
                                        this.d.a = var2;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        this.d.b = var3;
                                        this.d.o = 2;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = 2;
                                    return;
                                case 9:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_fl.g().L + hso_fl.aN + hso_fl.aN / 2;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        var13 = this.d;
                                        hso_fl.g();
                                        var13.b = 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.aM * 3 + 16 + this.d.f;
                                        this.d.o = 3;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = -1;
                                    return;
                                default:
                                    return;
                            }
                        case 8:
                            this.b(var1);
                            return;
                        case 9:
                            switch (this.b) {
                                case 0:
                                    hso_ft.k();
                                    this.c(var1);
                                    return;
                                case 1:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        this.d = new hso_en();
                                        this.d.a = hso_fl.g().L + hso_fl.aN + hso_fl.aN / 2;
                                        this.d.e = 80;
                                        this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                                        this.d.f = this.j.length * hso_ft.ab;
                                        var13 = this.d;
                                        hso_fl.g();
                                        var13.b = 0 + hso_ft.X / 5 + hso_fl.aM * 5 + 16 + this.d.f;
                                        this.d.o = 3;
                                        this.d.m = 1;
                                        this.d.p = 1;
                                    }

                                    this.e = -1;
                                    return;
                                case 2:
                                case 5:
                                case 6:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        var15 = var8 = new hso_ah();
                                        var10001 = var1[this.a][this.b];
                                        var12 = this.g;
                                        var10003 = hso_ft.Y - 45;
                                        hso_fl.g();
                                        var15.a(var10001, var12, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                                        hso_ft.r = var8;
                                        return;
                                    }
                                    break;
                                case 3:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        var15 = var8 = new hso_ah();
                                        var10001 = var1[this.a][this.b];
                                        var12 = this.g;
                                        var10003 = hso_fl.g().L + hso_fl.aM + hso_fl.S / 4 - 45;
                                        hso_fl.g();
                                        var15.a(var10001, var12, var10003, 0 + hso_fl.aM + hso_ft.X / 5 + 22, 5, 90);
                                        hso_ft.r = var8;
                                        return;
                                    }
                                    break;
                                case 4:
                                    hso_ft.k();
                                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                                        var15 = var8 = new hso_ah();
                                        var10001 = var1[this.a][this.b];
                                        var12 = this.g;
                                        var10003 = hso_fl.g().L + hso_fl.aM + hso_fl.S / 4 * 3 - 45;
                                        hso_fl.g();
                                        var15.a(var10001, var12, var10003, 0 + hso_fl.aM + hso_ft.X / 5 + 22, 5, 90);
                                        hso_ft.r = var8;
                                        return;
                                    }
                                    break;
                                case 7:
                                    hso_ft.k();
                                    this.a = -1;
                                    this.b = 0;
                                    this.c();
                            }
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean d(int var1, int var2) {
        return this.a == var1 && this.b == var2;
    }

    public final void h() {
        try {
            if (this.a >= 0) {
                if (this.c > 0) {
                    --this.c;
                    if (this.c == 1) {
                        if (hso_ft.r == null && hso_ft.s == null) {
                            this.g();
                        } else {
                            this.c = 20;
                        }
                    }
                }

                switch (this.a) {
                    case 0:
                        if (this.b == -4 || this.b == -2) {
                            ++this.f;
                            if (hso_ft.r != null) {
                                hso_ft.k();
                                this.c = -1;
                            }

                            if (GameScreen.f.cN == null && this.f > 10) {
                                ++this.b;
                                this.g();
                            }
                        }

                        if (this.b == -3) {
                            if (hso_ft.r != null) {
                                hso_ft.k();
                            }

                            ++this.f;
                            if (this.f > 60) {
                                ++this.b;
                                this.g();
                                this.f = 0;
                            }
                        }

                        if (this.b == 5 && this.d != null && hso_ak.e(GameScreen.f.aY - this.d.a) < 10 && hso_ak.e(GameScreen.f.aZ - this.d.b) < 10) {
                            this.d = null;
                            this.f();
                            this.g();
                            return;
                        }
                    case 1:
                    case 3:
                    case 4:
                    default:
                        break;
                    case 2:
                        if (!hso_ft.o.a && this.b == 10) {
                            this.b = 9;
                            return;
                        }
                        break;
                    case 5:
                        if (this.b == 0) {
                            ++this.f;
                            if (this.f >= 20) {
                                ++this.b;
                                this.g();
                            }
                        }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(mGraphics var1) {
        if (this.a != 2 && this.a != 3 && this.a != 4 && this.a != 7 && this.a != 8 && (this.a != 9 || this.b == 0) && this.d != null && this.d.m == 0 && this.i != null) {
            this.i.b(hso_ft.ai / 2 % this.i.c, this.d.a, this.d.b, 0, 3, var1);
        }

    }

    public final void e(mGraphics var1) {
        if (this.a != 2 && this.a != 3 && this.a != 4 && this.a != 7 && this.a != 8 && (this.a != 9 || this.b == 0) && this.d != null && this.d.m == 1) {
            if (this.d.p == 0) {
                if (this.i != null) {
                    this.i.b(hso_ft.ai / 2 % this.i.c, this.d.a, this.d.b, 0, 3, var1);
                    return;
                }
            } else if (this.d.p == 1) {
                a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
            }
        }

    }

    public final int i() {
        switch (this.a) {
            case 1:
                if (this.b == 9) {
                    return 0;
                }
                break;
            case 2:
                if (this.b == 4) {
                    return 0;
                }

                if (this.b == 9) {
                    return 1;
                }

                if (this.b == 10) {
                    return 4;
                }
                break;
            case 3:
                if (this.b == 4) {
                    return 0;
                }
            case 4:
            case 5:
            default:
                break;
            case 6:
                if (this.b == 2) {
                    return 0;
                }
        }

        return -1;
    }

    public final void a(mGraphics var1, hso_bw var2, byte var3) {
        if (this.e == var3 || this.e == -1) {
            switch (this.a) {
                case 2:
                    if (!hso_ft.D && !hso_f.a && (this.b == 4 || this.b == 9)) {
                        return;
                    }

                    if ((this.b == 4 || this.b == 9) && var2 != null && var2.u == 4 && var2.L == 0 && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                        return;
                    }
                    break;
                case 3:
                    if (this.b == 4 && var2 != null && var2.u == 3 && var2.R == 6 && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                    }

                    if (this.b == 8 && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                        return;
                    }
                    break;
                case 4:
                    if (this.b == 9 && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                        return;
                    }
                case 5:
                case 6:
                default:
                    break;
                case 7:
                    if ((this.b == 6 || this.b == 9) && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                        return;
                    }
                    break;
                case 8:
                    if (this.b == 7 && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                        return;
                    }
                    break;
                case 9:
                    if (this.b == 1 && this.d != null) {
                        hso_ft.a(var1);
                        a(var1, this.d.a, this.d.b, this.d.e, this.d.f, this.d.o, this.j);
                    }
            }

        }
    }

    public static void a(mGraphics var0, int var1, int var2, int var3, int var4, int var5, String[] var6) {
        try {
            int var7 = var2 - var4;
            int var8 = var1;
            var0.a(k[0]);
            var0.c(var1 - 3, var7, var3 + 6, var4);
            var0.c(var1, var7 - 3, var3, var4 + 6);
            var0.a(k[1]);
            var0.c(var1 - 2, var7 - 2, var3 + 4, var4 + 4);
            var0.a(hso_cj.e[0], 0, 0, 3, 3, 0, var1 - 3, var7 - 3, 0);
            var0.a(hso_cj.e[0], 0, 3, 3, 3, 0, var1 + var3, var7 - 3, 0);
            var0.a(hso_cj.e[0], 0, 9, 3, 3, 0, var1 - 3, var7 + var4, 0);
            var0.a(hso_cj.e[0], 0, 6, 3, 3, 0, var1 + var3, var7 + var4, 0);

            for (int var9 = 0; var9 < var6.length; ++var9) {
                hso_o.i.a(var0, var6[var9], var8 + var3 / 2, var7 + 1 + var9 * hso_ft.ab, 2, false);
            }

            switch (var5) {
                case 0:
                    var0.a(hso_cg.ak, var1, var2 + 2 + hso_ft.ai / 2 % 4, 0);
                    return;
                case 1:
                    var0.a(hso_cg.ak, var1 + var3, var2 + 2 + hso_ft.ai / 2 % 4, 24);
                    return;
                case 2:
                    if (hso_ft.D || hso_f.a || GameScreen.p.a != 8 || GameScreen.p.b != 3 && GameScreen.p.b != 2) {
                        var0.a(hso_cg.ak, var1 + var3 / 2, var2 + 2 + hso_ft.ai / 2 % 4, 17);
                        return;
                    } else {
                        return;
                    }
                case 3:
                    var0.a(hso_cg.ak, 0, 0, 12, 16, 1, var1, var2 - var4 - 20 + 2 + hso_ft.ai / 2 % 4, 0);
                    return;
                case 4:
                    var0.a(hso_cg.ak, 0, 0, 12, 16, 1, var1 + var3, var2 - var4 - 20 + 2 + hso_ft.ai / 2 % 4, 24);
                    return;
                case 5:
                    var0.a(hso_cg.ak, 0, 0, 12, 16, 1, var1 + var3 / 2, var2 - var4 - 20 + 2 + hso_ft.ai / 2 % 4, 17);
                    return;
                case 7:
                    var0.a(hso_cg.ak, 0, 0, 12, 16, 5, var1 + hso_ft.ai / 2 % 4, var2 - var4 / 2, 10);
                    return;
                case 8:
                    var0.a(hso_cg.ak, 0, 0, 12, 16, 4, var1 + var3 + 1 + hso_ft.ai / 2 % 4, var2 - var4 / 2, 6);
                case 6:
                default:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void a(String[][] var1) {
        switch (this.b) {
            case -5:
                return;
            case -4:
                this.f = 0;
                ByteArrayOutputStream var9 = new ByteArrayOutputStream();
                DataOutputStream var12 = new DataOutputStream(var9);

                try {
                    var12.writeByte(0);
                    hso_ak.a((byte) 2, var9.toByteArray());
                    var12.close();
                } catch (Exception var7) {
                }

                Player.m = true;
                GameScreen.f.cN = null;
                GameScreen.f.N();
                GameScreen.f.bf = GameScreen.f.aY;
                GameScreen.f.bg = GameScreen.f.aZ;
                GameScreen.f.cl = 0;
                GameScreen.f.cm = 0;
                GameScreen.f.cN = hso_ft.c.a(10, 16, GameScreen.f.aY / hso_cs.l, GameScreen.f.aZ / hso_cs.l, (int) 40);
                return;
            case -3:
                Player.m = true;
                GameScreen.f.cN = null;
                GameScreen.f.N();
                GameScreen.f.Direction = 2;
                GameScreen.f.cE = "...";
                this.f = 0;
                return;
            case -2:
                this.f = 0;
                Player.m = true;
                GameScreen.f.N();
                GameScreen.f.bf = GameScreen.f.aY;
                GameScreen.f.bg = GameScreen.f.aZ;
                GameScreen.f.cl = 0;
                GameScreen.f.cm = 0;
                GameScreen.f.cN = hso_ft.c.a(24 + hso_ak.g(3), 21 + hso_ak.g(3), GameScreen.f.aY / hso_cs.l, GameScreen.f.aZ / hso_cs.l, (int) 40);
                return;
            case -1:
                hso_es var11;
                (var11 = new hso_es("MainHelp menu")).a(this.h);
                hso_bt var8 = new hso_bt(hso_df.gb, 1, this);
                var11.a(var8);
                hso_ft.a(hso_df.dg, var11);
                return;
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                hso_ft.k();
                this.c(var1);
                return;
            case 4:
                if (Player.m) {
                    Player.m = false;
                }

                if (!Player.n) {
                    Player.n = true;
                }

                int var2;
                int var3;
                if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                    if ((var2 = hso_ft.W - 30) > 200) {
                        var2 = 200;
                    }

                    var3 = hso_ft.Y - var2 / 2;
                    int var4 = hso_ft.X - (hso_ft.aa << 1);
                    hso_ah var5;
                    (var5 = new hso_ah()).a(var1[this.a][this.b], this.g, var3, var4, -1, var2);
                    hso_ft.r = var5;
                }

                var2 = 80;
                var3 = 0;
                boolean var13 = false;

                do {
                    ++var3;
                    int var14 = GameScreen.f.aY + hso_ak.b(40, var2);
                    int var10 = GameScreen.f.aZ + hso_ak.b(40, var2);
                    int var6 = hso_ft.p.a(var14, var10);
                    if (GameScreen.e(var14, var10) && var6 != -1 && var6 != 1) {
                        var13 = true;
                        this.d = new hso_en();
                        this.d.a = var14;
                        this.d.b = var10;
                        this.d.m = 0;
                        this.d.p = 0;
                        this.i = hso_cf.p;
                    }

                    if (var3 > 10) {
                        var2 += 10;
                        var3 = 0;
                    }
                } while (!var13);

                return;
            case 5:
                hso_ft.k();
        }
    }

    private void b(String[][] var1) {
        String var10001;
        hso_ah var2;
        hso_bt var10002;
        hso_ah var3;
        int var10003;
        switch (this.b) {
            case 0:
                if (!hso_ft.D && !hso_f.a) {
                    hso_ft.k();
                    this.a(3, var1);
                    hso_ft.u.a = 3;
                    return;
                }

                hso_ft.k();
                if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                    var3 = var2 = new hso_ah();
                    var10001 = var1[this.a][this.b];
                    var10002 = this.g;
                    var10003 = hso_ft.Y - 45;
                    hso_fl.g();
                    var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                    hso_ft.r = var2;
                    return;
                }
                break;
            case 1:
                if (!hso_ft.D && !hso_f.a) {
                    hso_ft.k();
                    this.a(4, var1);
                    hso_ft.u.a = 4;
                    return;
                }

                hso_ft.k();
                if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                    var3 = var2 = new hso_ah();
                    var10001 = var1[this.a][this.b];
                    var10002 = this.g;
                    var10003 = hso_fl.g().L + hso_fl.aN + hso_fl.S / 2 + hso_fl.S / 8;
                    hso_fl.g();
                    var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.T / 2, 7, 90);
                    hso_ft.r = var2;
                    return;
                }
                break;
            case 2:
                if (!hso_ft.D && !hso_f.a) {
                    hso_ft.k();
                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                        var3 = var2 = new hso_ah();
                        var10001 = var1[this.a][this.b];
                        var10002 = this.g;
                        var10003 = hso_fl.g().L + hso_fl.aN + hso_fl.S / 2 + hso_fl.S / 8;
                        hso_fl.g();
                        var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.T / 2, 2, 90);
                        hso_ft.r = var2;
                        return;
                    }
                } else {
                    hso_ft.k();
                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                        var3 = var2 = new hso_ah();
                        var10001 = var1[this.a][this.b];
                        var10002 = this.g;
                        var10003 = hso_fl.g().L + hso_fl.aN + hso_fl.S / 2 + hso_fl.S / 8;
                        hso_fl.g();
                        var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.T / 2, 7, 90);
                        hso_ft.r = var2;
                        return;
                    }
                }
                break;
            case 3:
                if (!hso_ft.D && !hso_f.a) {
                    hso_ft.k();
                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                        var3 = var2 = new hso_ah();
                        var10001 = var1[this.a][this.b];
                        var10002 = this.g;
                        var10003 = hso_fl.g().L + hso_fl.aN + hso_fl.S / 4 * 3;
                        hso_fl.g();
                        var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.T / 2, 2, 90);
                        hso_ft.r = var2;
                        return;
                    }
                } else {
                    hso_ft.k();
                    if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                        var3 = var2 = new hso_ah();
                        var10001 = var1[this.a][this.b];
                        var10002 = this.g;
                        var10003 = hso_fl.g().L + hso_fl.aN + hso_fl.S / 4 * 3;
                        hso_fl.g();
                        var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + hso_fl.T / 2, 8, 90);
                        hso_ft.r = var2;
                        return;
                    }
                }
                break;
            case 4:
                if (!hso_ft.D && !hso_f.a) {
                    hso_ft.k();
                    this.a = -1;
                    this.b = 0;
                    this.c();
                    return;
                }

                hso_ft.k();
                if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                    var3 = var2 = new hso_ah();
                    var10001 = var1[this.a][this.b];
                    var10002 = this.g;
                    var10003 = hso_ft.Y - 45;
                    hso_fl.g();
                    var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                    hso_ft.r = var2;
                    return;
                }
                break;
            case 5:
            case 6:
            case 8:
            case 9:
                hso_ft.k();
                if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                    var3 = var2 = new hso_ah();
                    var10001 = var1[this.a][this.b];
                    var10002 = this.g;
                    var10003 = hso_ft.Y - 45;
                    hso_fl.g();
                    var3.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + (hso_fl.aM << 1) + 22, 6, 90);
                    hso_ft.r = var2;
                    return;
                }
                break;
            case 7:
                hso_ft.k();
                if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
                    this.d = new hso_en();
                    this.d.a = hso_fl.g().L + hso_fl.aN + hso_fl.aN / 2 + hso_fl.S / 8 * 3;
                    this.d.e = 80;
                    this.j = hso_o.i.a(var1[this.a][this.b], this.d.e);
                    this.d.f = this.j.length * hso_ft.ab;
                    hso_en var10000 = this.d;
                    hso_fl.g();
                    var10000.b = 0 + hso_ft.X / 5 + hso_fl.aM;
                    this.d.o = -1;
                    this.d.m = 1;
                    this.d.p = 1;
                }

                this.e = 3;
                return;
            case 10:
                hso_ft.k();
        }

    }

    private void c(String[][] var1) {
        if (this.b < var1[this.a].length && var1[this.a][this.b].length() > 0) {
            int var2;
            if ((var2 = hso_ft.W - 30) > 200) {
                var2 = 200;
            }

            int var3 = hso_ft.Y - var2 / 2;
            int var4 = hso_ft.X - (hso_ft.aa << 1);
            hso_ah var5;
            (var5 = new hso_ah()).a(var1[this.a][this.b], this.g, var3, var4, -1, var2);
            hso_ft.r = var5;
        }

    }

    private void a(int var1, String[][] var2) {
        hso_ft.k();
        if (this.b < var2[this.a].length && var2[this.a][this.b].length() > 0) {
            hso_ah var3;
            hso_ah var10000 = var3 = new hso_ah();
            String var10001 = var2[this.a][this.b];
            hso_bt var10002 = this.g;
            int var10003 = hso_fl.g().L + hso_fl.aN + hso_fl.aN / 2;
            hso_fl.g();
            var10000.a(var10001, var10002, var10003, 0 + hso_ft.X / 5 + hso_fl.aM + 16 + var1 * hso_fl.aM, 3, 90);
            hso_ft.r = var3;
        }

    }
}
