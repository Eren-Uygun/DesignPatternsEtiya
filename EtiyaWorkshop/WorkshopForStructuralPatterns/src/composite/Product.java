package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Product {
    int productId;
    String productName;
    Optional<Integer> parentProductId;
    List<Product> productsTree;

    public Product(int productId, String productName, Optional<Integer> parentProductId) {
        this.productId = productId;
        this.productName = productName;
        this.parentProductId = parentProductId;
        productsTree = new ArrayList<>();
    }

    public void addProduct(Product product){
        productsTree.add(product);
    }


    public void removeProduct(Product product){
        productsTree.remove(product);
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", parentProductId=" + Optional.of(parentProductId) +
                '}';
    }
}
