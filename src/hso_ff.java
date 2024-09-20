public final class hso_ff extends hso_p {
   private int h;
   public int a;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   public int b;
   private int p;
   private hso_bt q;
   private hso_bt r;
   public static hso_es f = new hso_es("EventScreen vecListEvent");
   public static hso_es g = new hso_es("EventScreen vecEventShow");
   private static hso_es s = new hso_es("EventScreen cmdList");
   private hso_aw t = new hso_aw();
   private hso_bp u;
   private int v;
   private int w;

   public hso_ff() {
      this.q = new hso_bt(hso_df.ay, 2, 0, this);
      this.r = new hso_bt(hso_df.fK, 2, 1, this);
      this.h = hso_ft.aa + 5;
      this.a = hso_ft.W / 4 * 3;
      if (this.a > 180) {
         this.a = 180;
      }

   }

   public final void b() {
      this.q.a = hso_df.ay;
      this.r.a = hso_df.fK;
   }

   public final void a(hso_p var1) {
      super.a(var1);
      hso_cf.i = 0;
   }

   public final void g() {
      for(int var1 = 0; var1 < f.c(); ++var1) {
         hso_fm var2;
         if ((var2 = (hso_fm)f.a(var1)).g) {
            f.d(var2);
            --var1;
         }
      }

      this.j = hso_bt.k * 3 / 2;
      if (hso_ft.A) {
         this.j = 0;
      }

      this.i = (hso_ft.X / 4 * 3 - (10 + hso_ft.aa)) / this.h + 1;
      this.k = this.h * this.i + 10 + hso_ft.aa;
      this.i += 2;
      this.l = 0;
      this.m = this.i;
      if (this.m > f.c()) {
         this.m = f.c();
      }

      this.n = hso_ft.Y - this.a / 2;
      this.o = hso_ft.Z - this.k / 2 - hso_ft.aa / 2;
      this.h();
   }

   private void h() {
      s.d();
      hso_bt var1 = new hso_bt(hso_df.Z, -1, this);
      if (hso_ft.A) {
         var1.a(this.n + this.a - 12, this.o + 10, hso_cf.t, "");
         s.a(var1);
      } else {
         if (f.c() > 0) {
            hso_bt var2 = new hso_bt(hso_df.X, 1, this);
            s.a(var2);
         }

         s.a(var1);
         this.b(0);
         super.Z = var1;
      }

      this.t.a(0, this.h * f.c() - (this.k - hso_ft.aa - this.j), 0, 0);
      this.u = new hso_bp(this.n, this.o, this.a, this.k, 0, 0, this.t.f);
      if (this.b >= f.c()) {
         if (hso_ft.A) {
            this.b = -1;
            return;
         }

         this.b = 0;
      }

   }

   private void b(int var1) {
      this.p = 0;
      if (s.c() > 0) {
         if ((var1 = s.c()) == 1) {
            this.v = this.n + this.a / 2;
            this.w = 0;
         } else {
            boolean var10001 = true;
            this.w = 20;
            this.v = this.n + this.a / 2 - this.w / 2 - hso_bt.j / 2;
         }

         for(int var2 = 0; var2 < var1; ++var2) {
            hso_bt var3;
            (var3 = (hso_bt)s.a(var2)).g = false;
            if (var1 == 3 && var2 == 2) {
               var3.a(this.n + this.a / 2, this.o + this.k - hso_bt.k - (var1 - 1) / 2 * (hso_bt.k + 5) + 7 + var2 / 2 * (hso_bt.k + 5), (hso_ce)null, var3.a);
            } else {
               var3.a(this.v + var2 % 2 * (hso_bt.j + this.w), this.o + this.k - hso_bt.k - (var1 - 1) / 2 * (hso_bt.k + 5) + 7 + var2 / 2 * (hso_bt.k + 5), (hso_ce)null, var3.a);
            }

            if (var2 == 0) {
               var3.g = true;
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case -1:
         super.c.a(super.c.c);
         return;
      case 1:
         if (this.b >= 0 && this.b < f.c()) {
            if (this.b > 0) {
               hso_es var5;
               (var5 = new hso_es("EventScreen vec")).a(this.q);
               var5.a(this.r);
               hso_ft.o.a(var5, 2, hso_df.eo, false, (hso_es)null);
               return;
            }

            this.q.a();
            return;
         }

         return;
      case 2:
         if (this.b < 0 || this.b >= f.c()) {
            return;
         } else {
            boolean var4 = false;
            if (var2 == 1) {
               var4 = true;
            }

            hso_fm var3 = (hso_fm)f.a(this.b);
            a(var4, var3);
         }
      case 0:
      default:
      }
   }

   public final void a(mGraphics var1) {
      if (super.c != null) {
         super.c.a(var1);
      }

      if (hso_ft.a == this) {
         hso_ft.a(var1);
         hso_cg.a(var1, this.n, this.o, this.a, this.k, hso_df.eo);
         int var2 = this.o + hso_ft.aa + 3;
         int var3;
         if (f.c() > 0) {
            var1.d(this.n + 4, var2, this.a - 8, this.k - hso_ft.aa - this.j - 6);
            var1.a(0, -this.t.b);
            if (this.b >= 0) {
               var1.a(-4873075);
               var1.c(this.n + 4, var2 - 2 + this.b * this.h, this.a - 8, this.h - 1);
            }

            var2 += this.h * this.l;

            for(var3 = this.l; var3 < this.m; ++var3) {
               if (var3 >= 0 || var3 < f.c()) {
                  hso_fm var4 = (hso_fm)f.a(var3);
                  byte var5 = 0;
                  if (var4.c == 1 && hso_ft.ai % 20 > 9) {
                     var5 = 1;
                  }

                  hso_cf.x.b((var4.b << 1) + 1 - var5, this.n + 20, var2 + this.h / 2 - 2, 0, 3, var1);
                  if (hso_ft.A && var3 > 0) {
                     hso_cf.o.b(0, this.n + this.a - 20, var2 + this.h / 2 - 2, 0, 3, var1);
                  }

                  hso_o.f.a(var1, var4.e, this.n + 35, var2 + 1, 0, true);
                  hso_o.j.a(var1, var4.f, this.n + 42, var2 + 13, 0, true);
                  var2 += this.h;
                  if (var3 < f.c() - 1) {
                     var1.a(hso_cg.aL[4]);
                     var1.c(this.n + 6, var2 - 3, this.a - 12, 1);
                  }
               }
            }
         } else {
            hso_o.j.a(var1, hso_df.en, this.n + this.a / 2, var2 + 3, 2, true);
         }

         hso_ft.a(var1);
         if (s != null) {
            for(var3 = 0; var3 < s.c(); ++var3) {
               hso_bt var6;
               (var6 = (hso_bt)s.a(var3)).a(var1, var6.h, var6.i);
            }
         }

         this.d(var1);
      }
   }

   public final void a() {
      if (hso_ft.a == this) {
         super.c.a();
      }

      int var1 = this.t.b;
      if (hso_ft.A) {
         this.u.c();
      } else {
         this.t.a();
      }

      super.a();
      int var2 = f.c();

      for(int var3 = 0; var3 < f.c(); ++var3) {
         hso_fm var4;
         if ((var4 = (hso_fm)f.a(var3)).g) {
            f.d(var4);
            --var3;
         }
      }

      if (this.b < 0 || this.b >= f.c()) {
         if (hso_ft.A) {
            this.b = -1;
         } else {
            this.b = 0;
         }
      }

      if (this.t.b != var1 || var2 != f.c()) {
         this.l = this.t.b / this.h;
         this.m = this.l + this.i;
         if (this.m > f.c()) {
            this.m = f.c();
            this.l = this.m - this.i;
         }

         if (this.l < 0) {
            this.l = 0;
         }
      }

   }

   public final void d() {
      if (f.c() > 0) {
         if (hso_ft.al[2]) {
            --this.b;
            hso_ft.d(2);
         } else if (hso_ft.al[8]) {
            ++this.b;
            hso_ft.d(8);
         }

         this.b = hso_cg.a(this.b, f.c() - 1, true);
         this.t.a(0, this.b * this.h - (this.k / 2 - hso_ft.aa - this.j));
      } else if (s.c() > 1) {
         s.d();
         s.a(new hso_bt(hso_df.Z, -1, this));
         this.b(0);
         this.b = 0;
      }

      if (s != null) {
         int var1 = s.c();
         if (!hso_ft.A && var1 > 0) {
            int var2 = this.p;
            if (hso_ft.al[4]) {
               --this.p;
               hso_ft.d(4);
            } else if (hso_ft.al[6]) {
               ++this.p;
               hso_ft.d(6);
            }

            this.p = hso_cg.a(this.p, var1 - 1, false);
            if (var2 != this.p) {
               for(var2 = 0; var2 < var1; ++var2) {
                  hso_bt var3 = (hso_bt)s.a(var2);
                  if (var2 == this.p) {
                     var3.g = true;
                  } else {
                     var3.g = false;
                  }
               }
            }
         }
      }

      if (hso_ft.al[5]) {
         hso_ft.d(5);
         if (s != null && this.p < s.c()) {
            ((hso_bt)s.a(this.p)).a();
         }
      }

      super.d();
   }

   public final void e() {
      if (hso_ft.A) {
         this.u.a();
         this.t.b = this.u.f;
      }

      int var1;
      if (f.c() > 0 && hso_ft.b(this.n, this.o + hso_ft.aa, this.a, this.k - hso_ft.aa) && (var1 = (hso_ft.af - (this.o + hso_ft.aa)) / this.h) >= 0 && var1 <= f.c() - 1) {
         this.b = var1;
         this.b = hso_cg.a(this.b, f.c() - 1, false);
         boolean var2 = false;
         if (hso_ft.b(this.n + this.a - 30, this.o + hso_ft.aa, 30, this.k - hso_ft.aa) && this.b > 0) {
            var2 = true;
         }

         hso_fm var3 = (hso_fm)f.a(this.b);
         a(var2, var3);
         hso_ft.S = false;
      }

      if (s != null) {
         for(var1 = 0; var1 < s.c(); ++var1) {
            ((hso_bt)s.a(var1)).b();
         }
      }

   }

   public static void a(boolean var0, hso_fm var1) {
      if (var0) {
         var1.g = true;
      } else {
         hso_es var2 = null;
         if (hso_cf.i > 0) {
            --hso_cf.i;
         }

         switch(var1.b) {
         case 0:
            MsgChat.a(var1.e);
            hso_ft.h();
            var1.c = 0;
            return;
         case 1:
            (var2 = new hso_es("EventScreen vec2")).a(new hso_bt(hso_df.bI, 1, 1, var1));
            var2.a(new hso_bt(hso_df.bJ, 1, 2, var1));
            var2.a(new hso_bt(hso_df.Z, -1));
            hso_ft.a(var1.e + hso_df.bH, var2);
            var1.c = 0;
            return;
         case 2:
            (var2 = new hso_es("EventScreen vec3")).a(new hso_bt(hso_df.bI, 2, 1, var1));
            var2.a(new hso_bt(hso_df.bJ, 2, 0, var1));
            var2.a(new hso_bt(hso_df.Z, -1));
            hso_ft.a(var1.e + hso_df.cf, var2);
            var1.c = 0;
            return;
         case 3:
            (var2 = new hso_es("EventScreen vec4")).a(new hso_bt(hso_df.bI, 3, 1, var1));
            var2.a(new hso_bt(hso_df.bJ, 3, 0, var1));
            var2.a(new hso_bt(hso_df.Z, -1));
            hso_ft.a(var1.e + hso_df.cl, var2);
            var1.c = 0;
            return;
         case 4:
            (var2 = new hso_es("EventScreen vec5")).a(new hso_bt(hso_df.bI, 4, 1, var1));
            var2.a(new hso_bt(hso_df.bK, 4, 2, var1));
            var2.a(new hso_bt(hso_df.as, 4, 0, var1));
            hso_ft.a(var1.e + hso_df.et + var1.d + " " + hso_df.bO + ".", var2);
            var1.c = 0;
            return;
         case 5:
            (var2 = new hso_es("EventScreen vec6")).a(new hso_bt(hso_df.bI, 5, 1, var1));
            var2.a(new hso_bt(hso_df.Z, -1));
            hso_ft.a(var1.e + hso_df.eC, var2);
            var1.c = 0;
         default:
         }
      }
   }

   public static hso_fm a(String var0, byte var1) {
      for(int var2 = 0; var2 < f.c(); ++var2) {
         hso_fm var3;
         if ((var3 = (hso_fm)f.a(var2)).g) {
            f.d(var3);
            --var2;
         } else if (var3.b == var1 && var3.e.compareTo(var0) == 0) {
            return var3;
         }
      }

      return null;
   }

   public static int b(String var0, byte var1) {
      for(int var2 = 0; var2 < f.c(); ++var2) {
         hso_fm var3;
         if ((var3 = (hso_fm)f.a(var2)).b == var1 && var3.e.compareTo(var0) == 0) {
            return var2;
         }
      }

      return -1;
   }

   public final void a(String var1, byte var2, String var3, int var4) {
      hso_fm var5;
      if ((var5 = a(var1, var2)) == null) {
         var5 = new hso_fm(0, var2, var1, var3);
         f.a(var5);
         this.h();
         this.l = this.t.b / this.h;
         this.m = this.l + this.i;
         if (this.m > f.c()) {
            this.m = f.c();
            this.l = this.m - this.i;
         }

         if (this.l < 0) {
            this.l = 0;
         }
      } else if (var2 == 0) {
         var5.f = var3;
      }

      if (var1.compareTo(hso_df.cz) != 0) {
         ++hso_cf.i;
         var5.c = 1;
         var5.d = var4;
         if (var2 != 0 || var1.compareTo(hso_df.eV) != 0 && var1.compareTo(hso_df.eU) != 0) {
            byte var8 = var2;
            String var6 = var1;
            int var9 = 0;

            hso_fm var11;
            while(true) {
               if (var9 >= g.c()) {
                  var11 = null;
                  break;
               }

               hso_fm var10;
               if ((var10 = (hso_fm)g.a(var9)).b == var8 && var10.e.compareTo(var6) == 0) {
                  var11 = var10;
                  break;
               }

               ++var9;
            }

            hso_fm var7 = var11;
            if (var11 == null) {
               var7 = new hso_fm(var5.a, var5.b, var5.e, var5.f);
               g.a(var7);
               return;
            }

            if (var2 == 0) {
               var7.f = var5.f;
            }
         }
      }

   }
}
