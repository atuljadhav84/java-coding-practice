 class Football {
    private String name = "Messi";
    private int age = 39;
    private String team = "Argentina";
    String position = "Forward";

    // Gets methods
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getTeam(){
        return team;
    }
    public String getPosition (){
        return position;
    }

    // Set method
    public void setName( String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}

class Text {
    public static void main(String[] args) {
        Football f = new Football();
        System.out.println("_________________________");
        System.out.println("Before Change");
        System.out.println(f.getName());
        System.out.println(f.getAge());
        System.out.println(f.getTeam());
        System.out.println(f.getPosition());
        System.out.println();

        f.setName("Ronaldo");
        f.setAge(41);
        f.setTeam("Portugal National");
        f.setPosition("Forword");

        System.out.println("_________________________");
        System.out.println("After Change");
        System.out.println(f.getName());
        System.out.println(f.getAge());
        System.out.println(f.getTeam());
        System.out.println(f.getPosition());
        System.out.println("_________________________");
    }
}