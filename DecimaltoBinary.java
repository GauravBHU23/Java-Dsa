import java.util.Scanner;

public class DecimaltoBinary {
    public static void DectoNum(int n){
        int MyNumber = n;
        int pow = 0;
        int binarynumber = 0;

        while(n>0){
            int rem = n%2;
            binarynumber = binarynumber+(rem*(int)Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary Number Form "+MyNumber+" is :" + binarynumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of number : ");
        int n = sc.nextInt();
        DectoNum(n);

        sc.close();
        
    }
    
}
