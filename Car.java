class Vehical {
    String comapnay = "Mahindra";
    int weel = 4;
    void run(){
        System.out.println("Off Roading");
    }
}

public class Car extends Vehical {
    String name = "Thar ROXX";
    int price  = 20;
    int doors = 5;
    int cc = 2184;

    void condition (){
        System.out.println("Car is good ");
    }

    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("Company name: "+c.comapnay);
        System.out.println("Weel: "+c.weel);
        c.run();
        System.out.println();

        System.out.println("Car name: "+c.name);
        System.out.println("Car prise: "+c.price);
        System.out.println("Car cc: "+c.cc);
        System.out.println("Car doores"+c.doors);
        c.condition();


    }
}


