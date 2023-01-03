package day28_Exeptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {
    public static void main(String[] args) {
        //Kullanicidan yasini girmesini isteyiniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas=scan.nextInt();
        try {
            if (yas<0){
               throw new IllegalArgumentException();

            }else {
                System.out.println("Yasiniz kaydedildi.");

            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
