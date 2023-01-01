package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //kullanicidan bir sayi isteyelim.
        //sayinin karesini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Karesini almak istediginiz sayiyi giriniz.");
        // nasil sayi girecegini bilmedigimiz icin double alalim
        double girilenSayi=scan.nextDouble();
        System.out.println("sonuc:"+girilenSayi*girilenSayi);
//double normalde nokta kullanir ama kulladiginiz sayiyi kullanmak
// icin virgul kullanmak gerekebilir.
    }
}
