
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

final class hso_g implements CommandListener {

    private hso_fi a;
    private final TextBox b;

    hso_g(hso_fi var1, TextBox var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void commandAction(Command var1, Displayable var2) {
        hso_fi.k = false;
        this.a.e = false;
        if (var1.getLabel().equals("OK")) {
            this.a.b(this.b.getString());
            if (hso_d.b) {
                if (hso_d.b("public final void commandAction(Command var1, Displayable var2)").a.j().length() > 0) {
                    GameScreen.f.cE = hso_d.b("public final void commandAction(Command var1, Displayable var2)").a.j();
                    Service.a().a(hso_d.b("public final void commandAction(Command var1, Displayable var2)").a.j());
                    hso_d.b("public final void commandAction(Command var1, Displayable var2)").a.b("");
                }

                hso_d.b = false;
            } else if (hso_ft.s != null && hso_ft.s == hso_ft.g) {
                MsgChat.c.a();
            }
        }

        if (var1.getLabel().equals("Cancel") && hso_d.b) {
            hso_d.b = false;
        }

        Display.getDisplay(TemMidlet.b).setCurrent(TemMidlet.a);
        TemMidlet.a.setFullScreenMode(true);
    }
}
