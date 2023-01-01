package day05_ifStatement;

import java.util.Scanner;

public class C06_ifStatement_soru4 {
    //soru4 kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    //ucgen eskenar ise "ucgen eskenardir." yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarin uzunlugunu giriniz.");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3 && kenar3>0) System.out.println("ucgen eskenardir");
    }
}
