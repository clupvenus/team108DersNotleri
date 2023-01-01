package day07_ternary_switchstatement;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
        teranry isleminin sonucunu yazdircaksak
        boolean sartin true veya false olmasi durumunda yazdiracagimiz datalar
        farkli data turunde olabilir
        ancak atama yapacaksak atayacagin variablein data turune uygunolmalidir.
         */
        int sayi=2;
        System.out.println(sayi>10 ? "buyuk sayi" : sayi+2);
        /*
        int b=2
         b>10 ?  "buyuk sayi": b+2;
         bu olmaz cunku bir deger string
         */


    }
}
