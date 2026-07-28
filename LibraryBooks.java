class Library {
    String booksType ;
    int totalBook ;

    Library(String booksType, int totalBook){
        this.booksType = booksType;
        this.totalBook = totalBook;
    }
}

class Book {
    String book ;
    String writter;
    int price ;
   
    Library library;


    Book(String book, String writter, int price , Library library){
        this.book = book;
        this.writter = writter;
        this.price = price;
        
        this.library = library;
        
    }

    void display(){
        System.out.println("Book is: "+book);
        System.out.println("Writter is: "+ writter);
        System.out.println("Price is: "+price);
        System.out.println();
        System.out.println("BookType is: "+library.booksType);
        System.out.println("Total Book is: "+library.totalBook);
    }
}

public class LibraryBooks {
    public static void main(String[] args) {
        Library l = new Library("BioGraphy", 10);
        Book b = new Book("The Wings on Fire ", "A.P.J Kalam", 199, l);

        b.display();
    }
}



