package day30_Interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iteritor {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);//[5, 23, 2, 9, 11]

        //index yapisi olmadan tum elementleri 3 artirin.
        for (Integer each:sayilar
             ) {
            each=each+3;
            System.out.print(each+" ");

        }
        System.out.println("");
        System.out.println(sayilar);

        //index yapisini kullanmadan 5`den buyuk olan elemntleri silin.

        Iterator itr=sayilar.iterator();

        System.out.println(itr.next());//5
        System.out.println(itr.next());//23
        System.out.println(itr.next());//2
        System.out.println(itr.next());//9
        System.out.println(itr.next());//11
        //tek tek yapmayip  bir loop ile yapalim.
        System.out.println(itr.hasNext());//false
        //iteretior da geri donus yok.
      //  iterator nereye gittiyse orada  kalir
        //tum listeyi loop ile yeniden yazdirmak icinnyeniden bir itr olusturmaliyiz veyaz itr ye yeni deger atamaliyiz.


        itr=sayilar.iterator();
        System.out.println(itr.hasNext());//true

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }


        //iterator kullanarak listedeki 5 den buyuk sayilari silin.
        itr=sayilar.iterator();

        while(itr.hasNext()){
            int sayi=(int)itr.next();
            if(sayi>5){
                itr.remove();}


        }
        System.out.println(" ");
        System.out.println(sayilar);//[5, 2]






















    }
}
