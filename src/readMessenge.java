
import com.sun.midp.io.j2me.storage.File;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class readMessenge extends hso_cg {

    private short b;
    private byte c;
    public static byte a = 100;
    private static byte d = 0;
    private static byte e = 1;
    private static byte f = 2;
    private static byte g = 3;
    private static byte h = 4;
    private static byte i = 5;
    private static byte j = 6;
    private static byte k = 7;
    private static byte l = 8;
    private static byte m = 9;
    private static byte n = 10;
    private static byte o = 11;
    private static byte p = 12;
    private static byte q = 13;
    private static byte r = 14;
    private static byte s = 15;
    private static byte t = 16;
    private static byte u = 17;
    private static byte v = 18;
    private static byte w = 19;
    private static byte x = 20;
    private String y = "";
    private String z = "";

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                Service.a().a((byte) 1, this.z, (byte) 0, (short) 0, (int) 0);
                hso_ft.j();
                return;
            case 1:
                Service.a().b((byte) 2, this.y);
                hso_ft.j();
                return;
            case 2:
                hso_ft.j();
                if (var2 >= 0) {
                    Service.a().c(this.b, this.c, (byte) var2);
                    return;
                }
                break;
            case 3:
                if (++MainObject.cr >= MainObject.cq.length - 1) {
                    hso_ft.o.a((hso_es) null, MainObject.cq[MainObject.cq.length - 1], var2, (byte) 2, false, 2);
                    return;
                }

                hso_es var4 = new hso_es("ReadMessenge menu");
                hso_bt var3 = new hso_bt(hso_df.aa, 3, var2, this);
                var4.a(var3);
                hso_ft.o.a(var4, MainObject.cq[MainObject.cr], var2, (byte) 2, false, 2);
                return;
            case 4:
                hso_ft.o.f();
                Service.a().b((byte) 2, (short) 0);
                hso_ft.a(hso_df.aG, new hso_bt(hso_df.Z, -1));
            case 20:
        }

    }

    public static void a(Message var0) {
        try {
            hso_ft.j();
            hso_c.B = 1;
            hso_c.C = var0.reader().readByte();
            hso_c.F = var0.reader().readUTF();
            hso_c.G.d();
            short var1 = var0.reader().readShort();
            byte var3 = var0.reader().readByte();
            if (var1 != -1 && var3 == 7) {
                hso_j var4;
                if ((var4 = hso_bw.b(var1)) != null) {
                    hso_c.l = var4;
                    return;
                }

                (hso_c.l = new hso_j()).O = var1;
                hso_c.l.u = 7;
                return;
            }
        } catch (Exception var2) {
        }

    }

    public static void b(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            String var2 = var0.reader().readUTF().toLowerCase();
            int var3 = var0.reader().readInt();
            int var4 = var0.reader().readInt();
            int var5 = var0.reader().readInt();
            int var6 = var0.reader().readInt();
            byte var7 = var0.reader().readByte();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            byte var10 = var0.reader().readByte();
            if (GameScreen.f == null) {
                GameScreen.f = new Player(var1, (byte) 0, var2.toLowerCase(), 50, 50);
            }

            GameScreen.f.a(var7, var9, (int) var10);
            hso_cz[] var29 = new hso_cz[var7 = var0.reader().readByte()];
            int var31 = 0;

            int var11;
            for (var11 = 0; var11 < GameScreen.f.K.length; ++var11) {
                GameScreen.f.K[var11] = "0";
            }

            for (var11 = 0; var11 < var7; ++var11) {
                if (hso_k.a.equals("1.1.0")) {
                    var29[var11] = new hso_cz(var0.reader().readUnsignedByte(), var0.reader().readUnsignedShort());
                } else {
                    var29[var11] = new hso_cz(var0.reader().readUnsignedByte(), var0.reader().readInt());
                }

                if (var29[var11].a >= 16 && var29[var11].a <= 20) {
                    GameScreen.f.K[var29[var11].a - 16] = hso_j.a(var29[var11].b);
                }

                if (var29[var11].a >= 23 && var29[var11].a <= 26) {
                    ++var31;
                }
            }

            if (var31 == 0) {
                GameScreen.f.L = var29;
            } else {
                GameScreen.f.L = new hso_cz[var7 - var31];
                var31 = 0;

                for (var11 = 0; var11 < var29.length; ++var11) {
                    if (var29[var11].a < 23 || var29[var11].a > 26) {
                        GameScreen.f.L[var31] = new hso_cz(var29[var11].a, var29[var11].b);
                        ++var31;
                    }
                }
            }

            GameScreen.f.by = var0.reader().readShort();
            GameScreen.f.bz = var0.reader().readShort();
            Player.t = var0.reader().readShort();
            Player.u = var0.reader().readShort();

            for (var11 = 0; var11 < Player.v[0].length; ++var11) {
                Player.v[0][var11] = var0.reader().readShort();
            }

            for (var11 = 0; var11 < Player.v[0].length; ++var11) {
                Player.v[1][var11] = var0.reader().readShort();
            }

            Player.I = new int[Player.f];

            for (var11 = 0; var11 < Player.f; ++var11) {
                Player.I[var11] = var0.reader().readByte();
            }

            for (var11 = 0; var11 < Player.f; ++var11) {
                Player.J[var11] = var0.reader().readByte();
            }

            int var28;
            for (var11 = 0; var11 < Player.f; ++var11) {
                var28 = -1;
                boolean var30 = true;
                if (Player.I[var11] > 0) {
                    if (var11 < 9) {
                        for (var31 = 0; var31 < 3; ++var31) {
                            hso_ao var12;
                            if ((var12 = Player.w[Player.d][var31]) != null) {
                                if (var28 == -1) {
                                    if (var12.b == hso_ao.d) {
                                        var28 = var31;
                                        var30 = false;
                                    }
                                } else if (var12.b == 0 && var12.a == var11) {
                                    var28 = -1;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var30 = false;
                }

                if (var28 != -1) {
                    Player.w[Player.d][var28].a(var11, 0, (byte) 0);
                }

                if (var30) {
                    break;
                }
            }

            GameScreen.f.cv = var0.reader().readByte();
            GameScreen.f.cA = var0.reader().readShort();
            hso_fn.G = (byte) ((Player.x = var0.reader().readByte()) / 42);
            short var36;
            if ((var36 = var0.reader().readShort()) >= 0) {
                var28 = var0.reader().readInt();
                GameScreen.f.cO = new hso_em(var28, var36, var0.reader().readUTF(), var0.reader().readByte());
            }

            GameScreen.S = var0.reader().readUTF();
            GameScreen.T = var0.reader().readLong();
            hso_ev.b();
            GameScreen.f.cu = 0;
            GameScreen.f.cB = var2.toLowerCase();
            GameScreen.f.ct = var1;
            GameScreen.f.br = var3;
            if (GameScreen.f.br > 0 && GameScreen.f.cF == 4) {
                GameScreen.f.N();
                GameScreen.f.dW = 0;
                GameScreen.f.cF = 0;
                GameScreen.f.df.d();
                Service.a().a((short) GameScreen.f.aY, (short) GameScreen.f.aZ);
            }

            GameScreen.f.bs = var4;
            GameScreen.f.bv = var4 / 10;
            GameScreen.f.bt = var5;
            GameScreen.f.bu = var6;
            GameScreen.f.bx = var8;
            GameScreen.f.dW = 0;
            if (!Player.k) {
                hso_ff.f.d();
                hso_ff.g.d();
                if (!GameScreen.i.equals(GameScreen.f)) {
                    GameScreen.a((MainObject) GameScreen.f);
                }

                GameScreen.f.p();
                Player.k = true;
                MsgChat.a.d();
                hso_ft.g.a(hso_df.cz, "", hso_df.dO, (byte) 1, false);
                Player.T = new short[0];
                hso_co.a();
                Service.a().g((byte) 59);
                hso_cf.i = 0;
                GameScreen.j.d();
                GameScreen.k.d();
                GameScreen.q.F = null;
                GameScreen.q.G = null;
                GameScreen.q.H = null;
                Player.A = 0;
                if (GameScreen.f.by == 1) {
                    Player.o = -1;
                }

                Service.a().a((byte) 1, (byte) 4, (byte[]) null);
                Service.a().a((byte) 1, (byte) 3, (byte[]) null);
            }

            hso_fl.bi = 0;
            short[] var32 = new short[var7 = var0.reader().readByte()];

            for (var31 = 0; var31 < var7; ++var31) {
                var32[var31] = -1;
                var32[var31] = var0.reader().readShort();
            }

            GameScreen.f.dF = var32;
            hso_ft.K = var0.reader().readByte();

            short var35;
            try {
                var35 = var0.reader().readShort();
            } catch (Exception var23) {
                var35 = -1;
                var23.printStackTrace();
            }

            GameScreen.f.aM = var35;

            try {
                if (var0.reader().readByte() == 1) {
                    GameScreen.f.dU = true;
                } else {
                    GameScreen.f.dU = false;
                }
            } catch (Exception var22) {
            }

            boolean var33 = false;

            short var34;
            try {
                var34 = var0.reader().readShort();
            } catch (Exception var21) {
                var34 = -1;
            }

            GameScreen.f.aN = var34;
            boolean var25 = false;

            try {
                var1 = var0.reader().readShort();
            } catch (Exception var20) {
                var1 = -1;
            }

            GameScreen.f.aO = var1;
            var25 = false;

            try {
                var1 = var0.reader().readShort();
            } catch (Exception var19) {
                var1 = -1;
            }

            GameScreen.f.aP = var1;
            var25 = false;

            try {
                var1 = var0.reader().readShort();
            } catch (Exception var18) {
                var1 = -1;
            }

            GameScreen.f.aQ = var1;
            var1 = -1;

            try {
                var1 = var0.reader().readShort();
            } catch (Exception var17) {
            }

            GameScreen.f.aR = var1;
            boolean var26 = false;

            short var27;
            try {
                var27 = var0.reader().readShort();
            } catch (Exception var16) {
                var27 = -1;
            }

            GameScreen.f.aS = var27;
            var1 = -1;

            try {
                var1 = var0.reader().readShort();
            } catch (Exception var15) {
            }

            GameScreen.f.aT = var1;
            var27 = -1;

            try {
                var27 = var0.reader().readShort();
            } catch (Exception var14) {
            }

            GameScreen.f.aU = var27;
            var1 = -1;

            try {
                var1 = var0.reader().readShort();
            } catch (Exception var13) {
            }

            GameScreen.f.aV = var1;
        } catch (IOException var24) {
            var24.printStackTrace();
        }
    }

    public static void c(Message var0) {
        try {
            while (var0.reader().available() > 0) {
                byte var1 = var0.reader().readByte();
                short var2 = var0.reader().readShort();
                short var3 = var0.reader().readShort();
                short var4 = var0.reader().readShort();
                short var5 = var0.reader().readShort();
                byte var6 = var0.reader().readByte();
                if (hso_eg.g) {
                    MainObject var7;
//                    hso_bm var10;
                    if (var6 != 127) {
                        if ((var7 = MainObject.a(var3, var1)) == null) {
                            switch (var1) {
                                case 1:
                                    hso_au.a(var3, var4, var5, var2);
                                    Service.a().c(var3);
                                    break;
                                case 0:
//                                    (var10 = new hso_bm(var3, var1, "", var4, var5)).Direction = hso_ak.f(4);
                                    hso_bm var10 = new hso_bm(var3, var1, "", var4, var5);
//                                    (var10 = new hso_bm(var3, var1, "", var4, var5));
                                    var10.setDirection(hso_ak.f(4), "public static void c(hso_eo var0)", readMessenge.class);
//                                    System.out.println("hi hi "+hso_ak.f(4));
                                    var10.a((byte[]) null);
                                    GameScreen.a((MainObject) var10);
                                    Service.a().a(var3);
                                    var10.bV = hso_ft.aj;
                                    break;
                                case 2:
//                                    (var10 = new hso_bm(var3, var1, "", var4, var5)).cp = true;
                                    hso_bm other_Players2 = new hso_bm(var3, var1, "", var4, var5);
                                    other_Players2.cp = true;
                                    GameScreen.a((MainObject) other_Players2);
                                    Service.a().b(var3);
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            if (var7.cK) {
                                return;
                            }

                            if (var7 != GameScreen.f) {
                                if (var7.cu == 1) {
                                    var7.bf = var4;
                                    var7.bg = var5;
                                    var7.dD = true;
                                    if (var6 == 126) {
                                        if (var7.dO != 1) {
                                            GameScreen.a(54, var7.aY, var7.aZ - 20);
                                        }

                                        var7.aY = var7.bf;
                                        var7.aZ = var7.bg;
                                        var7.dD = false;
                                        var7.dO = -1;
                                    } else if (var6 == 125) {
                                        var7.dO = 0;
                                    }
                                } else if (var7.cF != 2 && var7.cF != 4 && var7.cz == -1) {
                                    var7.bf = var4;
                                    var7.bg = var5;
                                    if (Player.N != null) {
                                        Player.N.a(var7.cB, var4, var5, var7.br, var7.bs);
                                    }
                                }
                            } else {
                                if (hso_ak.e(GameScreen.f.aY - var4) > 24 || hso_ak.e(GameScreen.f.aZ - var5) > 24) {
                                    Player.m = true;
                                    Player.n = false;
                                    GameScreen.f.bf = GameScreen.f.aY;
                                    GameScreen.f.bg = GameScreen.f.aZ;
                                    GameScreen.f.cl = var4;
                                    GameScreen.f.cm = var5;

                                    try {
                                        GameScreen.f.cN = hso_ft.c.a(var4 / hso_cs.l, var5 / hso_cs.l, GameScreen.f.aY / hso_cs.l, GameScreen.f.aZ / hso_cs.l, (int) 20);
                                    } catch (Exception var8) {
                                        var7.aY = var4;
                                        var7.aZ = var5;
                                        GameScreen.f.cN = null;
                                        Player.m = false;
                                        Player.n = true;
                                    }
                                }

                                if (GameScreen.f.cN == null || GameScreen.f.cN.length >= 20) {
                                    var7.aY = var4;
                                    var7.aZ = var5;
                                    GameScreen.f.cN = null;
                                    Player.m = false;
                                    Player.n = true;
                                }
                            }
                        }
                    } else if (var6 == 127) {
                        if ((var7 = MainObject.a(var3, var1)) != null) {
                            if (var7.cK) {
                                return;
                            }

                            var7.dZ = true;
                            var7.ea = var5;
                        } else if (var1 == 0) {
//                            (var10 = new hso_bm(var3, var1, "", var4, var5)).Direction = hso_ak.f(4);
//                            (var10 = new hso_bm(var3, var1, "", var4, var5)).setDirection(hso_ak.f(4), "public static void c(hso_eo var0) maulon", readMessenge.class);
                            hso_bm other_Players3 = new hso_bm(var3, var1, "", var4, var5);
                            other_Players3.setDirection(hso_ak.f(4), "public static void c(hso_eo var0) maulon", readMessenge.class);
                            other_Players3.a((byte[]) null);
                            GameScreen.a((MainObject) other_Players3);
                            Service.a().a(var3);
                            other_Players3.bV = hso_ft.aj;
                            var7.dZ = true;
                            var7.ea = var5;
                        }
                    }
                }
            }

        } catch (Exception var9) {
        }
    }

    public static void d(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            String var2 = var0.reader().readUTF();
            int var3 = var0.reader().readInt();
            int var4 = var0.reader().readInt();
            short var5 = var0.reader().readShort();
            short var6 = var0.reader().readShort();
            short var7 = var0.reader().readShort();
            var0.reader().readByte();
            var0.reader().readByte();
            var0.reader().readUTF();
            short var8 = var0.reader().readShort();
            MainObject var11;
            if ((var11 = MainObject.a(var1, (byte) 2)) != null && !var11.cK) {
                var11.cB = var2;
                var11.aY = var6;
                var11.aZ = var7;
                var11.bf = var6;
                var11.bg = var7;
                var11.by = var5;
                var11.bs = var3;
                var11.br = var4;
                var11.bv = var3 / 10;
                var11.cS = var8;
                var11.cu = 2;
                byte var12;
                if (var8 != -1) {
                    var12 = var0.reader().readByte();
                    short var16 = var0.reader().readShort();
                    var11.dB = var12;
                    var11.cT = var16;
                } else {
                    var12 = var0.reader().readByte();
                    byte var14 = var0.reader().readByte();
                    byte var15 = var0.reader().readByte();
                    var11.a(var12, var14, (int) var15);
                    byte[] var13 = new byte[12];

                    for (var3 = 0; var3 < var13.length; ++var3) {
                        var13[var3] = -1;
                    }

                    var14 = var0.reader().readByte();

                    for (var4 = 0; var4 < var14; ++var4) {
                        byte var17 = var0.reader().readByte();
                        byte var20 = var0.reader().readByte();
                        var13[var17] = var20;
                    }

                    var11.a(var13);
                    short var18;
                    if ((var18 = var0.reader().readShort()) != -1) {
                        int var19 = var0.reader().readInt();
                        String var21 = var0.reader().readUTF();
                        byte var10 = var0.reader().readByte();
                        var11.cO = new hso_em(var19, var18, var21, var10);
                    } else {
                        var11.cO = null;
                    }
                }
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }

    public static void e(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            String var2 = var0.reader().readUTF().toLowerCase();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            byte var5 = var0.reader().readByte();
            byte var6 = var0.reader().readByte();
            byte var7 = var0.reader().readByte();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            short var10 = var0.reader().readShort();
            int var11 = var0.reader().readInt();
            int var12 = var0.reader().readInt();
            byte var13 = var0.reader().readByte();
            short var14 = var0.reader().readShort();
            MainObject var28;
            if ((var28 = MainObject.a(var1, (byte) 0)) != null && !var28.cK) {
                if (var6 == -126 && var2.endsWith(",")) {
                    var28.cM = true;
                    var2 = var2.substring(0, var2.length() - 1);
                }

                var28.cB = var2;
                var28.bf = var3;
                var28.bg = var4;
                var28.bx = var5;
                var28.dW = 0;
                var28.by = var10;
                var28.bs = var12;
                var28.br = var11;
                var28.cv = var13;
                var28.bv = var12 / 10;
                var28.cA = var14;
                var28.dN = var6;
                if (var28.i_()) {
                    var28.cC = var28.cB;
                    var28.cD = hso_df.bJ;
                    hso_ex.a(new hso_fk(var28.dN, var3, var4));
                }

                if (var6 == -126) {
                    var28.cy = 1;
                }

                var28.a(var7, var8, (int) var9);
                int var36;
                if (Player.N != null) {
                    MainObject var30 = var28;
                    hso_w var29 = Player.N;

                    for (var36 = 0; var36 < var29.b.c(); ++var36) {
                        if (((hso_aj) var29.b.a(var36)).b.compareTo(var30.cB) == 0) {
                            var30.cX = true;
                            break;
                        }
                    }
                }

                if (var28.br <= 0) {
                    var28.br = 0;
                    var28.bt = 0;
                    var28.N();
                    var28.cF = 4;
                    var28.aW = hso_ft.aj;
                }

                byte[] var31 = new byte[12];
                short[][] var32 = new short[12][];

                for (var36 = 0; var36 < var32.length; ++var36) {
                    var32[var36] = new short[3];
                }

                int var39;
                for (var36 = 0; var36 < var32.length; ++var36) {
                    for (var39 = 0; var39 < var32[var36].length; ++var39) {
                        var32[var36][var39] = -1;
                    }
                }

                for (var36 = 0; var36 < var31.length; ++var36) {
                    var31[var36] = -1;
                }

                byte var42 = var0.reader().readByte();
                var28.T();

                int var44;
                for (var39 = 0; var39 < var42; ++var39) {
                    var6 = var0.reader().readByte();
                    var7 = var0.reader().readByte();
                    var31[var6] = var7;
                    var8 = var0.reader().readByte();

                    for (var44 = 0; var44 < var8; ++var44) {
                        var32[var6][var44] = var0.reader().readShort();
                    }

                    short var45;
                    if ((var45 = var0.reader().readShort()) != -1) {
                        if (var6 == 0) {
                            var28.c(1, var45);
                        } else if (var6 == 2) {
                            var28.c(0, var45);
                        } else if (var6 == 1) {
                            var28.c(2, var45);
                        }
                    }
                }

                var28.a(var31);
                var28.a(var32);
                short var40;
                if ((var40 = var0.reader().readShort()) >= 0) {
                    int var41 = var0.reader().readInt();
                    var28.cO = new hso_em(var41, var40, var0.reader().readUTF(), var0.reader().readByte());
                } else {
                    var28.cO = null;
                }

                if ((var6 = var0.reader().readByte()) >= 0) {
                    var7 = var0.reader().readByte();
                    var8 = var0.reader().readByte();
                    MainObject var46;
                    if ((var46 = GameScreen.b(var28)) != null) {
                        GameScreen.i.d(var46);
                    }

                    hso_s var33;
                    if ((var33 = hso_s.a(var28, var6, var8, var7)) != null) {
                        GameScreen.a((MainObject) var33);
                    }
                }

                short[] var43 = new short[var7 = var0.reader().readByte()];

                for (var44 = 0; var44 < var7; ++var44) {
                    var43[var44] = -1;
                    var43[var44] = var0.reader().readShort();
                }

                var28.dF = var43;

                try {
                    var28.bA = var0.reader().readShort();
                } catch (Exception var26) {
                }

                var9 = var0.reader().readByte();
                boolean var34 = var0.reader().readBoolean();
                var28.bK = var34;
                var28.ee = var9;
                byte var37 = var0.reader().readByte();
                byte var35 = var0.reader().readByte();
                var28.dS = var37;
                var28.dT = var35;
                var34 = false;

                short var38;
                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var25) {
                    var38 = -1;
                }

                var28.aM = var38;

                try {
                    if (var0.reader().readByte() == 1) {
                        var28.dU = true;
                    } else {
                        var28.dU = false;
                    }
                } catch (Exception var24) {
                }

                var34 = false;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var23) {
                    var38 = -1;
                }

                var28.aN = var38;
                var34 = false;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var22) {
                    var38 = -1;
                }

                var28.aO = var38;
                var34 = false;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var21) {
                    var38 = -1;
                }

                var28.aP = var38;
                var34 = false;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var20) {
                    var38 = -1;
                }

                var28.aQ = var38;
                var34 = false;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var19) {
                    var38 = -1;
                }

                var28.aR = var38;
                var34 = false;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var18) {
                    var38 = -1;
                }

                var28.aS = var38;
                var38 = -1;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var17) {
                }

                var28.aT = var38;
                var3 = -1;

                try {
                    var3 = var0.reader().readShort();
                } catch (Exception var16) {
                }

                var28.aU = var3;
                var38 = -1;

                try {
                    var38 = var0.reader().readShort();
                } catch (Exception var15) {
                }

                var28.aV = var38;
            }
        } catch (Exception var27) {
            var27.printStackTrace();
        }
    }

    public static void f(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            int var2 = var0.reader().readUnsignedByte();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            int var5 = var0.reader().readInt();
            int var6 = var0.reader().readInt();
            byte var7 = var0.reader().readByte();
            int var8 = var0.reader().readInt();
            hso_au var18;
            if ((var18 = (hso_au) MainObject.a(var1, (byte) 1)) != null && !var18.cK) {
                var18.by = (short) var2;
                var18.bf = var3;
                var18.bg = var4;
                var18.br = var5;
                var18.bs = var6;
                var18.cW = true;
                var18.a(var2);
                var18.dA = var8;
                if (var8 == -2) {
                    var18.cx = 1;
                }

                if (var8 == -3) {
                    var0.reader().readUTF();
                    Object var19 = null;
                    var18.cx = 2;
                    MainObject.hso_do.d();
                    MainObject.dp = "";
                    GameScreen.h = var18;
                    hso_ft.c(hso_df.dG);
                }

                if (var8 == -4) {
                    var18.cx = 3;
                    var18.H = var0.reader().readShort();
                    var18.I = var0.reader().readShort();
                }

                if (var8 == -5) {
                    var18.cx = 4;
                    var18.H = var0.reader().readShort();
                    var18.I = var0.reader().readShort();
                }

                short var20;
                if ((var20 = var0.reader().readShort()) >= 0) {
                    int var22 = var0.reader().readInt();
                    var18.cO = new hso_em(var22, var20, var0.reader().readUTF(), var0.reader().readByte());
                } else {
                    var18.cO = null;
                }

                var18.dn = new hso_do(var7);

                if (var18.br <= 0) {
                    var18.br = 0;
                    var18.bt = 0;
                    if (var18.cF != 4) {
                        MainObject.a(var18, GameScreen.f.ct, hso_ak.f(3));
                    }
                }

                if (var18.di == 7) {
                    hso_ex.a(var18.ct, (byte) 1);
                    var18.cB = var0.reader().readUTF();
                }

                byte var23 = var0.reader().readByte();
                byte var21 = var0.reader().readByte();
                byte var25 = var0.reader().readByte();
                var18.dE = var23 == 1;
                var18.bi = var21;
                var18.Direction = var25;
                String var24 = var0.reader().readUTF();
                var18.R = var24;
                if (!var24.equals("") || var18.l_()) {
                    var18.d(var21);
                }

                long var15 = var0.reader().readLong();
                var18.cs = var0.reader().readByte();
                var18.a(var15);
                hso_bj.a(var18);
            }
        } catch (Exception var17) {
            hso_dw.a("loi cho nay ne monsterinfo " + var17.toString());
            var17.printStackTrace();
        }
    }

    public static void g(Message var0) {
        try {
            short var4;
            if ((var4 = var0.reader().readShort()) == GameScreen.f.ct) {
                return;
            }

            MainObject var1;
            if ((var1 = MainObject.a(var4, (byte) 0)) != null && !var1.cK) {
                hso_s var2;
                if ((var2 = (hso_s) MainObject.a(var1.ct, (byte) 9)) != null) {
                    GameScreen.a(35, var2.aY, var2.aZ - 20);
                    var2.cL = true;
                }

                GameScreen.a(35, var1.aY, var1.aZ - 20);
                var1.cL = true;
            }

            MainObject var5;
            if ((var5 = MainObject.a(var4, (byte) 1)) != null && !var5.cK) {
                GameScreen.a(35, var5.aY, var5.aZ - 20);
                var5.cL = true;
                return;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void h(Message var0) {
        boolean var1 = false;

        try {
            hso_ft.c.aT = 0;
            hso_ft.c.aW = false;
            GameScreen.q.a = -1;
            GameScreen.q.b = -1;
            hso_eg.g = false;
            if (Player.o > -1) {
                Player.o_();
            }

            if (hso_ft.a != hso_ft.d) {
                hso_ft.d.c();
            }

            GameScreen.k();
            GameScreen.l();
            hso_ft.p.d = var0.reader().readShort();
            GameScreen.q.a(hso_ft.p.d, hso_dw.a(), 30);
            GameScreen.f.aY = var0.reader().readShort() * 24;
            GameScreen.f.aZ = var0.reader().readShort() * 24;
            GameScreen.f.cj = GameScreen.f.aY;
            GameScreen.f.ck = GameScreen.f.aZ;
            GameScreen.f.u();
            GameScreen.f.cN = null;
            GameScreen.f.N();
            if (GameScreen.g != null) {
                GameScreen.g.aY = GameScreen.f.aY;
                GameScreen.g.aZ = GameScreen.f.aZ;
                GameScreen.g.c();
            }

            var0.reader().readShort();
            var0.reader().readUTF();
            short var2 = var0.reader().readShort();
            byte[] var3 = null;
            if (var2 > 0) {
                var3 = new byte[var2];
                var0.reader().read(var3);
            }

            hso_ft.p.b(var3);
            byte var8;
            short var9;
            if ((var8 = var0.reader().readByte()) >= 0) {
                var9 = var0.reader().readShort();
                (hso_ft.y = new hso_dz()).a(var8, var9);
            } else {
                hso_ft.y = null;
            }

            var9 = var0.reader().readShort();
            hso_ft.d.h = null;
            if (var9 > 0) {
                hso_ft.d.h = new byte[var9];
                var0.reader().read(hso_ft.d.h);
                hso_ft.p.c(hso_ft.d.h);
            }

            GameScreen.f.dQ = false;
            if (hso_ft.p.d == 19) {
                GameScreen.q.V = new hso_dq(50, 1080, 96, 0, 0, 1, 0);
            } else if (hso_ft.p.d == 67) {
                GameScreen.q.V = new hso_dq(50, 360, 672, 0, 0, 1, 0);
            }

            var1 = true;
            hso_cs.a.d();
            var8 = var0.reader().readByte();

            for (int var10 = 0; var10 < var8; ++var10) {
                hso_en var4;
                (var4 = new hso_en()).a = var0.reader().readShort();
                var4.b = var0.reader().readShort();
                var4.t = var0.reader().readUTF();
                if (var4.a < 100) {
                    var4.m = 0;
                    var4.k = var4.a - 8;
                    var4.l = var4.b - 18;
                    var4.n = 0;
                    var4.i = -1;
                } else if (var4.a > hso_ft.p.e * hso_cs.l - 100) {
                    var4.m = 1;
                    var4.n = 1;
                    var4.k = var4.a + 8;
                    var4.l = var4.b - 18;
                    var4.i = 1;
                } else if (var4.b < hso_ft.p.e * hso_cs.l / 2) {
                    var4.b -= 10;
                    var4.m = 2;
                    var4.n = 2;
                    var4.k = var4.a;
                    var4.l = var4.b + 10;
                    var4.j = -1;
                } else {
                    var4.m = 3;
                    var4.n = 2;
                    var4.k = var4.a;
                    var4.l = var4.b - 20;
                    var4.j = 1;
                }

                hso_cs.a.a(var4);
            }

            try {
                hso_ft.q.a();
            } catch (Exception var6) {
                var6.printStackTrace();
            }

            byte var11 = var0.reader().readByte();
            hso_cs.u = var0.reader().readByte();
            hso_ft.j();
            hso_ft.m();
            hso_ft.d.b = false;
            if (var11 == 1) {
                hso_ft.d.b = true;
            }

            if ((hso_cs.w = var0.reader().readByte()) == 3) {
                GameScreen.W = true;
            } else {
                GameScreen.W = false;
            }

            hso_eg.g = true;
            hso_ft.J = 0L;
            hso_ft.N = 0L;

            try {
                GameScreen.aP = var0.reader().readBoolean();
                GameScreen.aO = var0.reader().readBoolean();
            } catch (Exception var5) {
                GameScreen.aO = false;
                GameScreen.aP = false;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            if (var1) {
                hso_eg.g = true;
            }

        }
    }

    public final void i(Message var1) {
        try {
            a(var1, (byte) 0, (byte) 1);
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void j(Message var0) {
        MainObject var1 = null;

        try {
            if ((var1 = MainObject.a(var0.reader().readShort(), (byte) 0)) != null && !var1.cK) {
                byte var2;
                byte[] var3 = new byte[var2 = var0.reader().readByte()];

                int var4;
                for (var4 = 0; var4 < var3.length; ++var4) {
                    var3[var4] = -1;
                }

                if (var1 == GameScreen.f) {
                    hso_bw.U.a.clear();
                    if (GameScreen.g != null) {
                        GameScreen.i.d(GameScreen.g);
                    }

                    for (var4 = 0; var4 < var1.eh.length; ++var4) {
                        var1.eh[var4] = -1;
                    }
                }

                boolean var39 = false;
                var1.T();

                byte var9;
                byte var10;
                byte var15;
                byte var16;
                int var18;
                for (int var5 = 0; var5 < var2; ++var5) {
                    byte var6;
                    if ((var6 = var0.reader().readByte()) <= -1) {
                        var3[var5] = -1;
                    } else {
                        String var8 = var0.reader().readUTF();
                        var9 = var0.reader().readByte();
                        var10 = var0.reader().readByte();
                        short var11 = var0.reader().readShort();
                        byte var12 = var0.reader().readByte();
                        byte var13 = var0.reader().readByte();
                        short var14 = var0.reader().readShort();
                        var15 = var0.reader().readByte();
                        var3[var5] = var12;
                        hso_cz[] var17 = new hso_cz[var16 = var0.reader().readByte()];

                        int var19;
                        for (var18 = 0; var18 < var16; ++var18) {
                            var19 = var0.reader().readUnsignedByte();
                            int var20 = var0.reader().readInt();
                            var17[var18] = new hso_cz(var19, var20);
                            if (var6 == 8 && var19 == 67) {
                                var39 = true;
                            }
                        }

                        byte var54 = var0.reader().readByte();
                        hso_j var7 = hso_j.a(var6, var8, var11, var13, var15, var9, 3, var17, var10, false, (short) -1, 0L, var14, (byte) 0, (byte) 0, 0, (byte) 0, var54);
                        if (var1 == GameScreen.f) {
                            hso_bw.U.a("" + var6, var7);
                            if (var7.J.c() > 0) {
                                for (var19 = 0; var19 < var7.J.c(); ++var19) {
                                    hso_dl var55;
                                    if ((var55 = (hso_dl) var7.J.a(var19)).a >= 23 && var55.a <= 27) {
                                        var1.eh[var19] = 0;
                                    } else if (var55.a >= 28 && var55.a <= 32) {
                                        var1.eh[var19] = 1;
                                    } else if (var55.a == -1) {
                                        var1.eh[var19] = -1;
                                    }
                                }
                            }
                        }

                        hso_cz var56;
                        if (var10 == 1) {
                            for (var19 = 0; var19 < var17.length; ++var19) {
                                if ((var56 = var17[var19]).a == 71) {
                                    var1.c(2, var56.b);
                                }
                            }
                        }

                        if (var10 == 0) {
                            for (var19 = 0; var19 < var17.length; ++var19) {
                                if ((var56 = var17[var19]).a == 71) {
                                    var1.c(1, var56.b);
                                }
                            }
                        }

                        if (var10 == 2) {
                            for (var19 = 0; var19 < var17.length; ++var19) {
                                if ((var56 = var17[var19]).a == 71) {
                                    var1.c(0, var56.b);
                                }
                            }
                        }
                    }
                }

                var1.bK = var39;
                byte var43 = var0.reader().readByte();
                (new StringBuffer("petId=")).append(var43).toString();
                byte var44 = 0;
                var9 = 6;
                if (var43 > -1) {
                    String var45 = var0.reader().readUTF();
                    byte var47 = var0.reader().readByte();
                    short var49 = var0.reader().readShort();
                    short var51 = var0.reader().readShort();
                    byte var52 = var0.reader().readByte();
                    var44 = var15 = var0.reader().readByte();
                    var9 = var16 = var0.reader().readByte();
                    byte var53 = var0.reader().readByte();
                    var18 = var0.reader().readInt();
                    short var58 = var0.reader().readShort();
                    short var57 = var0.reader().readShort();
                    short var38 = var0.reader().readShort();
                    short var41 = var0.reader().readShort();
                    short var40 = var0.reader().readShort();
                    short var42 = var0.reader().readShort();
                    short var21 = var0.reader().readShort();
                    byte var22;
                    hso_cz[] var23 = new hso_cz[var22 = var0.reader().readByte()];

                    int var26;
                    for (int var24 = 0; var24 < var22; ++var24) {
                        int var25 = var0.reader().readUnsignedByte();
                        var26 = var0.reader().readInt();
                        int var27 = var0.reader().readInt();
                        var23[var24] = new hso_cz(var25, var26, var27);
                    }

                    hso_ea var59;
                    (var59 = new hso_ea(var43, var45, var52, var53, var47, 9, var23, 14, var49, var52, var16, var15)).a(var18, var58, var38, var41, var40, var42, var57, var21, var51);
                    if (var0.reader().readByte() == 1) {
                        var26 = var0.reader().readInt();
                        String var60 = var0.reader().readUTF();
                        long var35 = Long.parseLong(var60);
                        var59.F = var26;
                        var59.G = var35;
                    }

                    if (var1 == GameScreen.f) {
                        hso_bw.U.a("" + var43, var59);
                    }

                    var3[5] = var52;
                    if (hso_ft.s != null && hso_ft.s.p == 14 && hso_ah.j == 1) {
                        hso_ah.i = var59;
                    }
                }

                var1.b(var3);
                if (var1.equals(GameScreen.f)) {
                    hso_s var46 = null;
                    if (GameScreen.f.cd != -1) {
                        var46 = hso_s.a(GameScreen.f, (short) GameScreen.f.cd, var9, var44);
                    }

                    GameScreen.g = var46;
                    if (var46 != null) {
                        GameScreen.a((MainObject) GameScreen.g);
                    }
                }

                short[] var48 = new short[var10 = var0.reader().readByte()];

                for (int var50 = 0; var50 < var10; ++var50) {
                    var48[var50] = -1;
                    var48[var50] = var0.reader().readShort();
                }

                var1.dF = var48;
            }
        } catch (Exception var37) {
            hso_dw.a("loi char wearing");
            if (GameScreen.f != null) {
                if (var1 != GameScreen.f) {
                    var1.cK = true;
                }

            }
        }
    }

    public static void k(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            short var4;
            MainObject var2 = MainObject.a(var4 = var0.reader().readShort(), (byte) 1);
            if (GameScreen.p.d(1, 2) && var1 == GameScreen.f.ct) {
                ++GameScreen.p.b;
                GameScreen.p.g();
                Player.o = -1;
            }

            if (var2 != null && !var2.cK) {
                if (var2.br != 0) {
                    var2.br = 0;
                }

                var2.dx = 100;
                if (var2.cF != 4 && !var2.dj) {
                    var2.br = 0;
                    if (var2.cx != 0) {
                        var2.cK = true;
                        if (var2.cx == 2) {
                            MainObject.de = null;
                        }
                    } else {
                        MainObject.a((hso_au) ((hso_au) var2), var1, hso_ak.f(3));
                    }

                    if (var1 == GameScreen.f.ct && var2.dA >= 0) {
                        hso_ew.a(var4);
                    }
                } else {
                    if (var2.cx != 0) {
                        var2.cK = true;
                        if (var2.cx == 2) {
                            MainObject.de = null;
                        }
                    }

                    var2.aW = hso_ft.aj;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public static void l(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            byte var3 = var0.reader().readByte();
            byte var4 = var0.reader().readByte();
            hso_es var5 = new hso_es("ReadMessenge vecObjectBeAttacked");

            int var8;
            int var9;
            MainObject var13;
            for (int var6 = 0; var6 < var4; ++var6) {
                short var7 = var0.reader().readShort();
                var8 = var0.reader().readInt();
                var9 = var0.reader().readInt();
                hso_do var10 = new hso_do((byte) 14);
                hso_bf var14;
                (var14 = new hso_bf(var7, var3, var10)).a(var8, var9);
                if ((var13 = MainObject.a(var7, var3)) != null && !var13.cK) {
                    var5.a(var14);
                }
            }

            hso_s var12 = (hso_s) MainObject.a(var2, (byte) 9);
            var13 = MainObject.a(var2, (byte) 0);
            var8 = var0.reader().readInt();
            var9 = var0.reader().readInt();
            if (var13 != null) {
                var13.br = var8;
                var13.bt = var9;
            }

            if (var12 != null) {
                var12.Q = var5;
                var12.a((byte) 2);
                var12.b(var1);
                return;
            }
        } catch (Exception var11) {
            hso_dw.a("loi ham pet attack " + var11.toString());
        }

    }

    public static void m(Message var0) {
        byte var1 = -1;
        byte var2 = -1;

        try {
            var1 = var0.reader().readByte();
            hso_au var3;
            if ((var3 = (hso_au) MainObject.a(var0.reader().readShort(), (byte) 1)) == null || var3.cK) {
                return;
            }

            boolean var4 = var3.m();
            if (var3.cF == 4) {
                if (var3.dA < 0) {
                    return;
                }

                var3.r();
            }

            var3.dD = false;
            var3.bb = 0;
            var3.bc = 0;
            if (var1 == 1) {
                int var17 = var0.reader().readInt();
                byte var6 = var0.reader().readByte();
                var2 = var0.reader().readByte();
                var3.br = var17;
                if (var2 <= 0) {
                    return;
                }

                if (var3.Q != null && var3.Q.c() > 0) {
                    hso_bf var7 = (hso_bf) var3.Q.a(0);
                    var3.cQ = var7.a;
                    if (var3.dn == null) {
                        var3.dn = new hso_do((byte) 14);
                    }

                    if (!var4) {
                        var7.g = var3.dn;
                    }

                    var3.t();
                    var3.s();
                }

                hso_es var18 = new hso_es("ReadMessenge vecBe");
                boolean var8 = false;
                hso_es var9 = new hso_es("ReadMessenge allPlayerDie");

                int var10;
                for (var10 = 0; var10 < var2; ++var10) {
                    short var11 = var0.reader().readShort();
                    int var12 = var0.reader().readInt();
                    int var13 = var0.reader().readInt();
                    byte var14 = var0.reader().readByte();
                    hso_do var23 = new hso_do(var14);
                    hso_bf var24;
                    (var24 = new hso_bf(var11, var6, var23)).a(var12, var13);
                    byte var22 = var0.reader().readByte();
                    var24.e = new int[var22];
                    var24.f = new int[var22];

                    for (int var15 = 0; var15 < var22; ++var15) {
                        var24.e[var15] = var0.reader().readByte();
                        var24.f[var15] = var0.reader().readInt();
                    }

                    MainObject var25;
                    if ((var25 = MainObject.a(var11, var6)) != null && !var25.cK) {
                        var18.a(var24);
                        if (var25.br > 0) {
                            var25.br = var13;
                        }

                        if (var25.ct == GameScreen.f.ct) {
                            int var20 = GameScreen.f.bs;
                            var20 = var13 / var20 * 100;
                            GameScreen.f.a((byte) 4, var20 > 20);
                        }

                        if (var25.br <= 0) {
                            var8 = true;
                            var9.a(var25);
                        }
                    }
                }

                var3.Q = var18;
                var3.br = var17;
                var3.cU = true;
                var3.O = 3000;
                var3.P = hso_ft.aj;
                if (var8 || var3.cx == 1 || var3.cx == 2) {
                    hso_bf var19 = (hso_bf) var3.Q.a(0);
                    var3.cQ = var19.a;
                    if (var3.dn == null) {
                        var3.dn = new hso_do((byte) 14);

                    }

                    if (!var4) {
                        var19.g = var3.dn;
                    }

                    var3.t();
                    var3.s();
                }

                for (var10 = 0; var10 < var9.c(); ++var10) {
                    MainObject var21;
                    (var21 = (MainObject) var9.a(var10)).N();
                    var21.cF = 4;
                    var21.aW = hso_ft.aj;
                    var21.ba = 0;
                    GameScreen.a(11, var21.aY, var21.aZ);
                }

                return;
            }

            if (var1 == 0) {
                if (var3.Q != null && var3.Q.c() > 0) {
                    hso_bf var5 = (hso_bf) var3.Q.a(0);
                    var3.cQ = var5.a;
                    if (var3.dn == null) {
                        var3.dn = new hso_do((byte) 14);

                    }

                    if (!var4) {
                        var5.g = var3.dn;
                    }

                    var3.t();
                    var3.s();
                }

                var3.cU = false;
                var3.cN = null;
                return;
            }
        } catch (Exception var16) {
            var16.printStackTrace();
            (new StringBuffer(String.valueOf(var1))).append(" istarget").toString();
            (new StringBuffer(String.valueOf(var2))).append(" size").toString();
        }

    }

    public static void n(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            (new StringBuffer()).append(var1).toString();
            byte[] var2 = new byte[var0.reader().available()];
            var0.reader().read(var2);
         
            if (var1 == 9999) {
                MainObject.de = hso_aq.a(var2);
            } else {
                if (hso_bk.m(var1)) {
                    hso_di.a.a(new hso_an(var1, var2));
                }

                hso_aq var4 = aq.a(var2);
                if (var1 >= 13000) {
                    hso_bw.ac.a("" + (var1 - 2000), new hso_fd(var4));
                } else if (var1 >= 10700) {
                    hso_bw.aj.a("" + (var1 - 10700), new hso_fd(var4));
                } else if (var1 >= 10600) {
                    hso_cs.s = var4;
                    hso_ft.q.a();
                } else if (var1 >= 10500) {
                    hso_cs.r = var4;
                } else if (var1 >= 10400) {
                    hso_cs.q = var4;
                } else if (var1 >= 10200) {
                    hso_s.x.a("" + (var1 - 10200), new hso_fd(var4));
                } else if (var1 >= 10000) {
                    hso_bw.ai.a("" + (var1 - 10000), new hso_fd(var4));
                } else if (var1 >= 9500) {
                    hso_bw.ah.a("" + (var1 - 9500), new hso_fd(var4));
                } else if (var1 >= 7000) {
                    hso_bw.ag.a("" + (var1 - 7000), new hso_fd(var4));
                } else if (var1 >= 6000) {
                    hso_ev.a.a("" + (var1 - 6000), new hso_fd(var4));
                } else if (var1 >= 5500) {
                    hso_bw.af.a("" + (var1 - 5500), new hso_fd(var4));
                } else if (var1 >= 5000) {
                    hso_bw.ae.a("" + (var1 - 5000), new hso_fd(var4));
                } else if (var1 >= 4000) {
                    hso_bw.ad.a("" + (var1 - 4000), new hso_fd(var4));
                } else if (var1 >= 3000) {
                    GameScreen.n.a("" + (var1 - 3000), new hso_fd(var4));
                } else if (var1 >= 2000) {
                    hso_bw.ac.a("" + (var1 - 2000), new hso_fd(var4));
                } else if (var1 >= 1000) {
                    hso_au.K.a("" + (var1 - 1000), new hso_fd(var4));
                } else {
                    GameScreen.m.a("" + var1, new hso_fd(var4));
                }
            }
        } catch (Exception var3) {
            hso_dw.a("loi ham load img ");
            var3.printStackTrace();
        }
    }

    public final void o(Message var1) {
        this.a(var1, hso_bw.V, (byte) 0);
    }

    private static byte a(short var0, int var1) {
        for (int var2 = 0; var2 < hso_bw.V.c(); ++var2) {
            hso_bw var3;
            if ((var3 = (hso_bw) hso_bw.V.a(var2)) != null && var3.u == 7 && var3.O == var0 && var3.K >= var1) {
                return 1;
            }
        }

        return 0;
    }

    private static String b(short var0, int var1) {
        for (int var2 = 0; var2 < hso_bw.V.c(); ++var2) {
            hso_bw var3;
            if ((var3 = (hso_bw) hso_bw.V.a(var2)) != null && var3.u == 7 && var3.O == var0) {
                return var3.K + "/" + var1;
            }
        }

        return "0/" + var1;
    }

    public static void p(Message var0) {
        try {
            byte var1 = 8;
            String var2 = "";
            boolean var3 = false;
            String var4 = var0.reader().readUTF();
            byte var5 = var0.reader().readByte();
            hso_fn.t = false;
            if (var5 < 0) {
                MainObject var36;
                if ((var36 = MainObject.a(var5, (byte) 2)) != null && !var36.cK) {
                    var36.cE = var4;
                    return;
                }
            } else {
                hso_ft.a(hso_df.aD);
                short var6 = var0.reader().readShort();
                hso_es var7 = new hso_es("ReadMessenge vectorInfoNPC");
                byte var8 = 0;
                byte var9 = 0;
                int var10;
                byte var14;
                byte var17;
                short var18;
                byte var19;
                byte var20;
                hso_cz[] var21;
                int var22;
                int var23;
                int var24;
                short var40;
                hso_j var43;
                long var45;
                short var48;
                long var51;
                hso_j var55;
                hso_j var59;
                hso_j var60;
                byte var66;
                hso_j var67;
                if (var5 == u) {
                    var3 = true;
                    var9 = hso_fn.o;

                    for (var10 = 0; var10 < var6; ++var10) {
                        byte var11;
                        short var12;
                        byte var15;
                        if ((var11 = var0.reader().readByte()) == 3) {
                            var12 = var0.reader().readShort();
                            String var13 = var0.reader().readUTF();
                            var14 = var0.reader().readByte();
                            var15 = var0.reader().readByte();
                            short var16 = var0.reader().readShort();
                            var17 = var0.reader().readByte();
                            var18 = var0.reader().readShort();
                            var19 = var0.reader().readByte();
                            var21 = new hso_cz[var20 = var0.reader().readByte()];

                            for (var22 = 0; var22 < var20; ++var22) {
                                var23 = var0.reader().readUnsignedByte();
                                var24 = var0.reader().readInt();
                                var21[var22] = new hso_cz(var23, var24);
                            }

                            var66 = var0.reader().readByte();
                            var67 = hso_j.a(var12, var13, var16, var17, var19, var14, 3, var21, var15, false, var12, 0L, var18, (byte) 0, (byte) 0, 0, var66, (byte) 0);
                            var7.a(var67);
                        }

                        if (var11 == 7) {
                            var12 = var0.reader().readShort();
                            var40 = var0.reader().readShort();
                            var14 = var0.reader().readByte();
                            var15 = var0.reader().readByte();
                            var51 = var0.reader().readLong();
                            if ((var59 = hso_bw.b(var12)) != null) {
                                var60 = hso_j.a(var12, var59.g, var59.t, 7, var51, (byte) 0, var59.h, var59.P, var59.A, var40, var14, var15);
                                var7.a(var60);
                            } else {
                                (var60 = new hso_j()).O = var12;
                                var60.K = var40;
                                var60.x = var14;
                                var60.y = var15;
                                var60.q = var51;
                                var60.Q = 0;
                                var60.u = 7;
                                hso_bw.c(var12);
                                var7.a(var60);
                            }
                        }

                        if (var11 == 4) {
                            var12 = var0.reader().readShort();
                            var40 = var0.reader().readShort();
                            var45 = var0.reader().readLong();
                            hso_fo var53;
                            if ((var53 = hso_fo.b(var12)) != null) {
                                var55 = new hso_j(var53.a, var53.b, var53.c, var53.j, var40, 4, var45, var53.i, (byte) 0, (byte) 0, (byte) 0);
                                var7.a(var55);
                            }
                        }
                    }

                    hso_fn.E = var0.reader().readShort();
                } else {
                    short var37;
                    String var39;
                    byte var42;
                    if (var5 == q) {
                        var9 = hso_fn.k;

                        for (var10 = 0; var10 < var6; ++var10) {
                            var37 = var0.reader().readShort();
                            var39 = var0.reader().readUTF();
                            var42 = var0.reader().readByte();
                            var14 = var0.reader().readByte();
                            var48 = var0.reader().readShort();
                            var51 = var0.reader().readLong();
                            var18 = var0.reader().readShort();
                            var19 = var0.reader().readByte();
                            var21 = new hso_cz[var20 = var0.reader().readByte()];

                            for (var22 = 0; var22 < var20; ++var22) {
                                var23 = var0.reader().readUnsignedByte();
                                var24 = var0.reader().readInt();
                                var21[var22] = new hso_cz(var23, var24);
                            }

                            var66 = var0.reader().readByte();
                            var67 = hso_j.a(var37, var39, var48, (byte) 0, var19, var42, 3, var21, var14, false, var37, var51, var18, (byte) 0, (byte) 0, 0, var66, (byte) 0);
                            var7.a(var67);
                        }
                    } else {
                        hso_fo var41;
                        if (var5 == 0) {
                            for (var10 = 0; var10 < var6; ++var10) {
                                if ((var41 = hso_fo.b(var0.reader().readShort())) != null) {
                                    var43 = new hso_j(var41.a, var41.b, var41.c, var41.j, 1, 4, var41.h, var41.i, var41.g, (byte) 0, (byte) 0);
                                    var7.a(var43);
                                }
                            }
                        } else if (var5 != e && var5 != n && var5 != a) {
                            if (var5 == f) {
                                var9 = hso_fn.b;

                                for (var10 = 0; var10 < var6; ++var10) {
                                    var37 = var0.reader().readShort();
                                    var39 = var0.reader().readUTF();
                                    var40 = var0.reader().readShort();
                                    var45 = var0.reader().readLong();
                                    byte var56 = var0.reader().readByte();
                                    hso_cz[] var61 = new hso_cz[var17 = var0.reader().readByte()];

                                    for (int var63 = 0; var63 < var17; ++var63) {
                                        int var64 = var0.reader().readUnsignedByte();
                                        int var65 = var0.reader().readInt();
                                        var61[var63] = new hso_cz(var64, var65);
                                    }

                                    boolean var38 = false;
                                    var38 = false;
                                    var38 = false;
                                    var38 = true;
                                    var38 = false;
                                    var60 = new hso_j(var37, var39, var40, (byte) 0, 6, var61, var37, var45, var56, (byte) 0, (byte) 0);
                                    var7.a(var60);
                                }
                            } else if (var5 == g) {
                                var8 = hso_fn.c;
                                var1 = 9;
                                if (hso_bw.W.c() == 0) {
                                    Service.a().a((byte) -1, (short) 0, (byte) 0, (short) 0);
                                }

                                var7 = hso_bw.W;
                            } else if (var5 == o) {
                                var8 = hso_fn.i;
                                var1 = 13;
                                var9 = hso_fn.i;
                            } else {
                                hso_j var44;
                                if (var5 == h) {
                                    var1 = 8;

                                    for (var10 = 0; var10 < var6; ++var10) {
                                        if ((var44 = hso_bw.b(var37 = var0.reader().readShort())) != null) {
                                            var43 = hso_j.a(var37, var44.g, var44.t, 7, var44.q, var44.Q, var44.h, (short) var44.P, var44.A, (short) 1, var44.x, var44.y);
                                            var7.a(var43);
                                        } else {
                                            (var43 = new hso_j()).O = var37;
                                            var43.u = 7;
                                            var7.a(var43);
                                        }
                                    }
                                } else if (var5 != i && var5 != p) {
                                    if (var5 == w) {
                                        var8 = hso_fn.q;
                                        var1 = 10;
                                    } else if (var5 == x) {
                                        var8 = hso_fn.r;
                                        var1 = 10;
                                    } else if (var5 == v) {
                                        var8 = hso_fn.p;
                                        var1 = 10;
                                    } else if (var5 == s) {
                                        var8 = hso_fn.m;
                                        var1 = 10;
                                    } else if (var5 == t) {
                                        var8 = hso_fn.n;
                                        var1 = 10;
                                    } else if (var5 == r) {
                                        var8 = hso_fn.l;
                                        var1 = 10;
                                    } else if (var5 == j || var5 == k) {
                                        var1 = 8;
                                        var9 = hso_fn.e;

                                        for (var10 = 0; var10 < var6; ++var10) {
                                            var37 = 0;
                                            if (var5 == k) {
                                                var37 = hso_fn.A;
                                            }

                                            var44 = new hso_j(var0.reader().readShort(), (long) var37);
                                            var7.a(var44);
                                        }
                                    } else if (var5 == l) {
                                        var1 = 8;
                                        var9 = 0;

                                        for (var10 = 0; var10 < var6; ++var10) {
                                            if ((var41 = hso_fo.b(var0.reader().readShort())) != null) {
                                                var43 = new hso_j(var41.a, var41.b, var41.c, var41.j, 1, 4, var41.h, var41.i, var41.g, (byte) 0, (byte) 0);
                                                var7.a(var43);
                                            }
                                        }
                                    } else if (var5 == m) {
                                        var8 = hso_fn.f;
                                        var1 = 10;
                                    }
                                } else {
                                    var8 = hso_fn.d;
                                    var1 = 10;
                                    if (var5 == p) {
                                        hso_fn.t = true;
                                    }
                                }
                            }
                        } else {
                            if (var5 == n) {
                                var9 = hso_fn.h;
                            }

                            for (var10 = 0; var10 < var6; ++var10) {
                                var37 = var0.reader().readShort();
                                var39 = var0.reader().readUTF();
                                var42 = var0.reader().readByte();
                                var14 = var0.reader().readByte();
                                var48 = var0.reader().readShort();
                                var51 = var0.reader().readLong();
                                var18 = var0.reader().readShort();
                                var19 = var0.reader().readByte();
                                var21 = new hso_cz[var20 = var0.reader().readByte()];

                                for (var22 = 0; var22 < var20; ++var22) {
                                    var23 = var0.reader().readUnsignedByte();
                                    var24 = var0.reader().readInt();
                                    var21[var22] = new hso_cz(var23, var24);
                                }

                                var66 = var0.reader().readByte();
                                var67 = hso_j.a(var37, var39, var48, (byte) 0, var19, var42, 3, var21, var14, false, var37, var51, var18, (byte) 0, (byte) 0, 0, var66, (byte) 0);
                                if (var5 == a) {
                                    var67.T = var0.reader().readUTF();
                                }

                                var7.a(var67);
                            }

                            if (var5 == a) {
                                var2 = var0.reader().readUTF();
                            }
                        }
                    }
                }

                hso_es var46 = new hso_es("ReadMessenge vec11");
                hso_fn var49;
                if (var5 != j && var5 != k && var5 != l) {
                    (var49 = new hso_fn(hso_bw.V, (byte) 0, hso_df.dx, -1, var8)).F = var3;
                    var46.a(var49);
                }

                var49 = null;
                int var47;
                int var50;
                Object var52;
                hso_bw var54;
                if (var5 != i && var5 != p) {
                    if (var5 == r) {
                        var52 = new hso_c(var4, hso_c.d);
                        hso_c.G.d();
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;

                        for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                            var43 = hso_bw.b(hso_c.q[var47]);
                            var50 = 0;
                            if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                                var50 = var54.K;
                            }

                            hso_c.p[var47] = var50;
                        }
                    } else if (var5 == t) {
                        var52 = new hso_c(var4, hso_c.f);
                        hso_c.G.d();
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;

                        for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                            var43 = hso_bw.b(hso_c.q[var47]);
                            var50 = 0;
                            if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                                var50 = var54.K;
                            }

                            hso_c.p[var47] = var50;
                        }
                    } else if (var5 == w) {
                        ((hso_fl) (var52 = new hso_c(var4, hso_c.g))).bd = true;
                        hso_c.G.d();
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;

                        for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                            var43 = hso_bw.b(hso_c.q[var47]);
                            var50 = 0;
                            if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                                var50 = var54.K;
                            }

                            hso_c.p[var47] = var50;
                        }

                        byte var58 = var0.reader().readByte();
                        hso_c.G.d();

                        for (int var57 = 0; var57 < var58; ++var57) {
                            short var62 = var0.reader().readShort();
                            var48 = var0.reader().readShort();
                            if (var62 != -1) {
                                hso_c.i[var57] = a((short) var62, var48);
                                hso_c.h[var57] = b(var62, var48);
                                if ((var55 = hso_bw.b(var62)) != null) {
                                    hso_c.G.a(var55);
                                }

                                if (var55 == null) {
                                    (var59 = new hso_j()).O = var62;
                                    var59.u = 7;
                                    hso_c.G.a(var59);
                                }
                            }
                        }
                    } else if (var5 == x) {
                        ((hso_fl) (var52 = new hso_c(var4, hso_c.g))).be = true;
                        hso_c.G.d();
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;

                        for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                            var43 = hso_bw.b(hso_c.q[var47]);
                            var50 = 0;
                            if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                                var50 = var54.K;
                            }

                            hso_c.p[var47] = var50;
                        }
                    } else if (var5 == v) {
                        var52 = new hso_c(var4, hso_c.g);
                        hso_c.G.d();
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;

                        for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                            var43 = hso_bw.b(hso_c.q[var47]);
                            var50 = 0;
                            if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                                var50 = var54.K;
                            }

                            hso_c.p[var47] = var50;
                        }
                    } else if (var5 == s) {
                        var52 = new hso_c(var4, hso_c.e);
                        hso_c.G.d();
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;

                        for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                            var43 = hso_bw.b(hso_c.q[var47]);
                            var50 = 0;
                            if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                                var50 = var54.K;
                            }

                            hso_c.p[var47] = var50;
                        }
                    } else if (var5 == m) {
                        var52 = new hso_c(var4, hso_c.b);
                        hso_c.l = null;
                        hso_c.m = null;
                        hso_c.n = null;
                    } else {
                        var52 = new hso_fn(var7, var1, var4, var5, var9);
                        if (var5 == a) {
                            ((hso_fl) var52).a(var2);
                        }
                    }
                } else {
                    ((hso_fl) (var52 = new hso_c(var4, (byte) 0))).bb = var5 == p;
                    if (var5 == p) {
                        hso_fn.t = true;
                    }

                    hso_c.l = null;
                    hso_c.m = null;
                    hso_c.n = null;

                    for (var47 = 0; var47 < hso_c.q.length; ++var47) {
                        var43 = hso_bw.b(hso_c.q[var47]);
                        var50 = 0;
                        if (var43 != null && (var54 = hso_bw.a(var43.u, (short) var43.O)) != null) {
                            var50 = var54.K;
                        }

                        hso_c.p[var47] = var50;
                    }
                }

                var46.a(var52);
                hso_ft.v = new hso_eu();
                if (var5 != j && var5 != k && var5 != l) {
                    hso_ft.v.a = 1;
                } else {
                    hso_ft.v.a = 0;
                }

                hso_ft.v.a(var46);
                hso_ft.v.a((hso_p) GameScreen.b());
                hso_ft.j();
                if (var5 == i || var5 == m || var5 == p) {
                    ((hso_fl) var52).b();
                    return;
                }
            }
        } catch (Exception var35) {
            var35.printStackTrace();
        }

    }

    public static void q(Message var0) {
        try {
            short var1 = var0.reader().readShort();

            short var3;
            byte var11;
            int var21;
            for (var21 = 0; var21 < var1; ++var21) {
                var3 = var0.reader().readShort();
                short var4 = var0.reader().readShort();
                long var5 = var0.reader().readLong();
                String var7 = var0.reader().readUTF();
                String var8 = var0.reader().readUTF();
                byte var9 = var0.reader().readByte();
                byte var10 = var0.reader().readByte();
                var11 = var0.reader().readByte();
                short var12 = var0.reader().readShort();
                boolean var13 = var0.reader().readBoolean();
                hso_fo var14 = new hso_fo(var3, var4, var5, var7, var8, var9, var10, var11, var12, var13);
                hso_fo.m.a("" + var3, var14);
            }

            hso_bw.d = new String[var21 = var0.reader().readUnsignedByte()];
            hso_bw.e = new byte[var21];
            hso_bw.f = new byte[var21];

            for (int var22 = 0; var22 < var21; ++var22) {
                hso_bw.d[var22] = var0.reader().readUTF();
                hso_bw.e[var22] = var0.reader().readByte();
                hso_bw.f[var22] = var0.reader().readByte();
            }

            var3 = var0.reader().readShort();

            short var6;
            for (int var24 = 0; var24 < var3; ++var24) {
                short var26 = var0.reader().readShort();
                var6 = var0.reader().readShort();
                long var31 = var0.reader().readLong();
                String var35 = var0.reader().readUTF();
                String var36 = var0.reader().readUTF();
                var11 = var0.reader().readByte();
                byte var37 = var0.reader().readByte();
                byte var38 = var0.reader().readByte();
                short var39 = var0.reader().readShort();
                byte var19 = var0.reader().readByte();
                byte var23 = var0.reader().readByte();
                hso_j var20;
                (var20 = hso_j.a(var26, var35, var6, 7, var31, var37, var36, var39, var11, (short) 1, var38, var19)).d(var23);
                hso_fo.n.a("" + var26, var20);
            }

            hso_fn.u = var0.reader().readShort();
            hso_fn.v = var0.reader().readShort();
            hso_fn.w = var0.reader().readShort();
            hso_fn.x = var0.reader().readShort();
            hso_fn.y = var0.reader().readShort();
            hso_fn.z = var0.reader().readShort();
            hso_fn.A = var0.reader().readShort();
            hso_fn.B = var0.reader().readByte();
            hso_bs.k = 0;
            byte var25 = var0.reader().readByte();
            (new StringBuffer("size pet template = ")).append(var25).toString();

            for (int var27 = 0; var27 < var25; ++var27) {
                var6 = var0.reader().readShort();
                byte var33 = var0.reader().readByte();
                hso_fo.p.a("" + var6, new Byte(var33));
            }

            try {
                byte var28;
                MainObject.dG = new short[var28 = var0.reader().readByte()];

                for (int var29 = 0; var29 < var28; ++var29) {
                    MainObject.dG[var29] = var0.reader().readShort();
                }
            } catch (Exception var17) {
                hso_dw.a("----Err Readmess:-- itemTemplate");
            }

            boolean var30 = false;

            try {
                hso_cf.W = var0.reader().readByte();
            } catch (Exception var15) {
                hso_cf.W = 0;
            }

            try {
                byte var32;
                GameScreen.b = new short[var32 = var0.reader().readByte()];

                for (int var34 = 0; var34 < var32; ++var34) {
                    GameScreen.b[var34] = (short) var0.reader().readUnsignedByte();
                }

            } catch (Exception var16) {
                GameScreen.b = new short[0];
            }
        } catch (Exception var18) {
            ISession.a().c();
            hso_es var2 = new hso_es("ReadMessenge vec7");
            if (hso_x.f && hso_ft.a != hso_ft.b) {
                var2.a(new hso_bt(hso_df.cL, 0));
            }

            var2.a(new hso_bt(hso_df.bR, 6));
            hso_ft.a(hso_df.ck, var2);
            var18.printStackTrace();
        }
    }

    public static void r(Message var0) {
        try {
            short var1 = var0.reader().readShort();

            short var5;
            int var6;
            byte var7;
            for (int var2 = 0; var2 < var1; ++var2) {
                short var3 = var0.reader().readShort();
                String var4 = var0.reader().readUTF();
                var5 = (short) var0.reader().readUnsignedByte();
                var6 = var0.reader().readInt();
                var7 = var0.reader().readByte();
                hso_db var20 = new hso_db(var3, var5, var6, var7, var4);
                hso_au.L.a(var20);
            }

            byte var19;
            hso_ai.c = new byte[var19 = var0.reader().readByte()][];

            int var21;
            byte var22;
            int var23;
            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.c[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.c[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.d = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.d[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.d[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.e = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.e[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.e[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.f = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.f[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.f[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.g = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.g[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.g[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.h = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.h[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.h[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.i = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.i[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.i[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.j = new byte[var19 = var0.reader().readByte()][];

            for (var21 = 0; var21 < var19; ++var21) {
                var22 = var0.reader().readByte();
                hso_ai.j[var21] = new byte[var22];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_ai.j[var21][var23] = var0.reader().readByte();
                }
            }

            hso_ai.b = new byte[var19 = var0.reader().readByte()];

            for (var21 = 0; var21 < var19; ++var21) {
                hso_ai.b[var21] = var0.reader().readByte();
            }

            byte var30;
            hso_bw.al = new byte[var30 = var0.reader().readByte()];

            for (int var26 = 0; var26 < var30; ++var26) {
                hso_bw.al[var26] = var0.reader().readByte();
            }

            try {
                hso_s.y = new byte[var22 = var0.reader().readByte()];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_s.y[var23] = var0.reader().readByte();
                }
            } catch (Exception var15) {
                hso_s.y = new byte[]{2, 1, 0, 2, 0, 1};
            }

            try {
                hso_fo.k = new int[var22 = var0.reader().readByte()];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_fo.k[var23] = var0.reader().readByte();
                }
            } catch (Exception var14) {
                hso_fo.k = new int[]{-1, 0, 3, 4, 5, 12, 2, 1, 6, 4, 7, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
            }

            try {
                hso_fo.l = new int[var22 = var0.reader().readByte()];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_fo.l[var23] = var0.reader().readByte();
                }
            } catch (Exception var13) {
                hso_fo.l = new int[]{1, 7, 6, 2, -1, 4, 8, 10, 0, 0, 0, 0, 5};
            }

            try {
                hso_au.S = new short[var22 = var0.reader().readByte()];

                for (var23 = 0; var23 < var22; ++var23) {
                    hso_au.S[var23] = var0.reader().readShort();
                }
            } catch (Exception var12) {
                hso_au.S = new short[]{104, 103, 105, 106, 135};
            }

            try {
                Player.E = new byte[var22 = var0.reader().readByte()];

                for (var23 = 0; var23 < var22; ++var23) {
                    Player.E[var23] = var0.reader().readByte();
                }
            } catch (Exception var11) {
                Player.E = null;
            }

            try {
                var22 = var0.reader().readByte();

                for (var23 = 0; var23 < var22; ++var23) {
                    byte var25 = var0.reader().readByte();
                    short var27;
                    if ((var27 = var0.reader().readShort()) > 0) {
                        byte[] var32 = new byte[var27];

                        for (int var17 = 0; var17 < var27; ++var17) {
                            var32[var17] = var0.reader().readByte();
                        }

                        hso_es var18 = new hso_es();
                        hso_fa var24 = new hso_fa(var32, var25);
                        var18.a(var24);
                        hso_s.b.a("" + var25, var18);
                    }
                }
            } catch (Exception var10) {
            }

            byte[][] var31;
            try {
                var31 = new byte[var5 = var0.reader().readShort()][];

                for (var6 = 0; var6 < var5; ++var6) {
                    var7 = var0.reader().readByte();
                    var31[var6] = new byte[var7];

                    for (var21 = 0; var21 < var7; ++var21) {
                        var31[var6][var21] = var0.reader().readByte();
                    }
                }
            } catch (Exception var9) {
                var31 = null;
            }

            if (var31 != null) {
                hso_i.a = var31;
            }

            boolean var33 = false;

            byte[] var28;
            try {
                byte var34;
                var28 = new byte[var34 = var0.reader().readByte()];

                for (int var29 = 0; var29 < var34; ++var29) {
                    var28[var29] = var0.reader().readByte();
                }
            } catch (Exception var8) {
                var28 = null;
            }

            if (var28 != null) {
                hso_ai.a = var28;
                return;
            }
        } catch (Exception var16) {
            var16.printStackTrace();
        }

    }

    public static void s(Message var0) {
        try {
            hso_bs.g();
            hso_bs.h();
            GameScreen.f = new Player(0, (byte) 0, "unname", 0, 0);
            hso_bw.V.d();
            hso_bw.W.d();
            hso_x.a.d();
            byte var1 = var0.reader().readByte();
            hso_es var2 = new hso_es("ReadMessenge vList");
            int var3;
            int var4 = var3 = (hso_ft.W - 150) / 4;

            for (int var5 = 0; var5 < var1; ++var5) {
                int var6 = hso_ft.Z - 25 - 20 * ((var5 + 1) % 2);
                int var7 = var0.reader().readInt();
                String var8 = var0.reader().readUTF();
                byte var9 = var0.reader().readByte();
                byte var10 = var0.reader().readByte();
                byte var11 = var0.reader().readByte();
                byte var12 = var0.reader().readByte();
                byte[] var13 = new byte[12];

                int var14;
                for (var14 = 0; var14 < var13.length; ++var14) {
                    var13[var14] = -1;
                }

                byte var15;
                for (var14 = 0; var14 < var12; ++var14) {
                    var15 = var0.reader().readByte();
                    byte var16 = var0.reader().readByte();
                    var13[var15] = var16;
                }

                short var19 = var0.reader().readShort();
                var15 = var0.reader().readByte();
                var0.reader().readByte();
                var0.reader().readByte();
                hso_bm var20 = new hso_bm(var7, (byte) 0, var8, 0, 0);
                short var18;
                if ((var18 = var0.reader().readShort()) >= 0) {
                    var20.cO = new hso_em(0, var18, var0.reader().readUTF(), var0.reader().readByte());
                }

                var20.bx = var15;
                var20.a(var9, var11, (int) var10);
                var20.a(var13);
                var20.by = var19;
                var20.aY = var4 + 25;
                var20.aZ = var6 + 50;
                var4 += var3 + 50;
                var2.a(var20);
            }

            hso_ft.i.a(var2);
            if (var1 == 0) {
                (hso_ft.j = new hso_ep()).a((byte) 0);//bug 
            } else {
                hso_ft.i.c();
            }
        } catch (Exception var17) {
            var17.printStackTrace();
        }
    }

    public static void t(Message var0) {
        try {
            byte var1 = var0.reader().readByte();

            for (int var2 = 0; var2 < var1; ++var2) {
                String var3 = var0.reader().readUTF();
                String var4 = var0.reader().readUTF();
                byte var5 = var0.reader().readByte();
                byte var6 = var0.reader().readByte();
                short var7 = var0.reader().readShort();
                short var8 = var0.reader().readShort();
                byte var9 = var0.reader().readByte();
                byte var10 = var0.reader().readByte();
                byte var11 = var0.reader().readByte();
                Object var12;
                if ((var12 = MainObject.a(var5, (byte) 2)) == null) {
                    var12 = new hso_ey(var3, var4, var5, var6, var7, var8, var9, var10, var11);
                } else {
                    ((MainObject) var12).cB = var3;
                    ((MainObject) var12).cC = var4;
                    ((MainObject) var12).cS = var6;
                    ((MainObject) var12).aY = var7;
                    ((MainObject) var12).aZ = var8;
                }

                ((MainObject) var12).cK = false;
                ((MainObject) var12).cT = var0.reader().readByte() + 500;
                ((MainObject) var12).cD = var0.reader().readUTF();
                ((MainObject) var12).co = var0.reader().readByte();
                ((MainObject) var12).bG = var0.reader().readByte() == 1;
                ((MainObject) var12).cu = 2;
                GameScreen.a((MainObject) var12);
                hso_ex.a(new hso_fk(var5, var7, var8));
                if (var5 == -52) {
                    hso_du var14 = new hso_du((byte) 0, (byte) 2, var7 + 48, var8 + 10);
                    if (!GameScreen.i.b(var14)) {
                        GameScreen.a((MainObject) var14);
                    }

                    var14 = new hso_du((byte) 2, (byte) 0, var7 + 43, var8 - 4);
                    if (!GameScreen.i.b(var14)) {
                        GameScreen.a((MainObject) var14);
                    }

                    var14 = new hso_du((byte) 3, (byte) 3, var7 - 18, var8 + 7);
                    if (!GameScreen.i.b(var14)) {
                        GameScreen.a((MainObject) var14);
                    }
                }
            }

        } catch (Exception var13) {
        }
    }

    public static void u(Message var0) {
        try {
            byte var1;
            boolean var3;
            if ((var1 = var0.reader().readByte()) < 3) {
                byte var2 = var0.reader().readByte();
                var3 = false;
                boolean var4 = false;
                boolean var5 = false;
                boolean var6 = false;
                String var7 = null;
                hso_ew var8 = null;
                switch (var1) {
                    case 0:
                        hso_ew.a.d();
                        break;
                    case 1:
                        hso_ew.b.d();
                        break;
                    case 2:
                        hso_ew.c.d();
                        hso_ew.d.d();
                        break;
                    default:
                        break;
                }

                for (byte var9 = 0; var9 < var2; ++var9) {
                    short var19 = var0.reader().readShort();
                    var4 = var0.reader().readBoolean();
                    var7 = var0.reader().readUTF();
                    String var10;
                    byte var23;
                    byte var25;
                    String var28;
                    switch (var1) {
                        case 0:
                            var25 = var0.reader().readByte();
                            var28 = var0.reader().readUTF();
                            var23 = var0.reader().readByte();
                            var10 = var0.reader().readUTF();
                            var8 = new hso_ew(var19, var4, var7, var25, var28, var23, var10);
                            hso_ew.a.a(var8);
                            break;
                        case 1:
                            var25 = var0.reader().readByte();
                            String var24 = var0.reader().readUTF();
                            var28 = var0.reader().readUTF();
                            var8 = new hso_ew(var19, var4, var7, var25, var24, var28);
                            hso_ew.b.a(var8);
                            break;
                        case 2:
                            var23 = var0.reader().readByte();
                            var10 = var0.reader().readUTF();
                            String var11 = var0.reader().readUTF();
                            var25 = var0.reader().readByte();
                            short[] var12;
                            short[] var13;
                            short[] var14;
                            byte var15;
                            byte var27;
                            if (var23 == 0) {
                                var12 = new short[var27 = var0.reader().readByte()];
                                var13 = new short[var27];
                                var14 = new short[var27];

                                for (var15 = 0; var15 < var27; ++var15) {
                                    var12[var15] = var0.reader().readShort();
                                    var14[var15] = var0.reader().readShort();
                                    var13[var15] = var0.reader().readShort();
                                }

                                var8 = new hso_ew(var19, var4, var7, var11, var23, var10, var25, var12, var13, var14);
                            } else if (var23 == 1) {
                                var12 = new short[var27 = var0.reader().readByte()];
                                var13 = new short[var27];
                                var14 = new short[var27];

                                for (var15 = 0; var15 < var27; ++var15) {
                                    var12[var15] = var0.reader().readShort();
                                    var14[var15] = var0.reader().readShort();
                                    var13[var15] = var0.reader().readShort();
                                }

                                var8 = new hso_ew(var19, var4, var7, var11, var23, var10, var25, var12, var13, var14);
                            } else if (var23 == 2) {
                                var25 = var0.reader().readByte();
                                var28 = var0.reader().readUTF();
                                var8 = new hso_ew(var19, var4, var7, var11, var25, var28);
                            }

                            if (var8 != null) {
                                if (var4) {
                                    hso_ew.c.a(var8);
                                } else {
                                    hso_ew.d.a(var8);
                                }
                            }
                    }
                }

                if (var1 != 0 && (var1 == 1 || var1 == 2)) {
                    ((hso_fl) hso_ft.u.b.a(4)).b();
                }
            } else {
                var0.reader().readByte();
                boolean var17 = false;
                var0.reader().readByte();
                var3 = false;
            }

            int var18;
            for (var18 = 0; var18 < GameScreen.i.c(); ++var18) {
                MainObject var20;
                if ((var20 = (MainObject) GameScreen.i.a(var18)).cu == 2) {
                    if (var1 == 0) {
                        if (var20.cn == 1) {
                            var20.cn = 0;
                        }
                    } else if (var1 == 1) {
                        if (var20.cn == 3) {
                            var20.cn = 0;
                        }
                    } else if (var1 == 2 && var20.cn == 2) {
                        var20.cn = 0;
                    }

                    int var22;
                    for (var22 = 0; var22 < hso_ew.a.c(); ++var22) {
                        if (((hso_ew) hso_ew.a.a(var22)).h == var20.ct && var20.cn != 3) {
                            var20.cn = 1;
                        }
                    }

                    for (var22 = 0; var22 < hso_ew.b.c(); ++var22) {
                        if (((hso_ew) hso_ew.b.a(var22)).g == var20.ct) {
                            var20.cn = 3;
                        }
                    }

                    for (var22 = 0; var22 < hso_ew.c.c(); ++var22) {
                        if (((hso_ew) hso_ew.c.a(var22)).g == var20.ct && var20.cn == 0) {
                            var20.cn = 2;
                        }
                    }

                    for (var22 = 0; var22 < hso_ew.d.c(); ++var22) {
                        if (((hso_ew) hso_ew.d.a(var22)).g == var20.ct && var20.cn == 0) {
                            var20.cn = 2;
                        }
                    }
                }
            }

            for (var18 = 0; var18 < hso_ex.f.c(); ++var18) {
                hso_fk var21 = (hso_fk) hso_ex.f.a(var18);
                if (var1 == 0) {
                    if (var21.d == 1) {
                        var21.d = 0;
                    }
                } else if (var1 == 1) {
                    if (var21.d == 3) {
                        var21.d = 0;
                    }
                } else if (var1 == 2 && var21.d == 2) {
                    var21.d = 0;
                }

                MainObject var26;
                if ((var26 = MainObject.a(var21.a, (byte) 2)) != null && !var26.cK) {
                    var21.d = var26.cn;
                }
            }

        } catch (Exception var16) {
        }
    }

    public static void v(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            byte var2 = var0.reader().readByte();
            byte var3 = var0.reader().readByte();
            hso_es var4 = new hso_es("ReadMessenge cmd");

            for (int var5 = 0; var5 < var3; ++var5) {
                hso_bt var6 = new hso_bt(var0.reader().readUTF(), (hso_dk) null);
                var4.a(var6);
            }

            String var8 = var0.reader().readUTF();
            hso_ft.o.a(var4, 2, var2, var1, var8);
        } catch (Exception var7) {
        }
    }

    public static void w(Message var0) {
        try {
            byte var1;
            hso_af.c = new hso_cz[var1 = var0.reader().readByte()];
            hso_af.d = new hso_cz[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                int var3 = var0.reader().readUnsignedByte();
                int var4 = var0.reader().readInt();
                hso_cz var6;
                if ((var6 = new hso_cz(var3, var4)).a >= 16 && var6.a <= 20) {
                    hso_af.e[var6.a - 16] = hso_j.a(var6.b);
                }

                hso_af.c[var2] = var6;
                hso_af.d[var2] = var6;
            }

        } catch (Exception var5) {
        }
    }

    public static void x(Message var0) {
        try {
            short var1;
            MainObject var2;
            if ((var2 = MainObject.a(var1 = var0.reader().readShort(), (byte) 0)) != null && !var2.cK) {
                var2.bz = var0.reader().readShort();
                int var4 = var0.reader().readInt();
                if (!hso_ft.B || var2 == GameScreen.f) {
                    GameScreen.a(var4 + "xp", var2.aY, var2.aZ - var2.be, 1, var1);
                    return;
                }
            }
        } catch (Exception var3) {
        }

    }

    public static void y(Message var0) {
        try {
            short var1;
            MainObject var2;
            if ((var2 = MainObject.a(var1 = var0.reader().readShort(), (byte) 0)) != null && !var2.cK) {
                var2.by = var0.reader().readByte();
                GameScreen.a(42, var1, (byte) 0, var1, (byte) 0, 0, 0);
                if (var2 == GameScreen.f && GameScreen.p.d(5, 8)) {
                    GameScreen.p.f();
                    GameScreen.p.g();
                    if (Player.o == -1) {
                        Player.o = 0;
                        return;
                    }
                }
            }
        } catch (Exception var3) {
        }

    }

    public static void z(Message var0) {
        try {
            byte[] var1 = new byte[var0.reader().readShort()];
            var0.reader().read(var1);
            hso_cs.a(var1);
            GameScreen.X.d();
            hso_cf.X = -1;
        } catch (Exception var2) {
        }
    }

    public static void A(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            String var5 = var0.reader().readUTF();
            byte var6 = 0;
            if (var1 == 3 || var1 == 4 || var1 == 7) {
                var6 = var0.reader().readByte();
            }

            short var8 = var0.reader().readShort();
            int var9;
            MainObject var10;
            int var11;
            if ((var10 = MainObject.a(var2, (byte) 1)) != null && !var10.cK) {
                var9 = var10.aY;
                var11 = var10.aZ;
                GameScreen.a((MainObject) (new hso_fv(var4, var1, var5, var9, var11, var3, var6)));
                return;
            }

            if ((var10 = MainObject.a(var8, (byte) 0)) != null) {
                var9 = var10.aY;
                var11 = var10.aZ;
                GameScreen.a((MainObject) (new hso_fv(var4, var1, var5, var9, var11, var3, var6)));
                return;
            }
        } catch (Exception var7) {
        }

    }

    public static void B(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            MainObject var6;
            if ((var6 = MainObject.e(var2, var1)) != null && !var6.cK) {
                if (var1 == 5 && var4 == GameScreen.f.ct) {
                    hso_ew.a(var6.cS, var6.cB);
                }

                MainObject var5;
                if ((var5 = MainObject.a(var4, (byte) 0)) != null && !var5.cK) {
                    if (!hso_ft.B || var6 == GameScreen.f) {
                        if (var6.cu == 3 && var6.cs > 0) {
                            GameScreen.a(var6.cB, var5.aY, var5.aZ - var5.be / 2, -var6.cs, var4);
                        } else {
                            GameScreen.a(var6.cB, var5.aY, var5.aZ - var5.be / 2, 5, var4);
                        }
                    }

                    var6.i(var5.aY, var5.aZ - var5.be / 2);
                    var6.cU = true;
                } else {
                    var6.cK = true;
                }
            }
        } catch (Exception var3) {
        }
    }

    public static void C(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            String var2 = var0.reader().readUTF();
            byte var3 = var0.reader().readByte();
            byte var4 = var0.reader().readByte();
            byte var5 = var0.reader().readByte();
            short var6 = var0.reader().readShort();
            byte var7;
            int[] var8 = new int[var7 = var0.reader().readByte()];
            byte[] var9 = new byte[var7];

            for (int var10 = 0; var10 < var7; ++var10) {
                var9[var10] = var0.reader().readByte();
                var8[var10] = var0.reader().readInt();
            }

            hso_fo var12 = new hso_fo(var1, var2, var3, var4, var5, var6, var8, var9);
            hso_fo.o.a("" + var1, var12);
        } catch (Exception var11) {
        }
    }

    public static void D(Message var0) {
        try {
            hso_ah.b = 0;
            hso_es var1 = new hso_es("ReadMessenge vec14");
            byte var2 = var0.reader().readByte();

            int var4;
            for (var4 = 0; var4 < var2; ++var4) {
                hso_ev var3;
                (var3 = new hso_ev()).b = var0.reader().readByte();
                var3.f = var0.reader().readByte();
                var3.c = var0.reader().readUTF();
                var3.e = var0.reader().readByte();
                if (var3.e == 1) {
                    ++hso_ah.b;
                }

                var3.h = var0.reader().readShort();
                var3.d = var0.reader().readUTF();
                var3.g = var0.reader().readByte();
                var0.reader().readByte();
                byte var5 = var0.reader().readByte();
                var3.k = new hso_fc[var5];

                for (int var6 = 0; var6 < var5; ++var6) {
                    var3.k[var6] = new hso_fc();
                    var3.k[var6].a = var0.reader().readShort();
                    var3.k[var6].e = var0.reader().readShort();
                    if (var6 == 0) {
                        var3.i = var3.k[var6].e;
                    }

                    var3.k[var6].g = var0.reader().readInt();
                    var3.k[var6].h = var0.reader().readInt();
                    var3.k[var6].i = var0.reader().readByte();
                    var3.k[var6].b = var0.reader().readShort();
                    var3.k[var6].c = var0.reader().readShort();
                    var3.k[var6].d = var0.reader().readShort();
                    byte var7 = var0.reader().readByte();
                    var3.k[var6].k = new hso_cz[var7];

                    for (int var8 = 0; var8 < var7; ++var8) {
                        var3.k[var6].k[var8] = new hso_cz(var0.reader().readUnsignedByte(), var0.reader().readInt());
                    }

                    var3.k[var6].j = var0.reader().readByte();
                    var3.k[var6].f = var0.reader().readShort();
                }

                var3.j = var0.reader().readShort();
                var3.l = var0.reader().readByte();
                var1.a(var3);
            }

            hso_y.a = hso_ak.d(hso_ak.c(var1));
            hso_ct.a(GameScreen.f.bx);
            GameScreen.f.U.a(hso_y.a);
            hso_ft.d.a = true;
            hso_ah.f = hso_dw.a(hso_ah.b, 3);
            var4 = 0;

            for (int var10 = 0; var10 < hso_y.a.c(); ++var10) {
                hso_ev var11;
                if ((var11 = (hso_ev) hso_y.a.a(var10)).e == 1) {
                    hso_ah.f[var4][0] = var11.b;
                    hso_ah.f[var4][1] = 0;
                    hso_ah.f[var4][2] = var10;
                    ++var4;
                }
            }

        } catch (Exception var9) {
        }
    }

    public static void E(Message var0) {
        try {
            hso_eu.f = 5;
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            short var3 = var0.reader().readShort();
            hso_bw var4 = null;
            MainObject var5;
            if ((var5 = MainObject.a(var2, var1)) == null || var5.cK) {
                return;
            }

            if (var3 != -1 && var5 == GameScreen.f && (var4 = hso_bw.a(4, (short) var3)) != null) {
                --var4.K;
                if (var4.K <= 0) {
                    hso_bw.V.d(var4);
                }
            }

            int var7;
            byte var8;
            if ((var8 = var0.reader().readByte()) == 0) {
                var5.bs = var0.reader().readInt();
                var5.br = var0.reader().readInt();
                var7 = var0.reader().readInt();
                if (var5.br > 0) {
                    if (var5.cF == 4) {
                        var5.N();
                        var5.cF = 0;
                        var5.df.d();
                        if (var5 == GameScreen.f) {
                            Service.a().a((short) GameScreen.f.aY, (short) GameScreen.f.aZ);
                        }
                    }
                } else {
                    var5.br = 0;
                    var5.bt = 0;
                    if (var5.cF != 4) {
                        if (var1 == 1) {
                            MainObject.a((hso_au) var5, GameScreen.f.ct, hso_ak.f(3));
                        } else {
                            var5.N();
                            var5.cF = 4;
                            var5.aW = hso_ft.aj;
                            var5.ba = 0;
                            GameScreen.a(11, var5.aY, var5.aZ);
                        }
                    }
                }

                if (!hso_ft.B || var5 == GameScreen.f) {
                    if (var7 > 0) {
                        GameScreen.a("+" + var7, var5.aY, var5.aZ - var5.be / 2, 3, var2);
                    } else if (var7 < 0) {
                        GameScreen.a("" + var7, var5.aY, var5.aZ - var5.be / 2, 3, var2);
                    }
                }
            } else if (var8 == 1) {
                var5.bu = var0.reader().readInt();
                var5.bt = var0.reader().readInt();
                var7 = var0.reader().readInt();
                if (!hso_ft.B || var5 == GameScreen.f) {
                    if (var7 > 0) {
                        GameScreen.a("+" + var7, var5.aY, var5.aZ - var5.be / 2, 4, var2);
                    } else if (var7 < 0) {
                        GameScreen.a("" + var7, var5.aY, var5.aZ - var5.be / 2, 3, var2);
                    }
                }
            } else if (var8 == 2) {
                var5.bs = var0.reader().readInt();
                var5.br = var0.reader().readInt();
                var7 = var0.reader().readInt();
                if (!hso_ft.B) {
                    if (var7 > 0) {
                        GameScreen.a("+" + var7, var5.aY, var5.aZ - var5.be / 2, 3, var2);
                    } else if (var7 < 0) {
                        GameScreen.a("" + var7, var5.aY, var5.aZ - var5.be / 2, 6, var2);
                    }
                }
            } else if (var8 == 3) {
                var5.br = var0.reader().readInt();
                var7 = var0.reader().readInt();
                GameScreen.a("" + var7, var5.aY, var5.aZ - var5.be / 2, 9, var2);
                GameScreen.a(0, var5.aY, var5.aZ + (var5.bc << 1) / 1000 - 5);
                GameScreen.a(9, var5.aY, var5.aZ + (var5.bc << 1) / 1000 + 5);
                GameScreen.a(4, var5.aY, var5.aZ);
            }

            if (Player.N != null) {
                Player.N.a(var5.cB, var5.aY, var5.aZ, var5.br, var5.bs);
                return;
            }
        } catch (Exception var6) {
        }

    }

    public static void F(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            byte var2 = var0.reader().readByte();
            MainObject var5;
            if ((var5 = MainObject.a(var1, var2)) != null && !var5.cK) {
                String var4;
                if ((var4 = var0.reader().readUTF()) != null && var4.trim().length() != 0) {
                    var5.cE = var4;
                    hso_ft.g.a(hso_df.cz, var5.cB + ": ", var4, (byte) 1, false);
                    return;
                }

                return;
            }
        } catch (Exception var3) {
        }

    }

    public static void G(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            String var3;
            if ((var3 = var0.reader().readUTF()) != null && var3.trim().length() != 0) {
                if (var1.compareTo(hso_df.cz) == 0) {
                    hso_ft.g.a(var1, hso_df.ew + ": ", var3, (byte) 1, false);
                } else if (var1.compareTo(hso_df.eU) == 0) {
                    hso_ft.g.a(var1, "", var3, (byte) 1, false);
                } else if (var1.compareTo(hso_df.eV) == 0) {
                    hso_ft.g.a(var1, "", var3, (byte) 0, false);
                } else if (var1.compareTo(hso_df.aS) == 0) {
                    hso_ft.g.a(var1, "", var3, (byte) 0, false);
                } else {
                    hso_ft.g.a(var1, var1 + ": ", var3, (byte) 0, false);
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void H(Message var0) {
        try {
            String var1 = hso_df.bd;
            byte var2;
            if ((var2 = var0.reader().readByte()) == 0) {
                String var17 = var0.reader().readUTF();
                hso_ft.h.a(var17, (byte) 1, hso_df.ep, 0);
                return;
            }

            if (var2 == 4 || var2 == 1) {
                if (var2 == 4) {
                    var1 = var0.reader().readUTF();
                    var0.reader().readByte();
                }

                int var3 = 1;
                if (var2 == 4) {
                    var3 = var0.reader().readUnsignedByte();
                }

                (new StringBuffer("friend sizelist= ")).append(var3).append(" type=").append(var2).toString();
                hso_es var4 = new hso_es("ReadMessenge vec6");

                for (int var5 = 0; var5 < var3; ++var5) {
                    (new StringBuffer("friend list i=")).append(var5).toString();
                    String var6 = var0.reader().readUTF();
                    (new StringBuffer("friendname list i=")).append(var6).toString();
                    byte var7 = var0.reader().readByte();
                    byte var8 = var0.reader().readByte();
                    byte var9 = var0.reader().readByte();
                    (new StringBuffer("friendhair list i=")).append(var9).toString();
                    short var10 = var0.reader().readShort();
                    byte var11 = var0.reader().readByte();
                    (new StringBuffer("frienditemsize list i=")).append(var11).toString();
                    byte[] var12 = new byte[12];
                    (new StringBuffer("friend11 list i=")).append(var5).toString();

                    int var13;
                    for (var13 = 0; var13 < var12.length; ++var13) {
                        var12[var13] = -1;
                    }

                    for (var13 = 0; var13 < var11; ++var13) {
                        byte var14 = var0.reader().readByte();
                        byte var15 = var0.reader().readByte();
                        var12[var15] = var14;
                    }

                    (new StringBuffer("friend22 list i=")).append(var5).toString();
                    byte var18 = var0.reader().readByte();
                    MainObject var19 = new MainObject(0, (byte) 0, var6, 0, 0);
                    short var20;
                    if ((var20 = var0.reader().readShort()) >= 0) {
                        var19.cO = new hso_em(0, var20, var0.reader().readUTF(), var0.reader().readByte());
                    }

                    (new StringBuffer("friend33 list i=")).append(var5).toString();
                    var19.a(var7, var8, (int) var9);
                    var19.cw = var18;
                    var19.by = var10;
                    var19.a(var12);
                    var19.cD = hso_df.ac + var10;
                    (new StringBuffer("friend44 list i=")).append(var5).toString();
                    if (var2 == 1) {
                        hso_ft.c(var19.cB + hso_df.dL);
                        hso_ag.b.a(var19);
                        if (hso_ag.b().i == 0) {
                            hso_ag.b().h();
                            hso_ag.b().i();
                            hso_ag.b().j();
                        }
                    } else {
                        var4.a(var19);
                    }

                    (new StringBuffer("ok i roi i=")).append(var5).toString();
                }

                if (var2 == 4) {
                    hso_ag.b.d();
                    hso_ag.b().i = 0;
                    hso_ag.b = var4;
                    hso_ag.b().a = var4;
                    hso_ag.b().a((byte) 0);
                    hso_ag.b().k();
                    hso_ag.b().h();
                    hso_ag.b().i();
                    hso_ag.b().j();
                    hso_ag.b().g = var1;
                    hso_ag.b().h = 99;
                    hso_ag.f = true;
                    if (hso_ft.a != hso_ag.b()) {
                        if (hso_ft.a.c != hso_ag.b()) {
                            hso_ag.b().a(hso_ft.a);
                        } else {
                            hso_ag.b().a((hso_p) hso_ft.c);
                        }
                    } else {
                        hso_ft.j();
                    }
                }

                hso_ft.j();
                return;
            }
        } catch (Exception var16) {
        }

    }

    public static void I(Message var0) {
        try {
            byte var2 = var0.reader().readByte();
            hso_ft.J = hso_dw.a() + (long) (var2 * 1000);
            GameScreen.f.N();
            ISession.a().c();
            GameScreen.f = new Player(0, (byte) 0, "unname", 0, 0);
        } catch (Exception var1) {
        }
    }

    public static void J(Message var0) {
        try {
            hso_ft.a(var0.reader().readUTF());
            boolean var1 = false;

            byte var4;
            try {
                var4 = var0.reader().readByte();
            } catch (Exception var2) {
                var4 = 0;
            }

            if (var4 == 0) {
                hso_bv.c = false;
            }

            if (var4 == 1) {
                hso_bv.c = true;
                return;
            }
        } catch (Exception var3) {
        }

    }

    public static void K(Message var0) {
        try {
            boolean var1 = var0.reader().readBoolean();
            String var3 = var0.reader().readUTF();
            if (var1) {
                hso_ft.b.a = 0;
                hso_ft.b.j();
            }

            hso_ft.a(var3);
        } catch (Exception var2) {
        }
    }

    public final void L(Message var1) {
        try {
            byte var2;
            int var3;
            hso_w var6;
            if ((var2 = var1.reader().readByte()) == 0) {
                Player.N = new hso_w(GameScreen.f.cB, GameScreen.f.by, hso_ft.p.d, hso_cs.b());
                hso_ft.a(hso_df.cj);
            } else if (var2 == 1) {
                this.y = var1.reader().readUTF();
                hso_ft.h.a(this.y, (byte) 2, hso_df.eq, 0);
            } else if (var2 != 2) {
                switch (var2) {
                    case 3:
                        hso_ft.a(hso_df.cg);
                        Player.N = null;
                        break;
                    case 4:
                        hso_ft.a(hso_df.ch);
                        Player.N = null;
                        break;
                    case 5:
                        hso_ft.a(hso_df.ci);
                        Player.N = null;
                        break;
                    default:
                        break;
                }
            } else {
                var6 = null;
                var2 = var1.reader().readByte();
                var3 = 0;

                while (true) {
                    if (var3 >= var2) {
                        Player.N = var6;
                        hso_ah.a = -1;
                        break;
                    }

                    if (var3 == 0) {
                        var6 = new hso_w(var1.reader().readUTF(), var1.reader().readShort(), var1.reader().readUnsignedByte(), var1.reader().readByte());
                    } else {
                        var6.a(var1.reader().readUTF(), var1.reader().readShort(), var1.reader().readUnsignedByte(), var1.reader().readByte());
                    }

                    ++var3;
                }
            }

            if (Player.N != null) {
                var6 = Player.N;

                int var7;
                for (var7 = 0; var7 < var6.b.c(); ++var7) {
                    ((hso_aj) var6.b.a(var7)).j = false;
                }

                for (var7 = 0; var7 < GameScreen.i.c(); ++var7) {
                    MainObject var8;
                    if ((var8 = (MainObject) GameScreen.i.a(var7)).cu == 0 && var8 != GameScreen.f) {
                        var8.cX = false;

                        for (var3 = 0; var3 < var6.b.c(); ++var3) {
                            hso_aj var4;
                            if (!(var4 = (hso_aj) var6.b.a(var3)).j && var4.b.compareTo(var8.cB) == 0) {
                                var8.cX = true;
                                var4.j = true;
                                break;
                            }
                        }
                    }
                }

                return;
            }
        } catch (Exception var5) {
        }

    }

    public final void M(Message var1) {
        try {
            byte var2;
            if ((var2 = var1.reader().readByte()) == 0) {
                this.z = var1.reader().readUTF();
                hso_ft.h.a(this.z, (byte) 3, hso_df.er, 0);
                return;
            }

            String var20;
            if (var2 == 1) {
                var20 = var1.reader().readUTF();
                (hso_ft.x = new hso_ec()).a(var20);
                hso_ft.x.a(hso_ft.a);
                return;
            }

            byte var19;
            if (var2 == 2 || var2 == 3) {
                var19 = var1.reader().readByte();
                byte var3 = var1.reader().readByte();
                short var4 = var1.reader().readShort();
                short var5 = var1.reader().readShort();
                short var6 = 1;
                byte var7 = 0;
                byte var8 = 0;
                short var9 = 0;
                byte var10 = 0;
                String var11 = "";
                String var12 = null;
                hso_cz[] var13 = null;
                if (var3 == 4) {
                    var6 = var1.reader().readShort();
                    hso_fo var22;
                    var12 = (var22 = (hso_fo) hso_fo.m.a("" + var4)).j;
                    var11 = var22.c;
                } else if (var3 == 3) {
                    var11 = var1.reader().readUTF();
                    var7 = var1.reader().readByte();
                    var8 = var1.reader().readByte();
                    var9 = var1.reader().readShort();
                    var10 = var1.reader().readByte();
                    byte var21;
                    var13 = new hso_cz[var21 = var1.reader().readByte()];

                    for (int var15 = 0; var15 < var21; ++var15) {
                        int var16 = var1.reader().readUnsignedByte();
                        int var17 = var1.reader().readInt();
                        var13[var15] = new hso_cz(var16, var17);
                    }
                } else if (var3 == 7) {
                    var6 = var1.reader().readShort();
                    hso_j var14;
                    if ((var14 = hso_bw.b(var4)) != null) {
                        var12 = var14.h;
                        var11 = var14.g;
                    } else {
                        var12 = "";
                        var11 = "";
                    }
                }

                hso_ec.a(new hso_j(var4, var11, var6, var5, var3, var12, var13, var7, var8, var9, var10, (byte) 0, (byte) 0), var2, var19);
                return;
            }

            if (var2 == 4) {
                hso_ft.x.g = var1.reader().readByte();
                if (hso_ft.x.g == 1) {
                    hso_ft.x.aa = null;
                    hso_ft.x.Y = null;
                }

                if (hso_ft.x.g == 2) {
                    hso_ft.x.aa = null;
                    hso_ft.x.Y = hso_ft.x.h;
                    hso_ft.x.b();
                    return;
                }
            } else if (var2 == 5) {
                if ((var19 = var1.reader().readByte()) == 0) {
                    hso_ft.x.Y = null;
                    hso_ft.x.Z = null;
                    hso_ft.x.aa = new hso_bt(hso_df.as, 8);
                    hso_ft.x.b();
                    hso_ft.x.b = 0;
                    hso_ft.a(hso_df.cP + hso_ft.x.a + hso_df.cQ);
                    return;
                }

                if (var19 == 1) {
                    hso_ft.x.b = 1;
                    return;
                }

                if (var19 == 2) {
                    if (hso_ft.x.c.c != null) {
                        hso_ft.x.c.a(hso_ft.x.c.c);
                    } else {
                        hso_ft.x.c.c();
                    }

                    hso_ft.x = null;
                    hso_ft.a(hso_df.cq);
                    return;
                }
            } else {
                if (var2 == 6) {
                    if (hso_ft.x.c.c != null) {
                        hso_ft.x.c.a(hso_ft.x.c.c);
                    } else {
                        hso_ft.x.c.c();
                    }

                    hso_ft.x = null;
                    hso_ft.a(hso_df.cm);
                    return;
                }

                if (var2 == 7) {
                    hso_ft.x.f[1] = var1.reader().readInt();
                    return;
                }

                if (var2 == 8) {
                    hso_ft.x.f[0] = var1.reader().readInt();
                    return;
                }

                if (var2 == 9) {
                    var20 = var1.reader().readUTF();
                    hso_ft.x.i[1] = var20;
                    return;
                }
            }
        } catch (Exception var18) {
        }

    }

    public static void N(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            byte var2 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            byte var4 = var0.reader().readByte();
            int var5 = var0.reader().readInt();
            short var6 = var0.reader().readShort();
            byte var7 = var0.reader().readByte();
            MainObject var8 = null;
            if (var2 == 6) {
                var8 = MainObject.a(var3, (byte) 9);
            } else if (var2 == 4) {
                var8 = MainObject.a(var3, (byte) 1);
            } else {
                var8 = MainObject.a(var3, (byte) 0);
            }

            MainObject var13 = MainObject.a(var6, var7);
            if (var8 != null && !var8.cK && var8 != GameScreen.f && var1 == 0 && var8.cF != 4 && var8.cF != 2) {
                if (var13 != null) {
                    if (var2 == 4 && var13 == var8 && !var13.cK) {
                        GameScreen.b(hso_ct.a[var2][var4], var8.ct, var8.cu, var8.ct, var8.cu, 0, var8.br, (byte) hso_ct.b[var2][var4]);
                    }
                } else {
                    hso_es var10 = new hso_es("ReadMessenge vec");
                    hso_bf var14 = new hso_bf((short) var8.ct, var8.cu);
                    var10.a(var14);
                    if (var2 == 6) {
                        hso_s var15;
                        (var15 = (hso_s) var8).a((byte) 2);
                    }

                    var8.dh.a(var8, var10, var4, var2);
                }
            }

            if (var13 != null && !var13.cK) {
                var13.b(hso_ct.b[var2][var4], var5, 0);
                hso_ei var11;
                if (var13 == GameScreen.f && (var11 = hso_ei.a(hso_ct.b[var2][var4], 0)) != null) {
                    var0.reader().readByte();
                    byte var16 = var0.reader().readByte();
                    var11.m = new hso_cz[var16];
                    hso_cz[] var17 = new hso_cz[var16];

                    for (int var12 = 0; var12 < var17.length; ++var12) {
                        var17[var12] = new hso_cz(var0.reader().readUnsignedByte(), var0.reader().readInt());
                    }

                    var11.m = var17;
                    return;
                }
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

    public final void O(Message var1) {
        try {
            a(var1, (byte) 0, (byte) 0);
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void P(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            short var2 = var0.reader().readShort();
            short var3 = var0.reader().readShort();
            byte var5 = var0.reader().readByte();
            MainObject var6 = MainObject.a(var1, (byte) 0);
            MainObject var7;
            if ((var7 = MainObject.a(var2, var5)) != null && !var7.cK && var5 == 0) {
                var7.cA = var3;
            }

            if (var6 == null || var6.cK || var6.cF == 4) {
                return;
            }

            var6.br = 0;
            var6.N();
            var6.cF = 4;
            var6.aW = hso_ft.aj;
            GameScreen.a(11, var6.aY, var6.aZ);
            if (GameScreen.f == var6 && !hso_cf.b(hso_ft.p.d)) {
                if (hso_cs.w == 1) {
                    GameScreen.b().aa = Player.c;
                    Player.c.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, Player.c.a);
                    return;
                }

                if (hso_cs.w == 2) {
                    GameScreen.b().aa = Player.b;
                    Player.b.a(hso_ft.Y, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, Player.b.a);
                    return;
                }

                if (!hso_cf.i()) {
                    GameScreen.b().Y = Player.b;
                    GameScreen.b().Z = Player.c;
                    Player.b.a(hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, Player.b.a);
                    Player.c.a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce) null, Player.c.a);
                    return;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static void Q(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            byte var2 = var0.reader().readByte();
            MainObject var5;
            if ((var5 = MainObject.a(var1, (byte) 0)) != null && !var5.cK) {
                var5.cv = var2;
                if (var5 == GameScreen.f) {
                    GameScreen.f.cA = var0.reader().readShort();
                    String var4 = hso_df.cw + " " + hso_df.cu;
                    if (GameScreen.f.cv != 0) {
                        var4 = hso_df.cv + " " + hso_df.cu;
                    }

                    GameScreen.b().C.a = var4;
                    if (var2 > 0) {
                        Service.a().c((byte) 2, "");
                        return;
                    }
                }
            }
        } catch (Exception var3) {
        }

    }

    private static void a(Message var0, byte var1, byte var2) {
        try {
            if (!hso_eg.g) {
                return;
            }

            MainObject var3;
            short var16;
            if ((var3 = MainObject.a(var16 = var0.reader().readShort(), (byte) 0)) == null || var3.cK) {
                return;
            }

            byte var4 = var0.reader().readByte();
            byte var5;
            if ((var5 = var0.reader().readByte()) <= 0) {
                return;
            }

            hso_es var6 = new hso_es("ReadMessenge vec5");

            int var7;
            int var10;
            int var11;
            MainObject var22;
            for (var7 = 0; var7 < var5; ++var7) {
                short var8 = var0.reader().readShort();
                hso_bf var9 = new hso_bf(var8, var2);
                var10 = var0.reader().readInt();
                var11 = var0.reader().readInt();
                var9.a(var10, var11);
                int var13;
                if (var8 == GameScreen.f.ct) {
                    int var12 = GameScreen.f.bs;
                    var13 = var10 / var12 * 100;
                    GameScreen.f.a((byte) 4, var13 > 20);
                }

                byte var20 = var0.reader().readByte();
                var9.e = new int[var20];
                var9.f = new int[var20];

                for (var13 = 0; var13 < var20; ++var13) {
                    var9.e[var13] = var0.reader().readByte();
                    var9.f[var13] = var0.reader().readInt();
                }

                if ((var22 = MainObject.a(var9.a, var2)) != null && !var22.cK) {
                    var6.a(var9);
                }
            }

            var7 = var0.reader().readInt();
            int var18 = var0.reader().readInt();
            byte var19 = var0.reader().readByte();
            var10 = var0.reader().readInt();
            if (var16 == GameScreen.f.ct) {
                for (var11 = 0; var11 < var6.c(); ++var11) {
                    hso_bf var21;
                    if ((var22 = MainObject.a((var21 = (hso_bf) var6.a(var11)).a, var2)) != null && !var22.cK) {
                        int var15 = 2;
                        int var17;
                        if (var3 != null && !var3.cK && (var17 = hso_i.a(var21.e, var3, var22, var21.f)) != -1) {
                            var15 = var17;
                        }

                        if (var22.ct != GameScreen.f.ct) {
                            if (var21.c == 0) {
                                GameScreen.a(hso_df.cx, var22.aY, var22.aZ - var22.be, 6, var22.ct);
                            } else {
                                GameScreen.a("-" + var21.c, var22.aY, var22.aZ - var22.be, var15, var22.ct);
                            }

                            if (var10 > 0) {
                                GameScreen.a("-" + var10, var22.aY, var22.aZ - var22.be, var19, var22.ct);
                            }
                        }

                        var22.br = var21.d;
                        if (var22.cu == 1 && var22.br <= 0) {
                            MainObject.a((hso_au) ((hso_au) var22), var16, hso_ak.f(3));
                            if (var22.dA >= 0) {
                                hso_ew.a(var22.ct);
                            }
                        }
                    }
                }
            } else if (var3 != null && !var3.cK && var6.c() > 0) {
                var3.cN = null;
                var3.cR = var6;
                var3.dh.a(var3, var6, var4, (byte) -1);
            }

            if (var3 != null && !var3.cK) {
                var3.br = var7;
                var3.bt = var18;
                return;
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }

    }

    public static void R(Message var0) {
        try {
            MainObject var1;
            (var1 = new MainObject()).ct = var0.reader().readShort();
            var1.cB = var0.reader().readUTF();
            var1.bx = var0.reader().readByte();
            var1.bX = var0.reader().readByte();
            var1.ca = var0.reader().readByte();
            var1.cb = var0.reader().readByte();
            var1.by = var0.reader().readShort();
            var1.br = var0.reader().readInt();
            var1.bs = var0.reader().readInt();
            var1.cv = var0.reader().readByte();
            var1.cA = var0.reader().readShort();
            byte var2;
            byte[] var3 = new byte[var2 = var0.reader().readByte()];

            int var4;
            for (var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = -1;
            }

            hso_fw.f.a.clear();

            byte var5;
            byte var11;
            byte var12;
            for (var4 = 0; var4 < var2; ++var4) {
                if ((var5 = var0.reader().readByte()) <= -1) {
                    var3[var4] = -1;
                } else {
                    String var7 = var0.reader().readUTF();
                    byte var8 = var0.reader().readByte();
                    byte var9 = var0.reader().readByte();
                    short var10 = var0.reader().readShort();
                    var11 = var0.reader().readByte();
                    var12 = var0.reader().readByte();
                    short var13 = var0.reader().readShort();
                    byte var14 = var0.reader().readByte();
                    var3[var4] = var11;
                    byte var15;
                    hso_cz[] var16 = new hso_cz[var15 = var0.reader().readByte()];

                    for (int var17 = 0; var17 < var15; ++var17) {
                        int var18 = var0.reader().readUnsignedByte();
                        int var19 = var0.reader().readInt();
                        var16[var17] = new hso_cz(var18, var19);
                    }

                    byte var39 = var0.reader().readByte();
                    hso_j var6;
                    (var6 = hso_j.a(var5, var7, var10, var12, var14, var8, 3, var16, var9, false, (short) -1, 0L, var13, (byte) 0, (byte) 0, 0, (byte) 0, (byte) 0)).E = var39;
                    hso_fw.f.a("" + var5, var6);
                }
            }

            var1.b(var3);
            short var28;
            if ((var28 = var0.reader().readShort()) >= 0) {
                var1.cO = new hso_em(0, var28, var0.reader().readUTF(), var0.reader().readByte());
                var1.cO.d = var0.reader().readUTF();
            }

            if ((var5 = var0.reader().readByte()) > -1) {
                String var29 = var0.reader().readUTF();
                byte var31 = var0.reader().readByte();
                short var32 = var0.reader().readShort();
                short var33 = var0.reader().readShort();
                byte var34 = var0.reader().readByte();
                var11 = var0.reader().readByte();
                var12 = var0.reader().readByte();
                byte var35 = var0.reader().readByte();
                int var36 = var0.reader().readInt();
                short var37 = var0.reader().readShort();
                short var38 = var0.reader().readShort();
                short var40 = var0.reader().readShort();
                short var41 = var0.reader().readShort();
                short var42 = var0.reader().readShort();
                short var27 = var0.reader().readShort();
                var28 = var0.reader().readShort();
                byte var20;
                hso_cz[] var21 = new hso_cz[var20 = var0.reader().readByte()];

                for (int var22 = 0; var22 < var20; ++var22) {
                    int var23 = var0.reader().readUnsignedByte();
                    int var24 = var0.reader().readInt();
                    int var25 = var0.reader().readInt();
                    var21[var22] = new hso_cz(var23, var24, var25);
                }

                hso_ea var43;
                (var43 = new hso_ea(var5, var29, var34, var35, var31, 9, var21, 14, var32, var34, var12, var11)).a(var36, var37, var40, var41, var42, var27, var38, var28, var33);
                hso_fw.f.a("" + var5, var43);
                var3[5] = var34;
                hso_fw.a = var43;
            } else {
                hso_fw.a = null;
            }

            hso_fw.b = var1;
            byte var30 = var0.reader().readByte();
            if (hso_ft.l == null) {
                hso_ft.l = new hso_fw();
            }

            hso_ft.l.a(var30);
            hso_ft.l.a(hso_ft.a);
        } catch (Exception var26) {
            var26.printStackTrace();
        }
    }

    public static void S(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            MainObject var5;
            if ((var5 = MainObject.a(var0.reader().readShort(), var1)) != null && !var5.cK) {
                byte var2 = var0.reader().readByte();
                byte var4 = var0.reader().readByte();
                hso_ei.a(var2, var4, var5);
                return;
            }
        } catch (Exception var3) {
        }

    }

    public static void T(Message var0) {
        try {
            hso_eg.g = false;
            if (hso_ft.a != hso_ft.d) {
                hso_ft.d.c();
            }

            GameScreen.l();
            hso_eg.g = true;
            hso_cs.u = var0.reader().readByte();
            GameScreen.f.aY = var0.reader().readShort() * 24;
            GameScreen.f.aZ = var0.reader().readShort() * 24;
            GameScreen.f.u();
            GameScreen.f.cN = null;
            GameScreen.f.N();
            if (GameScreen.g != null) {
                GameScreen.g.aY = GameScreen.f.aY;
                GameScreen.g.aZ = GameScreen.f.aZ;
                GameScreen.g.c();
            }

            hso_ft.j();
            hso_ft.m();
            hso_ft.d.b = false;
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public static void U(Message var0) {
        try {
            hso_cs.o = new int[hso_cs.v = var0.reader().readByte()];
            String[] var1 = new String[hso_cs.v];

            int var2;
            for (var2 = 0; var2 < hso_cs.v; ++var2) {
                hso_cs.o[var2] = var0.reader().readByte();
                byte var3;
                if ((var3 = var0.reader().readByte()) != 0) {
                    hso_cs.o[var2] = var3;
                }
            }

            for (var2 = 0; var2 < hso_cs.v; ++var2) {
                var1[var2] = var0.reader().readUTF();
            }

            hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
            hso_es var6 = new hso_es("ReadMessenge menu4");

            for (int var7 = 0; var7 < hso_cs.v; ++var7) {
                hso_bt var5;
                (var5 = new hso_bt(var1[var7], 13, var7, GameScreen.b())).a((hso_ce) hso_cf.s, 1, hso_cs.o[var7]);
                var6.a(var5);
            }

            hso_ft.o.a(var6, 2, hso_df.cX, false, (hso_es) null);
            hso_ft.j();
        } catch (Exception var4) {
        }
    }

    public static void V(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var2;
            MainObject var3;
            if ((var3 = MainObject.e(var2 = var0.reader().readShort(), var1)) != null && !var3.cK) {
                if (var1 == 1) {
                    if (var3.cx == 4) {
                        if (var0.reader().readByte() == 0) {
                            var3.dq = true;
                            var3.bi = 6;
                            return;
                        }

                        var3.cL = true;
                        return;
                    }

                    if (var3.cx == 3) {
                        if (var0.reader().readByte() == 0) {
                            var3.dq = true;
                            var3.bi = 6;
                            return;
                        }

                        var3.cL = true;
                        return;
                    }

                    if (var3.cx == 2) {
                        if (var0.reader().readByte() == 1) {
                            GameScreen.a(80, var3.aY, var3.aZ - 70, 200, var2, (byte) 1);
                            var3.cL = true;
                            return;
                        }

                        var3.cL = true;
                        MainObject.de = null;
                        return;
                    }

                    var3.cL = true;
                    return;
                }

                if (var1 == 2) {
                    if (var0.reader().readByte() == 1) {
                        var3.dq = true;
                        hso_cs.i = hso_cs.j;
                        return;
                    }

                    GameScreen.a(35, var3.aY, var3.aZ - 20);
                    var3.cL = true;
                    return;
                }

                if (var1 == 0) {
                    GameScreen.a(35, var3.aY, var3.aZ - 20);
                }

                var3.cL = true;
                return;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static void W(Message var0) {
        System.out.println("readMessenge.W(===============)");
        try {
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            byte[] var3 = null;
            if (var2 > 0) {
                var3 = new byte[var2];

                for (int var4 = 0; var4 < var3.length; ++var4) {
                    var3[var4] = var0.reader().readByte();
                }
            }

            (new StringBuffer("nhan k=")).append(var1).append("   di=").append(var2).toString();
            hso_co.a(var1, var3);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    public static void X(Message var0) {
        try {
            byte var1;
            Player.T = new short[var1 = var0.reader().readByte()];

            for (int var2 = 0; var2 < var1; ++var2) {
                Player.T[var2] = var0.reader().readShort();
            }

        } catch (Exception var3) {
        }
    }

    public static void Y(Message var0) {
        try {
            String var1 = null;
            byte var2 = var0.reader().readByte();
            var1 = var0.reader().readUTF();
            byte var3 = var0.reader().readByte();
            int var4 = var0.reader().readInt();
            int var5 = var0.reader().readUnsignedByte();
            hso_es var6 = new hso_es("ReadMessenge vec8");
            int var7;
            String var8;
            if (var2 == 3) {
                for (var7 = 0; var7 < var5; ++var7) {
                    var8 = var0.reader().readUTF();
                    int var9 = var0.reader().readInt();
                    short var10 = var0.reader().readShort();
                    String var11 = var0.reader().readUTF();
                    String var12 = var0.reader().readUTF();
                    hso_em var13;
                    (var13 = new hso_em(var9, var10, var11, (byte) 122)).d = var8;
                    var13.e = var12;
                    if (var4 > var5 && var7 == var5 - 1) {
                        var13.k = var4;
                    } else {
                        var13.k = var7;
                    }

                    var6.a(var13);
                }
            } else {
                for (var7 = 0; var7 < var5; ++var7) {
                    var8 = var0.reader().readUTF();
                    byte var22 = var0.reader().readByte();
                    byte var23 = var0.reader().readByte();
                    byte var24 = var0.reader().readByte();
                    short var25 = var0.reader().readShort();
                    byte var26 = var0.reader().readByte();
                    byte[] var14 = new byte[12];

                    int var15;
                    for (var15 = 0; var15 < var14.length; ++var15) {
                        var14[var15] = -1;
                    }

                    for (var15 = 0; var15 < var26; ++var15) {
                        byte var16 = var0.reader().readByte();
                        byte var17 = var0.reader().readByte();
                        var14[var17] = var16;
                    }

                    byte var27 = var0.reader().readByte();
                    String var28 = var0.reader().readUTF();
                    MainObject var29 = new MainObject(0, (byte) 0, var8, 0, 0);
                    short var20;
                    if ((var20 = var0.reader().readShort()) >= 0) {
                        var29.cO = new hso_em(0, var20, var0.reader().readUTF(), var0.reader().readByte());
                    }

                    var29.a(var22, var23, (int) var24);
                    var29.cw = var27;
                    var29.by = var25;
                    var29.a(var14);
                    var29.cD = var28;
                    if (var4 > var5 && var7 == var5 - 1) {
                        var29.bD = var4;
                    } else {
                        var29.bD = var7;
                    }

                    var6.a(var29);
                }
            }

            if (var6.c() != 0) {
                MainObject var19;
                if (var2 == 1) {
                    if (var4 > var5) {
                        (var19 = new MainObject(0, (byte) 0, "...", 0, 0)).bD = -1;
                        var6.b(var19, var5 - 1);
                    }
                } else if (var2 == 3) {
                    if (var4 > var5) {
                        hso_em var21;
                        (var21 = new hso_em(0, (short) -1, "...", (byte) 122)).k = -1;
                        var6.b(var21, var5 - 1);
                    }
                } else if (var2 == 6 && var4 > var5) {
                    (var19 = new MainObject(0, (byte) 0, "...", 0, 0)).bD = -1;
                    var6.b(var19, var5 - 1);
                }

                hso_ag.b().a = var6;
                hso_ag.b().a(var2);
                hso_ag.b().k();
                hso_ag.b().h();
                hso_ag.b().i();
                hso_ag.b().j();
                hso_ag.b().g = var1;
                hso_ag.b().h = var3;
                if (hso_ft.a != hso_ag.b()) {
                    if (hso_ft.a.c != hso_ag.b()) {
                        hso_ag.b().a(hso_ft.a);
                    } else {
                        hso_ag.b().a((hso_p) hso_ft.c);
                    }
                } else {
                    hso_ft.j();
                }
            }
        } catch (Exception var18) {
            var18.printStackTrace();
        }
    }

    public static void Z(Message var0) {
        try {
            Player.e = var0.reader().readInt();
            Player.i = var0.reader().readInt();
        } catch (Exception var1) {
        }
    }

    public static void aa(Message var0) {
        try {
            MainObject var1;
            if ((var1 = MainObject.a(var0.reader().readByte(), (byte) 2)) != null && !var1.cK) {
                var1.cE = var0.reader().readUTF();
                return;
            }
        } catch (Exception var2) {
        }

    }

    public static void ab(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            String var2 = var0.reader().readUTF();
            byte var4 = var0.reader().readByte();
            if (GameScreen.f != null && GameScreen.f.cF != 2 && GameScreen.f.cF != 4) {
                GameScreen.f.N();
                GameScreen.f.cN = null;
            }

            if (var4 == 15) {
                hso_ft.a(var1, var4);
            } else if (var2.length() == 0) {
                hso_ft.a(var1);
            } else {
                hso_ft.a(var1, var2);
            }
        } catch (Exception var3) {
        }
    }

    public static void ac(Message var0) {
        try {
            int var1;
            String[] var2 = new String[var1 = var0.reader().readUnsignedByte()];

            int var3;
            for (var3 = 0; var3 < var1; ++var3) {
                var2[var3] = var0.reader().readUTF();
            }

            hso_ck.a = var2;
            byte var9;
            String[] var5 = new String[var9 = var0.reader().readByte()];

            int var6;
            for (var6 = 0; var6 < var9; ++var6) {
                var5[var6] = var0.reader().readUTF();
            }

            hso_dr.b = var5;
            byte var8;
            hso_c.j = new String[var8 = var0.reader().readByte()];
            hso_c.q = new short[var8];
            hso_c.p = new int[var8];

            for (var1 = 0; var1 < var8; ++var1) {
                hso_c.q[var1] = var0.reader().readShort();
                hso_j var10;
                if ((var10 = hso_bw.b(hso_c.q[var1])) != null) {
                    hso_c.j[var1] = var10.g;
                }
            }

            byte var7;
            hso_c.k = new hso_b[var7 = var0.reader().readByte()];

            for (var3 = 0; var3 < var7; ++var3) {
                hso_c.k[var3] = new hso_b();
                var0.reader().readByte();
                hso_c.k[var3].c = var0.reader().readInt();
                hso_c.k[var3].d = var0.reader().readShort();
                hso_c.k[var3].e = new byte[4];

                for (var6 = 0; var6 < 4; ++var6) {
                    hso_c.k[var3].e[var6] = var0.reader().readByte();
                }
            }

        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public static void ad(Message var0) {
        try {
            Player.A = var0.reader().readByte();
            Player.j = hso_ft.aj;
            Player.g = var0.reader().readShort();
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    public static void ae(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            (new StringBuffer()).append(var2).toString();
            byte[] var3 = new byte[var0.reader().readInt()];
            var0.reader().read(var3);
            int var4 = 0;
            if (var0.reader().available() > 0) {
                var4 = var0.reader().available();
            }

            byte[] var5 = new byte[1];
            if (var4 > 0) {
                var5 = new byte[var4];
                var0.reader().read(var5);
            }

            if (var1 < 100) {
                hso_aq var7 = aq.a(var3);
                hso_cw var11;
                if (var1 < 50) {
                    if ((var11 = (hso_cw) hso_fe.a.a(var1 + "_" + var2)) == null) {
                        var11 = new hso_cw(var7, var5);
                        hso_fe.a.a(var1 + "_" + var2, var11);
                    } else {
                        var11.a = var7;
                        var11.c = var5;
                    }
                } else if ((var11 = (hso_cw) hso_ak.a.a(var1 - 50 + "_" + var2)) == null) {
                    var11 = new hso_cw(var7, var5);
                    hso_ak.a.a(var1 - 50 + "_" + var2, var11);
                } else {
                    var11.a = var7;
                    var11.c = var5;
                }
            } else if (var1 == 110) {
                hso_ay var8;
                if ((var8 = (hso_ay) hso_ay.a.a("" + var2)) != null) {
                    var8.b = hso_ft.aj;
                    var8.c = aq.a(var3);
                }
            } else if (var1 == 111) {
                hso_cr var9;
                if ((var9 = (hso_cr) hso_cr.a.a("" + var2)) != null) {
                    var9.b = hso_ft.aj;
                    var9.c = aq.a(var3);
                }

                hso_cb var12;
                if ((var12 = (hso_cb) hso_dq.b.a("" + var2)) != null) {
                    hso_ak.a("data_eff" + var2, var5);
                    var12.b = hso_ft.aj;
                    var12.a = var5;
                }
            } else {
                hso_el var10;
                if (var1 == 112) {
                    if ((var10 = (hso_el) hso_fp.b.a("" + var2)) != null) {
                        var10.b = hso_ft.aj;
                        var10.a = aq.a(var3);
                    }

                    hso_dj var13;
                    if ((var13 = (hso_dj) hso_at.j.a("" + var2)) != null) {
                        var13.b = hso_ft.aj;
                        var13.a = var5;
                    }
                } else if (var1 == 113) {
                    if ((var10 = (hso_el) hso_fp.b.a("" + var2)) != null) {
                        var10.b = hso_ft.aj;
                        var10.a = aq.a(var3);
                    }

                    hso_at var14;
                    if ((var14 = MainObject.g(var2)) != null) {
                        var14.a(var5);
                    }
                }
            }

            ++hso_ah.h;
        } catch (Exception var6) {
            hso_dw.a("loi ne " + var6.toString());
        }
    }

    public static void af(Message var0) {
        try {
            byte var1;
            byte var5;
            short var33;
            int var36;
            byte var39;
            if ((var1 = var0.reader().readByte()) == 100) {
                if (var1 == 100) {
                    var33 = var0.reader().readShort();
                    var36 = var0.reader().readUnsignedByte();
                    var39 = var0.reader().readByte();
                    var5 = var0.reader().readByte();
                    MainObject var37;
                    if ((var39 == 0 || var39 == 1) && (var37 = MainObject.a(var33, var39)) != null) {
                        int var35;
                        hso_dq var44;
                        if (var5 == 0) {
                            for (var35 = 0; var35 < var37.du.c(); ++var35) {
                                if ((var44 = (hso_dq) var37.du.a(var35)) != null && var44.e == var36) {
                                    var37.du.d(var44);
                                }
                            }

                            return;
                        }

                        if (var5 == 1) {
                            for (var35 = 0; var35 < var37.dv.c(); ++var35) {
                                if ((var44 = (hso_dq) var37.dv.a(var35)) != null && var44.e == var36) {
                                    var37.dv.d(var44);
                                }
                            }

                            return;
                        }
                    }
                }
            } else {
                int var2;
                byte[] var3;
                int var4;
                short var32;
                byte var43;
                if (var1 == 4) {
                    var3 = new byte[var0.reader().readShort()];

                    for (var4 = 0; var4 < var3.length; ++var4) {
                        var3[var4] = var0.reader().readByte();
                    }

                    short var42 = var0.reader().readShort();
                    var5 = var0.reader().readByte();

                    for (var2 = 0; var2 < var5; ++var2) {
                        var32 = var0.reader().readShort();
                        var43 = var0.reader().readByte();
                        MainObject var45;
                        if ((var45 = GameScreen.a(var32, var43)) != null) {
                            hso_dq var48 = new hso_dq(var42, var45.aY, var45.aZ, var3);
                            GameScreen.V.a(var48);
                        }
                    }

                    return;
                }

                if (var1 == 3) {
                    var33 = var0.reader().readShort();
                    byte var38 = var0.reader().readByte();
                    var4 = var0.reader().readUnsignedByte();
                    MainObject var41;
                    if ((var41 = MainObject.a(var33, var38)) != null) {
                        var41.j(var4);
                        return;
                    }
                } else {
                    if (var1 == 101) {
                        var33 = var0.reader().readShort();

                        for (var36 = 0; var36 < hso_cs.b.c(); ++var36) {
                            hso_z var40;
                            if ((var40 = (hso_z) hso_cs.b.a(var36)) != null && var40.l == var33) {
                                hso_cs.b.d(var40);
                            }
                        }

                        return;
                    }

                    var3 = new byte[var0.reader().readShort()];

                    for (var4 = 0; var4 < var3.length; ++var4) {
                        var3[var4] = var0.reader().readByte();
                    }

                    var39 = var0.reader().readByte();
                    var5 = var0.reader().readByte();
                    var2 = var0.reader().readUnsignedByte();
                    byte var7;
                    byte var8;
                    byte var31;
                    switch (var1) {
                        case 0:
                            var32 = var0.reader().readShort();
                            var43 = var0.reader().readByte();
                            var7 = var0.reader().readByte();
                            short var47 = var0.reader().readShort();
                            var31 = var0.reader().readByte();
                            long var12 = (long) (var47 * 1000) + hso_dw.a();
                            MainObject var34;
                            if ((var34 = MainObject.a(var32, var43)) != null) {
                                var34.a(var2, var34.aY, var34.aZ, 0, 0, 0, 0, var3, var7, var12, var31, var39, var5);
                                return;
                            }
                            break;
                        case 1:
                            var32 = var0.reader().readShort();
                            short var6 = var0.reader().readShort();
                            var7 = var0.reader().readByte();
                            var8 = var0.reader().readByte();
                            short var9 = var0.reader().readShort();
                            short var10 = var0.reader().readShort();
                            var31 = var0.reader().readByte();
                            MainObject var49;
                            if (var8 != 0 && var9 != 0 && (var49 = MainObject.a(var9, var31)) != null) {
                                var49.be = var8;
                            }

                            hso_dq var50;
                            if (var7 == 3) {
                                var50 = new hso_dq(var2, var32, var6, 0, 0, var7, 5, var3, var10);
                                GameScreen.V.a(var50);
                                return;
                            }

                            if (var31 == 1) {
                                for (int var51 = 0; var51 < hso_cs.b.c(); ++var51) {
                                    hso_z var46;
                                    if ((var46 = (hso_z) hso_cs.b.a(var51)) != null && var46.l == var9) {
                                        return;
                                    }
                                }

                                (var50 = new hso_dq(var2, var32, var6, 0, 0, var7, 0, var3)).b(var9);
                                hso_cs.b.a(var50);
                                hso_ft.p.a(var32, var6, var39, var5);
                                hso_ak.b(hso_cs.b);
                                return;
                            }

                            (var50 = new hso_dq(var2, var32, var6, 0, 0, var7, 0, var3)).b(var9);
                            hso_cs.b.a(var50);
                            hso_ft.p.a(var32, var6, var39, var5);
                            hso_ak.b(hso_cs.b);
                            return;
                        case 2:
                            short var11 = var0.reader().readShort();
                            var8 = var0.reader().readByte();
                            var1 = var0.reader().readByte();
                            int var30 = var0.reader().readInt();
                            if (var1 == 17) {
                                if (var30 < 0) {
                                    GameScreen.f.a(var2, var3, var39, var5);
                                    return;
                                }

                                if (var30 > 0) {
                                    long var52 = (long) var30 + hso_dw.a();
                                    GameScreen.f.a(var2, var3, var39, var5, var52, var1);
                                    return;
                                }
                                break;
                            } else {
                                MainObject var26;
                                if ((var26 = MainObject.a(var11, var8)) == null) {
                                    break;
                                }

                                if (var30 < 0) {
                                    var26.a(var2, var3, var39, var5);
                                    return;
                                }

                                if (var30 > 0) {
                                    long var27 = (long) var30 + hso_dw.a();
                                    var26.a(var2, var3, var39, var5, var27, var1);
                                    return;
                                }

                                var26.b(var2, var3, var39, var5, 0L, var1);
                            }
                        default:
                            return;
                    }
                }
            }
        } catch (Exception var29) {
            hso_dw.a("loadImageDataAutoEff loi  " + var29.toString());
        }

    }

    public final void ag(Message var1) {
        try {
            short var6 = var1.reader().readShort();
            byte var2;
            String[] var3 = new String[var2 = var1.reader().readByte()];

            for (int var4 = 0; var4 < var2; ++var4) {
                var3[var4] = var1.reader().readUTF();
            }

            String var8 = var1.reader().readUTF();
            String var7 = var1.reader().readUTF();
            if (var6 == 1) {
                hso_ft.j();
                hso_ft.a(var3, new hso_bt(var8, 0), var6, (short) -1, var7);
            } else {
                hso_ft.j();
                hso_ft.a(var3, new hso_bt(var8, 0), var6, (short) -1, var7);
            }
        } catch (Exception var5) {
        }
    }

    public static void ah(Message var0) {
        try {
            if (hso_ft.G != -1) {
                TemMidlet.b();
            }

            byte var2 = var0.reader().readByte();
            byte[] var3 = new byte[]{var2};
            hso_ak.a("isIndexRes", var3);
        } catch (Exception var1) {
        }
    }

    public final void ai(Message var1) {
        this.a(var1, hso_bw.W, (byte) 9);
    }

    private static hso_ea aR(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            byte var2 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            short var5 = var0.reader().readShort();
            byte var6 = var0.reader().readByte();
            byte var7 = var0.reader().readByte();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            int var10 = var0.reader().readInt();
            short var11 = var0.reader().readShort();
            short var12 = var0.reader().readShort();
            short var13 = var0.reader().readShort();
            short var14 = var0.reader().readShort();
            short var15 = var0.reader().readShort();
            short var16 = var0.reader().readShort();
            short var17 = var0.reader().readShort();
            byte var18;
            hso_cz[] var19 = new hso_cz[var18 = var0.reader().readByte()];

            for (int var20 = 0; var20 < var18; ++var20) {
                int var21 = var0.reader().readUnsignedByte();
                int var22 = var0.reader().readInt();
                int var23 = var0.reader().readInt();
                var19[var20] = new hso_cz(var21, var22, var23);
            }

            hso_ea var25;
            (var25 = new hso_ea(var3, var1, var6, var9, var2, 9, var19, 14, var4, var6, var8, var7)).a(var10, var11, var13, var14, var15, var16, var12, var17, var5);
            return var25;
        } catch (Exception var24) {
            return null;
        }
    }

    private static hso_j aS(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            byte var2 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            byte var4 = var0.reader().readByte();
            short var5 = var0.reader().readShort();
            byte var6 = var0.reader().readByte();
            short var7 = var0.reader().readShort();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            byte var10 = var0.reader().readByte();
            byte var11;
            hso_cz[] var12 = new hso_cz[var11 = var0.reader().readByte()];

            int var13;
            for (var13 = 0; var13 < var11; ++var13) {
                int var14 = var0.reader().readUnsignedByte();
                int var15 = var0.reader().readInt();
                var12[var13] = new hso_cz(var14, var15);
            }

            var13 = var0.reader().readInt();
            byte var17 = var0.reader().readByte();
            return new hso_j(var3, var1, var5, var6, var8, var2, 3, var12, var4, false, (short) -1, 0L, var7, var9, var10, var13, (byte) 0, var17);
        } catch (Exception var16) {
            return null;
        }
    }

    public final void aj(Message var1) {
        try {
            var1.reader().readByte();
            byte var6 = var1.reader().readByte();
            byte var2 = var1.reader().readByte();
            boolean var3 = false;
            hso_es var4 = hso_bw.X;
            hso_s var7;
            hso_ea var12;
            if (var6 == 0) {
                hso_fo.a(var2, var4);
                int var11;
                if (var2 == 3) {
                    var1.reader().readByte();
                    var6 = var1.reader().readByte();

                    for (var11 = 0; var11 < var6; ++var11) {
                        hso_j var13 = aS(var1);
                        var4.a(var13);
                    }

                    return;
                }

                if (var2 == 9) {
                    var1.reader().readByte();
                    var6 = var1.reader().readByte();

                    for (var11 = 0; var11 < var6; ++var11) {
                        var12 = aR(var1);
                        var4.a(var12);
                    }

                    if (GameScreen.W) {
                        for (var11 = 0; var11 < hso_bw.X.c(); ++var11) {
                            var7 = (hso_s) MainObject.a((var12 = (hso_ea) var4.a(var11)).O, (byte) 9);
                            if (hso_ft.s != null && hso_ft.s.p == 14 && hso_ah.j == 0) {
                                (new StringBuffer(" Id item pet in MsgDialog = ")).append(hso_ah.i.O).toString();
                                if (hso_ah.i.O == var12.O) {
                                    hso_ah.i = var12;
                                }
                            }

                            if (var7 == null) {
                                GameScreen.a((MainObject) hso_s.a((short) var12.ao, var12.O, var12.an, var12.am));
                            }
                        }

                        return;
                    }
                }
            } else {
                byte var14;
                hso_bw var15;
                if (var6 == 1) {
                    if (var2 == 3) {
                        var14 = var1.reader().readByte();
                        hso_j var9 = aS(var1);
                        if ((var15 = hso_bw.a(var14, (short) var9.O, var4)) == null) {
                            var4.a(var9);
                            return;
                        }

                        var4.a(var9, var4.c(var15));
                        return;
                    }

                    if (var2 == 9) {
                        var14 = var1.reader().readByte();
                        hso_ea var8 = aR(var1);
                        if ((var15 = hso_bw.a(var14, (short) var8.O, var4)) == null) {
                            var4.a(var8);
                        } else {
                            var4.a(var8, var4.c(var15));
                        }

                        if (GameScreen.W) {
                            GameScreen.a((MainObject) hso_s.a((short) var8.ao, var8.O, var8.an, var8.am));
                            return;
                        }
                    }
                } else if (var6 == 2) {
                    var14 = var1.reader().readByte();
                    short var10 = var1.reader().readShort();
                    if ((var15 = hso_bw.a(var14, var10, var4)) != null) {
                        var4.d(var15);
                    }

                    if ((var12 = (hso_ea) var15) != null && var12.ao >= 0 && (var7 = (hso_s) MainObject.e(var12.O, 9)) != null) {
                        GameScreen.i.d(var7);
                        return;
                    }
                }
            }
        } catch (Exception var5) {
        }

    }

    public final void ak(Message var1) {
        try {
            hso_ft.j();
            this.b = var1.reader().readShort();
            this.c = var1.reader().readByte();
            String var4 = var1.reader().readUTF();
            hso_es var2;
            (var2 = new hso_es("ReadMessenge vec4")).a(new hso_bt("Ok", 2, 1, this));
            var2.a(new hso_bt(hso_df.as, 2, 0, this));
            hso_ft.a(var4, var2);
        } catch (Exception var3) {
        }
    }

    private void a(Message var1, hso_es var2, byte var3) {
        try {
            hso_fo.d = false;
            if (var3 == 9) {
                Player.y = var1.reader().readByte();
            }

            byte var51 = var1.reader().readByte();
            byte var4 = var1.reader().readByte();
            int var5;
            if (var3 == 0) {
                long var6 = var1.reader().readLong();
                var5 = var1.reader().readInt();
                GameScreen.f.bC = var6;
                GameScreen.f.bB = (long) var5;
            }

            boolean var56 = false;
            byte var8;
            byte var10;
            byte var14;
            byte var15;
            byte var16;
            int var21;
            short var53;
            byte var57;
            String var62;
            byte var68;
            hso_j var74;
            byte var75;
            hso_j var80;
            byte var93;
            hso_j var96;
            if (var51 == 0) {
                hso_fo.a(var4, var2);
                byte var7;
                short var60;
                if (var4 == 4) {
                    var57 = var1.reader().readByte();
                    var7 = var1.reader().readByte();

                    for (var5 = 0; var5 < var7; ++var5) {
                        var53 = var1.reader().readShort();
                        var60 = var1.reader().readShort();
                        var68 = var1.reader().readByte();
                        var10 = var1.reader().readByte();
                        hso_fo var77 = (hso_fo) hso_fo.m.a("" + var53);
                        (new StringBuffer("content=")).append(var77.j).toString();
                        var80 = new hso_j(var53, var77.b, var77.c, var77.j, var60, var57, var77.h, var77.i, var77.g, var68, var10);
                        var2.a(var80);
                    }

                    if (var3 == 0) {
                        hso_j.a((byte) 1, false);
                        hso_j.a((byte) 0, false);
                    }
                } else {
                    short var9;
                    byte var12;
                    if (var4 != 3) {
                        if (var4 == 5) {
                            var1.reader().readByte();
                            var7 = var1.reader().readByte();
                            (new StringBuffer("size item quest=")).append(var7).toString();

                            for (var5 = 0; var5 < var7; ++var5) {
                                var53 = var1.reader().readShort();
                                var62 = var1.reader().readUTF();
                                var9 = var1.reader().readShort();
                                String var69 = hso_df.dQ;
                                var75 = var1.reader().readByte();
                                var12 = var1.reader().readByte();
                                hso_j var82 = new hso_j(var53, var62, var9, var69, var75, var12);
                                var2.a(var82);
                            }
                        } else if (var4 == 7) {
                            var1.reader().readByte();
                            var7 = var1.reader().readByte();
                            (new StringBuffer("size material=")).append(var7).toString();

                            for (var5 = 0; var5 < var7; ++var5) {
                                var53 = var1.reader().readShort();
                                var60 = var1.reader().readShort();
                                var68 = var1.reader().readByte();
                                var10 = var1.reader().readByte();
                                if ((var74 = hso_bw.b(var53)) != null) {
                                    var80 = hso_j.a(var53, var74.g, var74.t, 7, var74.q, var74.Q, var74.h, var74.P, var74.A, var60, var68, var10);
                                    var2.a(var80);
                                } else {
                                    (var80 = new hso_j()).O = var53;
                                    var80.K = var60;
                                    var80.x = var68;
                                    var80.y = var10;
                                    var80.u = 7;
                                    hso_bw.c(var53);
                                    var2.a(var80);
                                }
                            }
                        }
                    } else {
                        var57 = var1.reader().readByte();
                        var7 = var1.reader().readByte();
                        (new StringBuffer("size item=")).append(var7).toString();

                        for (var5 = 0; var5 < var7; ++var5) {
                            String var52 = var1.reader().readUTF();
                            var8 = var1.reader().readByte();
                            var9 = var1.reader().readShort();
                            var10 = var1.reader().readByte();
                            short var11 = var1.reader().readShort();
                            var12 = var1.reader().readByte();
                            short var13 = var1.reader().readShort();
                            var14 = var1.reader().readByte();
                            var15 = var1.reader().readByte();
                            var16 = var1.reader().readByte();
                            byte var17;
                            hso_cz[] var18 = new hso_cz[var17 = var1.reader().readByte()];

                            int var19;
                            for (var19 = 0; var19 < var17; ++var19) {
                                int var20 = var1.reader().readUnsignedByte();
                                var21 = var1.reader().readInt();
                                var18[var19] = new hso_cz(var20, var21);
                            }

                            var19 = var1.reader().readInt();
                            var93 = var1.reader().readByte();
                            byte var94 = var1.reader().readByte();
                            int var22 = -1;
                            String var89 = "-1";
                            if (var94 == 1) {
                                var22 = var1.reader().readInt();
                                var89 = var1.reader().readUTF();
                            }

                            var1.reader().readByte();
                            boolean var95 = false;
                            var96 = null;
                            var96 = new hso_j(var9, var52, var11, var12, var14, var8, var57, var18, var10, false, (short) -1, 0L, var13, var15, var16, var19, (byte) 0, var93, var22, Long.parseLong(var89));
                            var2.a(var96);
                        }
                    }
                }

                if (var3 == 0 && var4 != 3) {
                    hso_fn.C = true;
                }
            } else {
                short var64;
                hso_bw var65;
                if (var51 == 1) {
                    short var61;
                    hso_bw var70;
                    if (var4 == 4) {
                        var57 = var1.reader().readByte();
                        var64 = var1.reader().readShort();
                        var61 = var1.reader().readShort();
                        var51 = var1.reader().readByte();
                        var8 = var1.reader().readByte();
                        if ((var70 = hso_bw.a(var57, var64, var2)) != null) {
                            var70.K = var61;
                            var70.x = var51;
                            var70.y = var8;
                        } else {
                            hso_fo var81 = (hso_fo) hso_fo.m.a("" + var64);
                            var74 = new hso_j(var64, var81.b, var81.c, var81.j, var61, var57, var81.h, var81.i, var81.g, var51, var8);
                            var2.a(var74);
                        }

                        if (var3 == 0) {
                            hso_j.a((byte) 1, false);
                            hso_j.a((byte) 0, false);
                            if (GameScreen.p.d(1, 5)) {
                                ++GameScreen.p.b;
                                GameScreen.p.g();
                            }
                        }
                    } else if (var4 != 3) {
                        if (var4 == 9) {
                            var57 = var1.reader().readByte();
                            hso_ea var67 = aR(var1);
                            if ((var65 = hso_bw.a(var57, (short) var67.O, var2)) == null) {
                                var2.a(var67);
                            } else {
                                var2.a(var67, var2.c(var65));
                            }
                        } else if (var4 == 5) {
                            var57 = var1.reader().readByte();
                            var64 = var1.reader().readShort();
                            String var63 = var1.reader().readUTF();
                            var53 = var1.reader().readShort();
                            var62 = hso_df.dQ;
                            var68 = var1.reader().readByte();
                            var10 = var1.reader().readByte();
                            hso_bw var83;
                            if ((var83 = hso_bw.a(var57, var64, var2)) == null) {
                                var80 = new hso_j(var64, var63, var53, var62, var68, var10);
                                var2.a(var80);
                            } else {
                                var83.K = var53;
                                var83.x = var68;
                                var83.y = var10;
                            }
                        } else if (var4 == 7) {
                            var57 = var1.reader().readByte();
                            var64 = var1.reader().readShort();
                            var61 = var1.reader().readShort();
                            var51 = var1.reader().readByte();
                            var8 = var1.reader().readByte();
                            if ((var70 = hso_bw.a(var57, var64, var2)) != null) {
                                var70.K = var61;
                                var70.x = var51;
                                var70.y = var8;
                            } else {
                                hso_j var76;
                                if ((var76 = hso_bw.b(var64)) != null) {
                                    hso_j var72 = hso_j.a(var64, var76.g, var76.t, 7, var76.q, var76.Q, var76.h, var76.y, var76.A, var61, var51, var8);
                                    var2.a(var72);
                                } else {
                                    (var74 = new hso_j()).O = var64;
                                    var74.K = var61;
                                    var74.x = var51;
                                    var74.y = var8;
                                    var74.u = 7;
                                    hso_bw.c(var64);
                                    var2.a(var74);
                                }
                            }

                            if (var3 == 0) {
                                for (int var79 = 0; var79 < hso_c.q.length; ++var79) {
                                    var74 = hso_bw.b(hso_c.q[var79]);
                                    int var87 = 0;
                                    hso_bw var88;
                                    if (var74 != null && (var88 = hso_bw.a(var74.u, (short) var74.O)) != null) {
                                        var87 = var88.K;
                                    }

                                    hso_c.p[var79] = var87;
                                }
                            }
                        }
                    } else {
                        var57 = var1.reader().readByte();
                        String var59 = var1.reader().readUTF();
                        byte var58 = var1.reader().readByte();
                        var53 = var1.reader().readShort();
                        hso_bw var66 = hso_bw.a(var57, var53, var2);
                        var68 = var1.reader().readByte();
                        short var73 = var1.reader().readShort();
                        var75 = var1.reader().readByte();
                        short var85 = var1.reader().readShort();
                        byte var86 = var1.reader().readByte();
                        var14 = var1.reader().readByte();
                        var15 = var1.reader().readByte();
                        hso_cz[] var90 = new hso_cz[var16 = var1.reader().readByte()];

                        int var91;
                        for (var91 = 0; var91 < var16; ++var91) {
                            var90[var91] = new hso_cz(var1.reader().readUnsignedByte(), var1.reader().readInt());
                        }

                        var91 = var1.reader().readInt();
                        byte var92 = var1.reader().readByte();
                        var93 = var1.reader().readByte();
                        var21 = -1;
                        String var97 = "-1";
                        if (var93 == 1) {
                            var21 = var1.reader().readInt();
                            var97 = var1.reader().readUTF();
                        }

                        var1.reader().readByte();
                        long var48 = Long.parseLong(var97);
                        boolean var54 = false;
                        long var39 = 0L;
                        var54 = true;
                        var54 = false;
                        var96 = new hso_j(var53, var59, var73, var75, var86, var58, var57, var90, var68, false, (short) -1, 0L, var85, var14, var15, var91, (byte) 0, var92, var21, var48);
                        if (var66 == null) {
                            var2.a(var96);
                        } else {
                            var2.a(var96, var2.c(var66));
                        }
                    }

                    if (var3 == 0) {
                        if (GameScreen.p.a == 1 && GameScreen.p.b == 5) {
                            ++GameScreen.p.b;
                            GameScreen.p.g();
                        }

                        if (var4 != 3) {
                            hso_fn.C = true;
                        }
                    }
                } else if (var51 == 2) {
                    var57 = var1.reader().readByte();
                    var64 = var1.reader().readShort();
                    if ((var65 = hso_bw.a(var57, var64, var2)) != null) {
                        var2.d(var65);
                    }

                    if (var3 == 0) {
                        if (var4 == 4) {
                            hso_j.a((byte) 1, false);
                            hso_j.a((byte) 0, false);
                        } else if (var4 == 7 && var3 == 0) {
                            for (int var55 = 0; var55 < hso_c.q.length; ++var55) {
                                hso_j var71 = hso_bw.b(hso_c.q[var55]);
                                int var78 = 0;
                                hso_bw var84;
                                if (var71 != null && (var84 = hso_bw.a(var71.u, (short) var71.O)) != null) {
                                    var78 = var84.K;
                                }

                                hso_c.p[var55] = var78;
                            }
                        }
                    }
                }
            }
        } catch (Exception var50) {
            var50.printStackTrace();
        }

        hso_fo.d = true;
        hso_fl.bi = 0;
    }

    public static void al(Message var0) {
        try {
            byte var1;
            short var8;
            if ((var1 = var0.reader().readByte()) == 0) {
                var8 = var0.reader().readShort();
                byte var10;
                if ((var10 = var0.reader().readByte()) == 3) {
                    hso_bw var12;
                    if ((var12 = hso_bw.a(var10, (short) var8)) != null && hso_c.B == 0) {
                        hso_c.l = hso_j.a(var8, var12.i, var12.t, var12.z, var12.N, var12.M, var10, var12.j, var12.R, false, var12.v, var12.q, (short) var12.S, var12.x, var12.y, 0, (byte) 0, (byte) 0);
                    }
                } else {
                    hso_c.D = true;
                }

                if (hso_c.B == 0) {
                    hso_c.A = hso_c.z = var0.reader().readUTF();
                    return;
                }

                hso_c.A = var0.reader().readUTF();
                return;
            }

            if (var1 == 1) {
                if (var0.reader().readByte() == 3) {
                    hso_c.l = null;
                } else {
                    hso_c.D = false;
                }

                if (hso_c.B == 0) {
                    hso_c.A = hso_c.z = var0.reader().readUTF();
                    return;
                }

                hso_c.A = var0.reader().readUTF();
                return;
            }

            if (var1 == 2) {
                hso_ft.j();
                hso_c.B = 1;
                hso_c.C = var0.reader().readByte();
                hso_c.F = var0.reader().readUTF();
                (new StringBuffer("thanh cong hay that bai=")).append(hso_c.C).toString();
                return;
            }

            if (var1 == 3) {
                hso_ft.j();
                String var11 = var0.reader().readUTF();
                hso_ft.o.a((hso_es) null, var11, hso_fq.f, (byte) 2, false, 0);
                return;
            }

            if (var1 == 4) {
                var8 = var0.reader().readShort();
                short var2 = var0.reader().readShort();
                String var3 = var0.reader().readUTF();
                hso_bw var4;
                byte var6;
                if ((var4 = hso_bw.a(var6 = var0.reader().readByte(), (short) var8)) != null) {
                    (hso_c.l = hso_j.a(var8, var4.i, var4.t, var4.z, var4.N, var4.M, var6, var4.j, var4.R, false, var4.v, var4.q, (short) var4.S, var4.x, var4.y, 0, (byte) 0, (byte) 0)).ak = null;
                    hso_c.l.I = hso_dw.a(var3, "|");
                    hso_j var7;
                    if ((var7 = hso_bw.b(hso_c.l.O)) != null) {
                        hso_c.l.g = var7.g;
                    }

                    hso_j var9;
                    if ((var9 = hso_bw.b(var2)) == null) {
                        (var9 = new hso_j()).O = var2;
                        var9.u = 7;
                        hso_c.l.ak = var9;
                        return;
                    }

                    if (var9.u == 7 && MainObject.f(var9.O)) {
                        hso_j var10000 = hso_c.l;
                        var7 = var9;
                        (var9 = new hso_j()).i = var7.i;
                        var9.g = var7.g;
                        var9.t = var7.t;
                        var9.O = var7.O;
                        var9.z = var7.z;
                        var9.N = var7.N;
                        var9.M = var7.M;
                        var9.u = var7.u;
                        var9.j = var7.j;
                        var9.R = var7.R;
                        var9.v = var7.v;
                        var9.q = var7.q;
                        var9.S = var7.S;
                        var9.x = var7.x;
                        var9.y = var7.y;
                        var9.p = var7.p;
                        var9.B = var7.B;
                        var9.D = var7.D;
                        var9.K = var7.K;
                        var9.Q = var7.Q;
                        var9.j = var7.j;
                        var9.C = var7.C;
                        var9.I = new String[]{"", ""};
                        var10000.ak = var9;
                        return;
                    }
                }
            } else {
                if (var1 == 5) {
                    hso_ft.j();
                    hso_c.B = 1;
                    hso_c.C = var0.reader().readByte();
                    hso_c.F = var0.reader().readUTF();
                    return;
                }

                if (var1 == 6) {
                    hso_c.l = null;
                    return;
                }
            }
        } catch (Exception var5) {
        }

    }

    public final void am(Message var1) {
        try {
            byte var2;
            short var7;
            if ((var2 = var1.reader().readByte()) == 0) {
                var7 = var1.reader().readShort();
                byte var5 = var1.reader().readByte();
                hso_bw var4;
                if ((var4 = hso_bw.a(3, (short) var7)) == null) {
                    return;
                }

                if (var5 == 1) {
                    hso_c.m = hso_j.a(var7, var4.i, var4.t, var4.z, var4.N, var4.M, 3, var4.j, var4.R, false, var4.v, var4.q, (short) var4.S, var4.x, var4.y, 0, (byte) 0, (byte) 0);
                    return;
                }

                if (var5 == 0) {
                    hso_c.n = hso_j.a(var7, var4.i, var4.t, var4.z, var4.N, var4.M, 3, var4.j, var4.R, false, var4.v, var4.q, (short) var4.S, var4.x, var4.y, 0, (byte) 0, (byte) 0);
                    return;
                }
            } else {
                if (var2 == 1) {
                    hso_ft.j();
                    var7 = var1.reader().readShort();
                    if (hso_c.m != null && hso_c.n != null) {
                        hso_es var6;
                        (var6 = new hso_es("ReadMessenge menu3")).a(new hso_bt(hso_df.fk, 4, this));
                        hso_ft.o.a(var6, hso_df.fl + hso_c.m.g + hso_df.fm + hso_c.n.g + "? " + hso_df.fj + ": " + var7 + " " + hso_df.bP + ".", hso_fq.f, (byte) 2, false, 0);
                        return;
                    }

                    return;
                }

                if (var2 == 2) {
                    hso_ft.j();
                    hso_c.F = var1.reader().readUTF();
                    hso_c.B = 1;
                    return;
                }

                if (var2 == 3) {
                    hso_ft.j();
                    String var8 = var1.reader().readUTF();
                    hso_ft.o.a((hso_es) null, var8, hso_fq.f, (byte) 2, false, 0);
                    return;
                }
            }
        } catch (Exception var3) {
        }

    }

    public static void an(Message var0) {
        try {
            if (var0.reader().readByte() == 0) {
                String var1 = var0.reader().readUTF();
                short var3 = var0.reader().readShort();
                hso_ft.h.a(var1, (byte) 4, hso_df.eu, var3);
                return;
            }
        } catch (Exception var2) {
        }

    }

    public final void ao(Message var1) {
        try {
            byte var2;
            MainObject var3;
            if ((var3 = MainObject.a(var2 = var1.reader().readByte(), (byte) 2)) != null && !var3.cK) {
                MainObject.cq = hso_o.a(var1.reader().readUTF(), "\b");
                MainObject.cr = 0;
                hso_es var6 = new hso_es("ReadMessenge menu2");
                hso_bt var5 = new hso_bt(hso_df.aa, 3, var2, this);
                var6.a(var5);
                hso_ft.o.a(var6, MainObject.cq[0], var2, (byte) 2, false, 2);
            }
        } catch (Exception var4) {
        }
    }

    public static void ap(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            String var2 = null;
            String var3 = "";
            long var4 = 0L;
            boolean var6 = false;
            byte var7 = 122;
            short var8 = 0;
            int var22;
            switch (var1) {
                case 10:
                    var2 = var0.reader().readUTF();
                    hso_ft.h.a(var2, (byte) 5, hso_df.eD, 0);
                    return;
                case 14:
                    var2 = var0.reader().readUTF();
                    short var20 = var0.reader().readShort();
                    var7 = var0.reader().readByte();
                    var4 = var0.reader().readLong();
                    var22 = var0.reader().readInt();
                    hso_ft.a(hso_df.eQ + ": " + var2 + " " + hso_df.ac + var20 + "\n" + hso_df.eR + hso_em.a(var7) + "\n" + hso_df.eH + hso_df.bO + ": " + var4 + "\n" + hso_df.eH + hso_df.bP + ": " + var22);
                    return;
                case 15:
                    var1 = var0.reader().readByte();
                    byte var21;
                    if ((var21 = var0.reader().readByte()) == 0) {
                        int var24 = var0.reader().readInt();
                        var8 = var0.reader().readShort();
                        var3 = var0.reader().readUTF();
                        var2 = var0.reader().readUTF();
                        short var26 = var0.reader().readShort();
                        short var27 = var0.reader().readShort();
                        short var28 = var0.reader().readShort();
                        short var29 = var0.reader().readShort();
                        short var31 = var0.reader().readShort();
                        String var25 = var0.reader().readUTF();
                        String var36 = var0.reader().readUTF();
                        String var38 = var0.reader().readUTF();
                        var4 = var0.reader().readLong();
                        var22 = var0.reader().readInt();
                        byte var41 = var0.reader().readByte();
                        hso_dv[] var44 = null;
                        if (var41 > 0) {
                            var44 = new hso_dv[var41];

                            for (int var42 = 0; var42 < var44.length; ++var42) {
                                var44[var42] = new hso_dv(var0.reader().readByte(), var0.reader().readByte(), var0.reader().readUTF());
                            }
                        }

                        if (var1 == 0) {
                            if (GameScreen.f.cO == null) {
                                GameScreen.f.cO = new hso_em(var24, var8, var3, (byte) 122);
                            }

                            GameScreen.f.cO.a(var2, var26, var27, var28, var29, var31, var36, var38, var25, var4, var22, var44);
                            if (hso_ft.m == null) {
                                hso_ft.m = new hso_by();
                            }

                            hso_ft.m.a(GameScreen.f.cO, var1);
                            hso_ft.m.a(hso_ft.a);
                        } else {
                            hso_em var45;
                            (var45 = new hso_em(var24, var8, var3, (byte) 122)).a(var2, var26, var27, var28, var29, var31, var36, var38, var25, var4, var22, var44);
                            if (hso_ft.m == null) {
                                hso_ft.m = new hso_by();
                            }

                            hso_ft.m.a(var45, var1);
                            hso_ft.m.a(hso_ft.a);
                        }

                        hso_ft.j();
                        return;
                    }

                    if (var21 == 1) {
                        if (GameScreen.f.cO != null) {
                            GameScreen.f.cO.n = var0.reader().readLong();
                            GameScreen.f.cO.l = var0.reader().readInt();
                            return;
                        }
                    } else if (var21 == 2) {
                        if (GameScreen.f.cO != null) {
                            GameScreen.f.cO.g = var0.reader().readUTF();
                            hso_by.a = true;
                            return;
                        }
                    } else if (var21 == 3 && GameScreen.f.cO != null) {
                        GameScreen.f.cO.e = var0.reader().readUTF();
                        hso_by.a = true;
                        return;
                    }
                    break;
                case 19:
                    short var9 = var0.reader().readShort();
                    String var10 = var0.reader().readUTF();
                    int var11;
                    if ((var11 = var0.reader().readInt()) != -1) {
                        var0.reader().readUTF();
                        var3 = var0.reader().readUTF();
                        var8 = var0.reader().readShort();
                        var7 = var0.reader().readByte();
                    }

                    MainObject var12 = null;
                    if (var9 != 32000 && (var12 = MainObject.a(var9, (byte) 0)) != null) {
                        if (var11 == -1) {
                            if (var12.cO != null) {
                                var12.cO.q = true;
                            }
                        } else if (var12.cO == null) {
                            var12.cO = new hso_em(var11, var8, var3, var7);
                        } else {
                            var12.cO.b = var11;
                            var12.cO.a = var8;
                            var12.cO.c = var3.toUpperCase();
                            var12.cO.o = var7;
                        }
                    }

                    if (hso_ft.a == hso_ag.b() && hso_ag.b().i == 4) {
                        for (int var13 = 0; var13 < hso_ag.b().a.c(); ++var13) {
                            MainObject var30;
                            if ((var30 = (MainObject) hso_ag.b().a.a(var13)).cB.compareTo(var10) == 0) {
                                if (var30.cO != null) {
                                    if (var11 == -1) {
                                        var30.cO.o = 121;
                                        return;
                                    }

                                    var30.cO.o = var7;
                                    return;
                                }

                                return;
                            }
                        }

                        return;
                    }
                    break;
                case 20:
                    hso_ft.a(var0.reader().readUTF());
                    return;
                case 21:
                    byte var14;
                    short var23;
                    if ((var14 = var0.reader().readByte()) == 3) {
                        hso_bw.Y.d();
                        var23 = var0.reader().readShort();

                        for (int var33 = 0; var33 < var23; ++var33) {
                            short var35 = var0.reader().readShort();
                            short var39 = var0.reader().readShort();
                            hso_fo var43 = (hso_fo) hso_fo.m.a("" + var35);
                            hso_j var40 = new hso_j(var35, var43.b, var43.c, var43.j, var39, 4, var43.h, var43.i, var43.g, (byte) 0, (byte) 0);
                            hso_bw.Y.a(var40);
                        }

                        hso_es var34 = new hso_es("ReadMessenge vec3");
                        hso_fn var37 = new hso_fn(hso_bw.Y, (byte) 12, hso_df.eV, -1, (byte) 0);
                        var34.a(var37);
                        (hso_ft.v = new hso_eu()).a = 0;
                        hso_ft.v.a(var34);
                        hso_ft.v.a((hso_p) GameScreen.b());
                        hso_ft.j();
                        return;
                    }

                    if (var14 == 2) {
                        var23 = var0.reader().readShort();
                        hso_bw var15;
                        if ((var15 = hso_bw.a(4, var23, hso_bw.Y)) != null) {
                            hso_bw.Y.d(var15);
                            return;
                        }
                    } else if (var14 == 0) {
                        var23 = var0.reader().readShort();
                        short var32 = var0.reader().readShort();
                        hso_bw var16;
                        if ((var16 = hso_bw.a(4, var23, hso_bw.Y)) != null) {
                            var16.K = var32;
                            return;
                        }

                        hso_fo var17 = (hso_fo) hso_fo.m.a("" + var23);
                        hso_j var18 = new hso_j(var23, var17.b, var17.c, var17.j, var32, 4, var17.h, var17.i, var17.g, (byte) 0, (byte) 0);
                        hso_bw.Y.a(var18);
                        return;
                    }
                    break;
                case 22:
                    if (GameScreen.f.cO == null) {
                        break;
                    }

                    var0.reader().readByte();
                    var0.reader().readShort();
                case 11:
                case 12:
                case 13:
                case 16:
                case 17:
                case 18:
                default:
                    return;
            }
        } catch (Exception var19) {
        }

    }

    public static void aq(Message var0) {
        try {
            var0.reader().readByte();
            short var1 = var0.reader().readShort();
            short var2 = var0.reader().readShort();
            MainObject var4;
            if ((var4 = MainObject.a(var0.reader().readByte(), (byte) 2)) != null && !var4.cK) {
                var4.br = var1;
                var4.bs = var2;
                return;
            }
        } catch (Exception var3) {
        }

    }

    public final void ar(Message var1) {
        try {
            hso_ft.j();
            this.b = var1.reader().readShort();
            this.c = var1.reader().readByte();
            String var2 = var1.reader().readUTF();
            byte var3;
            String[] var4 = new String[var3 = var1.reader().readByte()];
            String[] var5 = new String[var3];
            byte var6 = 1;
            byte[] var7 = new byte[var3];

            int var8;
            for (var8 = 0; var8 < var3; ++var8) {
                var4[var8] = var1.reader().readUTF();
                var7[var8] = var1.reader().readByte();
                var5[var8] = "";
            }

            try {
                for (var8 = 0; var8 < var3; ++var8) {
                    var5[var8] = var1.reader().readUTF();
                }

                var6 = var1.reader().readByte();
            } catch (Exception var9) {
            }

            hso_ft.a(var4, new hso_bt("OK", 1), this.c, this.b, var2, var5, var6);
        } catch (Exception var10) {
        }
    }

    public static void as(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            byte var3;
            if ((var3 = var0.reader().readByte()) == 0) {
                hso_ft.c(var1);
                return;
            }

            if (var3 == 1) {
                hso_ft.b(var1);
                return;
            }
        } catch (Exception var2) {
        }

    }

    public static void at(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            byte var2 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            byte var5 = var0.reader().readByte();
            short var8 = var0.reader().readShort();
            MainObject var6 = MainObject.a(var3, var2);
            (new StringBuffer("Effect from server type = ")).append(var6.cB).toString();
            if (var1 >= 0 && var6 != null && !var6.cK) {
                int var9;
                hso_dx var10;
                switch (var1) {
                    case 0:
                        GameScreen.a(38, var6.aY, var6.aZ - 20);
                        return;
                    case 1:
                        for (var9 = 0; var9 < hso_br.b.c(); ++var9) {
                            if ((var10 = (hso_dx) hso_br.b.a(var9)).d == 85 && var10.s != null && var10.s.ct == var3) {
                                if (var4 == 0) {
                                    var10.y = true;
                                }

                                return;
                            }
                        }

                        GameScreen.a(85, var6.aY, var6.aZ, var4, var3, var2);
                        return;
                    case 2:
                        for (var9 = 0; var9 < hso_br.b.c(); ++var9) {
                            if ((var10 = (hso_dx) hso_br.b.a(var9)).d == 87 && var10.s != null && var10.s.ct == var3 && var4 == 0) {
                                var10.y = true;
                                return;
                            }
                        }

                        GameScreen.a(87, var6.aY, var6.aZ, var4, var3, var2);
                        return;
                    case 3:
                        GameScreen.a(43, var6.aY, var6.aZ);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 4:
                        GameScreen.a(94, var6.aY, var6.aZ, var4, var3, var2, var8, false);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 5:
                        GameScreen.a(100, var6.aY, var6.aZ, var4, var3, var2, var8, false);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 6:
                        GameScreen.a(101, var6.aY, var6.aZ, var4, var3, var2, var8, false);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 7:
                        GameScreen.a(102, var6.aY, var6.aZ, var4, var3, var2, var8, false);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 8:
                        GameScreen.a(107, var6.aY, var6.aZ, var4, var3, var2, var8, false);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 9:
                        var6.t();
                        GameScreen.a(103, var6.aY, var6.aZ, var4, var3, var2, var8, false);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 10:
                        var6.h(12, var4);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 11:
                        var6.h(13, var4);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 12:
                        var6.h(11, var4);
                        if (var5 > 0) {
                            hso_cs.t = var5;
                            return;
                        }
                        break;
                    case 13:
                        var6.h(14, var4);
                        if (var5 <= 0) {
                            break;
                        }

                        hso_cs.t = var5;
                    default:
                        return;
                }
            }
        } catch (Exception var7) {
        }

    }

    public static void au(Message var0) {
        try {
            byte var1;
            if ((var1 = var0.reader().readByte()) == -1) {
                for (int var8 = 0; var8 < GameScreen.o.c(); ++var8) {
                    hso_ca var7;
                    if ((var7 = (hso_ca) GameScreen.o.a(var8)).a == 0 || var7.a == 2 || var7.a == 1 || var7.a == 4) {
                        var7.b();
                    }
                }

                return;
            }

            short var2 = var0.reader().readShort();
            int var3;
            hso_ca var4;
            short var6;
            if ((var6 = var0.reader().readShort()) == 0) {
                for (var3 = 0; var3 < GameScreen.o.c(); ++var3) {
                    if ((var4 = (hso_ca) GameScreen.o.a(var3)).a == var1) {
                        var4.c = true;
                        return;
                    }
                }

                return;
            }

            if (var1 == 0 || var1 == 2 || var1 == 1 || var1 == 4) {
                for (var3 = 0; var3 < GameScreen.o.c(); ++var3) {
                    if ((var4 = (hso_ca) GameScreen.o.a(var3)).a == var1) {
                        var4.c = true;
                        break;
                    }
                }

                GameScreen.a(var1, true, var2, var6);
                return;
            }
        } catch (Exception var5) {
        }

    }

    public static void av(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var2 = var0.reader().readShort();
            String var3 = var0.reader().readUTF();
            byte var5 = var0.reader().readByte();
            MainObject var6;
            if ((var6 = MainObject.a(var2, var1)) != null && !var6.cK) {
                GameScreen.a(var3, var6.aY, var6.aZ - var6.be / 2, 8, var5, var2);
                return;
            }
        } catch (Exception var4) {
        }

    }

    public static void aw(Message var0) {
        try {
            byte var1;
            if ((var1 = var0.reader().readByte()) == 0) {
                hso_c.w = var0.reader().readInt();
                hso_c.v = var0.reader().readUTF();
                hso_c.t = var0.reader().readInt();
                hso_c.x = var0.reader().readShort();
                hso_c.u = var0.reader().readInt();
                hso_c.s = new hso_b[var1 = var0.reader().readByte()];

                int var10;
                for (var10 = 0; var10 < var1; ++var10) {
                    short var11 = var0.reader().readShort();
                    short var13 = var0.reader().readShort();
                    hso_c.s[var10] = new hso_b(var11, var13);
                }

                hso_c.r = new int[var1];

                for (var10 = 0; var10 < hso_c.s.length; ++var10) {
                    hso_j var12 = hso_bw.b(hso_c.s[var10].a);
                    int var14 = 0;
                    hso_bw var6;
                    if (var12 != null && (var6 = hso_bw.a(var12.u, (short) var12.O)) != null) {
                        var14 = var6.K;
                    }

                    hso_c.r[var10] = var14;
                }

                return;
            }

            String var8;
            if (var1 == 1) {
                var8 = var0.reader().readUTF();
                hso_c.o = null;
                hso_es var9 = new hso_es("ReadMessenge vec12");
                hso_fn var3 = new hso_fn(hso_bw.V, (byte) 0, hso_df.dx, -1, hso_fn.g);
                var9.a(var3);
                hso_c var4 = null;
                var4 = new hso_c(var8, hso_c.c);
                var9.a(var4);
                (hso_ft.v = new hso_eu()).a = 1;
                hso_ft.v.a(var9);
                hso_ft.v.a((hso_p) GameScreen.b());
                hso_ft.j();
                var4.b();
                return;
            }

            if (var1 == 2) {
                short var7;
                if ((var7 = var0.reader().readShort()) == -1) {
                    hso_c.o = null;
                    return;
                }

                hso_bw var2;
                if ((var2 = hso_bw.a(3, (short) var7)) != null && hso_c.B == 0) {
                    hso_c.o = hso_j.a(var7, var2.i, var2.t, var2.z, var2.N, var2.M, 3, var2.j, var2.R, false, var2.v, var2.q, (short) var2.S, var2.x, var2.y, 0, (byte) 0, (byte) 0);
                    return;
                }
            } else {
                if (var1 == 5) {
                    hso_ft.j();
                    hso_c.F = var0.reader().readUTF();
                    hso_c.y = var0.reader().readShort();
                    hso_c.B = 1;
                    return;
                }

                if (var1 == 4) {
                    hso_ft.j();
                    var8 = var0.reader().readUTF();
                    hso_ft.o.a((hso_es) null, var8, hso_fq.f, (byte) 2, false, 0);
                    return;
                }

                if (var1 == 6) {
                    hso_c.o = null;
                    hso_c.s = null;
                    hso_c.t = 0;
                    hso_c.u = 0;
                    hso_c.v = "";
                    hso_c.w = 0;
                    hso_c.x = 0;
                    hso_c.y = 0;
                    return;
                }
            }
        } catch (Exception var5) {
        }

    }

    public static void ax(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            byte var2;
            hso_j[] var3 = new hso_j[var2 = var0.reader().readByte()];

            for (int var4 = 0; var4 < var2; ++var4) {
                String var5 = var0.reader().readUTF();
                short var6 = var0.reader().readShort();
                int var7 = var0.reader().readInt();
                byte var8 = var0.reader().readByte();
                byte var9 = var0.reader().readByte();
                byte var10 = var0.reader().readByte();
                var3[var4] = new hso_j(var5, var6, var7, var8, var9, var10);
            }

            String var12 = var0.reader().readUTF();
            byte var13 = var0.reader().readByte();
            byte var14 = var0.reader().readByte();
            if (var2 != 0) {
                hso_ft.a(var1, var12, var3, var13, var14);
            }
        } catch (Exception var11) {
        }
    }

    public static void ay(Message var0) {
        try {
            hso_ft.I = var0.reader().readShort();
            short var2 = var0.reader().readShort();
            hso_ft.i();
            hso_ah.h = 0;
            hso_ah.g = var2;
            (new StringBuffer("==========")).append(hso_ft.I).toString();
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public static void az(Message var0) {
        try {
            hso_ft.I = var0.reader().readShort();
            short var1 = var0.reader().readShort();
            int var2 = 0;

            for (int var3 = 0; var3 < var1; ++var3) {
                byte var4 = var0.reader().readByte();
                short var5 = var0.reader().readShort();
                int var6 = var0.reader().readInt();
                ByteArrayInputStream var7 = null;

                try {
                    boolean var8 = false;
                    byte[] var11;
                    if ((var11 = hso_ak.a("img_data_char_" + var4 + "_" + var5)) == null) {
                        var8 = true;
                    } else {
                        var7 = new ByteArrayInputStream(var11);
                        short var12 = (new DataInputStream(var7)).readShort();
                        if (var6 != var12) {
                            var8 = true;
                        }
                    }

                    if (var8) {
                        Service.a().a(var4, var5);
                        ++var2;
                    }
                } catch (Exception var9) {
                }
            }

            if (var2 > 0) {
                hso_ft.i();
                hso_ah.h = 0;
                hso_ah.g = var2;
            }

            (new StringBuffer("==========")).append(hso_ft.I).toString();
        } catch (Exception var10) {
        }
    }

    public static void aA(Message var0) {
        try {
            byte var1;
            switch (var0.reader().readByte()) {
                case 0:
                    var1 = var0.reader().readByte();
                    MainObject var6;
                    if ((var6 = MainObject.a(var0.reader().readShort(), (byte) 0)) != null) {
                        var6.ee = var1;
                        return;
                    }
                    break;
                case 1:
                    var1 = var0.reader().readByte();
                    byte var2 = var0.reader().readByte();
                    short var3 = var0.reader().readShort();
                    short var5 = var0.reader().readShort();
                    MainObject var7;
                    if ((var7 = MainObject.a(var3, (byte) 1)) != null) {
                        var7.a(var2, var5, (short) var1);
                        return;
                    }
                    break;
                default:
                    return;
            }
        } catch (Exception var4) {
        }

    }

    public static void aB(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            (new StringBuffer("size = ")).append(var1).toString();

            for (int var2 = 0; var2 < var1; ++var2) {
                byte var3 = var0.reader().readByte();
                var0.reader().readByte();
                short var4 = var0.reader().readShort();
                hso_do.d.a("" + var3, new Short(var4));
            }

        } catch (Exception var5) {
        }
    }

    public static void aC(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            byte var2 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            short var5 = var0.reader().readShort();
            byte var6 = var0.reader().readByte();
            byte var7 = var0.reader().readByte();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            var0.reader().readByte();
            var0.reader().readByte();
            hso_au var11 = (hso_au) MainObject.a(var3, var2);
            switch (var1) {
                case 0:
                    var11.bi = 8;
                    var11.bf = var4;
                    var11.bg = var5;
                    var11.dC = true;
                    return;
                case 1:
                    switch (var6) {
                        case 0:
                            GameScreen.a(38, var11.aY, var11.aZ - 20);
                            break;
                        case 1:
                            GameScreen.a(85, var11.aY, var11.aZ, var7, var3, var2);
                            break;
                        case 2:
                            GameScreen.a(87, var11.aY, var11.aZ, var7, var3, var2);
                            break;
                        case 3:
                            GameScreen.a(36, var11.aY, var11.aZ);
                    }

                    var11.aY = var4;
                    var11.aZ = var5;
                    switch (var8) {
                        case 0:
                            GameScreen.a(38, var11.aY, var11.aZ - 20);
                            return;
                        case 1:
                            GameScreen.a(85, var11.aY, var11.aZ, var9, var3, var2);
                            return;
                        case 2:
                            GameScreen.a(87, var11.aY, var11.aZ, var9, var3, var2);
                            return;
                        case 3:
                            var11.dC = true;
                        default:
                            return;
                    }
                default:
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }
    }

    public static void aD(Message var0) {
        try {
            byte var1;
            if ((var1 = var0.reader().readByte()) == 0) {
                hso_bw.Z.d();
                var1 = var0.reader().readByte();

                for (int var19 = 0; var19 < var1; ++var19) {
                    byte var3;
                    if ((var3 = var0.reader().readByte()) != 3) {
                        short var22;
                        short var23;
                        hso_j var26;
                        if (var3 == 4) {
                            var22 = var0.reader().readShort();
                            var23 = var0.reader().readShort();
                            hso_fo var24 = (hso_fo) hso_fo.m.a("" + var22);
                            var26 = new hso_j(var22, var24.b, var24.c, var24.j, var23, 4, var24.h, var24.i, var24.g, (byte) 0, (byte) 0);
                            hso_bw.Z.a(var26);
                        } else if (var3 == 7) {
                            var22 = var0.reader().readShort();
                            var23 = var0.reader().readShort();
                            hso_j var25;
                            if ((var25 = hso_bw.b(var22)) != null) {
                                var26 = hso_j.a(var22, var25.g, var25.t, 7, var25.q, var25.Q, var25.h, var25.P, var25.A, var23, (byte) 0, (byte) 0);
                                hso_bw.Z.a(var26);
                            } else {
                                (var26 = new hso_j()).O = var22;
                                var26.u = 7;
                                var26.K = var23;
                                hso_bw.Z.a(var26);
                            }
                        }
                    } else {
                        String var4 = var0.reader().readUTF();
                        byte var5 = var0.reader().readByte();
                        short var6 = var0.reader().readShort();
                        byte var7 = var0.reader().readByte();
                        short var8 = var0.reader().readShort();
                        byte var9 = var0.reader().readByte();
                        short var10 = var0.reader().readShort();
                        byte var11 = var0.reader().readByte();
                        byte var12;
                        hso_cz[] var13 = new hso_cz[var12 = var0.reader().readByte()];

                        for (int var14 = 0; var14 < var12; ++var14) {
                            int var15 = var0.reader().readUnsignedByte();
                            int var16 = var0.reader().readInt();
                            var13[var14] = new hso_cz(var15, var16);
                        }

                        hso_j var27 = new hso_j(var6, var4, var8, var9, var11, var5, var3, var13, var7, false, (short) -1, 0L, var10, (byte) 0, (byte) 0, -1, (byte) 0, (byte) 0);
                        hso_bw.Z.a(var27);
                    }
                }

                hso_es var21 = new hso_es("ReadMessenge vec13");
                hso_bb var20 = new hso_bb(hso_df.fT, hso_bw.Z, (byte) 0);
                var21.a(var20);
                (hso_ft.v = new hso_eu()).a = 0;
                hso_ft.v.a(var21);
                hso_ft.v.a((hso_p) GameScreen.b());
                hso_ft.j();
                return;
            }

            byte var2;
            if (var1 == 1) {
                var1 = var0.reader().readByte();
                var2 = var0.reader().readByte();
                hso_bb.a((byte) 1);
                hso_bb.b(var2);
                hso_bb.a = false;
                (new StringBuffer("itemIndex = ")).append(var1).toString();
                (new StringBuffer("posIndex = ")).append(var2).toString();
                return;
            }

            if (var1 == 2) {
                if (var0.reader().readByte() == 1) {
                    var0.reader().readByte();
                    boolean var18 = false;
                    hso_bb.b(var0.reader().readByte());
                    hso_bb.b = true;
                    return;
                }

                var2 = var0.reader().readByte();
                var0.reader().readByte();
                hso_bb.b(var2);
                hso_bb.b = false;
                return;
            }
        } catch (Exception var17) {
            var17.printStackTrace();
        }

    }

    public static void aE(Message var0) {
        try {
            String var1 = var0.reader().readUTF();
            String var5 = var0.reader().readUTF();
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var2)).writeUTF(var1);
            var3.writeUTF(var5);
            hso_ak.a("user_pass", var2.toByteArray());
            var3.close();
            hso_bs.m = var1;
            hso_bs.f.b(var1);
            hso_bs.g.b(var5);
            hso_bs.h = var1;
            hso_bs.i = var5;
        } catch (Exception var4) {
        }
    }

    public static void aF(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            byte var2 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            byte var4 = var0.reader().readByte();
            GameScreen.q.a(var1, var2, var3);
            if (var4 == 0) {
                GameScreen.U = var0.reader().readLong();
                return;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    public static void aG(Message var0) {
        try {
            byte var1;
            short var5;
            MainObject var6;
            if ((var1 = var0.reader().readByte()) == 0) {
                var5 = var0.reader().readShort();
                short var3 = var0.reader().readShort();
                if ((var6 = MainObject.a(var5, (byte) 0)) != null) {
                    var6.dH = var3;
                    return;
                }
            } else {
                if (var1 == 1) {
                    hso_v.a = true;
                    return;
                }

                if (var1 == 2) {
                    var5 = var0.reader().readShort();
                    byte var4 = var0.reader().readByte();
                    if ((var6 = MainObject.a(var5, (byte) 1)) != null && var4 != 0) {
                        var6.a(var4, var6.aY, var6.aZ, 0, 0, var4 == 57 ? 2 : 0, 0);
                        return;
                    }
                }
            }
        } catch (Exception var2) {
        }

    }

    public static void aH(Message var0) {
        try {
            MainObject var3;
            switch (var0.reader().readByte()) {
                case 0:
                    if (var0.reader().readByte() == 1) {
                        hso_bj.b = true;
                        return;
                    }

                    hso_bj.b = false;
                    return;
                case 1:
                    short var4 = var0.reader().readShort();
                    if ((var3 = MainObject.a(var0.reader().readShort(), (byte) 0)) != null) {
                        var3.bA = var4;
                        return;
                    }
                    break;
                case 2:
                    byte var1 = var0.reader().readByte();
                    if ((var3 = MainObject.a(var0.reader().readShort(), (byte) 0)) != null) {
                        if (var1 == 1) {
                            var3.dI = true;
                            return;
                        }

                        var3.dI = false;
                        return;
                    }
                    break;
                default:
                    return;
            }
        } catch (Exception var2) {
        }

    }

    public static void aI(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            short var2 = var0.reader().readShort();
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            byte var5 = var0.reader().readByte();
            byte var6 = var0.reader().readByte();
            byte var7 = var0.reader().readByte();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            String var10 = var0.reader().readUTF();
            String var11 = var0.reader().readUTF();
            byte var12 = var0.reader().readByte();
            byte[] var13 = new byte[var0.reader().readByte()];

            for (int var14 = 0; var14 < var13.length; ++var14) {
                var13[var14] = (byte) var0.reader().readShort();
            }

            byte[] var21 = new byte[var0.reader().readShort()];

            for (int var15 = 0; var15 < var21.length; ++var15) {
                var21[var15] = var0.reader().readByte();
            }

            byte[] var22 = new byte[var0.reader().readByte()];

            for (int var16 = 0; var16 < var22.length; ++var16) {
                var22[var16] = var0.reader().readByte();
            }

            byte var23 = var0.reader().readByte();

            for (int var19 = 0; var19 < GameScreen.i.c(); ++var19) {
                MainObject var17;
                if ((var17 = (MainObject) GameScreen.i.a(var19)).j_() && var17.ct == var23) {
                    var17.a(var12, var1, var2, var7, var8, var9, var10, var11, var3, var4, var5, var6, var13, var21, var22);
                    return;
                }
            }

            hso_bd var20;
            (var20 = new hso_bd(var12, var1, var2, var7, var8, var9, var10, var11, var3, var4, var5, var6, var13, var21, var22)).ct = var23;
            GameScreen.i.a(var20);
        } catch (Exception var18) {
            var18.printStackTrace();
        }
    }

    public static void aJ(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            short var3 = var0.reader().readShort();
            GameScreen.f.dQ = true;
            if (var1 == 0) {
                GameScreen.q.U = true;
                hso_n.b().a(var3);
                return;
            }

            if (var1 == 2) {
                hso_n.b().b = true;
                return;
            }
        } catch (IOException var2) {
            var2.printStackTrace();
        }

    }

    public static void aK(Message var0) {
        try {
            switch (var0.reader().readByte()) {
                case 0:
                    short var1 = var0.reader().readShort();
                    int var2 = var0.reader().readInt();
                    int var5 = var0.reader().readInt();
                    MainObject var6;
                    if ((var6 = MainObject.a(var1, (byte) 0)) != null) {
                        var6.bt = var2;
                        var6.bu = var5;
                        return;
                    }
                    break;
                case 1:
                    byte var4 = var0.reader().readByte();
                    hso_cf.Q = hso_dw.a() / 1000L + (long) var4;
                    return;
                default:
                    return;
            }
        } catch (Exception var3) {
        }

    }

    public static void aL(Message var0) {
        try {
            MainObject var20;
            switch (var0.reader().readByte()) {
                case 1:
                    short var21 = var0.reader().readShort();
                    String var19 = var0.reader().readUTF();
                    if ((var20 = GameScreen.a(var21)) != null) {
                        var20.b(var19);
                        return;
                    }

                    return;
                case 2:
                    short var18;
                    var20 = GameScreen.a(var18 = var0.reader().readShort());
                    if (GameScreen.f != null && var18 == GameScreen.f.ct) {
                        hso_bw.ab.d();
                        hso_bw.aa.d();
                    }

                    if (var20 != null) {
                        var20.k_();
                        return;
                    }

                    return;
                case 3:
                    hso_bw.aa.d();
                    byte var1 = var0.reader().readByte();
                    int var2 = 0;

                    for (; var2 < var1; ++var2) {
                        byte var3;
                        short var4;
                        byte var12;
                        byte var13;
                        if ((var3 = var0.reader().readByte()) == 3) {
                            var4 = var0.reader().readShort();
                            String var5 = var0.reader().readUTF();
                            var12 = var0.reader().readByte();
                            var13 = var0.reader().readByte();
                            short var14 = var0.reader().readShort();
                            byte var15 = var0.reader().readByte();
                            short var6 = var0.reader().readShort();
                            byte var7 = var0.reader().readByte();
                            byte var8;
                            hso_cz[] var9 = new hso_cz[var8 = var0.reader().readByte()];

                            for (int var10 = 0; var10 < var8; ++var10) {
                                int var11 = var0.reader().readUnsignedByte();
                                int var16 = var0.reader().readInt();
                                var9[var10] = new hso_cz(var11, var16);
                            }

                            byte var25 = var0.reader().readByte();
                            hso_j var26;
                            (var26 = hso_j.a(var4, var5, var14, var15, var7, var12, 3, var9, var13, false, var4, 0L, var6, (byte) 0, (byte) 0, 0, var25, (byte) 0)).H = true;
                            hso_bw.aa.a(var26);
                        }

                        short var22;
                        if (var3 == 7) {
                            var4 = var0.reader().readShort();
                            var22 = var0.reader().readShort();
                            var12 = var0.reader().readByte();
                            var13 = var0.reader().readByte();
                            long var28 = var0.reader().readLong();
                            hso_j var23;
                            hso_j var24;
                            if ((var23 = hso_bw.b(var4)) != null) {
                                (var24 = hso_j.a(var4, var23.g, var23.t, 7, var28, (byte) 0, var23.h, var23.P, var23.A, var22, var12, var13)).H = true;
                                hso_bw.aa.a(var24);
                            } else {
                                (var24 = new hso_j()).O = var4;
                                var24.K = var22;
                                var24.x = var12;
                                var24.y = var13;
                                var24.q = var28;
                                var24.Q = 0;
                                var24.H = true;
                                var24.u = 7;
                                hso_bw.c(var4);
                                hso_bw.aa.a(var24);
                            }
                        }

                        if (var3 == 4) {
                            var4 = var0.reader().readShort();
                            var22 = var0.reader().readShort();
                            long var27 = (long) var0.reader().readInt();
                            hso_fo var29;
                            if ((var29 = hso_fo.b(var4)) != null) {
                                hso_j var30 = new hso_j(var29.a, var29.b, var29.c, var29.j + ". " + hso_df.ba + " " + hso_j.a(var27) + " " + hso_df.bO, var22, 4, var27, var29.i, var29.g, (byte) 0, (byte) 0);
                                hso_bw.aa.a(var30);
                            }
                        }
                    }
            }

        } catch (Exception var17) {
        }
    }

    public static void aM(Message var0) {
        try {
            short var1;
            MainObject var12;
            switch (var0.reader().readByte()) {
                case 0:
                    var1 = var0.reader().readShort();
                    String var11 = var0.reader().readUTF();
                    if ((var12 = GameScreen.b(var1)) != null) {
                        var12.a(var11);
                        return;
                    }
                    break;
                case 1:
                    var1 = var0.reader().readShort();
                    short var10 = var0.reader().readShort();
                    GameScreen.q.a = var1;
                    GameScreen.q.b = var10;
                    return;
                case 2:
                    var1 = var0.reader().readShort();
                    short var2 = var0.reader().readShort();
                    short var3 = var0.reader().readShort();
                    short var4 = var0.reader().readShort();
                    byte var5 = var0.reader().readByte();
                    if ((var12 = GameScreen.c(var1)) != null) {
                        for (int var6 = 0; var6 < var5; ++var6) {
                            short var7 = var0.reader().readShort();
                            int var8 = var0.reader().readInt();
                            MainObject var13;
                            if ((var13 = GameScreen.c(var7)) != null) {
                                GameScreen.a(15, var12, var13, var12.aY, var12.aZ, var8, var2, var3, var4);
                            }
                        }

                        return;
                    }
                    break;
                case 3:
                    return;
                default:
                    return;
            }
        } catch (Exception var9) {
        }

    }

    public static void aN(Message var0) {
        try {
            switch (var0.reader().readByte()) {
                case 0:
                    int var7 = var0.reader().readInt();
                    String var6 = var0.reader().readUTF();
                    hso_cf.X = var7;
                    hso_cf.Y = var6;
                    return;
                case 1:
                    GameScreen.X.d();
                    byte var1 = var0.reader().readByte();

                    for (int var8 = 0; var8 < var1; ++var8) {
                        short var9 = var0.reader().readShort();
                        String var4 = var0.reader().readUTF();
                        if (var9 > 0) {
                            hso_dm var10 = new hso_dm(var9, var4, hso_ft.W / 2, hso_ft.ab + 10 + var8 * hso_ft.ab);
                            GameScreen.X.a(var10);
                        }
                    }

                    return;
                case 2:
                    byte var2;
                    if ((var2 = var0.reader().readByte()) <= 0) {
                        GameScreen.aQ = null;
                        return;
                    }

                    GameScreen.aQ = new String[var2];

                    for (int var3 = 0; var3 < var2; ++var3) {
                        GameScreen.aQ[var3] = var0.reader().readUTF();
                    }

                    return;
                default:
            }
        } catch (Exception var5) {
        }
    }

    public static void aO(Message var0) {
        try {
            byte var3;
            short var4;
            short var23;
            hso_j var26;
            switch (var0.reader().readByte()) {
                case 0:
                    hso_c.G.d();
                    byte var22 = var0.reader().readByte();
                    short var19 = var0.reader().readShort();

                    for (int var25 = 0; var25 < var22; ++var25) {
                        if ((var26 = hso_bw.b(var19)) != null) {
                            hso_c.G.a(var26);
                        } else {
                            (var26 = new hso_j()).O = var19;
                            hso_c.l.u = 7;
                            hso_c.G.a(var26);
                        }
                    }

                    return;
                case 1:
                    hso_c.G.d();
                    return;
                case 2:
                    hso_ft.j();
                    hso_c.B = 1;
                    hso_c.C = var0.reader().readByte();
                    hso_c.F = var0.reader().readUTF();
                    hso_c.G.d();
                    var23 = var0.reader().readShort();
                    var3 = var0.reader().readByte();
                    if (var23 != -1 && var3 == 7) {
                        if ((var26 = hso_bw.b(var23)) != null) {
                            hso_c.l = var26;
                            return;
                        }

                        (hso_c.l = new hso_j()).O = var23;
                        hso_c.l.u = 7;
                        return;
                    }
                    break;
                case 3:
                    hso_ft.j();
                    hso_c.B = 1;
                    hso_c.l = null;
                    hso_c.C = var0.reader().readByte();
                    hso_c.F = var0.reader().readUTF();
                    hso_c.G.d();
                    if (hso_c.C == 3) {
                        var3 = var0.reader().readByte();
                        String var21 = var0.reader().readUTF();
                        byte var24 = var0.reader().readByte();
                        var4 = var0.reader().readShort();
                        byte var5 = var0.reader().readByte();
                        short var27 = var0.reader().readShort();
                        byte var28 = var0.reader().readByte();
                        short var8 = var0.reader().readShort();
                        byte var9 = var0.reader().readByte();
                        byte var10 = var0.reader().readByte();
                        byte var11 = var0.reader().readByte();
                        byte var12;
                        hso_cz[] var13 = new hso_cz[var12 = var0.reader().readByte()];

                        int var14;
                        for (var14 = 0; var14 < var12; ++var14) {
                            int var15 = var0.reader().readUnsignedByte();
                            int var16 = var0.reader().readInt();
                            var13[var14] = new hso_cz(var15, var16);
                        }

                        var14 = var0.reader().readInt();
                        byte var30 = var0.reader().readByte();
                        byte var31 = var0.reader().readByte();
                        int var29 = -1;
                        String var17 = "-1";
                        if (var31 == 1) {
                            var29 = var0.reader().readInt();
                            var17 = var0.reader().readUTF();
                        }

                        var0.reader().readByte();
                        var0 = null;
                        hso_c.l = new hso_j(var4, var21, var27, var28, var9, var24, var3, var13, var5, false, (short) -1, 0L, var8, var10, var11, var14, (byte) 0, var30, var29, Long.parseLong(var17));
                        return;
                    }
                    break;
                case 4:
                    var3 = var0.reader().readByte();
                    hso_c.G.d();

                    for (int var20 = 0; var20 < var3; ++var20) {
                        var23 = var0.reader().readShort();
                        var4 = var0.reader().readShort();
                        if (var23 != -1) {
                            hso_c.i[var20] = a((short) var23, var4);
                            hso_c.h[var20] = b(var23, var4);
                            hso_j var6;
                            if ((var6 = hso_bw.b(var23)) != null) {
                                hso_c.G.a(var6);
                            } else {
                                hso_j var7;
                                (var7 = new hso_j()).O = var23;
                                var7.u = 7;
                                hso_c.G.a(var7);
                            }
                        }
                    }

                    return;
                case 5:
                    hso_ft.j();
                    hso_c.B = 1;
                    hso_c.l = null;
                    hso_c.C = var0.reader().readByte();
                    hso_c.F = var0.reader().readUTF();
                    hso_c.G.d();
                    short var1 = var0.reader().readShort();
                    hso_bw var2;
                    if ((var2 = hso_bw.a(3, (short) var1)) != null) {
                        hso_c.l = hso_j.a(var1, var2.i, var2.t, var2.z, var2.N, var2.M, 3, var2.j, var2.R, false, var2.v, var2.q, (short) var2.S, var2.x, var2.y, 0, (byte) 0, (byte) 0);
                        return;
                    }
                    break;
                default:
                    return;
            }
        } catch (Exception var18) {
        }

    }

    public static void aP(Message var0) {
        try {
            short var1 = var0.reader().readShort();
            short var2 = var0.reader().readShort();
            long var3 = var0.reader().readLong();
            String var5 = var0.reader().readUTF();
            String var6 = var0.reader().readUTF();
            byte var7 = var0.reader().readByte();
            byte var8 = var0.reader().readByte();
            byte var9 = var0.reader().readByte();
            short var10 = var0.reader().readShort();
            byte var11 = var0.reader().readByte();
            byte var15 = var0.reader().readByte();
            hso_j var12;
            if ((var12 = (hso_j) hso_fo.n.a(String.valueOf(var1))) != null) {
                var12.a(var1, var5, var2, 7, var3, var8, var6, var10, var7, var9, var11);
                var12.d(var15);
            }

            for (int var16 = 0; var16 < hso_bw.V.c(); ++var16) {
                hso_j var13;
                if ((var13 = (hso_j) hso_bw.V.a(var16)) != null && var13.u == 7 && var13.O == var1) {
                    var13.a(var1, var5, var2, 7, var3, var8, var6, var10, var7, var9, var11);
                    var13.d(var15);
                }
            }

        } catch (Exception var14) {
        }
    }

    public final void aQ(Message var1) {
        try {
            int var3;
            short var19;
            hso_at var20;
            short var21;
            switch (var1.reader().readByte()) {
                case 0:
                    hso_ft.c.aW = false;
                    hso_ft.c.aV = var1.reader().readInt();
                    hso_ft.c.aR = var1.reader().readShort();
                    hso_ft.c.aS = var1.reader().readShort();
                    hso_ft.c.aT = var1.reader().readShort();
                    hso_ft.c.aU = var1.reader().readShort();
                    return;
                case 1:
                    hso_ft.c.aV = var1.reader().readInt();
                    hso_ft.c.aW = true;
                    return;
                case 2:
                    byte var26 = var1.reader().readByte();
                    short var27 = var1.reader().readShort();
                    short var28 = var1.reader().readShort();
                    String var4 = var1.reader().readUTF();
                    byte var5 = 0;
                    if (var26 == 3 || var26 == 4 || var26 == 7) {
                        var5 = var1.reader().readByte();
                    }

                    short var6 = var1.reader().readShort();
                    var21 = var1.reader().readShort();
                    GameScreen.a((MainObject) (new hso_fv(var28, var26, var4, var6, var21, var27, var5)));
                    return;
                case 3:
                    int var24 = var1.reader().readInt();
                    hso_ft.c.aX = null;
                    if (var24 <= 0) {
                        hso_ft.c.aX = null;
                        GameScreen.f.D = -1;
                        return;
                    }

                    byte[] var25 = new byte[var24];
                    if (var24 > 0) {
                        for (var3 = 0; var3 < var24; ++var3) {
                            var25[var3] = var1.reader().readByte();
                        }

                        hso_ft.c.aX = aq.a(var25);
                        return;
                    }
                    break;
                case 4:
                    Player.s();
                    GameScreen.f.D = var1.reader().readInt();
                    return;
                case 5:
                    if (var1.reader().readByte() == 1) {
                        try {
                            GameScreen.h = null;
                            GameScreen.f.q();
                            GameScreen.f.v();
                        } catch (Exception var17) {
                            return;
                        }
                    }
                    break;
                case 6:
                    var3 = var1.reader().readInt();
                    String var23 = var1.reader().readUTF();
                    if (var3 > 0) {
                        long var29 = hso_dw.a() + (long) (var3 * 1000);
                        GameScreen.aY = new hso_cy(var29, var23);
                    }

                    if (var3 < 0) {
                        GameScreen.aY = null;
                        return;
                    }
                    break;
                case 7:
                    short var15 = var1.reader().readShort();
                    short var16 = var1.reader().readShort();
                    var19 = var1.reader().readShort();
                    var20 = new hso_at(var15, var16, var19, (byte[]) null);
                    GameScreen.aZ.a(var20);
                    return;
                case 8:
                    var19 = var1.reader().readShort();
                    byte var2 = var1.reader().readByte();
                    var21 = var1.reader().readShort();
                    MainObject var22;
                    if (var2 == 0) {
                        if ((var22 = GameScreen.a(var21)) != null) {
                            var20 = new hso_at(var19, var22.aY, var22.aZ, (byte[]) null);
                            GameScreen.aZ.a(var20);
                            return;
                        }
                    } else if ((var22 = GameScreen.b(var21)) != null) {
                        var20 = new hso_at(var19, var22.aY, var22.aZ, (byte[]) null);
                        GameScreen.aZ.a(var20);
                        return;
                    }
                    break;
                default:
                    return;
            }
        } catch (Exception var18) {
        }

    }
}
