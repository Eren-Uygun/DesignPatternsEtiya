package composite;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Product mainProduct = new Product(0,"All",null);

        Product land = new Product(1,"Land", Optional.of(0));
        Product air = new Product(2,"Air",Optional.of(0));
        Product sea = new Product(3,"Sea",Optional.of(0));

        Product truck = new Product(4,"Truck", Optional.of(1));
        Product jeep = new Product(5,"jeep", Optional.of(1));

        Product cruiseShip = new Product(6,"Cruise Ship", Optional.of(3));
        Product fishingBoat = new Product(7,"Fishing Boat", Optional.of(3));

        Product helicopter = new Product(8,"Helicopter", Optional.of(2));
        Product transportPlane = new Product(9,"Transport Plane", Optional.of(2));



        land.addProduct(truck);
        land.addProduct(jeep);

        sea.addProduct(cruiseShip);
        sea.addProduct(fishingBoat);

        air.addProduct(helicopter);
        air.addProduct(transportPlane);

        mainProduct.addProduct(land);
        mainProduct.addProduct(sea);
        mainProduct.addProduct(air);


        for (Product productCatg: mainProduct.productsTree ) {
            System.out.println("Kategori : " +productCatg.productName);
            for (Product product: land.productsTree) {
                System.out.println(product.toString());
            }
            for (Product product2: sea.productsTree) {
                System.out.println(product2.toString());
            }
            for (Product product3: air.productsTree) {
                System.out.println(product3.toString());
            }
        }

        








    }
}
