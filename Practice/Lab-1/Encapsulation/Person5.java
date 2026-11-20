public class Person5 {
    private  String name;
    private int age;

    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }

    //getter
    public int getAge(){
        return age;
    }
    //setter
    public void setAge(int age){
        this.age=age;
    }

    void eat(){
    System.out.println("Person eats food");
    }

    void talk(){
    System.out.println("Person talks");
    }


}
