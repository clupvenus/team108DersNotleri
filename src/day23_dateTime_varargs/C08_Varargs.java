package day23_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        /*
        Argument sayisi olarak tamsayilar alip ilk argument haric geriye kalanlari toplayip bulunan toplami
        ilk argument ile carpip sonucu yazandiran bir method olusturun
        (Not: Argument sayisi degisken olabilir.)
         */

        islemYap(3,4,5,8,1,2);//60
        islemYap(5,1);//5
        islemYap(5,2,6,5,6,5);//120
    }

    private static void islemYap(int ilkSayi,int... geriyeKalanlar) {
        int geriyeKalanlarToplami=0;
        for (int each:geriyeKalanlar
             ) {
            geriyeKalanlarToplami+=each;


        }
        System.out.println(geriyeKalanlarToplami*ilkSayi);
    }
}
