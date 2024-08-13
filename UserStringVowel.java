import java.util.*;
public class UserStringVowel {

    public static void main(String[] args) {
        System.out.print("Enter the Alphabet of Vowel : ");
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
           int count = 0;
           sc.close();
        for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch == 'a' || ch== 'e' || ch == 'i' || ch=='o' || ch == 'u'){
            count ++;
        }
    }
    System.out.println("count of vowels is : " + count);
} 
}
