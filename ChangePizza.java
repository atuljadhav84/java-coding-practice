class Pizza {
    private String name = "Margherita";
    private String specification = "Classic cheese and signature tomato herb sauce.";
    private int price = 199;

    //get methods
    public String getName() {
        return name;
    }
    public String getSpecification () {
        return specification;
    }
    public int getPrice() {
        return price;
    }

    // set methods
    public void setName (String name){
        this.name = name;
    }
    public void setSpecification( String specification){
        this.specification = specification;
    }
    public void setPrice(int price){
        this.price = price;
    }
}


class ChangePizza {
    public static void main(String[] args) {
        Pizza p = new Pizza();

        System.out.println("Before ");
        System.out.println(p.getName());
        System.out.println(p.getSpecification());
        System.out.println(p.getPrice());
        System.out.println(" ");

        p.setName("Peppy Paneer");
        p.setSpecification("Juicy paneer, crisp capsicum, and red paprika.");
        p.setPrice(229);

        System.out.println("After ");
        System.out.println(p.getName());
        System.out.println(p.getSpecification());
        System.out.println(p.getPrice());
    }
}
