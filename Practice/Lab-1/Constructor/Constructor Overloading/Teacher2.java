public class Teacher2   {

    String name;
    String taken_course;
    int teacher_id;

    public Teacher2(){

        System.out.println("No Information");

    }

    public Teacher2(String name,String taken_course){

        this.name=name;
        this.taken_course=taken_course;

    }

    public Teacher2(String name,String taken_course,int teacher_id){

        this.name=name;
        this.taken_course=taken_course;
        this.teacher_id=teacher_id;
    }



    void displayinfo(){

        System.out.println("Name :"+name);
        System.out.println("Taken_Course :"+taken_course);
        System.out.println("Teacher_Id :"+teacher_id);

    }


}
