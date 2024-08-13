public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "GauravKumar";
        myAcc.setPassword("Gaurav@2580");

    }
    
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
        System.out.println(password);
    }
}
// class Pen {
//     String Color;
//     int tip;
//     void setColor(String newColor){
//         Color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }
// class student{
//     String name;
//     int age;
//     float percentage;

//     void CalculatePercentage(int phy,int che,int math){
//         percentage = (phy+che+math) /3;
//     }
//}

class Pen {
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;


    }
    void setTip(int newTip){
        tip = newTip;
    }

        
    }

