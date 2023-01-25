package day36_genelTekrar;

import java.util.Scanner;

public class C01_RecursiveMEthods {
    public static void main(String[] args) {
        //kullanicidan pozitif bir sayi aliniz.
        //o sayidan sifira kadar olan pozitif tamsayilari toplayin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi girin.");
        int sayi= scan.nextInt();
        toplaforloop(sayi);
        System.out.println("Recursive topla:"+toplaRecursive(sayi));
    }

    private static int toplaRecursive(int sayi) {
        int top=0;
        if(sayi>0){
            return sayi+toplaRecursive(sayi-1);

        }else return sayi;
    }

    private static void toplaforloop(int sayi) {
        int top=0;
        for (int i = 0; i <sayi ; i++) {
            top+=i;


        }
        System.out.println("toplam:"+top);
    }
}
