package day06_bagimsizIfStatements;

import java.util.Scanner;

public class C09_ubung {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf alin, harf ile baslayan bir ay varas yazdirin.
        Not: Büyük harf, kücük harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
        char girilenHarf=scan.next().charAt(0);

        if (girilenHarf=='o' || girilenHarf=='O') {
            System.out.println("Ocak");
        }
        if (girilenHarf=='s' || girilenHarf=='S') {
            System.out.println("Subat");
        }
        if (girilenHarf=='m' || girilenHarf=='M') {
            System.out.println("Mart,Mayis");
        }
        if (girilenHarf=='n' || girilenHarf=='N') {
            System.out.println("Nisan");
        }
        if (girilenHarf=='h' || girilenHarf=='H') {
            System.out.println("Haziran");
        }
        if (girilenHarf=='t' || girilenHarf=='T') {
            System.out.println("Temmuz");
        }
        if (girilenHarf=='a' || girilenHarf=='A') {
            System.out.println("Agustus,Aralik");
        }
        if (girilenHarf=='e' || girilenHarf=='E') {
            System.out.println("Eylül,Ekim");
        }
        if (girilenHarf=='k' || girilenHarf=='K') {
            System.out.println("Kasim");
        }
    }
}
