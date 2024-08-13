import java.util.*;
public class Switchnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Choice number : ");
        int number = sc.nextInt();

        switch(number){
            case 1: System.out.println("one");
             break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
             break;
            case 4: System.out.println("Four");
            break;
            default: System.out.println("Can not Find Any Number");
        }
      sc.close();
    }
    
    
}
