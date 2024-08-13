import java.util.*;
public class FailPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Subject of Marks : ");
        int marks = sc.nextInt();

        if(marks>=33){
            System.out.println("The Student Will be Passed in Subject");
        }
        else if(marks<33){
            System.out.println("The Student Will be not Passed in Subject");
            sc.close();

        }
    }
    
}
