package day04_Increment_Concatenation;

public class C02_Pre__postIncrement {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        //burada once atama yapildigi icin b nin degeri 10 olarak kalir a 11 olur
        int c=++a;
        //burada once artitma oldugu icin a once artar 12 olur sonra c ye atanir c de 12 olur.
        System.out.println(a+","+b+","+c);
        System.out.println(a+b+c);

        int x=20;
        int y=++x;
        int z=y++;
        System.out.println(x+","+y+","+z);
        //21 22 21
        int k=30;
        System.out.println(k++);
        System.out.println(++k);
        System.out.println(k++);
        System.out.println(k);
        //30'32 32 33
        int sayi1 =40;
        int sayi2 = sayi1++;
        int sayi3=--sayi2;
        int sayi4=--sayi1;
        System.out.println(sayi1+","+sayi2+","+sayi3+","+sayi4);
        //40 39 39 40


    }
}
