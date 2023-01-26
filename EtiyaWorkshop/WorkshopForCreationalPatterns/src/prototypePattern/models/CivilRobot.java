package prototypePattern.models;

public class CivilRobot  extends  Robot{

    public boolean isWorkable() {
        return workable;
    }

    public void setWorkable(boolean workable) {
        this.workable = workable;
    }

    private boolean workable;

    public CivilRobot() {
    }

    public CivilRobot(CivilRobot civilRobot) {
        super(civilRobot);
        if (civilRobot != null){
            this.workable = civilRobot.workable;
        }

    }


    @Override
    public Robot productRobot() {
        return new CivilRobot(this);
    }

    @Override
    public String toString() {
        return "CivilRobot{" +
                "workable=" + workable +
                ", robotId=" + robotId +
                ", name='" + name + '\'' +
                '}';
    }
}
