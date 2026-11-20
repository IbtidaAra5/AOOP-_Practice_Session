import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

class HashTableDemo {

    public static void main(String args[]) {
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        //balance.put("Jane Baker", null); // error
        //balance.put(null, new Double(0)); // error
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);

        // get iterator
        Enumeration<String> itr = balance.keys();
        while (itr.hasMoreElements()) {
            str = itr.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        // iterator shown previously
        Iterator<String> itr1 = balance.keySet().iterator();

        while (itr1.hasNext()) {
            String key = itr1.next();
            System.out.println(key + ": " + balance.get(key));
        }

        String key = "John Doe";
        // Deposit 1,000 into John Doe's account
        bal = balance.get(key);
        balance.put(key, bal + 1000);
        System.out.println(key + "'s new balance: " + balance.get(key));

    }
}
