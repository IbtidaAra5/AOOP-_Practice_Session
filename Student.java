package BasicOOP;

import java.util.Arrays;

public class Student {
    String studentName, email;
    int studentID;
    Course[] courses;
    int courseTaken = 0;

    public Student(String studentName, String email, int studentID) {
        this.studentName = studentName;
        this.email = email;
        this.studentID = studentID;
        this.courses = new Course[5];
    }

    public void addCourse(Course c){
        this.courses[courseTaken] = c;
        courseTaken++;
        System.out.println("Course " + c.courseName+ " added successfullly");

    }

    public void showCourse(){
        for(Course c : courses){
            if(c!= null)
                System.out.println(c.courseId+" "+ c.courseName+ "\n");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", studentID=" + studentID +
                ", courses=" + Arrays.toString(courses) +
                ", courseTaken=" + courseTaken +
                '}';
    }
}
