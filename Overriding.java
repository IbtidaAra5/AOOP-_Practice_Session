package Polymorphism;

class Mentor {
    String name;

    public Mentor(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println("Mentor's name: "+ this.name);
    }

    // You cannot override final methods
    final void teach(){
        System.out.println("Mentor is teaching.");
    }
}
class Student extends Mentor {
    String name;

    public Student(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public void showName(){
        System.out.println("Student's name: "+this.name);
        System.out.println("Mentor's name: "+ super.name);
    }


}

class Overriding{
    public static void main(String[] args) {
        Mentor m1 = new Mentor("David Sir");
        Student s1 = new Student("David Sir","Rahim");

        m1.showName();
        s1.showName();
    }
}
