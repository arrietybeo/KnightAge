
public class hso_ee {

    private ISession a = ISession.a();
    protected Message b;

    public final void send() {
        this.a.a(this.b);
    }

    public final void init(byte var1) {
        this.b = new Message(var1);
    }
}
