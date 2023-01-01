package day13_methodOverlading_whileLoop;

public class C03_methodoverloading {
    public static void main(String[] args) {
        toplama(5.4,6.3);
toplama('a','b');
//ilk olarak %100 uyumlu parametre arar yoksa en uygun parametreye donusturur.Casting yapar.
        //calisacagi iki tane method varsa en az casting yapacaguini tercih eder.

        toplama(8.4,6);
    }

    public static void toplama(int sayi1, double sayi2){
        System.out.println("bir int ve bir double sayinin toplami :"+(sayi1+sayi2));
    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("iki double sayinin toplami :"+(sayi1+sayi2));
    }
}
