package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //kullanicidan verileri alip asagidaki firmatta yaziniz.
        Scanner scan= new Scanner(System.in);
        System.out.println(" lutfen isminiz yaziniz.");
        String girilenIsim= scan.nextLine();
        System.out.println("lutfen soy isminizi giriniz.");
        String girilenSoyisim =scan.nextLine();
        System.out.println("lutfen yasinizi giriniz.");
        int girilenYas = scan.nextInt();
        // alt alta yazdirmakicin
        System.out.println("isminizi : "+girilenIsim+
                           "\nsoy isminiz :   " +girilenSoyisim+
                            "\nyasiniz:   "+girilenYas+
                "\n Kaydiniz basariyla yapilmistir."

                );
    }
}
