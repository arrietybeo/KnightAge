public final class hso_e {
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   public int a;
   private int i;
   public int b;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int[] o = new int[3];
   private boolean p;
   private boolean q;
   private int r;
   private hso_es s;
   private hso_bt t = null;
   private int u;
   private int v;

   public hso_e(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, hso_es var9) {
      this.g = var1;
      this.h = var2;
      this.c = var3;
      this.e = var4;
      this.d = var5;
      this.f = var6;
      this.a = var8;
      this.j = var7;
      this.s = var9;
   }

   public final void a() {
      if (this.r != 0 && !this.p) {
         this.i += this.r / 100;
         if (this.i < 0) {
            this.i = 0;
         } else if (this.i > this.j) {
            this.i = this.j;
         } else {
            this.b = this.i;
         }

         this.r = this.r * 9 / 10;
         if (this.r < 100 && this.r > -100) {
            this.r = 0;
         }
      }

      if (this.b != this.i && !this.p) {
         this.u = this.i - this.b << 2;
         this.v += this.u;
         this.b += this.v >> 4;
         this.v &= 15;
      }

      boolean var2 = false;
      if (!hso_ft.ak[2] && !hso_ft.ak[4]) {
         if (hso_ft.ak[8] || hso_ft.ak[6]) {
            var2 = true;
            ++this.a;
            if (this.a > this.f - 1) {
               this.a = 0;
            }

            hso_ft.c(6);
            hso_ft.c(8);
         }
      } else {
         var2 = true;
         --this.a;
         if (this.a < 0) {
            this.a = this.f - 1;
         }

         hso_ft.c(2);
         hso_ft.c(4);
      }

      if (var2) {
         this.i = (this.a + 1) * this.d - this.e / 2;
         if (this.i > this.j) {
            this.i = this.j;
         }

         if (this.i < 0) {
            this.i = 0;
         }

         if (this.a == this.f - 1 || this.a == 0) {
            this.b = this.i;
         }
      }

      hso_e var1 = this;
      hso_bt var5;
      if (hso_ft.al[5] && this.s != null && (var5 = (hso_bt)this.s.a(this.a)) != null) {
         if (var5.c == null) {
            if (var5.d != null) {
               var5.d.a(var5.e, var5.f);
            } else {
               hso_ft.a.a_(var5.e, var5.f);
            }
         }

         hso_ft.m();
         hso_ft.l();
      }

      int var3;
      int var6;
      if (hso_ft.Q) {
         if (!this.p && hso_ft.a(this.g, this.h, this.c, this.e)) {
            for(var6 = 0; var6 < var1.o.length; ++var6) {
               var1.o[0] = hso_ft.af;
            }

            var1.n = hso_ft.af;
            var1.p = true;
            var1.q = var1.r != 0;
            var1.r = 0;
         } else if (this.p) {
            ++this.l;
            if (this.l > 5 && this.n == hso_ft.af && !this.q) {
               this.n = -1000;
               this.a = (this.i + hso_ft.af - this.h) / this.d;
            }

            if ((var6 = hso_ft.af - this.o[0]) != 0 && this.a != -1) {
               this.a = -1;
            }

            for(var3 = this.o.length - 1; var3 > 0; --var3) {
               var1.o[var3] = var1.o[var3 - 1];
            }

            var1.o[0] = hso_ft.af;
            var1.i -= var6;
            if (var1.i < 0) {
               var1.i = 0;
            }

            if (var1.i > var1.j) {
               var1.i = var1.j;
            }

            if (var1.b < 0 || var1.b > var1.j) {
               var6 /= 2;
            }

            var1.b -= var6;
         }
      }

      if (hso_ft.U && var1.p) {
         var6 = hso_ft.af - var1.o[0];
         hso_ft.U = false;
         if (hso_ak.e(var6) < 20 && hso_ak.e(hso_ft.af - var1.n) < 20 && !var1.q) {
            var1.r = 0;
            var1.i = var1.b;
            var1.n = -1000;
            var1.a = (var1.i + hso_ft.af - var1.h) / var1.d;
            var1.l = 0;
            var1.m = 5;
         } else if (var1.a != -1 && var1.l > 5) {
            var1.l = 0;
            var1.m = 1;
         } else if (var1.a == -1 && !var1.q) {
            if (var1.b < 0) {
               var1.i = 0;
            } else if (var1.b > var1.j) {
               var1.i = var1.j;
            } else {
               byte var7;
               if ((var3 = hso_ft.af - var1.o[0] + (var1.o[0] - var1.o[1]) + (var1.o[1] - var1.o[2])) > 10) {
                  var7 = 10;
               } else if (var3 < -10) {
                  var7 = -10;
               } else {
                  var7 = 0;
               }

               var1.r = -var7 * 100;
            }
         }

         var1.p = false;
         var1.l = 0;
         hso_ft.U = false;
      }

      if (this.k != 0) {
         this.k >>= 1;
         if (this.k < 0) {
            this.k = 0;
         }
      }

      if (this.m > 0) {
         --this.m;
         if (this.m == 0 && this.a >= 0) {
            hso_bt var4;
            if (this.s != null && (var4 = (hso_bt)this.s.a(this.a)) != null) {
               if (var4.c == null) {
                  if (var4.d != null) {
                     var4.d.a(var4.e, var4.f);
                  } else {
                     hso_ft.a.a_(var4.e, var4.f);
                  }
               }

               hso_ft.m();
               hso_ft.l();
            }

            hso_ft.m();
            hso_ft.l();
            hso_ft.V = true;
            hso_ft.S = false;
         }
      }

   }
}
