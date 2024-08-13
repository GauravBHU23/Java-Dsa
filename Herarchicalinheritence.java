public class Herarchicalinheritence {
    public static void main(String[] args) {
        Fish fisher = new Fish(); 
        fisher.eat();
        fisher.color = "blue";
    System.out.println(fisher.color);
       }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

