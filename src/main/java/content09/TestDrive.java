package content09;

import java.time.LocalDate;
import java.util.Date;

public class TestDrive {

    public static void main(String[] args) {

        // Mutable Immutable Nedir?
        // Immutable

        // Immutable = Değiştirilemez
        String isim = "Ali";
        System.out.println(isim.toLowerCase());
        System.out.println(isim);

        System.out.println("---------------Çizgi1---------------");

        Date date = new Date();
        System.out.println(date);
        date.setDate(7);
        System.out.println(date);

        System.out.println("---------------Çizgi2---------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plusDays(1));
        System.out.println(localDate);

    }
}
