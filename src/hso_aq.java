
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class hso_aq {

    public Image a;

    private static hso_aq c(String var0) {
        hso_aq var1 = new hso_aq();
        var0 = "/x" + mGraphics.zoomLevel + var0;

        try {
            DataInputStream var2 = null;
            int var3;
            byte[] var4 = new byte[var3 = (var2 = new DataInputStream("".getClass().getResourceAsStream(var0))).available()];
            var2.read(var4, 0, var3);

            for (int var8 = 0; var8 < var4.length; ++var8) {
                var4[var8] = (byte) (var4[var8] ^ 3);
            }

            var1.a = Image.createImage(var4, 0, var3);
        } catch (IOException var5) {
            (new StringBuffer("IOException :")).append(var5.getMessage()).toString();
        } catch (IllegalArgumentException var6) {
            (new StringBuffer(String.valueOf(var0))).append(" IllegalArgumentException :").append(var6.getMessage()).toString();
        } catch (NullPointerException var7) {
            (new StringBuffer(String.valueOf(var0))).append(" NullPointerException :").append(var7.getMessage()).toString();
        }

        return var1.a == null ? null : var1;
    }

    public static hso_aq a(String var0) {
        String var2 = "png";
        String var1 = "img";
        String var3 = "";
        String var4 = "";
        int var5;
        if ((var5 = var0.lastIndexOf(46)) > 0) {
            var3 = var0.substring(var5 + 1, var0.length());
            var4 = var0.substring(0, var5 + 1);
        }

        String var10000;
        if (var3.compareTo(var1) == 0) {
            StringBuffer var7;
            (var7 = new StringBuffer(var4)).append(var2);
            var10000 = var7.toString();
        } else {
            var10000 = var0;
        }

        var0 = var10000;
        var1 = "";
        int var8;
        if ((var8 = var0.lastIndexOf(46)) > 0) {
            var1 = var0.substring(var8 + 1, var0.length());
        }

        if (var1.compareTo("img") == 0) {
            return c(var0);
        } else {
            hso_aq var9 = new hso_aq();

            try {
                var9.a = Image.createImage("/x" + mGraphics.zoomLevel + var0);
            } catch (Exception var6) {
//                System.out.println("Thieu file:" + var0);
//                var6.printStackTrace();
            }

            return var9.a == null ? null : var9;
        }
    }

    public static DataInputStream b(String var0) {
        Object var1 = null;
        return new DataInputStream("".getClass().getResourceAsStream(var0));
    }

    public static hso_aq a(byte[] var0) {
        hso_aq var1;
        (var1 = new hso_aq()).a = Image.createImage(var0, 0, var0.length);
        return var1;
    }

    public static int a(Image var0) {
        return var0.getWidth() / mGraphics.zoomLevel;
    }

    public static int b(Image var0) {
        return var0.getHeight() / mGraphics.zoomLevel;
    }
}
