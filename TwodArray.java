public class TwodArray {
    public static void main(String[] args) {
        int array[][] = {{4,7,8},{8,8,7}};

        int countofno7 = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                if(array[i][j] == 4){
                    countofno7++;
                }
            }
        }
        System.out.println("Count of 7 is : " +countofno7);
    }
}
