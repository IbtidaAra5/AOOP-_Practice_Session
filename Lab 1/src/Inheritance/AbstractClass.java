package Inheritance;

abstract class S{
    abstract double area(); //this is an abstract function
    void display(){
        System.out.println("S");
    }
}

class C extends S implements I{
    int radius;
    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    public void check() {
        System.out.println("From interface");
    }
}

interface I {
    void check();
}

final class X{
    int i;
}

public class AbstractClass {
    static void main() {
        C c1 = new C();
        c1.radius = 10;
        System.out.println(c1.area());
    }
}
