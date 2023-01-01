package day13_methodOverlading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
        Random olarak 1 ile 100 arasinda bir sayi olusturun.
        Kullanicidan bu sayiyi bilmesini isteyelim.
        Kullanici her deger girdiginde
        Tuttugumuz sayi ile karsilastirip tahmini buyult/kucult diyelim.
        kullanici tuttugumuz sayiyi bildiginde
        -3 veya daha az tahminde bildiyse "Vaoowww"
        - 4-8,tahminde bildiyse "Aferin"
        -Daha fazla tahminde bildiyse "Basarisiz"
         */
        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);
        int sayac = 1;
        int tahmin = 0;
        Scanner scan = new Scanner(System.in);
        while (tutulanSayi != tahmin) {
            System.out.println("Lutfen bir tahmin giriniz.");
            tahmin = scan.nextInt();
            if
            (tutulanSayi == tahmin) {
                System.out.println(sayac + " tahmini ile tuttugum sayiyi buldun.");
                if (sayac <= 3) {
                    System.out.println("vaoww");
                } else if (sayac <= 8) {
                    System.out.println("aferin");
                } else System.out.println("basarisiz.");
                break;
            } else if (tahmin < tutulanSayi) {
                System.out.println("sayiyi buyult");
                sayac++;
            }else  {
                System.out.println("sayiyi kucult");
                sayac++;
            }
        }
    }}
