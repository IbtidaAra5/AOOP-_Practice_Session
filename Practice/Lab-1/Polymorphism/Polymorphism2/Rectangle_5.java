public class Rectangle_5 extends Shape_5{

    //area
    double length,width;

    public Rectangle_5(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //override


    @Override
    double area() {
        System.out.println("Area of Rectangle : ");
        return length*width;
    }
}
