package content02;

public class BuilderStarbucksSol3 {
    // Gerekli
    private final String kahveBoyutu;

    // Seçime göre değişir
    private final String laktozsuzSütMiktarı;
    private final String yumuşatıcı;

    public String getKahveBoyutu() {
        return kahveBoyutu;
    }

    public String getLaktozsuzSütMiktarı() {
        return laktozsuzSütMiktarı;
    }

    public String getYumuşatıcı() {
        return yumuşatıcı;
    }

    public static class Builder {

        // Gerekli
        private final String kahveBoyutu;

        // Seçime göre değişir
        private String laktozsuzSütMiktarı;
        private String yumuşatıcı;

        public Builder(String kahveBoyutu) {
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktozsuzTayfa(String laktozsuzSut)
        {
            laktozsuzSütMiktarı = laktozsuzSut;
            return this;
        }

        public Builder yumuşakİçenler(String yumuşakDeğer)
        {
            yumuşatıcı = yumuşakDeğer;
            return this;
        }


        public BuilderStarbucksSol3 build()
        {
            return new BuilderStarbucksSol3(this);
        }

    }

    public BuilderStarbucksSol3(Builder builder) {
        // TODO Auto-generated constructor stub
        kahveBoyutu = builder.kahveBoyutu;
        laktozsuzSütMiktarı = builder.laktozsuzSütMiktarı;
        yumuşatıcı = builder.yumuşatıcı;
    }
}
