public final class hso_by extends hso_p {
   public static boolean a = true;
   private int b;
   private int f;
   private int g;
   private int h;
   private int i = 0;
   private hso_em j;
   private String[] k;
   private String[] l;
   private byte m;
   private hso_bt n;
   private hso_bt o;
   private hso_bt p;
   private hso_bt q;
   private hso_bt r;
   private hso_bt s;
   private hso_bt t;
   private hso_bt u;
   private hso_bt v;
   private hso_bt w;
   private hso_bt x;
   private hso_bt y;
   private hso_bt z;
   private hso_bt A;
   private hso_dy B;
   private hso_bp C;
   private hso_aw D = new hso_aw();
   private byte[] E = new byte[]{0, 1, 2, 1};
   private byte F = 0;

   public hso_by() {
      if (hso_ft.A) {
         this.i = hso_bt.k;
      }

      this.b(180);
   }

   private void b(int var1) {
      this.g = var1;
      this.h = var1;
      if (this.h > hso_ft.X - 20) {
         this.h = hso_ft.X - 20;
      }

      if (this.g > hso_ft.W - 20) {
         this.g = hso_ft.W - 20;
      }

      this.b = hso_ft.Y - this.g / 2;
      this.f = hso_ft.Z - this.h / 2;
   }

   public final void a(hso_p var1) {
      super.a(var1);
      hso_ft.j();
   }

   public final void a(hso_em var1, byte var2) {
      this.m = var2;
      this.j = var1;
      if (this.j == null) {
         super.c.a(super.c.c);
      } else {
         this.b();
         this.w = new hso_bt(hso_df.Z, -1, this);
         this.o = new hso_bt(hso_df.eG, 2, this);
         if (var2 == 1) {
            this.o.a = hso_df.eQ;
            super.Y = this.o;
         } else if (var2 == 0) {
            this.n = new hso_bt(hso_df.X, 0, this);
            this.p = new hso_bt(hso_df.eH + hso_df.bO, 3, this);
            this.q = new hso_bt(hso_df.eH + hso_df.bP, 4, this);
            this.r = new hso_bt(hso_df.bK + " " + hso_df.bu, 6, this);
            this.s = new hso_bt(hso_df.cW, 7, this);
            this.t = new hso_bt(hso_df.eK, 8, this);
            this.u = new hso_bt(hso_df.eL, 9, this);
            this.v = new hso_bt(hso_df.eM, 2, this);
            this.x = new hso_bt(hso_df.eT, 11, this);
            this.y = new hso_bt(hso_df.eW, 12, this);
            this.z = new hso_bt(hso_df.eX, 13, this);
            this.A = new hso_bt(hso_df.dx + " " + hso_df.eE, 14, this);
            super.Y = this.n;
         }

         super.Z = this.w;
         if (hso_ft.A) {
            super.Y.a(this.b + this.g / 2, this.f + this.g - hso_bt.k / 2 - 4, hso_cf.r, super.Y.a);
            super.Z.a(this.b + this.g - 12, this.f + 10, hso_cf.t, "");
         }

      }
   }

   public final void a(int var1, int var2) {
      hso_es var5;
      switch(var1) {
      case -1:
         super.c.a(super.c.c);
         return;
      case 0:
         var5 = new hso_es("Clan_Screen menu");
         if (this.m == 1) {
            var5.a(this.o);
            var5.a((Object)null);
         } else if (this.m == 0) {
            if (GameScreen.f.cO == null || GameScreen.f.cO.q) {
               super.c.a(super.c.c);
               hso_ft.a(hso_df.eY);
               return;
            }

            var5.a(this.o);
            var5.a(this.r);
            var5.a(this.y);
            hso_em var7;
            if ((var7 = GameScreen.f.cO).o == 127 || var7.o == 126 || var7.o == 125) {
               var5.a(this.s);
               var5.a(this.A);
            }

            var5.a(this.p);
            var5.a(this.q);
            if (GameScreen.f.cO.o != 127) {
               var5.a(this.x);
            }
         }

         hso_ft.o.a(var5, 2, hso_df.cW, false, (hso_es)null);
         return;
      case 1:
         Service.a().b((byte)0, (int)this.j.b);
         hso_ft.a(hso_df.bV);
         return;
      case 2:
         Service.a().b((byte)13, (int)this.j.b);
         hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
         return;
      case 3:
         this.B = new hso_dy();
         this.B.a(hso_df.eI, new hso_bt(hso_df.eH, 5, 6, this), true, hso_df.eH + hso_df.bO);
         hso_ft.r = this.B;
         return;
      case 4:
         this.B = new hso_dy();
         this.B.a(hso_df.eJ, new hso_bt(hso_df.eH, 5, 7, this), true, hso_df.eH + hso_df.bP);
         hso_ft.r = this.B;
         return;
      case 5:
         boolean var6 = false;

         try {
            var1 = Integer.parseInt(this.B.a.j());
         } catch (Exception var3) {
            return;
         }

         if (var1 > 0) {
            Service.a().c((byte)var2, var1);
            hso_ft.a(hso_df.aG);
            return;
         }
         break;
      case 6:
         Service.a().e((byte)14, GameScreen.f.cB);
         hso_ft.a(hso_df.aD, new hso_bt(hso_df.Z, -1));
         return;
      case 7:
         if (GameScreen.f.cO != null && !GameScreen.f.cO.q) {
            if (GameScreen.f.cO.o == 127) {
               (var5 = new hso_es("Clan_Screen menu2")).a(this.v);
               var5.a(this.t);
               var5.a(this.u);
               var5.a(this.z);
               hso_ft.o.a(var5, 2, hso_df.cW, false, (hso_es)null);
               return;
            }

            this.v.a();
            return;
         }

         super.c.a(super.c.c);
         hso_ft.a(hso_df.eY);
         return;
      case 8:
         this.B = new hso_dy();
         this.B.a(hso_df.eN, new hso_bt(hso_df.az, 10, 16, this), false, hso_df.az + " " + hso_df.eO);
         hso_ft.r = this.B;
         return;
      case 9:
         this.B = new hso_dy();
         this.B.a(hso_df.eN, new hso_bt(hso_df.az, 10, 17, this), false, hso_df.az + " " + hso_df.eP);
         hso_ft.r = this.B;
         return;
      case 10:
         String var4;
         if ((var4 = this.B.a.j()) != null) {
            Service.a().g((byte)var2, var4);
            hso_ft.a(hso_df.aG);
            return;
         }
         break;
      case 11:
         hso_ft.c(hso_df.fA, new hso_bt(hso_df.eT, 15, this));
         return;
      case 12:
         hso_ft.g.a(hso_df.eV, "", "", (byte)0, true);
         hso_ft.h();
         return;
      case 13:
         this.B = new hso_dy();
         this.B.a(hso_df.eN, new hso_bt(hso_df.az, 10, 2, this), false, hso_df.az + " " + hso_df.ew);
         hso_ft.r = this.B;
         return;
      case 14:
         Service.a().j((byte)21);
         hso_ft.a(hso_df.aG);
         return;
      case 15:
         Service.a().f((byte)18, GameScreen.f.cB);
         super.c.a(super.c.c);
      }

   }

   public final void a(mGraphics var1) {
      if (super.c != null) {
         super.c.a(var1);
      }

      if (hso_ft.a == this) {
         hso_ft.a(var1);
         int var2 = this.f;
         int var3 = this.b;
         hso_cg.a(var1, var3, var2, this.g, this.h, hso_df.eE);
         var3 += 5;
         var2 += hso_ft.aa + 2;
         var1.d(this.b, var2, this.g, this.h - hso_ft.aa - this.i - 5);
         var1.a(0, -this.D.b);
         hso_cg.a(var1, this.j.d, this.b + this.g / 2, var2 + 4, 2);
         var2 += hso_ft.ab + hso_ft.ab / 2;
         hso_o.f.a(var1, hso_df.eF, var3, var2, 0, true);
         hso_fd var4;
         int var5;
         if ((var4 = hso_bk.i(this.j.a)).a != null) {
            if (aq.b(var4.a.a) / 18 == 3) {
               if (hso_ft.ai % 6 == 0) {
                  if ((var5 = this.E.length) == 0) {
                     var5 = 1;
                  }

                  this.F = (byte)((this.F + 1) % var5);
               }

               var1.a(var4.a, 0, this.E[this.F] * 18, 18, 18, 0, var3 + 70, var2 + 6, 3);
            } else {
               var1.a(var4.a, var3 + 70, var2 + 6, 3);
            }
         }

         hso_o.f.a(var1, this.j.c, var3 + 78, var2, 0, true);
         var2 += hso_ft.ab;
         hso_o.f.a(var1, hso_df.ac + this.j.j + " +" + this.j.m / 10 + "," + this.j.m % 10 + "%" + "    " + hso_df.dM + ": " + this.j.k, var3, var2, 0, true);
         var2 += hso_ft.ab;
         hso_o.f.a(var1, hso_df.i + this.j.h + "/" + this.j.i, var3, var2, 0, true);
         var2 += hso_ft.ab;
         hso_o.f.a(var1, hso_df.gw[0] + ": " + this.j.f, var3, var2, 0, true);
         var2 += hso_ft.ab;

         for(var5 = 0; var5 < this.k.length; ++var5) {
            hso_o.j.a(var1, this.k[var5], var3, var2, 0, true);
            var2 += hso_ft.ab;
         }

         hso_o.f.a(var1, hso_df.fb + hso_j.a(this.j.n), var3, var2, 0, true);
         var2 += hso_ft.ab;
         hso_o.f.a(var1, hso_df.fc + hso_j.a((long)this.j.l), var3, var2, 0, true);
         if (this.j.p != null) {
            for(var5 = 0; var5 < this.j.p.length; ++var5) {
               var2 += 20;
               if ((var4 = hso_bk.j((short)this.j.p[var5].a)).a != null) {
                  var1.a(var4.a, var3 + 9, var2 + 5, 3);
               }

               hso_o.k.a(var1, String.valueOf(this.j.p[var5].b), var3 + 16, var2 + 4, 2, true);
               hso_o.f.a(var1, ": " + this.j.p[var5].c, var3 + 22, var2, 0, true);
            }

            var2 += 5;
         }

         var2 += hso_ft.ab;

         for(var5 = 0; var5 < this.l.length; ++var5) {
            hso_o.j.a(var1, this.l[var5], var3, var2, 0, true);
            var2 += hso_ft.ab;
         }

         if (hso_ft.a == this && !hso_ft.o.a && hso_ft.r == null && hso_ft.s == null) {
            super.a(var1);
         }

      }
   }

   private void b() {
      if (this.j.e.length() > 100) {
         this.b(220);
      } else if (this.j.g.length() > 100) {
         this.b(220);
      }

      this.k = hso_o.j.a(this.j.e, this.g - 10);
      this.l = hso_o.j.a(this.j.g, this.g - 10);
      int var1 = hso_ft.aa + 2 + (6 + this.l.length + this.k.length) * hso_ft.ab;
      if (this.j.p != null) {
         var1 += 20 * this.j.p.length + 5;
      }

      if (var1 > this.h - hso_ft.aa - this.i - 5) {
         this.C = new hso_bp(this.b, this.f, this.g, this.h, 0, 0, var1 - (this.h - hso_ft.aa - this.i - 5));
      } else {
         this.C = new hso_bp(this.b, this.f, this.g, this.h, 0, 0, 0);
      }

      this.D.a(0, this.C.g, 0, 0);
      a = false;
   }

   public final void a() {
      if (super.c != null) {
         super.c.a();
      }

      if (a) {
         this.b();
         a = false;
      }

      if (hso_ft.A) {
         this.C.c();
         this.D.b = this.C.f;
      } else {
         this.D.a();
      }

      super.a();
   }

   public final void d() {
      if (this.D.f > 0) {
         hso_aw var10000;
         if (hso_ft.al[2]) {
            if (this.D.d > 0) {
               var10000 = this.D;
               var10000.d -= hso_ft.ab;
            }

            if (this.D.d < 0) {
               this.D.d = 0;
            }

            hso_ft.d(2);
         } else if (hso_ft.al[8]) {
            if (this.D.d < this.D.f) {
               var10000 = this.D;
               var10000.d += hso_ft.ab;
            }

            if (this.D.d > this.D.f) {
               this.D.d = this.D.f;
            }

            hso_ft.d(2);
         }
      }

      super.d();
   }

   public final void e() {
      if (hso_ft.A) {
         this.C.a();
      }

      super.e();
   }
}
