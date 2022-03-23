package content14;

public class Change {


    // floating point -> kayan nokta. // monetary
    public static void main(String[] args) {

        /*
         * 1
         *
         * 0.10
         * 0.20
         * 0.30
         * 0.40
         */

        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
