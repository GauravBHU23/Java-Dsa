import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The Number is Even Number of " + n);
        } else {
            System.out.println("The Number is odd number of " + n);
        }
        sc.close();

    }

}
