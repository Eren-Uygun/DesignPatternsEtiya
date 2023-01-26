package facade.services;

import facade.facades.SendNotificationFacade;

public class CustomerService implements ICustomerService{

    public SendNotificationFacade sendNotificationFacade;

    public CustomerService(SendNotificationFacade sendNotificationFacade) {
        this.sendNotificationFacade = sendNotificationFacade;
    }

    @Override
    public void warnCustomer() {
        sendNotificationFacade.iGsmNotification.sendNotification();
        sendNotificationFacade.iChatBotNotification.sendNotification();
        sendNotificationFacade.iEmailNotification.sendNotification();

    }
}
