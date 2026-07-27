class ChangeFish {
    private String name = "Salmon";
    private String colour = "White-Black";
    private int price = 450;

    // getter method
    public String getName(){
        return name;
    }
    public String getColoure (){
        return colour;
    }
    public int getPrice (){
        return price;
    }

    // Setter method 
    public void setName(String name){
        this.name = name;
    }
    public void setColoure(String colour){
        this.colour = colour;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

class Fish {
    public static void main(String[] args) {
        ChangeFish f = new ChangeFish();

        System.out.println(f.getName());
        System.out.println(f.getColoure());
        System.out.println(f.getPrice());

        f.setName("Tunaa");
        f.setColoure("Golden");
        f.setPrice(300);

         System.out.println(f.getName());
        System.out.println(f.getColoure());
        System.out.println(f.getPrice());

    }
}