public final class hso_dm {
   private short b;
   private String c;
   private long d;
   private long e;
   public boolean a;
   private int f;
   private int g;

   public hso_dm(int var1, String var2, int var3, int var4) {
      this.b = (short)var1;
      this.c = var2;
      this.f = var3;
      this.g = var4;
      this.d = hso_dw.a();
      this.e = hso_dw.a();
   }

   public final void a(mGraphics var1) {
      var1.a(hso_cg.aj, this.f, this.g + hso_ft.ab / 2, 3);
      hso_o.f.a(var1, this.c + " : " + hso_cs.a(this.b), this.f, this.g, 2, false);
   }

   public final void a() {
      this.d = hso_dw.a();
      if (this.d - this.e >= 1000L) {
         this.e = hso_dw.a();
         --this.b;
      }

      if (this.b <= 0) {
         this.a = true;
      }

   }
}
