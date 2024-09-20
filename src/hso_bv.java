public final class hso_bv {
   public static boolean a = false;
   public static long b = hso_dw.a();
   public static boolean c = false;

   public static void a() {
      hso_es var0 = new hso_es("GlobalLogicHandler vec");
      if (hso_x.f && hso_ft.a != hso_ft.b && hso_ft.a != hso_ft.d) {
         var0.a(new hso_bt(hso_df.cL, 0));
      }

      var0.a(new hso_bt(hso_df.bR, 6));
      hso_ft.a(hso_df.ck, var0);
      ISession.a().c();
      if (!c) {
         a = true;
         b = hso_dw.a() + 30000L;
      } else {
         a = false;
         b = 0L;
      }

      if (GameScreen.aP) {
         a = false;
         b = 0L;
      }

      if (GameScreen.f != null) {
         GameScreen.f.N();
         if (Player.o == 1) {
            Player.o_();
         }
      }

   }
}
