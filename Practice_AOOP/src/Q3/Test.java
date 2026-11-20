package Q3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    static void main(String[] args) {

        ArrayList<City>c=new ArrayList<>();

        City c1=new City("Dhaka",2200000);
        City c2=new City("Sylhet",1800000);
        City c3=new City("Rajshahi",2000000);
        City c4=new City("Bogura",1500000);
        City c5=new City("Naogaon",900000);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);

        System.out.println("Before sorting :"+c);

        Collections.sort(c);

        System.out.println("After sorting :"+c);

    }
}
