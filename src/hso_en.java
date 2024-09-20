public final class hso_en {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g = 0;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public hso_es s;
   public String t;
   public boolean u = false;
   public boolean v = false;
   public static hso_ce[] w;

   public hso_en() {
   }

   public hso_en(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      ++this.n;
      this.a += this.i;
      this.b += this.j;
   }

   public final void a(mGraphics var1) {
      if (!this.u) {
         byte var2 = 0;
         if (this.v && this.n >= this.r) {
            var2 = 1;
         }

         w[this.g].b(this.p / 2 + var2, this.a, this.b, this.m, 3, var1);
      }

   }

   public final void b() {
      boolean var1 = true;
      if (this.g == 0 && GameScreen.l.c() < 10) {
         var1 = false;
      }

      if (var1) {
         ++this.n;
         if (this.q > 1) {
            ++this.p;
            if (this.p / 2 >= this.q) {
               this.p = 0;
            }
         }

         if (this.n >= this.o) {
            this.u = true;
         }

      }
   }
}
