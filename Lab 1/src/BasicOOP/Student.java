package BasicOOP;

public class Student {
    String studentName, studentEmail;
    int studentID;

    Course[] courses = new Course[5];
    int coursesTaken = 0;

    public Student(String studentName, String studentEmail, int studentID) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentID = studentID;
    }

    void addCourse(Course c){
        courses[coursesTaken] = c;
        coursesTaken++;
        System.out.println("Course added!");
    }

    void showCourses(){
        for(int i = 0; i<coursesTaken; i++){
            System.out.println(
                    courses[i].courseID+": "+ courses[i].courseName
            );
        }
    }
}
