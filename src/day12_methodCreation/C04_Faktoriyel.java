package day12_methodCreation;

public class C04_Faktoriyel {
    public static void main(String[] args) {
        //verilen bir sayinin 15`den kucuk bir pozitif tamsayi oldugunu kontrol edin.
        //kucukse bir method olusturup, gaktoryel degerini yazdirin.
        //sayi istenen aralikta degilse uyari yazdirin.
        int input=13;
        if(input>0 &&input<15){
            faktoryelYazdir(input);
        }else System.out.println("Girilen sayi pozitif ve 15`ten kucuk tamsayi olmalidir.");
    }
    public static void faktoryelYazdir(int sayi){
        int faktoryelSonucu=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelSonucu *= i;

        }
        System.out.println("Girilen "+sayi+" icin faktoryel sonucu: "+faktoryelSonucu );
    }
}
