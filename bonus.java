import java.util.Scanner;

public class bonus {
    public static void main(String args[]){
         //Initializing the variables
         double sal,bonus;
         int year;
         //Create a scanner object
          Scanner scanner= new Scanner(System.in);
         
          //Prompts the user for the first value
          System.out.println("Enter your salary:");
          //Reads the first input provided by the user
          sal=scanner.nextDouble();
          
          //Prompts the user for the first value
          System.out.println("Enter the number of years worked:");
          //Reads the second input provided by the user
          year=scanner.nextInt();
          
          //Shows how sum is obtained
          if(year>10){
              bonus=0.12*sal;
              System.out.println("Bonus:"+bonus);
          }
          else if(year>=6 && year<=10){
              bonus=0.1*sal;
              System.out.println("Bonus:"+bonus);
          }
          else if(year<6){
              bonus=0.08*sal;
              System.out.println("Bonus:"+bonus);
          }
         else{
             System.out.println("Invalid input");//error checking
         }
     }
}
