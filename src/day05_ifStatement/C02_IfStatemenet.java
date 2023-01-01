package day05_ifStatement;

import java.util.Scanner;

public class C02_IfStatemenet {
    public static void main(String[] args) {
        //kullanicidan bir sayi alip pozitif ise pozitif sayi,
        // 100 ile 999 arasinda ise (sinirlar dahil) pozitif 3 basamakli sayi
        //3 ile bolunebiliyorsa 3ùn kati
        //Birler basamagi 7 ise mukemmel
        //seceneklerinden uygun olanlari yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz.");
        int sayi=scan.nextInt();
        if(sayi>0){
            System.out.println("Sayi pozitif.");

        }
        if(100<=sayi && sayi<=999){
            System.out.println("Pozitif 3 basamakli sayi");
        }
        if (sayi%3==0){
            System.out.println("Sayi 3`un katidir.");
        }
        if (sayi%10==7){
            System.out.println("Mukemmel");
        }
    }
}
