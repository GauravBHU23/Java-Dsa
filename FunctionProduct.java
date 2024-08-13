import java.util.*;
public class FunctionProduct {
    public static int ProductCalculate(int a,int b){
        int Product = a*b;
        return Product;

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the Number of b : ");
        int b = sc.nextInt();

      int Product = ProductCalculate(a,b);
      
      System.out.println("The Product of Value : " + Product);
      sc.close();
        
        
    }
    
}
