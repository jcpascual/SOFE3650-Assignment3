package jcpascual.uoit.sofe3650u.assignment3;

import java.util.HashMap;

public class ProductDB {
    private final HashMap<String, Product> productMap;

    public ProductDB() {
        productMap = new HashMap<>();
    }

    public void addProductInfo(String upc, Product product) {
        productMap.put(upc, product);
    }

    public Product getProductInfo(String upc) {
        return productMap.get(upc);
    }
}
