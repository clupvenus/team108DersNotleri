package day09_StringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yaziniz.
        //cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle yazin.");
        String girilenCumle=scan.nextLine();
        //Sinavlarimizda coktan secmeli sorular kullaniyoruz.
        // javayi cok seviyoruz.
        //bu kadar coklu secenek olur mu?
        if (!girilenCumle.contains("cok")) {
            System.out.println("cumlede cok ile baslayan kelime yok");
        }else {
            int cokIndeksi=girilenCumle.indexOf("cok");
            //coktan sonraki boslugu bulup ona kadar yazdiralim.
            int boslukIndeksi=girilenCumle.indexOf(" ",cokIndeksi+1);
            System.out.println(girilenCumle.substring(cokIndeksi, boslukIndeksi));

        }

    }
}
