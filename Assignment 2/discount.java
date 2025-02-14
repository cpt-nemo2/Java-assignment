//imports scanner class
import java.util.Scanner;
//main class
public class discount{
    public double getDiscount(double amt){
        double discount=0.0;
        //if else staement to check for discount amount
        if(amt>5000){
            discount=amt*0.1;
        }
        else if(amt>=1000 && amt<=5000){
            discount=amt*0.05;
        }
        else{
            System.out.println("No discount!");
        }

        return discount;
    }
    public static void main(String[] args) {
        double amt;
        Scanner myObj=new Scanner(System.in); //scanner object
        
        System.out.println("Enter Amount:");
        amt=myObj.nextDouble();

        //Object that gets the value for discount gotten by the if else statement
        discount dis= new discount();
        double disc=dis.getDiscount(amt);

        System.out.println(disc); //prints out the value
    }
}