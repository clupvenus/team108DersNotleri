package day08;

public class C05_CharAt {
    public static void main(String[] args) {
        String str= "Java guzeldir";
        //Java da index 0 dan baslar
        //j==>0. indeks, r ==>12. indeks
        //charAt(indeks) ile istedigimiz indeksteki char`a ulasabiliriz

        // ilk a yi yazdiralim
        System.out.println(str.charAt(1));
        //sondan 2. harfi yazdiralim
        System.out.println(str.charAt(13-2));
        // sondan 4. karakteri buyuk harf olarak verin

        System.out.println(str.toUpperCase().charAt(13-4));
        //char et metodu bize char dondurdugu icin to uppercase calismaz.
        // bunu kullanmak istiyorsak string methodlarini char at ile kullanmak isterseniz bunu char at den once kullanmalisiniz.

        /* System.out.println(str.charAt(13));//StringIndexOutOfBoundsException

         eger indeks olarak karakter sayisi daha buyuk bir dger girersek o indeksi bulamayacagi icin hata verir.
         */


    }
}
