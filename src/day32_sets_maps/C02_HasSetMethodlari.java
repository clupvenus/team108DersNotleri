package day32_sets_maps;

import java.util.HashSet;
import java.util.Set;

public class C02_HasSetMethodlari {
    public static void main(String[] args) {

        Set<String> set1= new HashSet<>();

        set1.add("Sevilay");
        set1.add("Ramazan");
        set1.add(null);
        set1.add("Elif");

        System.out.println(set1);//[null, Sevilay, Elif, Ramazan]
        //yazdirirken herhangi bir siraya gore yazdirmiyor.Rasgele yazdiriyor.


    }
}
