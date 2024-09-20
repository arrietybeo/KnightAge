public final class hso_ew extends hso_cg {
   public static hso_es a = new hso_es("MainQuest vecQuestList");
   public static hso_es b = new hso_es("MainQuest vecQuestFinish");
   public static hso_es c = new hso_es("MainQuest vecQuestDoing_Main");
   public static hso_es d = new hso_es("MainQuest vecQuestDoing_Sub");
   public byte e;
   public int f;
   public int g;
   public int h;
   public int i;
   private int r;
   public boolean j;
   public String k;
   public String l;
   private String[] s;
   public String[] m;
   private String t;
   public String n;
   public short[] o;
   public short[] p;
   public short[] q;
   private int u = 0;

   public hso_ew(int var1, boolean var2, String var3, int var4, String var5, byte var6, String var7) {
      this.f = var1;
      this.j = var2;
      this.h = var4;
      this.i = var4;
      this.k = var3;
      this.t = var7;
      this.e = var6;
      this.r = 0;
      this.s = hso_o.a(var5, ">");
   }

   public hso_ew(int var1, boolean var2, String var3, int var4, String var5, String var6) {
      this.f = var1;
      this.j = var2;
      this.g = var4;
      this.i = var4;
      this.k = var3;
      this.t = var6;
      this.m = hso_o.j.a(var6, hso_fl.S - 35);
      this.r = 1;
      this.s = hso_o.a(var5, ">");
   }

   public hso_ew(int var1, boolean var2, String var3, String var4, byte var5, String var6, int var7, short[] var8, short[] var9, short[] var10) {
      this.f = var1;
      this.j = var2;
      this.g = var7;
      this.i = var7;
      this.k = var3;
      this.e = var5;
      this.l = var6;
      this.t = var4;
      this.o = var8;
      this.p = var9;
      this.q = var10;
   }

   public hso_ew(int var1, boolean var2, String var3, String var4, int var5, String var6) {
      this.f = var1;
      this.j = var2;
      this.k = var3;
      this.l = var6;
      this.t = var4;
      this.g = var5;
      this.i = var5;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         if (hso_ft.o.b != null && !hso_ft.o.b.a()) {
            return;
         }

         this.g();
         return;
      case 1:
         if (hso_ft.o.b != null && !hso_ft.o.b.a()) {
            return;
         } else {
            MainObject var3;
            if ((var3 = MainObject.a(this.i, (byte)2)) != null) {
               var3.dk = null;
            }

            String var4;
            if ((var4 = this.t) == null) {
               var4 = "sai roi";
            }

            GameScreen.f.dk = null;
            if (this.e == 3) {
               Service.a().a((short)((short)this.f), (byte)((byte)(this.j ? 0 : 1)), (byte)1);
            } else {
               hso_ft.a(var4, this.k, this.f, this.r, (byte)(this.j ? 0 : 1));
            }

            GameScreen.f.M = null;
            GameScreen.b().aa = null;
            hso_ft.m();
            hso_ft.S = false;
         }
      default:
      }
   }

   public final void b() {
      this.u = 0;
      GameScreen.f.M = this;
      this.g();
   }

   public final void c() {
      if (this.l != null && MainObject.a(this.i, (byte)2) != null) {
         MainObject.a(this.i, (byte)2).cE = this.t;
      }
   }

   private hso_bt f() {
      hso_bt var1 = null;
      if (this.u < this.s.length - 1) {
         var1 = new hso_bt(hso_df.aa, 0, this);
      } else {
         var1 = new hso_bt(hso_df.aa, 1, this);
      }

      return var1;
   }

   private void g() {
      if (MainObject.a(this.i, (byte)2) == null) {
         GameScreen.f.M = null;
      } else {
         hso_es var1;
         hso_bt var2;
         if (this.s[this.u].trim().startsWith("0")) {
            MainObject.a(this.i, (byte)2).dk = null;
            var1 = new hso_es("MainQuest menu");
            var2 = this.f();
            var1.a(var2);
            hso_ft.o.a(var1, this.s[this.u].substring(1, this.s[this.u].length()), GameScreen.f.ct, (byte)0, true, 0);
         } else {
            GameScreen.f.dk = null;
            var1 = new hso_es("MainQuest menu2");
            var2 = this.f();
            var1.a(var2);
            hso_ft.o.a(var1, this.s[this.u].substring(1, this.s[this.u].length()), this.i, (byte)2, true, 0);
         }

         ++this.u;
      }
   }

   public static void a(int var0) {
      hso_au var5;
      if ((var5 = (hso_au)MainObject.a(var0, (byte)1)) != null) {
         String var1 = "";

         int var2;
         hso_ew var3;
         int var4;
         for(var2 = 0; var2 < c.c(); ++var2) {
            if ((var3 = (hso_ew)c.a(var2)).e == 1) {
               for(var4 = 0; var4 < var3.o.length; ++var4) {
                  if (var3.o[var4] == var5.B && var3.q[var4] < var3.p[var4]) {
                     ++var3.q[var4];
                     if (var1.length() > 0) {
                        var1 = var1 + " , ";
                     }

                     var1 = var1 + var3.q[var4] + "/" + var3.p[var4];
                  }
               }
            }
         }

         for(var2 = 0; var2 < d.c(); ++var2) {
            if ((var3 = (hso_ew)d.a(var2)).e == 1) {
               for(var4 = 0; var4 < var3.o.length; ++var4) {
                  if (var3.o[var4] == var5.B && var3.q[var4] < var3.p[var4]) {
                     ++var3.q[var4];
                     if (var1.length() > 0) {
                        var1 = var1 + " , ";
                     }

                     var1 = var1 + var3.q[var4] + "/" + var3.p[var4];
                  }
               }
            }
         }

         if (var1.length() > 0) {
            hso_ft.c(hso_df.dD + var5.cB + ": " + var1);
         }

      }
   }

   public static void a(int var0, String var1) {
      String var2 = "";

      int var3;
      hso_ew var4;
      int var5;
      for(var3 = 0; var3 < c.c(); ++var3) {
         if ((var4 = (hso_ew)c.a(var3)).e == 0) {
            for(var5 = 0; var5 < var4.o.length; ++var5) {
               if (var4.o[var5] == var0 && var4.q[var5] < var4.p[var5]) {
                  ++var4.q[var5];
                  if (var2.length() > 0) {
                     var2 = var2 + " , ";
                  }

                  var2 = var2 + var4.q[var5] + "/" + var4.p[var5];
               }
            }
         }
      }

      for(var3 = 0; var3 < d.c(); ++var3) {
         if ((var4 = (hso_ew)d.a(var3)).e == 0) {
            for(var5 = 0; var5 < var4.o.length; ++var5) {
               System.out.println(var4.o[var5] + "  " + var0);
               if (var4.o[var5] == var0 && var4.q[var5] < var4.p[var5]) {
                  ++var4.q[var5];
                  if (var2.length() > 0) {
                     var2 = var2 + " , ";
                  }

                  var2 = var2 + var4.q[var5] + "/" + var4.p[var5];
               }
            }
         }
      }

      if (var2.length() > 0) {
         hso_ft.c(hso_df.dE + var1 + ": " + var2);
      }

   }
}
