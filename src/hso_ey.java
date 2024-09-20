public final class hso_ey extends MainObject {
   private short a;
   private int b;
   private int c;
   private int d;
   private int e = -1;
   private int f = -1;

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         if (var2 >= 0 && var2 <= hso_ew.a.c()) {
            ((hso_ew)hso_ew.a.a(var2)).b();
         }
         break;
      case 1:
         if (var2 >= 0 && var2 <= hso_ew.b.c()) {
            ((hso_ew)hso_ew.b.a(var2)).b();
         }
         break;
      case 2:
         if (var2 >= 0 && var2 <= hso_ew.c.c()) {
            ((hso_ew)hso_ew.c.a(var2)).c();
         }
         break;
      case 3:
         if (var2 >= 0 && var2 <= hso_ew.d.c()) {
            ((hso_ew)hso_ew.d.a(var2)).c();
         }
         break;
      case 4:
         Service.a().a((byte)super.ct);
         break;
      case 5:
         hso_ey var3 = this;
         hso_es var4 = new hso_es("NPC menu2");

         int var5;
         hso_ew var6;
         hso_bt var7;
         for(var5 = 0; var5 < hso_ew.a.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.a.a(var5)).h == var3.ct) {
               (var7 = new hso_bt(var6.k, 0, var5, var3)).a((hso_ce)hso_cg.aF, 1, 1);
               var4.a(var7);
            }
         }

         for(var5 = 0; var5 < hso_ew.b.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.b.a(var5)).g == var3.ct) {
               (var7 = new hso_bt(var6.k, 1, var5, var3)).a((hso_ce)hso_cg.aF, 1, 3);
               var4.a(var7);
            }
         }

         for(var5 = 0; var5 < hso_ew.c.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.c.a(var5)).g == var3.ct) {
               (var7 = new hso_bt(var6.k, 2, var5, var3)).a((hso_ce)hso_cg.aF, 1, 2);
               var4.a(var7);
            }
         }

         for(var5 = 0; var5 < hso_ew.d.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.d.a(var5)).g == var3.ct) {
               (var7 = new hso_bt(var6.k, 3, var5, var3)).a((hso_ce)hso_cg.aF, 1, 2);
               var4.a(var7);
            }
         }

         if (var4.c() == 0) {
            hso_ft.m();
            hso_ft.l();
            hso_ft.o.f();
         } else {
            hso_ft.o.f();
            hso_ft.m();
            hso_ft.l();
            hso_ft.o.a(var4, 2, hso_df.at, false, (hso_es)null);
         }
      }

      super.a(var1, var2);
   }

   public hso_ey(String var1, String var2, byte var3, byte var4, short var5, short var6, byte var7, byte var8, byte var9) {
      super.cB = var1;
      super.cC = var2;
      super.ct = var3;
      this.a = var4;
      super.aY = var5 + 12;
      super.aZ = var6;
      this.b = var9;
      super.br = 100;
      super.bs = 100;
      super.bo = 0;
      hso_ft.p.a(var5, var6 - 24, var7, var8);
      switch(super.ct) {
      case -36:
      case -20:
      case -3:
         this.e = 44;
         this.f = 150;
      default:
         return;
      case -21:
      case -5:
         this.e = 43;
         this.f = 150;
      }
   }

   public final void a(mGraphics var1) {
      hso_fd var2;
      if (this.a != -1 && (var2 = hso_bk.a(this.a)).a != null) {
         if (super.bd == 0) {
            super.be = aq.b(var2.a.a) / this.b;
            super.bd = aq.a(var2.a.a);
         }

         var1.a(var2.a, 0, hso_ft.ai / 7 % this.b * super.be, super.bd, super.be, 0, super.aY, super.aZ, 33);
      }

      if (GameScreen.h == null || GameScreen.h != null && this != GameScreen.h || hso_cf.I) {
         this.a(var1, 0);
      }

   }

   public final void a() {
      if (super.cE != null) {
         this.a(super.cE, true);
         super.cE = null;
      }

      if (super.dk != null) {
         super.dk.d(super.aY, super.aZ - super.be - 30);
         if (super.dk.b()) {
            super.dk = null;
         }
      }

      int var1;
      int var2;
      if (super.dq && super.cJ < 70) {
         ++super.cJ;
         int var3;
         if (hso_ak.f(3) == 1) {
            if (hso_ak.f(2) == 1) {
               hso_cs.t = 103;
            }

            var1 = hso_ak.c(1, 3);

            for(var2 = 0; var2 < var1; ++var2) {
               var3 = hso_ak.g(25);
               int var4 = hso_ak.g(30);
               GameScreen.a(36, super.aY + var3, super.aZ + var4 - super.be / 2);
               if (hso_ak.f(3) == 1) {
                  GameScreen.a(9, super.aY + var3, super.aZ + var4 - super.be / 2);
               }
            }
         }

         if (super.cJ >= 70) {
            for(var1 = 0; var1 < 6; ++var1) {
               var2 = hso_ak.g(25);
               var3 = hso_ak.g(30);
               GameScreen.a(36, super.aY + var2, super.aZ + var3 - super.be / 2);
               if (hso_ak.f(3) == 1) {
                  GameScreen.a(9, super.aY + var2, super.aZ + var3 - super.be / 2);
               }
            }

            GameScreen.a(81, super.aY, super.aZ - 20, 200, (short)0, (byte)0);
            super.cK = true;
            super.dq = false;
         }
      }

      if (this.e >= 0 && hso_ft.ai % this.f == 0 && MainObject.c((MainObject)this) && this.e == 44) {
         hso_ey var5 = this;
         var1 = 0;

         for(var2 = 0; var2 < GameScreen.i.c(); ++var2) {
            MainObject var6;
            if ((var6 = (MainObject)GameScreen.i.a(var2)).cu == 0 && MainObject.c(var5.aY, var5.aZ, var6.aY, var6.aZ) <= 120) {
               ++var1;
            }
         }
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      hso_fd var4;
      if ((var4 = hso_bk.a(this.a)).a != null) {
         if (this.c <= 0) {
            if (super.bd < 0) {
               super.be = aq.b(var4.a.a) / this.b;
               super.bd = aq.a(var4.a.a);
            }

            this.c = super.bd;
            this.d = super.be;
            if (this.c > 26) {
               this.c = 26;
            }

            if (this.d > 26) {
               this.d = 26;
            }
         }

         var1.a(var4.a, super.bd / 2 - this.c / 2, 0, this.c, this.d, 0, var2, var3, 3);
      }

   }

   public final void b(mGraphics var1, int var2, int var3) {
      hso_fd var4;
      if ((var4 = hso_bk.a((short)super.cT)).a != null) {
         var1.a(var4.a, var2, var3, 40);
      }

   }

   public final boolean i_() {
      return true;
   }

   public final void k() {
      MainObject.a(GameScreen.f, this);
      if (super.co == 0) {
         Service.a().a((byte)super.ct);
      } else {
         hso_es var1 = new hso_es("NPC menu");
         hso_bt var2;
         if (super.cC.length() > 0) {
            var2 = new hso_bt(super.cC, 4, this);
            var1.a(var2);
         }

         hso_ey var5 = this;
         int var3 = 0;

         boolean var10000;
         label70:
         while(true) {
            if (var3 >= hso_ew.a.c()) {
               for(var3 = 0; var3 < hso_ew.b.c(); ++var3) {
                  if (((hso_ew)hso_ew.b.a(var3)).g == var5.ct) {
                     var10000 = true;
                     break label70;
                  }
               }

               for(var3 = 0; var3 < hso_ew.c.c(); ++var3) {
                  if (((hso_ew)hso_ew.c.a(var3)).g == var5.ct) {
                     var10000 = true;
                     break label70;
                  }
               }

               for(var3 = 0; var3 < hso_ew.d.c(); ++var3) {
                  if (((hso_ew)hso_ew.d.a(var3)).g == var5.ct) {
                     var10000 = true;
                     break label70;
                  }
               }

               var10000 = false;
               break;
            }

            if (((hso_ew)hso_ew.a.a(var3)).h == var5.ct) {
               var10000 = true;
               break;
            }

            ++var3;
         }

         if (var10000) {
            var2 = new hso_bt(hso_df.at, 5, this);
            var1.a(var2);
         }

         hso_ft.o.a(var1, super.cD, super.ct, (byte)2, false, 0);
      }
   }
}
