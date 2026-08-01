class Bike {
    int weel = 2;
    void use(){
        System.out.println( "Personal use");
    }
}

public class RoyalEnfeld extends Bike {
    String name = "Classic 350 cc";
    void avg (){
        System.out.println("35km /ph");
    }
    public static void main(String[] args) {
        RoyalEnfeld r = new RoyalEnfeld();
        System.out.println("WEEl is: "+r.weel);
        r.use();
        System.out.println("NAME is: "+r.name);
        r.avg();
    }
}
