class Laptop {
    String type = "Elctonics Device";
}
class Dell extends Laptop {
    String Campnay  = "Dell";
    void use(){
        System.out.println("Devlopment ");
    }
}

public class Gamming extends Dell {
    String name = "Dell g4555";
    int price = 45000;
    String RamRom = "8GB, 256SSD";
    public static void main(String[] args) {
        Gamming g = new Gamming();

        System.out.println("Type is: "+g.type);
        System.out.println("Comapny is: "+g.Campnay);
        g.use();
        System.out.println("Name is : "+g.name);
        System.out.println("price is: "+g.price);
        System.out.println("RAM and ROM is: "+g.RamRom);
    }
}
