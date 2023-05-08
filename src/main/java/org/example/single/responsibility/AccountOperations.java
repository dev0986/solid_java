package org.example.single.responsibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountOperations {

    //static - very important - If not static, this code doesn't work.
    //accounts in AccountOperations creates a single class level instance here if static.
    //Else, will create a new accounts instance for every instantiation.
    private static Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account){
        accounts.put(account.getName(), account);
    }

    public void updateAccountDetails(Account account){
        accounts.put(account.getName(), account);
    }

    public Account getAccount(String accountName){
        return accounts.get(accountName);
    }

    public List<Account> displayAllAccounts(){
        return accounts.values().stream().toList();
    }

    // This class should be related to opening/ closing/ updating account.
    //Nothing to do with manipulation of what's in the account.
    //Need to move this method to another class// TransactionsOperation?
    public void deposit(){

    }
}
