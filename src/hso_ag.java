public final class hso_ag extends hso_p {
   private static hso_ag j;
   public hso_es a = new hso_es("List_server vecListServer");
   public static hso_es b = new hso_es("List_server vecMyFriend");
   public static boolean f;
   private int k;
   private int l;
   private int m;
   private int n = 50;
   private int o = 0;
   private int p;
   private int q;
   private int r = 0;
   private int s = 0;
   private int t;
   private int u;
   private hso_bt v;
   private hso_bt w;
   private hso_bt x;
   private hso_bt y;
   private hso_bt z;
   private hso_bt A;
   private hso_bt B;
   private hso_bt C;
   private hso_bt D;
   private hso_bt E;
   private hso_bt F;
   private hso_bt G;
   private hso_bt H;
   private hso_bt I;
   private hso_bt J;
   private hso_bp K;
   public String g;
   public byte h;
   public byte i;
   private byte[] L;
   private byte M;

   static {
      new hso_es("List_server vecMyFriend");
      f = false;
   }

   public static hso_ag b() {
      return j == null ? (j = new hso_ag()) : j;
   }

   public hso_ag() {
      int[][] var10000 = new int[][]{{6, 20}, {22, 18}, {38, 20}, {14, 8}, {30, 8}};
      this.L = new byte[]{0, 1, 2, 1};
      this.M = 0;
      this.y = new hso_bt(hso_df.Z, -1);
      this.v = new hso_bt(hso_df.bL, 1, this);
      this.w = new hso_bt(hso_df.X, 3, this);
      this.x = new hso_bt(hso_df.bK, 4, this);
      this.A = new hso_bt(hso_df.dk, 5, this);
      this.z = new hso_bt(hso_df.dl, 6, this);
      this.B = new hso_bt(hso_df.U, 0, this);
      this.C = new hso_bt(hso_df.U, 2, this);
      this.D = new hso_bt(hso_df.eM, 7, this);
      this.E = new hso_bt(hso_df.eS, 8, this);
      this.F = new hso_bt(hso_df.bK, 10, this);
      this.G = new hso_bt(hso_df.eG, 11, this);
      this.H = new hso_bt(hso_df.fa, 12, this);
      this.I = new hso_bt(hso_df.fe, 13, this);
      this.J = new hso_bt(hso_df.es, 14, this);
   }

   public final void g() {
      this.y.a = hso_df.Z;
      this.v.a = hso_df.bL;
      this.w.a = hso_df.X;
      this.x.a = hso_df.bK;
      this.A.a = hso_df.dk;
      this.z.a = hso_df.dl;
      this.B.a = hso_df.U;
      this.C.a = hso_df.U;
      this.D.a = hso_df.eM;
      this.E.a = hso_df.eS;
      this.F.a = hso_df.bK;
      this.G.a = hso_df.eG;
      this.H.a = hso_df.fa;
      this.I.a = hso_df.fe;
      this.J.a = hso_df.es;
   }

   public final void c() {
      this.a(hso_ft.a);
   }

   public final void a(byte var1) {
      this.i = var1;
      this.n = 50;
      if (this.i == 2) {
         this.n = 70;
      }

      this.t = hso_ft.W / 4 * 3;
      this.u = hso_ft.X / 5 << 2;
      if (this.t < 160) {
         this.t = 160;
      } else if (this.t > 280) {
         this.t = 280;
      }

      if (this.u < 210) {
         this.u = 210;
      } else if (this.u > 280) {
         this.u = 280;
      }

      this.r = hso_ft.Y - this.t / 2;
      this.s = hso_ft.Z - this.u / 2;
      this.k = 0;
      this.o = (this.u - hso_ft.aa) / this.n + 3;
      if (this.a.c() > 0) {
         this.i();
         hso_p.e.a(0, this.a.c() * this.n - this.u + hso_ft.aa + 10, 0, 0);
         this.K = new hso_bp(this.r, this.s, this.t, this.u, this.n, 0, hso_p.e.f);
         this.p = 0;
         this.q = this.o;
         if (this.q > this.a.c()) {
            this.q = this.a.c();
         }

         this.j();
      }

      if (hso_ft.A) {
         this.y.a(this.r + this.t - 12, this.s + 10, hso_cf.t, "");
      }

      super.Z = this.y;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
      case -1:
         if (super.c == hso_ft.u) {
            super.c.a(super.c.c);
         } else {
            super.c.c();
         }
      default:
         super.b(var1, var2);
      }
   }

   public final void a(int var1, int var2) {
      MainObject var3;
      hso_em var4;
      MainObject var5;
      hso_es var7;
      switch(var1) {
      case 0:
         var5 = (MainObject)b.a(this.k);
         Service.a().a((byte)3, (String)var5.cB);
         b.b(this.k);
         if (this.k > 0) {
            --this.k;
         }

         if (b.c() == 0) {
            super.Y = null;
            super.aa = null;
         }

         hso_ft.j();
         return;
      case 1:
         if ((var3 = (MainObject)this.a.a(this.k)) != null && var3.bD != -1) {
            hso_ft.g.a(var3.cB, "", "", (byte)0, true);
            hso_ft.h();
            return;
         }
         break;
      case 2:
         hso_ft.c(hso_df.bb, this.B);
         return;
      case 3:
         if (this.i != 1 && this.i != 0 && this.i != 6) {
            if (this.i != 5 && this.i != 4) {
               if (this.i == 3) {
                  if (this.k >= 0 && this.k < this.a.c() && ((hso_em)this.a.a(this.k)).k != -1) {
                     (var7 = new hso_es("List_server menu2")).a(this.F);
                     var7.a(this.G);
                     hso_ft.o.a(var7, 2, hso_df.eE, false, (hso_es)null);
                  }

                  return;
               }
               break;
            }

            if (this.k >= 0 && this.k < this.a.c() && (var5 = (MainObject)this.a.a(this.k)).cB.compareTo(GameScreen.f.cB) != 0) {
               var7 = new hso_es("List_server menu3");
               if (this.i == 4) {
                  if (GameScreen.f.cO.o >= 125) {
                     var7.a(this.D);
                     if (GameScreen.f.cO.o >= 126) {
                        var7.a(this.E);
                     }
                  }

                  var7.a(this.H);
               }

               if (var5 != null && var5.cw == 1 && var5.bD != -1 && var5.cB.compareTo(GameScreen.f.cB) != 0) {
                  var7.a(this.x);
                  var7.a(this.v);
               }

               hso_ft.o.a(var7, 2, hso_df.cW, false, (hso_es)null);
            }

            return;
         }

         hso_es var6 = new hso_es("List_server menu");
         if (this.i == 0) {
            var6.a(this.v);
            var6.a(this.C);
            var6.a(this.I);
         }

         MainObject var8;
         if (this.i != 6 && this.k >= 0 && this.k < this.a.c() && (var8 = (MainObject)this.a.a(this.k)) != null && var8.cw == 1 && var8.bD != -1 && var8.cB.compareTo(GameScreen.f.cB) != 0) {
            var6.a(this.x);
         }

         if (this.i == 6 && (var8 = (MainObject)this.a.a(this.k)) != null && var8.bD != -1 && var8.cB.compareTo(GameScreen.f.cB) != 0) {
            var6.a(this.x);
            var6.a(this.J);
         }

         if (this.h != 99) {
            if (this.h != 0) {
               this.A.a = hso_df.dk + hso_ak.e(this.h);
               var6.a(this.A);
            }

            if (this.h >= 0) {
               this.z.a = hso_df.dl + (this.h + 2);
               var6.a(this.z);
            }
         }

         hso_ft.o.a(var6, 2, hso_df.cF, false, (hso_es)null);
         return;
      case 4:
         if (this.k >= 0 && this.k < this.a.c()) {
            if ((var5 = (MainObject)this.a.a(this.k)) != null && var5.bD != -1) {
               if (this.i == 6) {
                  Service.a().a(var5.cB, hso_fw.h);
                  return;
               }

               Service.a().a((String)var5.cB, (byte)0);
               return;
            }
            break;
         }

         return;
      case 5:
         Service.a().e((byte)(hso_ak.e(this.h) - 1));
         hso_ft.a(hso_df.aG, new hso_bt(hso_df.as, -1));
         return;
      case 6:
         Service.a().e((byte)hso_ak.e(this.h + 1));
         hso_ft.a(hso_df.aG, new hso_bt(hso_df.as, -1));
         return;
      case 7:
         if (this.k >= 0 && this.k < this.a.c() && (var5 = (MainObject)this.a.a(this.k)) != null) {
            var7 = new hso_es("List_server menu4");
            if (GameScreen.f.cO.o == 127) {
               var7.a(new hso_bt(hso_df.gw[1], 9, 126, this));
            }

            if (GameScreen.f.cO.o >= 126) {
               var7.a(new hso_bt(hso_df.gw[2], 9, 125, this));
            }

            if (GameScreen.f.cO.o >= 125) {
               var7.a(new hso_bt(hso_df.gw[3], 9, 124, this));
               var7.a(new hso_bt(hso_df.gw[4], 9, 123, this));
               var7.a(new hso_bt(hso_df.gw[5], 9, 122, this));
            }

            hso_ft.o.a(var7, 2, var5.cB, false, (hso_es)null);
         }

         return;
      case 8:
         if ((var3 = (MainObject)this.a.a(this.k)) != null) {
            Service.a().f((byte)18, var3.cB);
            return;
         }
         break;
      case 9:
         if ((var3 = (MainObject)this.a.a(this.k)) != null) {
            Service.a().a((byte)4, (byte)((byte)var2), (String)var3.cB);
         }

         hso_ft.a(hso_df.aG);
         return;
      case 10:
         if ((var4 = (hso_em)this.a.a(this.k)) != null && var4.k != -1) {
            Service.a().b((byte)15, (int)var4.b);
            hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
            return;
         }
         break;
      case 11:
         if ((var4 = (hso_em)this.a.a(this.k)) != null && var4.k != -1) {
            Service.a().b((byte)13, (int)var4.b);
            hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
            return;
         }
         break;
      case 12:
         if ((var3 = (MainObject)this.a.a(this.k)) != null) {
            Service.a().e((byte)14, var3.cB);
            hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
            return;
         }
         break;
      case 13:
         Service.a().a((byte)4, (String)"");
         hso_ft.a(hso_df.aG, new hso_bt(hso_df.as, -1));
         return;
      case 14:
         if (this.k < 0 || this.k >= this.a.c()) {
            return;
         }

         if ((var3 = (MainObject)this.a.a(this.k)) != null && var3.bD != -1) {
            Service.a().h((byte)0, var3.cB);
         }
      }

   }

   public final void a(mGraphics var1) {
      if (super.c != null) {
         super.c.a(var1);
      }

      if (hso_ft.a == this) {
         hso_ft.a(var1);
         hso_cg.a(var1, this.r, this.s, this.t, this.u, this.g);
         var1.a(this.r, this.s + hso_ft.aa);
         var1.d(3, 0, this.t, this.u - hso_ft.aa);
         if (this.a != null) {
            if (this.a.c() > 0) {
               if (this.i == 3) {
                  boolean var4 = true;
                  mGraphics var3 = var1;
                  hso_ag var2 = this;
                  var1.a(-6517641);
                  var1.c(3, -hso_p.e.b + 5 + this.k * this.n + 1, this.t - 6, this.n - 1);
                  var1.a(0, -hso_p.e.b);
                  int var9 = 5 + this.p * this.n;

                  for(int var5 = this.p; var5 < var2.q; ++var5) {
                     hso_em var6;
                     if ((var6 = (hso_em)var2.a.a(var5)).k == -1) {
                        hso_o.f.a(var3, var6.c, 20, var9 + 5, 0, true);
                        var9 += var2.n;
                     } else {
                        hso_fd var7;
                        if ((var7 = hso_bk.i(var6.a)).a != null) {
                           if (aq.b(var7.a.a) / 18 == 3) {
                              if (hso_ft.ai % 6 == 0) {
                                 int var8;
                                 if ((var8 = var2.L.length) == 0) {
                                    var8 = 1;
                                 }

                                 var2.M = (byte)((var2.M + 1) % var8);
                              }

                              var3.a(var7.a, 0, var2.L[var2.M] * 18, 18, 18, 0, 9, var9 + 11, 3);
                           } else {
                              var3.a(var7.a, 9, var9 + 11, 3);
                           }
                        }

                        if (GameScreen.f.cO != null && GameScreen.f.cO.c.compareTo(var6.c) == 0) {
                           hso_cg.a(var3, var6.c + " - " + var6.d, 20, var9 + 5, 0);
                        } else {
                           hso_o.f.a(var3, var6.c + " - " + var6.d, 20, var9 + 5, 0, true);
                        }

                        hso_o.j.a(var3, var6.e, 10, var9 + 20, 0, true);
                        if (var6.k < 4) {
                           hso_o.f.a(var3, hso_df.dM + " " + hso_df.gv[var6.k], 10, var9 + 35, 0, true);
                        } else {
                           hso_o.j.a(var3, hso_df.dM + " " + (var6.k + 1), 10, var9 + 35, 0, true);
                        }

                        var9 += var2.n;
                        if (var5 < var2.a.c() - 1) {
                           var3.a(hso_cg.aL[4]);
                           var3.c(4, var9, var2.t - 8, 1);
                        }
                     }
                  }
               } else {
                  this.a(var1, 5);
               }
            } else if (this.i == 0) {
               hso_o.j.a(var1, hso_df.be, this.t / 2, 5, 2, true);
            } else {
               hso_o.j.a(var1, hso_df.dm, this.t / 2, 5, 2, true);
            }

            if (!hso_ft.o.a && hso_ft.r == null && hso_ft.a == this && !hso_d.b && hso_ft.s == null) {
               super.a(var1);
            }

         }
      }
   }

   private void a(mGraphics var1, int var2) {
      var1.a(-6517641);
      var1.c(3, -hso_p.e.b + 5 + this.k * this.n + 1, this.t - 6, this.n - 1);
      var1.a(0, -hso_p.e.b);
      var2 = 5 + this.p * this.n;

      for(int var3 = this.p; var3 < this.q; ++var3) {
         if (var3 >= 0 && var3 < this.a.c()) {
            MainObject var4;
            if ((var4 = (MainObject)this.a.a(var3)).bD == -1) {
               var4.h(var1, 50, var2 + 5);
               var2 += this.n;
               if (var3 < this.a.c() - 1) {
                  var1.a(hso_cg.aL[4]);
                  var1.c(4, var2, this.t - 8, 1);
               }
            } else {
               var4.b(var1, 20, var2 + 40, 0);
               int var7 = var2 + 10;
               boolean var5 = true;
               byte var6 = var4.cw;
               byte var8 = 0;
               if (var6 == 0) {
                  var8 = 2;
               }

               hso_cf.s.b(var8, 40, var7, 0, 3, var1);
               if (var4.cB.compareTo(GameScreen.f.cB) == 0) {
                  String var9 = var4.c(" - ");
                  byte var11 = 0;
                  if (var4.cO != null) {
                     var11 = 16;
                     var4.a(var1, 59, var2 + 5 + 6, -1);
                  }

                  hso_cg.a(var1, var9, var11 + 50, var2 + 5, 0, (int)0);
               } else {
                  var4.h(var1, 50, var2 + 5);
               }

               int var10 = 40;
               if (var3 == this.k) {
                  var1.d(35, hso_p.e.b, this.t - 40, this.u - hso_ft.aa);
                  var10 = 40 - this.l;
               }

               if (this.i == 6) {
                  if (var4.bD < 4) {
                     hso_o.f.a(var1, hso_df.dM + " " + hso_df.gv[var4.bD], var10, var2 + 35, 0, true);
                  } else {
                     hso_o.j.a(var1, hso_df.dM + " " + (var4.bD + 1), var10, var2 + 35, 0, true);
                  }

                  hso_o.j.a(var1, var4.cD, var10, var2 + 20, 0, true);
               } else {
                  if (this.i != 4 && this.i != 5) {
                     hso_o.j.a(var1, var4.cD, var10, var2 + 20, 0, true);
                  } else {
                     hso_o.j.a(var1, hso_df.ac + var4.by, var10, var2 + 20, 0, true);
                     hso_o.j.a(var1, hso_em.a(var4.cO.o), var10, var2 + 35, 0, true);
                  }

                  if (this.i == 1) {
                     if (var4.bD < 4) {
                        hso_o.f.a(var1, hso_df.dM + " " + hso_df.gv[var4.bD], var10, var2 + 35, 0, true);
                     } else {
                        hso_o.j.a(var1, hso_df.dM + " " + (var4.bD + 1), var10, var2 + 35, 0, true);
                     }
                  }
               }

               if (var3 == this.k) {
                  var1.d(5, hso_p.e.b, this.t - 10, this.u - hso_ft.aa);
               }

               var2 += this.n;
               if (var3 < this.a.c() - 1) {
                  var1.a(hso_cg.aL[4]);
                  var1.c(4, var2, this.t - 8, 1);
               }
            }
         }
      }

   }

   public final void a() {
      super.c.a();
      if (this.m > 0) {
         this.l += 2;
         if (this.l > this.m) {
            this.l = 0;
         }
      }

      if (this.a.c() > 0) {
         if (hso_ft.A && this.K != null) {
            this.K.c();
         } else {
            hso_p.e.a();
         }

         if (hso_p.e.b != hso_p.e.d) {
            this.h();
            return;
         }
      } else if (super.aa != null || super.Y != null) {
         super.aa = null;
         super.Y = null;
      }

   }

   public final void d() {
      if (this.a.c() > 0) {
         int var1 = this.k;
         if (hso_ft.al[2]) {
            --this.k;
            hso_ft.d(2);
         } else if (hso_ft.al[8]) {
            ++this.k;
            hso_ft.d(8);
         }

         this.k = hso_cg.a(this.k, this.a.c() - 1, false);
         if (var1 != this.k) {
            this.i();
            hso_p.e.a(0, this.k * this.n - this.u / 2 + 40 + hso_ft.aa);
         }
      }

      super.d();
   }

   public final void e() {
      if (this.a.c() > 0) {
         if (hso_ft.b(this.r, this.s + hso_ft.aa, this.t, this.u - hso_ft.aa)) {
            int var1;
            if ((var1 = (hso_p.e.b + hso_ft.af - this.s - hso_ft.aa) / this.n) >= 0 && var1 < this.a.c()) {
               hso_ft.S = false;
               if (var1 == this.k) {
                  this.w.a();
               } else {
                  this.k = var1;
                  this.i();
               }
            } else {
               this.k = 0;
            }

            hso_ft.S = false;
         }

         if (hso_ft.A && this.K != null) {
            this.K.a();
            hso_p.e.b = this.K.f;
         }
      }

      super.e();
   }

   public final void h() {
      this.p = hso_p.e.b / this.n - 1;
      if (this.p < 0) {
         this.p = 0;
      }

      this.q = this.p + this.o;
      if (this.q > this.a.c()) {
         this.q = this.a.c();
         this.p = this.q - this.o;
         if (this.p < 0) {
            this.p = 0;
         }
      }

   }

   public final void i() {
      if (this.a != null && this.k != -1 && this.k <= this.a.c() - 1) {
         this.l = 0;
         String var1 = "";
         byte var2 = 40;
         if (this.i == 3) {
            hso_em var3;
            if ((var3 = (hso_em)this.a.a(this.k)).k != -1) {
               var1 = var3.e;
            }

            var2 = 20;
         } else {
            var1 = ((MainObject)this.a.a(this.k)).cD;
         }

         if (this.i == 2) {
            var2 = 50;
         }

         this.m = hso_o.i.a(var1) - (this.t - var2) + 5;
         if (this.m > 0) {
            this.m += 25;
         }

      }
   }

   public final void j() {
      if (this.a.c() > 0 && !hso_ft.A) {
         super.Y = this.w;
         if (this.i == 0) {
            super.aa = this.v;
         }
      }

   }

   public final void k() {
      hso_p.e.a(0, this.a.c() * this.n - this.u + hso_ft.aa + 10, 0, 0);
      this.K = new hso_bp(this.r, this.s, this.t, this.u, this.n, 0, hso_p.e.f);
   }
}
