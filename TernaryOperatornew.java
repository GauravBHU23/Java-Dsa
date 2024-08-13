import java.util.*;
public class TernaryOperatornew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Subject Marks : ");
        int marks = sc.nextInt();

        String Marks = (marks>=33) ? "The Student Will be Passed in Subject" : "The Student Will be Not Passed in Subject";
        System.out.println(Marks);
        sc.close();
    }
    
}
