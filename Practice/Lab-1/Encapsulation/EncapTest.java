public class EncapTest {
    static void main(String[] args) {
        Person5 p1=new Person5();
       // p1.name="Ibtida Ara";
        p1.setName("Ibtida Ara");
        System.out.println(p1.getName());
        //p1.age=22;
        p1.setAge(22);
        System.out.println(p1.getAge());
        p1.eat();
        p1.talk();
    }


}
