package day30_Interfaces_iterator;

public class M01_ChildofInterface implements I01_Interfaces,I02_Interfaces {
//Bir class baska bir clasi extends keyword ile paren edinebilir.
    //ancak birden fazla classi parent edinemez.
    //Intrefaceler icin boyle bir sinirlama yoktur.
    //Bir class istedigi kadar interface i implement edinebilir.
public static void main(String[] args) {
    System.out.println(I01_Interfaces.SAYI2);
 //  I01_Interfaces.SAYI2=25;
 //Final oldugu icin degistiremeyiz.


    I01_Interfaces.method34();

    M01_ChildofInterface obj=new M01_ChildofInterface();
    obj.method44();
    //Interface de olusturulan STATAIC veya DEFAULT olarak isaretlenebilen methodlarin farki
    //Static olana InterfaceIsmi.StaticMethodIsmi olarak erisilebiirken
    //Default olana child classdan olusturulan bir obje uzerinden erisilebilir.
}

//Eger birden fazla interface implementedildiginde ayni isimde methodlar farkli Interfacelerde varsa
    //return type ab bakilir.
    //Return type ayni ise sorun olmaz. cunku ikisini de implement edebiliriz.
    //return typleari farkli ise birini tercih ettigimizde diger CTE verir.
    //bu durumda parent interfacelere mudahale etmek mumkunse mudahale edilebilir veya bu interfacelerden birini
    //implement etmekten vazgececeriz.

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {

        return 0;
    }
}
