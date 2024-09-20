import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class hso_y extends hso_fl {
   private static int[][] b;
   private int c = 22;
   private int d;
   private int e;
   private hso_bt f;
   private hso_bt g;
   private hso_bt h;
   private hso_bt i;
   private hso_bt j;
   private hso_bt k;
   private hso_dy l;
   private hso_bp m;
   private hso_es n;
   public static hso_es a = new hso_es("TabSkillsNew vecPaintSkill");
   private boolean o = false;
   private hso_es p = new hso_es();
   private int[] q = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};
   private int r = 4;
   private int s;

   public hso_y(String var1) {
      super.K = 3;
      super.X = var1;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3 + hso_fl.S % 8 / 2;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      b = hso_dw.a(Player.f, 2);
      int var3 = super.W + hso_fl.aM / 2 + hso_ft.ab;

      for(int var2 = 0; var2 < Player.f; ++var2) {
         if (var2 == 0) {
            b[var2][0] = super.V + hso_fl.S / 2;
            b[var2][1] = var3;
            var3 += this.c << 1;
         } else {
            b[var2][1] = var3;
            if (var2 % 2 == 1) {
               b[var2][0] = super.V + hso_fl.S / 4;
            } else {
               b[var2][0] = super.V + hso_fl.S / 4 * 3;
               var3 += this.c << 1;
            }
         }
      }

      this.b();
      super.aT = new hso_bt(hso_df.af, -1, this);
      if (hso_ft.A) {
         super.aT.a = hso_df.Z;
      }

      this.f = new hso_bt(hso_df.aB, 0, this);
      this.g = new hso_bt(hso_df.aC, 1, this);
      this.h = new hso_bt(hso_df.aC, 2, this);
      this.i = new hso_bt(hso_df.aQ, 3, this);
      this.j = new hso_bt(hso_df.Y, 5, this);
      this.k = new hso_bt(hso_df.fx, 6, this);
      this.s = hso_fl.S / 8;
      this.p.d();
   }

   public final void b() {
      hso_fl.bi = 0;
      int var1 = b[Player.f - 1][1] - super.W + this.c - hso_fl.T + 5;
      hso_p.e.a(0, var1, 0, 0);
      this.m = new hso_bp(super.V, super.W + hso_ft.ab + 2, hso_fl.S, hso_fl.T - hso_ft.ab - 2, 0, 0, hso_p.e.f);
      if (!hso_ft.A) {
         super.Z = super.aT;
         super.aa = this.j;
      }

      if (hso_ft.A) {
         this.d = -1;
      } else {
         this.d = 0;
      }

      super.aY = null;
   }

   public final void c() {
      if (this.o) {
         f();
         this.o = false;
      }

      hso_fl.bi = 0;
      hso_fl.aO = 0;
      if (hso_ft.A) {
         this.d = -1;
      } else {
         this.d = 0;
      }

      super.c();
   }

   public final void a(int var1, int var2) {
      if (this.d != -1 && this.d <= a.c() - 1 || var1 == -1) {
         hso_es var5;
         int var8;
         switch(var1) {
         case -1:
            this.c();
            break;
         case 0:
            hso_ev var7;
            if ((var7 = (hso_ev)a.a(this.d)).i > GameScreen.f.by) {
               hso_ft.a(hso_df.bZ);
               return;
            }

            if (Player.u == 1) {
               hso_ft.c(hso_df.aP + var7.c, this.h);
            } else if (Player.u > 0) {
               if ((var8 = Player.u) > 10 - Player.I[var7.b]) {
                  var8 = 10 - Player.I[var7.b];
               }

               this.l = new hso_dy();
               this.l.a(hso_df.aN + var7.c + " (" + hso_df.aO + var8 + ")", this.g, true, hso_df.dr);
               hso_ft.r = this.l;
            }
            break;
         case 1:
            boolean var9 = false;

            short var10;
            try {
               var10 = Short.parseShort(this.l.a.j());
            } catch (Exception var6) {
               var10 = 0;
            }

            if (var10 < 1) {
               return;
            }

            Service.a().a((byte)1, (byte)((byte)((hso_ev)a.a(this.d)).b), (short)var10);
            if (GameScreen.p.d(8, 7)) {
               ++GameScreen.p.b;
               GameScreen.p.g();
            } else {
               hso_ft.j();
            }
            break;
         case 2:
            hso_ft.j();
            Service.a().a((byte)1, (byte)((byte)((hso_ev)a.a(this.d)).b), (short)1);
            if (GameScreen.p.d(8, 7)) {
               ++GameScreen.p.b;
               GameScreen.p.g();
            }

            hso_fl.bi = 0;
            break;
         case 3:
            hso_es var3 = new hso_es("TabSkillsNew menu");

            for(var8 = 0; var8 < 5; ++var8) {
               var5 = null;
               hso_bt var11;
               if (!hso_ft.A) {
                  if (hso_fi.h) {
                     var11 = new hso_bt(hso_df.ag + hso_cf.A[var8], 4, var8, this);
                  } else {
                     var11 = new hso_bt(hso_df.ag + hso_cf.z[var8], 4, var8, this);
                  }
               } else {
                  var11 = new hso_bt(hso_df.ce + (var8 + 1), 4, var8, this);
               }

               var3.a(var11);
            }

            hso_ft.o.a(var3, 2, hso_df.aQ, false, (hso_es)null);
            break;
         case 4:
            hso_ev var4 = (hso_ev)a.a(this.d);
            Player.w[Player.d][var2].a(var4.b, 0, (byte)0);
            if (hso_ft.A) {
               f();
            } else {
               this.o = true;
            }
            break;
         case 5:
            if (this.d == -1) {
               return;
            }

            new hso_es("TabSkillsNew vecmenu");
            var5 = null;
            if ((var5 = this.h()) != null && var5.c() > 0) {
               hso_ft.o.a(var5, 2, hso_df.bB, false, (hso_es)null);
            }
            break;
         case 6:
            Service.a().c((byte)2, (byte)((byte)((hso_ev)a.a(this.d)).b));
            this.p.d();
         }

         super.a(var1, var2);
      }
   }

   public final void a(hso_es var1) {
      b = null;
      super.V = super.L + hso_fl.aM + hso_fl.aN * 3 + hso_fl.S % 8 / 2;
      super.W = 0 + hso_ft.X / 5 + hso_fl.aM;
      b = hso_dw.a(Player.f, 2);
      int var2 = super.W + hso_fl.aM / 2 + hso_ft.ab;

      for(int var3 = 0; var3 < var1.c(); ++var3) {
         hso_ev var4;
         if ((var4 = (hso_ev)var1.a(var3)) != null) {
            if (var3 == 0) {
               b[var3][0] = super.V + hso_fl.S / 2;
               b[var3][1] = var2;
               var2 += this.c << 1;
            } else {
               b[var3][1] = var2;
               if (var4.l == 0) {
                  b[var3][0] = super.V + hso_fl.S / 4;
               } else if (var4.l == 1) {
                  b[var3][0] = super.V + hso_fl.S / 4 * 3;
                  if (var3 < var1.c() - 2) {
                     var2 += this.c << 1;
                  }
               }
            }
         }
      }

   }

   public final void a(mGraphics var1) {
      hso_o.j.a(var1, hso_df.am + Player.u, super.V + 2, super.W + 3, 0, true);
      var1.d(super.V, super.W + hso_ft.ab + 2, hso_fl.S, hso_fl.T - 2 - hso_ft.ab);
      var1.a(0, -hso_p.e.b);

      int var2;
      for(var2 = 0; var2 < a.c(); ++var2) {
         var1.a(hso_fl.bf[6]);
          switch (this.q[var2]) {
              case 0:
                  var1.c(b[var2][0], b[var2][1] + this.c, 1, (this.r << 1) + this.c);
                  break;
              case 1:
                  var1.c(b[var2][0], b[var2][1] + this.c, 1, this.c / 2);
                  var1.c(b[var2][0] - 2 * this.s, b[var2][1] + this.c + this.c / 2, (this.s << 2) + 1, 1);
                  var1.c(b[var2][0] - 2 * this.s, b[var2][1] + this.c + this.c / 2 + 1, 1, this.c / 2);
                  var1.c(b[var2][0] + 2 * this.s, b[var2][1] + this.c + this.c / 2 + 1, 1, this.c / 2);
                  break;
              case 2:
                  var1.c(b[var2][0], b[var2][1] + this.c, 1, this.r / 2);
                  var1.c(b[var2][0] - this.s, b[var2][1] + this.c + this.r / 2, (this.s << 1) + 1, 1);
                  var1.c(b[var2][0] - this.s, b[var2][1] + this.c + this.r / 2 + 1, 1, this.r / 2 + 4);
                  var1.c(b[var2][0] + this.s, b[var2][1] + this.c + this.r / 2 + 1, 1, this.r / 2 + 4);
                  break;
              default:
                  break;
          }

         hso_ev var3;
         if ((var3 = (hso_ev)a.a(var2)) != null) {
            var3.a(var1, b[var2][0], b[var2][1] + this.c / 2, 3);
            if (var2 == this.d && hso_fl.aO == 1) {
               var1.a(hso_cg.ax, b[var2][0] - this.c / 2 - 2, b[var2][1] - 2, 0);
            }

            if (var3.i > GameScreen.f.by) {
               var1.a(hso_cg.am, 0, 0, 20, 20, 0, b[var2][0], b[var2][1] + this.c / 2, 3);
            }

            if (var2 != 0) {
               hso_cg.a(var1, String.valueOf(Player.I[var3.b]), b[var2][0] + this.c / 2 + 4, b[var2][1] + this.c / 2 - 12, 0);
               if (Player.J[var3.b] > 0) {
                  hso_cg.a(var1, "+" + Player.J[var3.b], b[var2][0] + this.c / 2 + 4, b[var2][1] + this.c - 12, 0, (byte)1);
               }
            }
         }
      }

      for(var2 = 0; var2 < this.p.c(); ++var2) {
         ((hso_dx)this.p.a(var2)).a(var1);
      }

      if ((!hso_ft.o.a && hso_ft.r == null || hso_fl.aU > 0) && hso_fl.aO == 1 && hso_fl.bi > hso_fl.aX) {
         this.a(var1, false);
         if (this.n != null) {
            for(var2 = 0; var2 < this.n.c(); ++var2) {
               hso_bt var6;
               (var6 = (hso_bt)this.n.a(var2)).a(var1, var6.h, var6.i);
            }
         }
      }

   }

   public final void a() {
      try {
         for(int var1 = 0; var1 < this.p.c(); ++var1) {
            hso_dx var2;
            (var2 = (hso_dx)this.p.a(var1)).a();
            if (var2.y) {
               this.p.d(var2);
            }
         }

         if (hso_fl.aO != 1) {
            hso_fl.bi = 0;
            return;
         }

         if (super.aY != null) {
            super.aY.c();
         }

         if (hso_fl.bi < hso_fl.aX + 2 && ++hso_fl.bi == hso_fl.aX) {
            if (this.d < Player.H.length && this.d != -1) {
               hso_ev var4;
               if ((var4 = (hso_ev)a.a(this.d)) == null) {
                  super.bj = null;
                  super.bl = null;
                  super.aY = null;
               } else {
                  super.bp = var4.c;
                  if (Player.I[var4.b] > 0) {
                     super.bp = super.bp + " Lv" + (Player.I[var4.b] + Player.J[var4.b]);
                  }

                  super.bj = var4.a();
                  super.bl = null;
                  super.aY = null;
                  int var5;
                  if (hso_fl.aU > 0) {
                     if ((var5 = super.bj.length) * hso_ft.ab > hso_fl.U - this.e) {
                        super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U, 0, 0, var5 * hso_ft.ab - (hso_fl.U - this.e));
                     } else if (hso_ft.A) {
                        super.aY = new hso_bp(hso_fl.aV, hso_fl.aW, hso_fl.aU, hso_fl.U - this.e, 0, 0, 0);
                     }

                     this.i();
                  } else {
                     var5 = b[this.d][0];
                     super.bs = var5 - 45;
                     if (super.bs < 2) {
                        super.bs = 2;
                     } else if (super.bs + 92 > hso_ft.W) {
                        super.bs = hso_ft.W - 92;
                     }

                     super.bq = 130;
                     if ((var5 = b[this.d][1] - hso_p.e.b) < super.W + hso_fl.T / 2) {
                        super.bt = var5 + this.c + 2 + hso_p.e.b;
                     } else {
                        super.bt = var5 + 1 - hso_ft.ab * (super.bj.length + 1) - this.c / 2 + hso_p.e.b;
                     }

                     if (super.bt - hso_p.e.b + (super.bj.length + 1) * hso_ft.ab + 8 > hso_ft.X - hso_ft.aa) {
                        super.bt = hso_ft.X - hso_ft.aa - ((super.bj.length + 1) * hso_ft.ab + 8 - hso_p.e.b);
                     }

                     if (super.bt < hso_p.e.b) {
                        super.bt = hso_p.e.b;
                     }

                     if ((var5 = super.bj.length) * hso_ft.ab > hso_fl.U) {
                        super.aY = new hso_bp(super.bs, super.bt, super.bq, hso_fl.U, 0, 0, var5 * hso_ft.ab - hso_fl.U);
                     }
                  }
               }
            } else {
               hso_fl.bi = 0;
            }
         }

         if (hso_ft.A) {
            this.m.c();
            return;
         }

         hso_p.e.a();
         if (super.bt < hso_p.e.b + 4) {
            super.bt = hso_p.e.b + 4;
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public final void d() {
      super.d();
      if (hso_fl.aO == 1) {
         int var1 = this.d;
         if (hso_ft.al[2] || hso_ft.al[8] || hso_ft.al[4] || hso_ft.al[6]) {
            hso_eu.f = 10;
            if (this.d == -1) {
               hso_ft.m();
               this.d = 0;
               return;
            }
         }

         if (super.aY != null) {
            hso_bp var10000;
            if (hso_ft.al[2]) {
               if (super.aY.e > 0) {
                  var10000 = super.aY;
                  var10000.e -= hso_ft.ab;
               } else {
                  super.aY.e = 0;
               }

               hso_ft.d(2);
            } else if (hso_ft.al[8]) {
               if (super.aY.e < super.aY.g) {
                  var10000 = super.aY;
                  var10000.e += hso_ft.ab;
               } else {
                  super.aY.e = super.aY.g;
               }

               hso_ft.d(8);
            }
         } else if (hso_ft.al[2]) {
            this.d -= 2;
            if (this.d < 0) {
               this.d = 0;
            }

            hso_eu.f = 10;
            hso_ft.d(2);
         } else if (hso_ft.al[8]) {
            hso_eu.f = 10;
            this.d += 2;
            if (this.d > a.c() - 1) {
               this.d = a.c() - 1;
            }

            hso_ft.d(8);
         }

         if (hso_ft.al[4]) {
            hso_eu.f = 10;
            if (this.d % 2 != 1 && this.d != 0) {
               --this.d;
            } else {
               hso_fl.aO = 0;
               this.d = 0;
            }

            hso_ft.d(4);
         } else if (hso_ft.al[6]) {
            hso_eu.f = 10;
            if (this.d < a.c() - 1) {
               ++this.d;
            }

            hso_ft.d(6);
         }

         if (this.d < 0) {
            this.d = -1;
            return;
         }

         this.d = hso_cg.a(this.d, a.c() - 1, false);
         hso_ev var2 = null;
         if (this.d != var1 && this.d >= 0 && this.d <= a.c() - 1) {
            super.aY = null;
            this.i();
            hso_fl.bi = 0;
            hso_p.e.a(0, b[this.d][1] - super.W - hso_fl.T / 2);
            var2 = (hso_ev)a.a(this.d);
         }

         if (!hso_ft.A && var2 != null) {
            if (super.aa == null) {
               if (var2.i <= GameScreen.f.by && (Player.I[var2.b] != 0 || Player.u > 0)) {
                  super.aa = this.j;
                  return;
               }
            } else if (var2.i > GameScreen.f.by || Player.I[var2.b] == 0 && Player.u == 0) {
               super.aa = null;
            }
         }
      }

   }

   public final void e() {
      boolean var1 = false;
      if (super.aY != null && hso_ft.c(super.aY.c, super.aY.d, super.aY.a, super.aY.b)) {
         super.aY.a();
         var1 = true;
      }

      if (hso_ft.A && !var1) {
         this.m.a();
         hso_p.e.b = this.m.f;
      }

      int var3;
      if (hso_ft.b(super.V, super.W, hso_fl.S, hso_fl.T) && !var1) {
         for(var3 = 0; var3 < b.length; ++var3) {
            if (hso_ft.c(b[var3][0] - this.c / 2 - 2, b[var3][1] - 2 - hso_p.e.b, this.c + 4, this.c + 4)) {
               if (var3 != this.d) {
                  super.aY = null;
                  this.d = var3;
                  hso_fl.bi = 0;
               } else if (hso_fl.aU == 0) {
                  if (this.d == -1) {
                     return;
                  }

                  new hso_es("TabSkillsNew vecmenu2");
                  hso_es var2 = null;
                  if ((var2 = this.h()) != null && var2.c() > 0) {
                     hso_ft.o.a(var2, 2, hso_df.bB, false, (hso_es)null);
                  }
               }

               hso_ft.S = false;
               this.i();
               break;
            }
         }

         if (hso_fl.aU == 0) {
            hso_fl.bi = 0;
         }

         hso_ft.S = false;
      }

      if (this.n != null && hso_fl.aO == 1 && hso_fl.bi > hso_fl.aX) {
         for(var3 = 0; var3 < this.n.c(); ++var3) {
            ((hso_bt)this.n.a(var3)).b();
         }
      }

      super.e();
   }

   private hso_es h() {
      hso_es var1 = new hso_es("TabSkillsNew menu2");
      hso_ev var2 = null;
      var2 = (hso_ev)a.a(this.d);
      if (this.d < 0 && this.d >= a.c()) {
         return var1;
      } else {
         if (Player.u > 0 && this.d > 0 && Player.I[var2.b] < 10 && GameScreen.f.by >= var2.i) {
            var1.a(this.f);
         }

         if (var2.e != 2 && Player.I[var2.b] > 0) {
            if (var1.c() == 0 && hso_fl.aU == 0) {
               this.i.a();
               return null;
            }

            var1.a(this.i);
         }

         var1.a(this.k);
         this.e = (var1.c() + 1) / 2 * hso_bt.k;
         return var1;
      }
   }

   public static void f() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         for(int var2 = 0; var2 < Player.w.length; ++var2) {
            for(int var3 = 0; var3 < Player.w[0].length; ++var3) {
               hso_ao var4 = Player.w[var2][var3];
               var1.writeShort(var4.a);
               var1.writeByte(var4.b);
               var1.writeByte(var4.c);
            }
         }

         hso_ak.a((byte)0, var0.toByteArray());
         var1.close();
      } catch (Exception var5) {
      }
   }

   private void i() {
      if (hso_fl.aU > 0 && hso_ft.A && this.d >= 0) {
         this.n = this.h();
         this.b(this.n);
      }

   }

   public static void a(byte[] var0) {
      if (var0 == null) {
         for(int var6 = 0; var6 < Player.w[0].length; ++var6) {
            Player.w[0][var6] = new hso_ao();
            Player.w[1][var6] = new hso_ao();
            Player.w[2][var6] = new hso_ao();
            if (var6 == 2) {
               Player.w[0][var6].a(0, 0, (byte)0);
               Player.w[1][var6].a(0, 0, (byte)0);
               Player.w[2][var6].a(0, 0, (byte)0);
            } else {
               Player.w[0][var6].a(0, hso_ao.d, (byte)0);
               Player.w[1][var6].a(0, hso_ao.d, (byte)0);
               Player.w[2][var6].a(0, hso_ao.d, (byte)0);
            }
         }

         if (GameScreen.f.by > 1) {
            hso_j.a((byte)1, false);
            hso_j.a((byte)0, false);
         }

      } else {
         ByteArrayInputStream var4 = new ByteArrayInputStream(var0);
         DataInputStream var5 = new DataInputStream(var4);

         int var2;
         try {
            for(int var1 = 0; var1 < Player.w.length; ++var1) {
               for(var2 = 0; var2 < Player.w[0].length; ++var2) {
                  Player.w[var1][var2] = new hso_ao();
                  Player.w[var1][var2].a(var5.readShort(), var5.readByte(), var5.readByte());
               }
            }

         } catch (Exception var3) {
            for(var2 = 0; var2 < Player.w[0].length; ++var2) {
               Player.w[0][var2] = new hso_ao();
               Player.w[1][var2] = new hso_ao();
               Player.w[2][var2] = new hso_ao();
               if (var2 == 2) {
                  Player.w[0][var2].a(0, 0, (byte)0);
                  Player.w[1][var2].a(0, 0, (byte)0);
                  Player.w[2][var2].a(0, 0, (byte)0);
               } else {
                  Player.w[0][var2].a(0, hso_ao.d, (byte)0);
                  Player.w[1][var2].a(0, hso_ao.d, (byte)0);
                  Player.w[2][var2].a(0, hso_ao.d, (byte)0);
               }
            }

            if (GameScreen.f.by > 1) {
               hso_j.a((byte)1, false);
               hso_j.a((byte)0, false);
            }

         }
      }
   }
}
