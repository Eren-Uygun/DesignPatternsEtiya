package BuilderPattern.directors;

import BuilderPattern.builders.IComputerBuilder;
import BuilderPattern.models.*;

public class ComputerBuildDirector {
    public void buildCampaignComputer1(IComputerBuilder iComputerBuilder){
        iComputerBuilder.setComputerCase(ComputerCase.MSI);
        PowerSupply powerSupply = new PowerSupply();
        powerSupply.setBrandName("CoolerMaster");
        powerSupply.setWattPower(700);
        iComputerBuilder.setPowerSupply(powerSupply);
        iComputerBuilder.setMotherboard(Motherboard.ASUS);
        iComputerBuilder.setCpu(Cpu.AMD);
        Hdd hdd = new Hdd();
        hdd.setBrandName("Sandisk");
        hdd.setCapacity(1000);
        iComputerBuilder.setHdd(hdd);
        iComputerBuilder.setGraphicCard(GraphicCard.AMD);
    }
}
