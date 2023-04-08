package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C20_soru2 {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        int sayi= girilenSayi;
        int rakamlarToplami=0;
        int birlerbasamagi=0;

        while (sayi>0){
            birlerbasamagi=sayi%10;
            rakamlarToplami+=birlerbasamagi;
            sayi/=10;
        }
        System.out.println(rakamlarToplami);
    }
}
