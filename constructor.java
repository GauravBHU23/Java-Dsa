public class constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
  //  Student s1 = new Student("gaurav");
    System.out.println(s1.name);
    
  }
}

class Student{
    String name;
    int Roll;

    // Student(String name){
    //     this.name =  name;

        Student(){

            System.out.println("Construction is Calling....");

        }
    }
//}

