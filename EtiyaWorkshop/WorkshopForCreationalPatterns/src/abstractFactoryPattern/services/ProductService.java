package abstractFactoryPattern.services;

import abstractFactoryPattern.airMilitaryEquipment.AirEquipment;
import abstractFactoryPattern.factories.ProductionFactory;
import abstractFactoryPattern.landMilitaryEquipment.LandEquipment;

public class ProductService implements IProductService {
    private AirEquipment airEquipment;
    private LandEquipment landEquipment;

    public ProductService(ProductionFactory productionFactory) {
        this.airEquipment = productionFactory.productAirEquipment();
        this.landEquipment = productionFactory.productLandEquipment();
    }

    @Override
    public void sellProcuct() {
        airEquipment.produce();
        landEquipment.produce();
        System.out.println("Ürünler üretilip satıldı.");


    }
}
