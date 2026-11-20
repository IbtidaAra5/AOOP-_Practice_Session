import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    static void main() {

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(10);
        al2.add(90);
        al2.add(20);
        al2.add(15);
        al2.add(40);

        al2.remove(Integer.valueOf(90));

        //Using Iterator
        Iterator<Integer> itr = al2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }


    }
}
