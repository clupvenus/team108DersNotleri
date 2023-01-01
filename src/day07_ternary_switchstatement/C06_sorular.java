package day07_ternary_switchstatement;

public class C06_sorular {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.
       int input=44;
        System.out.println(input>50 ? "Sinifi gectin":"malesef kaldin");

        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdiri
        char karakter='a';
        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32) : karakter);

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        input=-125;
        //|5|=> 5 |-4|=(-4)*(-1)
        System.out.println(input>0 ? input : input*(-1));


    }
}
