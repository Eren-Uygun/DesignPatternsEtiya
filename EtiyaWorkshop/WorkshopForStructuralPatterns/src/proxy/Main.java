package proxy;

import proxy.proxies.ProductServiceProxy;
import proxy.services.IProductService;
import proxy.services.ProductService;

public class Main {
    public static void main(String[] args) {

        IProductService productService = new ProductServiceProxy(new ProductService());

        productService.checkProduct(1);
        productService.checkProduct(2);
        productService.checkProduct(3);
        productService.checkProduct(4);
        productService.checkProduct(5);
        productService.checkProduct(1);


    }
}
