package jcpascual.uoit.sofe3650u.assignment3;

public class Main {

    public static void main(String[] args) {
        // Create a ProductDB with some dummy data
        ProductDB productDB = new ProductDB();
        productDB.addProductInfo("UPC123456789", new Product("Testing Product"));

        // Create the CashRegister and its Scanner
        CashRegister register = new CashRegister(productDB);
        Scanner scanner = new Scanner(register);

        scanner.setScannedUpcCode("UPC123456789");
    }
}
