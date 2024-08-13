import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of a : ");
        int a = sc.nextInt();
        System.out.println("Enter The Value of b : ");
        int b = sc.nextInt();


        System.out.println("Enter the Your Expression +,-,*,/,%");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("The Add of Two number is : "+ (a+b));
            break;
            case '-' : System.out.println("The Sub of Two number is : "+ (a-b));
            break;
            case '*' : System.out.println("The Mul of Two number is : "+ (a*b));
            break;
            case '/' : System.out.println("The Div of Two number is : "+ (a/b));
            break;
            case '%' : System.out.println("The Mod of Two number is : "+ (a%b));
            sc.close();
        }
    }
    
}
