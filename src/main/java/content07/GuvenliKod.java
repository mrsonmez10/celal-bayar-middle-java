package content07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Güvenlik açığı var mı?
public class GuvenliKod {

    public static final String[] ANLASMALI_SITELER = new String[] {"http://hızlıguvenlitemizhaber.com",
            "http://engercekciharikahaberler.com"};

    // this method allows untrusted code to connect to allowed sites (only)
    public static String haberleriAl(String url) {
        for(String haberler : ANLASMALI_SITELER) {
            if(url.equals(haberler)) {
                return url;
            }
        }
        return "";
    }
}
