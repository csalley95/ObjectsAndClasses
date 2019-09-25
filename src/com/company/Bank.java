package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Optional;
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

    private Customer addCustomer(Scanner inputReader) {
        System.out.print("Enter the Customer's name:");
        var customerName = inputReader.nextLine();
        System.out.print("Enter the new customer's Tax ID: ");
        var newTaxID = inputReader.nextInt();
        for (var cust : clients) {
            if (cust.getCustomerID() == newTaxID)
                return cust;
        }
        var newCust = new Customer(customerName, newTaxID);
        clients.add(newCust);
        return newCust;
    }

    private Optional<Customer> removeCustomer(Scanner inputReader) {
        System.out.println("What is the tax ID of the customer who is leaving");
        var taxID = inputReader.nextInt();
        for (var cust : clients){
            if (cust.getCustomerID() == taxID) {
                clients.remove(cust);
                return Optional.of(cust);
            }
        }
        return Optional.empty();
    }

    public void doBanking(){
        var reader = new Scanner(System.in);
        while (true){
            printMenu();
            var userSelection = reader.nextInt();
            reader.nextLine();  //removes trailing newLine character
            switch(userSelection){
                case 1: //add customer
                    var customer = addCustomer(reader);
                    System.out.println("added customer "+ customer.getName());
                    break;
                //case 2:

                case 3: //remove customer
                    var oldCustomer = removeCustomer(reader);
                    var message = " ";
                    if (oldCustomer.isPresent())
                        message = oldCustomer.get().getName() + "is no longer with this bank";
                    else
                        message = " was not with this bank";
                    System.out.println("Customer "+ message);
                    break;
                //case 4:

                case 5: //end program
                    System.exit(0);
                default:
                    System.out.println("I don't know how to do that yet.");
            }
        }
    }
}
