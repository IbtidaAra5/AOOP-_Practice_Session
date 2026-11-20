package ListDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {

    static void main(String[] args) {

        LinkedList<String>country_names=new LinkedList<>();

        //adding elements
        country_names.add("Afganisthan");
        country_names.add("Bangladesh");
        country_names.add("India");
        country_names.add("Pakitan");
        country_names.add("Nepal");
        country_names.add(5,"Brazil");
        country_names.addFirst("Australia");
        country_names.addLast("Japan");

        //removing elements
        //country_names.remove("Japan");
        //country_names.remove(7);
        //country_names.removeFirst();
        //country_names.removeLast();

        //System.out.println(country_names);

        System.out.println("First elment "+country_names.getFirst());
        System.out.println("Last elment "+country_names.getLast());

        //for each loop
        for(String c:country_names){
            System.out.println(c);
        }

        System.out.println("size of the linked list :"+country_names.size());
        System.out.println("First elment :"+country_names.getFirst());
        System.out.println("Last elment :"+country_names.getLast());

        country_names.clear();
        System.out.println(country_names);






    }

}
