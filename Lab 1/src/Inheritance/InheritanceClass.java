package Inheritance;

class Shape{
    public void display(){
        System.out.println("Shape!");
    }
}

class Circle extends Shape{
    public void display(){
        System.out.println("Circle!");
    }
}



public class InheritanceClass {
    static void main() {
        Circle c1 = new Circle();
        c1.display();
    }
}
