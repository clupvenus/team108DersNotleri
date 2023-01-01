package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi alin ve toplayin
        //kullanici deger olarak sifira basarsa islemi bitirin.
        int girilenSayi=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Lutfen toplamak uzere bir tamsayi giriniz.");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;


        }while(girilenSayi!=0);
        System.out.println("Girilen sayilarin toplami : "+toplam);
        /*
        while loop ta ilk sart saglanmazsa loop body hic calismaz.
        do while loop da loop body si once calistigi icin sart yanlis olsa da loop body si
        en az bir kere calismis olur.
         */
    }
}
