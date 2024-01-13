package org.example;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account = null;
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Details");
            System.out.println("5. Exit");

            System.out.println("Enter an Option: ");
            int option = scanner.nextInt();

            switch (option)
            {
                case 1: //Create Acount
                    if(account == null) {
                        System.out.println("Enter account number: ");
                        long accountNumber = scanner.nextLong();
                        scanner.nextLine();

                        System.out.println("Enter account holder's name: ");
                        String name = scanner.nextLine();

                        System.out.println("Enter initial deposit: ");
                        float ammount = scanner.nextFloat();

                        //create an account object

                        account = new Account(accountNumber, name, ammount);
                        System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
                    } else {
                        System.out.println("Account is already created! Try another input");
                    }
                    break;

                case 2: // deposit
                    if(account != null) {
                        System.out.println("Enter deposit amount: ");
                        float amount = scanner.nextFloat();
                        account.deposit(amount);
                    } else {
                        System.out.println("Create Account First");
                    }
                    break;

                case 3: //withdraw
                    if (account !=null) {
                        System.out.println("Enter withdraw amount: ");
                        float amount = scanner.nextFloat();
                        account.withdraw(amount);
                    } else {
                        System.out.println("Create Account First");
                    }
                    break;

                case 4: //details
                    if(account != null) {
                        account.getDetails();
                    } else {
                        System.out.println("Create Account First");
                    }
                    break;

                case 5: // terminate application
                    System.out.println("Have a nice DAY");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option. Please Try Again!");
            }
        }
    }
}
