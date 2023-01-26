package abstractFactoryPattern.factories;

import abstractFactoryPattern.airMilitaryEquipment.AirEquipment;
import abstractFactoryPattern.airMilitaryEquipment.Helicopter;
import abstractFactoryPattern.landMilitaryEquipment.LandEquipment;
import abstractFactoryPattern.landMilitaryEquipment.Truck;

public class Factory1 extends ProductionFactory {
    @Override
    public LandEquipment productLandEquipment() {
        return new Truck();
    }

    @Override
    public AirEquipment productAirEquipment() {
        return new Helicopter();
    }
}
