
final class NetworkInit implements Runnable {

    private final String host;
    private final int port;
    final ISession a;

    NetworkInit(ISession var1, String var2, int var3) {
        this.a = var1;
        this.host = var2;
        this.port = var3;
    }

    public final void run() {
        ISession.j = false;
        (new Thread(new hso_cm(this))).start();
        this.a.connecting = true;
        Thread.currentThread().setPriority(1);
        this.a.c = true;

        try {
            int var3 = this.port;
            String var2 = this.host;
            ISession.a(this.a, new socket(var2, var3));
            ISession.a(this.a, ISession.a(this.a).b());
            this.a.dis = ISession.a(this.a).c();
            (new Thread(ISession.b(this.a))).start();//sender
            this.a.e = new Thread(new Controller(this.a));
            this.a.e.start();
            this.a.i = hso_dw.a();
            ISession.a(this.a, new Message((byte) -40));
            this.a.connecting = false;
        } catch (Exception var5) {
            var5.printStackTrace();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException var4) {
                var4.printStackTrace();
            }

            if (!ISession.j) {
                if (this.a.b != null) {
                    this.a.c();
                }
            }
        }
    }
}
