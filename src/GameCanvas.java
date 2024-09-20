// Decompiled with: CFR 0.152
// Class Version: 1

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class GameCanvas extends Canvas implements Runnable {

    private static hso_ft c;
    private static hso_bl d;
    public static int a;
    public static int b;

    private long lastTime = System.currentTimeMillis();
    private int frames = 0;
    public static int fps;

    public static long speed = 15L;

    static {
        d = new hso_bl();
    }

    public GameCanvas() {
        try {
            this.setFullScreenMode(true);
            b = this.getHeight();
            a = this.getWidth();
            mGraphics.zoomLevel = 1;
            a = (a + mGraphics.zoomLevel - 1) / mGraphics.zoomLevel;
            b = (b + mGraphics.zoomLevel - 1) / mGraphics.zoomLevel;
            hso_ft.A = this.hasPointerEvents();
            c = new hso_ft();

            new Thread(hso_dt.a).start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public final void a() {
        new Thread(this).start();
    }

    protected final void paint(Graphics graphics) {
        try {
            d.a = graphics;
            c.a(d);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public final void run() {
//        try {
//            while (true) {
//                long l = hso_dw.a();
//                c.b();
//                this.repaint();
//                this.serviceRepaints();
//                long l2 = hso_dw.a() - l;
//                try {
//                    if (l2 < 40L) {
//                        Thread.sleep(40L - l2);
//                        continue;
//                    }
//                    String cfr_ignored_0 = String.valueOf(l2) + "  >>>>>>>>";
//                    Thread.sleep(1L);
//                    hso_ft.aj = hso_dw.a();
//                } catch (InterruptedException interruptedException) {
//                    interruptedException.printStackTrace();
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    public final void run() {
        try {
            while (true) {
                long startTime = hso_dw.a();
                frames++;

                long currentTime = System.currentTimeMillis();
                if (currentTime - lastTime >= 1000) {
                    fps = frames;
                    frames = 0;
                    lastTime = currentTime;
//                    System.out.println("FPS: " + fps);
                }

                c.b();
                this.repaint();
                this.serviceRepaints();
                long frameTime = hso_dw.a() - startTime;

                try {
                    if (frameTime < speed) {
                        Thread.sleep(speed - frameTime);
                    } else {
                        String cfr_ignored_0 = String.valueOf(frameTime) + "  >>>>>>>>";
                        Thread.sleep(1L);
                        hso_ft.aj = hso_dw.a();
                        System.out.println(cfr_ignored_0);
                    }
                } catch (Exception interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getFps() {
        return this.fps;
    }

    protected final void keyPressed(int n) {// ấn phim
//        System.out.println("key: " + n);
        c.a(n);
    }

    protected final void keyReleased(int n) {// thả phím
        c.b(n);
    }

    protected final void pointerDragged(int n, int n2) {// kéo thả màn hình cảm ứng
        hso_ft.a(n, n2);
    }

    protected final void pointerPressed(int n, int n2) {// ấn ngón tay màn hình cảm ứng
        hso_ft.b(n, n2);
    }

    protected final void pointerReleased(int n, int n2) {// thả ngón tay
        hso_ft.c(n, n2);
    }
}
