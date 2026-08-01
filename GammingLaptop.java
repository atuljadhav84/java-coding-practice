class Laptop {
    String type = "Electonic Device";
    void use (){
        System.out.println("Programing, Devlopment ");
    }
}

public class GammingLaptop extends Laptop{
    String name = "Victus";
    int price  = 64000;

    public static void main(String[] args) {
        GammingLaptop g = new GammingLaptop();
        System.out.println("Type is: "+g.type);
        g.use();
        System.out.println("Laptop name: "+g.name);
        System.out.println("Price is: "+g.price);
    }
}
