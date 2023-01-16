package day34_maps_NestedMap;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfSayilariMap=new TreeMap<>();


        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);
//Anin degerini 20 yap
        System.out.println(harfSayilariMap.put("A", 20));//10
        //Cnin degerini 2 katina cikar
        System.out.println(harfSayilariMap.put("C", harfSayilariMap.get("C") * 2));//15


        System.out.println(harfSayilariMap.compute("D", (k, v) -> v + 5));//8


        //Eger map te T varsa kullanim miktarini  3 eksiltin.

        harfSayilariMap.computeIfPresent("T",(k,v)->v-3);
        System.out.println(harfSayilariMap);
        //{A=20, C=30, D=8, K=5}

        //K harfi varsa kullanimini 2 azaltin

        harfSayilariMap.computeIfPresent("K",(a,b)->b-2);
        System.out.println(harfSayilariMap);
        //{A=20, C=30, D=8, K=3}

        //T harfi yoksa kullanim miktarini 3 olarak ekleyin.

        harfSayilariMap.computeIfAbsent("T",v->3);
        System.out.println(harfSayilariMap);
        //{A=20, C=30, D=8, K=3, T=3}''


        harfSayilariMap.putIfAbsent("S",5);
        System.out.println(harfSayilariMap);
      //  {A=20, C=30, D=8, K=3, S=5, T=3}




    }
}
