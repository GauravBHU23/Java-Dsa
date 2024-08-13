import java.util.*;
public class Primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of Number : ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("Prime number");
        }
        else if(n%2!=0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("The Number is not a Prime number");
        }
        sc.close();
    }
}
