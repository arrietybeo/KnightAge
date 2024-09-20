public final class hso_bp {
   public int a;
   public int b;
   public int c;
   public int d;
   private int h;
   public int e;
   public int f;
   public int g;
   private int i;
   private int j;
   private int[] k = new int[3];
   private boolean l;
   private boolean m;
   private int n;
   private int o;
   private int p;

   public hso_bp(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.c = var1;
      this.d = var2;
      this.a = var3;
      this.b = var4;
      this.g = var7;
   }

   public final void a() {
      int var1;
      int var2;
      if (hso_ft.Q) {
         if (!this.l && hso_ft.a(this.c, this.d, this.a, this.b)) {
            for(var1 = 0; var1 < this.k.length; ++var1) {
               this.k[0] = hso_ft.af;
            }

            this.j = hso_ft.af;
            this.l = true;
            this.m = this.n != 0;
            this.n = 0;
         } else if (this.l) {
            ++this.i;
            if (this.i > 5 && this.j == hso_ft.af && !this.m) {
               this.j = -1000;
            }

            if ((var1 = hso_ft.af - this.k[0]) != 0 && this.h != -1) {
               this.h = -1;
            }

            for(var2 = this.k.length - 1; var2 > 0; --var2) {
               this.k[var2] = this.k[var2 - 1];
            }

            this.k[0] = hso_ft.af;
            this.e -= var1;
            if (this.e < 0) {
               this.e = 0;
            }

            if (this.e > this.g) {
               this.e = this.g;
            }

            if (this.f < 0 || this.f > this.g) {
               var1 /= 2;
            }

            this.f -= var1;
         }
      }

      if (hso_ft.U && this.l) {
         var1 = hso_ft.af - this.k[0];
         hso_ft.U = false;
         if (hso_ak.e(var1) < 20 && hso_ak.e(hso_ft.af - this.j) < 20 && !this.m && hso_ft.S) {
            this.n = 0;
            this.e = this.f;
            this.j = -1000;
            this.i = 0;
         } else if (this.h != -1 && this.i > 5) {
            this.i = 0;
         } else if (this.h == -1 && !this.m) {
            if (this.f < 0) {
               this.e = 0;
            } else if (this.f > this.g) {
               this.e = this.g;
            } else {
               byte var3;
               if ((var2 = hso_ft.af - this.k[0] + (this.k[0] - this.k[1]) + (this.k[1] - this.k[2])) > 10) {
                  var3 = 10;
               } else if (var2 < -10) {
                  var3 = -10;
               } else {
                  var3 = 0;
               }

               this.n = -var3 * 100;
            }
         }

         this.l = false;
         this.i = 0;
         hso_ft.U = false;
      }

   }

   public final void b() {
      int var1;
      int var2;
      if (hso_ft.Q) {
         if (!this.l && hso_ft.a(this.c, this.d, this.a, this.b)) {
            for(var1 = 0; var1 < this.k.length; ++var1) {
               this.k[0] = hso_ft.ae;
            }

            this.j = hso_ft.ae;
            this.l = true;
            this.m = this.n != 0;
            this.n = 0;
         } else if (this.l) {
            ++this.i;
            if (this.i > 5 && this.j == hso_ft.ae && !this.m) {
               this.j = -1000;
            }

            if ((var1 = hso_ft.ae - this.k[0]) != 0 && this.h != -1) {
               this.h = -1;
            }

            for(var2 = this.k.length - 1; var2 > 0; --var2) {
               this.k[var2] = this.k[var2 - 1];
            }

            this.k[0] = hso_ft.ae;
            this.e -= var1;
            if (this.e < 0) {
               this.e = 0;
            }

            if (this.e > this.g) {
               this.e = this.g;
            }

            if (this.f < 0 || this.f > this.g) {
               var1 /= 2;
            }

            this.f -= var1;
         }
      }

      if (hso_ft.U && this.l) {
         var1 = hso_ft.ae - this.k[0];
         hso_ft.U = false;
         if (hso_ak.e(var1) < 20 && hso_ak.e(hso_ft.ae - this.j) < 20 && !this.m && hso_ft.S) {
            this.n = 0;
            this.e = this.f;
            this.j = -1000;
            this.i = 0;
         } else if (this.h != -1 && this.i > 5) {
            this.i = 0;
         } else if (this.h == -1 && !this.m) {
            if (this.f < 0) {
               this.e = 0;
            } else if (this.f > this.g) {
               this.e = this.g;
            } else {
               byte var3;
               if ((var2 = hso_ft.ae - this.k[0] + (this.k[0] - this.k[1]) + (this.k[1] - this.k[2])) > 10) {
                  var3 = 10;
               } else if (var2 < -10) {
                  var3 = -10;
               } else {
                  var3 = 0;
               }

               this.n = -var3 * 100;
            }
         }

         this.l = false;
         this.i = 0;
         hso_ft.U = false;
      }

   }

   public final void c() {
      if (this.n != 0 && !this.l) {
         this.e += this.n / 100;
         if (this.e < 0) {
            this.e = 0;
         } else if (this.e > this.g) {
            this.e = this.g;
         } else {
            this.f = this.e;
         }

         this.n = this.n * 9 / 10;
         if (this.n < 100 && this.n > -100) {
            this.n = 0;
         }
      }

      if (this.f != this.e && !this.l) {
         this.o = this.e - this.f << 2;
         this.p += this.o;
         this.f += this.p >> 4;
         this.p &= 15;
      }

   }
}
