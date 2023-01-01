package day15_scopeArreys;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {
        /*
  java OOP konsept cercevesinde baska classlardan class uyelerini (variable/method)kullanabiliriz.
  baska class daki herhangi bir class uyesne erismek istedigimizde static keyword onemli bir
  rol oynar.

        static olarak isaretlenen class uyelerine classIsmi.staticUyeIsmi seklinde ulasabiliriz.

        Static olmayan class uyelerine ulasmak icin obje olusturmamiz gerekir.

        Java runtime programdir.
        basinca calisir. Caistigi surece yapilan islemleri kalici olarak tutar. Calisma bittiginde
        her sey yok olur.
         */
        System.out.println(C01_hastane.hastaneAdresi);
        C01_hastane.method1();
        System.out.println(C01_hastane.hastaneIsmi);
        C01_hastane per1=new C01_hastane();
        System.out.println(per1.personelAdresi);//null
        System.out.println(per1.hastaneIsmi);
        per1.personelIsmi="Belkis";
        per1.personelAdresi="Istanbul";
        per1.hastaneAdresi="Uskudar";
        System.out.println(per1.personelIsmi);//Belkis
        System.out.println(per1.personelAdresi);//Istanbul
        System.out.println(per1.personelTel);//null
        System.out.println(per1.hastaneIsmi);//Yildiz Hastanesi
        System.out.println(per1.hastaneAdresi);//Uskudar
    }
}
