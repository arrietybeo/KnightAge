public final class hso_v extends hso_z {
   public static boolean a = false;
   public static hso_ce[] b;
   private static int[] n = new int[]{420, 376, 290, 310};
   private static int[] o = new int[]{188, 447, 426, 105};

   public hso_v(short var1, short var2, int var3, int var4, int[][] var5) {
      super(var1, var2, var3, var4, var5);
      super.c = 0;
   }

   public final void a(int var1, int var2) {
      super.h = var1;
      super.i = var2;
   }

   public final void a(mGraphics var1) {
      hso_fd var2;
      if ((var2 = hso_bk.b(super.e)).a != null) {
         var1.a(var2.a, super.h + super.f, super.i + super.g, 0);
      }

   }

   public static void b(mGraphics var0) {
      if (a) {
         if (hso_ft.p.d == 58) {
            b[0].b(0, n[0], o[0], 0, var0);
            return;
         }

         if (hso_ft.p.d == 56) {
            b[1].b(0, n[1], o[1], 0, var0);
            return;
         }

         if (hso_ft.p.d == 54) {
            b[2].b(0, n[2], o[2], 0, var0);
            return;
         }

         if (hso_ft.p.d == 60) {
            b[3].b(0, n[3], o[3], 0, var0);
         }
      }

   }
}
