package day06_IfElse;

import java.util.Scanner;

public class C10_nestedIfStatement {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Urun adedini giriniz.");
        int urunAdedi =scan.nextInt();
        System.out.println("Urunun liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri kartiniz var mi?\n E: Evet, H:Hayir");
        char kartVarMi= scan.next().charAt(0);
        // bu soruda once kart ana degisken olsun.

        if (kartVarMi=='e'||kartVarMi=='E'){
           if(urunAdedi<=0) System.out.println("Gecersiz urun miktari");
           else if(urunAdedi>10) System.out.println("%20 indirimli toplam fiyat "+ urunAdedi*listeFiyati*0.80);
           else System.out.println("%15 indirimli toplam fiyat "+ urunAdedi*listeFiyati*0.85);
        }else if(kartVarMi=='h'|| kartVarMi=='H'){
            if(urunAdedi<=0) System.out.println("Gecersiz urun miktari");
            else if(urunAdedi>10) System.out.println("%15 indirimli toplam fiyat "+ urunAdedi*listeFiyati*0.85);
            else System.out.println("%10 indirimli toplam fiyat "+ urunAdedi*listeFiyati*0.90);

        }else{
            System.out.println("Hatali kart bilgisi");
        }



    }
}
