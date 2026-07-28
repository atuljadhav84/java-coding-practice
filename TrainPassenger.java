class Train {
    String trainName ;
    String location ;
    int ticket = 500;

    Train(String trainName, String location,int ticket){
        this.trainName = trainName;
        this.location = location;
        this.ticket = ticket;
    }
}

class Passenger {
    String pName;
    int age ;
    String destination ;

    Train train;
    Passenger(String pName, int age, String destination, Train train){
        this.pName = pName;
        this.age = age;
        this.destination = destination;
        
        this.train = train;

    }

    void display(){
        System.out.println("Passenger Name is: "+pName);
        System.out.println("Passenger Age is: "+age);
        System.out.println("Destination is: "+destination);
        System.out.println();
        System.out.println("Train name is: "+train.trainName);
        System.out.println("Tarin location is: "+train.location);
        System.out.println("Ticket price is: "+train.ticket);
    }
}

public class TrainPassenger {
    public static void main(String[] args) {
        
       Train t = new Train("Nanded Express", "Parbhani", 300);
       Passenger p = new Passenger("Om Deshamush", 22, "Pune", t);

       p.display();
    }
}