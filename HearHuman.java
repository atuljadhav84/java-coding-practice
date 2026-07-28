class Heart {
    int bits = 72;
    Heart(){
        System.out.println("Pumping a Blud");
        System.out.println("Human bits is: "+bits);
    }
}

class Human {
    Heart h1  ;
    Human(){
        h1 = new Heart();
        System.out.println("Human is Alive ");
    }
}

public class HearHuman {
    public static void main(String[] args) {
        Human h = new Human();
    }
}
