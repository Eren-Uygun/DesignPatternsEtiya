package abstractFactoryPattern.factories;

import abstractFactoryPattern.airMilitaryEquipment.AirEquipment;
import abstractFactoryPattern.landMilitaryEquipment.LandEquipment;

public abstract class ProductionFactory {
    public abstract LandEquipment productLandEquipment();
    public abstract AirEquipment productAirEquipment();
}
