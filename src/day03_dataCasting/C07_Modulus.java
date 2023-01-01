package day03_dataCasting;

public class C07_Modulus {
    public static void main(String[] args) {
        System.out.println(15%4);//3
        System.out.println(45%4);//1
        // matematikteki mod islemi gibi
        //kullanicinin girdigi sayi cift sayi mi
        /*
        girilen sayi%2 isleminin sonucu 0 ise cift sayidir.
        kullanicinin girdigi sayi 7 nin kati mi
        girilen sayi%7 sonucu 0 ise 7 nin katidir.
        kullanicin girdigi sayinin birler basamagi
        girilensayi%10
         */
        int girilenSayi = 3426;
        int birlerBasamagi = 3426%10;
        System.out.println("birler basamagi : "+birlerBasamagi);
        System.out.println(girilenSayi / 10); //342
        girilenSayi=girilenSayi/10;

         birlerBasamagi = girilenSayi%10;
        System.out.println("birler basamagi : "+birlerBasamagi);

        System.out.println(girilenSayi / 10);

        girilenSayi=girilenSayi/10;
        birlerBasamagi = girilenSayi%10;
        System.out.println("birler basamagi : "+birlerBasamagi);
        System.out.println(girilenSayi / 10);
        girilenSayi=girilenSayi/10;
        birlerBasamagi = girilenSayi%10;
        System.out.println("birler basamagi : "+birlerBasamagi);

//bunu yeniden yap

    }
}
