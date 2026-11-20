package BasicOOP;

public class OOPMain {
    static void main() {
        Course c1 = new Course(1, "AOOP");

        Student s1 = new Student("Rakib",
                "r@g.com",
                101);

        s1.addCourse(c1);
        Course c2 = new Course(2, "Web");
        s1.addCourse(c2);

        s1.showCourses();
    }
}
