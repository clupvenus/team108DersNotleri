package day10_stringManipulations;

public class C06_Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali.
         */
        String sifre="4565abkmklasmlksakc14535";
        /*
        Bu soruda sartlari bagimsiz if cumlesi ile yapmak veya if else ile yapmak mumkundur.
        eger if else ile yaparsak ilk hatada hatayi yazdirir.
        geriye kalanlari yazmaz
        avantaji ise hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilir.
        bagimsiz if cumleleri tek tek inceler. tum hatalari bir kerede soyler ama basarili sifre olusturuldugunu
        bizim ayri bir mekanizma ile kontrol etmemiz gerekir.
        */
        /*
        Sonucta basarili bir sifre olusturuldu demek icin bir kontrol mekanizmasi olusturmamiz gerekir
        ya her adimda artiracagimiz bir sayac yapip en son 3 oldu ise basarili deriz.
        veyaz basta verdigimiz deger olumsuz bir durumda artitilir
        en sonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur diyebiliriz.

         */
        int flag=0;
        //- ilk harf kucuk harf olmali
        if(!('a'<=sifre.charAt(0)&& sifre.charAt(0)<='z')){ System.out.println("ilk harf kucuk harf olmali");
        flag++;}
        //  - son karakter rakam olmali
        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9') ){System.out.println("son karakter rakam olmali");
        flag++;}
        //  - sifre bosluk icermemeli
        if (sifre.contains(" ")){ System.out.println(" sifre bosluk icermemeli");
        flag++;}
        //  - uzunlugu en az 10 karakter olmali.
        if (!(sifre.length()>10)) {System.out.println("- uzunlugu en az 10 karakter olmali.");
        flag++;}

        if(flag==0) System.out.println("Sifreniz basari ile kaydedilmistir.");
    }
}
