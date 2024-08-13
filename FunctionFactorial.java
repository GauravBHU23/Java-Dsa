public class FunctionFactorial {
    public static int Factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
            return fact;

        }
        public static void main(String[] args) {
        
            int num = Factorial(0);
            System.out.println(num);
    }
   
    
}