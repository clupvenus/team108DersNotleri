package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Size {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);//[10, 5, 7, 9]
        System.out.println(sayilar.size());//4
        sayilar.clear();//listedeki tum elementleri siler.
        System.out.println(sayilar.size());//0
        System.out.println(sayilar);//[]


    }
}