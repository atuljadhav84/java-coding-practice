class Vehical {
    String type = "Four weeler";
    int weel = 5;
    void run(){
        System.out.println("Vehical is Running ");
    }
}

class Car extends Vehical{
    String name = "Tata Nexon";
    int price  = 1500000;
    String colour  =  "Balck";
}

public class EV extends Car {
    int miledge = 400;
    int speed = 180;
    void work (){
        System.out.println("Work on Electricity");
    }

    public static void main(String[] args) {
        EV e = new EV();
        System.out.println("Type is: "+e.type);
        System.out.println("Weel is: "+e.weel);
        e.run();
        System.out.println();
        System.out.println("Name is: "+e.name);
        System.out.println("Price is: "+e.price);
        System.out.println("Coloure is: "+e.colour);
        System.out.println();
        System.out.println("Miledge is: "+e.miledge);
        System.out.println("Max speed is: "+e.speed);
        e.work();
    }
}