final class hso_cm implements Runnable {
   private NetworkInit a;

   hso_cm(NetworkInit var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      if (this.a.a.connecting) {
         try {
            ISession.a(this.a.a).a();
         } catch (Exception var2) {
         }

         ISession.j = true;
         this.a.a.connecting = false;
         this.a.a.c = false;
      }

   }
}
