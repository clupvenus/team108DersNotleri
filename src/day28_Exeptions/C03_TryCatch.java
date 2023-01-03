package day28_Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    /*
    kullanicidan toplamak uzere sayilar alin
    kullanicinin islemi bitirmesi icin q ya basmasini isteyin.
    kullanici q ya bastiginda toplam kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int girilenSayi = 0;
        int sayiAdedi = 0;
        int sayilarToplami = 0;
        while (sayiAdedi < 10000) {
            try {

                System.out.println("toplam icin tamsayi giriniz."
                        + "\n bitirmek icin q ya basin");
                girilenSayi = scan.nextInt();
                sayilarToplami += girilenSayi;
                sayiAdedi++;

            } catch (InputMismatchException e) {
                String girilenDeger = scan.nextLine();
                if (girilenDeger.equalsIgnoreCase("Q")) {
                    System.out.println("Girilen " + sayiAdedi + " sayinin toplami " + sayilarToplami);
                    break;
                } else System.out.println("Gecersiz input");
            }


        }

    }
}