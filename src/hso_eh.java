public final class hso_eh {
   private boolean c = false;
   public String[] a;
   private int d;
   private int e;
   private int f;
   public int b;
   private int g;
   private int h;
   private hso_o i;

   public final void a(String var1, int var2, int var3, int var4, int var5, hso_o var6) {
      this.i = var6;
      this.d = var3;
      this.e = var4;
      this.g = var5;
      if (this.g > hso_ft.W - 10) {
         this.g = hso_ft.W - 10;
      }

      this.a = var6.a(var1, this.g);
      this.h = this.d;
      this.c = true;
      this.f = 0;
      this.b = 0;
   }

   public final boolean a() {
      if (this.b < this.a.length) {
         this.b = this.a.length;
         this.f = 0;
         return false;
      } else {
         this.f = this.b = 0;
         return true;
      }
   }

   public final void b() {
      if (this.c && this.b < this.a.length) {
         this.f += 2;
         if (this.f >= this.a[this.b].length()) {
            this.f = 0;
            ++this.b;
         }
      }

   }

   public final void a(mGraphics var1) {
      boolean var2 = false;
      int var4 = this.e;

      for(int var3 = 0; var3 < this.b; ++var3) {
         this.i.a(var1, this.a[var3], this.h, var4 + var3 * hso_ft.ab, 0, false);
      }

      if (this.b < this.a.length) {
         this.i.a(var1, this.a[this.b].substring(0, this.f), this.h, var4 + this.b * hso_ft.ab, 0, false);
      }

   }

   public final void a(mGraphics var1, int var2) {
      boolean var3 = false;
      int var4 = this.e;
      if (var2 == 2) {
         for(var2 = 0; var2 < this.b; ++var2) {
            this.i.a(var1, this.a[var2], this.h + this.g / 2, var4 + var2 * hso_ft.ab, 2, false);
         }

         if (this.b < this.a.length) {
            this.i.a(var1, this.a[this.b].substring(0, this.f), this.h + this.g / 2, var4 + this.b * hso_ft.ab, 2, false);
            return;
         }
      } else {
         for(var2 = 0; var2 < this.b; ++var2) {
            this.i.a(var1, this.a[var2], this.h, var4 + var2 * hso_ft.ab, 0, false);
         }

         if (this.b < this.a.length) {
            this.i.a(var1, this.a[this.b].substring(0, this.f), this.h, var4 + this.b * hso_ft.ab, 0, false);
         }
      }

   }
}
