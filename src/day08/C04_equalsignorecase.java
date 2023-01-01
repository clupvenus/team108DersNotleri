package day08;

import java.sql.SQLOutput;

public class C04_equalsignorecase {
    public static void main(String[] args) {
        String str1="Pazar";
        String str2="PAZAR";
        String str3="pazar";
        String str4="PaZaR";

        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str4);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        /*
        Eger kucuk buyuk hassasiyetini onemsemiyorsak equal ignore case kullaniyoruz.
         */
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str3.equalsIgnoreCase(str4));




    }
}
