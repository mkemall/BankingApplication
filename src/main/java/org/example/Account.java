package org.example;

import javax.xml.namespace.QName;

public class Account {
    long accountNumber;
    String name;
    float balance;

    // Constructors

    public Account() {}

    public Account(long accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        }

    // Deposit Method

    void deposit(float amount) {
        this.balance = this.balance + amount;
        System.out.println("$ " +amount+ "Credited | Balance: "+this.balance);
    }

    //Withdraw Method

    void withdraw(float amount) {
        if (this.balance >= amount) {
            System.out.println("$ " + amount + "Debited | Balance: " + this.balance);

        } else {
            System.out.println("ERROR: Insufficient Balance");
        }
    }
    // Getting account details method
    void getDetails() {
            System.out.println("A/C No: " + this.accountNumber + " | NAME: " + this.name + "Balance: " + this.balance);
        }

}
