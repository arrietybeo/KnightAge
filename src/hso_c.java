public final class hso_c extends hso_fl {
   private byte bv = 0;
   public static byte a = 0;
   public static byte b = 1;
   public static byte c = 2;
   public static byte d = 3;
   public static byte e = 4;
   public static byte f = 5;
   public static byte g = 6;
   private static byte bw = 0;
   private static byte bx = 1;
   private static byte by = 2;
   public static String[] h = new String[]{"", "", "", "", ""};
   public static byte[] i = new byte[5];
   private int bz;
   private int bA;
   private int bB = 12;
   private int bC = 140;
   private int[][] bD;
   public static String[] j;
   private int bE;
   private int bF;
   public static hso_b[] k;
   public static hso_j l;
   public static hso_j m;
   public static hso_j n;
   public static hso_j o;
   public static int[] p;
   public static short[] q;
   public static int[] r;
   public static hso_b[] s;
   public static int t = 0;
   public static int u;
   public static String v = "";
   public static int w = 0;
   public static short x = 0;
   public static short y = 0;
   public static String z = "test nao";
   public static String A;
   public static byte B = 0;
   public static byte C = 0;
   public static boolean D = false;
   private static boolean bG;
   private hso_bt bH;
   private hso_bt bI;
   private hso_bt bJ;
   private hso_bt bK;
   private hso_bt bL;
   public static hso_es E = new hso_es("TabRebuildItem vecEffRe");
   public static String F = "";
   private hso_es bM = new hso_es("TabRebuildItem vecListCmd");
   public static hso_es G = new hso_es("TabRebuildItem vecGem");
   public static boolean H = false;
   private static boolean bN = false;
   private hso_fz bO = new hso_fz();
   public static hso_bw I = null;
   private int bP;
   private long bQ;
   public static byte J = 0;

   public hso_c(String var1, byte var2) {
      bN = false;
      super.bb = false;
      super.ba = null;
      this.bv = var2;
      super.K = 10;
      super.X = var1;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      this.bz = (hso_fl.S - 8) / 32;
      this.bA = (hso_fl.T - 8) / 32;
      if (hso_fl.aU > 0) {
         this.bC = hso_fl.aU;
         this.bE = hso_fl.aV;
         this.bF = hso_fl.aW + hso_fl.aM / 2;
      } else {
         this.bE = super.V + hso_fl.S / 2 - this.bC / 2;
         this.bF = super.W + 4;
         if (this.bF > hso_ft.X - hso_ft.aa - 150 - hso_ft.aa) {
            this.bF = hso_ft.X - hso_ft.aa - 150 - hso_ft.aa;
         }
      }

      if (hso_ft.C) {
         this.bF = hso_ft.X - hso_ft.aa - 150 - hso_ft.aa;
      }

      super.aT = new hso_bt(hso_df.af, -1, this);
      this.bI = new hso_bt(hso_df.bK, 1, this);
      if (hso_ft.A) {
         super.aT.a = hso_df.Z;
      }

      int var3;
      int var4;
      if (this.bv != 0 && this.bv != d && this.bv != f && this.bv != e && this.bv != g) {
         if (this.bv == b) {
            this.bD = hso_dw.a(2, 2);
            this.bD[1][0] = super.V + hso_fl.S / 2 + 52;
            this.bD[1][1] = super.W + hso_fl.T / 2 - 16;
            this.bD[0][0] = super.V + hso_fl.S / 2 - 52;
            this.bD[0][1] = super.W + hso_fl.T / 2 - 16;
            this.bJ = new hso_bt(hso_df.fk, 3, this);
            if (hso_fl.aU > 0) {
               var3 = hso_fl.aW + super.N;
               var4 = hso_fl.aV;
               if (hso_fl.aZ) {
                  this.bJ.a(var4 + hso_fl.aU / 2, var3 - 10, hso_cf.v, this.bJ.a);
               } else {
                  this.bJ.a(var4 + hso_fl.aU / 2, var3 - 15, (hso_ce)null, this.bJ.a);
               }
            } else if (hso_ft.A) {
               this.bJ.a(hso_bt.j / 2 + 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bJ.a);
               this.bI.a(hso_ft.W - hso_bt.j / 2 - 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bI.a);
            }
         } else if (this.bv == c) {
            this.bD = hso_dw.a(7, 2);
            this.bD[1][0] = super.V + hso_fl.S / 2;
            this.bD[1][1] = super.W + hso_fl.T / 2 - 52;
            this.bD[5][0] = super.V + hso_fl.S / 2 + 46;
            this.bD[5][1] = super.W + hso_fl.T / 2 - 26;
            this.bD[2][0] = super.V + hso_fl.S / 2 + 46;
            this.bD[2][1] = super.W + hso_fl.T / 2 + 26;
            this.bD[4][0] = super.V + hso_fl.S / 2;
            this.bD[4][1] = super.W + hso_fl.T / 2 + 52;
            this.bD[0][0] = super.V + hso_fl.S / 2 - 46;
            this.bD[0][1] = super.W + hso_fl.T / 2 + 26;
            this.bD[3][0] = super.V + hso_fl.S / 2 - 46;
            this.bD[3][1] = super.W + hso_fl.T / 2 - 26;
            this.bD[6][0] = super.V + hso_fl.S / 2;
            this.bD[6][1] = super.W + hso_fl.T / 2;
            this.bK = new hso_bt(hso_df.fx, 4, this);
            if (hso_fl.aU > 0) {
               var3 = hso_fl.aW + super.N;
               var4 = hso_fl.aV;
               if (hso_fl.aZ) {
                  this.bK.a(var4 + hso_fl.aU / 2, var3 - 10, hso_cf.v, this.bK.a);
               } else {
                  this.bK.a(var4 + hso_fl.aU / 2, var3 - 15, (hso_ce)null, this.bK.a);
               }
            } else if (hso_ft.A) {
               this.bK.a(hso_bt.j / 2 + 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bK.a);
               this.bI.a(hso_ft.W - hso_bt.j / 2 - 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bI.a);
            }
         }
      } else {
         this.bD = hso_dw.a(6, 2);
         this.bD[4][0] = super.V + hso_fl.S / 2;
         this.bD[4][1] = super.W + hso_fl.T / 2 - 52;
         this.bD[2][0] = super.V + hso_fl.S / 2 + 52;
         this.bD[2][1] = super.W + hso_fl.T / 2 - 16;
         this.bD[1][0] = super.V + hso_fl.S / 2 + 32;
         this.bD[1][1] = super.W + hso_fl.T / 2 + 45;
         this.bD[3][0] = super.V + hso_fl.S / 2 - 32;
         this.bD[3][1] = super.W + hso_fl.T / 2 + 45;
         this.bD[0][0] = super.V + hso_fl.S / 2 - 52;
         this.bD[0][1] = super.W + hso_fl.T / 2 - 16;
         this.bD[5][0] = super.V + hso_fl.S / 2;
         this.bD[5][1] = super.W + hso_fl.T / 2;
         D = false;
         super.Z = null;
         bG = false;
         this.bH = new hso_bt(hso_df.eg, 0, this);
         this.bL = new hso_bt(hso_df.h, 9, this);
         if (hso_fl.aU > 0) {
            var3 = hso_fl.aW + super.N;
            var4 = hso_fl.aV;
            if (hso_fl.aZ) {
               this.bH.a(var4 + hso_fl.aU / 2, var3 - 10, hso_cf.v, this.bH.a);
               this.bL.a(var4 + hso_fl.aU / 2, var3 - 10, hso_cf.v, this.bL.a);
            } else {
               this.bH.a(var4 + hso_fl.aU / 2, var3 - 15, (hso_ce)null, this.bH.a);
               this.bL.a(var4 + hso_fl.aU / 2, var3 - 15, (hso_ce)null, this.bL.a);
            }
         } else if (hso_ft.A) {
            this.bH.a(hso_bt.j / 2 + 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bH.a);
            this.bL.a(hso_bt.j / 2 + 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bL.a);
            this.bI.a(hso_ft.W - hso_bt.j / 2 - 2, hso_ft.X - hso_bt.k / 2 - 2, (hso_ce)null, this.bI.a);
         }
      }

      this.b();
      if (this.bv != f && this.bv != e && this.bv != d && this.bv != 0 && this.bv != b && this.bv != g) {
         if (this.bv == c) {
            super.ba = aq.a("/interface/rebuild2.img");
         }

      } else {
         super.ba = aq.a("/interface/rebuild.img");
      }
   }

   private void f() {
      super.bj = null;
      super.bk = null;
      super.bl = null;
      if (l != null && l.g != null) {
         super.bp = l.g;
      }

      super.aY = null;
      if (l != null) {
         int var1 = 1;
         super.bj = l.k;
         super.bu = l.J;
         super.bl = l.l;
         super.bo = l.n;
         super.bm = l.m;
         super.br = l.N;
         if (l.k != null) {
            var1 = 1 + super.bj.length;
         }

         if (l.l != null) {
            var1 += l.l.length;
         }

         if (var1 * hso_ft.ab > hso_fl.U - 30) {
            super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, var1 * hso_ft.ab - (hso_fl.U - 30));
         } else {
            if (hso_ft.A) {
               super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, 0);
            }

         }
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case -1:
         this.c();
         break;
      case 0:
      case 9:
         if (var1 == 9) {
            bN = true;
         }

         hso_j var6;
         if (this.bv == g) {
            if (super.be && l != null) {
               Service.a().c((byte)4, (short)((short)l.O), (byte)l.u);
               G.d();
               return;
            }

            if (super.bd) {
               Service.a().m((byte)3);
               G.d();
            } else if (G.c() > 0) {
               if ((var6 = (hso_j)G.a(0)) != null) {
                  Service.a().c((byte)2, (short)((short)var6.O), (byte)var6.u);
                  G.d();
               }
            } else {
               hso_ft.a(hso_df.t);
            }
         } else if (this.bv == f) {
            int var7 = -1;
            if (l != null && G.c() > 0) {
               hso_j var9;
               if ((var9 = (hso_j)G.a(0)) != null) {
                  var7 = var9.O;
               }

               Service.a().a(by, l.O, var7, -1, -1);
            } else {
               hso_ft.a(hso_df.H);
            }
         } else if (this.bv == e) {
            if (G.c() > 0) {
               if ((var6 = (hso_j)G.a(0)) != null) {
                  Service.a().a(bx, var6.O, -1, -1, -1);
               }
            } else {
               hso_ft.a(hso_df.K);
            }
         } else {
            int var12;
            if (this.bv == d) {
               if (l != null && G.c() > 0) {
                  int[] var8 = new int[]{-1, -1, -1};

                  for(var12 = 0; var12 < G.c(); ++var12) {
                     hso_j var5;
                     if ((var5 = (hso_j)G.a(var12)) != null) {
                        var8[var12] = var5.O;
                     }
                  }

                  Service.a().a((byte)0, l.O, var8[0], var8[1], var8[2]);
               } else {
                  hso_ft.a(hso_df.O);
               }
            } else if (l != null) {
               String var10 = "";
               var12 = 0;
               hso_es var11 = new hso_es("TabRebuildItem menu");
               if (k[l.z].c != 0) {
                  var11.a(new hso_bt(hso_df.bO, 2, 0, this));
                  var10 = hso_df.ek + hso_j.a((long)k[l.z].c) + " " + hso_df.bO + "?";
                  ++var12;
               }

               if (k[l.z].d != 0) {
                  var11.a(new hso_bt(hso_df.bP, 2, 1, this));
                  var10 = hso_df.ek + k[l.z].d + " " + hso_df.bP + "?";
                  ++var12;
               }

               if (var12 == 2) {
                  var10 = hso_df.eh + hso_j.a((long)k[l.z].c) + " " + hso_df.bO + hso_df.ei + k[l.z].d + " " + hso_df.bP + "?";
               }

               hso_ft.o.a(var11, var10, hso_fq.f, (byte)2, false, 0);
            }
         }
         break;
      case 1:
         if (hso_fl.aU == 0) {
            if ((l == null || this.bv != 0 && this.bv != d) && (m == null || n == null || this.bv != b) && (this.bv != c || s == null) && this.bv != g) {
               bG = false;
            } else {
               bG = !bG;
            }

            if (bG) {
               if (!hso_ft.A) {
                  this.bI.a = hso_df.Z;
               } else {
                  this.bI.a(this.bE + this.bC - 12, this.bF + 10, hso_cf.t, "");
               }
            } else if (!hso_ft.A) {
               this.bI.a = hso_df.bK;
            } else {
               this.bI.a = hso_df.bK;
               this.bI.a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2, (hso_ce)null, this.bI.a);
            }
         }
         break;
      case 2:
         if (l != null) {
            hso_ft.o.f();
            Service.a().b((byte)2, (short)0, (byte)((byte)var2));
            if (hso_fl.aU == 0) {
               bG = false;
               if (!hso_ft.A) {
                  this.bI.a = hso_df.bK;
               } else {
                  this.bI.a = hso_df.bK;
                  this.bI.a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2, (hso_ce)null, this.bI.a);
               }
            }

            hso_ft.a(hso_df.aG, new hso_bt(hso_df.Z, -1));
         }
         break;
      case 3:
         if (n != null && m != null) {
            Service.a().b((byte)1, (short)0);
            hso_ft.a(hso_df.aG, new hso_bt(hso_df.Z, -1));
         }
         break;
      case 4:
         hso_es var3 = new hso_es("TabRebuildItem menu2");
         String var4 = null;
         if (o == null) {
            var4 = hso_df.fw + super.X + "? " + hso_df.fj + ": " + hso_j.a((long)t) + " " + hso_df.bO + ", " + hso_df.bG + x + ", " + hso_df.fu + hso_cf.a(u) + ".";
            var3.a(new hso_bt(hso_df.fv, 5, 0, this));
         } else {
            var4 = hso_df.fD + v + "? " + hso_df.fj + ": " + hso_j.a((long)t) + " " + hso_df.bO + ", " + hso_df.bG + x + ", " + hso_df.fu + hso_cf.a(u) + ".";
            var3.a(new hso_bt(hso_df.fx, 6, 0, this));
         }

         hso_ft.o.a(var3, var4, hso_fq.f, (byte)2, false, 0);
         break;
      case 5:
         hso_ft.o.f();
         Service.a().a((byte)1, (int)w, (short)0);
         break;
      case 6:
         hso_ft.o.f();
         if (o != null) {
            Service.a().a((byte)3, (int)w, (short)((short)o.O));
         }
         break;
      case 7:
         hso_ft.o.f();
         Service.a().b((byte)5, (short)((short)l.O), (byte)((byte)l.u));
         if (hso_fl.aU == 0) {
            bG = false;
            if (!hso_ft.A) {
               this.bI.a = hso_df.bK;
            } else {
               this.bI.a = hso_df.bK;
               this.bI.a(hso_ft.W - hso_bt.j / 2, hso_ft.X - hso_bt.k / 2, (hso_ce)null, this.bI.a);
            }
         }

         hso_ft.a(hso_df.aG, new hso_bt(hso_df.Z, -1));
      case 8:
      }

      super.a(var1, var2);
   }

   public final void b() {
      this.bI.a = hso_df.bK;
      if (this.bv != 0 && this.bv != d && this.bv != e && this.bv != f && this.bv != g) {
         if (this.bv == b) {
            hso_fl.bi = 0;
            if (hso_fl.aU > 0) {
               bG = true;
            }

            if (!hso_ft.A) {
               if (m != null && n != null && !H) {
                  super.Y = this.bI;
                  super.aa = this.bJ;
               }

               super.Z = super.aT;
            } else {
               this.bM.d();
               if (!H && m != null && n != null) {
                  if (hso_fl.aU > 0) {
                     this.bM.a(this.bJ);
                  } else {
                     this.bM.a(this.bI);
                     this.bM.a(this.bJ);
                  }
               }
            }

            super.aY = null;
            E.d();
            B = 0;
            C = -1;
            if (H) {
               n = null;
               m = null;
               H = false;
            }

            if (m == null && n == null) {
               hso_ft.o.a((hso_es)null, hso_df.fn, hso_fq.f, (byte)2, false, 0);
            }

         } else {
            if (this.bv == c) {
               hso_fl.bi = 0;
               if (hso_fl.aU > 0) {
                  bG = true;
               }

               if (!hso_ft.A) {
                  if (!H && s != null) {
                     super.Y = this.bI;
                     this.bK.a = hso_df.fx;
                     if (o == null) {
                        this.bK.a = hso_df.fv;
                     }

                     super.aa = this.bK;
                  }

                  super.Z = super.aT;
               } else {
                  this.bM.d();
                  if (!H && s != null) {
                     this.bK.a = hso_df.fx;
                     if (o == null) {
                        this.bK.a = hso_df.fv;
                     }

                     if (hso_fl.aU > 0) {
                        this.bM.a(this.bK);
                     } else {
                        this.bM.a(this.bI);
                        this.bM.a(this.bK);
                     }
                  }
               }

               super.aY = null;
               E.d();
               B = 0;
               C = 0;
               if (H) {
                  o = null;
                  H = false;
               }
            }

         }
      } else {
         bN = false;
         hso_fl.bi = 0;
         if (hso_fl.aU > 0) {
            bG = true;
         }

         if (!hso_ft.A) {
            if (l != null || this.bv == e || this.bv == g) {
               super.Y = this.bI;
               super.aa = this.bH;
            }

            super.Z = super.aT;
         } else {
            this.bM.d();
            if (l != null) {
               if (hso_fl.aU > 0) {
                  this.bM.a(this.bH);
               } else {
                  this.bM.a(this.bI);
                  this.bM.a(this.bH);
               }
            }

            if (this.bv == e) {
               this.bM.a(this.bH);
               this.bH.a = hso_df.L;
            }

            if (this.bv == g) {
               this.bM.a(this.bH);
               this.bH.a = hso_df.s;
            }
         }

         super.aY = null;
         E.d();
         B = 0;
         C = 0;
         if (l == null && this.bv != e && this.bv != g) {
            String var1 = super.bb ? hso_df.gc : hso_df.ej;
            hso_ft.o.a((hso_es)null, var1, hso_fq.f, (byte)2, false, 0);
         }

      }
   }

   public final void c() {
      if (hso_fl.aU == 0) {
         bG = false;
      }

      hso_fl.bi = 0;
      hso_fl.aO = 0;
      E.d();
      super.c();
   }

   public final void a(mGraphics var1) {
      if (B == 0 && !hso_ft.A && hso_fl.aO == 1) {
         var1.c(super.V + 2, super.W + 2, hso_fl.S - 4, hso_fl.T - 4);
      }

      hso_c var2;
      mGraphics var3;
      int var4;
      int var5;
      if (hso_ft.B) {
         hso_fl.c(var1, super.V + 4, super.W + 4, hso_fl.S - 8, hso_fl.T - 8, 4);
      } else {
         var3 = var1;
         var2 = this;

         for(var4 = 0; var4 <= var2.bz; ++var4) {
            for(var5 = 0; var5 <= var2.bA; ++var5) {
               var2.bB = 12;
               if (var5 == 0) {
                  var2.bB = 12;
               }

               if (var4 == var2.bz) {
                  if (var5 == var2.bA) {
                     var3.a(hso_fl.aP[var2.bB], var2.V + 4 + (hso_fl.S - 8) - 32, var2.W + 4 + hso_fl.T - 8 - 32, 0);
                  } else {
                     var3.a(hso_fl.aP[var2.bB], var2.V + 4 + (hso_fl.S - 8) - 32, var2.W + 4 + (var5 << 5), 0);
                  }
               } else if (var5 == var2.bA) {
                  var3.a(hso_fl.aP[var2.bB], var2.V + 4 + (var4 << 5), var2.W + 4 + hso_fl.T - 8 - 32, 0);
               } else {
                  var3.a(hso_fl.aP[var2.bB], var2.V + 4 + (var4 << 5), var2.W + 4 + (var5 << 5), 0);
               }
            }
         }
      }

      var1.a(super.ba, super.V + hso_fl.S / 2 - 54, super.W + hso_fl.T / 2 - 52, 0);
      var1.a(super.ba, 0, 0, 54, 105, 2, super.V + hso_fl.S / 2, super.W + hso_fl.T / 2 - 52, 0);
      hso_j var12;
      if (this.bv == g) {
         var3 = var1;
         var2 = this;

         for(var4 = 0; var4 < var2.bD.length; ++var4) {
            if (B == 0 || var4 == 5) {
               if (hso_ft.B) {
                  hso_fl.c(var3, var2.bD[var4][0] - 10, var2.bD[var4][1] - 10, 20, 20, 2);
               } else {
                  var3.a(hso_fl.aP[2], 0, 0, 20, 20, 0, var2.bD[var4][0], var2.bD[var4][1], 3);
               }

               if (l != null && var4 == 5 && (B != 5 || var2.bQ > 15L)) {
                  if (l.u == 7) {
                     if ((var12 = hso_bw.b(l.O)) != null) {
                        var12.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
                     } else {
                        hso_bw.c(l.O);
                     }
                  } else {
                     l.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
                  }
               }

               var3.a(hso_cg.ap, var2.bD[var4][0], var2.bD[var4][1], 3);
            }
         }

         for(var4 = 0; var4 < G.c(); ++var4) {
            if ((var12 = (hso_j)G.a(var4)) != null) {
               hso_j var6;
               if ((var6 = hso_bw.b(var12.O)) != null) {
                  var6.c(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 0, 0);
               } else {
                  hso_bw.c(var12.O);
               }

               h[var4].equals("");
            }
         }
      } else if (this.bv == f) {
         var3 = var1;
         var2 = this;

         for(var4 = 0; var4 < var2.bD.length; ++var4) {
            if (B == 0 || var4 == 5) {
               if (hso_ft.B) {
                  hso_fl.c(var3, var2.bD[var4][0] - 10, var2.bD[var4][1] - 10, 20, 20, 2);
               } else {
                  var3.a(hso_fl.aP[2], 0, 0, 20, 20, 0, var2.bD[var4][0], var2.bD[var4][1], 3);
               }

               if (l != null && var4 == 5 && (B != 5 || var2.bQ > 15L)) {
                  l.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
               }

               var3.a(hso_cg.ap, var2.bD[var4][0], var2.bD[var4][1], 3);
            }
         }

         for(var4 = 0; var4 < G.c(); ++var4) {
            if ((var12 = (hso_j)G.a(var4)) != null) {
               var12.c(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 0, 0);
            }
         }
      } else if (this.bv == e) {
         var3 = var1;
         var2 = this;

         for(var4 = 0; var4 < var2.bD.length; ++var4) {
            if (B == 0 || var4 == 5) {
               if (hso_ft.B) {
                  hso_fl.c(var3, var2.bD[var4][0] - 10, var2.bD[var4][1] - 10, 20, 20, 2);
               } else {
                  var3.a(hso_fl.aP[2], 0, 0, 20, 20, 0, var2.bD[var4][0], var2.bD[var4][1], 3);
               }

               if (l != null && var4 == 5 && (B != 5 || var2.bQ > 15L)) {
                  if ((var12 = hso_bw.b(l.O)) != null) {
                     var12.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
                  } else {
                     hso_bw.c(l.O);
                  }
               }

               var3.a(hso_cg.ap, var2.bD[var4][0], var2.bD[var4][1], 3);
            }
         }

         for(var4 = 0; var4 < G.c(); ++var4) {
            if ((var12 = (hso_j)G.a(var4)) != null) {
               var12.c(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 0, 0);
            }
         }
      } else if (this.bv == d) {
         var3 = var1;
         var2 = this;

         for(var4 = 0; var4 < var2.bD.length; ++var4) {
            if (B == 0 || var4 == 5) {
               if (hso_ft.B) {
                  hso_fl.c(var3, var2.bD[var4][0] - 10, var2.bD[var4][1] - 10, 20, 20, 2);
               } else {
                  var3.a(hso_fl.aP[2], 0, 0, 20, 20, 0, var2.bD[var4][0], var2.bD[var4][1], 3);
               }

               if (l != null && var4 == 5 && (B != 5 || var2.bQ > 15L)) {
                  l.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
               }

               var3.a(hso_cg.ap, var2.bD[var4][0], var2.bD[var4][1], 3);
            }
         }

         for(var4 = 0; var4 < G.c(); ++var4) {
            if ((var12 = (hso_j)G.a(var4)) != null) {
               var12.c(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 0, 0);
            }
         }
      } else if (this.bv == 0) {
         var3 = var1;
         var2 = this;

         for(var4 = 0; var4 < var2.bD.length; ++var4) {
            if (B == 0 || var4 == 5) {
               if (hso_ft.B) {
                  hso_fl.c(var3, var2.bD[var4][0] - 10, var2.bD[var4][1] - 10, 20, 20, 2);
               } else {
                  var3.a(hso_fl.aP[2], 0, 0, 20, 20, 0, var2.bD[var4][0], var2.bD[var4][1], 3);
               }

               if (l != null) {
                  if (var2.bb) {
                     if (var4 < 5) {
                        l.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
                     } else if (l.ak != null) {
                        if ((var12 = hso_bw.b(l.ak.O)) != null) {
                           var12.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
                        } else {
                           hso_bw.c(l.ak.O);
                        }
                     }
                  } else if (var4 < 5) {
                     if ((var12 = hso_bw.b(q[var4])) != null) {
                        if (var12.A == 11 && D || var4 < 4 && k[l.z].e[var4] > 0) {
                           if (var12.A == 11 && D && I != null) {
                              I.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 0);
                           } else {
                              var12.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 0);
                           }
                        }
                     } else {
                        hso_bw.c(q[var4]);
                     }
                  } else if (var4 == 5) {
                     if (B != 5 || var2.bQ > 15L) {
                        l.a(var3, var2.bD[var4][0], var2.bD[var4][1], 21, 1, 0);
                     }

                     if (B == 0) {
                        hso_o.j.a(var3, "Lv " + l.z, var2.bD[var4][0], var2.bD[var4][1] - 22, 2, false);
                     }
                  }
               }

               var3.a(hso_cg.ap, var2.bD[var4][0], var2.bD[var4][1], 3);
               if (l != null) {
                  if (var4 < 4 && k[l.z].e[var4] > p[var4]) {
                     var3.a(hso_cg.aq, var2.bD[var4][0], var2.bD[var4][1], 3);
                  } else if (var4 == 5 && B == 5 && C == 4) {
                     var3.a(hso_cg.aq, var2.bD[var4][0], var2.bD[var4][1], 3);
                  }
               }
            }
         }
      } else if (this.bv == b) {
         this.e(var1);
      } else if (this.bv == c) {
         this.b(var1);
      }

      int var10;
      for(var10 = 0; var10 < E.c(); ++var10) {
         ((hso_dx)E.a(var10)).a(var1);
      }

      if (bG || hso_fl.aU > 0) {
         var5 = this.bF;
         var4 = this.bE;
         if (this.bv == g) {
            if (l != null) {
               if (hso_fl.aU > 0 && l.g != null) {
                  hso_fl.a(var1, var4 + hso_fl.aU / 2, var5 - hso_fl.aM / 4, hso_fl.aU, l.g, l.N);
               } else if (l.g != null) {
                  hso_cg.a(var1, var4, var5, this.bC, 150, l.g);
               }
            }

            if (l == null && super.bd || l != null && super.be) {
               this.b(var1, var4, var5 - 10);
            }
         } else if (this.bv == e) {
            if (l != null) {
               if (hso_fl.aU > 0 && l.g != null) {
                  hso_fl.a(var1, var4 + hso_fl.aU / 2, var5 - hso_fl.aM / 4, hso_fl.aU, l.g, l.N);
               } else if (l.g != null) {
                  hso_cg.a(var1, var4, var5, this.bC, 150, l.g);
               }
            }
         } else if (this.bv != d && this.bv != f) {
            if (this.bv == 0) {
               this.c(var1, var4, var5);
            } else if (this.bv == b) {
               if (!H && m != null && n != null) {
                  var10 = hso_ft.ab;
                  int var8;
                  int var9;
                  if (hso_fl.aU > 0) {
                     hso_o.f.a(var1, hso_df.fk, var4 + hso_fl.aU / 2, var5 - hso_fl.aM / 4, 2, false);
                     var9 = var5 + hso_fl.aM - hso_ft.ab + hso_ft.ab / 4;
                     var8 = var4 + 4;
                  } else {
                     hso_cg.a(var1, var4, var5, this.bC, 100, hso_df.fk);
                     var9 = var5 + hso_ft.aa + 2;
                     var8 = var4 + 4;
                  }

                  hso_fl.a(m.N).a(var1, m.g, var8, var9, 0, false);
                  var9 += var10;
                  hso_fl.a(n.N).a(var1, n.g, var8, var9, 0, false);
                  var9 += var10;
                  hso_o.j.a(var1, hso_df.fo, var8, var9, 0, false);
                  var9 += var10;
                  hso_o.f.a(var1, m.z - 2 + " > " + m.z, var8, var9, 0, false);
               }
            } else if (this.bv == c) {
               this.a(var1, var4, var5);
            }
         } else if (l != null) {
            this.c(var1, false);
         }
      }

      if (!hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && (hso_fl.aO == 1 || hso_fl.aU > 0) && this.bM != null) {
         for(var10 = 0; var10 < this.bM.c(); ++var10) {
            hso_bt var11;
            (var11 = (hso_bt)this.bM.a(var10)).a(var1, var11.h, var11.i);
         }
      }

   }

   private void b(mGraphics var1) {
      for(int var2 = 0; var2 < this.bD.length; ++var2) {
         if (hso_ft.B) {
            hso_fl.c(var1, this.bD[var2][0] - 10, this.bD[var2][1] - 10, 20, 20, 2);
         } else {
            var1.a(hso_fl.aP[2], 0, 0, 20, 20, 0, this.bD[var2][0], this.bD[var2][1], 3);
         }

         if (var2 == 6) {
            if (o != null) {
               o.a(var1, this.bD[6][0], this.bD[6][1], 21, 1, 0);
               if (B == 0) {
                  hso_o.j.a(var1, "Lv " + o.z, this.bD[6][0], this.bD[6][1] - 22, 2, false);
               }
            }
         } else if (s != null && var2 < s.length && B == 0) {
            hso_j var3;
            if ((var3 = hso_bw.b(s[var2].a)) != null) {
               var3.a(var1, this.bD[var2][0], this.bD[var2][1], 21, 0, 0);
               if (r[var2] >= s[var2].b) {
                  hso_o.j.a(var1, "" + s[var2].b, this.bD[var2][0], this.bD[var2][1] + 11, 2, false);
               } else {
                  hso_o.m.a(var1, "" + s[var2].b, this.bD[var2][0], this.bD[var2][1] + 11, 2, false);
               }
            } else {
               hso_bw.c(s[var2].a);
            }
         }

         var1.a(hso_cg.ap, this.bD[var2][0], this.bD[var2][1], 3);
      }

   }

   public static void a(hso_j var0) {
      G.a(var0);
   }

   public static void a(hso_bw var0) {
      for(int var1 = 0; var1 < G.c(); ++var1) {
         hso_j var2;
         if ((var2 = (hso_j)G.a(var1)) != null && var2.O == var0.O) {
            G.d(var2);
         }
      }

   }

   public static boolean b(hso_bw var0) {
      for(int var1 = 0; var1 < G.c(); ++var1) {
         hso_j var2;
         if ((var2 = (hso_j)G.a(var1)) != null && var2.O == var0.O) {
            return true;
         }
      }

      return false;
   }

   private void a(mGraphics var1, int var2, int var3) {
      if (s != null) {
         int var4 = hso_ft.ab;
         if (hso_fl.aU > 0) {
            hso_fl.a(var1, var2 + hso_fl.aU / 2, var3 - hso_fl.aM / 4, hso_fl.aU, v, 5);
            var3 += hso_fl.aM - hso_ft.ab + hso_ft.ab / 4;
            var2 += 4;
         } else {
            hso_cg.a(var1, var2, var3, this.bC, 150, v);
            var3 += hso_ft.aa + 2;
            var2 += 4;
         }

         hso_o.j.a(var1, hso_df.bG + x, var2, var3, 0, false);
         var3 += var4;
         hso_o.j.a(var1, hso_df.fu + hso_cf.a(u), var2, var3, 0, false);
         var3 += var4;

         for(int var5 = 0; var5 < s.length; ++var5) {
            hso_j var6;
            if ((var6 = hso_bw.b(s[var5].a)) != null) {
               hso_o var7 = hso_o.j;
               if (s[var5].b > r[var5]) {
                  var7 = hso_o.m;
               }

               if (var6.g != null) {
                  var7.a(var1, var6.g, var2 + 4, var3, 0, false);
               }

               var7.a(var1, s[var5].b + "/" + r[var5], var2 + this.bC / 2 + 10, var3, 0, false);
               var3 += var4;
            } else {
               hso_bw.c(s[var5].a);
            }
         }

      }
   }

   private void b(mGraphics var1, int var2, int var3) {
      int var4 = hso_ft.ab - 2;
      if (hso_fl.aU > 0) {
         var3 += hso_fl.aM - hso_ft.ab + hso_ft.ab / 4;
         var2 += 4;
      } else {
         String var5 = hso_df.bK;
         if (l != null && l.g != null) {
            var5 = l.g;
         }

         hso_cg.a(var1, var2, var3, this.bC, 150, var5);
         var3 += hso_ft.aa + 2;
         var2 += 4;
      }

      var3 += var4;
      byte var9 = 0;
      if (!hso_ft.A) {
         var9 = 20;
      }

      hso_ft.a(var1);
      if (hso_ft.A) {
         this.bO.a(G.c() + 2, hso_ft.ab + 2, var2, var3 - (hso_ft.ab << 1), this.bC, var4 * (G.c() + 2) << 1, true, 1);
         this.bO.a(var1, var2, var3, this.bC, var4 * (G.c() + 2) << 1);
      }

      hso_o.f.a(var1, hso_df.ed, var2, var3 - var9, 0, false);
      var3 += var4;

      for(int var8 = 0; var8 < G.c(); ++var8) {
         hso_j var6;
         if ((var6 = (hso_j)G.a(var8)) != null) {
            hso_j var7;
            if ((var7 = hso_bw.b(var6.O)) != null) {
               hso_o var10 = hso_o.o;
               if (var7.g != null && !var7.g.equals("")) {
                  hso_fl.b(var7.N).a(var1, var7.g, var2 + 4, var3 - var9, 0, true);
               }

               if (i[var8] == 0) {
                  var10 = hso_o.m;
               }

               var3 += var4;
               hso_o.j.a(var1, hso_df.eZ + " ", var2 + 4, var3 - var9, 0, true);
               var10.a(var1, h[var8], var2 + 50, var3 - var9, 0, true);
               var3 += var4;
            } else {
               hso_bw.c(var6.O);
            }
         }
      }

      hso_ft.a(var1);
   }

   private void c(mGraphics var1, int var2, int var3) {
      if (l != null) {
         int var4 = hso_ft.ab - 2;
         if (hso_fl.aU > 0) {
            if (l.g != null) {
               hso_fl.a(var1, var2 + hso_fl.aU / 2, var3 - hso_fl.aM / 4, hso_fl.aU, l.g, l.N);
            }

            if (l.z >= 15) {
               return;
            }

            var3 += hso_fl.aM - hso_ft.ab + hso_ft.ab / 4;
            var2 += 4;
         } else {
            hso_cg.a(var1, var2, var3, this.bC, 150, l.g);
            var3 += hso_ft.aa + 2;
            var2 += 4;
         }

         if (!super.bb) {
            if (l.z < 15) {
               hso_o.b.a(var1, "+" + l.z + " > +" + (l.z + 1), var2, var3, 0, false);
            }

            var3 += var4;
            hso_o.f.a(var1, hso_df.ed, var2, var3, 0, false);
            var3 += var4;

            for(int var9 = 0; var9 < k[l.z].e.length; ++var9) {
               hso_o var11 = hso_o.j;
               if (k[l.z].e[var9] > p[var9]) {
                  var11 = hso_o.m;
               }

               hso_j var12;
               if ((var12 = hso_bw.b(q[var9])) != null) {
                  j[var9] = var12.g;
               } else {
                  hso_bw.c(q[var9]);
               }

               if (j[var9] != null) {
                  var11.a(var1, j[var9], var2 + 4, var3, 0, false);
               }

               var11.a(var1, k[l.z].e[var9] + "/" + p[var9], var2 + this.bC / 2 + 10, var3, 0, false);
               var3 += var4;
            }

            hso_o.f.a(var1, hso_df.ee, var2, var3, 0, false);
            var3 += var4;
            hso_o.j.a(var1, z, var2 + 4, var3, 0, false);
            var3 += var4;
            hso_o.f.a(var1, hso_df.ec, var2, var3, 0, false);
            var3 += var4 - 2;
            if (k[l.z].c == 0) {
               hso_o.j.a(var1, k[l.z].d + " " + hso_df.bP, var2 + 4, var3, 0, false);
            } else if (k[l.z].d == 0) {
               hso_o.j.a(var1, k[l.z].c + " " + hso_df.bO, var2 + 4, var3, 0, false);
            } else {
               hso_o.j.a(var1, k[l.z].c + " " + hso_df.bO + hso_df.ef + k[l.z].d + " " + hso_df.bP, var2 + 4, var3, 0, false);
            }
         } else if (l.ak != null) {
            String[] var5 = null;
            boolean var6 = false;
            hso_o.b.a(l.I[0]);
            boolean var7 = false;
            int var10 = (var5 = hso_o.b.a(l.I[0], hso_fl.aU == 0 ? this.bz - 1 << 5 : hso_fl.aU)).length;

            for(int var8 = 0; var8 < var10; ++var8) {
               hso_o.b.a(var1, var5[var8], var2, var3, 0, false);
               var3 += var4;
            }

            hso_o.f.a(var1, hso_df.ec, var2, var3, 0, false);
            var3 += var4 - 2;
            hso_o.j.a(var1, l.I[1], var2 + 4, var3, 0, false);
         }
      }
   }

   private void e(mGraphics var1) {
      for(int var2 = 0; var2 < this.bD.length; ++var2) {
         if (hso_ft.B) {
            hso_fl.c(var1, this.bD[var2][0] - 10, this.bD[var2][1] - 10, 20, 20, 2);
         } else {
            var1.a(hso_fl.aP[2], 0, 0, 20, 20, 0, this.bD[var2][0], this.bD[var2][1], 3);
         }

         if (m != null && var2 == 0) {
            m.a(var1, this.bD[0][0], this.bD[0][1], 21, 1, 0);
            if (B == 0) {
               hso_o.j.a(var1, "Lv " + m.z, this.bD[0][0], this.bD[0][1] - 22, 2, false);
            }
         }

         if (n != null && var2 == 1) {
            n.a(var1, this.bD[1][0], this.bD[1][1], 21, 1, 0);
            if (B == 0) {
               hso_o.j.a(var1, "Lv " + n.z, this.bD[1][0], this.bD[1][1] - 22, 2, false);
            }
         }

         var1.a(hso_cg.ap, this.bD[var2][0], this.bD[var2][1], 3);
      }

   }

   public final void d() {
      if (B == 0) {
         if (hso_ft.al[4] || hso_ft.al[6]) {
            hso_fl.aO = 0;
            hso_ft.m();
         }

         super.d();
      }
   }

   public final void a() {
      hso_c var1;
      hso_j var2;
      int var3;
      int var5;
      if (this.bv == 0) {
         var1 = this;
         if (bN && B == 2) {
            B = C;
            this.bQ = 0L;
         }

         if (B == 1) {
            if (hso_fl.aU == 0) {
               bG = false;
            }

            hso_ft.j();
            if (!hso_ft.A) {
               super.Y = null;
               super.aa = null;
            } else {
               this.bM.d();
            }

            if (l != null) {
               E.d();

               for(var5 = 0; var5 < k[l.z].e.length; ++var5) {
                  if (k[l.z].e[var5] > 0) {
                     a(31, var1.bD[var5][0], var1.bD[var5][1], var1.bD[5][0], var1.bD[5][1], 1);
                  }
               }

               if (D) {
                  a(31, var1.bD[4][0], var1.bD[4][1], var1.bD[5][0], var1.bD[5][1], 1);
               }
            }

            B = 2;
            var1.bQ = 0L;
         } else if (B == 2) {
            if (this.bQ < 10L) {
               ++this.bQ;
               if (this.bQ == 10L) {
               }
            } else {
               if (hso_ft.aj - this.bQ > 12000L) {
                  this.bQ = hso_ft.aj;
                  a(29, this.bD[5][0], this.bD[5][1], 12100);
               }

               if (hso_ft.aj - this.bQ > 3700L && (C == 3 || C == 4)) {
                  B = C;
                  this.bQ = 0L;
               }
            }
         } else if (B == 3) {
            E.d();
            a(32, this.bD[5][0], this.bD[5][1] - 11);
            a(33, this.bD[5][0], this.bD[5][1]);
            a(34, this.bD[5][0], this.bD[5][1]);
            B = 5;
            this.bQ = 0L;
         } else if (B == 4) {
            E.d();
            a(11, this.bD[5][0], this.bD[5][1]);
            a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
            a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
            B = 5;
            this.bQ = 0L;
         } else if (B == 5) {
            ++this.bQ;
            var2 = (hso_j)hso_bw.a(l.u, (short)l.O);
            if (!super.bb) {
               if (var2 != null) {
                  l = hso_j.a(var2.O, var2.i, var2.t, var2.z, var2.N, var2.M, var2.u, var2.j, var2.R, false, var2.v, var2.q, (short)var2.S, var2.x, var2.y, var2.p, (byte)0, (byte)0);
               } else {
                  l = null;
               }
            }

            z = A;
            if (E.c() == 0 || this.bQ >= 100L) {
               if (!bN) {
                  hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
               } else if (C == 3) {
                  hso_ft.c(hso_df.f);
               } else if (C == 4) {
                  hso_ft.c(hso_df.g);
               }

               this.bQ = 0L;
               B = 6;
            }
         } else if (B == 6) {
            bN = false;
            if (l.z == 15) {
               l = null;
            }

            if (super.bb && l != null) {
               l = null;
            }

            B = 0;
            if (D) {
               var3 = 0;

               while(true) {
                  if (var3 >= hso_bw.V.c()) {
                     D = false;
                     break;
                  }

                  if ((var2 = (hso_j)hso_bw.V.a(var3)).u == 7 && var2.A == 11 && I != null && I.O == var2.O) {
                     Service.a().b((byte)0, (short)((short)var2.O), (byte)((byte)var2.u));
                     break;
                  }

                  ++var3;
               }
            }

            if (!hso_ft.A) {
               super.Y = this.bI;
               super.aa = this.bH;
               hso_fl.aO = 0;
            } else {
               this.bM.d();
               if (l != null) {
                  if (hso_fl.aU > 0) {
                     this.bM.a(this.bH);
                  } else {
                     this.bM.a(this.bI);
                     this.bM.a(this.bH);
                  }
               }
            }
         }

         if (super.bb) {
            this.bH.a = hso_df.gd;
            this.bH.e = 7;
         } else {
            this.bH.a = hso_df.eg;
            this.bH.e = 0;
         }
      } else if (this.bv == b) {
         if (B == 1) {
            if (m != null && n != null) {
               if (hso_fl.aU == 0) {
                  bG = false;
               }

               hso_ft.j();
               if (!hso_ft.A) {
                  super.Y = null;
                  super.aa = null;
               } else {
                  this.bM.d();
               }

               E.d();
               a(37, this.bD[0][0], this.bD[0][1], this.bD[1][0], this.bD[1][1], m.z);
               this.bP = m.z * 120;
               B = 2;
               this.bQ = 0L;
            } else {
               B = 0;
            }
         } else if (B == 2) {
            if (this.bQ < 10L) {
               ++this.bQ;
               if (this.bQ == 10L) {
               }
            } else {
               if (this.bQ == 10L) {
                  this.bQ = hso_ft.aj;
                  a(29, this.bD[1][0], this.bD[1][1], 1200 + this.bP);
               }

               if (hso_ft.aj - this.bQ > (long)(2000 + this.bP)) {
                  E.d();
                  B = 3;
                  this.bQ = 0L;
               }
            }
         } else if (B == 3) {
            hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
            if (m != null) {
               if ((var2 = (hso_j)hso_bw.a(m.u, (short)m.O)) != null) {
                  m = hso_j.a(var2.O, var2.i, var2.t, var2.z, var2.N, var2.M, var2.u, var2.j, var2.R, false, var2.v, var2.q, (short)var2.S, var2.x, var2.y, var2.p, (byte)0, (byte)0);
               } else {
                  m = null;
               }
            }

            if (n != null) {
               if ((var2 = (hso_j)hso_bw.a(n.u, (short)n.O)) != null) {
                  n = hso_j.a(var2.O, var2.i, var2.t, var2.z, var2.N, var2.M, var2.u, var2.j, var2.R, false, var2.v, var2.q, (short)var2.S, var2.x, var2.y, var2.p, (byte)0, (byte)0);
               } else {
                  n = null;
               }
            }

            B = 0;
            H = true;
            this.bM.d();
            bG = false;
            super.aa = null;
            super.Y = null;
         }
      } else if (this.bv == c) {
         var1 = this;
         if (B == 1) {
            if (hso_fl.aU == 0) {
               bG = false;
            }

            hso_ft.j();
            if (!hso_ft.A) {
               super.Y = null;
               super.aa = null;
            } else {
               this.bM.d();
            }

            if (s != null) {
               E.d();

               for(var5 = 0; var5 < s.length; ++var5) {
                  a(31, var1.bD[var5][0], var1.bD[var5][1], var1.bD[6][0], var1.bD[6][1], 1);
               }
            }

            B = 2;
            var1.bQ = 0L;
         } else if (B == 2) {
            if (this.bQ < 10L) {
               ++this.bQ;
               if (this.bQ == 10L) {
               }
            } else {
               if (hso_ft.aj - this.bQ > 12000L) {
                  this.bQ = hso_ft.aj;
                  a(29, this.bD[6][0], this.bD[6][1], 12100);
               }

               if (hso_ft.aj - this.bQ > 3700L) {
                  B = 3;
                  this.bQ = 0L;
               }
            }
         } else if (B == 3) {
            E.d();
            if (o != null) {
               a(32, this.bD[6][0], this.bD[6][1] - 11);
            }

            a(33, this.bD[6][0], this.bD[6][1]);
            a(34, this.bD[6][0], this.bD[6][1]);
            B = 5;
            this.bQ = 0L;
         } else if (B == 5) {
            ++this.bQ;
            if ((var2 = (hso_j)hso_bw.a(3, (short)y)) != null) {
               o = hso_j.a(var2.O, var2.i, var2.t, var2.z, var2.N, var2.M, var2.u, var2.j, var2.R, false, var2.v, var2.q, (short)var2.S, var2.x, var2.y, var2.p, (byte)0, (byte)0);
            } else {
               o = null;
            }

            if (E.c() == 0 || this.bQ >= 100L) {
               hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
               this.bQ = 0L;
               B = 6;
            }
         } else if (B == 6) {
            s = null;
            H = true;
            B = 0;
            if (!hso_ft.A) {
               super.Y = null;
               super.aa = null;
               hso_fl.aO = 0;
            } else {
               this.bM.d();
            }
         }
      } else {
         byte var8;
         if (this.bv == d) {
            var1 = this;
            if (l != null && J > 0) {
               this.f();
            }

            if (J > 0) {
               --J;
            }

            if (B == 1) {
               if (hso_fl.aU == 0) {
                  bG = false;
               }

               hso_ft.j();
               if (!hso_ft.A) {
                  super.Y = null;
                  super.aa = null;
               } else {
                  this.bM.d();
               }

               if (l != null) {
                  E.d();
                  if ((var8 = l.z) > 14) {
                     var8 = 14;
                  }

                  for(var3 = 0; var3 < k[var8].e.length; ++var3) {
                     if (k[var8].e[var3] > 0) {
                        a(31, var1.bD[var3][0], var1.bD[var3][1], var1.bD[5][0], var1.bD[5][1], 1);
                     }
                  }

                  if (D) {
                     a(31, var1.bD[4][0], var1.bD[4][1], var1.bD[5][0], var1.bD[5][1], 1);
                  }
               }

               B = 2;
               var1.bQ = 0L;
            } else if (B == 2) {
               if (this.bQ < 10L) {
                  ++this.bQ;
                  if (this.bQ == 10L) {
                  }
               } else {
                  if (hso_ft.aj - this.bQ > 12000L) {
                     this.bQ = hso_ft.aj;
                     a(29, this.bD[5][0], this.bD[5][1], 12100);
                  }

                  if (hso_ft.aj - this.bQ > 3700L && (C == 3 || C == 4)) {
                     B = C;
                     this.bQ = 0L;
                  }
               }
            } else if (B == 3) {
               E.d();
               a(32, this.bD[5][0], this.bD[5][1] - 11);
               a(33, this.bD[5][0], this.bD[5][1]);
               a(34, this.bD[5][0], this.bD[5][1]);
               B = 5;
               this.bQ = 0L;
            } else if (B == 4) {
               E.d();
               a(11, this.bD[5][0], this.bD[5][1]);
               a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
               a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
               B = 5;
               this.bQ = 0L;
            } else if (B == 5) {
               ++this.bQ;
               var2 = (hso_j)hso_bw.a(l.u, (short)l.O);
               if (!super.bb) {
                  if (var2 != null) {
                     l = hso_j.a(var2.O, var2.i, var2.t, var2.z, var2.N, var2.M, var2.u, var2.j, var2.R, false, var2.v, var2.q, (short)var2.S, var2.x, var2.y, var2.p, (byte)0, (byte)0);
                  } else {
                     l = null;
                  }
               }

               z = A;
               if (E.c() == 0 || this.bQ >= 100L) {
                  hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
                  this.bQ = 0L;
                  B = 6;
               }

               J = 1;
            } else if (B == 6) {
               if (l.z == 15) {
                  l = null;
               }

               if (super.bb && l != null) {
                  l = null;
               }

               B = 0;
               if (!hso_ft.A) {
                  super.Y = this.bI;
                  super.aa = this.bH;
                  hso_fl.aO = 0;
               } else {
                  this.bM.d();
                  if (l != null) {
                     if (hso_fl.aU > 0) {
                        this.bM.a(this.bH);
                     } else {
                        this.bM.a(this.bI);
                        this.bM.a(this.bH);
                     }
                  }
               }
            }

            this.bH.a = hso_df.Q;
            this.bH.e = 0;
         } else if (this.bv == e) {
            var1 = this;
            if (B != 1) {
               if (B == 2) {
                  if (this.bQ < 10L) {
                     ++this.bQ;
                     if (this.bQ == 10L) {
                     }
                  } else {
                     if (hso_ft.aj - this.bQ > 12000L) {
                        this.bQ = hso_ft.aj;
                        a(29, this.bD[5][0], this.bD[5][1], 12100);
                     }

                     if (hso_ft.aj - this.bQ > 3700L && (C == 3 || C == 4)) {
                        B = C;
                        this.bQ = 0L;
                     }
                  }
               } else if (B == 3) {
                  E.d();
                  a(32, this.bD[5][0], this.bD[5][1] - 11);
                  a(33, this.bD[5][0], this.bD[5][1]);
                  a(34, this.bD[5][0], this.bD[5][1]);
                  B = 5;
                  this.bQ = 0L;
               } else if (B == 5) {
                  ++this.bQ;
                  if (E.c() == 0 || this.bQ >= 100L) {
                     hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
                     this.bQ = 0L;
                     B = 6;
                  }
               } else if (B == 6) {
                  if (l.z == 15) {
                     l = null;
                  }

                  if (super.bb && l != null) {
                     l = null;
                  }

                  B = 0;
                  if (!hso_ft.A) {
                     super.Y = this.bI;
                     super.aa = this.bH;
                     hso_fl.aO = 0;
                  } else {
                     this.bM.d();
                     if (l != null) {
                        if (hso_fl.aU > 0) {
                           this.bM.a(this.bH);
                        } else {
                           this.bM.a(this.bI);
                           this.bM.a(this.bH);
                        }
                     }
                  }
               }
            } else {
               if (hso_fl.aU == 0) {
                  bG = false;
               }

               hso_ft.j();
               if (!hso_ft.A) {
                  super.Y = null;
                  super.aa = null;
               } else {
                  this.bM.d();
               }

               if (l != null) {
                  E.d();

                  for(var5 = 0; var5 < k[l.z].e.length; ++var5) {
                     if (k[l.z].e[var5] > 0) {
                        a(31, var1.bD[var5][0], var1.bD[var5][1], var1.bD[5][0], var1.bD[5][1], 1);
                     }
                  }

                  if (D) {
                     a(31, var1.bD[4][0], var1.bD[4][1], var1.bD[5][0], var1.bD[5][1], 1);
                  }
               }

               B = 2;
               var1.bQ = 0L;
            }

            this.bH.a = hso_df.L;
            this.bH.e = 0;
         } else if (this.bv == f) {
            var1 = this;
            if (l != null && J > 0) {
               this.f();
            }

            if (J > 0) {
               --J;
            }

            if (B == 1) {
               if (hso_fl.aU == 0) {
                  bG = false;
               }

               hso_ft.j();
               if (!hso_ft.A) {
                  super.Y = null;
                  super.aa = null;
               } else {
                  this.bM.d();
               }

               if (l != null) {
                  E.d();
                  if ((var8 = l.z) > 14) {
                     var8 = 14;
                  }

                  for(var3 = 0; var3 < k[var8].e.length; ++var3) {
                     if (k[var8].e[var3] > 0) {
                        a(31, var1.bD[var3][0], var1.bD[var3][1], var1.bD[5][0], var1.bD[5][1], 1);
                     }
                  }

                  if (D) {
                     a(31, var1.bD[4][0], var1.bD[4][1], var1.bD[5][0], var1.bD[5][1], 1);
                  }
               }

               B = 2;
               var1.bQ = 0L;
            } else if (B == 2) {
               if (this.bQ < 10L) {
                  ++this.bQ;
                  if (this.bQ == 10L) {
                  }
               } else {
                  if (hso_ft.aj - this.bQ > 12000L) {
                     this.bQ = hso_ft.aj;
                     a(29, this.bD[5][0], this.bD[5][1], 12100);
                  }

                  if (hso_ft.aj - this.bQ > 3700L && (C == 3 || C == 4)) {
                     B = C;
                     this.bQ = 0L;
                  }
               }
            } else if (B == 3) {
               E.d();
               a(32, this.bD[5][0], this.bD[5][1] - 11);
               a(33, this.bD[5][0], this.bD[5][1]);
               a(34, this.bD[5][0], this.bD[5][1]);
               B = 5;
               this.bQ = 0L;
            } else if (B == 4) {
               E.d();
               a(11, this.bD[5][0], this.bD[5][1]);
               a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
               a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
               B = 5;
               this.bQ = 0L;
            } else if (B == 5) {
               ++this.bQ;
               var2 = (hso_j)hso_bw.a(l.u, (short)l.O);
               if (!super.bb) {
                  if (var2 != null) {
                     l = hso_j.a(var2.O, var2.i, var2.t, var2.z, var2.N, var2.M, var2.u, var2.j, var2.R, false, var2.v, var2.q, (short)var2.S, var2.x, var2.y, var2.p, (byte)0, (byte)0);
                  } else {
                     l = null;
                  }
               }

               z = A;
               if (E.c() == 0 || this.bQ >= 100L) {
                  hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
                  this.bQ = 0L;
                  B = 6;
               }

               J = 1;
            } else if (B == 6) {
               if (l.z == 15) {
                  l = null;
               }

               if (super.bb && l != null) {
                  l = null;
               }

               B = 0;
               if (!hso_ft.A) {
                  super.Y = this.bI;
                  super.aa = this.bH;
                  hso_fl.aO = 0;
               } else {
                  this.bM.d();
                  if (l != null) {
                     if (hso_fl.aU > 0) {
                        this.bM.a(this.bH);
                     } else {
                        this.bM.a(this.bI);
                        this.bM.a(this.bH);
                     }
                  }
               }
            }

            this.bH.a = hso_df.I;
            this.bH.e = 0;
         } else if (this.bv == g) {
            var1 = this;
            if (l != null && J > 0) {
               this.f();
            }

            if (J > 0) {
               --J;
            }

            if (B != 1) {
               if (B == 2) {
                  if (this.bQ < 10L) {
                     ++this.bQ;
                     if (this.bQ == 10L) {
                     }
                  } else {
                     if (hso_ft.aj - this.bQ > 12000L) {
                        this.bQ = hso_ft.aj;
                        a(29, this.bD[5][0], this.bD[5][1], 12100);
                     }

                     if (hso_ft.aj - this.bQ > 3700L && (C == 3 || C == 4)) {
                        B = C;
                        this.bQ = 0L;
                     }
                  }
               } else if (B == 3) {
                  E.d();
                  a(32, this.bD[5][0], this.bD[5][1] - 11);
                  a(33, this.bD[5][0], this.bD[5][1]);
                  a(34, this.bD[5][0], this.bD[5][1]);
                  B = 5;
                  this.bQ = 0L;
               } else if (B == 4) {
                  E.d();
                  a(11, this.bD[5][0], this.bD[5][1]);
                  a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
                  a(69, this.bD[5][0], this.bD[5][1] - 11, 300);
                  B = 5;
                  this.bQ = 0L;
               } else if (B == 5) {
                  ++this.bQ;
                  if (E.c() == 0 || this.bQ >= 100L) {
                     hso_ft.o.a((hso_es)null, F, hso_fq.f, (byte)2, false, 0);
                     this.bQ = 0L;
                     B = 6;
                  }
               } else if (B == 6) {
                  if (l.z == 15) {
                     l = null;
                  }

                  if (super.bb && l != null) {
                     l = null;
                  }

                  B = 0;
                  if (!hso_ft.A) {
                     super.Y = this.bI;
                     super.aa = this.bH;
                     hso_fl.aO = 0;
                  } else {
                     this.bM.d();
                     if (l != null) {
                        if (hso_fl.aU > 0) {
                           this.bM.a(this.bH);
                        } else {
                           this.bM.a(this.bI);
                           this.bM.a(this.bH);
                        }
                     }
                  }
               }
            } else {
               if (hso_fl.aU == 0) {
                  bG = false;
               }

               hso_ft.j();
               if (!hso_ft.A) {
                  super.Y = null;
                  super.aa = null;
               } else {
                  this.bM.d();
               }

               if (l != null) {
                  E.d();
                  if ((var8 = l.z) > 14) {
                     var8 = 14;
                  }

                  for(var3 = 0; var3 < k[var8].e.length; ++var3) {
                     if (k[var8].e[var3] > 0) {
                        a(31, var1.bD[var3][0], var1.bD[var3][1], var1.bD[5][0], var1.bD[5][1], 1);
                     }
                  }

                  if (D) {
                     a(31, var1.bD[4][0], var1.bD[4][1], var1.bD[5][0], var1.bD[5][1], 1);
                  }
               }

               B = 2;
               var1.bQ = 0L;
            }

            hso_cq var6;
            if (!(var6 = this.bO.a()).a) {
               var6.getClass();
            }

            this.bO.b();
            this.bH.a = hso_df.s;
            this.bH.e = 0;
         }
      }

      for(int var7 = 0; var7 < E.c(); ++var7) {
         hso_dx var4;
         (var4 = (hso_dx)E.a(var7)).a();
         if (var4.y) {
            E.d(var4);
         }
      }

   }

   public final void e() {
      if (B == 0) {
         if (this.bM != null && !hso_ft.o.a && hso_ft.r == null && hso_ft.s == null && (hso_fl.aO == 1 || hso_fl.aU > 0)) {
            for(int var1 = 0; var1 < this.bM.c(); ++var1) {
               ((hso_bt)this.bM.a(var1)).b();
            }
         }

         super.e();
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      hso_cx var6 = new hso_cx(var0, var1, var2, var3, var4, var5);
      E.a(var6);
   }

   public static void a(int var0, int var1, int var2) {
      hso_cx var3 = new hso_cx(var0, var1, var2);
      E.a(var3);
   }

   private static void a(int var0, int var1, int var2, int var3) {
      hso_i var4 = new hso_i(var0, var1, var2, var3, (short)0, (byte)0);
      E.a(var4);
   }
}
