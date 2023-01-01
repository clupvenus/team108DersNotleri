package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        //Verilen bir arraydeki tekrar eden elementleri silip arrayi unique degerlerden olusan bir array haline getirin.

        int[] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> benzersizElemenentlerList=new ArrayList<>();
        //arraydeki tum elemnetleri alip listede var mi diye kontrol edelim olmayanlari ekleyelim.

        for (int i = 0; i < arr.length ; i++) {
            if(!benzersizElemenentlerList.contains(arr[i])){
                benzersizElemenentlerList.add(arr[i]);
            }

        }
        System.out.println(benzersizElemenentlerList);//[4, 3, 6, 7, 5]

        //soruda bu degerleri arr ye atamamiz isteniyor.
        arr=new int[benzersizElemenentlerList.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= benzersizElemenentlerList.get(i);

        }
        System.out.println("Arrayin son hali"+ Arrays.toString(arr));
        //[4, 3, 6, 7, 5]


    }
}
