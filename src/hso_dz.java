public final class hso_dz {
   private byte b;
   private byte[] c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private hso_en[] q;
   private hso_aq[] r;
   private hso_aq[] s;
   private int t;
   public int a;

   public final void a(byte var1, short var2) {
      this.b = var1;
      this.l = var2;
      if (hso_ft.B) {
         this.t = -9784873;
         this.a = -9784873;
      } else {
         int var3;
         switch(this.b) {
         case 1:
            this.d = 256;
            this.f = hso_ft.p.e * hso_cs.l / this.d + 1;
            this.t = -8725531;
            this.a = -8725531;
            this.h = 92;
            this.i = 85;
            this.j = 110;
            this.m = this.l - (this.h + this.i + this.j);
            this.k = hso_ft.W / this.d + 1;
            this.r = new hso_aq[3];
            this.r[0] = hso_aq.a("/bg/bg1_0.img");
            this.r[1] = hso_aq.a("/bg/bg1_1.img");
            this.r[2] = hso_aq.a("/bg/bg1_2.img");
            this.n = (this.m + 30) / 2;
            break;
         case 2:
            this.d = 120;
            this.f = hso_ft.p.e * hso_cs.l / this.d + 1;
            this.t = -10836481;
            this.a = -11759720;
            this.h = 72;
            this.i = 28;
            this.j = 77;
            this.m = this.l - (this.h + this.i + this.j);
            this.k = hso_ft.W / this.d + 1;
            this.r = new hso_aq[5];
            this.r[0] = hso_aq.a("/bg/bg2_0.img");
            this.r[1] = hso_aq.a("/bg/bg2_1.img");
            this.r[2] = hso_aq.a("/bg/bg2_20.img");
            this.r[3] = hso_aq.a("/bg/bg2_21.img");
            this.r[4] = hso_aq.a("/bg/bg2_22.img");
            this.c = new byte[this.f];

            for(var3 = 0; var3 < this.f; ++var3) {
               this.c[var3] = (byte)hso_ak.f(3);
            }

            this.n = 25;
            break;
         case 3:
            this.d = 253;
            this.e = 96;
            this.f = hso_ft.p.e * hso_cs.l / this.d + 1;
            this.g = hso_ft.p.e * hso_cs.l / this.e + 1;
            this.t = -9784873;
            this.a = -9784873;
            this.h = 108;
            this.i = 72;
            this.p = (this.l - 120) / this.i;
            if (this.p > 5) {
               this.p = 5;
            }

            this.m = this.l - (this.h + this.i * this.p);
            this.k = hso_ft.W / this.d + 1;
            this.o = hso_ft.W / this.e + 1;
            this.r = new hso_aq[2];
            this.r[0] = hso_aq.a("/bg/bg3_0.img");
            this.r[1] = hso_aq.a("/bg/bg3_1.img");
            this.n = (this.m + 30) / 2;
         }

         this.q = new hso_en[hso_ft.p.e * hso_cs.l / 250 + 1];

         for(var3 = 0; var3 < this.q.length; ++var3) {
            this.q[var3] = new hso_en();
            this.q[var3].a = 125 + hso_ak.g(125) + var3 * 250;
            this.q[var3].b = this.n + hso_ak.g(this.n);
            this.q[var3].i = -hso_ak.c(1, 3);
            this.q[var3].p = hso_ak.c(0, 2);
         }

         this.s = new hso_aq[2];
         this.s[0] = hso_aq.a("/bg/may0.img");
         this.s[1] = hso_aq.a("/bg/may1.img");
      }
   }

   public final void a(mGraphics var1) {
      if (hso_ft.B) {
         if (hso_p.d.b <= this.l) {
            var1.a(this.t);
            var1.c(hso_p.d.a, hso_p.d.b, hso_ft.W, hso_ft.X);
         }

      } else {
         int var5;
         boolean var2 = false;
         var2 = false;
         boolean var3 = false;
         var3 = false;
         int var6;
         label136:
         switch(this.b) {
         case 1:
            if ((var6 = (var5 = hso_p.d.a / this.d) + this.k + 1) > this.f) {
               var6 = this.f;
            }

            if (hso_p.d.b <= this.m) {
               var1.a(this.t);
               var1.c(hso_p.d.a, hso_p.d.b, hso_ft.W, this.m);
            }

            var5 = var5;

            while(true) {
               if (var5 >= var6) {
                  break label136;
               }

               if (hso_p.d.b <= this.h + this.m) {
                  var1.a(this.r[0], var5 * this.d, this.m, 0);
               }

               if (hso_p.d.b <= this.i + this.h + this.m) {
                  var1.a(this.r[1], var5 * this.d, this.h + this.m, 0);
               }

               if (hso_p.d.b <= this.i + this.h + this.j + this.m) {
                  var1.a(this.r[2], var5 * this.d, this.h + this.i + this.m, 0);
               }

               ++var5;
            }
         case 2:
            if ((var5 = hso_p.d.a / this.d) < 0) {
               var5 = 0;
            }

            if ((var6 = var5 + this.k + 1) > this.f) {
               var6 = this.f;
            }

            if (hso_p.d.b <= this.m) {
               var1.a(this.t);
               var1.c(hso_p.d.a, hso_p.d.b, hso_ft.W, this.m);
            }

            var5 = var5;

            while(true) {
               if (var5 >= var6) {
                  break label136;
               }

               if (hso_p.d.b <= this.h + this.m) {
                  var1.a(this.r[0], var5 * this.d, this.m, 0);
               }

               if (hso_p.d.b <= this.i + this.h + this.m) {
                  var1.a(this.r[1], var5 * this.d, this.h + this.m, 0);
               }

               if (hso_p.d.b <= this.i + this.h + this.j + this.m) {
                  var1.a(this.r[2 + this.c[var5]], var5 * this.d, this.h + this.i + this.m, 0);
               }

               ++var5;
            }
         case 3:
            if (hso_p.d.b <= this.m) {
               var1.a(this.t);
               var1.c(hso_p.d.a, hso_p.d.b, hso_ft.W, this.m);
            }

            if ((var5 = hso_p.d.a / this.e) < 0) {
               var5 = 0;
            }

            if ((var6 = var5 + this.o + 1) > this.g) {
               var6 = this.g;
            }

            for(var5 = var5; var5 < var6; ++var5) {
               for(int var4 = 0; var4 < this.p; ++var4) {
                  var1.a(this.r[1], var5 * this.e, this.m + this.h + var4 * this.i, 0);
               }
            }

            if ((var5 = hso_p.d.a / this.d) < 0) {
               var5 = 0;
            }

            if ((var6 = var5 + this.k + 1) > this.f) {
               var6 = this.f;
            }

            for(var5 = var5; var5 < var6; ++var5) {
               if (hso_p.d.b <= this.h + this.m) {
                  var1.a(this.r[0], var5 * this.d, this.m, 0);
               }
            }
         }

         for(var5 = 0; var5 < this.q.length; ++var5) {
            if (hso_p.d.b - 10 <= this.q[var5].b) {
               var1.a(this.s[this.q[var5].p], this.q[var5].a, this.q[var5].b, 6);
            }
         }

      }
   }

   public final void a() {
      if (!hso_ft.B) {
         for(int var1 = 0; var1 < this.q.length; ++var1) {
            hso_en var10000 = this.q[var1];
            var10000.a += this.q[var1].i;
            if (this.q[var1].a < -80) {
               this.q[var1].a = hso_ft.p.e * hso_cs.l + hso_ak.g(125);
               this.q[var1].b = this.n + hso_ak.g(this.n);
               this.q[var1].i = -hso_ak.c(1, 3);
               this.q[var1].p = hso_ak.c(0, 2);
            }
         }

      }
   }
}
