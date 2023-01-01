package day11_forloops;

public class C07_terseCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        String str="Java ogrenmek isic cok calismak gerekir.";
        String terstenStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            terstenStr+=str.substring(i,i+1);

        }
        System.out.println("Girilen cumlenin tersten yapilisi :"+ terstenStr);

    }
}
