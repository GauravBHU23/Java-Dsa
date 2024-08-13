import java.util.*;
public class Strings {

    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = sc.next();
        System.out.println("Enter the Full Name : ");
        String name2 = sc.nextLine();
        String name3 = "Gaurav Kumar";
        String str1 = "Saurav";
        String str3 = "Kumar";
        String str4 = "Vikash Kumar";
        sc.close();

        

        // String are immutable
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3.length()); //length find
        System.out.println(str1 + " " +str3); //concentation
        System.out.println(str4.charAt(3)); // Single charecter Print
    }

    
}
