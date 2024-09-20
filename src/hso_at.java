import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;

public final class hso_at {
   public hso_es a = new hso_es();
   private hso_bi[] k;
   private byte[][] l;
   private byte[] m;
   private byte n;
   private byte o;
   public boolean b;
   public short c;
   public short d;
   public long e;
   int f;
   private int p;
   private int q;
   public int g;
   private byte r;
   public boolean h;
   public boolean i;
   private boolean s;
   public static hso_ek j = new hso_ek();
   private byte t;
   private long u;
   private long v;

   public hso_at(byte[] var1, short var2, int var3, int var4) {
      new hso_es();
      this.l = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
      this.f = 0;
      this.g = 112;
      this.f = var2;
      this.p = var3;
      this.q = var4;
      this.a(var1);
   }

   public hso_at(byte[] var1, short var2, int var3, int var4, long var5, byte var7) {
      new hso_es();
      this.l = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
      this.f = 0;
      this.g = 112;
      this.f = var2;
      this.p = var3;
      this.q = var4;
      this.r = var7;
      this.v = var5;
      this.h = true;
      this.a(var1);
   }

   public hso_at(short var1, int var2, int var3, byte[] var4) {
      new hso_es();
      this.l = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
      this.f = 0;
      this.g = 112;
      this.f = var1;
      this.c = (short)var2;
      this.d = (short)var3;
      this.a((byte[])null);
      this.i = true;
   }

   public hso_at(int var1) {
      new hso_es();
      this.l = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
      this.f = 0;
      this.g = 112;
      this.f = var1;
   }

   private boolean f() {
      if (this.s) {
         return true;
      } else {
         this.a((byte[])null);
         return false;
      }
   }

   public final void a(byte[] var1) {
      try {
         if (var1 == null || var1.length == 0) {
            hso_dj var2;
            if ((var2 = (hso_dj)j.a("" + this.f)) != null && var2.a != null) {
               var1 = var2.a;
               var2.b = hso_ft.aj;
            }

            if (var2 == null) {
               var2 = new hso_dj();
               j.a("" + this.f, var2);
               hso_fp.b((short)this.f, this.g);
               var2.b = (long)((int)(hso_dw.a() / 1000L));
            }
         }

         if (var1 != null && var1.length > 0) {
            DataInputStream var12;
            byte var10 = (var12 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.k = new hso_bi[var10];

            for(int var3 = 0; var3 < var10; ++var3) {
               this.k[var3] = new hso_bi(var12.readUnsignedByte(), var12.readUnsignedByte(), var12.readUnsignedByte(), var12.readUnsignedByte(), var12.readUnsignedByte());
            }

            short var14 = var12.readShort();

            for(int var11 = 0; var11 < var14; ++var11) {
               byte var4 = var12.readByte();
               hso_es var5 = new hso_es();
               hso_es var6 = new hso_es();

               for(int var7 = 0; var7 < var4; ++var7) {
                  hso_fr var8;
                  (var8 = new hso_fr(var12.readShort(), var12.readShort(), var12.readByte())).c = var12.readByte();
                  var8.d = var12.readByte();
                  if (var8.d == 0) {
                     var5.a(var8);
                  } else {
                     var6.a(var8);
                  }
               }

               this.a.a(new hso_fj(var5, var6));
            }

            short var13 = (short)var12.readUnsignedByte();
            this.m = new byte[var13];

            int var15;
            for(var15 = 0; var15 < var13; ++var15) {
               this.m[var15] = (byte)var12.readShort();
            }

            var12.readByte();
            var10 = var12.readByte();
            this.l[0] = new byte[var10];

            for(var15 = 0; var15 < var10; ++var15) {
               this.l[0][var15] = var12.readByte();
            }

            var10 = var12.readByte();
            this.l[1] = new byte[var10];

            for(var15 = 0; var15 < var10; ++var15) {
               this.l[1][var15] = var12.readByte();
            }

            var10 = var12.readByte();
            this.l[3] = new byte[var10];

            for(var15 = 0; var15 < var10; ++var15) {
               this.l[3][var15] = var12.readByte();
            }

            this.s = true;
            return;
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      if (this.f()) {
         if (this.n < this.a.c()) {
            hso_fj var4 = (hso_fj)this.a.a(this.n);

            try {
               hso_es var5 = null;
               var5 = var4.b;

               for(int var16 = 0; var16 < var5.c(); ++var16) {
                  hso_fr var6 = (hso_fr)var5.a(var16);
                  hso_bi var7 = this.k[var6.e];
                  hso_el var8;
                  if ((var8 = hso_fp.a((short)this.f, this.g)) != null && var8.a != null) {
                     short var9 = var6.a;
                     int var10 = var7.c;
                     int var11 = var7.d;
                     short var12 = var7.a;
                     short var17 = var7.b;
                     int var13 = hso_aq.a(var8.a.a);
                     int var14 = hso_aq.b(var8.a.a);
                     if (var12 > var13) {
                        var12 = 0;
                     }

                     if (var17 > var14) {
                        var17 = 0;
                     }

                     if (var12 + var10 > var13) {
                        var10 = var13 - var12;
                     }

                     if (var17 + var11 > var14) {
                        var11 = var14 - var17;
                     }

                     var1.a(var8.a, var12, var17, var10, var11, var6.c == 1 ? 2 : 0, var2 + var9 + this.p, var3 + var6.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var15) {
               var15.printStackTrace();
            }
         }

      }
   }

   public final void b(mGraphics var1, int var2, int var3) {
      if (this.f()) {
         if (this.n < this.a.c()) {
            hso_fj var4 = (hso_fj)this.a.a(this.n);

            try {
               hso_es var16 = var4.a;

               for(int var5 = 0; var5 < var16.c(); ++var5) {
                  hso_fr var6 = (hso_fr)var16.a(var5);
                  hso_bi var7 = this.k[var6.e];
                  hso_el var8;
                  if ((var8 = hso_fp.a((short)this.f, this.g)) != null && var8.a != null) {
                     short var9 = var6.a;
                     int var10 = var7.c;
                     int var11 = var7.d;
                     short var12 = var7.a;
                     short var17 = var7.b;
                     int var13 = hso_aq.a(var8.a.a);
                     int var14 = hso_aq.b(var8.a.a);
                     if (var12 > var13) {
                        var12 = 0;
                     }

                     if (var17 > var14) {
                        var17 = 0;
                     }

                     if (var12 + var10 > var13) {
                        var10 = var13 - var12;
                     }

                     if (var17 + var11 > var14) {
                        var11 = var14 - var17;
                     }

                     var1.a(var8.a, var12, var17, var10, var11, var6.c == 1 ? 2 : 0, var2 + var9 + this.p, var3 + var6.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var15) {
               var15.printStackTrace();
            }
         }

      }
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void b(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void c(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void d(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void e(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void f(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void g(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var16 = (hso_fj)this.a.a(var4);

            try {
               hso_es var17 = var16.a;

               for(var5 = 0; var5 < var17.c(); ++var5) {
                  hso_fr var6 = (hso_fr)var17.a(var5);
                  hso_bi var7 = this.k[var6.e];
                  hso_el var8;
                  if ((var8 = hso_fp.a((short)this.f, this.g)) != null && var8.a != null) {
                     short var9 = var6.a;
                     int var10 = var7.c;
                     int var11 = var7.d;
                     short var12 = var7.a;
                     short var18 = var7.b;
                     int var13 = hso_aq.a(var8.a.a);
                     int var14 = hso_aq.b(var8.a.a);
                     if (var12 > var13) {
                        var12 = 0;
                     }

                     if (var18 > var14) {
                        var18 = 0;
                     }

                     if (var12 + var10 > var13) {
                        var10 = var13 - var12;
                     }

                     if (var18 + var11 > var14) {
                        var11 = var14 - var18;
                     }

                     var13 = var6.c == 1 ? 2 : 0;
                     var1.a(var8.a, var12, var18, var10, var11, var13, var2 + var9 + this.p, var3 + var6.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var15) {
               var15.printStackTrace();
            }
         }

      }
   }

   public final void h(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.a;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void i(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void j(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void k(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void l(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void m(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void n(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void o(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var16 = (hso_fj)this.a.a(var4);

            try {
               hso_es var17 = var16.b;

               for(var5 = 0; var5 < var17.c(); ++var5) {
                  hso_fr var6 = (hso_fr)var17.a(var5);
                  hso_bi var7 = this.k[var6.e];
                  hso_el var8;
                  if ((var8 = hso_fp.a((short)this.f, this.g)) != null && var8.a != null) {
                     short var9 = var6.a;
                     int var10 = var7.c;
                     int var11 = var7.d;
                     short var12 = var7.a;
                     short var18 = var7.b;
                     int var13 = hso_aq.a(var8.a.a);
                     int var14 = hso_aq.b(var8.a.a);
                     if (var12 > var13) {
                        var12 = 0;
                     }

                     if (var18 > var14) {
                        var18 = 0;
                     }

                     if (var12 + var10 > var13) {
                        var10 = var13 - var12;
                     }

                     if (var18 + var11 > var14) {
                        var11 = var14 - var18;
                     }

                     var13 = var6.c == 1 ? 2 : 0;
                     var1.a(var8.a, var12, var18, var10, var11, var13, var2 + var9 + this.p, var3 + var6.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var15) {
               var15.printStackTrace();
            }
         }

      }
   }

   public final void p(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.f()) {
         if (var4 < this.a.c()) {
            hso_fj var17 = (hso_fj)this.a.a(var4);

            try {
               hso_es var18 = var17.b;

               for(int var6 = 0; var6 < var18.c(); ++var6) {
                  hso_fr var7 = (hso_fr)var18.a(var6);
                  hso_bi var8 = this.k[var7.e];
                  hso_el var9;
                  if ((var9 = hso_fp.a((short)this.f, this.g)) != null && var9.a != null) {
                     int var10 = var7.a;
                     int var11 = var8.c;
                     int var12 = var8.d;
                     short var13 = var8.a;
                     short var19 = var8.b;
                     int var14 = hso_aq.a(var9.a.a);
                     int var15 = hso_aq.b(var9.a.a);
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.c == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.a(var9.a, var13, var19, var11, var12, var14, var2 + var10 + this.p, var3 + var7.b + this.q, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final boolean a() {
      return this.r == 1;
   }

   public final boolean b() {
      return this.r == 2;
   }

   public final boolean c() {
      return this.r == 17;
   }

   public final void d() {
      try {
         if (!this.f()) {
            return;
         }

         if (this.h && this.v - hso_dw.a() < 0L) {
            this.b = true;
         }

         ++this.o;
         if (this.o >= this.m.length) {
            if (this.i) {
               this.b = true;
            }

            if (this.h) {
               this.o = 0;
            }

            if (!this.h && hso_dw.a() - this.u > (long)(this.t * 1000)) {
               this.o = 0;
               this.u = hso_dw.a();
               this.t = (byte)hso_ak.c(1, 8);
            }
         }

         if (this.o > 0 && this.o < this.m.length) {
            this.n = this.m[this.o];
            return;
         }
      } catch (Exception var1) {
         hso_dw.a("loi update me day");
         var1.printStackTrace();
      }

   }

   public static void e() {
      Enumeration var0 = j.a.keys();

      while(var0.hasMoreElements()) {
         String var1 = (String)var0.nextElement();
         hso_dj var2 = (hso_dj)j.a(var1);
         if ((hso_ft.aj - var2.b) / 1000L > 60L) {
            j.a((Object)var1);
         }
      }

   }
}
