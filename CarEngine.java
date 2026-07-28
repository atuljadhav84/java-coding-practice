class Engine {
    int cc = 2184;
    String engineType = "mHawk 4-cylinder, DOHC, liquid-cooled diesel";
    String maxPower = "130 bhp @ 3750 rpm" ;
    String maxTorqe = "300 Nm @ 1600–2800 rpm";

    void condition(){
        System.out.println("Engine is good condition");
    }

    Engine(){
        System.out.println("Engine CC is: "+cc);
        System.out.println("Engine type is: "+engineType);
        System.out.println("Engine max Power is: "+maxPower);
        System.out.println("Engine max torque is: "+maxTorqe);
        condition();
        System.out.println();
    }
}

class Car {
    Engine e;
    String name = "Scorpio Classic S11";
    String company = " Mahindra";

    void carCondition (){
        System.out.println("Car is Good and clean condition");
    }

    Car(){
       
        System.out.println("Car name: "+name);
        System.out.println("Company name: "+name);
        carCondition();
        System.out.println();
        e = new Engine();
    }
}

public class CarEngine {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
