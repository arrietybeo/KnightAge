
public final class hso_i extends hso_dx {

    public static byte[][] a;
    private long z;
    private int A;
    private int B;
    private boolean C = true;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int[][] M;
    private int N;
    private int O;
    private int P;
    public static byte b;
    public static int[][] c;
    private int[] Q;
    private static int[][] R;
    private int S;
    private int T;
    private int U;
    private byte V;
    private hso_es W = new hso_es("EffectSkill VecEff");
    private hso_es X = new hso_es("EffectSkill VecSubEff");
    private byte[] Y;
    private byte[] Z;
    private byte[] aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private MainObject af;
    private hso_es ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private byte[] ao;
    private int[] ap;
    private int aq;
    private int ar;
    private int as;
    private static int[][] at;
    private static int[][] au;
    private byte av;
    private int aw;
    private int ax;
    private int ay;
    private int[] az;
    private byte aA;
    private int[] aB;
    private int aC;
    private int aD;
    private boolean aE;
    private int aF;
    private int aG;

    static {
        byte[][] var10000 = new byte[][]{{0, 0, 0, 1, 1, 1, 2, 2, 2}, {0, 0, 0, 1, 1, 1, 2, 2, 2}, {0, 0, 0, 1, 1, 1, 2, 2, 2}, {0, 0, 0, 1, 1, 1, 2, 2, 2}, {0, 0, 0, 1, 1, 1, 2, 2, 2}};
        a = new byte[][]{new byte[0], {5, 5, 4}, {9, 9, 4}, {20, 20, 4}, {32, 32, 5}, {7, 7, 4}, {8, 8, 4}, {25, 25, 2}, {22, 30, 4}, {14, 15, 4}, {8, 8, 4}, {24, 19, 3}, {19, 13, 3}, {24, 24, 3}, {32, 32, 6}, {36, 30, 3}, {23, 32, 8}, {20, 20, 4}, {32, 32, 2}, {41, 17, 3}, {32, 14, 3}, {48, 48, 3}, {21, 34, 3}, {12, 12, 5}, {38, 38, 3}, new byte[0], {36, 30, 3}, {32, 31, 3}, {12, 12, 4}, {40, 31, 3}, {20, 18, 3}, {12, 13, 4}, {14, 14, 4}, {30, 37, 3}, new byte[0], new byte[0], {37, 40, 4}, {50, 24, 4}, {9, 12, 3}, new byte[0], {23, 33, 2}, {32, 32, 3}, {24, 24, 5}, new byte[0], new byte[0], {14, 11, 3}, new byte[0], {15, 15, 3}, {14, 11, 3}, new byte[0], {24, 35, 3}, {70, 70, 3}, {50, 46, 4}, {62, 64, 3}, {38, 38, 4}, new byte[0], {10, 10, 2}, {25, 25, 3}, {32, 32, 4}, {32, 32, 4}, {30, 32, 4}, {50, 50, 4}, new byte[0], {46, 50, 4}, new byte[0], {42, 27, 6}, {5, 5, 4}, {59, 17, 1}, {17, 23, 4}, new byte[0], {50, 50, 4}, {31, 31, 2}, {34, 38, 3}, new byte[0], {21, 17, 9}, {32, 22, 3}, new byte[0], new byte[0], new byte[0], new byte[0], {10, 10, 18}, {17, 10, 3}, new byte[0], {27, 32, 3}, new byte[0], {19, 45, 1}, {50, 26, 3}, {24, 30, 5}, {32, 14, 3}, {32, 14, 3}, {24, 14, 3}, {8, 5, 2}, {16, 16, 3}, new byte[0], {30, 14, 2}, {25, 45, 1}, {53, 28, 3}, {12, 12, 3}, {14, 14, 4}, {14, 14, 4}, {14, 14, 4}, {14, 14, 4}, {14, 14, 4}, {12, 12, 5}, {12, 12, 5}, {12, 11, 4}, {50, 25, 4}, {50, 25, 4}, {50, 25, 4}, {50, 25, 4}, {50, 25, 4}, {32, 30, 6}, {28, 15, 4}, {88, 60, 3}, {31, 31, 2}, {16, 16, 3}, {7, 7, 4}, {19, 45, 1}, {55, 55, 3}, {55, 55, 3}, {55, 55, 3}, {55, 55, 3}, {24, 40, 3}, {13, 13, 3}, {59, 64, 4}, {25, 25, 3}, {13, 13, 3}, {36, 30, 4}, {53, 24, 4}, {44, 44, 4}, {50, 51, 4}, {40, 40, 4}, {31, 23, 3}, {26, 24, 3}, {32, 32, 4}, {32, 24, 3}, {29, 20, 3}, {32, 32, 6}, {22, 19, 8}, {23, 25, 3}, {16, 21, 3}, {8, 8, 4}, {20, 15, 2}, {30, 20, 3}, {64, 57, 4}, {20, 20, 3}, {24, 16, 3}, {30, 20, 3}, {22, 16, 3}, {25, 17, 3}, {30, 30, 4}, {30, 30, 4}, {16, 16, 2}, {7, 7, 4}, {9, 9, 4}, {13, 13, 5}, {7, 7, 4}, {9, 9, 4}, {13, 13, 5}, {7, 7, 4}, {9, 9, 4}, {13, 13, 5}, {16, 16, 4}};
        c = new int[][]{{-466912, -479160, -1}, {-9732096, -4133256, -1}};
        R = new int[][]{{-4898304, -479160, -1, -1}, {-532951, -479160, -1, -1}, {-7294728, -479160, -1, -1}, {-5207896, -479160, -1, -1}, {-131200, -3420104, -1, -1}};
        at = new int[][]{{4, 11, 11, 15, 10, 7, 5, 6, 4, 3, 11, 13, 13, 13, 12, 15}, {14, 14, 16, 15, 18, 20, 22, 22, 23, 21, 9, 11, 9, 10, 9, 9}};
        au = new int[][]{{11, 9, 11, 11, 13, 14, 13, 14, 11, 13, 15, 14, 13, 13, 12, 15}, {9, 12, 12, 14, 14, 15, 13, 11, 13, 14, 9, 11, 9, 10, 9, 9}};
    }

    public hso_i(int var1, int var2, int var3, int var4, byte var5) {
        byte[] var10000 = new byte[]{4, 3, 2, 1, 0, 7, 6, 5};
        this.Y = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
        this.Z = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
        this.aa = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
        this.ab = 0;
        this.ah = false;
        this.ao = new byte[]{40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40};
        this.ap = new int[]{0, 30, 60, 90, 120, 150, 180, 210, 240, 270, 300, 330};
        this.ax = 0;
        this.ay = 0;
        this.az = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        this.aA = 0;
        this.aB = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
        this.aC = 0;
        this.aE = false;
        GameScreen.a(14, var1, var2);
        GameScreen.a(14, var1 + 24, var2);
        GameScreen.a(14, var1 - 24, var2);
        GameScreen.a(57, var1, var2);
        super.u = new hso_ce(162);
        this.av = var5;
        super.g = var1;
        super.h = var2;
        this.aq = var3;
        this.ar = var4;
        if (this.aq == var1) {
            super.o = 0;
        } else if (this.aq > var1) {
            super.o = 1;
        } else {
            super.o = -1;
        }

        super.p = -5;
        super.d = 124;
    }

    public hso_i(int var1, hso_bf var2, hso_es var3, int var4) {
        byte[] var10000 = new byte[]{4, 3, 2, 1, 0, 7, 6, 5};
        this.Y = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
        this.Z = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
        this.aa = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
        this.ab = 0;
        this.ah = false;
        this.ao = new byte[]{40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40};
        this.ap = new int[]{0, 30, 60, 90, 120, 150, 180, 210, 240, 270, 300, 330};
        this.ax = 0;
        this.ay = 0;
        this.az = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        this.aA = 0;
        this.aB = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
        this.aC = 0;
        this.aE = false;
        if (hso_eg.g) {
            this.A = var4;
            super.y = false;
            super.x = false;
            hso_i var8 = this;
            if (var3 != null && var3.c() != 0) {
                this.ag = var3;
                this.B = -1;
                super.k = -1;
                this.U = 0;
                super.d = var1;
                this.z = hso_ft.aj;
                this.af = MainObject.a(var2.a, var2.b);
                var2 = (hso_bf) this.ag.a(0);
                super.s = MainObject.a(var2.a, var2.b);
                this.ah = false;
                if (this.af != null && super.s != null) {
                    if (super.d != 92 && super.d != 89) {
                        super.g = this.af.aY;
                        super.h = this.af.aZ - this.af.be / 2;
                        super.i = super.s.aY;
                        super.j = super.s.aZ - super.s.be / 2;
                    } else {
                        super.g = super.s.aY;
                        super.h = super.s.aZ - super.s.be / 2;
                        super.i = this.af.aY;
                        super.j = this.af.aZ - this.af.be / 2;
                    }

                    if (super.d != 10 && super.d != 66 && super.d != 30 && super.d != 29 && super.d != 107) {
                        super.m = a(this.af, super.s);
//                        this.af.Direction = super.m;
                        this.af.setDirection(super.m, "public hso_i(int var1, hso_bf var2, hso_es var3, int var4)", hso_i.class);
                    } else {
                        super.m = this.af.Direction;
                    }

                    this.V = -1;
                    if (super.d != 41 && this.af == GameScreen.f) {
                        this.ah = true;
                    }

                    if (!MainObject.c(super.s) && !MainObject.c(this.af)) {
                        super.y = true;
                    } else {
                        MainObject var16;
                        hso_en var5;
                        int var6;
                        int var12;
                        int var13;
                        hso_en var14;
                        int var15;
                        hso_en var20;
                        hso_bf var21;
                        MainObject var23;
                        hso_en var24;
                        label552:
                        switch (var1) {
                            case 0:
                                super.f = 60;
                                switch (this.A) {
                                    case 0:
                                        super.u = new hso_ce(101);
                                        break;
                                    case 1:
                                        super.u = new hso_ce(98);
                                        break;
                                    case 2:
                                        super.u = new hso_ce(100);
                                        break;
                                    case 3:
                                        super.u = new hso_ce(99);
                                        break;
                                    case 4:
                                        super.u = new hso_ce(32);
                                        break;
                                    case 5:
                                        super.u = new hso_ce(102);
                                        break;
                                    default:
                                        super.u = new hso_ce(32);
                                }

                                label544:
                                {
                                    super.n = 8000;
                                    if (this.af != null) {
                                        switch (this.af.Direction) {
                                            case 0:
                                                this.O = 90;
                                                break label544;
                                            case 1:
                                                this.O = 270;
                                                break label544;
                                            case 2:
                                                this.O = 180;
                                                break label544;
                                            case 3:
                                                break;
                                            default:
                                                break label544;
                                        }
                                    }

                                    this.O = 0;
                                }

                                this.aD = 4096;
                                super.o = 0;
                                super.p = 0;
                                this.aC = 0;
                                this.F = this.aD * hso_ak.b(this.O) >> 10;
                                this.G = this.aD * hso_ak.a(this.O) >> 10;
                                break;
                            case 1:
                            case 38:
                            case 59:
                                super.n = 14;
                                if (var1 == 38) {
                                    if (this.af.bx == 2) {
                                        this.B = 2;
                                    } else {
                                        this.B = 1;
                                    }
                                }

                                if (var1 == 1) {
                                    super.u = new hso_ce(32);
                                }

                                if (var1 == 59) {
                                    this.B = 13;
                                    super.h += 10;
                                    super.u = new hso_ce(17);
                                    super.v = new hso_ce(24);
                                }

                                var12 = super.i - super.g;
                                var13 = super.j - super.h;
                                this.a(var12, var13, (hso_ar) null);
                                if (var1 == 59) {
                                    this.V = (byte) super.f;
                                }
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 13:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 24:
                            case 32:
                            case 33:
                            case 35:
                            case 36:
                            case 37:
                            case 39:
                            case 44:
                            case 45:
                            case 48:
                            case 80:
                            case 81:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 94:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 107:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            default:
                                break;
                            case 6:
                                this.ah = true;
                                this.f();
                                break;
                            case 10:
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ;
                                }

                                super.f = 10;
                                this.V = 7;
                                this.a(super.i + hso_ak.g(20), hso_p.d.b - 5, super.i, super.j, true);
                                if (this.af != GameScreen.f) {
                                    GameScreen.b((int) 32);
                                }

                                GameScreen.a(40, super.i, super.j + 10);
                                break;
                            case 11:
                            case 108:
                            case 114:
                                this.B = 5;
                                if (super.d == 114) {
                                    super.u = new hso_ce(24);
                                    super.v = new hso_ce(7);
                                    super.w = new hso_ce(9);
                                } else {
                                    super.u = new hso_ce(30);
                                    super.v = new hso_ce(31);
                                    super.w = new hso_ce(40);
                                }

                                super.n = 14;
                                super.o = super.n;
                                var1 = 0;

                                while (true) {
                                    if (var1 >= var8.ag.c()) {
                                        break label552;
                                    }

                                    if ((var2 = (hso_bf) var8.ag.a(var1)) != null && (var16 = MainObject.a(var2.a, var2.b)) != null) {
                                        var24 = var8.a(var16.aY, var16.aZ);
                                        var8.W.a(var24);
                                    }

                                    ++var1;
                                }
                            case 12:
                                this.B = 15;
                                this.g();
                                break;
                            case 14:
                            case 115:
                                this.V = 18;
                                if (super.d == 14) {
                                    this.j();
                                } else {
                                    this.k();
                                }
                                break;
                            case 20:
                            case 113:
                                this.B = 11;
                                super.u = new hso_ce(91);
                                this.b(5);
                                if (super.s != null) {
                                    this.D = super.s.aY - 70;
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ;
                                } else {
                                    this.D = super.i - 70;
                                }

                                this.E = hso_p.d.b - hso_ak.c(10, 20);
                                super.n = 18;
                                super.f = 20;
                                this.V = 11;
                                this.l();
                                break;
                            case 21:
                                if (this.af.bx == 0) {
                                    this.B = 3;
                                } else {
                                    this.B = 0;
                                }

                                if (super.s != null) {
                                    super.g = super.s.aY;
                                    super.h = super.s.aZ - this.af.be / 2;
                                } else {
                                    super.g = super.i;
                                    super.h = super.j;
                                }

                                this.as = hso_ak.f(4);

                                do {
                                    var8.ab = hso_ak.f(4);
                                } while (var8.as == var8.ab);

                                var8.u = new hso_ce(118 + var8.as);
                                var8.v = new hso_ce(118 + var8.ab);
                                var8.f = 6;
                                break;
                            case 22:
                            case 31:
                                this.v();
                                break;
                            case 23:
                                this.B = 12;
                                this.y();
                                break;
                            case 25:
                                this.B = 13;
                                this.u();
                                break;
                            case 26:
                                this.B = 5;
                                this.t();
                                break;
                            case 27:
                                this.m();
                                break;
                            case 28:
                                this.B = 4;
                                this.s();
                                break;
                            case 29:
                                this.ah = true;
                                if (this.af != null) {
                                    this.S = this.af.bx == 1 ? 1 : 0;
                                } else {
                                    this.S = 0;
                                }

                                this.d(this.A);
                                this.D = super.g * 1000;
                                if (this.af != null) {
                                    this.E = (super.h - this.af.be / 2) * 1000;
                                } else {
                                    this.E = super.j * 1000;
                                }

                                super.f = 2;
                                super.n = 5;
                                this.ac = 10;
                                this.ad = 20;
                                this.a(super.n, this.ac, this.ad);
                                break;
                            case 30:
                                this.ah = true;
                                this.d(this.A);
                                this.D = super.g * 1000;
                                this.E = (super.h - this.af.be / 2) * 1000;
                                if (this.af.bx == 3) {
                                    super.u = new hso_ce(6);
                                } else {
                                    super.u = new hso_ce(10);
                                }

                                super.f = 5;
                                this.o();
                                break;
                            case 34:
                                super.u = new hso_ce(33);
                                super.v = new hso_ce(18);
                                super.f = 57;
                                if (this.af != null && super.s != null) {
                                    this.af.bF = true;
                                    this.af.bR = 0;
                                    if (this.af.c_()) {
                                        GameScreen.f.F = GameScreen.f.aY;
                                        GameScreen.f.G = GameScreen.f.aZ;
                                    }

                                    this.a(0, super.s);
                                    this.ae = 1;
                                    break;
                                }

                                super.x = true;
                                return;
                            case 40:
                                this.B = 10;
                                this.r();
                                break;
                            case 41:
                                super.f = 60;
                                if (this.A == 0) {
                                    super.u = new hso_ce(103);
                                } else {
                                    super.u = new hso_ce(104);
                                }

                                super.n = 12000;
                                if (this.af == null) {
                                    this.O = 0;
                                } else {
                                    switch (this.af.Direction) {
                                        case 0:
                                            this.O = 0;
                                            break;
                                        case 1:
                                            this.O = 180;
                                            break;
                                        case 2:
                                            this.O = 90;
                                            break;
                                        case 3:
                                            this.O = 270;
                                    }
                                }

                                this.aD = 6144;
                                super.o = 0;
                                super.p = 0;
                                this.aC = 0;
                                this.F = this.aD * hso_ak.b(this.O) >> 10;
                                this.G = this.aD * hso_ak.a(this.O) >> 10;
                                break;
                            case 42:
                                this.ah = true;
                                this.B = 26;
                                this.A();
                                break;
                            case 43:
                                this.ah = true;
                                super.u = new hso_ce(50);
                                super.f = 11;
                                super.h += this.af.be / 2;
                                var1 = 0;

                                while (true) {
                                    if (var1 >= 10) {
                                        break label552;
                                    }

                                    var14 = new hso_en();
                                    var13 = hso_ak.c(0, 180);
                                    var14.a = 17 * hso_ak.b(var13) / 1000;
                                    var14.b = 15 * hso_ak.a(var13) / 1000 - 5;
                                    var14.o = hso_ak.f(2);
                                    var14.p = hso_ak.f(4);
                                    var14.h = 60;
                                    var8.W.a(var14);
                                    ++var1;
                                }
                            case 46:
                                this.B = 7;
                                super.u = new hso_ce(70);
                                super.v = new hso_ce(72);
                                super.f = 15;
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ;
                                }
                                break;
                            case 47:
                            case 112:
                                this.B = 8;
                                this.B();
                                break;
                            case 49:
                                this.B = 14;
                                super.u = new hso_ce(23);
                                super.v = new hso_ce(24);
                                this.D();
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ - super.s.be / 2;
                                }
                                break;
                            case 50:
                                this.C();
                                if (super.s != null && super.s.cu == 9) {
                                    this.B = 25;
                                }
                                break;
                            case 51:
                                this.V = 3;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(59);
                                super.f = 16;
                                super.h += 7;
                                this.b(10);
                                break;
                            case 52:
                            case 54:
                                if (var1 == 52) {
                                    this.B = 4;
                                } else if (var1 == 54) {
                                    this.B = 5;
                                }

                                super.u = new hso_ce(83);
                                super.v = new hso_ce(68);
                                super.f = 15;
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ;
                                }
                                break;
                            case 53:
                            case 78:
                            case 104:
                                if (var1 == 53) {
                                    this.B = 6;
                                    super.u = new hso_ce(85);
                                } else if (var1 == 78 || var1 == 104) {
                                    super.u = new hso_ce(117);
                                    if (var1 == 104) {
                                        super.s.F();
                                    }
                                }

                                super.v = new hso_ce(53);
                                super.f = 20;
                                var1 = 0;

                                while (true) {
                                    if (var1 >= var8.ag.c()) {
                                        break label552;
                                    }

                                    var14 = new hso_en();
                                    hso_bf var18;
                                    MainObject var25;
                                    if ((var18 = (hso_bf) var8.ag.a(var1)) != null && (var25 = MainObject.e(var18.a, var18.b)) != null) {
                                        var14.a = var25.aY;
                                        var14.b = var25.aZ + var25.bo;
                                        var8.W.a(var14);
                                    }

                                    ++var1;
                                }
                            case 55:
                                this.B = 7;
                                super.u = new hso_ce(51);
                                super.f = 12;
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ - super.s.be / 2;
                                }

                                this.V = 5;
                                break;
                            case 56:
                                if (this.A == 10) {
                                    super.u = new hso_ce(29);
                                } else {
                                    super.u = new hso_ce(22);
                                }

                                super.h = this.af.aZ;
                                super.f = 6;
                                this.ah = true;
                                break;
                            case 57:
                                if (this.af.bx != 2 && this.af.bx != 3) {
                                    this.B = 31;
                                } else {
                                    this.B = 30;
                                }

                                this.ah = true;
                                this.D = super.g * 1000;
                                this.E = super.h * 1000;
                                this.p();
                                break;
                            case 58:
                                this.ah = true;
                                super.h = this.af.aZ + this.af.bo;
                                super.u = new hso_ce(65);
                                super.v = new hso_ce(94);
                                super.f = 8;
                                break;
                            case 60:
                                this.B = 16;
                                hso_cs.t = 16;

                                for (var1 = 0; var1 < var8.ag.c(); ++var1) {
                                    if ((var2 = (hso_bf) var8.ag.a(var1)) != null && (var16 = MainObject.a(var2.a, var2.b)) != null) {
                                        (var24 = new hso_en()).a = var16.aY;
                                        var24.b = var16.aZ + var16.bo;
                                        var8.W.a(var24);
                                    }
                                }

                                var8.f = 20;
                                break;
                            case 61:
                            case 77:
                                if (var1 == 61) {
                                    if (this.ag.c() > 1) {
                                        this.B = 16;
                                    } else {
                                        this.B = 15;
                                    }

                                    super.u = new hso_ce(71);
                                    super.v = new hso_ce(5);
                                    super.w = new hso_ce(92);
                                } else if (var1 == 77) {
                                    super.u = new hso_ce(114);
                                    super.v = new hso_ce(116);
                                    super.w = new hso_ce(115);
                                }

                                super.n = 22;
                                super.o = super.n;
                                var1 = 0;

                                while (true) {
                                    if (var1 >= var8.ag.c()) {
                                        break label552;
                                    }

                                    if ((var2 = (hso_bf) var8.ag.a(var1)) != null && (var16 = MainObject.a(var2.a, var2.b)) != null) {
                                        var4 = var16.aZ;
                                        var13 = var16.aY;
                                        var5 = new hso_en();
                                        var8.g = var13;
                                        var8.h = hso_p.d.b;
                                        var13 = hso_ak.e(var8.h - var4);
                                        var8.f = var13 / var8.n;
                                        if (var8.f == 0) {
                                            var8.f = 1;
                                        }

                                        var8.G = var13 * 1000 / var8.f;
                                        var5.b = var8.h;
                                        var5.a = var8.g;
                                        var5.i = 0;
                                        var5.j = var8.G;
                                        var5.n = var8.f;
                                        var24 = var5;
                                        var5.m = hso_ak.f(2);
                                        var5.s = new hso_es("EffectSkill vecEffPoint");
                                        var15 = hso_ak.c(3, 7);

                                        for (var6 = 0; var6 < var15; ++var6) {
                                            (var20 = new hso_en()).a = var24.a + hso_ak.g(20);
                                            var20.b = var24.b - 10 - hso_ak.f(35);
                                            var20.m = 0;
                                            if (hso_ak.f(6) == 0) {
                                                var20.m = 1;
                                            } else {
                                                var20.p = hso_ak.f(4);
                                            }

                                            var24.s.a(var20);
                                        }

                                        var8.W.a(var24);
                                    }

                                    ++var1;
                                }
                            case 62:
                                this.B = 20;
                                super.h += 5;
                                super.f = 20;
                                this.V = 10;
                                super.u = new hso_ce(47);
                                super.n = 22;
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ - super.s.be / 2;
                                }
                                break;
                            case 63:
                                super.h += 8;
                                super.u = new hso_ce(74);
                                if (super.s != null) {
                                    super.i = super.s.aY;
                                    super.j = super.s.aZ - super.s.be / 2;
                                }

                                super.f = 20;
                                this.V = 10;
                                super.n = 16;
                                break;
                            case 64:
                                this.B = 14;
                                super.k = -1;
                                super.u = new hso_ce(95);
                                super.v = new hso_ce(53);
                                super.f = 20;
                                var4 = 0;

                                while (true) {
                                    if (var4 >= var8.ag.c()) {
                                        break label552;
                                    }

                                    var5 = new hso_en();
                                    if ((var21 = (hso_bf) var8.ag.a(var4)) != null && (var23 = MainObject.e(var21.a, var21.b)) != null) {
                                        var5.a = var23.aY;
                                        var5.b = var23.aZ + var23.bo;
                                        var8.W.a(var5);
                                    }

                                    ++var4;
                                }
                            case 65:
                                this.B = 23;
                                super.f = 2;
                                this.ah = true;
                                break;
                            case 66:
                                this.B = 22;
                                this.af.Direction = 1;
                                super.f = 2;
                                this.ah = true;
                                break;
                            case 67:
                                this.ah = false;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(6);
                                this.D = super.g;
                                this.E = super.h;
                                super.n = 18;
                                if (super.s != null) {
                                    var12 = super.s.aY - super.g;
                                    var13 = super.s.aZ - super.s.be / 2 - super.h;
                                } else {
                                    var12 = super.i - super.g;
                                    var13 = super.j - super.h;
                                }

                                this.a(var12, var13, (hso_ar) null);
                                break;
                            case 68:
                                super.g = super.s.aY;
                                if (this.A == 0) {
                                    super.h = super.s.aZ - super.s.be / 2;
                                } else {
                                    super.h = super.s.aZ - super.s.be - 8;
                                }

                                this.V = 20;
                                this.ah = true;
                                if (this.A == 0) {
                                    super.u = new hso_ce(111);
                                    super.f = 6;
                                } else if (this.A == 1) {
                                    super.u = new hso_ce(112);
                                    super.f = 8;
                                }
                                break;
                            case 69:
                                super.f = 16;
                                this.ah = true;
                                super.u = new hso_ce(9);
                                super.o = hso_ak.g(2);
                                super.p = -2;
                                super.h -= hso_ak.f(this.af.be / 2);
                                break;
                            case 70:
                                this.ah = true;
                                this.D = super.g * 1000;
                                this.E = super.h * 1000;
                                if (this.A >= 28) {
                                    this.A -= 28;
                                }

                                this.q();
                                break;
                            case 71:
                            case 75:
                                if (var1 == 71) {
                                    super.u = new hso_ce(36);
                                    super.v = new hso_ce(53);
                                } else {
                                    super.u = new hso_ce(61);
                                }

                                super.f = 16;
                                var4 = 0;

                                while (true) {
                                    if (var4 >= var8.ag.c()) {
                                        break label552;
                                    }

                                    var5 = new hso_en();
                                    if ((var21 = (hso_bf) var8.ag.a(var4)) != null && (var23 = MainObject.e(var21.a, var21.b)) != null) {
                                        var5.a = var23.aY;
                                        var5.b = var23.aZ + var23.bo;
                                        var8.W.a(var5);
                                    }

                                    ++var4;
                                }
                            case 72:
                            case 74:
                                super.n = 14;
                                if (var1 == 72) {
                                    super.u = new hso_ce(45);
                                    super.v = new hso_ce(37);
                                } else if (var1 == 74) {
                                    super.u = new hso_ce(63);
                                }

                                for (var4 = 0; var4 < var8.ag.c(); ++var4) {
                                    hso_bf var17;
                                    MainObject var19;
                                    if ((var17 = (hso_bf) var8.ag.a(var4)) != null && (var19 = MainObject.e(var17.a, var17.b)) != null) {
                                        var12 = var19.aY - var8.g;
                                        var13 = var19.aZ - var19.be / 2 - var8.h;
                                        hso_ar var22 = new hso_ar();
                                        (var22 = var8.a(var12, var13, var22, var19)).a = var8.g;
                                        var22.b = var8.h;
                                        var1 = hso_ak.a(var12, var13);
                                        var22.e = var8.c(var1);
                                        var8.W.a(var22);
                                    }
                                }

                                var8.f = 10;
                                break;
                            case 73:
                                super.h += 8;
                                if (var1 == 73) {
                                    super.u = new hso_ce(48);
                                    super.v = new hso_ce(38);
                                }

                                super.n = 20;
                                super.f = 40;
                                break;
                            case 76:
                                super.r = -1;
                                super.v = new hso_ce(113);
                                super.u = new hso_ce(81);
                                super.f = 20;
                                this.V = 13;
                                super.n = 5;
                                var4 = 0;

                                while (true) {
                                    if (var4 >= 16) {
                                        break label552;
                                    }

                                    (var5 = new hso_en()).a = var8.g * 1000;
                                    var5.b = var8.h * 1000;
                                    var5.i = 2 * hso_ak.b(var4 * 225 / 10) * var8.n;
                                    var5.j = hso_ak.a(var4 * 225 / 10) * var8.n;
                                    var5.n = 0;
                                    var8.W.a(var5);
                                    ++var4;
                                }
                            case 79:
                                super.f = 1;
                                this.ah = true;
                                break;
                            case 82:
                            case 111:
                                this.B = 21;
                                var4 = hso_ak.a(super.i - super.g, super.j - super.h);
                                var15 = hso_ak.e(MainObject.c(super.g, super.h, super.i, super.j)) + 30;
                                this.D = super.g + hso_ak.b(var4) * var15 / 1000;
                                this.E = super.h + hso_ak.a(var4) * var15 / 1000;
                                super.f = 10;
                                this.V = 7;
                                this.b(0);
                                this.a(super.g, super.h, this.D, this.E, true);
                                GameScreen.a(40, this.D, this.E + 10);
                                break;
                            case 88:
                                super.f = 60;
                                super.u = new hso_ce(97);
                                super.v = new hso_ce(9);
                                super.n = 8000;
                                this.e();
                                this.as = this.c(this.O);
                                break;
                            case 89:
                                super.f = 60;
                                super.u = new hso_ce(10);
                                super.v = new hso_ce(10);
                                super.n = 8000;
                                this.e();
                                this.as = this.c(this.O);
                                break;
                            case 90:
                                this.V = 18;
                                this.h();
                                if (super.s != null && super.s.cu == 9) {
                                    this.B = 36;
                                }
                                break;
                            case 91:
                                this.V = 18;
                                this.i();
                                if (super.s != null && super.s.cu == 9) {
                                    this.B = 36;
                                }
                                break;
                            case 92:
                                super.f = 60;
                                super.u = new hso_ce(141);
                                super.v = new hso_ce(141);
                                super.n = 8000;
                                this.e();
                                this.as = this.c(this.O);
                                break;
                            case 93:
                                super.u = new hso_ce(63);
                                super.v = new hso_ce(107);
                                super.f = 60;
                                var6 = 0;

                                while (true) {
                                    if (var6 >= var8.ag.c()) {
                                        break label552;
                                    }

                                    var20 = new hso_en();
                                    hso_bf var10;
                                    if ((var10 = (hso_bf) var8.ag.a(var6)) != null && MainObject.e(var10.a, var10.b) != null) {
                                        var20.a = var8.g;
                                        var20.b = var8.h + var8.U;
                                        var8.W.a(var20);
                                    }

                                    ++var6;
                                }
                            case 95:
                                this.B = 21;
                                var6 = hso_ak.a(super.i - super.g, super.j - super.h);
                                int var7 = hso_ak.e(MainObject.c(super.g, super.h, super.i, super.j));
                                this.D = super.g + hso_ak.b(var6) * var7 / 1000;
                                this.E = super.h + hso_ak.a(var6) * var7 / 1000;
                                super.f = 10;
                                this.V = 7;
                                this.b(0);
                                this.aj = 0;
                                this.ak = 50;
                                this.a(super.g - this.aj, super.h - this.ak, this.D, this.E, true);
                                GameScreen.a(40, this.D, this.E + 20);
                                break;
                            case 96:
                                super.f = 60;
                                super.u = new hso_ce(132);
                                super.v = new hso_ce(9);
                                super.n = 8000;
                                this.e();
                                this.as = this.c(this.O);
                                this.aj = 4;
                                this.ak = -50;
                                super.g += this.aj;
                                super.h += this.ak;
                                break;
                            case 97:
                                this.V = 3;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(59);
                                super.f = 16;
                                this.aj = 0;
                                this.ak = -86;
                                super.g += this.aj;
                                super.h += this.ak;
                                break;
                            case 98:
                                this.x();
                                break;
                            case 99:
                                if (this.af.Direction == 3) {
                                    this.aj = -10;
                                    this.ak = -20;
                                } else {
                                    this.aj = 10;
                                    this.ak = -20;
                                }

                                this.w();
                                GameScreen.a(48, this.af.aY + this.aj, this.af.aZ + this.ak);
                                break;
                            case 105:
                                this.V = 3;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(60);
                                super.f = 16;
                                super.h -= 12;
                                this.b(10);
                                break;
                            case 106:
                                this.V = 3;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(59);
                                super.f = 16;
                                this.K = 240;
                                super.h -= 15;
                                super.g -= 6;
                                this.J = 0;
                                this.L = 4;
                                this.b(10);
                                break;
                            case 109:
                            case 110:
                                this.B = 16;
                                this.B = 14;
                                super.k = 0;
                                if (super.d == 109) {
                                    super.u = new hso_ce(92);
                                } else {
                                    super.u = new hso_ce(115);
                                }

                                short var9 = (short) (super.i - super.g);
                                short var11 = (short) (super.j - super.h);
                                this.J = (short) hso_ak.a((int) var9, (int) var11);
                                if ((var13 = (Math.abs(var9) + Math.abs(var11)) / 20) < 2) {
                                    var13 = 2;
                                }

                                var4 = 0;

                                while (true) {
                                    if (var4 >= var13) {
                                        break label552;
                                    }

                                    (var5 = new hso_en()).a = var8.g + var4 * var9 / var13;
                                    var5.b = var8.h + var4 * var11 / var13;
                                    var8.W.a(var5);
                                    ++var4;
                                }
                            case 125:
                                super.h = this.af.aZ - 100;
                                this.V = 3;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(59);
                                super.f = 16;
                                this.K = 240;
                                this.J = 0;
                                this.L = 4;
                                break;
                            case 126:
                                super.h = this.af.aZ - 120;
                                super.g -= 12;
                                this.V = 3;
                                super.u = new hso_ce(21);
                                super.v = new hso_ce(59);
                                super.f = 16;
                                this.K = 240;
                                this.J = 0;
                                this.L = 4;
                        }

                        if (!var8.ah && var8.af != null && var8.af.cu != 1) {
                            for (var1 = 0; var1 < var8.ag.c(); ++var1) {
                                if ((var2 = (hso_bf) var8.ag.a(var1)) == null) {
                                    var8.ag.d(var2);
                                    --var1;
                                } else {
                                    if ((var16 = MainObject.a(var2.a, var2.b)) == null) {
                                        var8.ag.d(var2);
                                        --var1;
                                    } else if (var16.cF != 4) {
                                        var16.br = var2.d;
                                        if (var16.br <= 0 && var16 != GameScreen.f) {
                                            var16.N();
                                            var16.cF = 4;
                                            var16.aW = hso_ft.aj;
                                            GameScreen.a(11, var16.aY, var16.aZ);
                                        }
                                    }

                                    if (var8.ag.c() == 0) {
                                        var8.y = true;
                                    }
                                }
                            }
                        }

                        if (var8.B >= 0 && var8.af != GameScreen.f) {
                            GameScreen.b(var8.B);
                        }

                    }
                }
            }
        }
    }

    public hso_i(int var1, int var2, int var3, int var4, short var5, byte var6) {
        byte[] var10000 = new byte[]{4, 3, 2, 1, 0, 7, 6, 5};
        this.Y = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
        this.Z = new byte[]{0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2, 0, 0, 2, 1, 1, 2};
        this.aa = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
        this.ab = 0;
        this.ah = false;
        this.ao = new byte[]{40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40};
        this.ap = new int[]{0, 30, 60, 90, 120, 150, 180, 210, 240, 270, 300, 330};
        this.ax = 0;
        this.ay = 0;
        this.az = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        this.aA = 0;
        this.aB = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
        this.aC = 0;
        this.aE = false;
        super.d = var1;
        super.g = var2;
        super.h = var3;
        super.e = var4;
        this.z = hso_ft.aj;
        switch (var1) {
            case 29:
                this.ah = true;
                this.S = hso_ak.f(2);
                this.D = var2 * 1000;
                this.E = var3 * 1000;
                super.f = hso_ak.c(4, 6);
                super.n = 5;
                this.ac = 10;
                this.ad = 20;
                this.a(super.n, this.ac, this.ad);
                return;
            case 69:
                super.f = 16;
                this.ah = true;
                super.u = new hso_ce(9);
                super.o = hso_ak.g(2);
                super.p = -2;
                return;
            case 80:
                super.f = 16;
                this.ah = true;
                super.u = new hso_ce(16);
                super.s = MainObject.a(var5, (byte) 1);
                if (super.s == null) {
                    return;
                }
                break;
            case 81:
                super.f = 30;
                this.ah = true;
                this.j();
                return;
            case 83:
                this.ah = true;
                super.f = 60;
                if ((var1 = hso_ak.f(3)) == 0) {
                    super.u = new hso_ce(103);
                } else if (var1 == 1) {
                    super.u = new hso_ce(104);
                } else if (var1 == 2) {
                    super.u = new hso_ce(23);
                }

                super.i = super.g;
                super.j = super.h;
                super.g += hso_ak.b(24, 48);
                super.h += hso_ak.b(24, 48);
                switch (hso_ak.f(4)) {
                    case 0:
                        this.O = 0;
                        break;
                    case 1:
                        this.O = 180;
                        break;
                    case 2:
                        this.O = 90;
                        break;
                    case 3:
                        this.O = 270;
                }

                this.aD = 6144;
                super.o = 0;
                super.p = 0;
                this.aC = 0;
                this.F = this.aD * hso_ak.b(this.O) >> 10;
                this.G = this.aD * hso_ak.a(this.O) >> 10;
                return;
            case 84:
                this.ah = true;
                this.S = hso_ak.f(2);
                this.D = var2 * 1000;
                this.E = var3 * 1000;
                super.f = hso_ak.c(6, 8);
                super.n = 2;
                this.ac = 10;
                this.ad = 20;
                this.a(super.n, this.ac, this.ad);
                return;
            case 85:
                super.e = var4 * 1000;
                this.ah = true;
                super.s = MainObject.a(var5, var6);
                if (super.s != null && !super.s.cK && !super.s.cL) {
                    this.S = hso_ak.f(2);
                    this.D = var2;
                    this.E = var3;
                    super.f = 5;
                    return;
                }

                this.c();
                return;
            case 86:
                super.u = new hso_ce(30);
                super.v = new hso_ce(31);
                super.w = new hso_ce(40);
                this.ah = true;

                for (var1 = 0; var1 < var6; ++var1) {
                    super.n = hso_ak.c(5, 10);
                    super.o = super.n;
                    hso_en var7 = this.a(hso_p.d.a + 20 + hso_ak.f(hso_ft.W * 5 / 4), hso_p.d.b + 20 + hso_ak.f(hso_ft.X * 5 / 4));
                    this.W.a(var7);
                }

                return;
            case 87:
                super.u = new hso_ce(11);
                super.s = MainObject.a(var5, var6);
                if (super.s != null && !super.s.cK && !super.s.cL) {
                    this.ah = true;
                    super.f = 10;
                    return;
                }

                this.c();
                return;
            case 94:
                super.t = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
                super.u = new hso_ce(127);
                super.v = new hso_ce(53);
                super.f = 60;
                super.s = MainObject.a(var5, var6);
                if (super.s == null) {
                    return;
                }

                var2 = super.s.aY;
                var3 = super.s.aZ;
                super.s.bb = 0;
                super.s.bc = 0;
                super.s.bf = var2;
                super.s.bg = var3;
                super.s.bH = true;
                super.s.bL = hso_dw.a() + (long) (var4 * 1000);
                hso_cs.t = 103;
                return;
            case 100:
                super.f = 60;
                super.s = MainObject.a(var5, var6);
                if (super.s == null) {
                    return;
                }

                var2 = super.s.aY;
                var3 = super.s.aZ;
                super.s.bb = 0;
                super.s.bc = 0;
                super.s.bf = var2;
                super.s.bg = var3;
                super.s.bI = true;
                super.s.bQ = hso_dw.a() + (long) (var4 * 1000);
                super.r = -1;
                super.f = 6;
                break;
            case 101:
                super.s = MainObject.a(var5, var6);
                if (super.s == null) {
                    return;
                }

                this.ai = false;
                this.an = 10;
                var2 = super.s.aY;
                var3 = super.s.aZ;
                super.s.bb = 0;
                super.s.bc = 0;
                super.s.bf = var2;
                super.s.bg = var3;
                super.s.dK = true;
                super.s.bM = hso_dw.a() + (long) (var4 * 1000);
                return;
            case 102:
                super.s = MainObject.a(var5, var6);
                if (super.s == null) {
                    return;
                }

                var2 = super.s.aY;
                var3 = super.s.aZ - 25;
                super.s.bb = 0;
                super.s.bc = 0;
                super.s.bf = var2;
                super.s.bg = var3;
                if (super.s.cu == 1) {
                    this.aw = 0;
                } else {
                    this.aw = 17;
                }

                super.s.dJ = true;
                super.s.bN = hso_dw.a() + (long) (var4 * 1000);
                return;
            case 103:
                super.s = MainObject.a(var5, var6);
                if (super.s == null) {
                    return;
                }

                super.u = new hso_ce(27);
                this.P = 72;
                this.T = 20;
                this.U = 40;
                super.s.dM = true;
                super.s.bP = hso_dw.a() + (long) (var4 * 1000);
                return;
            case 107:
                super.s = MainObject.a(var5, var6);
                if (super.s == null) {
                    return;
                }

                this.ah = true;
                this.S = hso_ak.f(2);
                var2 = super.s.aY;
                var3 = super.s.aZ - 15;
                this.D = var2 * 1000;
                this.E = var3 * 1000;
                super.s.bf = var2;
                super.s.bg = var3;
                super.f = hso_ak.c(4, 6);
                super.n = 5;
                this.ac = 10;
                this.ad = 20;
                this.a(super.n, this.ac, this.ad);
                super.s.dL = true;
                super.s.bO = hso_dw.a() + (long) (var4 * 1000);
                return;
        }

    }

    public final void a(mGraphics var1) {
        if (!hso_dw.g || this.C) {
            try {
                this.ax = 10;
                if (super.x) {
                    return;
                }

                int var2;
                hso_en var3;
                hso_en var4;
                hso_en var5;
                int var7;
                boolean var9;
                int var10;
                hso_ej var12;
                hso_ar var13;
                label1296:
                switch (super.d) {
                    case 0:
                    case 1:
                    case 80:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 24:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 48:
                    case 60:
                    case 65:
                    case 66:
                    case 79:
                    case 100:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    default:
                        break;
                    case 6:
                        if (hso_ft.ai % 2 == 0 && this.M != null && this.M.length > 0) {
                            for (var2 = 0; var2 < this.M.length; ++var2) {
                                var1.a(this.Q[var2 / 2]);
                                var1.b(this.D / 1000, this.E / 1000, this.M[var2][0] / 1000, this.M[var2][1] / 1000, this.M[var2][2] / 1000, this.M[var2][3] / 1000);
                            }
                        }
                        break;
                    case 10:
                    case 82:
                        if (super.k % 5 < 2 || super.k % 5 == 3) {
                            for (var2 = 1; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2 - 1);
                                var4 = (hso_en) this.W.a(var2);
                                var1.a(-985352);
                                var1.a(var3.a / 1000, var3.b / 1000 - 1, var4.a / 1000, var4.b / 1000 - 1);
                                var1.a(var3.a / 1000, var3.b / 1000 + 1, var4.a / 1000, var4.b / 1000 + 1);
                                var1.a(var3.a / 1000, var3.b / 1000 + 2, var4.a / 1000, var4.b / 1000 + 2);
                                var1.a(-5708810);
                                var1.a(var3.a / 1000, var3.b / 1000, var4.a / 1000, var4.b / 1000);
                            }

                            for (var2 = 1; var2 < this.X.c(); ++var2) {
                                var3 = (hso_en) this.X.a(var2 - 1);
                                if ((var4 = (hso_en) this.X.a(var2)).a != -1 && var3.a != -1) {
                                    var1.a(-985352);
                                    var1.a(var3.a / 1000, var3.b / 1000, var4.a / 1000, var4.b / 1000);
                                    var1.a(var3.a / 1000, var3.b / 1000 + 1, var4.a / 1000, var4.b / 1000 + 1);
                                }
                            }
                        }
                        break;
                    case 11:
                    case 86:
                    case 108:
                    case 114:
                        if (super.u == null) {
                            return;
                        }

                        for (var2 = 0; var2 < this.X.c(); ++var2) {
                            if ((var3 = (hso_en) this.X.a(var2)).n / 2 <= 3) {
                                super.v.c(var3.n / 2, var3.a, var3.b, 0, 3, var1);
                            }
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            if (super.k < var3.n) {
                                super.w.c(hso_ak.f(2), var3.a - 10, var3.b + var3.j * super.k / 1000 - 13, 0, 3, var1);
                                super.u.c(var3.d / 2 % super.u.c, var3.a, var3.b + var3.j * super.k / 1000, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 12:
                        if (super.f < -1) {
                            super.f = -1;
                        }

                        if (super.f != 0) {
                            if ((var7 = (this.W.c() / super.f + 2) * super.k) > this.W.c()) {
                                var7 = this.W.c();
                            }

                            hso_en var15;
                            for (var10 = 1; var10 < var7; ++var10) {
                                var5 = (hso_en) this.W.a(var10 - 1);
                                var15 = (hso_en) this.W.a(var10);
                                var1.a(0);
                                if (super.k <= super.f - 1) {
                                    var1.a(var5.a / 1000 - this.ac, var5.b / 1000 - this.ad, var15.a / 1000 - this.ac, var15.b / 1000 - this.ad);
                                    var1.a(var5.a / 1000 + this.ac, var5.b / 1000 + this.ad, var15.a / 1000 + this.ac, var15.b / 1000 + this.ad);
                                }

                                if (super.k <= super.f - 2) {
                                    var1.a(var5.a / 1000 + 2 * this.ac, var5.b / 1000 + 2 * this.ad, var15.a / 1000 + 2 * this.ac, var15.b / 1000 + 2 * this.ad);
                                }

                                var1.a(-12636649);
                                var1.a(var5.a / 1000, var5.b / 1000, var15.a / 1000, var15.b / 1000);
                            }

                            if (super.k <= super.f - 2) {
                                if ((var7 = (this.X.c() / super.f + 2) * super.k) > this.X.c()) {
                                    var7 = this.X.c();
                                }

                                for (var10 = 1; var10 < var7; ++var10) {
                                    var5 = (hso_en) this.X.a(var10 - 1);
                                    if ((var15 = (hso_en) this.X.a(var10)).a != -1 && var5.a != -1) {
                                        var1.a(0);
                                        var1.a(var5.a / 1000, var5.b / 1000, var15.a / 1000, var15.b / 1000);
                                        var1.a(var5.a / 1000 + this.ac, var5.b / 1000 + this.ad, var15.a / 1000 + this.ac, var15.b / 1000 + this.ad);
                                    }
                                }
                            }
                        }
                        break;
                    case 14:
                    case 81:
                    case 115:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)).n == 0) {
                                super.u.c(super.k % super.u.c, var3.a / 1000, var3.b / 1000, 0, 3, var1);
                            } else if (var3.n > 0) {
                                super.v.c((var3.n - 1) / 2 % super.v.c, var3.a / 1000, var3.b / 1000 - 4 - var3.n, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 20:
                    case 113:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null && !var3.u) {
                                if (var3.m == 0) {
                                    if (super.d == 20) {
                                        var1.a(-5324012);
                                    } else {
                                        var1.a(10549488);
                                    }

                                    var1.a(var3.a, var3.b, var3.a + 6, var3.b + 8);
                                    var1.a(var3.a, var3.b, var3.a + 5, var3.b + 8);
                                } else if (var3.m == 1 && var3.n < 2 && super.d != 113) {
                                    super.u.a(var3.n, var3.a, var3.b - var3.j / 2, 0, var1);
                                }
                            }

                            ++var2;
                        }
                    case 21:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k / 2 % 3, super.g, super.h, 0, 3, var1);
                        super.v.c(super.k / 2 % 3, super.g, super.h, 0, 3, var1);
                        break;
                    case 22:
                    case 31:
                    case 88:
                        if (super.u == null) {
                            return;
                        }

                        if (super.d == 31 || super.d == 88) {
                            for (var2 = 0; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2);
                                super.v.c(var3.n / 2 % super.v.c, var3.a, var3.b, this.ab, 3, var1);
                            }
                        }

                        if (super.k < super.f) {
                            this.a(var1, super.u, this.as, super.g, super.h, false);
                        }
                        break;
                    case 23:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            this.a(var1, super.u, this.as, var3.a, var3.b, false);
                            ++var2;
                        }
                    case 25:
                        if (super.u == null) {
                            return;
                        }

                        for (var2 = 0; var2 < this.W.c(); ++var2) {
                            if ((var3 = (hso_en) this.W.a(var2)) != null) {
                                super.v.c(var3.n % super.v.c, var3.a, var3.b, this.ab, 3, var1);
                            }
                        }

                        if (super.d == 25 && super.k < super.f) {
                            this.a(var1, super.u, this.as, super.g, super.h, false);
                        }
                        break;
                    case 26:
                        if (super.u == null) {
                            return;
                        }

                        for (var2 = 0; var2 < this.W.c(); ++var2) {
                            if ((var3 = (hso_en) this.W.a(var2)).n < 7) {
                                super.u.c(var3.n / 2 % super.u.c, var3.a, var3.b, 0, 3, var1);
                            }
                        }

                        if (super.k >= super.f && super.k <= super.f + 5) {
                            super.v.c((super.k - super.f) / 2 % super.v.c, super.i, super.j - 5, 0, 3, var1);
                        }
                        break;
                    case 27:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)).n < 3) {
                                super.u.c(var3.n % super.u.c, var3.a, var3.b, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 28:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k / 2 % super.u.c, super.g, super.h - super.u.b, 0, 17, var1);
                        break;
                    case 29:
                    case 84:
                    case 107:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var12 = (hso_ej) this.W.a(var2)) != null) {
                                var10 = 0;
                                if (var2 / 2 < this.Q.length) {
                                    var10 = this.Q[var2 / 2];
                                }

                                var1.a(var10);
                                var1.a(var12.a / 1000, var12.b / 1000, var12.c / 1000, var12.d / 1000);
                                if (var12.j) {
                                    var1.a(var12.a / 1000 + 1, var12.b / 1000, var12.c / 1000 + 1, var12.d / 1000);
                                }
                            }

                            ++var2;
                        }
                    case 30:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null && var3.n < 5) {
                                if (var3.n < 4) {
                                    super.u.c(var3.n % super.u.c, var3.a / 1000, var3.b / 1000, 0, 3, var1);
                                } else {
                                    super.u.c(3, var3.a / 1000, var3.b / 1000, 0, 3, var1);
                                }
                            }

                            ++var2;
                        }
                    case 34:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            byte var14 = 0;
                            if (var3.i < 0) {
                                var14 = 2;
                            }

                            super.u.c(var3.n % super.u.c, var3.a, var3.b, var14, 3, var1);
                            if (var3.n % 3 != 2 && super.s != null) {
                                super.v.c(var3.n % super.v.c, super.s.aY, super.s.aZ - super.s.be / 2, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 40:
                        if (super.u == null) {
                            return;
                        }

                        for (var2 = 0; var2 < this.W.c(); ++var2) {
                            if ((var3 = (hso_en) this.W.a(var2)) != null) {
                                var10 = (var3.a + var3.i) / 1000;
                                int var11 = (var3.b + var3.j) / 1000;
                                if (super.k / 2 % 2 == 0) {
                                    this.a(var1, super.u, var3.p, var10, var11, false);
                                } else {
                                    this.a(var1, super.w, var3.p, var10, var11, false);
                                }
                            }
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.X.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.X.a(var2);
                            super.v.c(super.k % super.v.c, var3.a / 1000, var3.b / 1000, 0, 3, var1);
                            ++var2;
                        }
                    case 41:
                    case 83:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            super.u.c(var3.n % super.u.c, var3.a, var3.b, 0, 3, var1);
                            ++var2;
                        }
                    case 42:
                        super.u.c(super.k / 4 % super.u.c, super.g, super.h, 0, 3, var1);
                        if (super.k < super.f / 2) {
                            var2 = 0;

                            while (true) {
                                if (var2 >= this.W.c()) {
                                    break label1296;
                                }

                                var3 = (hso_en) this.W.a(var2);
                                var1.a(-1);
                                if (var3.p == 1) {
                                    var1.a(-7309104);
                                }

                                if (var3.o == 1) {
                                    var1.a(super.g + var3.a, super.h + var3.b, super.g + var3.a, super.h + var3.b - var3.h);
                                }

                                if (var3.p == 2) {
                                    var1.a(-7309104);
                                    var1.a(super.g + var3.a + 1, super.h + var3.b, super.g + var3.a + 1, super.h + var3.b - var3.h);
                                }

                                ++var2;
                            }
                        } else {
                            super.v.c(0, super.g, super.h - 50 - (super.k - super.f / 2 << 1), 0, 3, var1);
                            break;
                        }
                    case 43:
                        super.u.c(super.k / 2 % super.u.c, super.g, super.h - 10, 0, 3, var1);
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            var1.a(-1);
                            if (var3.p == 1) {
                                var1.a(-7309104);
                            }

                            if (var3.o == 1) {
                                var1.a(super.g + var3.a, super.h + var3.b, super.g + var3.a, super.h + var3.b - var3.h);
                            }

                            if (var3.p == 2) {
                                var1.a(-7309104);
                                var1.a(super.g + var3.a + 1, super.h + var3.b, super.g + var3.a + 1, super.h + var3.b - var3.h);
                            }

                            ++var2;
                        }
                    case 46:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < 3) {
                            if (super.s != null) {
                                super.u.c(super.k % super.u.c, super.i, super.j - super.s.be / 2, 0, 3, var1);
                            }
                        } else {
                            super.v.c(super.k / 2 % super.v.c, super.i, super.j + 5, hso_ak.f(2) == 0 ? 0 : 2, 33, var1);
                        }
                        break;
                    case 47:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null && super.k >= var3.o && super.k <= super.f - 3 + var3.o) {
                                super.u.c(var3.p, var3.a / 1000, var3.b / 1000, var3.m, 33, var1);
                                super.v.c((super.k / 3 + var3.o) % super.v.c, var3.a / 1000, var3.b / 1000 + 4, var3.m, 33, var1);
                            }

                            ++var2;
                        }
                    case 49:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < 6) {
                            super.v.c(super.k / 2, this.D, this.E, 0, 3, var1);
                        }

                        for (var2 = 0; var2 < this.W.c(); ++var2) {
                            var3 = (hso_en) this.W.a(var2);
                            super.u.c(var3.n % super.u.c, var3.a, var3.b, 0, 3, var1);
                        }

                        if (super.k >= super.f && super.k < super.f + 6) {
                            super.v.c((super.k - super.f) / 2, super.i, super.j, 0, 3, var1);
                        }
                        break;
                    case 50:
                        if (super.k < 3 && super.u != null) {
                            super.u.c(super.k % super.u.c, super.g, super.h, this.ab, this.as, var1);
                        }
                        break;
                    case 51:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            super.u.c(super.k % super.u.c, super.g, super.h, 0, 3, var1);
                            if (super.k > 8) {
                                if ((var2 = super.f - super.k) < 1) {
                                    var2 = 1;
                                }

                                for (var7 = 0; var7 < var2; ++var7) {
                                    if (var7 == var2 - 1) {
                                        var1.a(-65536);
                                    } else {
                                        var1.a(-1);
                                    }

                                    var1.a(super.g + var7 * this.F, super.h + var7 * this.G, this.D + var7 * this.F, this.E + var7 * this.G);
                                    var1.a(super.g - var7 * this.F, super.h - var7 * this.G, this.D - var7 * this.F, this.E - var7 * this.G);
                                }
                            }
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null) {
                                super.v.c(var3.n % super.v.c, var3.a, var3.b, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 52:
                    case 54:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k / 2 % super.u.c, super.i, super.j, hso_ak.f(2) == 0 ? 0 : 2, 33, var1);
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            super.v.c(var3.n / 2 % super.v.c, var3.a, var3.b, 0, 3, var1);
                            ++var2;
                        }
                    case 53:
                    case 64:
                    case 78:
                    case 104:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            if (super.k <= super.f) {
                                var9 = false;
                                byte var8 = 3;
                                if (super.k > super.f - 5) {
                                    var10 = super.f - super.k;
                                    var8 = 5;
                                } else {
                                    var10 = 2;
                                }

                                var1.a(super.u.d, 0, 0, super.u.a, super.u.b / var8 * (var10 + 1), 0, var3.a, var3.b, 33);
                                if (super.k < 3) {
                                    super.v.c(super.k, var3.a, var3.b + 10, 0, 33, var1);
                                }
                            }

                            ++var2;
                        }
                    case 55:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < 6) {
                            super.u.c(super.k / 2, super.i, super.j, 0, 3, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if (var2 < this.W.c()) {
                                var12 = (hso_ej) this.W.a(var2);
                                var1.a(-7);
                                if (var12.i == 1) {
                                    var1.a(-462656);
                                }

                                var1.a(var12.a, var12.b, var12.c, var12.d);
                                if (var12.j) {
                                    var1.a(-466864);
                                    var1.a(var12.a + 1, var12.b - 1, var12.c + 1, var12.d - 1);
                                }
                            }

                            ++var2;
                        }
                    case 56:
                        if (this.A == 10) {
                            super.u.c(super.k / 2 % super.u.c, super.g, super.h + 5, 0, 33, var1);
                        } else if (this.A == 11) {
                            super.u.c(super.k % super.u.c, super.g, super.h + 5, 0, 33, var1);
                        }
                        break;
                    case 57:
                    case 70:
                        var2 = this.W.c() - 1;

                        while (true) {
                            if (var2 < 0) {
                                break label1296;
                            }

                            if ((var12 = (hso_ej) this.W.a(var2)) != null && var12.g < 6) {
                                var1.a(this.Q[var2]);
                                var1.a(var12.a / 1000, var12.b / 1000, var12.c / 1000, var12.d / 1000);
                                if (var12.j) {
                                    var1.a(var12.a / 1000 + 1, var12.b / 1000 + 1, var12.c / 1000 + 1, var12.d / 1000);
                                }
                            }

                            --var2;
                        }
                    case 58:
                        if (super.k < 2) {
                            var1.a(-1);
                            var1.c(super.g - 9, hso_p.d.b, 18, (super.h - hso_p.d.b) / 2 * (super.k + 1));
                            var1.a(-7309104);
                            var1.c(super.g - 10, hso_p.d.b, 2, (super.h - hso_p.d.b) / 2 * (super.k + 1));
                            var1.c(super.g + 9, hso_p.d.b, 2, (super.h - hso_p.d.b) / 2 * (super.k + 1));
                        } else if (super.k < 8) {
                            var1.a(-1);
                            var1.c(super.g - 9 + (super.k - 2) / 2 * 3, hso_p.d.b, 18 - (super.k - 2) / 2 * 6, super.h - hso_p.d.b);
                            var1.a(-7309104);
                            var1.c(super.g - 10 + (super.k - 2) / 2 * 3, hso_p.d.b, 2, super.h - hso_p.d.b);
                            var1.c(super.g + 9 - (super.k - 2) / 2 * 3, hso_p.d.b, 2, super.h - hso_p.d.b);
                        }

                        if (super.k > 1 && super.k < 11) {
                            super.u.c(3 + (super.k - 2) / 3, super.g, super.h + 5, 0, 33, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            super.v.c(super.k < 8 ? 0 : 1, var3.a, var3.b + 4, 0, 33, var1);
                            ++var2;
                        }
                    case 59:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
                        } else {
                            super.v.c((super.k - super.f) / 2 % super.v.c, super.i, super.j, 0, 3, var1);
                        }
                        break;
                    case 61:
                    case 77:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            if (super.k < var3.n) {
                                for (var10 = 0; var10 < var3.s.c(); ++var10) {
                                    if ((var5 = (hso_en) var3.s.a(var10)).m == 1) {
                                        super.w.c(0, var5.a, var5.b + var3.j * super.k / 1000, 0, 3, var1);
                                    } else {
                                        super.v.c(var5.p, var5.a, var5.b + var3.j * super.k / 1000, 0, 3, var1);
                                    }
                                }

                                super.u.c(var3.m, var3.a, var3.b + var3.j * super.k / 1000, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 62:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)).n > 0) {
                                this.a(var1, super.u, var3.p, var3.a, var3.b, false);
                            }

                            ++var2;
                        }
                    case 63:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)).n > 0) {
                                this.a(var1, super.u, var3.p, var3.a, var3.b, false);
                            }

                            ++var2;
                        }
                    case 67:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k / 2, this.D, this.E, 0, 3, var1);
                        if (super.k < super.f && super.v != null) {
                            super.v.c(super.k % super.v.c, super.g, super.h, 0, 3, var1);
                        }
                        break;
                    case 68:
                        if (super.k < super.f) {
                            if (this.A == 0) {
                                super.u.c(super.k, super.g, super.h, 0, 3, var1);
                            } else {
                                super.u.c(super.k / 2, super.g, super.h, 0, 3, var1);
                            }
                        }
                        break;
                    case 69:
                        super.u.c(super.k / 4 % super.u.c, super.g, super.h, 0, 3, var1);
                        break;
                    case 71:
                        if (super.k < 6) {
                            super.v.c(super.k / 2, super.g, super.h + this.af.be / 2, 0, 33, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            if (super.k <= super.f) {
                                var9 = false;
                                if (super.k < 3) {
                                    var10 = super.k;
                                } else if (super.k > super.f - 3) {
                                    var10 = super.f - super.k;
                                } else {
                                    var10 = hso_ak.c(2, 4);
                                }

                                super.u.c(var10, var3.a, var3.b, 0, 33, var1);
                                if (super.k < 6) {
                                    super.v.c(super.k / 2, var3.a, var3.b + 10, 0, 33, var1);
                                }
                            }

                            ++var2;
                        }
                    case 72:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            super.v.c(super.k / 2 % super.v.c, super.g, super.h, 0, 3, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var13 = (hso_ar) this.W.a(var2);
                            this.a(var1, super.u, var13.e, var13.a, var13.b, false);
                            ++var2;
                        }
                    case 73:
                        if (super.u == null) {
                            return;
                        }

                        for (var2 = 0; var2 < this.X.c(); ++var2) {
                            var3 = (hso_en) this.X.a(var2);
                            super.v.c(var3.n / 2 % super.v.c, var3.a, var3.b, this.ab, 3, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)).n > 0) {
                                this.a(var1, super.u, var3.p, var3.a, var3.b, false);
                            }

                            ++var2;
                        }
                    case 74:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            super.u.c(super.k / 2 % super.u.c, super.g, super.h + this.af.be / 2, 0, 33, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var13 = (hso_ar) this.W.a(var2);
                            super.u.c(super.k / 2 % super.u.c, var13.a, var13.b, this.ab, 33, var1);
                            ++var2;
                        }
                    case 75:
                        if (super.u == null) {
                            return;
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            if (super.k <= super.f) {
                                var9 = false;
                                if (super.k < 5) {
                                    var10 = super.k / 2;
                                } else if (0 > super.f - 5) {
                                    var10 = (super.f - super.k) / 2;
                                } else {
                                    var10 = hso_ak.c(2, 4);
                                }

                                super.u.c(var10, var3.a, var3.b, 0, 33, var1);
                            }

                            ++var2;
                        }
                    case 76:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < 6) {
                            super.v.c(super.k / 2 % super.v.c, super.g, super.h, 0, 3, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            super.u.c(hso_ak.f(3), var3.a / 1000 + hso_ak.g(5), var3.b / 1000 + hso_ak.g(5), 0, 3, var1);
                            ++var2;
                        }
                    case 85:
                        if (super.s != null && !super.s.cK && !super.s.bF && !super.s.cL) {
                            for (var2 = this.W.c() - 1; var2 >= 0; --var2) {
                                if ((var12 = (hso_ej) this.W.a(var2)) != null) {
                                    var9 = false;
                                    var10 = c[0][var12.i];
                                    var1.a(var10);
                                    var1.a(var12.a, var12.b, var12.c, var12.d);
                                    if (var12.j) {
                                        var1.a(var12.a + 1, var12.b, var12.c + 1, var12.d);
                                    }
                                }
                            }
                        }
                        break;
                    case 87:
                        super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
                        break;
                    case 89:
                    case 92:
                        if (super.u == null) {
                            return;
                        }

                        if (super.d == 89 || super.d == 92) {
                            for (var2 = 0; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2);
                                super.v.c(var3.n / 2 % super.v.c, var3.a, var3.b, this.ab, 3, var1);
                            }
                        }

                        if (super.k < super.f) {
                            this.a(var1, super.u, this.as, super.g, super.h, false);
                        }
                        break;
                    case 90:
                        this.b(var1);
                        break;
                    case 91:
                        this.c(var1);
                        break;
                    case 93:
                        if (super.k < 6) {
                            super.v.c(super.k / 2, super.g, super.h + this.af.be / 2, 0, 33, var1);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            var3 = (hso_en) this.W.a(var2);
                            if (super.k <= super.f) {
                                var9 = false;
                                if (super.k < 3) {
                                    var10 = super.k;
                                } else if (super.k > super.f - 3) {
                                    var10 = super.f - super.k;
                                } else {
                                    var10 = hso_ak.c(2, 4);
                                }

                                super.u.c(var10, var3.a, var3.b, 0, 33, var1);
                            }

                            ++var2;
                        }
                    case 94:
                        if (super.k < 0) {
                            return;
                        }

                        if (super.u != null && super.s != null) {
                            super.u.c(super.t[super.k], super.s.aY + 2, super.s.aZ + 8, 0, 33, var1);
                        }
                        break;
                    case 95:
                        if (super.k % 5 < 2 || super.k % 5 == 3) {
                            for (var2 = 1; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2 - 1);
                                var4 = (hso_en) this.W.a(var2);
                                var1.a(-5498433);
                                var1.a(var3.a / 1000, var3.b / 1000 - 1, var4.a / 1000, var4.b / 1000 - 1);
                                var1.a(var3.a / 1000, var3.b / 1000 + 1, var4.a / 1000, var4.b / 1000 + 1);
                                var1.a(var3.a / 1000, var3.b / 1000 + 2, var4.a / 1000, var4.b / 1000 + 2);
                                var1.a(-1660952);
                                var1.a(var3.a / 1000, var3.b / 1000, var4.a / 1000, var4.b / 1000);
                            }

                            for (var2 = 1; var2 < this.X.c(); ++var2) {
                                var3 = (hso_en) this.X.a(var2 - 1);
                                if ((var4 = (hso_en) this.X.a(var2)).a != -1 && var3.a != -1) {
                                    var1.a(-5498433);
                                    var1.a(var3.a / 1000, var3.b / 1000, var4.a / 1000, var4.b / 1000);
                                    var1.a(var3.a / 1000, var3.b / 1000 + 1, var4.a / 1000, var4.b / 1000 + 1);
                                }
                            }
                        }
                        break;
                    case 96:
                        if (super.u == null) {
                            return;
                        }

                        if (super.d == 96) {
                            for (var2 = 0; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2);
                                super.v.c(var3.n / 2 % super.v.c, var3.a, var3.b, this.ab, 3, var1);
                            }
                        }

                        if (super.k < super.f) {
                            this.a(var1, super.u, this.as, super.g, super.h, false);
                        }
                        break;
                    case 97:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            super.u.c(super.k % super.u.c, super.g, super.h, 0, 3, var1);
                            if (super.k > 8) {
                                if ((var2 = super.f - super.k) < 1) {
                                    var2 = 1;
                                }

                                for (var7 = 0; var7 < var2; ++var7) {
                                    if (var7 == var2 - 1) {
                                        var1.a(-2560);
                                    } else {
                                        var1.a(-1);
                                    }

                                    var1.a(super.g + var7 * this.F, super.h + var7 * this.G, this.al + var7 * this.F, this.am + var7 * this.G);
                                    var1.a(super.g - var7 * this.F, super.h - var7 * this.G, this.al - var7 * this.F, this.am - var7 * this.G);
                                }
                            }
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null) {
                                super.v.c(var3.n % super.v.c, var3.a, var3.b, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 98:
                        if (super.u == null) {
                            return;
                        }

                        if (super.d == 98) {
                            for (var2 = 0; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2);
                                super.v.c(var3.n / 2 % super.v.c, var3.a, var3.b, this.ab, 3, var1);
                            }
                        }

                        if (super.k < super.f) {
                            this.a(var1, super.u, this.as, super.g, super.h, false);
                        }
                        break;
                    case 99:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            this.a(var1, super.u, this.as, super.g, super.h, false);
                        }
                        break;
                    case 101:
                        if (this.ai) {
                            hso_cg.aJ.c(this.az[this.ay], super.g - 8, super.h - (17 + (super.s.ee != -1 ? super.s.eb : 0)), 0, 33, var1);
                        }
                        break;
                    case 102:
                        hso_cg.aI.c(this.aB[this.aA], super.g, super.h - (this.aw + (super.s.ee != -1 ? super.s.eb : 0)), 0, 33, var1);
                        break;
                    case 103:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.ao.length) {
                                break label1296;
                            }

                            super.u.c(super.k / 2 % super.u.c, hso_ak.b(this.ap[var2]) * this.ao[var2] / 1024 + super.g + 2, hso_ak.a(this.ap[var2]) * this.ao[var2] / 1024 + super.h - this.U - 20, 0, 3, var1);
                            if (this.T <= 0) {
                                var1.a(MainObject.db, hso_ak.b(this.ap[var2]) * this.ao[var2] / 1024 + super.g + 2, hso_ak.a(this.ap[var2]) * this.ao[var2] / 1024 + super.h - 10, 3);
                            }

                            ++var2;
                        }
                    case 105:
                        if (super.u == null) {
                            return;
                        }

                        if (super.k < super.f) {
                            super.u.c(super.k % super.u.c, super.g, super.h, 0, 3, var1);
                            if (super.k > 8) {
                                if ((var2 = super.f - super.k) < 1) {
                                    var2 = 1;
                                }

                                for (var7 = 0; var7 < var2; ++var7) {
                                    if (var7 == var2 - 1) {
                                        var1.a(720469);
                                    } else {
                                        var1.a(-1);
                                    }

                                    var1.a(super.g + var7 * this.F, super.h + var7 * this.G, this.D + var7 * this.F, this.E + var7 * this.G);
                                    var1.a(super.g - var7 * this.F, super.h - var7 * this.G, this.D - var7 * this.F, this.E - var7 * this.G);
                                }
                            }
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null) {
                                super.v.c(var3.n % super.v.c, var3.a, var3.b, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 106:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k % super.u.c, super.g, super.h, 0, 3, var1);

                        for (var2 = 0; var2 < this.L; ++var2) {
                            if (var2 == this.L - 1) {
                                var1.a(720469);
                            } else {
                                var1.a(-1);
                            }

                            var1.a(super.g + var2 * this.F, super.h + var2 * this.G, this.D + var2 * this.F, this.E + var2 * this.G);
                            var1.a(super.g - var2 * this.F, super.h - var2 * this.G, this.D - var2 * this.F, this.E - var2 * this.G);
                        }

                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null) {
                                super.v.c(var3.n % super.v.c, var3.a, var3.b, 0, 3, var1);
                            }

                            ++var2;
                        }
                    case 109:
                    case 110:
                        super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
                        break;
                    case 111:
                        if (super.k % 5 < 2 || super.k % 5 == 3) {
                            for (var2 = 1; var2 < this.W.c(); ++var2) {
                                var3 = (hso_en) this.W.a(var2 - 1);
                                var4 = (hso_en) this.W.a(var2);
                                var1.a(16514254);
                                var1.a(var3.a / 1000, var3.b / 1000 - 1, var4.a / 1000, var4.b / 1000 - 1);
                                var1.a(var3.a / 1000, var3.b / 1000 + 1, var4.a / 1000, var4.b / 1000 + 1);
                                var1.a(var3.a / 1000, var3.b / 1000 + 2, var4.a / 1000, var4.b / 1000 + 2);
                                var1.a(16514254);
                                var1.a(var3.a / 1000, var3.b / 1000, var4.a / 1000, var4.b / 1000);
                            }

                            for (var2 = 1; var2 < this.X.c(); ++var2) {
                                var3 = (hso_en) this.X.a(var2 - 1);
                                if ((var4 = (hso_en) this.X.a(var2)).a != -1 && var3.a != -1) {
                                    var1.a(16514254);
                                    var1.a(var3.a / 1000, var3.b / 1000, var4.a / 1000, var4.b / 1000);
                                    var1.a(var3.a / 1000, var3.b / 1000 + 1, var4.a / 1000, var4.b / 1000 + 1);
                                }
                            }
                        }
                        break;
                    case 112:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.W.c()) {
                                break label1296;
                            }

                            if ((var3 = (hso_en) this.W.a(var2)) != null && super.k >= var3.o && super.k <= super.f - 3 + var3.o) {
                                super.v.c((super.k / 3 + var3.o) % super.v.c, var3.a / 1000, var3.b / 1000 + 4, var3.m, 33, var1);
                            }

                            ++var2;
                        }
                    case 124:
                        if (super.u == null) {
                            return;
                        }

                        super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
                        break;
                    case 125:
                        var2 = 0;

                        while (true) {
                            if (var2 >= this.L) {
                                break label1296;
                            }

                            if (var2 == this.L - 1) {
                                var1.a(720469);
                            } else {
                                var1.a(-1);
                            }

                            var1.a(super.g, super.h, this.D + var2 * this.F, this.E + var2 * this.G);
                            var1.a(super.g - var2 * this.F, super.h - var2 * this.G, this.D - var2 * this.F, this.E - var2 * this.G);
                            ++var2;
                        }
                    case 126:
                        for (var2 = 0; var2 < this.L; ++var2) {
                            if (var2 == this.L - 1) {
                                var1.a(15771896);
                            } else {
                                var1.a(-1);
                            }

                            var1.a(super.g, super.h, this.D + var2 * this.F, this.E + var2 * this.G);
                            var1.a(super.g - var2 * this.F, super.h - var2 * this.G, this.D - var2 * this.F, this.E - var2 * this.G);
                        }
                }
            } catch (Exception var6) {
                this.c();
            }

            this.ax = 0;
        }
    }

    public final void a() {
        ++super.k;
        ++super.q;

        try {
            if (super.s != null) {
                this.H = super.s.aY;
                this.I = super.s.aZ - super.s.be / 2;
            }

            boolean var1;
            if (super.k == this.V && this.V > 0) {
                var1 = true;
                if (hso_dw.g && hso_cf.d(hso_ft.p.d)) {
                    var1 = false;
                }

                if (!this.ah && var1) {
                    this.d();
                }

                this.b();
            }

            var1 = true;
            hso_en var2;
            int var3;
            int var5;
            int var11;
            int var12;
            int var14;
            hso_ej var15;
            hso_en var16;
            hso_en var10000;
            hso_en var17;
            hso_bf var18;
            MainObject var21;
            label2005:
            switch (super.d) {
                case 0:
                    this.E();
                    break;
                case 1:
                case 22:
                case 38:
                    if (MainObject.c(super.g, super.i, super.h, super.j) <= 8 || super.k >= super.f) {
                        if (super.d == 22) {
                            if (super.s != null) {
                                GameScreen.a(7, super.i, super.j + super.s.be / 4);
                            }
                        } else if (super.d == 38) {
                            GameScreen.a(2, super.i, super.j);
                        }

                        this.c();
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 24:
                case 32:
                case 33:
                case 35:
                case 36:
                case 37:
                case 39:
                case 44:
                case 45:
                case 48:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                default:
                    break;
                case 6:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 10:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 11:
                case 86:
                case 108:
                case 114:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        var16 = (hso_en) this.W.a(var12);
                        if (super.k == var16.n) {
                            if (super.d == 11) {
                                hso_cs.t = 103;
                            }

                            if (super.d != 114) {
                                GameScreen.a(0, var16.a, var16.b + var16.j * super.k / 1000 - 5);
                                GameScreen.a(9, var16.a, var16.b + var16.j * super.k / 1000 + 5);
                                GameScreen.a(26, var16.a, var16.b + var16.j * super.k / 1000 + 10);
                            } else {
                                GameScreen.a(49, var16.a, var16.b + var16.j * super.k / 1000 + 10);
                                GameScreen.a(28, var16.a, var16.b + var16.j * super.k / 1000 + 10);
                            }
                        } else if (super.k < var16.n) {
                            var16.a += var16.i;
                            var1 = false;
                            if (hso_ak.f(2) == 0) {
                                (var17 = new hso_en()).a = var16.a - var16.i;
                                var17.b = var16.b + var16.j * (super.k - 1) / 1000;
                                this.X.a(var17);
                            }
                        }
                    }

                    for (var12 = 0; var12 < this.X.c(); ++var12) {
                        ++(var16 = (hso_en) this.X.a(var12)).n;
                        if (var16.n / 2 > 3 && this.ax == 0) {
                            this.X.d(var16);
                            --var12;
                        }
                    }

                    if (var1) {
                        this.c();
                    }
                    break;
                case 12:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 14:
                case 81:
                case 115:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        if ((var16 = (hso_en) this.W.a(var12)).n == 0) {
                            var1 = false;
                            if (super.k >= super.f) {
                                var16.n = 1;
                            } else {
                                var16.a += var16.i;
                                var16.b += var16.j;
                                if ((super.d == 14 || super.d == 115 || super.k > 6) && ((var14 = hso_ft.p.a(var16.a / 1000, var16.b / 1000)) == -1 || var14 == 1 || !hso_dx.a(var16.a / 1000, var16.b / 1000, super.u.a, super.u.b))) {
                                    var16.n = 1;
                                }
                            }
                        } else if (var16.n > 0) {
                            ++var16.n;
                            if ((var16.n - 1) / 2 >= super.v.c) {
                                var16.n = -1;
                                this.W.d(var16);
                            }

                            var1 = false;
                        }
                    }

                    if (var1) {
                        this.c();
                    }
                    break;
                case 20:
                case 113:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        if ((var16 = (hso_en) this.W.a(var12)).m == 0) {
                            var16.a();
                            if (var16.n >= var16.o) {
                                var16.m = 1;
                                var16.n = 0;
                                if (!hso_ft.B && hso_ak.f(4) == 0) {
                                    GameScreen.a(super.d == 20 ? 24 : 10, var16.a, var16.b);
                                }
                            }
                        } else if (var16.m == 1) {
                            ++var16.n;
                            if (var16.n >= 2 && this.ax == 0) {
                                this.W.d(var16);
                                --var12;
                            }
                        }
                    }

                    if (super.k < super.f) {
                        if (!hso_ft.B || hso_ft.ai % 2 == 0) {
                            this.E = hso_p.d.b - hso_ak.c(10, 20);
                            this.l();
                        }
                    } else if (this.W.c() == 0) {
                        this.c();
                    }
                    break;
                case 21:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 23:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var16 = (hso_en) this.W.a(var12)).a();
                        if (var16.n >= var16.o) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        if (super.s != null) {
                            GameScreen.a(12, super.i, super.j + super.s.be / 4);
                        }

                        this.c();
                    }

                    if (super.k == 0) {
                        var12 = super.g;
                        var3 = super.h;
                        switch (super.m) {
                            case 0:
                                var3 += 20;
                                break;
                            case 1:
                                var3 -= 20;
                                break;
                            case 2:
                                var12 -= 20;
                                break;
                            case 3:
                                var12 += 20;
                        }

                        GameScreen.a(13, var12, var3);
                    }
                    break;
                case 25:
                    if (super.k == super.f && super.s != null) {
                        if (super.d == 25) {
                            GameScreen.a(10, super.i, super.j);
                            GameScreen.a(15, super.i, super.j + super.s.be / 4);
                        } else {
                            GameScreen.a(4, super.i, super.j);
                            GameScreen.a(14, super.i, super.j + super.s.be / 4);
                        }
                    }

                    if (super.k < super.f) {
                        (var2 = new hso_en()).a = super.g;
                        var2.b = super.h;
                        this.W.a(var2);
                    } else if (this.W.c() == 0 && super.k >= super.f) {
                        this.c();
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n > 3) {
                            this.W.d(var16);
                            ++var16.n;
                            --var12;
                        }

                        ++var12;
                    }
                case 26:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n >= 7) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k <= super.f) {
                        (var2 = new hso_en()).a = super.g;
                        var2.b = super.h;
                        this.W.a(var2);
                    } else {
                        if (super.k == super.f + 1 && super.d == 26) {
                            hso_cs.t = 103;
                        }

                        if (this.W.c() == 0 && super.k > super.f + 5) {
                            this.c();
                        }
                    }
                    break;
                case 27:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n >= 3) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k < super.f) {
                        if (super.k == 0) {
                            GameScreen.a(6, super.g, super.h);
                            this.b(super.g, super.i, super.h, super.j);
                        }

                        (var2 = new hso_en()).a = super.g;
                        var2.b = super.h - 10;
                        this.W.a(var2);
                    } else if (this.af != null) {
                        if (super.k == super.f) {
                            if (this.af.cF != 4 && this.af.cF != 3) {
                                this.af.cF = 2;
                                this.af.cP = 6;
                                this.af.ce = 5;
                            }
                        } else if (super.k == super.f + 5 && this.af.cF == 2) {
                            super.k = 0;
                            this.af.cF = 0;
                        }

                        if (this.af.bF) {
                            this.af.bF = false;
                        }

                        if (this.W.c() == 0) {
                            if (this.af.cF == 2) {
                                super.k = 0;
                                this.af.cF = 0;
                            }

                            this.c();
                            if (hso_ft.p.a(this.af.aY, this.af.aZ) == 2) {
                                this.af.cV = true;
                            } else {
                                this.af.cV = false;
                            }
                        }
                    }

                    if (super.k == this.V && super.s != null) {
                        GameScreen.a(5, super.s.aY, super.s.aZ - super.s.be / 2);
                    }
                    break;
                case 28:
                    if (super.k >= super.f) {
                        this.c();
                    }

                    if (super.k == 0) {
                        GameScreen.a(9, super.i, super.j);
                        if (GameScreen.d(super.i, super.j)) {
                            GameScreen.a(1, super.i, super.j);
                        }
                    }
                    break;
                case 29:
                case 84:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var15 = (hso_ej) this.W.a(var12)).a();
                        if (super.k >= super.f && this.ax == 0) {
                            this.W.d(var15);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.ax == 0) {
                        if (hso_ft.aj - this.z >= (long) super.e) {
                            if (this.ax == 0) {
                                this.W.d();
                            }

                            this.c();
                        } else {
                            super.f = hso_ak.c(4, 6);
                            super.k = 0;
                            this.a(super.n, this.ac, this.ad);
                        }
                    }
                    break;
                case 30:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        if ((var16 = (hso_en) this.W.a(var12)).n < 5) {
                            var16.a();
                            var16.i += var16.i / 5;
                            var16.j += var16.j / 5;
                        } else if (this.ax == 0) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (this.W.c() == 0) {
                        if (hso_ft.aj - this.z > (long) super.e) {
                            this.c();
                        } else {
                            this.o();
                        }
                    }
                    break;
                case 31:
                    if (super.k < super.f && super.k > 1) {
                        (var2 = new hso_en()).a = super.g - super.o;
                        var2.b = super.h - super.p;
                        this.W.a(var2);
                    } else if (this.W.c() == 0 && super.k >= super.f) {
                        this.c();
                    }

                    if (super.k == super.f && super.s != null) {
                        GameScreen.a(36, super.i, super.j + super.s.be / 4);
                        GameScreen.a(14, super.i, super.j + super.s.be / 4);
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 34:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var16 = (hso_en) this.W.a(var12)).a();
                        if (var16.n >= 3) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k == 3 && super.s != null) {
                        this.a(180, super.s);
                    }

                    if (super.k == 6) {
                        if (this.af != null) {
                            this.B = 9;
                            if (this.af != GameScreen.f) {
                                GameScreen.b(this.B);
                            }
                        }

                        if (this.ae >= this.ag.c()) {
                            super.k = 56;
                        } else {
                            var21 = null;
                            if (this.ae < this.ag.c()) {
                                super.k = 0;

                                do {
                                    if ((var21 = MainObject.e((var18 = (hso_bf) this.ag.a(this.ae)).a, var18.b)) != null) {
                                        if (var21.cF == 4) {
                                            var21 = null;
                                        } else {
                                            super.s = var21;
                                            if (super.s != null) {
                                                this.a(0, super.s);
                                            }
                                        }
                                    }

                                    ++this.ae;
                                } while (var21 == null && this.ae < this.ag.c());
                            }

                            if (this.ae >= this.ag.c() && var21 == null) {
                                super.k = 56;
                            }
                        }
                    }

                    if (super.k == super.f - 1 && this.af != null) {
                        switch (this.af.Direction) {
                            case 0:
                                this.af.Direction = 1;
                                break;
                            case 1:
                                this.af.Direction = 0;
                                break;
                            case 2:
                                this.af.Direction = 3;
                                break;
                            case 3:
                                this.af.Direction = 2;
                        }

                        if (this.af.cF != 4 && this.af.cF != 3) {
                            this.af.cF = 2;
                            this.af.cP = 6;
                            this.af.ce = 5;
                            this.af.dW = 6;
                        }

                        this.af.bF = false;
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                        if (this.af != null && this.af.cF == 2) {
                            super.k = 0;
                            this.af.cF = 0;
                            if (this.af.c_()) {
                                GameScreen.f.aY = GameScreen.f.F;
                                GameScreen.f.aZ = GameScreen.f.G;
                                GameScreen.f.N();
                                Service.a().a((short) GameScreen.f.aY, (short) GameScreen.f.aZ);
                            }
                        }
                    }
                    break;
                case 40:
                    if (super.k <= 4) {
                        if (super.s != null && (super.i != super.s.aY || super.j != super.s.aZ - super.s.be / 2) && super.s.cF != 4) {
                            for (var12 = 0; var12 < this.W.c(); ++var12) {
                                var16 = (hso_en) this.W.a(var12);
                                super.i = super.s.aY;
                                super.j = super.s.aZ - super.s.be / 2;
                                var16.a = super.i * 1000;
                                var16.b = super.j * 1000;
                                var16.c = hso_ak.d(var16.c + 5);
                                var16.i = hso_ak.a(hso_ak.d(var16.c)) * this.N;
                                var16.j = hso_ak.b(hso_ak.d(var16.c)) * this.N;
                                var14 = hso_ak.a(-var16.i, -var16.j);
                                var16.p = this.c(var14);
                            }
                        }
                    } else {
                        for (var12 = 0; var12 < this.W.c(); ++var12) {
                            var16 = (hso_en) this.W.a(var12);
                            if (super.k % 3 == 0) {
                                var16.i /= 2;
                                var16.j /= 2;
                            }

                            if (super.k > 7) {
                                this.W.d();
                                GameScreen.a(6, super.i, super.j);
                            }
                        }
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.X.c()) {
                            break label2005;
                        }

                        ((hso_en) this.X.a(var12)).a();
                        if (super.k > 16) {
                            this.X.d();
                            this.c();
                        }

                        ++var12;
                    }
                case 41:
                    this.F();

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n > 4) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }
                    break;
                case 42:
                    if (this.af != null) {
                        super.g = this.af.aY;
                        super.h = this.af.aZ;
                    }

                    if (super.k == 0 && this.af != null) {
                        GameScreen.a(43, this.af.ct, this.af.cu, this.ag);
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }

                    if (super.k == super.f / 2) {
                        GameScreen.a(21, super.g, super.h);
                    }

                    if (super.k < super.f / 2) {
                        for (var12 = 0; var12 < this.W.c(); ++var12) {
                            var16 = (hso_en) this.W.a(var12);
                            if (hso_ak.f(3) == 0) {
                                if (var16.o == 1) {
                                    var16.o = 0;
                                } else {
                                    var16.o = 1;
                                    var16.p = hso_ak.f(4);
                                }
                            }
                        }
                    }
                    break;
                case 43:
                    if (this.af != null) {
                        super.g = this.af.aY;
                        super.h = this.af.aZ;
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        var16 = (hso_en) this.W.a(var12);
                        if (hso_ak.f(3) == 0) {
                            if (var16.o == 1) {
                                var16.o = 0;
                            } else {
                                var16.o = 1;
                                var16.p = hso_ak.f(4);
                            }
                        }

                        ++var12;
                    }
                case 46:
                    if (super.s != null) {
                        if ((hso_ak.e(super.i - super.s.aY) > 2 || hso_ak.e(super.j - super.s.aZ) > 2) && hso_ak.f(3) == 0) {
                            GameScreen.a(24, super.i, super.j - 5);
                        }

                        super.i = super.s.aY;
                        super.j = super.s.aZ;
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 47:
                case 112:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        var16 = (hso_en) this.W.a(var12);
                        if (super.k == var16.o) {
                            GameScreen.a(26, var16.a / 1000, var16.b / 1000 - 5);
                        }
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 49:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n >= 5) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k < super.f) {
                        (var2 = new hso_en()).a = super.g;
                        var2.b = super.h;
                        this.W.a(var2);
                    } else if (this.W.c() == 0 && super.k >= super.f + 6) {
                        this.c();
                    }
                    break;
                case 50:
                    if (super.k >= 6) {
                        this.c();
                    }

                    if (super.k != -1 && super.k < 6) {
                        if (this.af != null) {
                            MainObject var24;
                            if (super.k < 3) {
                                var24 = this.af;
                                var24.aY += this.D;
                                var24 = this.af;
                                var24.aZ += this.E;
                            } else if (super.k < 6) {
                                var24 = this.af;
                                var24.aY -= this.D;
                                var24 = this.af;
                                var24.aZ -= this.E;
                            }
                        }
                        break;
                    }

                    return;
                case 51:
                case 105:
                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }

                    if (super.k < super.f) {
                        if (super.k == 8) {
                            var12 = 2;
                            if (super.s != null && this.af != null) {
//                                this.af.Direction = a(this.af, super.s);
                                this.af.setDirection(a(this.af, super.s), "public final void a()", hso_i.class);
                                var12 = this.af.Direction;
                            }

                            if (var12 != 2 && var12 != 3) {
                                this.G = 0;
                                this.F = 1;
                            } else {
                                this.G = 1;
                                this.F = 0;
                            }

                            if (super.s != null && this.af != null) {
                                var3 = hso_ak.a(super.s.aY - this.af.aY, super.s.aZ - this.af.aZ);
                                var14 = 320;
                                if (320 < hso_ft.X) {
                                    var14 = hso_ft.X;
                                }

                                if (var14 < hso_ft.W) {
                                    var14 = hso_ft.W;
                                }

                                this.D = super.g + hso_ak.b(var3) * var14 / 1000;
                                this.E = super.h + hso_ak.a(var3) * var14 / 1000;
                                super.i = super.s.aY;
                                super.j = super.s.aZ - super.s.be / 2;
                            }
                        }

                        if (super.k > 8 && super.k % 3 == 2) {
                            (var2 = new hso_en()).a = super.i + hso_ak.g(5);
                            var2.b = super.j + hso_ak.g(5);
                            this.W.a(var2);
                        }
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n >= 4) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 52:
                case 54:
                    if (super.d == 54) {
                        if (super.k == 0) {
                            GameScreen.a(3, super.i, super.j - 10);
                        }
                    } else if (super.d == 52 && super.k == 0) {
                        GameScreen.a(14, super.i, super.j);
                    }

                    if (super.k < super.f && super.s != null) {
                        if ((hso_ak.e(super.i - super.s.aY) > 2 || hso_ak.e(super.j - super.s.aZ) > 2) && hso_ak.f(3) == 0) {
                            (var2 = new hso_en()).a = super.i;
                            var2.b = super.j - 5;
                            this.W.a(var2);
                        }

                        super.i = super.s.aY;
                        super.j = super.s.aZ;
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 >= 4) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 53:
                case 64:
                case 71:
                case 75:
                case 78:
                case 104:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        var16 = (hso_en) this.W.a(var12);
                        if (super.k == 1) {
                            hso_cs.t = 103;
                            if (super.d == 75) {
                                GameScreen.a(15, var16.a, var16.b);
                            } else {
                                GameScreen.a(9, var16.a, var16.b);
                            }

                            if (super.d == 64) {
                                GameScreen.a(15, var16.a, var16.b);
                                GameScreen.a(28, var16.a, var16.b - 2);
                            } else if (super.d == 53 || super.d == 78 || super.d == 104) {
                                GameScreen.a(25, var16.a, var16.b - 2);
                            }
                        }

                        ++var16.n;
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 55:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var15 = (hso_ej) this.W.a(var12)).a();
                        if (var15.g > var15.h) {
                            this.W.d(var15);
                            --var12;
                        }
                    }

                    if (super.k >= super.f) {
                        if (this.W.c() == 0) {
                            this.c();
                        }
                        break;
                    } else {
                        var12 = 20;
                        if (super.s != null && !super.s.cK && !super.s.cL && super.s.cF != 4) {
                            super.i = super.s.aY;
                            super.j = super.s.aZ - super.s.be / 2;
                            var12 = super.s.be / 2;
                        }

                        var3 = hso_ak.c(2, 4);
                        var14 = 0;

                        while (true) {
                            if (var14 >= var3) {
                                break label2005;
                            }

                            var5 = hso_ak.c(10, 24);
                            var11 = hso_ak.g(15);
                            int var6 = hso_ak.b(6, 12);
                            hso_ej var7 = new hso_ej();
                            if (super.m != 2 && super.m != 3) {
                                var7.b = super.j + var11;
                                var7.d = var7.b + (var11 > 0 ? var5 : -var5);
                                var7.a = var7.c = super.i + hso_ak.g(var12 + 10);
                                var7.f = var6;
                            } else {
                                var7.a = super.i + var11;
                                var7.c = var7.a + (var11 > 0 ? var5 : -var5);
                                var7.b = var7.d = super.j + hso_ak.g(var12 + 10);
                                var7.e = var6;
                            }

                            var7.h = hso_ak.c(2, 5);
                            var7.j = hso_ak.f(5) == 0;
                            var7.i = hso_ak.f(3);
                            this.W.a(var7);
                            ++var14;
                        }
                    }
                case 56:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 57:
                case 70:
                    if (this.af != null && this.af.cF != 4) {
                        this.af.cF = 2;
                        this.af.bb = 0;
                        this.af.bc = 0;
                    }

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var15 = (hso_ej) this.W.a(var12)).a();
                        var15.a();
                        var15.e += var15.e / 5;
                        var15.f += var15.f / 5;
                        if (var15.g >= 6 && this.ax == 0) {
                            this.W.d();
                            --var12;
                        }
                    }

                    if (this.W.c() == 0) {
                        if (hso_ft.aj - this.z > (long) super.e) {
                            this.c();
                        } else if (super.d == 57) {
                            this.p();
                        } else if (super.d == 70) {
                            this.q();
                        }
                    }
                    break;
                case 58:
                    if (super.k >= super.f) {
                        if (this.af != null && this.af.bF) {
                            this.af.bF = false;
                        }
                    } else {
                        if (super.k % 3 == 1) {
                            var12 = hso_p.d.b + (super.h - hso_p.d.b) % 30 - 30;

                            for (var3 = 0; var3 < 2; ++var3) {
                                (var17 = new hso_en()).a = super.g;
                                var17.b = var12 + var3 * 3;
                                var17.j = 30;
                                this.W.a(var17);
                            }
                        }

                        if (super.k >= super.f - 3 && this.af != null) {
                            this.af.bF = !this.af.bF;
                        }
                    }

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var16 = (hso_en) this.W.a(var12)).a();
                        if (var16.b > super.h) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        if (this.af != null) {
                            this.af.bF = false;
                        }

                        this.c();
                    }
                    break;
                case 59:
                    if (super.k >= super.f + 6) {
                        this.c();
                    }
                    break;
                case 60:
                    if (super.k == 0) {
                        for (var12 = 0; var12 < this.W.c(); ++var12) {
                            var16 = (hso_en) this.W.a(var12);
                            GameScreen.a(9, var16.a, var16.b);
                            GameScreen.a(25, var16.a, var16.b - 2);
                        }
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 61:
                case 77:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        var16 = (hso_en) this.W.a(var12);

                        for (var14 = 0; var14 < var16.s.c(); ++var14) {
                            var10000 = (hso_en) var16.s.a(var14);
                            var10000.a += var16.i;
                        }

                        if (super.k == var16.n) {
                            hso_cs.t = 105;
                            if (this.af != null && this.af != GameScreen.f) {
                                GameScreen.b((int) 32);
                            }

                            GameScreen.a(40, var16.a, var16.b + var16.j * super.k / 1000 - 4 + 10);
                            if (super.d == 61) {
                                GameScreen.a(27, var16.a + 3, var16.b + var16.j * super.k / 1000 + 10);
                                GameScreen.a(15, var16.a, var16.b + var16.j * super.k / 1000);
                                GameScreen.a(0, var16.a, var16.b + var16.j * super.k / 1000);
                            } else if (super.d == 77) {
                                GameScreen.a(30, var16.a + 3, var16.b + var16.j * super.k / 1000 + 10);
                                GameScreen.a(14, var16.a, var16.b + var16.j * super.k / 1000);
                                GameScreen.a(0, var16.a, var16.b + var16.j * super.k / 1000);
                            }
                        } else if (super.k < var16.n) {
                            var16.a += var16.i;
                            var1 = false;
                        }
                    }

                    if (var1) {
                        this.c();
                    }
                    break;
                case 62:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var16 = (hso_en) this.W.a(var12)).a();
                        if (var16.n >= var16.o) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }

                    if (super.k % 3 == 0 && super.k < super.f) {
                        var12 = super.g;
                        var3 = super.h;
                        switch (super.m) {
                            case 0:
                                var3 += 20;
                                break;
                            case 1:
                                var3 -= 20;
                                break;
                            case 2:
                                var12 -= 20;
                                break;
                            case 3:
                                var12 += 20;
                        }

                        GameScreen.a(13, var12, var3);
                        this.z();
                    }

                    if (super.k % 5 == 4 && super.k < super.f && super.s != null && !super.s.cL && !super.s.cK && MainObject.c(super.s.aY, super.s.aZ - super.s.be / 2, super.i, super.j) <= 30) {
                        GameScreen.a(12, this.H, this.I + super.s.be / 4);
                    }
                    break;
                case 63:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var16 = (hso_en) this.W.a(var12)).a();
                        if (var16.n >= var16.o) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }

                    if (super.k < super.f) {
                        if (super.s == null) {
                            if (super.k < super.f) {
                                super.k = super.f;
                            }
                        } else {
                            var12 = super.g;
                            var3 = super.h;
                            switch (super.m) {
                                case 0:
                                    var3 += 20;
                                    break;
                                case 1:
                                    var3 -= 20;
                                    break;
                                case 2:
                                    var12 -= 20;
                                    break;
                                case 3:
                                    var12 += 20;
                            }

                            if (super.k % 3 == 0) {
                                GameScreen.a(13, var12, var3);
                            }

                            this.b(super.i, super.j);
                        }
                    }

                    if (super.k % 5 == 4 && super.k < super.f && super.s != null) {
                        GameScreen.a(7, super.i, super.j + super.s.be / 4);
                    }
                    break;
                case 65:
                    for (var12 = 0; var12 < this.ag.c(); ++var12) {
                        if (MainObject.e((var18 = (hso_bf) this.ag.a(var12)).a, var18.b) != null && this.af != null) {
                            GameScreen.a(88, this.af.ct, this.af.cu, var18.a, var18.b, var18.c, var18.d);
                        }
                    }

                    this.c();
                    break;
                case 66:
                    for (var12 = 0; var12 < this.ag.c(); ++var12) {
                        MainObject var19;
                        if ((var19 = MainObject.e((var18 = (hso_bf) this.ag.a(var12)).a, var18.b)) != null) {
                            if (this.af != null) {
                                GameScreen.a(10, this.af.ct, this.af.cu, var18.a, var18.b, var18.c, var18.d);
                            }

                            GameScreen.a(0, var19.aY, var19.aZ + 5);
                        }
                    }

                    this.c();
                    break;
                case 67:
                    if (super.k > 7 && super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 68:
                    if (super.k >= super.f) {
                        this.c();
                    } else if (super.s != null && !super.s.cL && !super.s.cK) {
                        if (super.s.cF == 4) {
                            super.k = super.f;
                        } else {
                            super.g = super.s.aY;
                            if (this.A == 0) {
                                super.h = super.s.aZ - super.s.be / 2;
                            } else {
                                super.h = super.s.aZ - super.s.be - 8;
                            }
                        }
                    }
                    break;
                case 69:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 72:
                case 74:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        hso_ar var20;
                        (var20 = (hso_ar) this.W.a(var12)).a();
                        if (var20.d >= var20.c) {
                            GameScreen.a(12, var20.a, var20.b + 10);
                            this.W.d(var20);
                            --var12;
                        }
                    }

                    if (this.W.c() == 0 && super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 73:
                    for (var12 = 0; var12 < this.X.c(); ++var12) {
                        ++(var16 = (hso_en) this.X.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.X.d(var16);
                            --var12;
                        }
                    }

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var16 = (hso_en) this.W.a(var12)).a();
                        if (var16.n >= var16.o) {
                            GameScreen.a(12, var16.a, var16.b + 10);
                            this.W.d(var16);
                            --var12;
                        } else if (var16.n > 1) {
                            (var17 = new hso_en()).a = var16.a - var16.i;
                            var17.b = var16.b - var16.j;
                            this.X.a(var17);
                        }
                    }

                    if (super.k >= super.f) {
                        if (this.W.c() == 0 && this.X.c() == 0) {
                            this.c();
                        }
                    } else if (super.k % 4 == 0 && this.ae < this.ag.c()) {
                        if (this.ae >= this.ag.c()) {
                            super.k = super.f;
                        } else {
                            var21 = null;
                            if (this.ae < this.ag.c()) {
                                super.k = 0;

                                do {
                                    if ((var18 = (hso_bf) this.ag.a(this.ae)) != null && (var21 = MainObject.e(var18.a, var18.b)) != null) {
                                        if (var21.cF == 4) {
                                            var21 = null;
                                        } else {
                                            if (this.af != null) {
                                                super.m = a(this.af, var21);
//                                                this.af.Direction = super.m;
                                                this.af.setDirection(super.m, "public final void a()", hso_i.class);
                                                this.b(var21.aY, var21.aZ - var21.be / 2);
                                                this.af.cP = 11;
                                            }

                                            var14 = super.g;
                                            var5 = super.h;
                                            switch (super.m) {
                                                case 0:
                                                    var5 += 20;
                                                    break;
                                                case 1:
                                                    var5 -= 20;
                                                    break;
                                                case 2:
                                                    var14 -= 20;
                                                    break;
                                                case 3:
                                                    var14 += 20;
                                            }

                                            GameScreen.a(13, var14, var5);
                                        }
                                    }

                                    ++this.ae;
                                } while (var21 == null && this.ae < this.ag.c());
                            }

                            if (this.ae >= this.ag.c() && var21 == null) {
                                super.k = super.f;
                            }
                        }
                    }
                    break;
                case 76:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        var10000 = var16 = (hso_en) this.W.a(var12);
                        var10000.a += var16.i;
                        var16.b += var16.j;
                        if ((var14 = hso_ft.p.a(var16.a / 1000, var16.b / 1000)) == -1 || var14 == 1 || !hso_dx.a(var16.a / 1000, var16.b / 1000, super.u.a, super.u.b)) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (this.W.c() == 0 || super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 79:
                    if (super.k == 0) {
                        for (var12 = 0; var12 < this.ag.c(); ++var12) {
                            if ((var18 = (hso_bf) this.ag.a(var12)) == null) {
                                this.ag.d(var18);
                                --var12;
                            } else {
                                GameScreen.a(12, this.af.ct, this.af.cu, var18.a, var18.b, var18.c, var18.d);
                            }
                        }
                    }

                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 80:
                    if (super.s != null && !super.s.cL && !super.s.cK) {
                        if (super.k < super.f) {
                            if (super.k < 10) {
                                super.g = super.s.aY;
                                super.h = super.s.aZ - 70;
                            } else {
                                super.p += 2;
                                if (super.k > 12) {
                                    super.s.cF = 3;
                                }

                                super.s.bb = 0;
                                super.s.bc = 0;
                            }
                        } else {
                            super.s.cF = 4;
                            super.s.br = 0;
                            GameScreen.a(11, super.s.aY, super.s.aZ);
                            this.c();
                        }
                    } else {
                        this.c();
                    }
                    break;
                case 82:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 83:
                    this.G();

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n > 4) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }
                    break;
                case 85:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var15 = (hso_ej) this.W.a(var12)).a();
                        if (var15.g >= var15.h) {
                            this.W.d(var15);
                            --var12;
                        }
                    }

                    if (super.s != null && !super.s.cK && super.s.cF != 4 && !super.s.cL) {
                        this.D = super.s.aY;
                        this.E = super.s.aZ;
                        if (super.e > 0 && hso_ft.aj - this.z >= (long) super.e) {
                            this.c();
                        } else if (hso_ft.ai % 2 == 0) {
                            this.n();
                        }
                    } else if (super.k > 20) {
                        this.c();
                    }
                    break;
                case 87:
                    if (super.s != null && !super.s.cK && super.s.cF != 4 && !super.s.cL) {
                        super.g = super.s.aY;
                        super.h = super.s.aZ - super.s.be / 2;
                        if (super.e > 0 && hso_ft.aj - this.z >= (long) super.e) {
                            this.c();
                        }
                    } else if (super.k > 20) {
                        this.c();
                    }
                    break;
                case 88:
                    if (super.k < super.f) {
                        this.F();
                        this.as = this.c(this.O);
                    }

                    if (this.W.c() == 0 && super.k > super.f) {
                        this.c();
                    }

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k == super.f) {
                        GameScreen.a(36, super.g, super.h - 15);
                        GameScreen.a(14, super.g, super.h - 15);
                    }
                    break;
                case 89:
                    if (super.k < super.f) {
                        this.F();
                        this.as = this.c(this.O);
                    }

                    if (this.W.c() == 0 && super.k > super.f) {
                        super.y = true;
                        super.x = true;
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 90:
                    this.H();
                    break;
                case 91:
                    this.H();
                    break;
                case 92:
                    if (super.k < super.f) {
                        this.F();
                        this.as = this.c(this.O);
                    }

                    if (this.W.c() == 0 && super.k > super.f) {
                        super.y = true;
                        super.x = true;
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 93:
                    this.K();
                    break;
                case 94:
                    if (super.t == null) {
                        super.t = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
                    }

                    if (super.k > super.t.length - 1) {
                        super.k = super.t.length - 6;
                    }

                    this.I();
                    break;
                case 95:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 96:
                    if (super.k < super.f) {
                        this.F();
                        this.as = this.c(this.O);
                    }

                    if (this.W.c() == 0 && super.k > super.f) {
                        this.c();
                    }

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (super.k == super.f && super.s != null) {
                        GameScreen.a(45, super.s.aY, super.s.aZ - 20);
                    }
                    break;
                case 97:
                    if (super.k >= super.f && this.W.c() == 0) {
                        this.c();
                    }

                    if (super.k < super.f) {
                        if (super.k == 8) {
                            var12 = 2;
                            if (super.s != null && this.af != null) {
//                                this.af.Direction = a(this.af, super.s);
                                this.af.setDirection(a(this.af, super.s), "public final void a()", hso_i.class);
                                var12 = this.af.Direction;
                            }

                            if (var12 != 2 && var12 != 3) {
                                this.G = 0;
                                this.F = 1;
                            } else {
                                this.G = 1;
                                this.F = 0;
                            }

                            if (super.s != null && this.af != null) {
                                var3 = hso_ak.a(super.s.aY - this.af.aY, super.s.aZ - (this.af.aZ - this.af.be / 2 + 10));
                                var14 = 320;
                                if (320 < hso_ft.X) {
                                    var14 = hso_ft.X;
                                }

                                if (var14 < hso_ft.W) {
                                    var14 = hso_ft.W;
                                }

                                this.D = super.g + hso_ak.b(var3) * var14 / 1000;
                                this.E = super.h + hso_ak.a(var3) * var14 / 1000;
                                super.i = super.s.aY;
                                super.j = super.s.aZ - super.s.be / 2;
                                this.al = super.s.aY;
                                this.am = super.s.aZ;
                                GameScreen.a(0, this.al, this.am - super.s.be / 2);
                                GameScreen.a(26, this.al, this.am);
                            }
                        }

                        if (super.k > 8 && super.k % 3 == 2) {
                            (var2 = new hso_en()).a = super.i + hso_ak.g(5);
                            var2.b = super.j + hso_ak.g(5);
                            this.W.a(var2);
                        }
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n >= 4) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 98:
                    if (super.k < super.f && super.k > 1) {
                        (var2 = new hso_en()).a = super.g - super.o;
                        var2.b = super.h - super.p;
                        this.W.a(var2);
                    } else if (this.W.c() == 0 && super.k >= super.f) {
                        this.c();
                    }

                    if (super.k == super.f && super.s != null) {
                        GameScreen.a(26, super.i, super.j + super.s.be / 2);
                        GameScreen.a(14, super.i, super.j + super.s.be / 2);
                        GameScreen.a(30, super.i, super.j + super.s.be / 2 + 10);
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 99:
                    if (super.k < super.f && super.k > 1) {
                        (var2 = new hso_en()).a = super.g - super.o;
                        var2.b = super.h - super.p;
                        this.W.a(var2);
                    } else if (this.W.c() == 0 && super.k >= super.f) {
                        this.c();
                    }

                    if (super.k == super.f && super.s != null) {
                        GameScreen.a(48, super.i, super.j + super.s.be / 4);
                    }

                    var12 = 0;

                    while (true) {
                        if (var12 >= this.W.c()) {
                            break label2005;
                        }

                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n / 2 > 3) {
                            this.W.d(var16);
                            --var12;
                        }

                        ++var12;
                    }
                case 100:
                    this.J();
                    break;
                case 101:
                    ++this.ay;
                    if (this.ay > this.az.length - 1) {
                        this.ay = 0;
                    }

                    if (this.an >= 0) {
                        --this.an;
                    }

                    if (this.an < 0) {
                        this.ai = true;
                    }

                    if (!super.s.dK || super.s == null || super.s.br <= 0 || super.s != null && super.s.cK) {
                        super.x = true;
                    }
                    break;
                case 102:
                    if (super.s != null) {
                        super.g = super.s.aY;
                        super.h = super.s.aZ - 25;
                    }

                    ++this.aA;
                    if (this.aA > this.aB.length - 1) {
                        this.aA = 0;
                    }

                    if (!super.s.dJ || super.s == null || super.s != null && super.s.cK) {
                        super.x = true;
                    }
                    break;
                case 103:
                    if (super.s != null) {
                        super.g = super.s.aY;
                        super.h = super.s.aZ;
                    }

                    if (this.T >= 0) {
                        --this.T;
                    }

                    if (this.T <= 0) {
                        this.U = 10;

                        for (var12 = 0; var12 < this.ao.length; ++var12) {
                            byte[] var22 = this.ao;
                            var22[var12] += (byte) (this.P / 2);
                            int[] var23 = this.ap;
                            var23[var12] += 5;
                            if (this.ap[var12] >= 360) {
                                this.ap[var12] = 0;
                            }
                        }

                        this.P /= 2;
                        if (this.P <= 0) {
                            this.P = 0;
                        }
                    }

                    if (!super.s.dM || super.s == null || super.s.br <= 0 || super.s != null && super.s.cK) {
                        super.x = true;
                    }
                    break;
                case 106:
                    this.D = hso_ak.b(this.J) * this.K / 1024 + super.g;
                    this.E = hso_ak.a(this.J) * this.K / 1024 + super.h;
                    hso_en var13;
                    (var13 = new hso_en()).a = this.D;
                    var13.b = this.E;
                    this.W.a(var13);
                    this.J += 20;
                    if (this.J >= 180) {
                        --this.L;
                        this.J = 180;
                    }

                    if (this.L <= 0) {
                        this.c();
                    }

                    var12 = 2;
                    if (super.s != null && this.af != null) {
//                        this.af.Direction = a(this.af, super.s);
                        this.af.setDirection(a(this.af, super.s), "public final void a()", hso_i.class);
                        var12 = this.af.Direction;
                    }

                    if (var12 != 2 && var12 != 3) {
                        this.G = 0;
                        this.F = 1;
                    } else {
                        this.G = 1;
                        this.F = 0;
                    }

                    var11 = 320;
                    if (320 < hso_ft.X) {
                        var11 = hso_ft.X;
                    }

                    if (var11 < hso_ft.W) {
                        var11 = hso_ft.W;
                    }

                    if (this.J > 60 && this.J < 120) {
                        this.K = super.h + hso_ak.a(60) * var11 / 1000;
                    } else {
                        this.K = super.g + hso_ak.b(0) * var11 / 1000;
                    }

                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        ++(var16 = (hso_en) this.W.a(var12)).n;
                        if (var16.n >= 4) {
                            this.W.d(var16);
                            --var12;
                        }
                    }

                    if (this.J > 0 && this.J < 90) {
                        this.af.Direction = 3;
                    } else {
                        this.af.Direction = 2;
                    }
                    break;
                case 107:
                    for (var12 = 0; var12 < this.W.c(); ++var12) {
                        (var15 = (hso_ej) this.W.a(var12)).a();
                        if (super.k >= super.f && this.ax == 0) {
                            this.W.d(var15);
                            --var12;
                        }
                    }

                    this.a(super.n, this.ac, this.ad);
                    if (MainObject.c(super.s.aY, super.s.aZ, GameScreen.f.aY, GameScreen.f.aZ) <= 240) {
                        hso_cs.t = 3;
                    }

                    if (!super.s.dL || super.s == null || super.s.br <= 0 || super.s != null && super.s.cK) {
                        super.x = true;
                    }
                    break;
                case 109:
                case 110:
                    if (this.W.c() > 0 && (var2 = (hso_en) this.W.a(0)) != null) {
                        super.g = var2.a;
                        super.h = var2.b;
                        this.W.d(var2);
                    }

                    if (this.W.c() <= 0) {
                        this.c();
                        if (super.d == 109) {
                            GameScreen.a(15, super.i, super.j + super.s.be / 4);
                        } else {
                            GameScreen.a(29, super.g + 3, super.h + super.p * super.k / 1000 + 10);
                        }
                    }
                    break;
                case 111:
                    if (super.k >= super.f) {
                        this.c();
                    }
                    break;
                case 124:
                    super.g += super.o;
                    super.h += super.p;
                    if (super.p <= 5) {
                        ++super.p;
                    }

                    if (super.h + super.p > this.ar) {
                        super.x = true;
                        hso_cs.t = 103;
                        boolean var10 = false;
                        this.c();

                        for (var3 = 0; var3 < 16; ++var3) {
                            var14 = 24 * at[this.av][var3] + hso_ak.c(10, 100);
                            var11 = 24 * au[this.av][var3] + hso_ak.c(10, 100);
                            GameScreen.a(36, var14, var11);
                            GameScreen.a(9, var14, var11);
                        }
                    }
                    break;
                case 125:
                case 126:
                    this.D = hso_ak.b(this.J) * this.K / 1024 + super.g;
                    this.E = hso_ak.a(this.J) * this.K / 1024 + super.h;
                    (var2 = new hso_en()).a = this.D;
                    var2.b = this.E;
                    this.W.a(var2);
                    this.J += 20;
                    if (this.J >= 359) {
                        --this.L;
                        this.J = 359;
                    }

                    if (this.L <= 0) {
                        this.c();

                        for (var3 = 0; var3 < this.ag.c(); ++var3) {
                            hso_bf var4;
                            if ((var4 = (hso_bf) this.ag.a(var3)) != null) {
                                MainObject var9 = MainObject.e(var4.a, var4.b);
                                GameScreen.a(36, var9.aY, var9.aZ);
                                GameScreen.a(9, var9.aY, var9.aZ);
                            }
                        }
                    }

                    var3 = 2;
                    if (super.s != null && this.af != null) {
//                        this.af.Direction = a(this.af, super.s);
                        this.af.setDirection(a(this.af, super.s), "public final void a()", hso_i.class);
                        var3 = this.af.Direction;
                    }

                    if (var3 != 2 && var3 != 3) {
                        this.G = 0;
                        this.F = 1;
                    } else {
                        this.G = 1;
                        this.F = 0;
                    }

                    var14 = 320;
                    if (320 < hso_ft.X) {
                        var14 = hso_ft.X;
                    }

                    if (var14 < hso_ft.W) {
                        var14 = hso_ft.W;
                    }

                    if (this.J > 60 && this.J < 120) {
                        this.K = super.h + hso_ak.a(60) * var14 / 1000;
                    } else {
                        this.K = super.g + hso_ak.b(0) * var14 / 1000;
                    }

                    for (var11 = 0; var11 < this.W.c(); ++var11) {
                        ++(var2 = (hso_en) this.W.a(var11)).n;
                        if (var2.n >= 4) {
                            this.W.d(var2);
                            --var11;
                        }
                    }

                    if (this.J > 0 && this.J < 90) {
                        this.af.Direction = 3;
                    } else {
                        this.af.Direction = 2;
                    }
            }
        } catch (Exception var8) {
            hso_dw.a("Loi update Eff " + super.d + "  f=" + super.k);
            var8.printStackTrace();
            this.c();
        }

        super.a();
        if (super.k > 200 && super.e == 0) {
            this.c();
        }

    }

    private void b() {
        if (this.af != null) {
            if (super.d == 27) {
                this.B = 9;
                if (this.af != GameScreen.f) {
                    GameScreen.b(this.B);
                    return;
                }
            } else if (super.d == 51) {
                this.B = 19;
                if (this.af != GameScreen.f) {
                    GameScreen.b(this.B);
                    return;
                }
            } else if (super.d != 125 && super.d != 126 && super.d != 97 && super.d != 106 && super.d != 105) {
                if (super.d == 62) {
                    this.B = 20;
                    if (this.af != GameScreen.f) {
                        GameScreen.b(this.B);
                    }
                }
            } else {
                this.B = 13;
                if (this.af != GameScreen.f) {
                    GameScreen.b(this.B);
                    return;
                }
            }

        }
    }

    private static int a(MainObject var0, MainObject var1) {
        int var2 = var0.aY - var1.aY;
        int var3 = var0.aZ - var1.aZ;
        byte var4;
        if (hso_ak.e(var2) > hso_ak.e(var3)) {
            if (var2 > 0) {
                var4 = 2;
            } else {
                var4 = 3;
            }
        } else if (var3 > 0) {
            var4 = 1;
        } else {
            var4 = 0;
        }

        return var4;
    }

    private void b(int var1) {
        switch (super.m) {
            case 0:
                super.h += var1 + 10;
                return;
            case 1:
                super.h -= var1 + 10;
                return;
            case 2:
                super.g -= var1 + 10;
                return;
            case 3:
                super.g += var1 + 10;
            default:
        }
    }

    private int c(int var1) {
        byte var2;
        if (var1 > 15 && var1 <= 345) {
            if ((var1 = (var1 - 15) / 15 + 1) > 24) {
                var1 = 24;
            }

            var2 = this.Y[var1];
        } else {
            var2 = 12;
        }

        return var2;
    }

    private void d(int var1) {
        switch (var1) {
            case 0:
                switch (super.m) {
                    case 0:
                        super.g -= 8;
                        super.h += 20;
                        return;
                    case 1:
                        super.g += 8;
                        super.h += 40;
                        return;
                    case 2:
                        super.g += 15;
                        super.h += 20;
                        return;
                    case 3:
                        super.g -= 15;
                        super.h += 20;
                    default:
                        return;
                }
            case 1:
                switch (super.m) {
                    case 0:
                        super.h += 45;
                        return;
                    case 1:
                        super.h += 10;
                        return;
                    case 2:
                        super.g -= 16;
                        super.h += 30;
                        return;
                    case 3:
                        super.g += 18;
                        super.h += 30;
                    default:
                        return;
                }
            case 3:
                switch (super.m) {
                    case 0:
                        super.g += 8;
                        super.h += 25;
                        return;
                    case 1:
                        super.g += 5;
                        super.h += 45;
                        return;
                    case 2:
                        super.g += 13;
                        super.h += 35;
                        return;
                    case 3:
                        super.g -= 13;
                        super.h += 35;
                    default:
                        return;
                }
            case 4:
                switch (super.m) {
                    case 0:
                        super.g -= 15;
                        super.h += 17;
                        return;
                    case 1:
                        super.g += 15;
                        super.h += 33;
                        return;
                    case 2:
                        super.g += 3;
                        super.h += 11;
                        return;
                    case 3:
                        super.g -= 3;
                        super.h += 11;
                }
            case 2:
            default:
        }
    }

    private void c() {
        if (super.d != 103) {
            if (this.C && hso_dw.g) {
                --b;
            }

            if (this.W.c() > 0) {
                this.W.d();
            }

            if (this.X.c() > 0) {
                this.X.d();
            }

            boolean var1 = true;
            if (hso_dw.g && hso_cf.d(hso_ft.p.d)) {
                var1 = false;
            }

            if (this.V == -1 && var1) {
                this.d();
            }

            super.y = true;
            super.x = true;
            super.k = -1;
        }
    }

    private void d() {
        if (this.af == null || this.af.ct == GameScreen.f.ct || !hso_cf.j()) {
            for (int var1 = 0; var1 < this.ag.c(); ++var1) {
                hso_bf var2;
                MainObject var3;
                if ((var2 = (hso_bf) this.ag.a(var1)) != null && (var3 = MainObject.a(var2.a, var2.b)) != null && var3 != null) {
                    if (!this.ah) {
                        int var4 = 6;
                        if (var2.c == 0) {
                            if (var3 == GameScreen.f) {
                                var4 = 7;
                            }

                            GameScreen.a(hso_df.cx, var3.aY, var3.aZ - var3.be, var4, var2.a);
                        } else {
                            int var5;
                            if (this.af != null && (var5 = a(var2.e, this.af, var3, var2.f)) != -1) {
                                var4 = var5;
                            }

                            if (super.d == 41) {
                                GameScreen.a("+" + var2.c, var3.aY, var3.aZ - var3.be, this.A == 0 ? 3 : 4, var2.a);
                            } else {
                                GameScreen.a("-" + var2.c, var3.aY, var3.aZ - var3.be, var4, var2.a);
                            }
                        }

                        if (var3.cu == 1) {
                            var3.br = var2.d;
                            if (var3.br <= 0) {
                                if (this.af != null) {
                                    MainObject.a((hso_au) var3, this.af.ct, hso_ak.f(3));
                                }

                                var3.N();
                                var3.cF = 4;
                                var3.aW = hso_ft.aj;
                                GameScreen.a(11, var3.aY, var3.aZ);
                            }
                        }
                    }

                    if (super.d != 41 && super.d != 58 && super.d != 42 && (var2.c > 0 || this.af != null && this.af == GameScreen.f)) {
                        if (var3.cu == 1) {
                            if (var3.cF != 3) {
                                if (!var3.dE) {
                                    var3.N();
                                }

                                var3.cF = 3;
                                var3.ba = 0;
                            }
                        } else if (var3.cu == 0) {
                            if (var3.ca != 3) {
                                if (this.af != null && this.af.cu == 0 && var3.br > var3.bs / 2 && var2.c <= var3.bs / 20) {
                                    var3.ca = 4;
                                    var3.bT = -6;
                                } else {
                                    var3.ca = 2;
                                    var3.bT = 0;
                                }
                            }

                            if (hso_ak.f(5) == 0) {
                                var3.bj = -hso_ak.c(2, 5);
                            }

                            if (var3 == GameScreen.f) {
                                hso_ak.f(3);
                            }
                        }
                    }
                }
            }

            if (!this.ah && this.af != null && this.af.cu != 9 && this.af.br <= 0 && this.af.cF != 4) {
                this.af.N();
                this.af.cF = 4;
                GameScreen.a(11, this.af.aY, this.af.aZ);
            }

        }
    }

    private void e() {
        switch (hso_ak.f(4)) {
            case 0:
                this.O = 90;
                break;
            case 1:
                this.O = 270;
                break;
            case 2:
                this.O = 180;
                break;
            case 3:
                this.O = 0;
        }

        this.aD = 4096;
        super.o = 0;
        super.p = 0;
        this.aC = 0;
        this.F = this.aD * hso_ak.b(this.O) >> 10;
        this.G = this.aD * hso_ak.a(this.O) >> 10;
    }

    private hso_ar a(int var1, int var2, hso_ar var3) {
        if (var2 == 0) {
            var2 = 1;
        }

        if (var1 == 0) {
            var1 = 1;
        }

        boolean var4 = false;
        boolean var5 = false;
        int var6;
        if ((var6 = MainObject.f(var1, var2) / super.n) == 0) {
            var6 = 1;
        }

        int var7 = var1 / var6;
        int var8 = var2 / var6;
        if (hso_ak.e(var7) > hso_ak.e(var1)) {
            var7 = var1;
        }

        if (hso_ak.e(var8) > hso_ak.e(var2)) {
            var8 = var2;
        }

        if (super.s != null) {
            super.i = super.s.aY;
            super.j = super.s.aZ - super.s.be / 2;
        }

        if (var3 != null) {
            var3.f = var7;
            var3.g = var8;
            var3.c = var6;
        } else {
            super.f = var6;
            super.o = var7;
            super.p = var8;
        }

        return var3;
    }

    private hso_ar a(int var1, int var2, hso_ar var3, MainObject var4) {
        if (var2 == 0) {
            var2 = 1;
        }

        if (var1 == 0) {
            var1 = 1;
        }

        boolean var5 = false;
        boolean var6 = false;
        int var7;
        if ((var7 = MainObject.f(var1, var2) / super.n) == 0) {
            var7 = 1;
        }

        int var8 = var1 / var7;
        int var9 = var2 / var7;
        if (hso_ak.e(var8) > hso_ak.e(var1)) {
            var8 = var1;
        }

        if (hso_ak.e(var9) > hso_ak.e(var2)) {
            var9 = var2;
        }

        super.i = var4.aY;
        super.j = var4.aZ - var4.be / 2;
        var3.f = var8;
        var3.g = var9;
        var3.c = var7;
        return var3;
    }

    private hso_ar b(int var1, int var2, hso_ar var3) {
        if (var2 == 0) {
            var2 = 1;
        }

        if (var1 == 0) {
            var1 = 1;
        }

        boolean var4 = false;
        boolean var5 = false;
        int var6;
        if ((var6 = MainObject.f(var1, var2) / super.n) == 0) {
            var6 = 1;
        }

        int var7 = var1 / var6;
        int var8 = var2 / var6;
        if (hso_ak.e(var7) > hso_ak.e(var1)) {
            var7 = var1;
        }

        if (hso_ak.e(var8) > hso_ak.e(var2)) {
            var8 = var2;
        }

        var3.f = var7;
        var3.g = var8;
        var3.c = var6;
        return var3;
    }

    private void f() {
        this.D = super.s.aY * 1000;
        this.E = super.s.aZ * 1000 - super.s.be / 2 * 1000;
        this.Q = new int[3];

        int var1;
        for (var1 = 0; var1 < 3; ++var1) {
            this.Q[var1] = c[0][hso_ak.f(3)];
        }

        super.f = hso_ak.c(5, 9);
        this.M = hso_dw.a(6, 4);

        for (var1 = 0; var1 < 3; ++var1) {
            int var2 = hso_ak.c(5 + var1 * 60, 55 + var1 * 60);
            int var3 = hso_ak.c(20, 30);
            this.M[var1 << 1][0] = hso_ak.a(hso_ak.d(var2)) * var3 + this.D;
            this.M[var1 << 1][1] = hso_ak.b(hso_ak.d(var2)) * var3 + this.E;
            int var4 = var2 + hso_ak.b(4, 12);
            int var5 = var3 + hso_ak.b(3, 10);
            this.M[var1 << 1][2] = hso_ak.a(hso_ak.d(var4)) * var5 + this.D;
            this.M[var1 << 1][3] = hso_ak.b(hso_ak.d(var4)) * var5 + this.E;
            var2 += 180;
            var3 += hso_ak.b(3, 10);
            this.M[(var1 << 1) + 1][0] = hso_ak.a(hso_ak.d(var2)) * var3 + this.D;
            this.M[(var1 << 1) + 1][1] = hso_ak.b(hso_ak.d(var2)) * var3 + this.E;
            var4 += 180;
            var5 = var3 + hso_ak.b(3, 10);
            this.M[(var1 << 1) + 1][2] = hso_ak.a(hso_ak.d(var4)) * var5 + this.D;
            this.M[(var1 << 1) + 1][3] = hso_ak.b(hso_ak.d(var4)) * var5 + this.E;
        }

    }

    private void a(int var1, int var2, int var3, int var4, boolean var5) {
        int var6 = 0;
        boolean var7 = false;
        boolean var8 = false;
        int var9 = MainObject.c(var1, var2, var3, var4) / 15 + hso_ak.f(3);
        int var10 = hso_ak.f(2);
        int var19 = hso_ak.a(var3 - var1, var4 - var2);
        boolean var11 = false;

        for (int var12 = 0; var12 < var9; ++var12) {
            hso_en var13 = new hso_en();
            if (var12 == 0) {
                var13.a = var1 * 1000;
                var13.b = var2 * 1000;
            } else {
                hso_en var14 = (hso_en) this.W.a(var12 - 1);
                int var21 = 20 + hso_ak.g(10);
                if ((MainObject.c(var14.a / 1000, var14.b / 1000, var3, var4) < 25 || var12 == var9 - 1) && var5) {
                    var13.a = var3 * 1000;
                    var13.b = var4 * 1000;
                    this.W.a(var13);
                    return;
                }

                int var20;
                if (var5) {
                    if (hso_ak.e(var6) > 50) {
                        if (var6 > 0) {
                            var20 = var19 - hso_ak.c(5, 50);
                        } else {
                            var20 = var19 + hso_ak.c(5, 50);
                        }
                    } else if (var12 % 2 == var10) {
                        var20 = var19 - hso_ak.c(5, 50);
                    } else {
                        var20 = var19 + hso_ak.c(5, 50);
                    }
                } else if (hso_ak.e(var6) > 50) {
                    if (var6 > 0) {
                        var20 = var19 - hso_ak.c(5, 50);
                    } else {
                        var20 = var19 + hso_ak.c(5, 50);
                    }
                } else if (var12 % 2 == var10) {
                    var20 = var19 - hso_ak.c(10, 40);
                } else {
                    var20 = var19 + hso_ak.c(10, 40);
                }

                var6 += var20 - var19;
                var20 = hso_ak.d(var20);
                var13.a = var14.a + hso_ak.b(var20) * var21;
                var13.b = var14.b + hso_ak.a(var20) * var21;
                if (hso_ak.f(6) < 5) {
                    this.X.a(var13);
                    new hso_en();
                    hso_en var22 = null;
                    var22 = var13;
                    boolean var23 = false;
                    boolean var15 = false;
                    int var16 = hso_ak.c(3, 7);

                    for (int var17 = 0; var17 < var16; ++var17) {
                        int var24 = 5 + hso_ak.g(3);
                        int var25;
                        if (var17 % 2 == var10) {
                            var25 = var20 - hso_ak.c(10, 40);
                        } else {
                            var25 = var20 + hso_ak.c(10, 40);
                        }

                        var25 = hso_ak.d(var25);
                        hso_en var18;
                        (var18 = new hso_en()).a = var22.a + hso_ak.b(var25) * var24;
                        var18.b = var22.b + hso_ak.a(var25) * var24;
                        this.X.a(var18);
                        var22 = var18;
                    }

                    var22.a = -1;
                    this.X.a(var22);
                }
            }

            this.W.a(var13);
        }

    }

    private hso_en a(int var1, int var2) {
        hso_en var3 = new hso_en();
        int var4 = hso_ak.c(0, 40);
        int var5 = hso_ak.c(20, 50);
        super.g = hso_p.d.a - var4;
        var1 = hso_ak.e(super.g - var1);
        super.f = hso_ak.e(var1 / super.o);
        if (super.f == 0) {
            super.f = 1;
        }

        super.h = var2 - var1 * 1000 / hso_ak.c(var5);
        var1 = hso_ak.e(super.h - var2);
        this.G = var1 * 1000 / super.f;
        var3.b = super.h;
        var3.a = super.g;
        var3.i = super.o;
        var3.j = this.G;
        var3.n = super.f;
        return var3;
    }

    private void g() {
        hso_cs.t = hso_ak.c(6, 12);
        super.r = -1;
        super.f = 20;
        this.V = 8;
        if (super.s != null) {
            super.i = super.s.aY;
            super.j = super.s.aZ - super.s.be / 2;
        }

        if (hso_ak.e(super.g - super.i) > hso_ak.e(super.h - super.j)) {
            this.ac = 0;
            this.ad = 1;
        } else {
            this.ac = 1;
            this.ad = 0;
        }

        int var1 = MainObject.c(super.g, super.h, super.i, super.j);
        var1 += 24;
        int var2 = hso_ak.a(super.i - super.g, super.j - super.h);
        int var3 = super.g + hso_ak.b(var2) * var1 / 1000;
        var1 = super.h + hso_ak.a(var2) * var1 / 1000;
        this.a(super.g, super.h, var3, var1, false);
    }

    private void h() {
        super.u = new hso_ce(57);
        super.v = new hso_ce(3);
        super.f = 14;
        super.n = 6;

        for (int var1 = 0; var1 < 16; ++var1) {
            hso_en var2;
            (var2 = new hso_en()).a = super.g * 1000;
            var2.b = super.h * 1000;
            var2.i = 2 * hso_ak.b(var1 * 225 / 10) * super.n;
            var2.j = 1 * hso_ak.a(var1 * 225 / 10) * super.n;
            var2.n = 0;
            this.W.a(var2);
            int var3 = (super.g + var2.i) * 100 - super.g;
            int var4 = (super.h + var2.j) * 100 - super.h;
            var3 = hso_ak.a(var3, var4);
            var2.p = this.c(var3);
        }

    }

    private void i() {
        super.u = new hso_ce(125);
        super.v = new hso_ce(3);
        super.f = 14;
        super.n = 5;

        for (int var1 = 0; var1 < 16; ++var1) {
            hso_en var2;
            (var2 = new hso_en()).a = super.g * 1000;
            var2.b = super.h * 1000;
            var2.i = 2 * hso_ak.b(var1 * 225 / 10) * super.n;
            var2.j = hso_ak.a(var1 * 225 / 10) * super.n;
            var2.n = 0;
            this.W.a(var2);
            int var3 = (super.g + var2.i) * 100 - super.g;
            int var4 = (super.h + var2.j) * 100 - super.h;
            var3 = hso_ak.a(var3, var4);
            var2.p = this.c(var3);
        }

    }

    private void j() {
        super.u = new hso_ce(41);
        super.v = new hso_ce(42);
        super.f = 25;
        super.n = 5;

        for (int var1 = 0; var1 < 16; ++var1) {
            hso_en var2;
            (var2 = new hso_en()).a = super.g * 1000;
            var2.b = super.h * 1000;
            var2.i = 2 * hso_ak.b(var1 * 225 / 10) * super.n;
            var2.j = 1 * hso_ak.a(var1 * 225 / 10) * super.n;
            var2.n = 0;
            this.W.a(var2);
        }

    }

    private void k() {
        super.u = new hso_ce(29);
        super.v = new hso_ce(42);
        super.f = 25;
        super.n = 5;

        for (int var1 = 0; var1 < 16; ++var1) {
            hso_en var2;
            (var2 = new hso_en()).a = super.g * 1000;
            var2.b = super.h * 1000;
            var2.i = 2 * hso_ak.b(var1 * 225 / 10) * super.n;
            var2.j = 1 * hso_ak.a(var1 * 225 / 10) * super.n;
            var2.n = 0;
            this.W.a(var2);
        }

    }

    private void l() {
        if (super.k == -1) {
            this.W.d();
        }

        for (int var1 = 0; var1 < this.ag.c(); ++var1) {
            hso_bf var2;
            MainObject var9;
            if ((var2 = (hso_bf) this.ag.a(var1)) != null && (var9 = MainObject.a(var2.a, var2.b)) != null) {
                int var3 = hso_ak.c(1, 4);
                if (hso_ft.B) {
                    var3 = hso_ak.c(1, 3);
                }

                for (int var4 = 0; var4 < var3; ++var4) {
                    super.n = hso_ak.c(14, 18);
                    hso_en var5;
                    (var5 = new hso_en()).a = var9.aY - 70 + hso_ak.g(15);
                    var5.b = this.E;
                    int var6 = var9.aY - var5.a + hso_ak.g(30);
                    int var7;
                    if ((var7 = var9.aZ - var5.b + 8 + hso_ak.g(10)) / super.n > 8) {
                        super.n = var7 / 8;
                    }

                    hso_ar var8 = new hso_ar();
                    var8 = this.a(var6, var7, var8);
                    var5.i = var8.f;
                    var5.j = var8.g;
                    var5.o = var8.c;
                    var5.n = 0;
                    this.W.a(var5);
                }
            }
        }

    }

    private void m() {
        this.aF = this.af.aY;
        this.aG = this.af.aZ;
        if (this.af != null) {
            super.h += this.af.be / 2;
            this.af.bF = true;
            this.af.bR = 0;
        }

        super.u = new hso_ce(50);
        super.n = 20;
        boolean var1 = false;
        boolean var2 = false;
        int var6;
        int var7;
        if (super.s != null) {
            var6 = super.s.aY - super.g;
            var7 = super.s.aZ - super.h;
        } else {
            var6 = super.i - super.g;
            var7 = super.j - super.h;
        }

        int var3 = MainObject.f(var6, var7);
        var6 = hso_ak.a(var6, var7);
        var7 = var3;
        super.i = super.g + var3 * hso_ak.b(var6) / 1000;
        super.j = super.h + var3 * hso_ak.a(var6) / 1000;
        int var4 = super.i;
        int var5 = super.j;

        do {
            super.i = var4;
            super.j = var5;
            if (var7 > 120) {
                var3 = -1;
            } else {
                var7 += 10;
                var4 = super.g + var7 * hso_ak.b(var6) / 1000;
                var5 = super.h + var7 * hso_ak.a(var6) / 1000;
                var3 = hso_ft.p.a(super.i, super.j);
            }
        } while (var3 != -1 && var3 != 1);

        var6 = super.i - super.g;
        if ((var7 = super.j - super.h) == 0) {
            var7 = 1;
        }

        if (var6 == 0) {
            var6 = 1;
        }

        boolean var8 = false;
        boolean var9 = false;
        if ((var5 = MainObject.f(var6, var7) / super.n) == 0) {
            var5 = 1;
        }

        var3 = var6 / var5;
        var4 = var7 / var5;
        if (hso_ak.e(var3) > hso_ak.e(var6)) {
            var3 = var6;
        }

        if (hso_ak.e(var4) > hso_ak.e(var7)) {
            var4 = var7;
        }

        super.o = var3;
        super.p = var4;
        super.f = var5;
        if (super.f > 0) {
            this.V = (byte) (super.f / 2);
        }

        if (this.af != null && super.s != null) {
            super.i = this.af.aY + (super.f - 1) * var3;
            if (super.s != null) {
                super.j = this.af.aZ + super.s.be / 4 + (super.f - 1) * var4;
                return;
            }

            super.j = this.af.aZ + (super.f - 1) * var4;
        }

    }

    private void a(int var1, int var2, int var3) {
        if (super.k == -1) {
            this.W.d();
        }

        this.Q = new int[4];
        if (var3 <= var2) {
            var3 = var2 + 1;
        }

        int var4;
        for (var4 = 0; var4 < 4; ++var4) {
            if (hso_ak.f(2) == 0) {
                this.Q[var4] = c[this.S][hso_ak.f(3)];
            } else {
                this.Q[var4] = c[this.S][2];
            }
        }

        for (var4 = 0; var4 < 4; ++var4) {
            hso_ej var5 = new hso_ej();
            int var6 = 5 + var4 * 45;
            int var7;
            if ((var7 = 45 + var4 * 45 - 5) <= var6) {
                var7 = var6 + 1;
            }

            int var8 = hso_ak.c(var2, var3);
            int var9 = hso_ak.c(var1, var1 + 3);
            var6 = hso_ak.c(var6, var7);
            var7 = hso_ak.c(13, 23);
            boolean var10 = hso_ak.f(4) == 0;
            var6 = hso_ak.d(var6);
            var5.a(this.D - hso_ak.a(var6) * (var8 + var7), this.E - hso_ak.b(var6) * (var8 + var7), this.D - hso_ak.a(var6) * var7, this.E - hso_ak.b(var6) * var7, hso_ak.a(var6) * var9, hso_ak.b(var6) * var9, var10);
            this.W.a(var5);
            var5 = new hso_ej();
            var6 = hso_ak.d(var6 + 180 + hso_ak.b(2, 5));
            var5.a(this.D - hso_ak.a(var6) * (var8 + var7), this.E - hso_ak.b(var6) * (var8 + var7), this.D - hso_ak.a(var6) * var7, this.E - hso_ak.b(var6) * var7, hso_ak.a(var6) * var9, hso_ak.b(var6) * var9, var10);
            this.W.a(var5);
        }

    }

    private void n() {
        int var1 = hso_ak.c(1, 3);

        for (int var2 = 0; var2 < var1; ++var2) {
            hso_ej var3 = new hso_ej();
            int var4 = hso_ak.c(3, 12);
            boolean var5 = false;
            byte var8;
            if (var4 <= 5) {
                var3.h = 16;
                var8 = 2;
            } else if (var4 <= 8) {
                var8 = 4;
                var3.h = 12;
            } else {
                var8 = 5;
                var3.h = 9;
            }

            int var6 = this.D + hso_ak.g(15);
            int var7 = this.E - hso_ak.g(10);
            var3.a(var6, var7, var6, var7 - var4, 0, -var8, false);
            var3.i = hso_ak.f(3);
            this.W.a(var3);
        }

    }

    private void o() {
        int var1 = hso_ak.c(0, 45);

        for (int var2 = 0; var2 < 8; ++var2) {
            hso_en var3 = new hso_en();
            int var4 = var1 + var2 * 360 / 8;
            var3.a = this.D - hso_ak.a(hso_ak.d(var4)) * 30;
            var3.b = this.E - hso_ak.b(hso_ak.d(var4)) * 30;
            var3.i = hso_ak.a(hso_ak.d(var4)) << 2;
            var3.j = hso_ak.b(hso_ak.d(var4)) << 2;
            this.W.a(var3);
        }

    }

    private void p() {
        int var1;
        if ((var1 = this.A) >= 9) {
            var1 = 4;
        } else if (var1 > 3 && var1 > 4 && var1 < 9) {
            var1 -= 5;
        }

        hso_ak.f(4);
        this.Q = new int[12];
        int var2 = hso_ak.c(0, 30);

        for (int var3 = 0; var3 < 12; ++var3) {
            this.Q[var3] = R[var1][hso_ak.f(3)];
            hso_ej var4 = new hso_ej();
            byte var5 = 5;
            int var6 = var2 + var3 * 360 / 12;
            int var7 = hso_ak.c(20, 40);
            if (hso_ak.f(3) == 0) {
                var5 = 8;
                var7 = hso_ak.c(40, 55);
            }

            var4.e = hso_ak.a(hso_ak.d(var6)) * var5;
            var4.f = hso_ak.b(hso_ak.d(var6)) * var5;
            var4.a = this.D - hso_ak.a(hso_ak.d(var6)) * var7;
            var4.b = this.E - hso_ak.b(hso_ak.d(var6)) * var7;
            var4.d = this.E - hso_ak.b(hso_ak.d(var6)) * (var7 + 6);
            var4.c = this.D - hso_ak.a(hso_ak.d(var6)) * (var7 + 6);
            var4.j = hso_ak.f(3) == 0;
            this.W.a(var4);
        }

    }

    private void q() {
        int var1;
        if ((var1 = this.A) > 3 && var1 > 4 && var1 < 9) {
            var1 -= 5;
        }

        hso_ak.f(4);
        this.Q = new int[12];
        int var2 = hso_ak.c(0, 30);

        for (int var3 = 0; var3 < 12; ++var3) {
            this.Q[var3] = R[var1][hso_ak.f(3)];
            hso_ej var4 = new hso_ej();
            byte var5 = 4;
            int var6 = var2 + var3 * 360 / 12;
            int var7 = hso_ak.c(10, 25);
            if (hso_ak.f(3) == 0) {
                var5 = 6;
                var7 = hso_ak.c(20, 40);
            }

            var4.e = hso_ak.a(hso_ak.d(var6)) * var5;
            var4.f = hso_ak.b(hso_ak.d(var6)) * var5;
            var4.a = this.D - hso_ak.a(hso_ak.d(var6)) * var7;
            var4.b = this.E - hso_ak.b(hso_ak.d(var6)) * var7;
            var4.d = this.E - hso_ak.b(hso_ak.d(var6)) * (var7 + 6);
            var4.c = this.D - hso_ak.a(hso_ak.d(var6)) * (var7 + 6);
            var4.j = hso_ak.f(3) == 0;
            this.W.a(var4);
        }

    }

    private void a(int var1, MainObject var2) {
        boolean var3 = false;
        boolean var4 = false;
        int var6;
        int var7;
        if (var2 != null) {
            var6 = super.g - var2.aY;
            var7 = super.h - (var2.aZ - var2.be / 2);
        } else {
            var6 = super.g - super.i;
            var7 = super.h - super.j;
        }

        int var5 = hso_ak.d(hso_ak.a(var6, var7) + var1);
        var1 = hso_ak.d(hso_ak.a(-var6, -var7) + var1);
        hso_en var8 = new hso_en();
        if (var2 != null) {
            var8.a = var2.aY + 50 * hso_ak.b(var5) / 1000;
            var8.b = var2.aZ - var2.be / 2 + 50 * hso_ak.a(var5) / 1000;
        } else {
            var8.a = super.i + 50 * hso_ak.b(var5) / 1000;
            var8.b = super.j + 50 * hso_ak.a(var5) / 1000;
        }

        var8.i = 30 * hso_ak.b(var1) / 1000;
        var8.j = 30 * hso_ak.a(var1) / 1000;
        this.W.a(var8);
    }

    private void r() {
        if (super.s != null) {
            super.i = super.s.aY;
            super.j = super.s.aZ - super.s.be / 2;
        }

        super.f = 20;
        super.n = 20;
        super.u = new hso_ce(15);
        super.v = new hso_ce(17);
        super.w = new hso_ce(26);
        this.N = 32;
        int var1 = hso_ak.f(360);

        for (int var2 = 0; var2 < 5; ++var2) {
            hso_en var3;
            (var3 = new hso_en()).a = super.i * 1000;
            var3.b = super.j * 1000;
            var3.c = hso_ak.d(var1 + var2 * 72);
            var3.i = hso_ak.a(hso_ak.d(var3.c)) * this.N;
            var3.j = hso_ak.b(hso_ak.d(var3.c)) * this.N;
            int var4 = hso_ak.a(-var3.i, -var3.j);
            var3.p = this.c(var4);
            this.W.a(var3);
            hso_en var5;
            (var5 = new hso_en()).a = var3.a + var3.i;
            var5.b = var3.b + var3.j;
            var5.i = hso_ak.a(hso_ak.d(var3.c + 180)) * 5;
            var5.j = hso_ak.b(hso_ak.d(var3.c + 180)) * 5;
            this.X.a(var5);
        }

    }

    private void s() {
        hso_cs.t = 103;
        if (super.s != null) {
            super.g = super.s.aY;
            super.h = super.s.aZ + super.s.be / 4;
        } else {
            super.g = super.i;
            super.h = super.j;
        }

        super.u = new hso_ce(53);
        super.n = 4;
        super.f = 6;
        if (super.f > 0) {
            this.V = (byte) (super.f / 2);
        }

        if (super.s != null) {
            super.i = super.s.aY;
            super.j = super.s.aZ - super.s.be / 4;
        }

    }

    private void t() {
        super.h += 10;
        if (super.m == 1) {
            super.h -= 5;
        }

        super.u = new hso_ce(8);
        super.v = new hso_ce(53);
        super.n = 14;
        this.b(10);
        boolean var1 = false;
        boolean var2 = false;
        int var3;
        int var4;
        if (super.s != null) {
            var3 = super.s.aY - super.g;
            var4 = super.s.aZ - super.h;
        } else {
            var3 = super.i - super.g;
            var4 = super.j - super.h;
        }

        this.a(var3, var4, (hso_ar) null);
        if (super.m != 1) {
            hso_en var5;
            (var5 = new hso_en()).a = super.g;
            var5.b = super.h;
            this.W.a(var5);
        }

        if (super.s != null) {
            super.i = super.s.aY;
            super.j = super.s.aZ - super.s.be / 4;
        }

    }

    private void u() {
        super.h += 8;
        super.n = 12;
        boolean var1 = false;
        boolean var2 = false;
        int var4;
        int var5;
        if (super.s != null) {
            var4 = super.s.aY - super.g;
            var5 = super.s.aZ - super.s.be / 2 - super.h;
        } else {
            var4 = super.i - super.g;
            var5 = super.j - super.h;
        }

        super.h += 6;
        super.n = 16;
        super.u = new hso_ce(57);
        super.v = new hso_ce(3);
        int var3 = hso_ak.a(var4, var5);
        this.as = this.c(var3);
        this.a(var4, var5, (hso_ar) null);
        if (super.o >= 0) {
            this.ab = 0;
        } else {
            this.ab = 2;
        }
    }

    private void v() {
        super.h += 5;
        if (super.d == 22) {
            this.B = 17;
            super.u = new hso_ce(74);
            super.n = 22;
        } else if (super.d == 31) {
            this.B = 18;
            super.h += 3;
            super.u = new hso_ce(97);
            super.v = new hso_ce(31);
            super.n = 16;
        }

        boolean var1 = false;
        boolean var2 = false;
        int var3;
        int var4;
        if (super.s != null) {
            var3 = super.s.aY - super.g;
            var4 = super.s.aZ - super.s.be / 2 - super.h;
        } else {
            var3 = super.i - super.g;
            var4 = super.j - super.h;
        }

        this.a(var3, var4, (hso_ar) null);
        var3 = hso_ak.a(var3, var4);
        this.as = this.c(var3);
    }

    private void w() {
        super.h += 5;
        if (super.d == 99) {
            this.B = 34;
            super.h += 3;
            super.u = new hso_ce(135);
            super.n = 16;
        }

        boolean var1 = false;
        boolean var2 = false;
        int var3;
        int var4;
        if (super.s != null) {
            var3 = super.s.aY - super.g;
            var4 = super.s.aZ - super.s.be / 2 - super.h;
        } else {
            var3 = super.i - super.g;
            var4 = super.j - super.h;
        }

        this.a(var3, var4, (hso_ar) null);
        var3 = hso_ak.a(var3, var4);
        this.as = this.c(var3);
    }

    private void x() {
        this.aj = 20;
        this.ak = -50;
        super.h += this.ak;
        super.g += this.aj;
        this.B = 32;
        super.u = new hso_ce(133);
        super.v = new hso_ce(31);
        super.n = 16;
        boolean var1 = false;
        boolean var2 = false;
        int var3;
        int var4;
        if (super.s != null) {
            var3 = super.s.aY - super.g;
            var4 = super.s.aZ - super.h;
        } else {
            var3 = super.i - super.g;
            var4 = super.j - super.h;
        }

        this.a(var3, var4, (hso_ar) null);
        var3 = hso_ak.a(var3, var4);
        this.as = this.c(var3);
    }

    private void b(int var1, int var2) {
        var1 -= super.g;
        var2 -= super.h;
        hso_ar var3 = new hso_ar();
        this.b(var1, var2, var3);
        hso_en var4;
        (var4 = new hso_en()).a = super.g;
        var4.b = super.h;
        var4.i = var3.f;
        var4.j = var3.g;
        var4.o = var3.c;
        var1 = hso_ak.a(var1, var2);
        var4.p = this.c(var1);
        this.W.a(var4);
    }

    private void y() {
        super.h += 5;
        super.f = 5;
        super.u = new hso_ce(47);
        super.n = 22;
        int var1;
        int var2;
        if (super.s != null) {
            var1 = super.s.aY;
            var2 = super.s.aZ - super.s.be / 2;
        } else {
            var1 = super.i;
            var2 = super.j;
        }

        int var3 = hso_ak.a(var1 - super.g, var2 - super.h);
        this.as = this.c(var3);

        for (var3 = 0; var3 < 4; ++var3) {
            int var4 = var1 + hso_ak.b(0, 13) - super.g;
            int var5 = var2 + hso_ak.b(0, 13) - super.h;
            hso_ar var6 = new hso_ar();
            this.a(var4, var5, var6);
            hso_en var7;
            (var7 = new hso_en()).a = super.g;
            var7.b = super.h;
            var7.i = var6.f;
            var7.j = var6.g;
            var7.o = var6.c;
            this.W.a(var7);
        }

    }

    private void z() {
        if (super.s == null) {
            if (super.k < super.f) {
                super.k = super.f;
            }

        } else {
            int var1 = hso_ak.a(super.i - super.g, super.j - super.h);
            this.as = this.c(var1);

            for (var1 = 0; var1 < 6; ++var1) {
                int var2 = super.i + hso_ak.b(0, 35) - super.g;
                int var3 = super.j + hso_ak.b(0, 35) - super.h;
                hso_ar var4 = new hso_ar();
                this.b(var2, var3, var4);
                hso_en var5;
                (var5 = new hso_en()).a = super.g;
                var5.b = super.h;
                var5.i = var4.f;
                var5.j = var4.g;
                var5.o = var4.c + hso_ak.f(2);
                var5.p = this.as;
                this.W.a(var5);
            }

        }
    }

    private void A() {
        super.r = -1;
        if (this.af != null) {
            super.h += this.af.be / 2;
        }

        super.u = new hso_ce(65);
        super.v = new hso_ce(67);
        super.f = 23;

        for (int var1 = 0; var1 < 10; ++var1) {
            hso_en var2 = new hso_en();
            int var3 = hso_ak.c(180, 360);
            var2.a = 17 * hso_ak.b(var3) / 1000;
            var2.b = 15 * hso_ak.a(var3) / 1000 - 5;
            var2.o = hso_ak.f(2);
            var2.p = hso_ak.f(4);
            var2.h = 50;
            this.W.a(var2);
        }

    }

    private void B() {
        this.V = 4;
        if (super.d == 47) {
            super.u = new hso_ce(87);
        } else {
            super.u = new hso_ce(127);
        }

        super.v = new hso_ce(75);
        if (this.af != null) {
            super.h = this.af.aZ;
        }

        if (super.s != null) {
            super.i = super.s.aY;
            super.j = super.s.aZ - super.s.be / 4;
        }

        super.f = 20;
        int var1 = super.g * 1000;
        int var2 = super.h * 1000;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = hso_ak.a(super.i - super.g, super.j - super.h);
        int var8;
        if ((var8 = MainObject.f(super.i - super.g, super.j - super.h)) > 60) {
            var1 = super.g * 1000 + (var8 - 50) * hso_ak.b(var5);
            var2 = super.h * 1000 + (var8 - 50) * hso_ak.a(var5);
        }

        var8 = 18 * hso_ak.b(var5);
        int var9 = 18 * hso_ak.a(var5);
        hso_en var6;
        (var6 = new hso_en()).o = 0;
        var6.a = var1 + var8;
        var6.b = var2 + var9;
        var6.p = hso_ak.f(5);
        if (super.m == 2) {
            var6.m = 2;
        }

        this.W.a(var6);

        for (var1 = 1; var1 < 6; ++var1) {
            (var6 = new hso_en()).o = var1 / 2;
            hso_en var7 = (hso_en) this.W.a(var1 - 1);
            int var10001 = var7.a + var8;
            int var10002 = var1 % 2;
            var6.a = var10001;
            if (var5 > 1575 && var5 <= 3375) {
                var10001 = var7.b + var9;
                var10002 = var1 % 2;
                var6.b = var10001;
            } else {
                var10001 = var7.b + var9;
                var10002 = var1 % 2;
                var6.b = var10001;
            }

            var6.m = 0;
            var6.p = hso_ak.f(5);
            if (super.m == 2) {
                var6.m = 2;
            }

            this.W.a(var6);
        }

    }

    private void C() {
        super.n = 5;
        if (this.af != null && super.s != null && MainObject.c(this.af.aY, super.s.aZ, this.af.aZ, super.s.aZ) < 15) {
            super.n = 2;
        }

        switch (super.m) {
            case 0:
                super.h += super.n;
                this.E = super.n;
                this.as = 17;
                this.ab = 5;
                break;
            case 1:
                super.h -= super.n;
                this.E = -super.n;
                this.as = 33;
                this.ab = 6;
                break;
            case 2:
                super.g -= super.n;
                this.D = -super.n;
                this.as = 10;
                this.ab = 2;
                break;
            case 3:
                super.g += super.n;
                this.D = super.n;
                this.as = 6;
                this.ab = 0;
        }

        switch (this.A) {
            case 0:
                super.u = new hso_ce(106);
                break;
            case 1:
                super.u = new hso_ce(107);
                break;
            case 2:
                super.u = new hso_ce(108);
                break;
            case 3:
                super.u = new hso_ce(109);
                break;
            case 4:
                super.u = new hso_ce(110);
                break;
            default:
                super.u = new hso_ce(106);
        }

        super.f = 8;
    }

    private void D() {
        super.n = 12;
        boolean var1 = false;
        boolean var2 = false;
        int var5;
        int var6;
        if (super.s != null) {
            var5 = super.s.aY - super.g;
            var6 = super.s.aZ - super.h;
        } else {
            var5 = super.i - super.g;
            var6 = super.j - super.h;
        }

        this.a(var5, var6, (hso_ar) null);
        this.D = super.g;
        this.E = super.h;
        this.E += 10;
        if (super.m == 1) {
            this.E -= 5;
        }

        hso_i var10000 = this;
        boolean var3 = true;
        hso_i var4 = var10000;
        switch (var10000.m) {
            case 0:
                var4.E += 20;
                return;
            case 1:
                var4.E -= 20;
                return;
            case 2:
                var4.D -= 20;
                return;
            case 3:
                var4.D += 20;
            default:
        }
    }

    private void E() {
        if (super.s == null) {
            this.c();
        } else {
            int var1 = super.s.aY - super.g;
            int var2 = super.s.aZ - (super.s.be >> 1) - super.h;
            ++this.aC;
            if ((hso_ak.e(var1) >= 16 || hso_ak.e(var2) >= 16) && this.aC <= super.f) {
                int var3;
                if (Math.abs((var3 = hso_ak.a(var1, var2)) - this.O) < 90 || var1 * var1 + var2 * var2 > 4096) {
                    if (Math.abs(var3 - this.O) < 15) {
                        this.O = var3;
                    } else if ((var3 - this.O < 0 || var3 - this.O >= 180) && var3 - this.O >= -180) {
                        this.O = hso_ak.d(this.O - 15);
                    } else {
                        this.O = hso_ak.d(this.O + 15);
                    }
                }

                if (this.aD < 8192) {
                    this.aD += 2048;
                }

                this.F = this.aD * hso_ak.b(this.O) >> 10;
                this.G = this.aD * hso_ak.a(this.O) >> 10;
                var1 = var1 + this.F >> 10;
                super.g += var1;
                var1 = var2 + this.G >> 10;
                super.h += var1;
            } else {
                this.c();
            }
        }
    }

    private void F() {
        hso_en var1;
        if (super.d == 96) {
            (var1 = new hso_en()).a = super.g;
            var1.b = super.h;
            this.W.a(var1);
        }

        if (super.d == 88) {
            (var1 = new hso_en()).a = super.g;
            var1.b = super.h;
            this.W.a(var1);
        }

        if (super.s != null && !super.s.cK && super.k < super.f && !super.s.cL) {
            int var2;
            int var4;
            if (super.d != 92 && super.d != 89) {
                var4 = super.s.aY - super.g;
                var2 = super.s.aZ - (super.s.be >> 1) - super.h;
            } else {
                var4 = this.af.aY - super.g;
                var2 = this.af.aZ - (this.af.be >> 1) - super.h;
            }

            ++this.aC;
            if ((hso_ak.e(var4) >= 16 || hso_ak.e(var2) >= 16) && this.aC <= super.f) {
                int var3;
                if (Math.abs((var3 = hso_ak.a(var4, var2)) - this.O) < 90 || var4 * var4 + var2 * var2 > 4096) {
                    if (Math.abs(var3 - this.O) < 15) {
                        this.O = var3;
                    } else if ((var3 - this.O < 0 || var3 - this.O >= 180) && var3 - this.O >= -180) {
                        this.O = hso_ak.d(this.O - 15);
                    } else {
                        this.O = hso_ak.d(this.O + 15);
                    }
                }

                if (this.aD < 8192) {
                    this.aD += 3096;
                }

                this.F = this.aD * hso_ak.b(this.O) >> 10;
                this.G = this.aD * hso_ak.a(this.O) >> 10;
                var4 = var4 + this.F >> 10;
                super.g += var4;
                var4 = var2 + this.G >> 10;
                super.h += var4;
                if (super.d != 88) {
                    (var1 = new hso_en()).a = super.g;
                    var1.b = super.h;
                    this.W.a(var1);
                }

            } else {
                super.k = super.f;
            }
        } else {
            super.k = super.f;
        }
    }

    private void G() {
        if (super.k >= super.f) {
            super.k = super.f;
        } else {
            int var1 = super.i - super.g;
            int var2 = super.j - super.h;
            ++this.aC;
            if ((hso_ak.e(var1) >= 16 || hso_ak.e(var2) >= 16) && this.aC <= super.f) {
                int var3;
                if (Math.abs((var3 = hso_ak.a(var1, var2)) - this.O) < 90 || var1 * var1 + var2 * var2 > 4096) {
                    if (Math.abs(var3 - this.O) < 15) {
                        this.O = var3;
                    } else if ((var3 - this.O < 0 || var3 - this.O >= 180) && var3 - this.O >= -180) {
                        this.O = hso_ak.d(this.O - 15);
                    } else {
                        this.O = hso_ak.d(this.O + 15);
                    }
                }

                if (this.aD < 8192) {
                    this.aD += 3096;
                }

                this.F = this.aD * hso_ak.b(this.O) >> 10;
                this.G = this.aD * hso_ak.a(this.O) >> 10;
                var1 = var1 + this.F >> 10;
                super.g += var1;
                var1 = var2 + this.G >> 10;
                super.h += var1;
                hso_en var4;
                (var4 = new hso_en()).a = super.g;
                var4.b = super.h;
                this.W.a(var4);
            } else {
                super.k = super.f;
            }
        }
    }

    private void b(mGraphics var1) {
        if (super.u != null) {
            for (int var2 = 0; var2 < this.W.c(); ++var2) {
                hso_en var3;
                if ((var3 = (hso_en) this.W.a(var2)).n < super.f) {
                    this.a(var1, super.u, var3.p, var3.a / 1000, var3.b / 1000, false);
                }
            }

        }
    }

    private void c(mGraphics var1) {
        if (super.u != null) {
            for (int var2 = 0; var2 < this.W.c(); ++var2) {
                hso_en var3;
                if ((var3 = (hso_en) this.W.a(var2)).n < super.f) {
                    this.a(var1, super.u, var3.p, var3.a / 1000, var3.b / 1000, false);
                }
            }

        }
    }

    private void H() {
        int var1;
        hso_en var2;
        if (super.k >= super.f) {
            for (var1 = 0; var1 < this.W.c(); ++var1) {
                var2 = (hso_en) this.W.a(var1);
                if (super.d == 90) {
                    GameScreen.a(10, var2.a / 1000, var2.b / 1000);
                    GameScreen.a(15, var2.a / 1000, var2.b / 1000 + super.s.be / 4);
                } else if (super.d == 91) {
                    GameScreen.a(44, var2.a / 1000, var2.b / 1000);
                }
            }

            this.c();
        } else {
            for (var1 = 0; var1 < this.W.c(); ++var1) {
                hso_en var10000 = var2 = (hso_en) this.W.a(var1);
                var10000.a += var2.i;
                var2.b += var2.j;
                int var3;
                if ((var3 = hso_ft.p.a(var2.a / 1000, var2.b / 1000)) == -1 || var3 == 1 || !hso_dx.a(var2.a / 1000, var2.b / 1000, super.u.a, super.u.b)) {
                    if (super.d == 90) {
                        GameScreen.a(10, var2.a / 1000, var2.b / 1000);
                        GameScreen.a(15, var2.a / 1000, var2.b / 1000 + super.s.be / 4);
                    } else if (super.d == 91) {
                        GameScreen.a(44, var2.a / 1000, var2.b / 1000);
                    }

                    this.W.d(var2);
                }
            }

        }
    }

    private void a(mGraphics var1, hso_ce var2, int var3, int var4, int var5, boolean var6) {
        int var7 = var2.c / 3;
        var2.c(var7 * this.Z[var3] + super.k % var7, var4, var5, this.aa[var3], 3, var1);
    }

    private void b(int var1, int var2, int var3, int var4) {
        if ((var1 = hso_ft.p.a(var2, var4)) != 1 && var1 != -1) {
            if (this.af != null && this.af == GameScreen.f) {
                this.af.bf = var2;
                this.af.bg = var4;
                this.af.aY = this.aF;
                this.af.aZ = this.aG;
                this.af.cj = var2;
                this.af.ck = var4;
                this.af.bl = var2;
                this.af.bm = var4;
            } else {
                this.af.bf = var2;
                this.af.bg = var4;
                this.af.aY = var2;
                this.af.aZ = var4;
            }
        } else {
            this.af.bf = var2;
            this.af.bg = var4;
            this.af.aY = var2;
            this.af.aZ = var4;
            this.c();
        }
    }

    public static int a(int[] var0, MainObject var1, MainObject var2, int[] var3) {
        byte var4 = -1;

        for (int var5 = 0; var5 < var0.length; ++var5) {
            switch (var0[var5]) {
                case 1:
                    GameScreen.a(29, var2.aY, var2.aZ - var2.be / 2);
                    if (var1 == GameScreen.f) {
                        GameScreen.a(hso_df.dv, var2.aY, var2.aZ - var2.be / 2, 7);
                        var4 = 7;
                    } else {
                        GameScreen.a(hso_df.dv, var2.aY, var2.aZ - var2.be / 2, 6);
                    }
                    break;
                case 2:
                case 3:
                    GameScreen.b(41, var2.ct, var2.cu, var1.ct, var1.cu, var3[var5], var1.br, (byte) (var0[var5] - 2));
                    GameScreen.a("-" + var3[var5], var2.aY, var2.aZ - var2.be / 2, var0[var5] == 2 ? 3 : 4);
                    break;
                case 4:
                    GameScreen.a(6, var2.ct, var2.cu, var2.ct, var2.cu, var3[var5], var1.br);
                    if (var1 == GameScreen.f) {
                        GameScreen.a(hso_df.dw, var2.aY, var2.aZ - var2.be / 2, 7);
                        var4 = 7;
                    } else {
                        GameScreen.a(hso_df.dw, var2.aY, var2.aZ - var2.be / 2, 6);
                    }
                    break;
                case 5:
                    GameScreen.a(67, var2.ct, var2.cu, var1.ct, var1.cu, var3[var5], var1.br);
                    if (var2 == GameScreen.f) {
                        GameScreen.a(hso_df.fz, var2.aY, var2.aZ - var2.be / 2, 7);
                    } else {
                        GameScreen.a(hso_df.fz, var2.aY, var2.aZ - var2.be / 2, 6);
                    }

                    if (var1.br <= 0 && var1.cF != 4) {
                        var1.N();
                        var1.cF = 4;
                        var1.aW = hso_ft.aj;
                        GameScreen.a(11, var1.aY, var1.aZ);
                    }
            }
        }

        return var4;
    }

    public static boolean a(int var0) {
        return var0 == 93 || var0 == 99 || var0 == 95 || var0 == 96 || var0 == 97 || var0 == 98 || var0 == 108 || var0 == 113 || var0 == 104 || var0 == 114 || var0 == 115;
    }

    private void I() {
        if (super.s != null) {
            if (super.k == 1) {
                hso_cs.t = 103;
                GameScreen.a(9, super.s.aY, super.s.aZ - 2);
                GameScreen.a(47, super.s.aY, super.s.aZ, super.s.bL);
            }

            if (!super.s.bH || super.s != null && super.s.cK) {
                super.x = true;
            }
        }

    }

    private void J() {
        if (super.s != null && (super.s.cF == 4 || !super.s.bI || super.s == null || super.s != null && super.s.cK)) {
            super.x = true;
        }

    }

    private void K() {
        for (int var1 = 0; var1 < this.W.c(); ++var1) {
            hso_en var2 = (hso_en) this.W.a(var1);
            if (super.s == null) {
                this.c();
                return;
            }

            int var3 = super.s.aY - var2.a;
            int var4 = super.s.aZ - (super.s.be >> 1) - var2.b;
            ++this.aC;
            if (hso_ak.e(var3) < 16 && hso_ak.e(var4) < 16 || this.aC > super.f) {
                this.c();
                GameScreen.a(45, super.s.aY, super.s.aZ - 20);
                return;
            }

            int var5;
            if (Math.abs((var5 = hso_ak.a(var3, var4)) - this.O) < 90 || var3 * var3 + var4 * var4 > 4096) {
                if (Math.abs(var5 - this.O) < 15) {
                    this.O = var5;
                } else if ((var5 - this.O < 0 || var5 - this.O >= 180) && var5 - this.O >= -180) {
                    this.O = hso_ak.d(this.O - 15);
                } else {
                    this.O = hso_ak.d(this.O + 15);
                }
            }

            if (this.aD < 8192) {
                this.aD += 2048;
            }

            this.F = this.aD * hso_ak.b(this.O) >> 10;
            this.G = this.aD * hso_ak.a(this.O) >> 10;
            var3 = var3 + this.F >> 10;
            var2.a += var3;
            var3 = var4 + this.G >> 10;
            var2.b += var3;
            if (super.k % 2 == 0) {
                GameScreen.a(9, var2.a, var2.b);
                GameScreen.a(46, var2.a, var2.b - 2);
            }

            ++var2.n;
        }

        if (super.k >= super.f) {
            this.c();
        }

    }

    public final void a(short var1) {
        super.e = var1;
        super.g = super.s.aY;
        super.h = super.s.aZ;
        super.s.bb = 0;
        super.s.bc = 0;
        super.s.bf = super.g;
        super.s.bg = super.h;
        if (super.d == 101) {
            super.s.dK = true;
            super.s.bM = hso_dw.a() + (long) (var1 * 1000);
        } else if (super.d == 102) {
            super.s.dJ = true;
            super.s.bN = hso_dw.a() + (long) (var1 * 1000);
        } else if (super.d == 107) {
            super.s.bO = hso_dw.a() + (long) (var1 * 1000);
            super.s.dL = true;
        } else if (super.d == 103) {
            super.s.dM = true;
            super.s.bP = hso_dw.a() + (long) (var1 * 1000);
        } else if (super.d == 100) {
            super.s.bI = true;
            super.s.bQ = hso_dw.a() + (long) (var1 * 1000);
        } else {
            super.s.bH = true;
            super.s.bL = hso_dw.a() + (long) (var1 * 1000);
        }
    }

    public final void a(short var1, byte var2) {
        this.af = MainObject.a(var1, var2);
    }
}
