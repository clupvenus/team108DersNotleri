package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1=new ArrayList<>();
        //Arraydeki tum elementleri liste kopyalayalim


        for (Integer each:arr
             ) {
            list1.add(each);

        }
        System.out.print(list1);
        //arraydeki cift sayi olusturacagimiz bir liste tasiyalim
        List<Integer> ciftSayilist =new ArrayList<>();
        for (Integer each:arr
             ) {
            if(each%2==0){
                ciftSayilist.add(each);
            }

        } System.out.println(ciftSayilist);
    }
}
