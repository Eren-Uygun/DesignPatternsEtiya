package facade.notifications.gsm;

public class SmsNotification implements IGsmNotification{
    @Override
    public void sendNotification() {
        System.out.println("SMS gönderildi.");
    }
}
