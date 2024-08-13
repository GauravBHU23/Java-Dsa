import java.util.*;
public class Pencilpen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Pencil of Price : ");
        float Pencil = sc.nextFloat();
        System.out.print("Enter the Pen of Price : ");
        float Pen = sc.nextFloat();
        System.out.print("Enter the Eraser of Price : ");
        float Eraser = sc.nextFloat();

        float total = (Pencil + Pen + Eraser);

        System.out.println("The Bill is total value is : " + total);

        float newtotal = total+(0.18f * total);

        System.out.println("The price & Gst rate of Total is : " + newtotal);
        sc.close();



;    }
    
}
