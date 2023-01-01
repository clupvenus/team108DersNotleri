package day03_dataCasting;

import java.util.Scanner;

public class C08_sayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan 4 basamakli pozitif tam sayi alin
        //sayinin rkamlar toplamini ulun.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi yaziniz.");
int girilenSayi= scan.nextInt(); //2457 olsun
// soru icin variable lari hazirlayalim
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        // sirasiyla her bir basamagi elde edip rakamlar toplamini ekleyelim.
        birlerBasamagi=girilenSayi%10;//7
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//0+7=7
        girilenSayi=girilenSayi/10;//245

        birlerBasamagi=girilenSayi%10;//5
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//7+5=12 oldu
        girilenSayi=girilenSayi/10;//24

        birlerBasamagi=girilenSayi%10;//4
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//12+4=16
        girilenSayi=girilenSayi/10;//2

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//16+2=18
        girilenSayi=girilenSayi/10;//0

        System.out.println(rakamlarToplami);







    }
}
