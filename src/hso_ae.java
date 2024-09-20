
public final class hso_ae {

    public static void a() {
        hso_cf.a();
        hso_cg.av = hso_aq.a("/interface/lock.img");
        hso_cg.au = hso_aq.a("/interface/glass.img");
        hso_cg.ag = hso_aq.a("/interface/hp_mp.img");
        hso_cg.af = hso_aq.a("/interface/infochar.img");
        hso_cg.aj = hso_aq.a("/interface/backinfo.img");
        hso_cg.aF = new hso_ce(hso_aq.a("/interface/quest.img"), 12, 19);
        hso_cg.al = hso_aq.a("/interface/focusmap.img");
        hso_cg.ah = hso_aq.a("/interface/color_hp_mp.png");
        hso_cg.ay = hso_aq.a("/interface/color_hp_mpback.png");
        hso_cg.am = hso_aq.a("/interface/delayskill.img");
        hso_cg.an = hso_aq.a("/interface/loadimg.img");
        hso_cg.ao = hso_aq.a("/interface/eyedie.img");
        hso_cg.ap = hso_aq.a("/interface/hotkey.img");
        hso_cg.aq = hso_aq.a("/interface/hotkey2.img");
        hso_cg.ar = hso_aq.a("/interface/mess.img");
        hso_cg.at = hso_aq.a("/interface/gt.img");
        hso_cg.as = hso_aq.a("/interface/coloritem.img");
        hso_cg.aE = new hso_ce(hso_aq.a("/interface/iconpk.png"), 12, 12);
        new hso_ce(hso_aq.a("/interface/ar.img"), 15, 15);
        hso_cg.aD = new hso_ce(hso_aq.a("/interface/objminimap.png"), 7, 7);
        hso_cg.aG = new hso_ce(hso_aq.a("/interface/screentab4.img"), 14, 14);
        hso_cg.aC = new hso_ce(hso_aq.a("/interface/die_char.img"), 28, 42);

        int var0;
        for (var0 = 0; var0 < hso_cg.ab.length; ++var0) {
            hso_cg.ab[var0] = hso_aq.a("/interface/tab" + var0 + ".img");
        }

        hso_cg.ac = hso_aq.a(hso_cg.ab[0].a);
        hso_cg.ae = hso_aq.a("/interface/textf.img");
        MainObject.cZ = hso_aq.a("/interface/focus.img");
        MainObject.da = hso_aq.a("/interface/newfocus.png");
        MainObject.db = hso_aq.a("/shadow.png");
        MainObject.dc = hso_aq.a("/shadow1.png");
        MainObject.dd = hso_aq.a("/water.img");
        hso_gb.c();
        hso_cg.ak = hso_aq.a("/interface/selected_hand.img");
        hso_ah.c = new hso_ce(hso_aq.a("/interface/waiting.img"), 18, 18);
        hso_bs.l = hso_aq.a("/interface/logo.png");

        for (var0 = 0; var0 < hso_fl.aP.length; ++var0) {
            hso_fl.aP[var0] = hso_aq.a("/interface/screentab" + var0 + ".img");
//            System.out.println("id: " + var0 + " send tab: screentab" + var0 + ".img");
        }

        hso_cg.ai = hso_aq.a("/interface/popup.img");

        for (var0 = 0; var0 < hso_cj.e.length; ++var0) {
            hso_cj.e[var0] = hso_aq.a("/interface/chatpopup" + var0 + ".img");
        }

        hso_aq.a("/interface/infofocus.img");
        hso_cf.l = hso_aq.a("/interface/iconauto.img");
        hso_cf.m = hso_aq.a("/interface/iconxp.img");
        hso_cf.s = new hso_ce(hso_aq.a("/interface/statusarea.png"), 11, 11);
        hso_cf.u = new hso_ce(hso_aq.a("/interface/levelup.img"), 11, 11);
        hso_ck.b = new hso_ce(hso_cg.al, 10, 10);
        hso_cf.p = new hso_ce(hso_aq.a("/interface/focusingame.img"), 32, 11);
        hso_cf.x = new hso_ce(hso_aq.a("/interface/event.img"), 22, 22);
        hso_bw.w = new hso_ce(hso_aq.a("/interface/effitemdrop.img"), 15, 15);
        new hso_ce(hso_aq.a("/interface/monsample.img"), 36, 36);
        (hso_en.w = new hso_ce[1])[0] = new hso_ce(hso_aq.a("/interface/eff_inmap0.png"), 16, 16);
        hso_fl.aQ = hso_aq.a("/interface/sk_icn.png");
        hso_fl.aR = hso_aq.a("/interface/pk_icn.png");
        hso_fl.aS = hso_aq.a("/interface/arena_icn.png");
        hso_cf.T = new hso_ce(hso_aq.a("/interface/iconarena.png"), 18, 18);
        if (!hso_dw.g) {
            for (var0 = 0; var0 < hso_cg.ad.length; ++var0) {
                hso_cg.ad[var0] = hso_aq.a("/interface/hitscr" + var0 + ".png");
            }

            for (var0 = 0; var0 < hso_cf.O.length; ++var0) {
                hso_cf.O[var0] = hso_aq.a(hso_cg.ad[var0].a);
                hso_cf.P[var0] = hso_aq.b(hso_cg.ad[var0].a);
            }
        }

        hso_cg.aw = hso_aq.a("/interface/rect.png");
        hso_v.b = new hso_ce[4];
        int[] var3 = new int[]{72, 112, 94, 105};
        int[] var1 = new int[]{74, 57, 54, 63};

        for (int var2 = 0; var2 < 4; ++var2) {
            hso_v.b[var2] = new hso_ce(hso_aq.a("/bg/nhabe" + (var2 + 1) + ".png"), var3[var2], var1[var2]);
        }

        hso_cg.aI = new hso_ce(143);
        hso_cg.aJ = new hso_ce(142);
        hso_cg.aH = new hso_ce(139);
        hso_cg.ax = hso_aq.a("/interface/imgselect_1.png");
        hso_cg.aK = new hso_ce(hso_aq.a("/point/fgpass.png"), 14, 14);
        hso_cg.az = hso_aq.a("/interface/imghpsmall_back.png");
        hso_cg.aA = hso_aq.a("/interface/imghpsmall.png");
        hso_cf.R = hso_aq.a(hso_cg.ay.a);
        hso_cf.S = hso_aq.a(hso_cg.ah.a);
        (MainObject.ei = new hso_ce[2])[0] = new hso_ce(150);
        MainObject.ei[1] = new hso_ce(151);
        hso_cg.aB = hso_aq.a("/interface/18.png");
    }
}
