public class Triangle extends Shape{

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    //method overidden
    void area(){
        double res=0.5*dim1*dim2;
        System.out.println("Triangle area"+res);
    }



}
