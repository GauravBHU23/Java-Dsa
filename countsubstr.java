import java.util.*;
public class countsubstr {
    public static int countSubstr(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = countSubstr(str, i+1, j, n-1) + 
        countSubstr(str, i, j-1, n-1) - countSubstr(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Count String is : ");
        String str = sc.next();
        int n = str.length();
        System.out.println(countSubstr(str, 0, n-1, n));
        sc.close();
    }
    
}
