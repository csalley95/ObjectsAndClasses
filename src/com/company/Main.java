package com.company;

public class Main {

    public static void main(String[] args) {
        var account = new BankAccount();
        var comp152Account = new BankAccount(10000, 0.05f);
        account.deposit(1000);
        account.addInterest();
        var succeeded = account.withdraw(2000);
        if (succeeded)
            System.out.println("You managed to withdraw");
        else
            System.out.println("Couldn't withdraw 2000 when you only have "+
                    account.checkBalance() + " in your account with accountID: " + account.getAccountID());
        comp152Account.addInterest();
        System.out.println("Your account with ID: " + comp152Account.getAccountID() + " has " +
                comp152Account.checkBalance() + " in it now.");
        comp152Account.withdraw(5000);
        System.out.println("Now it has "+ comp152Account.checkBalance()+ " after withdraw.");
    }
}
