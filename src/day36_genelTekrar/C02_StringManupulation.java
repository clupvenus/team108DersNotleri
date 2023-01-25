package day36_genelTekrar;

public class C02_StringManupulation {
    public static void main(String[] args) {
        //verilen bir cumlede istenen kelimenin kac kere gectigii bulup yazdiran bir method

        String cumle="Java basladi ve bitti.Java meger ne guzelmis.Ne python ne C , Java en iyisi.";
        String istenenKelime="Java";


       // kullanimSayisiBul1(cumle, istenenKelime);
        kullanimSayisiBul2(cumle,istenenKelime);
        kullanimsayisiBul3(cumle,istenenKelime);
    }

    private static void kullanimsayisiBul3(String cumle, String istenenKelime) {
        int kullanimSayisi=0;
        while(cumle.contains(istenenKelime))
        {if(cumle.contains(istenenKelime)){
          cumle=cumle.replaceFirst(istenenKelime,"-");
          kullanimSayisi++;
        }
        }if (kullanimSayisi==0) {System.out.println("cumlede kullanilmamistir");}
        else {  System.out.println("Kelime cumlede "+kullanimSayisi+" adet kullanilmistir.");}

        //JAva buldukca silerek yapildi.
        //ama JAJAvava varsa buradan 2 java bulur.
        //cozum olarak hiclik yerine - koyduk.
    }

    private static void kullanimSayisiBul2(String cumle, String istenenKelime) {
        //forLoop ve substring ile yapalim.
        int kullanimSayisi=0;
        for (int i = 0; i <= cumle.length()-istenenKelime.length(); i++) {
           if( cumle.substring(i,i+istenenKelime.length()).equals(istenenKelime)){
               kullanimSayisi++;
           }


        }if (kullanimSayisi==0) {System.out.println("cumlede kullanilmamistir");}
        else {  System.out.println("Kelime cumlede "+kullanimSayisi+" adet kullanilmistir.");}
    }
    private static void kullanimSayisiBul1(String cumle, String istenenKelime) {
        int kullanimSayisi=0;
        int index=0;
        while(index<cumle.length()) {
            index=cumle.indexOf(istenenKelime,index);
            if (index==-1){
                if(kullanimSayisi==0){
                System.out.println("Cumlede ararnan kelime yok");
                break;
                }
                else {
                    System.out.println("Kelime cumlede "+kullanimSayisi+" adet kullanilmistir.");
                    break;
                }

            }else{
                kullanimSayisi++;
                index++;
            }
}}



}
