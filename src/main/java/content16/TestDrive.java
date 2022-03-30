package content16;

public class TestDrive {

    //
//    public static String concatenation()
//    {
//        String result = "";
//        String arr[] = {"Ali","Veli","Veli","Veli","Veli","Veli","Veli","Veli","Veli"};
//
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i];
//        }
//        return result;
//    }

    public static String sb()
    {
        String arr[] = {"Ali","Veli","Veli","Veli","Veli","Veli","Veli","Veli","Veli"};
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            b.append(arr[i]);
        }
        return b.toString();
    }


    public static void main(String[] args) {

        // Hatırlamakta fayda var stringler immutable objelerdir.
        long start = System.nanoTime();
        // concatenation(); // 21219000
        sb();               // 26800
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println(sb());



    }
}
