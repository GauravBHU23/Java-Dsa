public class RowSum {
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;

        for(int j = 0; j<nums[0].length; j++){
            sum = sum + nums[1][j];
        }
        System.out.println("The sum of row is : "+sum);
    }
    
}
