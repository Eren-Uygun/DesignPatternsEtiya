package abstractFactoryPattern.airMilitaryEquipment;

public class Helicopter extends AirEquipment {
    @Override
    public void produce() {
        System.out.println("Helikopter üretildi.");
    }
}
