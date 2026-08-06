class Vehical {
    void run(){
        System.out.println("Vehical is running! ");
    }
}
class Thar extends Vehical{
    void run(){
        System.out.println("Vehical is running 180km/h! ");
    }
}

class Scarpio extends Vehical{
    void run(){
        System.out.println("Vehical is running 200km/h! ");
    }
}

public class MainVehical {
    public static void main(String[] args) {
        Vehical v ;

        v = new Thar();
        v.run();
        v = new Scarpio();
        v.run();

    }
}