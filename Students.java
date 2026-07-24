// Constructor overloading / chaining 
public class Students {
    Students(){
        System.out.println("1: No argu constructor");
    }
    Students(int a){
        this();
        System.out.println("2 Parameterize constructor int ");
    }
    Students(double a ){
        this(1);
        System.out.println("3 Paramerrized constructor double");
    }

    public static void main(String[] args) {
        Students s = new Students(1.1);
    }
}