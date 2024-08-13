public class Forloopsreverse {
    public static void main(String[] args) {
        int n = 223432;
       int  i = 0;
        for(; n!=0; n= n/10){
            int p = n%10;
            i = i*10+p;
            
           
        }
        System.out.println(i);
    }
}
