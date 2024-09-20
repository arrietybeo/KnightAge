
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class hso_co {

    public static boolean a = false;
    public static boolean b = true;
    public static String c = "";

    public static void a() {
        Service.a().a((byte) 1, (byte) 0, (byte[]) null);
        a((byte) 0, (byte[]) null);
    }

    public static void a(byte var0, byte[] var1) {
        try {
            switch (var0) {
                case 0:
                    if (GameScreen.f != null) {
                        hso_y.a(var1);
//                        return;
                    }
                    break;
                case 1:
                    GameScreen.p.b(var1);
                    hso_ft.d.f = true;
                    if (!hso_ft.D && !hso_f.a && (GameScreen.p.a > 0 || GameScreen.p.b > -5)) {
                        GameScreen.M = true;
                        hso_ft.j();
                        Player.m = false;
//                        return;
                    }
                    break;
                case 2:
                    GameScreen.p.a(var1);
                    a = true;
//                    return;
                    break;
                case 3:
                    if (var1 != null) {
                        byte[] var4 = var1;
                        c = "";
                        boolean var6 = false;
                        Player.l = var1[0] == 1;
                        hso_ah.e[0] = var1[1];
                        hso_ah.e[1] = var1[2];
                        if (Player.l && hso_cf.J) {
                            var6 = true;
                            c = c + hso_df.cH + "\n  +" + hso_df.gr[0] + hso_ah.e[0] + "%\n  +" + hso_df.gr[1] + hso_ah.e[1] + "%";
                        }

                        boolean var2;
                        if (var2 = var1[3] == 1) {
                            Player.q = new hso_be(var1[4], var1[5], var1[6]);
                        }

                        if (var2 && hso_cf.J) {
                            if (var6) {
                                c = c + "\n";
                            } else {
                                var6 = true;
                            }

                            c = (c = (c = c + hso_df.di + "\n  +" + hso_df.gu[0] + ": " + hso_df.gI[0][Player.q.a]) + "\n  +" + hso_df.gu[1] + ": " + hso_df.gI[1][Player.q.b]) + "\n  +" + hso_df.gu[2] + ": " + hso_df.gI[2][Player.q.c];
                        }

                        Player.p = var1[7];
                        int var7 = hso_ah.b;
                        if (var1.length - 7 >= var7) {
                            var7 -= hso_ak.e(var7 - (var1.length - 7)) + 1;
                        }

                        int var3;
                        for (var3 = 0; var3 < var7; ++var3) {
                            hso_ah.f[var3][1] = var4[var3 + 8];
                        }

                        if (Player.p == 1 && hso_cf.J) {
                            if (var6) {
                                c = c + "\n";
                            }

                            c = c + hso_df.ev;

                            for (var3 = 0; var3 < var7; ++var3) {
                                if (hso_ah.f[var3][1] == 1) {
                                    hso_ev var5 = (hso_ev) hso_y.a.a(hso_ah.f[var3][2]);
                                    c = c + "\n  " + var5.c;
                                }
                            }
                        }

                        if (c.length() > 0 && b && hso_ft.a == hso_ft.c) {
                            b = false;
                            hso_ft.b(hso_df.cJ + "\n  " + c, hso_df.cI);
                        }

//                        return;
                    }
                    break;
                case 4:
                    if (var1 != null) {
                        if (hso_ft.A) {
                            hso_cf.I = var1[0] == 1;
                            hso_cf.h();
                        }

                        if (var1.length > 1) {
                            hso_cf.J = var1[1] == 1;
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void b() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeByte(Player.l ? 1 : 0);
            var1.writeByte(hso_ah.e[0]);
            var1.writeByte(hso_ah.e[1]);
            var1.writeByte(Player.q == null ? 0 : 1);
            if (Player.q == null) {
                var1.writeByte(0);
                var1.writeByte(0);
                var1.writeByte(0);
            } else {
                var1.writeByte(Player.q.a);
                var1.writeByte(Player.q.b);
                var1.writeByte(Player.q.c);
            }

            var1.writeByte(Player.p);

            for (int var2 = 0; var2 < hso_ah.b; ++var2) {
                var1.writeByte(hso_ah.f[var2][1]);
            }

            hso_ak.a((byte) 3, var0.toByteArray());
            var1.close();
        } catch (Exception var3) {
        }
    }

    public static void c() {
        byte[] var0;
        (var0 = new byte[2])[0] = (byte) (hso_cf.I ? 1 : 0);
        var0[1] = (byte) (hso_cf.J ? 1 : 0);

        try {
            hso_ak.a((byte) 4, var0);
        } catch (Exception var1) {
        }
    }
}
