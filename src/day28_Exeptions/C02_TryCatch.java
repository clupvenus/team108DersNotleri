package day28_Exeptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
        Try-Catch bloklarinin amaci riski 0 yapmak degil. kodun iyi analiz yapip javanin
        cozemeyecegi durumlarda ne yapmasini istedigimizi
        kenidisine soylemektir.

        Java try blogunda bas edemeyecegi bir sorunla karsilasirsa siz o sorunu deklare edinceye kadar
        yani catch satirina kadar calismayi durdurur.
        bu durumda sorun olan satir ile catch satiri arasindaki kodlar calismaz.

         */
        //kullanicidan iki tamsayi alip sayilari birbirine bolup sonucu yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Biribirine bolmek icin 2 tamsayi giriniz.");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();


        try {
            System.out.println("iki sayinin bolumu : "+sayi1/sayi2);
            System.out.println("Kontrol1");
            System.out.println("Kontrol2");
            System.out.println("Kontrol3");
        } catch (ArithmeticException e) {
            System.out.println("Bolen sayi sifir olmasin");
            e.printStackTrace();
        }
        System.out.println("Devam");

    }
}
