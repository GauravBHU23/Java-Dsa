import java.util.*;
public class optimizerpower {
    public static int optimizerPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizerPower(a,n/2);
        int halfPowerSq = halfPower*halfPower;

        if(n%2!=0)
{
    halfPowerSq = a*halfPowerSq;
}  
return halfPowerSq;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the number of n : ");
    int n = sc.nextInt();
    System.out.println(optimizerPower(a, n));
    sc.close();
}
    
}
