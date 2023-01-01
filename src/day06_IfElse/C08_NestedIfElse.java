package day06_IfElse;

import java.util.Scanner;

public class C08_NestedIfElse {

    public static void main(String[] args) {
         //soru1Soru 1- Kullanicidan cinsiyetini ve yasini alin,
                  // Kadin, 60 yas ve uzeri ,
                  // Erkek 65 yas ve uzeri emekli olabilir.
                  // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
                  // Yil daha calisman gerekir” yazdirin.
    /*
    EGER DEGISKEN SAyiniz birden fazla ise degiskenlerden birnin oncelige alarak ona gore bir if else yapisi kurulur
    ornegin bu soruda cindiyeti ana degisken yapalim.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz.\n K:Kadin,E:Erkek");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lutfen tamsayi olarak yasinizi giriniz.");
        int yas = scan.nextInt();

        if (cinsiyet=='K'||cinsiyet=='k') {
            if (yas<18|| yas>80) System.out.println("Gecersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olabilmen icin "+(60-yas)+" yil daha calismalisiniz");

        }
        else if(cinsiyet =='E'||cinsiyet=='e'){
            if (yas<18|| yas>80) System.out.println("Gecersiz yas");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olabilmen icin "+(65-yas)+" yil daha calismalisiniz")  ;
            }
        else{
            System.out.println("Cinsiyet bilgisi hatali");
        }







    }
}
