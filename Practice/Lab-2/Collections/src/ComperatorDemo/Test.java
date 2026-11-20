package ComperatorDemo;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Test {

    static void main(String[] args) {

        Car c1=new Car("VM","Golf GTE","blue",215);
        Car c2=new Car("Peugeote","308 SW","very blue",207);
        Car c3=new Car("BMW","320i","black",212);
        Car c4=new Car("Tesla","Model s","red",250);

        ArrayList<Car>cars=new ArrayList<>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);

        System.out.println("Before sort...........");
        for(Car c:cars){
            System.out.println(c);
        }

        //sort
        Collections.sort(cars);

        System.out.println("After sort...........");
        for(Car c:cars){
            System.out.println(c);
        }


    }
}
