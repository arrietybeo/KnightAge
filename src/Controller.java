
final class Controller implements Runnable {

    private ISession a;

    Controller(ISession var1) {
        this.a = var1;
    }

    public final void run() {
        while (true) {
            hso_bo var1;
            try {
                if (this.a.b()) {
                    Controller var9 = this;
                    ++ISession.k;
                    byte cmd = this.a.dis.readByte();
                    if (this.a.getKeyComplete) {
                        cmd = ISession.readKey(this.a, cmd);
                    }
                    int size;
                    byte[] data;
                    if (this.a.getKeyComplete) {
                        if (cmd != -51 && cmd != -52 && cmd != -54 && cmd != 126) {
                            byte var12 = this.a.dis.readByte();
                            byte var5 = this.a.dis.readByte();
                            size = (ISession.readKey(this.a, var12) & 255) << 8 | ISession.readKey(this.a, var5) & 255;
                        } else {
                            if (cmd == 126) {
                                cmd = this.a.dis.readByte();
                                cmd = ISession.readKey(this.a, cmd);
                            }

                            data = new byte[]{this.a.dis.readByte(), this.a.dis.readByte(), this.a.dis.readByte(), this.a.dis.readByte()};
                            size = ISession.readKey(this.a, data[3]) & 255 | (ISession.readKey(this.a, data[2]) & 255) << 8 | (ISession.readKey(this.a, data[1]) & 255) << 16 | (ISession.readKey(this.a, data[0]) & 255) << 24;
                        }
                    } else {
                        size = this.a.dis.readUnsignedShort();
                    }

                    data = new byte[size];
                    int var15 = 0;
                    int var6 = 0;

                    while (var15 != -1 && var6 < size) {
                        if ((var15 = var9.a.dis.read(data, var6, size - var6)) > 0) {
                            var6 += var15;
                            ISession var10000 = var9.a;
                            var10000.f += var6 + 5;
                        }
                    }

                    if (var9.a.getKeyComplete) {
                        for (size = 0; size < data.length; ++size) {
                            data[size] = ISession.readKey(var9.a, data[size]);
                        }
                    }

                    Message var10 = new Message(cmd, data);

                    try {
                        System.out.println("msg: " + var10.command);
                        if (var10.command != -40) {
                            var1 = this.a.b;
                            switch (var10.command) {
                                case -108:
                                    hso_ft.t.aQ(var10);
                                case -107:
                                case -89:
                                case -88:
                                case -87:
                                case -86:
                                case -85:
                                case -84:
                                case -83:
                                case -82:
                                case -81:
                                case -80:
                                case -79:
                                case -78:
                                case -77:
                                case -76:
                                case -75:
                                case -74:
                                case -73:
                                case -72:
                                case -71:
                                case -70:
                                case -69:
                                case -68:
                                case -67:
                                case -66:
                                case -65:
                                case -64:
                                case -63:
                                case -62:
                                case -61:
                                case -60:
                                case -59:
                                case -58:
                                case -56:
                                case -55:
                                case -48:
                                case -47:
                                case -46:
                                case -45:
                                case -43:
                                case -42:
                                case -41:
                                case -40:
                                case -39:
                                case -38:
                                case -37:
                                case -36:
                                case -35:
                                case -34:
                                case -33:
                                case -29:
                                case -28:
                                case -27:
                                case -26:
                                case -25:
                                case -24:
                                case -23:
                                case -22:
                                case -21:
                                case -20:
                                case -19:
                                case -18:
                                case -17:
                                case -16:
                                case -15:
                                case -14:
                                case -13:
                                case -12:
                                case -11:
                                case -10:
                                case -9:
                                case -8:
                                case -7:
                                case -6:
                                case -5:
                                case -4:
                                case -3:
                                case -2:
                                case -1:
                                case 0:
                                case 11:
                                case 14:
                                case 18:
                                case 22:
                                case 24:
                                case 38:
                                case 43:
                                case 45:
                                case 46:
                                case 47:
                                case 58:
                                case 66:
                                case 71:
                                case 72:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 87:
                                case 88:
                                case 89:
                                default:
                                    continue;
                                case -106:
                                    readMessenge.aP(var10);
                                    continue;
                                case -105:
                                    readMessenge.aO(var10);
                                    continue;
                                case -104:
                                    readMessenge.aN(var10);
                                    continue;
                                case -103:
                                    readMessenge.aM(var10);
                                    continue;
                                case -102:
                                    readMessenge.aL(var10);
                                    continue;
                                case -101:
                                    readMessenge.aK(var10);
                                    continue;
                                case -100:
                                    readMessenge.a(var10);
                                    continue;
                                case -99:
                                    readMessenge.I(var10);
                                    continue;
                                case -98:
                                    readMessenge.aJ(var10);
                                    continue;
                                case -97:
                                    readMessenge.aA(var10);
                                    continue;
                                case -96:
                                    readMessenge.aI(var10);
                                    continue;
                                case -95:
                                    readMessenge.aG(var10);
                                    continue;
                                case -94:
                                    readMessenge.aF(var10);
                                    continue;
                                case -93:
                                    hso_dw.a("--Nap winphone ");
                                    continue;
                                case -92:
                                    readMessenge.aH(var10);
                                    continue;
                                case -91:
                                    readMessenge.aD(var10);
                                    continue;
                                case -90:
                                case 90:
                                    readMessenge.V(var10);
                                    continue;
                                case -57:
                                    readMessenge.ay(var10);
                                    continue;
                                case -54:
                                    readMessenge.az(var10);
                                    continue;
                                case -53:
                                    hso_ft.t.ag(var10);
                                    continue;
                                case -52:
                                    readMessenge.ae(var10);
                                    continue;
                                case -51:
                                    readMessenge.n(var10);
                                    continue;
                                case -50:
                                    readMessenge.t(var10);
                                    continue;
                                case -49:
                                    readMessenge.af(var10);
                                    continue;
                                case -44:
                                    readMessenge.d(var10);
                                    continue;
                                case -32:
                                    hso_ft.t.ak(var10);
                                    continue;
                                case -31:
                                    hso_ft.t.ar(var10);
                                    continue;
                                case -30:
                                    readMessenge.v(var10);
                                    continue;
                                case 1:
                                    readMessenge.z(var10);
                                    continue;
                                case 2:
                                    readMessenge.J(var10);
                                    continue;
                                case 3:
                                    readMessenge.b(var10);
                                    continue;
                                case 4:
                                    readMessenge.c(var10);
                                    continue;
                                case 5:
                                    readMessenge.e(var10);
                                    continue;
                                case 6:
                                    hso_ft.t.O(var10);
                                    continue;
                                case 7:
                                    readMessenge.f(var10);
                                    continue;
                                case 8:
                                    readMessenge.g(var10);
                                    continue;
                                case 9:
                                    hso_ft.t.i(var10);
                                    continue;
                                case 10:
                                    readMessenge.m(var10);
                                    continue;
                                case 12:
                                    readMessenge.h(var10);
                                    continue;
                                case 13:
                                    readMessenge.s(var10);
                                    continue;
                                case 15:
                                    readMessenge.j(var10);
                                    continue;
                                case 16:
                                    hso_ft.t.o(var10);
                                    continue;
                                case 17:
                                    readMessenge.k(var10);
                                    continue;
                                case 19:
                                    readMessenge.A(var10);
                                    continue;
                                case 20:
                                    readMessenge.B(var10);
                                    continue;
                                case 21:
                                    readMessenge.w(var10);
                                    continue;
                                case 23:
                                    readMessenge.p(var10);
                                    continue;
                                case 25:
                                    readMessenge.q(var10);
                                    continue;
                                case 26:
                                    readMessenge.r(var10);
                                    continue;
                                case 27:
                                    readMessenge.F(var10);
                                    continue;
                                case 28:
                                    readMessenge.C(var10);
                                    continue;
                                case 29:
                                    readMessenge.D(var10);
                                    continue;
                                case 30:
                                    readMessenge.x(var10);
                                    continue;
                                case 31:
                                    readMessenge.aE(var10);
                                    continue;
                                case 32:
                                    readMessenge.E(var10);
                                    continue;
                                case 33:
                                    readMessenge.y(var10);
                                    continue;
                                case 34:
                                    readMessenge.G(var10);
                                    continue;
                                case 35:
                                    readMessenge.H(var10);
                                    continue;
                                case 36:
                                    hso_ft.t.M(var10);
                                    continue;
                                case 37:
                                    readMessenge.ab(var10);
                                    continue;
                                case 39:
                                    readMessenge.K(var10);
                                    continue;
                                case 40:
                                    readMessenge.N(var10);
                                    continue;
                                case 41:
                                    readMessenge.P(var10);
                                    continue;
                                case 42:
                                    readMessenge.Q(var10);
                                    continue;
                                case 44:
                                    hso_ft.t.aj(var10);
                                    continue;
                                case 48:
                                    hso_ft.t.L(var10);
                                    continue;
                                case 49:
                                    readMessenge.R(var10);
                                    continue;
                                case 50:
                                    readMessenge.S(var10);
                                    continue;
                                case 51:
                                    readMessenge.T(var10);
                                    continue;
                                case 52:
                                    readMessenge.u(var10);
                                    continue;
                                case 53:
                                    readMessenge.as(var10);
                                    continue;
                                case 54:
                                    readMessenge.U(var10);
                                    continue;
                                case 55:
                                    readMessenge.W(var10);
                                    continue;
                                case 56:
                                    readMessenge.Y(var10);
                                    continue;
                                case 57:
                                    readMessenge.X(var10);
                                    continue;
                                case 59:
                                    readMessenge.Z(var10);
                                    continue;
                                case 60:
                                    readMessenge.aa(var10);
                                    continue;
                                case 61:
                                    readMessenge.ac(var10);
                                    continue;
                                case 62:
                                    readMessenge.ad(var10);
                                    continue;
                                case 63:
                                    readMessenge.ah(var10);
                                    continue;
                                case 64:
                                    hso_ft.t.ao(var10);
                                    continue;
                                case 65:
                                    hso_ft.t.ai(var10);
                                    continue;
                                case 67:
                                    readMessenge.al(var10);
                                    continue;
                                case 68:
                                    readMessenge.an(var10);
                                    continue;
                                case 69:
                                    readMessenge.ap(var10);
                                    continue;
                                case 70:
                                    readMessenge.aq(var10);
                                    continue;
                                case 73:
                                    hso_ft.t.am(var10);
                                    continue;
                                case 74:
                                    readMessenge.av(var10);
                                    continue;
                                case 75:
                                    readMessenge.at(var10);
                                    continue;
                                case 76:
                                    readMessenge.au(var10);
                                    continue;
                                case 77:
                                    readMessenge.aw(var10);
                                    continue;
                                case 78:
                                    readMessenge.ax(var10);
                                    continue;
                                case 84:
                                    readMessenge.l(var10);
                                    continue;
                                case 85:
                                    readMessenge.aC(var10);
                                    continue;
                                case 86:
                                    readMessenge.aB(var10);
                                    continue;
                            }
                        }

                        Message var11 = var10;
                        var9 = this;
                        byte var13 = var10.reader().readByte();
                        this.a.key = new byte[var13];

                        int var14;
                        for (var14 = 0; var14 < var13; ++var14) {
                            var9.a.key[var14] = var11.reader().readByte();
                        }

                        for (var14 = 0; var14 < var9.a.key.length - 1; ++var14) {
                            byte[] var16 = var9.a.key;
                            var16[var14 + 1] ^= var9.a.key[var14];
                        }

                        var9.a.getKeyComplete = true;
                    } catch (Exception var7) {
                        var7.printStackTrace();
                    }
                    continue;
                }
            } catch (Exception var8) {
//                var8.printStackTrace();
            }

            if (this.a.c) {
                if (this.a.b != null && hso_dw.a() - this.a.i > 500L) {
                    var1 = this.a.b;
                    hso_bv.a();
                }

                if (ISession.a(this.a) != null) {
                    ISession.c(this.a);
                }
            }

            return;
        }
    }
}
