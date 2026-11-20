package Q2;

import java.util.ArrayList;

public class Test {
    static void main(String[] args) {

        ArrayList<Employee>emp=new ArrayList<>();

        Employee e1=new Employee("Anis","Marketing",60000);
        Employee e2=new Employee("Nayem","IT",45000);
        Employee e3=new Employee("Asnuva","HR",69000);
        Employee e4=new Employee("Arif","Marketing",56000);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);

        //for(Employee e:emp){

           // if(emp.getSalary()>50000){
                //System.out.println(e);
          //  }
        //}

        //int count=0;

        //for(Employee e:emp){
            //if(emp.getName().startsWith("A")){
               // count++;
            //}
        //}

       // System.out.println(count);



    }
}
