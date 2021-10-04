package jcpascual.uoit.sofe3650u.assignment3;

public class Scanner {
    private final CashRegister register;
    private String scannedUpc;

    public Scanner(CashRegister register) {
        this.register = register;
    }

    public String getScannedUpcCode() {
        return scannedUpc;
    }

    public void setScannedUpcCode(String upc) {
        scannedUpc = upc;
        register.setCurrentProductUpc(scannedUpc);
    }
}
