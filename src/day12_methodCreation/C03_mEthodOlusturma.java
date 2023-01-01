package day12_methodCreation;

public class C03_mEthodOlusturma {
    public static void main(String[] args) {
        //asal sayi mi methodu boolean bir sonuc dondurdugunden bu methodu calistirdigimizda
        //ya direk yazdirmaliyiz.
        System.out.println(asalSayiMi(34));
        //veya method call!un getirecegi sonucu atamak icin bir variable olusturabiliirim.
        boolean sonuc59= asalSayiMi(56);
    }
    public static boolean asalSayiMi(int input) {
        boolean asalSayiMi = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                asalSayiMi = false;
                break;
            }

        }
        return asalSayiMi;
    }
    }

