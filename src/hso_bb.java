public final class hso_bb extends hso_fl {
   private int c;
   private int d;
   private int e = 12;
   private int f = 6;
   private int g = 6;
   private int h = 0;
   private int i;
   private int j;
   private int k;
   private int l;
   private static boolean m;
   private static boolean n;
   private boolean o;
   private boolean p;
   public static boolean a;
   private hso_cp[] q;
   private hso_cp[] r;
   private hso_cp[] s;
   private hso_cp t;
   private static hso_bt u;
   private static hso_bt v;
   private static hso_bt w;
   private static hso_bt x;
   private static hso_bt y;
   private static hso_es z = new hso_es("TabLottery vecListCmd");
   private hso_es A = new hso_es("TabLottery vecEffEnd");
   private hso_es B = new hso_es("TabLottery vecRewardList");
   private int[] C = new int[]{-1, -1, -1, -1};
   private hso_cp D;
   private hso_cp E;
   private hso_cp F;
   private hso_cp G;
   private float H;
   private float I;
   private float J;
   private static byte bv;
   private static byte bw;
   private int bx;
   private hso_bp by;
   public static boolean b;

   public static void a(byte var0) {
      bv = 1;
      f();
   }

   public static void b(byte var0) {
      bw = var0;
   }

   private static void f() {
      if (hso_ft.A) {
         z.d();
         if (bv == 0) {
            z.a(v);
            return;
         }

         if (m) {
            z.a(w);
            z.a(x);
            return;
         }

         if (!n) {
            z.a(u);
         }
      }

   }

   public hso_bb(String var1, hso_es var2, byte var3) {
      super.X = var1;
      m = false;
      n = false;
      this.o = false;
      a = false;
      this.p = true;
      b = false;
      this.i = 0;
      this.H = 0.0F;
      this.I = 1.0F;
      this.J = 1.0F;
      this.j = -1;
      this.k = -1;
      this.bx = -1;
      bw = -1;
      this.B = var2;
      bv = 0;
      super.K = 0;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      this.c = (hso_fl.S - 8) / 32;
      this.d = (hso_fl.T - 8) / 32;
      this.s = new hso_cp[5];
      this.s[0] = new hso_cp((float)(super.V + hso_fl.S / 2 - 52), (float)(super.W + hso_fl.T / 2 - 16));
      this.s[1] = new hso_cp((float)(super.V + hso_fl.S / 2 - 32), (float)(super.W + hso_fl.T / 2 + 45));
      this.s[2] = new hso_cp((float)(super.V + hso_fl.S / 2 + 32), (float)(super.W + hso_fl.T / 2 + 45));
      this.s[3] = new hso_cp((float)(super.V + hso_fl.S / 2 + 52), (float)(super.W + hso_fl.T / 2 - 16));
      this.s[4] = new hso_cp((float)(super.V + hso_fl.S / 2), (float)(super.W + hso_fl.T / 2 - 52));
      this.q = new hso_cp[5];
      this.q[0] = new hso_cp((float)(super.V + hso_fl.S / 2 - 52), (float)(super.W + hso_fl.T / 2 - 16));
      this.q[1] = new hso_cp((float)(super.V + hso_fl.S / 2 - 32), (float)(super.W + hso_fl.T / 2 + 45));
      this.q[2] = new hso_cp((float)(super.V + hso_fl.S / 2 + 32), (float)(super.W + hso_fl.T / 2 + 45));
      this.q[3] = new hso_cp((float)(super.V + hso_fl.S / 2 + 52), (float)(super.W + hso_fl.T / 2 - 16));
      this.q[4] = new hso_cp((float)(super.V + hso_fl.S / 2), (float)(super.W + hso_fl.T / 2 - 52));
      this.r = new hso_cp[5];
      this.r[0] = new hso_cp((float)(super.V + hso_fl.S / 2 - 52), (float)(super.W + hso_fl.T / 2 - 16));
      this.r[1] = new hso_cp((float)(super.V + hso_fl.S / 2 - 32), (float)(super.W + hso_fl.T / 2 + 45));
      this.r[2] = new hso_cp((float)(super.V + hso_fl.S / 2 + 32), (float)(super.W + hso_fl.T / 2 + 45));
      this.r[3] = new hso_cp((float)(super.V + hso_fl.S / 2 + 52), (float)(super.W + hso_fl.T / 2 - 16));
      this.r[4] = new hso_cp((float)(super.V + hso_fl.S / 2), (float)(super.W + hso_fl.T / 2 - 52));
      this.t = new hso_cp((float)(super.V + hso_fl.S / 2), (float)(super.W + hso_fl.T / 2));
      u = new hso_bt(hso_df.fU, 0, this);
      v = new hso_bt(hso_df.Y, 1, this);
      w = new hso_bt(hso_df.fW, 2, this);
      x = new hso_bt(hso_df.fV, 4, this);
      y = new hso_bt(hso_df.Y, 3, this);
      super.aT = new hso_bt(hso_df.af, -1, this);
      if (hso_ft.A) {
         super.aT.a = hso_df.Z;
      }

      if (hso_fl.aU > 0) {
         int var4 = hso_fl.aW + super.N;
         int var5 = hso_fl.aV;
         if (hso_fl.aZ) {
            u.a(var5 + hso_fl.aU / 2, var4 - 10, hso_cf.v, u.a);
            v.a(var5 + hso_fl.aU / 2, var4 - 10, hso_cf.v, v.a);
            w.a(var5 + hso_fl.aU / 2 - 30, var4 - 10, hso_cf.v, w.a);
            x.a(var5 + hso_fl.aU / 2 + 30, var4 - 10, hso_cf.v, x.a);
         } else {
            u.a(var5 + hso_fl.aU / 2, var4 - 15, (hso_ce)null, u.a);
            v.a(var5 + hso_fl.aU / 2, var4 - 15, (hso_ce)null, v.a);
            w.a(var5 + hso_fl.aU / 2 - 42, var4 - 15, (hso_ce)null, w.a);
            x.a(var5 + hso_fl.aU / 2 + 42, var4 - 15, (hso_ce)null, x.a);
         }
      } else if (hso_ft.A) {
         u.a(hso_bt.j / 2 + 2,  hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, u.a);
         v.a(hso_bt.j / 2 + 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, v.a);
         w.a(hso_bt.j / 2 + 2 - 42, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, w.a);
         x.a(hso_bt.j / 2 + 2 + 42, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, x.a);
      }

      this.b();
   }

   public final void b() {
      this.by = new hso_bp(super.V, super.W, hso_fl.S, hso_fl.T, 0, 0, hso_p.e.f);
      f();
      if (!hso_ft.A) {
         super.aa = v;
         super.Z = super.aT;
      }

      this.A.d();
      super.ba = aq.a("/interface/rebuild.img");
   }

   public final void a(mGraphics var1) {
      hso_bb var8;
      if (bv == 0) {
         var1 = var1;
         var8 = this;

         try {
            hso_ft.a(var1);
            var1.d(var8.V - hso_fl.aN, var8.W, hso_fl.S + (hso_fl.aN << 1), hso_fl.T - hso_fl.aN / 2 + 1);
            var1.a(-hso_p.e.a, -hso_p.e.b);

            int var2;
            for(var2 = 0; var2 < var8.B.c(); ++var2) {
               hso_bw var3;
               if ((var3 = (hso_bw)var8.B.a(var2)) != null) {
                  if (var3.u == 7) {
                     hso_j var4;
                     if ((var4 = hso_bw.b(var3.O)) != null) {
                        var3.a(var4.g, var4.t, 7, var4.q, var4.Q, var4.h, (short)var4.P, var4.A, var4.x, var4.y);
                        var3.a(var1, var8.V + hso_fl.aM / 2 + var2 % var8.f * hso_fl.aM, var8.W + hso_fl.aM / 2 + var2 / var8.f * hso_fl.aM, hso_fl.aM, 0, 0);
                        if (var3.p > 0) {
                           var1.a(hso_cg.am, 0, 0, hso_fl.aM - 1, hso_fl.aM - 1, 0, var8.V + hso_fl.aM / 2 + var2 % var8.f * hso_fl.aM, var8.W + hso_fl.aM / 2 + var2 / var8.f * hso_fl.aM, 3);
                        }
                     } else {
                        hso_bw.c(var3.O);
                     }
                  } else {
                     var3.a(var1, var8.V + hso_fl.aM / 2 + var2 % var8.f * hso_fl.aM, var8.W + hso_fl.aM / 2 + var2 / var8.f * hso_fl.aM, hso_fl.aM, 0, 0);
                     if (var3.p > 0) {
                        var1.a(hso_cg.am, 0, 0, hso_fl.aM - 1, hso_fl.aM - 1, 0, var8.V + hso_fl.aM / 2 + var2 % var8.f * hso_fl.aM, var8.W + hso_fl.aM / 2 + var2 / var8.f * hso_fl.aM, 3);
                     }
                  }
               }
            }

            var1.a(hso_fl.bf[1]);
            var1.b(var8.V, var8.W, hso_fl.S, hso_fl.aM * var8.g);

            for(var2 = 0; var2 < var8.f / 2; ++var2) {
               var1.b(var8.V + hso_fl.aM + (var2 * hso_fl.aM << 1), var8.W, hso_fl.aM, hso_fl.aM * var8.g);
            }

            for(var2 = 0; var2 < var8.g / 2; ++var2) {
               var1.b(var8.V, var8.W + hso_fl.aM + (var2 * hso_fl.aM << 1), hso_fl.S, hso_fl.aM);
            }

            if (var8.l > -1 && hso_fl.aO == 1) {
               var1.a(hso_fl.bf[2]);
               var1.b(var8.V + var8.l % var8.f * hso_fl.aM + 1, var8.W + var8.l / var8.f * hso_fl.aM + 1, hso_fl.aM - 2, hso_fl.aM - 2);
               var1.a(hso_fl.bf[3]);
               var1.b(var8.V + var8.l % var8.f * hso_fl.aM, var8.W + var8.l / var8.f * hso_fl.aM, hso_fl.aM, hso_fl.aM);
            }

            if (hso_ft.o.a || hso_ft.r != null || hso_ft.s != null || hso_fl.aO != 1 || hso_fl.bi <= hso_fl.aX) {
               return;
            }

            var8.a(var1, false);
            if (z == null) {
               return;
            }

            for(var2 = 0; var2 < z.c(); ++var2) {
               hso_bt var9;
               (var9 = (hso_bt)z.a(var2)).a(var1, var9.h, var9.i);
            }
         } catch (Exception var7) {
            return;
         }
      } else if (bv == 1) {
         var1 = var1;
         var8 = this;

         try {
            var1.c(var8.V + 2, var8.W + 2, hso_fl.S - 4, hso_fl.T - 4);
            if (hso_ft.B) {
               hso_fl.c(var1, var8.V + 4, var8.W + 4, hso_fl.S - 8, hso_fl.T - 8, 4);
            } else {
               mGraphics var10 = var1;
               hso_bb var13 = var8;

               for(int var12 = 0; var12 <= var13.c; ++var12) {
                  for(int var5 = 0; var5 <= var13.d; ++var5) {
                     var13.e = 12;
                     if (var5 == 0) {
                        var13.e = 12;
                     }

                     if (var12 == var13.c) {
                        if (var5 == var13.d) {
                           var10.a(hso_fl.aP[var13.e], var13.V + 4 + (hso_fl.S - 8) - 32, var13.W + 4 + hso_fl.T - 8 - 32, 0);
                        } else {
                           var10.a(hso_fl.aP[var13.e], var13.V + 4 + (hso_fl.S - 8) - 32, var13.W + 4 + (var5 << 5), 0);
                        }
                     } else if (var5 == var13.d) {
                        var10.a(hso_fl.aP[var13.e], var13.V + 4 + (var12 << 5), var13.W + 4 + hso_fl.T - 8 - 32, 0);
                     } else {
                        var10.a(hso_fl.aP[var13.e], var13.V + 4 + (var12 << 5), var13.W + 4 + (var5 << 5), 0);
                     }
                  }
               }
            }

            var1.a(var8.ba, var8.V + hso_fl.S / 2 - 54, var8.W + hso_fl.T / 2 - 52, 0);
            var1.a(var8.ba, 0, 0, 54, 105, 2, var8.V + hso_fl.S / 2, var8.W + hso_fl.T / 2 - 52, 0);
            hso_bw var14 = (hso_bw)var8.B.a(var8.l);
            if (!a && var14 != null) {
               var1.a(hso_cg.ap, (int)var8.t.a, (int)var8.t.b, 3);
               var14.a(var1, (int)var8.t.a, (int)var8.t.b, 20, 0, 0);
            }

            int var11;
            for(var11 = 0; var11 < var8.r.length; ++var11) {
               if (var8.bx == -1) {
                  var1.a(hso_cg.au, (int)var8.r[var11].a, (int)var8.r[var11].b, 3);
               } else if (b) {
                  if (bw == var11) {
                     var1.a(hso_cg.ap, (int)var8.s[var11].a, (int)var8.s[var11].b, 3);
                     var14.a(var1, (int)var8.s[var11].a, (int)var8.s[var11].b, 20, 0, 0);
                  } else {
                     var1.a(hso_cg.au, (int)var8.s[var11].a, (int)var8.s[var11].b, 3);
                  }
               } else if (bw == var11) {
                  var1.a(hso_cg.ap, (int)var8.s[var11].a, (int)var8.s[var11].b, 3);
                  var14.a(var1, (int)var8.s[var11].a, (int)var8.s[var11].b, 20, 0, 0);
               } else {
                  if (var8.bx == var11) {
                     continue;
                  }

                  var1.a(hso_cg.au, (int)var8.s[var11].a, (int)var8.s[var11].b, 3);
               }

               if (!hso_ft.A && var8.o && var8.k > -1) {
                  if (MainObject.ch == 0) {
                     MainObject.ch = aq.a(MainObject.da.a);
                     MainObject.ci = aq.b(MainObject.da.a) / 10;
                  }

                  var1.a(MainObject.da, 0, 0, MainObject.ch, MainObject.ci, 0, (int)var8.s[var8.k].a, (int)var8.s[var8.k].b - hso_ft.ai % 5 - 10, 3);
               }
            }

            for(var11 = 0; var11 < var8.A.c(); ++var11) {
               ((hso_dx)var8.A.a(var11)).a(var1);
            }

            if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && (hso_fl.aO == 1 || hso_fl.aU > 0) && z != null) {
               for(var11 = 0; var11 < z.c(); ++var11) {
                  hso_bt var15;
                  (var15 = (hso_bt)z.a(var11)).a(var1, var15.h, var15.i);
               }

               return;
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }

   }

   public final void a() {
      try {
         int var5;
         if (bv == 0) {
            if (hso_fl.aO != 1) {
               hso_fl.bi = 0;
               return;
            }

            if (super.aY != null) {
               super.aY.c();
            }

            if (hso_ft.A) {
               this.by.c();
            } else {
              hso_p.e.a();
            }

            hso_es var13;
            if ((var13 = this.B).c() == 0) {
               hso_fl.aO = 0;
               return;
            }

            int var11 = this.l;
            if (hso_fl.bi < hso_fl.aX + 2 && ++hso_fl.bi == hso_fl.aX) {
               hso_es var12 = this.B;
               super.bj = null;
               super.bk = null;
               super.bl = null;
               if (this.l < var12.c() && this.l >= 0) {
                  hso_bw var14;
                  if ((var14 = (hso_bw)var12.a(this.l)).b()) {
                     hso_fl.bi = 0;
                  } else {
                     if (var14.u == 9) {
                        hso_ah.i = (hso_ea)var14;
                        super.R = true;
                     } else {
                        super.R = false;
                     }

                     super.bp = var14.g;
                     super.br = var14.N;
                     if (var14.u == 3 || super.K == 8) {
                        super.bl = var14.l;
                        super.bo = var14.n;
                     }

                     super.aY = null;
                     if (hso_fl.aU > 0) {
                        var5 = 1;
                        super.bj = var14.k;
                        super.bm = var14.m;
                        if (var14.k != null) {
                           var5 = 1 + super.bj.length;
                        }

                        if (var14.l != null) {
                           var5 += var14.l.length;
                        }

                        if (var5 * hso_ft.ab > hso_fl.U) {
                           super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, var5 * hso_ft.ab - hso_fl.U);
                        } else if (hso_ft.A) {
                           super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, 0);
                        }
                     } else {
                        super.bq = var14.s;
                        this.a(var14);
                        if (this.l % this.f < 2) {
                           super.bs = super.V + hso_fl.aM / 2 + this.l % this.f * hso_fl.aM;
                        } else if (this.l % this.f < 5) {
                           super.bs = super.V + hso_fl.aM / 2 + this.l % this.f * hso_fl.aM - super.bq / 2;
                        } else {
                           super.bs = super.V + hso_fl.aM / 2 + this.l % this.f * hso_fl.aM - super.bq;
                        }
                     }
                  }
               } else {
                  if (this.l > var12.c() - 1) {
                     this.l = var12.c() - 1;
                  }

                  hso_fl.bi = 0;
               }
            }

            hso_bw var15;
            if (super.bj == null && var11 >= 0 && var11 < var13.c() && (var15 = (hso_bw)var13.a(var11)).u != 5) {
               if (var15.k == null) {
                  if (var15.o % 100 == 3) {
                     if (super.K == 0) {
                        Service.a().a((byte)0, (byte)((byte)var15.O));
                     }

                     ++var15.o;
                  } else {
                     ++var15.o;
                  }

                  return;
               }

               super.bj = var15.k;
               super.bm = var15.m;
               this.a(var15);
            }

            return;
         } else if (bv == 1) {
            int var1;
            for(var1 = 0; var1 < this.A.c(); ++var1) {
               hso_dx var2;
               (var2 = (hso_dx)this.A.a(var1)).a();
               if (var2.y) {
                  this.A.d(var2);
               }
            }

            if (this.j > -1) {
               hso_cx var7 = new hso_cx(34, (int)this.s[this.j].a, (int)this.s[this.j].b);
               this.A.a(var7);
               Service.a().d((byte)2, (byte)((byte)this.j));
               this.bx = this.j;
               this.j = -1;
               this.o = false;
               m = true;
               f();
            }

            if (!a) {
               hso_cp var8;
               (var8 = hso_cp.a(this.t, this.q[bw])).a();
               this.J += 0.5F;
               this.t.a(var8.a * this.J, var8.b * this.J);
               if (a(this.t, this.q[bw])) {
                  bw = -1;
                  a = true;
               }
            }

            if (this.i >= 30) {
               n = false;
            }

            if (n) {
               hso_ft.S = false;
               if (this.p) {
                  var1 = 0;
                  boolean var9 = false;
                  if (this.i > 16) {
                     var1 = hso_ak.c(0, 2);
                  }

                  byte var10;
                  if (var1 == 0) {
                     var10 = 2;
                  } else {
                     var10 = 4;
                  }

                  var1 = 0;

                  while(var1 < var10) {
                     boolean var3 = false;
                     int var4 = hso_ak.c(0, 5);

                     for(var5 = 0; var5 < this.C.length; ++var5) {
                        if (var4 == this.C[var5]) {
                           var3 = true;
                        }
                     }

                     if (!var3) {
                        this.C[var1] = var4;
                        ++var1;
                     }
                  }

                  this.D = hso_cp.a(this.r[this.C[0]], this.r[this.C[1]]);
                  this.E = hso_cp.a(this.r[this.C[1]], this.r[this.C[0]]);
                  this.D.a();
                  this.E.a();
                  if (this.C[2] > -1 && this.C[3] > -1) {
                     this.F = hso_cp.a(this.r[this.C[2]], this.r[this.C[3]]);
                     this.G = hso_cp.a(this.r[this.C[3]], this.r[this.C[2]]);
                     this.F.a();
                     this.G.a();
                  }

                  this.p = false;
                  this.H = (float)(this.i < 16 ? this.i : 16);
                  return;
               }

               if (this.H < 16.0F) {
                  this.H += this.I;
               }

               this.r[this.C[0]].a(this.D.a * this.H, this.D.b * this.H);
               this.r[this.C[1]].a(this.E.a * this.H, this.E.b * this.H);
               if (this.C[2] > -1 && this.C[3] > -1) {
                  this.r[this.C[2]].a(this.F.a * this.H, this.F.b * this.H);
                  this.r[this.C[3]].a(this.G.a * this.H, this.G.b * this.H);
               }

               if (a(this.r[this.C[0]], this.q[this.C[1]])) {
                  this.r[this.C[0]].a(this.q[this.C[1]]);
                  this.r[this.C[1]].a(this.q[this.C[0]]);
                  this.q[this.C[0]].a(this.r[this.C[0]]);
                  this.q[this.C[1]].a(this.r[this.C[1]]);
                  if (this.C[2] > -1 && this.C[3] > -1) {
                     this.r[this.C[2]].a(this.q[this.C[3]]);
                     this.r[this.C[3]].a(this.q[this.C[2]]);
                     this.q[this.C[2]].a(this.r[this.C[2]]);
                     this.q[this.C[3]].a(this.r[this.C[3]]);
                  }

                  if (this.i == 29) {
                     this.o = true;
                     this.k = 0;
                     if (!hso_ft.A) {
                        super.aa = y;
                     }
                  }

                  this.p = true;
                  ++this.i;

                  for(var1 = 0; var1 < this.C.length; ++var1) {
                     this.C[var1] = -1;
                  }

                  return;
               }
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   private void a(hso_bw var1) {
      int var2 = 0;
      if (hso_p.e.b > 0) {
         var2 = hso_p.e.b / hso_fl.aM;
      }

      int var3 = 1;
      super.bj = var1.k;
      super.bm = var1.m;
      if (var1.k != null) {
         var3 = 1 + super.bj.length;
      }

      if (var1.l != null) {
         var3 += var1.l.length;
      }

      if (this.l / this.f < var2 + 0) {
         super.bt = super.W + (this.l / this.f + 1) * hso_fl.aM + 2;
         if (super.bt - hso_p.e.b + (var3 + 1) * hso_ft.ab > hso_ft.X - (hso_ft.aa - 5)) {
            super.bt = hso_ft.X - (hso_ft.aa - 5) - ((var3 + 1) * hso_ft.ab - hso_p.e.b);
         }
      } else {
         super.bt = super.W + this.l / this.f * hso_fl.aM - 7 - var3 * hso_ft.ab - hso_p.e.b;
         if (super.bt - hso_p.e.b < 6) {
            super.bt = 6 + hso_p.e.b;
         }
      }

      if ((var3 + 1) * hso_ft.ab > hso_fl.U) {
         super.aY = new hso_bp(super.bs, super.bt, super.bq, hso_fl.U, 0, 0, (var3 + 1) * hso_ft.ab - hso_fl.U);
      }

   }

   public final void c() {
      hso_fl.aO = 0;
      super.c();
   }

   private static boolean a(hso_cp var0, hso_cp var1) {
      float var2 = var1.a - var0.a;
      float var3 = var1.b - var0.b;
      return hso_ak.a(var2 * var2 + var3 * var3) < 20.0F;
   }

   public final void d() {
      hso_es var1 = this.B;
      if (hso_fl.aO == 1) {
         int var2 = this.l;
         boolean var3 = false;
         if (bv == 1) {
            if (this.o) {
               if (hso_ft.al[4]) {
                  --this.k;
                  if (this.k < 0) {
                     this.k = 4;
                  }

                  hso_ft.d(4);
               } else if (hso_ft.al[6]) {
                  ++this.k;
                  if (this.k > 4) {
                     this.k = 0;
                  }

                  hso_ft.d(6);
               }
            }
         } else {
            if (super.aY != null) {
               hso_bp var10000;
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
               this.l -= this.f;
               hso_ft.d(2);
               var3 = true;
            } else if (hso_ft.al[8]) {
               this.l += this.f;
               hso_ft.d(8);
               var3 = true;
            }

            if (hso_ft.al[4]) {
               if (this.l % this.f == 0) {
                  hso_fl.aO = 0;
               } else {
                  --this.l;
               }

               hso_ft.d(4);
               var3 = true;
            } else if (hso_ft.al[6]) {
               ++this.l;
               hso_ft.d(6);
               var3 = true;
            }

            if (var3) {
               super.aY = null;
               this.l = hso_cg.a(this.l, var1.c() - 1, false);
               hso_eu.f = 10;
            }

            if (var2 != this.l) {
               hso_p.e.a(0, (this.l / this.f - 1) * hso_fl.aM);
               hso_fl.bi = 0;
            }
         }
      }

      super.d();
   }

   public final void e() {
      int var1;
      int var2;
      if (bv == 1) {
         var1 = aq.a(hso_cg.au.a);
         var2 = aq.b(hso_cg.au.a);
         if (this.o) {
            for(int var3 = 0; var3 < this.q.length; ++var3) {
               if (hso_ft.b((int)this.s[var3].a - var1 / 2, (int)this.s[var3].b - var2 / 2, var1, var2)) {
                  this.j = var3;
                  hso_ft.S = false;
                  break;
               }
            }
         }
      } else if (bv == 0) {
         boolean var4 = false;
         if (super.aY != null && hso_ft.c(super.aY.c, super.aY.d, super.aY.a, super.aY.b)) {
            super.aY.a();
            var4 = true;
         }

         if (hso_ft.A && !var4) {
            this.by.a();
            hso_p.e.b = this.by.f;
         }

         if (hso_ft.b(super.V, super.W, this.f * hso_fl.aM, hso_fl.T - hso_fl.aN / 2) && !var4) {
            if ((var2 = (hso_ft.ae - super.V) / hso_fl.aM + (hso_ft.af - super.W + hso_p.e.b) / hso_fl.aM * this.f) >= 0 && var2 < this.B.c()) {
               hso_ft.S = false;
               hso_fl.bi = 0;
               this.l = var2;
               if (hso_fl.aO != 1) {
                  hso_fl.aO = 1;
               }
            } else {
               hso_fl.bi = 0;
               this.l = -1;
            }
         }
      }

      if (z != null && !hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && (hso_fl.aO == 1 || hso_fl.aU > 0)) {
         for(var1 = 0; var1 < z.c(); ++var1) {
            ((hso_bt)z.a(var1)).b();
         }
      }

      super.e();
   }

   public final void b(int var1, int var2) {
      super.b(var1, var2);
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case -1:
         if (m) {
            hso_ft.c.c();
         } else {
            this.c();
         }
         break;
      case 0:
         if (!n && !this.o) {
            n = true;
            this.i = 0;
            this.H = 0.0F;
            if (!hso_ft.A) {
               super.aa = null;
               super.Z = null;
               super.Y = null;
            }

            f();
            break;
         }

         return;
      case 1:
         if (!m) {
            Service.a().d((byte)1, (byte)((byte)this.l));
            if (!hso_ft.A) {
               super.aa = u;
               super.Z = null;
               super.Y = null;
            }
         }
         break;
      case 2:
         Service.a().d((byte)0, (byte)0);
         break;
      case 3:
         this.j = this.k;
         if (!hso_ft.A) {
            super.aa = x;
            super.Y = w;
            super.aT.a = hso_df.Z;
            super.Z = super.aT;
         }
         break;
      case 4:
         Service.a().d((byte)1, (byte)((byte)this.l));
         if (!hso_ft.A) {
            super.aa = u;
            super.Z = null;
            super.Y = null;
         }

         m = false;
         n = false;
         this.o = false;
         this.p = true;
         b = false;
         this.i = 0;
         this.j = -1;
         this.k = -1;
         this.bx = -1;
         bw = -1;
         this.J = 1.0F;
         this.t = new hso_cp((float)(super.V + hso_fl.S / 2), (float)(super.W + hso_fl.T / 2));
      }

      super.a(var1, var2);
   }
}
