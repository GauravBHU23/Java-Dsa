public class countinue {
    public static void main(String[] args) {
        int i = 1;
        do{
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            
            
        }while(i<=5);
    }
}
