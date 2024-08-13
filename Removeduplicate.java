import java.util.*;
public class Removeduplicate {
    public static void removeduplicate(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println("The duplicate String is : " +newStr);
             return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeduplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a' ] = true;
            removeduplicate(str, idx+1, newStr.append(currChar), map);
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value : ");
        String str = sc.next();
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
        sc.close();
        
    }
    
}
