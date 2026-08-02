class Animal {
    String type = "Forect, Desert, Cold regios, GrassLand";
}

class Carnivores extends Animal{
    String eat = "Meat";
    void live(){
        System.out.println("Living in forect");
    }
}

public class Tiger extends Carnivores {
    String weight = "200 to 450 kg";
    void secifi(){
        System.out.println("King of Jugle ");
    }

    public static void main(String[] args) {
        Tiger t = new Tiger();
        System.out.println("Type is: "+t.type);
        System.out.println("Eat: "+t.eat);
        t.live();
        System.out.println("Weight is: "+t.weight);
        t.secifi();
    }
}