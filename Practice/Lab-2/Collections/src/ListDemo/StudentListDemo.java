package ListDemo;

import java.util.LinkedList;

public class StudentListDemo {

    static void main(String[] args) {

        //student linked list
        LinkedList<Student_list>list=new LinkedList<Student_list>();

        //student creation
        Student_list s1=new Student_list(101,"Karim","Eleven");
        Student_list s2=new Student_list(102,"Rahim","Eleven");
        Student_list s3=new Student_list(103,"Habib","Eleven");
        Student_list s4=new Student_list(104,"Rim","Eleven");

        //adding student to the studentlist
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //info display
        for(Student_list s:list){
            System.out.println(s.id+" "+s.name+" "+s.className);
        }













    }
}
