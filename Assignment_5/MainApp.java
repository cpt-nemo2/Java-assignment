// A simple Bank Application program to show encapsulation and abstraction
// Author: Victor Wachira
// Reg No.: CT101/G/19570/23

import java.util.Scanner;

// BankAccount class demonstrating encapsulation
class BankAccount {
    private double balance; // Private field to restrict direct access

    // Getter method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your balance is " + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount < balance) { // Checks if sufficient balance is available
            balance -= amount;
            System.out.println("You have withdrawn "+ amount);
            System.out.println("Your balance is " + balance);
        } else if (amount > balance) { // Insufficient funds case
            System.out.println("Insufficient funds!");
        }
    }
}

// Main application class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to take user input
        BankAccount money = new BankAccount(); // Creating a BankAccount object
        char ans;

        do {
            // Display menu options
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.print("Enter choice:");
            int choice = scanner.nextInt(); // Get user's choice

            if (choice == 1) { // Deposit option
                System.out.println("Enter amount to deposit:");
                int amount = scanner.nextInt();
                money.deposit(amount);
            } else if (choice == 2) { // Withdraw option
                System.out.println("Enter amount to withdraw:");
                int amount = scanner.nextInt();
                money.withdraw(amount);
            } else if (choice == 3) { // Check balance option
                System.out.println("Your balance is " + money.getBalance());
            } else { // Invalid input case
                System.out.println("Invalid input");
            }

            // Ask if the user wants another transaction
            System.out.println("Would you like to perform another service? (Y/N):");
            ans = scanner.next().charAt(0);
        } while (ans == 'Y' || ans == 'y'); // Continue if user inputs 'Y' or 'y'

        scanner.close(); // Close the scanner
    }
}
