package Polymorphism;

public class Overloading {
    public void sum(int a, int b){
        System.out.println("First Function");
        System.out.println("Sum : "  + (a+b));
    }
    public void sum(int a, int b, int c){
        System.out.println("Second Function");
        System.out.println("Sum : "  + (a+b+c));
    }
    public void sum(double a, double b){
        System.out.println("Third Function");
        System.out.println("Sum : "  + (a+b));
    }

    // overloading error. Return type doesn't matter here
//    public double sum(double a, double b){
//
//    }

    public static void main(String[] args) {
        Overloading a = new Overloading();
        a.sum(1,2);
        a.sum(1,2,3);
        a.sum(1.2, 2.5);
    }
}


