public class BitManipulationoddEven {
    public static void OddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        OddEven(4);
        OddEven(7);
    }
    
}
