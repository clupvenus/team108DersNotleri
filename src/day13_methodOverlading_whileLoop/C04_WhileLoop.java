package day13_methodOverlading_whileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // iki basamakli sayilardan 7 ile bolunebilenleri yazdirin.
        for (int i = 10; i < 100; i++) {
            if(i%7==0) System.out.print(i+" ");

        }
        System.out.println("****");
        int sayi=10;

        while (sayi<100){
            if(sayi%7==0) System.out.print(sayi+" ");
sayi++;
        }
        //forloop la yapilabilcek bir soruyu illa da whileloopla yapmak biraz zahmetli.

    }
}
