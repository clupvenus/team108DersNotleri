package day03_dataCasting;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        System.out.println(28/5); //5
        System.out.println(29/3);//9
        //java bir bolme isleminde 2 int isleme giriyorsa sonucu int yazdirir.

        int sayi1=25;
        int sayi2=6;
        System.out.println(sayi1/sayi2);
        double dbl1=6;
        System.out.println(sayi1/dbl1);
// kullanicidan iki sayi al ve bu sayilarin bolme sonucunu double olarak yazdir.
        //herhangi birini double yapmaya zorlarsak olur.
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen birbirine bolmek icin iki sayi giriniz");
        int ilksayi= scan.nextInt();
        int ikincisayi= scan.nextInt();
        System.out.println("iki sayinin bolme sonucu :" +(double)ilksayi/ikincisayi);


    }




}
