package facade.facades;

import facade.notifications.email.GmailNotification;
import facade.notifications.email.IEmailNotification;
import facade.notifications.gsm.IGsmNotification;
import facade.notifications.gsm.SmsNotification;
import facade.notifications.whisper.IChatBotNotification;
import facade.notifications.whisper.WhisperNotification;

public class SendNotificationFacade {

    public IEmailNotification iEmailNotification;
    public IGsmNotification iGsmNotification;
    public IChatBotNotification iChatBotNotification;

    public SendNotificationFacade() {
        iEmailNotification = new GmailNotification();
        iGsmNotification = new SmsNotification();
        iChatBotNotification = new WhisperNotification();
    }
}
