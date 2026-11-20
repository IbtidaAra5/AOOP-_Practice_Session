package ArrayDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

    static void main(String[] args) {

        ArrayList<Integer>num=new ArrayList<>();

        //adding elements
        num.add(20);
        num.add(-3);
        num.add(18);
        num.add(92);
        num.add(0);
        num.add(2);
        //print elements
        System.out.println("before sorting :"+num);

        Collections.sort(num);//sort
        System.out.println("after sorting in ascending order :"+num);

        Collections.sort(num, Collections.reverseOrder());
        System.out.println("after sorting in descending order :"+num);




    }

}
