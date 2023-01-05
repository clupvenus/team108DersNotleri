package day30_Interfaces_iterator;

public interface I01_Interfaces {
    //Interfacelerde tum methodlar public ve abstracttir.


    /*
    Interfacelerde tum variable lar public static ve finaldir. Yazsak da yazmasak da.
    Final oldugundan sonradan deger atamak olmaz.Olustururken deger atanmalidir.
    final ve staticse genel olarak isimler buyuk harfle yazilir.

    bir interface bir class i parent edinemez.

    >
     */
    int SAYI=10;
    public static final String OKULISMI="Yildiz Koleji";
    public int SAYI2=20;
    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();


    /*
    Bir interface e sonradan bir method eklemek istedigimizde o interface i daha once implemenet eden tum class lar yeni eklenen methodu
    implement etmek zorunda olur.
    Java ya yapilan talepler sonucunda Java8 ile birlikte bu konuda bir istisna getirilmisitr.
    eger Sonradan eklenen methodun tum eski class lar tarafindan implemenet edilme mecburiyeti olmasi istiyorsaniz, yeni olusturdugunuz methoda
    DEFAULT ve \ya STATIC keyword ekleyip body de olusturursaniz, o zman bu methodun child class lar tarfindan implement edilme mecburiyeti olmaz.


     */
   public default void method44(){
       System.out.println("Interface deki default olarak isaretlenen method.");
   };

   public static void method34(){
       System.out.println("Interface deki default olarak isaretlenen method.");
   };


}
