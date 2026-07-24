// Constructor Chaning Exaples 
public class ConstruDemo {

    ConstruDemo(byte a){ 
        System.out.println("1");
    }
    ConstruDemo(short a){
        System.out.println("2");
    }
    ConstruDemo(int b) {
        System.out.println("3");
    }
    ConstruDemo(long a){
        System.out.println("4");
    }
    ConstruDemo(char a){
        System.out.println("5");
    }
    ConstruDemo(float a) {
        System.out.println("6");
    }
    ConstruDemo(double a){
        System.out.println("7");
    }
    ConstruDemo(String a){
        System.out.println("8");
    }

    public static void main(String[] args) {
        ConstruDemo d1 = new ConstruDemo(128);  //3
        ConstruDemo d2 = new ConstruDemo(-127);   // 3
        ConstruDemo d3 = new ConstruDemo(0);   // 3
        ConstruDemo d4 = new ConstruDemo(1.1); // 7
        ConstruDemo d5 = new ConstruDemo(111l); // 4
        ConstruDemo d6 = new ConstruDemo('A'); // 5
        ConstruDemo d7 = new ConstruDemo("A");  // 8
    }


}
