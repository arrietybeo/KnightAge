
public final class hso_do {

    public byte a;
    public byte b;
    public int c = 0;
    public static hso_ek d = new hso_ek();

    public hso_do(byte var1) {
        switch (var1) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                this.a = 50;
                this.b = (byte) (var1 / 2);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
                this.a = 50;
                this.b = (byte) (var1 / 2);
                break;
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
                this.a = 0;
                this.b = (byte) ((var1 - 14) / 2);
                break;
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
                this.a = 0;
                this.b = (byte) ((var1 - 14) / 2);
                break;
            case 28:
            case 30:
                this.a = 2;
                this.b = (byte) ((var1 - 28) / 2);
                break;
            case 29:
            case 31:
                this.a = 2;
                this.b = (byte) ((var1 - 28) / 2);
                break;
            case 32:
                this.a = 71;
                this.b = 0;
                break;
            case 33:
                this.a = 72;
                this.b = 0;
                break;
            case 34:
                this.a = 73;
                this.b = 0;
                break;
            case 35:
                this.a = 74;
                this.b = 0;
                break;
            case 36:
                this.a = 75;
                this.b = 0;
                break;
            case 37:
                this.a = 76;
                this.b = 0;
                break;
            case 38:
                this.a = 77;
                this.b = 0;
                break;
            case 39:
                this.a = 14;
                this.b = 0;
                break;
            case 40:
                this.a = 78;
                this.b = 0;
                break;
            case 41:
                this.a = 79;
                this.b = 0;
            case 42:
            case 43:
            case 52:
            case 53:
            case 57:
            case 58:
            case 60:
            default:
                break;
            case 44:
                this.a = 93;
                this.b = 0;
                break;
            case 45:
                this.a = 94;
                this.b = 0;
                break;
            case 46:
                this.a = 95;
                this.b = 0;
                break;
            case 47:
                this.a = 96;
                this.b = 0;
                break;
            case 48:
                this.a = 97;
                this.b = 0;
                break;
            case 49:
                this.a = 98;
                this.b = 0;
                break;
            case 50:
                this.a = 99;
                this.b = 0;
                break;
            case 51:
                this.a = 100;
                this.b = 0;
                break;
            case 54:
                this.a = 104;
                this.b = 0;
                break;
            case 55:
                this.a = 105;
                this.b = 0;
                break;
            case 56:
                this.a = 106;
                this.b = 0;
                break;
            case 59:
                this.a = 108;
                this.b = 0;
                break;
            case 61:
                this.a = 113;
                this.b = 0;
                break;
            case 62:
                this.a = 114;
                this.b = 0;
                break;
            case 63:
                this.a = 115;
                this.b = 0;
                break;
            case 64:
                this.a = 124;
                this.b = 0;
                break;
            case 65:
                this.a = 125;
                this.b = 0;
                break;
            case 66:
                this.a = 126;
                this.b = 0;
        }

        var1 = var1;
        hso_do var3 = this;

        try {

            var3.c = Integer.parseInt(d.a("" + var1).toString());
        } catch (Exception var2) {
            var3.c = 40;
        }
    }
}
