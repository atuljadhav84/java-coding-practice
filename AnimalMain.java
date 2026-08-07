
class Animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog Barks");
    }
}

public class AnimalMain
{
    public static void main(String args[])
    {
        Animal obj = new Dog();

        obj.sound();
    }
}