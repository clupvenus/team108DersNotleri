package day34_maps_NestedMap;

import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfSayilariMap=new TreeMap<>();


        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);
        //{A=10, C=15, D=3, K=5
        System.out.println(harfSayilariMap.subMap("C", "F"));//{C=15, D=3}
        System.out.println(harfSayilariMap.subMap("C","K"));//{C=15, D=3} Son deger dahil degil


        System.out.println(harfSayilariMap.descendingMap());
//verilen deger kucuk olanlarin en buyugunu veriyor.
        System.out.println(harfSayilariMap.lowerKey("E"));//D
        System.out.println(harfSayilariMap.lowerKey("D"));//C

        //verilen deger kucuk veya esit olanlarin en buyugunu veriyor.
        System.out.println(harfSayilariMap.floorKey("E"));//D
        System.out.println(harfSayilariMap.floorKey("D"));//C


        System.out.println(harfSayilariMap.higherKey("D"));//K

        System.out.println(harfSayilariMap.ceilingKey("D"));//
        //Bu D ye esit yada buyuk olanlarin en buyugunu verir.

        System.out.println(harfSayilariMap);
        //{A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.headMap("D"));
        //{A=10, C=15} Girdigimiz degerden basa kadar hepsini yazdirir D dahil degil.

        System.out.println(harfSayilariMap.headMap("D", true));
       // {A=10, C=15, D=3}

        System.out.println(harfSayilariMap.tailMap("C"));
        //{C=15, D=3, K=5} SubString mantigiyla baslangic noktasi dahil bitis noktasi haric.

        System.out.println(harfSayilariMap.tailMap("C", false));
        //{D=3, K=5}

        System.out.println(harfSayilariMap.pollFirstEntry());//A
        //harfi silip bize dondurur.
        System.out.println(harfSayilariMap);//{C=15, D=3, K=5}



    }
}
