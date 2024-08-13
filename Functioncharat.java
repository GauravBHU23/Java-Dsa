public class Functioncharat {
    public static void Printletter(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        String str1 = "Gaurav";
        String str2 = "Kumar";
        String str3 = str1 + str2;

        Printletter(str3);
    }
    
}
