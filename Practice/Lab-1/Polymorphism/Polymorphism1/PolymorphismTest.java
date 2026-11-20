public class PolymorphismTest {

    static void main(String[] args) {

        Person_5 p=new Person_5();
        p.display();

        //Teacher_5 t=new Teacher_5();
        p=new Teacher_5();
        p.display();
        //Student_5 s=new Student_5();
        p=new Student_5();
        p.display();


        //p.display();
        //t.display();
        //s.display();
    }
}
