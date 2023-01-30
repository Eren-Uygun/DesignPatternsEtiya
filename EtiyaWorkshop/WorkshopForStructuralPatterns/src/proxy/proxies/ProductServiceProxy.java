package proxy.proxies;

import proxy.services.IProductService;

import java.util.HashMap;

public class ProductServiceProxy implements IProductService {

    public IProductService productService;
    HashMap<Integer, Integer> serviceReturn = new  HashMap<>();

    public ProductServiceProxy(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public int checkProduct(int productId) {
        if (!serviceReturn.containsKey(productId)){
            int product = productService.checkProduct(productId);
            serviceReturn.put(productId,product);
        }

        return serviceReturn.get(productId);

    }

}
