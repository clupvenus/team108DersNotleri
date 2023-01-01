package day17_Arrays;

public class C05_MDa {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        //verilen iki katli MDA daki tum sayilarin toplamini yazidiran bir method olusturun.



    tumSayilariTopla(arr);

    }

    public static void tumSayilariTopla(int[][] arr){
        int toplam=0;
        //outer array icin bir for loop yapalim.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                // inner arrayler icin
               toplam+= arr[i][j];


            }

        }
        System.out.println("Arraydeki tum sayilarin toplami :"+toplam);



    }
}
