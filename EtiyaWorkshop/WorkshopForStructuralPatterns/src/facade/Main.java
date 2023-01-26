package facade;

import facade.facades.SendNotificationFacade;
import facade.services.CustomerService;
import facade.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        ICustomerService iCustomerService = new CustomerService(new SendNotificationFacade());
        iCustomerService.warnCustomer();
    }
}
