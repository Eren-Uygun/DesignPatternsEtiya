package factoryPattern;

import factoryPattern.factories.SendNotificationFactory;
import factoryPattern.services.ISendNotification;

public class Main {
    public static void main(String[] args) {

        SendNotificationFactory sendNotificationFactory = new SendNotificationFactory();

        ISendNotification sendNotification = sendNotificationFactory.createSendNotification();
        sendNotification.sendNotification();

    }
}
