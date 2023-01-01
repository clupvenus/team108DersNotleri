package day06_IfElse;



import java.util.Scanner;

public class C03_IfElseStatements {
    //kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char girilenKarakter = scan.next().charAt(0);
        //burda 0 yazmamizin nedeni ilk harfi almak
        if (girilenKarakter>='a' && girilenKarakter<='z')
        {
            System.out.println((char)(girilenKarakter-32));
            System.out.println(Character.toUpperCase(girilenKarakter));
            //kucuk harhise buyuk harf yapalim iki sekilde yapariz.
            // 32 cikarmadaki kasit ascii tablosunda buyuk kucuk harf degerleri arasinda deger farki 32 dir. sonrada castingle chara ceviririz.
        }
        else {
            System.out.println(girilenKarakter);
        }
    }
}