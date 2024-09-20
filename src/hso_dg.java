public final class hso_dg {
   private int a = 1;
   private int[][] b = new int[][]{{-1, -1, -1052689, -1052689, -4079167, -4079167, -6250336}, {-14097665, -14097665, -14104585, -14104585, -14114080, -14114080, -14249063}, {-1280, -1280, -1251840, -1251840, -3949821, -3949821, -5594621}, {-423937, -423937, -1473281, -1473281, -3768833, -3768833, -5934642}, {-20158, -20158, -26313, -26313, -34787, -34787, -3179218}};
   private int[] c = new int[]{1, 1, 1, 1, 1};

   public final void a(int var1, int var2, int var3, int var4, mGraphics var5, int var6) {
      if (var3 > 0) {
         int var7 = var4;
         int var8 = (var3 - 1) % 5;
         var5.a(this.b[var8][6]);
         var5.b(var1 - var4 / 2 - var6, var2 - var4 / 2 - var6, var4, var4);

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < this.c.length; ++var9) {
            var10 = var1 - var7 / 2 + b(hso_ft.ai - var9 * this.a, var4);
            var11 = var2 - var7 / 2 + a(hso_ft.ai - var9 * this.a, var4);
            var5.a(this.b[var8][var9]);
            var5.c(var10 - this.c[var9] / 2 - var6, var11 - this.c[var9] / 2 - var6, this.c[var9], this.c[var9]);
         }

         if (var3 >= 6 && var3 < 11) {
            for(var9 = 0; var9 < this.c.length; ++var9) {
               var10 = var1 - var7 / 2 + b(hso_ft.ai - (var7 << 1) - var9 * this.a, var4);
               var11 = var2 - var7 / 2 + a(hso_ft.ai - (var7 << 1) - var9 * this.a, var4);
               var5.a(this.b[var8][var9]);
               var5.c(var10 - this.c[var9] / 2 - var6, var11 - this.c[var9] / 2 - var6, this.c[var9], this.c[var9]);
            }
         }

         if (var3 >= 11) {
            for(var9 = 0; var9 < this.c.length; ++var9) {
               var10 = var1 - var7 / 2 + b(hso_ft.ai - var7 * 13 / 10 - var9 * this.a, var4);
               var11 = var2 - var7 / 2 + a(hso_ft.ai - var7 * 13 / 10 - var9 * this.a, var4);
               var5.a(this.b[var8][var9]);
               var5.c(var10 - this.c[var9] / 2 - var6, var11 - this.c[var9] / 2 - var6, this.c[var9], this.c[var9]);
            }

            for(var9 = 0; var9 < this.c.length; ++var9) {
               var10 = var1 - var7 / 2 + b(hso_ft.ai - var7 * 13 / 5 - var9 * this.a, var4);
               var11 = var2 - var7 / 2 + a(hso_ft.ai - var7 * 13 / 5 - var9 * this.a, var4);
               var5.a(this.b[var8][var9]);
               var5.c(var10 - this.c[var9] / 2 - var6, var11 - this.c[var9] / 2 - var6, this.c[var9], this.c[var9]);
            }
         }

      }
   }

   private static int a(int var0, int var1) {
      if ((var0 %= var1 * 4) >= 0 && var0 < var1) {
         return 0;
      } else if (var1 <= var0 && var0 < var1 << 1) {
         return var0 % var1;
      } else {
         return var1 << 1 <= var0 && var0 < var1 * 3 ? var1 : var1 - var0 % var1;
      }
   }

   private static int b(int var0, int var1) {
      if ((var0 %= var1 * 4) >= 0 && var0 < var1) {
         return var0 % var1;
      } else if (var1 <= var0 && var0 < var1 << 1) {
         return var1;
      } else {
         return var1 << 1 <= var0 && var0 < var1 * 3 ? var1 - var0 % var1 : 0;
      }
   }
}
