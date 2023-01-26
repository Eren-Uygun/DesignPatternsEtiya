package abstractFactoryPattern.airMilitaryEquipment;

public class Plane extends AirEquipment {
    @Override
    public void produce() {
        System.out.println("Uçak üretildi.");
    }
}
