package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        //Java da bir cok yapida get ve set methodlari bulunur.
        //get methodlari bilgiyi bize getirirken set methodlari bilgiyi update eder.

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);//[A, Z, T]
        //2.indekse F elemanini ekleyin.
        //add methodu var olan bir listeden herhangi bir elementi degistirmeden istedigimz elementi ekler kalanlari kaydirir.

        harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]
        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T]

    }
}
