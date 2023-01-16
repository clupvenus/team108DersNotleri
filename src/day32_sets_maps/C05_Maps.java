package day32_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMAp=new HashMap<>();
        ogrenciMAp.put(101,"Ali-Can-11-H-MF");
        ogrenciMAp.put(102,"Veli-Cem-10-K-TM");
        ogrenciMAp.put(103,"Ali-Cem-11-K-TM");
        ogrenciMAp.put(104,"Ayse-Can-10-H-MF");

        System.out.println(ogrenciMAp);//{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF}
        System.out.println(ogrenciMAp.size());//4

        //Mao ta 103 nolu ogrenci var mi?

        System.out.println(ogrenciMAp.containsKey(103));//true

        //Ali diye bir ogranci var mi diye bakalim.

        System.out.println(ogrenciMAp.containsValue("Ali"));//false
        System.out.println(ogrenciMAp.containsValue("Ali-Can-11-H-MF"));//true


        //


    }
}
