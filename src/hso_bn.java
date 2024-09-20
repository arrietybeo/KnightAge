public final class hso_bn extends hso_dx {
   private String a;
   private int b;
   private int c;
   private hso_o z;
   private boolean A = false;

   public hso_bn(String var1, int var2, int var3, int var4) {
      this.A = false;
      this.a = var1;
      super.g = var2;
      super.h = var3 + hso_ak.g(5);
      this.b = var4;
      this.z = hso_o.f;
      if (this.b < 0) {
         this.z = hso_fl.b(-var4);
      } else {
         switch(var4) {
         case 1:
            this.z = hso_o.o;
            break;
         case 2:
         case 6:
         case 7:
         case 9:
            this.A = true;
         case 3:
         case 4:
         default:
            break;
         case 5:
            this.z = hso_o.j;
            break;
         case 8:
            this.z = hso_fl.a(var4);
            break;
         case 10:
            this.z = hso_o.d;
            break;
         case 11:
            this.z = hso_o.e;
         }
      }

      if (this.A) {
         super.p = -hso_ak.c(11, 14);
         this.c = hso_ak.c(20, 25);
      } else {
         super.p = -hso_ak.c(2, 4);
         this.c = hso_ak.c(24, 32);
      }
   }

   public hso_bn(String var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      super.g = var2;
      super.h = var3 + hso_ak.g(5);
      this.b = var4;
      this.z = hso_o.f;
      super.p = -hso_ak.c(11, 14);
      this.A = true;
      this.c = hso_ak.c(20, 25);
      if (this.b < 0) {
         this.z = hso_fl.b(-var5);
      } else {
         switch(var4) {
         case 8:
            this.z = hso_fl.a(var5);
         default:
         }
      }
   }

   public final void a(mGraphics var1) {
      switch(this.b) {
      case 1:
      case 5:
         this.z.a(var1, this.a, super.g, super.h, 2, false);
         return;
      case 2:
         hso_cg.a(var1, this.a, super.g, super.h, 2);
         return;
      case 3:
         hso_cg.a(var1, this.a, super.g, super.h, 2, (byte)5);
         return;
      case 4:
         hso_cg.a(var1, this.a, super.g, super.h, 2, (byte)1);
         return;
      case 6:
         hso_cg.a(var1, this.a, super.g, super.h, 2, (byte)4);
         return;
      case 7:
         hso_cg.a(var1, this.a, super.g, super.h, 2, (byte)2);
         return;
      case 8:
      default:
         this.z.a(var1, this.a, super.g, super.h, 2, false);
         return;
      case 9:
         hso_cg.a(var1, this.a, super.g, super.h, 2, (byte)6);
      }
   }

   public final void a() {
      ++super.k;
      if (this.A) {
         ++super.p;
      }

      super.a();
      if (super.k >= this.c) {
         super.y = true;
      }

   }
}
