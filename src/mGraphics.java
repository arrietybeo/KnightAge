import javax.microedition.lcdui.Graphics;

public final class mGraphics {
   public Graphics a;
   public static int zoomLevel = 1;
   private int c;
   private int d;

   public final void a(hso_aq var1, int var2, int var3, int var4) {
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      this.a.drawImage(var1.a, var2, var3, var4);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;

      for(int var5 = 0; var5 < zoomLevel; ++var5) {
         this.a.drawLine(var1 + var5, var2 + var5, var3 + var5, var4 + var5);
         if (var5 > 0) {
            this.a.drawLine(var1 + var5, var2, var3 + var5, var4);
            this.a.drawLine(var1, var2 + var5, var3, var4 + var5);
         }
      }

   }

   public final void b(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;

      for(int var5 = 0; var5 < zoomLevel; ++var5) {
         this.a.drawRect(var1 + var5, var2 + var5, var3 - (var5 << 1), var4 - (var5 << 1));
      }

   }

   public final void a(hso_aq var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var7 *= zoomLevel;
      var8 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      var5 *= zoomLevel;
      this.a.drawRegion(var1.a, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void c(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.fillRect(var1, var2, var3, var4);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      var5 *= zoomLevel;
      var6 *= zoomLevel;
      this.a.fillRoundRect(var1, var2, var3, var4, var5, var6);
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      var5 *= zoomLevel;
      var6 *= zoomLevel;
      this.a.fillTriangle(var1, var2, var3, var4, var5, var6);
   }

   public final int a() {
      return this.a.getTranslateX() / zoomLevel;
   }

   public final int b() {
      return this.a.getTranslateY() / zoomLevel;
   }

   public final void d(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.setClip(var1, var2, var3, var4);
   }

   public final void a(int var1) {
      this.a.setColor(var1);
   }

   public final void b(int var1) {
      this.a.setColor(0);
   }

   public final void a(int var1, int var2) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      this.a.translate(var1, var2);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      this.b(0, 0, hso_ft.p.e * 24, var2, var5);
      this.b(0, var2, var1, hso_ft.p.f * 24 - var2, var5);
      this.b(var1, var2 + var4, hso_ft.p.e * 24 - var1, hso_ft.p.f * 24 - (var2 + var4), var5);
      this.b(var1 + var3, var2, hso_ft.p.e * 24 - (var1 + var3), var4, var5);
   }

   public final void b(int var1, int var2, int var3, int var4, int var5) {
      this.a(var5);
      this.c(var1, var2, var3, var4);
   }

   public final void e(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      if (this.c != hso_aq.a(hso_cg.aw.a)) {
         this.c = hso_aq.a(hso_cg.aw.a);
      }

      if (this.d != hso_aq.b(hso_cg.aw.a)) {
         this.d = hso_aq.b(hso_cg.aw.a);
      }

      this.d(var1, var2, var3, var4);

      for(int var5 = var1 % this.c; var5 < var3 + this.c; var5 += this.c) {
         for(int var6 = var2 % this.d; var6 < var4 + this.d; var6 += this.d) {
            this.a(hso_cg.aw, var1 + var3 - var5, var2 + var4 - var6, 20);
         }
      }

      this.d(-this.a.getTranslateX(), -this.a.getTranslateY(), hso_ft.W, hso_ft.X);
   }
}
