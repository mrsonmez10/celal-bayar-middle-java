package content16;

public class TestDrive {

    //
    public static String concatenation()
    {
        String result = "";
        String arr[] = {"Ali","Veli","Veli","Veli","Veli","Veli","Veli","Veli","Veli"};

        for (int i = 0; i < arr.length; i++)
        {
            result += arr[i];
        }
        return result;
    }


    public static void main(String[] args) {

        // Hatırlamakta fayda var stringler immutable objelerdir.
        long start = System.nanoTime();
        concatenation();
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
        System.out.println(concatenation());
    }
}
