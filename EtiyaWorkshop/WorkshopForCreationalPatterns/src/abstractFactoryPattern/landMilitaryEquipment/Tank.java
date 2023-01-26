package abstractFactoryPattern.landMilitaryEquipment;

public class Tank extends LandEquipment {
    @Override
    public void produce() {
        System.out.println("Tank üretildi.");
    }
}
