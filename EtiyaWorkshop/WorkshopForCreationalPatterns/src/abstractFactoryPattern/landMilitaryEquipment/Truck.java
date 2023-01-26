package abstractFactoryPattern.landMilitaryEquipment;

public class Truck extends LandEquipment {
    @Override
    public void produce() {
        System.out.println("Kamyon üretildi.");
    }
}
