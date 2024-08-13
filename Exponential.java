import java.util.*;
public class Exponential {
    public static double Exponentialnum(int x,int n ){
        double result =  Math.pow(x,n);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the number of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the Number of n : ");
        int n = sc.nextInt();
        System.out.println("The value of Exponential are : "+Exponentialnum(x,n));
    }
    
    
}
