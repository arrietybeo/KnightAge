public final class hso_cy {
   private long b;
   private int c;
   public boolean a;
   private String d = "";
   private int e;
   private int f;

   public hso_cy(long var1, String var3) {
      this.d = var3;
      this.b = var1;
      this.c = 60;
      this.e = (int)(this.b - hso_dw.a());
   }

   public final void a(mGraphics var1, int var2, int var3) {
      boolean var4 = false;
      long var5 = this.b - hso_dw.a();
      int var7 = (int)(60L - var5 * (long)this.c / (long)this.e);
      var1.a(hso_cg.ay, 0, 0, 62, 9, 0, var2, var3, 0);
      var1.a(hso_cg.ah, 0, 7, var7, 7, 0, var2 + 1, var3 + 1, 0);
      hso_o.i.a(var1, this.d, var2 + this.c / 2 + 1, var3 - 10 + 1 - 3, 2, false);
      hso_o.j.a(var1, this.d, var2 + this.c / 2, var3 - 10 - 3, 2, false);
      hso_o.f.a(var1, this.f + "%", var2 + this.c / 2, var3 - 1, 2, false);
   }

   public final void a() {
      long var1 = this.b - hso_dw.a();
      this.f = (int)(100L - var1 * 100L / (long)this.e);
      if (this.b - hso_dw.a() <= 0L) {
         this.a = true;
      }

   }
}
