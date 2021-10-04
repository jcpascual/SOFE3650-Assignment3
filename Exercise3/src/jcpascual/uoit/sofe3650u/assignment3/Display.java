package jcpascual.uoit.sofe3650u.assignment3;

public class Display implements IRegisterObserver {
    public void Display() {

    }

    @Override
    public void productUpdated(Product product) {
        System.out.println("Display: Added product \"" + product.GetName() + "\".");
    }
}
