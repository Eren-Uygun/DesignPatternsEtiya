package abstractFactoryPattern;

import abstractFactoryPattern.factories.Factory1;
import abstractFactoryPattern.factories.Factory2;
import abstractFactoryPattern.services.IProductService;
import abstractFactoryPattern.services.ProductService;

public class Main {
    public static void main(String[] args) {
        IProductService iProductService = new ProductService(new Factory2());
        iProductService.sellProcuct();

        IProductService iProductService1 = new ProductService(new Factory1());
        iProductService1.sellProcuct();

    }
}
