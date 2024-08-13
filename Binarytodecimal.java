import java.util.*;
public class Binarytodecimal {
    public static void BinaryNum(int n){
        int myNum = n;
        int pow = 0;
        int decNum = 0;

        while(n>0){
            int lastdigit = n%10;
            decNum = decNum + (lastdigit *(int)Math.pow(2,pow));

            pow++;
            n = n/10;
        }
        System.out.println("Decimal of "+myNum+" = " + decNum);

        

    }
    public static void main(String[] args) {
        System.out.println("Enter the value of Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinaryNum(n);
        sc.close();
    }
    
}
