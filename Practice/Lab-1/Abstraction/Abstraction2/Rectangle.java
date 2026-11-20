public class Rectangle extends Shape {
  //dim1,dim2


    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    //method overidden
    void area(){
        double res=dim1*dim2;
        System.out.println("Rectangle area"+res);
    }
}
