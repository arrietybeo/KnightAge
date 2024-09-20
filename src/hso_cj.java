public final class hso_cj extends hso_cg {
   private int f;
   private int g;
   private int h;
   public int a;
   private int i;
   private int j;
   public int b;
   public String[] c;
   public String d;
   public static hso_aq[] e = new hso_aq[2];
   private boolean k;
   private int[] l;

   public hso_cj() {
      this.f = hso_ft.Y;
      this.g = hso_ft.Z;
      this.b = 0;
      this.k = true;
      this.l = new int[]{-13427660, -16788};
   }

   public final void a(String var1, boolean var2) {
      this.k = var2;
      var1 = var1.trim();
      this.i = hso_o.i.a(var1);
      if (this.i > 100) {
         this.i = 100;
      } else if (this.i < 20) {
         this.i = 20;
      }

      this.h = 8;
      this.d = var1;
      this.c = hso_o.i.a(var1, this.i);
      this.a = this.c.length * hso_ft.ab;
      if (this.c.length <= 2) {
         this.j = 80;
      } else {
         this.j = 140;
      }
   }

   public final void a(mGraphics var1) {
      if (this.h > 0) {
         this.h -= 2;
      }

      var1 = var1;
      hso_cj var6 = this;

      try {
         int var2 = var6.g - var6.a + var6.h;
         int var3 = var6.f - var6.i / 2;
         var1.a(var6.l[0]);
         var1.c(var3 - 3, var2, var6.i + 6, var6.a);
         var1.c(var3, var2 - 3, var6.i, var6.a + 6);
         var1.a(var6.l[1]);
         var1.c(var3, var2 - 2, var6.i, var6.a + 4);
         var1.c(var3 - 2, var2, var6.i + 4, var6.a);
         var1.a(e[0], 0, 0, 3, 3, 0, var3 - 3, var2 - 3, 0);
         var1.a(e[0], 0, 3, 3, 3, 0, var3 + var6.i, var2 - 3, 0);
         var1.a(e[0], 0, 9, 3, 3, 0, var3 - 3, var2 + var6.a, 0);
         var1.a(e[0], 0, 6, 3, 3, 0, var3 + var6.i, var2 + var6.a, 0);
         if (var6.b == 1) {
            var1.a(e[1], 0, 0, 7, 7, 3, var3 + var6.i / 2 - 3, var2 - 9, 0);
         } else {
            var1.a(e[1], var3 + var6.i / 2 - 3, var2 + var6.a + 2, 0);
         }

         if (var6.c != null) {
            for(int var4 = 0; var4 < var6.c.length; ++var4) {
               hso_o.i.a(var1, var6.c[var4], var3 + var6.i / 2, var2 + 1 + var4 * hso_ft.ab, 2, false);
            }

            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public final void d(int var1, int var2) {
      this.f = var1;
      this.g = var2;
   }

   public final boolean b() {
      --this.j;
      return this.j <= 0 && this.k;
   }
}
