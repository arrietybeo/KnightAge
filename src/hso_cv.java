public final class hso_cv extends hso_au {
   private byte a;
   private byte b = 0;
   private byte[][][] c = new byte[][][]{{{7, 7, 7, 8, 8, 8, 9, 9, 9, 6, 6, 6, 6}, {12, 12, 12, 13, 13, 13, 14, 14, 14, 11, 11, 11, 11}, {2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 1}, {2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 1}}, {{7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 6, 6, 6, 6}, {12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 11, 11, 11, 11}, {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 1, 1, 1, 1}, {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 1, 1, 1, 1}}, {{7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 6, 6, 6, 6}, {12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 11, 11, 11, 11}, {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 1, 1, 1, 1}, {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 1, 1, 1, 1}}};
   private byte[][] d = new byte[][]{{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
   private byte[] e = new byte[]{-11, -7, -7};
   private byte f;
   private byte g;
   private byte h = 0;
   private byte i = 0;

   public hso_cv(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
      super.di = 14;
      super.ct = var1;
      super.B = var2;
      super.cu = 1;
      super.cB = var4;
      super.aY = var5;
      super.aZ = var6;
      super.be = -1;
      super.bd = -1;
      super.bs = var7;
      super.by = (short)var8;
      byte var10001;
      switch(super.B) {
      case 127:
      case 128:
         var10001 = 0;
         break;
      case 129:
      case 130:
         var10001 = 1;
         break;
      case 131:
      case 132:
      case 176:
      case 177:
         var10001 = 2;
         break;
      default:
         var10001 = 0;
      }

      this.b = var10001;
      super.cF = 0;
      super.M = 0;
      this.f = 3;
      this.g = 5;
      super.N = this.f * this.g;
      super.cY = hso_dw.a();
   }

   public final boolean B() {
      return super.B == 129 || super.B == 131 || super.B == 127 || super.B == 177;
   }

   public final boolean C() {
      return super.B == 128 || super.B == 130 || super.B == 132 || super.B == 176;
   }

   public final boolean D() {
      return true;
   }

   public final void d(int var1) {
      super.bi = var1;
      this.a = (byte)var1;
      this.h = (byte)(var1 + 1);
   }

   public final String f() {
      return super.R;
   }

   public final void a(mGraphics var1) {
      hso_fd var2;
      if ((var2 = hso_bk.c((short)super.B)) != null && !super.bI && var2.a != null) {
          switch (super.Direction) {
              case 3:
                  this.i = -2;
                  break;
              case 2:
                  this.i = 2;
                  break;
              default:
                  this.i = 0;
                  break;
          }

         if (super.bd < 0) {
            super.bd = aq.a(var2.a.a) / this.f;
            super.be = aq.b(var2.a.a) / this.g;
            super.bq = super.be / 2;
         }

         this.e(var1, super.aY, super.aZ);
         if (super.ef >= 0 && super.ef < super.N) {
            boolean var3 = false;
            boolean var4 = false;
            int var5 = super.ef / this.g * super.bd;
            int var6 = super.ef % this.g * super.be;
            if (super.cV) {
               var1.a(var2.a, var5, var6, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY, super.aZ - super.bo - super.bj + super.bk, 33);
               var1.a(MainObject.dd, 0, (super.cF != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, super.aY + this.i, super.aZ + super.bk - 8, 3);
            } else {
               MainObject.c(var1, super.aY + this.i, super.aZ - super.bo + this.e[this.b]);
               var1.a(var2.a, var5, var6, super.bd, super.be, super.Direction > 2 ? 2 : 0, super.aY, super.aZ - super.bo - super.bj + super.bk, 33);
            }
         }
      }

      this.f(var1, super.aY, super.aZ);
      hso_o.j.a(var1, super.R, super.aY, super.aZ - super.be - 3 - (super.bI ? 5 : 0), 2, false);
      super.a(var1);
   }

   public final void a() {
      super.a();
      ++super.eg;
      if (super.cF == 0) {
         if (super.eg > this.d[super.Direction].length - 1) {
            super.eg = 0;
         }

         super.ef = this.d[super.Direction][super.eg];
      } else if (super.cF == 1) {
         if (super.eg > this.c[this.b][super.Direction].length - 1) {
            super.eg = 0;
         }

         super.ef = this.c[this.b][super.Direction][super.eg];
      }

      this.I();
      int var1 = hso_ft.p.a(super.aY + super.bb, super.aZ + super.bc);
      this.g(super.M, var1);
      if (this.H() && !super.bH) {
         long var2;
         if (!super.cW && (var2 = hso_dw.a()) - super.cY >= 5000L) {
            super.cY = var2;
            Service.a().c((short)super.ct);
         }

         if (super.bb == 0 && super.bc == 0) {
            super.cF = 0;
         }

         if (MainObject.c(super.aY, super.aZ, super.bf, super.bg) >= hso_cs.l * 3 && MainObject.c(super.aY, super.aZ, super.bf, super.bg) <= hso_cs.l << 2) {
            this.a = this.h;
         }

         if (MainObject.c(super.aY, super.aZ, super.bf, super.bg) < hso_cs.l * 3) {
            super.bi = (byte)(this.h - 1);
         }

         if (this.a > 1) {
            if (super.ef == 3 || super.ef == 8 || super.ef == 13) {
               super.bi = this.a - 1;
               return;
            }

            super.bi = this.a;
         }

      }
   }
}
