public class array {
    public static void main(String[] args) {
            //DECLARING ARRAYS
        
        String[] cars={"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum ={1,2,3,4,5,6,7};

            //CHANGING ARRAY ELEMENTS
        cars[2]="Toyota";   //changes Ford to Toyota


            //ACCESSING ARRAY ELEMENTS
        // System.out.println(cars[2]);
        System.out.println(myNum[3]);

            //FINDING OUT ARRAY LENGTH
        System.out.println(cars.length);

            //INSERTING ELEMENTS IN ARRAYS
            String[] newCars={};

            for(int i= 0; i < cars.length; i++){
                cars[i]= newCars[i];
            }

            System.out.println();
    }
}