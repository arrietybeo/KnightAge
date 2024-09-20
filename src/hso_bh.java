
public final class hso_bh implements Runnable {

    private int a = -1;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;

    public final void a(int var1, int var2, int var3) {
        if (this.c == -1 && this.d == -1) {
            this.c = var1;
            this.d = var2;
            this.e = var3;
        }

    }

    public final void run() {
        try {
            while (true) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException var2) {
                    var2.printStackTrace();
                    hso_dw.a("loi Cres 6");
                }

                if (this.a != -1 && this.b != -1) {
                    hso_ak.b(0, this.a, this.b);
                    this.a = -1;
                    this.b = -1;
                }

                if (this.c != -1 && this.d != -1) {
                    hso_ak.a(this.c, this.d, this.e);
                    this.c = -1;
                    this.d = -1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
