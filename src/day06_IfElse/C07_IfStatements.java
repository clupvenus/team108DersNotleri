package day06_IfElse;

import java.util.Scanner;

public class C07_IfStatements {
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

        if(kartVarMi=='E' && urunAdedi>10)
        {
            System.out.println("%20 indirimli toplam fiyat "+(urunAdedi*listeFiyati*0.80));
        }else if (kartVarMi=='E'&& urunAdedi>0){
            System.out.println("%15 indirimli toplam fiyati "+(urunAdedi*listeFiyati*0.85));

        }
        else if (kartVarMi=='H' && urunAdedi>10) {
            System.out.println("%15 Indirimli fiyat "+(urunAdedi*listeFiyati*0.85));

        } else if (kartVarMi=='H' && urunAdedi>0) {
            System.out.println("%10 Indirimli fiyat " + (urunAdedi * listeFiyati * 0.90));

        }else {
            System.out.println("Gecersiz bilgi.");
        }
    }
}
