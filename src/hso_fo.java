public final class hso_fo {
   public int a;
   public int b;
   public String c;
   private int q;
   public static boolean d = true;
   public int e;
   public int[] f;
   public byte g;
   public long h;
   public byte i;
   public String j;
   public static int[] k = new int[]{-1, 0, 3, 4, 5, 12, 2, 1, 6, 4, 7, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
   public static int[] l = new int[]{1, 7, 6, 2, -1, 4, 8, 10, 0, 0, 0, 0, 5};
   public static hso_ek m = new hso_ek();
   public static hso_ek n = new hso_ek();
   public static hso_ek o;
   public static hso_ek p;

   static {
      new hso_ek();
      o = new hso_ek();
      p = new hso_ek();
   }

   public hso_fo() {
   }

   public hso_fo(short var1, String var2, byte var3, byte var4, byte var5, short var6, int[] var7, byte[] var8) {
      this.a = var1;
      this.b = var6;
      this.c = var2;
      this.e = var3;
      this.f = var7;
   }

   public hso_fo(short var1, short var2, long var3, String var5, String var6, byte var7, byte var8, byte var9, short var10, boolean var11) {
      this.a = var1;
      this.b = var2;
      this.h = var3;
      this.c = var5;
      this.j = var6;
      this.i = var7;
      this.g = var8;
   }

   public static void a(int var0, hso_es var1) {
      for(int var2 = 0; var2 < var1.c(); ++var2) {
         hso_bw var3;
         if ((var3 = (hso_bw)var1.a(var2)).u == var0) {
            var1.d(var3);
            --var2;
         }
      }

   }

   public static hso_fo a(short var0) {
      hso_fo var1;
      if ((var1 = (hso_fo)o.a("" + var0)) == null) {
         var1 = new hso_fo();
         o.a("" + var0, var1);
         Service.a().f(var0);
      }

      if (var1.c == null) {
         ++var1.q;
         if (var1.q >= 200) {
            Service.a().f(var0);
            var1.q = 0;
         }
      }

      return var1;
   }

   public static hso_fo b(short var0) {
      return (hso_fo)m.a("" + var0);
   }
}
