package day10_stringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str="Java heyecandir.";
        // eger butun a`lari degil de sadece ilk a yi degistirmek istersek
        System.out.println(str.replaceFirst("a","A"));
        //ilk harf veya rakami * yap
        str=str.replaceFirst("\\w","*");
        System.out.println(str);

    }
}
