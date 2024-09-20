public final class hso_ck extends hso_p {
   private int f;
   private int g;
   private int h;
   private int i = 0;
   private int j;
   private int k;
   private int l;
   private int[][] m = new int[][]{{222, 263}, {266, 213}, {266, 213}, {238, 205}, {225, 197}, {201, 195}, {201, 195}, {329, 182}, {317, 161}, {305, 151}, {305, 151}, {362, 189}, {387, 195}, {415, 191}, {415, 191}, {372, 165}, {386, 148}, {390, 134}, {345, 161}};
   public static String[] a = null;
   public static hso_ce b;
   private hso_aw n = new hso_aw();
   private int o;
   private int p;
   private int q;
   private int r;
   private boolean s;

   public final void a(hso_p var1) {
      hso_ft.a(hso_df.fJ);
   }

   public final void c() {
      hso_p var1 = hso_ft.a;
      hso_ft.a(hso_df.fJ);
   }

   public hso_ck() {
      this.f = (hso_ft.W - 480) / 2;
      this.g = (hso_ft.X - 320) / 2;
      if (this.f < 0) {
         this.f = 0;
      }

      if (this.g < 0) {
         this.g = 0;
      }

      this.n.a(480 - hso_ft.W, 320 - hso_ft.X, 0, 0);
      this.j = this.m[1][0];
      this.k = this.m[1][1];
      this.n.a = this.j - hso_ft.Y;
      this.n.b = this.k - hso_ft.Z;
      if (this.n.a < 0) {
         this.n.a = 0;
      }

      if (this.n.a > this.n.e) {
         this.n.a = this.n.e;
      }

      if (this.n.b < 0) {
         this.n.b = 0;
      }

      if (this.n.b > this.n.f) {
         this.n.b = this.n.f;
      }

      this.n.c = this.n.a;
      this.n.d = this.n.b;
      hso_bt var1 = new hso_bt(hso_df.Z, -1);
      if (!hso_ft.A) {
         super.Y = new hso_bt(hso_df.Y, 0);
      } else {
         var1.a(hso_cf.q.a / 2, hso_ft.X - hso_cf.q.b / 2, hso_cf.q, var1.a);
      }

      super.Z = var1;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
      case -1:
         if (super.c == hso_ft.u) {
            super.c.a(super.c.c);
         } else {
            super.c.c();
         }
      case 0:
      default:
         super.b(var1, var2);
      }
   }

   public final void a(int var1, int var2) {
      super.a(var1, var2);
   }

   public final void a(mGraphics var1) {
      var1.a(-11181978);
      var1.c(0, 0, hso_ft.W, hso_ft.X);
      var1.a(-this.n.a, -this.n.b);
      var1.a((hso_aq)null, this.f, this.g, 0);
      if (this.i == -1 && (!hso_ft.A || hso_ft.Q || hso_ft.T)) {
         hso_o.c.a(var1, a[this.l], this.n.a + hso_ft.W - 5, this.n.b + 4, 1, false);
         hso_o.f.a(var1, a[this.l], this.n.a + hso_ft.W - 4, this.n.b + 5, 1, false);
      }

      b.b(hso_ft.ai / 2 % b.c, this.f - 1, this.g - 1, 0, 3, var1);
      if (!hso_ft.A) {
         var1.a(hso_cg.ak, this.f + this.j, this.g + this.k - this.h, 33);
      }

      if (!hso_ft.o.a && hso_ft.r == null) {
         if (hso_ft.A) {
            super.a(var1);
            return;
         }

         this.d(var1);
      }

   }

   public final void a() {
      hso_aw var10000;
      if (!hso_ft.al[4] && !hso_ft.al[24]) {
         if (!hso_ft.al[6] && !hso_ft.al[26]) {
            if (!hso_ft.al[2] && !hso_ft.al[22]) {
               if (hso_ft.al[8] || hso_ft.al[28]) {
                  if (this.k < 315) {
                     this.k += 5;
                  } else {
                     this.k = 320;
                  }

                  this.i = 3;
                  if (this.n.f > 0) {
                     var10000 = this.n;
                     var10000.d += 5;
                  }
               }
            } else {
               if (this.k > 10) {
                  this.k -= 5;
               } else {
                  this.k = 5;
               }

               this.i = 3;
               if (this.n.f > 0) {
                  var10000 = this.n;
                  var10000.d -= 5;
               }
            }
         } else {
            if (this.j < 470) {
               this.j += 5;
            } else {
               this.j = 475;
            }

            this.i = 3;
            if (this.n.e > 0) {
               var10000 = this.n;
               var10000.c += 5;
            }
         }
      } else {
         if (this.j > 10) {
            this.j -= 5;
         } else {
            this.j = 5;
         }

         this.i = 3;
         if (this.n.e > 0) {
            var10000 = this.n;
            var10000.c -= 5;
         }
      }

      super.d();
      if (this.i > 0) {
         --this.i;
         if (this.i == 1) {
            for(int var1 = 0; var1 < this.m.length; ++var1) {
               if (hso_ak.e(this.m[var1][0] - this.j) <= 6 && hso_ak.e(this.m[var1][1] - this.k) <= 6) {
                  this.j = this.m[var1][0];
                  this.k = this.m[var1][1];
                  this.l = var1;
                  this.i = -1;
                  break;
               }
            }
         }
      }

      if (this.i < 0) {
         this.h = hso_ft.ai % 4;
      } else {
         this.h = 0;
      }

      this.n.a();
   }

   public final void e() {
      super.e();
      if (hso_ft.T) {
         if (!this.s) {
            this.o = hso_ft.ae;
            this.p = hso_ft.af;
            this.q = this.n.a;
            this.r = this.n.b;
            this.s = true;
         } else {
            this.n.a = this.q - (hso_ft.ae - this.o);
            this.n.b = this.r - (hso_ft.af - this.p);
            if (this.n.a < 0) {
               this.n.a = 0;
            }

            if (this.n.a > this.n.e) {
               this.n.a = this.n.e;
            }

            if (this.n.b < 0) {
               this.n.b = 0;
            }

            if (this.n.b > this.n.f) {
               this.n.b = this.n.f;
            }

            this.n.c = this.n.a;
            this.n.d = this.n.b;
         }
      }

      if (hso_ft.R || !hso_ft.T) {
         this.s = false;
         this.o = 0;
         this.p = 0;
      }

      if (hso_ft.Q || hso_ft.T) {
         this.j = hso_ft.ae + this.n.a - this.f;
         this.k = hso_ft.af + this.n.b - this.g;
      }

      for(int var1 = 0; var1 < this.m.length; ++var1) {
         if (hso_ak.e(this.m[var1][0] - this.j) <= 8 && hso_ak.e(this.m[var1][1] - this.k) <= 8) {
            this.l = var1;
            this.i = -1;
            return;
         }
      }

      this.i = 3;
   }
}
