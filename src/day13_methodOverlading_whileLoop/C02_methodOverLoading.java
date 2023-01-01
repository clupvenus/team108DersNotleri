package day13_methodOverlading_whileLoop;

public class C02_methodOverLoading {
    public static void main(String[] args) {
        String str="Java cok guzel";
        str.substring(5);
        str.substring(5,6);
        //Java da tek parametreli ve cift parametreli methodu secersek secelim fark etmez. bizim girdigimizi argumentlere bakar.
        //ayni isimdeki methodlardan hangisinin calisacagina argument parametre uyumu karar verir.
        //buna da OverLoading demektir.
toplama(5,6);//
       /*
       java ayni class icerisinde ayni isim ve ayni data turunden parametre
       sayisi ile iki method olusturmeniza izin vermez.
       1- ismini degistirebiliriz, ancak bu durumda overloading olmaz.

        */
    }
    public static void toplama(int sayi1,int sayi2){
        System.out.println("iki tamsayinin toplami :"+(sayi1+sayi2));
    }
    public static void yenitoplama(int a,int b){
        System.out.println(a+b);
    }
    public static void toplama(int sayi1, int sayi2,int sayi3){
        System.out.println("3 tamsayinin toplami :"+(sayi1+sayi2+sayi3));

    }
    public static void toplama(double sayi1,int sayi2){
        System.out.println("bir double ve bir tamsayinin toplami :"+(sayi1+sayi2));
    }
    public static void toplama(int sayi1, double sayi2){
        System.out.println("bir int ve bir double sayinin toplami :"+(sayi1+sayi2));
    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("iki double sayinin toplami :"+(sayi1+sayi2));
    }

}
