import java.util.*;
public class forloopsQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i = n; i<=n; i++){
            if(n%10==0){
                continue;
            }
            System.out.println(n);
            sc.close();
        }
        
    }
}
