package day06_IfElse;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        // uc kenar uzunlugunu al ve esitse eskenar yoksa degil yazidr
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Ucgenin kenar uzunluklarini giriniz.");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if(kenar1==kenar2 && kenar2==kenar3 && kenar1>0) {
            System.out.println("Eskenar ucgendir.");

        }else{
            System.out.println("Eskenar degil");
        }
        /*
        if ile baslayan kod else ile bitiyorsa input un tum degerlerini kapsar.
        her deger icin mutlaka kodumuz da bir body calisir.
         */

    }
}
