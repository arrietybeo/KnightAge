import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class hso_fa {
   private hso_es b = new hso_es();
   private hso_es c = new hso_es();
   private hso_bi[] d;
   private byte[] e;
   private String f = "";
   public byte a = 0;
   private static byte[][] g = new byte[][]{{0, 0, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {4, 4, 5, 6, 7, 5, 5, 5, 5, 5, 5, 5, 5, 5}};

   static {
      byte[] var10000 = new byte[]{0, 0, 1, 2, 3, 1, 1, 1, 1};
   }

   public hso_fa(byte[] var1, int var2) {
      this.a(var1);
   }

   private void a(byte[] var1) {
      boolean var2 = false;
      DataInputStream var3 = null;
      ByteArrayInputStream var4 = null;
      this.b.d();
      this.c.d();

      try {
         var4 = new ByteArrayInputStream(var1);
         byte var20 = (var3 = new DataInputStream(var4)).readByte();
         this.d = new hso_bi[var20];

         for(int var22 = 0; var22 < var20; ++var22) {
            this.d[var22] = new hso_bi(var3.readUnsignedByte(), var3.readUnsignedByte(), var3.readUnsignedByte(), var3.readUnsignedByte(), var3.readUnsignedByte());
         }

         int var21 = -1000000;
         short var5 = var3.readShort();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            byte var23 = var3.readByte();
            hso_es var7 = new hso_es();

            for(int var8 = 0; var8 < var23; ++var8) {
               hso_fr var9;
               (var9 = new hso_fr(var3.readShort(), var3.readShort(), var3.readByte())).c = var3.readByte();
               var9.d = var3.readByte();
               var7.a(var9);
               if (var6 == 0 && var21 < var9.b + this.d[var9.e].d) {
                  var21 = var9.b + this.d[var9.e].d;
               }
            }

            if (var6 == 0 && var21 <= -5) {
               this.a = (byte)var21;
            }

            this.b.a(new hso_fj(var7, (hso_es)null));
         }

         short var24 = var3.readShort();
         this.e = new byte[var24];

         for(var6 = 0; var6 < var24; ++var6) {
            this.e[var6] = (byte)var3.readShort();
         }

         byte[] var26 = new byte[var3.readByte()];
         var3.read(var26);
         hso_ed var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         var26 = new byte[var3.readByte()];
         var3.read(var26);
         var25 = new hso_ed(var26);
         this.c.a(var25);
         if (var3.available() > 0) {
            var3.readByte();

            for(int var27 = 0; var27 < var5; ++var27) {
               this.b.a(var27);
               var3.readByte();
               var3.readByte();
            }
         }
      } catch (Exception var18) {
         var18.printStackTrace();
      } finally {
         try {
            var3.close();
         } catch (Exception var17) {
         }

         try {
            var4.close();
         } catch (Exception var16) {
         }

      }

   }

   public final int a(int var1, int var2, int var3) {
      hso_ed var4 = (hso_ed)this.c.a(g[var3][var2]);
      return var1 < var4.a.length ? var4.a[var1] : 0;
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5, hso_aq var6) {
      if (var6 != null) {
         hso_fj var15;
         if ((var15 = (hso_fj)this.b.a(var2)) != null) {
            var15.getClass();
         }

         try {
            if (var15 != null) {
               for(int var7 = 0; var7 < var15.a.c(); ++var7) {
                  hso_fr var8 = (hso_fr)var15.a.a(var7);
                  hso_bi var9 = this.d[var8.e];
                  int var10 = var8.a;
                  int var11 = var9.c;
                  int var12 = var9.d;
                  short var13 = var9.a;
                  short var16 = var9.b;
                  if (var13 > hso_aq.a(var6.a)) {
                     var13 = 0;
                  }

                  if (var16 > hso_aq.b(var6.a)) {
                     var16 = 0;
                  }

                  if (var13 + var11 > hso_aq.a(var6.a)) {
                     var11 = hso_aq.a(var6.a) - var13;
                  }

                  if (var16 + var12 > hso_aq.b(var6.a)) {
                     var12 = hso_aq.b(var6.a) - var16;
                  }

                  if (var5 == 2) {
                     var10 = -var10 - var11;
                  }

                  mGraphics var10000;
                  hso_aq var10001;
                  short var10002;
                  short var10003;
                  int var10004;
                  int var10005;
                  int var10006;
                  if (var8.c != 1) {
                     var10000 = var1;
                     var10001 = var6;
                     var10002 = var13;
                     var10003 = var16;
                     var10004 = var11;
                     var10005 = var12;
                     var10006 = var5;
                  } else {
                     var10000 = var1;
                     var10001 = var6;
                     var10002 = var13;
                     var10003 = var16;
                     var10004 = var11;
                     var10005 = var12;
                     var10006 = var5 == 2 ? 0 : 2;
                  }

                  var10000.a(var10001, var10002, var10003, var10004, var10005, var10006, var3 + var10, var4 + var8.b, 0);
               }

               return;
            }
         } catch (Exception var14) {
            System.out.println("loi dataeff: " + this.f);
            var14.printStackTrace();
         }

      }
   }

   public final hso_ed a(int var1, int var2) {
      return (hso_ed)this.c.a(g[var2][var1]);
   }
}
