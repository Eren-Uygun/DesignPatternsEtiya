package factoryPattern.factories;

import factoryPattern.services.EmailNotification;
import factoryPattern.services.ISendNotification;

public class SendNotificationFactory {
    public ISendNotification createSendNotification(){
        return new EmailNotification();
    }
}
