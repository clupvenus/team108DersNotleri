package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_indexof {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);
        System.out.println(harfler.indexOf("Z"));//1
        System.out.println(harfler.lastIndexOf("Z"));//1
        harfler.add("Z");//[A, Z, T, Z]
        System.out.println(harfler);//1
        System.out.println(harfler.indexOf("m"));//-1
        System.out.println(harfler.lastIndexOf("m"));//-1

    }
}
