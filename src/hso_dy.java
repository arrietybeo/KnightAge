public final class hso_dy extends hso_da {
   public hso_fi a;
   private hso_bt b;
   private hso_fi[] c;
   private boolean d = false;
   private boolean e;
   private boolean f = false;
   private long g;
   private String h;
   private String i;
   private String j;
   private short k = 0;
   private short r = -1;
   private static int s = 0;
   private static int t = 0;
   private static int u;
   private hso_o v;
   private hso_bp w;
   private String x;
   private int y;

   public hso_dy() {
      this.v = hso_o.j;
      this.y = 0;
      this.b = new hso_bt(hso_df.Z, -1);
      t = 15;
      if (hso_ft.A) {
         s = hso_bt.k + 5;
      }

   }

   private static void c() {
      if (hso_ft.r != null) {
         hso_ft.r = null;
      } else {
         hso_ft.s = null;
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
      case -1:
         c();
         break;
      case 0:
         String[] var7 = new String[this.c.length];

         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] = "";
            if (this.c[var8].j().length() > 0) {
               var7[var8] = this.c[var8].j();
            }
         }

         Service.a().a(this.k, var7);
         hso_ft.a(hso_df.aG, new hso_bt(hso_df.Z, -1));
         break;
      case 1:
         hso_es var4 = new hso_es();
         boolean var3 = this.r == GameScreen.a;

         for(int var5 = 0; var5 < this.c.length; ++var5) {
            String var6 = "";
            if (this.c[var5].j().length() > 0) {
               var6 = this.c[var5].j();
            }

            var4.a(var6);
         }

         if (var3) {
            var4.a(hso_dw.e());
            var4.a(hso_dw.d());
         }

         Service.a().a(this.r, this.k, var4);
         c();
      }

      super.b(var1, var2);
   }

   public final void a(String var1, hso_bt var2, boolean var3, String var4) {
      this.d = false;
      this.f = false;
      super.Y = null;
      super.Z = null;
      super.aa = null;
      if (var2 == null) {
         hso_ft.r = null;
      }

      super.l = hso_ft.W - 30;
      if (super.l > 200) {
         super.l = 200;
      }

      super.q = this.v.a(var1, super.l - 20);
      this.h = var4;
      super.m = 15 * super.q.length + 10 + hso_fi.c() + hso_ft.aa;
      super.m += s + t;
      super.n = hso_ft.Y - super.l / 2;
      super.o = hso_ft.X - (hso_ft.aa << 1) - super.m + 15;
      this.a = new hso_fi(super.n + 10, super.o + super.m - s - (hso_fi.c() + 8), super.l - 20);
      this.a.c(100);
      if (var3) {
         this.a.d(1);
      }

      this.a.b("");
      if (hso_ft.A) {
         var2.a(super.n + super.l / 2, super.o + super.m - hso_bt.k / 2 - 5, (hso_ce)null, var2.a);
         this.b.a(super.n + super.l - 13, super.o + 10, hso_cf.t, "");
         super.Z = this.b;
         super.Y = var2;
         this.a.j = var1;
      } else {
         super.aa = var2;
         super.Y = this.b;
         this.a.a(true);
         super.Z = this.a.i;
      }
   }

   public final void a(String[] var1, hso_bt var2, short var3, short var4, String var5, String[] var6, byte var7) {
      this.d = true;
      this.f = false;
      super.Y = null;
      super.Z = null;
      super.aa = null;
      this.c = null;
      u = 50;
      this.k = var3;
      this.r = var4;
      if (var2 == null) {
         hso_ft.s = null;
      }

      super.l = hso_ft.W - 30;
      if (super.l > 140) {
         super.l = 140;
      }

      this.c = new hso_fi[var1.length];
      super.q = var1;
      this.h = var5;
      if (this.c.length > 3) {
         this.e = true;
      }

      if (this.e) {
         super.l = hso_ft.W / 4 * 3;
         super.m = hso_ft.X / 5 << 2;
         super.l = hso_ft.W - 30;
         if (super.l > 140) {
            super.l = 140;
         }

         if (super.m < 210) {
            super.m = 210;
         } else if (super.m > 280) {
            super.m = 280;
         }

         if (super.m < 210) {
            super.m = 210;
         } else if (super.m > 280) {
            super.m = 280;
         }

         super.n = hso_ft.Y - super.l / 2;
         super.o = hso_ft.Z - super.m / 2;
         if (super.o < 20) {
            super.o = 20;
         }

         if (hso_ft.C) {
            super.o = 0;
         }
      } else {
         super.m = (hso_fi.c() + 18) * super.q.length + 6 + hso_ft.aa;
         super.m += s + t;
         super.n = hso_ft.Y - super.l / 2;
         super.o = hso_ft.X - (hso_ft.aa << 1) - super.m + 15;
      }

      int var8;
      for(var8 = 0; var8 < this.c.length; ++var8) {
         this.c[var8] = new hso_fi(super.n + 10, super.o + 8 + (hso_fi.c() + 18) * var8 + t + hso_ft.aa, super.l - 20);
         this.c[var8].b("");
      }

      if (hso_ft.A) {
         var2.a(super.n + super.l / 2, super.o + super.m - hso_bt.k / 2 - 5, (hso_ce)null, var2.a);
         this.b.a(super.n + super.l - 13, super.o + 10, hso_cf.t, "");
         if (hso_ft.a != hso_ft.j) {
            super.Z = this.b;
         }

         super.Y = var2;
      } else {
         super.aa = var2;
         super.Y = this.b;
      }

      if (!hso_ft.A) {
         this.c[0].a(true);
         super.Z = this.c[0].i;
      }

      if (this.e) {
         hso_p.e.a(0, this.c.length * u - super.m + hso_ft.aa + 30, 0, 0);
         this.w = new hso_bp(super.n, super.o, super.l, super.m, u, 0, hso_p.e.f);
      }

      if (var7 == 0) {
         for(var8 = 0; var8 < this.c.length; ++var8) {
            this.c[var8].a(var1[var8]);
         }
      }

      for(var8 = 0; var8 < this.c.length; ++var8) {
         this.c[var8].b(var6[var8]);
      }

   }

   public final void a(String[] var1, hso_bt var2, short var3, short var4, String var5) {
      this.d = true;
      this.f = false;
      super.Y = null;
      super.Z = null;
      super.aa = null;
      this.c = null;
      u = 50;
      this.k = var3;
      this.r = var4;
      if (var2 == null) {
         hso_ft.s = null;
      }

      super.l = hso_ft.W - 30;
      if (super.l > 140) {
         super.l = 140;
      }

      this.c = new hso_fi[var1.length];
      super.q = var1;
      this.h = var5;
      if (this.c.length > 3) {
         this.e = true;
      }

      if (this.e) {
         super.l = hso_ft.W / 4 * 3;
         super.m = hso_ft.X / 5 << 2;
         super.l = hso_ft.W - 30;
         if (super.l > 140) {
            super.l = 140;
         }

         if (super.m < 210) {
            super.m = 210;
         } else if (super.m > 280) {
            super.m = 280;
         }

         if (super.m < 210) {
            super.m = 210;
         } else if (super.m > 280) {
            super.m = 280;
         }

         super.n = hso_ft.Y - super.l / 2;
         super.o = hso_ft.Z - super.m / 2;
         if (super.o < 20) {
            super.o = 20;
         }

         if (hso_ft.C) {
            super.o = 0;
         }
      } else {
         super.m = (hso_fi.c() + 18) * super.q.length + 6 + hso_ft.aa;
         super.m += s + t;
         super.n = hso_ft.Y - super.l / 2;
         super.o = hso_ft.X - (hso_ft.aa << 1) - super.m + 15;
      }

      for(int var6 = 0; var6 < this.c.length; ++var6) {
         this.c[var6] = new hso_fi(super.n + 10, super.o + 8 + (hso_fi.c() + 18) * var6 + t + hso_ft.aa, super.l - 20);
         this.c[var6].b("");
      }

      if (hso_ft.A) {
         var2.a(super.n + super.l / 2, super.o + super.m - hso_bt.k / 2 - 5, (hso_ce)null, var2.a);
         this.b.a(super.n + super.l - 13, super.o + 10, hso_cf.t, "");
         super.Z = this.b;
         super.Y = var2;
      } else {
         super.aa = var2;
         super.Y = this.b;
      }

      if (!hso_ft.A) {
         this.c[0].a(true);
         super.Z = this.c[0].i;
      }

      if (this.e) {
         hso_p.e.a(0, this.c.length * u - super.m + hso_ft.aa + 30, 0, 0);
         this.w = new hso_bp(super.n, super.o, super.l, super.m, u, 0, hso_p.e.f);
      }

   }

   public final void a(String var1, hso_bt var2, boolean var3, int var4, long var5, String var7) {
      this.d = false;
      this.f = true;
      super.Y = null;
      super.Z = null;
      super.aa = null;
      if (var2 == null) {
         hso_ft.r = null;
      }

      this.g = 0L;
      this.i = var1;
      this.h = "";
      this.j = var7;
      super.l = hso_ft.W / 3 << 1;
      if (super.l > 160) {
         super.l = 160;
      }

      String var9 = "";
      super.q = this.v.a(var1 + " " + var9, super.l - 20);
      super.m = 15 * super.q.length + 10 + hso_fi.c() + hso_ft.aa;
      super.m += s + t;
      super.n = hso_ft.Y - super.l / 2;
      super.o = hso_ft.X - (hso_ft.aa << 1) - super.m + 15;
      int var8;
      if ((var8 = super.l - 100) < 40) {
         var8 = 40;
      }

      this.a = new hso_fi(super.n + super.l / 2 - var8 / 2, super.o + super.m - s - (hso_fi.c() + 8), var8);
      this.x = this.a.j();
      if (hso_ft.A) {
         var2.a(super.n + super.l / 2, super.o + super.m - hso_bt.k / 2 - 5, (hso_ce)null, var2.a);
         this.b.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
         super.Z = this.b;
         super.Y = var2;
      } else {
         super.aa = var2;
         super.Y = this.b;
         this.a.a(true);
         super.Z = this.a.i;
      }
   }

   public final void a(String var1, hso_bt var2, boolean var3, int var4, long var5, String var7, String var8) {
      this.d = false;
      this.f = true;
      super.Y = null;
      super.Z = null;
      super.aa = null;
      if (var2 == null) {
         hso_ft.r = null;
      }

      this.g = var5;
      this.i = var1;
      this.h = var7;
      this.j = var8;
      super.l = hso_ft.W / 3 << 1;
      if (super.l > 160) {
         super.l = 160;
      }

      String var10 = "\n" + hso_df.ba + " " + var5 + " " + var8;
      super.q = this.v.a(var1 + " " + var10, super.l - 20);
      super.m = 15 * super.q.length + 10 + hso_fi.c() + hso_ft.aa;
      super.m += s + t;
      super.n = hso_ft.Y - super.l / 2;
      super.o = hso_ft.X - (hso_ft.aa << 1) - super.m + 15;
      int var9;
      if ((var9 = super.l - 100) < 40) {
         var9 = 40;
      }

      this.a = new hso_fi(super.n + super.l / 2 - var9 / 2, super.o + super.m - s - (hso_fi.c() + 8), var9);
      this.a.d(1);
      this.x = this.a.j();
      if (hso_ft.A) {
         var2.a(super.n + super.l / 2, super.o + super.m - hso_bt.k / 2 - 5, (hso_ce)null, var2.a);
         this.b.a(super.n + super.l - 12, super.o + 10, hso_cf.t, "");
         super.Z = this.b;
         super.Y = var2;
      } else {
         super.aa = var2;
         super.Y = this.b;
         this.a.a(true);
         super.Z = this.a.i;
      }
   }

   public final void a(mGraphics var1) {
      hso_ft.a(var1);
      hso_cg.a(var1, super.n, super.o, super.l, super.m, this.h);
      if (this.e) {
         var1.d(super.n + 10, super.o + hso_ft.aa, super.l, super.m - u - 10);
         var1.a(0, -hso_p.e.b);
      }

      int var2 = super.o + t + hso_ft.aa;
      int var3;
      if (this.d) {
         for(var3 = 0; var3 < this.c.length; ++var3) {
            this.v.a(var1, super.q[var3], hso_ft.W / 2, var2 - 5 + var3 * (hso_fi.c() + 18), 2, true);
            if (this.e) {
               this.c[var3].b(var1);
            } else {
               this.c[var3].a(var1);
            }
         }
      } else {
         for(var3 = 0; var3 < super.q.length; ++var3) {
            this.v.a(var1, super.q[var3], hso_ft.W / 2, var2 + var3 * 15 - 5, 2, true);
         }

         this.a.a(var1);
      }

      hso_ft.a(var1);
      super.c(var1);
   }

   public final void e(int var1) {
      if (this.d) {
         for(int var2 = 0; var2 < this.c.length; ++var2) {
            if (this.c[var2].f()) {
               this.c[var2].b(var1);
               return;
            }
         }
      } else {
         this.a.b(var1);
      }

      super.e(var1);
   }

   public final void a() {
      this.d();
      this.e();
      int var1;
      if (this.d) {
         for(var1 = 0; var1 < this.c.length; ++var1) {
            this.c[var1].a();
         }
      } else if (this.a != null) {
         this.a.a();
         if (!hso_ft.A && super.Z != this.a.i) {
            super.Z = this.a.i;
         }

         if (this.f && this.a.j().compareTo(this.x) != 0) {
            this.x = this.a.j();
            boolean var3 = false;

            try {
               var1 = Integer.parseInt(this.x);
            } catch (Exception var2) {
               var1 = 0;
            }

            String var4 = "\n" + hso_df.ba + " " + this.g * (long)var1 + " " + this.j;
            super.q = this.v.a(this.i + " " + var4, super.l - 20);
            super.m = 15 * super.q.length + 10 + hso_fi.c() + s + t + hso_ft.aa;
            if ((var1 = super.l - 100) < 40) {
               var1 = 40;
            }

            super.n = hso_ft.Y - super.l / 2;
            super.o = hso_ft.X - (hso_ft.aa << 1) - super.m + 15;
            this.a.a = super.n + super.l / 2 - var1 / 2;
            this.a.b = super.o + super.m - (hso_fi.c() + 8) - s;
         }
      }

      super.a();
   }

   public final void d() {
      if (this.d) {
         int var1 = this.y;
         int var2;
         if (hso_ft.al[8]) {
            for(var2 = 0; var2 < this.c.length; ++var2) {
               if (this.c[var2].f()) {
                  this.c[var2].a(false);
                  if (var2 < this.c.length - 1) {
                     this.c[var2 + 1].a(true);
                     this.y = var2 + 1;
                     if (!hso_ft.A) {
                        super.Z = this.c[var2 + 1].i;
                     }
                  } else {
                     this.c[0].a(true);
                     this.y = 0;
                     if (!hso_ft.A) {
                        super.Z = this.c[0].i;
                     }
                  }
                  break;
               }
            }

            hso_ft.d(8);
         } else if (hso_ft.al[2]) {
            for(var2 = 0; var2 < this.c.length; ++var2) {
               if (this.c[var2].f()) {
                  this.c[var2].a(false);
                  if (var2 > 0) {
                     this.c[var2 - 1].a(true);
                     this.y = var2 - 1;
                  } else {
                     this.c[this.c.length - 1].a(true);
                     this.y = this.c.length - 1;
                  }
                  break;
               }
            }

            hso_ft.d(2);
         }

         this.y = hso_cg.a(this.y, this.c.length - 1, false);
         if (var1 != this.y) {
            hso_p.e.a(0, this.y * 40 - super.m / 2 + 40 + hso_ft.aa);
         }
      }

      super.d();
   }

   public final void e() {
      super.e();
      if (this.d) {
         int var1;
         if (this.e) {
            if (hso_ft.b(super.n, super.o + hso_ft.aa, super.l, super.m - hso_ft.aa)) {
               for(var1 = 0; var1 < this.c.length; ++var1) {
                  if (this.c[var1].e) {
                     return;
                  }
               }

               if ((var1 = (hso_p.e.b + hso_ft.af - super.o - hso_ft.aa) / u) >= 0 && var1 < this.c.length) {
                  if (hso_ft.A) {
                     this.c[var1].a(true);
                     this.c[var1].h();
                  } else {
                     this.c[var1].g();
                  }
               }

               hso_ft.S = false;
            }
         } else {
            for(var1 = 0; var1 < this.c.length; ++var1) {
               this.c[var1].g();
            }
         }
      } else if (this.a != null) {
         this.a.g();
      }

      if (this.e) {
         if (hso_ft.A && this.w != null) {
            this.w.c();
         } else {
            hso_p.e.a();
         }
      }

      if (hso_ft.A && this.w != null) {
         this.w.a();
         hso_p.e.b = this.w.f;
      }

   }

   public final String[] b() {
      String[] var1 = new String[this.c.length];

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         var1[var2] = this.c[var2].j();
      }

      return var1;
   }
}
