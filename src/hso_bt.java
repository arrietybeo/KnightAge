public final class hso_bt {
   public String a;
   private String m = "";
   public String[] b;
   public hso_dk c;
   public hso_cg d;
   public byte e;
   public byte f = -1;
   public boolean g = false;
   private int n;
   private int o;
   private hso_ce p;
   private hso_ce q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   public int h = -1;
   public int i = -1;
   private int w;
   private int x;
   private int y;
   public static int j = 70;
   public static int k = 24;
   public int l = 0;
   private Object z;
   private boolean A = false;

   public hso_bt(String var1, hso_dk var2) {
      this.a = var1;
      this.c = null;
   }

   public hso_bt(String var1, int var2) {
      this.a = var1;
      this.e = (byte)var2;
   }

   public hso_bt(String var1, int var2, hso_cg var3) {
      this.a = var1;
      this.e = (byte)var2;
      this.d = var3;
   }

   public hso_bt(String var1, int var2, int var3, hso_cg var4) {
      this.a = var1;
      this.e = (byte)var2;
      this.f = (byte)var3;
      this.d = var4;
   }

   public hso_bt(String var1, int var2, Object var3, hso_cg var4) {
      this.a = var1;
      this.e = 43;
      this.d = var4;
      this.z = var3;
   }

   public final void a(hso_ce var1) {
      this.p = var1;
      this.r = this.p.a;
      this.s = this.p.b;
      this.n = this.p.c;
      this.o = 0;
      if (hso_ft.C) {
         this.t = hso_o.j.a(this.a);
      } else {
         this.t = hso_o.f.a(this.a);
      }
   }

   public final void a(hso_ce var1, int var2, int var3) {
      this.p = var1;
      this.r = this.p.a;
      this.s = this.p.b;
      this.n = var2;
      this.o = var3;
      if (hso_ft.C) {
         this.t = hso_o.j.a(this.a);
      } else {
         this.t = hso_o.f.a(this.a);
      }
   }

   public final void a(int var1, int var2, hso_ce var3, String var4) {
      this.a = var4;
      this.h = var1;
      this.i = var2;
      this.q = var3;
      if (this.q != null) {
         this.u = this.q.a;
         this.v = this.q.b;
         if (this.u < 28) {
            this.u = 28;
         }

         if (this.v < 28) {
            this.v = 28;
            return;
         }
      } else {
         this.u = 70;
         this.v = k;
      }

   }

   public final void a(int var1, int var2, hso_ce var3, String var4, int var5, int var6) {
      this.A = true;
      this.a = var4;
      this.h = var1;
      this.i = var2;
      this.q = null;
      if (this.q != null) {
         this.u = this.q.a;
         this.v = this.q.b;
         if (this.u < 28) {
            this.u = 28;
         }

         if (this.v < 28) {
            this.v = 28;
            return;
         }
      } else {
         this.u = var5;
         this.v = var6;
      }

   }

   public final void b(int var1, int var2, hso_ce var3, String var4, int var5, int var6) {
      this.a = "";
      this.m = var4;
      this.h = var1;
      this.i = var2;
      this.x = 0;
      this.y = -32;
      this.q = var3;
      if (this.q != null) {
         this.u = this.q.a;
         this.v = this.q.b;
         if (this.u < 28) {
            this.u = 28;
         }

         if (this.v < 28) {
            this.v = 28;
            return;
         }
      } else {
         this.u = 70;
         this.v = k;
      }

   }

   public final void a(int var1, int var2) {
      this.h = var1;
      this.i = var2;
   }

   public final void a() {
      hso_eh var1;
      if (hso_ft.o.a && (hso_ft.o.b == null || (var1 = hso_ft.o.b).b >= var1.a.length)) {
         hso_ft.o.f();
      }

      if (this.c == null) {
         if (this.d == null) {
            if (hso_ft.r != null) {
               hso_ft.r.b(this.e, this.f);
               hso_ft.S = false;
               hso_ft.m();
               hso_ft.l();
               return;
            }

            if (hso_d.b) {
               hso_d.b("").b(this.e, this.f);
               return;
            }

            if (hso_ft.o.a) {
               hso_ft.a.a_(this.e, this.f);
               return;
            }

            if (hso_ft.s != null) {
               hso_ft.s.b(this.e, this.f);
               return;
            }

            hso_ft.a.b(this.e, this.f);
            return;
         }

         if (this.z != null) {
            this.d.a(this.e, this.z);
         } else {
            this.d.a(this.e, this.f);
         }
      }

      hso_ft.S = false;
      hso_ft.m();
      hso_ft.l();
   }

   public final void a(mGraphics var1, int var2, int var3) {
      if (this.c()) {
         if (this.q != null) {
            this.q.b(this.w, this.h, this.i, 0, 3, var1);
         } else {
            this.b(var1, this.h, this.i);
         }

         this.a(var1, this.h, this.i - 6, 2);
      } else {
         if (this.q != null) {
            this.q.b(this.w, var2, var3, 0, 3, var1);
         } else {
            this.b(var1, var2, var3);
         }

         this.a(var1, var2, var3 - 6, 2);
      }
   }

   public final void a(mGraphics var1, int var2, int var3, int var4) {
      if (this.a != null) {
         var4 = 0;
         if (this.p != null) {
            this.p.b(this.o + hso_ft.ai / 2 % this.n, var2 - this.r / 2 - this.t / 2, var3 + this.s / 2 - 3, 0, 3, var1);
            var4 = this.r / 2;
         }

         if (!this.A) {
            if (hso_ft.C) {
               hso_o.j.a(var1, this.a, var2 + var4, var3, 2, false);
            } else {
               hso_cg.a(var1, this.a, var2 + var4, var3, 2, (byte)0);
            }
         } else if (hso_ft.C) {
            hso_o.j.a(var1, this.a, var2 + var4 + this.u / 2, var3 + this.v / 2 + 1, 2, false);
         } else {
            hso_cg.a(var1, this.a, var2 + var4 + this.u / 2, var3 + this.v / 2 + 1, 2, (byte)0);
         }
      }
   }

   public final void b(mGraphics var1, int var2, int var3, int var4) {
      if (this.w == 1 && this.m.length() > 0) {
         hso_cg.a(var1, this.m, var2 + this.x, var3 + this.y, 2, (byte)0);
      }

   }

   public final void c(mGraphics var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (this.p != null) {
         if (var4 == 2) {
            this.p.b(this.o + hso_ft.ai / 2 % this.n, var2 - this.r / 2 - this.t / 2, var3 + this.s / 2, 0, 3, var1);
            var5 = this.r / 2;
         } else if (var4 == 0) {
            this.p.b(this.o + hso_ft.ai / 2 % this.n, var2 + this.r / 2, var3 + this.s / 2, 0, 3, var1);
            var5 = this.r + 6;
         }
      }

      if (hso_ft.C) {
         hso_o.j.a(var1, this.a, var2 + var5, var3, var4, false);
      } else {
         hso_cg.a(var1, this.a, var2 + var5, var3, var4, (byte)7, (byte)0);
      }
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.p != null) {
         if ((var4 = this.o + this.w == 1 ? 1 : 0) > this.n) {
            var4 = this.o - 1;
         }

         this.p.b(var4, var2, var3 + this.s / 2, 0, 3, var1);
      }

   }

   public final void b() {
      if (!this.A) {
         if (this.c()) {
            if (!hso_ft.Q && !hso_ft.T) {
               this.w = 0;
            } else if (hso_ft.c(this.h - this.u / 2 - 5, this.i - this.v / 2 - 5, this.u + 10, this.v + 10)) {
               this.w = 1;
            } else {
               this.w = 0;
            }

            if (hso_ft.b(this.h - this.u / 2 - 5, this.i - this.v / 2 - 5, this.u + 10, this.v + 10)) {
               this.a();
               hso_ft.S = false;
               this.w = 0;
               return;
            }
         }
      } else if (this.c()) {
         if (!hso_ft.Q && !hso_ft.T) {
            this.w = 0;
            this.g = false;
         } else if (hso_ft.c(this.h - 5, this.i - 5, this.u + 10, this.v + 10)) {
            this.g = true;
            this.w = 1;
         } else {
            this.w = 0;
            this.g = false;
         }

         if (hso_ft.b(this.h - 5, this.i - 5, this.u + 10, this.v + 10)) {
            this.a();
            hso_ft.S = false;
            this.w = 0;
            this.g = false;
         }
      }

   }

   public final void b(int var1, int var2) {
      if (this.c()) {
         if (hso_ft.Q || hso_ft.T) {
            if (hso_ft.c(this.h - this.u / 2 - 3 - var1, this.i - this.v / 2 - 3, this.u + 6, this.v + 6)) {
               this.w = 1;
               return;
            }

            this.w = 0;
            return;
         }

         this.w = 0;
      }

   }

   public final void b(mGraphics var1, int var2, int var3) {
      if (hso_ft.A) {
         if (!this.A) {
            hso_cf.r.b(this.w, var2, var3, 0, 3, var1);
         } else {
            hso_cg.a(var1, var2, var3, this.u, this.v, this.g ? 1 : 2);
         }
      } else if (!this.A) {
         hso_cg.a(var1, var2 - j / 2, var3 - k / 2, j, k, this.g ? 1 : 2);
      } else {
         hso_cg.a(var1, var2, var3, this.u, this.v, this.g ? 1 : 2);
      }
   }

   public final boolean c() {
      return this.h > 0 && this.i > 0;
   }
}
