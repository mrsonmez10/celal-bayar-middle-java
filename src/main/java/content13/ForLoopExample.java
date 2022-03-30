package content13;

import java.util.ArrayList;

public class ForLoopExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(65);
        list.add(4);
        list.add(0);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("List items : " + list.get(i));
        }


        System.out.println("------------------------------------------------");


        ArrayList<Integer> list2 = new ArrayList();
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(65);
        list.add(4);
        list.add(0);

        for(Integer value : list2) {
            System.out.println("Items : " + value);
        }

    }
}
