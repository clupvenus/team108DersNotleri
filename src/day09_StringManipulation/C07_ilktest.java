package day09_StringManipulation;

public class C07_ilktest {
    public static void main(String[] args) {
        // Gittigimiz web sayfasindan aldigimiz
// String arama sonuclarinda
// arama sayisinin 50'den fazla oldugunu test edin.

        String input = "1-48 of 87 results for \"nutella\"";
        int indexOf= input.indexOf("of");
        int indexResults= input.indexOf("result");
        //of ile reult arasindaki sayiyi almaya calisacagim.
        String sonucSayisiString= input.substring(indexOf+3,indexResults-1);
        // simdi bu buldugumuz sonucu integer yapmaliyiz ki 50 ile kiyaslayabiliriz.
        int sonucSayisiInt = Integer.parseInt(sonucSayisiString);
        // parseInt string sdegerini integere cevirir.
        if(sonucSayisiInt>50){
            System.out.println("Nutella arama testi PASSED");

        }else System.out.println("Nutella arama testi FAILED");



    }
}
