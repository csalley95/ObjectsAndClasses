package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> accounts;
    private ArrayList<Customer> clients;

    public Bank(){
        accounts = new ArrayList<BankAccount>();
        clients = new ArrayList<Customer>();
    }

    private void printMenu(){
        System.out.println("Please select an option below: ");
        System.out.println(" [1] Add a customer");
        System.out.println(" [2] Select a Customer for banking");
        System.out.println(" [3] Remove Customer");
        System.out.println(" [4] Do yearly Maintenance");
        System.out.println(" [5] Exit Program");
        System.out.print("Type the number of your choice: ");
    }
    public void doBanking(){
        var reader = new Scanner(System.in);
        while (true){
            printMenu();
            var userSelection = reader.nextInt();
            switch(userSelection){
                case 5:
                    System.exit(0);
                default:
                    System.out.println("I don't know how to do that yet.");
            }
        }
    }
}
