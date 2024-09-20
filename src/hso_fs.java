public final class hso_fs {
   private byte a;
   private int b;
   private int c;
   private static hso_aq[] d = null;
   private int e = 0;

   public hso_fs() {
   }

   public hso_fs(int var1, int var2, int var3) {
      this.b = var2;
      this.c = var3;
      this.a = (byte)var1;
      if (d == null) {
         d = new hso_aq[9];

         for(int var4 = 0; var4 < d.length; ++var4) {
            d[var4] = hso_aq.a("/tilethac" + var4 + ".png");
         }
      }

   }

   public final void a(mGraphics var1) {
      if (d != null && this.a < d.length && d[this.a] != null) {
         hso_aq var10001 = d[this.a];
         int var10003 = this.e * 24;
         byte var10006 = this.a;
         boolean var10007 = true;
         var1.a(var10001, 0, var10003, 24, 24, 0, this.b, this.c, 0);
      }

   }

   public final void a() {
      if (hso_ft.ai % 4 == 0) {
         this.e = (this.e + 1) % 4;
      }

   }
}
