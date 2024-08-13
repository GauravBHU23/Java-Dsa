import java.util.*;
public class Userinputab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of a : ");
        int a = sc.nextInt();
        System.out.print("Enter The Number of b : ");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println("The Sum of Two Number is : " +c);

        sc.close();
    }

    
}
