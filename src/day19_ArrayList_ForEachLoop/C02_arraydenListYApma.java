package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_arraydenListYApma {
    public static void main(String[] args) {


        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        /*
        Verilen bir array`i list`e cevirmek icin 2 yontem vardir.
        1- lop ile butun elementleri liste kopyalamak
        2- asList kullanmak . bunu cok tavsiye etmiyoruz.iki buyuk dezavantaji var.
          2a- aslist ile olusturulan liste arrayden donusturuldugu icin add, remove gibi size i etkiliyen
          methodlar kullanilamaz.
          2b-asList ile olusturulan list ile bagli oldugu array birbirinden hic ayrilmiyor. birinde yapacagimiz degisiklik
          otomatik olarak digerini de etkiliyor.


         */
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list1.add(arr[i]);

        }
        System.out.println("Loop ile tasinan list :"+list1);

        List<Integer> list2= Arrays.asList(arr);

        System.out.println("aslist ile olusturaln list: "+list2);

        //list2.add(6); -hata veriyor.

        arr[0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(list2);


    }

}
