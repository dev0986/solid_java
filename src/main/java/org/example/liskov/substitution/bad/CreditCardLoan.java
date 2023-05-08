package org.example.liskov.substitution.bad;

import javax.naming.OperationNotSupportedException;

public class CreditCardLoan implements LoanPayment {
    @Override
    public void payLoan() {

    }

    @Override
    public void forceCloseLoan() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Cant force close a Credit card loan");
    }

    @Override
    public void repayLoan() {

    }
}
