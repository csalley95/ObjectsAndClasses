package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;
    private ArrayList<Customer> clients;

    public Bank(){
        accounts = new ArrayList<BankAccount>();
        clients = new ArrayList<Customer>();
    }

    public void doBanking(){
        System.out.println("Calling ");
    }
}
