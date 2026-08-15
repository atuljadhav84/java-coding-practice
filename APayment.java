abstract class Payment {
    abstract void pay();
    void receipt(){
        System.out.println("Recipt is generated ");
    }
}
class UPI extends Payment {
    void pay () {
        System.out.println("Payment using UPI");
    }
}
class Card extends Payment{
    void pay () {
        System.out.println("Payment using Card");
    }
}
public class APayment {
    public static void main(String[] args) {
        Payment p ;
        p =new UPI();
        p.pay();
        p = new Card();
        p.pay();
    }
}
