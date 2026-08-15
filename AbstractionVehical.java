abstract class Vehical {
    String brand;
    Vehical(String brand) {
        this.brand = brand;
    }
    abstract void start();
    void displayBrand() {
        System.out.println("Brand is: "+brand);
    }
}

class Car extends Vehical {
    Car(String brand){
        super(brand);
    }
    void start() {
        System.out.println("Car start with key");
    }
}

public class AbstractionVehical {
    public static void main(String[] args) {
        Vehical v =new Car("Toyota");
        v.displayBrand();
        v.start();
    }
}
