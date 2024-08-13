import java.util.*;
public class FriendsPairing {
    public static int FriendsPairing1(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = FriendsPairing1(n-1);

        int fnm2 = FriendsPairing1(n-2);
        int pairways = (n-1)* fnm2;

        int totways = fnm1 + pairways;
        return totways;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    System.out.println("The number of Pairing is : " + FriendsPairing1(n));
    sc.close();
}
    
}
