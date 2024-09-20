public final class hso_fz {
   int a;
   int b;
   int c;
   int d;
   int e;
   int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int[] w = new int[3];
   private boolean x;
   private boolean y;
   private int z;
   private int A;
   private int B;
   private int C;
   private boolean D = true;
   private boolean E;

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
      var1.d(var2, var3, var4, var5 - 1);
      var1.a(-var1.a(), -var1.b());
      var1.a(-this.i, -this.j);
   }

   public final hso_cq a() {
      int var1;
      int var2;
      int var3;
      int var4;
      hso_fz var5;
      byte var6;
      boolean var7;
      hso_cq var8;
      if (this.D) {
         var1 = (var5 = this).o;
         var2 = var5.p;
         var3 = var5.q;
         var4 = var5.r;
         if (hso_ft.Q) {
            if (!var5.x && hso_ft.a(var1, var2, var3, var4)) {
               for(var3 = 0; var3 < var5.w.length; ++var3) {
                  var5.w[0] = hso_ft.af;
               }

               var5.v = hso_ft.af;
               var5.x = true;
               var5.A = -1;
               var5.y = var5.z != 0;
               var5.z = 0;
            } else if (var5.x) {
               ++var5.u;
               if (var5.u > 5 && var5.v == hso_ft.af && !var5.y) {
                  var5.v = -1000;
                  if (var5.C > 1) {
                     var3 = (var5.h + hso_ft.af - var2) / var5.B;
                     var4 = (var5.g + hso_ft.ae - var1) / var5.B;
                     var5.A = var3 * var5.C + var4;
                  } else {
                     var5.A = (var5.h + hso_ft.af - var2) / var5.B;
                  }
               }

               if ((var3 = hso_ft.af - var5.w[0]) != 0 && var5.A != -1) {
                  var5.A = -1;
               }

               for(var4 = var5.w.length - 1; var4 > 0; --var4) {
                  var5.w[var4] = var5.w[var4 - 1];
               }

               var5.w[0] = hso_ft.af;
               var5.h -= var3;
               if (var5.h < 0) {
                  var5.h = 0;
               }

               if (var5.h > var5.t) {
                  var5.h = var5.t;
               }

               if (var5.j < 0 || var5.j > var5.t) {
                  var3 /= 2;
               }

               var5.j -= var3;
            }
         }

         var7 = false;
         if (hso_ft.R && var5.x) {
            var4 = hso_ft.af - var5.w[0];
            hso_ft.R = false;
            if (Math.abs(var4) < 20 && Math.abs(hso_ft.af - var5.v) < 20 && !var5.y) {
               var5.z = 0;
               var5.h = var5.j;
               var5.v = -1000;
               if (var5.C > 1) {
                  var2 = (var5.h + hso_ft.af - var2) / var5.B;
                  var1 = (var5.g + hso_ft.ae - var1) / var5.B;
                  var5.A = var2 * var5.C + var1;
               } else {
                  var5.A = (var5.h + hso_ft.af - var2) / var5.B;
               }

               var5.u = 0;
               var7 = true;
            } else if (var5.A != -1 && var5.u > 5) {
               var5.u = 0;
               var7 = true;
            } else if (var5.A == -1 && !var5.y) {
               if (var5.j < 0) {
                  var5.h = 0;
               } else if (var5.j > var5.t) {
                  var5.h = var5.t;
               } else {
                  if ((var2 = hso_ft.af - var5.w[0] + (var5.w[0] - var5.w[1]) + (var5.w[1] - var5.w[2])) > 10) {
                     var6 = 10;
                  } else if (var2 < -10) {
                     var6 = -10;
                  } else {
                     var6 = 0;
                  }

                  var5.z = -var6 * 100;
               }
            }

            var5.x = false;
            var5.u = 0;
            hso_ft.R = false;
         }

         (var8 = new hso_cq()).b = var7;
         var8.a = var5.x;
         return var8;
      } else {
         var1 = (var5 = this).o;
         var2 = var5.p;
         var3 = var5.q;
         var4 = var5.r;
         if (hso_ft.Q) {
            if (!var5.x && hso_ft.a(var1, var2, var3, var4)) {
               for(var3 = 0; var3 < var5.w.length; ++var3) {
                  var5.w[0] = hso_ft.ae;
               }

               var5.v = hso_ft.ae;
               var5.x = true;
               var5.A = -1;
               var5.y = var5.z != 0;
               var5.z = 0;
            } else if (var5.x) {
               ++var5.u;
               if (var5.u > 5 && var5.v == hso_ft.ae && !var5.y) {
                  var5.v = -1000;
                  var5.A = (var5.g + hso_ft.ae - var1) / var5.B;
               }

               if ((var3 = hso_ft.ae - var5.w[0]) != 0 && var5.A != -1) {
                  var5.A = -1;
               }

               for(var4 = var5.w.length - 1; var4 > 0; --var4) {
                  var5.w[var4] = var5.w[var4 - 1];
               }

               var5.w[0] = hso_ft.ae;
               var5.g -= var3;
               if (var5.g < 0) {
                  var5.g = 0;
               }

               if (var5.g > var5.s) {
                  var5.g = var5.s;
               }

               if (var5.i < 0 || var5.i > var5.s) {
                  var3 /= 2;
               }

               var5.i -= var3;
            }
         }

         var7 = false;
         if (hso_ft.R && var5.x) {
            var4 = hso_ft.ae - var5.w[0];
            hso_ft.R = false;
            if (Math.abs(var4) < 20 && Math.abs(hso_ft.ae - var5.v) < 20 && !var5.y) {
               var5.z = 0;
               var5.g = var5.i;
               var5.v = -1000;
               var5.A = (var5.g + hso_ft.ae - var1) / var5.B;
               var5.u = 0;
               var7 = true;
            } else if (var5.A != -1 && var5.u > 5) {
               var5.u = 0;
               var7 = true;
            } else if (var5.A == -1 && !var5.y) {
               if (var5.i < 0) {
                  var5.g = 0;
               } else if (var5.i > var5.s) {
                  var5.g = var5.s;
               } else {
                  if ((var2 = hso_ft.ae - var5.w[0] + (var5.w[0] - var5.w[1]) + (var5.w[1] - var5.w[2])) > 10) {
                     var6 = 10;
                  } else if (var2 < -10) {
                     var6 = -10;
                  } else {
                     var6 = 0;
                  }

                  var5.z = -var6 * 100;
               }
            }

            var5.x = false;
            var5.u = 0;
            hso_ft.R = false;
         }

         (var8 = new hso_cq()).b = var7;
         var8.a = var5.x;
         return var8;
      }
   }

   public final void b() {
      int var1 = this.o;
      int var2 = this.p;
      int var3 = this.q;
      int var4 = this.r;
      if (hso_ft.a(var1, var2, var3, var4) && hso_ft.A && !this.E) {
         this.E = true;
      }

      if (this.z != 0 && !this.x) {
         if (this.D) {
            this.h += this.z / 100;
            if (this.h < 0) {
               this.h = 0;
            } else if (this.h > this.t) {
               this.h = this.t;
            } else {
               this.j = this.h;
            }
         } else {
            this.g += this.z / 100;
            if (this.g < 0) {
               this.g = 0;
            } else if (this.g > this.s) {
               this.g = this.s;
            } else {
               this.i = this.g;
            }
         }

         this.z = this.z * 9 / 10;
         if (this.z < 100 && this.z > -100) {
            this.z = 0;
         }
      }

      if (this.i != this.g && !this.x) {
         this.k = this.g - this.i << 2;
         this.m += this.k;
         this.i += this.m >> 4;
         this.m &= 15;
      }

      if (this.j != this.h && !this.x) {
         this.l = this.h - this.j << 2;
         this.n += this.l;
         this.j += this.n >> 4;
         this.n &= 15;
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      this.o = var3;
      this.p = var4;
      this.B = var2;
      this.q = var5;
      this.r = var6;
      this.D = true;
      this.C = 1;
      this.t = var1 * var2 - var6;
      if (this.t < 0) {
         this.t = 0;
      }

      if (this.s < 0) {
         this.s = 0;
      }

   }
}
