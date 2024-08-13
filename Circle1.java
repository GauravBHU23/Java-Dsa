 class Shape{
    protected void display() {
        System.out.println("Display-Base");
    }
}

public class Circle1 extends Shape {
    @Override
    public void display() {
        System.out.println("Display-Derived");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle1();

        shape.display(); // Should print "Display-Base"
        circle.display(); // Should print "Display-Derived"
    }
}
