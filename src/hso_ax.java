
import java.util.Vector;

final class hso_ax implements Runnable {

    public final Vector a;
    private ISession b;

    public hso_ax(ISession var1) {
        this.b = var1;
        this.a = new Vector();
    }

    public final void run() {
        try {
            while (this.b.c) {
                if (this.b.getKeyComplete) {
                    while (this.a.size() > 0) {
                        Message var1 = (Message) this.a.elementAt(0);
                        this.a.removeElementAt(0);
                        ISession.a(this.b, var1);
                    }
                }

                try {
                    Thread.sleep(10L);
                } catch (InterruptedException var2) {
                    var2.printStackTrace();
                }
            }

        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }
}
