//Program to calculate grade based on marks
//Author: Victor Wachira
//Reg No.:CT101/G/19570/23

import java.util.Scanner;


class Student{
    String name;
    double marks;
    char grade;

    //Creating a constructor
    public Student(String name, double marks, char grade){
        this.name=name;
        this.marks=marks;
        this.grade=grade;
    }

    //creating a detail display method
    public void displayDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Marks:"+ marks);
        System.out.println("Grade:"+ grade);
    }
}

//Assigns the student's grade based on marks
class gradeCalculator{
    public char calculateGrade(double marks){
        if(marks>= 90){
            return 'A';
        }
        else if(marks>=75 && marks <90){
            return 'B';
        }
        else if(marks>=50 && marks<75){
            return 'C';
        }
        else if(marks<50){
            return 'D';
        }
        return 0;
    }
}

public class MainApp{
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in); //Scanner Object
           
            //User input
            System.out.print("Enter your name:");
            String Sname= scanner.nextLine();
            System.out.print("Enter your marks:");
            double Smarks= scanner.nextDouble();

            //gradeCalculator Object
            gradeCalculator obj= new gradeCalculator();
            char result=obj.calculateGrade(Smarks);

            //Student object
            Student myObj= new Student(Sname,Smarks,result);
            myObj.displayDetails();

            scanner.close();//avoiding resource leak

            
    }
}
