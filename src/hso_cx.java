public final class hso_cx extends hso_dx {
   private hso_es a = new hso_es("EffectEnd VecEffEnd");
   private hso_es b = new hso_es("EffectEnd VecSubEffEnd");
   private int c;
   private int z;
   private hso_en A;
   private byte[] B;
   private int C = 0;
   private long D;
   private int E = 2000;
   private hso_dq F;
   private int G = 0;
   private int H;

   public hso_cx(int var1, int var2, int var3) {
      super.k = -1;
      super.d = var1;
      super.g = var2;
      super.h = var3;
      int var4;
      int var5;
      hso_en var6;
      hso_en var7;
      hso_en var10;
      switch(var1) {
      case 0:
         super.u = new hso_ce(53);
         super.f = 6;
         return;
      case 1:
         super.u = new hso_ce(29);
         super.f = 3;
         return;
      case 2:
         super.u = new hso_ce(18);
         super.f = 4;
         return;
      case 3:
         super.u = new hso_ce(27);
         super.f = 15;

         for(var1 = 0; var1 < 7; ++var1) {
            (var7 = new hso_en()).a = var2 + hso_ak.g(22);
            var7.b = var3 + hso_ak.g(8);
            var7.m = hso_ak.f(super.u.c);
            this.a.a(var7);
         }

         return;
      case 4:
         super.u = new hso_ce(4);
         super.f = 5;
         return;
      case 5:
         super.u = new hso_ce(51);
         super.f = 6;
         return;
      case 6:
         super.u = new hso_ce(52);
         super.f = 4;
         return;
      case 7:
         super.u = new hso_ce(54);
         super.f = 4;
         return;
      case 9:
         if (hso_ft.B) {
            this.b();
            return;
         }

         super.u = new hso_ce(56);
         super.f = hso_ak.c(11, 15);
         var1 = hso_ak.c(3, 7);

         for(var4 = 0; var4 < var1; ++var4) {
            (var10 = new hso_en()).a = var2 + hso_ak.g(5);
            var10.b = var3 + hso_ak.g(7);
            var10.p = hso_ak.f(super.u.c);
            var10.m = hso_ak.f(2);
            var10.j = -hso_ak.c(6, 9);
            var10.i = hso_ak.c(1, 4);
            if (var4 % 2 == 0) {
               var10.i = -var10.i;
            }

            this.a.a(var10);
         }

         return;
      case 10:
         super.u = new hso_ce(58);
         super.f = 4;
         return;
      case 11:
         super.u = new hso_ce(42);
         super.f = 9;
         return;
      case 12:
         super.u = new hso_ce(60);
         super.f = 4;
         return;
      case 13:
         super.u = new hso_ce(9);
         super.f = 4;
         return;
      case 14:
      case 15:
         if (hso_ft.B) {
            this.b();
            return;
         }

         boolean var9 = false;
         if (var1 == 14) {
            super.u = new hso_ce(1);
            var4 = hso_ak.c(7, 12);
         } else {
            super.u = new hso_ce(5);
            var4 = hso_ak.c(7, 12);
         }

         super.f = 12;

         for(var5 = 0; var5 < var4; ++var5) {
            (var6 = new hso_en()).a = var2 + hso_ak.g(4);
            var6.b = var3 + hso_ak.g(5);
            var6.p = hso_ak.f(super.u.c);
            var6.j = -hso_ak.c(5, 9);
            var6.i = hso_ak.c(0, 3);
            if (var5 % 2 == 0) {
               var6.i = -var6.i;
            }

            this.a.a(var6);
         }

         return;
      case 19:
         if (hso_ft.B) {
            this.b();
            return;
         }

         super.u = new hso_ce(28);
         super.l = hso_ak.f(2) == 0 ? 0 : 2;
         super.f = 2;
         return;
      case 21:
      case 33:
         byte var8;
         if (super.d == 33) {
            super.u = new hso_ce(2);
            var8 = 30;
            super.f = 30;
         } else {
            super.u = new hso_ce(66);
            var8 = 40;
            super.f = 12;
         }

         for(var1 = 0; var1 < var8; ++var1) {
            (var10 = new hso_en()).a = var2 + hso_ak.g(10);
            var10.b = var3 - hso_ak.g(8);
            var10.p = hso_ak.f(super.u.c);
            var10.j = -hso_ak.c(3, 11);
            if (super.d == 33) {
               var10.i = hso_ak.c(0, 4);
            } else {
               var10.i = hso_ak.c(0, 3);
            }

            if (var1 % 2 == 0) {
               var10.i = -var10.i;
            }

            this.a.a(var10);
         }

         return;
      case 24:
         super.u = new hso_ce(12);
         super.f = hso_ak.c(18, 23);
         super.r = -1;
         return;
      case 25:
      case 28:
      case 40:
         if (super.d == 25) {
            super.u = new hso_ce(86);
         } else if (super.d == 28) {
            super.u = new hso_ce(96);
         } else if (super.d == 40) {
            if ((var1 = hso_ft.p.a(var2, var3)) == 2 || var1 == -1) {
               return;
            }

            super.u = new hso_ce(19);
         }

         super.r = -1;
         super.f = hso_ak.c(74, 85);
         this.a(20);
         return;
      case 26:
         super.r = -1;
         if (hso_ak.f(2) == 0) {
            super.u = new hso_ce(90);
         } else {
            super.u = new hso_ce(13);
         }

         super.f = hso_ak.c(74, 85);
         this.a(20);
         return;
      case 27:
      case 30:
         super.f = 20;
         super.r = -1;
         if (super.d == 27) {
            super.u = new hso_ce(92);
         } else if (super.d == 30) {
            super.u = new hso_ce(115);
         }

         for(var1 = 0; var1 < 3; ++var1) {
            (var10 = new hso_en()).a = var2 + hso_ak.g(3);
            var10.b = var3 + hso_ak.g(3);
            if (hso_ak.f(2) == 0) {
               if (var1 % 2 == 0) {
                  var10.i = hso_ak.f(3);
               } else {
                  var10.i = -hso_ak.f(3);
               }
            } else {
               var10.i = hso_ak.g(3);
            }

            var10.j = -5;
            var10.o = hso_ak.c(6, 12);
            var10.p = var1;
            this.a.a(var10);
         }

         return;
      case 29:
         super.u = new hso_ce(105);
         super.f = hso_ak.c(11, 15);
         var1 = hso_ak.c(3, 6);

         for(var5 = 0; var5 < var1; ++var5) {
            (var7 = new hso_en()).a = var2 + hso_ak.g(5);
            var7.b = var3 + hso_ak.g(7);
            var7.p = hso_ak.f(super.u.c);
            var7.m = hso_ak.f(2);
            var7.j = -hso_ak.c(6, 9);
            var7.i = hso_ak.c(1, 4);
            if (var5 % 2 == 0) {
               var7.i = -var7.i;
            }

            this.a.a(var7);
         }

         return;
      case 32:
         super.v = new hso_ce(67);
         super.f = 23;
         return;
      case 34:
         super.u = new hso_ce(14);
         super.f = 18;
         return;
      case 35:
         super.u = new hso_ce(122);
         super.f = 6;
         return;
      case 36:
         super.u = new hso_ce(4);
         super.f = 10;
         return;
      case 38:
         super.u = new hso_ce(65);
         super.v = new hso_ce(122);
         super.w = new hso_ce(14);
         super.f = 12;
         return;
      case 39:
         super.f = 55;
         return;
      case 42:
         super.u = new hso_ce(7);
         super.v = new hso_ce(2);
         super.f = 20;
         this.z = 0;

         for(var5 = 0; var5 < 8; ++var5) {
            var4 = hso_ak.c(4, 6);
            (var6 = new hso_en()).a = var2 * 1000;
            var6.b = var3 * 1000;
            var6.i = hso_ak.b(hso_ak.d(this.z)) * var4;
            var6.j = hso_ak.a(hso_ak.d(this.z)) * var4;
            this.z += 45;
            this.a.a(var6);
         }

         return;
      case 43:
         super.u = new hso_ce(124);
         super.f = 10;
         return;
      case 44:
         super.u = new hso_ce(70);
         super.f = 4;
         return;
      case 45:
         super.u = new hso_ce(63);
         super.f = 8;
         return;
      case 46:
         super.u = new hso_ce(86);
         super.r = -1;
         super.f = 6;
         return;
      case 48:
         super.u = new hso_ce(134);
         super.f = 8;
      case 8:
      case 16:
      case 17:
      case 18:
      case 20:
      case 22:
      case 23:
      case 31:
      case 37:
      case 41:
      case 47:
      case 49:
      case 50:
      case 52:
      case 53:
      default:
         return;
      case 51:
         super.u = new hso_ce(140);
         super.f = 6;
         return;
      case 54:
         super.u = new hso_ce(144);
         super.f = 10;
      }
   }

   public hso_cx(int var1, int var2, int var3, int var4, byte var5) {
      super.k = -1;
      super.d = var1;
      super.g = var2;
      super.h = var3;
      super.m = var4;
      switch(var1) {
      case 55:
         this.B = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2};
         if ((var1 = hso_ft.p.a(var2, var3)) != 2 && var1 != -1) {
            super.u = new hso_ce(145);
            super.r = var5;
            return;
         }

         return;
      case 56:
         super.u = new hso_ce(152);
         super.r = var5;
         super.f = hso_ak.c(20, 30);
         this.a(20);
      default:
      }
   }

   public hso_cx(int var1, int var2, int var3, int var4) {
      super.k = -1;
      super.d = var1;
      super.g = var3;
      super.h = var4;
      super.u = new hso_ce(var2);
      super.f = super.u.a();
   }

   public hso_cx(int var1, int var2, int var3, long var4) {
      super.k = -1;
      super.d = var1;
      super.g = var2;
      super.h = var3;
      switch(var1) {
      case 47:
         this.D = var4 + (long)this.E;
         super.u = new hso_ce(86);
         super.r = -1;
         super.f = hso_ak.c(74, 85);
         this.a(20);
         return;
      case 49:
         this.D = var4;
         this.F = new hso_dq(51, var2, var3, 0, 0, 0, 0);
         super.r = -1;
         super.f = 6;
         return;
      case 50:
         this.D = var4;
         super.u = new hso_ce(137);
         super.r = -1;
         super.f = 12;
      case 48:
      default:
      }
   }

   public hso_cx(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.d = var1;
      super.g = var2;
      super.h = var3;
      super.i = var4;
      super.j = var5;
      switch(var1) {
      case 31:
         super.u = new hso_ce(7);
         super.v = new hso_ce(2);
         super.f = 15;
         this.c = MainObject.c(super.i, super.j, super.g, super.h);
         this.z = hso_ak.a(super.g - super.i, super.h - super.j);
         this.A = new hso_en(super.i * 1000, super.j * 1000);
         this.A.k = super.i * 1000;
         this.A.l = super.j * 1000;
         this.A.n = this.z;
         this.A.j = hso_ak.a(hso_ak.d(this.A.n % 360)) * this.c;
         this.A.i = hso_ak.b(hso_ak.d(this.A.n % 360)) * this.c;
         this.A.d = 0;
         return;
      case 37:
         super.u = new hso_ce(7);
         super.v = new hso_ce(2);
         super.f = 100;
         this.c = 40;
         this.z = 0;
         this.G = var6;
         this.H = 360 / var6;
         return;
      case 41:
         super.u = new hso_ce(7);
         super.v = new hso_ce(2);
         super.f = 18;
      default:
      }
   }

   public final void a(mGraphics var1) {
      try {
         boolean var3;
         hso_en var4;
         int var8;
         int var9;
         hso_en var11;
         switch(super.d) {
         case 0:
         case 2:
         case 5:
         case 11:
         case 35:
         case 36:
         case 51:
         case 54:
         case 57:
            if (super.u != null) {
               super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 1:
         case 4:
         case 6:
         case 7:
         case 10:
         case 12:
         case 13:
         case 44:
         case 45:
            if (super.u != null) {
               super.u.c(super.k % super.u.c, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 3:
            for(var9 = 0; var9 < this.a.c(); ++var9) {
               var11 = (hso_en)this.a.a(var9);
               if (super.u != null) {
                  super.u.c((var11.n + super.k) / 2 % super.u.c, var11.a, var11.b, 0, 3, var1);
               }
            }

            return;
         case 8:
         case 16:
         case 17:
         case 18:
         case 20:
         case 22:
         case 23:
         case 39:
         case 52:
         case 53:
         default:
            return;
         case 9:
         case 27:
         case 29:
         case 30:
            for(var9 = 0; var9 < this.a.c(); ++var9) {
               var11 = (hso_en)this.a.a(var9);
               if (super.u != null) {
                  super.u.c(var11.p, var11.a, var11.b, 0, 3, var1);
               }
            }

            return;
         case 14:
         case 15:
         case 21:
            for(var9 = 0; var9 < this.a.c(); ++var9) {
               hso_ce var10000;
               int var10001;
               label206: {
                  var11 = (hso_en)this.a.a(var9);
                  if (super.k < super.f / 3 << 1) {
                     if (super.u == null) {
                        continue;
                     }

                     var10000 = super.u;
                  } else {
                     if (super.u == null) {
                        continue;
                     }

                     var10000 = super.u;
                     if (var11.p == 0) {
                        var10001 = 3;
                        break label206;
                     }
                  }

                  var10001 = var11.p;
               }

               var10000.c(var10001, var11.a, var11.b, 0, 3, var1);
            }

            return;
         case 19:
            if (super.u != null) {
               super.u.c(super.l + super.k % super.u.c, super.g - super.u.a / 2, super.h - super.u.b / 2, 0, 0, var1);
               return;
            }
            break;
         case 24:
            var9 = 0;
            if (super.k > super.f - 5) {
               var9 = (super.k - (super.f - 4)) / 2;
            }

            if (var9 < 3 && super.u != null) {
               super.u.c(var9, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 25:
         case 28:
         case 40:
         case 46:
            if (super.k <= super.f) {
               var3 = false;
               if (super.k > super.f - 5) {
                  var8 = (super.f - 1 - super.k) / 2;
               } else {
                  var8 = 2;
               }

               if (super.u != null) {
                  super.u.c(var8, super.g, super.h, 0, 3, var1);
                  return;
               }
            }
            break;
         case 26:
            if (super.k < 2) {
               if (super.u != null) {
                  super.u.c(super.k, super.g, super.h, 0, 3, var1);
                  return;
               }
            } else if (super.k < super.f - 4) {
               if (super.u != null) {
                  super.u.c(2, super.g, super.h, 0, 3, var1);
                  return;
               }
            } else if (super.k < super.f && super.u != null) {
               super.u.c((super.f - 1 - super.k) / 2, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 31:
            for(var8 = 0; var8 < this.a.c(); ++var8) {
               var4 = (hso_en)this.a.a(var8);
               if (super.v != null) {
                  super.v.c(var4.n / 2, var4.a, var4.b, 0, 3, var1);
               }
            }

            if (this.c > 5 && super.u != null) {
               super.u.c(this.A.d, (this.A.k + this.A.i) / 1000, (this.A.l + this.A.j) / 1000, 0, 3, var1);
               return;
            }
            break;
         case 32:
            if (super.v != null) {
               super.v.c(0, super.g, super.h - (super.k - super.f / 2 << 1), 0, 3, var1);
               return;
            }
            break;
         case 33:
            for(var9 = 0; var9 < this.a.c(); ++var9) {
               var11 = (hso_en)this.a.a(var9);
               if (super.u != null) {
                  super.u.c((var11.p + var11.n / 2) % super.u.c, var11.a, var11.b, 0, 3, var1);
               }
            }

            return;
         case 34:
            if (super.u != null) {
               super.u.c(super.k / 3 % super.u.c, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 37:
         case 41:
         case 42:
            for(var8 = 0; var8 < this.a.c(); ++var8) {
               var4 = (hso_en)this.a.a(var8);
               if (super.u != null) {
                  super.u.c(var4.n / 2 % super.u.c, var4.a / 1000, var4.b / 1000, 0, 3, var1);
               }
            }

            for(var8 = 0; var8 < this.b.c(); ++var8) {
               var4 = (hso_en)this.b.a(var8);
               if (super.v != null) {
                  super.v.c(var4.n / 2, var4.a, var4.b, 0, 3, var1);
               }
            }

            return;
         case 38:
            if (super.k < 6) {
               if (super.u != null) {
                  super.u.c(super.k, super.g, super.h, 0, 3, var1);
               }

               if (super.v != null) {
                  super.v.c(2 - super.k / 2, super.g, super.h, 0, 33, var1);
                  return;
               }
            } else if (super.w != null) {
               super.w.c(super.k - 6, super.g, super.h - 20, 0, 3, var1);
               return;
            }
            break;
         case 43:
            if (super.u != null) {
               super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 47:
            if (this.D - hso_dw.a() >= 0L) {
               long var10 = (this.D - hso_dw.a()) / 1000L;
               boolean var2 = false;
               byte var7;
               if (var10 >= 2L) {
                  var7 = 2;
               } else if (var10 >= 1L) {
                  var7 = 1;
               } else {
                  var7 = 0;
               }

               if (super.u != null) {
                  super.u.c(var7, super.g, super.h, 0, 3, var1);
                  return;
               }
            }
            break;
         case 48:
         case 50:
            if (super.u != null) {
               super.u.c(super.k / 2 % super.u.c, super.g, super.h, 0, 3, var1);
               return;
            }
            break;
         case 49:
            if (this.F != null) {
               this.F.a(var1);
               return;
            }
            break;
         case 55:
            try {
               if (super.u != null) {
                  super.u.c(this.B[super.k], super.g, super.h, this.C, 3, var1);
                  return;
               }
               break;
            } catch (Exception var5) {
               hso_dw.a("err mountdust f:" + this.B.length + "  " + super.k);
               return;
            }
         case 56:
            if (super.k <= super.f) {
               var3 = false;
               if (super.k > super.f - 5) {
                  var8 = (super.f - 1 - super.k) / 2;
               } else {
                  var8 = 2;
               }

               if (super.u != null) {
                  super.u.c(var8, super.g, super.h, this.C, 3, var1);
                  return;
               }
            }
         }
      } catch (Exception var6) {
         hso_dw.a("/ " + super.d + var6.toString());
      }

   }

   public final void a() {
      ++super.k;
      ++super.q;
      int var1;
      hso_en var2;
      hso_en var3;
      hso_en var4;
      switch(super.d) {
      case 0:
      case 1:
      case 2:
      case 4:
      case 5:
      case 6:
      case 7:
      case 10:
      case 11:
      case 12:
      case 13:
      case 19:
      case 24:
      case 25:
      case 26:
      case 28:
      case 34:
      case 35:
      case 40:
      case 44:
      case 46:
      case 51:
      case 54:
      case 57:
         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 3:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            var2 = (hso_en)this.a.a(var1);
            if (hso_ak.f(3) == 0) {
               var2.a = super.g + hso_ak.g(22);
               var2.b = super.h + hso_ak.g(8);
               var2.n = hso_ak.f(super.u.c);
            }
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
      case 8:
      case 16:
      case 17:
      case 18:
      case 20:
      case 22:
      case 23:
      case 52:
      case 53:
      default:
         break;
      case 9:
      case 14:
      case 15:
      case 29:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            (var2 = (hso_en)this.a.a(var1)).a();
            ++var2.j;
            if (super.k == super.f && GameScreen.d(var2.a, var2.b)) {
               GameScreen.a(19, var2.a, var2.b);
            }
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 21:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            (var2 = (hso_en)this.a.a(var1)).a();
            if (var2.j < 0) {
               ++var2.j;
            } else {
               var2.j = 0;
               var2.i = 0;
            }
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 27:
      case 30:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            ++(var2 = (hso_en)this.a.a(var1)).n;
            if (var2.n < var2.o) {
               var2.a += var2.i;
               var2.b += var2.j;
            }

            ++var2.j;
         }

         if (super.k > super.f) {
            this.b();
            return;
         }
         break;
      case 31:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            ++(var2 = (hso_en)this.a.a(var1)).n;
            if (var2.n / 2 >= 4) {
               this.a.d(var2);
               --var1;
            }
         }

         this.A.d = super.k / 2 % 2;
         if (super.k > 4) {
            if (this.c > 5) {
               hso_en var10000 = this.A;
               var10000.n += 14;
               this.A.j = hso_ak.a(hso_ak.d(this.A.n % 360)) * this.c;
               this.A.i = hso_ak.b(hso_ak.d(this.A.n % 360)) * this.c;
               if (super.k % 2 == 0) {
                  --this.c;
                  var10000 = this.A;
                  var10000.n += 14;
               }

               (var4 = new hso_en()).a = (this.A.k + this.A.i) / 1000 + hso_ak.b(-1, 2);
               var4.b = (this.A.l + this.A.j) / 1000 + hso_ak.b(-1, 2);
               this.a.a(var4);
               return;
            }

            if (this.a.c() == 0) {
               this.b();
               return;
            }
         }
         break;
      case 32:
         if (super.k >= super.f) {
            this.b();
         }

         if (super.k < super.f / 2) {
            for(var1 = 0; var1 < this.a.c(); ++var1) {
               var2 = (hso_en)this.a.a(var1);
               if (hso_ak.f(3) == 0) {
                  if (var2.o == 1) {
                     var2.o = 0;
                  } else {
                     var2.o = 1;
                     var2.p = hso_ak.f(4);
                  }
               }
            }

            return;
         }
         break;
      case 33:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            (var2 = (hso_en)this.a.a(var1)).a();
            ++var2.j;
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 36:
         if (super.k == 1) {
            GameScreen.a(14, super.g, super.h);
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 37:
         if (super.k % 3 == 0 && this.a.c() < this.G && super.k < 50) {
            (var4 = new hso_en()).a = super.g * 1000;
            var4.b = super.h * 1000;
            var4.i = hso_ak.b(hso_ak.d(this.z)) << 2;
            var4.j = hso_ak.a(hso_ak.d(this.z)) << 2;
            var4.k = super.i * 1000;
            var4.l = super.j * 1000;
            this.z += this.H;
            this.a.a(var4);
            if (this.a.c() == this.G) {
               super.k = 50;
            }
         }

         if (super.k == 80) {
            for(var1 = 0; var1 < this.a.c(); ++var1) {
               (var2 = (hso_en)this.a.a(var1)).i = (var2.k - var2.a) / 8;
               var2.j = (var2.l - var2.b) / 8;
               var2.n = 100;
            }
         }

         for(var1 = 0; var1 < this.a.c(); ++var1) {
            (var2 = (hso_en)this.a.a(var1)).a();
            if (var2.n % 3 == 0) {
               (var3 = new hso_en()).a = var2.a / 1000 + hso_ak.b(5, 12);
               var3.b = var2.b / 1000 + hso_ak.b(5, 12);
               this.b.a(var3);
            }

            if (var2.n == 10) {
               var2.i = 0;
               var2.j = 0;
            }

            if (var2.n > 108) {
               this.a.d(var2);
               --var1;
            }
         }

         for(var1 = 0; var1 < this.b.c(); ++var1) {
            ++(var2 = (hso_en)this.b.a(var1)).n;
            if (var2.n / 2 >= 4) {
               this.b.d(var2);
               --var1;
            }
         }

         if (super.k > 80 && this.a.c() == 0) {
            hso_c.a(32, super.i, super.j - 11);
            hso_c.a(33, super.i, super.j);
            hso_c.a(34, super.i, super.j);
            this.b();
            return;
         }
         break;
      case 38:
         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 39:
         if (hso_ak.f(2) == 0) {
            GameScreen.a(83, super.g, super.h, 400, (short)-1, (byte)0);
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 41:
         if (super.k == 1) {
            (var4 = new hso_en()).a = super.g * 1000;
            var4.b = super.h * 1000;
            var4.k = super.i * 1000;
            var4.l = super.j * 1000;
            var4.i = 0;
            var4.j = 0;
            this.a.a(var4);
         }

         for(var1 = 0; var1 < this.a.c(); ++var1) {
            (var2 = (hso_en)this.a.a(var1)).a();
            if (var2.n == 4) {
               var2.i = (var2.k - var2.a) / 12;
               var2.j = (var2.l - var2.b) / 12;
            }

            if (var2.n % 3 == 0) {
               (var3 = new hso_en()).a = var2.a / 1000 + hso_ak.b(5, 12);
               var3.b = var2.b / 1000 + hso_ak.b(5, 12);
               this.b.a(var3);
            }

            if (var2.n == 16) {
               var2.i = 0;
               var2.j = 0;
               this.a.d(var2);
               --var1;
            }
         }

         for(var1 = 0; var1 < this.b.c(); ++var1) {
            ++(var2 = (hso_en)this.b.a(var1)).n;
            if (var2.n / 2 >= 4) {
               this.b.d(var2);
               --var1;
            }
         }

         if (super.k >= super.f && this.b.c() == 0 && this.a.c() == 0) {
            this.b();
            return;
         }
         break;
      case 42:
         for(var1 = 0; var1 < this.a.c(); ++var1) {
            (var2 = (hso_en)this.a.a(var1)).a();
            if (var2.n % 3 == 0) {
               (var3 = new hso_en()).a = var2.a / 1000 + hso_ak.b(5, 12);
               var3.b = var2.b / 1000 + hso_ak.b(5, 12);
               this.b.a(var3);
            }

            if (var2.n == super.f) {
               var2.i = 0;
               var2.j = 0;
               this.a.d(var2);
               --var1;
            }
         }

         for(var1 = 0; var1 < this.b.c(); ++var1) {
            ++(var2 = (hso_en)this.b.a(var1)).n;
            if (var2.n / 2 >= 4) {
               this.b.d(var2);
               --var1;
            }
         }

         if (super.k >= super.f && this.a.c() == 0 && this.b.c() == 0) {
            this.b();
            return;
         }
         break;
      case 43:
         if (super.k == 1) {
            GameScreen.a(14, super.g, super.h);
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 45:
         if (super.k == 1) {
            GameScreen.a(9, super.g, super.h + 20);
            GameScreen.a(46, super.g, super.h + 20);
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 47:
      case 50:
         if (this.D - hso_dw.a() < 0L) {
            this.b();
            return;
         }
         break;
      case 48:
         if (super.k >= super.f) {
            this.b();
            return;
         }
         break;
      case 49:
         if (this.F != null) {
            this.F.a();
         }

         if (this.D - hso_dw.a() < 0L) {
            this.b();
            GameScreen.a(15, super.g, super.h);
            return;
         }
         break;
      case 55:
         if (super.k < 0) {
            super.k = 0;
         }

         if (super.m == 2) {
            this.C = 0;
         } else if (super.m == 3) {
            this.C = 2;
         }

         if (super.m == 1) {
            this.C = 3;
         }

         if (super.m == 0) {
            this.C = 0;
         }

         if (super.k > this.B.length - 1) {
            super.k = 0;
            this.b();
         }
         break;
      case 56:
         if (super.m == 2) {
            this.C = 4;
         } else if (super.m == 3) {
            this.C = 7;
         }

         if (super.m == 1) {
            this.C = 0;
         }

         if (super.m == 0) {
            this.C = 3;
         }

         if (super.k >= super.f) {
            this.b();
            return;
         }
      }

   }

   private void b() {
      super.y = true;
      super.x = true;
   }

   private void a(int var1) {
      if (hso_ft.B) {
         super.f = hso_ak.c(16, 25);
      }

   }
}
