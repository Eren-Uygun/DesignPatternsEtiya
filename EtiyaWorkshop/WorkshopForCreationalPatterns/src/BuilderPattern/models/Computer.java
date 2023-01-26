package BuilderPattern.models;

public class Computer {

    public ComputerCase computerCase;
    public PowerSupply powerSupply;
    public Motherboard motherboard;
    public Cpu cpu;
    public Hdd hdd;
    public GraphicCard graphicCard;


    @Override
    public String toString() {
        return "Computer{" +
                "computerCase=" + computerCase +
                ", powerSupply=" + powerSupply.getBrandName() +" "+powerSupply.getWattPower()+"W"+
                ", motherboard=" + motherboard +
                ", cpu=" + cpu +
                ", hdd=" + hdd.getBrandName() +" "+hdd.getCapacity()+"GB"+
                ", graphicCard=" + graphicCard +
                '}';
    }
}
