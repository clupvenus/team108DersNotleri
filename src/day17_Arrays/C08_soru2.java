package day17_Arrays;

import java.util.Arrays;

public class C08_soru2 {
    public static void main(String[] args) {
//Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
// input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
// output:                      [5, 7, 11]
//dinamik hale getirebilmak icin inner arraylerden en kisa olani bulmamiz gerekir.
        int[][] arr = {{3,4,5}, {2,3,6,7},{4,3}};
        int enkisaInnerArrayLength=arr[0].length;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length<enkisaInnerArrayLength){
                enkisaInnerArrayLength=arr[i].length;
            }

        }
       //bir gorelim oldu mu?
        // System.out.println(enkisaInnerArrayLength);//2
        //ayni indeksteki elementleri topladigimizda koyacagimiz tek katli bir array olusturalim.

        int[] toplamlarArray=new int[enkisaInnerArrayLength];
        int toplam=0;
        for (int i = 0; i <toplamlarArray.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                toplam+=arr[j][i];

            }
            toplamlarArray[i]=toplam;
            toplam=0;
        } System.out.println(Arrays.toString(toplamlarArray));

    }
}
