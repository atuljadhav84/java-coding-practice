// Abstract Class
abstract class Vehicle {
    private String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no implementation body)
    abstract void startEngine();

    // Concrete method (has implementation body)
    public void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}


// Subclass 1
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine starts with a push-button.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kick-start.");
    }
}


public class AbstractVehicalEx {
    public static void main(String[] args) {
        // Vehicle myVehicle = new Vehicle("Generic"); // Error: Cannot instantiate abstract class

        Vehicle myCar = new Car("Tesla");
        Vehicle myBike = new Motorcycle("Harley-Davidson");

        myCar.displayBrand();   // Accessing concrete method
        myCar.startEngine();    // Accessing abstracted method

        myBike.displayBrand();  // Accessing concrete method
        myBike.startEngine();   // Accessing abstracted method
    }
}
