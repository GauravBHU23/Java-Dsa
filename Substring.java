public class Substring {
    public static  String Substring1(String str , int si, int ei){
    String subStr = ""; 
        for(int i = si; i<ei; i++){
           subStr = subStr + str.charAt(i); 
        }
        return subStr;

    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(Substring1(str,0,5));
    }
    
}
