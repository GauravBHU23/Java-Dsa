import java.util.*;
public class Whileloopsfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Natural Number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;

        }
        System.out.println(sum);
        sc.close();
    }
    
}
