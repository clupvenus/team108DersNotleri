package day07_ternary_switchstatement;

import java.util.Scanner;

public class C01_ifElseif {
    public static void main(String[] args) {
        /*kullanicidan bir tamsayi alin.
        sayi rakam ise "girilen sayi rakam"
        sayi iki basamakli ise "girilen sayi iki basamakli"
        sayi 2 basamaktan buyukse "buyuk sayi yazdirin"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz.");
        int girilenSayi= scan.nextInt();
        if (girilenSayi>=0 && girilenSayi<=9) System.out.println("Girilen sayi rakam");
        else if (girilenSayi>=10 && girilenSayi<=99) System.out.println("Girilen sayi iki basamakli");
        else if (girilenSayi>=100) System.out.println("Buyuk sayi");
       // eger if else sorularinda else ile bitmezse butun durumlari kapsamakz.
        // Bu tur sorulari cozerken sartlarin tamamini yazmak gerekir

    }
}
