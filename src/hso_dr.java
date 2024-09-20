public final class hso_dr extends hso_fl {
   private hso_fz c = new hso_fz();
   private int d;
   private int e;
   private int f;
   static hso_dr a;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k = 0;
   private hso_bt l;
   private hso_bt m;
   private hso_bt n;
   private hso_bt o;
   private int p;
   private int q;
   public static String[] b = null;
   private hso_es r = new hso_es("TabQuest vecListCmd");
   private hso_ew s;
   private boolean t = false;
   private int u = 0;

   public hso_dr() {
      super.K = 4;
      a = this;
      super.X = "";
      this.j = hso_ft.ab;
      if (hso_ft.A) {
         this.j = hso_ft.aa;
      }

      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      this.b();
      this.l = new hso_bt(hso_df.ay, 0, this);
      this.m = new hso_bt(hso_df.ax, 1, this);
      this.n = new hso_bt(hso_df.af, -1, this);
      this.o = new hso_bt(hso_df.as, 2, this);
      int var1 = hso_fl.aW + super.N;
      int var2 = hso_fl.aV;
      this.o.a(var2 + hso_fl.aU / 2, var1 - 15, (hso_ce)null, this.o.a);
      if (hso_fl.aZ) {
         this.o.a(this.o.h, var1 - 10, hso_cf.v, this.o.a);
      }

      if (hso_ft.A) {
         this.n.a = hso_df.Z;
      }

   }

   public final void b() {
      this.a(true);
      this.g = (hso_fl.S - (this.h << 1)) / 2;
      if (!hso_ft.A) {
         super.Z = this.n;
      }

      super.bp = null;
      super.bj = null;
      super.bl = null;
      this.s = null;
      super.aY = null;
      super.b();
   }

   public final void c() {
      hso_fl.aO = 0;
      this.d = 0;
      super.c();
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case -1:
         this.c();
         break;
      case 0:
         hso_r.b().c();
         break;
      case 1:
         hso_ew var3;
         if ((var3 = this.f()) != null) {
            hso_ft.a(var3);
         }
         break;
      case 2:
         if (this.s == null) {
            return;
         }

         hso_ft.c(hso_df.aE + this.s.k, new hso_bt(hso_df.as, 3, this));
         break;
      case 3:
         if (this.s == null) {
            return;
         }

         Service.a().a((short)((short)this.s.f), (byte)((byte)(this.s.j ? 0 : 1)), (byte)2);
         hso_dw.a("huy nhiem vu ");
         this.a(true);
         hso_ft.j();
      }

      super.a(var1, var2);
   }

   private hso_ew f() {
      hso_ew var1 = null;
      int var5 = hso_ew.c.c();
      if (this.d >= 0 && this.d < var5 + hso_ew.d.c()) {
         String var2;
         hso_db var3;
         int var4;
         if (this.d < var5) {
            (var1 = (hso_ew)hso_ew.c.a(this.d)).n = var1.l;
            if (var1.e == 0 || var1.e == 1) {
               var1.n = var1.n + "\n " + hso_df.cN;

               for(var4 = 0; var4 < var1.o.length; ++var4) {
                  var2 = "";
                  if (var1.e == 1) {
                     if ((var3 = hso_au.b(var1.o[var4])) != null) {
                        var2 = var3.e;
                     }
                  } else if (b != null) {
                     var2 = b[var1.o[var4]];
                  }

                  var1.n = var1.n + "\n " + var2 + (var2.equals("") ? "" : ": ") + var1.q[var4] + "/" + var1.p[var4];
               }
            }
         } else {
            (var1 = (hso_ew)hso_ew.d.a(this.d - var5)).n = var1.l;
            if (var1.e == 0 || var1.e == 1) {
               var1.n = var1.n + "\n " + hso_df.cN;

               for(var4 = 0; var4 < var1.o.length; ++var4) {
                  var2 = null;
                  if (var1.e == 1) {
                     var2 = "";
                     if (hso_au.b(var1.o[var4]) != null && (var3 = hso_au.b(var1.o[var4])) != null) {
                        var2 = var3.e;
                     }
                  } else {
                     hso_dw.a("loi quest " + var1.o[var4] + " " + b.length + " " + var1.e);
                     var2 = b[var1.o[var4]];
                  }

                  var1.n = var1.n + "\n " + var2 + (var2.equals("") ? "" : ": ") + var1.q[var4] + "/" + var1.p[var4];
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   private void h() {
      if (hso_fl.aU != 0) {
         this.r.d();
         this.s = this.f();
         if (this.s != null) {
            super.bp = this.s.k;
            super.bj = hso_o.j.a(this.s.n, hso_fl.aU - 8);
            int var1;
            if ((var1 = this.s.n.length() * hso_ft.ab - (hso_fl.U - (hso_bt.k << 1))) < 0) {
               var1 = 0;
            }

            super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, var1);
            if (hso_ft.A) {
               this.r.a(this.o);
            }

            super.bl = null;
         } else {
            super.bp = null;
            super.bj = null;
            super.bl = null;
            this.s = null;
         }
      }
   }

   public final void a(mGraphics var1) {
      int var2 = super.L + hso_fl.aM + hso_fl.aN * 3 + this.g;
      int var3 = 0 + hso_ft.X / 5 + hso_fl.aN;
      if (this.k == 0) {
         a(var1, var2 + this.h, var3 - 1, this.h);
         hso_o.j.a(var1, hso_df.gy[1], var2 + this.h + this.h / 2, var3 + hso_fl.aM / 2 - 7, 2, false);
      } else {
         a(var1, var2, var3 - 1, this.h);
         hso_o.j.a(var1, hso_df.gy[0], var2 + this.h / 2, var3 + hso_fl.aM / 2 - 7, 2, false);
         var2 += this.h;
      }

      this.i = var2;
      int var10002 = var3 - 1;
      int var4 = this.h;
      int var6 = var10002;
      int var5 = this.i;
      mGraphics var9 = var1;
      int var7;
      if (hso_ft.B) {
         hso_fl.c(var1, var5, var6, var4, 32, 2);
      } else {
         for(var7 = 0; var7 <= var4 / 32; ++var7) {
            if (var7 == 0) {
               var9.a(hso_fl.aP[9], var5, var6, 0);
            } else if (var7 == var4 / 32) {
               var9.a(hso_fl.aP[9], 0, 0, 32, 32, 2, var5 + var4 - 32, var6, 0);
            } else {
               var9.a(hso_fl.aP[2], var5 + (var7 << 5), var6, 0);
            }
         }
      }

      hso_o var10 = hso_o.f;
      if (hso_fl.aO == 0) {
         var10 = hso_o.j;
      }

      var10.a(var1, hso_df.gy[this.k], this.i + this.h / 2, var3 + hso_fl.aM / 2 - 7, 2, false);
      var1.d(super.V, super.W, hso_fl.S, hso_fl.T);
      var1.a(0, -hso_p.e.b);
      var3 = super.W + 4;
      var2 = super.V + 4;
      var4 = 0;
      if (this.e == 0) {
         int var10001 = var2 + hso_fl.S / 2 - 4;
         var6 = var3 + hso_fl.aN;
         var5 = var10001;
         hso_o.j.a(var1, hso_df.ft, var5, var6, 2, false);
         var3 += this.j;
      } else {
         hso_ew var12;
         if (this.k == 1) {
            for(var5 = 0; var5 < hso_ew.b.c(); ++var5) {
               if (hso_fl.aO == 1 && this.d == var5) {
                  var1.a(hso_cg.ak, 0, 0, 12, 16, 4, var2 - hso_ft.ai % 3, var3, 0);
               }

               var12 = (hso_ew)hso_ew.b.a(var5);
               hso_o.f.a(var1, var12.k, var2 + 18, var3, 0, true);
               if (hso_fl.aO == 1 && this.d == var5) {
                  for(var7 = 0; var7 < var12.m.length; ++var7) {
                     var3 += hso_ft.ab;
                     hso_o.j.a(var1, var12.m[var7], var2 + 25, var3, 0, true);
                  }
               }

               var3 += this.j;
               ++var4;
            }
         } else {
            if (hso_ew.c.c() > 0) {
               hso_cg.a(var1, hso_df.an, var2, var3, 0);
               var3 += this.j;

               for(var5 = 0; var5 < hso_ew.c.c(); ++var5) {
                  if (hso_fl.aO == 1 && this.d == var4) {
                     var1.a(hso_cg.ak, 0, 0, 12, 16, 4, var2 - hso_ft.ai % 3, var3, 0);
                  }

                  var12 = (hso_ew)hso_ew.c.a(var5);
                  hso_o.f.a(var1, var12.k, var2 + 18, var3, 0, false);
                  var3 += this.j;
                  ++var4;
               }
            }

            if (hso_ew.d.c() > 0) {
               hso_cg.a(var1, hso_df.ao, var2, var3, 0);
               var3 += this.j;

               for(var5 = 0; var5 < hso_ew.d.c(); ++var5) {
                  var12 = (hso_ew)hso_ew.d.a(var5);
                  if (hso_fl.aO == 1 && this.d == var4) {
                     var1.a(hso_cg.ak, 0, 0, 12, 16, 4, var2 - hso_ft.ai % 3, var3, 0);
                  }

                  hso_o.f.a(var1, var12.k, var2 + 18, var3, 0, false);
                  var3 += this.j;
                  ++var4;
               }
            }
         }
      }

      var3 += this.j / 2;
      if (hso_fl.aO == 1 && this.d == var4) {
         var1.a(hso_fl.bf[3]);
         var1.c(super.V + hso_fl.S / 2 - 49, var3 - 1, 98, 18);
      }

      this.p = super.V + hso_fl.S / 2 - 48;
      this.q = var3;
      if (hso_ft.B) {
         hso_fl.c(var1, this.p, this.q, 96, 16, 4);
      } else {
         for(var5 = 0; var5 < 4; ++var5) {
            var1.a(hso_fl.aP[8], 0, 0, 24, 16, 0, this.p + var5 * 24, this.q, 0);
         }
      }

      hso_o.j.a(var1, hso_df.ap, super.V + hso_fl.S / 2, var3 + 2, 2, false);
      if (hso_fl.aU > 0 && hso_fl.aO == 1 && super.bp != null) {
         mGraphics var13 = var1;
         hso_dr var11 = this;
         hso_eu.f = 10;
         hso_ft.a(var1);
         var4 = hso_fl.aV;
         var3 = hso_fl.aW;
         hso_fl.a(var1, var4 + hso_fl.aU / 2, var3 + hso_fl.aM / 2 - 5, hso_fl.aU, super.bp, super.br);
         var1.d(var4 + 1, var3 + 1, hso_fl.aU - 2, super.N - 2);
         var3 += hso_fl.aM - hso_ft.ab + hso_ft.ab / 4;
         hso_ft.a(var1);
         this.c.a(super.bj.length + 2, hso_ft.ab + 2, var4, var3 + hso_fl.aM + 2 - (hso_ft.ab << 1), hso_fl.aU, hso_fl.U + hso_ft.ab, true, 1);
         this.c.a(var1, var4, var3 + hso_fl.aM + 2 - hso_ft.ab, hso_fl.aU, hso_fl.U - hso_fl.aM - 2 - hso_bt.k / 2);
         if (super.bj != null) {
            for(var6 = 0; var6 < var11.bj.length; ++var6) {
               if (var11.bj[var6] != null) {
                  hso_o var14 = null;
                  if (var11.bm != null) {
                     var14 = hso_fl.a(var11.bm[var6]);
                  } else {
                     var14 = hso_o.j;
                  }

                  var14.a(var13, var11.bj[var6], var4 + 4, var3 + 2 + (var6 + 1) * hso_ft.ab, 0, true);
                  if (var11.bk != null) {
                     int var8 = var14.a(var11.bj[var6]) + 5;
                     hso_fl.a(var11.bn[var6]).a(var13, var11.bk[var6], var4 + var8 + 4, var3 + 2 + (var6 + 1) * hso_ft.ab, 0, true);
                  }
               }
            }
         }

         hso_ft.a(var13);
         if (this.r != null) {
            for(var5 = 0; var5 < this.r.c(); ++var5) {
               hso_bt var15;
               (var15 = (hso_bt)this.r.a(var5)).a(var1, var15.h, var15.i);
            }
         }
      }

   }

   private static void a(mGraphics var0, int var1, int var2, int var3) {
      if (hso_ft.B) {
         hso_fl.c(var0, var1, var2, var3, hso_fl.aM - hso_fl.aN + 1, 3);
      } else {
         for(int var4 = 0; var4 <= var3 / 32; ++var4) {
            if (var4 == 0) {
               var0.a(hso_fl.aP[11], 0, 0, 32, hso_fl.aM - hso_fl.aN + 1, 0, var1, var2, 0);
            } else if (var4 == var3 / 32) {
               var0.a(hso_fl.aP[11], 0, 0, 32, hso_fl.aM - hso_fl.aN + 1, 2, var1 + var3 - 32, var2, 0);
            } else {
               var0.a(hso_fl.aP[10], 0, 0, 32, hso_fl.aM - hso_fl.aN + 1, 0, var1 + (var4 << 5), var2, 0);
            }
         }

      }
   }

   public final void a() {
      hso_cq var1;
      if (!(var1 = this.c.a()).a) {
         var1.getClass();
      }

      this.c.b();
      hso_p.e.a();
      super.a();
   }

   public final void d() {
      if (hso_fl.aO == 1) {
         int var1 = this.d;
         if (hso_ft.al[2]) {
            --this.d;
            hso_ft.d(2);
         } else if (hso_ft.al[8]) {
            ++this.d;
            hso_ft.d(8);
         }

         if (hso_ft.al[4]) {
            if (this.k == 0) {
               hso_fl.aO = 0;
               this.d = 0;
            } else {
               this.k = 0;
               this.a(true);
            }

            hso_ft.d(4);
         } else if (hso_ft.al[6]) {
            if (this.k == 1) {
               this.k = 0;
               this.a(true);
            } else {
               this.k = 1;
               this.a(true);
            }

            hso_ft.d(6);
         }

         if (this.e > 0) {
            this.d = hso_cg.a(this.d, this.e, true);
         } else {
            this.d = 0;
         }

         this.h();
         if (this.k == 1) {
            if (!hso_ft.A) {
               if (this.d < this.e) {
                  if (super.aa != null) {
                     super.aa = null;
                  }
               } else if (super.aa != this.l) {
                  super.aa = this.l;
                  hso_eu.f = 10;
               }

               if (super.Y != null) {
                  super.Y = null;
               }
            }

            if (var1 != this.d) {
               this.a(false);
               if (this.d == this.e) {
                  hso_p.e.a(0, hso_p.e.f);
               } else {
                  hso_ew var2 = (hso_ew)hso_ew.b.a(this.d);
                  hso_p.e.a(0, this.d * this.j + var2.m.length * hso_ft.ab - hso_fl.T / 2);
               }
            }
         } else if (this.d < this.e) {
            if (!hso_ft.A) {
               if (super.aa != this.m) {
                  super.aa = this.m;
                  hso_eu.f = 10;
               }

               if (var1 != this.d) {
                  hso_p.e.a(0, (this.d + 2) * this.j - hso_fl.T / 2);
               }
            }
         } else if (super.aa != this.l && !hso_ft.A) {
            super.aa = this.l;
            hso_eu.f = 10;
            if (var1 != this.d) {
               hso_p.e.a(0, hso_p.e.f);
            }

            if (super.Y != null) {
               super.Y = null;
            }
         }
      }

      super.d();
   }

   public final void a(boolean var1) {
      hso_eu.f = 10;
      boolean var2 = false;
      int var3;
      if (this.k == 0) {
         this.e = hso_ew.c.c() + hso_ew.d.c();
         var3 = this.e + (hso_ew.c.c() > 0 ? 1 : 0) + (hso_ew.d.c() > 0 ? 1 : 0) + 2;
      } else {
         this.e = hso_ew.b.c();
         if (this.d < this.e) {
            hso_ew var4 = (hso_ew)hso_ew.b.a(this.d);
            var3 = this.e + 2 + var4.m.length;
         } else {
            var3 = this.e + 2;
         }
      }

      this.f = var3 * this.j - hso_fl.T + 5;
      if (this.f < 0) {
         this.f = 0;
      }

      this.h = hso_fl.aM * 3;
      if (var1) {
         hso_p.e.a(0, this.f, 0, 0);
      } else {
         hso_p.e.f = this.f;
      }
   }

   public final void e() {
      int var1;
      int var2;
      if (hso_ft.S) {
         var1 = super.L + hso_fl.aM + hso_fl.aN * 3 + this.g;
         var2 = 0 + hso_ft.X / 5 + hso_fl.aN;
         if (hso_ft.c(var1, var2, this.h, hso_fl.aM - hso_fl.aN + 1)) {
            if (this.k != 0) {
               this.k = 0;
               this.a(true);
            }

            hso_ft.S = false;
         } else if (hso_ft.c(var1 + this.h, var2, this.h, hso_fl.aM - hso_fl.aN + 1)) {
            if (this.k != 1) {
               this.k = 1;
               this.a(true);
            }

            hso_ft.S = false;
         }
      }

      if (hso_ft.S && hso_ft.c(this.p, this.q - hso_p.e.b - 4, 96, 24)) {
         hso_ft.S = false;
         this.l.a();
      }

      if (this.e > 0) {
         if (hso_ft.b(super.V, super.W, hso_fl.S, hso_fl.T)) {
            if (this.k == 0) {
               var1 = super.W + 4 + this.j;
               var2 = (hso_ft.af - var1 + hso_p.e.b) / this.j;
               if (hso_ew.c.c() > 0 && hso_ew.d.c() > 0) {
                  if (var2 == hso_ew.c.c()) {
                     var2 = -1;
                  } else if (var2 > hso_ew.c.c()) {
                     --var2;
                  }
               }

               if (var2 > -1 && var2 <= this.e) {
                  if (var2 == this.d) {
                     if (hso_fl.aU == 0 && this.d < this.e) {
                        this.m.a();
                     }
                  } else {
                     this.d = var2;
                     this.d = hso_cg.a(this.d, this.e, false);
                  }

                  hso_ft.S = false;
               }

               this.h();
            } else {
               if ((var1 = (hso_ft.af - super.W + hso_p.e.b) / this.j) < this.d) {
                  this.d = var1;
               } else if (this.d < this.e) {
                  hso_ew var3 = (hso_ew)hso_ew.b.a(this.d);
                  if ((var1 = super.W + this.d * this.j + var3.m.length * hso_ft.ab) < hso_ft.af + hso_p.e.b) {
                     var1 = (hso_ft.af + hso_p.e.b - var1) / this.j + this.d;
                     this.d = var1;
                     this.d = hso_cg.a(this.d, this.e, false);
                     hso_ft.S = false;
                  }
               }

               this.h();
            }
         }

         if (hso_ft.T) {
            if (this.f > 0 && hso_ft.ag > super.V && hso_ft.ag < super.V + hso_fl.S && hso_ft.ah > super.W && hso_ft.ah < super.W + hso_fl.T) {
               if (!this.t) {
                  this.t = true;
                  this.u = hso_p.e.b;
               } else {
                  hso_p.e.d = this.u + hso_ft.ah - hso_ft.af;
                  if (hso_p.e.d > hso_p.e.f) {
                     hso_p.e.d = hso_p.e.f;
                  }

                  if (hso_p.e.d < 0) {
                     hso_p.e.d = 0;
                  }

                  hso_eu.f = 10;
               }
            }
         } else {
            this.t = false;
            this.u = 0;
         }

         if (this.r != null && hso_fl.aO == 1 && super.bp != null) {
            for(var1 = 0; var1 < this.r.c(); ++var1) {
               ((hso_bt)this.r.a(var1)).b();
            }
         }
      }

      super.e();
   }
}
