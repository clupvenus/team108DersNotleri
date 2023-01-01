package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        //Verilen bir string in palindrome olup olmadigini yazdiri.
        //Plaindroma:: duz okunusu ile tersten okunusu ayni olan anlamina gelir.
        String str="ey edip adanada pide ye";
        String tersStr= C07_TerseCevirme.metniTerseCevir(str);
        if(str.equals(tersStr)){
            System.out.println("Verilen metin palindrome");

        }else System.out.println("verilen metin palindrome degil");
    }
}
