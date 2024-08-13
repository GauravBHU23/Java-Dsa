import java.util.*;
public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Your body Tempreture : ");
        double tempreture = sc.nextDouble();

        if(tempreture>100){
            System.out.println("You have a Fever");
        }
        else{
            System.out.println("You do not have a Fever");
        }
        sc.close();
    }
    
}
