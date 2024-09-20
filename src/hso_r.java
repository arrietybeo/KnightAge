public final class hso_r extends hso_p {
   private static hso_r a;
   private boolean b;
   private static hso_aq f = null;
   private static int g;
   private static int h;
   private static int i;
   private static int j;
   private static int k;
   private static int l;
   private static int m;
   private static int n;
   private static int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w = 0;
   private static int x = 0;
   private static int y = 22;
   private static int z = 17;
   private static int A = 3;
   private static int B = 6;
   private static int[] C = new int[]{108, 111, 131, 93, 76, 58, 39, 102, 83, 66, 49, 121, 135, 154, 160, 100, 94, 80, 128, 73, 100, 88, 53, 83, 73, 127, 109, 89, 72, 171, 172, 185, 202, 134, 117, 157, 135, 99, 102, 122, 139, 156, 47, 44, 28, 23, 0, 47, 87, 0, 133, 159, 23, 207, 207, 239, 226, 207, 207, 168, 182, 217, 23, 71, 24, 88, 25, 66, 99, 40, 47, 28, 64, 47, 47, 67, 83, 98, 111, 128, 0, 0, 117, 219, 191, 219, 241, 218, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   private static int[] D = new int[]{247, 233, 220, 235, 236, 238, 237, 216, 212, 216, 205, 210, 204, 203, 182, 196, 180, 172, 183, 117, 144, 130, 134, 146, 134, 162, 160, 160, 160, 141, 125, 114, 116, 145, 144, 147, 128, 118, 98, 96, 88, 75, 149, 165, 165, 181, 0, 118, 224, 0, 235, 59, 200, 201, 187, 162, 167, 129, 143, 171, 171, 166, 217, 57, 62, 60, 83, 92, 72, 92, 69, 43, 42, 35, 18, 14, 8, 14, 28, 27, 0, 0, 132, 116, 96, 71, 94, 94, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   private static String[] E;
   private int F;
   private int G;
   private int H;
   private int I;
   private boolean J = false;
   private int K;
   private int L;

   public hso_r() {
      super.aa = new hso_bt(hso_df.Z, 0, this);
   }

   private void g() {
      int var1;
      if ((var1 = hso_ft.p.d) > C.length) {
         var1 = C.length - 1;
      }

      int var2 = aq.a(hso_ex.e.a);
      this.H = (hso_ft.W - var2) / 2;
      this.I = (hso_ft.X - 20 - aq.b(hso_ex.e.a)) / 2;
      if (this.H < 0) {
         this.H = 0;
      }

      if (this.I < 0) {
         this.I = 0;
      }

      if (this.b) {
         u = var2 + 20 - hso_ft.W;
         v = aq.b(hso_ex.e.a) + 40 - hso_ft.X;
         this.F = var2 + 20;
         this.G = var2 + 40;
         if (this.G < hso_ft.X - 26) {
            this.G = hso_ft.X - 26;
         }

         if (this.F < hso_ft.W) {
            this.F = hso_ft.W;
         }

         i = this.H + GameScreen.f.aY / 12;
         j = this.I + GameScreen.f.aZ / 12;
      } else {
         u = 340 - hso_ft.W;
         v = 340 - hso_ft.X;
         i = C[var1] + w;
         j = D[var1] + x;
         this.F = 330 + w;
         this.G = 310 + x;
      }

      this.F -= 10;
      this.G -= 10;
      if (u < 0) {
         u = 0;
      }

      if (v < 0) {
         v = 0;
      }

      t = 0;
      s = 0;
      n = 0;
      m = 0;
      m = i - hso_ft.Y;
      n = j - hso_ft.Z;
   }

   public static hso_r b() {
      if (a == null) {
         a = new hso_r();
      }

      return a;
   }

   public final void c() {
      super.c();
      super.aa = new hso_bt(hso_df.Z, 0, this);
      if (f == null) {
         g = aq.a((f = aq.a("/wm.png")).a);
         h = aq.a(f.a);
      }

      if (hso_ft.W > g) {
         w = hso_ft.W / 2 - g / 2;
      }

      if (hso_ft.X > h) {
         x = hso_ft.X / 2 - h / 2;
      }

      this.g();
      h();
      System.gc();
      E = hso_df.gC;
   }

   public final void a(mGraphics var1) {
      var1.a(0);
      var1.c(0, 0, hso_ft.W, hso_ft.X);
      var1.a(10, 10);
      var1.a(-s, -t);
      if (hso_ft.W > g && hso_ft.X > h) {
         var1.a(f, hso_ft.Y, hso_ft.Z, A);
      } else if (hso_ft.W > g) {
         var1.a(f, hso_ft.Y, 0, z);
      } else if (hso_ft.X > h) {
         var1.a(f, 0, hso_ft.Z, B);
      } else {
         var1.a(f, 0, 0, 0);
      }

      int var2;
      int var3;
      if (hso_ft.p.d < E.length && hso_ft.p.d >= 0) {
         var2 = 0;
         if (C[hso_ft.p.d] != 1 || D[hso_ft.p.d] != 1) {
            var2 = C[hso_ft.p.d] < 100 ? 0 : (C[hso_ft.p.d] > 200 ? 1 : 2);
            var1.a(hso_cg.al, 0, hso_ft.ai % 3 * 10, 10, 10, 0, C[hso_ft.p.d] + w, D[hso_ft.p.d] + x, 3);
         }

         var3 = 0;
         if (C[hso_ft.p.d] != 1 || D[hso_ft.p.d] != 1) {
            var3 = D[hso_ft.p.d] - 20;
            hso_o.c.a(var1, E[hso_ft.p.d], C[hso_ft.p.d] + w + 1, D[hso_ft.p.d] + x - 20 + 1, var2, false);
            hso_o.d.a(var1, E[hso_ft.p.d], C[hso_ft.p.d] + w, D[hso_ft.p.d] + x - 20, var2, false);
         }

         if (k >= 0 && k != 0) {
            var2 = C[k] < 100 ? 0 : (C[k] > 200 ? 1 : 2);
            int var4 = C[k];
            int var5;
            if ((var5 = D[k] - 20) > var3 && var5 - var3 < 30) {
               var5 += 40;
            }

            if (var5 < var3 && var3 - var5 < 20) {
               var5 -= 5;
            }

            hso_o.c.a(var1, E[k], var4 + w + 1, var5 + x + 1, var2, false);
            hso_o.d.a(var1, E[k], var4 + w, var5 + x, var2, false);
         }
      }

      if (!hso_ft.A) {
         var1.a(hso_fl.aP[5], 0, 0, 10, 10, 0, i - 2, j, 0);
      } else if (k >= 0) {
         var2 = C[k] - 9;
         var3 = D[k];
         var1.a(hso_fl.aP[5], 0, 0, 10, 10, 0, var2 + w, var3 + x, 0);
      }

      var1.a(-var1.a(), -var1.b());
      super.a(var1);
   }

   public final void d() {
      super.d();
      if (++l > 10000) {
         l = 0;
      }

      if (s != m || t != n) {
         o = m - s << 1;
         p = n - t << 1;
         q += o;
         s += q >> 4;
         q &= 15;
         r += p;
         t += r >> 4;
         r &= 15;
         if (s < 0) {
            s = 0;
         }

         if (s > u) {
            s = u;
         }

         if (t < 0) {
            t = 0;
         }

         if (t > v) {
            t = v;
         }
      }

      boolean var1 = false;
      if (hso_ft.al[2]) {
         if ((j -= 4) < x - 10) {
            j = x - 10;
         }

         var1 = true;
      }

      if (hso_ft.al[8]) {
         if ((j += 4) > this.G) {
            j = this.G;
         }

         var1 = true;
      }

      if (hso_ft.al[4]) {
         if ((i -= 4) < w - 10) {
            i = w - 10;
         }

         var1 = true;
      }

      if (hso_ft.al[6]) {
         if ((i += 4) > this.F) {
            i = this.F;
         }

         var1 = true;
      }

      if (var1) {
         m = i - hso_ft.Y;
         n = j - hso_ft.Z;
         h();
      }

      if (hso_ft.U && hso_ft.af < hso_ft.X - y) {
         hso_ft.U = false;
         this.J = true;
         this.K = hso_ft.ae;
         this.L = hso_ft.af;
      } else if (hso_ft.Q && this.J) {
         m -= hso_ft.ae - this.K;
         n -= hso_ft.af - this.L;
         if (m < 0) {
            m = 0;
         }

         if (n < 0) {
            n = 0;
         }

         if (m > u) {
            m = u;
         }

         if (n > v) {
            n = v;
         }

         s = m;
         t = n;
         this.K = hso_ft.ae;
         this.L = hso_ft.af;
      }

      if (hso_ft.R) {
         int var3 = hso_ft.ag - hso_ft.ae;
         int var2 = hso_ft.ah - hso_ft.af;
         if (var3 < 10 && var2 < 10) {
            i = s + hso_ft.ag - 8;
            j = t + hso_ft.ah - 8;
            h();
         }

         this.J = false;
         hso_ft.R = false;
      }

      if (hso_ft.A && hso_ft.W >= 320) {
         super.aa.h = hso_ft.W / 2 - 35;
      }

   }

   private static void h() {
      k = -1;
      byte var0 = 10;
      if (!hso_ft.A) {
         var0 = 13;
      }

      for(int var1 = 0; var1 < C.length; ++var1) {
         if (hso_ak.e(i - (C[var1] + w)) < var0 && hso_ak.e(j - (D[var1] + x)) < var0) {
            k = var1;
            return;
         }
      }

   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         f = null;
         GameScreen.b().c();
         return;
      case 1:
         this.b = !this.b;
         this.g();
      default:
      }
   }
}
