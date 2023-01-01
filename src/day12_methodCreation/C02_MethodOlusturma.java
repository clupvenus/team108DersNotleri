package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip sonucu yazdiran bir method oludturun.
//Bir method ancak method call yapilinca calisir.
        //method call icin method adi ve parametrelere uygun argument yazilmalidir.
        //Method call icine yazilan degerlere variable veya degerlere argument denir.
        carpYazdir(5,8);
        carpYazdir(7.4,5.8);
        //carpYazdir(ali,veli); argumentlereparametreler uyumlu degilse CTE olur.
        //methodun icinden method cagrilmaz. yani method olusturdugumuz yere methodu yazamayiz. main method icerisine yazin.


    }

    // main methodun disina cikmaliyiz
    //methodun icinde method olmaz.
    public static void carpYazdir(double sayi1,double sayi2){
        System.out.println(sayi1 * sayi2);

    }
}
