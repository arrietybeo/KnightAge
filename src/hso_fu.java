public final class hso_fu extends hso_au {
   public hso_fu(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
      super.cu = 1;
      super.di = 13;
      super.ct = var1;
      super.B = var2;
      super.F = var5;
      super.G = var6;
      super.aY = var5;
      super.aZ = var6;
      super.cB = var4;
      super.bs = var7;
      super.br = var7;
      super.by = (byte)var8;
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
      super.cY = hso_dw.a();
   }

   public final void b_() {
   }

   public final void a() {
      super.a();
      long var1;
      if (!super.cW && (var1 = hso_dw.a()) - super.cY >= 5000L) {
         super.cY = var1;
         Service.a().c((short)super.ct);
      }

      this.a_();
   }

   public final boolean w() {
      return true;
   }

   public final void a(mGraphics var1) {
      if (!super.dj) {
         hso_fd var2;
         if ((var2 = hso_bk.c((short)super.B)) != null && var2.a != null) {
            var1.a(var2.a, super.aY, super.aZ, 33);
         }

      }
   }

   public final void h() {
   }

   public final void p_() {
   }

   public final void z() {
   }

   public final void A() {
   }
}
