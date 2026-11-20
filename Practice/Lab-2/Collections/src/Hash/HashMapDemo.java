package Hash;

import java.util.HashMap;

public class HashMapDemo {
    static void main(String[] args) {

        HashMap<Integer,String>customer=new HashMap<Integer, String>();

        //insert->put
        customer.put(101,"Anis");
        customer.put(102,"Ibtida");
        customer.put(103,"Hanif");

        //print->get

        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));


    }
}
