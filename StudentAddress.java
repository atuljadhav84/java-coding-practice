class Address {
    String city ;

    Address(String city){
        this.city = city;
    }
}

class Student {
    String name ;
    Address location;

    Student (String name, Address location){
        this.name = name;
        this.location = location;
    }

    void display(){
        System.out.println("Name is "+name);
        System.out.println("Location is "+location.city);
    }
}

public class StudentAddress {
    public static void main(String[] args) {
        Address a1 = new Address("Pune");
        Student s1 = new Student("Atul", a1);

        s1.display();
    }
}