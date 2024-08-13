public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(h.color) ;
        
        mustang myhorse = new mustang();
        System.out.println(myhorse);
    }  
}
abstract class Animal{
    String color; 
    Animal(){
        System.out.println("animal constructor called...");
        color = "Browm";

    }
    void eat(){
        System.out.println("Animals Eats");
    }
    abstract void walk();
}


class Horse extends Animal{
    Horse(){
        System.out.println("Horse constuctor called");
    }
    void colorChange(){
        color="Dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class mustang extends Horse{
    mustang(){
        System.out.println("mustang constucter called...");
    }
}

class chicken extends Animal{
    void colorChange(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks of 2 legs");
    }
}