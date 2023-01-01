package day08;

public class C03_Equals {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja";
        String str5=str4.concat("va");
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str5);//false
        /*
        == string icin bekledigimiz sonuclari vermeyebilir. Cunku hem metin degerini hem de objenin referansini karsilastirir.
        bunu ileride anlatacagiz.
        Java da string objelerinin metinlerinin ayni olup olmadigini kontrol etmek icin == yerine equal methodu kuallnilmalidir.
         */
        System.out.println("=====");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str5));//true


    }
}
