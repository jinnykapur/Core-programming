/*
Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. 
Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.

Explanation: The BankAccount class stores bank account details as attributes.
The methods allow interaction with these attributes to modify and view the account's state.
*/

import java.util.Scanner;

public class SimulateATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount("Alice", 1234567890L, 5000);

        account1.displayBalance();
        account1.depositMoney(1500);
        account1.withdrawMoney(2000);
        account1.withdrawMoney(6000);
        account1.displayBalance();

        sc.close();
    }

    static class BankAccount {
        private String accountHolder;
        private long accountNumber;
        private long balance;

        // Constructor
        public BankAccount(String accountHolder, long accountNumber, long balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Deposit method
        public void depositMoney(long amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: INR " + amount);
                System.out.println("Updated Balance: INR " + balance);
            } else {
                System.out.println("Deposit amount should be positive.");
            }
            System.out.println("-----------------------------------");
        }

        // Withdraw method
        public void withdrawMoney(long amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance for withdrawal. Please try again.");
            } else if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive. Please try again.");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: INR " + amount);
                System.out.println("Remaining Balance: INR " + balance);
            }
            System.out.println("-----------------------------------");
        }

        // Display account details
        public void displayBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: INR " + balance);
            System.out.println("-----------------------------------");
        }
    }
}
