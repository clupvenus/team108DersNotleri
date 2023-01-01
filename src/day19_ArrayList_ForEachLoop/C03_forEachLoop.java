package day19_ArrayList_ForEachLoop;

public class C03_forEachLoop {
    public static void main(String[] args) {
        /*
        eger coklu element iceren bir yapidaki tum elementlere ayni islemi yapmak istiyorsak indeksten
        \bagimsiz olarak for each loop kullanabilir.
        foeeach loopta 3 seyi belirtmeniz gerekir.
        1-getirilecek elemntlerin data turu
        2- getirilen elemente verilecek isim (genelde each/w kullanilir.)
3- nereden getirilecegi
         */




        int[] arr={2,4,6,8,1};
        //bu arrayin tum elementlerini yazdir

        for (int each:arr
             ) {
            System.out.print(each+" ");
        }
        //tum elementleri topla

        int top=0;
        for (int each:arr
             ) {top+=each;

        } System.out.println(top);//21

        //tum sayilarin karelerini topla
        top=0;
        for (int each:arr
             ) {top+=each*each;

        }
        System.out.println("sayilarin kareleri toplami "+top);//121

    }
}
