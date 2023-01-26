package facade.notifications.email;

public class OutlookNotification implements IEmailNotification{
    @Override
    public void sendNotification() {
        System.out.println("Microsoft email sended");
    }
}
