package day35_GenelTekrar;

import java.util.Scanner;

public class C03_PrintfOndalikliSayilar {
    public C03_PrintfOndalikliSayilar() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy = scan.nextDouble();
        double vke = kilo * 10000.0 / (boy * boy);
        System.out.printf("Vucut kitle endeksiniz : %8.1f %n", vke);
        if (vke >= 30.0) {
            System.out.println("Obezsiniz, gec kalmadan kendine ceki duzen vermelisin");
        } else if (vke >= 25.0) {
            System.out.println("Kilolusunuz, rejime baslamalisiniz");
        } else if (vke >= 20.0) {
            System.out.println("Kilonuz normal, boyle devam edin");
        } else {
            System.out.println("zayifsiniz, kilo almalisiniz");
        }

    }
}
