package jcpascual.uoit.sofe3650u.assignment3;

public class CashRegister {
    private final ProductDB productDb;
    private final Display display;
    private final TicketPrinter printer;
    private Product currentProduct;

    public CashRegister(ProductDB db) {
        productDb = db;
        display = new Display();
        printer = new TicketPrinter();
    }

    public void setCurrentProductUpc(String upc) {
        currentProduct = productDb.getProductInfo(upc);

        String text = "Added product \"" + currentProduct.GetName() + "\".";
        display.displayText(text);
        printer.displayText(text);
    }

    public Product getCurrentProductInfo() {
        return currentProduct;
    }
}
