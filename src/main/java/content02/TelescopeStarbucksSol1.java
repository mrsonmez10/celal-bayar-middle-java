package content02;

public class TelescopeStarbucksSol1 {

    // Must
    private String kahveBoyutu; // Tall - Grande s

    // Optional
    private boolean yumusatıcı;
    private String süt;

    public TelescopeStarbucksSol1(String kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public TelescopeStarbucksSol1(String kahveBoyutu, boolean yumusatıcı) {
        this.kahveBoyutu = kahveBoyutu;
        this.yumusatıcı = yumusatıcı;
    }

    public TelescopeStarbucksSol1(String kahveBoyutu, boolean yumusatıcı, String süt) {
        this.kahveBoyutu = kahveBoyutu;
        this.yumusatıcı = yumusatıcı;
        this.süt = süt;
    }
}
