package day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_odev {
    public static void main(String[] args) {
        //Kullanicidan yeni isimler alip var olan bir arraye ekleyen bir method olusturun.
        //kullanici yeni deger verdigi muddetce C10 daki methodu kullanc arak eklemeye devam edelim.

        //kullanici q ya bastiginda arrayin son halini dondurun.
        Scanner scan=new Scanner(System.in);
        String[] str={"Fatih","Azra"};
        String eklenilecekIsim="";
        String dur="q";
        while (!eklenilecekIsim.equals("q")) {
            System.out.println("Lutfen bir isim giriniz.");
            eklenilecekIsim = scan.nextLine();
            str = C10_ArrayaBirElemanEkleme.arrayeElementEkleme(str, eklenilecekIsim);
        }
        System.out.println(Arrays.toString(str));

    }
}
