

public class Statickeywords {
    public static void main(String[] args) {
      //  Student s1 = new Student();
       // s1.schoolName = "JNV";
    

     //   Student s2 = new Student();
    //    System.out.println(s2.schoolName);
     //   Student calc = new Student();
       // System.out.println(calc.returnPercentage(2,6,8));
        
    }
    
}
class Student{
   static  int returnPercentage (int math , int phy, int chem){
    return (math+ phy+ chem)/3;
   }
    String name;
    int roll;

    static String schoolName;

    void getName(String name){
        this.name = name;
    }
    String getName(){
        return this.name; 
    }
}
