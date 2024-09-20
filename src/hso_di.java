import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class hso_di implements Runnable {
   public static hso_es a = new hso_es("SaveImageRMS vecSaveImage");
   private static hso_es b = new hso_es("SaveImageRMS vecSaveCharPart");

   public final void run() {
      while(true) {
         boolean var6;
         for(var6 = false; b.c() > 0; b.b(0)) {
            var6 = true;
            hso_cw var1 = (hso_cw)b.a(0);

            try {
               hso_ak.a("img_data_char_" + 0 + "_" + 0, var1.a().toByteArray());
            } catch (Exception var5) {
            }
         }

         if (var6) {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var7);

            try {
               var2.writeShort(hso_ft.I);
               hso_ak.a("isIndexPart", var7.toByteArray());
               var2.close();
            } catch (Exception var4) {
            }
         }

         if (a.c() <= 0) {
            return;
         }

         try {
            hso_an var8;
            hso_bk.a((var8 = (hso_an)a.a(0)).b, var8.a);
            a.b(0);
         } catch (Exception var3) {
         }
      }
   }

   public final void a() {
      (new Thread(this)).start();
   }
}
