package day14_doWhileLoop_scope;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //verilen baslangic ve bitis karakterlerini dahil aradaki tum karakterleri yazin
        char baslangis='d';
        char bitis='m';
        do{
            System.out.print(baslangis);
            baslangis=(char) (baslangis+1);
        }while(baslangis<=bitis);

    }
}
