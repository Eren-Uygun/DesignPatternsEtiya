package factoryPattern.services;

public class SmsNotification implements ISendNotification{
    @Override
    public void sendNotification() {
        System.out.println("Sms gönderildi.");
    }
}
