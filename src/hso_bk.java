
import java.util.Enumeration;

/**
 * 
 * @param bk
 */
public final class hso_bk {

    static {
        new hso_es("ObjectData vecSaveImage");
    }

    public static hso_fd a(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) GameScreen.n.a("" + var0)) == null) {
            var1 = new hso_fd();
            GameScreen.n.a("" + var0, var1);
            String var2 = "/resLocal/npc/" + var0 + ".png";
            if (var0 >= 500) {
                int var3 = var0 - 500;
                var2 = "/resLocal/npc/icon/" + var3 + ".png";
            }

            hso_aq var4;
            if ((var4 = hso_aq.a(var2)) == null) {
                var1.a = o((short) (var0 + 3000));
            } else {
                var1.a = var4;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 3000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd b(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) GameScreen.m.a("" + var0)) == null) {
            var1 = new hso_fd();
            GameScreen.m.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/tree/" + var0 + ".png")) == null) {
                var1.a = o((short) var0);
            } else {
                var1.a = var2;
            }
        } else if (!hso_ft.A) {
            var1.d = (int) (hso_ft.aj / 1000L);
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) var0);
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd c(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_au.K.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_au.K.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/mons/" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 1000));
            } else {
                var1.a = var2;
            }
        } else if (!hso_ft.A) {
            var1.d = (int) (hso_ft.aj / 1000L);
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 1000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd d(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.ac.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.ac.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/icon/icon_" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 2000));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 2000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd e(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.ad.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.ad.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/potion/potionIcon_" + (var0 + 1 >= 10 ? String.valueOf(var0 + 1) : "0" + (var0 + 1)) + ".png")) == null) {
                var1.a = o((short) (var0 + 4000));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 4000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd f(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.ae.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.ae.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/iconq/" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 5000));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 5000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd g(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.af.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.af.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/material/" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 5500));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 5500));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd h(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_ev.a.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_ev.a.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a(var0 < 10 ? "/resLocal/skill/iconSkill_0" + var0 + ".png" : "/resLocal/skill/iconSkill_" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 6000));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 6000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd i(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.ag.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.ag.a("" + var0, var1);
            String var2 = "/resLocal/iconclan/" + var0 + ".png";
            if (var0 >= 500) {
                int var3 = var0 - 500;
                var2 = "/resLocal/iconclan/shop/" + var3 + ".png";
            }

            hso_aq var4;
            if ((var4 = hso_aq.a(var2)) == null) {
                var1.a = o((short) (var0 + 7000));
            } else {
                var1.a = var4;
            }
        } else if (!hso_ft.A) {
            var1.d = (int) (hso_ft.aj / 1000L);
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 7000));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd j(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.ah.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.ah.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/iconclan/huyhieu/" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 9500));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 9500));
                var1.e = 0;
            }
        }

        return var1;
    }

    public static hso_fd k(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.ai.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.ai.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/pet/icon/icon_pet_" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 10000));
            } else {
                var1.a = var2;
            }
        }

        return var1;
    }

    public static hso_fd l(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_s.x.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_s.x.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/pet/" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 10200));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 10200));
                var1.e = 0;
            }
        }

        return var1;
    }

    private static hso_aq o(short var0) {
        hso_aq var1 = null;
        (new StringBuffer("image")).append(var0).toString();
        byte[] var3 = null;
        if (m(var0)) {
            var3 = hso_ak.a("image" + var0);
        }

        if (var3 == null) {
            Service.a().d(var0);
            return null;
        } else {
            try {
                var1 = hso_aq.a(var3);
                return var1;
            } catch (Exception var2) {
                Service.a().d(var0);
                return null;
            }
        }
    }

    public static boolean m(short var0) {
        return var0 >= 4000 && var0 < 5000 || var0 >= 3000 && var0 < 3500 || var0 >= 6000 && var0 < 7000;
    }

    public static void a(byte[] var0, short var1) {
        try {
            hso_ak.a("image" + var1, var0);
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void a(hso_ek var0) {
        Enumeration var1 = var0.a.keys();

        while (var1.hasMoreElements()) {
            String var2 = (String) var1.nextElement();
            hso_fd var3 = (hso_fd) var0.a(var2);
            if (hso_ft.aj / 1000L - (long) var3.d > 300L) {
                var0.a((Object) var2);
            }
        }

    }

    public static hso_fd n(short var0) {
        hso_fd var1;
        if ((var1 = (hso_fd) hso_bw.aj.a("" + var0)) == null) {
            var1 = new hso_fd();
            hso_bw.aj.a("" + var0, var1);
            hso_aq var2;
            if ((var2 = hso_aq.a("/resLocal/mount/" + var0 + ".png")) == null) {
                var1.a = o((short) (var0 + 10700));
            } else {
                var1.a = var2;
            }
        }

        if (var1.a == null) {
            ++var1.e;
            if (var1.e >= 200) {
                Service.a().d((short) (var0 + 10700));
                var1.e = 0;
            }
        }

        return var1;
    }
}
