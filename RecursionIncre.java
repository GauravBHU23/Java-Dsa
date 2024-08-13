import java.util.*;
public class RecursionIncre {
    public static void PrintInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
        PrintInc(n-1 );
        System.out.println(n+" ");
      //   PrintInc(n-1 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of n : ");
        int n = sc.nextInt();
        PrintInc(n);
        sc.close();
    }
    
}
