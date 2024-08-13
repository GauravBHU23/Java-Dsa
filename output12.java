import java.util.*;
class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(
            (a.real * b.real) - (a.imag * b.imag),
            (a.real * b.imag) + (a.imag * b.real)
        );
    }


    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}
    public class output12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the VaLue of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of i: ");
        int i = sc.nextInt();
        System.out.println("Enter the VaLue of a1: ");
        int a1 = sc.nextInt();
        System.out.println("Enter the Value of i1: ");
        int i1 = sc.nextInt();
         sc.close();

        Complex c1 = new Complex(a,i);
        Complex c2 = new Complex(a1,i1);

        Complex sum = Complex.add(c1, c2);
        Complex difference = Complex.diff(c1, c2);
        Complex product = Complex.product(c1, c2);

        System.out.print("Sum: ");
        sum.printComplex();
        System.out.print("Difference: ");
        difference.printComplex();
        System.out.print("Product: ");
        product.printComplex();
    }
}

