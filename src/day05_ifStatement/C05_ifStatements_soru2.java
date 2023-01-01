package day05_ifStatement;

import java.util.Scanner;

public class C05_ifStatements_soru2 {
    public static void main(String[] args) {
        // kullanicidan bir harf alin'harf ile ba;layan bir ay varsa yazdirin.
        //buyuk kucuk harf hassasiyeti olmasin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yazdirmak istediginiz ayin ilk harfini alin");

        char ilkHarf=scan.next().charAt(0);
        if (ilkHarf=='o'||ilkHarf=='O') System.out.println("ocak");
        if (ilkHarf=='s'||ilkHarf=='S') System.out.println("subat");
        if (ilkHarf=='m'||ilkHarf=='M') System.out.println("Mart veya Mayis");
        if (ilkHarf=='n'||ilkHarf=='N') System.out.println("Nisan");
        if (ilkHarf=='h'||ilkHarf=='H') System.out.println("haziran");
        if (ilkHarf=='t'||ilkHarf=='T') System.out.println("temmuz");
        if (ilkHarf=='a'||ilkHarf=='A') System.out.println("Agustos veya Aralik");
        if (ilkHarf=='e'||ilkHarf=='E') System.out.println("Eylul veya Ekim");
        if (ilkHarf=='k'||ilkHarf=='K') System.out.println("kasim");








    }
}
