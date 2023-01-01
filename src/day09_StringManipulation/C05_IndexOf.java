package day09_StringManipulation;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";
        //str "cok" iceriyor mu?
        System.out.println(str.contains("cok"));

        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin.
        System.out.println(str.endsWith("cok"));// la olur mu? olmaz false. o tamami cok ile bitiyor mu diye sorar.

        System.out.println(str.indexOf('a'));
        // ilk a yi bulur ve onun indeksini yazdirir. //1
        System.out.println(str.indexOf("v"));
        //2
        System.out.println(str.indexOf("cok"));
        //cok paketimiz hangi indeksler basliyor onu yazdiriyor.
        System.out.println(str.indexOf("a",5));//13

        //a ti 5. indeksten sonra ara kodu.
        //2. o nun indeksini bul
        //once ilk o nun indeksini bul sonrasinda ikici o yu aratiriz.
        //yazdirmaya gerek yok onun icin bir variable a degeri verelim.

        int ilkOindeksi=str.indexOf("o");
        int ikinciOindeksi= str.indexOf("o",ilkOindeksi+1);
        System.out.println(ilkOindeksi+" "+ikinciOindeksi);
//ikisini de 10 buldu cunku 10. indeks bir onceki indeks oldugu icin ondan sonrasini bulmak icin ilk indekse +1 yapmaliyiz.
        //+1 ekleyince 18. indeks olarak bulur.


    }
}
