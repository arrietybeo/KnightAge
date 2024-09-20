import java.util.Enumeration;

public final class hso_cr {
   public static hso_ek a = new hso_ek();
   public long b;
   public hso_aq c;

   private hso_cr(int var1) {
      this.c = hso_aq.a("/effauto/eff_" + var1 + ".png");
      if (this.c == null || this.c.a == null) {
         this.c = hso_dq.a(var1);
      }

      this.b = hso_ft.aj;
   }

   public static void a() {
      Enumeration var0 = a.a.keys();

      while(var0.hasMoreElements()) {
         String var1 = (String)var0.nextElement();
         hso_cr var2 = (hso_cr)a.a(var1);
         if ((hso_ft.aj - var2.b) / 1000L > 60L) {
            a.a((Object)var1);
         }
      }

   }

   public static hso_aq a(int var0) {
      hso_cr var1;
      if ((var1 = (hso_cr)a.a("" + var0)) == null) {
         var1 = new hso_cr(var0);
         a.a("" + var0, var1);
         if (var1.c == null) {
            Service.a().a((byte)111, (short)((short)var0));
         }
      } else {
         var1.b = hso_ft.aj;
      }

      return var1.c;
   }

   public static void b() {
      a.a.clear();
   }
}
