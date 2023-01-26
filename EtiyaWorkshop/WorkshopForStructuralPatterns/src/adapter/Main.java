package adapter;

import adapter.adapters.CreditOperationAdapter;
import adapter.services.CreditOperation;
import adapter.services.ICreditOperation;

public class Main {
    public static void main(String[] args) {

        ICreditOperation iCreditOperation = new CreditOperation(new CreditOperationAdapter());
        iCreditOperation.getCreditibilityValues();

    }
}
