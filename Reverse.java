public class Reverse {
    public static void main(String[] args) {
        int n = 23456;
        
       while(n>0){
        int i = n%10;
        System.out.print(i+" ");
        n = n/10;

       }
    }
}
