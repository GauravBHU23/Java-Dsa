public class Allprimenumber {
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static void PrimeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+"");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeInRange(20);
    }
    }

