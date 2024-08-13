import java.util.*;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of Year : ");
        int leap = sc.nextInt();

        if((leap%4==0 && leap%400==0) || (leap%100!=0)){
            System.out.println("The Value of the Leap Year");
        }
        else{
            System.out.println("The number is not a Leap Year");
        }
        sc.close();
    }
    
}
