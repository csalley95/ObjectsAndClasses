package com.company;

public class BankAccount {
    private double balance;
    private float interestRate;
    private int accountID;
    private static int nextID = 1000;

    public BankAccount() {
        interestRate = 0.02f;
        accountID = nextID;
        nextID = nextID+1;
    }

    public BankAccount(double initialBalance, float initialRate){
        balance = initialBalance;
        interestRate = initialRate;
        accountID = nextID;
        nextID++;//note that this is a shortcut for nextID = nextID+1
    }

    public void deposit(double amount) {        //mutatorMethod
        balance += amount;
    }

    public boolean withdraw(double amount) {        //mutatorMethod
        if (amount <= balance) {
            balance-=amount;
            return true;
        }return false;
    }

    public double checkBalance(){       //accessorMethod
        return balance;
    }

    public int getAccountID(){
        return accountID;
    }

    public double addInterest(){    //accessorMethod & mutatorMethod
        var interest = balance * interestRate;
        balance = balance+interest;
        return balance;
    }
}