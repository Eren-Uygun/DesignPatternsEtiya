package bridge.serviceTriggers;

public class RestServiceTrigger extends BaseServiceTrigger {
    @Override
    public void triggerService() {
        System.out.println("Rest servis tetiklendi.");
    }
}
