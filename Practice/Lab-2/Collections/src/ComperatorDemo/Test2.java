package ComperatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    static void main(String[] args) {

        ArrayList<Student>students=new ArrayList<>();

        Student s1=new Student(110,"Mithila",3.7);
        Student s2=new Student(112,"Mahim",3.9);
        Student s3=new Student(117,"lamia",2.9);
        Student s4=new Student(115,"Mithila",3.5);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("Before sort...");

        for (Student s:students){
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("After sort...");

        for (Student s:students){
            System.out.println(s);
        }


    }
}
