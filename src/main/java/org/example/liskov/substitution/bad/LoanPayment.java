package org.example.liskov.substitution.bad;

import javax.naming.OperationNotSupportedException;

public interface LoanPayment {

    public void payLoan();
    public void forceCloseLoan() throws OperationNotSupportedException;
    public void repayLoan();

}
