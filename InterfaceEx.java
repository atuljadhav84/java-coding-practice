// Vehicle.java
interface Vehicle {
    // Abstract method (has no body)
    void start();
    
    // Abstract method
    void brake();
}
// Car.java
class Car implements Vehicle {
    // Implementing the start method
    @Override
    public void start() {
        System.out.println("The car is starting with a push-button.");
    }

    // Implementing the brake method
    @Override
    public void brake() {
        System.out.println("The car is stopping using disc brakes.");
    }
}
// Main.java
public class InterfaceEx  {
    public static void main(String[] args) {
        // Interface reference pointing to a Car object
        Vehicle myCar = new Car();
        
        // Call the implemented methods
        myCar.start();
        myCar.brake();
    }
}
