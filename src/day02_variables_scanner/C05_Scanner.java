package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanicidan deger almak icin 3 islem yapmamiz gerekir.
        //1. adim scanner objesi olustur.

        Scanner scan= new Scanner(System.in);
        //2. adim kullaniciya ne istedinizi soyleyin.
        System.out.println("isminizi yaziniz.");

        //3. adim kullanicinin girecegi degeri kaydedeceginiz bir variable olusturmalidir.
        // Scan objesi ile ilgili methodu kullanarak kullanicin girdigi degeri
        //olusturdugumuz variable a atayin.
        String girilenIsim= scan.nextLine();
        // sadece next kullanirsak tek isim girilmelidir.
        //birden fazla isim girilecekse nextLine girilir.
        // Artik kullanicinin girdigi deger girilince variable da kayitli
        System.out.println(girilenIsim.toUpperCase());



    }
}
