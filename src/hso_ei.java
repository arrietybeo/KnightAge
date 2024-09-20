public final class hso_ei {
   long a;
   boolean b = false;
   private boolean o = false;
   private int p;
   private int q;
   int c;
   int d;
   int e;
   private int r;
   long f;
   public boolean g = false;
   public int h;
   public int i;
   public byte[] j = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
   public byte k;
   public hso_cz[] l = null;
   public hso_cz[] m = null;
   private hso_ce s;
   hso_es n = new hso_es("MainBuff VecEff");

   public hso_ei(int var1, int var2) {
      this.h = var1;
      this.f = hso_dw.a() + (long)(var2 * 1000);
      switch(this.h) {
      case 11:
         this.s = new hso_ce(149);
         return;
      case 12:
         this.s = new hso_ce(147);
         return;
      case 13:
         this.s = new hso_ce(146);
         return;
      case 14:
         this.s = new hso_ce(148);
      default:
      }
   }

   public hso_ei(int var1, int var2, int var3) {
      this.h = var1;
      this.i = var3;
      this.a = hso_ft.aj;
      this.e = var2;
      this.p = 0;
      this.q = 0;
      this.r = hso_ak.f(9);
      switch(var1) {
      case 0:
      case 2:
      case 5:
      case 7:
         this.s = new hso_ce(88);
         return;
      case 1:
      case 3:
      case 6:
      case 8:
         this.s = new hso_ce(89);
         return;
      case 4:
         this.b = true;
         if (var3 == 3) {
            this.s = new hso_ce(81);
            this.r = 0;
         } else {
            this.s = new hso_ce(80);
            this.r = var3;
            if (var3 > 3) {
               --this.r;
            }
         }

         for(var1 = 0; var1 < 3; ++var1) {
            hso_en var4;
            (var4 = new hso_en()).a = hso_ak.g(16);
            var4.b = hso_ak.g(10);
            if (var3 == 3) {
               var4.i = hso_ak.g(3);
               var4.j = hso_ak.g(2);
            }

            this.n.a(var4);
         }

         return;
      case 9:
         this.b = true;
         return;
      default:
         this.g = true;
      }
   }

   public final void a(mGraphics var1, int var2, int var3) {
      if (!this.g) {
         int var4;
         switch(this.h) {
         case 0:
         case 1:
         case 5:
         case 6:
         case 10:
            if (this.s == null) {
               return;
            }

            this.s.c(2 - (hso_ft.ai + this.r) / 3 % this.s.c, var2, var3, 0, 3, var1);
            return;
         case 2:
         case 3:
         case 7:
         case 8:
            if (this.s == null) {
               return;
            }

            this.s.c((hso_ft.ai + this.r) / 3 % this.s.c, var2, var3, 0, 3, var1);
            return;
         case 4:
            if (this.s != null && this.n != null) {
               for(var4 = 0; var4 < this.n.c(); ++var4) {
                  hso_en var7;
                  if ((var7 = (hso_en)this.n.a(var4)) != null) {
                     this.s.c(this.r * 3 + var7.n % this.s.c, var2 + var7.a, var3 + var7.b, 0, 3, var1);
                  }
               }

               return;
            }

            return;
         case 9:
            for(var4 = this.n.c() - 1; var4 >= 0; --var4) {
               hso_ej var5;
               if ((var5 = (hso_ej)this.n.a(var4)) != null) {
                  boolean var6 = false;
                  int var8 = hso_i.c[0][var5.i];
                  var1.a(var8);
                  var1.a(var5.a, var5.b, var5.c, var5.d);
                  if (var5.j) {
                     var1.a(var5.a + 1, var5.b, var5.c + 1, var5.d);
                  }
               }
            }

            this.c = var2;
            this.d = var3;
            return;
         case 11:
         case 12:
         case 13:
         case 14:
            if (this.s != null) {
               this.s.c(this.j[this.k], var2, var3 - 2, 0, 3, var1);
            }
         default:
         }
      }
   }

   public static void a(int var0, int var1, MainObject var2) {
      for(int var3 = 0; var3 < var2.df.c(); ++var3) {
         hso_ei var4;
         if ((var4 = (hso_ei)var2.df.a(var3)).h == 4 && var4.i == var0) {
            var4.a = hso_ft.aj;
            var4.e = var1 * 1000;
            return;
         }
      }

      var2.b(4, var1 * 1000, var0);
   }

   public static hso_ei a(int var0, int var1) {
      for(int var2 = 0; var2 < GameScreen.f.df.c(); ++var2) {
         hso_ei var3;
         if ((var3 = (hso_ei)GameScreen.f.df.a(var2)).h == var0 && var3.i == var1) {
            return var3;
         }
      }

      return null;
   }
}
