package jcpascual.uoit.sofe3650u.assignment3;

public class TicketPrinter implements IRegisterObserver {
    public void TicketPrinter() {

    }

    @Override
    public void productUpdated(Product product) {
        System.out.println("TicketPrinter: Added product \"" + product.GetName() + "\".");
    }
}
