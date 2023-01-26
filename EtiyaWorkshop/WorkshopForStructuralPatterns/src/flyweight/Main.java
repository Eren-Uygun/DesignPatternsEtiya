package flyweight;

import flyweight.factories.GameObjectFactory;
import flyweight.models.GameObject;

public class Main {
    private static final String objectNames[] = {"Enemy","Friendly","Neutral","Agents"};
    public static void main(String[] args) {
        for (int i = 0 ; i< 200; i++){
            GameObject gameObject = GameObjectFactory.getGameObject(getGameObject());
            gameObject.createObject();
        }

    }

    private static String getGameObject(){
        return objectNames[(int) (Math.random()*objectNames.length)];
    }

}
