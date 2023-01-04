package day28_Exeptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws IOException {

        FileInputStream fls=new FileInputStream("src/day28_Exeptions/metin.txt");
        int k=0;
       while((k=fls.read())!=(-1)) System.out.print((char)k);

      /* k=fls.read();
        System.out.println((char)k);*/


        /*
        Bazi kodlari yazdigimiza Java kompile time sirasinda o kodlarda exception riskini gorur.
        ve bizden bir cozum bekler.
        ozellikle dosya okuma ve yazma ile ilgili IO(Input/Output) islemlerinde ya okuyamazsam
        ya yazamanazsam diyerek bizden compile time da cozum ister.
        bu durumda biz exception ile karsilastigimizda
        kod dursun diyorsak:
        method satirinda throws keyword kullanarak beklenilen exceptionlari deklare edebiliirz.
        bu sadece olayin farkinda oldugumuzu exception firlatmanin onune gecmez.

        kod calismaya devam etsin dersek: try/catch yada try/catch/finally blogu kullaniriz.
         */


    }
}
