import java.util.*;
public class TowerOfHanoi {
    public static void towerofhanoi(int n , String src,String helper, String dest){
       if(n==1){
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        return;
       }
       towerofhanoi(n-1, src, helper, dest);
       System.out.println("transfer disk " + n + " from " + src + " to " + helper);

       towerofhanoi(n-1, src, helper, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Hanoi Tower : ");
        int n = sc.nextInt();
        towerofhanoi(n, "A","B","C");
        sc.close();
    }
    
}
