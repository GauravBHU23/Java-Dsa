import java.util.Scanner;

public class Sumofallinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer Value : ");
        int digit = sc.nextInt();
        System.out.println("The Sum is "+ sumDigit(digit));
        sc.close();

        
    }
    public static int sumDigit(int n){
        int sumofdigit = 0;
        while(n>0){
            int lastdigit = n%10;
            sumofdigit = sumofdigit + lastdigit;
            n = n/10;
        }
        return sumofdigit;
    }
    
}
