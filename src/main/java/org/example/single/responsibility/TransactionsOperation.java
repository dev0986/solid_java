package org.example.single.responsibility;

import java.math.BigDecimal;

public class TransactionsOperation {



    public void deposit(Account account, BigDecimal amount) {
        AccountOperations accountOperations = new AccountOperations();
        BigDecimal existingBalance = accountOperations.getAccount(account.getName()).getTotalAmount();
        BigDecimal newBalance = existingBalance.add(amount);
        account.setTotalAmount(newBalance);
        accountOperations.updateAccountDetails(account);
    }
}
