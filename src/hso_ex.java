import javax.microedition.lcdui.Image;

public final class hso_ex {
   public int a;
   public int b;
   public static int c = 1;
   public hso_aw d = new hso_aw();
   public static hso_aq e;
   public static hso_es f = new hso_es("MiniMap vecNPC_Map");
   public static hso_en g;

   public hso_ex() {
      int[] var10000 = new int[]{-15731219, -661753, -4539997, -1173963};
   }

   public final void a() {
      if (hso_ft.W > 300 && hso_ft.X > 300) {
         c = 3;
      } else if (hso_ft.W > 200 && hso_ft.X > 200) {
         c = 2;
      }

      this.a = 25;
      this.b = 20;
      if (this.a > hso_ft.p.e) {
         this.a = hso_ft.p.e;
      }

      if (this.b > hso_ft.p.f) {
         this.b = hso_ft.p.f;
      }

      if (hso_ft.A) {
         hso_cf.N = hso_ft.W - hso_ft.q.a * c - 55;
      }

      this.d.a((hso_ft.p.e - this.a) * c, (hso_ft.p.f - this.b) * c, (GameScreen.f.aY / hso_cs.l - this.a / 2) * c, (GameScreen.f.aZ / hso_cs.l - this.b / 2) * c);
      e = a(c);
   }

   public final void a(mGraphics var1) {
      if (!hso_cf.i() && !hso_cf.j()) {
         var1.a(-9164782);
         var1.c(-3, -3, this.a * c + 6, this.b * c + 6);
         var1.a(-470164);
         var1.c(-2, -2, this.a * c + 4, this.b * c + 4);
         var1.a(-12052464);
         var1.c(-1, -1, this.a * c + 2, this.b * c + 2);
         var1.d(0, 0, this.a * c, this.b * c);
         var1.a(-this.d.a, -this.d.b);
         if (e != null && e.a != null) {
            var1.a(e, 0, 0, 0);
         }

         int var2;
         if (hso_cs.w == 2) {
            for(var2 = 0; var2 < GameScreen.i.c(); ++var2) {
               MainObject var3;
               if ((var3 = (MainObject)GameScreen.i.a(var2)).cu == 1) {
                  hso_cg.aD.b(11, var3.aY / hso_cs.l * c, var3.aZ / hso_cs.l * c, 0, 3, var1);
               }
            }
         }

         for(var2 = 0; var2 < f.c(); ++var2) {
            hso_fk var4 = (hso_fk)f.a(var2);
            hso_cg.aD.b(var4.d + 4, var4.b / hso_cs.l * c, var4.c / hso_cs.l * c, 0, 3, var1);
         }

         hso_cg.aD.b(GameScreen.f.cF == 4 ? 9 : GameScreen.f.Direction, GameScreen.f.aY / hso_cs.l * c, GameScreen.f.aZ / hso_cs.l * c, 0, 3, var1);
         if (hso_cs.k == 9) {
            var1.a(367554);
         } else {
            var1.a(-16776961);
         }

         if (Player.N != null) {
            for(var2 = 0; var2 < Player.N.b.c(); ++var2) {
               hso_aj var5;
               if ((var5 = (hso_aj)Player.N.b.a(var2)).b.compareTo(GameScreen.f.cB) != 0 && var5.f == hso_ft.p.d) {
                  hso_cg.aD.b(10, var5.d / hso_cs.l * c, var5.e / hso_cs.l * c, 0, 3, var1);
               }
            }
         }

         if (g != null && g.p == hso_ft.p.d) {
            var2 = g.a;
            int var6 = g.b;
            if (var2 < this.d.a + 3) {
               var2 = this.d.a + 3;
            }

            if (var2 > this.d.a + this.a * c - 3) {
               var2 = this.d.a + this.a * c - 3;
            }

            if (var6 < this.d.b + 3) {
               var6 = this.d.b + 3;
            }

            if (var6 > this.d.b + this.b * c - 3) {
               var6 = this.d.b + this.b * c - 3;
            }

            hso_ck.b.b(hso_ft.ai / 2 % hso_ck.b.c, var2, var6, 0, 3, var1);
         }

      }
   }

   public static void a(hso_fk var0) {
      MainObject var1;
      if ((var1 = MainObject.a(var0.a, (byte)2)) != null) {
         MainObject var2 = var1;

         int var3;
         for(var3 = 0; var3 < hso_ew.a.c(); ++var3) {
            if (((hso_ew)hso_ew.a.a(var3)).h == var2.ct && (var2.cn == 0 || var2.cn == 2)) {
               var2.cn = 1;
            }
         }

         for(var3 = 0; var3 < hso_ew.b.c(); ++var3) {
            if (((hso_ew)hso_ew.b.a(var3)).g == var2.ct) {
               var2.cn = 3;
            }
         }

         for(var3 = 0; var3 < hso_ew.c.c(); ++var3) {
            if (((hso_ew)hso_ew.c.a(var3)).g == var2.ct && var2.cn == 0) {
               var2.cn = 2;
            }
         }

         for(var3 = 0; var3 < hso_ew.d.c(); ++var3) {
            if (((hso_ew)hso_ew.d.a(var3)).g == var2.ct && var2.cn == 0) {
               var2.cn = 2;
            }
         }

         var0.d = var1.cn;
         f.a(var0);
      }

   }

   public static void a(int var0, byte var1) {
      MainObject var4;
      if ((var4 = MainObject.a(var0, (byte)1)) != null) {
         hso_fk var5;
         (var5 = new hso_fk(var0, var4.aY, var4.aZ)).d = 8;

         for(int var2 = 0; var2 < f.c(); ++var2) {
            hso_fk var3;
            if ((var3 = (hso_fk)f.a(var2)).a == var0 && var3.d == var5.d) {
               var3.b = var5.b;
               var3.c = var5.c;
               return;
            }
         }

         f.a(var5);
      }

   }

   public static void a(int var0, int var1, int var2) {
      if (g == null) {
         g = new hso_en();
      }

      g.a = 51 * c - c / 2;
      g.b = 2 * c - c / 2;
      g.p = var2;
   }

   public static hso_aq a(int var0) {
      try {
         int var10000 = hso_ft.p.e * var0;
         int var3 = hso_ft.p.f * var0;
         int var2 = var10000;
         hso_aq var1;
         (var1 = new hso_aq()).a = Image.createImage(var2 * mGraphics.zoomLevel, var3 * mGraphics.zoomLevel);
         hso_bl var8;
         (var8 = new hso_bl()).a = var1.a.getGraphics();
         hso_bl var7 = var8;
         if (hso_ft.y != null) {
            var8.a.setColor(hso_ft.y.a);
            var8.a.fillRect(0, 0, var1.a.getWidth(), var1.a.getHeight());
         }

         for(var3 = 0; var3 < hso_ft.p.e; ++var3) {
            for(int var4 = 0; var4 < hso_ft.p.f; ++var4) {
               int var5;
               if ((var5 = hso_ft.p.m[var4 * hso_ft.p.e + var3] - 1) > -1 && hso_cs.s.a != null) {
                  var7.a.drawRegion(hso_cs.s.a, 0 * mGraphics.zoomLevel, var5 * 3 * mGraphics.zoomLevel, var0 * mGraphics.zoomLevel, var0 * mGraphics.zoomLevel, 0, var3 * var0 * mGraphics.zoomLevel, var4 * var0 * mGraphics.zoomLevel, 0);
               }
            }
         }

         for(var3 = 0; var3 < hso_cs.a.c(); ++var3) {
            hso_en var9 = (hso_en)hso_cs.a.a(var3);
            var7.a.setColor(-10621185);
            switch(var9.n) {
            case 0:
               var7.a.fillRect((var9.a * var0 / hso_cs.l - var0) * mGraphics.zoomLevel, (var9.b * var0 / hso_cs.l - var0 * 2) * mGraphics.zoomLevel, var0 * mGraphics.zoomLevel, (var0 << 2) * mGraphics.zoomLevel);
               break;
            case 1:
               var7.a.fillRect(var9.a * var0 / hso_cs.l * mGraphics.zoomLevel, (var9.b * var0 / hso_cs.l - var0 * 2) * mGraphics.zoomLevel, var0 * mGraphics.zoomLevel, (var0 << 2) * mGraphics.zoomLevel);
               break;
            case 2:
               var7.a.fillRect((var9.a * var0 / hso_cs.l - var0 * 2) * mGraphics.zoomLevel, var9.b * var0 / hso_cs.l * mGraphics.zoomLevel, var0 * 4 * mGraphics.zoomLevel, var0 * mGraphics.zoomLevel);
               break;
            case 3:
               var7.a.fillRect((var9.a * var0 / hso_cs.l - var0 * 2) * mGraphics.zoomLevel, var9.b * var0 / hso_cs.l * mGraphics.zoomLevel, var0 * 4 * mGraphics.zoomLevel, var0 * mGraphics.zoomLevel);
            }
         }

         return var1;
      } catch (Exception var6) {
         hso_dw.a("--CreateMiniMap: " + var6.toString());
         return null;
      }
   }
}
