public final class hso_ea extends hso_bw {
   public byte am;
   public byte an;
   public int ao;
   public short ap;
   public int aq;
   private int aw;
   public short ar;
   public short as;
   private short ax;
   private short ay;
   private short az;
   private short aA;
   public short at;
   public hso_cz au;
   public short[] av;
   private boolean aB;

   public hso_ea() {
   }

   public hso_ea(int var1, String var2, int var3, int var4, int var5, int var6, hso_cz[] var7, int var8, short var9, int var10, byte var11, byte var12) {
      super.i = var2;
      super.g = var2;
      super.t = var3;
      super.O = var1;
      super.z = 0;
      if (super.z > 0) {
         super.g = super.g + " +" + super.z;
      }

      super.N = var4;
      super.M = var5;
      super.u = 9;
      super.j = var7;
      super.R = 14;
      super.v = -1;
      super.q = 0L;
      super.S = var9;
      super.x = 0;
      super.y = 0;
      super.p = 0;
      if (super.p > 0) {
         super.D = hso_ft.aj;
      } else {
         super.D = 0L;
      }

      super.Q = 0;
      this.ao = var10;
      if ((hso_es)hso_s.b.a("" + var12) != null) {
         this.aB = true;
      }

      this.an = var11;
      this.am = var12;
      if (super.j != null && super.j.length > 0 || super.q > 0L || super.D > 0L) {
         if (super.j != null && super.j.length > 0) {
            hso_ak.a(var7);
         }

         this.d();
      }

      super.C = 10;
      if (super.j != null && super.j.length > 0) {
         for(var1 = 0; var1 < super.j.length; ++var1) {
            hso_cz var13;
            if ((var13 = super.j[var1]).a <= 6 && var13.b > 0) {
               this.au = var13;
            }
         }
      }

   }

   public final void a(int var1, short var2, short var3, short var4, short var5, short var6, short var7, short var8, short var9) {
      this.aq = var1;
      this.ar = var2;
      this.as = var7;
      this.aA = var3;
      this.az = var4;
      this.ay = var5;
      this.ax = var6;
      this.at = var8;
      this.ap = var9;
      this.av = new short[4];
      this.av[0] = this.aA;
      this.av[1] = this.az;
      this.av[2] = this.ay;
      this.av[3] = this.ax;
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public final void b(mGraphics var1, int var2, int var3, int var4, int var5) {
      hso_fd var6 = hso_bk.l((short)this.am);
      if (this.aB) {
         if (var6.a != null) {
            byte var7 = 0;
            hso_es var16 = new hso_es();
            hso_es var8;
            if ((var8 = (hso_es)hso_s.b.a("" + this.am)) != null) {
               var16 = var8;
            }

            hso_fa var9;
            if ((var9 = (hso_fa)var16.a(0)) != null && var9.a <= -5) {
               var7 = 15;
            }

            var1.a(MainObject.db, var2, var3 + 10, 3);
            mGraphics var10001 = var1;
            int var11 = var3 + var7;
            int var21 = var2;
            hso_fd var19 = var6;
            mGraphics var17 = var10001;
            hso_ea var15 = this;
            hso_es var12 = new hso_es();
            hso_es var13;
            if ((var13 = (hso_es)hso_s.b.a("" + this.am)) != null) {
               var12 = var13;
            }

            if (var12.c() != 0) {
               try {
                  hso_fa var14;
                  if ((var14 = (hso_fa)var12.a(0)) != null && (hso_es)hso_s.b.a("" + var15.am) != null && var19 != null && var19.a != null) {
                     var14.a(var17, var14.a(var15.aw, 0, 0), var21, var11, 0, var19.a);
                  }
               } catch (Exception var10) {
               }
            }

            var16 = new hso_es();
            if ((var8 = (hso_es)hso_s.b.a("" + this.am)) != null) {
               var16 = var8;
            }

            var9 = null;
            if (var16.c() > 0) {
               var9 = (hso_fa)var16.a(0);
               this.aw = (byte)((this.aw + 1) % var9.a(0, 0).a.length);
            }

            return;
         }
      } else {
         if (this.ao != 2) {
            var1.a(MainObject.db, var2, var3 + 10, 3);
            var3 -= 10;
         }

         if (var6.a != null) {
            int var18 = hso_aq.b(var6.a.a) / this.an;
            int var20 = hso_aq.a(var6.a.a) / 2;
            var1.a(var6.a, var20 * (this.a(var5) / 3), var18 * (this.a(var5) % 3), var20, var18, 0, var2, var3 + var4, 33);
         }
      }

   }

   private int a(int var1) {
      switch(this.ao) {
      case 0:
         return hso_s.f[var1][0][hso_ft.ai % hso_s.f[var1][0].length];
      case 1:
         return hso_s.e[var1][0][hso_ft.ai % hso_s.e[var1][0].length];
      case 2:
         return hso_s.d[var1][0][hso_ft.ai % hso_s.d[var1][0].length];
      case 3:
         return hso_s.g[var1][0][hso_ft.ai % hso_s.g[var1][0].length];
      default:
         return hso_s.c[var1][0][hso_ft.ai % hso_s.c[var1][0].length];
      }
   }
}
