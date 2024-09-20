public final class hso_fq extends hso_cg {
   public boolean a;
   private hso_es g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private int t;
   private int u;
   private String v = "";
   private String[] w;
   public hso_eh b;
   public static boolean c = false;
   private static boolean x = false;
   private static boolean y = true;
   private static boolean z = true;
   public static byte d;
   private hso_es A;
   public static MainObject e = null;
   private int B;
   private int C;
   public static int f;
   private byte D;
   private byte E = 0;
   private int F;
   private int G;
   private boolean H = false;
   private int I;
   private boolean J = false;
   private hso_bt K;
   private hso_bt L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private int[] R = new int[3];
   private boolean S;
   private boolean T;
   private int U;
   private int V;
   private int W;
   private int X;

   public final void a(hso_es var1, int var2, String var3, boolean var4, hso_es var5) {
      z = false;
      this.H = false;
      this.U = 0;
      this.b = null;
      super.Z = null;
      d = 0;
      x = var4;
      this.A = var5;
      this.i = 0;
      if (!x || this.A != null && this.A.c() != 0) {
         this.v = var3;
         c = false;
         this.h = 0;
         this.t = var2;
         if (var1 != null && var1.c() != 0) {
            this.g = var1;
            this.a = true;
            if (var2 == -1) {
               this.g.a(new hso_bt(hso_df.Z, 1, this));
               this.o = 0;
               this.l = 60;
               this.m = 60;

               for(var2 = 0; var2 < var1.c(); ++var2) {
                  hso_bt var6 = (hso_bt)var1.a(var2);
                  if (hso_o.k.a(var6.a) > this.l - 8) {
                     var6.b = hso_o.d.a(var6.a, this.l - 8);
                  }
               }

               this.O = var1.c() * this.l - 1;
               if (this.O > hso_ft.W - 2) {
                  this.O = hso_ft.W - 2;
               }

               this.j = hso_ft.Y - this.O / 2;
               if (this.j < 1) {
                  this.j = 1;
               }

               this.k = hso_ft.X - this.m - (hso_ft.aa + 1);
               if (hso_ft.A) {
                  this.k -= 3;
               }

               this.k += 27;
               this.n = this.k;
               if ((r = this.g.c() * this.l - hso_ft.W) < 0) {
                  r = 0;
               }

               p = 0;
               q = 0;
               s = 50;
            } else {
               if (x) {
                  e = (MainObject)this.A.a(0);
               }

               this.l = hso_ft.aa;
               if (hso_ft.A) {
                  this.l = 32;
               }

               this.u = hso_ft.X / 4 * 3 / this.l - (var4 ? 2 : 1);
               if (hso_ft.A) {
                  ++this.u;
               }

               this.O = hso_ft.W / 3;
               if (this.O < hso_o.f.a(var3) + 30) {
                  this.O = hso_o.f.a(var3) + 30;
               }

               this.o = hso_ft.aa;
               if (var4) {
                  this.o += this.l;
               }

               var2 = 120;
               byte var7 = 30;
               if (var4) {
                  var7 = 50;
               }

               for(int var8 = 0; var8 < var1.c(); ++var8) {
                  hso_bt var10 = (hso_bt)var1.a(var8);
                  int var11;
                  if ((var11 = hso_o.f.a(var10.a) + var7) > var2) {
                     var2 = var11;
                  }
               }

               if (this.O < var2) {
                  this.O = var2;
               }

               if (this.O > hso_ft.W) {
                  this.O = hso_ft.W;
               }

               p = 0;
               q = 0;
               hso_bt var9 = null;
               if (hso_ft.A) {
                  var9 = new hso_bt(hso_df.Z, 1, this);
               } else {
                  var9 = new hso_bt(hso_df.af, 1, this);
               }

               if (var1.c() > this.u) {
                  this.m = this.u * this.l + 8;
                  r = (var1.c() - this.u) * this.l;
               } else {
                  this.m = var1.c() * this.l + 8;
                  r = 0;
               }

               this.i();
               this.n = this.k;
               if (hso_ft.A) {
                  var9.a(this.j + this.O - 11, this.k - this.o + hso_ft.aa / 2 - 2, hso_cf.t, "");
               }

               super.Z = var9;
            }

            if (hso_ft.A) {
               this.h = -1;
            }

            z = true;
            this.h();
         }
      }
   }

   public final void b(hso_es var1, int var2, String var3, boolean var4, hso_es var5) {
      this.H = true;
      z = false;
      this.U = 0;
      this.b = null;
      super.Z = null;
      d = 0;
      x = false;
      this.A = null;
      this.i = 0;
      if (!x || this.A != null && this.A.c() != 0) {
         this.v = var3;
         c = false;
         this.h = 0;
         this.t = 2;
         if (var1.c() != 0) {
            this.g = var1;
            this.a = true;
            if (x) {
               e = (MainObject)this.A.a(0);
            }

            this.l = hso_ft.aa;
            if (hso_ft.A) {
               this.l = 32;
            }

            this.u = hso_ft.X / 4 * 3 / this.l - 1;
            if (hso_ft.A) {
               ++this.u;
            }

            this.O = hso_ft.W / 3;
            if (this.O < hso_o.f.a(var3) + 30) {
               this.O = hso_o.f.a(var3) + 30;
            }

            this.o = hso_ft.aa;
            var2 = 120;

            for(int var6 = 0; var6 < var1.c(); ++var6) {
               hso_bt var7 = (hso_bt)var1.a(var6);
               int var9;
               if ((var9 = hso_o.f.a(var7.a) + 30) > var2) {
                  var2 = var9;
               }
            }

            if (this.O < var2) {
               this.O = var2;
            }

            if (this.O > hso_ft.W) {
               this.O = hso_ft.W;
            }

            p = 0;
            q = 0;
            var3 = null;
            hso_bt var8;
            if (hso_ft.A) {
               var8 = new hso_bt(hso_df.Z, 1, this);
            } else {
               var8 = new hso_bt(hso_df.af, 1, this);
            }

            if (var1.c() > this.u) {
               this.m = this.u * this.l + 8;
               r = (var1.c() - this.u) * this.l;
            } else {
               this.m = var1.c() * this.l + 8;
               r = 0;
            }

            this.i();
            this.n = this.k;
            if (hso_ft.A) {
               var8.a(this.j + this.O - 11, this.k - this.o + hso_ft.aa / 2 - 2, hso_cf.t, "");
            }

            super.Z = var8;
            if (hso_ft.A) {
               this.h = -1;
            }

            z = true;
            this.h();
         }
      }
   }

   public final void a(hso_es var1, int var2, int var3, int var4, String var5) {
      z = false;
      this.H = false;
      this.U = 0;
      super.Z = null;
      this.b = null;
      x = false;
      this.A = null;
      this.v = var5;
      c = false;
      d = 0;
      this.h = 0;
      this.B = var3;
      this.C = var4;
      this.t = 2;
      this.a = true;
      this.g = new hso_es("Menu2 menuItem2");
      this.l = hso_ft.aa;
      if (hso_ft.A) {
         this.l = 32;
      }

      this.u = hso_ft.X / 4 * 3 / this.l - 1;
      if (hso_ft.A) {
         ++this.u;
      }

      this.O = hso_ft.W / 3;
      this.o = this.l;
      var2 = 120;
      if (120 < hso_o.f.a(var5) + 30) {
         var2 = hso_o.f.a(var5) + 30;
      }

      for(var3 = 0; var3 < var1.c(); ++var3) {
         hso_bt var7 = (hso_bt)var1.a(var3);
         hso_bt var8 = new hso_bt(var7.a, 2, this);
         if ((var4 = hso_o.f.a(var7.a) + 20) > var2) {
            var2 = var4;
         }

         this.g.a(var8);
      }

      hso_bt var6 = null;
      if (hso_ft.A) {
         var6 = new hso_bt(hso_df.Z, 1, this);
      } else {
         var6 = new hso_bt(hso_df.af, 1, this);
      }

      this.O = var2;
      if (this.O > hso_ft.W) {
         this.O = hso_ft.W;
      }

      if (this.g.c() > this.u) {
         this.m = this.u * this.l + 8;
         r = (this.g.c() - this.u) * this.l;
      } else {
         this.m = this.g.c() * this.l + 8;
         r = 0;
      }

      p = 0;
      q = 0;
      this.i();
      this.n = this.k;
      if (hso_ft.A) {
         var6.a(this.j + this.O - 11, this.k - this.o + hso_ft.aa / 2 - 2, hso_cf.t, "");
      }

      super.Z = var6;
      if (hso_ft.A) {
         this.h = -1;
      }

      z = true;
      this.h();
   }

   public final void a(hso_es var1, String var2, int var3, byte var4, boolean var5, int var6) {
      z = false;
      this.H = false;
      this.U = 0;
      super.Z = null;
      d = 1;
      this.i = 0;
      this.v = var2;
      c = false;
      x = false;
      this.C = var3;
      f = var3;
      this.D = var4;
      this.I = var6;
      this.h = 0;
      if (var1 != null && var1.c() != 0) {
         this.g = var1;
      } else {
         this.g = new hso_es("Menu2 menuItem3");
      }

      this.a = true;
      this.l = hso_ft.aa;
      if (hso_ft.A) {
         this.l = 32;
      }

      this.u = 0;
      this.O = hso_ft.W - 10;
      if (this.O > 300) {
         this.O = 300;
      }

      this.w = hso_o.i.a(var2, this.O - 20);
      this.o = hso_ft.aa;
      p = 0;
      q = 0;
      int var7 = this.w.length;
      if (!var5) {
         this.g.a(new hso_bt(hso_df.Z, 1, this));
      } else if (var7 == 1) {
         var7 = 2;
      }

      this.m = (var7 + 2) * hso_ft.ab + ((this.g.c() - 1) / 2 + 1) * (hso_bt.k + 5) + 5;
      r = 0;
      this.j = hso_ft.Y - this.O / 2;
      this.k = hso_ft.X - this.m - 10;
      this.n = this.k;
      this.b = new hso_eh();
      this.b.a(var2, 0, this.j + 10, this.k + 10 + hso_ft.ab, this.O - 20, hso_o.j);
      hso_fq var8 = this;
      int var9;
      if ((var9 = this.g.c()) == 1) {
         this.M = this.j + this.O / 2;
         this.N = 0;
      } else {
         boolean var10001 = true;
         this.N = 20;
         this.M = this.j + this.O / 2 - this.N / 2 - hso_bt.j / 2;
      }

      for(var3 = 0; var3 < var9; ++var3) {
         hso_bt var10 = (hso_bt)var8.g.a(var3);
         if (var9 == 3 && var3 == 2) {
            var10.a(var8.j + var8.O / 2, var8.k + var8.m - hso_bt.k - (var9 - 1) / 2 * (hso_bt.k + 5) + 7 + var3 / 2 * (hso_bt.k + 5), (hso_ce)null, var10.a);
         } else {
            var10.a(var8.M + var3 % 2 * (hso_bt.j + var8.N), var8.k + var8.m - hso_bt.k - (var9 - 1) / 2 * (hso_bt.k + 5) + 7 + var3 / 2 * (hso_bt.k + 5), (hso_ce)null, var10.a);
         }

         if (var3 == 0) {
            var10.g = true;
         }
      }

      if (hso_ft.A) {
         this.h = -1;
      }

      z = true;
      this.h();
   }

   public final void b() {
      this.J = hso_cf.I;
      this.E = 1;
      z = false;
      this.H = false;
      this.U = 0;
      super.Z = null;
      d = 2;
      this.i = 0;
      this.v = "";
      c = false;
      x = false;
      this.h = 0;
      this.O = hso_ft.W - 40;
      this.a = true;
      this.l = 40;
      p = 0;
      q = 0;
      this.F = 0;
      this.m = 40;
      this.G = (byte)(this.O / this.m);
      this.g = new hso_es("Menu2 menuItems");
      hso_bt var1 = new hso_bt(hso_df.cI, 3, 2, this);
      hso_bt var2 = new hso_bt(hso_df.cu, 4, 4, this);
      hso_bt var3 = new hso_bt(hso_df.ct, 5, 3, this);
      hso_bt var4 = new hso_bt(hso_df.eo, 6, 0, this);
      hso_bt var5 = new hso_bt(hso_df.bd, 7, 1, this);
      this.L = new hso_bt(hso_df.gl, 14, 10, this);
      this.K = new hso_bt(hso_df.cT + "/" + hso_df.cS, 8, 5, this);
      hso_bt var6 = new hso_bt(hso_df.dI, 11, 9, this);
      hso_bt var7 = new hso_bt(hso_df.cG, 12, 8, this);
      this.g.a(this.L);
      this.g.a(var4);
      this.g.a(var5);
      if (GameScreen.f.cO != null) {
         var4 = new hso_bt(hso_df.eE, 9, 6, this);
         this.g.a(var4);
      }

      if (Player.N != null) {
         var4 = new hso_bt(hso_df.aS, 10, 7, this);
         this.g.a(var4);
      }

      this.g.a(var1);
      this.g.a(var3);
      this.g.a(var6);
      this.g.a(var2);
      this.g.a(this.K);
      this.g.a(var7);
      if (this.G > this.g.c()) {
         this.G = this.g.c();
      }

      this.O = this.G * this.m;
      r = 0;
      if (!this.J) {
         this.j = hso_ft.Y - this.O / 2;
      } else {
         this.j = 20;
      }

      this.k = hso_ft.X - 40;
      this.n = this.k;
      if (hso_ft.A) {
         this.h = -1;
      }

      z = true;

      for(int var8 = 0; var8 < this.g.c(); ++var8) {
         (var1 = (hso_bt)this.g.a(var8)).b(this.j + this.m / 2 + var8 * this.m, this.k + this.m / 2, hso_cf.y[var1.f], var1.a, 0, -32);
      }

      r = (this.g.c() - this.G) * this.m;
      this.h = -1;
      this.h();
   }

   private void h() {
      for(int var1 = 0; var1 < this.R.length; ++var1) {
         this.R[var1] = 0;
      }

      this.P = 0;
      this.Q = 0;
      this.S = false;
      this.T = false;
      this.U = 0;
      this.V = 0;
   }

   private void i() {
      switch(this.t) {
      case 0:
         this.j = 2;
         this.k = hso_ft.X - hso_ft.aa - this.m - 2;
         if (hso_ft.A) {
            this.k += hso_ft.aa;
            return;
         }
         break;
      case 1:
         this.j = hso_ft.W - this.O - 2;
         this.k = hso_ft.X - hso_ft.aa - this.m - 2;
         if (hso_ft.A) {
            this.k += hso_ft.aa;
            return;
         }
         break;
      case 2:
      case 4:
         this.j = hso_ft.Y - this.O / 2;
         this.k = hso_ft.X / 2 - this.m / 2 - 2 + this.l / 2 + 6;
         return;
      case 3:
         this.j = 2;
         this.k = 2;
      }

   }

   public final void a(int var1, int var2) {
      hso_es var3 = hso_bw.V;
      switch(var1) {
      case 0:
         this.a = false;
         a((hso_bt)this.g.a(this.h));
         break;
      case 1:
         this.f();
         break;
      case 2:
         Service.a().b((short)this.C, (byte)this.B, (byte)this.h);
         this.a = false;
         hso_ft.S = false;
         break;
      case 3:
         this.a = false;
         GameScreen.b().j();
         break;
      case 4:
         this.a = false;
         GameScreen.b().C.a();
         break;
      case 5:
         this.a = false;
         GameScreen.b().B.a();
         break;
      case 6:
         this.a = false;
         hso_bg.a.a();
         break;
      case 7:
         GameScreen.b().A.a();
         break;
      case 8:
         hso_bg.b.a();
         break;
      case 9:
         hso_bg.c.a();
         break;
      case 10:
         GameScreen.b().x.a();
         break;
      case 11:
         Service.a().g((byte)-56);
         hso_ft.a(hso_df.aG);
         break;
      case 12:
         GameScreen.f.N();
         ISession.a().c();
         hso_ft.b.c();
         GameScreen.f = new Player(0, (byte)0, "unname", 0, 0);
      case 13:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      default:
         break;
      case 14:
         hso_es var4 = new hso_es("Menu2 vecngua");
         this.a = false;
         if (GameScreen.f.ee != -1) {
            hso_bg.d.a();
         } else {
            for(int var5 = 0; var5 < var3.c(); ++var5) {
               hso_j var6;
               short var7;
               if ((var6 = (hso_j)var3.a(var5)) != null && var6.u == 4 && ((var7 = (short)var6.O) == 62 || var7 == 63 || var7 == 64 || var7 == 65 || var7 == 66)) {
                  var4.a(var6);
               }
            }

            if (var4.c() > 0) {
               GameScreen.b().a(var4);
            } else {
               hso_ft.a(hso_df.R);
            }
         }
      }

      super.a(var1, var2);
   }

   public final void c() {
      if (y) {
         if (this.a) {
            boolean var1 = false;
            int var2;
            if (x) {
               if (hso_ft.ak[2]) {
                  var1 = true;
                  --this.h;
                  if (this.h < 0) {
                     this.h = this.g.c() - 1;
                  }

                  hso_ft.c(2);
               } else if (hso_ft.ak[8]) {
                  var1 = true;
                  ++this.h;
                  if (this.h > this.g.c() - 1) {
                     this.h = 0;
                  }

                  hso_ft.c(8);
               }

               var2 = this.i;
               if (hso_ft.ak[4]) {
                  --this.i;
                  hso_ft.c(4);
               }

               if (hso_ft.ak[6]) {
                  ++this.i;
                  hso_ft.c(6);
               }

               this.i = hso_cg.a(this.i, this.A.c() - 1, true);
               if (this.i != var2) {
                  e = (MainObject)this.A.a(this.i);
               }
            } else if (d == 1) {
               var2 = this.h;
               if (!hso_ft.al[4] && !hso_ft.al[2]) {
                  if (hso_ft.al[6] || hso_ft.al[8]) {
                     ++this.h;
                     hso_ft.d(6);
                     hso_ft.d(8);
                  }
               } else {
                  --this.h;
                  hso_ft.d(4);
                  hso_ft.d(2);
               }

               this.h = hso_cg.a(this.h, this.g.c() - 1, false);
               if (var2 != this.h) {
                  for(var2 = 0; var2 < this.g.c(); ++var2) {
                     hso_bt var3 = (hso_bt)this.g.a(var2);
                     if (var2 == this.h) {
                        var3.g = true;
                     } else {
                        var3.g = false;
                     }
                  }
               }

               if (hso_ft.al[5]) {
                  hso_ft.d(5);
                  if (this.h < this.g.c() && this.h >= 0) {
                     ((hso_bt)this.g.a(this.h)).a();
                  }
               }
            } else if (d == 0) {
               if (!hso_ft.ak[2] && !hso_ft.ak[4]) {
                  if (hso_ft.ak[8] || hso_ft.ak[6]) {
                     var1 = true;
                     ++this.h;
                     if (this.h > this.g.c() - 1) {
                        this.h = 0;
                     }

                     hso_ft.c(6);
                     hso_ft.c(8);
                  }
               } else {
                  var1 = true;
                  --this.h;
                  if (this.h < 0) {
                     this.h = this.g.c() - 1;
                  }

                  hso_ft.c(2);
                  hso_ft.c(4);
               }
            }

            if (var1) {
               if (this.t == -1) {
                  p = this.h * this.l + this.l - hso_ft.W / 2;
               } else {
                  p = (this.h + 1) * this.l - this.m / 2;
               }

               if (p > r) {
                  p = r;
               }

               if (p < 0) {
                  p = 0;
               }

               if (this.h == this.g.c() - 1 || this.h == 0) {
                  q = p;
               }
            }

            if (d == 0) {
               if (this.t == -1) {
                  this.j();
               } else {
                  hso_fq var4 = this;
                  if (hso_ft.ak[5]) {
                     hso_ft.m();
                     hso_ft.l();
                     this.f();
                     a((hso_bt)this.g.a(this.h));
                  } else if (hso_ft.ak[12]) {
                     hso_ft.m();
                     hso_ft.l();
                     this.f();
                     a((hso_bt)this.g.a(this.h));
                  }

                  if (hso_ft.S && x) {
                     var2 = this.i;
                     if (hso_ft.c(this.j + 13 - 14, this.n - this.o + hso_ft.aa + this.l / 2 - 14, 28, 28)) {
                        --this.i;
                        hso_ft.S = false;
                     }

                     if (hso_ft.c(this.j + this.O - 13 - 14, this.n - this.o + hso_ft.aa + this.l / 2 - 14, 28, 28)) {
                        ++this.i;
                        hso_ft.S = false;
                     }

                     this.i = hso_cg.a(this.i, this.A.c() - 1, true);
                     if (this.i != var2) {
                        e = (MainObject)this.A.a(this.i);
                     }
                  }

                  int var5;
                  if (hso_ft.Q) {
                     if (!this.S && hso_ft.a(this.j, this.k, this.O, this.m)) {
                        for(var2 = 0; var2 < var4.R.length; ++var2) {
                           var4.R[0] = hso_ft.af;
                        }

                        var4.Q = hso_ft.af;
                        var4.S = true;
                        var4.T = var4.V != 0;
                        var4.V = 0;
                     } else if (this.S) {
                        ++this.P;
                        if (this.P > 5 && this.Q == hso_ft.af && !this.T) {
                           this.Q = -1000;
                           this.h = (p + hso_ft.af - this.k) / this.l;
                        }

                        if ((var2 = hso_ft.af - this.R[0]) != 0 && this.h != -1) {
                           this.h = -1;
                        }

                        for(var5 = this.R.length - 1; var5 > 0; --var5) {
                           var4.R[var5] = var4.R[var5 - 1];
                        }

                        var4.R[0] = hso_ft.af;
                        if ((p -= var2) < 0) {
                           p = 0;
                        }

                        if (p > r) {
                           p = r;
                        }

                        if (q < 0 || q > r) {
                           var2 /= 2;
                        }

                        q -= var2;
                     }
                  }

                  if (hso_ft.U && var4.S) {
                     var2 = hso_ft.af - var4.R[0];
                     hso_ft.U = false;
                     if (hso_ak.e(var2) < 20 && hso_ak.e(hso_ft.af - var4.Q) < 20 && !var4.T && hso_ft.S) {
                        var4.V = 0;
                        p = q;
                        var4.Q = -1000;
                        var4.h = (p + hso_ft.af - var4.k) / var4.l;
                        var4.P = 0;
                        var4.U = 1;
                     } else if (var4.h != -1 && var4.P > 5) {
                        var4.P = 0;
                        var4.U = 1;
                     } else if (var4.h == -1 && !var4.T) {
                        if (q < 0) {
                           p = 0;
                        } else if (q > r) {
                           p = r;
                        } else {
                           byte var6;
                           if ((var5 = hso_ft.af - var4.R[0] + (var4.R[0] - var4.R[1]) + (var4.R[1] - var4.R[2])) > 10) {
                              var6 = 10;
                           } else if (var5 < -10) {
                              var6 = -10;
                           } else {
                              var6 = 0;
                           }

                           var4.V = -var6 * 100;
                        }
                     }

                     var4.S = false;
                     var4.P = 0;
                     hso_ft.U = false;
                  }

                  if (hso_ft.R && var4.S) {
                     var4.S = false;
                  }
               }

               if (hso_ft.S && !hso_ft.c(this.j - 5, this.n - 5 - this.o, this.O + 10, this.m + 10 + this.o) && !this.H) {
                  this.f();
               }
            } else if (d == 2) {
               this.j();
               if (hso_ft.S && !hso_ft.c(this.j - 5, this.k - 5, this.O + 10, this.m + 10)) {
                  this.E = -1;
               }
            }

            super.d();
         }
      }
   }

   private void j() {
      int var1;
      int var2;
      if (hso_ft.Q) {
         if (!this.S && hso_ft.a(this.j, this.k, this.O, this.m)) {
            for(var1 = 0; var1 < this.R.length; ++var1) {
               this.R[0] = hso_ft.ae;
            }

            this.Q = hso_ft.ae;
            this.S = true;
            this.T = this.V != 0;
            this.V = 0;
         } else if (this.S) {
            ++this.P;
            if (this.P > 5 && this.Q == hso_ft.ae && !this.T) {
               this.Q = -1000;
               this.h = (p + hso_ft.ae - this.j) / this.l;
            }

            if ((var1 = hso_ft.ae - this.R[0]) != 0 && this.h != -1) {
               this.h = -1;
            }

            for(var2 = this.R.length - 1; var2 > 0; --var2) {
               this.R[var2] = this.R[var2 - 1];
            }

            this.R[0] = hso_ft.ae;
            if ((p -= var1) < 0) {
               p = 0;
            }

            if (p > r) {
               p = r;
            }

            if (q < 0 || q > r) {
               var1 /= 2;
            }

            q -= var1;
         }
      }

      if (hso_ft.U && this.S) {
         var1 = hso_ft.ae - this.R[0];
         hso_ft.U = false;
         if (hso_ak.e(var1) < 20 && hso_ak.e(hso_ft.ae - this.Q) < 20 && !this.T) {
            this.V = 0;
            p = q;
            this.Q = -1000;
            this.h = (p + hso_ft.ae - this.j) / this.l;
            this.P = 0;
            this.U = 1;
         } else if (this.h != -1 && this.P > 5) {
            this.P = 0;
            this.U = 1;
         } else if (this.h == -1 && !this.T) {
            if (q < 0) {
               p = 0;
            } else if (q > r) {
               p = r;
            } else {
               byte var3;
               if ((var2 = hso_ft.ae - this.R[0] + (this.R[0] - this.R[1]) + (this.R[1] - this.R[2])) > 10) {
                  var3 = 10;
               } else if (var2 < -10) {
                  var3 = -10;
               } else {
                  var3 = 0;
               }

               this.V = -var3 * 100;
            }
         }

         this.S = false;
         this.P = 0;
         hso_ft.U = false;
      }

      if (hso_ft.R && this.S) {
         this.S = false;
      }

   }

   public final void b(mGraphics var1) {
      hso_ft.a(var1);
      if (z) {
         int var2;
         int var3;
         hso_bt var8;
         if (d == 1) {
            var1 = var1;
            hso_fq var6 = this;
            var2 = this.j + 6;
            var3 = this.k + 8;
            hso_cg.a(var1, this.j, this.n, this.O, this.m, (int)12);
            MainObject var9;
            if ((var9 = MainObject.a(this.C, this.D)) != null) {
               var9.b(var1, this.j + this.O - 10, this.k);
               hso_cg.a(var1, var9.cB, var2 + 10, var3, 0);
               if (this.b != null) {
                  this.b.a(var1, this.I);
               }

               hso_ft.a(var1);

               for(var2 = 0; var2 < var6.g.c(); ++var2) {
                  (var8 = (hso_bt)var6.g.a(var2)).a(var1, var8.h, var8.i);
               }
            }

         } else {
            if (d == 0) {
               hso_cg.a(var1, this.j - 6, this.n - this.o - 6, this.O + 12, this.m + this.o + 12, (int)0);
               hso_cg.a(var1, this.j, this.n, this.O, this.m, (byte)2);
               hso_o.c.a(var1, this.v, this.j + this.O / 2, this.n - this.o + hso_ft.aa / 4, 2, true);
               if (x) {
                  if (hso_ft.B) {
                     hso_fl.c(var1, this.j, this.k - this.o + hso_ft.aa + 2, this.O, this.l - 4, 1);
                  } else {
                     for(var2 = 0; var2 <= this.O / 32; ++var2) {
                        if (var2 < this.O / 32) {
                           var1.a(hso_fl.aP[1], 0, 0, 32, this.l - 4, 0, this.j + (var2 << 5), this.n - this.o + hso_ft.aa + 2, 0);
                        } else {
                           var1.a(hso_fl.aP[1], 0, 0, 32, this.l - 4, 0, this.j + this.O - 32, this.n - this.o + hso_ft.aa + 2, 0);
                        }
                     }
                  }

                  if (this.A.c() > 1) {
                     var1.a(hso_fl.aP[7], 0, 16, 13, 8, 6, this.j + 8 - hso_ft.ai % 3, this.n - this.o + hso_ft.aa + this.l / 2, 3);
                     var1.a(hso_fl.aP[7], 0, 24, 13, 8, 6, this.j + this.O - 8 + hso_ft.ai % 3, this.n - this.o + hso_ft.aa + this.l / 2, 3);
                  }

                  hso_cg.a(var1, e.cB, this.j + this.O / 2 + 13, this.n - this.o + hso_ft.aa + this.l / 4 + 3, 2, (int)2);
                  var2 = hso_o.c.a(e.cB) / 2 + 1;
                  e.a(var1, this.j + this.O / 2 - var2 - 2, this.n - this.o + hso_ft.aa + this.l / 4 + 8);
               }

               if (!y) {
                  return;
               }

               int var4;
               if (this.t == -1) {
                  var1.d(this.j + 2, this.n + 2, this.O - 4, this.m - 4);
                  var1.a(-q, 0);

                  for(var2 = 0; var2 < this.g.c(); ++var2) {
                     if (var2 == this.h) {
                        var1.a(hso_cg.aL[3]);
                        var1.a(this.j + var2 * this.l + 3, this.n + 3, this.l - 8, this.m - 6, 6, 6);
                     }

                     String[] var7;
                     if ((var7 = ((hso_bt)this.g.a(var2)).b) == null) {
                        var7 = new String[]{((hso_bt)this.g.a(var2)).a};
                     }

                     var4 = this.n + (this.m - var7.length * 14) / 2 + 1;

                     for(int var10 = 0; var10 < var7.length; ++var10) {
                        if (var2 == this.h) {
                           hso_o.f.a(var1, var7[var10], this.j + var2 * this.l + this.l / 2 - 1, var4 + var10 * 14, 2, true);
                        } else {
                          hso_o.c.a(var1, var7[var10], this.j + var2 * this.l + this.l / 2 - 1, var4 + var10 * 14, 2, true);
                        }
                     }
                  }

                  return;
               }

               var1.d(this.j + 3, this.k + 3, this.O - 6, this.m - 6);
               var1.a(0, -q);
               var1.a(hso_cg.aL[4]);
               if (this.t == 2 || this.t == 4) {
                  for(var2 = 0; var2 < this.g.c() - 1; ++var2) {
                     var1.a(hso_cg.aL[4]);
                     var1.c(this.j + 8, this.k + 3 + this.l + var2 * this.l, this.O - 16, 1);
                  }
               }

               if ((var2 = q / this.l - 1) < 0) {
                  var2 = 0;
               }

               if ((var3 = var2 + this.u + 2) > this.g.c() && (var2 = (var3 = this.g.c()) - this.u - 2) < 0) {
                  var2 = 0;
               }

               if (this.h > -1) {
                  hso_cg.a(var1, this.j + 3, this.k + 3 + this.h * this.l, this.O - 6, this.l + 1);
               }

               for(var4 = var2; var4 < var3; ++var4) {
                  hso_bt var5 = (hso_bt)this.g.a(var4);
                  if (this.t == 2) {
                     var5.c(var1, this.j + this.O / 2, this.k + 6 + this.l / 4 + var4 * this.l, 2);
                  } else if (this.t != 0 && this.t != 3) {
                     if (this.t == 1) {
                        var5.c(var1, this.j + this.O - 6, this.k + 6 + this.l / 4 + var4 * this.l, 1);
                     } else if (this.t == 4) {
                        var5.c(var1, this.j + 10, this.k + 6 + this.l / 4 + var4 * this.l, 0);
                     }
                  } else {
                     var5.c(var1, this.j + 6, this.k + 6 + this.l / 4 + var4 * this.l, 0);
                  }
               }

               hso_ft.a(var1);
               if (GameScreen.p.a >= 0 && c && (var4 = GameScreen.p.i()) >= 0) {
                  MainHelp.a(var1, this.j - 6 - 70, this.k + 16 + var4 * this.l - hso_ft.ab, 70, hso_ft.ab, -1, hso_df.gt);
                  var1.a(hso_cg.ak, 0, 0, 12, 16, 4, this.j + 4 + hso_ft.ai / 2 % 4, this.k + 14 + var4 * this.l, 10);
               }

               if (!this.H) {
                  this.c(var1);
                  return;
               }
            } else if (d == 2) {
               if (this.J) {
                  var1.a(hso_cf.k[4], 0, 0, 20, 16, 0, this.j - 20, this.k + this.m - 16, 0);
                  var1.a(hso_cf.k[4], 20, 0, 20, 16, 0, this.j + this.F, this.k + this.m - 16, 0);
                  if (this.F == this.m) {
                     var1.a(hso_cf.n, 20, 0, 20, 40, 2, this.j, this.k, 0);
                     var1.a(hso_cf.n, 20, 0, 20, 40, 0, this.j + 20, this.k, 0);
                  } else {
                     for(var2 = 0; var2 < this.F; var2 += this.m) {
                        if (var2 == 0) {
                           var1.a(hso_cf.n, 0, 0, 40, 40, 2, this.j, this.k, 0);
                        } else if (var2 + this.m >= this.F) {
                           var1.a(hso_cf.n, 0, 0, 40, 40, 0, this.j + var2, this.k, 0);
                        } else {
                           var1.a(hso_cf.n, 0, 20, 40, 40, 0, this.j + var2, this.k, 0);
                        }
                     }
                  }

                  var1.d(this.j + 5, this.k - 20, this.F - 10, this.m + 20);
               } else {
                  var1.a(hso_cf.k[4], 0, 0, 20, 16, 0, this.j + this.O / 2 - this.F / 2 - 20, this.k + this.m - 16, 0);
                  var1.a(hso_cf.k[4], 20, 0, 20, 16, 0, this.j + this.O / 2 + this.F / 2, this.k + this.m - 16, 0);
                  if (this.F == this.m) {
                     var1.a(hso_cf.n, 20, 0, 20, 40, 2, this.j + this.O / 2 - 20, this.k, 0);
                     var1.a(hso_cf.n, 20, 0, 20, 40, 0, this.j + this.O / 2, this.k, 0);
                  } else {
                     for(var2 = 0; var2 < this.F; var2 += this.m) {
                        if (var2 == 0) {
                           var1.a(hso_cf.n, 0, 0, 40, 40, 2, this.j + this.O / 2 - this.F / 2 + var2, this.k, 0);
                        } else if (var2 + this.m >= this.F) {
                           var1.a(hso_cf.n, 0, 0, 40, 40, 0, this.j + this.O / 2 - this.F / 2 + var2, this.k, 0);
                        } else {
                           var1.a(hso_cf.n, 0, 20, 40, 40, 0, this.j + this.O / 2 - this.F / 2 + var2, this.k, 0);
                        }
                     }
                  }

                  var1.d(this.j + this.O / 2 - this.F / 2 + 5, this.k - 20, this.F - 10, this.m + 20);
               }

               var1.a(-q, 0);

               for(var2 = 0; var2 < this.g.c(); ++var2) {
                  (var8 = (hso_bt)this.g.a(var2)).a(var1, var8.h, var8.i);
               }

               hso_ft.a(var1);
               var1.a(-q, 0);

               for(var2 = 0; var2 < this.g.c(); ++var2) {
                  (var8 = (hso_bt)this.g.a(var2)).b(var1, var8.h, var8.i, 2);
               }
            }

         }
      }
   }

   public final void f() {
      this.a = false;
      this.H = false;
      hso_ft.S = false;
      hso_ft.U = false;
      hso_ft.V = true;
   }

   public final void g() {
      if (this.E > 0) {
         ++this.E;
         if (this.F < this.O) {
            this.F += this.m;
            if (this.F >= this.O) {
               this.F = this.O;
               this.E = 0;
            }
         }
      } else if (this.E < 0) {
         --this.E;
         if (this.F > 0) {
            this.F -= this.m;
            if (this.F <= 0) {
               this.F = 0;
               this.E = 0;
               this.f();
            }
         }
      }

      if (z) {
         if (this.V != 0 && !this.S) {
            if ((p += this.V / 100) < 0) {
               p = 0;
            } else if (p > r) {
               p = r;
            } else {
               q = p;
            }

            this.V = this.V * 9 / 10;
            if (this.V < 100 && this.V > -100) {
               this.V = 0;
            }
         }

         if (q != p && !this.S) {
            this.W = p - q << 2;
            this.X += this.W;
            q += this.X >> 4;
            this.X &= 15;
         }

         int var1;
         if (d == 1) {
            if (this.b != null) {
               this.b.b();
            }

            for(var1 = 0; var1 < this.g.c(); ++var1) {
               ((hso_bt)this.g.a(var1)).b();
            }
         } else if (d == 2 && !hso_ft.T && this.E == 0) {
            for(var1 = 0; var1 < this.g.c(); ++var1) {
               ((hso_bt)this.g.a(var1)).b(q, 0);
            }
         }

         if (this.n > this.k) {
            if ((var1 = this.n - this.k >> 1) < 1) {
               var1 = 1;
            }

            this.n -= var1;
         }

         if (s != 0 && (s >>= 1) < 0) {
            s = 0;
         }

         if (this.U > 0) {
            --this.U;
            if (this.U == 0) {
               this.a = false;
               if (this.h >= 0) {
                  a((hso_bt)this.g.a(this.h));
                  hso_ft.m();
                  hso_ft.l();
                  hso_ft.V = true;
                  hso_ft.S = false;
               }
            }
         }

         super.e();
      }
   }

   private static void a(hso_bt var0) {
      if (var0 != null) {
         if (var0.c == null) {
            if (var0.d != null) {
               var0.d.a(var0.e, var0.f);
            } else {
               hso_ft.a.a_(var0.e, var0.f);
            }
         }

         hso_ft.S = false;
      }

   }
}
