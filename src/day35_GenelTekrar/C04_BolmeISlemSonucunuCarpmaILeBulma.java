package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeISlemSonucunuCarpmaILeBulma {
    public static void main(String[] args) {
        //kullanicicdan bolunecek sayi ile bolecek sayiyi alip
        //bolme isleminin sonucunu carpma islemi ile bulan yazdirna bir method olusturun.
        //buislemi kullanici q ya basincaya kadar devam ettirin.


        Scanner scan= new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;
        do {
            System.out.println("Lutfen bolunecek tamsayiyi girin.,\n bitirmek icinQ ya basiniz." );

            try{
               bolunecekSayi=scan.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz.");
                bolenSayi=scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);

            }catch(InputMismatchException e) {
                String girilenStr = scan.nextLine();
                if (girilenStr.equalsIgnoreCase("Q"))
                    devamEdelimMi = false;
                else {
                    System.out.println("Bolunecek sayi tamsayi olmalidir.");
                }
            }



        }while (devamEdelimMi);








    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {
        //boluneck sayi ve bolen sayi negatif veya pozitif olabilir.
        //bu durumda oncelikle isarte kontrolu yapmamiz lazim.
        //isaret sorununu cozmek icin once islem sonucuunun isaretini belirleyip
        //sonr asayilari isaretten bagimsiz hale getirelim.

        int sonucISareti=1;
        if (bolunecekSayi*bolenSayi<0){
            sonucISareti=-1;

        }
        //sonra sayilari isretten bagimsiz hale getirelim
        bolunecekSayi=bolunecekSayi>0?bolunecekSayi:bolunecekSayi*(-1);
        bolenSayi=bolenSayi>=0?bolenSayi:bolenSayi*(-1);

        int bolumSonucu=1;

        while(bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }

        System.out.println("bolme isleminin sonucu: "+bolumSonucu);

    }
}
