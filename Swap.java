public class Swap {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is the value of : "+a);
        System.out.println("b is the value of : "+b);

    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

       swap(a,b);
    }
}
