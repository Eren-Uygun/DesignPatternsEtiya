package proxy.services;

public class ProductService implements IProductService {


    @Override
    public int checkProduct(int productId) {
        int totalProduct = 0;
        for (int i = 0; i<productId;i++){
            totalProduct+=i;
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println("Hata");
            }
        }
        System.out.println("Ürün sorgulandı ürün Id: " + totalProduct);
        return totalProduct;
    }
}
