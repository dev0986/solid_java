package org.example.liskov.substitution.bad;

//Parent - child relation - Classes should be substitutable.
//Pass parent, child should handle and work same.

//HomeLoan - pay, close, repayment
//CreditCardLoan - pay, close (Can't close), repayment
//LoanPayment - interface having pay, close and repayment methods.

import javax.naming.OperationNotSupportedException;

public class Main {

    public static void main(String[] args) throws OperationNotSupportedException {
        LoanPaymentService loanPaymentService = new LoanPaymentService(new CreditCardLoan());
        //Exception here
        //Child class - HomeLoan works fine, CreditCardLoan doesnt.
        loanPaymentService.forceCloseLoan();

    }
}
