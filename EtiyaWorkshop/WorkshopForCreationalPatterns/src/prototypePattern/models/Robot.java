package prototypePattern.models;

public abstract class Robot {
    public int robotId;
    public String name;

    public int getRobotId() {
        return robotId;
    }

    public void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot() {
    }

    public Robot(Robot robot) {
        if (robot != null){
            robotId = robot.robotId;
            name = robot.name;
        }

    }

    public abstract Robot productRobot();
}
