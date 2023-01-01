package day13_methodOverlading_whileLoop;

import java.util.Scanner;

public class C06_sifreKontrolu {
    public static void main(String[] args) {
         /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali.
         */
        //sifre kontrolunu bir methodla yapip ture false dondurun.
        //main methodda donen sonucu kontrol edip
        //basari ile olusturuldu yazincaya kadar sifreyi tekrar tekrar isteyin.
        Scanner scan= new Scanner(System.in);
        boolean tekrarSifreISte=true;
        String sifre="";
        while(tekrarSifreISte){
            System.out.println("Lutfen sifrenizi giriniz.");
            sifre=scan.nextLine();
           if( sifreKontrolEt(sifre)){
               //sifre kontrol et true ise sifre basarili demektir.
               System.out.println("basari ile olusturuldu.");
               // yada break;
               tekrarSifreISte=false;
           }
        }

    }
    public static boolean sifreKontrolEt(String sifre) {
        int flag = 0;
        //- ilk harf kucuk harf olmali
        if (!('a' <= sifre.charAt(0) && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        //  - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        //  - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println(" sifre bosluk icermemeli");
            flag++;
        }
        //  - uzunlugu en az 10 karakter olmali.
        if (!(sifre.length() > 10)) {
            System.out.println("- uzunlugu en az 10 karakter olmali.");
            flag++;
        }
        if(flag==0){
        return true;}
        else{
            return false;
        }
    }
    }



