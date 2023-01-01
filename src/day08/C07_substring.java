package day08;

public class C07_substring {
    public static void main(String[] args) {
        String str= "Java ogren, isi kap";
        System.out.println(str.length());
        // karakter sayisi 19
        //metnin tam ortasindaki karakter nedir?
        System.out.println(str.charAt(str.length()/2));
        //n
        // son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));//p
        //bir karakteri degil de verilen stringin icerdigi bir metin parcasini elde etmek istersek.
        //ornegin "ogren" kelimesini yazdiralim.
        System.out.println(str.substring(5, 10));
        // substring (bas,bit) methodunda baslangic dahil bitis olarak yazilan haric (exclusive)`dir
        //str dan java kelimesini yazdiralim.
        System.out.println(str.substring(0,4));
        //str dan "kap" yazdiralim.
        System.out.println(str.substring(16,19));
        System.out.println(str.substring(str.length()-3));
        //substring kullanarak sadece j harfini yazdirin.
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,1));
        //substring kullanarak 9. indeksteki harfi buyuk olarak yazdirin.
        System.out.println(str.substring(9, 10).toUpperCase());//n
        System.out.println(str.toUpperCase().charAt(9));//n
        // charAt kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan method kullanmaya devam edebiliriz.
        System.out.println(str.substring(5,5));
        //bunu yazdurdigimizda hicbirsey yazmaz. Yani konsolda bos bir satir olusur.
        System.out.println("=====");

        /*System.out.println(str.substring(4,3));// bunu yazdiramaz. */
       /* System.out.println(str.substring(25,28)); bunu da yazamaz  StringIndexOutOfBoundsException*/
        System.out.println(str.substring(str.length()));
        //bos bir satir yazdi yine
        System.out.println("====");
        /*
        System.out.println(str.charAt(str.length()));
        yazdigimizda hata veriyor ama substring de hiclik yazdiriyor.
         */
    }
}
