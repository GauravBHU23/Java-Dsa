import java.util.*;
public class Sumof1stnumber {
    public static int sumoffirst(int n){
        if(n==1){
            return 1;

        }
        int num = sumoffirst(n-1);
        int Sn = n + num;
        return Sn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        System.out.println(sumoffirst(n));
        sc.close();


    }
    
}
