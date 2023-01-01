package day11_forloops;

public class C08_nestedForloop {
    public static void main(String[] args) {
        /*
        verilen inputa gore carpim tablosu olusturun.
         */
        int input=4;
        /*
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
         */

        for (int i = 1; i <=4; i++) {

            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i+" ");

        } System.out.println("");
        for (int i = 1; i <=4 ; i++){
            System.out.print(3*i+" ");
        } System.out.println("");
        for (int i = 1; i <=4 ; i++){
            System.out.print(4*i+" ");
        }
        System.out.println("");
        //Javada icice yani nested forloop yapilir.
        //simdi nested loop ile yapalim.
        for (int i = 1; i <=4 ; i++)  //outer loop denir. i nin carpilacagi sayiyi kontrol eder.
        {            for (int j = 1; j <=4 ; j++)// inner loop denir.
            {
                System.out.print(i*j+ " ");

            }
            System.out.println("");



        }

    }
}
