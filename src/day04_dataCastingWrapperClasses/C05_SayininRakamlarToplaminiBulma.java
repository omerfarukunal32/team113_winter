package day04_dataCastingWrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir tamsayisayi girin:");
        int girilenSayi= scan.nextInt();  //135

        int rakam=girilenSayi%10; //5

        int rakamlarToplami= rakam;

        // ==========

        girilenSayi = girilenSayi/10; // 135 / 10 = 13.5 ==> Java 13 bulur

        rakam = girilenSayi%10; // 3

        rakamlarToplami = rakamlarToplami + rakam;

        // ==========

        girilenSayi=girilenSayi/10; // 13 / 10= 1.3 ==> Java 1 bulur

        rakam = girilenSayi % 10; // rakam =1

        rakamlarToplami=rakamlarToplami+rakam;



        System.out.println("Girilen sayinin rakamlar toplami :" +rakamlarToplami);


    }
}
