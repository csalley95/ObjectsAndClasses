package com.company;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    Customer(String customerName, int taxID){
        name = customerName;
        customerID = taxID;
        accounts = new ArrayList<BankAccount>();
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public boolean openAccount(double initialBalance){
        var newAccount = new BankAccount(initialBalance, 0.02f);
        var success = accounts.add(newAccount);
        return success;
    }

    public BankAccount closeAccount(int accountID){
        BankAccount accountToRemove = null;
        for (var account: accounts) {
            if (account.getAccountID() == accountID) {
                accountToRemove = account;
                break;
            }
        }
        accounts.remove(accountToRemove);
        return accountToRemove;
    }
}
