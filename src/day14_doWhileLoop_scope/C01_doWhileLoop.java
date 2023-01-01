package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi alin ve toplayin
        //kullanici deger olarak sifira basarsa islemi bitirin.
        int girilenSayi=10;
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        while (girilenSayi!=0){
            System.out.println("Lutfen toplamak icin bir tamsayi giriniz.");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;
        }
        System.out.println("Girilen sayilarin toplami: "+toplam);
    }
    //while loop un 2 negatif yonu vardir.
   // 1-loop dan once verecegimiz sayi olusturdugumuz variable lara yanlis bir sayi verirsek loop bodysi calismaz
   //2-loop conditioni loop bodysinden bir kez fazla calisir
    //bu negatif yonler onu kullanilmaz yaoacak buuyklukte degildir.
    //ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz.

}

