public final class hso_cp {
   public float a;
   public float b;

   public hso_cp() {
      this.a = 0.0F;
      this.b = 0.0F;
   }

   public hso_cp(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a(hso_cp var1) {
      this.a = var1.a;
      this.b = var1.b;
   }

   public final hso_cp a(float var1, float var2) {
      this.a += var1;
      this.b += var2;
      return this;
   }

   public final hso_cp a() {
      float var1;
      if ((var1 = hso_ak.a(this.a * this.a + this.b * this.b)) != 0.0F) {
         this.a /= var1;
         this.b /= var1;
      }

      return this;
   }

   public static hso_cp a(hso_cp var0, hso_cp var1) {
      float var2 = var1.a - var0.a;
      float var3 = var1.b - var0.b;
      return new hso_cp(var2, var3);
   }
}
