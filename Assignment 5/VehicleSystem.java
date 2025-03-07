class Vehicle{
    String brand;
    int speed;

    public Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public void acclerate(int increase){
        speed+=increase;
    }
    public void brake(int decrease){
        speed-=decrease;
    }
    public void showDetails(){
        System.out.println("Brand:"+ brand);
        System.out.println("Speed:"+ speed);
    }
}

class Car extends Vehicle{
    
    int fuelLevel;
    
        public Car(String brand, int speed, int fuelLevel) {
                super(brand, speed);
                this.fuelLevel= fuelLevel;
        }
    
        public void refuel(int amount){
           fuelLevel=100;
        }
    
        @Override
        public void showDetails() {
            super.showDetails();
            System.out.println("Fuel Level:"+fuelLevel+"%");
        }
        
    }
    class Bike extends Vehicle{
        boolean helmetOn;
        
        public Bike(String brand, int speed, boolean helmetOn){
            super(brand, speed);
            this.helmetOn= false;
        }
        public void wearHelmet(){
            helmetOn= true;
        }
    
        @Override
        public void showDetails() {
            super.showDetails();
            System.out.println("Helmet Status:"+ helmetOn);
        }
        
    }
    
    public class VehicleSystem {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", 60, 50);
            Bike myBike = new Bike("Yamaha", 40,  false);

            myCar.acclerate(60);
            myCar.brake(30);
            myCar.refuel(50);
            myCar.showDetails();

            myBike.acclerate(15);
            myBike.brake(10);
            myBike.showDetails();
    }
}