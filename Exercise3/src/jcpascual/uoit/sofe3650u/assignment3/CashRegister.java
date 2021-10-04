package jcpascual.uoit.sofe3650u.assignment3;

import java.util.ArrayList;

public class CashRegister {
    private final ProductDB productDb;
    private final ArrayList<IRegisterObserver> observers;
    private Product currentProduct;

    public CashRegister(ProductDB db) {
        productDb = db;
        observers = new ArrayList<>();
    }

    public void addObserver(IRegisterObserver observer)
    {
        observers.add(observer);
    }

    public void setCurrentProductUpc(String upc) {
        currentProduct = productDb.getProductInfo(upc);

        for (IRegisterObserver observer : observers)
        {
            observer.productUpdated(currentProduct);
        }
    }

    public Product getCurrentProductInfo() {
        return currentProduct;
    }
}
