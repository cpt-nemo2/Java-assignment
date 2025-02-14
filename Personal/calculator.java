import java.util.Scanner;
public class calculator{
    public double calc(double num1, double num2, char c){
        double ans=0.0;
        switch(c){
            case '+':
                ans=num1 +num2;
                break;
            case '-':
                ans=num1 - num2;
                break;
            case '*':
                ans=num1 * num2;
                break;
            case '/':
                ans=num1 / num2;
                break;
            default:
                System.out.println("Invalid input!");
        }
        return ans;
    }
    public static void main(String[] args) {
        double num1, num2;
        char c=0;
        Scanner myObj=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1= myObj.nextDouble();

        System.out.println("Enter the second number: ");
        num2=myObj.nextDouble();

        System.out.println("Enter the calculation sign: ");
        c=myObj.next().charAt(c);

        calculator myObj2= new calculator();
        double result=myObj2.calc(num1, num2, c);
        System.out.println(result);
    }
}