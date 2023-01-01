package day08;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {
        String str= "Java her gecen gun daha da guzellesiyor,degil mi?";
        //sondan ucuncu karakteri yazdirin.karakter sayisini bulmak icin str.length yazarak bulacagiz

        System.out.println(str.charAt(str.length()-3));//m verdi
        System.out.println(str.length());//50
        //rasgele bir karakter yazalim

        Random rnd=new Random();// rnd degeri icin 0 ile 1 arasinda rasgele bir deger olusturur
        int index = rnd.nextInt(str.length());//str.length den kucuk rasgele bir int uretir
        System.out.println(str.charAt(index));




    }
}
