import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    static void main() {
        ArrayList<String> al = new ArrayList<>();

        al.add("A");
        al.add("X");
        al.add("Z");
        al.add("R");
        al.add("T");

        al.add(1,"B");
        System.out.println("After adding, size: "+
                al.size());
        al.set(0,"C");

        // Printing using loop
        for(int i=0; i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        // Print using forEach() and lambda
        al.forEach(
                e -> System.out.print(e+ " ")
        );

        al.remove("T");
        al.remove(1);

        System.out.println("\nAfter removing:");
        al.forEach(
                e -> System.out.print(e+ " ")
        );

        System.out.println(al.contains("X"));

        Collections.sort(al);
        System.out.println("After sorting:");
        al.forEach(
                e -> System.out.print(e+ " ")
        );

        al.clear();
        System.out.println("\nAfter clear, size: "+
                al.size());


    }
}
