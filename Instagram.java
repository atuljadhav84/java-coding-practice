 class Post {
    void upload() {
        System.out.println("Post is uploaded! ");
    }
}
// Inheritance 
class Photo extends Post{
    void upload() { // method overriding form parent method 
        System.out.println("Photo is uploaded! ");
    }
}
// Inheritance 
class Video extends Post {
    void upload() { // method overriding form parent method 
        System.out.println("Video is uploaded! ");
    }
}
// Inheritance 
class Reel extends Post {
    void upload() { // method overriding form parent method 
        System.out.println("Reel is uploaded! ");
    }
}
public class Instagram {
    public static void main(String[] args) {
        Post p ; // Parent class ref

        p = new Photo(); // upcasting 
        p.upload();

        p = new Photo(); // upcasting 
        p.upload();

        p = new Reel(); // upcasting 
        p.upload();

    }
}
