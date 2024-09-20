import java.util.Enumeration;

public final class hso_fp {
   public static int a = 0;
   public static hso_ek b;

   static {
      new hso_es();
      b = new hso_ek();
   }

   public static hso_el a(short var0, int var1) {
      hso_el var2 = (hso_el)b.a(String.valueOf(var0));
      short var3 = var0;
      if (var2 == null) {
         var2 = new hso_el();
         b.a(String.valueOf(var0), var2);
         if (var2.a == null && var0 >= 0) {
            try {
               var2.a = hso_aq.a("/imgDataEff/" + var3 + ".png");
            } catch (Exception var4) {
            }
         }

         if (var2.a == null && hso_dw.a() / 1000L > 30L) {
            Service.a().a((byte)var1, (short)var0);
         }
      } else {
         var2.b = hso_ft.aj;
      }

      return var2;
   }

   public static void b(short var0, int var1) {
      hso_el var2 = (hso_el)b.a(String.valueOf(var0));
      short var3 = var0;
      if (var2 == null) {
         var2 = new hso_el();
         b.a(String.valueOf(var0), var2);
         if (var2.a == null && var0 >= 0) {
            try {
               var2.a = hso_aq.a("/imgDataEff/" + var3 + ".png");
            } catch (Exception var4) {
            }
         }

         if (var2.a == null && hso_dw.a() / 1000L > 30L) {
            Service.a().a((byte)var1, (short)var0);
         }

         var2.b = (long)((int)(hso_dw.a() / 1000L));
      }

   }

   public static void a() {
      Enumeration var0 = b.a.keys();

      while(var0.hasMoreElements()) {
         String var1 = (String)var0.nextElement();
         hso_el var2 = (hso_el)b.a(var1);
         if ((hso_ft.aj - var2.b) / 1000L > 60L) {
            b.a((Object)var1);
         }
      }

   }
}
