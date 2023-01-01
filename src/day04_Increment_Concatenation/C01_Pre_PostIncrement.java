package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {
        int sayi=20;
        //sayiyi 3 artirin
        sayi=sayi+3;
        sayi+=3;
        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi);
        //sayinin degerini 2 azaltin
        sayi=sayi-2;
        sayi-=2;
        sayi--;
        sayi--;
        System.out.println(sayi);


        sayi=10;
        //sayinin degerini 1 azaltin sonra yazdirin.
        sayi--;
        System.out.println(sayi);
        sayi=10;
        //bu islemde sayinin degeri ve ekrandaki degeri 9 dur yani esittir.
        //sayiyi once yazdirin sonra bir azaltin.
        System.out.println(sayi);
        sayi--;

        //bu islemde ekranda 10 gorulur ama sayinin degeri 9 dur.

        sayi=10;
        System.out.println(sayi++);
        //java ayni satirda iki islem oldugundan siralama yapar.
        //eger ++ variable dan sonra ise artirma islemini sonra yapar.
        //bu durumda once yazdirma sonra artirma islemi yapar
        System.out.println(sayi);

        sayi=10;
        System.out.println(++sayi);
        //++ variable dan once ise artirma islemini once yapar.
        //bu durumda java once artirma sonra yazma islemi yapar.
        System.out.println(sayi);

    }
}
