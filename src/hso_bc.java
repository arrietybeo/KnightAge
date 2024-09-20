import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

public final class hso_bc {
   public static hso_ek a = new hso_ek();
   public hso_ek b = new hso_ek();
   public hso_fy[] c;
   short[] d;

   public hso_bc(int var1, byte[] var2) {
      this.a(var1, var2);
   }

   private void a(int var1, byte[] var2) {
      try {
         Object var3 = null;
         if (var2 != null) {
            var3 = new ByteArrayInputStream(var2);
         } else {
            var3 = hso_aq.b("/eff_" + var1);
         }

         DataInputStream var8;
         if (var1 < 34) {
            var8 = new DataInputStream((InputStream)var3);
         } else {
            var8 = new DataInputStream((InputStream)var3);
         }

         int var9 = var8.readUnsignedByte();

         for(int var4 = 0; var4 < var9; ++var4) {
            hso_fg var5 = new hso_fg(var8.readUnsignedByte(), var8.readUnsignedByte(), var8.readUnsignedByte(), var8.readUnsignedByte(), var8.readUnsignedByte());
            this.b.a("" + var5.e, var5);
         }

         short var10 = var8.readShort();
         this.c = new hso_fy[var10];

         for(int var12 = 0; var12 < var10; ++var12) {
            byte var11 = var8.readByte();
            this.c[var12] = new hso_fy();
            this.c[var12].a = new hso_eb[var11];

            for(int var6 = 0; var6 < var11; ++var6) {
               this.c[var12].a[var6] = new hso_eb();
               this.c[var12].a[var6].a = var8.readShort();
               this.c[var12].a[var6].b = var8.readShort();
               this.c[var12].a[var6].c = var8.readByte();
            }
         }

         short var13 = var8.readShort();
         this.d = new short[var13];

         for(var9 = 0; var9 < var13; ++var9) {
            this.d[var9] = var8.readShort();
         }

         var8.readByte();
         var8.readByte();
      } catch (Exception var7) {
         var7.printStackTrace();
         hso_dw.a("err effauto 2 id=" + var1);
      }
   }
}
