public final class hso_fd {
   public hso_aq a;
   public short b;
   public short c;
   public int d = -1;
   public int e = 0;

   public hso_fd() {
   }

   public hso_fd(hso_aq var1) {
      this.a = var1;
      this.d = 0;
      this.b = (short)hso_aq.a(var1.a);
      this.c = (short)hso_aq.a(var1.a);
   }
}
