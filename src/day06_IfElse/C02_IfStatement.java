package day06_IfElse;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        // uc kenar uzunlugunu al ve iki kenar esitse eskenar yoksa degil yazidr
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Ucgenin kenar uzunluklarini giriniz.");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

       /* Bu benim cozumum.
       if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3) {
            System.out.println("ikizkenar ucgendir.");

        } else {
            System.out.println("ikizkenar ucgen degil");
        }
   */
        if ((kenar1==kenar2 && kenar1!=kenar3)||(kenar2==kenar3 && kenar1!=kenar3)||(kenar1==kenar3 && kenar2!=kenar3)) {
            System.out.println("Ikizkenar ucgen");
        }else{
            System.out.println("Ikizkenar ucgen degildir");
        }


    }

}