package flyweight.models;

public class GameObject implements IObjectCreator {

    private String objectName;

    public GameObject(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }


    @Override
    public void createObject() {
        System.out.println("GameObject{" +
                "objectName='" + objectName + '\'' +
                '}');
    }
}
