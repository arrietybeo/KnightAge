import java.util.Hashtable;

public final class hso_ek {
   public Hashtable a = new Hashtable();

   public final Object a(String var1) {
      return this.a.get(var1);
   }

   public final void a(String var1, Object var2) {
      if (this.a.containsKey(var1)) {
         this.a.remove(var1);
      }

      this.a.put(var1, var2);
   }

   public final void a(Object var1) {
      this.a.remove(var1);
   }
}
