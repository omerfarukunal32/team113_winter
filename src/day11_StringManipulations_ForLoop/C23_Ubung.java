package day11_StringManipulations_ForLoop;

import java.util.Scanner;

public class C23_Ubung {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
        // “sifre basariyla kaydedildi” yazdirin
        //        - ilk harf kucuk harf olmali
        //        - son karakter rakam olmali
        //        - sifre bosluk icermemeli
        //        - uzunlugu en az 10 karakter olmali
        Scanner scan = new Scanner(System.in);
        //System.out.println("Gib dein Password ein. Password besteht aus folgenge dinge," +
        //        "\n- Erster Buchstabe soll klein sein \n- Letzte Charakter soll eine Ziffer sein" +
        //        "\n- Password enthält keiner Leerraum \n- Die Länge des Password soll maximal 10 Charakter enthalten");
        System.out.println("Gib ein Password ein");
        String password = scan.nextLine();
        int flag = 0;
        if (password.charAt(0) >= 'a' && password.charAt(0) <= 'z') {
            flag++;
        } else {
            System.out.println("Erster Buchstabe des Passwords soll klein sein ");
        }
        if (password.charAt(password.length() - 1) >= '0' && password.charAt(password.length() - 1) <= '9') {
            flag++;
        } else {
            System.out.println("Letzter Charakter muss eine Ziffer sein");
        }
        if (password.contains(" ") == false) {
            flag++;
        } else {
            System.out.println("Password soll keinen Leerraum haben");
        }
        if (password.length() >= 10) {
            flag++;
        } else {
            System.out.println("Password soll mindestens 10 Charakter haben");
        }
        if (flag == 4) {
            System.out.println("Password hat erforderlich ergestellt");
        }

    }
}
