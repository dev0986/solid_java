package org.example.liskov.substitution.bad;

import javax.naming.OperationNotSupportedException;

public class LoanPaymentService {

    private LoanPayment loanPayment;

    public LoanPaymentService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void forceCloseLoan() throws OperationNotSupportedException {
        loanPayment.forceCloseLoan();
    }
}
