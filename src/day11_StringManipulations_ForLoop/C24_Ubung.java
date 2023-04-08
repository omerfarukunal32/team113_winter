package day11_StringManipulations_ForLoop;

import java.util.Scanner;

public class C24_Ubung {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan isim ve soyismini ayri ayri alin.
                    - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                    - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
                      harflerle yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Gib deinen Name ein");
        String name=scan.next();
        System.out.println("Gib deinen Nachname ein");
        String nachName=scan.next();

        name=name.toLowerCase();
        nachName=nachName.toLowerCase();
        char ilkHarf1=(char)(name.charAt(0)-32);
        char ilkHarf2=(char)(nachName.charAt(0)-32);


        if(name.length()>nachName.length()){
            System.out.println(ilkHarf1+name.substring(1,name.length())+" "+ilkHarf2+nachName.substring(1,nachName.length()));
        }
        if(name.length()<nachName.length()){
            System.out.println(ilkHarf1+name.substring(1,name.length())+" "+nachName.toUpperCase());
        }



    }
}
