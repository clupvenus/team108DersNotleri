package day12_methodCreation;

import java.util.Scanner;

public class C05_hesapMakinesi {
    public static void main(String[] args) {
        //kullanicidan iki sayi ve bir islem aliniz.(+,/,*,-)
        //bir method olusturup sayilara istenen islemi uygulayip sonucu bize dondurun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz.");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("Lutfen bir islem giriniz:* / - +");
        char islem = scan.next().charAt(0);
        System.out.println(hesapMakinesi(sayi1, sayi2, islem));
      double sonuc= hesapMakinesi(sayi1,sayi2, '+');
        System.out.println(sonuc);
    }

    public static double hesapMakinesi(double sayi1, double sayi2, char islem) {
        switch (islem) {

            case '+' :
                return sayi1+sayi2;

            case '-' :
                return sayi1-sayi2;

            case '/' :
                return sayi1/sayi2;

            case '*' :
                return sayi1*sayi2;

            default :
                return 0;


        }
    }

}
