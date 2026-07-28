class Room {
    Room(){
        System.out.println("Room is Craeted ");
    }
}

class House {

    Room r;
    House(){
        r = new Room();
    }

    void house(){
        System.out.println("House is Created ");
    }
}

public class RoomHouse {
    public static void main(String[] args) {
        House h = new House();
        h.house();
    }
}

