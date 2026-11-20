package Q1;

import java.util.ArrayList;
import java.util.Collections;

public class list{

    static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        //adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(4,50);

        System.out.println("After adding elements :"+list);

        list.remove(2);

        System.out.println("After removing element :"+list);

        //search for a value

        int key=30;

        if(list.contains(key)){

            System.out.println(key +"is in the list"+list.indexOf(key));
        }else{

            System.out.println("key is not in the list");
        }


        System.out.println("Max:"+   Collections.max(list));
        System.out.println("Min:"+   Collections.min(list));

        //sort
        System.out.println("Before sorting "+list);
        Collections.sort(list);
        System.out.println("After sorting in ascending order "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After sorting in descending order "+list);


    }

}
