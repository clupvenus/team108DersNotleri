package day06_IfElse;

import java.util.Scanner;

public class C05IfStatement {
    public static void main(String[] args) {
        // ornek105
        /*
        ogrencinin notu 85 ustu aa
        65 ustu bb
        50 ustu cc
        gerisi dd

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");
        double not= scan.nextDouble();
        if(not<0 || not>100){
            System.out.println("Gecersiz not");
        }else if(not>=85){
            System.out.println("Notunuz AA");
        }else if(not>=65) {
            System.out.println("Notunuz BB");
        }
            else if (not >= 50) {
                System.out.println("Notunuz CC ");
            }
            else {
            System.out.println("Notunuz DD, kaldiniz.");
        }



    }
}
