public class Register {
    // Global fild / variable
    String name;
    String eMail;
    String uName;
    String pass;
    int age ;
    long moNum;

    // Constructor 1
    Register(String name, String eMail, String pass, int age){
        this.name = name;
        this.eMail = eMail;
        this.pass = pass;
        this.age = age;
    }
    //Constructor 2 
    Register(String eMail, String uName,  long moNum, String pass){
        this.eMail = eMail;
        this.uName = uName;
        this.pass = pass;
        this.moNum = moNum;
    }
    // Condructor 3
    Register(String uName, String pass, int age){
        this.uName = uName;
        this.pass = pass;
        this.age = age;
    }
    // Constructor 4
    Register (String name, long moNum){
        this.name = name;
        this.moNum = moNum;
    }

    public static void main(String[] args) {
        Register r1 = new Register("Sham", "shamp12@gamil","Sham@123",22 );
        Register r2 = new Register("raju@123","Raju123",894558945, "Raj@123");
        Register r3 = new Register("Oom111", "Om@2121",22);
        Register r4 = new Register("vaibhav", 784892389);

        // call method using obj reference
        r1.display();
        r2.display();
        r3.display();
        r4.display();
    }

    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Emial is: "+eMail);
        System.out.println("Usere Name is: "+uName);
        System.out.println("Password is: "+pass);
        System.out.println("Age is : "+age);
        System.out.println("Mobile num is: "+moNum);
        System.out.println("______________________________");
    }
}
