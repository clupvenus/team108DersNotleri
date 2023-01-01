package day09_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str="Java ogren, mutlu ol";
        // str mutlu iceriyor mu?sonuc boolean yani true yada false
        System.out.println(str.contains("mutlu"));
        // charSequence :Char dizisi gibi cevirebiliriz.
        // aradigimiz metnin String olmasi sart degil char da olabiliir.
        System.out.println(str.contains("j"));//false
       /* tek harf kabul etmiyor. char olarak
        System.out.println(str.contains('j'));
       */
        System.out.println(str.contains(" "));//true
        //contains methodu kac tane olduguna degil var olup olmamasina bakar.
        System.out.println(str.contains("Java")&&str.contains("mutlu")); // true


    }
}
