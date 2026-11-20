package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    static void main(String[] args) {

        ArrayList<Integer>num1=new ArrayList<>();
        ArrayList<Integer>num2=new ArrayList<>();
        ArrayList<Integer>num3=new ArrayList<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);

        System.out.println("number 1= "+num1);

        num2.add(1);
        num2.add(2);
        num2.add(3);
        num2.add(4);

        System.out.println("number 2= "+num2);


        num3.addAll(num1);
        System.out.println("number 3= "+num3);

        //check equality
        boolean res=num1.equals(num2);
        System.out.println("Number 1 equal Number 2 "+res);//false

        boolean res2=num1.equals(num3);
        System.out.println("Number 1 equal Number 3 "+res2);//true


    }
}
