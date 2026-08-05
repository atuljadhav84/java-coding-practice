 class Payment {
    void pay() {
        System.out.println("Payment is Processing ! ");
    }
}
class UPI extends Payment {
    void pay() {
        System.out.println("Payment is done using UPI! ");
    }
}
class CreditCard extends Payment {
    void pay () {
        System.out.println("Payment is done using creditCard! ");
    }
}
class CashOnDelivery extends Payment {
    void pay () {
        System.out.println("Payment is done using Cash on Delivery! ");
    }
}

public class Amazon {
    public static void main(String[] args) {
        Payment p;

        p = new UPI() ;
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new CashOnDelivery();
        p.pay();
    }
}

