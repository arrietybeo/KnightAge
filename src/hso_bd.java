public final class hso_bd extends MainObject {
   private short a;
   private short b;
   private short c;
   private short d;
   private short e;
   private int f;
   private int g;
   private int h;
   private int i = -1;
   private int j = -1;
   private int k;
   private int l;
   private hso_bm m = null;
   private hso_aq n;
   private hso_ce o;
   private byte p = 127;
   private byte[] q;
   private byte r;

   public hso_bd(byte var1, short var2, short var3, byte var4, byte var5, byte var6, String var7, String var8, short var9, short var10, byte var11, byte var12, byte[] var13, byte[] var14, byte[] var15) {
      this.a = var1;
      super.aY = var2;
      super.aZ = var3;
      this.k = var4;
      this.l = var5;
      this.f = var6;
      super.cB = var8;
      super.cC = var7;
      this.b = var11;
      this.c = var12;
      this.d = var9;
      this.e = var10;
      super.cL = false;
      super.cK = false;
      (new StringBuffer("npc_server")).append(this.a).toString();
      this.n = aq.a(var14);
      this.o = new hso_ce(this.n, aq.a(this.n.a), aq.b(this.n.a) / this.f);
      this.q = var15;
      hso_ft.p.b(this.d - 12, this.e, this.b, this.c);
      if (this.a != this.p) {
         this.m = new hso_bm(this.a, (byte)0, super.cB, super.aY, super.aZ);
         this.m.bx = 1;
         this.m.Direction = 0;
         this.m.a(var13[12], var13[13], (int)var13[14]);
         this.m.b(var13);
         hso_ex.a(new hso_fk(var1, super.aY, super.aZ));
         this.q();
         this.m.aY = super.aY + this.k;
         this.m.aZ = super.aZ + this.l;
         this.m.bf = this.m.aY;
         this.m.bg = this.m.aZ;
         super.be = aq.b(this.n.a) + this.m.be - 10;
         super.br = 100;
         super.bs = 100;
         super.by = 1;
      }

   }

   public final void a(byte var1, short var2, short var3, byte var4, byte var5, byte var6, String var7, String var8, short var9, short var10, byte var11, byte var12, byte[] var13, byte[] var14, byte[] var15) {
      this.m = null;
      this.n = null;
      this.o = null;
      this.a = var1;
      super.aY = var2;
      super.aZ = var3;
      this.k = var4;
      this.l = var5;
      this.f = var6;
      super.cB = var8;
      super.cC = var7;
      this.b = var11;
      this.c = var12;
      this.d = var9;
      this.e = var10;
      super.cL = false;
      super.cK = false;
      (new StringBuffer("npc_server")).append(this.a).toString();
      this.n = aq.a(var14);
      this.o = new hso_ce(this.n, aq.a(this.n.a), aq.b(this.n.a) / this.f);
      this.q = var15;
      hso_ft.p.b(this.d - 12, this.e, this.b, this.c);
      if (this.a != this.p) {
         this.m = new hso_bm(this.a, (byte)0, super.cB, super.aY, super.aZ);
         this.m.bx = 1;
         this.m.Direction = 0;
         this.m.a(var13[12], var13[13], (int)var13[14]);
         this.m.b(var13);
         hso_ex.a(new hso_fk(var1, super.aY, super.aZ));
         this.q();
         this.m.aY = super.aY + this.k;
         this.m.aZ = super.aZ + this.l;
         this.m.bf = this.m.aY;
         this.m.bg = this.m.aZ;
         super.be = aq.b(this.n.a) + this.m.be - 10;
      }

   }

   public final void a(mGraphics var1) {
      if (this.o != null) {
         this.o.b(this.q[this.r], super.aY, super.aZ, 0, 33, var1);
      }

      if (this.m != null) {
         this.m.a(var1);
         this.a(var1, 2);
      }

   }

   public final void a(mGraphics var1, int var2) {
      Object var3 = null;
      hso_fl.a(var2).a(var1, super.cC, this.m.aY, this.m.aZ - 70, 2, false);
   }

   public final void a() {
      ++this.r;
      if (this.r > this.q.length - 1) {
         this.r = 0;
      }

      if (super.cE != null) {
         this.a(super.cE, true);
         super.cE = null;
      }

      if (super.dk != null) {
         super.dk.d(super.aY, super.aZ - super.be - 30);
         if (super.dk.b()) {
            super.dk = null;
         }
      }

      if (this.i >= 0 && hso_ft.ai % this.j == 0 && MainObject.c((MainObject)this) && this.i == 44) {
         hso_bd var4 = this;
         int var1 = 0;

         for(int var2 = 0; var2 < GameScreen.i.c(); ++var2) {
            MainObject var3;
            if ((var3 = (MainObject)GameScreen.i.a(var2)).cu == 0 && MainObject.c(var4.aY, var4.aZ, var3.aY, var3.aZ) <= 120) {
               ++var1;
            }
         }
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      hso_fd var4;
      if ((var4 = hso_bk.a(this.a)).a != null) {
         if (this.g <= 0) {
            if (super.bd < 0) {
               super.be = aq.b(var4.a.a) / this.f;
               super.bd = aq.a(var4.a.a);
            }

            this.g = super.bd;
            this.h = super.be;
            if (this.g > 26) {
               this.g = 26;
            }

            if (this.h > 26) {
               this.h = 26;
            }
         }

         var1.a(var4.a, super.bd / 2 - this.g / 2, 0, this.g, this.h, 0, var2, var3, 3);
      }

   }

   public final void b(mGraphics var1, int var2, int var3) {
      hso_fd var4;
      if ((var4 = hso_bk.a((short)super.cT)).a != null) {
         var1.a(var4.a, var2, var3, 40);
      }

   }

   public final boolean b() {
      return this.a != this.p;
   }

   public final boolean i_() {
      return this.a != this.p;
   }

   public final void b(mGraphics var1) {
   }

   public final boolean j_() {
      return true;
   }

   public final int j() {
      return this.a;
   }

   public final void k() {
      if (this.i_()) {
         MainObject.a(GameScreen.f, this);
         if (super.co == 0) {
            Service.a().a((byte)this.a);
            return;
         }

         hso_es var1 = new hso_es("NPCserver menu");
         hso_bt var2;
         if (super.cC.length() > 0) {
            var2 = new hso_bt(super.cC, 4, this);
            var1.a(var2);
         }

         hso_bd var5 = this;

         boolean var10000;
         label77: {
            int var3;
            for(var3 = 0; var3 < hso_ew.a.c(); ++var3) {
               if (((hso_ew)hso_ew.a.a(var3)).h == var5.ct) {
                  var10000 = true;
                  break label77;
               }
            }

            for(var3 = 0; var3 < hso_ew.b.c(); ++var3) {
               if (((hso_ew)hso_ew.b.a(var3)).g == var5.ct) {
                  var10000 = true;
                  break label77;
               }
            }

            for(var3 = 0; var3 < hso_ew.c.c(); ++var3) {
               if (((hso_ew)hso_ew.c.a(var3)).g == var5.ct) {
                  var10000 = true;
                  break label77;
               }
            }

            for(var3 = 0; var3 < hso_ew.d.c(); ++var3) {
               if (((hso_ew)hso_ew.d.a(var3)).g == var5.ct) {
                  var10000 = true;
                  break label77;
               }
            }

            var10000 = false;
         }

         if (var10000) {
            var2 = new hso_bt(hso_df.at, 5, this);
            var1.a(var2);
         }

         hso_ft.o.a(var1, super.cD, super.ct, (byte)2, false, 0);
      }

   }

   private void q() {
      switch(super.ct) {
      case -36:
      case -20:
      case -3:
         this.i = 44;
         this.j = 150;
      default:
         return;
      case -21:
      case -5:
         this.i = 43;
         this.j = 150;
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         if (var2 >= 0 && var2 <= hso_ew.a.c()) {
            ((hso_ew)hso_ew.a.a(var2)).b();
         }
         break;
      case 1:
         if (var2 >= 0 && var2 <= hso_ew.b.c()) {
            ((hso_ew)hso_ew.b.a(var2)).b();
         }
         break;
      case 2:
         if (var2 >= 0 && var2 <= hso_ew.c.c()) {
            ((hso_ew)hso_ew.c.a(var2)).c();
         }
         break;
      case 3:
         if (var2 >= 0 && var2 <= hso_ew.d.c()) {
            ((hso_ew)hso_ew.d.a(var2)).c();
         }
         break;
      case 4:
          Service.a().a((byte)super.ct);
         break;
      case 5:
         hso_bd var3 = this;
         hso_es var4 = new hso_es("NPCserver menu2");

         int var5;
         hso_ew var6;
         hso_bt var7;
         for(var5 = 0; var5 < hso_ew.a.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.a.a(var5)).h == var3.ct) {
               (var7 = new hso_bt(var6.k, 0, var5, var3)).a((hso_ce)hso_cg.aF, 1, 1);
               var4.a(var7);
            }
         }

         for(var5 = 0; var5 < hso_ew.b.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.b.a(var5)).g == var3.ct) {
               (var7 = new hso_bt(var6.k, 1, var5, var3)).a((hso_ce)hso_cg.aF, 1, 3);
               var4.a(var7);
            }
         }

         for(var5 = 0; var5 < hso_ew.c.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.c.a(var5)).g == var3.ct) {
               (var7 = new hso_bt(var6.k, 2, var5, var3)).a((hso_ce)hso_cg.aF, 1, 2);
               var4.a(var7);
            }
         }

         for(var5 = 0; var5 < hso_ew.d.c(); ++var5) {
            if ((var6 = (hso_ew)hso_ew.d.a(var5)).g == var3.ct) {
               (var7 = new hso_bt(var6.k, 3, var5, var3)).a((hso_ce)hso_cg.aF, 1, 2);
               var4.a(var7);
            }
         }

         if (var4.c() == 0) {
            hso_ft.m();
            hso_ft.l();
            hso_ft.o.f();
         } else {
            hso_ft.o.f();
            hso_ft.m();
            hso_ft.l();
            hso_ft.o.a(var4, 2, hso_df.at, false, (hso_es)null);
         }
      }

      super.a(var1, var2);
   }
}
