public final class hso_ch extends hso_bz {
   private static int[] d = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   private int e;
   public static final int[] b;
   public static final byte[] c;

   static {
      byte[][] var10000 = new byte[][]{new byte[0], new byte[0]};
      b = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      c = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
   }

   public final void a(mGraphics var1) {
   }

   public static int a(int var0) {
      for(int var1 = 0; var1 < d.length - 1; ++var1) {
         if (var0 >= d[var1] && var0 <= d[var1 + 1]) {
            if (var1 >= 16) {
               return 0;
            }

            return var1;
         }
      }

      return 0;
   }

   public final void a() {
      ++this.e;
      if (this.e >= ((Object[])null).length) {
         this.e = ((Object[])null).length;
      }

      if (this.e == ((Object[])null).length) {
         super.a = true;
      }
   }
}
