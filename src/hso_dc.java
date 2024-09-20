public final class hso_dc extends hso_p {
   private int a;
   private int b;
   private int f;
   private int g;
   private int h;
   private int i;
   private hso_e j;
   private hso_es k = new hso_es("List_Ip_Server_Screen vecchoice");

   public hso_dc() {
      hso_u.a(hso_u.a = TemMidlet.c(hso_ft.O), false);
      this.i = hso_ft.aa;
      this.f = hso_ft.W - 20;
      if (this.f > 180) {
         this.f = 180;
      }

      this.g = hso_dw.a.length * this.i;
      int var1 = 0;
      if (this.g > hso_ft.X / 5 << 2) {
         var1 = this.g - (hso_ft.X / 5 << 2);
         this.g = hso_ft.X / 5 << 2;
      }

      this.a = hso_ft.Y - this.f / 2;
      this.b = hso_ft.Z - this.g / 2 + this.i / 2;
      this.k.d();

      for(int var2 = 0; var2 < hso_dw.a.length; ++var2) {
         this.k.a(new hso_bt(hso_dw.a[var2][0], 0, var2, this));
      }

      if (hso_ft.A) {
         this.h = -1;
      }

      this.j = new hso_e(this.a, this.b, this.f, this.g, this.i, hso_dw.a.length, var1, this.h, this.k);
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         if (ISession.a().c) {
            ISession.a().c();
         }

         hso_ft.H = (byte)var2;
         hso_ft.b.c();
         boolean var3 = hso_ft.D;
         if ((hso_ft.D = hso_ft.M[hso_ft.H] == 0) != var3) {
            hso_u.b();
            hso_ft.a(hso_df.gk);
         }

         if (hso_ft.D) {
            hso_bs.b = true;
         } else {
            hso_bs.b = false;
         }

         if (hso_f.a) {
            hso_bs.b = false;
            new hso_t();
            hso_u.b();
         }

         if (hso_cd.a) {
            hso_bs.b = false;
            if (hso_ft.H == 0) {
               new hso_ef();
            } else if (hso_ft.H == 1) {
               new hso_as();
            }

            hso_u.b();
         }

         hso_ft.b.a(hso_ft.H);
      default:
      }
   }

   public final void a(mGraphics var1) {
      hso_gb.a(var1);
      if (hso_cf.W == 0) {
         var1.a(hso_cg.aB, 0, 0, 0);
      } else if (hso_cf.W == 1) {
         hso_cf.j(var1);
      }

      hso_cg.a(var1, this.a, this.b - this.i, this.f, this.g + this.i, hso_df.fE);
      var1.d(this.a, this.b, this.f, this.g);
      var1.a(0, -this.j.b);
      if (this.h > -1) {
         var1.a(-3689060);
         var1.c(this.a + 5, this.b + this.h * this.i + this.i / 2 - 11, this.f - 10, 22);
      }

      for(int var2 = 0; var2 < this.k.c(); ++var2) {
         hso_bt var3 = (hso_bt)this.k.a(var2);
         hso_o.f.a(var1, var3.a, this.a + this.f / 2, this.b + this.i / 2 + var2 * this.i - 6, 2, true);
         if (var2 < this.k.c() - 1) {
            var1.a(hso_cg.aL[4]);
            var1.c(this.a + 8, this.b + (var2 + 1) * this.i - 1, this.f - 16, 1);
         }
      }

   }

   public final void a() {
      this.j.a();
      this.h = this.j.a;
      if (this.h >= this.k.c()) {
         this.h = -1;
         this.j.a = -1;
      }

      hso_gb.b();
   }
}
