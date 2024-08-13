public class inheritence {

    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat(); 
        dogs dobby = new dogs(); 
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

        
    }
}
//base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

// derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }
class Mammals extends Animal{
    int legs;

    }

class dogs extends Mammals{
    String  breed;
}
