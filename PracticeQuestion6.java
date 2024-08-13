public class PracticeQuestion6 {
    public static void main(String[] args) {
        // Vehicle obj1 = new Car();
        // obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
        
    }
    
}
class vehicle{
    void print(){
        System.out.println("Base Class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
         System.out.println("Derivd class (Car)");
    }
}

//error in vehicle ke under print hai print1 error degi