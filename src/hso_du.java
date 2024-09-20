public final class hso_du extends MainObject {
   private static byte[][] a = new byte[][]{{5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}};

   public hso_du(byte var1, byte var2, int var3, int var4) {
      super.ee = var1;
      super.aY = var3;
      super.aZ = var4;
      super.Direction = var2;
      super.cF = 0;
      super.cu = 10;
   }

   public final void d_() {
      ++super.ef;
      if (super.ef > a[super.Direction].length - 1) {
         super.ef = 0;
      }

   }

   public final void a(mGraphics var1) {
      if (super.ee != -1) {
         hso_ce var2;
         if ((var2 = hso_ce.a(super.ee, 3, 5, 0)) != null) {
            var1.a(MainObject.db, super.aY, super.aZ - 8, 3);
            var2.a(a[super.Direction][super.ef], super.aY + super.ec, super.aZ - super.bo - super.bj + super.ed, super.Direction > 2 ? 2 : 0, 33, var1);
         }

      }
   }
}
