package day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//
        System.out.println(zaman.getMinute());
        System.out.println(zaman.withSecond(0).withNano(0));//10.11
        System.out.println(zaman.withSecond(0).withNano(1));//10:12:00.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250));//18:23:08.398405500
        //bir loop ile 1 den 10000 e kadar olan sayilari yanyana yazdirin.
        //bu islem icin gecen zamani bulun.
        LocalTime basZamani=LocalTime.now();
        System.out.println("baslangic "+basZamani);//baslangic 10:15:23.320757200
        //baslangic 10:18:14.463337100
        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i+ " ");


        }
        System.out.println("");
        LocalTime bitZamani=LocalTime.now();
        System.out.println("bitis "+bitZamani);//bitis 10:18:14.573507900
        System.out.println("islem suresi :"+(bitZamani.getNano()- basZamani.getNano())+ " nano saniye");
        //islem suresi :86768100 nano saniye
        /*
           Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */

    }
}
