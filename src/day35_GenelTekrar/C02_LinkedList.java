package day35_GenelTekrar;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //verilen bir Linked List de
        //istenen iki indexteki elementlerin yerlerini degistirin.

        LinkedList<String> isimleer=new LinkedList<>();
        isimleer.add("Said");
        isimleer.add("Huseyin");
        isimleer.add("Hasan");
        isimleer.add("Sevilay");
        isimleer.add("Humeyra");

        System.out.println(isimleer);//[Said, Huseyin, Hasan, Sevilay, Humeyra]
        //hasan ile humeyranin yerini degistirelim.
        //buyuk bir listede index bilmeden yapalim.


        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";
        String temp="";
        temp=ilkIsim;
        int ilkIsimIndex=isimleer.indexOf(ilkIsim);
        int ikinciIsimIndex= isimleer.indexOf(ikinciIsim);

        isimleer.set(ilkIsimIndex,ikinciIsim);
        isimleer.set(ikinciIsimIndex,temp);
        System.out.println(isimleer);//[Said, Huseyin, Humeyra, Sevilay, Hasan]


    }
}
