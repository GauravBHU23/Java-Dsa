public class AdvancePattern1 {
    public static void Inverted_Pyramid(int row){
        for(int i = 1; i<=row; i++){
            for (int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }

            
                for(int j = 1; j<=i; j++){
                
                   System.out.print("*"); 
                }
                
             System.out.println();
                
            }
        
    }


    
    public static void main(String[] args) {
        Inverted_Pyramid(4);
    }
    }



