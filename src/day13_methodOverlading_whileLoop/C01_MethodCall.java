package day13_methodOverlading_whileLoop;

import day12_methodCreation.C03_mEthodOlusturma;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {
        //ilk 15 fibonacci sayisisini yazdirin.
int input=15;
C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);



        //asagida verilen cumleyi tersine cevir.
        String str="Bir kere yaparim , yan gelir yatarim.";
        String terStr= C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(terStr);
        //.miratay rileg nay , mirapay erek riB

        str="Java candir";
        terStr=C07_TerseCevirme.metniTerseCevir(str);
        if (str.equals(terStr)) System.out.println("Palindrome");
        else System.out.println("Palindrome degil.");

        int sayi=23;
        System.out.println(C03_mEthodOlusturma.asalSayiMi(sayi));
        //kullanici true /false dan anlamaz acik sekilde yazalim.
        boolean sonuc=C03_mEthodOlusturma.asalSayiMi(sayi);
        if(sonuc) System.out.println("girilen "+sayi+" asal. ");
        else System.out.println("girilen "+sayi+" asal degildir. ");

    }

}
