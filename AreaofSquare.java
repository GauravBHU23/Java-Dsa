import java.util.*;
public class AreaofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Square of a Side : ");
        int a = sc.nextInt();
        int area = a*a;

        System.out.println("The Area of Square of Value is : " + area);
        sc.close();
    }
    
}
