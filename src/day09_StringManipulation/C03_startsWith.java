package day09_StringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
        String str="Java mutluluktur.";
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("j"));//false
        System.out.println(str.startsWith("Java mutluluktur."));//true
        // bu string bununla baslar mi? true yada false .startswith

        System.out.println(str.startsWith(""));//true
        System.out.println(str.contains("mutlu"));//true
        System.out.println(str.startsWith("mutlu"));//false
        System.out.println(str.startsWith("mutlu", 5));
        //5. indeks ve sonrasi mutluyla mi baslar diye soruyor. Cevap dogru oluyor
        System.out.println(str.startsWith("va",2));//true


    }
}
