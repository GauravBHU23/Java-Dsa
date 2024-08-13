public class LinearSearch {
    public static int linearSearch(int Number[],int key){
        for(int i=0; i<Number.length; i++){
            if(Number[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int Number[] = {2,4,6,8,10,12,14,16};
        int key = 10;

       int index = linearSearch(Number, key);
       if(index == -1){
        System.out.println("KEY IS NOT FOUND");
       }
       else{
        System.out.println("KEY IS A FOUND :  " +  index);
       }
}
}
