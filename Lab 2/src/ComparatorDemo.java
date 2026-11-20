import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if(this.id > o.id){
            return 1; // return 1 means swap
        }
        else
            return -1; // return -1 means no swap
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}





public class ComparatorDemo {
    static void main() {
        ArrayList<Student> alS = new ArrayList<>();

        alS.add(new Student(1,"Tanim", 2.9));
        alS.add(new Student(2,"Mahin", 3.5));
        alS.add(new Student(3,"Sabbir", 3.2));
        alS.add(new Student(4,"Rohim", 3.9));
        alS.add(new Student(5,"Karim", 2.1));
        alS.add(new Student(6,"Salman", 1.6));

        // Increase CG by 0.2 of those who have CG under 3.0
        Iterator<Student> itr1 = alS.iterator();
        while(itr1.hasNext()){
            Student s = itr1.next();
            if(s.cgpa < 3){
                s.cgpa+=0.2;
            }
        }

        // Remove students who have CG under 2.00
        Iterator<Student> itr2 = alS.iterator();
        while(itr2.hasNext()){
            Student s = itr2.next();
            if(s.cgpa < 2){
                itr2.remove();
            }
        }

        Collections.sort(alS);

        Iterator<Student> itr = alS.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }
    }
}
