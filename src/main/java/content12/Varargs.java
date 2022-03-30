package content12;

//Sample uses of varargs (Pages 245-6)
public class Varargs {

    // Simple use of varargs (Page 245)
    static int sum(int a, int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));


    }
}
