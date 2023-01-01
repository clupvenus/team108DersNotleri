package day11_forloops;

public class C09_NestedLoop {
    public static void main(String[] args) {
        //input olarak verilen kenar uzunluklarina gore asagidaki sekli ciziniz.
        int kisaKenar=5;
        int uzunKenar=9;

        /*
        ********* //bir satiri innerloop belirler
        *********
        *********
        *********
        * //Satirda yaptigimiz islemi kac kere tekrar edecegimizi outerloop yapar.
         */
        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");// satir ile islem bittiginde alt satira gecmesi icin.



        }
    }
}
