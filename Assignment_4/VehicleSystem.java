// A hardcoded program to show method overriding
// Author: Victor Wachira
// Reg No.: CT101/G/19570/23

// Base class Vehicle
class Vehicle {
    String brand;
    int speed;

    // Constructor to initialize brand and speed
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to accelerate the vehicle
    public void accelerate(int increase) {
        speed += increase;
    }

    // Method to apply brakes
    public void brake(int decrease) {
        speed -= decrease;
    }

    // Method to display vehicle details
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    int fuelLevel;

    // Constructor to initialize brand, speed, and fuel level
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    // Method to refuel the car
    public void refuel(int amount) {
        fuelLevel = 100; // Assuming refueling fills the tank to 100%
    }

    // Overriding the showDetails method to include fuel level
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
}

// Subclass Bike extending Vehicle
class Bike extends Vehicle {
    boolean helmetOn;

    // Constructor to initialize brand, speed, and helmet status
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = false; // Incorrectly overriding the parameter, should be helmetOn = helmetOn;
    }

    // Method to wear a helmet
    public void wearHelmet() {
        helmetOn = true;
    }

    // Overriding the showDetails method to include helmet status
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Helmet Status: " + helmetOn);
    }
}

// Main class to test Vehicle, Car, and Bike
public class VehicleSystem {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", 60, 50);
        // Creating a Bike object
        Bike myBike = new Bike("Yamaha", 40, false);

        // Performing operations on the car
        myCar.accelerate(60); // Accelerate by 60
        myCar.brake(30); // Brake by 30
        myCar.refuel(50); // Refuel the car
        myCar.showDetails(); // Display car details

        // Performing operations on the bike
        myBike.accelerate(15); // Accelerate by 15
        myBike.brake(10); // Brake by 10
        myBike.showDetails(); // Display bike details
    }
}
