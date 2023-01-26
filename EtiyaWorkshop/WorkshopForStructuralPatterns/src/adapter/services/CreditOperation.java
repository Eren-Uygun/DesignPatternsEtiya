package adapter.services;

public class CreditOperation implements ICreditOperation{

    public ICreditOperation creditOperation;

    public CreditOperation(ICreditOperation creditOperation) {
        this.creditOperation = creditOperation;
    }

    @Override
    public void getCreditibilityValues() {
        creditOperation.getCreditibilityValues();
    }

}
