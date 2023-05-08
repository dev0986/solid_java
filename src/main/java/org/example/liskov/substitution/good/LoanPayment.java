package org.example.liskov.substitution.good;

public interface LoanPayment {

    public void payLoan();
}

//LoanPayment implements SecureLoan
//-> Class implementing LoanPayment can payLoan and forceCloseLoan

//SecureLoan - forceCloseLoan
//class implementing SecureLoan can only payLoan

//HomeLoan - pay and forceClose (implements SecureLoan)

//CreditCardLoan - implements LoanPayment (implements LoanPayment)