package day03_dataCasting;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        /*
        char data turunun ekstra bir ozelligi vardir.
        eger matematiksel bir islemde char data turunden bir deger kullanirsaniz
        java o char`in ascii table degerini alir.
         */

        System.out.println('a'+'b');//195 yazdiriyor. 97+98 yapti.

        System.out.println((char)('a'-32));
        //'a'-32 `nin char sonucu nedir?//A yazdirdi. kucuk harften buyuk harfe
        // giderken-32 farkini yaparsak ascii degerini buluyoruz.
        //soru:


        //kullanicidanbir char alip ascii table`dan kullanicinin girdigi char``in sonrasindaki 3 karakteri yazdirin.
        //ornek input:a output:b,c,d
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz.");
        char girilenKarakter=scan.next().charAt(0);
        //nect. da char olmadigindan string aliyoruz sonra charAt(0) seciyoruz ve ilk kelimenin ilk karakterini alir
        //0. index birinci karakter demektir.
        System.out.println((char)(girilenKarakter+1)+" , "+
        (char)(girilenKarakter+2)+","
                +(char)(girilenKarakter+3))
        ;




    }
}
