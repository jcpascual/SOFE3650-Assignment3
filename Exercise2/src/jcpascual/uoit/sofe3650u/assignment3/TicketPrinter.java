package jcpascual.uoit.sofe3650u.assignment3;

public class TicketPrinter implements IRegisterOutput {
    public void TicketPrinter() {

    }

    @Override
    public void displayProduct(Product product) {
        System.out.println("TicketPrinter: Added product \"" + product.GetName() + "\".");
    }
}
