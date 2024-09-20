public final class hso_bg extends hso_fl {
   private hso_es e = new hso_es("TabConfig vecConfig");
   private int f;
   private int g;
   private int h;
   private int i;
   private hso_bt j;
   private hso_bt k;
   private hso_bt l;
   private hso_bt m;
   private hso_bt n;
   private hso_bt o;
   private hso_bt p;
   private hso_bt q;
   private hso_bt r;
   private hso_bt s;
   public static hso_bt a;
   public static hso_bt b;
   public static hso_bt c;
   public static hso_bt d;
   private hso_e t;
   private hso_dy u;
   private String v = "";

   public hso_bg(String var1, hso_es var2, byte var3) {
      super.K = var3;
      super.X = var1;
      this.e = var2;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      this.f = hso_fl.S / 2;
      this.g = hso_fl.S - (hso_fl.aN << 1);
      if (this.g > 130) {
         this.g = 130;
      }

      this.i = hso_ft.aa;
      if (hso_ft.A) {
         this.i = 28;
      }

      super.aT = new hso_bt(hso_df.af, -1, this);
      this.j = new hso_bt(hso_df.Y, 0, this);
      this.k = new hso_bt(hso_df.cG, 4, this);
      b = new hso_bt(hso_df.cR, 7, this);
      this.l = new hso_bt(hso_df.bT, 10, this);
      this.m = new hso_bt(hso_df.cI, 11, this);
      new hso_bt(hso_df.cW, 12, this);
      a = new hso_bt(hso_df.eo, 13, this);
      c = new hso_bt(hso_df.eE, 14, this);
      this.n = new hso_bt(hso_df.ff, 15, this);
      this.o = new hso_bt(hso_df.fq, 16, this);
      this.p = new hso_bt(hso_df.dI + " " + hso_df.bP, 19, this);
      d = new hso_bt(hso_df.gg, 37, this);
      this.q = new hso_bt(hso_df.u, 40, this);
      this.r = new hso_bt(hso_df.d, 45, this);
      this.s = new hso_bt(hso_df.b, 46, this);
      this.b();
   }

   public final void b() {
      hso_es var1 = new hso_es("TabConfig mcmdTest");
      if (hso_ft.A) {
         if (GameScreen.p.a >= 0) {
            var1.a(GameScreen.b().D);
         }

         var1.a(this.l);
         if (GameScreen.f.cO != null) {
            var1.a(c);
         }

         if (Player.N != null) {
            var1.a(GameScreen.b().x);
         }

         var1.a(this.o);
         if (GameScreen.f.ee != -1) {
            var1.a(d);
         }
      } else if (super.K == 7) {
         String var2 = hso_df.cw + " " + hso_df.cu;
         if (GameScreen.f.cv != 0) {
            var2 = hso_df.cv + " " + hso_df.cu;
         }

         GameScreen.b().C.a = var2;
         var1.a(GameScreen.b().B);
         var1.a(GameScreen.b().C);
         var1.a(this.m);
         if (GameScreen.p.a >= 0) {
            var1.a(GameScreen.b().D);
         }

         var1.a(this.l);
         if (GameScreen.f.by >= 10) {
            var1.a(this.p);
         }

         var1.a(this.k);
      } else if (super.K == 11) {
         var1.a(GameScreen.b().A);
         a.a = hso_df.eo;
         if (hso_cf.i > 0) {
            a.a = hso_df.eo + "*";
         }

         var1.a(a);
         if (GameScreen.f.cO != null) {
            var1.a(c);
         }

         if (Player.N != null) {
            var1.a(GameScreen.b().x);
         }

         var1.a(GameScreen.b().z);
         var1.a(this.n);
         var1.a(this.o);
         if (GameScreen.f.ee != -1) {
            var1.a(d);
         }
      }

      var1.a(this.q);
      var1.a(this.r);
      var1.a(this.s);
      this.e = var1;
      int var3;
      if ((var3 = this.e.c() * this.i - hso_fl.T) < 0) {
         var3 = 0;
      }

      this.h = 0;
      if (!hso_ft.A) {
         super.Z = super.aT;
         super.Y = this.j;
      } else {
         this.h = -1;
      }

      this.t = new hso_e(super.V, super.W, hso_fl.S, hso_fl.T, this.i, this.e.c(), var3, this.h, this.e);
      hso_p.e.a(0, var3, 0, 0);
      super.b();
   }

   public final void c() {
      hso_fl.aO = 0;
      this.h = 0;
      super.c();
   }

   public final void a(int var1, int var2) {
      hso_es var4;
      switch(var1) {
      case -1:
         this.c();
         return;
      case 0:
         hso_bt var6;
         if (this.h > -1 && (var6 = (hso_bt)this.e.a(this.h)) != null && var6.c == null) {
            if (var6.d != null) {
               var6.d.a(var6.e, var6.f);
               return;
            }

            hso_ft.a.a_(var6.e, var6.f);
            return;
         }
      case 1:
      case 2:
      case 3:
      case 5:
      case 8:
      case 12:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      default:
         break;
      case 4:
         GameScreen.f.N();
         ISession.a().c();
         hso_ft.b.c();
         GameScreen.f = new Player(0, (byte)0, "unname", 0, 0);
         hso_bv.b = 0L;
         hso_bv.c = false;
         hso_bv.a = false;
         hso_ah.k = false;
         return;
      case 6:
         k.a();
         return;
      case 7:
         hso_cf.I = !hso_cf.I;
         hso_co.c();
         if (hso_cf.I) {
            b.a = hso_df.cR + hso_df.cS;
         } else {
            b.a = hso_df.cR + hso_df.cT;
         }

         hso_ft.S = false;
         hso_cf.h();
         return;
      case 9:
         Service.a().c((byte)var2);
         return;
      case 10:
         hso_ft.b(hso_df._do, hso_df.bT);
         return;
      case 11:
         GameScreen.b().j();
         return;
      case 13:
         hso_ft.h.g();
         hso_ft.h.a(hso_ft.a);
         return;
      case 14:
         if (GameScreen.f.cO != null) {
            Service.a().b((byte)15, (int)GameScreen.f.cO.b);
            hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
            return;
         }
         break;
      case 15:
         hso_az.b().c();
         return;
      case 16:
         this.u = new hso_dy();
         this.u.a(hso_df.fh, new hso_bt(hso_df.getChat("public final void a(int var1, int var2)"), 17, this), false, hso_df.fq);
         hso_ft.r = this.u;
         return;
      case 17:
         this.v = this.u.a.j();
         if (this.v != null && this.v.length() > 0) {
            hso_ft.c(hso_df.fg + " (" + hso_df.fj + hso_fn.B + " " + hso_df.bP + ")" + hso_df.fp + "\n" + this.v, new hso_bt(hso_df.getChat("public final void a(int var1, int var2)"), 18, this));
            return;
         }
         break;
      case 18:
         Service.a().b(this.v);
         hso_ft.j();
         return;
      case 19:
         Service.a().g((byte)-56);
         hso_ft.a(hso_df.aG);
         return;
      case 20:
         return;
      case 36:
         hso_ft.f();
         return;
      case 37:
         (var4 = new hso_es("TabConfig vec3")).a(new hso_bt(hso_df.ga, 38, this));
         var4.a(new hso_bt(hso_df.as, 39, this));
         hso_ft.a(hso_df.gh, var4);
         return;
      case 38:
         Service.a().h((byte)-1);
         f();
         return;
      case 39:
         f();
         return;
      case 40:
         hso_bt var3;
         hso_bt var5;
         if (!hso_dw.g) {
            if (!GameScreen.aM) {
               var4 = new hso_es();
               var5 = new hso_bt(hso_df.ga, 41, this);
               var3 = new hso_bt(hso_df.gb, 42, this);
               var4.a(var5);
               var4.a(var3);
               hso_ft.a(hso_df.p, var4);
               return;
            }

            var4 = new hso_es();
            var5 = new hso_bt(hso_df.ga, 43, this);
            var3 = new hso_bt(hso_df.gb, 42, this);
            var4.a(var5);
            var4.a(var3);
            hso_ft.a(hso_df.o, var4);
            return;
         }

         if (!GameScreen.aM && !GameScreen.aN) {
            var4 = new hso_es();
            var5 = new hso_bt(hso_df.l, 41, this);
            var3 = new hso_bt(hso_df.m, 44, this);
            var4.a(var5);
            var4.a(var3);
            hso_ft.o.a(var4, 2, hso_df.u, false, (hso_es)null);
            return;
         }

         var4 = new hso_es();
         var5 = new hso_bt(hso_df.ga, 43, this);
         var3 = new hso_bt(hso_df.gb, 42, this);
         var4.a(var5);
         var4.a(var3);
         hso_ft.a(hso_df.o, var4);
         return;
      case 41:
         GameScreen.aM = true;
         this.q.a = hso_df.n;
         hso_ft.j();
         return;
      case 42:
         hso_ft.j();
         return;
      case 43:
         GameScreen.aM = false;
         GameScreen.aN = false;
         this.q.a = hso_df.u;
         hso_ft.j();
         return;
      case 44:
         GameScreen.aN = true;
         this.q.a = hso_df.n;
         hso_ft.j();
         return;
      case 45:
         Service.a().d((byte)5, (byte)0);
         return;
      case 46:
         if (MainObject.cg == 0) {
            MainObject.cg = 1;
            this.s.a = hso_df.c;
            return;
         }

         MainObject.cg = 0;
         this.s.a = hso_df.b;
      }

   }

   private static void f() {
      if (hso_ft.r != null) {
         hso_ft.r = null;
      } else {
         hso_ft.s = null;
      }
   }

   public final void a(mGraphics var1) {
      var1.d(super.V, super.W, hso_fl.S, hso_fl.T);
      var1.a(0, -this.t.b);
      if (hso_fl.aO == 1 && this.h > -1) {
         mGraphics var3 = var1;
         hso_bg var2 = this;
         var1.a(hso_fl.bf[5]);
         var1.c(super.V + this.f - this.g / 2 - 1, super.W + this.h * this.i + this.i / 2 - 11, this.g + 2, 22);
         if (hso_ft.B) {
            hso_fl.c(var1, super.V + this.f - this.g / 2, super.W + this.h * this.i + this.i / 2 - 10, this.g, 20, 4);
         } else {
            for(int var4 = 0; var4 <= var2.g / 24; ++var4) {
               int var5 = var2.V + var2.f - var2.g / 2 + var4 * 24;
               if (var4 == var2.g / 24) {
                  var5 = var2.V + var2.f + var2.g / 2 - 24;
               }

               var3.a(hso_fl.aP[8], 0, 0, 24, 20, 0, var5, var2.W + var2.h * var2.i + var2.i / 2 - 10, 0);
            }
         }
      }

      for(int var6 = 0; var6 < this.e.c(); ++var6) {
         hso_bt var7 = (hso_bt)this.e.a(var6);
         hso_o.f.a(var1, var7.a, super.V + this.f, super.W + this.i / 2 + var6 * this.i - 6, 2, true);
         if (var6 < this.e.c() - 1) {
            var1.a(hso_fl.bf[4]);
            var1.c(super.V + 8, super.W + (var6 + 1) * this.i - 1, hso_fl.S - 16, 1);
         }
      }

   }

   public final void a() {
      hso_p.e.a();
      if (hso_fl.aO == 1) {
         if (hso_ft.o.a || hso_ft.r != null || hso_ft.s != null || hso_ft.a != hso_ft.u) {
            return;
         }

         this.t.a();
         this.h = this.t.a;
         if (this.h >= this.e.c()) {
            this.h = -1;
            this.t.a = -1;
         }
      }

   }

   public final void d() {
      if (hso_fl.aO == 1 && (hso_ft.al[4] || hso_ft.al[6])) {
         hso_fl.aO = 0;
         this.h = 0;
         hso_ft.d(4);
         hso_ft.d(6);
      }

      super.d();
   }
}
