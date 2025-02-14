import java.util.Scanner;

class pattern{
    public void calculateStars(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter no. of stars:");
        int n=scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
                // for(int k=1; k<=i; k++){
                //     System.out.print(k+"");
                // }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern myObj= new pattern();
        myObj.calculateStars();

    }
}