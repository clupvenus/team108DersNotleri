package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        //verilen bir Array`i Natural Order`a gore siralayip yazdirin.
        String[] isimler={"Huseyin","Yusuf","Said","Akile","Mahmut","ahmet","adnan"};
        System.out.println(Arrays.toString(isimler));//[Huseyin, Yusuf, Said, Akile, Mahmut, ahmet]
       Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));//[Akile, Huseyin, Mahmut, Said, Yusuf, ahmet]
        System.out.println(Arrays.toString(isimler));//[Akile, Huseyin, Mahmut, Said, Yusuf, adnan, ahmet]

        //Eger buyukten kucuge siralamak istersek, once sort kulllanarak mevcut natural ordera gore siralar.
        //sonra gecici bir array kullnarak terse ceviririz.





    }
}
