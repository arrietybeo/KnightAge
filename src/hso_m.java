public final class hso_m extends hso_fl {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e = 20;
   private int f = 0;
   private int g = 30;
   private hso_bt h;
   private hso_bt i;
   private hso_bt j;
   private hso_bt k;
   private int l = 0;
   private hso_dy m;
   private hso_bp n;
   private String o = "";

   public hso_m(String var1) {
      super.K = 2;
      super.X = var1;
      if (hso_ft.A) {
         this.e = 22;
      }

      if (hso_ft.X <= 200) {
         this.e = 18;
      }

      this.f = this.e - 20;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      this.a = hso_fl.S / 4;
      this.b();
      super.aT = new hso_bt(hso_df.af, -1, this);
      if (hso_ft.A) {
         super.aT.a = hso_df.Z;
      }

      this.h = new hso_bt(hso_df.aB, 0, this);
      this.k = new hso_bt(hso_df.aC, 3, this);
      this.i = new hso_bt(hso_df.aC, 1, this);
      this.j = new hso_bt(hso_df.aC, 2, this);
   }

   public final void b() {
      int var1 = super.W + 4 + hso_ft.ab + this.e * hso_df.go.length + 2;
      int var2 = hso_fl.T - (hso_ft.ab + 2 + this.e * hso_df.go.length);
      this.c = GameScreen.f.L.length * hso_ft.ab - var2 + 5;
      this.n = new hso_bp(super.V, var1, hso_fl.S, var2, 0, 0, this.c);
      if (hso_fl.aU > 0) {
         this.n.c = hso_fl.aV;
         this.n.d = hso_fl.aW + hso_fl.aM;
         this.n.a = hso_fl.aU;
         this.n.b = hso_fl.T - hso_fl.aM;
         this.n.g = GameScreen.f.L.length * hso_ft.ab - super.N + hso_fl.aM + 10;
      }

      if (this.c < 0) {
         this.c = 0;
      }

      hso_p.e.a(0, this.n.g, 0, 0);
      if (!hso_ft.A) {
         super.Z = super.aT;
         if (Player.t > 0) {
            super.aa = this.h;
         }
      }

      this.l = 0;
      super.b();
      if (hso_ft.C) {
         for(var1 = 0; var1 < GameScreen.f.L.length; ++var1) {
            hso_cz var3;
            if ((var3 = GameScreen.f.L[var1]).a < 23 || var3.a > 26) {
               this.o = this.o + hso_bw.d[var3.a] + ": " + hso_bw.a(hso_bw.f[var3.a], (int)var3.b) + "\n";
            }
         }
      }

   }

   public final void c() {
      hso_fl.aO = 0;
      this.b = 0;
      super.c();
   }

   public final void a(int var1, int var2) {
      boolean var3;
      short var6;
      switch(var1) {
      case -1:
         this.c();
         break;
      case 0:
         if (Player.t == 1) {
            hso_ft.c(hso_df.aM + hso_df.go[this.b] + hso_df.ca + this.c(1), this.j);
         } else if (Player.t > 0) {
            this.m = new hso_dy();
            this.m.a(hso_df.aN + hso_df.go[this.b] + " (" + hso_df.aO + Player.t + ") ", this.k, true, hso_df.bB);
            hso_ft.r = this.m;
         }
         break;
      case 1:
         var3 = false;

         try {
            var6 = Short.parseShort(this.m.a.j());
         } catch (Exception var5) {
            var6 = 0;
         }

         if (var6 < 1) {
            return;
         }

         if (var6 > Player.t) {
            hso_ft.a(hso_df.cA + Player.t);
         } else {
            Service.a().a((byte)0, (byte)((byte)this.b), (short)var6);
            hso_ft.j();
            if (GameScreen.p.d(7, 6)) {
               ++GameScreen.p.b;
               GameScreen.p.g();
            }
         }
         break;
      case 2:
         Service.a().a((byte)0, (byte)((byte)this.b), (short)1);
         if (GameScreen.p.d(7, 6)) {
            ++GameScreen.p.b;
         }

         hso_ft.j();
         break;
      case 3:
         var3 = false;

         try {
            var6 = Short.parseShort(this.m.a.j());
         } catch (Exception var4) {
            var6 = 0;
         }

         if (var6 < 1) {
            return;
         }

         if (var6 > Player.t) {
            hso_ft.a(hso_df.cA + Player.t);
         } else {
            hso_ft.c(var6 + hso_df.cb + hso_df.go[this.b] + hso_df.ca + this.c(var6), this.i);
         }
      }

      super.a(var1, var2);
   }

   public final void a(mGraphics var1) {
      int var2 = super.W + 4;
      int var3 = super.V + 4;
      hso_o.j.a(var1, hso_df.al + Player.t, var3, var2, 0, false);
      var2 += hso_ft.ab + 2;

      int var4;
      int var5;
      for(var4 = 0; var4 < hso_df.go.length; ++var4) {
         var5 = super.V + this.a - this.a / 4 + this.g;
         int var6 = var2 + this.e * var4 + this.f;
         if (hso_ft.B) {
            hso_fl.c(var1, var5 + 2 - this.f / 2, var6 - 1 - this.f / 2, 24 + this.f, 13 + this.f, 4);
         } else {
            var1.a(hso_fl.aP[12], 0, 0, 24 + this.f, 13 + this.f, 0, var5 + 2 - this.f / 2, var6 - 1 - this.f / 2, 0);
         }

         hso_o.f.a(var1, hso_df.go[var4] + ":", var5 - this.f / 2 - this.g - this.a / 2 - (hso_ft.C ? 4 : 0), var6, 0, true);
         hso_o.f.a(var1, String.valueOf(Player.v[0][var4]), var5 + 14, var6, 2, true);
         if (Player.v[1][var4] > 0) {
            hso_o.b.a(var1, "+" + Player.v[1][var4], var5 + 26 + this.f, var6, 0, false);
         }
      }

      var1.a(hso_fl.bf[3]);
      if (this.b != 4 && (this.l > 0 || !hso_ft.A) && hso_fl.aO == 1) {
         var4 = super.V + this.a - this.a / 4 + this.g + 2 - this.f / 2;
         var5 = var2 + this.e * this.b + this.f / 2 - 1;
         var1.b(var4, var5, 24 + this.f, 13 + this.f);
      }

      var2 += this.e * hso_df.go.length;
      if (hso_fl.aU > 0) {
         hso_o.f.a(var1, hso_df.bK, hso_fl.aV + hso_fl.aU / 2, hso_fl.aW + hso_fl.aM / 4, 2, false);
      }

      if (hso_fl.aU > 0) {
         hso_ft.a(var1);
         var1.d(hso_fl.aV, hso_fl.aW + hso_fl.aM + 4, hso_fl.aU, super.N - hso_fl.aM - 6);
         var1.a(hso_fl.aV, hso_fl.aW + hso_fl.aM);
         var1.a(0, -hso_p.e.b);
         var3 = 4;
         var2 = 4;
      } else {
         if (!hso_ft.C && this.b == 4) {
            if (hso_p.e.b > 0) {
               var1.a(hso_fl.aP[7], 0, 0, 13, 8, 0, super.V + hso_fl.S - 16, var2 - 2 + hso_ft.ai % 3, 0);
            }

            if (hso_p.e.b < hso_p.e.f) {
               var1.a(hso_fl.aP[7], 0, 8, 13, 8, 0, super.V + hso_fl.S - 16, super.W + hso_fl.T - 10 - hso_ft.ai % 3, 0);
            }
         }

         if (!hso_ft.C) {
            var1.d(super.V, var2 - 5, hso_fl.S, super.W + hso_fl.T - var2 + 3);
            var1.a(0, -hso_p.e.b);
         }
      }

      if (hso_ft.C) {
         hso_o.f.a(var1, hso_df.bK, var3 + hso_fl.S / 2, var2 - hso_ft.ab / 2, 2, true);
      } else {
         for(int var10 = 0; var10 < GameScreen.f.L.length; ++var10) {
            hso_cz var11;
            if ((var11 = GameScreen.f.L[var10]).a < 23 || var11.a > 26) {
               hso_o var12 = null;
               var12 = hso_fl.a(hso_bw.e[var11.a]);
               String var13 = hso_bw.d[var11.a] + ": " + hso_bw.a(hso_bw.f[var11.a], (int)var11.b);
               var12.a(var1, var13, var3, var2, 0, true);
               var5 = 0;
               int var9;
               if (GameScreen.f.df != null) {
                  for(int var7 = 0; var7 < GameScreen.f.df.c(); ++var7) {
                     hso_ei var8;
                     if ((var8 = (hso_ei)GameScreen.f.df.a(var7)).l != null) {
                        for(var9 = 0; var9 < var8.l.length; ++var9) {
                           if (var11.a == var8.l[var9].a) {
                              var5 += var8.l[var9].b;
                           }
                        }
                     }
                  }
               }

               if (var5 != 0) {
                  String var14 = null;
                  hso_o var15 = hso_o.o;
                  if (var5 > 0) {
                     var14 = " +" + hso_bw.a(hso_bw.f[var11.a], (int)var5);
                  } else {
                     var14 = " " + hso_bw.a(hso_bw.f[var11.a], (int)var5);
                     var15 = hso_o.m;
                  }

                  var9 = hso_o.j.a(var13);
                  var15.a(var1, " " + var14, var3 + var9, var2, 0, true);
               }

               var2 += hso_ft.ab;
            }
         }

      }
   }

   public final void a() {
      if (hso_ft.A) {
         this.n.c();
         this.n.a();
         hso_p.e.b = this.n.f;
      } else {
         hso_p.e.a();
      }

      if (!hso_ft.A) {
         if (Player.t > 0 && this.b != 4) {
            if (super.aa == null) {
               super.aa = this.h;
            }
         } else if (super.aa != null) {
            super.aa = null;
         }
      }

      if (this.l > 0 && hso_ft.r == null) {
         --this.l;
      }

   }

   public final void d() {
      if (hso_fl.aO == 1) {
         if (this.b == 4) {
            if (hso_ft.C) {
               this.b = 3;
               hso_ft.b(this.o, hso_df.bK);
            } else if (hso_ft.al[2]) {
               this.d -= hso_ft.ab;
               if (this.d < 0) {
                  this.b = 3;
               }

               hso_ft.d(2);
               hso_p.e.a(0, this.d);
            } else if (hso_ft.al[8]) {
               this.d += hso_ft.ab;
               if (this.d > this.c) {
                  this.d = this.c;
               }

               hso_ft.d(8);
               hso_p.e.a(0, this.d);
            }
         } else {
            if (hso_ft.al[2]) {
               --this.b;
               hso_ft.d(2);
            } else if (hso_ft.al[8]) {
               ++this.b;
               hso_ft.d(8);
            } else if (hso_ft.al[4] || hso_ft.al[6]) {
               hso_fl.aO = 0;
               hso_ft.d(4);
               hso_ft.d(6);
            }

            int var1 = hso_df.go.length - 1;
            if (this.c > 0) {
               ++var1;
            }

            this.b = hso_cg.a(this.b, var1, false);
            this.d = 0;
         }
      }

      super.d();
   }

   public final void e() {
      if (hso_ft.S) {
         for(int var1 = 0; var1 < 4; ++var1) {
            int var2 = super.V + this.a - this.a / 4 + this.g;
            int var3 = super.W + hso_ft.ab + 4 + this.e * var1 + this.f + 2;
            if (hso_ft.c(var2 - 2 - this.f / 2, var3 - 5 - this.f / 2, 32 + this.f, 21 + this.f)) {
               this.b = var1;
               this.h.a();
               hso_ft.S = false;
               this.l = 10;
               break;
            }
         }
      }

      super.e();
   }

   private String c(int var1) {
      String var2 = "";
      switch(this.b) {
      case 0:
         var2 = var2 + "\n" + hso_df.cY + d(2, var1);
         var2 = var2 + "\n" + hso_df.cZ + d(20, var1);
         if (GameScreen.f.bx == 0) {
            var2 = var2 + "\n" + hso_df.da + "+" + var1 * 4;
            var2 = var2 + "\n" + hso_df.db + "+" + var1 * 4;
         } else if (GameScreen.f.bx == 1) {
            var2 = var2 + "\n" + hso_df.da + "+" + var1 * 4;
            var2 = var2 + "\n" + hso_df.dc + "+" + var1 * 4;
         }
         break;
      case 1:
         var2 = var2 + "\n" + hso_df.de + d(2, var1);
         var2 = var2 + "\n" + hso_df.df + d(10, var1);
         if (GameScreen.f.bx == 3) {
            var2 = var2 + "\n" + hso_df.df + "+" + var1 * 22;
         } else if (GameScreen.f.bx == 1) {
            var2 = var2 + "\n" + hso_df.df + "+" + var1 * 22;
         } else {
            var2 = var2 + "\n" + hso_df.df + "+" + var1 * 20;
         }
         break;
      case 2:
         var2 = var2 + "\n" + hso_df.dy + d(2, var1);
         if (GameScreen.f.bx == 0) {
            var2 = var2 + "\n" + hso_df.dz + "+" + var1 * 320;
         } else if (GameScreen.f.bx == 2) {
            var2 = var2 + "\n" + hso_df.dz + "+" + var1 * 310;
            var2 = var2 + "\n" + hso_df.bm + "+" + var1 * 1;
         } else {
            var2 = var2 + "\n" + hso_df.dz + "+" + var1 * 300;
            if (GameScreen.f.bx == 2) {
               var2 = var2 + "\n" + hso_df.dA + d(5, var1);
            }
         }
         break;
      case 3:
         var2 = var2 + "\n" + hso_df.dB + d(2, var1);
         if (GameScreen.f.bx == 2) {
            var2 = var2 + "\n" + hso_df.bm + "+" + var1 * 11;
            var2 = var2 + "\n" + hso_df.da + "+" + var1 * 4;
            var2 = var2 + "\n" + hso_df.dC + "+" + var1 * 4;
            var2 = var2 + "\n" + hso_df.da + d(18, var1);
            var2 = var2 + "\n" + hso_df.dC + d(18, var1);
         } else if (GameScreen.f.bx == 3) {
            var2 = var2 + "\n" + hso_df.bm + "+" + var1 * 11;
            var2 = var2 + "\n" + hso_df.da + "+" + var1 * 4;
            var2 = var2 + "\n" + hso_df.dd + "+" + var1 * 4;
            var2 = var2 + "\n" + hso_df.da + d(18, var1);
            var2 = var2 + "\n" + hso_df.dd + d(18, var1);
         } else {
            var2 = var2 + "\n" + hso_df.bm + "+" + var1 * 10;
         }
      }

      return var2;
   }

   private static String d(int var0, int var1) {
      String var2 = null;
      if ((var0 *= var1) % 100 == 0) {
         var2 = "+" + var0 / 100 + "%";
      } else if (var0 % 10 == 0) {
         var2 = "+" + var0 / 100 + "." + var0 % 100 / 10 + "%";
      } else {
         var2 = "+" + var0 / 100 + "." + var0 % 100 / 10 + var0 % 10 + "%";
      }

      return var2;
   }
}
