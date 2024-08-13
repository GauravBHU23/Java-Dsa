import java.util.*;
public class Output8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int evenSum = 0;
        int oddSum = 0;
              
        do{
            System.out.println("Enter the Value of n : ");
            int n = sc.nextInt();
            if(n%2==0){
                evenSum = evenSum+n;
            }
            else{
                oddSum = oddSum+n;
            }
            System.out.println("Do you Want to Countinue ? 1 for yes or 0 for no ");
            choice = sc.nextInt();

        }while(choice==1);

        System.out.println(""+evenSum);
        System.out.println(""+oddSum);
        sc.close();
    }
}
