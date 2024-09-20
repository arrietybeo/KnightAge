public final class hso_af extends hso_fl {
   private int f;
   private int g;
   public static int a = 12;
   private int h;
   private int i;
   public static int b = 0;
   private byte j;
   private int k;
   private int l;
   public static hso_cz[] c;
   public static hso_cz[] d;
   private int[] m;
   private hso_es n = new hso_es("TabMySeftNew vecItemMenu");
   public static String[] e = new String[5];
   private boolean o = false;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private boolean u = false;
   private hso_es v = new hso_es("vec List cmd");
   private byte w;
   private hso_bt x;
   private hso_bt y;
   private hso_bt z;
   private hso_bt A;
   private hso_bt B;
   private hso_bt C;
   private hso_bt D;
   private hso_bp E;
   private int F;

   public hso_af(String var1) {
      this.F = hso_fl.aM;
      super.K = 1;
      if (hso_ft.C) {
         b = 10;
      }

      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      this.h = hso_fl.T / 12;
      this.i = hso_fl.S / 5;
      this.f = hso_fl.S / hso_fl.aM;
      if (this.f > 6) {
         this.f = 6;
      }

      this.k = super.V + hso_fl.S / 2 - this.f * hso_fl.aM / 2 + (hso_ft.C ? 0 : this.f / 2);
      this.l = super.W + this.h * 10 - hso_fl.aM;
      this.g = a / this.f;
      super.X = var1;
      if (var1 == null || var1.length() == 0) {
         super.X = "Name Tab";
      }

      this.z = new hso_bt(hso_df.Z, -2, this);
      super.aT = new hso_bt(hso_df.af, -1, this);
      if (hso_ft.A) {
         super.aT.a = hso_df.Z;
      }

      this.x = new hso_bt(hso_df.az, 0, this);
      this.y = new hso_bt(hso_df.aA, 1, this);
      new hso_bt(hso_df.bK, 2, this);
      this.A = new hso_bt(hso_df.fI, 3, this);
      this.B = new hso_bt(hso_df.r, 4, this);
      this.C = new hso_bt(hso_df.q, 5, this);
      this.D = new hso_bt(hso_df.a, 6, this);
      if (!hso_ft.A) {
         super.Y = this.B;
      }

      this.w = 0;
   }

   public final void b() {
      if (hso_ft.A) {
         this.j = -1;
      } else {
         this.j = 0;
      }

      this.o = false;
      super.aY = null;
      if (!hso_ft.A) {
         super.Z = super.aT;
         super.aa = this.x;
      }

      hso_fl.bi = 0;
      super.b();
   }

   public final void c() {
      hso_fl.aO = 0;
      if (hso_ft.A) {
         this.j = -1;
      } else {
         this.j = 0;
      }

      super.c();
   }

   public final void a(int var1, int var2) {
      if (this.j != -1 || var1 == -1) {
         hso_bw var3;
         switch(var1) {
         case -2:
            hso_fl.bi = 0;
            hso_eu.f = 10;
            if (!hso_ft.A) {
               super.Z = super.aT;
               super.aa = this.x;
            }

            this.o = false;
            this.n.d();
            this.q = 0;
            break;
         case -1:
            this.c();
            break;
         case 0:
            (new StringBuffer("Command pointer tab myself index = ")).append(var1).toString();
            int var6 = hso_fo.k[this.j + this.w];
            if ((var3 = (hso_bw)hso_bw.U.a("" + (this.j + this.w))) == null) {
               if (var6 == -2) {
                  return;
               }

               if (var6 == -1) {
                  if (GameScreen.f.bx == 2) {
                     var6 = 11;
                  } else if (GameScreen.f.bx == 3) {
                     var6 = 10;
                  } else {
                     var6 = 8 + GameScreen.f.bx;
                  }
               }
            } else {
               var6 = var3.R;
            }

            if (var6 == 14) {
               if (var3 != null) {
                  hso_ft.a((hso_ea)((hso_ea)var3), (byte)1);
               }

               return;
            }

            this.c(var6);
            if (this.n != null && this.n.c() > 0) {
               hso_eu.f = 10;
               this.p = this.n.c();
               if (this.p > this.f) {
                  this.p = this.f;
               }

               int var7 = this.k + this.j % this.f * this.F - this.p * this.F / 2 + hso_fl.aM / 2;
               var6 = this.l + this.j / this.f * this.F + hso_fl.aM + hso_fl.aN;
               if (var7 < super.V + (hso_fl.aN << 1)) {
                  var7 = super.V + (hso_fl.aN << 1);
               } else if (var7 + this.p * this.F + hso_fl.aN > super.V + hso_fl.S - hso_fl.aN) {
                  var7 = super.V + hso_fl.S - hso_fl.aN - (this.p * this.F + hso_fl.aN);
               }

               if (var6 + hso_fl.aM + (hso_fl.aN << 1) > hso_ft.X - hso_ft.aa / 2) {
                  var6 = hso_ft.X - hso_ft.aa / 2 - hso_fl.aM - (hso_fl.aN << 1);
               }

               this.r = var7;
               this.s = var6;
               hso_aw var10000 = hso_p.e;
               int var10001 = (this.n.c() - this.p) * this.F;
               boolean var8 = false;
               var8 = false;
               var8 = false;
               var6 = var10001;
               hso_aw var9 = var10000;
               var10000.e = var6;
               var9.f = 0;
               if (var9.f < 0) {
                  var9.f = 0;
               }

               if (var9.e < 0) {
                  var9.e = 0;
               }

               var9.c = 0;
               var9.d = 0;
               this.E = new hso_bp(this.r, this.s, this.p * this.F, this.F, 0, 0, (this.n.c() - this.p) * this.F);
               this.o = true;
               c = null;
               d = null;
               if (!hso_ft.A) {
                  super.aa = this.y;
                  if (!hso_ft.A) {
                     super.Z = this.z;
                  } else {
                     super.Z = null;
                  }
               }

               hso_fl.bi = 0;
            } else {
               if (!hso_ft.A) {
                  super.Z = super.aT;
                  super.aa = this.x;
               }

               this.o = false;
               hso_ft.a(hso_df.aL);
            }
            break;
         case 1:
            if ((var3 = (hso_bw)this.n.a(this.q)).b()) {
               return;
            }

            Service.a().b((byte)var3.O, this.j);
            hso_fl.bi = 0;
            hso_eu.f = 10;
            if (!hso_ft.A) {
               super.Z = super.aT;
               super.aa = this.x;
            }

            this.o = false;
            this.n.d();
            this.q = 0;
            break;
         case 2:
            if ((var3 = (hso_bw)hso_bw.U.a("" + this.j)) != null && var3.u == 9) {
               hso_ft.a((hso_ea)((hso_ea)var3), (byte)1);
            }
            break;
         case 3:
            if ((var3 = (hso_bw)hso_bw.U.a("" + this.j)) != null && var3.u == 9) {
               hso_ft.a((hso_ea)((hso_ea)var3), (byte)1);
            }

            hso_es var5 = new hso_es("TabMySeftNew vecItemMenu");
            hso_fn var4;
            (var4 = new hso_fn(hso_bw.V, (byte)0, hso_df.fI, -1, hso_fn.j)).D = hso_ah.i;
            var5.a(var4);
            (hso_ft.w = new hso_eu()).a = 0;
            hso_ft.w.a(var5);
            hso_ft.w.a(hso_ft.a);
            break;
         case 4:
            this.w = 12;
            if (hso_ft.A) {
               this.v = this.a((hso_bw)null);
               this.b(this.v);
            }

            if (!hso_ft.A || hso_dw.g && hso_ft.A) {
               super.Y = this.C;
            }
            break;
         case 5:
            this.w = 0;
            if (hso_ft.A) {
               this.v = this.a((hso_bw)null);
               this.b(this.v);
            }

            if (!hso_ft.A || hso_dw.g && hso_ft.A) {
               super.Y = this.B;
            }
            break;
         case 6:
            this.w = 24;
            if (hso_ft.A) {
               this.v = this.a((hso_bw)null);
               this.b(this.v);
            }

            if (!hso_ft.A || hso_dw.g && hso_ft.A) {
               super.Y = this.C;
            }
         }

         super.a(var1, var2);
      }
   }

   public final void a(mGraphics var1) {
      GameScreen.f.b(var1, super.V + this.i + b / 2, super.W + this.h * 5 / 2 + 15, 0);
      var1.a(hso_fl.bf[1]);
      if (!hso_ft.C) {
         var1.c(super.V + this.i / 4, super.W + this.h * 6 - this.h / 2, (this.i << 1) - this.i / 2 + b, 1);
         var1.c(super.V + (this.i << 1) + b + this.i / 4, super.W + this.h * 6 - this.h / 2, (this.i << 1) + b + this.i / 2, 1);
      }

      var1.c(super.V + (this.i << 1) + b, super.W + this.h / 4, 1, (this.h << 3) - this.h / 2);
      hso_o.l.a(var1, "" + GameScreen.f.cA, super.V + 15, super.W + this.h * 6 - this.h / 2 + 4 - (hso_ft.C ? 8 : 0), 0, false);
      hso_o.l.a(var1, "" + Player.e, super.V + 15, super.W + this.h * 6 - this.h / 2 + hso_ft.ab + 4 - (hso_ft.C ? 12 : 0), 0, false);
      var1.a(hso_fl.aR, super.V + 4, super.W + this.h * 6 - this.h / 2 + 4 - (hso_ft.C ? 8 : 0), 0);
      var1.a(hso_fl.aQ, super.V + 4, super.W + this.h * 6 - this.h / 2 + hso_ft.ab + 4 - (hso_ft.C ? 12 : 0), 0);
      int var2;
      if (!hso_ft.C) {
         for(var2 = 0; var2 < 5; ++var2) {
            var1.a(hso_fl.aP[5], 0, var2 * 10, 10, 10, 0, super.V + (this.i << 1) + b + 10 + var2 % 3 * this.i + 3, super.W + this.h * 6 - this.h / 2 + 9 + var2 / 3 * this.h, 10);
            String var3 = "";
            if (this.o) {
               if (d != null) {
                  var3 = e[var2];
               }
            } else {
               var3 = GameScreen.f.K[var2];
            }

            hso_o.j.a(var1, var3, super.V + (this.i << 1) + b + 14 + var2 % 3 * this.i, super.W + this.h * 6 - this.h / 2 + 3 + var2 / 3 * this.h, 0, false);
         }
      }

      if (!hso_ft.C) {
         var1.a(hso_fl.aS, 0, 0, 10, 9, 0, super.V + (this.i << 1) + b + 10 + 2 * this.i + 3, super.W + this.h * 6 - this.h / 2 + 9 + 1 * this.h, 10);
         hso_o.l.a(var1, "" + Player.i, super.V + (this.i << 1) + b + 14 + 2 * this.i, super.W + this.h * 6 - this.h / 2 + 3 + 1 * this.h, 0, false);
      } else {
         hso_o.l.a(var1, "" + Player.i, super.V + 15, super.W + this.h * 6 - this.h / 2 + 2 * hso_ft.ab + 3 - (hso_ft.C ? 16 : 0), 0, false);
         var1.a(hso_fl.aS, super.V + 4, super.W + this.h * 6 - this.h / 2 + 2 * hso_ft.ab + 4 - (hso_ft.C ? 16 : 0), 0);
      }

      var1.a(hso_fl.bf[4]);

      int var7;
      for(byte var6 = 0; var6 < a; ++var6) {
         var7 = this.k + var6 % this.f * this.F;
         int var4 = this.l + var6 / this.f * this.F;
         hso_bw var5;
         if ((var5 = (hso_bw)hso_bw.U.a("" + (var6 + this.w))) != null) {
            if (var5.O > -1) {
               var5.a(var1, var7 + hso_fl.aM / 2, var4 + hso_fl.aM / 2, hso_fl.aM, 0, 0);
            } else if (this.w <= 0) {
               var1.a(hso_fl.aP[6], 0, var6 * 20, 20, 20, 0, var7 + hso_fl.aM / 2, var4 + hso_fl.aM / 2, 3);
            }
         } else if (this.w <= 0) {
            var1.a(hso_fl.aP[6], 0, var6 * 20, 20, 20, 0, var7 + hso_fl.aM / 2, var4 + hso_fl.aM / 2, 3);
         }

         var1.a(hso_fl.bf[4]);
         var1.b(var7, var4, this.F, this.F);
      }

      var1.a(hso_fl.bf[3]);
      if (hso_fl.aO == 1 && this.j >= 0) {
         var2 = this.k + this.j % this.f * this.F;
         var7 = this.l + this.j / this.f * this.F;
         var1.b(var2, var7, this.F, this.F);
         var1.a(hso_fl.bf[2]);
         var1.b(var2 + 1, var7 + 1, this.F - 2, this.F - 2);
      }

      if (this.o) {
         if (d != null) {
            a(var1, super.V + (this.i << 1) + 4 + b, super.W + 4, d, this.u);
         } else {
            hso_o.j.a(var1, hso_df.aD, super.V + (this.i << 1) + 4 + b, super.W + 4, 0, false);
         }
      } else {
         a(var1, super.V + (this.i << 1) + 4 + b, super.W + 4, GameScreen.f.L, true);
      }

      if (hso_fl.aO == 1) {
         if ((hso_fl.bi > hso_fl.aX || this.o && hso_fl.bi > 5) && !hso_ft.o.a && hso_ft.r == null) {
            this.a(var1, hso_fl.aU > 0 ? false : this.o);
         }

         if (this.o) {
            this.b(var1);
         }
      }

      if (this.v != null) {
         for(var2 = 0; var2 < this.v.c(); ++var2) {
            hso_bt var8;
            (var8 = (hso_bt)this.v.a(var2)).a(var1, var8.h, var8.i);
         }
      }

   }

   private void b(mGraphics var1) {
      int var2 = this.n.c();
      int var3;
      if ((var3 = hso_fl.aM + (hso_fl.aN << 1)) < 32) {
         var3 = 32;
      }

      hso_cg.a(var1, this.r - this.p / 2 - hso_fl.aN, this.s - hso_fl.aN, this.p * hso_fl.aM + (hso_fl.aN << 1), var3, (int)12);
      var1.d(this.r + (var2 == 1 ? 1 : 0), this.s, this.p * this.F + 2, hso_fl.aM + (hso_fl.aN << 1));
      var1.a(-hso_p.e.a, 0);

      for(var3 = 0; var3 < var2; ++var3) {
         ((hso_bw)this.n.a(var3)).a(var1, this.r + var3 * this.F + hso_fl.aM / 2 + (var2 == 1 ? 1 : 0), this.s + hso_fl.aM / 2, hso_fl.aM, 0, 0);
      }

      if (var2 > 0) {
         var1.a(hso_fl.bf[2]);
         var1.b(this.r + this.q * this.F + (var2 == 1 ? 1 : 0), this.s + 1, this.F, this.F);
      }

      hso_ft.a(var1);
   }

   private static void a(mGraphics var0, int var1, int var2, hso_cz[] var3, boolean var4) {
      if (var3 != null) {
         for(int var5 = 0; var5 < var3.length; ++var5) {
            hso_cz var6;
            if ((var6 = var3[var5]) != null && (var6.a <= 4 || var6.a == 40 || var6.a == 14) && var6.b != 0) {
               hso_o var7 = null;
               if (!var4) {
                  var7 = hso_o.i;
               } else {
                  var7 = hso_fl.a(hso_bw.e[var6.a]);
               }

               String var8 = hso_bw.d[var6.a] + ": " + hso_bw.a(hso_bw.f[var6.a], (int)var6.b);
               var7.a(var0, var8, var1, var2, 0, false);
               int var12 = 0;
               int var11;
               if (GameScreen.f.df != null && !hso_ft.C) {
                  for(int var9 = 0; var9 < GameScreen.f.df.c(); ++var9) {
                     hso_ei var10;
                     if ((var10 = (hso_ei)GameScreen.f.df.a(var9)).l != null) {
                        for(var11 = 0; var11 < var10.l.length; ++var11) {
                           if (var6.a == var10.l[var11].a) {
                              var12 += var10.l[var11].b;
                           }
                        }
                     }
                  }
               }

               if (var12 != 0) {
                  String var13 = null;
                  hso_o var14 = hso_o.o;
                  if (var12 > 0) {
                     var13 = " +" + hso_bw.a(hso_bw.f[var6.a], (int)var12);
                  } else {
                     var13 = " " + hso_bw.a(hso_bw.f[var6.a], (int)var12);
                     var14 = hso_o.m;
                  }

                  var11 = hso_o.j.a(var8);
                  var14.a(var0, " " + var13, var1 + var11, var2, 0, false);
               }

               var2 += hso_ft.ab;
            }
         }
      }

   }

   public final void a() {
      if (hso_fl.aO == 1) {
         if (super.aY != null) {
            super.aY.c();
         }

         if (this.o) {
            if (hso_ft.A) {
               this.E.c();
            } else {
               hso_p.e.a();
            }
         }

         hso_af var5;
         if ((var5 = this).j != -1) {
            if (hso_fl.bi < hso_fl.aX + 2) {
               ++hso_fl.bi;
               if (var5.o) {
                  if (hso_fl.bi == 5) {
                     var5.f();
                  }
               } else if (hso_fl.bi == hso_fl.aX) {
                  var5.f();
               }
            } else if (var5.o && !var5.u) {
               if (c == null) {
                  ++var5.t;
                  hso_j var1;
                  if (var5.t % 100 == 3 && (var1 = (hso_j)var5.n.a(var5.q)) != null) {
                     Service.a().a(var5.j, (byte)var1.O);
                  }
               } else {
                  var5.m = new int[c.length];

                  for(int var6 = 0; var6 < c.length; ++var6) {
                     hso_cz var2 = c[var6];
                     var5.m[var6] = 0;

                     for(int var3 = 0; var3 < GameScreen.f.L.length; ++var3) {
                        hso_cz var4 = GameScreen.f.L[var6];
                        if (var2.a == var4.a) {
                           if (var2.b > var4.b) {
                              var5.m[var6] = 2;
                           } else if (var2.b < var4.b) {
                              var5.m[var6] = 3;
                           }
                           break;
                        }
                     }
                  }

                  var5.u = true;
               }
            }
         }
      } else {
         hso_fl.bi = 0;
      }

      GameScreen.f.K();
   }

   public final void d() {
      if (hso_fl.aO == 1) {
         hso_bp var10000;
         if (this.o) {
            if (super.aY != null) {
               if (hso_ft.al[2]) {
                  if (super.aY.e > 0) {
                     var10000 = super.aY;
                     var10000.e -= hso_ft.ab;
                  } else {
                     super.aY.e = 0;
                  }

                  hso_ft.d(2);
               } else if (hso_ft.al[8]) {
                  if (super.aY.e < super.aY.g) {
                     var10000 = super.aY;
                     var10000.e += hso_ft.ab;
                  } else {
                     super.aY.e = super.aY.g;
                  }

                  hso_ft.d(8);
               }
            }

            int var1 = this.q;
            if (hso_ft.al[4]) {
               --this.q;
               hso_ft.d(4);
            } else if (hso_ft.al[6]) {
               ++this.q;
               hso_ft.d(6);
            }

            this.q = hso_cg.a(this.q, this.n.c() - 1, true);
            if (var1 != this.q) {
               hso_p.e.a(this.q * this.F - this.p * this.F / 2, 0);
               hso_fl.bi = 0;
            }
         } else {
            byte var2 = this.j;
            if (super.aY != null) {
               if (hso_ft.al[2]) {
                  if (super.aY.e > 0) {
                     var10000 = super.aY;
                     var10000.e -= hso_ft.ab;
                  } else {
                     super.aY.e = 0;
                  }

                  hso_ft.d(2);
               } else if (hso_ft.al[8]) {
                  if (super.aY.e < super.aY.g) {
                     var10000 = super.aY;
                     var10000.e += hso_ft.ab;
                  } else {
                     super.aY.e = super.aY.g;
                  }

                  hso_ft.d(8);
               }
            } else if (hso_ft.al[2]) {
               if (this.j >= this.f) {
                  this.j = (byte)(this.j - this.f);
               }

               hso_ft.d(2);
            } else if (hso_ft.al[8]) {
               if (this.j < a - this.f) {
                  this.j = (byte)(this.j + this.f);
               }

               hso_ft.d(8);
            }

            if (hso_ft.al[4]) {
               if (this.j % this.f == 0) {
                  hso_fl.aO = 0;
               } else {
                  --this.j;
               }

               hso_ft.d(4);
            } else if (hso_ft.al[6]) {
               ++this.j;
               hso_ft.d(6);
            }

            if (this.j >= 0) {
               this.j = (byte)hso_cg.a(this.j, a - 1, false);
            } else {
               this.j = -1;
               this.v = null;
            }

            if (var2 != this.j) {
               hso_fl.bi = 0;
               super.aY = null;
            }
         }
      }

      super.d();
   }

   private void f() {
      if (this.j != -1 || this.o) {
         hso_bw var1 = null;
         if (this.o) {
            var1 = (hso_bw)this.n.a(this.q);
         } else {
            var1 = (hso_bw)hso_bw.U.a("" + (this.j + this.w));
         }

         if (var1 == null) {
            hso_fl.bi = 0;
         } else if (var1.b()) {
            hso_fl.bi = 0;
         } else {
            if (var1.u == 9) {
               hso_ah.i = (hso_ea)var1;
               super.R = true;
            } else {
               super.R = false;
            }

            byte var2 = 0;
            super.bj = var1.k;
            super.bu = var1.J;
            super.bl = var1.l;
            super.bo = var1.n;
            super.bm = var1.m;
            super.bp = var1.g;
            super.br = var1.N;
            if (this.o) {
               c = null;
               this.t = 0;
               this.u = false;
               int var3;
               if ((var3 = hso_o.f.a(var1.g) + 8) < 40) {
                  var3 = 40;
               }

               super.bq = var3;
            }

            super.aY = null;
            int var4;
            if (hso_fl.aU > 0) {
               if (super.bj == null) {
                  var4 = var2 + 1;
               } else {
                  var4 = 0 + super.bj.length;
               }

               if (super.bl != null) {
                  var4 += super.bl.length;
               }

               if (var4 * hso_ft.ab > hso_fl.U) {
                  super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, var4 * hso_ft.ab - hso_fl.U + 4 * hso_ft.ab);
               } else {
                  if (hso_ft.A) {
                     super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, 4 * hso_ft.ab);
                  }

               }
            } else {
               if (super.bj == null) {
                  var4 = var2 + 1;
               } else {
                  var4 = 0 + super.bj.length;
               }

               if (super.bl != null) {
                  var4 += super.bl.length;
               }

               if (this.o) {
                  super.bt = this.s - (hso_ft.ab << 1) + hso_fl.aN / 2;
                  super.bk = null;
                  super.bj = null;
                  super.bl = null;
                  super.bs = this.r + this.p * hso_fl.aM / 2 - super.bq / 2;
               } else {
                  super.bt = this.l + this.j / this.f * hso_fl.aM - 9 - (var4 + 1) * hso_ft.ab;
                  super.bq = var1.s;
                  if (this.j % this.f < 2) {
                     super.bs = this.k + hso_fl.aM / 2 + this.j % this.f * hso_fl.aM;
                  } else if (this.j % this.f < 4) {
                     super.bs = this.k + hso_fl.aM / 2 + this.j % this.f * hso_fl.aM - 45;
                  } else {
                     super.bs = this.k + hso_fl.aM / 2 + this.j % this.f * hso_fl.aM - 90;
                  }
               }

               if (super.bt + hso_p.e.b < 2) {
                  super.bt = 2 - hso_p.e.b;
               }

               if ((var4 + 1) * hso_ft.ab > hso_fl.U) {
                  super.aY = new hso_bp(super.bs, super.bt, super.bq, hso_fl.U, 0, 0, (var4 + 1) * hso_ft.ab - hso_fl.U);
               }

            }
         }
      }
   }

   private void c(int var1) {
      this.n.d();

      for(int var2 = 0; var2 < hso_bw.V.c(); ++var2) {
         hso_bw var3;
         if ((var3 = (hso_bw)hso_bw.V.a(var2)).u == 3 && var3.R == var1 && (var3.M == GameScreen.f.bx || var3.M > 3)) {
            this.n.a(var3);
         }
      }

   }

   public final void e() {
      boolean var1 = false;
      byte var3;
      if (this.o) {
         if (super.aY != null && hso_ft.c(super.aY.c, super.aY.d, super.aY.a, super.aY.b)) {
            super.aY.a();
            var1 = true;
         }

         if (hso_ft.A && !var1) {
            this.E.b();
            hso_p.e.a = this.E.f;
         }

         if (hso_ft.S && !var1) {
            if (hso_ft.c(this.r, this.s, this.F * this.p, hso_fl.aM)) {
               if ((var3 = (byte)((hso_p.e.a + hso_ft.ae - this.r) / this.F)) >= 0 && var3 < this.n.c()) {
                  if (var3 == this.q) {
                     this.y.a();
                  } else {
                     this.q = var3;
                     hso_fl.bi = 0;
                  }

                  super.aY = null;
               }

               hso_ft.S = false;
            } else if (!hso_ft.c(0, hso_ft.X - hso_ft.aa, hso_ft.W, hso_ft.aa)) {
               this.z.a();
               hso_ft.S = false;
            }
         }
      } else {
         if (super.aY != null && hso_ft.c(super.aY.c, super.aY.d, super.aY.a, super.aY.b)) {
            super.aY.a();
            var1 = true;
         }

         if (hso_ft.b(this.k, this.l, this.F * this.f, this.F * this.g) && !var1) {
            hso_ft.S = false;
            if ((var3 = (byte)((hso_ft.ae - this.k) / this.F + (hso_ft.af - this.l) / this.F * this.f)) >= 0 && var3 < a) {
               if (var3 == this.j) {
                  this.x.a();
               } else {
                  this.j = var3;
                  hso_fl.bi = 0;
                  if (this.j >= 0) {
                     hso_bw var2;
                     if ((var2 = (hso_bw)hso_bw.U.a("" + (this.j + this.w))) != null) {
                        if (hso_fl.aU > 0) {
                           this.v = this.a(var2);
                           this.b(this.v);
                        }
                     } else if (this.w > 0) {
                        this.v = this.a(var2);
                        this.b(this.v);
                     }
                  }
               }

               super.aY = null;
               if (hso_fl.aO != 1) {
                  hso_fl.aO = 1;
               }
            }
         }
      }

      if (this.v != null) {
         for(int var5 = 0; var5 < this.v.c(); ++var5) {
            hso_bt var4;
            if ((var4 = (hso_bt)this.v.a(var5)) != null) {
               var4.b();
            }
         }
      }

      super.e();
   }

   private hso_es a(hso_bw var1) {
      hso_es var2 = new hso_es("TabMySeftNew menu");
      if (this.w <= 0) {
         var2.a(this.B);
         var2.a(this.D);
      } else if (this.w > 0) {
         var2.a(this.C);
      }

      if (var1 != null && var1.R == 14) {
         var2.a(this.A);
      }

      return var2;
   }
}
