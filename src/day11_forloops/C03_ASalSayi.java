package day11_forloops;

public class C03_ASalSayi {
    public static void main(String[] args) {
        //input olarak verilen bir tamsayinin
        //asal sayi olup olmadigini yazdirin.
        int input=456327;
        String sonuc="Sayi asaldir";
        for (int i = 2; i <input ; i++) {

            if (input % i == 0){ sonuc = "Asal degildir.";
            break;}

        }
// Java bir loop un icerisinde "break" gorurse o lopu bitirir.
            System.out.println(sonuc);

    }
}
