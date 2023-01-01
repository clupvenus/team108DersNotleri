package day03_dataCasting;

import java.util.Scanner;

public class C06_dataCastingS0ru5 {
    public static void main(String[] args) {

        // soru 5 kullanicidan bir double bir tamsayi alin'double sayiyi tam sayiya bolup
        //sonucu tam sayi olarak yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir double sayi giriniz.");
        double sayiDbl = scan.nextDouble();
        System.out.println("Lutfen bir tam sayi aliniz.");
        int sayiInt=scan.nextInt();
        System.out.println((sayiDbl / sayiInt));// boyle sayi double olur
        System.out.println((int)(sayiDbl / sayiInt));// boylece int olarak yazdirir.

    }
}
