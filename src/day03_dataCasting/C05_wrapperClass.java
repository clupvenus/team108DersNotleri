package day03_dataCasting;

public class C05_wrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candir";
        // int lar non primitive oldugu icin methodlari yoktu. bunun icin java ara formul olarak wrapper class lar olusturmustur
        //bunlar primitive oldigu icin method alabilirler
        // Integer Boolean Charter gibi
        Integer sayi1=20;
        /*
        islemlerimizi yaparken bazen string olarak tanimlanmis ancak matematiksel
         icerik barindran variable lar ile karsilasabiliriz.
         */
        String str2="123";
        String str3="354";
        int str2Int= Integer.parseInt(str2);
        // str2 yi integer a cevirdi.
        int str3Int= Integer.parseInt(str3);
        //simdi iki str yi int e cevirdik. artik toplama yapabiliriz. ya da islem yapabiliriz.
        System.out.println(str2Int+str3Int); //477
        // eger sayi cevirmek istedigimiz metinlerde harf ve sayi olmayan baska karekter varsa java hata verir.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        char krk1='$';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));
        System.out.println(Character.isAlphabetic(krk1));
        char krk2='a';
        System.out.println(Character.isDigit(krk2));
        System.out.println(Character.isLetter(krk2));
        System.out.println(Character.isAlphabetic(krk2));
//soutu otomatik yazdirmak icin kodu yazip  sonra .sout yazinca yazdirir.
        System.out.println("sorusu olan var mi?");

    }
}
