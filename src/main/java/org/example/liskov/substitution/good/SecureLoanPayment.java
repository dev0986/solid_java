package org.example.liskov.substitution.good;

public interface SecureLoanPayment extends LoanPayment{

    public void forceCloseLoan();
}
