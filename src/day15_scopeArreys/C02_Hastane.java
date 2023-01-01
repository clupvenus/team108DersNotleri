package day15_scopeArreys;

public class C02_Hastane {
    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";
    String personelIsmi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {
        C02_Hastane per1=new C02_Hastane();



        C02_Hastane per2=new C02_Hastane();
        per1.personelIsmi="Harun";

        per2.personelAdresi="Cankaya";

        per1.hastaneIsmi="Java Hastanesi";

        System.out.println(per1.personelTel);//telefon
        System.out.println(per1.personelIsmi);//harun
        System.out.println(per2.personelIsmi);//personel
        System.out.println(per2.personelAdresi);//cankaya
        System.out.println(per1.hastaneIsmi);//Java
        System.out.println(per2.hastaneIsmi);//Java
        System.out.println(hastaneIsmi);//Java

        per1.personelIsmi="Mehmet";
        System.out.println(per1.personelIsmi);//mehmet


    }
}
