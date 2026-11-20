public class Circle extends Shape{
    //dim1,dim2
    //area=3.1416*r*r
    public Circle(double r) {
        super(r,r);
    }

    //method overidden
    void area(){
        double res=3.1416*dim1*dim2;
        System.out.println("Circle area"+res);
    }

}
