class Animal {
    Animal get() {
        return new Animal();
    }
}
class Dog extends Animal {
    @Override
    Dog get() {
        return new Dog();
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog obj = d.get();
        System.out.println(obj);
    }
}