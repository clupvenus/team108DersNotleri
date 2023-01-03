package day28_Exeptions;

import java.util.Scanner;

public class C01_TRYCAth {
    public static void main(String[] args) {
        //kullanicidan iki tamsayi alip sayilari birbirine bolup sonucu yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Biribirine bolmek icin 2 tamsayi giriniz.");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        try {

            //1-try bolumu : yapmak istedigimiz ama exc. risci oluturan kodlar
            System.out.println("iki sayinin bolumu : "+sayi1/sayi2);
        } catch (ArithmeticException e)
            //2-catch(): Bekledigimiz muhtemel exceptioni deklare ettigimiz,
            //bu exc gerceklesirse hata dokumenini store edebilecegimiz variable
        {
            System.out.println("Bolecek sayi sifir olamaz.");
            e.printStackTrace();
          //  throw new RuntimeException(e);
            //3- catch blogu: exception gerceklesirse calismasini istedigimiz kodlar
            //burayi yazarken oncelikle
            //exception olustugunda kodlarin calismasi dursun mu ?yoksa devam mi etsin?  karar vermeliyiz.


        }

    }
}
