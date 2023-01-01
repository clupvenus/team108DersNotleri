package day17_Arrays;

import java.util.Arrays;

public class C04_mutltidimensionalArrays {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//arr[2]={6,7,4,5} //
        System.out.println(arr[2][1]);//7
        System.out.println(arr[3]);//[I@4c203ea1
        //multi dimension array ile calisirken dikkat etmemiz gereken en onemli konu
        //yazigimiz kodun bir element mi yolsa bir array mi dondurdugudur.
        System.out.println(Arrays.toString(arr[3]));//[2]

        System.out.println(arr[3][0]);//2
        //MDA in tumunu yazdirmak isterseniz
        //tek arrayi yazmak icin kullandigimiz methodu kullanamayiz
        System.out.println(Arrays.toString(arr));//[[I@4c203ea1, [I@27f674d, [I@1d251891, [I@7c75222b, [I@48140564]
        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]

    }
}
