// Parent Class
class Vehicle {
    void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Child Class 1
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on roads.");
    }
}

// Child Class 2
class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat sails on water.");
    }
}

public class CarDrive {
    public static void main(String[] args) {
        // Polymorphic reference variables (Parent type pointing to Child objects)
        Vehicle v ;
        v = new Car();
        v.move(); // Output: The car drives on roads.
        v = new Boat(); // Output determined at runtime by actual object type
        v.move(); // Output: The boat sails on water.
        
       
        
    }
}
