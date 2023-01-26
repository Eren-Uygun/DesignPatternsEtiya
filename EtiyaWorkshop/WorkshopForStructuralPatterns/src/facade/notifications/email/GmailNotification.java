package facade.notifications.email;

public class GmailNotification implements IEmailNotification{
    @Override
    public void sendNotification() {
        System.out.println("Google mail sended");
    }
}
