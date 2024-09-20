
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class socket {

    private SocketConnection a;

    public socket(String var1, int var2) {
        try {
            this.a = (SocketConnection) Connector.open("socket://" + var1 + ":" + var2);
        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }

    public final void a() {
        try {
            if (this.a != null) {
                this.a.close();
                return;
            }
        } catch (IOException var1) {
            var1.printStackTrace();
        }

    }

    public final DataOutputStream b() {
        try {
            return this.a.openDataOutputStream();
        } catch (IOException var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public final DataInputStream c() {
        try {
            return this.a.openDataInputStream();
        } catch (IOException var1) {
            var1.printStackTrace();
            return null;
        }
    }
}
