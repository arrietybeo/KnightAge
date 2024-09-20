
import java.util.Enumeration;

public class MainObject extends hso_cg {

    public short aM = -1;
    public short aN = -1;
    public short aO = -1;
    public short aP = -1;
    public short aQ = -1;
    public short aR = -1;
    public short aS = -1;
    public short aT = -1;
    public short aU = -1;
    public short aV = -1;
    public long aW;
    public hso_dq aX = null;
    public int aY;
    public int aZ;
    public int ba;
    public int bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    private int a;
    public int bl;
    public int bm;
    public int bn;
    public int bo;
    public int bp;
    public int bq;
    private int b;
    private int c = 0;
    public int br;
    public int bs;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    private int d;
    public byte bx;
    public short by;
    public short bz;
    public short bA = -1;
    public long bB;
    public long bC;
    public int bD = 0;
    int bE = 0;
    public boolean bF = false;
    public boolean bG;
    public boolean bH = false;
    public boolean bI = false;
    public boolean bJ = false;
    public boolean bK = false;
    public long bL = 0L;
    public long bM = 0L;
    public long bN = 0L;
    public long bO = 0L;
    public long bP = 0L;
    public long bQ = 0L;
    public int bR;
    public int bS;
    public int bT;
    public int bU;
    private int e;
    public long bV;
    public int bW = 2;
    public int bX = 1;
    public int bY = 2;
    public int bZ = 2;
    public int ca = 2;
    public int cb = 2;
    public int cc = -1;
    public int cd = -1;
    public int ce;
    private byte[] f = new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
    public byte[] cf = new byte[]{2, 2, 2, 0, 0, 3, 3, 3, 0, 0};
    private static byte g;
    public static byte cg = 0;
    public static int ch = 0;
    public static int ci = 0;
    public int cj;
    public int ck;
    public int cl;
    public int cm;
    private int h = 0;
    public int cn = 0;
    public byte co = 0;
    public boolean cp = false;
    public static String[] cq = null;
    public static byte cr = 0;
    public byte cs;
    public int ct;
    public byte cu;
    public byte cv = -1;
    public byte cw;
    public byte cx = 0;
    public byte cy;
    public int cz = -1;
    public short cA = 0;
    public String cB = "";
    public String cC;
    public String cD;
    public String cE;
    public int cF;

    public int Direction;

    public int cH;
    public int cI;
    public int cJ;
    public boolean cK;
    private boolean i;
    public boolean cL;
    public boolean cM;
    public short[] cN;
    public hso_em cO;
    public int cP;
    public int cQ;
    public hso_es cR;
    public int cS;
    public int cT;
    public boolean cU;
    public boolean cV;
    public boolean cW;
    public boolean cX;
    public long cY;
    public static hso_aq cZ;
    public static hso_aq da;
    public static hso_aq db;
    public static hso_aq dc;
    public static hso_aq dd;
    public static hso_aq de = null;
    public hso_es df;
    public hso_ds dg;
    public hso_dh dh;
    public int di;
    public boolean dj;
    public hso_cj dk;
    private boolean j;
    public int dl;
    public int dm;
    public hso_do dn;
    public static hso_es hso_do = new hso_es("MainObject vecCapchar");
    public static String dp = "";
    public boolean dq;
    public boolean dr;
    public boolean ds;
    public static byte dt;
    public hso_es du;
    public hso_es dv;
    public hso_es dw;
    private hso_es k;
    public int dx;
    public boolean dy;
    public int dz;
    public int dA;
    public byte dB;
    public boolean dC;
    public boolean dD;
    public boolean dE;
    public short[] dF;
    public static short[] dG;
    public short dH;
    public boolean dI;
    public boolean dJ;
    public boolean dK;
    public boolean dL;
    public boolean dM;
    public byte dN;
    public byte dO;
    public boolean dP;
    public boolean dQ;
    public boolean dR;
    public byte dS;
    public byte dT;
    private static byte[] l = new byte[]{0, 1, 2, 1};
    private byte m;
    private static byte[][] n = new byte[][]{
        {6, 0, 1, 2, 5, 4, 3, 6},
        {6, 0, 1, 2, 5, 4, 3, 6},
        {6, 0, 1, 2, 5, 4, 3, 6},
        {6, 0, 1, 2, 5, 4, 3, 6}
    };
    private int[][][] o;
    private int p;
    private int q;
    private byte r;
    private byte s;
    private byte t;
    private static hso_ek u = new hso_ek();
    private int v;
    private byte w;
    private byte x;
    private byte y;
    private int z;
    private int A;
    private static byte[] B = new byte[]{2, 2, 2, 3, 3, 4, 4, 4};
    private byte C;
    private byte D;
    public boolean dU;
    private byte E;
    public int dV;
    public int dW;
    public int dX;
    public static hso_am[][][] dY = new hso_am[4][][];
    private int F;
    private int[] G;
    public boolean dZ;
    public int ea;
    public int eb;
    public int ec;
    public int ed;
    public byte ee;
    public byte ef;
    public byte eg;
    private static byte[] H;
    private static byte[] I;
    private short[][] J;
    public byte[] eh;
    private hso_ce K;
    public static hso_ce[] ei;
    private int L;
    private int M;
    private int N;
    private byte O;
    private byte P;
    private byte[] Q;
    private byte[][] R;
    private byte[][] S;

    static {
        for (int var0 = 0; var0 < dY.length; ++var0) {
            dY[var0] = new hso_am[40][];

            for (int var1 = 0; var1 < dY[var0].length; ++var1) {
                dY[var0][var1] = new hso_am[8];
            }
        }

        byte[] var10000 = new byte[]{24, 21, 19, 13};
        var10000 = new byte[]{0, -1, 0, 0, 0};
        H = new byte[]{3};
        I = new byte[]{2, 2, 2, 0, 0, 3, 3, 3, 0, 0};
    }

    public static boolean f(int var0) {
        try {
            for (int var1 = 0; var1 < dG.length; ++var1) {
                if (dG[var1] == var0) {
                    return true;
                }
            }

            return false;
        } catch (Exception var2) {
            hso_dw.a("----Err mainobj:-- isMaHopNguyenLieu");
            return false;
        }
    }

    public String f() {
        return "";
    }

    public MainObject() {
        this.cC = hso_df.ai;
        this.cD = "";
        this.cE = null;
        this.cI = 0;
        this.cJ = 0;
        this.i = false;
        this.cO = null;
        this.cU = false;
        this.cV = false;
        this.cW = false;
        this.cX = false;
        this.df = new hso_es("MainObject vecBuff");
        this.dj = false;
        this.dl = 0;
        this.dm = -1;
        this.dq = false;
        this.du = new hso_es("MainObject VecEffauto");
        this.dv = new hso_es("Low VecEffauto");
        this.dw = new hso_es("Effect CharWearing");
        this.k = new hso_es();
        this.dz = 0;
        this.dA = 1500;
        this.dE = false;
        this.dF = new short[]{-1, -1, -1, -1, -1, -1, -1};
        this.dI = false;
        this.dJ = false;
        this.dK = false;
        this.dL = false;
        this.dM = false;
        this.dN = -1;
        this.dO = -1;
        this.dQ = false;
        this.dS = 1;
        this.dT = 0;
        this.m = 0;
        this.o = new int[][][]{{new int[9], new int[9], new int[9]}, {{0, 0, 0, 1, 1, 1, 2, 2, 2}, {1, 1, 1, 0, 0, 0, 2, 2, 2}, {2, 2, 2, 0, 0, 0, 1, 1, 1}}, {{2, 2, 2, 2, 2, 3, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}}};
        this.A = 0;
        this.C = 0;
        this.D = 0;
        this.dU = true;
        this.dV = 0;
        this.dW = 0;
        this.dX = -1;
        this.F = 0;
        this.G = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
        this.dZ = false;
        this.ea = 0;
        this.eb = 0;
        this.ec = 0;
        this.ed = 0;
        this.ee = -1;
        this.J = new short[12][];
        this.eh = new byte[]{-1, -1, -1};
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 8;
        this.Q = new byte[]{2, 0, 2, 2};
        this.R = new byte[][]{{-2, 4, 2, -10}, {-2, 4, 2, -10}};
        this.S = new byte[][]{{6, 5, 5, 2}, {6, 5, 5, 2}};
    }

    public boolean c_() {
        return false;
    }

    public boolean D() {
        return false;
    }

    public void d(int var1) {
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        return false;
    }

    public MainObject(int var1, byte var2, String var3, int var4, int var5) {
        this.cC = hso_df.ai;
        this.cD = "";
        this.cE = null;
        this.cI = 0;
        this.cJ = 0;
        this.i = false;
        this.cO = null;
        this.cU = false;
        this.cV = false;
        this.cW = false;
        this.cX = false;
        this.df = new hso_es("MainObject vecBuff");
        this.dj = false;
        this.dl = 0;
        this.dm = -1;
        this.dq = false;
        this.du = new hso_es("MainObject VecEffauto");
        this.dv = new hso_es("Low VecEffauto");
        this.dw = new hso_es("Effect CharWearing");
        this.k = new hso_es();
        this.dz = 0;
        this.dA = 1500;
        this.dE = false;
        this.dF = new short[]{-1, -1, -1, -1, -1, -1, -1};
        this.dI = false;
        this.dJ = false;
        this.dK = false;
        this.dL = false;
        this.dM = false;
        this.dN = -1;
        this.dO = -1;
        this.dQ = false;
        this.dS = 1;
        this.dT = 0;
        this.m = 0;
        this.o = new int[][][]{{new int[9], new int[9], new int[9]}, {{0, 0, 0, 1, 1, 1, 2, 2, 2}, {1, 1, 1, 0, 0, 0, 2, 2, 2}, {2, 2, 2, 0, 0, 0, 1, 1, 1}}, {{2, 2, 2, 2, 2, 3, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3, 3}, {2, 2, 2, 2, 2, 3, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4}}};
        this.A = 0;
        this.C = 0;
        this.D = 0;
        this.dU = true;
        this.dV = 0;
        this.dW = 0;
        this.dX = -1;
        this.F = 0;
        this.G = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
        this.dZ = false;
        this.ea = 0;
        this.eb = 0;
        this.ec = 0;
        this.ed = 0;
        this.ee = -1;
        this.J = new short[12][];
        this.eh = new byte[]{-1, -1, -1};
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 8;
        this.Q = new byte[]{2, 0, 2, 2};
        this.R = new byte[][]{{-2, 4, 2, -10}, {-2, 4, 2, -10}};
        this.S = new byte[][]{{6, 5, 5, 2}, {6, 5, 5, 2}};
        this.ct = var1;
        this.cB = var3;
        this.cu = var2;
        this.aY = var4;
        this.aZ = var5;
        this.bf = var4;
        this.bg = var5;
        this.Direction = 0;
    }

    public void a(byte var1, short var2, short var3, byte var4, byte var5, byte var6, String var7, String var8, short var9, short var10, byte var11, byte var12, byte[] var13, byte[] var14, byte[] var15) {
    }

    public final void a(int var1, int var2, int var3) {
        if (var2 < 8) {
            var2 += 8;
        }

        this.bX = var1;
        this.ca = var2;
        this.cb = var3;
        this.bU = var2;
    }

    public void a(int var1, int var2, short var3) {
    }

    public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, byte var9, long var10, byte var12, int var13, int var14) {
        hso_dq var15 = new hso_dq(var1, var2, var3, 0, 0, 0, 0, var8, var10, var12, var13, var14);
        hso_dq var16;
        if (var9 == 0) {
            for (var3 = 0; var3 < this.du.c(); ++var3) {
                if ((var16 = (hso_dq) this.du.a(var3)) != null && var16.d == var1) {
                    this.du.d(var16);
                }
            }

            this.du.a(var15);
        } else {
            for (var3 = 0; var3 < this.dv.c(); ++var3) {
                if ((var16 = (hso_dq) this.dv.a(var3)) != null && var16.d == var1) {
                    this.dv.d(var16);
                }
            }

            this.dv.a(var15);
        }
    }

    public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (this.D()) {
            this.du.d();
        }

        for (var4 = 0; var4 < this.du.c(); ++var4) {
            hso_dq var9;
            if ((var9 = (hso_dq) this.du.a(var4)) != null && var9.d == var1) {
                this.du.d(var9);
            }
        }

        hso_dq var8 = new hso_dq(var1, var2, var3, 0, 0, var6, 0);
        this.du.a(var8);
    }

    public final boolean E() {
        return this.cv == 12 || this.cv == 13 || this.cv == 11;
    }

    public static void c(mGraphics var0, int var1, int var2) {
        var0.a(dc, 0, 0, aq.a(dc.a), aq.b(dc.a), 0, var1, var2, 3);
    }

    public boolean x() {
        return false;
    }

    public final void a(byte[] var1) {
        try {
            if (var1 == null) {
                this.bY = -1;
                this.bZ = -1;
                this.bW = -1;
                this.cc = -1;
                this.cb = -1;
                this.ca = -1;
                this.bX = -1;
                this.dX = -1;
                this.cd = -1;
            } else {
                this.bY = var1[0];
                this.bZ = var1[1];
                this.bW = var1[2];
                this.cc = var1[7];
                byte var2;
                if ((var2 = this.bx) == 3) {
                    var2 = 2;
                } else if (var2 == 2) {
                    var2 = 3;
                }

                this.dX = var1[var2 + 8];
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public final void b(byte[] var1) {
        if (var1 == null) {
            this.bY = -1;
            this.bZ = -1;
            this.bW = -1;
            this.cc = -1;
            this.dX = -1;
            this.cd = -1;
        } else {
            this.bY = var1[1];
            this.bZ = var1[7];
            this.bW = var1[6];
            this.cc = var1[10];
            this.dX = var1[0];
            this.cd = var1[5];
        }
    }

    public void a(mGraphics var1) {
    }

    public final void e(mGraphics var1) {
        if (this.df != null) {
            for (int var2 = this.df.c() - 1; var2 >= 0; --var2) {
                hso_ei var3;
                if ((var3 = (hso_ei) this.df.a(var2)) != null && var3.b) {
                    if (var3.h == 4) {
                        var3.a(var1, this.aY + this.bn, this.aZ - this.be + 5 + this.bo);
                    } else {
                        var3.a(var1, this.aY + this.bn, this.aZ + this.bo);
                    }
                }
            }

        }
    }

    public final void f(mGraphics var1) {
        if (this.df != null) {
            for (int var2 = this.df.c() - 1; var2 >= 0; --var2) {
                hso_ei var3;
                if ((var3 = (hso_ei) this.df.a(var2)) != null && !var3.b) {
                    if (var3.h == 4) {
                        var3.a(var1, this.aY + this.bn, this.aZ - this.be + 5 + this.bo);
                    } else {
                        var3.a(var1, this.aY + this.bn, this.aZ + this.bo);
                    }
                }
            }

        }
    }

    public void a(mGraphics var1, int var2, int var3) {
        if (this.bX != -1) {
            hso_ak.d(2, this.bX).a(var1, var2 - 1, var3 + 23, 0, 0);
        }

        if (this.ca != -1) {
            hso_ak.d(4, this.ca).a(var1, var2 - 1, var3 + 23, 0, 0);
        }

        if (this.cb != -1) {
            hso_ak.d(5, this.cb).a(var1, var2 - 1, var3 + 23, 0, 0);
        }

        if (this.bW != -1) {
            hso_ak.d(3, this.bW).a(var1, var2 - 1, var3 + 23, 0, 0);
        }

    }

    public final String c(String var1) {
        String var2 = this.cB;
        if (this.cO != null) {
            var2 = this.cO.c + var1 + var2;
        }

        return var2;
    }

    public final void a(mGraphics var1, int var2, int var3, int var4) {
        if (this.cO != null) {
            hso_fd var5 = hso_bk.i(this.cO.a);
            int var6;
            if (var4 == 2) {
                var4 = (hso_o.j.a(this.cO.c) + 12) / 2;
                if (var5.a != null) {
                    if (aq.b(var5.a.a) / 18 == 3) {
                        if (hso_ft.ai % 6 == 0) {
                            if ((var6 = l.length) == 0) {
                                var6 = 1;
                            }

                            this.m = (byte) ((this.m + 1) % var6);
                        }

                        var1.a(var5.a, 0, l[this.m] * 18, 18, 18, 0, var2 - var4 + 6, var3, 3);
                    } else {
                        var1.a(var5.a, var2 - var4 + 6, var3, 3);
                    }

                    hso_bw.r.a(var2 - var4 + 6, var3 - 1, this.cO.a(), 14, var1, 0);
                }

                hso_o.j.a(var1, this.cO.c, var2 - var4 + 15, var3 - 6, 0, true);
                return;
            }

            if (var4 == 0) {
                if (var5.a != null) {
                    if (aq.b(var5.a.a) / 18 == 3) {
                        if (hso_ft.ai % 6 == 0) {
                            if ((var4 = l.length) == 0) {
                                var4 = 1;
                            }

                            this.m = (byte) ((this.m + 1) % var4);
                        }

                        var1.a(var5.a, 0, l[this.m] * 18, 18, 18, 0, var2, var3, 3);
                    } else {
                        var1.a(var5.a, var2, var3, 3);
                    }

                    hso_bw.r.a(var2 - 1, var3 - 1, this.cO.a(), 14, var1, 0);
                }

                hso_o.f.a(var1, this.cO.c, var2 + 13, var3, 0, true);
                return;
            }

            if (var4 == -1) {
                if (var5.a != null) {
                    if (aq.b(var5.a.a) / 18 == 3) {
                        if (hso_ft.ai % 6 == 0) {
                            if ((var4 = l.length) == 0) {
                                var4 = 1;
                            }

                            this.m = (byte) ((this.m + 1) % var4);
                        }

                        var1.a(var5.a, 0, l[this.m] * 18, 18, 18, 0, var2 - 1, var3, 3);
                    } else {
                        var1.a(var5.a, var2 - 1, var3, 3);
                    }

                    hso_bw.r.a(var2 - 1, var3 - 1, this.cO.a(), 14, var1, 0);
                    return;
                }
            } else if (var4 == -2) {
                var4 = (hso_o.j.a(this.cO.c + " - " + this.cO.d) + 15) / 2;
                if (var5.a != null) {
                    if (aq.b(var5.a.a) / 18 == 3) {
                        if (hso_ft.ai % 6 == 0) {
                            if ((var6 = l.length) == 0) {
                                var6 = 1;
                            }

                            this.m = (byte) ((this.m + 1) % var6);
                        }

                        var1.a(var5.a, 0, l[this.m] * 18, 18, 18, 0, var2 - var4 + 7, var3, 3);
                    } else {
                        var1.a(var5.a, var2 - var4 + 7, var3, 3);
                    }

                    hso_bw.r.a(var2 - var4 + 6, var3 - 1, this.cO.a(), 14, var1, 0);
                }

                hso_o.j.a(var1, this.cO.c + " - " + this.cO.d, var2 - var4 + 15, var3 - 6, 0, true);
            }
        }

    }

    public final void g(mGraphics var1) {
        hso_fd var2;
        if ((var2 = hso_bk.a((short) this.cS)).a != null) {
            this.be = aq.b(var2.a.a) / this.dB;
            this.bd = aq.a(var2.a.a);
            var1.a(var2.a, 0, hso_ft.ai / 7 % this.dB * this.be, this.bd, this.be, 0, this.aY, this.aZ, 33);
        }

        if (GameScreen.h == null || GameScreen.h != null && this != GameScreen.h || hso_cf.I) {
            this.a(var1, 0);
        }

        int var5 = this.aY;
        int var3 = this.aZ - this.be - 8;
        int var4 = 0;
        if (this.bs > 0) {
            if (this.br > 0) {
                if ((var4 = this.br * 50 / this.bs) <= 0) {
                    var4 = 1;
                } else if (var4 > 50) {
                    var4 = 50;
                }
            }

            var1.a(-8714722);
            var1.c(var5 - this.bd / 2 + 10, var3, 50, 5);
            var1.a(-579511);
            var1.c(var5 - this.bd / 2 + 10, var3, var4, 5);
        }

    }

    public final void F() {
        this.j = true;
        this.bw = 0;
        this.d = 10;
        this.p = 5;
        this.q = 72;
    }

    public final void b(mGraphics var1, int var2) {
        if (!this.bF) {
            if (this.ab()) {
                if (this.cF == 4 && !this.bI) {
                    var1.a(db, this.aY + 1, this.aZ + 1, 3);
                    this.f(var1);
                    hso_cg.aC.b(0, this.aY + 1, this.aZ - this.bo + 5, 0, 33, var1);
                    if (this.aX != null) {
                        this.bI = false;
                        this.bQ = hso_dw.a();
                        GameScreen.a(15, this.aY, this.aZ);
                        this.aX = null;
                    }

                    if (this.h == 0) {
                        var1.a(hso_cg.ao, this.aY + 1, this.aZ - this.bo + 5 - 24, 17);
                    }
                } else if (!this.aa()) {
                    if (this.bA == -1 && this.aP == -1) {
                        var1.a(db, this.aY + 1, this.aZ - this.bo + 2, 3);
                    }

                    this.f(var1);
                    this.g(var1, this.aY, this.aZ);
                    this.e(var1, this.aY, this.aZ);
                    boolean var8 = (this.Direction == 0 || this.Direction == 2 || this.Direction == 3) && (this.bx == 3 && this.ce != 4 || this.bx != 3 && this.ce != 5);
                    boolean var3 = false;
                    int var4;
                    if (this.bA != -1) {
                        hso_fd var9;
                        if ((var9 = hso_bk.c(this.bA)).a != null) {
                            if ((var4 = this.cF) > this.o.length - 1) {
                                var4 = 0;
                            }

                            this.be = aq.b(var9.a.a) / 3;
                            this.bd = aq.a(var9.a.a) / 2;
                            if (this.ca == 4 || this.ca == 2) {
                                var4 = 3;
                            }

                            boolean var5 = false;
                            var8 = false;
                            int var11 = this.o[var4][this.Direction > 2 ? 2 : this.Direction][this.ce] / 3 * this.bd;
                            var2 = this.o[var4][this.Direction > 2 ? 2 : this.Direction][this.ce] % 3 * this.be;
                            var1.a(var9.a, var11, var2, this.bd, this.be, this.Direction > 2 ? 2 : 0, this.aY, this.aZ - this.bj + this.bk, 33);
                        }
                    } else {
                        if (var8) {
                            try {
                                this.d(var1, 0);
                            } catch (Exception var7) {
                            }
                        }

                        var3 = false;
                        for (var4 = 0; var4 < n[this.Direction].length; ++var4) {
                            byte var12;
                            if ((var12 = n[this.Direction][var4]) != 6 && var12 != 4 || var12 == 6 && this.Direction == 1 && var4 == 7 || var12 == 6 && this.Direction != 1 && var4 == 0 || var12 == 4 && this.Direction != 1) {
                                if (this.q(var4) >= 0) {
                                    if (this.ee == -1) {
                                        hso_ak.d(var12, this.q(var4)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.bw, this.Direction, this.ce);
                                    } else if (var4 != 1) {
                                        hso_ak.d(var12, this.q(var4)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.eb - this.bw, this.Direction, this.ce);
                                    } else {
                                        this.m(var1);
                                    }
                                } else if ((var12 == 0 || var12 == 1 || var12 == 2 || var12 == 4 || var12 == 5) && !var3) {
                                    var3 = true;
                                    this.ac();
                                }
                            }
                        }

                        if (this.ee != -1) {
                            this.l(var1);
                        }

                        if (!var8) {
                            try {
                                this.d(var1, 0);
                            } catch (Exception var6) {
                            }
                        }
                    }
                } else {
                    for (var2 = 0; var2 < n[this.Direction].length; ++var2) {
                        byte var10;
                        if ((var10 = n[this.Direction][var2]) == 4 && this.q(var2) >= 0) {
                            if (this.ee == -1) {
                                hso_ak.d(var10, this.q(var2)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.bw, this.Direction, this.ce);
                            } else if (var2 != 1) {
                                hso_ak.d(var10, this.q(var2)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.eb - this.bw, this.Direction, this.ce);
                            } else {
                                this.m(var1);
                            }
                        }
                    }
                }

                if (!this.aa()) {
                    this.f(var1, this.aY, this.aZ);
                    if (!this.dQ && this.cV && this.bj == 0) {
                        var2 = 1;
                        if (this.Direction == 2) {
                            var2 += 2;
                        } else if (this.Direction == 3) {
                            var2 -= 2;
                        }

                        var1.a(dd, 0, (this.cF != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, this.aY + var2, this.aZ - this.bo - 2 + this.bk, 3);
                    }
                }
            }

            if (!this.aa()) {
                if (hso_cf.I || this != GameScreen.h) {
                    this.a(var1, 0);
                }

                this.e(var1);
                this.k(var1);
                this.d(var1, this.aY, this.aZ);
                if (this.br > 0) {
                    this.h(var1);
                }
            }
        }

    }

    private int q() {
        if (this.Direction == 0) {
            return this.ce + this.s * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.s * 18 : this.ce + 12 + this.s * 18;
        }
    }

    private int r() {
        if (this.Direction == 0) {
            return this.ce + this.r * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.r * 18 : this.ce + 12 + this.r * 18;
        }
    }

    private int s() {
        if (this.Direction == 0) {
            return this.ce + this.v * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.v * 18 : this.ce + 12 + this.v * 18;
        }
    }

    private int u() {
        if (this.Direction == 0) {
            return this.ce + this.x * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.x * 18 : this.ce + 12 + this.x * 18;
        }
    }

    private int W() {
        if (this.Direction == 0) {
            return this.ce + this.w * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.w * 18 : this.ce + 12 + this.w * 18;
        }
    }

    private int a(int var1) {
        return var1 + this.x * 18;
    }

    private int b(int var1) {
        return var1 + this.w * 18;
    }

    private int k(int var1) {
        return var1 + this.r * 18;
    }

    private int l(int var1) {
        return var1 + this.s * 18;
    }

    private int X() {
        if (this.Direction == 0) {
            return this.A + this.z * 21;
        } else {
            return this.Direction == 1 ? this.A + 7 + this.z * 21 : this.A + 14 + this.z * 21;
        }
    }

    private int m(int var1) {
        return var1 + this.v * 18;
    }

    private int n(int var1) {
        return var1 + this.C * 18;
    }

    private int o(int var1) {
        return var1 + this.D * 18;
    }

    private int Y() {
        if (this.Direction == 0) {
            return this.ce + this.C * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.C * 18 : this.ce + 12 + this.C * 18;
        }
    }

    private int Z() {
        if (this.Direction == 0) {
            return this.ce + this.D * 18;
        } else {
            return this.Direction == 1 ? this.Direction * 6 + this.ce + this.D * 18 : this.ce + 12 + this.D * 18;
        }
    }

    public static hso_at g(int var0) {
        if (var0 == -1) {
            return null;
        } else {
            hso_at var1;
            if ((var1 = (hso_at) u.a(String.valueOf(var0))) == null) {
                (var1 = new hso_at(var0)).g = 113;
                u.a(String.valueOf(var0), var1);
                hso_fp.a((short) var0, var1.g);
                var1.e = (long) ((int) (hso_dw.a() / 1000L));
            } else {
                var1.e = hso_ft.aj;
            }

            return var1;
        }
    }

    public static void G() {
        Enumeration var0 = u.a.keys();

        while (var0.hasMoreElements()) {
            String var1 = (String) var0.nextElement();
            hso_at var2 = (hso_at) u.a(var1);
            if ((hso_ft.aj - var2.e) / 1000L > 60L) {
                u.a((Object) var1);
            }
        }

    }

    public final void c(mGraphics var1, int var2) {
        try {
            if (this.cF == 2 && this.aP != -1) {
                this.A = this.ce + 1;
            }

            if (!this.bF) {
                hso_at var18;
                hso_at var22;
                if (this.ab()) {
                    int var3;
                    if (this.cF == 4 && !this.bI) {
                        var1.a(db, this.aY + 1, this.aZ + 1, 3);
                        this.f(var1);
                        hso_cg.aC.b(0, this.aY + 1, this.aZ - this.bo + 5, 0, 33, var1);
                        if (this.aX != null) {
                            this.bI = false;
                            this.bQ = hso_dw.a();
                            GameScreen.a(15, this.aY, this.aZ);
                            this.aX = null;
                        }

                        if (this.h == 0) {
                            var1.a(hso_cg.ao, this.aY + 1, this.aZ - this.bo + 5 - 24, 17);
                        }
                    } else {
                        if (!this.aa()) {
                            if (this.bA == -1 && this.aP == -1) {
                                var1.a(db, this.aY + 1, this.aZ - this.bo + 2, 3);
                            }

                            this.f(var1);
                            this.g(var1, this.aY, this.aZ);
                            this.e(var1, this.aY, this.aZ);
                            boolean var17 = (this.Direction == 0 || this.Direction == 2 || this.Direction == 3) && (this.bx == 3 && this.ce != 4 || this.bx != 3 && this.ce != 5);
                            hso_at var19 = g(this.aO);
                            if (hso_ft.ai % 5 == 0 && var19 != null) {
                                int var5;
                                if ((var5 = var19.a.c() / 18) == 0) {
                                    var5 = 1;
                                }

                                this.D = (byte) ((this.D + 1) % var5);
                            }

                            if ((var22 = g(this.aP)) != null) {
                                var22.j(var1, this.aY + this.ec, this.aZ - this.bo - this.bj + this.bk - this.bw + this.ed, this.X(), this.Direction == 3 ? 2 : 0);
                            }

                            if (this.bA != -1) {
                                hso_fd var25;
                                if ((var25 = hso_bk.c(this.bA)).a != null) {
                                    int var24;
                                    if ((var24 = this.cF) > this.o.length - 1) {
                                        var24 = 0;
                                    }

                                    this.be = aq.b(var25.a.a) / 3;
                                    this.bd = aq.a(var25.a.a) / 2;
                                    if (this.ca == 4 || this.ca == 2) {
                                        var24 = 3;
                                    }

                                    boolean var26 = false;
                                    boolean var28 = false;
                                    int var27 = this.o[var24][this.Direction > 2 ? 2 : this.Direction][this.ce] / 3 * this.bd;
                                    int var29 = this.o[var24][this.Direction > 2 ? 2 : this.Direction][this.ce] % 3 * this.be;
                                    var1.a(var25.a, var27, var29, this.bd, this.be, this.Direction > 2 ? 2 : 0, this.aY, this.aZ - this.bj + this.bk, 33);
                                }
                            } else {
//                                System.out.println("Direction.b(): " + this.Direction);

                                if (var17) {
                                    try {
                                        this.e(var1, 0);
                                        if (var19 != null && this.cF != 2) {
                                            var19.i(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Z(), this.Direction == 3 ? 2 : 0);
                                            var19.a(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Z(), this.Direction == 3 ? 2 : 0);
                                        }
                                    } catch (Exception var16) {
                                        var16.printStackTrace();
                                    }
                                }

                                boolean var23 = false;
                                hso_at var6 = g(this.aN);
                                hso_at var7 = g(this.aQ);
                                hso_at var8 = g(this.aT);
                                hso_at var9 = g(this.aU);
                                hso_at var10 = g(this.aV);
                                int var11;
                                if (hso_ft.ai % 6 == 0 && var10 != null) {
                                    if ((var11 = var10.a.c() / 18) == 0) {
                                        var11 = 1;
                                    }

                                    this.t = (byte) ((this.t + 1) % var11);
                                }

                                if (hso_ft.ai % 6 == 0 && var9 != null) {
                                    if ((var11 = var9.a.c() / 18) == 0) {
                                        var11 = 1;
                                    }

                                    this.s = (byte) ((this.s + 1) % var11);
                                }

                                if (hso_ft.ai % 10 == 0 && var6 != null) {
                                    if ((var11 = var6.a.c() / 18) == 0) {
                                        var11 = 1;
                                    }

                                    this.v = (byte) ((this.v + 1) % var11);
                                }

                                if (hso_ft.ai % 6 == 0 && var8 != null) {
                                    if ((var11 = var8.a.c() / 18) == 0) {
                                        var11 = 1;
                                    }

                                    this.r = (byte) ((this.r + 1) % var11);
                                }

                                if (hso_ft.ai % 6 == 0 && var7 != null) {
                                    if ((var11 = var7.a.c() / 18) == 0) {
                                        var11 = 1;
                                    }

                                    this.w = (byte) ((this.w + 1) % var11);
                                }

                                hso_at var31 = g(this.aR);
                                if (hso_ft.ai % 6 == 0 && var31 != null) {
                                    int var12;
                                    if ((var12 = var31.a.c() / 18) == 0) {
                                        var12 = 1;
                                    }

                                    this.x = (byte) ((this.x + 1) % var12);
                                }

                                if (this.Direction != 1 && var6 != null) {
                                    var6.k(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                }

                                hso_at var30 = g(this.aM);
                                int var13;
                                if (hso_ft.ai % 5 == 0 && var30 != null) {
                                    if ((var13 = var30.a.c() / 18) == 0) {
                                        var13 = 1;
                                    }

                                    this.C = (byte) ((this.C + 1) % var13);
                                }

                                if (var10 != null && this.aV != -1) {
                                    var10.m(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.r(), this.Direction == 3 ? 2 : 0);
                                    var10.e(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.r(), this.Direction == 3 ? 2 : 0);
                                }

                                var13 = 0;
                                while (true) {
//                                for (int i = 0; i < n[this.Direction].length; i++) {
//                                    int b = n[this.Direction].length;
                                    if (var13 >= n[this.Direction].length) {

                                        if (this.Direction != 1 && var6 != null) {
                                            var6.c(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                        }

                                        if (this.ee != -1) {
                                            this.l(var1);
                                        }

                                        if (!var17) {
                                            try {
                                                this.e(var1, 0);
                                                if (var19 != null && this.cF != 2) {
                                                    var19.i(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Z(), this.Direction == 3 ? 2 : 0);
                                                    var19.a(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Z(), this.Direction == 3 ? 2 : 0);
                                                }
                                            } catch (Exception var15) {
                                                var15.printStackTrace();
                                            }
                                        }
                                        break;
                                    }

                                    byte var14;
                                    if ((var14 = n[this.Direction][var13]) == -1) {
                                        if (var30 != null) {
                                            var30.l(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                        }
                                    } else {
                                        label1007:
                                        {
                                            if (this.Direction == 1) {
                                                if (var6 != null) {
                                                    var6.k(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                                    var6.c(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                                }

                                                if (var14 == 2 && var30 != null) {
                                                    var30.l(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                                    var30.d(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                                }
                                            } else if (var14 == 4 && var30 != null && this.dU) {
                                                var30.l(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                                var30.d(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                            }

                                            if (var14 != 6 && var14 != 4 || var14 == 6 && this.Direction == 1 && var13 == 7 || var14 == 6 && this.Direction != 1 && var13 == 0 || var14 == 4 && this.Direction != 1) {
                                                if (var14 == 6 && var31 != null && this.aR != -1) {
                                                    var31.p(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.u(), this.Direction == 3 ? 2 : 0);
                                                    var31.h(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.u(), this.Direction == 3 ? 2 : 0);
                                                    break label1007;
                                                }

                                                if (this.aV != -1 && var10 != null && (var14 == 1 || var14 == 0 || var14 == 3 || var14 == 5 || var14 == 2)) {
                                                    break label1007;
                                                }

                                                if (var14 == 1 && this.aT != -1 && var8 != null) {
                                                    var8.m(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.r(), this.Direction == 3 ? 2 : 0);
                                                    var8.e(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.r(), this.Direction == 3 ? 2 : 0);
                                                    break label1007;
                                                }

                                                if (var14 == 0 && this.aU != -1 && var9 != null) {
                                                    var9.m(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.q(), this.Direction == 3 ? 2 : 0);
                                                    var9.e(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.q(), this.Direction == 3 ? 2 : 0);
                                                    break label1007;
                                                }

                                                if (var14 == 5 && this.aQ != -1 && var7 != null) {
                                                    var7.n(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.W(), this.Direction == 3 ? 2 : 0);
                                                    var7.f(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.W(), this.Direction == 3 ? 2 : 0);
                                                    break label1007;
                                                }

                                                if (this.p(var13) >= 0) {
                                                    if (this.ee == -1) {
                                                        if (var14 != 6 || this.Direction != 0 && this.Direction != 2 && this.Direction != 3) {
                                                            hso_ak.d(var14, this.p(var13)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.bw, this.Direction, this.ce);
                                                        } else {
                                                            hso_ak.d(var14, this.p(var13)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.bw, this.Direction, this.ce);
                                                            if (var6 != null) {
                                                                var6.k(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                                                var6.c(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                                            }
                                                        }
                                                    } else if (var13 != 1) {
                                                        if (var14 == 6 && (this.Direction == 0 || this.Direction == 2 || this.Direction == 3)) {
                                                            hso_ak.d(var14, this.p(var13)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.eb - this.bw, this.Direction, this.ce);
                                                            if (var6 != null) {
                                                                var6.k(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                                                var6.c(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.s(), this.Direction == 3 ? 2 : 0);
                                                            }
                                                        } else {
                                                            hso_ak.d(var14, this.p(var13)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.eb - this.bw, this.Direction, this.ce);
                                                        }
                                                    } else {
                                                        this.m(var1);
                                                    }
                                                } else if ((var14 == 0 || var14 == 1 || var14 == 2 || var14 == 4 || var14 == 5) && !var23) {
                                                    var23 = true;
                                                    this.ac();
                                                }
                                            }

                                            if (var14 == 3 && var30 != null && !this.dU && this.Direction != 1) {
                                                var30.l(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                                var30.d(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.Y(), this.Direction == 3 ? 2 : 0);
                                            }
                                        }
                                    }

                                    ++var13;
                                }
                            }
                        } else {
                            for (int om = 0; om < n[this.Direction].length; ++om) {
                                byte e = n[this.Direction][om];
                                if ((e = n[this.Direction][e]) == 4 && this.p(e) >= 0) {
                                    if (this.ee == -1) {
                                        hso_ak.d(e, this.p(e)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.bw, this.Direction, this.ce);
                                    } else if (e != 1) {
                                        hso_ak.d(e, this.p(e)).a(var1, this.aY, this.aZ - this.bo - this.bj + this.bk - this.eb - this.bw, this.Direction, this.ce);
                                    } else {
                                        this.m(var1);
                                    }
                                }
                            }
                        }

                        if ((var18 = g(this.aP)) != null) {
                            var18.b(var1, this.aY + this.ec, this.aZ - this.bo - this.bj + this.bk - this.bw + this.ed, this.X(), this.Direction == 3 ? 2 : 0);
                        }
                    }

                    if (!this.aa()) {
                        this.f(var1, this.aY, this.aZ);
                        if (!this.dQ && this.cV && this.bj == 0) {
                            var3 = 1;
                            if (this.Direction == 2) {
                                var3 += 2;
                            } else if (this.Direction == 3) {
                                var3 -= 2;
                            }

                            var1.a(dd, 0, (this.cF != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, this.aY + var3, this.aZ - this.bo - 2 + this.bk, 3);
                        }
                    }
                }

                MainObject var21 = this;
                int var20 = 0;

                boolean var10000;
                while (true) {
                    if (var20 >= var21.k.c()) {
                        var10000 = true;
                        break;
                    }

                    if ((var22 = (hso_at) var21.k.a(var20)) != null && var22.b()) {
                        var10000 = false;
                        break;
                    }

                    ++var20;
                }

                if (!var10000) {
                    this.e(var1, this.aY, this.aZ);
                    this.f(var1, this.aY, this.aZ);
                }

                if (!this.aa() && (var18 = g(this.aS)) != null) {
                    if (hso_ft.ai % 5 == 0 && var18 != null) {
                        if ((var20 = var18.a.c()) == 0) {
                            var20 = 1;
                        }

                        this.y = (byte) ((this.y + 1) % var20);
                    }

                    var18.o(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.y, 0);
                    var18.g(var1, this.aY, this.aZ + (this.ee != -1 ? -this.eb : 0) + this.bk, this.y, 0);
                }

                if (!this.aa()) {
                    if ((hso_cf.I || this != GameScreen.h) && var2 != -1) {
                        this.a(var1, var2);
                    }

                    this.e(var1);
                    this.k(var1);
                    this.d(var1, this.aY, this.aZ);
                    if (this.br > 0) {
                        this.h(var1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d(mGraphics var1, int var2, int var3) {
        if (this.c_() || cg != 1) {
            for (int var4 = 0; var4 < this.du.c(); ++var4) {
                hso_dq var5;
                if ((var5 = (hso_dq) this.du.a(var4)) != null) {
                    var5.a(var1, var2, var3 - this.bq);
                }
            }

        }
    }

    public final void e(mGraphics var1, int var2, int var3) {
        if (this.c_() || cg != 1) {
            int var4;
            if ((var4 = this.k.c()) > 0) {
                for (int var5 = 0; var5 < var4; ++var5) {
                    hso_at var6;
                    if ((var6 = (hso_at) this.k.a(var5)) != null) {
                        var6.a(var1, var2, var3);
                    }
                }
            }

        }
    }

    public final void f(mGraphics var1, int var2, int var3) {
        if (this.c_() || cg != 1) {
            int var4;
            if ((var4 = this.k.c()) > 0) {
                for (int var5 = 0; var5 < var4; ++var5) {
                    hso_at var6;
                    if ((var6 = (hso_at) this.k.a(var5)) != null) {
                        var6.b(var1, var2, var3);
                    }
                }
            }

        }
    }

    public final void g(mGraphics var1, int var2, int var3) {
        if (this.c_() || cg != 1) {
            for (int var4 = 0; var4 < this.dv.c(); ++var4) {
                hso_dq var5;
                if ((var5 = (hso_dq) this.dv.a(var4)) != null) {
                    var5.a(var1, var2, var3 - this.bq);
                }
            }

        }
    }

    private boolean aa() {
        for (int var1 = 0; var1 < this.k.c(); ++var1) {
            hso_at var2;
            if ((var2 = (hso_at) this.k.a(var1)) != null && var2.c()) {
                return true;
            }
        }

        return false;
    }

    private boolean ab() {
        int var1;
        int var2;
        if ((var1 = this.du.c()) > 0) {
            for (var2 = 0; var2 < var1; ++var2) {
                hso_dq var3;
                if ((var3 = (hso_dq) this.du.a(var2)) != null && var3.d()) {
                    return false;
                }
            }
        }

        for (var2 = 0; var2 < this.k.c(); ++var2) {
            hso_at var4;
            if ((var4 = (hso_at) this.k.a(var2)) != null && var4.b()) {
                return false;
            }
        }

        return true;
    }

    public final boolean H() {
        if (!this.dK && !this.dJ && !this.dL && !this.bI) {
            int var1;
            int var2;
            hso_dq var3;
            if ((var1 = this.du.c()) > 0) {
                for (var2 = 0; var2 < var1; ++var2) {
                    if ((var3 = (hso_dq) this.du.a(var2)) != null && var3.c()) {
                        return false;
                    }
                }
            }

            if (this.dv.c() > 0) {
                for (var2 = 0; var2 < this.dv.c(); ++var2) {
                    if ((var3 = (hso_dq) this.dv.a(var2)) != null && var3.c()) {
                        return false;
                    }
                }
            }

            for (var2 = 0; var2 < this.k.c(); ++var2) {
                hso_at var4;
                if ((var4 = (hso_at) this.k.a(var2)) != null && var4.a()) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public final void h(mGraphics var1) {
        if (this.bI && this.cF != 4) {
            if (this.bI && this.aX != null) {
                this.aX.a(var1);
            }

        }
    }

    private int p(int var1) {
        switch (n[this.Direction][var1]) {
            case 0:
                if (this.dF[1] != -1) {
                    return this.dF[1];
                }

                return this.bZ;
            case 1:
                if (this.dF[0] != -1) {
                    return this.dF[0];
                }

                return this.bY;
            case 2:
                if (this.dF.length > 6) {
                    if (this.dF[6] != -1) {
                        return this.dF[6];
                    }

                    return this.bX;
                }

                return this.bX;
            case 3:
                MainObject var5 = this;
                boolean var10000;
                if (Player.E == null) {
                    var10000 = false;
                } else if (this.dF[2] != -1) {
                    var10000 = false;
                } else {
                    label72:
                    {
                        int var2 = Player.E.length;

                        for (int var3 = 0; var3 < var2; ++var3) {
                            if (Player.E[var3] == var5.cb) {
                                var10000 = true;
                                break label72;
                            }
                        }

                        var10000 = false;
                    }
                }

                if (var10000) {
                    return -1;
                } else {
                    return this.dF[2] != -1 ? this.dF[2] : this.bW;
                }
            case 4:
                return this.ca;
            case 5:
                if (this.dF[5] != -1) {
                    return this.dF[5];
                }

                return this.cb;
            case 6:
                if (this.dF[4] != -1) {
                    return this.dF[4];
                }

                return this.cc;
            default:
                return -1;
        }
    }

    private int q(int var1) {
        switch (n[this.Direction][var1]) {
            case 0:
                return this.bx;
            case 1:
                return this.bx;
            case 2:
                return 0;
            case 3:
                return -1;
            case 4:
                return this.bx + 8;
            case 5:
                return this.bx;
            case 6:
                return -1;
            default:
                return -1;
        }
    }

    private void ac() {
        if ((hso_ft.aj - this.bV) / 1000L > 60L) {
            Service.a().a((short) this.ct);
            this.bV = hso_ft.aj;
        }

    }

    public final void b(mGraphics var1, int var2, int var3, int var4) {
        int var5 = hso_ft.ai / 6 % 2;
        hso_at var6 = g(this.aN);
        hso_at var7 = g(this.aQ);
        hso_at var8 = g(this.aT);
        hso_at var9 = g(this.aR);
        hso_at var10 = g(this.aU);
        int var11;
        if (hso_ft.ai % 6 == 0 && var9 != null) {
            if ((var11 = var9.a.c() / 18) == 0) {
                var11 = 1;
            }

            this.x = (byte) ((this.x + 1) % var11);
        }

        if (hso_ft.ai % 10 == 0 && var6 != null) {
            if ((var11 = var6.a.c() / 18) == 0) {
                var11 = 1;
            }

            this.v = (byte) ((this.v + 1) % var11);
        }

        if (var6 != null && this.cc == -1 && this.dF[4] == -1) {
            var6.k(var1, var2, var3, this.m(var5), 0);
            var6.c(var1, var2, var3, this.m(var5), 0);
        }

        hso_at var16 = g(this.aM);
        hso_at var12 = g(this.aO);
        int var13;
        if (hso_ft.ai % 5 == 0 && var16 != null) {
            if ((var13 = var16.a.c() / 18) == 0) {
                var13 = 1;
            }

            this.C = (byte) ((this.C + 1) % var13);
        }

        if (hso_ft.ai % 6 == 0 && var7 != null) {
            if ((var13 = var7.a.c() / 18) == 0) {
                var13 = 1;
            }

            this.w = (byte) ((this.w + 1) % var13);
        }

        if (hso_ft.ai % 6 == 0 && var8 != null) {
            if ((var13 = var8.a.c() / 18) == 0) {
                var13 = 1;
            }

            this.r = (byte) ((this.r + 1) % var13);
        }

        if (hso_ft.ai % 6 == 0 && var10 != null) {
            if ((var13 = var10.a.c() / 18) == 0) {
                var13 = 1;
            }

            this.s = (byte) ((this.s + 1) % var13);
        }

        if (var12 != null) {
            var12.i(var1, var2, var3, this.o(var5), 0);
            var12.a(var1, var2, var3, this.o(var5), 0);
        }

        var1.a(db, var2 + 1, var3 + 2, 3);
        hso_am var14;
        if ((var13 = this.dX) != -1 && hso_ak.c(this.bx, var13, 0) != null && (var14 = hso_ak.c(this.bx, var13, 0)).a != null) {
            var1.a(var14.a, var14.c[var4][0], 0, var14.c[var4][1], var14.d, 0, var2 + var14.b[var4][var5][0], var3 + var14.b[var4][var5][1], 0);
        }

        this.e(var1, var2, var3);

        for (int var15 = 0; var15 < n[this.Direction].length - 1; ++var15) {
            byte var17;
            if ((var17 = n[0][var15]) == -1 && var16 != null) {
                var16.l(var1, var2, var3 + 2, this.n(var5), 0);
            }

            if (var17 == 5 && this.aQ != -1 && var7 != null) {
                var7.n(var1, var2, var3 + 2, this.b(var5), 0);
                var7.f(var1, var2, var3 + 2, this.b(var5), 0);
            } else if (var17 == 1 && this.aT != -1 && var8 != null) {
                var8.m(var1, var2, var3 + 2, this.k(var5), 0);
                var8.e(var1, var2, var3 + 2, this.k(var5), 0);
            } else if (var17 == 0 && this.aU != -1 && var10 != null) {
                var10.m(var1, var2, var3 + 2, this.l(var5), 0);
                var10.e(var1, var2, var3 + 2, this.l(var5), 0);
            } else if (var17 == 6 && this.aR != -1 && var9 != null) {
                var9.p(var1, var2, var3 + 2, this.a(var5), 0);
                var9.h(var1, var2, var3 + 2, this.a(var5), 0);
            } else if (this.p(var15) > -1) {
                if (var17 != 6 || this.cc == -1 && this.dF[4] == -1) {
                    hso_ak.d(var17, this.p(var15)).a(var1, var2, var3, var4, var5);
                } else {
                    hso_ak.d(var17, this.p(var15)).a(var1, var2, var3, var4, var5);
                    if (var6 != null) {
                        var6.k(var1, var2, var3, this.m(var5), 0);
                        var6.c(var1, var2, var3, this.m(var5), 0);
                    }
                }
            }
        }

        if (var16 != null) {
            var16.l(var1, var2, var3 + 2, this.n(var5), 0);
            var16.d(var1, var2, var3 + 2, this.n(var5), 0);
        }

        this.f(var1, var2, var3);
    }

    public final void c(mGraphics var1, int var2, int var3, int var4) {
        int var5 = hso_ft.ai / 6 % 2;
        var1.a(db, var2 + 1, var3 + 2, 3);
        int var6;
        hso_am var8;
        if ((var6 = this.dX) != -1 && hso_ak.c(this.bx, var6, 0) != null && (var8 = hso_ak.c(this.bx, var6, 0)).a != null) {
            var1.a(var8.a, var8.c[this.Direction][0], 0, var8.c[this.Direction][1], var8.d, 0, var2 + var8.b[this.Direction][var5][0], var3 + var8.b[this.Direction][var5][1], 0);
        }

        for (var6 = 0; var6 < n[this.Direction].length - 1; ++var6) {
            byte var7;
            if ((var7 = n[this.Direction][var6]) == 5) {
                if (var4 != -1) {
                    hso_ak.d(5, var4).a(var1, var2, var3, 0, var5);
                }
            } else if (this.p(var6) > -1) {
                hso_ak.d(var7, this.p(var6)).a(var1, var2, var3, 0, var5);
            }
        }

    }

    public void b(mGraphics var1, int var2, int var3) {
    }

    public void a(mGraphics var1, int var2) {
        if (!hso_cf.i()) {
            String var3 = this.cB;
            hso_o var4 = null;
            var4 = hso_fl.a(var2);
            boolean var7 = true;
            byte var5 = 0;
            if (this.cy == 1) {
                if (this.cv > 0) {
                    var7 = false;
                }

                var5 = 5;
            }

            if (this.aS != -1) {
                var7 = false;
            }

            int var6 = 18;
            if (hso_cf.I) {
                var6 = 12;
            }

            if (this.di == 7) {
                var6 += 8;
            }

            if (this.cp && hso_cf.I) {
                var6 += 6;
            }

            if (var7) {
                var4.a(var1, var3, this.aY, this.aZ - this.bo - this.bj + this.bk - (this.bI ? 5 : 0) - this.be - var6 - this.eb - this.bw, 2, false);
            }

            if (this.cu == 0 && this.cy == 1 && var7 && !this.cM) {
                var6 += 10;
                var4.a(var1, hso_df.fs, this.aY, this.aZ - this.bo - this.bj + this.bk - (this.bI ? 5 : 0) - this.be - var6 - this.eb - this.bw, 2, false);
            }

            if (this.cu == 2 && this.dk == null) {
                hso_cg.aF.b(this.cn, this.aY - 6, this.aZ - this.bo - this.bj + this.bk - this.be - var6 - 18 - 4 + hso_ft.ai / 2 % 4, 0, var1);
            }

            var2 = 0;
            if (Player.N != null && this.cX || this.bG || this.di == 7) {
                int var8 = 44;
                if (this.cu == 2 || this.di == 7) {
                    var8 = this.be + 5;
                }

                var1.a(-8714722);
                var1.c(this.aY - 20, this.aZ - this.bo - this.bj + this.bk - var8 - var6, 40, 3);
                var1.a(-579511);
                var1.c(this.aY - 20, this.aZ - this.bo - this.bj + this.bk - var8 - var6, 40 * this.br / this.bs, 3);
                var2 += 5;
            }

            if (this.cO != null && this.cy != 1) {
                this.a(var1, this.aY - 1, this.aZ - this.bo - this.bj + this.bk - this.be - var6 - 8 - var2 - this.eb - this.bw, 2);
                var2 += 16;
            }

            if (this.cv >= 0 && this.cu == 0 && !this.E()) {
                var2 += 59;
                hso_cg.aE.b(this.cv * 3 + hso_ft.ai / 3 % 3, this.aY, this.aZ - this.bj + this.bk - this.bo - var2 + 18 - var6 + var5 - this.eb - this.bw, 0, 33, var1);
            }

        }
    }

    public final void h(mGraphics var1, int var2, int var3) {
        String var4 = this.c(" - ");
        if (this.cO != null) {
            var2 += 16;
            this.a(var1, 58, var3 + 6, -1);
        }

        hso_o.f.a(var1, var4, var2, var3 - this.eb - this.bw, 0, true);
    }

    public void b(mGraphics var1) {
        if (!hso_cf.i()) {
            if (GameScreen.h != null && !hso_cf.I) {
                MainObject var2;
                int var3 = (var2 = GameScreen.h).aY;
                int var4 = var2.aZ - var2.bo - var2.bj + var2.bk - var2.be;
                int var5 = 18;
                boolean var6 = true;
                byte var7 = 0;
                if (this.cy == 1) {
                    if (this.cv > 0) {
                        var6 = false;
                    }

                    var7 = 5;
                }

                hso_o var8 = hso_o.f;
                if (this.cu == 3) {
                    var8 = hso_fl.b(this.cs);
                }

                if (this.cu == 2 && this.dk == null) {
                    hso_cg.aF.b(this.cn, var3 - 6, var4 - 18 - 18 - 4 + hso_ft.ai / 2 % 4, 0, var1);
                }

                if (this.aS == -1) {
                    var8.a(var1, this.cB, var3, var4 - 18 - this.eb - (this.bI ? 5 : 0) - this.bw, 2, false);
                }

                int var9 = 0;
                if (this.cu == 0 && this.cy == 1 && var6 && !this.cM) {
                    var5 += 10;
                    var9 += 10;
                    var8.a(var1, hso_df.fs, var3, var4 - 28 - this.eb - (this.bI ? 5 : 0) - this.bw, 2, false);
                }

                if (Player.N != null && var2.cX) {
                    var9 = 5;
                }

                if (this.cO != null && var2.cy != 1) {
                    this.a(var1, var3, var4 - var5 - 8 - var9 - this.eb - this.bw, 2);
                    var9 += 16;
                }

                if (var2.cv >= 0 && var2.cu == 0 && !this.E()) {
                    var9 += 20;
                    hso_cg.aE.b(this.cv * 3 + hso_ft.ai / 3 % 3, var3, var4 - var9 + var7 - this.eb - this.bw, 0, 33, var1);
                }
            }

        }
    }

    public static void i(mGraphics var0) {
        if (GameScreen.h != null && !hso_cf.I && GameScreen.h.cu != 10) {
            MainObject var1 = GameScreen.h;
            byte var2 = 1;
            if (var1.cu == 1) {
                if (!var1.dR) {
                    return;
                }

                var2 = 4;
                if (var1.di == 3 || var1.di == 5 || var1.di == 10 || var1.di == 8) {
                    var2 = 12;
                }
            }

            if (ch == 0) {
                ch = aq.a(da.a);
                ci = aq.b(da.a) / 10;
            }

            var0.a(da, 0, g * ci, ch, ci, 0, var1.aY, var1.aZ - var1.be - var1.bj + var1.bk - var2 - hso_ft.ai % 7 - var1.eb - var1.bw, 3);
            if (Player.N != null && var1.cX || var1.bG) {
                int var3 = 64;
                if (var1.cu == 2) {
                    var3 = var1.be + 23;
                }

                var0.a(-8714722);
                var0.c(var1.aY - 20, var1.aZ - var3 - var1.eb - var1.bw, 40, 3);
                var0.a(-579511);
                var0.c(var1.aY - 20, var1.aZ - var3 - var1.eb - var1.bw, 40 * var1.br / var1.bs, 3);
            }
        }

    }

    public final void I() {
        int var1;
        if ((var1 = this.k.c()) > 0) {
            for (int var2 = 0; var2 < var1; ++var2) {
                hso_at var3;
                if ((var3 = (hso_at) this.k.a(var2)) != null) {
                    var3.d();
                    if (var3.b) {
                        this.k.d(var3);
                    }
                }
            }
        }

    }

    public void a() {
        this.aY += this.bb;
        this.aZ += this.bc;
        if (this.j) {
            this.bw += this.d;
            this.d += this.p;
            if (this.bw > this.q) {
                this.bw = this.q;
                this.d = -5;
                this.p = -2;
            }

            if (this.bw <= 0) {
                this.bw = 0;
                this.j = false;
            }
        }

        int var5;
        if (this.dZ && this.dZ) {
            if (this.ct == GameScreen.f.ct) {
                hso_ft.n();
                this.cN = null;
            }

            this.bb = 0;
            this.bc = 0;
            boolean var4 = false;
            var5 = this.ea - this.aZ >> 1;
            this.aZ += var5;
            if (var5 <= 0) {
                this.aZ = this.ea;
                var4 = true;
            }

            if (var4) {
                this.bb = 0;
                this.bc = 0;
                this.cF = 0;
                this.bf = this.aY;
                this.bg = this.aZ;
                this.ea = this.aZ;
                this.ea = this.aZ;
                this.cj = this.aY;
                this.ck = this.aZ;
                this.dZ = false;
            } else {
                if (hso_ft.p.a(this.aY, this.aZ) == 2 && !this.ad()) {
                    this.cV = true;
                    this.bk = 3;
                }

                if (hso_ft.ai % 2 == 0) {
                    GameScreen.a(9, this.aY, this.aZ);
                    GameScreen.a(46, this.aY, this.aZ - 2);
                }
            }
        }

        if (this.a > 0) {
            this.bj = this.a;
            ++this.b;
            if (this.b > 30) {
                this.a = 30;
            }
        } else {
            if (this.bj > 0) {
                this.c -= 2;
                this.bj += this.c;
            }

            if (this.bj < 0) {
                this.bj = -this.bj;
                this.c = 0;
            }

            if (this.bj < 3) {
                this.bj = 0;
            }

            this.b = 0;
        }

        if (this.dk != null) {
            this.dk.d(this.aY, this.aZ - this.be - 30);
            if ((this != GameScreen.f || GameScreen.f.M == null) && this.dk.b()) {
                this.dk = null;
            }
        }

        if (this.bF) {
            ++this.bR;
            if (this.bR > 40) {
                this.bR = 0;
                this.bF = false;
            }
        }

        int var15;
        for (int var1 = 0; var1 < this.df.c(); ++var1) {
            hso_ei var2;
            hso_ei var3;
            if (!(var3 = var2 = (hso_ei) this.df.a(var1)).g) {
                if (var3.h == 4) {
                    if (hso_ak.f(2) == 0) {
                        hso_en var14;
                        (var14 = new hso_en()).a = hso_ak.g(16);
                        var14.b = hso_ak.g(10);
                        if (var3.i == 3) {
                            var14.i = hso_ak.g(3);
                            var14.j = hso_ak.g(2);
                        }

                        var3.n.a(var14);
                    }

                    for (var15 = 0; var15 < var3.n.c(); ++var15) {
                        hso_en var16;
                        (var16 = (hso_en) var3.n.a(var15)).a();
                        if (var16.n >= 3) {
                            var3.n.d(var16);
                            --var15;
                        }
                    }
                } else if (var3.h == 9) {
                    if (hso_ft.ai % 2 == 0) {
                        hso_ei var6 = var3;
                        int var7 = hso_ak.c(1, 4);

                        for (int var8 = 0; var8 < var7; ++var8) {
                            hso_ej var19 = new hso_ej();
                            var5 = hso_ak.c(3, 12);
                            boolean var9 = false;
                            byte var21;
                            if (var5 <= 5) {
                                var19.h = 16;
                                var21 = 2;
                            } else if (var5 <= 8) {
                                var21 = 4;
                                var19.h = 12;
                            } else {
                                var21 = 5;
                                var19.h = 9;
                            }

                            var19.j = hso_ak.f(5) == 0;
                            int var10 = var6.c + hso_ak.g(15);
                            int var11 = var6.d - hso_ak.g(10);
                            var19.a(var10, var11, var10, var11 - var5, 0, -var21, var19.j);
                            var19.i = hso_ak.f(3);
                            var6.n.a(var19);
                        }
                    }

                    for (var15 = 0; var15 < var3.n.c(); ++var15) {
                        hso_ej var17;
                        (var17 = (hso_ej) var3.n.a(var15)).a();
                        if (var17.g >= var17.h) {
                            var3.n.d(var17);
                            --var15;
                        }
                    }
                } else if (var3.h > 10 && var3.h < 15) {
                    ++var3.k;
                    if (var3.k > var3.j.length - 1) {
                        var3.k = 0;
                    }

                    if (var3.f - hso_dw.a() < 0L) {
                        var3.g = true;
                    }
                }

                if (hso_ft.ai % 10 == 0 && var3.h < 11 && hso_ft.aj - var3.a > (long) var3.e) {
                    var3.g = true;
                }

                if (var3.m != null) {
                    var3.l = var3.m;
                    var3.m = null;
                }
            }

            if (var2.g) {
                this.df.d(var2);
                --var1;
            }
        }

        if (this.dy) {
            ++this.dz;
            if (this.dz > 40) {
                this.dy = false;
                this.dz = 0;
            }
        }

        if (this.cE != null) {
            this.a(this.cE, true);
            this.cE = null;
        }

        if (this.cO != null && this.cO.q) {
            this.cO = null;
        }

        if (this.dK) {
            this.bb = 0;
            this.bc = 0;
            this.bf = this.aY;
            this.bg = this.aZ;
            this.ca = 0;
            if (this.dj || this.bM - hso_dw.a() < 0L) {
                this.dK = false;
                this.bM = hso_dw.a();
            }
        }

        if (this.dJ) {
            this.bb = 0;
            this.bc = 0;
            this.bf = this.aY;
            this.bg = this.aZ;
            if (this.dj || this.bN - hso_dw.a() < 0L) {
                this.dJ = false;
                this.bN = hso_dw.a();
            }
        }

        if (this.bI) {
            this.bb = 0;
            this.bc = 0;
            this.bf = this.aY;
            this.bg = this.aZ;
            if (this.aX == null) {
                this.aX = new hso_dq(51, this.aY, this.aZ, 0, 0, 0, 0);
            }

            if (this.aX != null) {
                this.aX.a();
            }

            if (this.dj || this.bQ - hso_dw.a() < 0L) {
                this.bI = false;
                this.bQ = hso_dw.a();
                GameScreen.a(15, this.aY, this.aZ);
                this.aX = null;
            }
        }

        if (this.bH) {
            this.bb = 0;
            this.bc = 0;
            this.bf = this.aY;
            this.bg = this.aZ;
            if (this.dj || this.bL - hso_dw.a() < 0L) {
                this.bH = false;
                this.bL = hso_dw.a();
            }
        }

        if (this.dL) {
            this.bb = 0;
            this.bc = 0;
            this.bf = this.aY;
            this.bg = this.aZ;
            if (this.dj || this.bO - hso_dw.a() < 0L) {
                this.dL = false;
                this.bO = hso_dw.a();
            }
        }

        if (this.dM && (this.dj || (this.bP - hso_dw.a()) / 1000L <= 0L)) {
            this.dM = false;
            this.bP = hso_dw.a();
        }

        if (this.i_() && this.Direction != 0) {
            this.Direction = 0;
        }

        if (this.ee == -1 && this.eb != 0) {
            this.af();
        }

        this.d_();
        MainObject var12 = this;

        hso_dq var18;
        for (var15 = 0; var15 < var12.du.c(); ++var15) {
            if ((var18 = (hso_dq) var12.du.a(var15)) != null) {
                var18.a();
                if (var18.a) {
                    var12.du.d(var18);
                }
            }
        }

        for (var15 = 0; var15 < var12.dv.c(); ++var15) {
            if ((var18 = (hso_dq) var12.dv.a(var15)) != null) {
                var18.a();
                if (var18.a) {
                    var12.dv.d(var18);
                }
            }
        }

        if (GameScreen.h != null) {
            if (GameScreen.h.bs > 0 && !hso_cf.I && GameScreen.h.cu != 10) {
                long var13 = (long) GameScreen.h.br;
                long var20 = 10L;
                if ((g = (byte) ((int) (var13 * var20 / (long) GameScreen.h.bs))) > 9) {
                    g = 9;
                }
            }

            g = (byte) hso_ak.e(g - 9);
            if (GameScreen.h.cu == 3 || GameScreen.h.cu == 4) {
                g = 0;
            }
        }

        if (hso_ft.ai % 2 == 0) {
            ++this.O;
        }

        if (this.O > 4) {
            this.O = 0;
        }

        ++this.L;
        if (this.L < this.P) {
            if (this.eh[0] == -1) {
                if (this.K != null) {
                    this.K = null;
                }

                if (this.O != 0) {
                    this.O = 0;
                }
            } else {
                this.K = ei[this.eh[0]];
            }
        } else if (this.L >= this.P << 1 && this.L < this.P * 3) {
            if (this.eh[1] == -1) {
                if (this.K != null) {
                    this.K = null;
                }

                if (this.O != 0) {
                    this.O = 0;
                }
            } else {
                this.K = ei[this.eh[1]];
            }
        } else if (this.L >= this.P << 2 && this.L < this.P * 5) {
            if (this.eh[2] == -1) {
                if (this.K != null) {
                    this.K = null;
                }

                if (this.O != 0) {
                    this.O = 0;
                }
            } else {
                this.K = ei[this.eh[2]];
            }
        } else if (this.L >= this.P * 6) {
            this.L = 0;
            if (this.K != null) {
                this.K = null;
            }

            if (this.O != 0) {
                this.O = 0;
            }
        } else {
            if (this.K != null) {
                this.K = null;
            }

            if (this.O != 0) {
                this.O = 0;
            }
        }

        if (this.eh[0] != -1 && this.K == ei[this.eh[0]]) {
            this.M = this.R[this.eh[0]][this.Direction];
            if (this.ce == 1) {
                this.N = this.S[this.eh[0]][this.Direction] + 1;
            } else {
                this.N = this.S[this.eh[0]][this.Direction];
            }
        }

        if (this.eh[1] != -1 && this.K == ei[this.eh[1]]) {
            this.M = this.R[this.eh[1]][this.Direction];
            if (this.ce == 1) {
                this.N = this.S[this.eh[1]][this.Direction] + 1;
            } else {
                this.N = this.S[this.eh[1]][this.Direction];
            }
        }

        if (this.eh[2] != -1 && this.K == ei[this.eh[2]]) {
            this.M = this.R[this.eh[2]][this.Direction];
            if (this.ce == 1) {
                this.N = this.S[this.eh[2]][this.Direction] + 1;
                return;
            }

            this.N = this.S[this.eh[2]][this.Direction];
        }

    }

    public final void J() {
        if (this.cF == 4) {
            if (this.ee != -1) {
                this.ee = -1;
            }

            if (this.h == 0) {
                if (hso_ak.f(20) == 0) {
                    this.h = 1;
                }
            } else if (hso_ak.f(3) == 0) {
                this.h = 0;
            }

            this.bI = false;
            this.aX = null;
            if (!hso_ft.B && hso_ak.f(50) == 0) {
                GameScreen.a(69, this.ct, this.cu, this.ct, this.cu, 0, 0);
                if (hso_ak.f(10) == 0) {
                    GameScreen.a(69, this.ct, this.cu, this.ct, this.cu, 0, 0);
                }
            }

        } else {
            switch (this.cF) {
                case 0:
                    ++this.ba;
                    if (this.ba > this.f.length - 1) {
                        this.ba = 0;
                    }

                    this.ce = this.f[this.ba];
                    this.A = this.ce;
                    return;
                case 1:
                    ++this.ba;
                    if (this.aP != -1) {
                        if (this.ba > B.length - 1) {
                            this.ba = 0;
                        }
                    } else if (this.ba > this.cf.length - 1) {
                        this.ba = 0;
                    }

                    if (this.bb == 0 && this.bc == 0 && this.cN == null) {
                        this.cF = 0;
                        hso_ak.f(4);
                        this.ba = 0;
                    }

                    if (this.aP != -1) {
                        this.A = B[this.ba];
                        this.ce = 3;
                    } else {
                        this.ce = this.cf[this.ba];
                    }

                    if (this.bK && !this.cV && hso_ft.ai % 5 == 0) {
                        GameScreen.a(56, this.aY, this.aZ, this.Direction, (byte) -1);
                        return;
                    }
                    break;
                case 2:
                    if (this.dg != null) {
                        this.dh.c();
                        this.dg.a(this);
                    }

                    ++this.E;
                    if (this.E > this.f.length - 1) {
                        this.E = 0;
                    }

                    this.A = this.f[this.E];
            }

        }
    }

    public final void K() {
        if (this.br < this.bv) {
            this.ca = 3;
        } else {
            if (this.ca == 3) {
                this.ca = this.bU;
            }

            if (this.ca != -1) {
                ++this.bT;
                if (this.ca >= 3 && this.ca != 4 && this.ca != 5) {
                    if (this.bT >= this.e) {
                        this.bT = 0;
                        this.ca = 0;
                    }
                } else {
                    if (this.ca == 4 && this.bT > 2) {
                        this.ca = 5;
                    }

                    if (this.ca == 2) {
                        if (this.bT >= 8) {
                            this.bT = 0;
                            this.ca = this.bU;
                            if (this.bx < 2) {
                                this.e = hso_ak.c(30, 80);
                                return;
                            }

                            this.e = hso_ak.c(10, 60);
                            return;
                        }
                    } else if (this.bT >= 3) {
                        this.bT = 0;
                        this.ca = this.bU;
                        if (this.bx < 2) {
                            this.e = hso_ak.c(30, 80);
                            return;
                        }

                        this.e = hso_ak.c(10, 60);
                        return;
                    }
                }
            }

        }
    }

    public void h() {
        if (this.H() && !this.bH) {
            if (!this.dZ) {
                if (hso_ak.e(this.aY - this.bf) > this.bi + this.Q()) {
                    this.bc = 0;
                    this.cF = 1;
                    if (hso_ak.e(this.aY - this.bf) > this.bi + this.Q()) {
                        if (this.aY > this.bf) {
                            this.bb = -(this.bi + this.Q());
                            this.cH = this.Direction;
                            this.Direction = 2;
                        } else {
                            this.bb = this.bi + this.Q();
                            this.cH = this.Direction;
                            this.Direction = 3;
                        }
                    } else {
                        this.bb = this.bf - this.aY;
                    }
                } else if (hso_ak.e(this.aZ - this.bg) > this.bi + this.Q()) {
                    this.bb = 0;
                    this.cF = 1;
                    if (hso_ak.e(this.aZ - this.bg) > this.bi + this.Q()) {
                        if (this.aZ > this.bg) {
                            this.bc = -(this.bi + this.Q());
                            this.cH = this.Direction;
                            this.Direction = 1;
                        } else {
                            this.bc = this.bi + this.Q();
                            this.cH = this.Direction;
                            this.Direction = 0;
                        }
                    } else {
                        this.bc = this.bg - this.aZ;
                    }
                } else {
                    if (this.dC) {
                        GameScreen.a(43, this.aY, this.aZ);
                        hso_cs.t = 10;
                        this.cL = true;
                    }

                    this.bb = 0;
                    this.bc = 0;
                }
            }
        } else {
            this.bf = this.aY;
            this.bg = this.aZ;
        }
    }

    public static MainObject a(int var0, byte var1) {
        for (int var2 = GameScreen.i.c() - 1; var2 >= 0; --var2) {
            MainObject var3;
            if ((var3 = (MainObject) GameScreen.i.a(var2)) != null) {
                if (var1 == 2 && var3.j() == var0) {
                    return var3;
                }

                if (var3.cu == var1 && var3.ct == var0) {
                    return var3;
                }
            }
        }

        return null;
    }

    public static MainObject e(int var0, int var1) {
        for (int var2 = 0; var2 < GameScreen.i.c(); ++var2) {
            MainObject var3;
            if ((var3 = (MainObject) GameScreen.i.a(var2)).cu == var1 && var3.ct == var0) {
                return var3;
            }
        }

        return null;
    }

    public static int c(int var0, int var1, int var2, int var3) {
        return f(var0 - var2, var1 - var3);
    }

    public static int f(int var0, int var1) {
        return hso_ak.h(var0 * var0 + var1 * var1);
    }

    private boolean ad() {
        if (this.ee != -1 && ai.a != null) {
            return hso_ai.a[this.ee] == 1;
        } else {
            return false;
        }
    }

    public final void a(boolean var1) {
        if (!this.dZ) {
            int var2;
            int var9;
            if ((var9 = hso_ft.p.a(this.aY + this.bb, this.aZ + this.bc)) == 2 && !this.ad()) {
                if (this.bc != 0) {
                    if (this.bc > 0) {
                        this.bc = this.bi + this.Q() - 1;
                    } else {
                        this.bc = -(this.bi + this.Q()) + 1;
                    }
                }

                if (this.bb != 0) {
                    if (this.bb > 0) {
                        this.bb = this.bi + this.Q() - 1;
                    } else {
                        this.bb = -(this.bi + this.Q()) + 1;
                    }
                }

                this.cV = true;
                this.bk = 3;
            } else {
                this.cV = false;
                this.bk = 0;
                if (var9 == 1) {
                    var2 = hso_ft.p.b(this.aY + this.bb, this.aZ + this.bc);
                    if (this.bc != 0) {
                        if (var2 % hso_ft.p.e > 0 && (hso_ft.p.a(this.aY + this.bb - hso_cs.l, this.aZ + this.bc) == 0
                                || hso_ft.p.a(this.aY + this.bb - hso_cs.l, this.aZ + this.bc) == 2)
                                && (hso_ft.p.a(this.aY + this.bb - hso_cs.l, this.aZ) == 0
                                || hso_ft.p.a(this.aY + this.bb - hso_cs.l, this.aZ) == 2)) {
                            this.bb = -(this.bi + this.Q());
                            this.Direction = 2;
                            this.bc = 0;
                        } else if (var2 % hso_ft.p.e >= hso_ft.p.e - 1
                                || hso_ft.p.a(this.aY + this.bb + hso_cs.l, this.aZ + this.bc) != 0
                                && hso_ft.p.a(this.aY + this.bb + hso_cs.l, this.aZ + this.bc) != 2
                                || hso_ft.p.a(this.aY + this.bb + hso_cs.l, this.aZ) != 0
                                && hso_ft.p.a(this.aY + this.bb + hso_cs.l, this.aZ) != 2) {
                            this.bc = 0;
                        } else {
                            this.bb = this.bi + this.Q();
                            this.Direction = 3;
                            this.bc = 0;
                        }
                    } else if (this.bb != 0) {
                        if (hso_ft.p.a(this.aY + this.bb, this.aZ + this.bc - hso_cs.l) != 0
                                && hso_ft.p.a(this.aY + this.bb, this.aZ + this.bc - hso_cs.l) != 2
                                || hso_ft.p.a(this.aY, this.aZ + this.bc - hso_cs.l) != 0
                                && hso_ft.p.a(this.aY, this.aZ + this.bc - hso_cs.l) != 2) {
                            if ((hso_ft.p.a(this.aY + this.bb, this.aZ + this.bc + hso_cs.l) == 0
                                    || hso_ft.p.a(this.aY + this.bb, this.aZ + this.bc + hso_cs.l) == 2)
                                    && (hso_ft.p.a(this.aY, this.aZ + this.bc + hso_cs.l) == 0
                                    || hso_ft.p.a(this.aY, this.aZ + this.bc + hso_cs.l) == 2)) {
                                this.bc = this.bi + this.Q();
                                this.Direction = 0;
                            }
                        } else {
                            this.bc = -(this.bi + this.Q());
                            this.Direction = 1;
                        }

                        this.bb = 0;
                    }

                    if (this.bb == 0 && this.bc == 0) {
                        this.cF = 0;
                        hso_ak.f(4);
                    }
                }

                if (hso_ft.p.a(this.aY, this.aZ) == 2 && !this.ad()) {
                    this.cV = true;
                    this.bk = 3;
                }
            }

            if (this.bb == 0 && this.bc == 0 && ((var9 = hso_ft.p.a(this.aY, this.aZ)) == 1 || var9 == -1)) {
                var9 = 24;
                var2 = this.aY * 1000;
                int var3 = this.aZ * 1000;
                int var6 = 0;
                boolean var7 = false;

                do {
                    var7 = false;
                    int var4 = var2 + hso_ak.b(var6) * var9;
                    int var5 = var3 + hso_ak.a(var6) * var9;
                    int var8;
                    if (var4 >= 0 && var5 >= 0 && ((var8 = hso_ft.p.a(var4 / 1000, var5 / 1000)) == 0 || var8 == 2)) {
                        this.aY = var4 / 1000;
                        this.aZ = var5 / 1000;
                        this.N();
                        var7 = true;
                    }

                    var6 += 44;
                    if (var6 >= 360) {
                        var6 = 0;
                        var9 += 24;
                    }
                } while (!var7);
            }

        }
    }

    public final void h(int var1) {
        switch (this.Direction) {
            case 0:
                this.bc = var1;
                this.bb = 0;
                return;
            case 1:
                this.bc = -var1;
                this.bb = 0;
                return;
            case 2:
                this.bc = 0;
                this.bb = -var1;
                return;
            case 3:
                this.bc = 0;
                this.bb = var1;
            default:
        }
    }

    public void c(int var1) {
        int var2;
        if (hso_ak.e(var2 = hso_ak.g(3)) > 1) {
            --var1;
        }

        switch (this.Direction) {
            case 0:
                this.bc = var1;
                this.bb = var2;
                break;
            case 1:
                this.bc = -var1;
                this.bb = var2;
                break;
            case 2:
                this.bc = var2;
                this.bb = -var1;
                break;
            case 3:
                this.bc = var2;
                this.bb = var1;
        }

        if (this.bb == 0 && hso_ak.f(3) == 0) {
            this.dV = 0;
            this.cF = 0;
            this.bb = 0;
            this.bc = 0;
        }

        if (this.bb > 0) {
            this.Direction = 3;
        } else {
            this.Direction = 2;
        }
    }

    public static boolean d(int var0, int var1, int var2, int var3) {
        return var0 >= hso_p.d.a - var2 && var0 <= hso_p.d.a + hso_ft.W + var2 && var1 >= hso_p.d.b - var3 / 2 && var1 <= hso_p.d.b + hso_ft.X + var3 * 3 / 2;
    }

    public static boolean c(MainObject var0) {
        return var0.aY >= hso_p.d.a - var0.bd && var0.aY <= hso_p.d.a + hso_ft.W + var0.bd && var0.aZ >= hso_p.d.b - var0.be && var0.aZ <= hso_p.d.b + hso_ft.X + var0.be * 3 / 2;
    }

    public final void L() {
        if (this.aY != this.bf || this.aZ != this.bg) {
            if (!this.dZ) {
                int var1;
                if (this.cM && ((var1 = hso_ft.p.a(this.aY + this.bb, this.aZ + this.bc)) == 1 || var1 == -1)) {
                    this.cV = false;
                    this.bk = 0;
                    this.bb = 0;
                    this.bc = 0;
                    this.aY = this.bf;
                    this.aZ = this.bg;
                    ++this.cJ;
                    if (this.cJ >= 10) {
                        this.cJ = 25;
                    }

                    GameScreen.a(35, this.aY, this.aZ - 20);
                }

                if (hso_ak.e(this.aY - this.bf) <= this.bi + this.Q() && hso_ak.e(this.aZ - this.bg) <= this.bi + this.Q()) {
                    if (this.cF != 2 && this.cF != 3 && this.cF != 4) {
                        this.bl = this.aY;
                        this.bm = this.aZ;
                        this.bf = this.aY;
                        this.bg = this.aZ;
                        this.bb = 0;
                        this.bc = 0;
                        this.cF = 0;
                        hso_ak.f(4);
                    }

                } else {
                    this.p_();
                }
            }
        }
    }

    public void z() {
        if (!this.dZ) {
            this.bc = 0;
            this.cF = 1;
            if (hso_ak.e(this.aY - this.bf) >= this.bi + this.Q()) {
                if (this.aY >= this.bf) {
                    this.bb = -(this.bi + this.Q());
                    this.Direction = 2;
                } else {
                    this.bb = this.bi + this.Q();
                    this.Direction = 3;
                }
            } else {
                this.bb = this.bf - this.aY;
            }
        }
    }

    public void A() {
        if (!this.dZ) {
            this.bb = 0;
            this.cF = 1;
            if (hso_ak.e(this.aZ - this.bg) >= this.bi + this.Q()) {
                if (this.aZ > this.bg) {
                    this.bc = -(this.bi + this.Q());
                    this.Direction = 1;
                } else {
                    this.bc = this.bi + this.Q();
                    this.Direction = 0;
                }
            } else {
                this.bc = this.bg - this.aZ;
            }
        }
    }

    public void p_() {
        if (!this.dZ) {
            if (this.i) {
                if (hso_ak.e(this.aY - this.bf) >= this.bi + this.Q()) {
                    this.z();
                } else if (hso_ak.e(this.aZ - this.bg) >= this.bi + this.Q()) {
                    this.A();
                } else {
                    this.bb = 0;
                    this.bc = 0;
                }
            } else if (hso_ak.e(this.aZ - this.bg) >= this.bi + this.Q()) {
                this.A();
            } else if (hso_ak.e(this.aY - this.bf) >= this.bi + this.Q()) {
                this.z();
            } else {
                this.bb = 0;
                this.bc = 0;
            }
        }
    }

    public final void g(int var1, int var2) {
        if (!this.dZ && !this.bH && !this.bI) {
            if ((var2 == 1 || var2 == -1) && this.cJ < 12) {
                this.cV = false;
                this.bk = 0;
                this.bb = 0;
                this.bc = 0;
                this.i = !this.i;
                ++this.cJ;
                if (this.cJ >= 10) {
                    this.cJ = 25;
                    return;
                }
            } else {
                this.cV = false;
                this.bk = 0;
                if (this.cJ > 0) {
                    --this.cJ;
                }

                if (var2 == 2 && !this.ad()) {
                    this.cV = true;
                    this.bk = 3;
                    if (this.bc != 0) {
                        if (this.bc > 0) {
                            this.bc = this.bi + this.Q() - var1;
                        } else {
                            this.bc = -(this.bi + this.Q()) + var1;
                        }
                    }

                    if (this.bb != 0) {
                        if (this.bb > 0) {
                            this.bb = this.bi + this.Q() - var1;
                            return;
                        }

                        this.bb = -(this.bi + this.Q()) + var1;
                    }
                }
            }

        }
    }

    private void d(mGraphics var1, int var2) {
        byte var4 = this.bx;
        if (this.dW >= 0) {
            hso_ap var3;
            if ((var3 = hso_ak.b[var4][0][0]) == null) {
                hso_ak.b(var4, 0, 0);
                return;
            }

            if (this.cF == 2 && this.dW >= 4) {
                if (this.dW < var3.a[this.Direction].length && var3.g != null) {
                    var1.a(var3.g, var3.a[this.Direction][this.dW], var3.b[this.Direction][this.dW], var3.e[this.Direction][this.dW], var3.f[this.Direction][this.dW], 0, this.aY + var3.c[this.Direction][this.dW], 0 + this.aZ - this.bo + var3.d[this.Direction][this.dW] - this.bj + this.bk - this.eb - this.bw, 0);
                }
            } else {
                if (this.dW > 1) {
                    this.dW = 0;
                }

                if (this.dW < 0) {
                    this.dW = 0;
                }

                if (hso_ak.c(var4, 0, 0) != null) {
                    hso_am var5 = hso_ak.c(var4, 0, 0);
                    int var6;
                    if ((var6 = this.ce) > 2) {
                        var6 = 2;
                    }

                    if (var5.a != null) {
                        var1.a(var5.a, var5.c[this.Direction][0], 0, var5.c[this.Direction][1], var5.d, 0, this.aY + var5.b[this.Direction][var6][0], this.aZ - this.bo + var5.b[this.Direction][var6][1] - this.bj + this.bk - this.eb - this.bw, 0);
                        this.n(var1);
                        return;
                    }
                }
            }
        }

    }

    private void e(mGraphics var1, int var2) {
        byte var5 = this.bx;
        if (this.dW >= 0) {
            hso_ap var3;
            if ((var3 = hso_ak.b[var5][0][0]) == null) {
                hso_ak.b(var5, 0, 0);
                return;
            }

            int var4 = this.dX;
            if (this.cF == 2 && this.dW >= 4) {
                if (this.dW < var3.a[this.Direction].length && var3.g != null) {
                    var1.a(var3.g, var3.a[this.Direction][this.dW], var3.b[this.Direction][this.dW], var3.e[this.Direction][this.dW], var3.f[this.Direction][this.dW], 0, this.aY + var3.c[this.Direction][this.dW], 0 + this.aZ - this.bo + var3.d[this.Direction][this.dW] - this.bj + this.bk - this.eb - this.bw, 0);
                }
            } else {
                if (this.dW > 1) {
                    this.dW = 0;
                }

                if (this.dW < 0) {
                    this.dW = 0;
                }

                if (var4 != -1 && hso_ak.c(var5, var4, 0) != null) {
                    hso_am var6 = hso_ak.c(var5, var4, 0);
                    int var7;
                    if ((var7 = this.ce) > 2) {
                        var7 = 2;
                    }

                    if (var6.a != null) {
                        var1.a(var6.a, var6.c[this.Direction][0], 0, var6.c[this.Direction][1], var6.d, 0, this.aY + var6.b[this.Direction][var7][0], this.aZ - this.bo + var6.b[this.Direction][var7][1] - this.bj + this.bk - this.eb - this.bw, 0);
                        this.n(var1);
                        return;
                    }
                }
            }
        }

    }

    public final void M() {
        this.bf = this.aY;
        this.bg = this.aZ;
        this.bb = 0;
        this.bc = 0;
    }

    public void t() {
        this.ba = 0;
        this.cF = 2;
        this.cP = 0;
        this.bb = 0;
        this.bc = 0;
    }

    public static void a(hso_au var0, int var1, int var2) {
        MainObject var7;
        if ((var7 = a(var1, (byte) 0)) != null) {
            byte var3 = 5;
            byte var4 = 0;
            if (var0 != null) {
                int var5 = 0;
                int var6 = 0;
                if (var0.di != 7 && var7 != null) {
                    var5 = var0.aY - var7.aY << 1;

                    for (var6 = var0.aZ - var7.aZ << 1; f(var5, var6) > 20; var6 = (var6 << 1) / 3) {
                        var5 = (var5 << 1) / 3;
                    }

                    if (var2 == 1) {
                        var5 <<= 1;
                        var6 <<= 1;
                    } else if (var2 == 2) {
                        while (f(var5, var6) > 16) {
                            var5 = (var5 << 1) / 3;
                            var6 = (var6 << 1) / 3;
                        }

                        var3 = 20;
                        var4 = 18;
                    }
                }

                var0.b(var5, var6, var3, var4);
            }

        }
    }

    public void k() {
    }

    public final void a(String var1, boolean var2) {
        if (this.dk == null) {
            this.dk = new hso_cj();
        }

        this.dk.a(var1, true);
        this.dk.d(this.aY, this.aZ - this.be - 30);
    }

    public final void N() {
        this.bb = this.bc = 0;
        this.bf = this.aY;
        this.bg = this.aZ;
        if (this.cF != 2 && this.cF != 4) {
            this.cF = 0;
            this.dW = 0;
        }

    }

    public final void O() {
        this.bb = this.bc = 0;
        if (this.cF == 1) {
            this.cF = 0;
        }

    }

    public static void a(MainObject var0, MainObject var1) {
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
//        var0.Direction = var4;
        var0.setDirection(var4, "public static void a(MainObject var0, MainObject var1)", MainObject.class);
    }

    public final void h(int var1, int var2) {
        for (int var3 = 0; var3 < this.df.c(); ++var3) {
            hso_ei var4;
            if ((var4 = (hso_ei) this.df.a(var3)) != null && var4.h == var1) {
                long var6 = (long) var2;
                var4.f = hso_dw.a() + var6 * 1000L;
                return;
            }
        }

        hso_ei var8 = new hso_ei(var1, var2);
        this.df.a(var8);
    }

    public final void b(int var1, int var2, int var3) {
        hso_ei var4;
        if ((var4 = hso_ei.a(var1, var3)) != null) {
            var4.a = hso_ft.aj;
            var4.e = var2;
        } else {
            var4 = new hso_ei(var1, var2, var3);
            this.df.a(var4);
        }
    }

    public final void i(int var1) {
        this.ca = 1;
        this.bT = 0;
    }

    public final hso_es P() {
        hso_es var1 = new hso_es("MainObject vec");

        for (int var2 = 0; var2 < GameScreen.i.c(); ++var2) {
            MainObject var3;
            if ((var3 = (MainObject) GameScreen.i.a(var2)) != null && var3 != GameScreen.f && var3 != this && var3.cu == 0 && c(this.aY, this.aZ, var3.aY, var3.aZ - var3.be / 2) <= 30) {
                var1.a(var3);
            }
        }

        return var1;
    }

    public final void i(int var1, int var2) {
        this.bf = var1;
        this.bg = var2;
        var1 = this.bf - this.aY;
        if ((var2 = this.bg - this.aZ) == 0) {
            var2 = 1;
        }

        if (var1 == 0) {
            var1 = 1;
        }

        int var3;
        if ((var3 = f(var1, var2) / (this.bi + this.Q())) == 0) {
            var3 = 1;
        }

        this.bb = var1 / var3;
        this.bc = var2 / var3;
        if (hso_ak.e(this.bb) > hso_ak.e(var1)) {
            this.bb = var1;
        }

        if (hso_ak.e(this.bc) > hso_ak.e(var2)) {
            this.bc = var2;
        }

        this.bE = var3;
    }

    public boolean a(MainObject var1) {
        return false;
    }

    public boolean q_() {
        return false;
    }

    public boolean w() {
        return false;
    }

    public boolean i_() {
        return this.dN >= -100 && this.dN < -2;
    }

    public int j() {
        return this.ct;
    }

    public boolean b() {
        return true;
    }

    public boolean j_() {
        return false;
    }

    private void k(mGraphics var1) {
        if (this.dI) {
            ++this.F;
            if (this.F > this.G.length - 1) {
                this.F = 0;
            }

            hso_cg.aH.b(this.G[this.F], this.aY, this.aZ + 5, 0, 33, var1);
        }

    }

    public final int Q() {
        return this.ee == -1 ? 0 : hso_ai.b[this.ee];
    }

    private boolean ae() {
        if (this.ee == -1) {
            return false;
        } else {
            byte[] var1 = hso_ai.c[this.ee];

            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (this.ef == var1[var2] && this.ef != -1) {
                    return true;
                }
            }

            return false;
        }
    }

    public void d_() {
        if (this.ee != -1) {
            hso_at var1 = g(this.aP);
            if (hso_ft.ai % 5 == 0 && var1 != null) {
                int var2;
                if ((var2 = var1.a.c() / 21) == 0) {
                    var2 = 1;
                }

                this.z = (byte) ((this.z + 1) % var2);
            }

            if (this.ee != -1) {
                if (var1 == null) {
                    this.cf = H;
                }

                if (this.cF == 0) {
                    if (this.Direction == 2) {
                        if (this.ce == 1) {
                            this.ef = 1;
                        } else {
                            this.ef = 0;
                        }

                        this.ec = hso_ai.f[this.ee][0];
                        this.ed = hso_ai.g[this.ee][0];
                        this.eb = hso_ai.d[this.ee][0];
                        return;
                    }

                    if (this.Direction == 3) {
                        if (this.ce == 1) {
                            this.ef = 1;
                        } else {
                            this.ef = 0;
                        }

                        this.ec = hso_ai.f[this.ee][2];
                        this.ed = hso_ai.g[this.ee][2];
                        this.eb = hso_ai.d[this.ee][1];
                        return;
                    }

                    if (this.Direction == 1) {
                        if (this.ce == 1) {
                            this.ef = 11;
                        } else {
                            this.ef = 10;
                        }

                        this.ec = hso_ai.f[this.ee][4];
                        this.ed = hso_ai.g[this.ee][4];
                        this.eb = hso_ai.d[this.ee][2];
                        return;
                    }

                    if (this.ce == 1) {
                        this.ef = 6;
                    } else {
                        this.ef = 5;
                    }

                    this.ec = hso_ai.f[this.ee][6];
                    this.ed = hso_ai.g[this.ee][6];
                    this.eb = hso_ai.d[this.ee][3];
                    return;
                }

                if (this.cF == 1) {
                    ++this.eg;
                    switch (this.Direction) {
                        case 2:
                            if (this.eg > hso_ai.h[this.ee].length - 1) {
                                this.eg = 0;
                            }
                            this.ef = hso_ai.h[this.ee][this.eg];
                            this.ec = hso_ai.f[this.ee][1];
                            this.ed = hso_ai.g[this.ee][1];
                            switch (this.ef) {
                                case 3:
                                    this.eb = hso_ai.e[this.ee][0];
                                    break;
                                case 2:
                                    this.eb = hso_ai.e[this.ee][1];
                                    break;
                                default:
                                    this.eb = hso_ai.e[this.ee][2];
                                    break;
                            }
                            if (this.eg == 4 && !this.ad()) {
                                GameScreen.a(55, this.aY + 19, this.aZ - 5, this.Direction, (byte) -1);
                                return;
                            }
                            break;
                        case 3:
                            if (this.eg > hso_ai.h[this.ee].length - 1) {
                                this.eg = 0;
                            }
                            this.ef = hso_ai.h[this.ee][this.eg];
                            this.ec = hso_ai.f[this.ee][3];
                            this.ed = hso_ai.g[this.ee][3];
                            switch (this.ef) {
                                case 3:
                                    this.eb = hso_ai.e[this.ee][3];
                                    break;
                                case 2:
                                    this.eb = hso_ai.e[this.ee][4];
                                    break;
                                default:
                                    this.eb = hso_ai.e[this.ee][5];
                                    break;
                            }
                            if (this.eg == 4 && !this.ad()) {
                                GameScreen.a(55, this.aY - 11, this.aZ - 5, this.Direction, (byte) -1);
                                return;
                            }
                            break;
                        case 1:
                            if (this.eg > hso_ai.j[this.ee].length - 1) {
                                this.eg = 0;
                            }
                            this.ef = hso_ai.j[this.ee][this.eg];
                            this.ec = hso_ai.f[this.ee][5];
                            this.ed = hso_ai.g[this.ee][5];
                            switch (this.ef) {
                                case 13:
                                    this.eb = hso_ai.e[this.ee][6];
                                    break;
                                case 12:
                                    this.eb = hso_ai.e[this.ee][7];
                                    break;
                                default:
                                    this.eb = hso_ai.e[this.ee][8];
                                    break;
                            }
                            if (this.eg == 4 && !this.ad()) {
                                GameScreen.a(55, this.aY - 14, this.aZ - 7, 3, (byte) -1);
                                GameScreen.a(55, this.aY + 16, this.aZ - 7, 2, (byte) -1);
                                return;
                            }
                            break;
                        default:
                            if (this.eg > hso_ai.i[this.ee].length - 1) {
                                this.eg = 0;
                            }
                            this.ef = hso_ai.i[this.ee][this.eg];
                            this.ec = hso_ai.f[this.ee][7];
                            this.ed = hso_ai.g[this.ee][7];
                            switch (this.ef) {
                                case 8:
                                    this.eb = hso_ai.e[this.ee][9];
                                    break;
                                case 7:
                                    this.eb = hso_ai.e[this.ee][10];
                                    break;
                                default:
                                    this.eb = hso_ai.e[this.ee][11];
                                    break;
                            }
                            if (this.eg == 4 && !this.ad()) {
                                GameScreen.a(55, this.aY - 15, this.aZ - 10, 3, (byte) -1);
                                GameScreen.a(55, this.aY + 17, this.aZ - 10, 2, (byte) -1);
                                return;
                            }
                            break;
                    }
                }
            } else {
                this.af();
            }

        }
    }

    private void af() {
        this.cf = I;
        this.eb = 0;
    }

    private void l(mGraphics var1) {
        if (this.aP == -1) {
            if (this.ee != -1) {
                if (!this.bI) {
                    hso_ce var2;
                    if ((var2 = hso_ce.a(this.ee, 3, 5, 0)) != null && this.ae()) {
                        var2.a(this.ef, this.aY + this.ec, this.aZ - this.bo - this.bj + this.bk - this.bw + this.ed, this.Direction > 2 ? 2 : 0, 33, var1);
                    }

                }
            }
        }
    }

    private void m(mGraphics var1) {
        if (this.aP == -1) {
            if (this.ee != -1) {
                if (!this.bI) {
                    hso_ce var2;
                    if ((var2 = hso_ce.a(this.ee, 3, 5, 0)) != null && !this.ae()) {
                        var2.a(this.ef, this.aY + this.ec, this.aZ - this.bo - this.bj + this.bk - this.bw + this.ed, this.Direction > 2 ? 2 : 0, 33, var1);
                    }

                }
            }
        }
    }

    public final void a(short[][] var1) {
        this.J = var1;
        byte var4;
        if ((var4 = this.bx) == 3) {
            var4 = 2;
        } else if (var4 == 2) {
            var4 = 3;
        }

        this.eh = new byte[this.J[var4 + 8].length];

        for (int var2 = 0; var2 < this.J.length; ++var2) {
            for (int var3 = 0; var3 < this.J[var2].length; ++var3) {
                if (this.J[var4 + 8][var3] >= 23 && this.J[var4 + 8][var3] <= 27) {
                    this.eh[var3] = 0;
                } else if (this.J[var4 + 8][var3] >= 28 && this.J[var4 + 8][var3] <= 32) {
                    this.eh[var3] = 1;
                } else {
                    this.eh[var3] = -1;
                }
            }
        }

    }

    private void n(mGraphics var1) {
        if (this.K != null) {
            this.K.c(this.O, this.aY + this.M, this.aZ - this.bo + this.N - this.bj + this.bk - this.eb - this.bw, this.Q[this.Direction], 33, var1);
        }

    }

    public void c(int var1, int var2) {
    }

    public void b(String var1) {
    }

    public void k_() {
    }

    public final void R() {
        if (++dt > 10) {
            dt = 0;
        }

        if (this.bt < this.bu / 10) {
            this.dr = true;
        } else {
            this.dr = false;
        }

        if (this.br < this.bs / 10 && this.br > 0) {
            this.ds = true;
        } else {
            this.ds = false;
        }
    }

    public boolean e_() {
        return false;
    }

    public final void j(mGraphics var1) {
        if (this.dw.c() > 0) {
            for (int var2 = 0; var2 < this.dw.c(); ++var2) {
                hso_aa var3;
                if ((var3 = (hso_aa) this.dw.a(var2)) != null) {
                    var3.a(var1, this.aY, this.aZ);
                }
            }
        }

    }

    public final void S() {
        if (this.dw.c() > 0) {
            for (int var1 = 0; var1 < this.dw.c(); ++var1) {
                hso_aa var2;
                if ((var2 = (hso_aa) this.dw.a(var1)) != null) {
                    var2.a();
                }
            }
        }

    }

    public final void T() {
        this.dw.d();
    }

    public boolean l_() {
        return false;
    }

    public void a(String var1) {
    }

    public final void a(int var1, byte[] var2, int var3, int var4) {
        for (int var5 = 0; var5 < this.k.c(); ++var5) {
            hso_at var6;
            if ((var6 = (hso_at) this.k.a(var5)) != null && var6.f == var1) {
                this.k.d(var6);
            }
        }

        hso_at var7 = new hso_at(var2, (short) var1, var3, var4);
        this.k.a(var7);
    }

    public final void a(int var1, byte[] var2, int var3, int var4, long var5, byte var7) {
        for (int var8 = 0; var8 < this.k.c(); ++var8) {
            hso_at var9;
            if ((var9 = (hso_at) this.k.a(var8)) != null && var9.f == var1) {
                this.k.d(var9);
            }
        }

        hso_at var10 = new hso_at(var2, (short) var1, var3, var4, var5, var7);
        this.k.a(var10);
    }

    public final void b(int var1, byte[] var2, int var3, int var4, long var5, byte var7) {
        for (int var8 = 0; var8 < this.k.c(); ++var8) {
            hso_at var6;
            if ((var6 = (hso_at) this.k.a(var8)) != null && var6.f == var1) {
                this.k.d(var6);
            }
        }

        hso_at var9;
        (var9 = new hso_at(var2, (short) var1, var3, var4, 0L, var7)).h = false;
        var9.i = true;
        this.k.a(var9);
    }

    public final void j(int var1) {
        for (int var2 = 0; var2 < this.k.c(); ++var2) {
            hso_at var3;
            if ((var3 = (hso_at) this.k.a(var2)) != null && var3.f == var1) {
                this.k.d(var3);
            }
        }

    }

    public final int U() {
        return this.be;
    }

    public final int V() {
        return this.Direction;
    }

    public boolean n() {
        return false;
    }

    public void setDirection(int index, String name, Object method) {
        this.Direction = index;
//        System.out.println("Direction(): " + index + " - " + name + "-" + method.getClass().toString());
    }

}
