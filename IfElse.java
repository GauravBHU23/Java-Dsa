import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of Age : ");
        int age = sc.nextInt();

        if(age >= 18){ 
            System.out.println("Adult");

        }
        if(age>13 && age< 17){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not Adult");
            sc.close();
        }

    }
    
}
