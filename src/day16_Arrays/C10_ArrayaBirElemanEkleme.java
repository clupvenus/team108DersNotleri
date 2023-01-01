package day16_Arrays;

import java.util.Arrays;

public class C10_ArrayaBirElemanEkleme {
    public static void main(String[] args) {
        String[] isimler={"ali","veli","cem"};
        String eklenilecekIsim="Kemal";
      isimler=arrayeElementEkleme(isimler,eklenilecekIsim);
        System.out.println(Arrays.toString(isimler));


    }
    public static String[] arrayeElementEkleme(String[] eklenilecekArray, String eklenecekElement){
        String[] temp=new String[eklenilecekArray.length+1];
        for (int i = 0; i < eklenilecekArray.length ; i++) {
            temp[i]=eklenilecekArray[i];

        }
        temp[temp.length-1]=eklenecekElement;

            return temp;
    }

    public static void arrayeElementEkleme(String eklenilecekIsim) {
    }
}
