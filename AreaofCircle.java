import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radius");
        float radius = sc.nextFloat();
 
        float area = (3.142f*radius*radius);

        System.out.println("The Area of Circle is : " +area);

        sc.close();

    }
    
}
