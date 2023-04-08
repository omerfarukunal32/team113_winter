package day10_StringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Gib deine Email ein");
        String email= scan.next();

        //if(!email.contains("@")){
        //    System.out.println("Ungültige Email");
        //} else if (!email.contains("@gmail.com")) {
        //    System.out.println("Email soll aus gmail bestehen");
        //} else if (!email.endsWith("@gmail.com")) {
        //    System.out.println("Ein Fehler ist vorhaden");
        //}

        if(!email.contains("@")){
        System.out.println("Ungültige Email");
        }
        if (!email.contains("@gmail.com")) {
        System.out.println("Email soll aus gmail bestehen");
        }
        if (!email.endsWith("@gmail.com")) {
        System.out.println("Ein Fehler ist vorhanden");
        }
    }
}
