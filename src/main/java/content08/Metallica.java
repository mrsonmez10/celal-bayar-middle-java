package content08;

public class Metallica {

    // 1-> Doğrudan erişilebilirliği kes
    // 2-> verilerimde kontrol sağlıyorum.
    // 3-> Read only
    // 4-> write only

    private String grupAdı;
    private int grupUyeSayısı;

    public Metallica(String grupAdı, int grupUyeSayısı) {
        this.grupAdı = grupAdı;
        this.grupUyeSayısı = grupUyeSayısı;
    }

    public String getGrupAdı() {
        return grupAdı;
    }

    public void setGrupAdı(String grupAdı) {
        this.grupAdı = grupAdı;
    }

    public int getGrupUyeSayısı() {
        return grupUyeSayısı;
    }

    public void setGrupUyeSayısı(int grupUyeSayısı) {
        if(grupUyeSayısı < 0) {
            System.out.println("olmaz");
        }
        this.grupUyeSayısı = grupUyeSayısı;
    }
}
