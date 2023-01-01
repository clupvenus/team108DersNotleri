package day16_Arrays;

import java.util.Arrays;

public class C04_Soru2 {
    public static void main(String[] args) {
        //Verilen bir string arrey de
        //istenen bir harfi iceren kelimeleri silip yerine null yazdirin.

        String[] isimler={"Humeyra","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarfler="u";
        for (int i = 0; i < isimler.length ; i++) {
            if(isimler[i].contains(silinecekHarfler)){
                isimler[i]=null;
            }


        } System.out.println(Arrays.toString(isimler));
    }
}
