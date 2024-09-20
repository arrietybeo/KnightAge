public final class hso_w {
   public String a;
   public hso_es b = new hso_es("MainParty vecPartys");
   private boolean c = false;

   public hso_w(String var1, short var2, int var3, byte var4) {
      this.a = var1;
      this.b.d();
      this.c = false;
      this.a(var1, var2, var3, var4);
   }

   public final void a(String var1, short var2, int var3, byte var4) {
      hso_aj var5;
      (var5 = new hso_aj(var1, var2, var3, var4)).h = 10;
      var5.g = 10;
      this.b.a(var5);
   }

   public final void a(String var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.b.c(); ++var6) {
         hso_aj var7;
         if ((var7 = (hso_aj)this.b.a(var6)).b.compareTo(var1) == 0) {
            var7.d = var2;
            var7.e = var3;
            if (var4 > var5) {
               var4 = var5;
            }

            var7.g = var4;
            var7.h = var5;
            return;
         }
      }

   }
}
