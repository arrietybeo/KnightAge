public final class hso_em {
   public short a;
   public int b;
   public String c;
   public String d;
   public String e;
   public String f;
   public String g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public long n;
   public byte o = 0;
   public hso_dv[] p = null;
   public boolean q = false;

   public hso_em(int var1, short var2, String var3, byte var4) {
      this.b = var1;
      this.a = var2;
      this.c = var3.toUpperCase();
      this.o = var4;
   }

   public final void a(String var1, short var2, short var3, short var4, short var5, short var6, String var7, String var8, String var9, long var10, int var12, hso_dv[] var13) {
      this.d = var1;
      this.j = var2;
      this.m = var3;
      this.k = var4;
      this.h = var5;
      this.i = var6;
      this.e = var7;
      this.g = var8;
      this.f = var9;
      this.n = var10;
      this.l = var12;
      this.p = var13;
   }

   public final int a() {
      if (this.o == 127) {
         return 13;
      } else {
         return this.o == 126 ? 7 : -1;
      }
   }

   public static String a(byte var0) {
      return var0 >= 121 && var0 <= 127 ? hso_df.gw[127 - var0] : "";
   }
}
