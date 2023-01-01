package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {

    public static void main(String[] args) {
        //kullanicidan iki deger alin ikisinin degerini degistirin
        //sayi 1 20 sayi 2 15 ise kod ile bunlarin degerlerini degistirip sayi1 15 sayi 2 20 olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1 i giriniz.");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen sayi2 i giriniz.");
        int sayi2= scan.nextInt();
        /* sayilarin yerini degistiryi 3 adimda yapiyoruz
        * 1 adim bos bir kova aliyoruz
        * 2. adim 1 sayiyi bos kovaya bosaltiyoruz
        * 3. adim sayi2 yi sayi 1 e aliyoruz
        * sonra bos kovadan sayi2 yi alip sayi 1 e gonderiyoruz. */
        int temp;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;
        System.out.println("sayilarin yerini degistirdim"
        +" \nsayi1 in yeni degeri:  "+sayi1

        +"\n sayi2 nin yeni degeri:   "+sayi2);






    }


}
