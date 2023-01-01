package day24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb.capacity());//20
        System.out.println(sb.length());//4

        sb.trimToSize();
        //atama yapmadigimiz halde bu degisiklik kalici olacak mi?
        //evet cunku mutable.
        //dolayisiyla methodlarla yapilan degisiklik kalici olur.

        System.out.println(sb.capacity());//4

        sb.toString().toUpperCase();//  toString ethodu builder String yazar.

        System.out.println(sb);
        //StringBuilder i Stringe cevirirseniz veya string dondurecek methodlar kullanirsaniz
        //String in inmutable ozelligi devrye girer ve yapilna degisiklikler kalici olmaz.

       // sb=sb.toString().toUpperCase();
        //Atama da yapamayiz. cunku data type lari farkli.
        //Non-primitive data tiplerinde farkli data turunden atamalar yapamazsiniz.
       /* Short sayi1=20;
        Integer sayi2=(Integer)sayi1;*/
        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2);//JAVA
        sb=sb2;
        sb.setCharAt(0,'h');
        System.out.println(sb);//hAVA
        System.out.println(sb.substring(2, 3));//V
        System.out.println(sb);//hAVA
        //yine degisiklik kalici olmaz.

        System.out.println(sb.reverse());//AVAh
        System.out.println(sb);//AVAh
        //bu sefer kalici oldu cunku dondurdugu nesne de builder oldugu icin.


        sb.insert(1,"H ");
        //1. indexe y ekleyecek digerlerine kaykilin diyecek
        System.out.println(sb);//AY VAh
        String uzunMetin=" ETMEK YOK CALISMAK VAR";

        //sb.insert(6," ETMEK YOK CALISMAK VAR",0,10);
        //AH VAh ETMEK YOK
        System.out.println(sb);
        //boyle de yapabiliirz.
        System.out.println(sb.insert(6, uzunMetin, 0, 10));

        System.out.println(sb.indexOf("A", 3));
        //4 4. indekste var
        System.out.println(sb.indexOf("VAh"));
        //3
        System.out.println(sb.lastIndexOf("E", 9));//7

        System.out.println(sb.replace(0, 12, "Sorun"));
        //Sorun YOK

        sb.delete(5,sb2.length());
        System.out.println(sb);//sorun
        //bitis indeksleri dahil degil.



    }
}
