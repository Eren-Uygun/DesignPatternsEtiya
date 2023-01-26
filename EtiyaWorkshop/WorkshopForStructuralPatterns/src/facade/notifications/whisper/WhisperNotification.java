package facade.notifications.whisper;

public class WhisperNotification implements IChatBotNotification {
    @Override
    public void sendNotification() {
        System.out.println("Whisper Sended");
    }
}
