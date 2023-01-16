package day32_sets_maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
// Collections, objelerden olusan bir toplulugu bir arada tutan bir yapidir.
        //Data turu olarak object secilirse icerisine her data turunden element konulabilir
        //Ancak bu durumda elmentlere ulasmak onlari update etmek gibi islemler normalden daha zor olabilir.
        //hatta bazen  mumkun olmayabilir.

        Set<Object> karisikSet=new HashSet<>();

        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int[] arr=new int[3];

        karisikSet.add(arr);

        List<Object> karisiklist=new ArrayList<>();

        karisiklist.add("Hava");
        karisiklist.add(44);
        karisikSet.add(karisiklist);


        System.out.println(karisiklist);//[Hava, 44]


        System.out.println(karisikSet);//[Java, [I@27f674d, S, false, 12, [Hava, 44]]

        System.out.println(karisikSet.contains(44));//false

        System.out.println(karisikSet.contains(12));//true
        //setin icinde bir list var onu goruyor ama listin icindekileri bulamiyor.


    }
}
