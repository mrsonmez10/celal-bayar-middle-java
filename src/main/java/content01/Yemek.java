package content01;

public class Yemek {

    private String name;

    public Yemek() {

    }

    public Yemek(String name) {
        this.name = name;
    }

    public static Yemek uret(boolean soguk) {
        return soguk ? new Dondurma() : new Pide();
    }

    public static Yemek sıcakYemekuret() {
        return new Pide();
    }
}
