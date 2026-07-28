class Bank {
    String bName ;
    String bLocation;
    
    Bank(String bName, String bLocation){
        this.bName = bName;
        this.bLocation = bLocation;
    }
}

class AccHolder {
    String hName;
    int bal;
     Bank bank;

    AccHolder(String hName, int bal, Bank bank){
        this.hName = hName;
        this.bal = bal;
        this.bank = bank;
    }

    void display (){
        System.out.println("Account Holder Name is: "+hName);
        System.out.println("Account balence is: "+bal);
        System.out.println();
        System.out.println("Bank Name is: "+bank.bName);
        System.out.println("Bank Location is: "+bank.bLocation);
    }
}

public class BankHolder {
    public static void main(String[] args) {
        Bank b = new Bank("State bank of India", "Pune");
    AccHolder a = new AccHolder("Om Deshmusk", 200000, b);

    a.display();
    }
}
