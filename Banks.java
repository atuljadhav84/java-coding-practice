class Bank {
    String name  = "Private, Govenment ";
    void commanUse() {
        System.out.println("Save money, Deposit, Withdrow");
    }
}

class HDFC extends Bank {
    String location = "Pune";
    void use (){
        System.out.println("private bank");
    }
}

class ICICI extends Bank {
    String location  = "Vanaz";
    void use (){
        System.out.println("Deposit money");
    }
}

class SBI extends Bank {
    String location  = "Kothrud";
    void type (){
        System.out.println("Government Bnak");
    }
}

public class Banks {
 public static void main(String[] args) {
    HDFC h = new HDFC();
    System.out.println("bank name is: "+h.name);
    System.out.print("Comman use is: "); h.commanUse();
    System.out.println("Location is: "+h.location);
    System.out.print("Use is: "); h.use();
    System.out.println("_________________________________________");

    ICICI i = new ICICI();
     System.out.println("bank name is: "+i.name);
    System.out.print("Comman use is: "); i.commanUse();
    System.out.println("Location is: "+i.location);
    System.out.print("Use is: "); i.use();
    System.out.println("_____________________________________________");

    SBI s = new SBI();
     System.out.println("bank name is: "+s.name);
    System.out.print("Comman use is: "); s.commanUse();
    System.out.println("Location is: "+s.location);
    System.out.print("Use is: "); s.type();
    System.out.println("_________________________________________________________");

 }
}
