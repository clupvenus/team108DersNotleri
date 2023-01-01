package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir double bir int alip bunlarin carpimini ve toplammini giriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi giriniz.");
        double dbl= scan.nextDouble();
        System.out.println("lutfen bir tam sayi giriniz.");
        int sayiInt=scan.nextInt();
        System.out.println("Sayilarin carpimi = "+ sayiInt*dbl);
    System.out.println("Sayilarin toplami = "+ (sayiInt+dbl));
}
}
