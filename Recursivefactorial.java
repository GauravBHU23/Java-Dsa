import java.util.*;
public class Recursivefactorial {
   public static int fact(int n){
    if(n==0){
        return 1;
    }
    //int fnm1 = fact(n-1);
    int fn = n*fact(n-1);
    return fn;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of factorial : ");
    int n = sc.nextInt();
    System.out.println(fact(n));
    sc.close();
   }

}
