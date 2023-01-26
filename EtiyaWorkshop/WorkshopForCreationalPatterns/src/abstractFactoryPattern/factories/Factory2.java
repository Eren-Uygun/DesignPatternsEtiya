package abstractFactoryPattern.factories;

import abstractFactoryPattern.airMilitaryEquipment.AirEquipment;
import abstractFactoryPattern.airMilitaryEquipment.Helicopter;
import abstractFactoryPattern.landMilitaryEquipment.LandEquipment;
import abstractFactoryPattern.landMilitaryEquipment.Tank;

public class Factory2 extends ProductionFactory{
    @Override
    public LandEquipment productLandEquipment() {
        return new Tank();
    }

    @Override
    public AirEquipment productAirEquipment() {
        return new Helicopter();
    }
}
