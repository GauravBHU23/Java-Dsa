public class ClearIthBits {
public static int Clearbits(int n, int i){
    int bitMask = (~0)<<i;
    return n & bitMask;
}
public static void main(String[] args) {
    System.out.println(Clearbits(15,2 ));
}
    
}
