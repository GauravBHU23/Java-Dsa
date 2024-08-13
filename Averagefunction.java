import java.util.Scanner;

public class Averagefunction {
    
    public static  double AverageSum(double a, double b,double c){
        double d = (a+b+c)/3;
        return d;
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter the Number of b : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Number of c : ");
        double c = sc.nextDouble();
       
        double d = AverageSum(a,b,c);
        
    System.out.println("The Average of Three Number is : "  +d);
    sc.close();
    
        
    }
    

}
