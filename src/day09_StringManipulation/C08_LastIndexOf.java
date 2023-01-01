package day09_StringManipulation;

public class C08_LastIndexOf {
    public static void main(String[] args) {
        String str="Javayi iyi ogrenmek icin cok calisman lazim cok.";
     //ilk a nin index ini yazdiralim
        System.out.println(str.indexOf("a"));//1
        // son a nin indexini yazdirin.
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a", 15));


        // verilen str da cok kelimesinin kullanimini kontrol edip
        /*-cok kelimesi kullailmamis
        -bir kere kullanilmis
        -birden fazla kullanilmis
        sonuclarindan uygun olani yazdiralim.
         */
        int ilkCokIndex= str.indexOf("cok");
        int sonCokIndex=str.lastIndexOf("cok");

        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanilmis.");
        }
       //indeks of ile ilk cok u buluruz.
        //last indeksle de son cok u buluruz.
        // ikisi esitse bir tanedir esit degilse birden fazladir.
        else if (ilkCokIndex==sonCokIndex) {
            System.out.println("Bir kere kullanilmis");

        }else System.out.println("Birden cok kullanilmis");



    }
}
