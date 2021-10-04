package jcpascual.uoit.sofe3650u.assignment3;

public class CashRegister {
    private final ProductDB productDb;
    private final IRegisterOutput display;
    private final IRegisterOutput printer;
    private Product currentProduct;

    public CashRegister(ProductDB db) {
        productDb = db;
        display = new Display();
        printer = new TicketPrinter();
    }

    public void setCurrentProductUpc(String upc) {
        currentProduct = productDb.getProductInfo(upc);

        display.displayProduct(currentProduct);
        printer.displayProduct(currentProduct);
    }

    public Product getCurrentProductInfo() {
        return currentProduct;
    }
}
