// import java.util.Scanner;

// abstract class BankAccount{
//     Scanner scanner= new Scanner(System.in);
//     protected double balance;

//     protected  BankAccount(double balance){
//         this.balance=balance;
//     }

//     public void deposit(){
//         System.out.println("Enter amount to deposit");
//         double amt=scanner.nextDouble();

//         balance +=amt;
//         System.out.println("Your new balance:"+balance);
//     }

//     abstract double withdraw(double balance);

// }

// class SavingsAccount extends BankAccount{

//     public SavingsAccount(double balance) {
//         super(balance);
//     }
    
//     @Override
//     double withdraw(double balance){
//         System.out.println("Enter amount to withdraw from savings:");
//         double amt=scanner.nextDouble();
//         if(balance==100){
//             balance-=amt;
//         }
//         else{
//             System.out.println("Balance must not be below 100$!");
//         }
//         return balance;
//     }

    
// }

// class CheckingAccount extends BankAccount{
//     @Override
//     double withdraw(double balance){

//     }
// }

// public class mainApp{
//     public static void main(String[] args) {
//         // double balance = 0;
//         // BankAccount myObj=new BankAccount(balance);
//         // myObj.deposit();
//     }
// }
