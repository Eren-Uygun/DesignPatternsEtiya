package BuilderPattern.builders;

import BuilderPattern.models.*;

public class ComputerBuilder implements IComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void setComputerCase(ComputerCase computerCase) {
        computer.computerCase = computerCase;

    }

    @Override
    public void setPowerSupply(PowerSupply powerSupply) {
        computer.powerSupply = powerSupply;

    }

    @Override
    public void setMotherboard(Motherboard motherboard) {
        computer.motherboard = motherboard;

    }

    @Override
    public void setCpu(Cpu cpu) {
        computer.cpu = cpu;

    }

    @Override
    public void setHdd(Hdd hdd) {
        computer.hdd = hdd;

    }

    @Override
    public void setGraphicCard(GraphicCard graphicCard) {
        computer.graphicCard = graphicCard;

    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
