import java.util.*;
public class Whileloopsuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Value is : ");
        int i = 1;
        int n = sc.nextInt();
        

        while(i<=n){
            System.out.println(i);
            i++;
            sc.close();
        }


    }
    
}
