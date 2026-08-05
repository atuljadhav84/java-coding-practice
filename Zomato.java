class Food {
    void prepare () {
        System.out.println("Food is preparing ");
    }
}

class Pizza extends Food {
    void prepare () {
            System.out.println("Pizza is ready! ");
        
    }
}

class Burger extends Food {
    void prepare () {
        System.out.println("Burger is Ready! ");
    }
}

class Biryani extends Food {
    void prepare () {
        System.out.println("Biryani is Ready! ");
    }
}

public class Zomato {
    public static void main(String[] args) {
        Food f ;
        f = new Pizza();
        f.prepare();

        f = new Biryani();
        f.prepare();

        f  = new Burger();
        f.prepare();
    }
}