package day11_forloops;

import java.util.Scanner;

public class C05_Soru3 {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki
        tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse,
        uyari yazdirip islemi sonlandirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir baslangic degeri giriniz");
        int baslangicDeger=scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis=scan.nextInt();
        System.out.println("****");
        if (bitis > baslangicDeger) {
            int toplam=0;
        for (int i = baslangicDeger; i <=bitis ; i++) {
            toplam += i;
        }
            System.out.print("Sayilarin toplami " +toplam);
        }
        else System.out.println("Baslangic degeri bitis degerinden buyuk olsun");
    }
}
