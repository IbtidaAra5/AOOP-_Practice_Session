public class Triangle_5 extends Shape_5{
  //area
  double base,height;

    public Triangle_5(double base, double height) {
        this.base = base;
        this.height = height;
    }
    //override
    @Override
    double area() {

        System.out.println("Area of Triangle : ");
        return 0.5*base*height;
    }
}
