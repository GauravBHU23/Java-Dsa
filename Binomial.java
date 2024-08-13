public class Binomial {
    public static int Factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int Binomialcoff(int n , int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int Factorial_nmr = Factorial(n-r);

        int Binomial = fact_n/(fact_r*Factorial_nmr);
        return Binomial;



    }
    public static void main(String[] args) {
        System.out.println(Binomialcoff(5, 2));
    }
}

