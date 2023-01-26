package facade.notifications.gsm;

public class MmsNotification implements IGsmNotification{
    @Override
    public void sendNotification() {
        System.out.println("Mms gönderildi.");
    }
}
