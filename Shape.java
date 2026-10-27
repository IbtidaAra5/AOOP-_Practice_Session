package Inheritance;

abstract class Shape {
    String shapeName;
    public void showName(){
        System.out.println(shapeName);
    }
    abstract void area();
}

//Interface only contains abstract functions. It cannot have normal functions.
interface draw{
    void drawing();
}

class Circle extends Shape implements draw{
    int radius;

    @Override
    void area() {
        System.out.println("Circle area: " + (3.1416 * radius * radius));
    }

    @Override
    public void drawing() {
        System.out.println("Circle is drawing....");
    }
}

//final class cannot be extended
final class A{

}


class MainCheck{
    public static void main(String[] args) {
        //Abstract class can not have an object
        //Shape s1 = new Shape();
        Circle c1 = new Circle();
        c1.radius = 4;
        c1.area();
        c1.drawing();
    }
}
