public final class hso_cc extends hso_au {
   private static byte[][][] a = new byte[][][]{{new byte[8], new byte[8], new byte[8]}, {{0, 0, 1, 1, 0, 0, 2, 2}, {1, 1, 0, 0, 2, 2, 0, 0}, {2, 2, 0, 0, 1, 1, 0, 0}}, {{2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}}};
   private static byte[][][] b = new byte[][][]{{new byte[6], new byte[6], new byte[6]}, {{0, 0, 1, 1, 2, 2}, {1, 1, 0, 0, 2, 2}, {2, 2, 0, 0, 1, 1}}, {{2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}};
   private static byte[][][] c = new byte[][][]{{new byte[6], new byte[6], new byte[6]}, {{1, 1, 1, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {1, 1, 1, 0, 0, 0}}, {{2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}};
   private static byte[][][] d = new byte[][][]{{new byte[12], new byte[12], new byte[12]}, {{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, {1, 1, 1, 1, 0, 0, 0, 0, 2, 2, 2, 2}, {2, 2, 2, 2, 0, 0, 0, 0, 1, 1, 1, 1}}, {{2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, {2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, {2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}}};
   private static byte[][][] e = new byte[][][]{{{4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4}, {4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4}, {4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4}}, {{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4}, {4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4}, {4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}}};

   public final boolean q_() {
      return super.di == 12;
   }

   private boolean W() {
      return super.di == 16;
   }

   public final boolean w() {
      return super.di == 13;
   }

   public hso_cc(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
      super.cu = 1;
      super.di = var3;
      super.ct = var1;
      super.B = var2;
      super.F = var5;
      super.G = var6;
      super.aY = var5;
      super.aZ = var6;
      super.cB = var4;
      super.bs = var7;
      super.br = var7;
      super.by = (short)var8;
      super.M = 1;
      super.Direction = 0;
      super.N = 5;
      super.bd = super.be = -1;
      super.bi = 3;
      super.C = 60;
      super.A = hso_ak.c(50, 70);
      super.D = 50;
      super.bn = 0;
      super.bo = -2;
      switch(var3) {
      case 0:
         if ((var1 = super.B) != 101 && var1 != 83 && var1 != 84) {
            super.z = b;
         } else {
            super.z = d;
         }
         break;
      case 1:
         super.z = c;
         break;
      case 2:
         super.z = a;
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 11:
      case 13:
      case 14:
      case 15:
      default:
         break;
      case 4:
         super.M = 0;
         super.z = b;
         break;
      case 6:
         super.D = 80;
         super.z = b;
         break;
      case 9:
         super.M = 0;
         super.z = b;
         super.D = 80;
         break;
      case 12:
      case 16:
      case 18:
         super.z = new byte[][][]{{new byte[6], new byte[6], new byte[6]}, {new byte[6], new byte[6], new byte[6]}, {new byte[6], new byte[6], new byte[6]}, {new byte[6], new byte[6], new byte[6]}, {new byte[6], new byte[6], new byte[6]}};
         super.N = 1;
         break;
      case 17:
         super.z = e;
      }

      super.cY = hso_dw.a();
   }

   public final void a(mGraphics var1) {
      if (super.dO != 1 || super.B != 103 && super.B != 149) {
         if (super.di != 18) {
            if (!super.dj) {
               this.e(var1, super.aY, super.aZ);
               this.f(var1);
               hso_fd var2 = hso_bk.c((short)super.B);
               int var3;
               if ((var3 = super.cF) > super.z.length - 1) {
                  var3 = 0;
               }

               if (super.ba > super.z[var3][super.Direction > 2 ? 2 : super.Direction].length - 1) {
                  super.ba = 0;
               }

               if (var2.a == null) {
                  super.dR = false;
               } else {
                  if (super.bd < 0) {
                     if (super.B > 92 && super.di != 16) {
                        super.be = aq.b(var2.a.a) / 3;
                        super.bd = aq.a(var2.a.a) / 2;
                     } else {
                        super.be = aq.b(var2.a.a) / super.N;
                        super.bd = aq.a(var2.a.a);
                     }
                  }

                  int var4 = 0;
                  int var5 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] * super.be;
                  if (super.B > 92) {
                     var4 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] / 3 * super.bd;
                     var5 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] % 3 * super.be;
                  }

                  this.g(var1, super.aY, super.aZ);
                  if (this.q_()) {
                     super.Direction = 0;
                     var1.a(var2.a, var4, var5, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY, super.aZ - super.bj + super.bk - super.J, 33);
                  } else {
                     var1.a(var2.a, var4, var5, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY, super.aZ - super.bj + super.bk - super.J, 33);
                  }

                  if (super.cV && super.bj == 0) {
                     var1.a(MainObject.dd, 0, (var3 != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, super.aY + 1, super.aZ + super.bk - 4, 3);
                  }

                  super.dR = true;
               }

               this.a(var1, super.aY - 1, super.aZ - super.bo - super.bj + super.bk - super.be - 20, 2);
               this.f(var1, super.aY, super.aZ);
               this.e(var1);
               super.a(var1);
            }

         }
      }
   }

   public final void q() {
      if (!super.dD || super.B != 103) {
         if (super.cx != 5) {
            if (!super.bH && !super.bI) {
               MainObject var1;
               if (super.dE) {
                  if ((var1 = MainObject.a(super.cQ, (byte)0)) == null) {
                     super.cU = false;
                  } else {
                     if (var1.cF != 4) {
                        super.bf = var1.aY;
                        super.bg = var1.aZ;
                        super.bb = 0;
                        super.bc = 0;
                        super.cF = 0;
                        super.bf = super.aY;
                        super.bg = super.aZ;
                        if (hso_ak.f(30) == 0) {
                           super.E = 20;
                        }

                        if (super.aY > var1.aY) {
                           super.Direction = 2;
                           return;
                        }

                        super.Direction = 3;
                     }

                  }
               } else {
                  if (super.Q != null && super.Q.c() > 0 && !super.dE) {
                     hso_bf var4 = (hso_bf)super.Q.a(0);
                     if (hso_ft.aj - super.P > (long)super.O) {
                        super.cQ = var4.a;
                        var4.g = super.dn;
                        this.t();
                        this.s();
                        return;
                     }

                     MainObject var2;
                     if ((var2 = MainObject.a(var4.a, var4.b)) == null) {
                        super.cU = false;
                        return;
                     }

                     if (var2.cF == 4) {
                        this.p_();
                        return;
                     }

                     super.bf = var2.aY;
                     super.bg = var2.aZ;
                     int var3 = var4.g.c;
                     if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var2.aY, var2.aZ) <= var3) {
                        super.cQ = var4.a;
                        this.t();
                        this.s();
                        return;
                     }

                     if (hso_ak.e(super.aY - super.bf) >= 4 || hso_ak.e(super.aZ - super.bg) >= 4) {
                        this.p_();
                        return;
                     }
                  } else {
                     if ((var1 = MainObject.a(super.cQ, (byte)0)) == null) {
                        super.cU = false;
                        return;
                     }

                     if (var1.cF != 4) {
                        super.bf = var1.aY;
                        super.bg = var1.aZ;
                        if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var1.aY, var1.aZ) <= super.D) {
                           super.bb = 0;
                           super.bc = 0;
                           super.cF = 0;
                           super.bf = super.aY;
                           super.bg = super.aZ;
                           if (hso_ak.f(30) == 0) {
                              super.E = 20;
                           }

                           if (super.aY > var1.aY) {
                              super.Direction = 2;
                              return;
                           }

                           super.Direction = 3;
                           return;
                        }

                        if (hso_ak.e(super.aY - super.bf) >= 4 || hso_ak.e(super.aZ - super.bg) >= 4) {
                           this.p_();
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public final void h() {
      if (this.H() && !super.bH) {
         if (!super.dZ) {
            if (hso_ak.e(super.aY - super.bf) > super.bi + this.Q()) {
               super.bc = 0;
               super.cF = 1;
               if (hso_ak.e(super.aY - super.bf) > super.bi + this.Q()) {
                  if (super.aY > super.bf) {
                     super.bb = -(super.bi + this.Q());
                     super.cH = super.Direction;
                     super.Direction = 2;
                  } else {
                     super.bb = super.bi + this.Q();
                     super.cH = super.Direction;
                     super.Direction = 3;
                  }
               } else {
                  super.bb = super.bf - super.aY;
               }
            } else if (hso_ak.e(super.aZ - super.bg) > super.bi + this.Q()) {
               super.bb = 0;
               super.cF = 1;
               if (hso_ak.e(super.aZ - super.bg) > super.bi + this.Q()) {
                  if (super.aZ > super.bg) {
                     super.bc = -(super.bi + this.Q());
                     super.cH = super.Direction;
                     super.Direction = 1;
                  } else {
                     super.bc = super.bi + this.Q();
                     super.cH = super.Direction;
                     super.Direction = 0;
                  }
               } else {
                  super.bc = super.bg - super.aZ;
               }
            } else {
               if (super.dC) {
                  GameScreen.a(43, super.aY, super.aZ);
                  hso_cs.t = 10;
                  super.cL = true;
               }

               super.bb = 0;
               super.bc = 0;
               if ((super.B == 103 || super.B == 149) && super.dO == 0) {
                  GameScreen.a(54, super.aY, super.aZ - 20);
                  super.dO = 1;
               }

            }
         }
      } else {
         super.bf = super.aY;
         super.bg = super.aZ;
      }
   }

   public final void a() {
      super.a();
      long var1;
      if (!super.cW && (var1 = hso_dw.a()) - super.cY >= 5000L) {
         super.cY = var1;
         Service.a().c((short)super.ct);
      }

      this.a_();
      if (this.H()) {
         this.b_();
         if (super.cF != 4 && super.cF != 3 && super.cF != 2) {
            if (super.cU && !super.dq) {
               if (super.E > 0) {
                  if (!super.dE && (!this.q_() || !this.w() || !this.W())) {
                     this.p();
                  }
               } else if (!this.q_() && !this.w() && !this.u() && !this.W()) {
                  this.q();
               }
            } else if (!super.dE && !this.q_() && !this.w() && !this.u() && !this.W()) {
               this.o();
            }
         }

         int var5 = hso_ft.p.a(super.aY + super.bb, super.aZ + super.bc);
         if (!super.dE && !this.q_() && !this.w() && !this.u()) {
            this.g(super.M, var5);
         }

      }
   }
}
