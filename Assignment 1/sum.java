//Program to add two inputs
//Author: Victor Wachira
//Reg No.:CT101/G/19570/23

// Imports the scanner class
import java.util.Scanner;
//Main class
 public class sum{
      //This is my main method.
     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String args[]){
         //Initializing the variables
         int x,y,sum;
         //Create a scanner object
          Scanner scanner= new Scanner(System.in);
         
          //Prompts the user for the first value
          System.out.println("Enter the first value:");
          //Reads the first input provided by the user
          x=scanner.nextInt();
          
          //Prompts the user for the first value
          System.out.println("Enter the second value:");
          //Reads the second input provided by the user
          y=scanner.nextInt();
          
          //Shows how sum is obtained
          sum=x+y;
         
          System.out.println("Answer:"+sum);//result

          scanner.close();//Close scanner to avoid a resource leak
     }
 }