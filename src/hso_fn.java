public final class hso_fn extends hso_fl {
   public static byte a = 0;
   public static byte b = 1;
   public static byte c = 2;
   public static byte d = 3;
   public static byte e = 4;
   public static byte f = 6;
   public static byte g = 7;
   public static byte h = 7;
   public static byte i = 8;
   public static byte j = 9;
   public static byte k = 11;
   public static byte l = 12;
   public static byte m = 13;
   public static byte n = 14;
   public static byte o = 15;
   public static byte p = 16;
   public static byte q = 17;
   public static byte r = 18;
   private static byte H = 0;
   private static byte I = 1;
   public static byte s = 2;
   private static byte J = 0;
   private static byte bv = 1;
   public static boolean t;
   public static short u;
   public static short v;
   public static short w;
   public static short x;
   public static short y = 1;
   public static short z;
   public static short A;
   public static short B = 0;
   public static boolean C = false;
   private int bw;
   private int bx = 6;
   private int by = 6;
   private int bz;
   private int bA = 60;
   private int bB = 0;
   private int bC = 0;
   private hso_dy bD;
   private String bE = "";
   private hso_es bF = new hso_es("TabShopNew vecShop");
   public hso_ea D = null;
   private byte bG;
   public static short E = 0;
   public boolean F = false;
   private byte bH;
   public static byte G;
   private hso_bt bI;
   private hso_bt bJ;
   private hso_bt bK;
   private hso_bt bL;
   private hso_bt bM;
   private hso_bt bN;
   private hso_bt bO;
   private hso_bt bP;
   private hso_bt bQ;
   private hso_bt bR;
   private hso_bt bS;
   private hso_bt bT;
   private hso_bt bU;
   private hso_bt bV;
   private hso_bt bW;
   private hso_bt bX;
   private hso_bt bY;
   private hso_bt bZ;
   private hso_bt ca;
   private hso_bt cb;
   private hso_bt cc;
   private hso_bt cd;
   private hso_bt ce;
   private hso_bt cf;
   private hso_bt cg;
   private hso_bt ch;
   private hso_bt ci;
   private hso_bt cj;
   private hso_bt ck;
   private hso_bt cl;
   private hso_bt cm;
   private hso_bt cn;
   private hso_bt co;
   private hso_bt cp;
   private hso_bt cq;
   private hso_bt cr;
   private hso_bt cs;
   private hso_bt ct;
   private hso_bt cu;
   private hso_bt cv;
   private hso_bt cw;
   private hso_bt cx;
   private hso_bt cy;
   private hso_bt cz;
   private hso_bt cA;
   private hso_bt cB;
   private hso_bt cC;
   private hso_bt cD;
   private hso_bt cE;
   private hso_dy cF;
   private hso_bp cG;
   private hso_es cH = new hso_es("list cmd");
   private byte cI = 0;
   private String cJ = "";
   private boolean cK;

   static {
      new hso_ek();
   }

   public hso_fn(hso_es var1, byte var2, String var3, int var4, byte var5) {
      super.K = var2;
      this.cK = false;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM + 1;
      this.bx = hso_fl.S / hso_fl.aM;
      this.bz = hso_fl.T / hso_fl.aM;
      this.bA = var1.c();
      if (this.bA % this.bx != 0) {
         this.bA += this.bx - this.bA % this.bx;
      }

      if (super.K != 0 && super.K != 16) {
          switch (super.K) {
              case 15:
                  this.bF = hso_bw.aa;
                  break;
              case 9:
                  this.bF = hso_bw.W;
                  if (this.bA < Player.y) {
                      this.bA = Player.y;
                  }     break;
              case 13:
                  this.bF = hso_bw.X;
                  if (this.bA < Player.z) {
                      this.bA = Player.y;
                  }     break;
              case 12:
                  this.bF = hso_bw.Y;
                  break;
              default:
                  this.bF = var1;
                  this.cK = true;
                  break;
          }
      } else {
         this.bF = hso_bw.V;
         if (this.bA < Player.x) {
            this.bA = Player.x;
         }
      }

      this.bA = 42;
      this.bH = 0;
      G = (byte)(Player.x / 42);
      if (super.K == 13) {
         G = (byte)(Player.z / 42);
      }

      if (this.cK) {
         this.bA = this.bF.c();
      }

      this.by = (this.bA - 1) / this.bx + 1;
      super.X = var3;
      this.bw = var4;
      this.cI = var5;
      if (var5 == l) {
         this.bG = 2;
      }

      if (var5 == m || var5 == p) {
         this.bG = 5;
      }

      if (var3 == null || var3.length() == 0) {
         super.X = "Name Tab";
      }

      this.bI = new hso_bt(hso_df.ak, 0, this);
      this.bJ = new hso_bt(hso_df.bj, 6, this);
      super.aT = new hso_bt(hso_df.af, -1, this);
      if (hso_ft.A) {
         super.aT.a = hso_df.Z;
      }

      this.bK = new hso_bt(hso_df.ak, 2, this);
      this.bL = new hso_bt(hso_df.ak, 3, this);
      this.bM = new hso_bt(hso_df.bN, 4, this);
      this.bN = new hso_bt(hso_df.bN, 5, this);
      this.bO = new hso_bt(hso_df.Y, 7, this);
      this.bP = new hso_bt(hso_df.aQ, 8, this);
      this.bQ = new hso_bt(hso_df.bE, 11, this);
      this.bR = new hso_bt(hso_df.bE, 10, this);
      this.bS = new hso_bt(hso_df.dR, 13, this);
      this.bT = new hso_bt(hso_df.dS, 14, this);
      this.bU = new hso_bt(hso_df.dR, 15, this);
      this.bV = new hso_bt(hso_df.dS, 16, this);
      this.bW = new hso_bt(hso_df.dV, 17, this);
      this.bX = new hso_bt(hso_df.eg, 20, this);
      this.bY = new hso_bt(hso_df.dR, 21, this);
      this.bZ = new hso_bt(hso_df.aa, 22, this);
      this.ca = new hso_bt(hso_df.fk, 23, this);
      this.cb = new hso_bt(hso_df.fx, 24, this);
      this.cc = new hso_bt(hso_df.fv, 3, this);
      this.cd = new hso_bt(hso_df.fR, 25, this);
      this.ce = new hso_bt(hso_df.bj, 26, this);
      this.cf = new hso_bt(hso_df.fI, 27, this);
      new hso_bt(hso_df.bK, 28, this);
      this.cg = new hso_bt(hso_df.fI, 29, this);
      this.ch = new hso_bt(hso_df.gd, 30, this);
      this.ci = new hso_bt(hso_df.ak + " 1", 31, this);
      this.cj = new hso_bt(hso_df.ak + " 10", 32, this);
      this.ck = new hso_bt(hso_df.ak + " 30", 33, this);
      this.cl = new hso_bt(hso_df.Q, 36, this);
      this.co = new hso_bt(hso_df.P, 37, this);
      this.cn = new hso_bt(hso_df.P, 38, this);
      this.cp = new hso_bt(hso_df.dR, 39, this);
      this.cq = new hso_bt(hso_df.J, 0, this);
      this.cm = new hso_bt(hso_df.I, 40, this);
      this.cr = new hso_bt(hso_df.C, 41, this);
      this.cs = new hso_bt(hso_df.C, 42, this);
      this.ct = new hso_bt(hso_df.y, 44, this);
      this.cu = new hso_bt(hso_df.y, 45, this);
      this.cv = new hso_bt(hso_df.ak, 46, this);
      this.cw = new hso_bt(hso_df.as, 47, this);
      this.cx = new hso_bt(hso_df.w, 48, this);
      this.cy = new hso_bt(hso_df.fr, 49, this);
      this.cz = new hso_bt(hso_df.s, 52, this);
      this.cA = new hso_bt(hso_df.dR, 53, this);
      this.cC = new hso_bt(hso_df.P, 54, this);
      this.cB = new hso_bt(hso_df.C, 55, this);
      this.cD = new hso_bt(hso_df.dx, 56, this);
      this.cE = new hso_bt(hso_df.d, 57, this);
      this.b();
   }

   public final void a(String var1) {
      this.cJ = var1;
      this.bI.a = var1;
      this.bL.a = var1;
   }

   public final void b() {
      if (hso_ft.A) {
         this.bB = -1;
      } else {
         this.bB = 0;
      }

      hso_fl.bi = 0;
      boolean var1 = false;
      int var2;
      if (super.K != 0 && super.K != 16) {
          switch (super.K) {
              case 15:
                  var2 = hso_bw.aa.c();
                  break;
              case 9:
                  var2 = hso_bw.W.c();
                  break;
              case 12:
                  var2 = hso_bw.Y.c();
                  break;
              case 13:
                  var2 = hso_bw.X.c();
                  break;
              default:
                  var2 = this.bF.c();
                  break;
          }
      } else {
         if (C) {
            hso_bw.V = hso_ak.e(hso_bw.V);
            C = false;
         }

         var2 = hso_bw.V.c();
      }

      hso_p.e.a(0, this.by * hso_fl.aM - hso_fl.T - hso_fl.aN + 8, 0, 0);
      this.cG = new hso_bp(super.V, super.W, hso_fl.S, hso_fl.T, 0, 0, hso_p.e.f);
      super.aY = null;
      if (var2 == 0) {
         hso_fl.aO = 0;
      } else if (!hso_ft.A) {
         if (super.K == 8) {
            if (this.cI == e) {
               super.aa = this.bO;
            } else if (this.cI == h) {
               super.aa = this.cc;
            } else {
               super.aa = this.bI;
            }
         } else if (super.K != 9 && super.K != 15) {
            if (super.K == 12) {
               if (hso_bw.Y.c() > 0) {
                  super.aa = this.bO;
               }
            } else if (super.K != 0 && super.K != 16) {
               if (super.K == 13 && hso_bw.X.c() > 0) {
                  super.aa = this.bO;
               }
            } else if (hso_bw.V.c() > 0) {
               super.aa = this.bO;
            }
         } else if (hso_bw.W.c() > 0) {
            super.aa = this.bO;
         }

         super.Z = super.aT;
      }

      this.bH = 0;
      super.b();
   }

   public final void c() {
      hso_fl.aO = 0;
      this.bB = 0;
      super.c();
   }

   public final void a(int var1, Object var2) {
      (new StringBuffer("commandPointer index = ")).append(var1).toString();
      hso_es var3;
      if (super.K == 15) {
         var3 = hso_bw.aa;
      } else if (super.K != 0 && super.K != 16) {
          switch (super.K) {
              case 9:
                  var3 = hso_bw.W;
                  break;
              case 13:
                  var3 = hso_bw.X;
                  break;
              case 12:
                  var3 = hso_bw.Y;
                  break;
              default:
                  var3 = this.bF;
                  break;
          }
      } else {
         var3 = hso_bw.V;
      }

      if (this.bB >= 0 || var1 <= 0) {
         if (hso_fl.aU == 0) {
            hso_fl.bi = 0;
         }

         switch(var1) {
         case 43:
            hso_j var6;
            if ((var6 = (hso_j)var3.a(this.bB)) != null) {
               hso_fh var7 = (hso_fh)var2;
               int var10 = 0;
               short var4 = 1;

               try {
                  if (var7 != null) {
                     var10 = var7.a;
                     var4 = var7.c;
                  }
               } catch (Exception var5) {
                  hso_ft.a(hso_df.z);
                  return;
               }

               short var8 = (short)var6.O;
               var7 = new hso_fh(var8, var10, var4, var6.u);
               hso_bw.ab.a(var7);
               hso_j var9;
             switch (var6.u) {
                 case 4:
                     (var9 = new hso_j()).O = var6.O;
                     var9.t = var6.t;
                     var9.g = var6.g;
                     var9.L = var6.L;
                     var9.K = var6.K;
                     var9.u = var6.u;
                     var9.q = var6.q;
                     var9.Q = var6.Q;
                     var9.x = var6.Q;
                     var9.y = var6.Q;
                     if (var6.h != null) {
                         var9.a(var6.h);
                     }  var6.C = 0;
                     var9.K = var4;
                     hso_bw.aa.a(var9);
                     break;
                 case 7:
                     (var9 = new hso_j()).g = var6.g;
                     var9.t = var6.t;
                     var9.O = var6.O;
                     var9.u = var6.u;
                     var9.q = var6.q;
                     var9.Q = var6.Q;
                     var9.P = var6.P;
                     var9.x = var6.x;
                     var9.y = var6.y;
                     var9.h = var6.h;
                     var9.A = var6.A;
                     if (var6.h != null) {
                         var9.a(var6.h);
                     }  var9.C = 2;
                     var9.K = var4;
                     hso_bw.aa.a(var9);
                     break;
                 default:
                     hso_bw.aa.a(var6);
                     break;
             }
            }

            if (this.cH != null) {
               this.cH.d();
            }

            hso_ft.j();
         case 41:
         case 42:
         default:
         }
      }
   }

   public final void a(int var1, int var2) {
      hso_es var3 = null;
      (new StringBuffer("commandPointer index = ")).append(var1).toString();
      if (super.K == 15) {
         var3 = hso_bw.aa;
      } else if (super.K != 0 && super.K != 16) {
          switch (super.K) {
              case 9:
                  var3 = hso_bw.W;
                  break;
              case 13:
                  var3 = hso_bw.X;
                  break;
              case 12:
                  var3 = hso_bw.Y;
                  break;
              default:
                  var3 = this.bF;
                  break;
          }
      } else {
         var3 = hso_bw.V;
      }

      if (this.bB >= 0 || var1 <= 0) {
         if (hso_fl.aU == 0) {
            hso_fl.bi = 0;
         }

         hso_j var11;
         String[] var12;
         hso_j var13;
         hso_es var15;
         hso_es var17;
         String var19;
         int var20;
         int var21;
         boolean var22;
         int var25;
         hso_j var29;
         hso_bt var31;
         hso_bw var34;
         switch(var1) {
         case -1:
            this.c();
            return;
         case 0:
            if ((var34 = (hso_bw)var3.a(this.bB)) == null || var34.b()) {
               return;
            }

            if (this.cI == o && (!hso_ft.A || hso_ft.A && hso_dw.g)) {
               this.cv.a();
               return;
            }

            if (var34.T != "") {
               hso_ft.c(var34.T, this.bL);
               return;
            }

            if (var34.u == 4 || var34.u == 7) {
               this.cF = new hso_dy();
               this.cF.a(hso_df.aK, this.bK, true, -1, var34.q, hso_df.aY, var34.e());
               hso_ft.r = this.cF;
               return;
            }

            if (var34.u == 3) {
               this.bL.a = hso_df.ak;
               hso_ft.c(hso_df.aF + "1 " + var34.g + ". " + hso_df.cy + var34.q + var34.e() + "?", this.bL);
               return;
            }

            if (var34.u == 6) {
               if (var34.q > 0L) {
                  this.bL.a = hso_df.ak;
                  hso_ft.c(hso_df.aF + var34.g + ". " + hso_df.cy + var34.q + var34.e() + "?", this.bL);
                  return;
               }

               if (var34.t == GameScreen.f.cb) {
                  hso_ft.a(hso_df.dJ);
                  return;
               }

               this.bL.a = hso_df.bj;
               hso_ft.c(hso_df.bi, this.bL);
               return;
            }

            if (var34.u == 8) {
               this.bL.a = hso_df.Y;
               hso_ft.c(hso_df.ex, this.bL);
               return;
            }
            break;
         case 1:
            if ((hso_bw)var3.a(this.bB) == null) {
               return;
            }

            hso_ft.c(hso_df.bi, new hso_bt(hso_df.bj, 6, this));
            return;
         case 2:
            if ((var13 = (hso_j)var3.a(this.bB)) == null) {
               return;
            }

            boolean var28 = false;

            try {
               var2 = Integer.parseInt(this.cF.a.j());
            } catch (Exception var10) {
               var2 = 1;
            }

            Service.a().a((byte)this.bw, (short)var13.O, (short)var2);
            hso_ft.j();
            return;
         case 3:
         case 31:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               Service.a().a((byte)((byte)this.bw), (short)((short)var29.O), (short)1);
               hso_ft.j();
               return;
            }

            return;
         case 4:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               hso_ft.c(hso_df.aJ + var29.g + "?", this.bN);
               return;
            }

            return;
         case 5:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               Service.a().a((byte)((byte)var29.u), (short)((short)var29.O), (byte)0);
               hso_fl.bi = 0;
               hso_ft.j();
               return;
            }

            return;
         case 6:
            hso_j var24;
            if ((var24 = (hso_j)var3.a(this.bB)) == null) {
               return;
            }

            if (var24.u == 5) {
               hso_ft.a(hso_df.fL);
               return;
            }

            if (var24.u == 4) {
               if (var24.L > 1 || Player.s[var24.L].b <= 0) {
                  if (GameScreen.p.d(2, 4) && var24.L == 0) {
                     ++GameScreen.p.b;
                     GameScreen.p.g();
                  }

                  if (var24.L >= 2
                          || (var24.L != 0 
                          || GameScreen.f.br != GameScreen.f.bs) 
                          && (var24.L != 1 
                          || GameScreen.f.bt != GameScreen.f.bu)) {
                     if (var24.L == hso_bw.c) {
                        if (!GameScreen.f.e_()) {
                           GameScreen.b();
                           GameScreen.i();
                        }
                     } else {
                        Service.a().e((short)var24.O);
                        if (var24.L < 2) {
                           Player.s[var24.L].b = 2000;
                           Player.s[var24.L].c = 2000;
                           Player.s[var24.L].a = hso_dw.a();
                        }
                     }
                  }
               }
            } else {
               var1 = 0;
               if (var24.R < 12) {
                  var1 = hso_fo.l[var24.R];
               }

               if (var1 != -1) {
                  if (var24.u == 7) {
                     Service.a().h((short)var24.O);
                  } else {
                     Service.a().b((byte)var24.O, (byte)var1);
                  }

                  if (GameScreen.p.d(3, 4)) {
                     ++GameScreen.p.b;
                     GameScreen.p.g();
                  }
               } else {
                  var15 = new hso_es("TabShopNew menu");
                  hso_bt var27 = new hso_bt(hso_df.aH, 12, 0, this);
                  hso_fd var33;
                  hso_bw var35;
                  if ((var35 = (hso_bw)hso_bw.U.a("3")) != null && (var33 = hso_bk.d((short)var35.t)) != null && var33.a != null) {
                     if (var33.b == 0 || var33.c == 0) {
                        var33.c = (short)aq.b(var33.a.a);
                        var33.b = (short)aq.a(var33.a.a);
                     }

                     hso_ce var37 = new hso_ce(var33.a, var33.b, var33.c);
                     var27.a(var37);
                  }

                  var31 = new hso_bt(hso_df.aI, 12, 1, this);
                  hso_fd var32;
                  if ((var35 = (hso_bw)hso_bw.U.a("9")) != null && (var32 = hso_bk.d((short)var35.t)) != null && var32.a != null) {
                     if (var32.b == 0 || var32.c == 0) {
                        var32.c = (short)aq.b(var32.a.a);
                        var32.b = (short)aq.a(var32.a.a);
                     }

                     hso_ce var38 = new hso_ce(var32.a, var32.b, var32.c);
                     var31.a(var38);
                  }

                  var15.a(var27);
                  var15.a(var31);
                  hso_ft.o.a(var15, 2, hso_df.cU, false, (hso_es)null);
               }
            }

            hso_fl.bi = 0;
            if (!GameScreen.p.d(2, 5) && !GameScreen.p.d(3, 5)) {
               hso_ft.j();
               return;
            }
            break;
         case 7:
            if ((var34 = (hso_bw)var3.a(this.bB)) == null) {
               return;
            }

            new hso_es("TabShopNew menu2");
            var12 = null;
            var17 = this.a(var34);
            var19 = hso_df.bh;
            if (this.cI == e) {
               var19 = hso_df.ey;
            }

            hso_ft.o.a(var17, 2, var19, false, (hso_es)null);
            if (!GameScreen.p.d(2, 9) && !GameScreen.p.d(2, 4) && !GameScreen.p.d(3, 4)) {
               break;
            }

            hso_fq.c = true;
            return;
         case 8:
            var17 = new hso_es("TabShopNew menu3");

            for(var20 = 0; var20 < 5; ++var20) {
               if (!hso_ft.A) {
                  if (hso_fi.h) {
                     var31 = new hso_bt(hso_df.ag + hso_cf.A[var20], 9, var20, this);
                  } else {
                     var31 = new hso_bt(hso_df.ag + hso_cf.z[var20], 9, var20, this);
                  }
               } else {
                  var31 = new hso_bt(hso_df.ce + (var20 + 1), 9, var20, this);
               }

               var17.a(var31);
            }

            hso_ft.o.a(var17, 2, hso_df.aQ, false, (hso_es)null);
            if (GameScreen.p.a >= 0 && GameScreen.p.d(2, 9)) {
               GameScreen.p.b = 10;
               hso_fq.c = true;
               return;
            }
            break;
         case 9:
            if ((var29 = (hso_j)var3.a(this.bB)) == null || var29.L > 1) {
               return;
            }

            if (var2 == 2) {
               hso_ft.a(hso_df.dP);
               return;
            }

            Player.w[Player.d][var2].a(var29.O, hso_ao.f, var29.L);
            hso_y.f();
            if (GameScreen.p.a >= 0 && (GameScreen.p.d(2, 9) || GameScreen.p.d(2, 10))) {
               GameScreen.p.b = 11;
               GameScreen.p.g();
               return;
            }
            break;
         case 10:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               Service.a().a((byte)((byte)var29.u), (short)((short)var29.O), (byte)1);
               if (hso_ft.A) {
                  this.bB = -1;
               }

               hso_fl.bi = 0;
               hso_ft.j();
               return;
            }

            return;
         case 11:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               boolean var26 = false;
             switch (var29.u) {
                 case 3:
                     if ((var20 = (1 + var29.S / w) * v * (100 + var29.N * x) / 100) > z) {
                         var20 = z;
                     }  break;
                 case 5:
                     var20 = var29.K * y;
                     break;
                 default:
                     var20 = u;
                     break;
             }

               if (var29.u == 3) {
                  if (var29.N == 0) {
                     var20 = 1;
                  }

                  if (var29.N == 1) {
                     var20 = 3;
                  }
               }

               hso_ft.c(hso_df.bF + var29.g + "? " + hso_df.cy + var20 + " " + hso_df.bO + ".", this.bR);
               return;
            }

            return;
         case 12:
            if ((var29 = (hso_j)var3.a(this.bB)) != null) {
               if (var2 == 0) {
                  Service.a().b((byte)var29.O, (byte)3);
                  return;
               }

               if (var2 == 1) {
                  Service.a().b((byte)var29.O, (byte)9);
                  return;
               }
            }
            break;
         case 13:
            if ((var29 = (hso_j)var3.a(this.bB)) != null) {
               var21 = 1;
               if (var29.u == 4 || var29.u == 7) {
                  try {
                     var21 = Integer.parseInt(this.cF.a.j());
                  } catch (Exception var9) {
                     var21 = 1;
                  }
               }

               Service.a().a((byte)0, (short)var29.O, (byte)var29.u, (short)((short)var21));
               if (hso_ft.A) {
                  this.bB = -1;
               }
            }

            hso_ft.j();
            return;
         case 14:
            if ((var29 = (hso_j)var3.a(this.bB)) != null) {
               var21 = 1;
               if (var29.u == 4 || var29.u == 7) {
                  try {
                     var21 = Integer.parseInt(this.cF.a.j());
                  } catch (Exception var8) {
                     var21 = 1;
                  }
               }

               Service.a().a(I, (short)var29.O, (byte)var29.u, (short)var21);
               if (hso_ft.A) {
                  this.bB = -1;
               }
            }

            hso_ft.j();
            return;
         case 15:
            if ((var29 = (hso_j)var3.a(this.bB)) == null || var29.u != 4 && var29.u != 7) {
               break;
            }

            this.cF = new hso_dy();
            this.cF.a(hso_df.dT, this.bS, true, hso_df.el);
            hso_ft.r = this.cF;
            return;
         case 16:
            if ((var29 = (hso_j)var3.a(this.bB)) == null || var29.u != 4 && var29.u != 7) {
               break;
            }

            this.cF = new hso_dy();
            this.cF.a(hso_df.dU, this.bT, true, hso_df.dx);
            hso_ft.r = this.cF;
            return;
         case 17:
            hso_es var5;
            (var5 = new hso_es("TabShopNew menusell")).a(new hso_bt(hso_df.dX, 19, 0, this));
            var5.a(new hso_bt(hso_df.dW, 19, 1, this));
            hso_ft.o.a(var5, 2, hso_df.bE, false, (hso_es)null);
            return;
         case 18:
            for(var20 = 0; var20 < hso_bw.V.c(); ++var20) {
               hso_j var30 = (hso_j)hso_bw.V.a(var20);
               if (var2 == 0) {
                  if (var30.u == 3 && var30.N == 0 && var30.z == 0) {
                     Service.a().a((byte)((byte)var30.u), (short)((short)var30.O), (byte)1);
                  }
               } else if (var2 == 1 && var30.u == 3 && var30.N == 1 && var30.z == 0) {
                  Service.a().a((byte)((byte)var30.u), (short)((short)var30.O), (byte)1);
               }
            }

            if (hso_ft.A) {
               this.bB = -1;
            }

            hso_ft.j();
            return;
         case 19:
            var20 = 0;

            for(var25 = 0; var25 < hso_bw.V.c(); ++var25) {
               var29 = (hso_j)hso_bw.V.a(var25);
               if (var2 == 0) {
                  if (var29.u == 3 && var29.N == 0) {
                     ++var20;
                  }
               } else if (var2 == 1 && var29.u == 3 && var29.N == 1) {
                  ++var20;
               }
            }

            if (var20 == 0) {
               if (var2 == 0) {
                  hso_ft.a(hso_df.dY);
                  return;
               }

               if (var2 == 1) {
                  hso_ft.a(hso_df.dZ);
                  return;
               }
            } else {
               if (var2 == 0) {
                  hso_ft.c(hso_df.bF + var20 + hso_df.ea, new hso_bt(hso_df.bE, 18, 0, this));
                  return;
               }

               if (var2 == 1) {
                  hso_ft.c(hso_df.bF + var20 + hso_df.eb, new hso_bt(hso_df.bE, 18, 1, this));
                  return;
               }
            }
            break;
         case 20:
            if ((var29 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               Service.a().b((byte)0, (short)((short)var29.O), (byte)((byte)var29.u));
               if (hso_fl.aU > 0) {
                  this.bB = -1;
                  hso_fl.bi = 0;
                  return;
               }
            }
            break;
         case 21:
            if ((var29 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               var25 = MainObject.f(var29.O) ? 6 : 1;
               Service.a().b((byte)var25, (short)((short)var29.O), (byte)((byte)var29.u));
               if (hso_fl.aU > 0) {
                  this.bB = -1;
                  hso_fl.bi = 0;
                  return;
               }
            }
            break;
         case 22:
            Service.a().i((byte)8);
            hso_ft.a(hso_df.aG, new hso_bt(hso_df.Z, -1));
            return;
         case 23:
            if ((var29 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               Service.a().b((byte)0, (short)((short)var29.O));
               return;
            }
            break;
         case 24:
            if ((var29 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               Service.a().a((byte)2, (int)0, (short)((short)var29.O));
               return;
            }
            break;
         case 25:
            if ((var34 = (hso_bw)var3.a(this.bB)) != null) {
               var22 = false;
               Service.a().b(bv, (short)var34.O, (byte)var34.u, (short)1);
               hso_dw.a("ap trung " + var34.O + " " + var34.u + " " + 1);
               if (hso_ft.A) {
                  this.bB = -1;
               }
            }

            hso_ft.j();
            return;
         case 26:
            if ((var34 = (hso_bw)var3.a(this.bB)) != null) {
               var22 = false;
               Service.a().b((byte)0, (short)var34.O, (byte)var34.u, (short)1);
               if (hso_ft.A) {
                  this.bB = -1;
               }
            } else {
               hso_dw.a("null cmnr");
            }

            hso_ft.j();
            return;
         case 27:
            if (this.D == null) {
               return;
            }

            var34 = (hso_bw)var3.a(this.bB);
            Service.a().a((short)this.D.O, (short)var34.O, (byte)var34.u, hso_ah.j);
            return;
         case 28:
            if ((var34 = (hso_bw)var3.a(this.bB)) != null && var34.u == 9) {
               hso_ft.a((hso_ea)((hso_ea)var34), (byte)0);
               return;
            }
            break;
         case 29:
            if ((var34 = (hso_bw)hso_bw.X.a(this.bB)) != null && var34.u == 9) {
               hso_ft.a((hso_ea)((hso_ea)var34), (byte)0);
            }

            hso_es var6 = new hso_es("TabShopNew vectab");
            hso_fn var36;
            (var36 = new hso_fn(hso_bw.V, (byte)0, hso_df.fI, -1, j)).D = hso_ah.i;
            var6.a(var36);
            (hso_ft.w = new hso_eu()).a = 0;
            hso_ft.w.a(var6);
            hso_ft.w.a(hso_ft.a);
            return;
         case 30:
            if ((var29 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               Service.a().b((byte)4, (short)((short)var29.O), (byte)((byte)var29.u));
               if (hso_fl.aU > 0) {
                  this.bB = -1;
                  hso_fl.bi = 0;
                  return;
               }
            }
            break;
         case 32:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               var17 = new hso_es("TabShopNew menu4");
               var19 = hso_df.aF + " " + 10 + " " + var29.g + " " + hso_df.cy + " " + var29.q * 10L + " " + (var29.Q == 0 ? hso_df.bO : hso_df.bP);
               var17.a(new hso_bt(hso_df.ga, 34, 10, this));
               var17.a(new hso_bt(hso_df.as, 35, this));
               hso_ft.a(var19, var17);
               return;
            }

            return;
         case 33:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               var17 = new hso_es("TabShopNew menu5");
               var19 = hso_df.aF + " " + 30 + " " + var29.g + " " + hso_df.cy + " " + var29.q * 30L + " " + (var29.Q == 0 ? hso_df.bO : hso_df.bP);
               var17.a(new hso_bt(hso_df.ga, 34, 30, this));
               var17.a(new hso_bt(hso_df.as, 35, this));
               hso_ft.a(var19, var17);
               return;
            }

            return;
         case 34:
            if ((var29 = (hso_j)var3.a(this.bB)) != null && !var29.b()) {
               Service.a().a((byte)this.bw, (short)var29.O, (short)var2);
               hso_ft.j();
               return;
            }

            return;
         case 35:
            hso_ft.j();
            return;
         case 36:
         case 40:
            if ((var13 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               hso_c.l = var13;
               hso_c.J = 1;
               if (hso_fl.aU > 0) {
                  this.bB = -1;
                  hso_fl.bi = 0;
                  return;
               }
            }
            break;
         case 37:
            if ((var13 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               if (hso_c.G.c() > this.bG) {
                  hso_ft.a(hso_df.N);
                  return;
               }

               hso_c.a(var13);
               if (hso_fl.aU > 0) {
                  this.bB = -1;
                  hso_fl.bi = 0;
                  return;
               }
            }
            break;
         case 38:
            hso_c.G.d();
            hso_c.l = null;
            if ((var13 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               if (var13.K < this.bG) {
                  hso_ft.a(hso_df.M);
                  return;
               }

               for(var2 = 0; var2 < this.bG; ++var2) {
                  hso_c.a(var13);
                  if (hso_fl.aU > 0) {
                     this.bB = -1;
                     hso_fl.bi = 0;
                  }
               }

               return;
            }
            break;
         case 39:
            if ((var29 = (hso_j)var3.a(this.bB)) == null) {
               return;
            }

            if (this.cI == l) {
               if (hso_c.b((hso_bw)var29)) {
                  hso_c.a((hso_bw)var29);
                  return;
               }
            } else if (this.cI == m) {
               hso_c.G.d();
               return;
            }
            break;
         case 41:
            this.cF = new hso_dy();
            String[] var16 = new String[]{hso_df.B};
            this.cF.a(var16, this.cs, (short)-1, (short)0, hso_df.C);
            hso_ft.r = this.cF;
            return;
         case 42:
            if ((var13 = (hso_j)var3.a(this.bB)) == null) {
               return;
            }

            var2 = 1;
            int var23 = 1;
            String[] var4 = this.cF.b();

            try {
               if (var4.length == 1) {
                  if (var4[0] != null) {
                     var2 = Integer.parseInt(var4[0]);
                  }
               } else if (var4.length == 2) {
                  if (var4[0] != null) {
                     var2 = Integer.parseInt(var4[0]);
                  }

                  if (var4[1] != null) {
                     var23 = Integer.parseInt(var4[1]);
                  }
               }
            } catch (Exception var7) {
               hso_ft.a(hso_df.z);
               return;
            }

            String var18 = hso_df.A + var13.g + " " + hso_df.cy + " " + hso_j.a((long)var2) + " " + hso_df.bO + " ?";
            if (var23 > 1) {
               var18 = hso_df.A + " " + var23 + " " + var13.g + " " + hso_df.cy + " " + hso_j.a((long)var2) + " " + hso_df.bO + " ?";
            }

            hso_fh var14;
            (var14 = new hso_fh()).a = var2;
            var14.c = (short)var23;
            (var15 = new hso_es()).a(new hso_bt(hso_df.ga, 43, var14, this));
            var15.a(new hso_bt(hso_df.as, 35, this));
            hso_ft.a(var18, var15);
            return;
         case 43:
         default:
            break;
         case 44:
            this.cF = new hso_dy();
            this.cF.a(hso_df.x, this.cu, false, -1, 0L, "");
            hso_ft.r = this.cF;
            return;
         case 45:
            Service.a().a(0, hso_bw.ab, this.cF.a.j(), (short)0, 0, (byte)0);
            hso_ft.j();
            if (this.cH != null) {
               this.cH.d();
               this.cH.a(this.cx);
               this.b(this.cH);
               return;
            }
            break;
         case 46:
            if ((var11 = (hso_j)var3.a(this.bB)) != null) {
               if (var11.u == 3) {
                  Service.a().a(2, (hso_es)null, "", E, var11.O, (byte)var11.u);
                  return;
               }

               if (var11.u == 7) {
                  Service.a().a(2, (hso_es)null, "", E, var11.O, (byte)var11.u);
                  return;
               }

               if (var11.u == 4) {
                  Service.a().a(2, (hso_es)null, "", E, var11.O, (byte)var11.u);
                  return;
               }
            }
            break;
         case 47:
            hso_bw.ab.d();
            hso_bw.aa.d();
            return;
         case 48:
            Service.a().a(4, (hso_es)null, "", (short)0, 0, (byte)0);
            return;
         case 49:
            this.bD = new hso_dy();
            this.bD.a(hso_df.fh, new hso_bt(hso_df.getChat("public final void a(int var1, int var2)"), 50, this), false, hso_df.fq);
            hso_ft.r = this.bD;
            return;
         case 50:
            this.bE = this.bD.a.j();
            if (this.bE != null && this.bE.length() > 0) {
               hso_ft.c(hso_df.fg + " (" + hso_df.fj + B + " " + hso_df.bP + ")" + hso_df.fp + "\n" + this.bE, new hso_bt(hso_df.getChat("public final void a(int var1, int var2)"), 51, this));
               return;
            }
            break;
         case 51:
            Service.a().b(this.bE);
            hso_ft.j();
            return;
         case 52:
            if ((var13 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               if (hso_c.l != null) {
                  hso_c.l = null;
               }

               Service.a().c((byte)0, (short)((short)var13.O), (byte)var13.u);
            }

            this.cH.d();
            return;
         case 53:
            if ((var13 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               Service.a().c((byte)1, (short)((short)var13.O), (byte)var13.u);
            }

            this.cH.d();
            return;
         case 54:
            if ((var13 = (hso_j)hso_bw.V.a(this.bB)) != null) {
               hso_c.l = var13;
               Service.a().c((byte)0, (short)((short)var13.O), (byte)var13.u);
            }

            this.cH.d();
            return;
         case 55:
            this.cF = new hso_dy();
            var12 = new String[]{hso_df.B, hso_df.eZ};
            this.cF.a(var12, this.cs, (short)-1, (short)0, hso_df.C);
            hso_ft.r = this.cF;
            return;
         case 56:
            ++this.bH;
            if (this.bH > G - 1) {
               this.bH = 0;
            }

            if (!hso_ft.A) {
               if (this.bH == 0) {
                  this.bB = 0;
               }

               if (this.bH == 1) {
                  this.bB = 42;
                  return;
               }
            }
            break;
         case 57:
            if ((var11 = (hso_j)var3.a(this.bB)) != null) {
               Service.a().b((byte)6, (byte)((byte)var11.u), (short)((short)var11.O));
            }
         }

      }
   }

   private hso_es a(hso_bw var1) {
      hso_es var2 = new hso_es("TabShopNew menu7");
      if (super.K == 9 && (G = (byte)(Player.y / 42)) == 1 && hso_bw.W.c() > 42) {
         G = 2;
      }

      if (super.K == 0) {
         G = (byte)(Player.x / 42);
      }

      if (super.K != 8 && G > 1) {
         var2.a(this.cD);
      }

      if (this.cI == r) {
         var2.a(this.cC);
         return var2;
      } else if (this.cI == q) {
         return var2;
      } else if (this.cI == r) {
         return var2;
      } else if (GameScreen.f.e_()) {
         var2.a(this.cx);
         var2.a(this.cy);
         return var2;
      } else if (this.cI == o) {
         var2.a(this.cv);
         return var2;
      } else if (super.K == 15) {
         var2.a(this.ct);
         var2.a(this.cw);
         return var2;
      } else {
         if (super.K == 16) {
            if (hso_bw.aa.c() > 0) {
               for(int var3 = 0; var3 < hso_bw.aa.c(); ++var3) {
                  if (((hso_j)hso_bw.aa.a(var3)).O == var1.O) {
                     return var2;
                  }
               }
            }

            if (var1.u == 3) {
               var2.a(this.cr);
            } else {
               var2.a(this.cB);
            }
         } else if (super.K == 0 && !this.F) {
            if (this.cI == o) {
               var2.a(this.cv);
            } else if (this.cI == n) {
               if (var1.u == 7 && var1.A == hso_bw.b) {
                  var2.a(this.co);
               }

               if (var1.u == 3) {
                  var2.a(this.cm);
               }
            } else if (this.cI == p) {
               if (var1.u == 7) {
                  if (hso_c.G.c() > 0 && ((hso_j)hso_c.G.a(0)).O == var1.O) {
                     var2.a(this.cA);
                     return var2;
                  }

                  var2.a(this.cz);
               }
            } else if (this.cI == m) {
               if (var1.u == 7 && var1.A == hso_bw.a) {
                  if (!hso_c.b(var1)) {
                     var2.a(this.cn);
                  }

                  if (hso_c.b(var1)) {
                     var2.a(this.cp);
                  }
               }
            } else if (this.cI == l) {
               if (var1.u == 3) {
                  if (!t && (hso_c.l == null ||
                          hso_c.l.O != var1.O ||
                          hso_c.l.u != var1.u)) {
                     var2.a(this.cl);
                  }
               } else if (var1.u == 7 && var1.A == 49) {
                  var2.a(this.co);
                  if (hso_c.b(var1)) {
                     var2.a(this.cp);
                  }
               }
            } else if (this.cI == d) {
               if (var1.u == 3) {
                  if (!t) {
                     if (hso_c.l != null && hso_c.l.O == var1.O && hso_c.l.u == var1.u) {
                        var2.a(this.bY);
                     } else {
                        var2.a(this.bX);
                     }
                  }
               } else if (var1.u == 7) {
                  if (var1.A == 11) {
                     if (!t) {
                        if (!hso_c.D) {
                           hso_c.I = var1;
                           var2.a(this.bX);
                        } else {
                           var2.a(this.bY);
                        }
                     }
                  } else if (MainObject.f((short)var1.O) && t) {
                     if (hso_c.l != null && hso_c.l.O == var1.O && hso_c.l.u == var1.u) {
                        var2.a(this.bY);
                     } else {
                        var2.a(this.ch);
                     }
                  }
               }
            } else if (this.cI == f) {
               if (var1.u == 3) {
                  var2.a(this.ca);
               }
            } else if (this.cI == c) {
               if (var1.u != 5) {
                  if (var1.u != 4 && var1.u != 7) {
                     var2.a(this.bT);
                  } else {
                     var2.a(this.bV);
                  }
               }
            } else if (this.cI == i) {
               if (var1.u == 3 && var1.R == 14) {
                  var2.a(this.cd);
               }
            } else if (this.cI == g) {
               if (var1.u == 3 && var1.R == 7) {
                  var2.a(this.cb);
               }
            } else if (this.cI == j) {
               var2.a(this.cf);
            } else {
               if (hso_ft.a == hso_ft.v && var1.x == 1) {
                  var2.a(this.bQ);
                  if (var1.u == 3) {
                     var2.a(this.bW);
                  }
               }

               if (hso_ft.a != hso_ft.v) {
                  var2.a(this.bJ);
                  if (var1.u == 4 && var1.L < 2) {
                     var2.a(this.bP);
                  }
               }

               if (hso_ft.a == hso_ft.u) {
                  var2.a(this.bM);
               }
            }
         } else if (super.K == 9) {
            if (var1.u != 4 && var1.u != 7) {
               var2.a(this.bS);
            } else {
               var2.a(this.bU);
            }
         } else if (super.K != 15) {
             switch (super.K) {
                 case 13:
                     if (this.cI == i && var1.u == 9) {
                         var2.a(this.cg);
                         var2.a(this.ce);
                     }     break;
                 case 12:
                     var2.a(this.bJ);
                     break;
                 default:
                     this.bI.a = hso_df.ak;
                     if (this.bw == readMessenge.a) {
                         this.bI.a = this.cJ;
                     }     if (var1.u == 6 && var1.q <= 0L) {
                         this.bI.a = hso_df.bj;
                     }     if (this.cI == h) {
                         var2.a(this.cc);
                     } else if (this.cI != k && !this.F && ((var1 = (hso_bw)this.bF.a(this.bB)) != null || !var1.b())) {
                         if (var1.u != 4 && var1.u != 7) {
                             var2.a(this.bI);
                         } else {
                             var2.a(this.ci);
                             var2.a(this.cj);
                             var2.a(this.ck);
                             var2.a(this.cq);
                         }
                     }     if (this.cI == e) {
                         this.bI.a = hso_df.Y;
                         var2.a(this.bZ);
                     }     break;
             }
         }

         if (super.K == 0) {
            var2.a(this.cE);
         }

         return var2;
      }
   }

   public final void a(mGraphics var1) {
      hso_es var2;
      if (super.K == 15) {
         var2 = hso_bw.aa;
      } else if (super.K != 0 && super.K != 16) {
          switch (super.K) {
              case 9:
                  var2 = hso_bw.W;
                  break;
              case 13:
                  var2 = hso_bw.X;
                  break;
              case 12:
                  var2 = hso_bw.Y;
                  break;
              default:
                  var2 = this.bF;
                  break;
          }
      } else {
         var2 = hso_bw.V;
      }

      hso_ft.a(var1);
      var1.d(super.V - hso_fl.aN, super.W, hso_fl.S + (hso_fl.aN << 1), hso_fl.T - hso_fl.aN / 2 + 1);
      var1.a(-hso_p.e.a, -hso_p.e.b);
      int var3;
      if ((var3 = var2.c()) > 42) {
         var3 = 42;
      }

      if (this.cK) {
         var3 = this.bF.c();
      }

      int var4 = var3 * this.bH;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         hso_bw var6;
         if ((var6 = (hso_bw)var2.a(var5 + var4)) != null) {
            label262: {
               if (var6.u == 7) {
                  hso_j var7;
                  if ((var7 = hso_bw.b(var6.O)) == null) {
                     hso_bw.c(var6.O);
                     break label262;
                  }

                  var6.a(var7.g, var7.t, 7, var6.q, var6.Q, var7.h, (short)var7.P, var7.A, var7.x, var7.y);
                  var6.d(var7.N);
               }

               var6.a(var1, super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM, hso_fl.aM, 0, 0);
            }

            if (var6.p > 0) {
               var1.a(hso_cg.am, 0, 0, hso_fl.aM - 1, hso_fl.aM - 1, 0, super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM, 3);
            }

            int var11;
            if (super.K == 16 && !GameScreen.f.e_() && hso_bw.aa.c() > 0) {
               for(var11 = 0; var11 < hso_bw.aa.c(); ++var11) {
                  if (((hso_j)hso_bw.aa.a(var11)).O == var6.O) {
                     var1.a(-2737107);
                     var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
                  }
               }
            }

            if (this.cI != r && this.cI != p && this.cI != l && this.cI != m && this.cI != n) {
               if (this.cI == d) {
                  if (hso_c.l != null && (var6.O == hso_c.l.O && var6.u == hso_c.l.u || var6.u == 7 && var6.A == 11 && hso_c.D)) {
                     var1.a(-397307);
                     var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
                  }
               } else if (this.cI == f) {
                  if (hso_c.n != null && var6.O == hso_c.n.O && var6.u == hso_c.n.u) {
                     var1.a(-397307);
                     var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
                  }

                  if (hso_c.m != null && var6.O == hso_c.m.O && var6.u == hso_c.m.u) {
                     var1.a(-2737107);
                     var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
                  }
               } else if (this.cI == g && hso_c.o != null && var6.O == hso_c.o.O && var6.u == hso_c.o.u) {
                  var1.a(-397307);
                  var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
               }
            } else {
               if (hso_c.l != null && var6.O == hso_c.l.O && var6.u == hso_c.l.u) {
                  var1.a(-397307);
                  var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
               }

               if (hso_c.G.c() > 0) {
                  for(var11 = 0; var11 < hso_c.G.c(); ++var11) {
                     hso_j var8 = (hso_j)hso_c.G.a(var11);
                     var1.a(-397307);
                     if (var8 != null && (var6.A == hso_bw.a || var6.A == hso_bw.b || this.cI == p) && var6.O == var8.O && var6.u == var8.u) {
                        var1.b(super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM - hso_fl.aM / 2 + 4, hso_fl.aM - 8, hso_fl.aM - 8);
                     }
                  }
               }
            }

            if (var6.u == 4 && var6.L < 2 && super.K == 0 && Player.s[var6.L].b > 0) {
               var1.a(hso_cg.am, 0, 0, hso_fl.aM - 1, hso_fl.aM - 1, 0, super.V + hso_fl.aM / 2 + var5 % this.bx * hso_fl.aM, super.W + hso_fl.aM / 2 + var5 / this.bx * hso_fl.aM, 3);
            }
         }
      }

      var1.a(hso_fl.bf[1]);
      var1.b(super.V, super.W, hso_fl.S, hso_fl.aM * this.by);

      for(var5 = 0; var5 < this.bx / 2; ++var5) {
         var1.b(super.V + hso_fl.aM + (var5 * hso_fl.aM << 1), super.W, hso_fl.aM, hso_fl.aM * this.by);
      }

      for(var5 = 0; var5 < this.by / 2; ++var5) {
         var1.b(super.V, super.W + hso_fl.aM + (var5 * hso_fl.aM << 1), hso_fl.S, hso_fl.aM);
      }

      if (this.bB > -1 && hso_fl.aO == 1) {
         var1.a(hso_fl.bf[2]);
         var1.b(super.V + (this.bB - this.bH * 42) % this.bx * hso_fl.aM + 1, super.W + (this.bB - this.bH * 42) / this.bx * hso_fl.aM + 1, hso_fl.aM - 2, hso_fl.aM - 2);
         var1.a(hso_fl.bf[3]);
         var1.b(super.V + (this.bB - this.bH * 42) % this.bx * hso_fl.aM, super.W + (this.bB - this.bH * 42) / this.bx * hso_fl.aM, hso_fl.aM, hso_fl.aM);
      }

      if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && hso_fl.aO == 1 && hso_fl.bi > hso_fl.aX) {
         this.a(var1, false);
         if (this.cH != null) {
            for(var5 = 0; var5 < this.cH.c(); ++var5) {
               hso_bt var9;
               (var9 = (hso_bt)this.cH.a(var5)).a(var1, var9.h, var9.i);
            }
         }
      }

      hso_bw var12;
      if (GameScreen.p.a >= 0) {
         var12 = null;
         if (this.bB > -1 && hso_fl.aO == 1) {
            var12 = (hso_bw)var2.a(this.bB);
         }

         if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null) {
            GameScreen.p.a(var1, var12, super.K);
         }
      }

      if (!hso_ft.C && this.cI == b) {
         var12 = null;
         if (this.bB > -1 && hso_fl.aO == 1) {
            var12 = (hso_bw)var2.a(this.bB);
         }

         int var10 = GameScreen.f.cb;
         if (var12 != null) {
            var10 = var12.t;
         }

         hso_fl.a(var1, var10);
      }

      hso_fh var13;
      if (!GameScreen.f.e_() && super.K == 15 && this.bB >= 0 && this.bB < hso_bw.ab.c() && (var13 = (hso_fh)hso_bw.ab.a(this.bB)) != null) {
         hso_o.k.a(var1, hso_df.ba + ": " + hso_j.a((long)var13.a) + " " + hso_df.bO, super.V, super.W + hso_fl.aM * 6, 0, false);
      }

   }

   public final void a() {
      if (super.K != 0 && super.K != 16 && super.K != 9 && super.K != 13 && this.bH != 0) {
         this.bH = 0;
      }

      if (GameScreen.p.a > 0) {
         GameScreen.p.h();
      }

      if (hso_fl.aO == 1) {
         if (super.aY != null) {
            super.aY.c();
         }

         if (hso_ft.A) {
            this.cG.c();
         } else {
            hso_p.e.a();
         }

         hso_es var1;
         if (super.K == 15) {
            var1 = hso_bw.aa;
         } else if (super.K != 0 && super.K != 16) {
             switch (super.K) {
                 case 9:
                     var1 = hso_bw.W;
                     break;
                 case 12:
                     var1 = hso_bw.Y;
                     break;
                 default:
                     var1 = this.bF;
                     break;
             }
         } else {
            var1 = hso_bw.V;
         }

         if (var1.c() == 0) {
            hso_fl.aO = 0;
            return;
         }

         if (this.bB >= var1.c()) {
            if (hso_ft.A) {
               this.bB = -1;
               this.cH = null;
            } else {
               this.bB = var1.c() - 1;
            }
         }

         if (super.K != e) {
            int var3 = this.bB;
            if (hso_fl.bi < hso_fl.aX + 2 && ++hso_fl.bi == hso_fl.aX) {
               this.f();
            }

            hso_bw var2;
            if (super.bj == null && var3 >= 0 && var3 < var1.c() && (var2 = (hso_bw)var1.a(var3)).u != 5) {
               if (var2.k == null) {
                  if (var2.o % 100 == 3) {
                     if (super.K == 0 || super.K == 16) {
                        Service.a().a((byte)0, (byte)((byte)var2.O));
                     }

                     ++var2.o;
                  } else {
                     ++var2.o;
                  }
               } else {
                  super.bu = var2.J;
                  super.bj = var2.k;
                  super.bm = var2.m;
                  this.b(var2);
               }
            }
         }
      } else {
         hso_fl.bi = 0;
      }

      if (this.bH == 0 && this.bB > 42 && !this.cK) {
         this.bB = -1;
      }

   }

   public final void d() {
      hso_es var1;
      if (super.K == 15) {
         var1 = hso_bw.aa;
      } else if (super.K != 0 && super.K != 16) {
         if (super.K == 9) {
            var1 = hso_bw.W;
         } else if (super.K == 12) {
            var1 = hso_bw.Y;
         } else {
            var1 = this.bF;
         }
      } else {
         var1 = hso_bw.V;
      }

      if (hso_fl.aO == 1) {
         int var2 = this.bB;
         boolean var3 = false;
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
            this.bB -= this.bx;
            hso_ft.d(2);
            var3 = true;
         } else if (hso_ft.al[8]) {
            this.bB += this.bx;
            hso_ft.d(8);
            var3 = true;
         }

         label103: {
            if (hso_ft.al[4]) {
               if (this.bB % this.bx == 0 && this.bH == 0) {
                  hso_fl.aO = 0;
               } else {
                  --this.bB;
               }

               if (this.bH == 1 && this.bB == 41) {
                  --this.bH;
               }

               if (this.bH == 2 && this.bB == 82) {
                  --this.bH;
               }

               hso_ft.d(4);
            } else {
               if (!hso_ft.al[6]) {
                  break label103;
               }

               ++this.bB;
               hso_ft.d(6);
               if (G > 1 && this.bB > 0 && this.bB % 42 == 0) {
                  ++this.bH;
                  if (this.bH > G - 1) {
                     this.bH = 0;
                     this.bB = 0;
                  }
               }
            }

            var3 = true;
         }

         if (var3) {
            super.aY = null;
            this.bB = hso_cg.a(this.bB, var1.c() - 1, false);
            if (!hso_ft.A && (super.K == 0 || super.K == 16 || super.K == 9 || super.K == 15)) {
               super.aa = this.bO;
            }

            hso_eu.f = 10;
         }

         if (var2 != this.bB) {
            hso_p.e.a(0, (this.bB / this.bx - 1) * hso_fl.aM);
            hso_fl.bi = 0;
         }
      }

      super.d();
   }

   private void f() {
      try {
         super.bj = null;
         super.bk = null;
         super.bl = null;
         hso_es var1;
         if (super.K == 15) {
            var1 = hso_bw.aa;
         } else if (super.K != 0 && super.K != 16) {
             switch (super.K) {
                 case 9:
                     var1 = hso_bw.W;
                     break;
                 case 12:
                     var1 = hso_bw.Y;
                     break;
                 default:
                     var1 = this.bF;
                     break;
             }
         } else {
            var1 = hso_bw.V;
         }

         if (this.bB < var1.c() && this.bB >= 0) {
            hso_bw var5;
            if ((var5 = (hso_bw)var1.a(this.bB)) != null && var5.b()) {
               hso_fl.bi = 0;
            } else {
               if (var5.u == 9) {
                  hso_ah.i = (hso_ea)var5;
                  super.R = true;
               } else {
                  super.R = false;
               }

               super.bp = var5.g;
               super.br = var5.N;
               hso_j var2;
               if (var5.u == 7 && (var2 = hso_bw.b(var5.O)) != null) {
                  super.br = var2.N;
                  if (super.K == 15 && var5.H) {
                     super.bl = var5.l;
                     super.bo = var5.n;
                  }
               }

               super.bu = var5.J;
               if (var5.u == 3 || super.K == 8) {
                  super.bl = var5.l;
                  super.bo = var5.n;
               }

               super.aY = null;
               if (hso_fl.aU > 0) {
                  int var4 = 1;
                  super.bj = var5.k;
                  super.bm = var5.m;
                  if (var5.k != null) {
                     var4 = 1 + super.bj.length;
                  }

                  if (var5.l != null) {
                     var4 += var5.l.length;
                  }

                  if (var4 * hso_ft.ab > hso_fl.U - this.bC) {
                     super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, var4 * hso_ft.ab - (hso_fl.U - this.bC));
                  } else if (hso_ft.A) {
                     super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, 0);
                  }

                  this.c(var5);
               } else {
                  super.bq = var5.s;
                  this.b(var5);
                  if (this.bB % this.bx < 2) {
                     super.bs = super.V + hso_fl.aM / 2 + this.bB % this.bx * hso_fl.aM;
                  } else if (this.bB % this.bx < 5) {
                     super.bs = super.V + hso_fl.aM / 2 + this.bB % this.bx * hso_fl.aM - super.bq / 2;
                  } else {
                     super.bs = super.V + hso_fl.aM / 2 + this.bB % this.bx * hso_fl.aM - super.bq;
                  }
               }
            }
         } else {
            if (this.bB > var1.c() - 1) {
               this.bB = var1.c() - 1;
            }

            hso_fl.bi = 0;
         }
      } catch (Exception var3) {
      }
   }

   private void b(hso_bw var1) {
      int var2 = 0;
      if (hso_p.e.b > 0) {
         var2 = hso_p.e.b / hso_fl.aM;
      }

      int var3 = 1;
      super.bj = var1.k;
      super.bu = var1.J;
      super.bm = var1.m;
      if (var1.k != null) {
         var3 = 1 + super.bj.length;
      }

      if (var1.l != null) {
         var3 += var1.l.length;
      }

      if (this.bB / this.bx < this.bz / 2 + var2) {
         super.bt = super.W + (this.bB / this.bx + 1) * hso_fl.aM + 2;
         if (super.bt - hso_p.e.b + (var3 + 1) * hso_ft.ab > hso_ft.X - (hso_ft.aa - 5)) {
            super.bt = hso_ft.X - (hso_ft.aa - 5) - ((var3 + 1) * hso_ft.ab - hso_p.e.b);
         }
      } else if (hso_dw.g) {
         var2 = this.bB;
         if (this.bH > 0) {
            var2 -= 42;
         }

         super.bt = super.W + (var2 / this.bx + 1) * hso_fl.aM + 2;
         if (super.bt - hso_p.e.b + (var3 + 1) * hso_ft.ab > hso_ft.X - (hso_ft.aa - 5)) {
            super.bt = hso_ft.X - (hso_ft.aa - 5) - ((var3 + 1) * hso_ft.ab - hso_p.e.b);
         }
      } else {
         super.bt = super.W + (this.bB / this.bx + 1) * hso_fl.aM - 7 - var3 * hso_ft.ab - hso_p.e.b;
         if (super.bt - hso_p.e.b < 6) {
            super.bt = 6 + hso_p.e.b;
         }
      }

      if (hso_dw.g && super.bt >= hso_ft.X / 4) {
         super.bt = hso_ft.X / 2;
      }

      if ((var3 + 1) * hso_ft.ab > hso_fl.U - this.bC) {
         super.aY = new hso_bp(super.bs, super.bt, super.bq, hso_fl.U, 0, 0, (var3 + 1) * hso_ft.ab - (hso_fl.U - this.bC));
      }

      this.c(var1);
   }

   private void c(hso_bw var1) {
      if (super.K == 0 && var1.u == 3 && (var1.M == 4 || var1.M == GameScreen.f.bx) && var1.R < 12) {
         byte var2 = (byte)hso_fo.l[var1.R];
         hso_bw var3 = null;
         int var4;
         int var7;
         int var8;
         if (var2 != -1) {
            var3 = (hso_bw)hso_bw.U.a("" + var2);
         } else {
            var8 = 0;
            var4 = 0;
            hso_bw var5 = (hso_bw)hso_bw.U.a("3");
            hso_bw var6 = (hso_bw)hso_bw.U.a("9");
            if (var5 == null) {
               var3 = var6;
            } else if (var6 == null) {
               var3 = var5;
            } else {
               for(var7 = 0; var7 < var5.j.length; ++var7) {
                  var8 += var5.j[var7].b;
               }

               for(var7 = 0; var7 < var6.j.length; ++var7) {
                  var4 += var6.j[var7].b;
               }

               if (var8 >= var4) {
                  var3 = var6;
               } else {
                  var3 = var5;
               }
            }
         }

         if (var3 != null && var3.R == var1.R && super.bj != null && var3.J.c() <= 0) {
            super.bk = new String[super.bj.length];
            super.bn = new int[super.bj.length];

            for(var8 = 0; var8 < super.bk.length; ++var8) {
               super.bk[var8] = "";
               super.bn[var8] = 0;

               for(var4 = 0; var4 < var3.j.length; ++var4) {
                  if (var1.j[var8].a == var3.j[var4].a) {
                     int var9;
                     if ((var9 = var1.j[var8].b - var3.j[var4].b) >= 0) {
                        super.bn[var8] = 5;
                        super.bk[var8] = "+";
                     } else {
                        super.bk[var8] = "-";
                        super.bn[var8] = 6;
                     }

                     String[] var10000 = super.bk;
                     var10000[var8] = var10000[var8] + hso_bw.a(hso_bw.f[var1.j[var8].a], (int)hso_ak.e(var9));
                     String var10 = hso_bw.d[var1.j[var8].a] + ": " + hso_bw.a(hso_bw.f[var1.j[var8].a], (int)var1.j[var8].b);
                     var7 = hso_o.i.a(var10 + " " + super.bk[var8]);
                     if (super.bq < var7 + 10) {
                        super.bq = var7 + 10;
                     }
                     break;
                  }
               }
            }
         }
      }

   }

   public final void e() {
      boolean var1 = false;
      if (super.aY != null && hso_ft.c(super.aY.c, super.aY.d, super.aY.a, super.aY.b)) {
         super.aY.a();
         var1 = true;
      }

      if (hso_ft.A && !var1) {
         this.cG.a();
         hso_p.e.b = this.cG.f;
      }

      int var3;
      if (hso_ft.b(super.V, super.W, this.bx * hso_fl.aM, hso_fl.T - hso_fl.aN / 2) && !var1) {
         var3 = (hso_ft.ae - super.V) / hso_fl.aM + (hso_ft.af - super.W + hso_p.e.b) / hso_fl.aM * this.bx;
         boolean var2 = false;
         int var4;
         if (super.K == 15) {
            var4 = hso_bw.aa.c();
         } else if (super.K != 0 && super.K != 16) {
             switch (super.K) {
                 case 9:
                     var4 = hso_bw.W.c();
                     break;
                 case 12:
                     var4 = hso_bw.Y.c();
                     break;
                 case 13:
                     var4 = hso_bw.X.c();
                     break;
                 default:
                     var4 = this.bF.c();
                     break;
             }
         } else {
            var4 = hso_bw.V.c();
         }

         if (var3 >= 0 && var3 < var4) {
            hso_ft.S = false;
            var4 = this.bB;
            if (this.bH == 1) {
               var4 -= 42;
            }

            if (var3 == var4) {
               if (hso_fl.aU == 0) {
                  if (super.K != 0 && super.K != 16 && super.K != 9 && super.K != 15 && super.K != 12 && (super.K != 8 || this.cI != e) && super.K != 13) {
                     if (this.cI == h) {
                        this.cc.a();
                     } else {
                        this.bI.a();
                     }
                  } else {
                     this.bO.a();
                  }
               }
            } else {
               hso_fl.bi = 0;
               this.bB = var3 + 42 * this.bH;
               if (this.bH == 0 && this.bB == 42) {
                  this.bB = -1;
               }

               if (this.bH == 1 && this.bB == 84) {
                  this.bB = -1;
               }

               if (this.bH == 3 && this.bB == 126) {
                  this.bB = -1;
               }

               if (this.cK) {
                  this.bB = var3;
               }

               if (hso_fl.aU > 0 && hso_ft.A) {
                  this.bC = 0;
                  hso_es var5;
                  if (super.K == 15) {
                     var5 = hso_bw.aa;
                  } else if (super.K != 0 && super.K != 16) {
                     if (super.K == 9) {
                        var5 = hso_bw.W;
                     } else {
                        var5 = this.bF;
                     }
                  } else {
                     var5 = hso_bw.V;
                  }

                  if (this.bB >= 0 && this.bB < var5.c()) {
                     hso_bw var6 = (hso_bw)var5.a(this.bB);
                     this.cH = this.a(var6);
                     this.b(this.cH);
                     this.bC = (this.cH.c() + 1) / 2 * hso_bt.k;
                  }
               }

               super.aY = null;
            }

            if (hso_fl.aO != 1) {
               hso_fl.aO = 1;
            }
         } else {
            this.bB = -1;
            hso_fl.bi = 0;
            super.aY = null;
         }
      }

      if (this.cH != null && hso_fl.aO == 1 && hso_fl.bi > hso_fl.aX) {
         for(var3 = 0; var3 < this.cH.c(); ++var3) {
            ((hso_bt)this.cH.a(var3)).b();
         }
      }

      super.e();
   }
}
