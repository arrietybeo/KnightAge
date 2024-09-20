
import java.util.Vector;

public class hso_es {

    private Vector a = new Vector();

    public hso_es() {
    }

    public hso_es(String var1) {
    }

    public final void a(Object var1) {
        try {
            this.a.addElement(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean b(Object var1) {
        return this.a.contains(var1);
    }

    public final int c() {
        return this.a == null ? 0 : this.a.size();
    }

    public final Object a(int var1) {
        return var1 > -1 && var1 < this.a.size() ? this.a.elementAt(var1) : null;
    }

    public final void a(Object var1, int var2) {
        if (var2 > -1 && var2 < this.a.size()) {
            this.a.setElementAt(var1, var2);
        }

    }

    public final int c(Object var1) {
        return this.a.indexOf(var1);
    }

    public final void b(int var1) {
        if (var1 > -1 && var1 < this.a.size()) {
            this.a.removeElementAt(var1);
        }

    }

    public final void d(Object var1) {
        this.a.removeElement(var1);
    }

    public final void d() {
        this.a.removeAllElements();
    }

    public final void b(Object var1, int var2) {
        this.a.insertElementAt(var1, var2);
    }
}
