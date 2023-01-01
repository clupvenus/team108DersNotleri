package day24_StringBuilder;

public class C05_Encapsulation {
    public static void main(String[] args) {
        /*
        Access modifier bir clas uyesine erisimi sinirlandirirken
        gorme yetkisi(read) ve degistirme yetkisini(write) ayirt edemez.
        Ama gercek hayatta bu ihtiyac vardi.
        Bazi class uyelerinin readable olmasi istenirken
        Bazi class uyelerinin sadece writeable olmasi istenir
        Bazi class uyeleri icin iki yetki de istenir.

        Java bu yetkilendirme islemini Encapsulation ile cozmustur.

        sadece yazma yetkisi icin setter();
        sadece okuma yetkisi icin getter(();
        kodlarimizin daha anlasilir bir sekilde atama ve yazna islemlerini yapmasi icin
        de getter() ve setter() methodlari birlikte kullanilabilir.
        bazi devoloperlar boyle yapmayi tercih eder.


         */
        EncapsuleClass obj1=new EncapsuleClass();
       /* System.out.println(obj1.satis);
        obj1.satis=23;
        //hem yazdirabiliyorum hem de deger atayabiliyorum. defaultken sonra orivate yaptik
        ve burayi sildik.*/
        obj1.setSatis(100);
        obj1.setSatis(200);
        obj1.setSatis(300);
        /*System.out.println(EncapsuleClass.toplamSatis);//600
        EncapsuleClass.toplamSatis=2600;
        //deger atayabiliyoruz ama bunu istemiyoruz. degistirmesini istemiyoruz sadece okumasini istiyoruz*/
        System.out.println(obj1.getToplamSatis());
        obj1.setHalkaAcikSayi(400);
        System.out.println(obj1.getHalkaAcikSayi());//400



    }
}
