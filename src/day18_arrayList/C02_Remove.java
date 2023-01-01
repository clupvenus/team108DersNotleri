package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler.remove("Z"));//true yazdirdi.Zyi buldum sildim demek istiyor.
        System.out.println(harfler);//[A, T]
        System.out.println(harfler.remove(0));// 0. indeksteki elementi siler ve sildigi elemnti dondurur.//A
        System.out.println(harfler);//[T]

         List<String> yeniList=new ArrayList<>();
         yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");
        System.out.println(yeniList.removeAll(harfler));//false yazdi. once 3.harf E idi. Simdi degistirdik T dedik.
        // harfler listesindeki tum elemenleri yeni listten siler gorevi tamamlarsa true yoksa false doner.
        System.out.println(yeniList);//[C, D]


    }
}
