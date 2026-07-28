class Doctor {
    String name;

    Doctor(String name){
        this.name = name;
    }

}

class Hospital {
    String hName;
    Doctor dName;

    Hospital(String hName, Doctor dName){
        this.hName = hName;
        this.dName = dName;
    }
    void display(){
        System.out.println("Doctor name is: "+dName.name);
        System.out.println("Hospital Name is: "+hName);
    }
}

public class DoctorHospital {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Agrawal");
        Hospital h = new Hospital("Bajaj Hospital", d);
        h.display();
    }
}
