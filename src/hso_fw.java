public final class hso_fw extends hso_p {
   public static hso_ea a = new hso_ea();
   public static MainObject b = new MainObject();
   public static hso_ek f = new hso_ek();
   private int i;
   private int j;
   private int k = 180;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
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
   private hso_bt B;
   private hso_fl C = new hso_fl();
   public static byte g = 0;
   private static byte D = 1;
   public static byte h = 100;
   private byte E;
   private int F;
   private int G = 0;
   private hso_bw H;

   public final void a(hso_p var1) {
      super.a(var1);
      if (!hso_ft.A) {
         this.o = 0;
         this.H = (hso_bw)f.a("" + (this.o + this.G));
      } else {
         this.o = -1;
      }

      this.C.aY = null;
      this.H = null;
   }

   public hso_fw() {
      this.F = hso_fl.aM;
      if (hso_ft.C) {
         this.k = 160;
      }

      this.n = 12;
      this.l = 6;
      this.m = 2;
      this.i = hso_ft.Y - this.k / 2;
      this.j = hso_ft.Z - this.k / 2;
      if (!hso_ft.A) {
         this.j -= hso_bt.k / 2;
      }

      this.p = this.i + this.k / 2 - this.l * this.F / 2;
      this.q = this.j + (this.k / 3 << 1);
      this.r = new hso_bt(hso_df.Z, -1);
      this.s = new hso_bt(hso_df.X, 0);
      this.t = new hso_bt(hso_df.bL, 0);
      this.u = new hso_bt(hso_df.aW, 1);
      this.v = new hso_bt(hso_df.bM, 2);
      this.w = new hso_bt(hso_df.aY, 3);
      this.y = new hso_bt(hso_df.es, 4);
      this.x = new hso_bt(hso_df.bI, 1);
      if (hso_ft.A) {
         this.x.a(this.i + this.k / 2, this.j + this.k + hso_bt.k / 2, (hso_ce)null, this.x.a);
         this.r.a(this.i + this.k - 12, this.j + 10, hso_cf.t, "");
      }

      this.z = new hso_bt(hso_df.ak, 0, this);
      this.B = new hso_bt(hso_df.r, 1, this);
      this.A = new hso_bt(hso_df.q, 2, this);
      if (hso_ft.A) {
         this.B.a(this.i + hso_bt.j / 2, this.q - hso_bt.k / 2, hso_cf.v, this.B.a);
         this.A.a(this.i + hso_bt.j / 2, this.q - hso_bt.k / 2, hso_cf.v, this.A.a);
      }

      if (!hso_ft.A) {
         super.aa = this.B;
      }

   }

   public final void b(int var1, int var2) {
      switch(var1) {
      case -1:
         if (super.c.c != null) {
            super.c.a(super.c.c);
         } else {
            super.c.c();
         }
         break;
      case 0:
         hso_es var4;
         (var4 = new hso_es("Info_Other_Player menu")).a(this.t);
         var4.a(this.u);
         if (Player.N == null || Player.N.b.c() < 5) {
            var4.a(this.v);
         }

         var4.a(this.w);
         if (this.E == 0 && hso_cs.w != 1) {
            var4.a(this.y);
         }

         hso_ft.o.a(var4, 2, hso_df.ai, false, (hso_es)null);
         break;
      case 1:
         Service.a().c((byte)1, b.cB);
      }

      super.b(var1, var2);
   }

   public final void a(int var1, int var2) {
      hso_bw var3 = (hso_bw)f.a("" + (this.o + this.G));
      switch(var1) {
      case 0:
         if (var3 != null) {
            Service.a().a(5, (hso_es)null, "", (short)b.ct, var3.O, (byte)0);
            hso_dw.a("send buy fastion item to sv " + var3.O + " " + b.ct);
            return;
         }
         break;
      case 1:
         this.G = 12;
         if (!hso_ft.A) {
            super.aa = this.A;
            return;
         }
         break;
      case 2:
         this.G = 0;
         if (!hso_ft.A) {
            super.aa = this.B;
         }
      }

   }

   public final void a_(int var1, int var2) {
      switch(var1) {
      case 0:
         hso_ft.g.a(b.cB, "", "", (byte)0, true);
         hso_ft.h();
         break;
      case 1:
         Service.a().a((byte)0, (String)b.cB);
         break;
      case 2:
         Service.a().b((byte)1, b.cB);
         break;
      case 3:
         Service.a().a((byte)0, b.cB, (byte)0, (short)0, (int)0);
         break;
      case 4:
         Service.a().c((byte)0, b.cB);
      case 5:
      }

      super.a_(var1, var2);
   }

   public final void a(byte var1) {
      if (hso_ft.A) {
         super.aa = null;
      }

      this.E = var1;
      if (var1 == D) {
         if (!hso_ft.A) {
            super.Z = this.r;
            super.aa = this.x;
            super.Y = this.s;
            return;
         }

         super.aa = this.x;
      } else {
         this.E = 0;
         if (!hso_ft.A) {
            super.Z = this.r;
            super.Y = this.s;
            return;
         }
      }

      super.Z = this.r;
   }

   public final void a(mGraphics var1) {
      super.c.a(var1);
      if (hso_ft.a == this) {
         hso_ft.a(var1);
         int var2 = this.j;
         int var3 = this.i;
         hso_cg.a(var1, var3, var2, this.k, this.k, b.cB);
         var3 += 10;
         var2 += hso_ft.aa + 2;
         if (b.cO != null) {
            b.a(var1, var3 - 10 + this.k / 2, var2 + 7, -2);
            var2 += this.n;
         }

         hso_o.j.a(var1, hso_df.ac + b.by, var3, var2, 0, false);
         var2 += this.n;
         hso_o.j.a(var1, "HP: " + b.br + "/" + b.bs, var3, var2, 0, false);
         if (a != null) {
            a.b(var1, this.i + this.k / 2 + 30, this.j + 90 - hso_fl.aM / 2 + 5, hso_fl.aM / 2, 0);
         }

         b.b(var1, this.i + this.k / 2, this.j + 90, 0);

         for(byte var6 = 0; var6 < hso_af.a; ++var6) {
            var3 = this.p + var6 % this.l * this.F;
            int var4 = this.q + var6 / this.l * this.F;
            hso_bw var5;
            if ((var5 = (hso_bw)f.a("" + (var6 + this.G))) != null) {
               if (var5.O > -1) {
                  var5.a(var1, var3 + hso_fl.aM / 2, var4 + hso_fl.aM / 2, hso_fl.aM, 0, 0);
               } else if (this.G < 12) {
                  var1.a(hso_fl.aP[6], 0, var6 * 20, 20, 20, 0, var3 + hso_fl.aM / 2, var4 + hso_fl.aM / 2, 3);
               }
            } else if (this.G < 12) {
               var1.a(hso_fl.aP[6], 0, var6 * 20, 20, 20, 0, var3 + hso_fl.aM / 2, var4 + hso_fl.aM / 2, 3);
            }

            var1.a(hso_fl.bf[4]);
            var1.b(var3, var4, this.F, this.F);
         }

         var1.a(hso_fl.bf[3]);
         if (this.o >= 0) {
            var2 = this.p + this.o % this.l * this.F;
            var3 = this.q + this.o / this.l * this.F;
            var1.b(var2, var3, this.F, this.F);
            var1.a(hso_fl.bf[2]);
            var1.b(var2 + 1, var3 + 1, this.F - 2, this.F - 2);
         }

         if (hso_ft.A) {
            if (this.G < 12) {
               this.B.a(var1, this.i + hso_bt.j / 2, this.q - hso_bt.k / 2);
            } else {
               this.A.a(var1, this.i + hso_bt.j / 2, this.q - hso_bt.k / 2);
            }
         }

         if (!hso_ft.o.a && hso_ft.r == null && hso_fl.bi > hso_fl.aX) {
            this.C.b(var1, false);
         }

         super.a(var1);
      }
   }

   public final void a() {
      if (hso_ft.A) {
         if (this.G < 12) {
            this.B.b();
         } else {
            this.A.b();
         }
      }

      if (b == null) {
         this.r.a();
      }

      super.c.a();
      if (this.C.aY != null) {
         this.C.aY.c();
      }

      if (this.H != null) {
         hso_bw var2 = this.H;
         if (hso_fl.bi < hso_fl.aX + 2 && ++hso_fl.bi == hso_fl.aX) {
            if (this.o < 0) {
               hso_fl.bi = 0;
            } else {
               this.C.bj = null;
               this.C.bk = null;
               this.C.bl = null;
               int var5 = this.o;
               if (var2 == null) {
                  hso_fl.bi = 0;
               } else if (var2.b()) {
                  hso_fl.bi = 0;
               } else {
                  this.C.bq = var2.s;
                  this.C.bs = this.p + var5 % this.l * this.F + hso_fl.aM / 2 - this.C.bq / 2;
                  if (this.C.bs < 0) {
                     this.C.bs = 0;
                  }

                  if (this.C.bs + this.C.bq > hso_ft.W) {
                     this.C.bs = hso_ft.W - this.C.bq;
                  }

                  this.a(var2);
                  this.C.bp = var2.g;
                  this.C.bl = var2.l;
                  this.C.bo = var2.n;
                  this.C.br = var2.N;
                  this.C.bu = var2.J;
               }
            }
         }

         if (this.C.bj == null && var2 != null && var2.u != 5) {
            if (var2.k == null) {
               if (var2.o % 100 == 3) {
                  if (this.C.K == 0) {
                     Service.a().a((byte)0, (byte)((byte)var2.O));
                  }

                  ++var2.o;
               } else {
                  ++var2.o;
               }
            } else {
               this.C.bu = var2.J;
               this.C.bj = var2.k;
               this.C.bm = var2.m;
               this.a(var2);
            }
         }
      }

      if (this.C != null) {
         this.C.a();
      }

   }

   public final void d() {
      int var1 = this.o;
      if (this.C.aY != null) {
         hso_bp var10000;
         if (hso_ft.al[2]) {
            if (this.C.aY.e > 0) {
               var10000 = this.C.aY;
               var10000.e -= hso_ft.ab;
            } else {
               this.C.aY.e = 0;
            }

            hso_ft.d(2);
         } else if (hso_ft.al[8]) {
            if (this.C.aY.e < this.C.aY.g) {
               var10000 = this.C.aY;
               var10000.e += hso_ft.ab;
            } else {
               this.C.aY.e = this.C.aY.g;
            }

            hso_ft.d(8);
         }
      } else if (hso_ft.al[2]) {
         if (this.o >= this.l) {
            this.o -= this.l;
         }

         hso_ft.d(2);
      } else if (hso_ft.al[8]) {
         if (this.o < hso_af.a - this.l) {
            this.o += this.l;
         }

         hso_ft.d(8);
      }

      if (hso_ft.al[4]) {
         --this.o;
         hso_ft.d(4);
      } else if (hso_ft.al[6]) {
         ++this.o;
         hso_ft.d(6);
      }

      if (var1 != this.o) {
         if (this.o >= 0) {
            this.o = (byte)hso_cg.a(this.o, hso_af.a - 1, false);
            hso_fl.bi = 0;
            this.H = (hso_bw)f.a("" + (this.o + this.G));
         } else {
            this.o = -1;
         }

         this.C.aY = null;
      }

      super.d();
   }

   private void a(hso_bw var1) {
      int var2 = 2;
      this.C.bj = var1.k;
      this.C.bu = var1.J;
      this.C.bm = var1.m;
      if (var1.k != null) {
         var2 = 2 + var1.k.length;
      }

      if (var1.l != null) {
         var2 += var1.l.length;
      }

      int var3 = this.o;
      this.C.bt = this.q + (var3 / this.l + 1) * this.F;
      if (hso_ft.A) {
         if (this.C.bt + var2 * hso_ft.ab > hso_ft.X) {
            this.C.bt = hso_ft.X - var2 * hso_ft.ab;
         }
      } else if (this.C.bt + var2 * hso_ft.ab > hso_ft.X - hso_bt.k) {
         this.C.bt = hso_ft.X - hso_bt.k - var2 * hso_ft.ab;
      }

      if (this.E == D && hso_ft.A && this.C.bt + var2 * hso_ft.ab > this.j + this.k) {
         this.C.bt = this.j + this.k - var2 * hso_ft.ab;
      }

      this.C.aY = null;
      if ((var2 + 1) * hso_ft.ab > hso_fl.U) {
         this.C.aY = new hso_bp(this.C.bs, this.C.bt, this.C.bq, hso_fl.U, 0, 0, (var2 + 1) * hso_ft.ab - hso_fl.U);
      }

      if (var1.E == 1) {
         hso_fl var10000 = this.C;
         var10000.bq += hso_bt.j / 2;
         this.C.bc = this.z;
      } else {
         this.C.bc = null;
         this.C.bg = 0;
         this.C.bh = 0;
      }
   }

   public final void e() {
      if (this.C.aY != null && hso_ft.c(this.C.aY.c, this.C.aY.d, this.C.aY.a, this.C.aY.b)) {
         this.C.aY.a();
      }

      if (hso_ft.b(this.p, this.q, this.F * this.l, this.F * this.m)) {
         hso_ft.S = false;
         byte var1;
         if ((var1 = (byte)((hso_ft.ae - this.p) / this.F + (hso_ft.af - this.q) / this.F * this.l)) >= 0 && var1 < hso_af.a && var1 != this.o) {
            this.o = var1;
            hso_fl.bi = 0;
            this.H = (hso_bw)f.a("" + (this.o + this.G));
            this.C.aY = null;
         }
      }

      if (hso_ft.S && hso_ft.c(this.i + this.k / 2 - 25, this.j + 90 - 60, 50, 70)) {
         this.s.a();
         hso_ft.S = false;
      }

      super.e();
   }
}
