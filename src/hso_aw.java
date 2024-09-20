public final class hso_aw {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   private int g;
   private int h;
   private int i;
   private int j;

   public final void a(int var1, int var2, int var3, int var4) {
      this.e = var1;
      this.f = var2;
      if (this.f < 0) {
         this.f = 0;
      }

      if (this.e < 0) {
         this.e = 0;
      }

      if (var3 > var1) {
         var3 = var1;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      if (var4 > var2) {
         var4 = var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      this.a = var3;
      this.b = var4;
      this.c = var3;
      this.d = var4;
   }

   public final void a(int var1, int var2) {
      this.c = var1;
      this.d = var2;
   }

   public final void a() {
      if (GameScreen.f.dQ) {
         if (hso_ft.p.d != 19) {
            return;
         }

         if (this.b == 0) {
            return;
         }

         this.d = 0;
      }

      if (this.a != this.c) {
         this.g = this.c - this.a << 1;
         this.h += this.g;
         this.a += this.h >> 4;
         this.h &= 15;
         if (this.a < 0) {
            this.a = 0;
         }

         if (this.a > this.e) {
            this.a = this.e;
         }
      }

      if (this.b != this.d) {
         this.i = this.d - this.b << 1;
         this.j += this.i;
         this.b += this.j >> 4;
         this.j &= 15;
         if (this.b < 0) {
            this.b = 0;
         }

         if (this.b > this.f) {
            this.b = this.f;
         }
      }

   }

   public final void b() {
      if (this.a != this.c) {
         this.g = this.c - this.a << 1;
         this.h += this.g;
         this.a += this.h >> 4;
         this.h &= 15;
      }

      if (this.b != this.d) {
         this.i = this.d - this.b << 1;
         this.j += this.i;
         this.b += this.j >> 4;
         this.j &= 15;
         if (this.b < 0) {
            this.b = 0;
         }

         if (this.b > this.f) {
            this.b = this.f;
         }
      }

   }
}
