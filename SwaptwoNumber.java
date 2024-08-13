public class SwaptwoNumber {
    public static void main(String[] args) {
        int x = 3; int y = 4;
        System.out.println("Before Swap number : x  = "+x+" and y = " +y);
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swap number  : x  = "+x+" and y = " +y); 
        
    }
    
}
