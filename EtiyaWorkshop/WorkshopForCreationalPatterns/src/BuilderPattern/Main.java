package BuilderPattern;

import BuilderPattern.builders.ComputerBuilder;
import BuilderPattern.builders.IComputerBuilder;
import BuilderPattern.directors.ComputerBuildDirector;
import BuilderPattern.models.Computer;

public class Main {
    public static void main(String[] args) {
        IComputerBuilder iComputerBuilder = new ComputerBuilder();
        ComputerBuildDirector computerBuildDirector = new ComputerBuildDirector();
        computerBuildDirector.buildCampaignComputer1(iComputerBuilder);
        Computer computer = iComputerBuilder.buildComputer();
        System.out.println(computer.toString());
    }
}
