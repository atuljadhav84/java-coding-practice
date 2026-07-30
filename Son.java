class Father {
    String fName = "Suresh";
    int fAge = 45;
    String address = "pune";
}

public class Son extends Father {
    String sname = "Ramesh";
    int sAge = 20;

    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("Son name: "+s.sname);
        System.out.println("Son age: "+s.sAge);
        System.out.println();
        System.out.println("Father name: "+s.fName);
        System.out.println("Father age: "+s.fAge);
        System.out.println("Address: "+s.address);
    }
}
