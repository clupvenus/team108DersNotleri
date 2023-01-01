package day24_StringBuilder;

public class EncapsuleClass {



     //Java class uyelerine erisimin write en read olarak ayirmasi istendiginde
     //Encapsulation kullanir.
     //Bunun icin oncelikle bu class uyelerine normal yollarla erisim kapanir.

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+=this.satis;
    }
    private  int toplamSatis=0;
    private int halkaAcikSayi=10;
    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }
    public int getToplamSatis() {
        return toplamSatis;
    }



    private int satis;
     //satis bolumunden deger girilebilsin ama degeri gorunmesin.

    private int rapor=100;
     //gorulebilsin ama degistirlemesin.



    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }


    //herkese acik olsun.



}
