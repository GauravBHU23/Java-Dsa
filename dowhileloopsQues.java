import java.util.*;
public class dowhileloopsQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            int n = sc.nextInt();

            if(n%10==0){
                continue;

            }
            sc.close();
            System.out.println(n);
        }while(true);
        
    }
    
}
