package day03_dataCasting;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        double dbl=23.5;
        int sayi=(int)dbl;
        // biz sorumlulugu alip int olarak yazdirmaya zorlamak icin () kullandik.

        System.out.println(sayi);
        //int yazdirmaya zorladik. bu durumda sadece int olan kismi aldi.

        byte byt=(byte)sayi;
        System.out.println(byt);
// int i byte yine biz sorumlulugu alarak cevirdik.
          sayi=130;
          byt=(byte)sayi;
          //int daha kapsamli oldugu icin otomatik atama yapmaz. bizden mudahale ister.

        System.out.println("int 130`un byte hali= "+byt); //-126 yazdi







    }
}
