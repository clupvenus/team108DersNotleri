package day08;

import java.util.Locale;

public class C02_StringManipulation {
    public static void main(String[] args) {
        String str= "JAVA CANDIR";
        System.out.println(str.toLowerCase());// java candir.
        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
        //turkce karaktere cevirmek istersek boyle bir kod yazabiliriz.

        str="sevgi insani hayata baglar.";

        //hoca turkce karaktere cevirdi. ama ben ugrasmadim.
        System.out.println(str.toUpperCase());
        str=str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

    }
}
