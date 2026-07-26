class Laptop {
     String brand; 
     String model; 
     int ram; 
     double price; 
     
     Laptop() { 
         this("Dell"); 
         } 
         
         Laptop(String brand) { 
         this(brand, "Inspiron");
          } 
          
          Laptop(String brand, String model) { 
          this(brand, model, 8); 
          } 
          
          Laptop(String brand, String model, int ram) {
               this(brand, model, ram, 55000);
              } 
              
              Laptop(String brand, String model, int ram, double price) { 
                  this.brand = brand; this.model = model; this.ram = ram; this.price = price; 
                  } 
                  
                  void display() {
                     System.out.println("Brand : " + brand); 
                     System.out.println("Model : " + model); 
                     System.out.println("RAM : " + ram); 
                     System.out.println("Price : " + price); 
                     } 
                     } 
                     
                     public class Main
                      {
                           public static void main(String[] args) { 
                               Laptop l1 = new Laptop(); 
                               Laptop l2 = new Laptop("HP");
                                Laptop l3 = new Laptop("Lenovo", "ThinkPad"); 
                                Laptop l4 = new Laptop("Apple", "MacBook Air", 16, 120000); 
                                
                                
                                l1.display();
                                System.out.println();
                                
                                l2.display(); 
                                System.out.println(); 
                                
                                l3.display(); 
                                System.out.println(); 
                                
                                l4.display();
                                 } 
                                 
                                 }