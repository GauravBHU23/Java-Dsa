import java.util.*;
public class Recursivedecrese {

    public static void PrintDecr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
      System.out.print(n+" ");
      PrintDecr(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of n : ");
        int n = sc.nextInt();
        sc.close();
        PrintDecr(n);
    }
    
}
