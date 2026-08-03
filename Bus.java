class Vehical {
    void use(){
        System.out.println("Vehical is used to transport, personal use, shifting etc");
    }
    String type = "Personal, rent etc";

}

class Car extends Vehical {
    String name  = "Mahindra Thar";
    void speci(){
        System.out.println("Off Roading use");
    }
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("Vehical Type is: "+c.type);
        System.out.print("Vehical is used to: ");c.use();
        System.out.println("Vehical name is: "+c.name);
        System.out.print("Vehical Specification is: ");c.speci();
    }
}

class Bike extends Vehical {
    String name = "Royal Enfield";
    void use(){
        System.out.println("Personal use");
    }

    public static void main(String[] args) {
        Bike b = new Bike();

        System.out.println("Vehical type is: "+b.type);
        System.out.print("Vehical use is: "); b.use();

        System.out.println("Bike name is: "+b.name);
        System.out.print("Bike use is: "); b.use();
    }
}

public class Bus extends Vehical {
    String name = "Ashok layland";
    void use(){
        System.out.println("Bus is to transport th people");
    }
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println("Vehival type is: "+b.type);
        System.out.print("Vehical use is: "); b.use();
        System.out.println("Bus name is: "+b.name);
        System.out.print("Vehical use is: "); b.use();
    }
}



