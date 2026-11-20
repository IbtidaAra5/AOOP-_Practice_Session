package ArrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    static void main(String[] args) {

        ArrayList<Integer>number=new ArrayList<>();
        System.out.println("Size="+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        System.out.println("Array list contains :"+number);

        //System.out.println(number);
        //for each loop
        //for(int x:number){
         //System.out.println(" "+x);
        //}
        // Print using forEach() and lambda
       // number.forEach(
              //  e -> System.out.print(e+ " ")
       // );
        //System.out.println();
        System.out.println("Size="+number.size());

        //iterator
        //Iterator itr=number.iterator();
        //while(itr.hasNext()){
        //    System.out.println(" "+itr.next());
        //}

        //removing elements
        //number.remove(2);
        //System.out.println("After removing Array list contains :"+number);
        //number.removeAll(number);
        //System.out.println("After removing all Array list contains :"+number);

        //number.clear();
        //System.out.println("After clearing Array list contains :"+number);

        //Empty or not
        boolean check=number.isEmpty();
        System.out.println("Array list empty:"+check);

        //contains method
        boolean contain=number.contains(30);
        System.out.println("30 is in the list:"+contain);

        //check index
        int pos=number.indexOf(40);
        System.out.println("The index of 40 is:"+pos);

        //set method->replace
        number.set(3,50);
        System.out.println("After seting Array list contains :"+number);

        int x=number.get(0);
        System.out.println("index 0 :"+x);

    }


}
