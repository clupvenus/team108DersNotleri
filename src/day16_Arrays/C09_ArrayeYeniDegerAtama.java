package day16_Arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        // arr1 = {3, 6, 8, 9};//buna izin vermez
        //arr1={5,7,1}; bunu da kabul etmez

       // arr1 = new int[5];
        //once 5 deger atar ve hepsi nulldur.
        System.out.println(Arrays.toString(arr1));
        //11. satirdaki atama ile java arr1 in pointerini eski arrayden silip
        //new keyword u ile olusturdugumuz yeni arraye yonledirir.
        //eski elementleri de korumak istersek ne yapmaliyiz?
        // o zaman atama yapmadan once eni arrayi hazirlamaliyiz.
        //bunun icin bos bir yeni array olusturup eski array deki elemnetleri yeni arraya tasiyip sonra
        //atamayi yapabiliriz.
        int[] temp=new int[5];
        for (int i = 0; i <arr1.length ; i++) {
            temp[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));//[1, 2, 3]
        System.out.println(Arrays.toString(temp));//[1, 2, 3,0,0]
         arr1=temp;
        System.out.println(Arrays.toString(arr1));//[1, 2, 3,0,0]
        System.out.println(Arrays.toString(temp));//[1, 2, 3,0,0]

    }
}
