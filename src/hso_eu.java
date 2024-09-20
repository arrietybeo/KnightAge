public final class hso_eu extends hso_p {
   public int a = 0;
   public hso_es b = new hso_es("TabScreenNew VecTabScreen");
   private static hso_bt i;
   public static int f = 0;
   public static int g;
   public static int h;

   public hso_eu() {
      i = new hso_bt(hso_df.Z, 0, this);
      g = hso_ft.W - 20;
      h = 17;
      if (hso_ft.A) {
         i.a(g, h, hso_cf.t, "");
      }

   }

   public static void b() {
      if (!hso_ft.A) {
         i.a = hso_df.Z;
      }

   }

   public final void c() {
   }

   public final void a(hso_p var1) {
      f = 10;
      if (GameScreen.p.d(6, 2)) {
         this.a = 2;
      }

      if (hso_ft.A) {
         hso_fl.aO = 1;
         this.g().b();
         hso_fl.bi = 0;
         super.Z = i;
      } else {
         hso_fl.aO = 0;
      }

      super.c();
      hso_ft.a.c = var1;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         if (super.c != null && super.c != hso_ft.a && hso_ft.a != hso_ft.u) {
            super.c.a(super.c.c);
         } else {
            hso_ft.c.c();
         }

         if (GameScreen.p.d(4, 9)) {
            GameScreen.p.f();
            GameScreen.p.g();
         }
      default:
      }
   }

   public final void a(hso_es var1) {
      this.b.d();
      this.b = var1;
   }

   public final void a(mGraphics var1) {
      hso_fl var2 = this.g();
      hso_ft.a(var1);
      hso_fl.g().a(var1, var2.X, this.a, this.b, false);
      var2.a(var1);
      hso_ft.a(var1);
      if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && hso_ft.a == this) {
         if (hso_ft.A) {
            super.c(var1);
         } else if (hso_fl.aO == 0) {
            this.d(var1);
         } else {
            var2.d(var1);
         }
      } else {
         f = 10;
      }

      if (GameScreen.p.a >= 0 && !hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && var2.K != 0) {
         GameScreen.p.a(var1, (hso_bw)null, var2.K);
      }

   }

   public final void a() {
      if (super.c == hso_ft.c) {
         super.c.a();
      }

      hso_fl var1 = this.g();
      if (!hso_ft.o.a && hso_ft.r == null && hso_ft.a == this) {
         var1.a();
      }

      if (!hso_ft.o.a && hso_ft.r == null) {
         if (f > 0) {
            --f;
         }

      } else {
         f = 10;
      }
   }

   private hso_fl g() {
      return (hso_fl)this.b.a(this.a);
   }

   public final void d() {
      if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null) {
         hso_fl var2;
         if (hso_fl.aO != 0) {
            var2 = this.g();
            if (!hso_ft.o.a && hso_ft.r == null) {
               var2.d();
            }

         } else {
            f = 10;
            super.Y = null;
            super.aa = null;
            super.Z = i;
            int var1 = this.a;
            if (hso_ft.al[2]) {
               --this.a;
               hso_ft.m();
               if (hso_c.H) {
                  hso_c.n = null;
                  hso_c.m = null;
                  hso_c.o = null;
                  hso_c.H = false;
               }
            } else if (hso_ft.al[8]) {
               ++this.a;
               hso_ft.m();
               if (hso_c.H) {
                  hso_c.n = null;
                  hso_c.m = null;
                  hso_c.o = null;
                  hso_c.H = false;
               }
            } else if (hso_ft.al[4] || hso_ft.al[6]) {
               hso_ft.m();
               hso_ft.l();
               this.h();
            }

            this.a = hso_cg.a(this.a, this.b.c() - 1, true);
            if (var1 != this.a) {
               hso_p.e.b = 0;
            }

            if ((var2 = this.g()).K == 7 || var2.K == 11) {
               var2.b();
            }

            if (GameScreen.p.d(3, 8)) {
               if (var2.K == 1) {
                  var2.b();
                  GameScreen.p.f();
                  GameScreen.p.g();
               }
            } else if (GameScreen.p.d(7, 9)) {
               if (var2.K == 3) {
                  var2.b();
                  GameScreen.p.f();
                  GameScreen.p.g();
               }
            } else if (GameScreen.p.d(9, 1) && var2.K == 4) {
               var2.b();
               ++GameScreen.p.b;
               GameScreen.p.g();
            }

            super.d();
         }
      }
   }

   public final void e() {
      if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null) {
         hso_fl var1;
         if ((var1 = this.g()).K != 10 || hso_c.B == 0) {
            int var10000 = hso_fl.g().L;
            hso_fl.g();
            if (hso_ft.b(var10000, 0 + hso_ft.X / 5, hso_fl.aM + (hso_fl.aN << 1), hso_fl.aM * this.b.c())) {
               var10000 = hso_ft.af;
               hso_fl.g();
               int var2;
               if ((var2 = hso_cg.a((var10000 - (0 + hso_ft.X / 5)) / hso_fl.aM, this.b.c() - 1, false)) != this.a) {
                  if (hso_c.H) {
                     hso_c.n = null;
                     hso_c.m = null;
                     hso_c.o = null;
                     hso_c.H = false;
                  }

                  f = 10;
                  this.a = var2;
                  this.h();
                  var1 = this.g();
                  if (GameScreen.p.d(3, 8)) {
                     if (var1.K == 1) {
                        GameScreen.p.f();
                        GameScreen.p.g();
                     }
                  } else if (GameScreen.p.d(7, 9)) {
                     if (var1.K == 3) {
                        GameScreen.p.f();
                        GameScreen.p.g();
                     }
                  } else if (GameScreen.p.d(9, 1) && var1.K == 4) {
                     ++GameScreen.p.b;
                     GameScreen.p.g();
                  }
               }

               hso_ft.S = false;
            }

            var1.e();
            super.e();
         }
      }
   }

   private void h() {
      hso_fl.aO = 1;
      this.g().b();
   }

   public final void a(int var1) {
      this.g().e(var1);
      super.a(var1);
   }
}
