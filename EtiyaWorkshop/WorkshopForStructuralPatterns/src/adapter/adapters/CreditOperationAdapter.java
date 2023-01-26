package adapter.adapters;

import adapter.adapters.externalService.ExternalCreditService;
import adapter.services.ICreditOperation;

public class CreditOperationAdapter implements ICreditOperation {

    @Override
    public void getCreditibilityValues() {
        ExternalCreditService externalCreditService = new ExternalCreditService();
        externalCreditService.inquireCreditibility();
    }

}
