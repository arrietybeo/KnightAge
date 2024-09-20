
public final class Service extends hso_ee {

    private static Service a;

    public static Service a() {
        if (a == null) {
            a = new Service();
        }

        return a;
    }

    public final void a(String var1, String var2, String var3, String var4, String var5, String var6, int var7, byte var8) {// login
        this.init((byte) 1);

        try {
            super.b.writer().writeUTF(var1);
            super.b.writer().writeUTF(var2);
            super.b.writer().writeUTF(var3);
            super.b.writer().writeUTF(var4);
            super.b.writer().writeUTF(var5);
            super.b.writer().writeUTF(var6);
            super.b.writer().writeByte(mGraphics.zoomLevel);
            super.b.writer().writeByte(0);
            super.b.writer().writeInt(var7);
            super.b.writer().writeByte(var8);
            super.b.writer().writeByte((byte) (hso_fi.h ? 1 : 0));
            super.b.writer().writeByte(hso_ft.G);
            super.b.writer().writeByte(hso_bs.k);
            super.b.writer().writeByte(hso_ft.B ? 1 : 0);
            super.b.writer().writeShort(hso_ft.I);
            super.b.writer().writeUTF(hso_ft.F);
            hso_bv.a = false;
            hso_bv.b = 0L;
            hso_bv.c = false;
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.send();
        if (var7 == -1) {
            hso_ft.a(hso_df.bS, new hso_bt(hso_df.Z, 7));
            hso_ft.N = hso_dw.a();
        } else {
            hso_ft.a(hso_df.dj, new hso_bt(hso_df.Z, 7));
        }
    }

    public final void a(short var1, short var2) {
        this.init((byte) 4);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeShort(var2);
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.send();
    }

    public final void a(short var1) {
        this.init((byte) 5);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void b(short var1) {
        this.init((byte) -44);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.send();
    }

    public final void c(short var1) {
        this.init((byte) 7);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.send();
    }

    public final void a(hso_es var1, byte var2) {
        this.init((byte) 9);

        try {
//            hso_dw.a("id skill " + var2);
            super.b.writer().writeByte(var2);
            super.b.writer().writeByte(var1.c());

            for (int var5 = 0; var5 < var1.c(); ++var5) {
                hso_bf var3 = (hso_bf) var1.a(var5);
                super.b.writer().writeShort(var3.a);
            }

            hso_dh.d();
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.send();
    }

    public final void a(short var1, String[] var2) {
        this.init((byte) -53);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeByte(var2.length);

            for (int var4 = 0; var4 < var2.length; ++var4) {
                super.b.writer().writeUTF(var2[var4]);
            }
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void a(byte var1, short var2) {
        this.init((byte) -52);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void d(short var1) {
        this.init((byte) -51);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        this.send();
    }

    public final void a(byte var1, String var2, byte var3, byte var4, byte var5) {
        this.init((byte) 14);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeUTF(var2);
            super.b.writer().writeByte(var3);
            super.b.writer().writeByte(var4);
            super.b.writer().writeByte(var5);
        } catch (Exception var6) {
        }

        this.send();
    }

    public final void a(byte var1, int var2) {
        this.init((byte) 13);

        try {
            super.b.writer().writeByte(0);
            super.b.writer().writeInt(var2);
        } catch (Exception var3) {
        }

        this.send();
        hso_ft.a(hso_df.aG, (hso_bt) null);
    }

    public final void a(byte var1) {
        this.init((byte) 23);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void a(byte var1, short var2, short var3) {
        this.init((byte) 24);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeShort(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void a(short var1, byte var2, byte var3) {
        this.init((byte) 52);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeByte(var3);
            super.b.writer().writeByte(var2);
        } catch (Exception var4) {
        }

        this.send();
        if (GameScreen.p.d(0, -5)) {
            ++GameScreen.p.b;
            MainHelp.a((byte) 0, (byte) 0);
            GameScreen.p.g();
        } else {
            if (GameScreen.p.d(8, 10)) {
                hso_ft.j();
                GameScreen.p.d = null;
                GameScreen.p.f();
                GameScreen.p.g();
                GameScreen.p.c();
            }

        }
    }

    public final void b(short var1, byte var2, byte var3) {
        (new StringBuffer("Gui command -30 idNPC = ")).append(var1).append(" , idMenu = ").append(var2).append(" , index = ").append(var3).toString();
        this.init((byte) -30);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeByte(var2);
            super.b.writer().writeByte(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void a(byte var1, byte var2) {
        this.init((byte) 21);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeByte(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void b(byte var1, byte var2) {
        this.init((byte) 11);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeByte(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void e(short var1) {
        this.init((byte) 32);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void a(byte var1, short var2, byte var3) {
        this.init((byte) 18);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeByte(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void a(short var1, byte var2) {
        this.init((byte) 20);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeByte(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void a(byte var1, byte var2, short var3) {
        this.init((byte) 22);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeByte(var2);
            super.b.writer().writeShort(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void c(byte var1, byte var2) {
        this.init((byte) 22);

        try {
            super.b.writer().writeByte(2);
            super.b.writer().writeByte(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void f(short var1) {
        this.init((byte) 28);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void b(byte var1) {
        this.init((byte) 31);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void a(String var1) {
        if (var1 != null && var1.trim().length() != 0) {
            this.init((byte) 27);

            try {
                super.b.writer().writeUTF(var1);
            } catch (Exception var2) {
            }

            this.send();
            hso_ft.g.a(hso_df.cz, GameScreen.f.cB + ": ", var1, (byte) 1, false);
        }
    }

    public final void a(String var1, String var2) {
        if (var1 != null && var2 != null) {
            this.init((byte) 34);

            try {
                super.b.writer().writeUTF(var1);
                super.b.writer().writeUTF(var2);
            } catch (Exception var3) {
            }

            this.send();
        }
    }

    public final void a(byte var1, String var2) {
        this.init((byte) 35);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void b(byte var1, String var2) {
        this.init((byte) 48);

        try {
            super.b.writer().writeByte(var1);
            if (var1 != 0 && var1 != 5 && var1 != 4) {
                super.b.writer().writeUTF(var2);
            }
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void a(byte var1, String var2, byte var3, short var4, int var5) {
        this.init((byte) 36);

        try {
            super.b.writer().writeByte(var1);
            switch (var1) {
                case 0:
                case 1:
                    super.b.writer().writeUTF(var2);
                    break;
                case 2:
                case 3:
                    super.b.writer().writeByte(var3);
                    super.b.writer().writeShort(var4);
                case 4:
                case 5:
                case 6:
                case 8:
                default:
                    break;
                case 7:
                    super.b.writer().writeInt(var5);
                    break;
                case 9:
                    super.b.writer().writeUTF(var2);
            }
        } catch (Exception var6) {
        }

        this.send();
    }

    public final void a(byte var1, byte var2, hso_es var3) {
        this.init((byte) 40);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeByte(var2);
            super.b.writer().writeByte(var3.c());

            for (int var5 = 0; var5 < var3.c(); ++var5) {
                hso_bf var6 = (hso_bf) var3.a(var5);
                super.b.writer().writeShort(var6.a);
            }
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void b(hso_es var1, byte var2) {
        this.init((byte) 6);

        try {
            super.b.writer().writeByte(var2);
            super.b.writer().writeByte(var1.c());

            for (int var5 = 0; var5 < var1.c(); ++var5) {
                hso_bf var3 = (hso_bf) var1.a(var5);
                super.b.writer().writeShort(var3.a);
            }
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void c(byte var1) {
        this.init((byte) 42);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void a(String var1, byte var2) {
        this.init((byte) 49);

        try {
            super.b.writer().writeUTF(var1);
            super.b.writer().writeByte(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void d(byte var1) {
        this.init((byte) 51);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void a(byte var1, byte var2, byte[] var3) {
        this.init((byte) 55);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeByte(var2);
            int var5 = 0;
            if (var3 != null) {
                var5 = var3.length;
            }

            super.b.writer().writeShort(var5);

            for (int var6 = 0; var6 < var5; ++var6) {
                super.b.writer().writeByte(var3[var6]);
            }
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void e(byte var1) {
        this.init((byte) 56);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void f(byte var1) {
        this.init((byte) -28);

        try {
            super.b.writer().writeByte(hso_cf.z[var1]);
            (new StringBuffer("so goi len")).append(var1).toString();
        } catch (Exception var3) {
        }

        this.send();
        if (MainObject.hso_do.c() == 5) {
            MainObject.hso_do.b(0);
        }

        if (!hso_ft.A && hso_fi.h) {
            MainObject.hso_do.a(hso_cf.A[var1]);
        } else {
            MainObject.hso_do.a("" + hso_cf.z[var1]);
        }

        MainObject.dp = "";

        for (int var4 = 0; var4 < MainObject.hso_do.c(); ++var4) {
            MainObject.dp = MainObject.dp + MainObject.hso_do.a(var4);
        }
    }

    public final void a(byte var1, short var2, byte var3, short var4) {
        this.init((byte) 65);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeByte(var3);
            super.b.writer().writeShort(var4);
        } catch (Exception var5) {
        }

        this.send();
    }

    public final void b(byte var1, short var2, byte var3, short var4) {
        this.init((byte) 44);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeByte(var3);
            super.b.writer().writeShort(1);
        } catch (Exception var5) {
        }

        this.send();
    }

    public final void c(short var1, byte var2, byte var3) {
        this.init((byte) -32);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeByte(var2);
            super.b.writer().writeByte(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void g(byte var1) {
        this.init(var1);
        this.send();
    }

    public final void b(byte var1, short var2, byte var3) {
        this.init((byte) 67);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeByte(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void a(byte var1, int var2, int var3, int var4, int var5) {
        this.init((byte) -100);

        try {
            switch (var1) {
                case 0:
                    super.b.writer().writeByte(var1);
                    super.b.writer().writeShort(var2);
                    super.b.writer().writeShort(var3);
                    super.b.writer().writeShort(var4);
                    super.b.writer().writeShort(var5);
                    break;
                case 1:
                    super.b.writer().writeByte(var1);
                    super.b.writer().writeShort(var2);
                    break;
                case 2:
                    super.b.writer().writeByte(var1);
                    super.b.writer().writeShort(var2);
                    super.b.writer().writeShort(var3);
            }
        } catch (Exception var6) {
        }

        this.send();
    }

    public final void b(byte var1, short var2) {
        this.init((byte) 73);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void h(byte var1) {
        this.init((byte) -97);

        try {
            super.b.writer().writeByte(-1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void c(byte var1, String var2) {
        this.init((byte) 68);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void i(byte var1) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(8);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void j(byte var1) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(21);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void d(byte var1, String var2) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void b(byte var1, int var2) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeInt(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void c(byte var1, int var2) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeInt(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void e(byte var1, String var2) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(14);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void a(byte var1, byte var2, String var3) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(4);
            super.b.writer().writeByte(var2);
            super.b.writer().writeUTF(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void f(byte var1, String var2) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(18);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void g(byte var1, String var2) {
        this.init((byte) 69);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void b(String var1) {
        this.init((byte) 71);

        try {
            super.b.writer().writeUTF(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void a(byte var1, int var2, short var3) {
        this.init((byte) 77);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeInt(var2);
            super.b.writer().writeShort(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void a(short var1, short var2, byte var3, byte var4) {
        this.init((byte) 45);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeByte(var3);
            super.b.writer().writeByte(var4);
        } catch (Exception var5) {
        }

        this.send();
    }

    public final void c(byte var1, short var2) {
        this.init((byte) 44);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void d(byte var1, byte var2) {
        this.init((byte) -91);

        try {
            super.b.writer().writeByte(var1);
            if (var1 == 1) {
                super.b.writer().writeByte(var2);
            } else if (var1 == 2) {
                super.b.writer().writeByte(var2);
            }
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void b(byte var1, byte var2, short var3) {
        this.init((byte) -91);

        try {
            super.b.writer().writeByte(6);
            super.b.writer().writeByte(var2);
            super.b.writer().writeShort(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void a(short var1, short var2, hso_es var3) {
        this.init((byte) -31);

        try {
            super.b.writer().writeShort(var1);
            super.b.writer().writeShort(var2);
            byte var6 = (byte) var3.c();
            super.b.writer().writeByte(var6);

            for (int var7 = 0; var7 < var6; ++var7) {
                String var4 = (String) var3.a(var7);
                super.b.writer().writeUTF(var4);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        this.send();
    }

    public final void k(byte var1) {
        this.init((byte) 37);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void l(byte var1) {
        this.init((byte) -98);

        try {
            super.b.writer().writeByte(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void h(byte var1, String var2) {
        this.init((byte) -101);

        try {
            super.b.writer().writeByte(0);
            super.b.writer().writeUTF(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void a(int var1, hso_es var2, String var3, short var4, int var5, byte var6) {
        this.init((byte) -102);

        try {
            super.b.writer().writeByte(var1);
            switch (var1) {
                case 0:
                    super.b.writer().writeByte(var2.c());

                    for (var1 = 0; var1 < var2.c(); ++var1) {
                        hso_fh var8;
                        if ((var8 = (hso_fh) var2.a(var1)) != null) {
                            super.b.writer().writeShort(var8.b);
                            super.b.writer().writeInt(var8.a);
                            super.b.writer().writeShort(var8.c);
                            super.b.writer().writeByte(var8.d);
                        }
                    }

                    super.b.writer().writeUTF(var3);
                    break;
                case 1:
                    super.b.writer().writeShort(var4);
                    break;
                case 2:
                    super.b.writer().writeShort(var5);
                    super.b.writer().writeShort(var4);
                    super.b.writer().writeByte(var6);
                case 3:
                case 4:
                default:
                    break;
                case 5:
                    super.b.writer().writeShort(var4);
                    super.b.writer().writeShort(var5);
            }

            this.send();
        } catch (Exception var7) {
        }
    }

    public final void d(byte var1, short var2) {
        this.init((byte) -103);

        try {
            super.b.writer().writeByte(0);
            super.b.writer().writeShort(var2);
        } catch (Exception var3) {
        }

        this.send();
    }

    public final void g(short var1) {
        this.init((byte) -106);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void c(byte var1, short var2, byte var3) {
        this.init((byte) -105);

        try {
            super.b.writer().writeByte(var1);
            super.b.writer().writeShort(var2);
            super.b.writer().writeByte(var3);
        } catch (Exception var4) {
        }

        this.send();
    }

    public final void m(byte var1) {
        this.init((byte) -105);

        try {
            super.b.writer().writeByte(3);
        } catch (Exception var2) {
        }

        this.send();
    }

    public final void h(short var1) {
        this.init((byte) -107);

        try {
            super.b.writer().writeShort(var1);
        } catch (Exception var2) {
        }

        this.send();
    }
}
