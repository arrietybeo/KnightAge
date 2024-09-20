public final class hso_fm extends hso_cg {
   public int a;
   public int b;
   public int c;
   public int d;
   public String e;
   public String f;
   public boolean g = false;

   public hso_fm(int var1, int var2, String var3, String var4) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.f = var4;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 1:
         Service.a().a((byte)var2, this.e);
         break;
      case 2:
         if (var2 == 1) {
            Service.a().b((byte)2, this.e);
         }

         this.g = true;
         hso_ft.j();
         return;
      case 3:
         if (var2 == 1) {
            Service.a().a((byte)1, this.e, (byte)0, (short)0, (int)0);
         }

         this.g = true;
         hso_ft.j();
         return;
      case 4:
         if (var2 == 1) {
            Service.a().c((byte)1, this.e);
         } else if (var2 == 2) {
            Service.a().a((String)this.e, (byte)1);
         }

         this.g = true;
         hso_ft.j();
         return;
      case 5:
         if (var2 == 1) {
            Service.a().d((byte)11, this.e);
         }
         break;
      default:
         return;
      }

      this.g = true;
      hso_ft.j();
   }
}
