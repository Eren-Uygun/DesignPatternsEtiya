package factoryPattern.services;

public class EmailNotification implements ISendNotification{
    @Override
    public void sendNotification() {
        System.out.println("Email gönderildi.");
    }
}
