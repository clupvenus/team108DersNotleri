package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);//[10, 5, 7, 9]
       // sayilar.remove(5);//IndexOut of bound olur.
        //eger listemiz integerlardan olusuyorsa
       // parametre olarak yazdigimiz seyin index mi yoksa silmek istedigimiz
        //bir obje mi oldugu belirsiz olmasin diye
        //java otomatik olarak girilen indeksi kabul eder.
       // Eger integer olarak olusan bir listede obje olarak once onu tanimlamalisiniz.

        Integer silinecekELment=5;
        System.out.println(sayilar.remove(silinecekELment));//true
        System.out.println(sayilar);//[10, 7, 9]

    }
}
