import java.util.*;
import java.lang.Math; 

public class Primeyesyanot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number : ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is Prime");
        }
        else{
            boolean isprime = true;
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime = false;
                }
            }
            if(isprime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not a prime number");
            }
            sc.close();
        }
    }
    
}
