public class Getithterm {
    public static int setIntBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    
    public static void main(String[] args) {
        System.out.println(setIntBit(10,2));
    }   
}
