package flyweight.factories;

import flyweight.models.GameObject;

import java.util.HashMap;

public class GameObjectFactory {

    private static HashMap gameObjects = new HashMap();

    public static GameObject getGameObject(String objectName){

        GameObject gameObject = (GameObject) gameObjects.get(objectName);
        if (gameObject == null){
            System.out.println("Instance oluşturuldu.");
            gameObject = new GameObject(objectName);
            gameObjects.put(objectName,gameObject);
        }
        return  gameObject;


    }

}
