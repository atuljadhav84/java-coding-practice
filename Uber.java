class Ride {
    void fare() {
        System.out.println("Ride fare");
    }
}

class Mini extends Ride {
    @Override
    void fare() {
        System.out.println("Mini fare is ₹120");
    }
}

class Sedan extends Ride {
    @Override
    void fare() {
        System.out.println("Sedan fare is ₹220");
    }
}

class SUV extends Ride {
    @Override
    void fare() {
        System.out.println("SUV fare is ₹350");
    }
}

public class Uber  {
    public static void main ( String [] Atul) {
        Ride r;

r = new Mini();
r.fare();

r = new Sedan();
r.fare();

r = new SUV();
r.fare();
        }
    }