package day17_Arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        int[] arr={2,8,4,1,9,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 6, 8, 9]
        System.out.println(Arrays.binarySearch(arr,2));
//1
        System.out.println(Arrays.binarySearch(arr,8));//5. indeks
        //olmayan bir sayi yapalim.
        System.out.println(Arrays.binarySearch(arr,0));//-1 yazdirdi.
        System.out.println(Arrays.binarySearch(arr,5));//-5
        System.out.println(Arrays.binarySearch(arr,18));//-8
        //normalde olsaydi kacinci sirada olurdu?onu inceliyor ve basina - geliyor.
        //indeksi degil siraya gore yaziyor.
    }
}
