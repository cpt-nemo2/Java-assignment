//Program to Calculate bonus for employees based on Salary
//Author: Victor Wachira
//Reg No.:CT101/G/19570/23

import java.util.Scanner;

class Employee{
    //Initializing attributes
    String name;
    double salary;
    double bonus;

    //constructor
    public Employee(String name, double salary, double bonus){
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;
    }

    //method to display details
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Bonus:"+bonus);
    }
}

//This calculates tthe bonus of the employee
class SalaryCalculator{
    public double calculateBonus(double salary){
        return 0.1 *salary;
    }
}

public class Main{
    public static void main(String[] args) {
        //Scanner object
        Scanner scanner= new Scanner(System.in);

        //Asking for the user's input
        System.out.print("Enter your name:");
        String Ename=scanner.nextLine();
        System.out.print("Enter your salary:");
        double Esal=scanner.nextDouble();

        //Creates an object for SalaryCalculator
        SalaryCalculator myObj= new SalaryCalculator();
        double bonus=myObj.calculateBonus(Esal);

        //Creates an object for Employee
        Employee employee= new Employee(Ename, Esal, bonus);
        employee.displayDetails();

        scanner.close();//Closing scanner to avoid resource leak
    }
}