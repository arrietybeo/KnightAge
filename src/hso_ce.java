public final class hso_ce {
   public int a;
   public int b;
   public int c;
   public hso_aq d;
   private int e = -1;
   private int f;
   private static hso_ek g = new hso_ek();

   public hso_ce(hso_aq var1, int var2, int var3) {
      if (var1 != null) {
         this.d = var1;
         this.a = var2;
         this.b = var3;
         this.c = hso_aq.b(var1.a) / var3;
      }

   }

   public final int a() {
      return this.c;
   }

   public hso_ce(int var1) {
      this.e = var1;
      hso_aq var2;
      if ((var2 = hso_ay.a(var1)) != null) {
         this.d = var2;
      }

      this.a = hso_i.a[var1][0];
      this.b = hso_i.a[var1][1];
      this.c = hso_i.a[var1][2];
   }

   public static hso_ce a(short var0, int var1, int var2, int var3) {
      hso_ce var5;
      if ((var5 = (hso_ce)g.a("" + var0)) == null) {
         var5 = new hso_ce(var0, 3, 5, 0);
         g.a("" + var0, var5);
      } else if (var5.d == null) {
         hso_fd var4;
         if ((var4 = hso_bk.n(var0)) != null && var4.a != null) {
            var5.d = var4.a;
            var5.f = 5;
            var5.a = hso_aq.a(var5.d.a) / 3;
            var5.b = hso_aq.b(var5.d.a) / 5;
            if (var5.d != null || var5.d.a != null) {
               var5.c = 15;
            }
         }
      } else {
         var5.f = 5;
         var5.a = hso_aq.a(var5.d.a) / 3;
         var5.b = hso_aq.b(var5.d.a) / 5;
         if (var5.d != null || var5.d.a != null) {
            var5.c = 15;
         }
      }

      return var5;
   }

   private hso_ce(int var1, int var2, int var3, int var4) {
      this.e = var1;
      this.f = var3;
      hso_fd var5;
      if ((var5 = hso_bk.n((short)var1)) != null && var5.a != null) {
         this.d = var5.a;
         this.a = hso_aq.a(this.d.a) / var2;
         this.b = hso_aq.b(this.d.a) / var3;
         if (this.d != null || this.d.a != null) {
            this.c = var2 * var3 - var4;
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, mGraphics var6) {
      if (var1 >= 0 && var1 < this.c) {
         try {
            boolean var9 = false;
            boolean var7 = false;
            var5 = var1 / this.f * this.a;
            int var10 = var1 % this.f * this.b;
            var6.a(this.d, var5, var10, this.a, this.b, var4, var2, var3, 33);
            return;
         } catch (Exception var8) {
         }
      }

   }

   public final void b(int var1, int var2, int var3, int var4, int var5, mGraphics var6) {
      if (this.d != null && this.d.a != null) {
         if (var1 >= 0 && var1 < this.c && this.d != null && this.d.a != null) {
            var6.a(this.d, 0, var1 * this.b, this.a, this.b, var4, var2, var3, var5);
         }
      } else {
         hso_aq var7;
         if ((var7 = hso_ay.a(this.e)) != null) {
            this.d = var7;
         }

         if (var7.a != null) {
            this.c = hso_aq.b(this.d.a) / this.b;
            return;
         }
      }

   }

   public final void c(int var1, int var2, int var3, int var4, int var5, mGraphics var6) {
      hso_aq var7;
      if ((var7 = hso_ay.a(this.e)) != null && var7.a != null) {
         if (var1 > this.c) {
            var1 = this.c;
         }

         if ((var1 *= this.b) > this.b * (this.c - 1) || var1 < 0) {
            var1 = this.b * (this.c - 1);
         }

         var6.a(var7, 0, var1, this.a, this.b, var4, var2, var3, var5);
      }

   }

   public final void a(int var1, int var2, int var3, int var4, mGraphics var5) {
      hso_aq var6;
      if ((var6 = hso_ay.a(this.e)) != null && var6.a != null) {
         if (var1 > this.c) {
            var1 = this.c;
         }

         if ((var1 *= this.b) > this.b * (this.c - 1) || var1 < 0) {
            var1 = this.b * (this.c - 1);
         }

         var5.a(var6, 0, var1, this.a, this.b, 0, var2, var3, 0);
      }

   }

   public final void b(int var1, int var2, int var3, int var4, mGraphics var5) {
      if (this.d != null && this.d.a != null) {
         if (var1 >= 0 && var1 < this.c && this.d.a != null) {
            var5.a(this.d, 0, var1 * this.b, this.a, this.b, 0, var2, var3, 0);
         }
      } else {
         hso_aq var6;
         if ((var6 = hso_ay.a(this.e)) != null) {
            this.d = var6;
         }

         if (this.d.a != null) {
            this.c = hso_aq.b(this.d.a) / this.b;
            return;
         }
      }

   }
}
