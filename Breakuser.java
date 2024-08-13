import java.util.*;
public class Breakuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for(int i =n; i<=n;i++){
            if(n%10==0){
                break;
            }
            System.out.println(n);
            sc.close();
        }
    
       
    }
       
    
}
