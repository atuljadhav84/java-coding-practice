class Demo {
    int a = 100;
}

public class Solition extends Demo {
    int b = 200;
    public static void main(String[] args) {
        Solition s = new Solition();
        System.out.println(s.b);
        System.out.println(s.a);
    }
}
