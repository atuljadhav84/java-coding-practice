class Animal {
    void makingSound() {
        System.out.println("Aminal is making sound!!");
    }
}
// Inheritance 
class Dog extends Animal {
    void makingSound() {
        System.out.println("Dog is making sound Bow-Bow! ");
    }
}
class Cat extends Animal {
    void makingSound() {
        System.out.println("Cat is making Sound Miyau-Miyau!! ");
    }
}

class Lion extends Animal{
    void makingSound() {
        System.out.println("Lion is making sound Ror-Ror!! ");
    }
}
// method overriding 
class VetHospital {
    void vaccination(Animal a) {
        System.out.println("Vaccidation is Done !!");
        a.makingSound();
    } 

}

public class AnimalMain {
    public static void main(String[] args) {
        VetHospital v = new VetHospital();
        v.vaccination(new Dog()); // Upcasting 
        v.vaccination(new Cat());
        v.vaccination(new Lion());
        
    }
}
