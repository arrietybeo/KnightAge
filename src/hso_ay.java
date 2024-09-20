import java.util.Enumeration;

public final class hso_ay {
   public static hso_ek a = new hso_ek();
   public long b;
   public hso_aq c;

   private hso_ay(int var1) {
      this.c = hso_aq.a("/eff/g" + var1 + ".png");
      if (this.c == null || this.c.a == null) {
         hso_aq var2 = new hso_aq();
         Service.a().a((byte)110, (short)((short)var1));
         this.c = var2;
      }

      this.b = hso_ft.aj;
   }

   public hso_ay() {
   }

   public static hso_aq a(int var0) {
      hso_ay var1;
      if ((var1 = (hso_ay)a.a("" + var0)) == null) {
         var1 = new hso_ay(var0);
         a.a("" + var0, var1);
      } else {
         var1.b = hso_ft.aj;
      }

      return var1.c;
   }

   public static void a() {
      Enumeration var0 = a.a.keys();

      while(var0.hasMoreElements()) {
         String var1 = (String)var0.nextElement();
         hso_ay var2 = (hso_ay)a.a(var1);
         if ((hso_ft.aj - var2.b) / 1000L > 60L) {
            a.a((Object)var1);
         }
      }

   }

   public static void b() {
      a.a.clear();
   }
}
