public class PolymorphismTest_5 {
    static void main(String[] args) {

        //Shape_5 s=new Shape_5();

        //Rectangle_5 r=new Rectangle_5(10,20);

        //Triangle_5 t=new Triangle_5(10,20);

        //System.out.println(s.area());
        //System.out.println(r.area());
        //System.out.println(t.area());

        //dynamic method dispatch
        //Shape_5 s1=new Shape_5();
        //Shape_5 s2=new Rectangle_5(10,20);//ref variable
        //Shape_5 s3=new Triangle_5(10,20);//ref variable

       // System.out.println(s1.area());
       // System.out.println(s2.area());
        //System.out.println(s3.area());


        Shape_5[] s=new Shape_5[3];
        s[0]=new Shape_5();
        s[1]=new Rectangle_5(10,20);
        s[2]=new Triangle_5(10,20);

        for(int i=0;i<3;i++){

            System.out.println(s[i].area());
        }
        //System.out.println(s[0].area());
        //System.out.println(s[1].area());
        //System.out.println(s[2].area());


    }
}
