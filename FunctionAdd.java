import java.util.*;
public class FunctionAdd {
    public static int CalculateSum(int a,int b){
       int sum = a+b;
       return sum;
       

    }   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the Number Of b : ");
        int b = sc.nextInt();
        int sum = CalculateSum(a,b);
        System.out.println("Sum is : "+ sum);
    
        sc.close();

    }

    
}
