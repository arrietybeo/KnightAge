public final class hso_av extends hso_s {
   private byte U;
   private int V;
   private int W;
   private boolean X;
   private int ej;
   private int ek = 0;

   public hso_av(MainObject var1, short var2, byte var3, byte var4, byte var5) {
      super(var2, var3, var4, var5);
      super.w = var1;
      super.cu = 9;
      super.ct = var1.ct;
      super.F = var1.aY;
      super.G = var1.aZ;
      super.aY = var1.aY;
      super.aZ = var1.aZ;
      super.o = var1.aY;
      super.p = var1.aZ;
      super.bd = -1;
      super.be = -1;
      super.C = 48;
      super.Direction = 0;
      super.bi = 4;
      super.cF = 0;
      super.k = 0;
      super.A = hso_ak.c(200, 250);
      super.M = 0;
      super.D = 10;
      super.O = 0;
      super.a = true;
   }

   public hso_av(short var1, int var2, byte var3, byte var4, byte var5) {
      super(var1, var3, var4, var5);
      super.w = null;
      super.cu = 9;
      super.ct = var2;
      int var6 = super.h[hso_ak.f(super.h.length)].a;
      var2 = super.h[hso_ak.f(super.h.length)].b;
      super.F = var6;
      super.G = var2;
      super.aY = var6;
      super.aZ = var2;
      super.o = var6;
      super.p = var2;
      super.bd = -1;
      super.be = -1;
      super.C = 48;
      super.Direction = 0;
      super.bi = 4;
      super.cF = 0;
      this.U = 0;
      super.k = 0;
      super.A = hso_ak.c(200, 250);
      super.M = 3;
      super.D = 10;
      super.O = 0;
      super.a = true;
   }

   public hso_av() {
   }

   public final void a(mGraphics var1) {
      hso_es var2 = new hso_es();
      hso_es var3;
      if ((var3 = (hso_es)hso_s.b.a("" + super.j)) != null) {
         var2 = var3;
      }

      if (var2.c() != 0) {
         try {
            hso_fa var9;
            if ((var9 = (hso_fa)var2.a(0)) != null) {
               this.e(var1, super.aY, super.aZ);
               byte var10 = this.U;
               if (super.k == 2 && this.X) {
                  var10 = 3;
               }

               byte var4 = 0;
               int var5 = super.cF;
               hso_es var7 = new hso_es();
               hso_es var6;
               if ((var6 = (hso_es)hso_s.b.a("" + super.j)) != null) {
                  var7 = var6;
               }

               hso_fa var12;
               if ((var12 = (hso_fa)var7.a(0)) != null && var12.a <= -5) {
                  var4 = 35;
                  var1.a(MainObject.db, super.aY, super.aZ - 6, 3);
               } else {
                  if (!super.cV) {
                     var1.a(MainObject.db, super.aY, super.aZ, 3);
                  }

                  if (super.cV) {
                     var1.a(MainObject.dd, 0, (var5 != 0 ? 2 : 0) * 17 + hso_ft.ai / 2 % 2 * 17, 28, 17, 0, super.aY + 1 + super.s, super.aZ + super.bk - 4, 3);
                  }
               }

               hso_fd var11 = hso_bk.l(super.j);
               if ((hso_es)hso_s.b.a("" + super.j) != null && var11 != null && var11.a != null) {
                  var9.a(var1, var9.a(super.ce, var10, this.V), super.aY, super.aZ - var4, this.W, var11.a);
               }

               this.f(var1, super.aY, super.aZ);
               return;
            }
         } catch (Exception var8) {
         }

      }
   }

   public final void a() {
      hso_es var2 = new hso_es();
      hso_es var3;
      if ((var3 = (hso_es)hso_s.b.a("" + super.j)) != null) {
         var2 = var3;
      }

      var3 = null;
      if (var2.c() > 0) {
         hso_fa var6 = (hso_fa)var2.a(0);
         byte var5 = this.U;
         if (super.k == 2 && this.X) {
            var5 = 3;
         }

         super.ce = (byte)((super.ce + 1) % var6.a(var5, this.V).a.length);
         if (this.ek == 0) {
            this.ek = var6.a(3, this.V).a.length;
         }
      }

      try {
         super.a();
         int var1 = hso_ft.p.a(super.aY + super.bb, super.aZ + super.bc);
         this.g(super.M, var1);
         if (super.w != null) {
            if (MainObject.c(super.aY, super.aZ, super.bf, super.bg) <= 10) {
               super.v.b(0);
            }

            super.F = super.w.aY;
            super.G = super.w.aZ;
            super.q = super.w.aY;
            super.r = super.w.aZ;
         }

         ++super.dV;
         switch(super.k) {
         case 0:
            this.f_();
            break;
         case 1:
            this.U = 2;
            this.g();
            break;
         case 2:
            this.i();
            break;
         case 3:
            this.U = 2;
            this.g_();
            break;
         case 4:
            this.U = 0;
            this.h_();
         case 5:
         case 6:
         }

         if (super.k != super.l) {
            super.l = super.k;
            return;
         }
      } catch (Exception var4) {
      }

   }

   protected final void g_() {
      super.bi = super.w.bi;
      super.bf = super.w.aY;
      super.bg = super.w.aZ;
      this.d(super.bf, super.bg);
      this.h();
      if (MainObject.c(super.aY, super.aZ, super.F, super.G) < 40 && super.w.cF != 2) {
         this.a((byte)0);
      }

   }

   protected final void i() {
      super.bi = 12;
      if (super.Q != null && super.Q.c() > 0) {
         hso_bf var1;
         MainObject var5;
         if ((var5 = MainObject.a((var1 = (hso_bf)super.Q.a(0)).a, var1.b)) == null) {
            super.cU = false;
            this.a((byte)4);
            return;
         }

         if (MainObject.c(super.aY + super.bb, super.aZ + super.bc, var5.aY, var5.aZ) > 30 && !this.X && var5.br > 0) {
            super.bf = var5.aY;
            super.bg = var5.aZ;
            this.d(super.bf, super.bg);
            this.h();
            this.U = 2;
         } else {
            this.X = true;
         }

         ++this.ej;
         if (this.ej > this.ek && this.X) {
            try {
               this.d(var5.aY, var5.aZ);
               hso_bf var2;
               MainObject var3;
               int var6;
               label52:
               switch(super.m) {
               case 11:
                  var6 = 0;

                  while(true) {
                     if (var6 >= super.Q.c()) {
                        break label52;
                     }

                     if ((var2 = (hso_bf)super.Q.a(var6)) != null && (var3 = MainObject.a(var2.a, var2.b)) != null) {
                        GameScreen.a(15, this, var3, super.aY, super.aZ, -1 * var2.c, (short)163, 163, 24);
                     }

                     ++var6;
                  }
               case 12:
                  for(var6 = 0; var6 < super.Q.c(); ++var6) {
                     if ((var2 = (hso_bf)super.Q.a(var6)) != null && (var3 = MainObject.a(var2.a, var2.b)) != null) {
                        GameScreen.a(57, 21, var3.aY, var3.aZ);
                        GameScreen.a("-" + var2.c, var3.aY, var3.aZ - var3.be, 2, var3.ct);
                     }
                  }
               }
            } catch (Exception var4) {
            }

            this.ej = 0;
            this.X = false;
            this.a((byte)4);
         }
      }

   }

   protected final void f_() {
      super.bi = 1;
      if (super.cF == 1) {
         if (super.dV > super.A || hso_ak.f(16) == 0 || MainObject.c(super.aY + super.bb, super.aZ + super.bc, super.F, super.G) >= super.C) {
            super.dV = 0;
            super.cF = 0;
            this.U = 0;
            super.bb = 0;
            super.bc = 0;
         }
      } else if (super.cF == 0) {
         super.bb = 0;
         super.bc = 0;
         if (super.dV > super.A / 2 || hso_ak.f(12) == 0) {
            super.dV = 0;
            super.cF = 1;
            this.U = 2;
//            super.Direction = hso_ak.f(4);
            super.setDirection(hso_ak.f(4), "protected final void f_()", hso_av.class);
            this.c(super.bi);
         }
      }

      if (super.w != null) {
         if (super.w.cF == 1 && MainObject.c(super.aY, super.aZ, super.q, super.r) > 40) {
            this.a((byte)1);
         }

         if (super.w.cF == 0 && MainObject.c(super.aY, super.aZ, super.q, super.r) > super.C << 1) {
            this.a((byte)3);
            return;
         }
      } else {
         int var1;
         if ((var1 = MainObject.c(super.aY, super.aZ, GameScreen.f.aY, GameScreen.f.aZ)) < 80 && var1 > 40 && hso_ak.f(6) == 0) {
            this.a((byte)6);
         }
      }

   }

   public final void c(int var1) {
      int var2;
      if (hso_ak.e(var2 = hso_ak.g(3)) > 1) {
         --var1;
      }

      switch(super.Direction) {
      case 0:
         super.bc = var1;
         super.bb = var2;
         break;
      case 1:
         super.bc = -var1;
         super.bb = var2;
         break;
      case 2:
         super.bc = var2;
         super.bb = -var1;
         break;
      case 3:
         super.bc = var2;
         super.bb = var1;
      }

      if (super.bb == 0 && hso_ak.f(3) == 0) {
         super.dV = 0;
         super.cF = 0;
         super.bb = 0;
         super.bc = 0;
         this.U = 0;
      }

      if (super.bb > 0) {
         super.Direction = 3;
      } else {
         super.Direction = 2;
      }

      this.V = (byte)(super.aZ > super.bg ? 1 : 0);
      this.W = (byte)(super.aY - super.bf > 0 ? 0 : 2);
      this.W = 0;
      if (super.Direction == 3) {
         this.W = 2;
      } else {
         if (super.Direction != 2) {
            if (super.Direction == 0) {
               this.V = 0;
               return;
            }

            if (super.Direction == 1) {
               this.V = 1;
            }
         }

      }
   }

   protected final void g() {
      super.bi = super.w.bi;
      super.cF = 1;
      if (MainObject.c(super.o, super.p, super.q, super.r) > 40) {
         hso_en var1 = new hso_en(super.q, super.r);
         super.o = super.q;
         super.p = super.r;
         super.v.a(var1);
      } else if (MainObject.c(super.aY, super.aZ, super.F, super.G) < 40) {
         super.v.d();
         this.a((byte)4);
      }

      if (super.v.a(0) != null) {
         super.bf = ((hso_en)super.v.a(0)).a;
         super.bg = ((hso_en)super.v.a(0)).b;
         this.d(super.bf, super.bg);
         this.h();
      }

   }

   private void d(int var1, int var2) {
      this.V = (byte)(super.aZ > var2 ? 1 : 0);
      this.W = (byte)(super.aY - var1 > 0 ? 0 : 2);
      this.W = 0;
      if (super.Direction == 3) {
         this.W = 2;
      } else {
         if (super.Direction != 2) {
            if (super.Direction == 0) {
               this.V = 0;
               return;
            }

            if (super.Direction == 1) {
               this.V = 1;
            }
         }

      }
   }
}
