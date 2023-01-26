package prototypePattern;

import prototypePattern.models.CivilRobot;

public class Main {
    public static void main(String[] args) {
        CivilRobot civilRobot = new CivilRobot();
        civilRobot.setRobotId(1234567);
        civilRobot.setName("Task123");
        civilRobot.setWorkable(true);

        CivilRobot civilRobot1 = (CivilRobot) civilRobot.productRobot();
        System.out.println(civilRobot1.toString());


    }
}
