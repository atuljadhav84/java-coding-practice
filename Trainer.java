class Person {
    String name = "Rahul";
    int age  = 26;
}

class Employee extends Person {
    String cName = "Q-spider";
    void work(){
        System.out.println("Trainer");
    }
}

public class Trainer extends Employee{
    int sal = 80000;
    String work = " Java Teacher";

    public static void main(String[] args) {
        Trainer t = new Trainer();
        System.out.println("Name is: "+t.name);
        System.out.println("Age is: "+t.age);
        System.out.println();
        System.out.println("Comapany Name is: "+t.cName);
        t.work();
        System.out.println();
        System.out.println("Salary is: "+t.sal);
        System.out.println("Working is: "+t.work);
    }
}
