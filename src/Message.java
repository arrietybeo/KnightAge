
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class Message {

    public byte command;
    private ByteArrayOutputStream os = null;
    private DataOutputStream c = null;
    private ByteArrayInputStream d = null;
    private DataInputStream e = null;

    public Message(byte var1) {
        this.command = var1;
        this.os = new ByteArrayOutputStream();
        this.c = new DataOutputStream(this.os);
    }

    public Message(byte var1, byte[] var2) {
        this.command = var1;
        this.d = new ByteArrayInputStream(var2);
        this.e = new DataInputStream(this.d);
    }

    public final byte[] getData() {
        return this.os.toByteArray();
    }

    public final DataInputStream reader() {
        return this.e;
    }

    public final DataOutputStream writer() {
        return this.c;
    }
}
