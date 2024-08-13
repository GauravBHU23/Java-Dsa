import java.util.*;
public class TilingProblem {
    public static int TilingProb(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = TilingProb(n-1);
        int fnm2 = TilingProb(n-2);
        int total = fnm1+fnm2;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        System.out.println("The value of tiling problem is : " +TilingProb(n));
        sc.close();
    }
    
}
