package content04;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Integer> integer = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            integer.add(i);
            // i = Integer.valueOf(i); // Autoboxing
        }
    }
}
