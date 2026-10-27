package BasicOOP;

public class OOPMain {
    public static void main(String[] args) {
        Course c1 = new Course(2201, "AOOP");
        Student s1 = new Student(
                "Rahim",
                "r@bscse.uiu.ac.bd",
                0112310001);

        s1.addCourse(c1);
        System.out.println(s1);

        Course c2 = new Course(4521, "Web Programming");
        s1.addCourse(c2);

        s1.showCourse();
    }
}
