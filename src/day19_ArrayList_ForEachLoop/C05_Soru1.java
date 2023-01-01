package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Soru1 {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum 
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list=new ArrayList<>();
        for (Integer each:arr
             ) {
            if(!list.contains(each)){
                list.add(each);
            }
            
        }//list olarak unique degerlerden olusan bir list olusturduk.
        arr=new Integer[list.size()];
        //simdi listteki elementleri arraye kopyalayalim. arraye atama yapmak istedigimizde index e ihtiyacimiz olduguundan
        // for each kullanmak mantikli degil.

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=list.get(i);

        }
        System.out.println("Array`in yeni hali "+ Arrays.toString(arr));
    }
}
