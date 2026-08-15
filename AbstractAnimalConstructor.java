abstract class Animal {
    Animal (){
        System.out.println("Animal Constructor ");
    }
    abstract void sound();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound () {
        System.out.println("Gog make sound ");
    }
}
public class AbstractAnimalConstructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
    
}
