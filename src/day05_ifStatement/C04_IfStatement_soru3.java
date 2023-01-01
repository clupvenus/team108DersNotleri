package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement_soru3 {
    public static void main(String[] args) {
        /*soru3- kullanicidan bir sayi alin.
        sayi 3 ile bolunebiliyorsa "uc ile bolunebilen sayi"
        5 ile bolunebiliyorsa "bes ile bolunebilen sayi"yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz.");
        int girilenSayi= scan.nextInt();
        if(girilenSayi%3==0) System.out.println("uc ile bolunebilen sayi");

        if (girilenSayi%5==0) System.out.println("bes ile bolunebilen sayi");
        //if cumlelerinde sart parantezinden sonra body kullanmazsak ilk noktali virgule kadar olan kismi
        // body olarak kabul eder. yani sadece bir satir kodu body olarak kabul eder.

        //eger if body si icin yazilacak kod bir satirdan gfazlaysa mutlaka curly bracels kullanilmalidir.
    }
}
