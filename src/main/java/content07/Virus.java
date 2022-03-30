package content07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Virus {

    public static String virus() {
        String badUrl = "kotuhaber.com";
        GuvenliKod.ANLASMALI_SITELER[0] = badUrl;
        System.out.println(GuvenliKod.haberleriAl(badUrl));


        return "";
    }

    public static void main(String[] args) {
        System.out.println(virus());

    }
}
