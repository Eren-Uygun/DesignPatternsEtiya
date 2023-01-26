package BuilderPattern.builders;

import BuilderPattern.models.*;

public interface IComputerBuilder {
    void setComputerCase(ComputerCase computerCase);
    void setPowerSupply(PowerSupply powerSupply);
    void setMotherboard(Motherboard motherboard);
    void setCpu(Cpu cpu);
    void setHdd(Hdd hdd);
    void setGraphicCard(GraphicCard graphicCard);

    Computer buildComputer();
}
