public class hso_bw {
   public static byte a = 49;
   public static byte b = 50;
   public static int c = 51;
   public static String[] d;
   public static byte[] e;
   public static byte[] f;
   public String g;
   public String h;
   public String i;
   public hso_cz[] j;
   public String[] k;
   public String[] l;
   public int[] m;
   public int[] n;
   public int o;
   public int p;
   public long q;
   public static hso_dg r = new hso_dg();
   public int s = 60;
   public int t;
   public int u;
   public short v;
   public static hso_ce w;
   public byte x = 0;
   public byte y = 0;
   public byte z = 0;
   public byte A;
   public byte B = 0;
   public byte C = 0;
   public long D = 0L;
   public byte E = 0;
   public int F = -1;
   public long G = -1L;
   public boolean H = false;
   public String[] I = new String[]{"", ""};
   public hso_es J = new hso_es("EffectSkill moreContenGem");
   public int K;
   public byte L;
   public int M;
   public int N = 0;
   public int O;
   public int P;
   public byte Q;
   public int R;
   public int S;
   public String T = "";
   public static hso_ek U = new hso_ek();
   public static hso_es V = new hso_es("Item VecInvetoryPlayer");
   public static hso_es W = new hso_es("Item VecChestPlayer");
   public static hso_es X = new hso_es("Item VecPetContainer");
   public static hso_es Y = new hso_es("Item VecClanInvetory");
   public static hso_es Z = new hso_es("Item VecLotteryReward");
   public static hso_es aa = new hso_es("Item Sell");
   public static hso_es ab = new hso_es("Item Sell in store");
   public static hso_ek ac = new hso_ek();
   public static hso_ek ad = new hso_ek();
   public static hso_ek ae = new hso_ek();
   public static hso_ek af = new hso_ek();
   public static hso_ek ag = new hso_ek();
   public static hso_ek ah = new hso_ek();
   public static hso_ek ai = new hso_ek();
   public static hso_ek aj = new hso_ek();
   private static byte[] am = new byte[]{0, 1, 2, 1};
   private byte an = 0;
   public hso_bw ak;
   public static byte[] al;

   private boolean f() {
      return this.F != -1;
   }

   public final long a() {
      return hso_dw.a() - this.G;
   }

   public void a(mGraphics var1, int var2, int var3, int var4, int var5, int var6) {
      hso_fd var7 = null;
      if (this.g == null) {
         if (this.b()) {
            return;
         }
      } else {
         int var8;
         if (this.N > 0) {
            var8 = this.N;
            if (this.N >= 20 && this.N < 30) {
               var8 = 6;
            } else if (this.N >= 30 && this.N < 40) {
               var8 = 7;
            } else if (this.N >= 40 && this.N < 50) {
               var8 = 8;
            }

            var1.a(hso_cg.as, 0, var8 - 1 << 5, var4 - 1, var4 - 1, 2, var2 - (var4 - 1) / 2, var3 - (var4 - 1) / 2, 0);
         }

         if (this.u == 6) {
            if (this.q <= 0L) {
               var1.a(hso_cg.as, 0, 0, var4 - 1, var4 - 1, 2, var2 - (var4 - 1) / 2, var3 - (var4 - 1) / 2, 0);
            }

            hso_ak.d(5, this.t).b(var1, var2, var3, 0, 0);
            return;
         }

          switch (this.u) {
              case 5:
                  var7 = hso_bk.f((short)this.t);
                  break;
              case 4:
                  var7 = hso_bk.e((short)this.t);
                  break;
              case 3:
                  var7 = hso_bk.d((short)this.t);
                  break;
              case 7:
                  var7 = hso_bk.g((short)this.t);
                  break;
              case 8:
                  var7 = hso_bk.i((short)this.O);
                  break;
              case 9:
                  var7 = hso_bk.k((short)this.t);
                  break;
              default:
                  break;
          }

         if (this.u != 6) {
            if (var7 != null && var7.a != null) {
               if (hso_aq.b(var7.a.a) / 18 == 3) {
                  if (hso_ft.ai % 6 == 0) {
                     if ((var8 = am.length) == 0) {
                        var8 = 1;
                     }

                     this.an = (byte)((this.an + 1) % var8);
                  }

                  var1.a(var7.a, 0, am[this.an] * 18, 18, 18, 0, var2, var3, 3);
               } else {
                  var1.a(var7.a, var2, var3, 3);
               }
            } else {
               var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, var2, var3, 3);
            }
         }

         if (this.u == 3 && this.z > 0) {
            var8 = this.z;
            if (this.R == 7) {
               var8 = this.z / 2;
            }

            r.a(var2, var3, var8, var4 - 4, var1, var5);
         }
      }

      if (this.K > 1) {
         hso_o.q.a(var1, String.valueOf(this.K), var2 + var4 / 2 - 1 - var6, var3 + var4 / 2 - 9 - var6, 1, true);
      }

      if (this.B > 0) {
         var1.a(hso_cg.av, var2 + 4, var3 + 3, 0);
      }

      if (this.u == 3) {
         if (this.p > 0) {
            this.g();
         }

         if (this.f()) {
            this.h();
         }
      }

   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
      hso_fd var6 = null;
      if (this.g == null) {
         if (this.b()) {
            return;
         }
      } else {
         int var7;
         if (this.N > 0) {
            var7 = this.N;
            if (this.N >= 20 && this.N < 30) {
               var7 = 6;
            } else if (this.N >= 30 && this.N < 40) {
               var7 = 7;
            } else if (this.N >= 40 && this.N < 50) {
               var7 = 8;
            }

            var1.a(hso_cg.as, 0, var7 - 1 << 5, var4 - 1, var4 - 1, 2, var2 - (var4 - 1) / 2, var3 - (var4 - 1) / 2, 0);
         }

         if (this.u == 6) {
            if (this.q <= 0L) {
               var1.a(hso_cg.as, 0, 0, var4 - 1, var4 - 1, 2, var2 - (var4 - 1) / 2, var3 - (var4 - 1) / 2, 0);
            }

            hso_ak.d(5, this.t).b(var1, var2, var3, 0, 0);
            return;
         }

         if (this.u == 5) {
            var6 = hso_bk.f((short)this.t);
         } else if (this.u == 4) {
            var6 = hso_bk.e((short)this.t);
         } else if (this.u == 3) {
            var6 = hso_bk.d((short)this.t);
         } else if (this.u == 7) {
            var6 = hso_bk.g((short)this.t);
         } else if (this.u == 8) {
            var6 = hso_bk.i((short)this.O);
         } else if (this.u == 9) {
            var6 = hso_bk.k((short)this.t);
         }

         if (this.u != 6) {
            if (var6 != null && var6.a != null) {
               if (hso_aq.b(var6.a.a) / 18 == 3) {
                  if (hso_ft.ai % 6 == 0) {
                     if ((var7 = am.length) == 0) {
                        var7 = 1;
                     }

                     this.an = (byte)((this.an + 1) % var7);
                  }

                  var1.a(var6.a, 0, am[this.an] * 18, 18, 18, 0, var2, var3, 3);
               } else {
                  var1.a(var6.a, var2, var3, 3);
               }
            } else {
               var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, var2, var3, 3);
            }
         }

         if (this.u == 3 && this.z > 0) {
            var7 = this.z;
            if (this.R == 7) {
               var7 = this.z / 2;
            }

            r.a(var2, var3, var7, var4 - 4, var1, var5);
         }
      }

      if (this.B > 0) {
         var1.a(hso_cg.av, var2 + 4, var3 + 3, 0);
      }

      if (this.u == 3) {
         if (this.p > 0) {
            this.g();
         }

         if (this.f()) {
            this.h();
         }
      }

   }

   public void c(mGraphics var1, int var2, int var3, int var4, int var5, int var6) {
      hso_fd var8 = null;
      if (this.g == null) {
         if (this.b()) {
            return;
         }
      } else {
         int var7;
         if (this.N > 0) {
            var7 = this.N;
            if (this.N >= 20 && this.N < 30) {
               var7 = 6;
            } else if (this.N >= 30 && this.N < 40) {
               var7 = 7;
            } else if (this.N >= 40 && this.N < 50) {
               var7 = 8;
            }

            var1.a(hso_cg.as, 0, var7 - 1 << 5, var4 - 1, var4 - 1, 2, var2 - (var4 - 1) / 2, var3 - (var4 - 1) / 2, 0);
         }

         if (this.u == 6) {
            if (this.q <= 0L) {
               var1.a(hso_cg.as, 0, 0, var4 - 1, var4 - 1, 2, var2 - (var4 - 1) / 2, var3 - (var4 - 1) / 2, 0);
            }

            hso_ak.d(5, this.t).b(var1, var2, var3, 0, 0);
            return;
         }

         if (this.u == 5) {
            var8 = hso_bk.f((short)this.t);
         } else if (this.u == 4) {
            var8 = hso_bk.e((short)this.t);
         } else if (this.u == 3) {
            var8 = hso_bk.d((short)this.t);
         } else if (this.u == 7) {
            var8 = hso_bk.g((short)this.t);
         } else if (this.u == 8) {
            var8 = hso_bk.i((short)this.O);
         } else if (this.u == 9) {
            var8 = hso_bk.k((short)this.t);
         }

         if (this.u != 6) {
            if (var8 != null && var8.a != null) {
               if (hso_aq.b(var8.a.a) / 18 == 3) {
                  if (hso_ft.ai % 10 == 0) {
                     if ((var7 = am.length) == 0) {
                        var7 = 1;
                     }

                     this.an = (byte)((this.an + 1) % var7);
                  }

                  var1.a(var8.a, 0, am[this.an] * 18, 18, 18, 0, var2, var3, 3);
               } else {
                  var1.a(var8.a, var2, var3, 3);
               }
            } else {
               var1.a(hso_cg.an, 0, hso_ft.ai % 12 << 4, 16, 16, 0, var2, var3, 3);
            }
         }

         if (this.u == 3 && this.z > 0) {
            var7 = this.z;
            if (this.R == 7) {
               var7 = this.z / 2;
            }

            r.a(var2, var3, var7, var4 - 4, var1, var5);
         }
      }

      if (this.B > 0) {
         var1.a(hso_cg.av, var2 + 4, var3 + 3, 0);
      }

      if (this.u == 3) {
         if (this.p > 0) {
            this.g();
         }

         if (this.f()) {
            this.h();
         }
      }

   }

   private void g() {
      if ((hso_ft.aj - this.D) / 1000L >= 60L && !this.f()) {
         this.D += 60000L;
         --this.p;
         if (this.l != null) {
            if (this.p > 0) {
               if (this.R == 14) {
                  this.l[0] = hso_df.fQ + hso_cf.a(this.p);
                  return;
               }

               this.l[0] = hso_df.j + hso_cf.a(this.p);
               return;
            }

            this.l[0] = "";
         }
      }

   }

   private void h() {
      if ((hso_ft.aj - this.D) / 1000L >= 60L) {
         this.D += 60000L;
         int var1 = (int)((long)this.F - this.a() / 60000L);
         if (this.l != null) {
            if (var1 > 0) {
               if (this.R == 14) {
                  this.l[0] = hso_df.fQ + hso_cf.a(var1);
                  return;
               }

               this.l[0] = hso_df.j + hso_cf.a(var1);
               return;
            }

            this.l[0] = "";
         }
      }

   }

   public final boolean b() {
      if (this.g != null) {
         return false;
      } else {
         hso_fo var1;
         if ((var1 = hso_fo.a(this.v)) != null && var1.c != null) {
            var1 = var1;
            this.g = var1.c;
            this.t = var1.b;
            this.R = var1.e;
            if (this.j == null) {
               hso_cz[] var2 = new hso_cz[var1.f.length];

               for(int var3 = 0; var3 < var1.f.length; ++var3) {
                  var2[var3] = new hso_cz(var3, var1.f[var3]);
               }

               this.j = var2;
               this.c();
            }

            return false;
         } else {
            hso_fo.a(this.v);
            hso_ft.a(hso_df.aD);
            return true;
         }
      }
   }

   public final void c() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < this.j.length; ++var2) {
         if (this.j[var2].b > 0) {
            ++var1;
         }
      }

      this.k = new String[var1];
      this.m = new int[var1];
      var1 = 0;
      if ((var2 = hso_o.f.a(this.g)) > this.s - 10) {
         this.s = var2 + 10;
      }

      for(int var3 = 0; var3 < this.j.length; ++var3) {
         hso_cz var4;
         if ((var4 = this.j[var3]).b > 0) {
            this.k[var1] = d[var3] + ": " + var4.b;
            if (f[var3] == 1) {
               String[] var10000 = this.k;
               var10000[var1] = var10000[var1] + "%";
            }

            this.m[var1] = e[var3];
            if ((var2 = hso_o.i.a(this.k[var1])) > this.s - 10) {
               this.s = var2 + 10;
            }

            ++var1;
         }
      }

      if (this.s > 200 && hso_ft.A) {
         this.s = 130;
      }

      this.i();
   }

   public final void d() {
      if (this.g == null) {
         this.g = null;
      } else {
         boolean var1 = false;
         hso_es var2 = new hso_es("EffectSkill tem");

         int var3;
         for(var3 = 0; var3 < this.j.length; ++var3) {
            hso_cz var4 = this.j[var3];
            if (f[var4.a] == 4) {
               hso_dl var9 = new hso_dl(var4.b, var3);
               this.J.a(var9);
            } else {
               byte var6 = f[var4.a];
               int var5 = 0;

               boolean var10000;
               while(true) {
                  if (var5 >= al.length) {
                     var10000 = true;
                     break;
                  }

                  if (var6 == al[var5]) {
                     var10000 = false;
                     break;
                  }

                  ++var5;
               }

               if (var10000) {
                  var2.a(var4);
               }
            }
         }

         int var7 = var2.c();
         this.k = new String[var7];
         this.m = new int[var7];
         if ((var3 = hso_o.f.a(this.g)) > this.s - 10) {
            this.s = var3 + 10;
         }

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            hso_cz var10;
            if ((var10 = (hso_cz)var2.a(var8)).b == 0) {
               this.k[var8] = d[var10.a];
            } else {
               label166: {
                  String[] var12;
                  int var10001;
                  StringBuffer var10002;
                  String var10003;
                  label134: {
                     if (this.R == 14) {
                        if (var10.c > 0) {
                           this.k[var8] = d[var10.a] + ": " + a(f[var10.a], (int)var10.b) + "-" + var10.c;
                           break label166;
                        }

                        var12 = this.k;
                        var10001 = var8;
                        var10002 = (new StringBuffer(String.valueOf(d[var10.a]))).append(": ");
                     } else {
                        var12 = this.k;
                        var10001 = var8;
                        var10002 = (new StringBuffer(String.valueOf(d[var10.a]))).append(": ");
                        if (var10.a == 70) {
                           var10003 = hso_j.a((long)var10.b);
                           break label134;
                        }
                     }

                     var10003 = a(f[var10.a], (int)var10.b);
                  }

                  var12[var10001] = var10002.append(var10003).toString();
               }
            }

            this.m[var8] = e[var10.a];
            if ((var3 = hso_o.i.a(this.k[var8])) > this.s - 10) {
               this.s = var3 + 10;
            }
         }

         var8 = 0;
         if (this.p > 0) {
            ++var8;
         }

         boolean var11 = this.f();
         if ((var7 = (int)((long)this.F - this.a() / 60000L)) <= 0) {
            var11 = false;
         }

         if (var11) {
            ++var8;
         }

         if (this.q > 0L) {
            ++var8;
         }

         if (this.u == 3 && this.M < 4 && this.M > -1) {
            ++var8;
         }

         if (this.R != 14 && this.S > 0) {
            ++var8;
         }

         if (var8 > 0) {
            this.l = new String[var8];
            this.n = new int[var8];
            var8 = 0;
            if (this.p > 0) {
               this.n[0] = 6;
               if (this.R == 14) {
                  this.l[0] = hso_df.fQ + hso_cf.a(this.p);
               } else {
                  this.l[0] = hso_df.j + hso_cf.a(this.p);
               }

               if ((var3 = hso_o.i.a(this.l[0])) > this.s - 10) {
                  this.s = var3 + 10;
               }

               ++var8;
            }

            if (var11) {
               this.n[var8] = 6;
               this.l[var8] = hso_df.j + hso_cf.a(var7);
               ++var8;
            }

            if (this.u == 3 && this.M < 4 && this.M > -1) {
               this.l[var8] = "[" + hso_df.gn[this.M] + "]";
               if (this.M == GameScreen.f.bx) {
                  this.n[var8] = 0;
               } else {
                  this.n[var8] = 6;
               }

               ++var8;
            }

            if (this.q > 0L) {
               this.l[var8] = hso_df.ba + ": " + this.q + this.e();
               this.n[var8] = 2;
               ++var8;
            }

            if (this.R != 14 && this.S > 0) {
               this.l[var8] = hso_df.bG + this.S;
               this.n[var8] = 0;
               if ((var3 = hso_o.i.a(this.l[var8])) > this.s - 10) {
                  this.s = var3 + 10;
               }
            }
         } else {
            this.l = null;
            this.n = null;
         }

         if (this.s > 200 && hso_ft.A) {
            this.s = 130;
         }

         this.i();
      }
   }

   private void i() {
      if (this.k != null && (this.k == null || this.k.length != 1) && this.k.length != 0) {
         if (this.u == 3) {
            int var1 = this.s;
            hso_es var2 = new hso_es();
            String var3 = this.k[0];
            int var4 = this.m[0];

            int var5;
            for(var5 = 1; var5 < this.k.length; ++var5) {
               String[] var6 = hso_o.i.a(this.k[var5], var1);

               for(int var7 = 0; var7 < var6.length; ++var7) {
                  hso_ci var8 = new hso_ci(var6[var7], (byte)this.m[var5]);
                  var2.a(var8);
               }
            }

            this.k = new String[var2.c() + 1];
            this.m = new int[var2.c() + 1];
            this.k[0] = var3;
            this.m[0] = var4;

            for(var5 = 0; var5 < var2.c(); ++var5) {
               hso_ci var9 = (hso_ci)var2.a(var5);
               this.k[var5 + 1] = var9.a;
               this.m[var5 + 1] = var9.b;
            }

         }
      }
   }

   public static String a(int var0, int var1) {
      if (var0 == 1) {
         if (var1 % 100 == 0) {
            return var1 / 100 + "%";
         } else {
            return var1 % 10 == 0 ? var1 / 100 + "." + var1 % 100 / 10 + "%" : var1 / 100 + "." + var1 % 100 / 10 + var1 % 10 + "%";
         }
      } else if (var0 == 2) {
         return var1 / 1000 + "," + var1 % 1000 / 100 + "s";
      } else if (var0 == 3) {
         return var1 + "$";
      } else if (var0 == 4) {
         return " ";
      } else if (var0 == 6) {
         return var1 + " " + hso_df.bO;
      } else {
         return var0 == 7 ? "" : "" + var1;
      }
   }

   public final String e() {
      String var1 = " " + hso_df.bO;
      if (this.Q == 1) {
         var1 = " " + hso_df.bP;
      }

      return var1;
   }

   public static hso_bw a(int var0, short var1, hso_es var2) {
      for(int var3 = 0; var3 < var2.c(); ++var3) {
         hso_bw var4;
         if ((var4 = (hso_bw)var2.a(var3)).O == var1 && var4.u == var0) {
            return var4;
         }
      }

      return null;
   }

   public static hso_bw a(int var0, short var1) {
      for(int var2 = 0; var2 < V.c(); ++var2) {
         hso_bw var3;
         if ((var3 = (hso_bw)V.a(var2)).O == var1 && var3.u == var0) {
            return var3;
         }
      }

      return null;
   }

   public static hso_j b(int var0) {
      hso_j var1 = null;
      return (var1 = (hso_j)hso_fo.n.a(String.valueOf(var0))) != null ? var1 : null;
   }

   public static void c(int var0) {
      hso_j var1 = new hso_j();
      hso_fo.n.a("" + var0, var1);
      Service.a().g((short)var0);
   }

   public final void a(int var1, String var2, int var3, int var4, long var5, byte var7, String var8, int var9, byte var10, byte var11, byte var12) {
      this.g = var2;
      this.t = var3;
      this.O = var1;
      this.u = 7;
      this.q = var5;
      this.Q = var7;
      this.P = var9;
      this.x = var11;
      this.y = var12;
      this.h = var8;
      this.A = var10;
      if (var8 != null) {
         this.a(var8);
      }

      this.C = 2;
   }

   public final void a(String var1, int var2, int var3, long var4, byte var6, String var7, int var8, byte var9, byte var10, byte var11) {
      this.g = var1;
      this.t = var2;
      this.u = 7;
      this.q = var4;
      this.Q = var6;
      this.P = var8;
      this.x = var10;
      this.y = var11;
      this.h = var7;
      this.A = var9;
      if (var7 != null) {
         this.a(var7);
      }

      this.C = 2;
   }

   public void a(String var1) {
      this.s = 86;
      if (hso_fl.aU > 0) {
         this.s = hso_fl.aU - 5;
      }

      this.k = hso_o.i.a(var1, this.s - 5);
      if (hso_fl.aU == 0 && ((this.k.length + 1) * hso_ft.ab > hso_ft.X / 4 * 3 || hso_o.c.a(this.g) > 70)) {
         this.s = 120;
         this.k = hso_o.i.a(var1, this.s - 5);
      }

      this.m = new int[this.k.length];

      int var2;
      for(var2 = 0; var2 < this.m.length; ++var2) {
         this.m[var2] = 0;
      }

      var2 = 0;
      if (this.q > 0L) {
         ++var2;
      }

      if (var2 > 0) {
         this.l = new String[1];
         this.n = new int[1];
         if (this.q > 0L) {
            this.l[0] = hso_df.ba + ": " + hso_j.a(this.q) + this.e();
            this.n[0] = 2;
         }
      } else {
         this.l = null;
         this.n = null;
      }

      if (this.s > 200 && hso_ft.A) {
         this.s = 120;
      }

      this.i();
   }

   public final void d(int var1) {
      this.N = var1;
   }
}
