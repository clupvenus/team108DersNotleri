package day09_StringManipulation;

import java.util.Scanner;

public class C04_EndsWith {
    public static void main(String[] args) {
        String str="Java ogrenen issiz kalmaz.";
        System.out.println(str.endsWith("kalmaz"));//false
        System.out.println(str.endsWith("kalmaz."));//true

        System.out.println(str.endsWith("Java ogrenen issiz kalmaz."));//true
        System.out.println(str.endsWith(""));//true

        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz.");
        String GirilenMail=scan.next();
        if(!GirilenMail.contains("@")){
            System.out.println("Gecersiz mail");
        }else if (!GirilenMail.contains("@gmail.com")) System.out.println("mail gmail olmali");
        else if (!GirilenMail.contains("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
            
        }

    }
}
