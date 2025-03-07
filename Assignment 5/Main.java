import java.util.Scanner;

abstract class BankAccount{
    Scanner scanner= new Scanner(System.in);
    protected double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void deposit(){
        System.out.println("Enter amount to deposit");
        double amt=scanner.nextDouble();

        balance +=amt;
        System.out.println("Your new balance:"+balance);
    }

    abstract double withdraw(double balance);

}

class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance) {
        super(balance);
    }
    
    @Override
    double withdraw(double balance){
        System.out.println("Enter amount to withdraw from savings:");
        double amt=scanner.nextDouble();
        if(balance>=100){
            balance-=amt;
            System.out.println("Your new balance:"+balance);
        }
        else{
            System.out.println("Balance must not be below 100$!");
        }
        return balance;
    } 
}

class CheckingAccount extends BankAccount{
    private static final double TRANSACTION_FEE = 1.0;

    public CheckingAccount(double balance) {
            super(balance);
        }
    
    @Override
    double withdraw(double amount) {
        if (balance - (amount + TRANSACTION_FEE) >= 0) {
            balance -= (amount + TRANSACTION_FEE);
            System.out.println("Withdrawn: $" + amount + " | Fee: $" + TRANSACTION_FEE + " | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied. Insufficient funds.");
        }
    return amount;
    }
    
}


public class Main{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        BankAccount deposit= new SavingsAccount(0);
        SavingsAccount withdraw= new SavingsAccount(0);

        System.out.println("Enter service you want offered:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("Enter your choice:");
        int choice= scanner.nextInt();

        if(choice == 1){
            deposit.deposit();
        }
        else if(choice == 2){
            withdraw.withdraw(0);
        }
        else{
            System.out.println("Invalid input");
        }

        scanner.close();
    }
};