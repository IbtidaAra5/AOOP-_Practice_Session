package BasicOOP;

public class Course {
    String courseName;
    int courseId;

    //alt+insert

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
