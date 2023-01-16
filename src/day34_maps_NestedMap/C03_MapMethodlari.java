package day34_maps_NestedMap;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.getOrDefault(103, "Ögrenci bulunamadi."));
//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(123, "Ogrenci bulunamadi."));
        //Ogrenci bulunamadi.
        System.out.println(ogrenciMap.get(123));//null

        System.out.println(ogrenciMap.replace(103, "Ali-Cem-11-K-MF"));

        ogrenciMap.put(103,"Ali-Cem-12-K-MF");
        System.out.println(ogrenciMap.get(103));


        System.out.println(ogrenciMap.replace(103, "Ali-Cem-11-K-MF", "Ali-Han-11-K-MF"));

        //false
        //eski deger dogru yazilmadiysa false yazdirir. Yanlissa false doner.
        System.out.println(ogrenciMap.replace(103, "Ali-Cem-12-K-MF", "Ali-Han-11-K-MF"));
        //true Dogruysa degistiri ve true doner.






    }
}
