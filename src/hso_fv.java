public final class hso_fv extends MainObject {
   private long a;
   private int b;
   private int c;

   public hso_fv(int var1, byte var2, String var3, int var4, int var5, short var6, byte var7) {
      super.ct = var1;
      super.cu = var2;
      super.cB = var3;
      if (var4 < 48) {
         var4 = 48;
      }

      if (var4 > hso_ft.p.g - 48) {
         var4 = hso_ft.p.g - 48;
      }

      if (var5 < 48) {
         var5 = 48;
      }

      if (var5 > hso_ft.p.h - 48) {
         var5 = hso_ft.p.h - 48;
      }

      super.aY = var4;
      super.aZ = var5;
      super.cS = var6;
      super.cs = var7;
      super.bb = hso_ak.b(1, 5);
      super.bc = -hso_ak.c(3, 10);
      super.bi = 16;
      super.dV = hso_ak.c(3, 9);
      this.a = hso_ft.aj;
      this.b = 60;
      super.dy = false;
   }

   public final void a(mGraphics var1) {
      hso_fd var2 = null;
      switch(super.cu) {
      case 3:
         var2 = hso_bk.d((short)super.cS);
         break;
      case 4:
         var2 = hso_bk.e((short)super.cS);
         break;
      case 5:
         var2 = hso_bk.f((short)super.cS);
      case 6:
      default:
         break;
      case 7:
         var2 = hso_bk.g((short)super.cS);
      }

      if (var2.a != null) {
         if (super.be == 0) {
            super.be = aq.b(var2.a.a);
         }

         var1.a(var2.a, super.aY, super.aZ, 33);
         if (super.cu == 3 && super.cs > 1) {
            hso_bw.w.b((super.cs - 1) * 3 + hso_ft.ai / 3 % 3, super.aY + 6, super.aZ - 14, 0, 3, var1);
         }
      }

      if (super.cV) {
         var1.a(MainObject.dd, 0, hso_ft.ai / 2 % 2 * 17, 28, 17, 0, super.aY, super.aZ - 2 + super.bk, 3);
      }

      if (hso_cf.I) {
         byte var3 = 0;
         if (super.cu == 3) {
            var3 = super.cs;
         }

         this.a(var1, var3);
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      hso_fd var4 = null;
      switch(super.cu) {
      case 3:
         var4 = hso_bk.d((short)super.cS);
         break;
      case 4:
         var4 = hso_bk.e((short)super.cS);
         break;
      case 5:
         var4 = hso_bk.f((short)super.cS);
      case 6:
      default:
         break;
      case 7:
         var4 = hso_bk.g((short)super.cS);
      }

      if (var4.a != null) {
         if (super.be == 0) {
            super.be = aq.b(var4.a.a);
         }

         var1.a(var4.a, var2 - 1, var3, 3);
      }

   }

   public final void a() {
      if (super.dV > 0) {
         super.aY += super.bb;
         super.aZ += super.bc;
         super.bc += 2;
         --super.dV;
      }

      if (super.dV == 0) {
         if (hso_ft.p.a(super.aY, super.aZ) == 2) {
            super.cV = true;
         }

         super.cU = false;
         super.dV = -1;
      }

      if (super.cU) {
         ++this.c;
         super.aY += super.bb;
         super.aZ += super.bc;
         if (this.c >= super.bE) {
            super.cK = true;
            super.cU = false;
         }
      }

      if (super.dy) {
         ++super.dz;
         if (super.dz > 40) {
            super.dy = false;
            super.dz = 0;
         }
      }

      if ((hso_ft.aj - this.a) / 1000L >= (long)this.b) {
         super.cK = true;
      }

   }
}
