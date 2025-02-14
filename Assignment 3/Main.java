import java.util.Scanner;

class Employee{
    String name;
    double salary;
    double bonus;

    //constructor
    public Employee(String name, double salary, double bonus){
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;
    }

    //method
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Bonus:"+bonus);
    }
}

class SalaryCalculator{
    public double calculateBonus(double salary){
        return 0.1 *salary;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your name:");
        String Ename=scanner.nextLine();
        System.out.print("Enter your salary:");
        double Esal=scanner.nextDouble();

        SalaryCalculator myObj= new SalaryCalculator();
        double bonus=myObj.calculateBonus(Esal);

        Employee employee= new Employee(Ename, Esal, bonus);
        employee.displayDetails();
    }
}