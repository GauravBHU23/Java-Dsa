import java.util.*;

public class numchngtostr {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigit(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigit(number / 10);
        System.out.println(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of Number : ");
        int number = sc.nextInt();
        printDigit(number);
        System.out.println();
        sc.close();
    }

}
