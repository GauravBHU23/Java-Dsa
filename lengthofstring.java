import java.util.Scanner;

public class lengthofstring {
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String Value : ");
        String str = sc.next();
        System.out.println(length(str));
        sc.close(); 
    }
    
}
