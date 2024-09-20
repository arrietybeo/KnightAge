public final class hso_ac extends hso_au {
   private int a = 0;
   private static byte[][][] b = new byte[][][]{{{0, 0, 1, 1, 2, 2}, {1, 1, 0, 0, 2, 2}, {2, 2, 0, 0, 1, 1}}, {{0, 0, 1, 1, 2, 2}, {1, 1, 0, 0, 2, 2}, {2, 2, 0, 0, 1, 1}}, {{2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}};
   private static byte[][][] c = new byte[][][]{{{0, 0, 1, 1, 0, 0, 2, 2}, {1, 1, 0, 0, 2, 2, 0, 0}, {2, 2, 0, 0, 1, 1, 0, 0}}, {{0, 0, 1, 1, 0, 0, 2, 2}, {1, 1, 0, 0, 2, 2, 0, 0}, {2, 2, 0, 0, 1, 1, 0, 0}}, {{2, 2, 2, 2, 3, 3, 3, 3}, {2, 2, 2, 2, 3, 3, 3, 3}, {2, 2, 2, 2, 3, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4, 4, 4}}};
   private static byte[][][] d = new byte[][][]{{{0, 0, 1, 1, 2, 2}, {1, 1, 0, 0, 2, 2}, {2, 2, 0, 0, 1, 1}}, {{0, 0, 1, 1, 2, 2}, {1, 1, 0, 0, 2, 2}, {2, 2, 0, 0, 1, 1}}, {{2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}, {2, 2, 2, 3, 3, 3}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}, {{4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}, {4, 4, 4, 4, 4, 4}}};

   public hso_ac(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
      super.dx = 0;
      super.di = var3;
      super.cu = 1;
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
      super.Direction = 0;
      super.M = 0;
      super.bd = super.be = -1;
      super.N = 5;
      super.bi = 3;
      super.C = 70;
      super.bn = 0;
      super.bo = -2;
      super.A = hso_ak.c(60, 85);
      super.D = 50;
      switch(var3) {
      case 3:
         super.z = b;
         break;
      case 5:
      case 19:
         super.z = c;
         break;
      case 8:
         super.z = b;
         super.D = 80;
         break;
      case 10:
         super.z = d;
      }

      super.cY = hso_dw.a();
   }

   public final void a(mGraphics var1) {
      if (!super.dj) {
         if (super.cx == 2 && MainObject.de != null) {
            hso_cg.a(var1, MainObject.dp, super.aY, super.aZ - super.bj - this.a - super.be - 20 - 30, 2);
            var1.a(MainObject.de, super.aY, super.aZ - super.bj - super.J - super.be - 20, 33);
         }

         this.e(var1, super.aY, super.aZ);
         this.g(var1, super.aY, super.aZ);
         this.f(var1);
         hso_fd var2 = hso_bk.c((short)super.B);
         int var3;
         if ((var3 = super.cF) > super.z.length - 1) {
            var3 = 0;
         }

         if (super.ba > super.z[var3][super.Direction > 2 ? 2 : super.Direction].length - 1) {
            super.ba = 0;
         }

         var1.a(MainObject.db, super.aY, super.aZ - super.bj - this.a, 3);
         if (var2.a != null) {
            if (super.bd < 0) {
               if (super.B <= 92) {
                  super.be = aq.b(var2.a.a) / super.N;
                  super.bd = aq.a(var2.a.a);
               } else {
                  super.be = aq.b(var2.a.a) / 3;
                  super.bd = aq.a(var2.a.a) / 2;
               }
            }

            int var4 = 0;
            int var5 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] * super.be;
            if (super.B > 92) {
               var4 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] / 3 * super.bd;
               var5 = super.z[var3][super.Direction > 2 ? 2 : super.Direction][super.ba] % 3 * super.be;
            }

            var1.a(var2.a, var4, var5, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY, super.aZ - 8 - super.bj - super.J, 33);
            super.dR = true;
         } else {
            super.dR = false;
         }

         this.a(var1, super.aY - 1, super.aZ - super.bo - super.bj + super.bk - super.be - 20, 2);
         this.f(var1, super.aY, super.aZ);
         this.e(var1);
         super.a(var1);
      }

   }

   public final void a() {
      super.a();
      long var1;
      if (!super.cW && (var1 = hso_dw.a()) - super.cY >= 5000L) {
         super.cY = var1;
         Service.a().c((short)super.ct);
      }

      this.I();
      this.a_();
      if (super.cF == 4) {
         this.a += 3;
         if (this.a > 11) {
            this.a = 11;
         }
      } else {
         this.a = 0;
      }

      if (this.H() && !super.bH) {
         this.b_();
         if (super.cF != 4 && super.cF != 3 && super.cF != 2) {
            if (super.cU && !super.dq) {
               if (super.E > 0) {
                  if (!super.dE) {
                     this.p();
                  }
               } else if (!this.u()) {
                  this.q();
               }
            } else if (!super.dE) {
               this.o();
            }
         }

         int var5 = hso_ft.p.a(super.aY + super.bb, super.aZ + super.bc);
         if (!super.dE) {
            this.g(super.M, var5);
         }

         if (super.cx == 2 && MainObject.de == null) {
            if (super.dm > 0) {
               --super.dm;
            }

            if (super.dm <= 0) {
               Service.a().d((short)9999);
               super.dm = 120;
            }
         }

      }
   }
}
