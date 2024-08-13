public class UpdateIthbit {
        public static int clearIntBit(int n ,int i){
            int bitMask = ~(1<<i);
            return n & bitMask;
        }
        public static int setIntBit(int n, int i){
            int bitMask = 1<<i;
            return n | bitMask;
        }
    
    
    
    
    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIntBit(n,i);

        }
        else{
            return setIntBit(n,i);
        }
      
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
    
}
    
    
