package bridge.services;

import bridge.serviceTriggers.BaseServiceTrigger;

public class TriggerService implements ITriggerService{

    public BaseServiceTrigger baseServiceTrigger;

    @Override
    public void triggerService() {
        baseServiceTrigger.triggerService();
    }
}
