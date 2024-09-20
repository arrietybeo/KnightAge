public final class hso_cu extends hso_au {
   private byte a = -1;
   private byte b = 0;
   private hso_dq c;
   private int d;
   private hso_ce e;
   private int[] f = new int[]{0, 30, 60, 90, 120, 150, 180, 210, 240, 270, 300, 330};
   private long g = 0L;

   public hso_cu(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
      super.cu = 1;
      super.di = 13;
      super.ct = var1;
      super.B = var2;
      super.F = var5;
      super.G = var6;
      super.aY = var5;
      super.aZ = var6;
      super.cB = var4;
      super.bs = var7;
      super.br = var7;
      super.by = (short)var8;
      super.M = 1;
      super.Direction = 0;
      super.N = 5;
      super.bd = super.be = -1;
      super.bi = 3;
      this.e = new hso_ce(1);
      this.d = 120;
      super.C = 60;
      super.A = hso_ak.c(50, 70);
      super.D = 50;
      super.bn = 0;
      super.bo = -2;
      super.cY = hso_dw.a();
      if (super.B == 110) {
         this.a = 52;
         this.d = 120;
         this.c = new hso_dq(this.a, var5, var6, 0, 0, 1, 0);
      }

   }

   public final void a(int var1, int var2, short var3) {
      this.a = (byte)var1;
      this.c = new hso_dq(this.a, super.aY, super.aZ, 0, 0, 1, 0);
      this.d = var2;
      super.by = var3;
   }

   public final void a(long var1) {
      this.g = var1;
   }

   public final boolean x() {
      return true;
   }

   public final void a(int var1) {
      super.by = (byte)var1;
      if (super.B == 110) {
         if (super.by == 1) {
            this.a = 52;
            this.d = 120;
         }

         if (super.by == 2) {
            this.a = 53;
            this.d = 130;
         } else if (super.by == 3) {
            this.a = 54;
            this.d = 140;
         } else if (super.by == 4) {
            this.a = 55;
            this.d = 150;
         }

         this.c = new hso_dq(this.a, super.aY, super.aZ, 0, 0, 1, 0);
      }

   }

   public final void b_() {
   }

   public final void a() {
      super.a();
      long var1;
      if (!super.cW && (var1 = hso_dw.a()) - super.cY >= 5000L) {
         super.cY = var1;
         Service.a().c((short)super.ct);
      }

      this.a_();
      ++this.b;
      if (this.b > 10) {
         this.b = 0;
      }

      if (this.c != null) {
         this.c.a();
      }

      boolean var5 = false;
      if (super.cO != null) {
         if (GameScreen.f.cO != null && super.cO.b == GameScreen.f.cO.b) {
            var5 = true;
         }
      } else if (super.R.equals(GameScreen.f.cB)) {
         var5 = true;
      }

      if (var5) {
         super.bo = 10;

         for(int var2 = 0; var2 < this.f.length; ++var2) {
            int var10002 = this.f[var2]++;
            if (this.f[var2] >= 360) {
               this.f[var2] = 0;
            }
         }
      }

   }

   public final void a(mGraphics var1) {
      if (this.c != null) {
         this.c.a(var1);
      }

      boolean var2 = false;
      if (super.cO != null) {
         if (GameScreen.f.cO != null && super.cO.b == GameScreen.f.cO.b) {
            var2 = true;
         }
      } else if (super.R.equals(GameScreen.f.cB)) {
         var2 = true;
      }

      if (var2) {
         this.a(var1, super.aY - 1, super.aZ - super.bo - super.bj + super.bk - super.be - 20, 2);
         String var6 = null;
         if (!(var6 = hso_cs.b(this.g - hso_dw.a())).equals("")) {
            hso_o.k.a(var1, var6, super.aY, super.aZ - super.bo - super.bj + super.bk - super.be - 40, 3, false);
         }

         hso_o.k.a(var1, hso_df.ac + super.by, super.aY, super.aZ - super.bo - super.bj + super.bk - super.be - 55, 3, false);

         for(int var7 = 0; var7 < this.f.length; ++var7) {
            if (this.e != null) {
               this.e.c(this.b / 2 % this.e.c, hso_ak.b(this.f[var7]) * this.d / 1024 + super.aY + 2, hso_ak.a(this.f[var7]) * this.d / 1024 + super.aZ, 0, 3, var1);
            }
         }
      }

   }

   public final void h() {
   }

   public final void p_() {
   }

   public final void z() {
   }

   public final void A() {
   }
}
