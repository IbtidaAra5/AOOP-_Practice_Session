public class Student {
    String name;
    int id;
    int age;



    //default constructor
    public Student(){
        System.out.println("No value");
    }



//parameterized constructor
    public Student(String name, int id, int age) {

        this.name = name;
        this.id = id;
        this.age = age;
    }

    void displayinfo(){

        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Age :"+age);
    }

    void setinfo(String n,int i,int a){

     name=n;
     id=i;
     age=a;

    }


}
