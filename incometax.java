import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your Job Salary : ");
        double income = sc.nextDouble();
        double tax;

        if(income<500000){
            tax = income*0;
            System.out.println("Your Salary Tax is " + tax);
        }
        else if(income>=500000 && income<1000000){
            tax = (income*0.2);
            System.out.println("Your Salary Tax is " + tax);
          
        }
        else if(income>1000000){
            tax = (income*0.3);
            System.out.println("Your Salary Tax is " + tax);
           
        }
        else{
        System.out.println("Your Salary tax is not Generate");
           sc.close();
        }
    }
}

    

