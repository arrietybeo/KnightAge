import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class hso_cw {
   public hso_aq a;
   public long b = 0L;
   public byte[] c = null;
   private byte[] d = null;

   public hso_cw() {
   }

   public hso_cw(hso_aq var1, byte[] var2) {
      this.a = var1;
      this.c = var2;
   }

   public final ByteArrayOutputStream a() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(var1);

      try {
         var2.writeShort(0);
         var2.writeInt(((Object[])null).length);
         var2.write((byte[])null);
         var2.writeShort(this.c.length);
         var2.write(this.c);
      } catch (Exception var3) {
      }

      return var1;
   }
}
