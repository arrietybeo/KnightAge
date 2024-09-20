public final class hso_ca extends hso_dx {
   public byte a = 0;
   private int z = 0;
   private int A;
   private int B;
   public hso_es b = new hso_es("AnimateEffect list");
   public boolean c;
   private static int C = 5;
   private static int D;
   private static int E = hso_ak.g(2);
   private hso_aq F;

   public final void b() {
      this.c = true;
   }

   public hso_ca(byte var1, boolean var2, int var3, int var4) {
      this.A = var4;
      this.B = (int)(hso_ft.aj / 1000L);
      this.a = var1;
      byte var5 = 1;
      switch(var1) {
      case 0:
      default:
         break;
      case 1:
         var5 = 3;
         this.F = hso_aq.a("/efleaf.img");
         break;
      case 2:
         var5 = 2;
         this.F = hso_aq.a("/efsnow.img");
         break;
      case 3:
         this.F = hso_aq.a("/efhoa.img");
         break;
      case 4:
         var5 = 12;
         break;
      case 5:
         this.c = true;
         return;
      }

      if (var3 > 0) {
         this.z = var3;
      } else if (var3 == -1) {
         this.z = hso_ft.W * hso_ft.X / (var5 * 8 * 200);
      } else if (var3 == -2) {
         this.z = hso_ft.W * hso_ft.X / (var5 * 6 * 200);
      } else if (var3 == -3) {
         this.z = hso_ft.W * hso_ft.X / (var5 * 3 * 200);
      } else if (var3 == -4) {
         this.z = hso_ft.W * hso_ft.X / (var5 * 2 * 200);
      } else {
         this.z = 10;
      }

      if (var1 != 4) {
         for(var3 = 0; var3 < this.z; ++var3) {
            hso_en var6 = null;
            if (var2) {
               var6 = new hso_en((hso_p.d.a - hso_ft.Y + hso_ak.f(hso_ft.W << 1)) * 10, (hso_p.d.b - (hso_ft.X << 1) + hso_ak.f(hso_ft.X << 1)) * 10);
            } else {
               var6 = new hso_en();
               this.a(var6);
            }

            if (var1 != 2 && this.a != 3) {
               var6.f = hso_ak.f(4);
            } else {
               var6.f = hso_ak.f(3);
            }

            if (var1 == 5) {
               var6.i = hso_ak.c(2, 8);
               var6.j = hso_ak.c(2, 12);
            }

            var6.h = 16 + (hso_ak.f(3) << 2);
            var6.d = hso_ak.c(-1, 1);
            var6.g = hso_ak.f(var6.h);
            var6.p = hso_ak.f(2);
            if (var1 == 2) {
               var6.m = (byte)hso_ak.f(6);
            } else if (var1 == 1) {
               var6.m = (byte)hso_ak.f(4);
            } else {
               var6.m = (byte)hso_ak.f(20);
            }

            this.b.a(var6);
         }
      }

   }

   public final void a(mGraphics var1) {
      hso_ft.a(var1);
      var1.a(-hso_p.d.a, -hso_p.d.b);
      hso_ca var5;
      int var6;
      hso_en var7;
      switch(this.a) {
      case 0:
         var1 = var1;
         var5 = this;
         var1.a(-2236963);

         for(var6 = 0; var6 < var5.z; ++var6) {
            if ((var7 = (hso_en)var5.b.a(var6)).a / 10 > hso_p.d.a && var7.a / 10 < hso_p.d.a + hso_ft.W && var7.b / 10 > hso_p.d.b) {
               var1.c(var7.a / 10, var7.b / 10, 1, var7.f + 2);
            }
         }

         return;
      case 1:
         var1 = var1;
         var5 = this;
         if (this.F != null) {
            for(var6 = 0; var6 < var5.z; ++var6) {
               if ((var7 = (hso_en)var5.b.a(var6)).a / 10 > hso_p.d.a && var7.a / 10 < hso_p.d.a + hso_ft.W && var7.b / 10 > hso_p.d.b) {
                  if (hso_ak.f(6) == 0) {
                     var7.m = (byte)hso_ak.f(4);
                  }

                  var1.a(var5.F, 0, var7.m * 10, 16, 10, 0, var7.a / 10, var7.b / 10, 3);
               }
            }
         }

         return;
      case 2:
         var1 = var1;
         var5 = this;
         if (this.F != null) {
            for(var6 = 0; var6 < var5.z; ++var6) {
               if ((var7 = (hso_en)var5.b.a(var6)).a / 10 > hso_p.d.a && var7.a / 10 < hso_p.d.a + hso_ft.W && var7.b / 10 > hso_p.d.b) {
                  var1.a(var5.F, 0, 7 * var7.m, 7, 7, 0, var7.a / 10, var7.b / 10, 3);
               }
            }
         }

         return;
      case 3:
         var1 = var1;
         var5 = this;
         boolean var2 = false;
         if (this.F != null) {
            for(int var3 = 0; var3 < var5.z; ++var3) {
               hso_en var4;
               if ((var4 = (hso_en)var5.b.a(var3)).a / 10 > hso_p.d.a && var4.a / 10 < hso_p.d.a + hso_ft.W && var4.b / 10 > hso_p.d.b) {
                  if ((var6 = 2 - var4.f + 1) < 2) {
                     var6 = var4.m / 10;
                  }

                  var1.a(var5.F, 0, var6 * 10, 10, 10, 0, var4.a / 10, var4.b / 10, 3);
                  ++var4.m;
                  if (var4.m >= 20) {
                     var4.m = 0;
                  }
               }
            }
         }

         return;
      case 5:
      case 4:
      default:
      }
   }

   public static void c() {
      int var0 = 1;
      if (hso_ft.ai % 6 == 3) {
         var0 = hso_ak.f(15);
      }

      if (var0 == 0 && C == 5) {
         C = 5 + hso_ak.f(20);
         D = 50 + hso_ak.f(100);
      }

      if (D > 0) {
         --D;
      }

      if (D == 0 && C > 5 && hso_ft.ai % 4 == 2) {
         --C;
      }

   }

   public final void a() {
      if (this.A > 0 && hso_ft.aj / 1000L - (long)this.B > (long)this.A) {
         this.c = true;
      }

      hso_en var10000;
      int var1;
      hso_en var2;
      hso_ca var3;
      switch(this.a) {
      case 0:
         var3 = this;

         for(var1 = 0; var1 < var3.z; ++var1) {
            var10000 = var2 = (hso_en)var3.b.a(var1);
            var10000.b += (var2.f + 1) * 15 + (3 - var2.f) * 3;
            ++var2.c;
            var2.a += (3 - var2.f + 1 << 1) + C * E;
            if (var2.b / 10 < hso_p.d.b - hso_ft.Y || var2.b / 10 > hso_p.d.b + hso_ft.X + hso_ft.Z - (4 - var2.f) * 50 || var2.a / 10 < hso_p.d.a - hso_ft.Y || var2.a / 10 > hso_p.d.a + hso_ft.W + hso_ft.Y) {
               var3.a(var2);
            }
         }

         return;
      case 1:
         var3 = this;

         for(var1 = 0; var1 < var3.z; ++var1) {
            var10000 = var2 = (hso_en)var3.b.a(var1);
            var10000.b += 15;
            var2.a += var2.d * 10 + C * E;
            ++var2.g;
            if (var2.g >= var2.h) {
               var2.g = 0;
            }

            if (var2.b / 10 < hso_p.d.b - hso_ft.Y || var2.b / 10 > hso_p.d.b + hso_ft.X + hso_ft.Z - (4 - var2.f) * 50 || var2.a / 10 < hso_p.d.a - hso_ft.Y || var2.a / 10 > hso_p.d.a + hso_ft.W + hso_ft.Y) {
               var3.a(var2);
            }
         }

         return;
      case 2:
         var3 = this;

         for(var1 = 0; var1 < var3.z; ++var1) {
            var10000 = var2 = (hso_en)var3.b.a(var1);
            var10000.b += (var2.f + 4) * 3;
            var2.a += (var2.f + 1 << 1) + C * E;
            if ((var2.b / 10 < hso_p.d.b - hso_ft.Y || var2.b / 10 > hso_p.d.b + hso_ft.X + hso_ft.Z - (4 - var2.f) * 50 || var2.a / 10 < hso_p.d.a - hso_ft.Y || var2.a / 10 > hso_p.d.a + hso_ft.W + hso_ft.Y) && hso_ak.f(40) == 0) {
               var3.a(var2);
            }
         }

         return;
      case 3:
         var3 = this;

         for(var1 = 0; var1 < var3.z; ++var1) {
            var10000 = var2 = (hso_en)var3.b.a(var1);
            var10000.b += (var2.f + 2) * 5;
            var2.a += (var2.f + 1 << 1) + C * E;
            if (var2.b / 10 < hso_p.d.b - hso_ft.Y || var2.b / 10 > hso_p.d.b + hso_ft.X + hso_ft.Z - (4 - var2.f) * 50 || var2.a / 10 < hso_p.d.a - hso_ft.Y || var2.a / 10 > hso_p.d.a + hso_ft.W + hso_ft.Y) {
               var3.a(var2);
            }
         }

         return;
      case 4:
         if (hso_ak.f(250) < this.z) {
            var1 = hso_ak.c(1, 3);
            GameScreen.a(86, 0, 0, 0, (short)0, (byte)var1);
         }

         return;
      case 5:
         var3 = this;

         for(var1 = 0; var1 < var3.b.c(); ++var1) {
            var10000 = var2 = (hso_en)var3.b.a(var1);
            var10000.b += var2.j;
            var2.a += var2.i * E;
            if (var2.b / 10 < hso_p.d.b - hso_ft.Y || var2.b / 10 > hso_p.d.b + hso_ft.X + hso_ft.Z || var2.a / 10 < hso_p.d.a - hso_ft.Y || var2.a / 10 > hso_p.d.a + hso_ft.W + hso_ft.Y) {
               var3.b.d(var2);
               --var1;
            }
         }

         if ((var3.A <= 0 || hso_ft.aj / 1000L - (long)var3.B <= (long)var3.A) && !var3.c && hso_ak.f(350) < 0) {
            hso_en var4 = null;
            var4 = new hso_en();
            var3.a(var4);
            var4.f = hso_ak.f(4);
            var4.h = 16 + (hso_ak.f(3) << 2);
            var4.d = hso_ak.c(-1, 1);
            var4.g = hso_ak.f(var4.h);
            var4.p = hso_ak.f(2);
            var4.m = (byte)hso_ak.f(20);
            var4.i = hso_ak.c(2, 8);
            var4.j = hso_ak.c(2, 12);
            var3.b.a(var4);
         }
      default:
      }
   }

   private void a(hso_en var1) {
      if (this.c) {
         this.b.d(var1);
         this.z = this.b.c();
         if (this.b.c() == 0) {
            return;
         }
      } else {
         if (this.a == 5) {
            var1.b = (hso_p.d.b - hso_ft.Z + hso_ak.f(hso_ft.X / 2)) * 10;
            if (E > 0) {
               var1.a = (hso_p.d.a - hso_ft.Y + hso_ak.f(hso_ft.W)) * 10;
            } else {
               var1.a = (hso_p.d.a + hso_ft.Y + hso_ak.f(hso_ft.W)) * 10;
            }

            var1.p = hso_ak.f(2);
            var1.i = hso_ak.c(2, 8);
            var1.j = hso_ak.c(2, 12);
         } else {
            var1.b = (hso_p.d.b - hso_ft.Z + hso_ak.f(hso_ft.X << 1)) * 10;
            var1.a = (hso_p.d.a - hso_ft.Y + hso_ak.f(hso_ft.W << 1)) * 10;
         }

         if (this.a == 2 || this.a == 3) {
            var1.f = hso_ak.f(3);
            return;
         }

         if (this.a == 0) {
            var1.f = hso_ak.c(1, 5);
            return;
         }

         var1.f = hso_ak.f(4);
      }

   }
}
