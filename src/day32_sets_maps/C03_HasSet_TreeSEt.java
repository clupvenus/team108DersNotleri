package day32_sets_maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_HasSet_TreeSEt {
    public static void main(String[] args) {
        //bir hasset ve bir treeset olusturun.
        //bir loop ile iclerine 10000 sayi ekleyin.
        //islem surelerini karsilastirin.

        Random rnd=new Random();
        int sayi=0;

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

        Long hashBaslangic= System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            sayi=rnd.nextInt(10000000);
            hashSet.add(sayi);

        }
        Long hashBitis= System.currentTimeMillis();

        Long treeBaslangic= System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

            sayi=rnd.nextInt(10000000);
            treeSet.add(sayi);

        }

        Long treeBitis= System.currentTimeMillis();

        System.out.println(hashBitis-hashBaslangic);
        System.out.println(treeBitis-treeBaslangic);






    }
}
