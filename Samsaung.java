class Mobile {
    String type = " Elecronic Device";
}

class Android extends Mobile {
    String os = "Android";
    String price = "10000 to 300000 rs";
    void use() {
        System.out.println("Communication");
    }
}

public class Samsaung extends Android {
    String name = "S25 Ultar";
    int price = 134000;
    
    public static void main(String[] args) {
        Samsaung s = new Samsaung();

        System.out.println("Type is: "+s.type);
        System.out.println("OS is: "+s.os);
        System.out.println("Price is: "+s.price);
        s.use();;
        System.out.println("Name is: "+s.name);
        System.out.println("Price is: "+s.price);
    }
}
