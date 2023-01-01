package day24_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";


        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.compareTo(sb2));//0
        //0 fark var demek istiyor


        StringBuilder sb3=new StringBuilder("Hava");
        System.out.println(sb1.compareTo(sb3));//2
        //AScii tablosundaki degerlere bakar. Ondan dolayi 2

        sb3=new StringBuilder("Tava");
        System.out.println(sb1.compareTo(sb3));//-10
        // Asci tablosunda t geride oldugu icin -10 yazdiriyor.

        System.out.println(sb3.compareTo(sb1));//10

        sb3=new StringBuilder("Jaka");
        System.out.println(sb1.compareTo(sb3));//11

        sb3=new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3));//-1

        sb3=new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb3));//-7
        //yani equals la degil compare to ile karsilastirir.

       // System.out.println(sb1==str); Farkli data turlerini karsilastirmaz.
        System.out.println(str.equals(sb1));//false
        //equals la karsilastiriyoruz ama false veriyor.
        //compare to da ayni typ ler arasinda calisir farkli data turu kabul etmez.



    }
}
