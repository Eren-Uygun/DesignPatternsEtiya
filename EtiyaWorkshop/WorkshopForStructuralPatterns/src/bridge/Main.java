package bridge;

import bridge.serviceTriggers.RestServiceTrigger;
import bridge.serviceTriggers.SoapServiceTrigger;
import bridge.services.TriggerService;

public class Main {
    public static void main(String[] args) {

        TriggerService triggerService = new TriggerService();
        triggerService.baseServiceTrigger = new SoapServiceTrigger();
        triggerService.triggerService();




        triggerService.baseServiceTrigger = new RestServiceTrigger();
        triggerService.triggerService();






    }
}
