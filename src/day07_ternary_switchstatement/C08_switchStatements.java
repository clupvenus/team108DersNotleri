package day07_ternary_switchstatement;

public class C08_switchStatements {
    public static void main(String[] args) {
        // kullanicidan iki sayi alin.
        //ve kullaniciya istedigi islemi sorun
        //+ ,-,*,/ isaretlerinden hangisini girerse iki sayi icin o islemi yapin.
        // bu isaretlerden birini girmezse "yanlis islem tercihi" yazdirin.

        int sayi1= 20;
        int sayi2=10;
        char islem='-';
        //if else ile yapalim.
        if(islem=='+'){
            System.out.println("Sayilarin toplami "+(sayi1+sayi2));
        }else if (islem == '-')System.out.println("Sayilarin farki "+(sayi1-sayi2));
        else if (islem =='/') System.out.println("Sayilarin bolumu "+(sayi1/sayi2));
        else if (islem =='*') System.out.println("Sayilarin carpimi "+(sayi1*sayi2));

        else System.out.println("Gecersiz islem");
        System.out.println("=====");
        // switch statement islemi ile yapalim.
        switch (islem){
            case'+':
                System.out.println("Sayilarin toplami "+(sayi1+sayi2));
                break;
            case'-':
                System.out.println("Sayilarin farki "+(sayi1-sayi2));
                break;
            case'*':
                System.out.println("Sayilarin carpimi "+(sayi1*sayi2));
                break;
            case '/':
                System.out.println("Sayilarin bolumu "+(sayi1/sayi2));
                break;

            default:
                System.out.println("yanlis islem tercihi");
        }


    }
}
