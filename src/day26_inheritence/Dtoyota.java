package day26_inheritence;

public class Dtoyota {
    /*
    bir objenin data turu constructor olarka kullanilan class
    veya o classin parent class lari olabilir.
    Data turu olarak parent class secilmesindeki amac child
    class dan olusturulan objenin paret classin tum child class larinin
    tasidigi ortak ozellikleri vurgulamaktir.
    (Personel toplantisina katilan doktor kemal gibi)
    Data turu ile constructor farkli oldugunda
    cariable ile methodlar farkli davranirlar.

    variablelarin alacagi degeri bulmak icin aramaya data turu olan class dan baslariz.
    o class da yoksa parentlarina bakariz.
    Data turu olan class ya da parentlerinda bulunamazsa cTE olur
    ve ilk buldugumuz degeri atama yapariz.

     */


    String marka="Toyota";
    String model="Model belirtilmemis.";
    String motor="Motor belirtilmemis";
    String yakit="Yakit belirtilmemis";

}
