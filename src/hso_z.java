public class hso_z {
   public byte c;
   public short d;
   public short e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public short l;
   public int[][] m;

   public hso_z() {
   }

   public hso_z(short var1, short var2, int var3, int var4, int[][] var5) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.m = var5;
   }

   public void a(mGraphics var1) {
   }

   public void a() {
   }

   public final boolean b() {
      hso_fd var1;
      if ((this.k == 0 || this.j == 0) && (var1 = hso_bk.b(this.d)).a != null) {
         this.j = hso_aq.a(var1.a.a);
         this.k = hso_aq.b(var1.a.a);
      }

      return this.h + this.f + this.j >= hso_p.d.a && this.h + this.f - this.j <= hso_p.d.a + hso_ft.W && this.i + this.g + this.k >= hso_p.d.b && this.i + this.g - this.k <= hso_p.d.b + hso_ft.X;
   }
}
