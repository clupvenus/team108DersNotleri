package day06_IfElse;

import java.util.Scanner;

public class C07_Ifstatement {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu (kg)giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen boyunuzu (cm) giriniz ");
        double boy= scan.nextDouble();
        double vke=kilo*10000/(boy*boy);
        System.out.println("vucut kitle endeksiniz: "+vke);

        if ((kilo*10000)/(boy*boy)>30){
            System.out.println("obezsiniz, gec kalmadan kendinize ceki duzen vermelisiniz.");
        }else if ((kilo*10000)/(boy*boy) >25)
        {
            System.out.println("kilolusunuz, rejime baslayiniz");
        } else if (((kilo*10000)/(boy*boy)>20))
        {
            System.out.println("kilonuz normal, boyle devam edin");
        }else {
            System.out.println("zayifsiniz, kilo almalisiniz");
        }


    }
}
