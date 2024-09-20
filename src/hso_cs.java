
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;


/**
 * 
 * @param cs
 */
public final class hso_cs {
    
    private static hso_es y = new hso_es("LoadMap vecMapItem");
    public static hso_es a = new hso_es("LoadMap vecPointChange");
    public static hso_es b = new hso_es("LoadMap mItemMap");
    public static int[] c = new int[]{5, 4, 1, 0};
    public int d;
    public int e;
    public int f;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    public int g;
    public int h;
    public static byte i = 0;
    private static byte E = 0;
    public static byte j = 1;
    public static int k = -1;
    public static int l = 24;
    public int[] m;
    public int[] n;
    public static int[] o;
    public byte[][] p;
    public static hso_aq q;
    public static hso_aq r;
    public static hso_aq s;
    public static int t = 0;
    public static byte u = 0;
    public static byte v = 10;
    public static byte w = 0;
    private int F;
    private int G;
    private int H;
    private int I;
    public static hso_es x = new hso_es("LoadMap Thacnuoc");
    
    public hso_cs() {
        this.C = hso_ft.W / l + 1;
        this.D = hso_ft.X / l + 1;
        d();
    }
    
    public static boolean a() {
        return GameScreen.aP;
    }
    
    private static void d() {
        try {
            DataInputStream var0;
            short var1 = (var0 = hso_aq.b("/table_item")).readShort();
            
            for (short var2 = 0; var2 < var1; ++var2) {
                short var3 = var0.readShort();
                var0.readByte();
                short var4 = var0.readShort();
                short var5 = var0.readShort();
                byte var6;
                int[][] var7 = hso_dw.a(var6 = var0.readByte(), 2);
                
                for (int var8 = 0; var8 < var6; ++var8) {
                    var7[var8][0] = var0.readByte();
                    var7[var8][1] = var0.readByte();
                }
                
                y.a(new hso_z(var2, var3, var4, var5, var7));
            }
            
        } catch (Exception var9) {
            hso_dw.a("loi load map 1");
            var9.printStackTrace();
        }
    }
    
    public static void a(byte[] var0) {
        try {
            y.d();
            ByteArrayInputStream var10 = new ByteArrayInputStream(var0);
            DataInputStream var11;
            short var1 = (var11 = new DataInputStream(var10)).readShort();
            
            for (short var2 = 0; var2 < var1; ++var2) {
                short var3 = var11.readShort();
                var11.readByte();
                short var4 = var11.readShort();
                short var5 = var11.readShort();
                byte var6;
                int[][] var7 = hso_dw.a(var6 = var11.readByte(), 2);
                
                for (int var8 = 0; var8 < var6; ++var8) {
                    var7[var8][0] = var11.readByte();
                    var7[var8][1] = var11.readByte();
                }
                
                y.a(new hso_z(var2, var3, var4, var5, var7));
            }
            
        } catch (Exception var9) {
        }
    }
    
    public final void b(byte[] var1) {
        try {
            x.d();
            ByteArrayInputStream var6 = new ByteArrayInputStream(var1);
            DataInputStream var2 = new DataInputStream(var6);
            this.e = var2.readByte();
            this.f = var2.readByte();
            byte var7 = var2.readByte();
            if (k != var7) {
                k = var7;
                q = null;
                r = null;
                s = null;
                if ((q = hso_aq.a("/tile" + k + ".png")) == null || q.a == null) {
                    q = a((byte) 100, (short) ((short) k));
                }
                
                if (q == null || q.a == null) {
                    Service.a().d((short) (k + 10400));
                }
                
                if ((r = hso_aq.a("/tilewater" + k + ".png")) == null || r.a == null) {
                    r = a((byte) 102, (short) ((short) k));
                }
                
                if (r == null || r.a == null) {
                    Service.a().d((short) (k + 10500));
                }
                
                if ((s = hso_aq.a("/tile_small" + k + ".png")) == null || s.a == null) {
                    s = a((byte) 101, (short) ((short) k));
                }
                
                if (s == null || s.a == null) {
                    Service.a().d((short) (k + 10600));
                }
                
                DataInputStream var8 = hso_aq.b("/tile_map_info_" + k);
                this.G = var8.read();
                this.F = var8.read();
                if (e()) {
                    switch (k) {
                        case 9:
                            this.G = 127;
                            this.F = 19;
                            this.H = 19;
                            this.I = 26;
                            break;
                        case 10:
                            this.G = 127;
                            this.F = 5;
                            this.H = 4;
                            this.I = 25;
                            break;
                        case 11:
                            this.G = 127;
                            this.F = 21;
                            this.H = 20;
                            this.I = 37;
                            break;
                        case 12:
                            this.G = 127;
                            this.F = 34;
                            this.H = 35;
                            this.I = 44;
                            break;
                        case 13:
                            this.G = 0;
                            this.F = 47;
                            this.H = 0;
                            this.I = 0;
                            break;
                        case 14:
                            this.G = 0;
                            this.F = 26;
                            this.H = 0;
                            this.I = 0;
                            break;
                        case 15:
                            this.G = 0;
                            this.F = 9;
                            this.H = 0;
                            this.I = 0;
                            break;
                        case 16:
                            this.G = 0;
                            this.F = 42;
                            this.H = 0;
                            this.I = 0;
                            break;
                        default:
                            break;
                    }
                }
            }
            
            this.g = this.e * l;
            this.h = this.f * l;
            this.z = this.g - hso_ft.W;
            this.A = this.h - hso_ft.X;
            hso_p.d.a(this.z, this.A, GameScreen.f.aY - hso_ft.Y, GameScreen.f.aZ - hso_ft.Z);
            this.m = new int[this.e * this.f];
            this.n = new int[this.e * this.f];
            this.p = new byte[this.e][this.f];
            this.B = this.e * this.f;
            
            for (int var9 = 0; var9 < this.e * this.f; ++var9) {
                byte var3 = var2.readByte();
                this.m[var9] = var3;
                if (!e()) {
                    if (var3 < this.F && var3 != 0) {
                        if (var3 >= this.G) {
                            this.n[var9] = 2;
                        } else {
                            this.n[var9] = 0;
                        }
                    } else {
                        this.n[var9] = 1;
                    }
                } else {
                    hso_fs var4;
                    if (k == 9) {
                        if (var3 == 27 || var3 == 28 || var3 == 29 || var3 == 30 || var3 == 31) {
                            var4 = new hso_fs(var3 - 27, var9 % this.e * 24, var9 / this.e * 24);
                            x.a(var4);
                        }
                    } else if (k == 10) {
                        if (var3 == 18 || var3 == 19) {
                            var4 = new hso_fs(var3 - 18 + 5, var9 % this.e * 24, var9 / this.e * 24);
                            x.a(var4);
                        }
                    } else if (k == 11 && (var3 == 38 || var3 == 39)) {
                        var4 = new hso_fs(var3 - 38 + 7, var9 % this.e * 24, var9 / this.e * 24);
                        x.a(var4);
                    }
                    
                    if (var3 < this.F && var3 != 0) {
                        this.n[var9] = 0;
                    } else {
                        this.n[var9] = 1;
                    }
                }
            }
            
            i = 0;
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }
    
    public final void c(byte[] var1) {
        try {
            ByteArrayInputStream var10 = new ByteArrayInputStream(var1);
            DataInputStream var11 = new DataInputStream(var10);
            b.d();
            short var2 = var11.readShort();
            
            for (int var3 = 0; var3 < var2; ++var3) {
                hso_z var5;
                if ((var5 = b(var11.readShort())) == null) {
                    var5 = b(85);
                }
                
                hso_v var6 = new hso_v(var5.d, var5.e, var5.f, var5.g, var5.m);
                short var7 = var11.readShort();
                short var8 = var11.readShort();
                if (!hso_ft.B || var5.m.length > 0) {
                    this.a(var7, var8, var5.m);
                    var6.a(var7 * l, var8 * l);
                    b.a(var6);
                }
            }
            
            if (var11.available() > 0 && !hso_ft.B) {
                short var12 = var11.readShort();
                
                for (int var4 = 0; var4 < var12; ++var4) {
                    byte var13 = var11.readByte();
                    String var14 = "";
                    
                    for (int var15 = 0; var15 < var13; ++var15) {
                        var14 = var14 + (char) var11.readByte();
                    }
                    
                    var13 = var11.readByte();
                    String var16 = "";
                    
                    for (int var17 = 0; var17 < var13; ++var17) {
                        var16 = var16 + (char) var11.readByte();
                    }
                    
                    if (!hso_dw.g) {
                        b.a(GameScreen.a(var14, var16));
                    }
                }
            }
            
            hso_ak.b(b);
        } catch (Exception var9) {
            hso_dw.a("loi load map 3");
            var9.printStackTrace();
        }
    }
    
    public final void a(mGraphics var1) {
        try {
            int var2 = hso_p.d.a / l - 1;
            int var3 = hso_p.d.b / l - 1;
            if (var2 < 0) {
                var2 = 0;
            }
            
            if (var3 < 0) {
                var3 = 0;
            }
            
            int var4 = var2 + this.C + 2;
            int var5 = var3 + this.D + 2;
            if (var4 > this.e) {
                var4 = this.e;
            }
            
            if (var5 > this.f) {
                var5 = this.f;
            }
            
            for (var2 = var2; var2 < var4; ++var2) {
                for (int var6 = var3; var6 < var5 && hso_eg.g; ++var6) {
                    int var7 = this.m[var6 * this.e + var2] - 1;
                    if (!e()) {
                        if (var7 >= this.G - 1 && var7 < this.F - 1 && (hso_ft.ai % 14 < 7 && var2 % 2 == 0 || hso_ft.ai % 14 > 7 && var2 % 2 != 0)) {
                            if (r != null && r.a != null) {
                                var1.a(r, (var7 - (this.G - 1)) / 10 * l, (var7 - (this.G - 1)) % 10 * l, l, l, 0, var2 * l, var6 * l, 0);
                            }
                        } else if (var7 > -1 && q != null && q.a != null) {
                            var1.a(q, 0, var7 * l, l, l, 0, var2 * l, var6 * l, 0);
                        }
                    } else if (var7 >= this.H - 1 && var7 < this.I && (hso_ft.ai % 14 < 7 && var2 % 2 == 0 || hso_ft.ai % 14 > 7 && var2 % 2 != 0)) {
                        if (r != null && r.a != null) {
                            var1.a(r, (var7 - (this.H - 1)) / 10 * l, (var7 - (this.H - 1)) % 10 * l, l, l, 0, var2 * l, var6 * l, 0);
                        }
                    } else if (var7 > -1 && q != null && q.a != null) {
                        var1.a(q, 0, var7 * l, l, l, 0, var2 * l, var6 * l, 0);
                    }
                }
            }
            
        } catch (Exception var8) {
            var8.printStackTrace();
        }
    }
    
    public final int a(int var1, int var2) {
        int var3;
        return (var3 = var2 / l * this.e + var1 / l) <= this.B && var1 >= 0 && var1 < this.z + hso_ft.W && var2 >= 0 && var2 < this.A + hso_ft.X ? this.n[var3] : 1;
    }
    
    public final int b(int var1, int var2) {
        return var2 / l * this.e + var1 / l;
    }
    
    private static hso_z b(int var0) {
        for (int var1 = 0; var1 < y.c(); ++var1) {
            hso_z var2;
            if ((var2 = (hso_z) y.a(var1)).d == var0) {
                return var2;
            }
        }
        
        return null;
    }
    
    private void a(int var1, int var2, int[][] var3) {
        try {
            for (int var4 = 0; var4 < var3.length; ++var4) {
                if (var1 + var3[var4][0] >= 0 && var1 + var3[var4][0] < this.e && var2 + var3[var4][1] >= 0 && var2 + var3[var4][1] < this.f) {
                    this.n[(var2 + var3[var4][1]) * this.e + var1 + var3[var4][0]] = 1;
                }
            }
            
        } catch (Exception var5) {
            hso_dw.a("loi load map 4");
            var5.printStackTrace();
        }
    }
    
    public final void a(int var1, int var2, int var3, int var4) {
        if (this.e == 0) {
            this.e = 1;
        }
        
        var1 = this.b(var1, var2);
        
        for (var2 = 0; var2 < var3; ++var2) {
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var1 % this.e - var3 / 2 + var2 >= 0 && var1 % this.e - var3 / 2 + var2 < this.e && var1 / this.e - var4 / 2 + var5 >= 0 && var1 / this.e - var4 / 2 < this.f) {
                    this.n[(var1 / this.e - var4 / 2 + var5) * this.e + var1 % this.e - var3 / 2 + var2] = 1;
                }
            }
        }
        
    }
    
    public final void b(int var1, int var2, int var3, int var4) {
        if (this.e == 0) {
            this.e = 1;
        }
        
        var1 = this.b(var1, var2);
        
        for (var2 = 0; var2 < var3; ++var2) {
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var1 % this.e - var3 / 2 + var2 >= 0 && var1 % this.e - var3 / 2 + var2 < this.e && var1 / this.e - var4 / 2 + var5 >= 0 && var1 / this.e - var4 / 2 < this.f) {
                    this.n[(var1 / this.e - var4 / 2 + var5) * this.e + var1 % this.e + var2] = 1;
                }
            }
        }
        
    }
    
    public static byte b() {
        return (byte) (u + 1);
    }
    
    public static String c() {
        String var0 = null;
        long var1;
        if ((var1 = (GameScreen.T - hso_dw.a()) / 1000L) <= 0L) {
            return "";
        } else {
            long var3 = var1 / 3600L;
            long var5 = var1 / 60L;
            if (var3 > 0L) {
                var0 = var3 + "h" + var1 % 3600L / 60L + "'";
            } else if (var5 > 0L) {
                var0 = var5 + "p" + var1 % 60L + "s";
            } else {
                var0 = var1 + "s";
            }
            
            return GameScreen.S + var0;
        }
    }
    
    private static hso_aq a(byte var0, short var1) {
        hso_aq var2 = new hso_aq();
        Service.a().a(var0, var1);
        return var2;
    }
    
    private static boolean e() {
        return k >= 9;
    }
    
    public static String a(long var0) {
        Object var2 = null;
        long var3;
        if ((var3 = (var0 + 3600000L - hso_dw.a()) / 1000L) <= 0L) {
            return "";
        } else {
            long var5 = var3 / 60L;
            return var5 > 0L ? (var5 < 10L ? (var3 % 60L >= 0L && var3 % 60L < 10L ? "0" + var5 + ":" + "0" + var3 % 60L : "0" + var5 + ":" + var3 % 60L) : (var3 % 60L >= 0L && var3 % 60L < 10L ? var5 + ":" + "0" + var3 % 60L : var5 + ":" + var3 % 60L)) : (var3 < 10L ? "0" + var3 + "s" : var3 + "s");
        }
    }
    
    public static String b(long var0) {
        int var2 = (int) (var0 / 1000L) % 60;
        int var3 = (int) (var0 / 60000L % 60L);
        int var4 = (int) (var0 / 3600000L % 24L);
        return var2 <= 0 && var4 <= 0 && var3 <= 0 ? "0h: 0': 0" : var4 + "h: " + var3 + "': " + var2;
    }
    
    public static String a(long var0, int var2) {
        Object var3 = null;
        long var4;
        if ((var4 = (var0 + (long) (var2 * 1000) - hso_dw.a()) / 1000L) <= 0L) {
            return "";
        } else {
            long var6 = var4 / 60L;
            return var6 > 0L ? (var6 < 10L ? (var4 % 60L >= 0L && var4 % 60L < 10L ? "0" + var6 + ":" + "0" + var4 % 60L : "0" + var6 + ":" + var4 % 60L) : (var4 % 60L >= 0L && var4 % 60L < 10L ? var6 + ":" + "0" + var4 % 60L : var6 + ":" + var4 % 60L)) : (var4 < 10L ? "0" + var4 + "s" : var4 + "s");
        }
    }
    
    public static String a(int var0) {
        int var1 = var0 % 60;
        int var2 = (var0 /= 60) % 60;
        if ((var0 /= 60) > 0) {
            return var0 + ":" + var2;
        } else if (var2 > 0) {
            return var2 + ":" + var1;
        } else {
            return var1 < 10 ? "0:" + var1 : String.valueOf(var1);
        }
    }
}
