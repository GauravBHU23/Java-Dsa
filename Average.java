import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of a : ");
        float a = sc.nextFloat();
        System.out.print("Enter the number of b : ");
        float b = sc.nextFloat();
        System.out.print("Enter the number of c : ");
        float c = sc.nextFloat();

        float Average = ((a+b+c)/3);

        System.out.println("The Average of Three Number is : " + Average);
        sc.close();

    }
    
}
