package content06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDrive {

    public static void main(String[] args) {

        // Part1
//        // integer-type
//        System.out.println(10 == 20); //
//        // char-type
//        System.out.println('a' == 'b'); //
//        // char and double type
//        System.out.println('a' == 97.0); //
//        // boolean type
//        System.out.println(true == true);
//
//        System.out.println((int) 'a'); // cast char to int
//        System.out.println('a' == 97); // char is automatically promoted to int
//        System.out.println('a' + 1); // char is automatically promoted to int
//        System.out.println((char) 98); // cast int to char


        String a = "Ali";
        String b = new String("Ali");

        System.out.println(a.equals(b)); // true, false -> 1 , 2


        // Part2
//		DenemeSınıf d = new DenemeSınıf(1, 2);
//		DenemeSınıf d2 = new DenemeSınıf(1, 2);
//		System.out.println(d.equals(d2)); //
//
//
        DenemeSınıf deneme = new DenemeSınıf(10, 11);
        DenemeSınıf deneme2 = new DenemeSınıf(10, 11);

        if (deneme.equals(deneme2))
        	System.out.println("Biz eşitiz"); // 1
        else
        	System.out.println("Biz değiliz"); // 2


//        //  Part3
//        DenemeSınıfOvrd deneme3 = new DenemeSınıfOvrd(10, 11);
//        DenemeSınıfOvrd deneme4 = new DenemeSınıfOvrd(10, 11);
//
//        if (deneme3.equals(deneme4))
//        	System.out.println("Biz eşitiz");
//        else
//        	System.out.println("değiliz");
//
//        System.out.println(deneme4.equals(deneme3));


        // Part 4
//		List<DenemeSınıfOvrd> list = new ArrayList<>();
//		DenemeSınıfOvrd e = new DenemeSınıfOvrd(1, 2);
//		list.add(e);
//		System.out.println(list.contains(new DenemeSınıfOvrd(1, 2)));
//
//
//		List<DenemeSınıf> list2 = new ArrayList<>();
//		DenemeSınıf r = new DenemeSınıf(3, 4);
//		list2.add(r);
//		System.out.println(list2.contains(new DenemeSınıf(3, 4)));



//        // Part5
//		Map<DenemeSınıfOvrd, String> m = new HashMap<>();
//		m.put(new DenemeSınıfOvrd(1, 2), "İlkEleman");
//        System.out.println(m.get(new DenemeSınıfOvrd(1,2)));


    }
}
