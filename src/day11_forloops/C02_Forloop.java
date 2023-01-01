package day11_forloops;

public class C02_Forloop {
    public static void main(String[] args) {
        //input olarak verilen bir stringte indeksi tek sayi olanlari kucuk harfle
        //indeksi cift sayi olanlari buyuk harfle yazdirin.
        //ornek :Java output:JaVa

        String input="Java candir, Selenium heyecandir.";
        for (int i = 0; i < input.length(); i++) {
            System.out.print(i%2==0? input.substring(i,i+1).toUpperCase()   : input.substring(i,i+1).toLowerCase());
        }
    }
}
