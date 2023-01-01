package day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        //binary tree javanin kullandigi ozel bir siralama yontemidir.
        //binary search methodu binarytree ozelligini kullandigindan
        //sirali olmayan arraylerde dogru sonuc donmeyebilir.
        //Eger binar Search kullanilacaksa
        //oncesinde mutlaka sort() kullanilmalidir.

        int[] arr={2,6,9,3,15,1,7};
        System.out.println(Arrays.binarySearch(arr,2));

        //burada sort yapmazsak binary calismayabilir.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 6, 7, 9, 15]
        System.out.println(Arrays.binarySearch(arr, 3));
//bize indeks donecektir.


    }
}
