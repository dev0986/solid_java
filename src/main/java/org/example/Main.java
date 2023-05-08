package org.example;

import org.example.single.responsibility.Account;
import org.example.single.responsibility.AccountOperations;
import org.example.single.responsibility.TransactionsOperation;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        AccountOperations accountOperations = new AccountOperations();
        TransactionsOperation transactionsOperation = new TransactionsOperation();

        Account account1 = new Account("Atish", 1111, new BigDecimal("100.00"));
        Account account2 = new Account("Disha", 2222, new BigDecimal("200.00"));
        Account account3 = new Account("Shruti", 3333, new BigDecimal("300.00"));

        accountOperations.addAccount(account1);
        accountOperations.addAccount(account2);
        accountOperations.addAccount(account3);

        transactionsOperation.deposit(account1, BigDecimal.TEN);

        accountOperations.displayAllAccounts().forEach( (account) -> System.out.println(account));



    }
}