package content01;

public class TestDrive {

    /*
        Constructor vs Static factory
     */

    public static void main(String[] args) {

        Yemek yemek = new Yemek();
        Yemek yemek1 = new Yemek("sıcak");

        Yemek.sıcakYemekuret();

    }
}
