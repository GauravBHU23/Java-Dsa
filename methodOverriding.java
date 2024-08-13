public class methodOverriding {
    public static void main(String[] args) {
        dear d = new dear();
        d.eat();
        
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class dear extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
