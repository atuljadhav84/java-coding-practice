class Car {
    void topSpeed(){ 
        System.out.println("Car is running ");
    }
}
// Inheritance 
class Thar extends Car{
    void topSpeed(){ // method overriding 
        System.out.println("Thar top speed is 180 km/h");
    }
}
// Inheritance 
class Scarpio extends Car {
    void topSpeed() { // method overriding 
        System.out.println("Scarpio top speed is 200 km/h");
    }
}
// Inheritance 
class Fortuner extends Car {
    void topSpeed() { // method overriding 
        System.out.println("Fortuner top speed is 220 km/h");
    }
}

class ShowRoom {
    void test(Car c) { 
        System.out.println("Test is done!! ");
        c.topSpeed();
    }
}

public class CarMain {
    public static void main ( String [] args){
        ShowRoom s = new ShowRoom();
        s.test(new Thar());  // upcasting 
        s.test(new Scarpio()); // upcasting 
        s.test(new Fortuner()); // upcasting 
    }
}



