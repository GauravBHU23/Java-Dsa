import java.util.*;
public class UserInput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter The Your Name : ");
       String Name = sc.nextLine();
       System.out.println("The Name is " +Name);
       System.out.println("Enter The Your Full Name : ");
       String FullName = sc.nextLine();
       System.out.println("The Full Name is " +FullName);
       System.out.println("Enter the Any Number : ");
       int number = sc.nextInt();
       System.out.println("The Number is value is : " +number);
       System.out.println("Enter the number of byte : ");
       byte var = sc.nextByte();
       System.out.println("The byte of the : " +var);
       System.out.println("Enter The Float Number : ");
       float num = sc.nextFloat();
       System.out.println("The number Float is the : " +num);
       System.out.println("Enter The Decimal value : ");
       double num1 = sc.nextDouble();
       System.out.println("The Large Decimal Value : " +num1);
       System.out.println("Enter The Number is true ya False : ");
       boolean var1 = sc.nextBoolean();
       System.out.println("The number is true Ya false " +var1);
       System.out.println("Enter The Value of Short Number : ");
       short num2 = sc.nextShort();
       System.out.println("The Short Number is value : " +num2);
       System.out.println("Enter The Value of Long Number");
       long num3 = sc.nextLong();
       System.out.println("The Long Number is the : " +num3);


     sc.close();

    }
    
}
