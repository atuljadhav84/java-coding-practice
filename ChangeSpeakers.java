class Speakers {
    private String name = "Gaure Gopal Das";
    private int age = 52;
    private String education = "B.tech";

    // get method
    public String getName(){
        return name;
    }
    public int  getAge(){
        return age;
    }
    public String getEducation() {
        return education;
    }

    // Setter method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEducation(String education) {
        this.education = education;
    }
}

class ChangeSpeakers {
    public static void main(String[] args) {
        
        Speakers s = new Speakers();

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getEducation());
        System.out.println("________________________________________");
        System.out.println();

        s.setName("Jagdish Sadguru ");
        s.setAge(68);
        s.setEducation("BA");

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getEducation());
        System.out.println("________________________________________");
    }
}
