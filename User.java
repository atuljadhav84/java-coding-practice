class Bank {
    private int bal = 5000;

    //Widrow method
    public int WithdrowBal(){
        return bal;
    }

    // Deposit method
    public void DepositBal(int depo){
        bal = depo;
        bal = bal +depo;
    }
}

class User {
    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println(b.WithdrowBal());
        b.DepositBal(2000);
        System.out.println(b.WithdrowBal());
    }
}
