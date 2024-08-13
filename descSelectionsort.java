public class descSelectionsort {
    public static void SelectionShort(int arr[]){
        for(int turn = 0; turn<arr.length; turn++){
            int minPos = turn;
        for(int j = turn+1; j<arr.length; j++){
            if(arr[minPos] < arr[j]){
                minPos = j;
            }
        }
        int temp = arr[turn];
        arr[turn] = arr[minPos];
        arr[minPos] = temp;
        }
    }
    public static void Printarr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SelectionShort(arr);
        Printarr(arr);
    }
    
}
