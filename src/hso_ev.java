public final class hso_ev {
   public static hso_ek a = new hso_ek();
   public int b;
   public String c;
   public String d;
   public byte e;
   public byte f;
   public byte g;
   public short h;
   public short i;
   public short j;
   public hso_fc[] k;
   public byte l;
   private String[] m;

   public final void a(mGraphics var1, int var2, int var3, int var4) {
      hso_fd var5;
      if ((var5 = hso_bk.h((short)this.f)).a != null) {
         var1.a(var5.a, var2, var3, 3);
      } else {
         var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, var2, var3, 3);
      }
   }

   public final String[] a() {
      if (this.m == null) {
         int var2;
         if (GameScreen.f.by < this.i) {
            String[] var1 = hso_o.j.a(this.d, hso_fl.aU > 0 ? hso_fl.aU - 10 : 126);
            this.m = new String[var1.length + 1];
            if (GameScreen.f.by < this.i) {
               this.m[0] = hso_df.bl + hso_df.ac + this.i;
            }

            for(var2 = 1; var2 < this.m.length; ++var2) {
               this.m[var2] = var1[var2 - 1];
            }
         } else {
            int var6;
            if ((var6 = Player.I[this.b]) > 0) {
               var6 += Player.J[this.b];
            }

            if ((var2 = var6 - 1) < 0) {
               var2 = 0;
            }

            if (this.b == 0 || var2 >= 15) {
               var2 = 0;
            }

            hso_fc var7;
            hso_fc var3 = var7 = this.k[var2];
            String[] var4 = null;
            int var5 = 0;
            if (var3.a > 0) {
               ++var5;
            }

            if (var3.h > 0) {
               ++var5;
            }

            if (var3.i > 0) {
               ++var5;
            }

            if (var3.b > 0) {
               ++var5;
            }

            if (var3.c > 0) {
               ++var5;
            }

            if (var3.d > 0) {
               ++var5;
            }

            if (var3.g > 0) {
               ++var5;
            }

            var4 = new String[var5];
            var5 = 0;
            if (var3.a > 0) {
               ++var5;
               var4[0] = hso_df.bm + var3.a;
            }

            if (var3.g > 0) {
               var4[var5++] = hso_df.bn + var3.g / 1000 + "s";
            }

            if (var3.h > 0) {
               var4[var5++] = hso_df.bo + var3.h / 1000 + "s";
            }

            if (var3.i > 0) {
               var4[var5++] = hso_df.bp + var3.i;
            }

            if (var3.b > 0) {
               var4[var5++] = hso_df.bq + var3.b / 1000 + "s";
            }

            if (var3.c > 0) {
               var4[var5++] = hso_df.br + var3.c / 10 + "%";
            }

            if (var3.d > 0) {
               var4[var5] = hso_df.bs + var3.d / 10 + "%";
            }

            String[] var8 = var4;
            String[] var9 = this.a(var2, Player.I[this.b] == 0);
            int var10 = var4.length + var9.length + var7.k.length;
            this.m = new String[var10];
            var10 = 0;

            for(var5 = 0; var5 < var9.length; ++var5) {
               this.m[var10] = var9[var5];
               ++var10;
            }

            for(var5 = 0; var5 < var8.length; ++var5) {
               this.m[var10] = var8[var5];
               ++var10;
            }

            for(var5 = 0; var5 < var7.k.length; ++var5) {
               this.m[var10] = hso_bw.d[var7.k[var5].a] + ": " + hso_bw.a(hso_bw.f[var7.k[var5].a], (int)var7.k[var5].b);
               ++var10;
            }
         }
      }

      return this.m;
   }

   private String[] a(int var1, boolean var2) {
      String[] var3 = null;
      boolean var4 = false;
      String[] var5 = hso_o.j.a(this.d, hso_fl.aU > 0 ? hso_fl.aU - 10 : 126);
      int var8 = 0 + var5.length + 1;
      if (var2) {
         ++var8;
      } else if (Player.I[this.b] < 10 && this.b != 0) {
         ++var8;
      }

      if (this.e == 1) {
         ++var8;
      }

      if (this.k[var1].f > 0) {
         ++var8;
      }

      var3 = new String[var8];
      var8 = 0;
      if (var2) {
         var3[0] = hso_df.bk;
         ++var8;
      } else if (Player.I[this.b] < 10 && this.b != 0) {
         var3[0] = hso_df.dN + this.k[var1].e;
         ++var8;
      }

      String var6 = "[" + hso_df.bB + hso_df.bz + "]";
      if (this.e == 1) {
         var6 = "[" + hso_df.bB + hso_df.by + "]";
      } else if (this.e == 2) {
         var6 = "[" + hso_df.bB + hso_df.bA + "]";
      }

      var3[var8] = var6;
      ++var8;

      for(int var7 = 0; var7 < var5.length; ++var7) {
         var3[var8] = var5[var7];
         ++var8;
      }

      if (this.e == 1) {
         var6 = hso_df.cM + " : ";
         switch(this.g) {
         case 0:
            var6 = var6 + hso_df.bv;
            break;
         case 1:
            var6 = var6 + hso_df.bu;
            break;
         case 2:
            var6 = var6 + hso_df.bw;
            break;
         case 3:
            var6 = var6 + hso_df.bx;
         }

         var3[var8++] = var6;
      }

      if (this.k[var1].f > 0) {
         var3[var8] = hso_df.bt + this.k[var1].f;
      }

      return var3;
   }

   public static void b() {
      for(int var0 = 0; var0 < hso_y.a.c(); ++var0) {
         ((hso_ev)hso_y.a.a(var0)).m = null;
      }

   }
}
