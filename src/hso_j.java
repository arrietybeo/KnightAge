public final class hso_j extends hso_bw {
   public hso_j(int var1, int var2, String var3, String var4, int var5, int var6, long var7, byte var9, byte var10, byte var11, byte var12) {
      super.O = var1;
      super.t = var2;
      super.g = var3;
      super.L = var9;
      super.K = var5;
      super.u = var6;
      super.q = var7;
      super.Q = var10;
      super.x = var11;
      super.y = var12;
      super.a(var4);
      super.C = 0;
   }

   public final void a(String var1) {
      super.a(var1);
   }

   public hso_j() {
   }

   public static hso_j a(int var0, String var1, int var2, byte var3, int var4, int var5, int var6, hso_cz[] var7, int var8, boolean var9, short var10, long var11, short var13, byte var14, byte var15, int var16, byte var17, byte var18) {
      return new hso_j(var0, var1, var2, var3, var4, var5, var6, var7, var8, false, var10, var11, var13, var14, var15, var16, var17, var18);
   }

   public hso_j(int var1, String var2, int var3, byte var4, int var5, int var6, int var7, hso_cz[] var8, int var9, boolean var10, short var11, long var12, short var14, byte var15, byte var16, int var17, byte var18, byte var19, int var20, long var21) {
      super.i = var2;
      super.g = var2;
      super.t = var3;
      super.O = var1;
      super.z = var4;
      if (super.z > 0) {
         super.g = super.g + " +" + super.z;
      }

      super.N = var5;
      super.M = var6;
      super.u = var7;
      super.j = var8;
      super.R = var9;
      super.v = var11;
      super.q = var12;
      super.S = var14;
      super.x = var15;
      super.y = var16;
      super.p = var17;
      super.B = var19;
      super.F = var20;
      super.G = var21;
      if (var17 > 0) {
         super.D = hso_ft.aj;
      } else {
         super.D = 0L;
      }

      super.Q = var18;
      if (super.j != null && super.j.length > 0 || super.q > 0L || super.D > 0L) {
         if (super.j != null && super.j.length > 0) {
            hso_ak.a(var8);
         }

         if (!var10) {
            this.d();
         } else {
            this.c();
         }
      }

      super.C = 10;
   }

   public hso_j(int var1, String var2, int var3, byte var4, int var5, int var6, int var7, hso_cz[] var8, int var9, boolean var10, short var11, long var12, short var14, byte var15, byte var16, int var17, byte var18, byte var19) {
      super.i = var2;
      super.g = var2;
      super.t = var3;
      super.O = var1;
      super.z = var4;
      if (super.z > 0) {
         super.g = super.g + " +" + super.z;
      }

      super.N = var5;
      super.M = var6;
      super.u = var7;
      super.j = var8;
      super.R = var9;
      super.v = var11;
      super.q = var12;
      super.S = var14;
      super.x = var15;
      super.y = var16;
      super.p = var17;
      super.B = var19;
      if (var17 > 0) {
         super.D = hso_ft.aj;
      } else {
         super.D = 0L;
      }

      super.Q = var18;
      if (super.j != null && super.j.length > 0 || super.q > 0L || super.D > 0L) {
         if (super.j != null && super.j.length > 0) {
            hso_ak.a(var8);
         }

         if (!var10) {
            this.d();
         } else {
            this.c();
         }
      }

      super.C = 10;
      super.I = new String[]{"", ""};
   }

   public hso_j(int var1, String var2, int var3, byte var4, int var5, hso_cz[] var6, short var7, long var8, byte var10, byte var11, byte var12) {
      super.g = var2;
      super.t = var3;
      super.O = var1;
      super.z = var4;
      super.u = var5;
      super.j = var6;
      super.v = var7;
      super.q = var8;
      super.Q = var10;
      super.x = var11;
      super.y = var12;
      if (super.j != null) {
         hso_ak.a(var6);
         hso_j var13 = this;
         if (super.g == null) {
            super.g = null;
         } else {
            int var14 = super.j.length;
            super.k = new String[var14];
            super.m = new int[var14];
            if ((var3 = hso_o.f.a(super.g)) > super.s - 10) {
               super.s = var3 + 10;
            }

            for(int var16 = 0; var16 < var14; ++var16) {
               hso_cz var15 = var13.j[var16];
               var13.k[var16] = hso_bw.d[var15.a] + ": " + hso_bw.a(hso_bw.f[var15.a], (int)var15.b);
               var13.m[var16] = hso_bw.e[var15.a];
               if ((var3 = hso_o.i.a(var13.k[var16])) > var13.s - 10) {
                  var13.s = var3 + 10;
               }
            }

            var13.l = new String[1];
            var13.n = new int[1];
            if (var13.q > 0L) {
               var13.l[0] = hso_df.ba + ": " + var13.q + var13.e();
               var13.n[0] = 2;
            } else {
               var13.l[0] = hso_df.dK;
               var13.n[0] = 2;
            }
         }
      }

      super.C = 1;
   }

   public hso_j(int var1, long var2) {
      super.O = var1;
      super.q = var2;
      super.Q = 1;
      super.u = 8;
      super.g = hso_df.ey;
      String var4 = hso_df.ez;
      super.a(var4);
      super.C = 1;
   }

   public static hso_j a(int var0, String var1, int var2, int var3, long var4, byte var6, String var7, int var8, byte var9, short var10, byte var11, byte var12) {
      return new hso_j(var0, var1, var2, 7, var4, var6, var7, var8, var9, var10, var11, var12);
   }

   private hso_j(int var1, String var2, int var3, int var4, long var5, byte var7, String var8, int var9, byte var10, short var11, byte var12, byte var13) {
      super.g = var2;
      super.t = var3;
      super.O = var1;
      super.u = var4;
      super.q = var5;
      super.Q = var7;
      super.P = var9;
      super.K = var11;
      super.x = var12;
      super.y = var13;
      super.h = var8;
      super.A = var10;
      if (var8 != null) {
         super.a(var8);
      }

      super.C = 2;
   }

   public hso_j(int var1, String var2, int var3, String var4, byte var5, byte var6) {
      super.O = var1;
      super.t = var1;
      super.g = var2;
      super.K = var3;
      super.u = 5;
      super.x = var5;
      super.y = var6;
      super.a(var4);
      super.C = 3;
   }

   public hso_j(int var1, String var2, int var3, int var4, byte var5, String var6, hso_cz[] var7, byte var8, byte var9, short var10, byte var11, byte var12, byte var13) {
      super.O = var1;
      super.g = var2;
      super.K = var3;
      super.t = var4;
      super.u = var5;
      super.N = var8;
      super.j = var7;
      super.M = var9;
      super.S = var10;
      super.x = 0;
      super.y = 0;
      super.z = var11;
      if (super.z > 0) {
         super.g = super.g + " +" + super.z;
      }

      if (var6 != null) {
         this.a(var6);
      } else {
         this.d();
      }

      super.C = 4;
   }

   public hso_j(String var1, int var2, int var3, byte var4, byte var5, byte var6) {
      super.N = var6;
      super.g = var1;
      super.K = var3;
      super.t = var2;
      super.u = var4;
      super.z = var5;
      if (super.z > 0) {
         super.g = super.g + " +" + super.z;
      }

   }

   public static String a(long var0) {
      String var4;
      int var1 = (var4 = "" + var0).length() / 3;
      if (var4.length() % 3 == 0) {
         --var1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = var4.length() - (var2 + 1) * 3 - var2;
         var4 = var4.substring(0, var3) + "." + var4.substring(var3, var4.length());
      }

      return var4;
   }

   public static String a(int var0) {
      if (var0 % 100 == 0) {
         return String.valueOf(var0 / 100);
      } else {
         return var0 % 10 == 0 ? var0 / 100 + "." + var0 % 100 / 10 : var0 / 100 + "." + var0 % 100 / 10 + var0 % 10;
      }
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public final void b(mGraphics var1, int var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, 21, 1);
   }

   public final void c(mGraphics var1, int var2, int var3, int var4, int var5, int var6) {
      super.c(var1, var2, var3, var4, var5, var6);
   }

   public static void a(byte var0, boolean var1) {
      hso_ao var2 = null;
      if (var0 == 0) {
         var2 = Player.w[Player.d][4];
      } else if (var0 == 1) {
         var2 = Player.w[Player.d][3];
      }

      if (var2 == null || var2.b != hso_ao.d) {
         (var2 = new hso_ao()).b = hso_ao.d;
      }

      for(int var3 = 0; var3 < hso_bw.V.c(); ++var3) {
         hso_j var4;
         if ((var4 = (hso_j)hso_bw.V.a(var3)).u == 4 && var4.L == var0 && (var2.a < var4.O && var1 || var2.a > var4.O && !var1 || var2.b == hso_ao.d)) {
            var2.a(var4.O, hso_ao.f, var0);
         }
      }

   }
}
