public class Teacher3 extends Person2{

    //getName(),setName(),getAge(),setAge()
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void diplay(){

        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }

    }
}
