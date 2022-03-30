package content13;

import java.util.Iterator;
import java.util.List;

public class TestDrive {

    public static void exec(List<String> n, List<Integer> a) {
        Iterator<String> i = n.iterator();
        while(i.hasNext()) {
            System.out.println(" --> " + i.next());
        }

        Iterator<String> i2 = n.iterator();
        while(i.hasNext()) {
            System.out.println(" --> " + i2.next());
        }
    }

    public static void exec2(List<String> n, List<Integer> a) {

        for (Iterator<String> i = n.iterator(); i.hasNext();) {
            System.out.println(" --> " + i.next() );
        }

        for (Iterator<Integer> i2 = a.iterator(); i2.hasNext();) {
            System.out.println(" --> " + i2.next());
        }
    }


    public static void main(String[] args) {

        List<String> names = List.of("James Hetfield", "Kirk Ham.", "Robert", "Lars", "Cliff");
        List<Integer> ages = List.of(51, 50, 40, 54, 35);

        //exec(names,ages);
        exec2(names,ages);
    }
}