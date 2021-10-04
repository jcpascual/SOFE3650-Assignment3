package jcpascual.uoit.sofe3650u.assignment3;

public class Display implements IRegisterOutput {
    public void Display() {

    }

    @Override
    public void displayProduct(Product product) {
        System.out.println("Display: Added product \"" + product.GetName() + "\".");
    }
}
