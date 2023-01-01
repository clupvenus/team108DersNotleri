package day17_Arrays;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {
        int[]arr1={3,8,0};
        int[]arr2={8,3,0};
        System.out.println(Arrays.equals(arr1, arr2));
        //false.Neden? equals methodu hem elementleri hemde indeksleri kontrol eder.
        //ayni indekslerde ayni elementler varsa true yoksa false doner.
        //eger siralamaan dolayi false donmesini istemiyorsak once iki array de sort yapabiliriz.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));//true
    }
}
