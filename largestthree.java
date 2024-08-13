import java.util.*;
public class largestthree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Value of the number : ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Value of the number : ");
        int b = sc.nextInt();
        System.out.println("Enter The Three Value of the number : ");
        int c = sc.nextInt();
         if((a>=b) && (a>c)){
            System.out.println("The Number is the Largest Value is " + a);
         }
         else if(b>=c){
            System.out.println("The Number is Largest of " + b);
         }
         else{
            System.out.println("The Number is the Largest Value is " + c);
         }
         sc.close();
    } 
    
}
