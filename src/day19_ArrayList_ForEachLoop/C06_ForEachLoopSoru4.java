package day19_ArrayList_ForEachLoop;

import java.util.Arrays;

public class C06_ForEachLoopSoru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle="Java ogrenmek cok guzel";
        String harf="a";

        String[] cumleArr= cumle.split("");
        System.out.println(Arrays.toString(cumleArr));
//[J, a, v, a,  , o, g, r, e, n, m, e, k,  , c, o, k,  , g, u, z, e, l]
        int sayac=0;
        for (String eachharf:cumleArr
             ) {
            if(eachharf.equals(harf)){
                sayac++;
            }

        }
        if(sayac==0) System.out.println("harf cumlede kullanilmamis");
        else System.out.println("harf cumlede "+sayac+" kadar kullanilmis.");
        //harf cumlede 2 kadar kullanilmis.
    }
}
