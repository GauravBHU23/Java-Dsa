import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Please Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("The Number is "+palindrome+" is a Palindrome");
        }
        else{
            System.out.println("The Number is "+palindrome+" is Not a Palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while(palindrome!=0){
            int remainder = palindrome % 10;
            reverse = reverse*10+remainder;
            palindrome = palindrome/10;
        }
        if(number == reverse){
            return true;
        }
        return false;
        

    }
    
}
